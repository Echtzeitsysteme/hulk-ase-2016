package org.gjt.sp.jedit.gui;

import java.awt.Component;
import java.io.Reader;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.gjt.sp.jedit.View;
import org.gjt.sp.jedit.search.HyperSearchResults;

public class DockableWindowManager  extends JPanel {

	public class Entry {

		public String name;
		public String title;
		public JComponent win;

	}

	public static String BOTTOM;
	public static String RIGHT;
	public static String LEFT;
	public static String TOP;
	public static String FLOATING;

	public DockableWindowManager(View view) {
		// TODO Auto-generated constructor stub
	}

	public void register(Entry entry) {
		// TODO Auto-generated method stub
		
	}

	public void add(Entry entry) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Entry entry) {
		// TODO Auto-generated method stub
		
	}

	public void save(Entry entry) {
		// TODO Auto-generated method stub
		
	}

	public void show(Entry entry) {
		// TODO Auto-generated method stub
		
	}

	public boolean isVisible(Entry entry) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeDockableWindow(String name) {
		// TODO Auto-generated method stub
		
	}

	public void revalidate() {
		// TODO Auto-generated method stub
		
	}

	public View getView() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isDockableWindowVisible(String actionCommand) {
		// TODO Auto-generated method stub
		return false;
	}

	public void showDockableWindow(String actionCommand) {
		// TODO Auto-generated method stub
		
	}

	public static boolean loadDockableWindows(String string, Reader in, org.gjt.sp.jedit.ActionSet builtInActionSet) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void registerDockableWindow(String entry, Object object, boolean b, org.gjt.sp.jedit.ActionSet actionSet) {
		// TODO Auto-generated method stub
		
	}

	public static String[] getRegisteredDockableWindows() {
		// TODO Auto-generated method stub
		return null;
	}

	public Component add(Component comp) {
		return comp;
		// TODO Auto-generated method stub
		
	}

	public void init() {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void propertiesChanged() {
		// TODO Auto-generated method stub
		
	}

	public void addDockableWindow(String name) {
		// TODO Auto-generated method stub
		
	}

	public HyperSearchResults getDockable(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
