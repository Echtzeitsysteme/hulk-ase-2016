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
 * Container to hold most recently evaluated sample standard deviation value.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class StDev extends Container {
    /**
     * Constructor. Sets a tooltip and shortcut.
     */
    public StDev(){
	ftooltip = "the sample standard deviation of the " +
	    "numbers stored in statistics memory:<br>" +
	    "this <i>estimates</i> the true standard deviation";
	fshortcut = 'n';
    }

    /**
     * Set the value of this Container.
     * @param d The value to store.
     */
    public void setValue( double d ){
	this.d = d;
    }

    /**
     * Set the Container error state.
     * @param error Error state
     */
    public void setError( boolean error ){
	this.error = error;
    }

    public java.lang.String[] name_array(){
	return fname;
    }

    public static void main( java.lang.String args[] ){
	StDev o = new StDev();
	java.lang.StringBuffer s = new java.lang.StringBuffer( "<html>" );
	s.append( o.name() );
	s.append( "</html>" );
	javax.swing.JOptionPane.showMessageDialog( null, s.toString() );
    }
    
    private final static java.lang.String[] fname
	= { "<i>&#963;</i>", "<sub><i>n</i></sub>", "<sub>&#8722;</sub>",
	    "<sub>1</sub>" };
}
