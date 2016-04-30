/***************************************************************************
WelcomeSettingsPanel.java
-----------------
begin                : 28 juin 2004
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

import net.sourceforge.ganttproject.GanttProject;
import net.sourceforge.ganttproject.language.GanttLanguage;

/**
 * @author athomas
 *
 * Simple class for welcome panel.
 */
public class WelcomeSettingsPanel extends GeneralOptionPanel {

	/** Constructor. */
	public WelcomeSettingsPanel(GanttProject parent){
		super(GanttProject.correctLabel(GanttLanguage.getInstance().getText("settings")),
				  GanttLanguage.getInstance().getText("settingsWelcome"),
				  parent);

		applyComponentOrientation(language.getComponentOrientation());
	}
	/** This method check if the value has changed, and assk for commit changes. */
	public boolean applyChanges(boolean askForApply)
	{
		//nothing to do :)
		return false;
	}
	
	/** Initialize the component. */
	public void initialize()
	{
//		nothing to do :)
	}
}

