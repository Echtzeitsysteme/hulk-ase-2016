/** @file
 * Copyright (C) 2003-5 John D Lamb (J.D.Lamb@btinternet.com)
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
import calculator.pobject.*;

/**
 * This is an interface for CalculatorApplet that allows us to access only the
 * functions of CalculatorApplet designed to read its state. It's rather like
 * using a pointer to const class in C++ to restrict to const members, but Java
 * doesn't have const members.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public interface ReadOnlyCalculatorApplet {

    /**
     * Designed so that CalculatorPanel and its subclasses can use the displayPanel
     * object as required.
     * @return The displayPanel
     */
    public DisplayPanel displayPanel();

    /**
     * The height of the LCD display in pixels. Used so that the <em>view</em> can
     * get this information.
     * @return Desired height of DisplayPanel in pixels.
     * @see DisplayPanel
     */
    public int displayHeight();

    /**
     * The height of a standard button. Used by CalculatorPanel objects.
     * @return Desired height of a standard button.
     * @see CalculatorButton
     */
    public int buttonHeight();

    /**
     * The width of a standard button. Used by CalculatorPanel objects.
     * @return Desired width of a standard button.
     * @see CalculatorButton
     */
    public int buttonWidth();

    /**
     * If you look at the CalculatorPanel objects, you'll see that the buttons are
     * grouped. This defines the width of the gap between groups.
     * CalculatorApplet keep control of such things and this function reports them
     * to CalculatorPanel objects when required.
     * @return Desired size of button-group separation
     * @see CalculatorPanel
     */
    public int strutSize();

    /**
     * If you look at the CalculatorPanel objects, you'll see that there's a minimum
     * gap between most objects.
     * CalculatorApplet keep control of such things and this function reports them
     * to CalculatorPanel objects when required.
     * @return Desired size of button-group separation
     * @see CalculatorPanel
     */
    public int minSize();

    /**
     * Get the size of text to use on buttons.
     * @return Desired fontsize for buttons
     */
    public float buttonTextSize();

    /**
     * Get the size of text to use on the EntryLabel object. This is the bit
     * of the DisplayPanel object that's responsible for showing the current
     * expression.
     * @return Desired fontsize for the EntryLabel object.
     * @see EntryLabel
     * @see DisplayPanel
     */
    public float entryTextSize();

    /**
     * Get the size of text to use on the DisplayPanel.This reports the size of
     * text for calculator 'output'
     * @return Desired fontsize for calculator display
     * @see DisplayPanel
     */
    public float displayTextSize();

    /**
     * Get the size of small text to use on the DisplayPanel object. Small text is
     * for things like "stat", "radians", "shift" and the like
     * @return Desired fontsize for small text
     * @see DisplayPanel
     */
    public float extraTextSize();

    /**
     * Tells us if the calculator is switched on. This is useful in <em>view</em>
     * classes because only this class gets to control such information.
     * @return <em>true</em> or <em>false</em> according as the calculator is
     * on or off
     */
    public boolean getOn();

    /**
     * Tells us if the shift button is down.
     * @return <em>true</em> or <em>false</em> according as the shift button is
     * down or up
     */
    public boolean getShift();

    /**
     * The Parser class is the <em>model</em> that this class controls. When
     * required, for example, so that we can create a <em>view</em> of the
     * current expression, we use this function to make the Parser object accessible.
     * Ideally it would be final, but it's convenient to allow CalculatorButton
     * objects to modify the Parser object directly.
     * @return The Parser object
     */
    public Parser getParser();

    /**
     * This is used internally, but it's also useful if you want to use the
     * calculator as part of something else. In fact, the calculator was really
     * originally designed because I couldn't find a calculator applet that
     * emulated the statistical functions on a standard calculator. So it was really
     * just a part of a bigger applet that made confidence intervals. This function
     * was put in the calculator specifically to allow external access to the
     * calculated value, which when it changed would be transferred to a JTextField
     * on another part of the applet.
     * @return The value, which should be a java.lang.Double
     * @see Parser
     */
    public Object getValue();

    /**
     * Get the value from memory.
     * @return The memory value, zero if nothing has been stored.
     */
    public double getMemory();
    
    /**
     * Find whether we're working in degrees or radians.
     * @return AngleType.DEGREES or AngleType.RADIANS
     * @see AngleType
     * @see Trig
     */
    public AngleType getAngleType();
    
    /**
     * We can emulate a STAT mode and this is how we find out if we're doing so.
     * STAT mode switches off some memory functions. I know this isn't necessary but
     * I want this calculator to emulate some features of a real calculator. You
     * can always put the memory buttons back in if you want.
     * @return <em>true</em> for stat mode, <em>false</em> for normal mode.
     * @see CalculatorApplet#setStat( boolean )
     */
    public boolean getStat();
    
    /**
     * As you'd expect for something emulating a real calculator, we'd better have
     * a mode button. This one uses integers rather than enumerated types and
     * you get the current mode with this function.
     * @return The mode (currently 1, 2 or 3 or maybe 4)
     */
    public int getMode();

    /**
     * Calculate the mean value.
     * @return The mean value
     * @see Mean
     */
    public Mean statMean();
    
    /**
     * Calculate sum of squares - used in standard deviation/variance calculations.
     * @return sum of squares of statistical memory values
     */
    public double statSumSquares();

    /**
     * Calculate the sample standard deviation.
     * @return The sample standard deviation value
     * @see StDev
     */
    public StDev statSampleStDev();

    /**
     * Calculate the population standard deviation.
     * @return The population standard deviation value
     * @see PopStDev
     */
    public PopStDev statPopulationStDev();

    /**
     * Another function whose purpose eludes me.
     * @return The frame used to hold the calculator
     */
    public javax.swing.JFrame frame();

    /**
     * We work in various bases. Although numbers are <strong>always</strong>
     * stored as doubles (i.e. IEE double precision floating point binary
     * representations) so that the Base is essentially just used for formatting
     * and so mainly used by the <em>view</em>, we need to keep a record of base
     * and this is a natural place to keep it, and the Parser object needs to know
     * the base so that it parses numbers entered correctly.
     * @return The base (default is Base.DECIMAL)
     */
    public Base getBase();

    /**
     * We can force scientific notation on all the time and record whether we do or
     * not.
     * @return <em>true</em> if we want every result shown in scientific notation
     */
    public boolean getScientificNotation();

}
