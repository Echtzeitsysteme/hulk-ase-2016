package org.gravity.tgg.modisco;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.ImportDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.NamedElement;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.TypeParameter;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.internal.core.JarPackageFragmentRoot;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.modisco.GravityMoDiscoFactoryImpl;
import org.gravity.modisco.MGravityModel;
import org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing;
import org.gravity.tgg.modisco.preprocessing.PreprocessingFactory;
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.analysis.StaticAnalysis;

public class MoDiscoTGGConverter extends SynchronizationHelper implements IPGConverter {

	private IJavaProject java_project = null;

	private boolean debug;

	// private File modisco_file;
	// private File pg_file;
	// private File prep_modisco_file;

	private File modisco_folder;

	private Resource tggRulesResource;

	class MyDiscoverJavaModelFromJavaProject extends DiscoverJavaModelFromJavaProject {
		public ResourceSet getRS() {
			return getResourceSet();
		}

		public ElementsToAnalyze getElemetstoAnalyze() {
			return getElementsToAnalyze();
		}
	}

	private MyDiscoverJavaModelFromJavaProject discoverer;

	public MoDiscoTGGConverter() throws MalformedURLException, IOException {
		this.discoverer = new MyDiscoverJavaModelFromJavaProject();

		BasicConfigurator.configure();

		this.set = this.discoverer.getRS();
		this.set.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		this.corrPackageResource = this.set.createResource(URI.createURI("GravityTGG.ecore")); //$NON-NLS-1$
		InputStream corr_package = new URL("platform:/plugin/org.gravity.tgg.modisco/model/Modisco.ecore") //$NON-NLS-1$
				.openConnection().getInputStream();
		this.corrPackageResource.load(corr_package, Collections.EMPTY_MAP);
		corr_package.close();

		this.configurator = new Configurator() {
		};
		this.changeSrc = (root -> {
		});
		this.changeTrg = (root -> {
		});

		InputStream tgg_rules = new URL("platform:/plugin/org.gravity.tgg.modisco/model/Modisco.sma.xmi") //$NON-NLS-1$
				.openConnection().getInputStream();
		this.tggRulesResource = this.set.createResource(URI.createURI("TGGRules.sma.xmi")); //$NON-NLS-1$
		this.tggRulesResource.load(tgg_rules, Collections.EMPTY_MAP);
		tgg_rules.close();

		setRules((StaticAnalysis) this.tggRulesResource.getContents().get(0));
	}

	@Override
	public boolean convertProject(IJavaProject project, IProgressMonitor monitor) {
		return convertProject(project, new HashSet<IPath>(), monitor);
	}

	@Override
	public boolean convertProject(IJavaProject java_project, Set<IPath> libs, IProgressMonitor monitor) {
		this.java_project = java_project;
		
		createOutFiles(java_project);

		long t0 = System.currentTimeMillis();
		System.out.println(t0 + " MoDisco discover project");
		Model eobject = discoverProject(java_project, libs, monitor);
		long t1 = System.currentTimeMillis();
		System.out.println(t1 + " MoDisco discover project - done " + (t1 - t0) + "ms");

		if (this.debug) {
			saveModel(eobject, new File(this.modisco_folder, "modisco.xmi")); //$NON-NLS-1$ );
		}

		long t2 = System.currentTimeMillis();
		System.out.println(t2 + " MoDisco preprocessing");
		if (eobject instanceof MGravityModel) {
			MGravityModel model = (MGravityModel) eobject;
			GravityMoDiscoFactoryImpl factory = (GravityMoDiscoFactoryImpl) JavaFactory.eINSTANCE;
			if (model.getMFieldDefinitions().size() == 0) {
				model.getMFieldDefinitions().addAll(factory.getFdefs());
			}
			if (model.getMMethodDefinitions().size() == 0) {
				model.getMMethodDefinitions().addAll(factory.getMdefs());
			}
			MoDiscoTGGPreprocessing preprocessing = PreprocessingFactory.eINSTANCE.createMoDiscoTGGPreprocessing();
			preprocessing.fixStaticMethodCallOnField(model);
			if (!preprocessing.preprocess(model)) {
				System.out.println("ERROR: Preprocessing failed");
				return false;
			}
			TreeIterator<EObject> iterator = model.eResource().getAllContents();
			while (iterator.hasNext()) {
				EObject next = iterator.next();
				if (next instanceof AnonymousClassDeclaration) {
					model.getAnonymousClassDeclarations().add((AnonymousClassDeclaration) next);
				}
				else if(next instanceof TypeParameter){
					model.getTypeParameters().add((TypeParameter) next);
				}
			}
		}
		long t3 = System.currentTimeMillis();
		System.out.println(t3 + " MoDisco preprocessing - done " + (t3 - t2) + "ms");
		if (this.debug) {
			saveModel(eobject, new File(this.modisco_folder, "modisco_preprocessed.xmi")); //$NON-NLS-1$
		}

		if (getSrc() == null) {
			setSrc(eobject);
		} else {
			setChangeSrc(root -> {
				setSrc(eobject);
			});
		}

		long t4 = System.currentTimeMillis();
		System.out.println(t4 + " eMoflon TGG fwd trafo");
		integrateForward();
		long t5 = System.currentTimeMillis();
		System.out.println(t5 + " eMoflon TGG fwd trafo - done " + (t5 - t4) + "ms");
		if (this.debug) {
			savePG(new File(this.modisco_folder, "pg.xmi")); //$NON-NLS-1$
			saveCorr(new File(this.modisco_folder, "correspondence_model.xmi").toString()); //$NON-NLS-1$
			saveSynchronizationProtocol(new File(this.modisco_folder, "sync_protocol.xmi").toString()); //$NON-NLS-1$
		}

		return getTrg() != null;
	}

	@Override
	public boolean syncProjectBwd(Consumer<EObject> consumer, IProgressMonitor monitor) {
		if (this.discoverer == null) {
			return false;
		}

		setChangeTrg(consumer);
		integrateBackward();

		if (this.debug) {
			savePG(new File(this.modisco_folder, "sync_bwd_pg.xmi")); //$NON-NLS-1$
			saveMoDiscoModel(new File(this.modisco_folder, "sync_bwd_modisco.xmi")); //$NON-NLS-1$
			saveCorr(new File(this.modisco_folder, "sync_bwd_correspondence_model.xmi").toString()); //$NON-NLS-1$
			saveSynchronizationProtocol(new File(this.modisco_folder, "sync_bwd_sync_protocol.xmi").toString()); //$NON-NLS-1$

		}

		Stack<Package> packages = new Stack<>();
		Model model = (Model) getSrc();
		packages.addAll(model.getOwnedElements());

		while (!packages.isEmpty()) {
			Package p = packages.pop();
			packages.addAll(p.getOwnedPackages());
			for (AbstractTypeDeclaration t : p.getOwnedElements()) {
				if (!t.isProxy()) {
					if (t.getOriginalClassFile() != null && t.getOriginalCompilationUnit() == null) {
						CompilationUnit cu = JavaFactory.eINSTANCE.createCompilationUnit();
						cu.getTypes().add(t);
						cu.setPackage(p);
						cu.setName(t.getName() + ".java");
						t.setOriginalCompilationUnit(cu);
						model.getCompilationUnits().add(cu);
					}
					CompilationUnit cu = t.getOriginalCompilationUnit();
					Set<NamedElement> types = new HashSet<>();
					for (ImportDeclaration i : cu.getImports()) {
						types.add(i.getImportedElement());
					}
					for (Annotation a : t.getAnnotations()) {
						org.eclipse.gmt.modisco.java.Type type = a.getType().getType();
						if (!types.contains(type)) {
							ImportDeclaration imp = JavaFactory.eINSTANCE.createImportDeclaration();
							imp.setImportedElement(type);
							cu.getImports().add(imp);
						}
					}
				}
			}
		}

		try {
			File out_file = new File(this.java_project.getProject().getLocation().toFile(), "src");
			if (monitor == null) {
				monitor = new NullProgressMonitor();
			}
			new GenerateJavaExtended(getSrc(), out_file, Collections.emptyList())
					.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
		} catch (IOException e1) {
			e1.printStackTrace();
			return false;
		}

		try {
			this.java_project.getProject().refreshLocal(IProject.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	public boolean syncProjectFwd(IProgressMonitor monitor) {
		if (this.discoverer == null || this.java_project == null) {
			return false;
		}

		setSrc(discoverProject(this.java_project, monitor));
		integrateForward();

		if (this.debug) {
			saveMoDiscoModel(new File(this.modisco_folder, "modisco.xmi")); //$NON-NLS-1$
			savePG(new File(this.modisco_folder, "pg.xmi")); //$NON-NLS-1$
		}
		return getTrg() != null;
	}

	public boolean syncProjectFwd(Consumer<EObject> consumer, IProgressMonitor monitor) {
		setChangeSrc(consumer);		
		integrateForward();

		if (this.debug) {
			savePG(new File(this.modisco_folder, "sync_fwd_pg.xmi")); //$NON-NLS-1$
			saveMoDiscoModel(new File(this.modisco_folder, "sync_fwd_modisco.xmi")); //$NON-NLS-1$
			saveCorr(new File(this.modisco_folder, "sync_fwd_correspondence_model.xmi").toString()); //$NON-NLS-1$
			saveSynchronizationProtocol(new File(this.modisco_folder, "sync_fwd_sync_protocol.xmi").toString()); //$NON-NLS-1$

		}

		return getTrg() != null;
	}

	public Model discoverProject(IJavaProject java_project, IProgressMonitor monitor) {
		return discoverProject(java_project, new HashSet<IPath>(), monitor);
	}

	public Model discoverProject(IJavaProject java_project, Set<IPath> libs, IProgressMonitor monitor) {
		Model model = null;

		if (this.discoverer.isApplicableTo(java_project)) {
			try {
				Model oldModel = null;
				Resource java_resource = this.discoverer.getTargetModel();
				if (java_resource != null) {
					EList<EObject> contents = java_resource.getContents();
					if (contents.size() > 0) {
						oldModel = (Model) java_resource.getContents().get(0);
						java_resource.getContents().clear();
					}
				}
				List<Object> discoverable = AbstractDiscoverJavaModelFromProject
						.computeDiscoverableElements(java_project);
				ElementsToAnalyze analyze = new ElementsToAnalyze(java_project);
				for (Object o : discoverable) {
					if (o instanceof JarPackageFragmentRoot) {
						JarPackageFragmentRoot jar = (JarPackageFragmentRoot) o;
						IPath path = jar.getPath();

						for (IPath l : libs) {
							if (l.isPrefixOf(path)) {
								analyze.addElementToDiscover(jar);
							}
						}
					}
				}
				this.discoverer.setElementsToAnalyze(analyze);
				this.discoverer.discoverElement(java_project, monitor);
				java_resource = this.discoverer.getTargetModel();
				if (java_resource != null) {
					EList<EObject> contents = java_resource.getContents();

					if (contents.size() > 0) {
						EObject eobject = contents.get(0);

						if (eobject instanceof Model) {
							model = (Model) eobject;

						}
					}
				}
			} catch (DiscoveryException e) {
				e.printStackTrace();
			} // catch (JavaModelException e) {
				// e.printStackTrace();
				// }
		}

		return model;
	}

	private void createOutFiles(IJavaProject java_project) {
		IProject project = java_project.getProject();
		this.modisco_folder = project.getFolder("modisco").getLocation().toFile(); //$NON-NLS-1$
		this.modisco_folder.mkdirs();
	}

	@Override
	public boolean savePG(File file) {
		return saveModel(getTrg(), file);
	}

	private boolean saveMoDiscoModel(File modisco_file) {
		return saveModel(getSrc(), modisco_file);
	}

	public boolean saveModel(EObject model, File file) {
		if (model == null) {
			return false;
		}
		FileOutputStream modisco_stream;
		try {
			modisco_stream = new FileOutputStream(file);
			try {
				model.eResource().save(modisco_stream, Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			} finally {
				try {
					modisco_stream.close();
				} catch (IOException e) {
					e.printStackTrace();
					return false;
				}
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public TypeGraph getPG() {
		return (TypeGraph) getTrg();
	}

	@Override
	public boolean isDebug() {
		return this.debug;
	}

	@Override
	public void setDebug(boolean debug) {
		this.verbose = debug;
		this.debug = debug;
	}

}
