package org.gravity.eval.ase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gravity.eval.ase.util.ToFileLogger;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HGodClassAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HSpaghettiCodeAntiPattern;
import org.gravity.hulk.antipatterngraph.antipattern.HSwissArmyKnifeAntiPattern;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TAnnotationType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.moflon.core.dfs.DFSGraph;

@RunWith(Parameterized.class)
public class RQ3a {

	@Rule
	public ToFileLogger logToFile = new ToFileLogger(Paths.get(new File("logs-RQ3a").toURI())); //$NON-NLS-1$

	private File xmi;

	private File project;


	public RQ3a(File xmi, File project) {
		this.xmi = xmi;
		this.project = project;
	}

	@Parameters(name = "{index}: ASE2016 Eval RQ1: {0}")
	public static Collection<Object[]> data() {
		List<Object[]> testcases = new ArrayList<>();
		
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject iproject : projects) {
			
			File pg_xmi = iproject.getFolder("gravity").getLocation().append(iproject.getName()+".xmi").toFile();
			if(pg_xmi.exists()){
				testcases.add(new Object[]{pg_xmi, iproject.getLocation().toFile()});
			}
		}

		return testcases;
	}

//	@Test
//	public void detectGodClass() {
//		HashSet<EClass> set = new HashSet<>();
//		set.add(AntipatternPackage.eINSTANCE.getHGodClassDetector());
//		for(int i=1; i<11; i++){
//			System.out.println("Detect GOD CLASS run "+i);
//			perform(set, "god");
//		}
//	}
//
//	@Test
//	public void detectBlob() {
//		HashSet<EClass> set = new HashSet<>();
//		set.add(AntipatternPackage.eINSTANCE.getHBlobDetector());
//		for(int i=1; i<11; i++){
//			System.out.println("Detect BLOB run "+i);
//			perform(set, "blob");
//		}
//	}
//
//	@Test
//	public void detectSwissArmyKnife() {
//		HashSet<EClass> set = new HashSet<>();
//		set.add(AntipatternPackage.eINSTANCE.getHSwissArmyKnifeDetector());
//		for(int i=1; i<11; i++){
//			System.out.println("Detect SWISS ARMY KNIFE run "+i);
//			perform(set, "sak");
//		}
//	}
//
//	@Test
//	public void detectSpaghettiCode() {
//		HashSet<EClass> set = new HashSet<>();
//		set.add(AntipatternPackage.eINSTANCE.getHSpaghettiCodeDetector());
//		for(int i=1; i<11; i++){
//			System.out.println("Detect SPAGHETTI CODE run "+i);
//			perform(set, "sp");
//		}
//	}

	@Test 
	public void detectAll() {
		HashSet<EClass> set = new HashSet<>();
		set.add(AntipatternPackage.eINSTANCE.getHGodClassDetector());
		set.add(AntipatternPackage.eINSTANCE.getHBlobDetector());
		set.add(AntipatternPackage.eINSTANCE.getHSwissArmyKnifeDetector());
		set.add(AntipatternPackage.eINSTANCE.getHSpaghettiCodeDetector());
		for(int i=1; i<11; i++){
			System.out.println("Detect ALL run "+i);
			perform(set, "all");
		}
	}

	private boolean perform(Set<EClass> selection, String ap) {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createFileURI(this.xmi.toString()));
		try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
			throw new AssertionError("Could not load pg");
		}
		TypeGraph pg = (TypeGraph) resource.getContents().get(0);
		
		HAntiPatternDetection hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
		Set<HDetector> selected_detectors = new HashSet<>();
		Set<HDetector> executed_detectors = new HashSet<>();

		long t0 = System.currentTimeMillis();
		System.out.println(t0 + " Hulk Anti-Pattern Detection");

		

		HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		apg.setPg(pg);

		hulk.setApg(apg);
		hulk.setProgramlocation(this.project.toString());

		rs.createResource(URI.createURI("Hulk.xmi")).getContents().add(hulk); //$NON-NLS-1$

		DFSGraph dependencies = hulk.getDependencyGraph();

		Resource res = rs.createResource(URI.createURI("SemllDependencyGraph.xmi")); //$NON-NLS-1$
		res.getContents().add(dependencies);
		long t2 = System.currentTimeMillis();

		System.out.println(System.currentTimeMillis() + " Hulk Detect AP");
		HulkDetector.detectSelectedAntiPattern(selection, hulk, selected_detectors, executed_detectors);
		System.out.println(System.currentTimeMillis() + " Hulk Detect AP - done");

		long t4 = System.currentTimeMillis();
		System.out.println(t4 + " Hulk Anti-Pattern Detection - Done " + (t4 - t0) + "ms");
		
		for(HDetector d : selected_detectors){
			System.out.println(d.getGuiName()+" anz= "+d.getHAnnotation().size());
		}

		return true;

	}

}
