/** @file
 * Copyright (C) 2004 John D Lamb (J.D.Lamb@btinternet.com)
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
 * Container to hold most recently stored memory value. This does not change if
 * we revert from history, which effectively means you can use the history for
 * extra memory storage.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class RCL extends Container {
    /**
     * Constructor.
     */
    public RCL(){
    }

    /**
     * Set the value of this Container.
     * @param d The value to store.
     */
    public void setValue( double d ){
	this.d = d;
    }

    public java.lang.String[] name_array(){
	return fname;
    }

    public static void main( java.lang.String args[] ){
	RCL o = new RCL();
	java.lang.StringBuffer s = new java.lang.StringBuffer( "<html>" );
	s.append( o.name() );
	s.append( "</html>" );
	javax.swing.JOptionPane.showMessageDialog( null, s.toString() );
    }
    
    private final static java.lang.String[] fname = { "R", "C", "L" };
}
