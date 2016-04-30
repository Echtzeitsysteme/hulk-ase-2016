package org.gravity.hulk.ui.handlers.scan;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.selection.SelectionHelper;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.ui.HulkUiActivator;
import org.gravity.hulk.ui.Messages;
import org.gravity.hulk.ui.dialogs.AntiPatternSelectionDialog;
import org.gravity.hulk.ui.dialogs.DetectionResultDialog;
import org.gravity.hulk.ui.dialogs.DetectionTreeContentProvider;
import org.gravity.hulk.ui.dialogs.DetectionTreeLabelProvider;
import org.moflon.core.dfs.DFSGraph;

public class HulkScanHandler implements IHandler {

	private boolean javaAnnotationsEnabled;

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println(Messages.HulkScanHandler_0);

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		final AntiPatternSelectionDialog dialog = new AntiPatternSelectionDialog(window.getShell(), new DetectionTreeLabelProvider(), new DetectionTreeContentProvider(), SWT.None);

		dialog.setTitle(Messages.HulkScanHandler_1);
		dialog.setMessage(Messages.HulkScanHandler_2);
		dialog.setContainerMode(true);
		dialog.setInput(DetectionPackage.eINSTANCE);
		dialog.addJavaAnnotationsSelectedListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button button = (Button) e.widget;		
				javaAnnotationsEnabled = button.getSelection();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
		});
		dialog.open();
		
		if (dialog.getReturnCode() == Window.CANCEL) {
			return null;
		}

		Set<EClass> selection = new HashSet<>();
		for (Object selected : dialog.getResult()) {
			if (selected instanceof EClass) {
				EClass e_class = (EClass) selected;
				Class<?> instance_class = e_class.getInstanceClass();
				if (HDetector.class.isAssignableFrom(instance_class)) {
					selection.add(e_class);
				}
			}
		}

		if (selection.size() > 0) {
			HAntiPatternDetection hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
			Set<HDetector> selected_detectors = new HashSet<>();
			Set<HDetector> executed_detectors = new HashSet<>();

			ISelectionService service = window.getSelectionService();
			IStructuredSelection structured = (IStructuredSelection) service.getSelection();
			List<Object> workspace_selection = Arrays.asList(structured.toArray());

			Job job = new Job("Anti-Pattern detection") { //$NON-NLS-1$

				
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					monitor.beginTask(Messages.HulkScanHandler_9, 3);

					Set<IJavaProject> projects = SelectionHelper.getJavaProjects(workspace_selection);
					for (IJavaProject project : projects) {
						long t0 = System.currentTimeMillis();
						System.out.println(t0 + " Hulk Anti-Pattern Detection");
						Object firstElement = structured.getFirstElement();
						IPath project_location = null;
						if (firstElement instanceof IResource) {
							project_location = ((IResource) firstElement).getProject().getLocation();
						} else if (firstElement instanceof IJavaProject) {
							project_location = ((IJavaProject) firstElement).getProject().getLocation();
						} else {
							return new Status(IStatus.ERROR, HulkUiActivator.PLUGIN_ID,
									Messages.HulkScanHandler_4 + firstElement, null);
						}
						IPath hulk_folder = project_location.append("hulk"); //$NON-NLS-1$

						Set<IPath> libs = new HashSet<>();
						if(javaAnnotationsEnabled){
							IPath annotations = copyAnnotationsJar(project, monitor);
							libs.add(annotations);
						}
						// IPGConverter converter =
						// GravityActivator.getDefault().getConverter(project.getProject());
						IPGConverter converter = GravityActivator.getDefault().getNewConverter(project.getProject());

						boolean success = converter.convertProject(project, libs, monitor);
						if (!success || converter.getPG() == null) {
							System.err.println("Creating PG from project failed: " + project.getProject().getName());
							continue;
						}

						long t1 = System.currentTimeMillis();
						System.out.println(t1 + " Init Hulk");
						HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
						apg.setPg(converter.getPG());

						hulk.setApg(apg);
						hulk.setProgramlocation(project_location.toString());

						ResourceSet rs = converter.getResourceSet();
						rs.createResource(URI.createURI("Hulk.xmi")).getContents().add(hulk); //$NON-NLS-1$

						monitor.worked(1);
						monitor.setTaskName(Messages.HulkScanHandler_10);

						DFSGraph dependencies = hulk.getDependencyGraph();

						Resource res = rs.createResource(URI.createURI("SemllDependencyGraph.xmi")); //$NON-NLS-1$
						res.getContents().add(dependencies);
						long t2 = System.currentTimeMillis();
						System.out.println(t2 + " Init Hulk - done " + (t2 - t1) + "ms");

						long t3 = System.currentTimeMillis();
						System.out.println(t3 + " Sync Bwd");
						if(javaAnnotationsEnabled){
							converter.syncProjectBwd(IPGConverter -> {

								System.out.println(System.currentTimeMillis() + " Hulk Detect AP");
								HulkDetector.detectSelectedAntiPattern(selection, hulk, selected_detectors,
										executed_detectors);
								System.out.println(System.currentTimeMillis() + " Hulk Detect AP - done");
	
							}, monitor);
							IFolder folder = project.getProject().getFolder("src/org/gravity/hulk/annotations"); //$NON-NLS-1$
							if (folder.exists()) {
								try {
									folder.delete(true, monitor);
								} catch (CoreException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
						else{
							System.out.println(System.currentTimeMillis() + " Hulk Detect AP");
							HulkDetector.detectSelectedAntiPattern(selection, hulk, selected_detectors,
									executed_detectors);
							System.out.println(System.currentTimeMillis() + " Hulk Detect AP - done");
						}
						
						try {
							URI uri = URI.createFileURI(hulk_folder.append("AntiPatternPG.xmi").toString()); //$NON-NLS-1$
							Resource antipattern_pg_resource = new ResourceSetImpl().createResource(uri);
							antipattern_pg_resource.getContents().add(EcoreUtil.copy(hulk.getApg()));
							antipattern_pg_resource.save(Collections.EMPTY_MAP);
						} catch (IOException e) {
							System.err.println(Messages.HulkScanHandler_7);
							return new Status(IStatus.WARNING, HulkUiActivator.PLUGIN_ID, Messages.HulkScanHandler_7,
									e);
						}
						long t4 = System.currentTimeMillis();
						System.out.println(t4 + " Sync Bwd - Done " + (t4 - t3) + "ms");
						System.out.println(t4 + " Hulk Anti-Pattern Detection - Done " + (t4 - t0) + "ms");
						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {
								(new DetectionResultDialog(window.getShell(), selected_detectors, executed_detectors))
										.open();
							}
						});
						monitor.worked(1);
					}

					return Status.OK_STATUS;
				}

				private IPath copyAnnotationsJar(IJavaProject project, IProgressMonitor monitor) {
					IFolder hulk = project.getProject().getFolder("hulk");
					if (!hulk.exists()) {
						try {
							hulk.create(true, true, monitor);
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
					IFile annotations_out = project.getProject().getFile("hulk/org.gravity.hulk.annotations.jar"); //$NON-NLS-1$
					if (!annotations_out.exists()) {
						InputStream in = null;
						OutputStream out = null;
						try {
							in = new URL(
									"platform:/plugin/org.gravity.hulk.annotations/org.gravity.hulk.annotations.jar") //$NON-NLS-1$
											.openConnection().getInputStream();
							out = new FileOutputStream(annotations_out.getLocation().toFile());
							byte[] buffer = new byte[4096];
							int read;
							while ((read = in.read(buffer)) != -1) {
								out.write(buffer, 0, read);
							}
						} catch (IOException e) {
							e.printStackTrace();
						} finally {
							if (in != null) {
								try {
									in.close();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
							if (out != null) {
								try {
									out.close();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
						}

						try {
							IClasspathEntry[] cp = project.getRawClasspath();
							IClasspathEntry[] cp_new = new IClasspathEntry[cp.length + 1];
							System.arraycopy(cp, 0, cp_new, 0, cp.length);
							cp_new[cp.length] = JavaCore.newLibraryEntry(annotations_out.getFullPath(), null, null);
							project.setRawClasspath(cp_new, monitor);
						} catch (JavaModelException e) {
							e.printStackTrace();
						}
					}
					try {
						project.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return annotations_out.getFullPath();
				}
			};
			job.setUser(true);
			job.schedule();

		} else {
			System.out.println(Messages.HulkScanHandler_8);
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {

	}

}
