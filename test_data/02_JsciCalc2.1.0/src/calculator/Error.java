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

package calculator;

/**
 * Used to handle errors. This feature is not really implemented but in principle
 * the Parser class could work out where an error occurred and report it so that
 * CalculatorApplet could move the caret to the position appropriate for correcting
 * the error
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class Error {
    /**
     * Constructor.
     * @param s A string describing the error
     */
    Error( java.lang.String s ){
	this.s = s;
    }

    /**
     * Describe the error.
     * @return a desription of the error
     */
    public java.lang.String toString(){
	return s;
    }

    /**
     * A string describing the error
     */
    private java.lang.String s;
}
