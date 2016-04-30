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

package calculator;

/**
 * This is the part of the DisplayPanel that shows the output of calculations.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class DisplayLabel extends javax.swing.JLabel {
    
    /**
     * Constructor. The object constructed should can read but not modify
     * the DisplayPanel.
     * @param panel The panel containing this
     */
    public DisplayLabel( ReadOnlyDisplayPanel panel ){
	super( "", javax.swing.SwingConstants.RIGHT );
	setVerticalAlignment( javax.swing.SwingConstants.BOTTOM );
	this.panel = panel;
	format = new DisplayFormat( digits );
    }
    
    /**
     * Update the display. The state should depend on whether the calculator
     * is switched on and we ough to read this indirectly rather than pass
     * the state as a parameter.
     * @param on <em>true</em> if calculator switched on.
     */
    public void update( boolean on ){
	setFont( getFont().deriveFont( panel.getApplet().displayTextSize() ) );
	if( on ){
	    if( panel.getApplet().getMode() == 0 )
		setText( format.string( panel.getApplet().getValue() ) );
	    else
		setText( "" );
	} else {
	    setText( "" );
	}
    }

    /**
     * The DisplayFormat object has a Base, which ought to be the same as the
     * CalculatorApplet Base and we use this to set it (which ought to be
     * unneccessary).
     * @return The Base of the DisplayFormat object.
     */
    public Base getBase(){
	return format.getBase();
    }

    /**
     * The DisplayFormat object has a Base, which ought to be the same as the
     * CalculatorApplet Base and we use this to get it (which ought to be
     * unneccessary).
     * @param b The new Base of the DisplayFormat object.
     */
    public void setBase( Base b ){
	format.setBase( b );
    }
    
    /**
     * Are we using scientific notation? If so we set the parameter to <em>true</em>.
     * Probably we ought instead to read a value from the CalculatorApplet.
     * The value is used by the DisplayFormat object to format the display
     * correctly.
     * Function probably isn't used. It's  identical to setExponentialNotation()
     * and we don't need two identical functions.
     * @param b <em>true</em> for scientific notation, <em>false</em> otherwise
     * @see #setExponentialNotation( boolean )
     */
    public void setScientificNotation( boolean b ){
	format.setExponentialNotation( b );
    }
    
    /**
     * Get number of digits used by DisplayFormat. I think this is a default number
     * so we don't overrun the display width. This feature ought to be sorted out
     * properly and the return value here may be meaningless.
     * @return A number representing the number of digits in the display
     */
    public int getDigits(){
	return format.getDigits();
    }

    /**
     * Set number of digits used by DisplayFormat. I think this is a default number
     * so we don't overrun the display width. This feature ought to be sorted out
     * properly and the return value here may be meaningless.
     * @param d A number representing the number of digits in the display
     */
    public void setDigits( int d ){
	format.setDigits( d );
    }
    
    /**
     * Are we using scientific notation? If so we set the parameter to <em>true</em>.
     * Probably we ought instead to read a value from the CalculatorApplet.
     * The value is used by the DisplayFormat object to format the display
     * correctly.
     * @return <em>true</em> for scientific notation, <em>false</em> otherwise
     */
    public boolean getExponentialNotation(){
	return format.getExponentialNotation();
    }

    /**
     * Are we using scientific notation. If so we set the parameter to <em>true</em>.
     * Probably we ought instead to read a value from the CalculatorApplet.
     * The value is used by the DisplayFormat object to format the display
     * correctly.
     * @param b <em>true</em> for scientific notation, <em>false</em> otherwise.
     * @see #setScientificNotation( boolean ).
     */
    public void setExponentialNotation( boolean b ){
	format.setExponentialNotation( b );
    }

    /**
     * The panel that contains this display.
     */
    private ReadOnlyDisplayPanel panel;
    /**
     * An object used to format output correctly
     */
    private DisplayFormat format;
    /**
     * Was used to set number of digits in display, but might now be ignored. Look
     * at DisplayFormat to see how the display is actually formatted.
     */
    private static final int digits = 15;
}
	
