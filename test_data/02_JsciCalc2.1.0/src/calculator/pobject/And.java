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

package calculator.pobject;

/**
 * Bitwise AND operation. For this operation the sign is not particularly
 * meaningful. numbers are stored as IEEE 754 doubles which use a bit for sign
 * and this operation carries out a logical AND on that bit.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class And extends BoolFunction {
    /**
     * Constructor. Sets a tooltip and shortcut.
     */
    public And(){
	ftooltip = "Logical bitwise and";
	fshortcut = '&';
    }

    /**
     * Calculates x AND y.
     * @param x The first value (left of symbol)
     * @param y The second value (right of symbol)
     * @return The result of the operation
     */
    public double function( double x, double y ){
	if( java.lang.Double.isNaN( x ) || java.lang.Double.isNaN( y )
	    || java.lang.Double.isInfinite( x ) 
	    || java.lang.Double.isInfinite( y ) )
	    throw new RuntimeException( "Boolean Error" );
	if( java.lang.Math.abs( y ) > java.lang.Math.abs( x ) ){
	    double tmp = x;
	    x = y;
	    y = tmp;
	}
	long x_bits = java.lang.Double.doubleToLongBits( x );
	boolean x_sign = (x_bits >> 63) == 0;
	int x_exponent = (int)((x_bits >> 52) & 0x7FFL);
	long x_significand = x_exponent == 0 ? (x_bits & 0xFFFFFFFFFFFFFL) << 1 
	    : (x_bits & 0xFFFFFFFFFFFFFL) | 0x10000000000000L;
	long y_bits = java.lang.Double.doubleToLongBits( y );
	boolean y_sign = (y_bits >> 63) == 0;
	int y_exponent = (int)((y_bits>>52) & 0x7FFL);
	long y_significand = y_exponent == 0 ? (y_bits & 0xFFFFFFFFFFFFFL) << 1 
	    : (y_bits & 0xFFFFFFFFFFFFFL) | 0x10000000000000L;
	y_significand >>= (x_exponent - y_exponent);

	// actually carry out the operation
	x_significand &= y_significand;
	
	// now reconstruct result
	if( x_exponent == 0 )
	    x_significand >>= 1;
	else {
	    if( x_significand == 0 ) return 0;
	    while( (x_significand & 0x10000000000000L) == 0 ){
		x_significand <<= 1;
		--x_exponent;
		if( x_exponent == 0 ){
		    x_significand >>= 1;
		    break;
		}
	    }
	    x_significand &= 0xFFFFFFFFFFFFFL;
	}
	
	x_bits = ((long)x_exponent) << 52;
	x_bits |= x_significand;

	double result = java.lang.Double.longBitsToDouble( x_bits );

	// deal with signs
	if( !x_sign & !y_sign )
	    result =- result;
	return result;
    }

    public java.lang.String[] name_array(){
	return fname;
    }
    
    public static void main( java.lang.String args[] ){
	PObject o = new And();
	java.lang.StringBuffer s = new java.lang.StringBuffer( "<html>" );
	s.append( o.name() );
	s.append( "</html>" );
	javax.swing.JOptionPane.showMessageDialog( null, s.toString() );
    }
    
    private final static java.lang.String[] fname = { " ", "a", "n", "d", " " };
}
