/***************************************************************************
              SettingsDialog.java    
-----------------------------------------------------
begin                : jun 2004
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

package net.sourceforge.ganttproject.gui.options;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import net.sourceforge.ganttproject.GanttProject;
import net.sourceforge.ganttproject.gui.GeneralDialog;
import net.sourceforge.ganttproject.language.GanttLanguage;

/**
 * @author athomas
 *
 * Dialog to edit the preferences for the application.
 */
public class SettingsDialog 
	extends GeneralDialog
	implements ActionListener
	
{
	
	boolean reinit = false; //If restart the initialization
	
	JButton restoreButton = null;
	
	/** Constructor. */
	public SettingsDialog(GanttProject parent)
	{
		super (parent,
				GanttProject.correctLabel(GanttLanguage.getInstance().getText("settings")),
				true,
				new WelcomeSettingsPanel(parent));
					    
		restoreButton = new JButton(language.getText("restoreDefaults"));
		restoreButton.setName("restore");
		restoreButton.addActionListener(this);
	    if(southPanel!=null)
	    	southPanel.add(restoreButton);
	}
	
	
	/** Construct the menu settings. */
	public void constructSections()
	{
		DefaultMutableTreeNode projectNode  = addObject(GanttProject.correctLabel(language.getText("project")), null);
		DefaultMutableTreeNode generalNode  = addObject(language.getText("general"), null);
		DefaultMutableTreeNode exportNode   = addObject(GanttProject.correctLabel(language.getText("export")), null);
		DefaultMutableTreeNode roleNode     = addObject(language.getText("resourceRole"), null);
		
		//general section
		addObject (language.getText("parameters"),  generalNode);
		addObject (language.getText("looknfeel"),   generalNode);
		addObject (language.getText("languages"),   generalNode);
		addObject (language.getText("colors"), generalNode);
		
		//Export section
		addObject ("html", exportNode);
		addObject ("pdf", exportNode);
		addObject ("csv", exportNode);
		
		//Just to see the first level of the tree
		treeSections.scrollPathToVisible(new TreePath(projectNode.getPath()));
	}


	/** Callback for the tree selection event. */
	public void valueChanged(TreeSelectionEvent e)
	{
		if(reinit) return;
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)(e.getPath().getLastPathComponent());
		String sNode = (String)(node.getUserObject());
		
		//  - ask the settingPanel if parameters are changed
		boolean bHasChange = settingPanel.applyChanges(true);
		
		// construct the sections
		if((settingPanel instanceof LanguageSettingsPanel) && bHasChange) {
			reinit=true;
			rootNode.removeAllChildren();
			treeModel.setRoot(rootNode);
		    treeModel.reload();
		    constructSections();
		    reinit=false;
		}
		
		//  - remove the settingPanel
		mainPanel2.remove(0);
		
		//  - Create the new panel 		
		if(sNode.equals(language.getText("languages")))
			settingPanel = new LanguageSettingsPanel(appli);
		
		else if(sNode.equals(GanttProject.correctLabel(language.getText("project"))))
			settingPanel = new ProjectSettingsPanel((Frame)getOwner(), getProject());
		
		else if(sNode.equals(GanttProject.correctLabel(language.getText("parameters"))))
				settingPanel = new ParametersSettingsPanel(appli);
		
		else if(sNode.equals(GanttProject.correctLabel(language.getText("resourceRole"))))
			settingPanel = new RolesSettingsPanel(appli);
		
		else if(sNode.equals(language.getText("looknfeel")))
			settingPanel = new LnFSettingsPanel(appli);	
		
		else if(sNode.equals(GanttProject.correctLabel(language.getText("export"))))
			settingPanel = new ExportSettingsPanel(appli);
			
		else if(sNode.equals(language.getText("colors")))
				settingPanel = new ColorSettingsPanel(appli);
	
		else if(sNode.equals("html"))
			settingPanel = new HTMLSettingsPanel(appli);
		
		else if(sNode.equals("pdf"))
			settingPanel = new PDFSettingsPanel(appli);
			
		else if(sNode.equals("csv"))
			settingPanel = new CSVSettingsPanel(appli);
			
		else settingPanel = new WelcomeSettingsPanel(appli);
		
		// - initialize the panel
		Box vb = Box.createVerticalBox();
		vb.add(new TopPanel("  "+settingPanel.getTitle(), settingPanel.getComment()));
		vb.add(settingPanel);
		settingPanel.initialize();
		
		//  - add the settingPanel into the main Panel
		mainPanel2.add(vb, 0);
		mainPanel2.repaint();
		mainPanel2.validate(); //valide the changes
	}
	
	public void actionPerformed(ActionEvent e)
	{
		super.actionPerformed(e);
		if(e.getSource()==restoreButton){
			appli.restoreOptions();
			//refresh the current panel
			settingPanel.initialize();
		}
	}
	
	
}
