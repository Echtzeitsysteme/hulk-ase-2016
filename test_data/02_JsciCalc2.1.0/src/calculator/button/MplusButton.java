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
import calculator.pobject.*;

/**
 * Button to add to memory. This probably should be derived from EqualsButton.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class MplusButton extends CalculatorButton {

    /**
     * Constructor. Sets PObject to Mplus.
     * @param applet The <em>controller</em> object.
     */
    public MplusButton( CalculatorApplet applet ){
	this.applet = applet;
	this.pobject = new Mplus();
	setText();
	setTextSize();
	tooltip = "adds current expression or most<br>recent " +
	    "result to memory value";
	shortcut = 'M';
	setToolTipText();
	addActionListener( this );
    }
    
    /**
     * Evaluates current expression and adds result to CalculatorApplet memory.
     * @param actionEvent The event that generated this method call: usually a button
     * press or called when CalculatorApplet responded to the key associated with
     * this button
     */
    public void actionPerformed( java.awt.event.ActionEvent actionEvent ){
	synchronized( applet ){
	    if( getApplet().getMode() != 0 ){
		getApplet().setMode( pobject );
		getApplet().requestFocusInWindow();
		return;
	    }
	    double m = getApplet().getMemory();
	    Object o = getApplet().getValue();
	    if( !getApplet().getParser().isEmpty() ){
		//System.out.println( "__________" );
		PObject p = getApplet().getParser().getLast();
		if( o instanceof Double && ( p instanceof RFunction ||
					     p instanceof DFunction ||
					     p instanceof MFunction ||
					     p instanceof AFunction ) ){
		    Ans ans = new Ans();
		    ans.setValue( (java.lang.Double)o );
		    getApplet().insert( ans );
		    getApplet().updateDisplay( true, true );
		}
	    } else {
		//System.out.println( "**********" );
		Ans ans = new Ans();
		ans.setValue( (java.lang.Double)o );
		getApplet().insert( ans );
		getApplet().updateDisplay( true, true );
	    }
	    o = getApplet().getParser().evaluate( getApplet().getAngleType() );
	    if( o instanceof java.lang.Double ){
		double d = ((java.lang.Double)o).doubleValue();
		getApplet().setMemory( m + d );
		getApplet().setValue( o );
		getApplet().updateDisplay( false, true );
	    }
	    getApplet().setShift( false );
	    getApplet().newExpression();
	    getApplet().requestFocusInWindow();
	}
    }
}
