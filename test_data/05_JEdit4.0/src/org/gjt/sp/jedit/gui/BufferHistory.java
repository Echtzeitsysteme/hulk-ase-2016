package org.gjt.sp.jedit.gui;

import java.io.File;
import java.util.Vector;

import org.gjt.sp.jedit.gui.BufferHistory.Entry;
import org.gjt.sp.jedit.textarea.Selection;

public class BufferHistory {

	public class Entry {

		public String path;
		public Object encoding;
		public Object selection;
		public int caret;
		public Object getSelection() {
			// TODO Auto-generated method stub
			return null;
		}

	}

	public static Vector getBufferHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void setEntry(String path, int caret, Selection[] property, String stringProperty) {
		// TODO Auto-generated method stub
		
	}

	public static void load(File recent) {
		// TODO Auto-generated method stub
		
	}

	public static Entry getEntry(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void save(File file1) {
		// TODO Auto-generated method stub
		
	}

}
