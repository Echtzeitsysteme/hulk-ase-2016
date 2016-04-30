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
import calculator.pobject.PObject;

/**
 * This is the component that shows the entry we are typing. For various reasons
 * it takes quite a lot of setting up. We want it to be editable and show HTML
 * output (so, for example, that we can get square root or exponent signs). So we
 * use a JTextPane. But we also want it to be a single line and scrollable; so we
 * encapsulate it in a JViewPort. Finally we want to make sure we only scroll to
 * valid positions (between PObject strings) so we add a NavigationFilter called
 * Navigator. We also need a JPanel just to hold everything together.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class EntryLabel extends javax.swing.JViewport {
    
    /**
     * The constructor defines an interface to the DisplayPanel object.
     * @param panel The display panel (we read values from CalculatorApplet through
     * it)
     */
    public EntryLabel( ReadOnlyDisplayPanel panel ){
	setBackground( java.awt.Color.white );
	//setVerticalAlignment(javax.swing.SwingConstants.BOTTOM );
	jPanel = new WhitePanel();
	textPane = new javax.swing.JTextPane();
	textPane.setContentType( "text/html" );
	textPane.setEditable( false );
	navigator = new Navigator();
	textPane.setNavigationFilter( navigator );
// 	textPane.getCaret().setVisible( true );
 	jPanel.add( textPane );
 	setView( jPanel );
// 	textPane.setText( "<html><pre style=\"font-size:"
// 			  + java.lang.Float
// 			  .toString( panel.getApplet().entryTextSize() )
// 			  + "pt\">"
// 			  + endhtml );
	expression = "";
	dotPosition = 0;
	newExpression = true;
	this.panel = panel;
	update( false );
// 	textPane.getCaret().setDot( 0 );
// 	textPane.getCaret().setVisible( false );
	
	backward = textPane.getActionMap().get( "caret-backward" );
	forward = textPane.getActionMap().get( "caret-forward" );
    }

    /**
     * Update the display. The parameter is probably redundant since we can
     * get the value of on indirectly from the CalculatorApplet object.
     * @param on if <em>false</em> the calculator is switched off and so we don't
     * display anything; otherwise redisplay expression.
     */
    public void update( boolean on ){
	//System.out.println( "entrylabel:update" );
	//setFont( getFont().deriveFont( panel.getApplet().entryTextSize() ) );
	java.lang.StringBuffer text = new java.lang.StringBuffer();
	text.append( "<html><p style=\"font-size:" );
	text.append( java.lang.Float
		     .toString( panel.getApplet().entryTextSize() ) );
	text.append( "pt\" font-family=\"Lucida\">" );
	if( on ){
	    if( panel.getApplet().getMode() == 0 ){
		textPane.getCaret().setVisible( true );
 		text.append( expression );
 		text.append( endhtml );
 		textPane.setText( text.toString() );
		//System.out.print( "dot position is " );
		//System.out.println( dotPosition );
 		textPane.getCaret().setDot( dotPosition ); 
	    } else if( panel.getApplet().getMode() == 2 ){
		textPane.getCaret().setVisible( false );
		text.append( "Degrees: 1&nbsp;&nbsp;Radians: 2" );
		text.append( endhtml );
		textPane.setText( text.toString() );
 		textPane.getCaret().setDot( 1 ); 
	    } else if( panel.getApplet().getMode() == 1 ){
		textPane.getCaret().setVisible( false );
		text.append( "Comp: 1&nbsp;&nbsp;Stat: 2" );
		text.append( endhtml );
		textPane.setText( text.toString() );
 		textPane.getCaret().setDot( 1 ); 
	    } else if( panel.getApplet().getMode() == 3 ){
		textPane.getCaret().setVisible( false );
		text.append( "Small: 1&nbsp;&nbsp;Medium: 2"
			     + "&nbsp;&nbsp;Large: 3" );
		text.append( endhtml );
		textPane.setText( text.toString() );
 		textPane.getCaret().setDot( 1 ); 
	    }
	} else {
	    textPane.getCaret().setVisible( false );
	    text.append( endhtml );
	    textPane.setText( text.toString() );
	}
    }
    
    /**
     * Move the Caret left if possible.
     * @see LeftButton
     * @see Navigator
     */
    public void left(){ 
	int pos = textPane.getCaret().getDot();
	// find position in navigator.dots();
	java.util.ListIterator<Integer> i;
	for( i = navigator.dots().listIterator(); i.hasNext(); ){
	    int p = i.next();
	    //System.out.print( "position = " );
	    //System.out.println( p );
	    if( p >= pos ){
		i.previous();
		break;
	    }
	}
	dotPosition = i.hasPrevious() ? i.previous() : 0;
	//System.out.print( "new position = " );
	//System.out.println( dotPosition );
    }

    /**
     * Move the Caret right if possible.
     * @see RightButton
     * @see Navigator
     */
    public void right(){ 
	int pos = textPane.getCaret().getDot();
	// find position in navigator.dots();
	java.util.ListIterator<Integer> i;
	for( i = navigator.dots().listIterator( navigator.dots().size() );
	     i.hasPrevious(); ){
	    int p = i.previous();
	    //System.out.print( "position = " );
	    //System.out.println( p );
	    if( p <= pos ){
		i.next();
		break;
	    }
	}
	dotPosition = i.hasNext() ? i.next() : navigator.dots().lastElement();
	//System.out.print( "new position = " );
	//System.out.println( dotPosition );
    }

    /**
     * Not used. I tried allowing the CalculatorButton to fire an Action to move
     * the Caret left, but it didn't work
     * @return The Action (mmove left)
     */
    public javax.swing.Action backward(){
	return backward;
    }
    
    /**
     * Get the Caret position. I'm not quite sure how Caret positions work because
     * Sun's documentation isn't crytal clear on this, but we can move Carets without
     * any problems.
     * @return Caret position
     */
    private int getDotPosition(){
	//System.err.print( "( " ); 
	for( Integer i : navigator.dots() ){
	    //System.err.print( i );
	    //System.err.print( " " );
	}
	//System.err.print( ")  " );
	//System.err.println( textPane.getCaret().getDot() );
	int p = navigator.dots().indexOf( textPane.getCaret().getDot() );
	return p == -1 ? 0 : p;
    }

    /**
     * Delete element to left of Caret (if possible).
     * @param parser If we delete we have to change the Parser too
     * @see DelButton
     */
    public synchronized void delete( Parser parser ){
	/* clear selection if any */
	textPane.getCaret().setDot( textPane.getCaretPosition() );
	int position = getDotPosition();
	//System.err.println( textPane.getCaretPosition() );
	//System.err.print( "position = " );
	//System.err.println( position );
	/* put text in textPane */
	PObject p = parser.del( position );
	if( p == null ){
	    dotPosition = navigator.dots().get( position );
	    return;
	}
	//System.out.println( p.name() );
	int length = 0;
	length = p.name_array().length;
	expression = parser.getExpression();
	/* change dots to match */
	int currentDot = navigator.dots().get( position );
	navigator.dots().remove( position );
	for( int i = position; i < navigator.dots().size(); ++i ){
	    int q = navigator.dots().elementAt( i );
	    q = q - length;
	    navigator.dots().setElementAt( q, i );
	}
	/* move dot to required position */
	dotPosition = currentDot - length;
    }
    
    /**
     * Note that we have a new expression (in case we're asked to update the
     * panel). This is useful if we've just evaluated an expression but not cleared
     * the panel. Then the Parser and this object will not match and we must
     * be aware of this to avoid problems.
     */
    public void newExpression(){
	//System.out.println( "entrylabel:newExpression" );
	newExpression = true;
	textPane.getCaret().setVisible( false );
    }

    /**
     * Set a new expression from the Parser. Useful if we've just loaded a new
     * expression from history.
     * @param parser The Parser
     */
    public synchronized void setExpression( Parser parser ){
	expression = parser.getExpression();
	newExpression = false;
	navigator.dots().clear();
	int i = 1;
	navigator.dots().add( i );
	for( PObject pobject : parser.getList() ){
	    i += pobject.name_array().length;
	    navigator.dots().add( i );
	}
	dotPosition = i;
    }

    /**
     * Clear expresion. Useful in response to OnButton, for example.
     * @param parser The Parser: we must also clear expression in the Parser
     */
    public synchronized void clear( Parser parser ){
	//System.out.println( "entrylabel:clear" );
	parser.clearExpression();
	expression = "";
	dotPosition = 0;
    }
    
    /**
     * Insert element to right of Caret (if possible).
     * @param p The PObject, usually goten from a CalculatorButton
     * @param parser If we delete we have to change the Parser too
     */
    public synchronized void insert( PObject p, Parser parser ){
	/* clear selection if any */
	textPane.getCaret().setDot( textPane.getCaretPosition() );
	int position = getDotPosition();
	//System.out.println( textPane.getCaretPosition() );
	//System.out.println( p.name() );
	int length = p.name_array().length;
	/* put text in textPane */
	//textPane.replaceSelection( p.name() );
	/* make sure recorded expression matches */
	//System.err.print( "******** " );
	//System.out.println( position );
	if( newExpression ){
	    newExpression = false;
	    navigator.dots().clear();
	    navigator.dots().add( 1 );
	    position = 0;
	}
	parser.add( position, p );
	expression = parser.getExpression();
	/* change dots to match */
	int currentDot = navigator.dots().get( position );
	for( int i = position; i < navigator.dots().size(); ++i ){
	    int q = navigator.dots().elementAt( i );
	    q = q + length;
	    navigator.dots().setElementAt( q, i );
	}
	navigator.dots().insertElementAt( currentDot, position );
	/* move dot to required position */
	dotPosition = currentDot + length;
    }

    /**
     * The NavigationFilter we use to make sure Caret is always sensibly placed.
     */
    private Navigator navigator;
    /**
     * The expression (an HTML string).
     */
    private java.lang.String expression;
    /**
     * The current Caret position (probably only meaningful internally).
     */
    private int dotPosition;
    /**
     * This pads out the expression and makes it a bit taller if necessary so that
     * new expressions are left-adjusted. Otherwise the display would start in the
     * middle of the JViewPort. Navigator makes sure we can never try to edit this
     * invisible region.
     */
    private final static java.lang.String endhtml
	= "<sup> </sup><sub>&nbsp;<sub>&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	+ "&nbsp;&nbsp;&nbsp;&nbsp;<sup> </sup><sub>&nbsp;</sub></p></html>";
    /**
     * A JPanel we use as part of this component.
     */
    private javax.swing.JPanel jPanel;
    /**
     * Allows us to scroll through the expression and add some simple editing
     * methods.
     */
    private javax.swing.JTextPane textPane;
    /**
     * Interface to main display panel
     * (good for accessing other parts of the calculator).
     */
    private ReadOnlyDisplayPanel panel;
    /**
     * Length of display in characters. I don't think we still use this.
     */
    private static final int length = 25;
    /**
     * Have we just evaluated an expression so that Parser is cleared but we haven't
     * yet cleared the expression in this display?
     */
    private boolean newExpression;
    /**
     * Not used.
     */
    private javax.swing.Action backward;
    /**
     * Not used.
     */
    private javax.swing.Action forward;
}
	
