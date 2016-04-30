package org.gjt.sp.jedit.browser;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;

import org.gjt.sp.jedit.EBComponent;
import org.gjt.sp.jedit.EBMessage;
import org.gjt.sp.jedit.View;
import org.gjt.sp.jedit.browser.VFSFileChooserDialog.BrowserHandler;
import org.gjt.sp.jedit.io.VFS.DirectoryEntry;

public class VFSBrowser  extends JPanel implements EBComponent {

	public static  int BROWSER ;
	public static int SAVE_DIALOG;
	public static int OPEN_DIALOG;

	public VFSBrowser(View view, String path, int mode, boolean multipleSelection, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public void addBrowserListener(BrowserHandler browserHandler) {
		// TODO Auto-generated method stub
		
	}

	public String getDirectory() {
		// TODO Auto-generated method stub
		return null;
	}

	public DirectoryEntry[] getSelectedFiles() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDirectory(String path) {
		// TODO Auto-generated method stub
		
	}

	public int getMode() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void browseDirectory(View view, String userMacroPath) {
		// TODO Auto-generated method stub
		
	}

	public boolean getShowHiddenFiles() {
		// TODO Auto-generated method stub
		return false;
	}

	public void reloadDirectory() {
		// TODO Auto-generated method stub
		
	}

	public void searchInDirectory() {
		// TODO Auto-generated method stub
		
	}

	public void mkdir() {
		// TODO Auto-generated method stub
		
	}

	public void newFile() {
		// TODO Auto-generated method stub
		
	}

	public View getView() {
		// TODO Auto-generated method stub
		return null;
	}

	public void rootDirectory() {
		// TODO Auto-generated method stub
		
	}

	public void delete(String deletePath) {
		// TODO Auto-generated method stub
		
	}

	public void rename(String path) {
		// TODO Auto-generated method stub
		
	}

	public void filesActivated(boolean b, boolean c) {
		// TODO Auto-generated method stub
		
	}

	public void setShowHiddenFiles(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void directoryLoaded(DefaultMutableTreeNode node, String canonPath, DirectoryEntry[] directory) {
		// TODO Auto-generated method stub
		
	}

	public void endRequest() {
		// TODO Auto-generated method stub
		
	}

	public void loadDirectory(DefaultMutableTreeNode node, String path, boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void filesSelected() {
		// TODO Auto-generated method stub
		
	}

	public boolean isMultipleSelectionEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public JLabel getDirectoryField() {
		// TODO Auto-generated method stub
		return null;
	}

	public BrowserView getBrowserView() {
		// TODO Auto-generated method stub
		return null;
	}

	public void handleMessage(EBMessage message) {
		// TODO Auto-generated method stub
		
	}

}
