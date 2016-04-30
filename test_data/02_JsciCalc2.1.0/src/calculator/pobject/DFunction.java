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
 * A function such as Power can act on two values, one left and one right of the
 * symbol. This class specifies what is needed for a DFunction and allows Parser
 * to handle a DFunction without knowing the exact type.
 * @see Parser
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public abstract class DFunction extends PObject {
    /**
     * This function carries out an operation like Power.
     * @param x The first value (left of symbol)
     * @param y The second value (right of symbol)
     * @return The result of the operation
     */
    public abstract double function( double x, double y ); 
}
