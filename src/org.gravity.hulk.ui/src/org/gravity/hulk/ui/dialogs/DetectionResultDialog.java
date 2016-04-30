package org.gravity.hulk.ui.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.antipatterngraph.HAnnotation;

public class DetectionResultDialog extends Dialog {

	Iterable<HDetector> selection;
	Iterable<HDetector> executed;

	public DetectionResultDialog(Shell parentShell, Iterable<HDetector> selected_detectors,
			Iterable<HDetector> executed_detectors) {
		super(parentShell);
		this.selection = selected_detectors;
		this.executed = executed_detectors;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(450, 600);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);

		CTabFolder folder = new CTabFolder(container, SWT.TOP);
		folder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		addContents(folder, this.selection);

		final Button button = new Button(container, SWT.CHECK);
		button.setText("Show all executed detectors.");
		button.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				for (CTabItem item : folder.getItems()) {
					item.dispose();
				}
				if (button.getSelection()) {
					addContents(folder, DetectionResultDialog.this.executed);
				} else {
					addContents(folder, DetectionResultDialog.this.selection);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		return container;
	}

	void addContents(CTabFolder folder, Iterable<HDetector> items) {
		for (HDetector e_class : items) {
			CTabItem tab = new CTabItem(folder, getShellStyle());
			tab.setText(e_class.eClass().getName());

			Tree tree = new Tree(folder, SWT.V_SCROLL | SWT.H_SCROLL);
			ScrollBar v_bar = tree.getVerticalBar();
			v_bar.setEnabled(true);

			if (e_class.getHAnnotation().size() > 0) {
				for (HAnnotation annotation : e_class.getHAnnotation()) {
					annotation.getTreeItem(tree, SWT.NONE);
				}
			} else {
				new TreeItem(tree, SWT.NONE).setText("No " + e_class.getGuiName() + " has been found.");
			}

			folder.showItem(folder.getItems()[0]);
			tab.setControl(tree);
		}
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Hulk Detection Results");
	}
}