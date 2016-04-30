/***************************************************************************
               AboutLibraryPanel.java 
------------------------------------------
begin                : 29 juin 2004
copyright            : (C) 2004 by Thomas Alexandre
email                : alexthomas(at)ganttproject.org
***************************************************************************/

/***************************************************************************
*                                                                         *
*   This program is free software; you can redistribute it and/or modify  *
*   it under the terms of the GNU General Public License as published by  *
*   the Free Software Foundation; either version 2 of the License, or     *
*   (at your option) any later version.                                   *
*                                                                         *
***************************************************************************/
package net.sourceforge.ganttproject.gui.about;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import net.sourceforge.ganttproject.GanttProject;
import net.sourceforge.ganttproject.gui.options.GeneralOptionPanel;
import net.sourceforge.ganttproject.language.GanttLanguage;

/**
 * @author athomas
 *
 * Panel to show used library
 */
public class AboutLibraryPanel extends GeneralOptionPanel {

	/** Constructor. */
	public AboutLibraryPanel(GanttProject parent)
	{
		super(GanttLanguage.getInstance().getText("library"),
				  GanttLanguage.getInstance().getText("settingsLibrary"),
				  parent);
		
		JTable jTableLib = new JTable();
		LibraryFieldTableModel modellib = new LibraryFieldTableModel();
		
		jTableLib.setModel(modellib);
	    modellib.addField(new LibraryInfo("ganttproject-"+GanttProject.version+".jar",	"ganttproject.org","Project Manager."));
	    modellib.addField(new LibraryInfo("commons-httpclient.jar",	 "jakarta.apache.org",	"WebDAV support."));
		modellib.addField(new LibraryInfo("commons-logging.jar",	 "jakarta.apache.org",	"WebDAV support."));
		modellib.addField(new LibraryInfo("jdom-20040226-.jar",		 "jdom.org",		"WebDAV support."));
	    modellib.addField(new LibraryInfo("webdavlib.jar",			 "jakarta.apache.org",	"WebDAV support."));
	    modellib.addField(new LibraryInfo("jakarta-slide-webdavlib-2.1b1.jar",	"webdav.apache.org",	"WebDAV support."));
	    modellib.addField(new LibraryInfo("helpgui-1.1.jar",		 "helpgui.sf.net",	"Help viewer in html."));
	    modellib.addField(new LibraryInfo("jgoodies-looks-1.2.2.jar","www.jgoodies.com",	"Nice Look'n'Feel."));
	    modellib.addField(new LibraryInfo("avalon.jar",				 "avalon.apache.org",	"Graphic Export (used for pdf)"));
	    modellib.addField(new LibraryInfo("batik.jar",				 "xml.apache.org",	"Graphic Export (used for pdf)"));
	    modellib.addField(new LibraryInfo("fop.jar",				 "xml.apache.org",	"Pdf export library."));
	    modellib.addField(new LibraryInfo("fop-font-metrics.jar",	 "xml.apache.org",	"Special font use."));
	    modellib.addField(new LibraryInfo("junit-3.8.1.jar",	     "junit.org",	"Unit tests."));
	    modellib.addField(new LibraryInfo("icons",					 "eclipse.org",	"Icons from the Eclipse project (IBM)."));
	    
	    JPanel libraryPanel = new JPanel(new BorderLayout());
	    libraryPanel.add(new JScrollPane(jTableLib), BorderLayout.CENTER);
	    libraryPanel.setPreferredSize(new Dimension(400,350));
	    vb.add(libraryPanel);
	    
		applyComponentOrientation(language.getComponentOrientation());
		
	}
	/* (non-Javadoc)
	 * @see net.sourceforge.ganttproject.gui.options.GeneralOptionPanel#applyChanges(boolean)
	 */
	public boolean applyChanges(boolean askForApply) {
		return false;
	}

	/* (non-Javadoc)
	 * @see net.sourceforge.ganttproject.gui.options.GeneralOptionPanel#initialize()
	 */
	public void initialize() {
	}
	
	/** Store informations for lirary uses. */
	class LibraryInfo
	{
		private String libName;
		private String libWeb;
		private String libComment;
		
		public LibraryInfo(String libName, String libCompany, String libComment)
		  {
		    this.libName = libName;
		    this.libWeb = libCompany;
		    this.libComment = libComment;
		  }
		  public String getName()
		  {
		    return libName;
		  }
		  public String getWeb()
		  {
		  	return libWeb;
		  }
		  public String getComment()
		  {
		  	return libComment;
		  }
	}

	class LibraryFieldTableModel extends AbstractTableModel
	{
	  private GanttLanguage language = GanttLanguage.getInstance();
	  
	  final String[] columnNames = {language.getText("name"), language.getText("web"), language.getText("notes")};
	  final Class[] columnClasses = {String.class, String.class, String.class};
	  Vector data = new Vector();

	  public void addField(LibraryInfo w)
	  {
	    data.addElement(w);
	    fireTableRowsInserted(data.size() - 1, data.size() - 1);
	  }

	  public int getColumnCount()
	  {
	    return columnNames.length;
	  }

	  public int getRowCount()
	  {
	    return data.size();
	  }

	  public String getColumnName(int col)
	  {
	    return columnNames[col];
	  }

	  public Class getColumnClass(int c)
	  {
	    return columnClasses[c];
	  }

	  public Object getValueAt(int row, int col)
	  {
	  	LibraryInfo info = (LibraryInfo)data.elementAt(row);
	    if(col == 0)
	      return info.getName();
	    else if(col == 1)
	      return info.getWeb();
	    else if(col == 2)
	      return info.getComment();
	    else
	      return null;    
	  }

	  public boolean isCellEditable(int row, int col)
	  {
	    return col==1;
	  }
	} 
}
