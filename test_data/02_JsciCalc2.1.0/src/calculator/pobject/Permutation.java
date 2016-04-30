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
 * DFunction that calculates permutations.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class Permutation extends DFunction {
    /**
     * Constructor. Sets a tooltip and shortcut.
     */
    public Permutation(){
	ftooltip = "the number of ordered sequences " +
	    "obtainable<br>by selecting <i>r</i> from <i>n</i> " +
	    "distinct objects";
	fshortcut = 'P';
    }

    /**
     * Calculates the number of ordered ways to choose y objects from x.
     * Produces an error if this doesn't make sense.
     * @param x The first value (left of symbol)
     * @param y The second value (right of symbol)
     * @return The result of the operation
     */
    public double function( double x, double y ){
	if(  x < 0 || java.lang.Math.round( x ) - x != 0 )
	    throw new java.lang.ArithmeticException( "Permutation error" );
	if(  y < 0 || y > x || java.lang.Math.round( y ) - y != 0 )
	    throw new java.lang.ArithmeticException( "Permutation error" );
	if( y == 0 )
	    return 1;
	else
	    return x * function( x - 1, y - 1 );
    }

    public java.lang.String[] name_array(){
	return fname;
    }

    public java.lang.String shortName(){
	return "<i>n</i>P<i>r</i>";
    }

    public static void main( java.lang.String args[] ){
	Permutation o = new Permutation();
	java.lang.StringBuffer s = new java.lang.StringBuffer( "<html>" );
	s.append( o.name() );
	s.append( "</html>" );
	javax.swing.JOptionPane.showMessageDialog( null, s.toString() );
	System.out.print( "8P5 = " );
	System.out.println( o.function( 8, 5 ) );
    }
    
    private final static java.lang.String[] fname
	= { "<b>P</b>" };
}
