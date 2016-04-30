package org.gravity.eval.ase;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eval.ase.util.EclipseProjectUtil;
import org.gravity.eval.ase.util.ToFileLogger;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.detection.antipattern.AntipatternPackage;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.moflon.core.dfs.DFSGraph;

@RunWith(Parameterized.class)
public class RQ1 {

	@Rule
	public ToFileLogger logToFile = new ToFileLogger(Paths.get(new File("logs").toURI())); //$NON-NLS-1$

	private IJavaProject project;

	private IJavaProject java_project_copy;

	public RQ1(IJavaProject project) {
		this.project = project;
	}

	@Parameters(name = "{index}: ASE2016 Eval RQ1: {0}")
	public static Collection<Object[]> data() {
		List<Object[]> testcases = new ArrayList<>();

		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

		for (IProject test : projects) {
			try {
				if (test.getNature(JavaCore.NATURE_ID) != null) {
					testcases.add(new Object[] { JavaCore.create(test) });
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return testcases;
	}

//	@Test
//	public void detectGodClass() {
//		HashSet<EClass> set = new HashSet<>();
//		set.add(AntipatternPackage.eINSTANCE.getHGodClassDetector());
//		perform(set, "god");
//	}
//
//	@Test
//	public void detectBlob() {
//		HashSet<EClass> set = new HashSet<>();
//		set.add(AntipatternPackage.eINSTANCE.getHBlobDetector());
//		perform(set, "blob");
//	}
//
//	@Test
//	public void detectSwissArmyKnife() {
//		HashSet<EClass> set = new HashSet<>();
//		set.add(AntipatternPackage.eINSTANCE.getHSwissArmyKnifeDetector());
//		perform(set, "sak");
//	}
//
//	@Test
//	public void detectSpaghettiCode() {
//		HashSet<EClass> set = new HashSet<>();
//		set.add(AntipatternPackage.eINSTANCE.getHSpaghettiCodeDetector());
//		perform(set, "sp");
//	}

	@Test
	public void detectAll() {
		HashSet<EClass> set = new HashSet<>();
		set.add(AntipatternPackage.eINSTANCE.getHGodClassDetector());
		set.add(AntipatternPackage.eINSTANCE.getHBlobDetector());
		set.add(AntipatternPackage.eINSTANCE.getHSwissArmyKnifeDetector());
		set.add(AntipatternPackage.eINSTANCE.getHSpaghettiCodeDetector());
		perform(set, "all");
	}

	private boolean perform(Set<EClass> selection, String ap) {

		NullProgressMonitor monitor = new NullProgressMonitor();

		java_project_copy = EclipseProjectUtil.copyJavaProject(this.project,
				project.getProject().getName() + "_tmp_" + ap);
		if (java_project_copy == null) {
			return false;
		}

		HAntiPatternDetection hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
		Set<HDetector> selected_detectors = new HashSet<>();
		Set<HDetector> executed_detectors = new HashSet<>();

		long t0 = System.currentTimeMillis();
		System.out.println(t0 + " Hulk Anti-Pattern Detection");
		System.out.println(t0 + " Init Model");

		IPath project_location = java_project_copy.getProject().getLocation();
		IPath hulk_folder = project_location.append("hulk"); //$NON-NLS-1$

		// IPGConverter converter =
		// GravityActivator.getDefault().getConverter(project.getProject());
		IPGConverter converter = GravityActivator.getDefault().getNewConverter(java_project_copy.getProject());

		boolean success = converter.convertProject(java_project_copy, Collections.emptySet(), monitor);
		if (!success || converter.getPG() == null) {
			System.err.println("Creating PG from project failed: " + java_project_copy.getProject().getName());
			return false;
		}

		long t1 = System.currentTimeMillis();
		System.out.println(t1 + " Init Hulk");
		HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		apg.setPg(converter.getPG());

		hulk.setApg(apg);
		hulk.setProgramlocation(project_location.toString());

		ResourceSet rs = converter.getResourceSet();
		rs.createResource(URI.createURI("Hulk.xmi")).getContents().add(hulk); //$NON-NLS-1$

		DFSGraph dependencies = hulk.getDependencyGraph();

		Resource res = rs.createResource(URI.createURI("SemllDependencyGraph.xmi")); //$NON-NLS-1$
		res.getContents().add(dependencies);
		long t2 = System.currentTimeMillis();
		System.out.println(t2 + " Init Hulk - done " + (t2 - t1) + "ms");
		System.out.println(t2 + " Init Model - done " + (t2 - t0) + "ms");

		// long t3 = System.currentTimeMillis();
		// System.out.println(t3 + " Sync Bwd");
		// converter.syncProjectBwd(IPGConverter -> {

		System.out.println(System.currentTimeMillis() + " Hulk Detect AP");
		HulkDetector.detectSelectedAntiPattern(selection, hulk, selected_detectors, executed_detectors);
		System.out.println(System.currentTimeMillis() + " Hulk Detect AP - done");

		// }, monitor);

		// IFolder folder =
		// java_project.getProject().getFolder("src/org/gravity/hulk/annotations");
		// //$NON-NLS-1$
		// if (folder.exists()) {
		// try {
		// folder.delete(true, monitor);
		// } catch (CoreException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }

		long t4 = System.currentTimeMillis();
		System.out.println(t4 + " Hulk Anti-Pattern Detection - Done " + (t4 - t0) + "ms");

		return true;

	}

	@After
	public void after() {
		try {
			if (java_project_copy != null && java_project_copy.exists()) {
				java_project_copy.getProject().delete(true, new NullProgressMonitor());
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
