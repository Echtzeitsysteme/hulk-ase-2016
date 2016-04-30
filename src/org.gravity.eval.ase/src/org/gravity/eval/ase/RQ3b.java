package org.gravity.eval.ase;

import java.io.File;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.ImportDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.NamedElement;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eval.ase.deltas.Delta;
import org.gravity.eval.ase.deltas.DeltasFactory;
import org.gravity.eval.ase.util.EclipseProjectUtil;
import org.gravity.eval.ase.util.ToFileLogger;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.modisco.MGravityModel;
import org.gravity.tgg.modisco.MoDiscoTGGConverter;
import org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing;
import org.gravity.tgg.modisco.preprocessing.PreprocessingFactory;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.Rule;
import org.junit.Test;
import org.moflon.core.dfs.DFSGraph;

public class RQ3b {
	
	@Rule
	public ToFileLogger logToFile = new ToFileLogger(Paths.get(new File("logs-RQ3b").toURI())); //$NON-NLS-1$

		
	@Test
	public void deleteMethod() {
		syncTest(DeltasFactory.eINSTANCE.createDeleteMethod());
	}

	@Test
	public void createClass() {
		syncTest(DeltasFactory.eINSTANCE.createCreateClass());
	}
	
	@Test
	public void createMethod() {
		syncTest(DeltasFactory.eINSTANCE.createCreateMethod());
	}
	
	@Test
	public void renameClass(){
		syncTest(DeltasFactory.eINSTANCE.createRenameClass());
	}
	
	private void syncTest(Delta delta) {
		String name = delta.getProjectName();
		System.out.println("DELTA: "+delta+" on project "+name);
		IProject project = EclipseProjectUtil.getProjectByName(name);
		if (!project.exists()) {
			throw new RuntimeException("Project \"" + name + "\" not found in workspace");
		}

		HashSet<EClass> set = new HashSet<>();
		set.add(AntipatternPackage.eINSTANCE.getHGodClassDetector());
		set.add(AntipatternPackage.eINSTANCE.getHBlobDetector());
		set.add(AntipatternPackage.eINSTANCE.getHSwissArmyKnifeDetector());
		set.add(AntipatternPackage.eINSTANCE.getHSpaghettiCodeDetector());

		perform(project, set, SynchronizationHelper -> {
			delta.perform(modisco);
			MoDiscoTGGPreprocessing preprocessing = PreprocessingFactory.eINSTANCE.createMoDiscoTGGPreprocessing();
			preprocessing.preprocess(modisco);
			try {
				File file = new File(new File(project.getLocation().toString()+"_tmp"),"src");
				new GenerateJavaExtended(modisco, file, Collections.emptyList()).doGenerate(new BasicMonitor.EclipseSubProgress(new NullProgressMonitor(), 1));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	
	private static MGravityModel modisco;
	private static TypeGraph pg;

	private static boolean perform(IProject project, Set<EClass> selection, Consumer<EObject> change) {

		NullProgressMonitor monitor = new NullProgressMonitor();

		IProject cp_project = EclipseProjectUtil.copyProject(project, project.getName()+"_tmp"); //$NON-NLS-1$
		if (cp_project == null) {
			return false;
		}

		IJavaProject java_project = EclipseProjectUtil.convertToJavaProject(cp_project);

		long t0 = System.currentTimeMillis();
		System.out.println(t0 + " Hulk Anti-Pattern Detection");

		IPath project_location = java_project.getProject().getLocation();
		MoDiscoTGGConverter converter = (MoDiscoTGGConverter) GravityActivator.getDefault()
				.getNewConverter(java_project.getProject());

		boolean success = converter.convertProject(java_project, new HashSet<>(), monitor);

		pg = converter.getPG();
		modisco = (MGravityModel) converter.getSrc();

		if (!success || pg == null) {
			System.err.println("Creating PG from project failed: " + java_project.getProject().getName());
			return false;
		}

		long t1 = System.currentTimeMillis();
		System.out.println(t1 + " Init Hulk");

		HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		apg.setPg(pg);

		HAntiPatternDetection hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
		hulk.setApg(apg);
		hulk.setProgramlocation(project_location.toString());

		ResourceSet rs = converter.getResourceSet();
		rs.createResource(URI.createURI("Hulk.xmi")).getContents().add(hulk); //$NON-NLS-1$

		DFSGraph dependencies = hulk.getDependencyGraph();

		Resource res = rs.createResource(URI.createURI("SemllDependencyGraph.xmi")); //$NON-NLS-1$
		res.getContents().add(dependencies);

		long t2 = System.currentTimeMillis();
		System.out.println(t2 + " Init Hulk - done " + (t2 - t1) + " ms");

		long t3 = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis() + " Hulk Detect AP");

		Set<HDetector> selected_detectors = new HashSet<>();
		HulkDetector.detectSelectedAntiPattern(selection, hulk, selected_detectors, new HashSet<>());

		long t4 = System.currentTimeMillis();
		System.out.println(t4 + " Hulk Detect AP - done " + (t4 - t3) + " ms");
		System.out.println(" T0="+(t4-t0)+" ms");
		
		System.out.println(t4 + " eMoflon perform change");
		if (!converter.syncProjectFwd(change, monitor)) {
			System.out.println("Sync changes failed");
			return false;
		}
		long t5 = System.currentTimeMillis();
		System.out.println(t4 + " eMoflon perform change - done " + (t5 - t4) + " ms");

		HulkDetector.syncSelectedAntiPattern(selection, hulk, selected_detectors, new HashSet<>());

		long tX = System.currentTimeMillis();
		System.out.println(tX + " Hulk Anti-Pattern Detection - Done " + (tX - t0) + "ms");
		System.out.println(" T1="+(tX-t4));
		try {
			cp_project.delete(true, monitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;

	}

}
