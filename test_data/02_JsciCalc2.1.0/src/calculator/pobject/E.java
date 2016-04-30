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

package calculator.pobject;

/**
 * DFunction that allows scientific notation entry. Probably now obsolete. It
 * did allow expressions like 1e1.3, but was problematic because of rounding errors.
 * @see Parser
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class E extends DFunction {
    /**
     * Constructor. Sets a tooltip and shortcut.
     */
    public E(){
	ftooltip = "use to enter scientific notation<br>" +
	    "in the form <i>x</i>e<i>y</i> = " +
	    "<i>x</i> &#215; 10<sup><i>y</i></sup>";
	fshortcut = 'e';
	base( 10 );
    }

    /**
     * Calculates a double xey. Obsolete.
     * @param x The first value (left of symbol)
     * @param y The second value (right of symbol)
     * @return The result of the operation
     */
    public double function( double x, double y ){
	return x * java.lang.Math.exp( y * java.lang.Math.log( base ) );
    }

    public java.lang.String[] name_array(){
	return fname;
    }
    
    public static void main( java.lang.String args[] ){
	E o = new E();
	java.lang.StringBuffer s = new java.lang.StringBuffer( "<html>" );
	s.append( o.name() );
	s.append( "</html>" );
	javax.swing.JOptionPane.showMessageDialog( null, s.toString() );
    }

    /**
     * Get the base used (always 10).
     * @return base
     */
    public int base(){
	return base;
    }

    /**
     * Set the base used (always set to 10 but obsolete).
     * @param base The new base (should be 10)
     */
    public void base( int base ){
	this.base = base;
    }

    /// The base used (10).
    private int base;
    
    private final static java.lang.String[] fname
	= { "e" };
}
