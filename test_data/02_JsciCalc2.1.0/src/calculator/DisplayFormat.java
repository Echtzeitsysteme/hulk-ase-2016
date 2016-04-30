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
 * This class really was hacked together rather quickly and may still contain the
 * odd bug. Although it's derived from java.text.DecimalFormat, it doesn't use this
 * class now because it contained some weird bugs (not M$ level but still
 * occasionally irritating). Instead, for decimals, it just uses
 * java.lang.Double.toString and the reparses
 * the result.
 *
 * If the Base is not Base.DECIMAL we take a different approach, extracting
 * what we need to format the number from the IEEE 754 64-bit format and converting
 * to a string according to our needs.
 *
 * \bug
 * In Base.BINARY the standard format result can grow so long that not all digits
 * are fully visible in the display.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class DisplayFormat extends java.text.DecimalFormat {
    
    //stuff to handle hexadecimals, octals and binary
    
    /**
     * We need to know how to represent integers up to 15 as char. This function
     * does it.
     * @param d An integer (should be in range 0-15)
     * @return The corresponding char
     */
    private static char getDigit( int d ){
	switch( d ){
	case 0:
	    return '0';
	case 1:
	    return '1';
	case 2:
	    return '2';
	case 3:
	    return '3';
	case 4:
	    return '4';
	case 5:
	    return '5';
	case 6:
	    return '6';
	case 7:
	    return '7';
	case 8:
	    return '8';
	case 9:
	    return '9';
	case 10:
	    return 'A';
	case 11:
	    return 'B';
	case 12:
	    return 'C';
	case 13:
	    return 'D';
	case 14:
	    return 'E';
	case 15:
	    return 'F';
	default:
	    return '?';
	}
    }

    /**
     * This is effectively the reverse of getDigit(). We use it when extracting
     * digits from java.lang.Double.toString().
     * @param c A char corresponding to a digit
     * @return The corresponding int
     */
    private static int getInt( char c ){
	switch( c ){
	case '0':
	    return 0;
	case '1':
	    return 1;
	case '2':
	    return 2;
	case '3':
	    return 3;
	case '4':
	    return 4;
	case '5':
	    return 5;
	case '6':
	    return 6;
	case '7':
	    return 7;
	case '8':
	    return 8;
	case '9':
	    return 9;
	default:
	    return -1;
	}
    }
    
    /**
     * A private inner class that is similar in structure to ParseBase.Number.
     * It is used by DisplayFormat to represent a double in a form from whch
     * the digits can be extracted as characters.
     * @see ParseBase.Number
     */
    private static class Format {
	/**
	 * The constructor takes a double and a base (which will be the integer
	 * corresponding to Base).
	 * @param number The double we want to format
	 * @param base 2, 8, 10 or 16
	 */
	Format( double number, int base ){
	    digits = new java.util.Vector<Integer>();
	    exponentDigits = new java.util.Vector<Integer>();
	    infinity = java.lang.Double.isInfinite( number );
	    NaN = java.lang.Double.isNaN( number );
	    zero = number == 0;
	    this.base = base;
	}

	/**
	 * Rounds to sigDigits significant digits. We round 0.5 (or 0.1, 0.4, 0.8)
	 * up to nearest whole and get an aswer with sigDigits digits in it.
	 * @param sigDigits The desired number of significant digits
	 */
	public void round( final int sigDigits ){
	    if( sigDigits >= digits.size() ) return;
	    // first pass rounding
	    boolean carry = false;
	    for( int i = digits.size() - 1; i >= 0; --i ){
		if( i > sigDigits )
		    digits.removeElementAt( i );
		else if( i == sigDigits ){
		    int digit = digits.elementAt( i );
		    digits.removeElementAt( i );
		    if( 2 * digit < base ) break;
		} else { // round
		    int digit = digits.elementAt( i );
		    digit = (digit + 1) % base;
		    digits.setElementAt( digit, i );
		    if( digit != 0 ) break;
		    carry = i == 0;
		}
	    }
	    // may have to increase exponent
	    if( carry ){
		// Rearrange digits
		digits.add( 0, 1 );
		digits.removeElementAt( sigDigits );
		if( exponentNegative ){
		    for( int i = exponentDigits.size() - 1; i >= 0; --i ){
			int digit = exponentDigits.elementAt( i );
			digit = (digit - 1) % base;
			exponentDigits.setElementAt( digit, i );
			if( digit == 0 ) break;
			carry = i == 0;
		    }
		    if( carry )
			exponentDigits.removeElementAt( 0 );
		} else 
		    for( int i = exponentDigits.size() - 1; i >= 0; --i ){
			int digit = exponentDigits.elementAt( i );
			digit = (digit + 1) % base;
			exponentDigits.setElementAt( digit, i );
			if( digit != 0 ) break;
			carry = i == 0;
		    }
		    if( carry )
			exponentDigits.insertElementAt( 1, 0 );
	    }
	}

	/**
	 * The length of string that would be produced in standard notation.
	 * @return The length of the string that standard() would produce
	 */
	public int length(){
	    if( NaN )
		return 3;
	    if( zero )
		return 1;
	    if( infinity )
		if( negative )
		    return 2;
		else
		    return 1;
	    int length = digits.size();
	    for( int i = digits.size() - 1; digits.elementAt( i ) == 0; --i )
		--length;
	    if( exponentNegative ){ // ignore trailing zeros
		// baseimal point
		length += exponent + 1;
	    } else {
		if( length > exponent ) // baseimal point
		    ++length; 
		else
		    length = exponent + 1;
	    }
	    if( negative ) ++length;
	    return length;
	}

	/**
	 * The length of string that would be produced in scientific notation.
	 * @return The length of the string that scientific() would produce
	 */
	public int scientificLength(){
	    if( NaN )
		return 3;
	    if( zero )
		return 1;
	    if( infinity )
		if( negative )
		    return 2;
		else
		    return 1;
	    int length = 4; // . and x10
	    if( negative )
		++length;
	    if( exponentNegative )
		++length;
	    int z = digits.size();
	    for( int i = digits.size() - 1; digits.elementAt( i ) == 0; --i )
		--z;
	    length += z; // significand digits
	    if( z == 1 )
		--length; // no base point
	    z = 0;
	    for( int i = 0; i < exponentDigits.size()
		     && exponentDigits.elementAt( i ) == 0; ++i )
		++z;
	    length += exponentDigits.size() - z;
	    return length;
	}

	/**
	 * Calculate the number of digits in the exponent. This is used to help
	 * decide when to use scientific notation.
	 * @return The number of digits in the exponent
	 */
	public int exponentDigits(){
	    int z = 0;
	    for( int i = 0; i < exponentDigits.size()
		     && exponentDigits.elementAt( i ) == 0; ++i )
		++z;
	    return exponentDigits.size() - z;
	}

	/**
	 * Produce a string representing the number without using
	 * scientific notation. This can produce very long strings.
	 * @return String representation of number without an exponent
	 */
	public java.lang.String standard(){
	    if( NaN )
		return "NaN";
	    if( zero )
		return "0";
	    if( infinity )
		if( negative )
		    return "-&#8734;";
		else
		    return "&#8734;";
	    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
	    int z = digits.size();
	    for( int i = digits.size() - 1; digits.elementAt( i ) == 0; --i )
		--z;
	    if( negative )
		stringBuffer.append( "-" );
	    if( exponentNegative ){ // ignore trailing zeros
		stringBuffer.append( "0." );
		for( int i = 0; i < exponent - 1; ++i )
		    stringBuffer.append( "0" );
		for( int i = 0; i < z; ++i )
		    stringBuffer.append( getDigit( digits.elementAt( i ) ) );
	    } else {
		for( int i = 0; i < java.lang.Math.max( exponent, digits.size() );
		     ++i ){
		    if( i >= java.lang.Math.max( exponent + 1, z ) ) break;
		    if( i == exponent + 1 )
			stringBuffer.append ( "." );
		    if( i < digits.size() )
			stringBuffer.append( getDigit( digits.elementAt( i ) ) );
		    else
			stringBuffer.append( "0" );
		}
	    }
	    return stringBuffer.toString();
	}

	/**
	 * Produce a string representing the number using
	 * scientific notation. All significant digits are used; so use round() to
	 * shorten if necessary.
	 * @return String representation of number with an exponent
	 */
	public java.lang.String scientific(){
	    if( NaN )
		return "NaN";
	    if( zero )
		return "0&#215;10<sup>0</sup>";
	    if( infinity )
		if( negative )
		    return "-&#8734;";
		else
		    return "&#8734;";
	    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
	    int z = digits.size();
	    for( int i = digits.size() - 1; digits.elementAt( i ) == 0; --i )
		--z;
	    if( negative )
		stringBuffer.append( "-" );
	    stringBuffer.append( getDigit( digits.elementAt( 0 ) ) );
	    if( z > 1 )
		stringBuffer.append( "." );
	    for( int i = 1; i < z; ++i )
		stringBuffer.append( getDigit( digits.elementAt( i ) ) );
	    stringBuffer.append( "&#215;10<sup>" );
	    if( exponent == 0 )
		stringBuffer.append( "0" );
	    else {
		if( exponentNegative )
		    stringBuffer.append( "-" );
		// strip leading zeros
		z = 0;
		for( int i = 0; exponentDigits.elementAt( i ) == 0; ++i )
		    ++z;
		for( int i = z; i < exponentDigits.size(); ++i )
		    stringBuffer.append( getDigit( exponentDigits.elementAt( i ) ) );
	    }
	    stringBuffer.append( "</sup>" );
	    return stringBuffer.toString();
	}

	/**
	 * Is number negative?
	 */
	public boolean negative;
	/**
	 * Representation of significand digits as integers in correct base.
	 */
	public java.util.Vector<Integer> digits;
	/**
	 * Is exponent negative?
	 */
	public boolean exponentNegative;
	/**
	 * Representation of exponent digits as integers in correct base.
	 */
	public java.util.Vector<Integer> exponentDigits;
	/**
	 * Value of the exponent.
	 */
	public int exponent;
	/**
	 * Is number infinite?
	 */
	public boolean infinity;
	/**
	 * Is number not a number?
	 */
	public boolean NaN;
	/**
	 * Is number zero? Useful so we can avoid overflow in some methods.
	 */
	public boolean zero;
	/**
	 * The base as an integer.
	 */
	public int base;
    }
    
    /**
     * This method handles formatting decimals
     * @param number The double to format
     * @return DisplayFormat.Format object representing information needed to
     * show number as decimal string
     */
    private static Format formatDec( double number ){
	Format format = new Format( number, 10 );
	// deal with infinities, zero and NaN 
	if( java.lang.Double.isNaN( number ) ){
	    format.NaN = true;
	    return format;
	}
	if( java.lang.Double.isInfinite( number ) ){
	    format.infinity = true;
	    long bits = java.lang.Double.doubleToRawLongBits( number );
	    // get sign
	    format.negative = (bits & 0x8000000000000000L) != 0;
	    return format;
	}
	if( number == 0 ){
	    format.zero = true;
	    return format;
	}
	java.lang.String s = java.lang.Double.toString( number );
	//System.out.println( s );
	boolean readingSignificand = true;
	boolean readPoint = false;
	boolean firstDigitRead = false;
	int leadingDigits = 0;
	format.exponent = 0;
	format.exponentNegative = false;
	format.negative = false;
	format.exponentNegative = false;
	for( java.lang.Character c : s.toCharArray() ){
	    if( readingSignificand ){
		if( c == '-' )
		    format.negative = true; 
		else if( readPoint == false && c == '.' )
		    readPoint = true;
		else if( c == 'E' )
		    readingSignificand = false;
		else {
		    int digit = getInt( c );
		    if( firstDigitRead ){
			firstDigitRead = true;
			if( digit != 0 )
			    ++leadingDigits;
		    } else {
			if( !readPoint )
			    ++leadingDigits;
		    }
		    format.digits.add( digit );
		}
	    } else {
		if( c == '-' )
		    format.exponentNegative = true;
		else {
		    int digit = getInt( c );
		    if( true || digit > 0 ){
			format.exponent *= 10;
			format.exponent += digit;
		    }
		}
	    }
	}
	format.exponent += leadingDigits - 1;
	for( java.lang.Character c : java.lang.Integer.toString( format.exponent )
		 .toCharArray() )
	    format.exponentDigits.add( getInt( c ) );
	//System.out.println( format.digits );
	//System.out.println( format.exponentDigits );
	//System.out.println();
	return format;
    }

    /**
     * This method handles formatting hexadecimals
     * @param number The double to format
     * @return DisplayFormat.Format object representing information needed to
     * show number as hexadecimal string
     */
    private static Format formatHex( double number ){
	Format format = new Format( number, 16 );
	long bits = java.lang.Double.doubleToRawLongBits( number );
	// get sign
	format.negative = (bits & 0x8000000000000000L) != 0;
	long exponent = (bits & 0x7ff0000000000000L) >>> 52;
	long significand = bits & 0x000fffffffffffffL;
	exponent -= BIAS;
	//System.out.println( exponent );
	boolean denormalised = exponent == E_MIN - 1;
	format.exponentNegative = exponent < 0;
	if( format.exponentNegative )
	    exponent = -exponent;
	//System.out.println( number );
	//System.out.println( exponent );
	if( !denormalised ){ // easy case
	    significand |= 0x0010000000000000L;
	} else { // denormalised case
	    //System.out.println( "denormalised" );
	    significand <<= 1;
	    if( significand != 0 )
		while( (significand & 0x0008000000000000L) == 0 ){
		    ++exponent;
		    significand <<= 1;
		}
	}
	//System.out.print( "exponent: " );
	//System.out.println( exponent );
	while( exponent % 4 != 0 ){
	    //System.out.print( "+" );
	    //System.out.println( exponent );
	    significand <<= 1;
	    if( format.exponentNegative )
		++exponent;
	    else
		--exponent;
	}
	//System.out.println( exponent );
	exponent >>>= 2;
	format.exponent = (int)exponent;
	//System.out.print( "exponent:- " );
	//System.out.println( exponent );
	for( int i = 0; i < 14; ++i ){
	    int digit = (int)(significand & 0xfL);
	    format.digits.add( 0, digit );
	    significand >>>= 4;
	}
	for( int i = 0; i < 3; ++i ){
	    int digit = (int)(exponent & 0xfL);
	    format.exponentDigits.add( 0, digit );
	    exponent >>>= 4;
	}
	//System.out.println( exponent );
	//System.out.println( format.digits );
	//System.out.println( format.exponent );
	//System.out.println( format.exponentDigits );
	return format;
    }

    /**
     * This method handles formatting octals
     * @param number The double to format
     * @return DisplayFormat.Format object representing information needed to
     * show number as octals string
     */
    private static Format formatOct( double number ){
	//System.out.println( number );
	Format format = new Format( number, 8 );
	long bits = java.lang.Double.doubleToRawLongBits( number );
	// get sign
	format.negative = (bits & 0x8000000000000000L) != 0;
	long exponent = (bits & 0x7ff0000000000000L) >>> 52;
	//System.out.print( exponent );
	//System.out.print( " " );
	long significand = bits & 0x000fffffffffffffL;
	exponent -= BIAS;
	boolean denormalised = exponent == E_MIN - 1;
	format.exponentNegative = exponent < 0;
	if( format.exponentNegative )
	    exponent = -exponent;
	if( !denormalised ){ // easy case
	    significand |= 0x0010000000000000L;
	} else { // denormalised case
	    significand <<= 1;
	    if( significand != 0 )
		while( (significand & 0x0008000000000000L) == 0 ){
		    ++exponent;
		    significand <<= 1;
		}
	}
	//System.out.print( exponent );
	//System.out.print( " " );
	while( exponent % 3 != 0 ){
	    //System.out.print( "+" );
	    //System.out.println( exponent );
	    significand <<= 1;
	    if( format.exponentNegative )
		++exponent;
	    else
		--exponent;
	}
	exponent /= 3;
	format.exponent = (int)exponent;
	significand <<= 2;
	for( int i = 0; i < 19; ++i ){
	    int digit = (int)(significand & 0x7L);
	    format.digits.add( 0, digit );
	    significand >>>= 3;
	}
	//System.out.print( exponent );
	for( int i = 0; i < 4; ++i ){
	    int digit = (int)(exponent & 0x7L);
	    format.exponentDigits.add( 0, digit );
	    exponent >>>= 3;
	}
	return format;
    }

    /**
     * This method handles formatting binary numbers
     * @param number The double to format
     * @return DisplayFormat.Format object representing information needed to
     * show number as binary string
     */
    private static Format formatBin( double number ){
	//System.out.println( number );
	Format format = new Format( number, 2 );
	long bits = java.lang.Double.doubleToRawLongBits( number );
	// get sign
	format.negative = (bits & 0x8000000000000000L) != 0;
	long exponent = (bits & 0x7ff0000000000000L) >>> 52;
	long significand = bits & 0x000fffffffffffffL;
	exponent -= BIAS;
	boolean denormalised = exponent == E_MIN - 1;
	format.exponentNegative = exponent < 0;
	if( format.exponentNegative )
	    exponent = -exponent;
	if( !denormalised ){ // easy case
	    significand |= 0x0010000000000000L;
	} else { // denormalised case
	    significand <<= 1;
	    if( significand != 0 )
		while( (significand & 0x0008000000000000L) == 0 ){
		    ++exponent;
		    significand <<= 1;
		}
	}
	format.exponent = (int)exponent;
	for( int i = 0; i < 53; ++i ){
	    int digit = (int)(significand & 0x1L);
	    format.digits.add( 0, digit );
	    significand >>>= 1;
	}
	for( int i = 0; i < 9; ++i ){
	    int digit = (int)(exponent & 0x1L);
	    format.exponentDigits.add( 0, digit );
	    exponent >>>= 1;
	}
	return format;
    }

    /**
     * Method that creates a string (ideally in standard notation) representation
     * of a number to sigDigits significant digits. If maxLength is exceeded it
     * resorts to scientific notation.
     * @param d The number to format
     * @param sigDigits Desired number of significant digits
     * @param base Base: mut be 2, 8, 10 or 16
     * @param maxLength The maximum number of characters in the string produced
     * @return a string representation of d
     */
    public static java.lang.String formatStandard( double d, int sigDigits,
						   int base, int maxLength ){
	Format format;
	if( base == 2 )
	    format = formatBin( d );
	else if( base == 8 )
	    format = formatOct( d );
	else if( base == 16 )
	    format = formatHex( d );
	else
	    format = formatDec( d );
	format.round( sigDigits );
	if( format.length() > maxLength ){
	    // better round it a bit
	    int sc =  format.digits.size() + maxLength - format.scientificLength();
	    int st =  format.digits.size() + maxLength - format.length();
	    if( sc > st ){
		format.round( sc );
		return format.scientific();
	    } else {
		format.round( sc );
		return format.standard();
	    }
	}
	return format.standard();
    }

    /**
     * Method that creates a string (in scientific notation) representation
     * of a number to sigDigits significant digits. If maxLength is exceeded it
     * reduces significant digits as necessary.
     * @param d The number to format
     * @param sigDigits Desired number of significant digits
     * @param base Base: mut be 2, 8, 10 or 16
     * @param maxLength The maximum number of characters in the string produced
     * @return a string representation of d
     */
    public static java.lang.String formatScientific( double d, int sigDigits,
						     int base, int maxLength ){
	Format format;
	if( base == 2 )
	    format = formatBin( d );
	else if( base == 8 )
	    format = formatOct( d );
	else if( base == 16 )
	    format = formatHex( d );
	else
	    format = formatDec( d );
	format.round( sigDigits );
 	if( format.length() <= 0 ) // could use a minimum length
 	    return format.standard();
 	else {
 	    if( format.scientificLength() > maxLength ){
 		// better round it a bit
 		format.round( format.digits.size()
 			      + maxLength - format.scientificLength() );
 	    }
 	    return format.scientific();
 	}
    }

    // handle decimals
    
    /**
     * Constructor. Probably obsolete because it tries to use
     * java.text.DecimalFormat, which has a number of bugs that I didn't want to
     * try to work round. Most were in formatting numbers with large positive
     * or negative exponents.
     * @param digits The width of the display?
     */
    public DisplayFormat( int digits ){
	this.digits = digits;
 	exponentialNotation = false;
	setMinimumIntegerDigits( 1 );
	setMinimumFractionDigits( 0 );
	setGroupingSize( 0 );
	this.base = Base.DECIMAL;
    }
    
    /**
     * This does the formatting. We pass an Object because that's what we get
     * from the Parser. If it's not really a double, return "ERROR".
     * @param o The Object we want to format (usually a Double)
     * @return A suitably formatted string
     */
    public java.lang.String string( Object o ){
	if( o instanceof java.lang.Double ){
	    switch( base ){
	    case BINARY:
		if( exponentialNotation )
		    return "<html>" +
			formatScientific( (Double)o, 53, 2, 17 )
			+ "</html>";
		else
		    return "<html>" +
			formatStandard( (Double)o, 53, 2, 17 )
			+ "</html>";
	    case OCTAL:
		if( exponentialNotation )
		    return "<html>" +
			formatScientific( (Double)o, 17, 8, 17 )
			+ "</html>";
		else
		return "<html>" +
		    formatStandard( (Double)o, 17, 8, 17 )
		    + "</html>";
	    case HEXADECIMAL:
		if( exponentialNotation )
		    return "<html>" +
			formatScientific( (Double)o, 13, 16, 17 )
			+ "</html>";
		else
		return "<html>" +
		    formatStandard( (Double)o, 13, 16, 17 )
			+ "</html>";
	    case DECIMAL:
	    default:
		if( exponentialNotation )
		    return "<html>" +
			formatScientific( (Double)o, 15, 10, 17 )
			+ "</html>";
		else
		    return "<html>" +
			formatStandard( (Double)o, 15, 10, 17 )
			+ "</html>";
	    }
	} else if( o instanceof Error )
	    return ((Error)o).toString();
	else
	    return "Unknown";
    }
    
    // handle decimals

    /**
     * This did the formatting but is now obsolete (it used java.text.DecimalFormat).
     * @param d The double we want formatted
     * @return A suitably formatted string
     */
    public java.lang.String string( double d ){
	java.lang.StringBuffer buffer = new java.lang.StringBuffer();
	buffer.append( "<html>" );
	java.text.FieldPosition p
	    = new java.text.FieldPosition( java.text.NumberFormat.INTEGER_FIELD );
	double e = java.lang.Math.abs( d );
	if( e < 1 )
	    e = 1;
	int intDigits
	    = (int)( java.lang.Math.floor( java.lang.Math.log( e )
					   / java.lang.Math.log( 10 ) ) ) + 1;
	intDigits = (int)java.lang.Math.abs( intDigits );
	int fracDigits = digits - intDigits;
	//System.out.print( "fracDigits: " );
	//System.out.println( fracDigits );
	//System.out.print( "intDigits: " );
	//System.out.println( intDigits );
	if( (d > -10 && d < 10) || (intDigits <= digits && !exponentialNotation) ){
	    setMaximumIntegerDigits( intDigits );
	    setMaximumFractionDigits( fracDigits );
	    format( d, buffer, p );
	} else {
	    int exponent
		= (int)( java.lang.Math.floor( java.lang.Math.log( d ) /
					       java.lang.Math.log( 10 ) ) );
	    double mantissa = d / java.lang.Math.pow( 10, exponent );
	    intDigits = 1;
	    int exponentDigits
		= (int)( java.lang.Math.floor( java.lang.Math.log( exponent ) /
					       java.lang.Math.log( 10 ) ) );
	    fracDigits = digits - expDigits - 1 - exponentDigits;
	    setMaximumIntegerDigits( intDigits );
	    setMaximumFractionDigits( fracDigits );
	    format( mantissa, buffer, p );
	    buffer.append( "&#215;10<sup>" );
	    buffer.append( java.lang.Integer.toString( exponent ) );
	    buffer.append( "</sup>" );
	}
	buffer.append( "</html>" );
	/* workaround for a potential bug */
	int dp = buffer.indexOf( "." );
	if( dp == 6 || dp == 7 && buffer.indexOf( "-" ) == 6 )
	    buffer.insert( dp, "0" );
	/* ****************************** */
	return buffer.toString();
    }
    
    public static void main( java.lang.String[] args ){
	DisplayFormat d = new DisplayFormat( 12 );
	System.out.println( d.string( 3.0000000000005 ) );
	System.out.println( d.string( 1234567890987654321.0 ) );
	d.setExponentialNotation( true );
	System.out.println( d.string( 256.0 ) );
	System.out.println( d.string( 3.14159 ) );
    }
    
    /**
     * We store the base though it might be better to get it indirectly from
     * a ReadOnlyCalculatorApplet pointer.
     * @return The Base
     */
    public Base getBase(){
	return base;
    }

    /**
     * Get number of digits (probably not used)
     * @return number of digits (width of display)
     */
    public int getDigits(){
	return digits;
    }

    /**
     * We store whether we use scientific notation. Probably better to get this from
     * a ReadOnlyCalculatorApplet pointer.
     * @return <em>true</em> for scientific notation; <em>false</em> otherwise.
     */
    public boolean getExponentialNotation(){
 	return exponentialNotation;
    }

    /**
     * We store the base though it might be better to get it indirectly from
     * a ReadOnlyCalculatorApplet pointer.
     * @param b The new Base
     */
    public void setBase( Base b ){
	base = b;
    }

    /**
     * Set number of digits (probably not used)
     * @param d Number of digits (width of display)
     */
    public void setDigits( int d ){
	digits = d;
    }
    
    /**
     * We store whether we use scientific notation. Probably better to get this from
     * a ReadOnlyCalculatorApplet pointer.
     * @param b <em>true</em> for scientific notation
     */
    public void setExponentialNotation( boolean b ){
 	exponentialNotation = b;
    }

    /**
     * Whether or not to use scientific notation. Probably we should get this
     * from CalculatorApplet <em>controller</em> rather than store a local copy.
     */
    private boolean exponentialNotation;
    /**
     * Not currently used.
     */
    private static final int expDigits = 4;
    /**
     * Not currently used though the value can be set and read.
     */
    private int digits;
    /**
     * The Base Probably we should get this
     * from CalculatorApplet <em>controller</em> rather than store a local copy.
     */
    private Base base;

    /**
     * Standard constant for IEEE 754 doubles
     */
    public static final long BIAS = 1023;
    /**
     * Standard constant for IEEE 754 doubles
     */
    public static final long E_MAX = 1023;
    /**
     * Standard constant for IEEE 754 doubles
     */
    public static final long E_MIN = -1022;
}
