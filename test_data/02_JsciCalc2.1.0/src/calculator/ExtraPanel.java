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

/**
 * This is the little panel that tells you about the state of the calculator.
 * Currently it tells you the base (Base.OCTAL, Base.DECIMAL, Base.HEXADECIMAL or
 * Base.BINARY), whether we're using scientific notation (sci), whether we're in
 * statistics mode (Stat) whether angles are measured in Degrees or Radians
 * (AngleType) and whether (mem) we've a number stored in memory.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class ExtraPanel extends javax.swing.JPanel {
    
    /**
     * The constructor
     * @param panel An interface to the DisplayPanel object
     */
    public ExtraPanel( ReadOnlyDisplayPanel panel ){
	this.panel = panel;
    }
    
    /**
     * This does all the work of upadating the component, reading all values
     * directly from DisplayPanel or indirectly from CalculatorApplet. Probably they
     * should all be read indirectly.
     * @param graphics The graphics context required.
     */
    public void paintComponent( java.awt.Graphics graphics ){
	graphics.clearRect( 0, 0, getWidth(), getHeight() );
	graphics.setFont( getFont().deriveFont( getPanel().getApplet()
						.extraTextSize() ) );
	int fontHeight
	    = (int)(java.lang.Math.ceil( getPanel().getApplet().extraTextSize() ));
	int x = 0; //(int)(fontHeight * 0.5);
	int xx = getWidth() - graphics.getFontMetrics().stringWidth( "Hex " ); 
	int y = getHeight() - (int)(fontHeight * 0.5);
	if( getPanel().getOn() ){
	    graphics.drawString( getPanel().getApplet().getAngleType().toString(),
				 x, y );
	    switch( getPanel().getApplet().getBase() ){
	    case HEXADECIMAL:
		graphics.drawString( "Hex", xx, y );
		break;
	    case OCTAL:
		graphics.drawString( "Oct", xx, y );
		break;
	    case BINARY:
		graphics.drawString( "Bin", xx, y );
		break;
	    }
	    y = getHeight() - (int)(fontHeight * 2.0);
	    if( getPanel().getApplet().getScientificNotation() )
		graphics.drawString( "Sci", xx, y );
	    if( getPanel().getApplet().getStat() )
		graphics.drawString( "Stat", x, y );
	    y = getHeight() - (int)(fontHeight * 3.5);
	    if( getPanel().getApplet().getMemory() != 0 )
		graphics.drawString( "Mem", x, y );
	    y = getHeight() - (int)(fontHeight * 5.0);
	    if( getPanel().getApplet().getShift() )
		graphics.drawString( "Shift", x, y );
	}
    }
    
    /**
     * @return The DisplayPanel interface.
     */
    public ReadOnlyDisplayPanel getPanel(){
	return panel;
    }

    /**
     * The DisplayPanel interface.
     */
    private ReadOnlyDisplayPanel panel;
}
	
