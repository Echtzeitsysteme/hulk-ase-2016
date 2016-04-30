/** @file
 * Copyright (C) 2005 John D Lamb (J.D.Lamb@btinternet.com)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

package calculator.button;
import calculator.CalculatorApplet;
import calculator.pobject.Up;

/**
 * Move up the history list.
 * @see DownButton
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class UpButton extends CalculatorButton {

    /**
     * Constructor. Sets PObject to Up.
     * @param applet The <em>controller</em> object.
     */
    public UpButton( CalculatorApplet applet ){
	this.applet = applet;
	pobject = new Up();
 	//setText();
 	//setTextSize();
 	tooltip = pobject.tooltip();
 	setToolTipText();
	java.io.InputStream inputStream =
	    getClass().getResourceAsStream( "/calculator/icons/1uparrow.png" );
	java.io.BufferedInputStream bufferedInputStream
	    = new java.io.BufferedInputStream( inputStream );
	byte[] buffer = new byte[4096];
	try {
	    bufferedInputStream.read( buffer, 0, 4096 );
	} catch( java.lang.Exception e ){
	    System.err.println( "Failed to read image." );
	}
	java.awt.Image image
	    = java.awt.Toolkit.getDefaultToolkit().createImage( buffer );
	setIcon( new javax.swing.ImageIcon( image ) );
	addActionListener( this );
    }

    /**
     * Asks CalculatorApplet to move up history list. Current expression is
     * preserved even if it hasn't been evaluated.
     * @param actionEvent The event that generated this method call: usually a button
     * press or called when CalculatorApplet responded to the key associated with
     * this button
     * @see CalculatorApplet#upHistory()
     */
    public void actionPerformed( java.awt.event.ActionEvent actionEvent ){
	if( getApplet().getMode() != 0 )
	    return;
	getApplet().upHistory();
	getApplet().updateDisplay( true, true );
	getApplet().requestFocusInWindow();
    }
    
}
