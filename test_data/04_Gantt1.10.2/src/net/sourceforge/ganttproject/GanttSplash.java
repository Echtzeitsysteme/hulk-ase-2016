/***************************************************************************
                           GanttSplash.java  -  description
                             -------------------
    begin                : dec 2002
    copyright            : (C) 2002 by Thomas Alexandre
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

package net.sourceforge.ganttproject;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;



/**
 * Class to put a splash before lunch the soft
 */

class GanttSplash extends JFrame {

    public GanttSplash(){
    	super("GanttProject");
    	
    	ImageIcon icon = new ImageIcon(getClass().getResource(
			"/icons/ganttproject.png"));
    	setIconImage(icon.getImage());	//set the ganttproject icon
    	setDefaultLookAndFeelDecorated(false);
    	setUndecorated(true);
    	getRootPane().setWindowDecorationStyle(JRootPane.NONE); //set no border
        
    	ImageIcon splashImage = new ImageIcon(getClass().getResource("/icons/splash.png"));
        JLabel l = new JLabel(splashImage) {
        	public void paint (Graphics g) {
        		super.paint(g);
        		Graphics2D g2 = (Graphics2D) g;
        		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        		Font font = new Font("Arial", Font.BOLD + Font.ITALIC, 22);
        		g2.setFont(font);
        		g2.setColor(Color.black);
                FontRenderContext frc = g2.getFontRenderContext();
                TextLayout layout = new TextLayout(GanttProject.version, font, frc);
                Rectangle2D bounds = layout.getBounds();
        		g2.drawString(GanttProject.version, (int) (getSize().getWidth() - bounds.getWidth()-5), 236);
        		g2.setColor(Color.white);
        		g2.drawString(GanttProject.version, (int) (getSize().getWidth() - bounds.getWidth()- 6), 235);
        	}
        };
        
        
        getContentPane().add(l, BorderLayout.CENTER);
        pack();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension labelSize = l.getPreferredSize();

        // Put image at the middle of the screen
        setLocation(screenSize.width/2 - (labelSize.width/2),
                    screenSize.height/2 - (labelSize.height/2));
		
    }
    

    public void close() {
          setVisible(false);
    	  dispose();
    }

}

