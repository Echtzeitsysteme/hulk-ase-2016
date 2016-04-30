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
import calculator.pobject.Left;

/**
 * Button to move left.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class LeftButton extends CalculatorButton {

    /**
     * Constructor. Sets PObject to Left.
     * @param applet The <em>controller</em> object.
     */
    public LeftButton( CalculatorApplet applet ){
	this.applet = applet;
	pobject = new Left();
 	//setText();
 	//setTextSize();
 	tooltip = pobject.tooltip();
 	setToolTipText();
	java.io.InputStream inputStream =
	    getClass().getResourceAsStream( "/calculator/icons/1leftarrow.png" );
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
     * Moves the caret position to the left (unless it's already at zero) and
     * updates DisplayLabel.
     * @param actionEvent The event that generated this method call: usually a button
     * press or called when CalculatorApplet responded to the key associated with
     * this button
     */
    public void actionPerformed( java.awt.event.ActionEvent actionEvent ){
	if( getApplet().getMode() != 0 )
	    return;
	getApplet().left();
	getApplet().updateDisplay( true, true );
	getApplet().requestFocusInWindow();
    }
    
}
