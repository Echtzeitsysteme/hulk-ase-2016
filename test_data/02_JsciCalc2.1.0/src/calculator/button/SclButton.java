/** @file
 * Copyright (C) 2004-5 John D Lamb (J.D.Lamb@btinternet.com)
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
import calculator.pobject.Scl;

/**
 * Clear statistical memory.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class SclButton extends CalculatorButton {

    /**
     * Constructor. Sets PObject to Scl.
     * @param applet The <em>controller</em> object.
     */
    public SclButton( CalculatorApplet applet ){
	this.applet = applet;
	this.pobject = new Scl();
	setText();
	setTextSize();
	tooltip = "clears the calculator statistics memory";
	shortcut = '\\';
	setToolTipText();
	addActionListener( this );
    }

    /**
     * Asks CalculatorApplet to clear statistical memory.
     * @param actionEvent The event that generated this method call: usually a button
     * press or called when CalculatorApplet responded to the key associated with
     * this button
     */
    public void actionPerformed( java.awt.event.ActionEvent actionEvent ){
	synchronized( applet ){
	    if( getApplet().getMode() != 0 ){
		getApplet().setMode( 0 );
		getApplet().setShift( false );
	    }
	    getApplet().clearStatMemory();
	    getApplet().setShift( false );
	    getApplet().updateDisplay( true, true );
	    getApplet().requestFocusInWindow();
	}
    }

}
