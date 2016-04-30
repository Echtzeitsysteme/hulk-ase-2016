/** @file
 * Copyright (C) 2003-4 John D Lamb (J.D.Lamb@btinternet.com)
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
 * This class is responsible for the LCD-like display in the calculator. When
 * a particular CalculatorPanel is made current by CalculatorApplet.setDisplayPanel()
 * through CalculatorPanel.setDisplayPanel() the instance of this class is attached
 * to the the CalculatorPanel. I'm not sure if this is handled entirely correctly
 * yet because the DisplayPanel has actually been added to more than one
 * CalculatorPanel, which I think swing doesn't permit. However, it works provided
 * we reattach it.
 *
 * 
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class DisplayPanel extends javax.swing.JPanel
    implements ReadOnlyDisplayPanel {
    
    /**
     * The constructor takes a ReadOnlyCalculatorApplet so that it has
     * an interface to the CalculatorApplet object. It doesn't need to can modify
     * the CalculatorApplet object and so it doesn't need access to all members.
     * Forby, despite its general moralistic tendencies, Java doesn't let you
     * specify that an object is const.
     * @param applet The CalculatorApplet object (accessed through a read-only
     * interface)
     */
    public DisplayPanel( final ReadOnlyCalculatorApplet applet ){
	this.applet = applet;
	entryLabel = new EntryLabel( this );
	displayLabel = new DisplayLabel( this );
	extraPanel = new ExtraPanel( this );
 	add( entryLabel );
 	add( displayLabel );
  	add( extraPanel );
    }

    /**
     * Set up the panel. Everything is kept in place by a SpringLayout.
     */
    public void setUp(){
	/* set up basic layout */

	int a = (int)(0.5 * getApplet().extraTextSize());
	int b = getApplet().strutSize() + 4 * getApplet().minSize() +
	    6 * getApplet().buttonWidth();
	int c = getApplet().displayHeight(); 
	int d = (int)(0.15 * b + 0.5);

	javax.swing.Spring ex = javax.swing.Spring.constant( b - 2 * a );
	javax.swing.Spring ey = javax.swing.Spring.constant( (int)(0.525 * c - a) );

	javax.swing.Spring dx = javax.swing.Spring.constant( b - d - 2 * a );
	javax.swing.Spring dy = javax.swing.Spring.constant( (int)(0.55 * c - a) );

	javax.swing.Spring x = javax.swing.Spring.constant( 0, 0, c );
	javax.swing.Spring sx = javax.swing.Spring.constant( d );

 	javax.swing.SpringLayout layout = new javax.swing.SpringLayout();
 	setLayout( layout );

	javax.swing.SpringLayout.Constraints constraints
	    = layout.getConstraints( entryLabel );
	constraints.setWidth( ex );
	constraints.setHeight( ey );
	
	constraints = layout.getConstraints( displayLabel );
	constraints.setWidth( dx );
	constraints.setHeight( dy );
	
	constraints = layout.getConstraints( extraPanel );
	constraints.setWidth( sx );
	constraints.setHeight( dy );
	
	layout.putConstraint( javax.swing.SpringLayout.NORTH, entryLabel,
			      x, javax.swing.SpringLayout.NORTH, this );
	layout.putConstraint( javax.swing.SpringLayout.WEST, entryLabel,
			      a, javax.swing.SpringLayout.WEST, this );
	layout.putConstraint( javax.swing.SpringLayout.EAST, this,
			      x, javax.swing.SpringLayout.EAST, entryLabel );

	layout.putConstraint( javax.swing.SpringLayout.NORTH, extraPanel,
			      0, javax.swing.SpringLayout.SOUTH, entryLabel );
	layout.putConstraint( javax.swing.SpringLayout.WEST, extraPanel,
			      a, javax.swing.SpringLayout.WEST, this );
	layout.putConstraint( javax.swing.SpringLayout.SOUTH, this,
			      x, javax.swing.SpringLayout.SOUTH, extraPanel );

 	layout.putConstraint( javax.swing.SpringLayout.NORTH, displayLabel,
 			      0, javax.swing.SpringLayout.SOUTH, entryLabel );
 	layout.putConstraint( javax.swing.SpringLayout.WEST, displayLabel,
 			      x, javax.swing.SpringLayout.EAST, extraPanel );
  	layout.putConstraint( javax.swing.SpringLayout.EAST, this,
  			      a, javax.swing.SpringLayout.EAST, displayLabel );
  	layout.putConstraint( javax.swing.SpringLayout.SOUTH, this,
  			      x, javax.swing.SpringLayout.SOUTH, displayLabel );

	
     }

    /**
     * This probably does nothing.
     * I'm not quite sure I've got this right. I'm trying to make sure the
     * background is always white: probably even that should be replaced by a
     * specified colour stored in CalculatorApplet.
     * @param graphics The graphics context required.
     */
     public void paintComponent( java.awt.Graphics graphics ){
	 graphics.setColor( java.awt.Color.WHITE );
	 graphics.fillRect( 0, 0, getWidth(), getHeight() );
     }
    
    /**
     * Used by CalculatorApplet in response to a LeftButton Action to ask
     * the EntryLabel to move the caret on place left. It's important
     * CalculatorApplet controls this as it's the only thing that can read the
     * Parser and so know whether the caret can move left.
     */
    public void left(){
	entryLabel.left();
    }
    
    /**
     * Used by CalculatorApplet in response to a RightButton Action to ask
     * the EntryLabel to move the caret on place right. It's important
     * CalculatorApplet controls this as it's the only thing that can read the
     * Parser and so know whether the caret can move right.
     */
    public void right(){
	entryLabel.right();
    }
    
    /**
     * Updates the panel. The second parameter is not used but in principle could
     * let us update only the EntryPanel and not the ExtraPanel. We sometimes don't
     * want to update the EntryPanel immediately. For example, when we evaluate an
     * expression, we clear the expression in the parser but wait until we start
     * typing a new expression before updating the EntryPanel.
     * @param entry Should we update EntryPanel?
     * @param extra Should we update ExtraPanel? (ignored anyway)
     */
    public void update( boolean entry, boolean extra ){
	if( entry )
	    entryLabel.update( on );
	displayLabel.update( on );
	extraPanel.repaint();
    }
    
    /**
     * This was designed to collect an Action so we could move the Caret from 
     * within the CalculatorApplet, but I couldn't get it to work so used left()
     * instead.
     * @return An Action: move Caret left
     */
    public javax.swing.Action backward(){
	return entryLabel.backward();
    }

    /**
     * Set the current expression. We pass a Parser because this class shouldn't
     * access the Parser object directly.
     * @param parser The Parser, which contains the expression
     */
    public void setExpression( Parser parser ){
	entryLabel.setExpression( parser );
    }
    
    /**
     * Sets a new expression in EntryLabel. This doesn't immediately clear the old
     * expression but does disable Caret movements.
     */
    public void newExpression(){
	entryLabel.newExpression();
    }

    /**
     * Clears the current expression and the Parser. Probably it should only clear
     * the expression because CalculatorApplet should be the only object changing
     * the state of the parser.
     * @param parser The Parser, which contains the expression
     */
    public void clear( Parser parser ){
	entryLabel.clear( parser );
    }

    /**
     * Deletes the PObject at the current Caret position. Probably it should only
     * change the expression because CalculatorApplet should be the only object
     * changing the state of the parser.
     * @param parser The Parser, which contains the expression
     */
    public void delete( Parser parser ){
	entryLabel.delete( parser );
    }
	
    /**
     * Inserts a PObject at the current Caret position. Probably it should only
     * change the expression because CalculatorApplet should be the only object
     * changing the state of the parser.
     * @param p The PObject: typically generated by a CalculatorButton
     * @param parser The Parser, which contains the expression
     */
    public void insert( PObject p, Parser parser ){
	entryLabel.insert( p, parser );
    }
	
    /**
     * Set state (on/off). Probably should always get this state from
     * CalculatorApplet because the states should match.
     * @param value <em>true</em> for on, <em>false</em> for off.
     */
    public void setOn( boolean value ){
	on = value;
    }

    /**
     * Get state (on/off). Probably should always get this state from
     * CalculatorApplet because the states should match.
     * @return <em>true</em> for on, <em>false</em> for off.
     */
    public boolean getOn(){
	return on;
    }

    /**
     * Set Base. Probably should always get this state from
     * CalculatorApplet because the states should match.
     * @param b The new Base
     */
    public void setBase( Base b ){
	displayLabel.setBase( b );
    }
    
    /**
     * Set whether or not to use scientific notation. Probably we should just use
     * CalculatorApplet because the states should match.
     * @param b <em>true</em> or <em>false</em> according as we should use
     * scientific notation
     */
    public void setScientificNotation( boolean b ){
	displayLabel.setScientificNotation( b );
    }
    
    /**
     * Get an interface for the CalculatorApplet object.
     * @return an interface for the CalculatorApplet object.
     */
    public ReadOnlyCalculatorApplet getApplet(){
	return applet;
    }

    /**
     * The entry label: shows what you've typed.
     */
    private EntryLabel entryLabel;
    /**
     * The display label: shows results of calculations.
     */
    private DisplayLabel displayLabel;
    /**
     * The panel that shows calculator state: shift, Stat mode, degrees or radians,
     * Base and the like.
     */
    private ExtraPanel extraPanel;
    /**
     * Interface to the CalculatorApplet object that allows us to read values but
     * not to change their state.
     */
    private final ReadOnlyCalculatorApplet applet;
    /**
     * State of calculator on or off. This should be removed because only the
     * CalculatorApplet should have this information.
     */
    private boolean on;
}
	
