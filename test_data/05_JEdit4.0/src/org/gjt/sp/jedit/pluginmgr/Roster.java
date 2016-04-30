package org.gjt.sp.jedit.pluginmgr;

import org.gjt.sp.jedit.pluginmgr.Roster.Remove;

public class Roster {

	public static  class Install extends Remove {

		public Install(String jar) {
			super(jar);
			// TODO Auto-generated constructor stub
		}

		public Install(String string, String installDirectory) {
			super(null);
			}

	}
	public static class Remove {

		public Remove(String jar) {
			// TODO Auto-generated constructor stub
		}

	}
	public static Object Install(){
		return null;
	}
	public static Object Remove(String s){
		return null;
	}
	public int getOperationCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void performOperations(PluginManagerProgress pluginManagerProgress) {
		// TODO Auto-generated method stub
		
	}
	public void addOperation(Remove remove) {
		// TODO Auto-generated method stub
		
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
