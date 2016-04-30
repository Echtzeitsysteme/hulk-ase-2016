/***************************************************************************
AboutPanel.java
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
package net.sourceforge.ganttproject.gui.about;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.sourceforge.ganttproject.GanttProject;
import net.sourceforge.ganttproject.gui.options.GeneralOptionPanel;
import net.sourceforge.ganttproject.language.GanttLanguage;
import net.sourceforge.ganttproject.util.BrowserControl;

/**
 * @author athomas
 *
 * The About panel.
 */
public class AboutPanel extends GeneralOptionPanel {

	/** Constructor. */
	public AboutPanel(GanttProject parent)
	{
		super(GanttProject.correctLabel(GanttLanguage.getInstance().getText("about")),
				  GanttLanguage.getInstance().getText("settingsAbout")+" "+GanttProject.version,
				  parent);
		
		JLabel jLabelImage = new JLabel(new ImageIcon(getClass().getResource("/icons/splash.png"))) {
			public void paint (Graphics g) {
		    		super.paint(g);
		    		Graphics2D g2 = (Graphics2D) g;
			        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			        Font font = new Font("Arial", Font.BOLD + Font.ITALIC, 22);
			        g2.setFont(font);
			        g2.setColor(Color.black);
			        g2.drawString(GanttProject.version, (int) getSize().getWidth() - 99, 241);
			        g2.setColor(Color.white);
			        g2.drawString(GanttProject.version, (int) getSize().getWidth() - 100, 240);
			}	
		  };
		
		JPanel imagePanel = new JPanel(new BorderLayout());
		imagePanel.add(jLabelImage, BorderLayout.CENTER);
		vb.add(new JPanel());
		vb.add(imagePanel);
		vb.add(new JPanel());
		JButton bHomePage = new JButton(GanttProject.correctLabel(language.getText("webPage")),
				new ImageIcon(getClass().getResource("/icons/home_16.gif")));
		bHomePage.setToolTipText(GanttProject.getToolTip("ganttproject.org")); //add a simple tool tip text :)
		bHomePage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BrowserControl.displayURL("http://ganttproject.org/");
			}
		});
		
		vb.add(bHomePage);
		applyComponentOrientation(language.getComponentOrientation());
		
	}
	/** This method check if the value has changed, and assk for commit changes. */
	public boolean applyChanges(boolean askForApply)
	{
		// nothing to do :)
		return bHasChange = false;
	}
	
	/** Initialize the component. */
	public void initialize()
	{
		// nothing to do :)
	}
}

