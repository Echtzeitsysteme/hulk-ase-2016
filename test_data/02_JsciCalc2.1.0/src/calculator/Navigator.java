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

package calculator;

/**
 * We use a NavigationFilter on the EntryPanel so that we can move the
 * Caret Left and Right along the expression keeping its position between
 * PObject object strings.
 * This makes it easier to have an editable expression.
 *
 * @author J. D. Lamb 
 * @version 1.0
 * @see EntryPanel
 * @see LeftButton
 * @see RightButton
 */
class Navigator extends javax.swing.text.NavigationFilter {
    
    /**
     * Create a new navigator and set dots to contain only the position one.
     */
    public Navigator(){
	super();
	dots = new java.util.Vector<java.lang.Integer>();
	dots.add( 1 );
    }

    /**
     * Override default method. This stops us selecting text.
     * @param fb Used if we want to move the Caret without the move being intercepted
     * by this filter
     * @param dot The Caret position
     * @param bias See Sun's documentation. We pass this on but don't use it.
     */
    public void moveDot( javax.swing.text.NavigationFilter.FilterBypass fb,
			 int dot, javax.swing.text.Position.Bias bias ){
	setDot( fb, dot, bias );
    }

    /**
     * Override default method. Make sure we're always 'between' PObject objects.
     * @param fb Used if we want to move the Caret without the move being intercepted
     * by this filter
     * @param dot The Caret position
     * @param bias See Sun's documentation. We pass this on but don't use it.
     */
    public void setDot( javax.swing.text.NavigationFilter.FilterBypass fb,
			int dot, javax.swing.text.Position.Bias bias ){
	//System.out.print( "dots = " );
	//System.out.println( dots );
	//System.out.println( dot );
	if( dots.size() == 1 && dots.firstElement() == 1 && (dot > 34 || dot == 1 )){
	    fb.setDot( dot, bias );
	    return;
	}
	// find nearest position in dots
	int l = 0;
	for( java.util.ListIterator<Integer> i
		 = dots.listIterator( dots.size() ); i.hasPrevious(); ){
	    l = i.previous();
	    if( l <= dot ) break;
	}
	int u = 0;
	for( java.lang.Integer i : dots ){
	    u = i;
	    if( u >= dot ) break;
	}
	dot = dot - l > u - dot ? u : l;
	fb.setDot( dot, bias );
    }

    /**
     * Override default method. Make sure we're always 'between' PObject objects.
     * @param text See Sun's documentation. We don't use this except to
     * pass it on
     * @param pos The desired Caret position
     * @param bias See Sun's documentation. We don't use this except to
     * pass it on
     * @param direction See Sun's documentation. We don't use this except to
     * pass it on
     * @param biasRet See Sun's documentation. We don't use this except to
     * pass it on
     * @return A valid position at or near pos
     */
    public int getNextVisualPositionFrom( javax.swing.text.JTextComponent text,
					 int pos,
					 javax.swing.text.Position.Bias bias,
					 int direction,
					 javax.swing.text.Position.Bias[] biasRet )
	throws javax.swing.text.BadLocationException {
	int p = super.getNextVisualPositionFrom( text, pos, bias,
						 direction, biasRet );
	if( p < 1 )
	    return 1;
	else if( p > dots.lastElement() )
	    return dots.lastElement();
	else if( direction == javax.swing.SwingConstants.WEST ){
	    /* move left */
	    for( java.util.ListIterator<Integer> i
		     = dots.listIterator( dots.size() ); i.hasPrevious(); ){
		int q = i.previous();
		if( q <= p )
		    return q;
	    }
	} else if( direction == javax.swing.SwingConstants.EAST ){
	    /* move right */
	    for( java.lang.Integer q : dots ){
		if( q >= p )
		    return q;
	    }
	} // else some error
	System.err.print( "Navigator.getNextVisualPositionFrom(): can't filter " );
	System.err.println( p );
	return p;
    }
    
    /**
     * Allow access to dots so that it can be set by something else.
     * @return The vector of acceptable Caret positions
     */
    public java.util.Vector<java.lang.Integer> dots(){
	return dots;
    }
    
    /**
     * Use this to translate between position 0, 1, ... , end and the
     * acceptable places for the Caret. For example
     * 3+sin 45 as text (even in html) would have vector
     * (1,2,3,7,8,9) indicating that the Caret can be placed at start, end or
     * between any characters, except that "sin " must be treated as it were
     * a single character.
     */
    private java.util.Vector<java.lang.Integer> dots;
}
