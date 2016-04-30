/***************************************************************************
                           GanttDialogInfo.java  -  description
                             -------------------
    begin                : mar 2003
    copyright            : (C) 2003 by Thomas Alexandre
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


package net.sourceforge.ganttproject.gui;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import net.sourceforge.ganttproject.language.GanttLanguage;
  

  
/**
  * Class to show a message for the user
  */
public class GanttDialogInfo extends JDialog
{
	
	/** An error message */
	public static int ERROR = 0;

	/** A warning message */
	public static int WARNING = 1;
	
	/** An info message */
	public static int INFO = 2;
	
	/** A question message */
	public static int QUESTION = 3;	

	/** Ok result */
	public static int YES = 0;
	
	/** Cancel result */
	public static int NO = 1;
	
	/** Undo result */
	public static int CANCEL = 2;
	
	/** The result of the dialog box */
	public int res=0;
		
	/** only ok button */
	public static int YES_OPTION=0;

	/** ok and cancel button */
	public static int YES_NO_OPTION=1;
	
	/** ok and cancel button */
	public static int YES_NO_CANCEL_OPTION=2;

	/** Constructor */
	public GanttDialogInfo (Frame parent, int msgtype, int button,
		String message, String title)
	{
		
		super(parent, title,true);
		
		GanttLanguage language = GanttLanguage.getInstance();

		res = button;
		
		Box b1 = Box.createVerticalBox();
		
		if(msgtype==ERROR)
			b1.add(new JLabel( new ImageIcon(getClass().getResource("/icons/error.png"))));
		else if(msgtype==WARNING)
			b1.add(new JLabel( new ImageIcon(getClass().getResource("/icons/warning.png"))));
		else if(msgtype==INFO)
			b1.add(new JLabel( new ImageIcon(getClass().getResource("/icons/info.png"))));
		else if(msgtype==QUESTION)
			b1.add(new JLabel( new ImageIcon(getClass().getResource("/icons/question.png"))));
		
		
		getContentPane().add(b1,"West");
		
		
		Box b2 = Box.createVerticalBox();
        JTextArea textArea = new JTextArea(message);
        textArea.setEditable(false);
        textArea.setBackground(new JLabel().getBackground());
		b2.add(textArea);		
		getContentPane().add(b2,"Center");
		
		
		JPanel p = new JPanel();
		//YES BUTTON
		JButton yes = new JButton((button==0)?language.getText("ok"):language.getText("yes"));
		getRootPane().setDefaultButton(yes);
		p.add(yes);
		yes.addActionListener(new ActionListener()
		 	{	public void actionPerformed(ActionEvent evt)
				{
					setVisible (false);
					dispose();
					res=YES;
				}
			});
		
		if(button>0)
		{
			//NO BUTTON
			JButton no = new JButton(language.getText("no"));
			p.add(no);
			no.addActionListener(new ActionListener()
			 	{	public void actionPerformed(ActionEvent evt)
					{
						setVisible (false);
					dispose();
						res=NO;
					}
				});
			
			if(button>1)
			{
				//CANCEL BUTTON
				JButton cancel = new JButton(language.getText("cancel"));
				p.add(cancel);
				cancel.addActionListener(new ActionListener()
				 	{	public void actionPerformed(ActionEvent evt)
						{
							setVisible (false);
							dispose();
							res=CANCEL;
						}
					});			
			}		
		}
		
		getContentPane().add(p,BorderLayout.SOUTH);

		pack();
		setResizable(false);
		DialogAligner.center(this, getParent());
		applyComponentOrientation(language.getComponentOrientation());
	}
}



  
