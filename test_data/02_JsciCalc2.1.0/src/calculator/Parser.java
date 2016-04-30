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
 * This is the <em>model</em> class as opposed to CalculatorApplet, which is the
 * <em>controller</em> class and is the real power behind the calculator: it does
 * almost all of the actual calculations. The only calculations that CalculatorApplet
 * does are those involving memory and only then at the request of the Parser object
 *
 * Parser does not itself know how to calculate anything. Rather it keeps
 * an ordered list of PObject objects representing the expression to be evaluated.
 * It then uses the PObject class hierarchy to decide which PObject objects to
 * evaluate first, which next and so on. Thus it starts by taking apart parentheses
 * and converting digits to doubles. Then it carries out various functions,
 * multiplication and division, addition and subtraction and finally boolean
 * operations to create a result, which it gives to the CalculatorApplet object
 * as a double.
 *
 * @see CalculatorApplet
 * @see PObject
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class Parser {

    public Parser(){
	list = new java.util.LinkedList<Object>();
	base = Base.DECIMAL;
    } 
	    
    /**
     * Convert exponents into a form that can be read directly. Exponents get
     * coverted early in the process of evaluating an expression and so nothing
     * else is done implicitly by this method.
     * @param list A list of tokens to be evaluated.
     */
    private void convertExponentsToNumerals( java.util.List<Object> list ){
	for( java.util.ListIterator<Object> i = list.listIterator(); i.hasNext(); ){
	    Object o = i.next();
	    if( o instanceof E ){
		i.set( new Numeral( 'e' ) );
		boolean negative = false;
		for( o = i.next(); o instanceof Add || o instanceof Subtract;
		     o = i.next() ){
		    // it ought to be Add or Subtract
		    if( o instanceof Subtract )
			negative = !negative;
		    i.remove();
		}
		i.previous(); // return to 'e'
		if( negative ){
		    i.previous();
		    i.next();  // position iterator correctly
		    i.add( new Numeral( '-' ) ); 
		}
	    }
	}
    }

    /**
     * Convert anything that is a Numeral into a Double.
     * Exponents are also converted implicitly.
     * @see Numeral
     * @param list A list of tokens to be evaluated.
     */
    private void convertNumerals( java.util.List<Object> list ){
	convertExponentsToNumerals( list );
	for( java.util.ListIterator<Object> i = list.listIterator(); i.hasNext(); ){
	    Object o = i.next();
	    if( o instanceof Numeral ){
		i.remove();
		Numeral numeral = (Numeral)o;
		java.lang.String number = numeral.name();
		boolean flag;
		while( (flag = i.hasNext()) && (o = i.next()) instanceof Numeral ){
		    i.remove();
		    numeral = (Numeral)o;
		    number = number.concat( numeral.name() );
		}
		if( flag )
		    i.previous();
		//i.add( java.lang.Double.valueOf( number ) );
		i.add( ParseBase.parseString( number, base ) );
	    }
	}
    }

    /**
     * Convert anything that is a Container.
     * Numerals and exponents are also done before containers are handled.
     * @see Container
     * @param list A list of tokens to be evaluated.
     */
    private void convertContainers( java.util.List<Object> list ){
	/* first we convert Numerals */
	convertNumerals( list );
	for( java.util.ListIterator<Object> i = list.listIterator(); i.hasNext(); ){
	    Object o = i.next();
	    if( o instanceof Container ){
		if( ((Container)o).error() )
		    throw new RuntimeException( "Stat Error" );
		i.set( ((Container)o).value() );
	    }
	}
    }

    /**
     * This is where unary plus/minus is handled. Implicitly calls
     * convertContainers.
     * @param list A list of tokens to be evaluated.
     */
    private void convertARFunctions( java.util.List<Object> list ){
	/* first we must convert Containers and hence Numerals */
	convertContainers( list );
	for( java.util.ListIterator<Object> i = list.listIterator( list.size() );
	     i.hasPrevious(); ){
	    //System.out.println( getExpression() );
	    //System.out.println( "=============" );
	    Object o = i.previous();
	    if( o instanceof AFunction ){
		//System.out.println( getExpression() );
		//System.out.println( "+++++++++++++" );
		AFunction a = (AFunction)o;
		boolean flag;
		if( (flag = !i.hasPrevious()) ||
		    !((o = i.previous()) instanceof java.lang.Double
		      || o instanceof LFunction ) ){
		    if( !flag )
			i.next(); // advance to the AFunction;
		    i.next();
		    //i.remove();
		    //double x = ((java.lang.Double)(i.next())).doubleValue();
		    if( a instanceof Add )
			i.set( new Uplus() );
		    else if( a instanceof Subtract )
			i.set( new Uminus() );
		    else
			throw new RuntimeException( "+/- Error" );
		    //System.out.println( getExpression() );
		}
	    }
	}
    }

    /**
     * This is obsoleted by using convertExponentsToNumerals but in principal
     * allows us to do the same thing: deal with numbers in the format XeY. This
     * version is more general. For example, it can parse 1.23e-1.6 correctly, but
     * it is also more prone to rounding errors when dealing with obvious
     * coversions. The function is actually called still, but there are no
     * exponents to convert so effectively it just passes up the chain to
     * convertARFunctions.
     * @param list A list of tokens to be evaluated.
     */
    private void convertExponents( java.util.List<Object> list ){
	/* first we must convert Unary (right) AFunctions */
	convertARFunctions( list );
	for( java.util.ListIterator<Object> i = list.listIterator(); i.hasNext(); ){
	    Object o = i.next();
	    if( o instanceof E ){
		i.remove();
		E e = (E)o;
		int sign = +1;
		for( o = i.next(); o instanceof Uplus || o instanceof Uminus;
		     o = i.next() ){
		    // it ought to be Uplus or Uminus
		    if( o instanceof Uminus )
			sign *= -1;
		    i.remove();
		}
		double y = (java.lang.Double)o;
		i.remove();
		double x = (java.lang.Double)i.previous();
		// set base
		switch( base ){
		case HEXADECIMAL:
		    e.base( 16 );
		    break;
		case OCTAL:
		    e.base( 8 );
		    break;
		case BINARY:
		    e.base( 2 );
		    break;
		case DECIMAL:
		default:
		    e.base( 10 );
		}
		i.set( e.function( x, sign * y ) );
	    }
	}
    }

    /**
     * Deal with Square and like left functions.
     * Calls convertARFunction (through convertExponents) first.
     * @param list A list of tokens to be evaluated.
     */
    private void convertLFunctions( java.util.List<Object> list ){
	/* first we must convert Exponents */
	convertExponents( list );
	for( java.util.ListIterator<Object> i = list.listIterator(); i.hasNext(); ){
	    Object o = i.next();
	    if( o instanceof LFunction ){
		i.remove();
		LFunction l = (LFunction)o;
		double x = (java.lang.Double)i.previous();
		i.set( l.function( x ) );
	    }
	}
    }

    /**
     * Deal with functions like Power that have both left and right arguments.
     * Calls convertLFunctions first.
     * @param list A list of tokens to be evaluated.
     */
    private void convertDFunctions( java.util.List<Object> list ){
	/* first we must convert LFunctions */
	convertLFunctions( list );
	for( java.util.ListIterator<Object> i = list.listIterator(); i.hasNext(); ){
	    Object o = i.next();
	    if( o instanceof DFunction ){
		i.remove();
		DFunction d = (DFunction)o;
		double y = (java.lang.Double)i.next();
		i.remove();
		double x = (java.lang.Double)i.previous();
		i.set( d.function( x, y ) );
	    }
	}
    }

    /**
     * Deal with functions like SquareRoot that have right argument only.
     * Calls convertDFunctions first.
     * @param list A list of tokens to be evaluated.
     */
    private void convertRFunctions( java.util.List<Object> list ){
	/* first we must convert DFunctions */
	convertDFunctions( list );
	for( java.util.ListIterator<Object> i = list.listIterator( list.size() );
	     i.hasPrevious(); ){
	    Object o = i.previous();
	    if( o instanceof RFunction ){
		i.remove();
		RFunction r = (RFunction)o;
		double x = ((java.lang.Double)(i.next())).doubleValue();
		i.set( new java.lang.Double( r.function( x ) ) );
	    }
	}
    }

    /**
     * Deal with multiplication and division.
     * Calls convertRFunctions first.
     * @param list A list of tokens to be evaluated.
     */
    private void convertMFunctions( java.util.List<Object> list ){
	/* first we must convert RFunctions */
	convertRFunctions( list );
	for( java.util.ListIterator<Object> i = list.listIterator(); i.hasNext(); ){
	    Object o = i.next();
	    if( o instanceof MFunction ){
		i.remove();
		MFunction m = (MFunction)o;
		double y = (java.lang.Double)i.next();
		i.remove();
		double x = (java.lang.Double)i.previous();
		i.set( m.function( x, y ) );
	    }
	}
    }

    /**
     * Deal with addition and subtraction.
     * Calls convertMFunctions first.
     * @param list A list of tokens to be evaluated.
     */
    private void convertAFunctions( java.util.List<Object> list ){
	/* first we must convert MFunctions */
	convertMFunctions( list );
	for( java.util.ListIterator<Object> i = list.listIterator(); i.hasNext(); ){
	    Object o = i.next();
	    if( o instanceof AFunction ){
		i.remove();
		AFunction a = (AFunction)o;
		double y = (java.lang.Double)i.next();
		i.remove();
		double x = (java.lang.Double)i.previous();
		i.set( a.function( x, y ) );
	    }
	}
    }
    
    /**
     * Deal with boolean functions.
     * Calls convertMFunctions first.
     * @param list A list of tokens to be evaluated.
     */
    private void convertBoolFunctions( java.util.List<Object> list ){
	/* first we must convert AFunctions */
	convertAFunctions( list );
	for( java.util.ListIterator<Object> i = list.listIterator(); i.hasNext(); ){
	    Object o = i.next();
	    if( o instanceof BoolFunction ){
		i.remove();
		BoolFunction b = (BoolFunction)o;
		double y = (java.lang.Double)i.next();
		i.remove();
		double x = (java.lang.Double)i.previous();
		//System.out.print( "> " );
		//System.out.println( b.function( x, y ) );
		i.set( b.function( x, y ) );
	    }
	}
    }

    /**
     * Tries to strip a pair of parenthesis. If it succeeds, the epression in
     * parenthesis is passed to convertBoolFunctions and so on up the chain
     * so that it gets converted to a Double.
     * @return true if we managed to strip a pair of parentheses.
     */
    private boolean stripParenthesis( java.util.List<Object> list ){
	int lparen = -1;
	int rparen = -1;
	for( int i = 0; i < list.size(); ++i ){
	    Object o = list.get( i );
	    if( o instanceof LParen )
		lparen = i;
	    else if( o instanceof RParen ){
		rparen = i;
		break;
	    }
	}
	if( lparen == -1 && rparen == -1 )
	    return false;
	if( lparen == -1 || rparen == - 1 )
	    throw new RuntimeException( "Parenthesis Error" );
	list.remove( rparen );
	list.remove( lparen );
	convertBoolFunctions( list.subList( lparen, rparen - 1 ) );
	return true;
    }

    /**
     * This is the main evaluation function. It works by a finding suitable
     * subexpressions and calling a cascade of methods to evaluate the expression
     * in the correct sequence. Thus the parser works largely by recursion on
     * what can be thought of as a tree of PObjects defined by the sequence of
     * Parser methods and the PObject hierarchy.
     *
     * There may be some inconsistency here - either Parser should store AngleType
     * or it doesn't need to store Base. It won't cause any errors because we'll
     * always get evaluated what was displayed.
     *
     * @param angleType Whether to use radians or degrees
     * @return A double or an error if the expression was nonsensical.
     */
    public Object evaluate( AngleType angleType ){
	/* set AngleType for all trig functions */
	for( Object o : list )
	    if( o instanceof Trig )
		((Trig)o).setScale( angleType );
	try {
	    while( stripParenthesis( list ) );
	    convertBoolFunctions( list );
	} catch( java.lang.Exception e ){
	    System.out.println( e.getMessage() );
	    return new Error( "ERROR" );
	}
	if( list.size() != 1 ){
	    System.out.println( list.size() );
	    return new Error( "ERROR" );
	}
	try {
	    java.lang.Double d = (Double)(list.remove( 0 ));
	    return d;
	} catch( java.lang.Exception e ){
	    System.out.println( e.getMessage() );
	    return new Error( "ERROR" );
	}
    }

    /**
     * How many objects (usually PObject objects) in the expression?
     * @return size of expression stored.
     */
    public int size(){
	return list.size();
    }

    /**
     * Put a PObject object on the end of the expression.
     * @param o The PObject to add
     */
    public void add( PObject o ){
	list.add( o );
    }

    /**
     * Put a PObject object at a specified position. We need this if the expression
     * is editable. Otherwise we could not add elements at an arbitrary position.
     * @param index The position at which to insert the object
     * @param o The PObject to add
     */
    public void add( int index, PObject o ){
	if( index < list.size() )
	    list.add( index, o );
	else if( index == list.size() )
	    list.add( o );
	else
	    throw new RuntimeException( "Parser.add(): index out of range" );
    }

    /**
     * Delete PObject at position index. Used for editing expressions.
     * @param index The position at which to delete
     * @return The deleted object, which would normally just be discarded
     */
    public PObject del( int index ){
	if( index > 0 && index < list.size() ){
	    Object o = list.remove( index - 1 );
	    if( o instanceof PObject )
		return (PObject)o;
	    else
		return null;
	} else if( index == list.size() ){
	    if( list.isEmpty() )
		return null;
	    Object o = list.remove( index - 1 );
	    if( o instanceof PObject )
		return (PObject)o;
	    else
		return null;
	} else if( index == 0 )
	    return null;
	else
	    throw new RuntimeException( "Parser.del(): index out of range" );
    }

    /**
     * Find an array of String objects representing the first q Objects.
     * The strange format is so that we could
     * know how many characters (including HTML) were in the string. The Navigator
     * class uses this kind of information.
     * 
     * @param q An integer
     * @return Objects that can be placed in a string.
     */
    private java.util.Vector<java.lang.String> getStringVector( int q ){
	/* first create an array of HTML characters */
	java.util.Vector<java.lang.String> c
	    = new java.util.Vector<java.lang.String>();
	int i = 0;
	for( Object o : list ){
	    if( o instanceof PObject ){
		PObject p = (PObject)o;
		for( java.lang.String s : p.name_array() )
		    c.add( s );
	    }
	    ++i;
	    if( i >= java.lang.Math.min( q, list.size() ) ) break;
	}
	return c;
    }

//     public java.lang.String getExpression(){
// 	java.lang.StringBuffer s = new java.lang.StringBuffer();
// 	s.append( "<html>" );
// 	for( Object o : list ){
// 	    if( o instanceof PObject )
// 		s.append( ((PObject)o).name() );
// 	    else
// 		s.append( o );
// 	}
// 	s.append( "</html>" );
// 	return s.toString();
//     }

//     public Expression getExpression(){
// 	java.util.Vector<java.lang.String> expression
// 	    = new java.util.Vector<java.lang.String>();
// 	java.util.Vector<Integer> stops = new java.util.Vector<Integer>();
// 	stops.add( 0 );
// 	for( Object o : list ){
// 	    if( o instanceof PObject ){
// 		PObject p =(PObject)o;
// 		/* add something to both expression and stops */
// 		for( java.lang.String s : p.name_array() )
// 		    expression.add( s );
// 		stops.add( stops.lastElement() + p.name_array().length );
// 	    }
// 	}
// 	return new Expression( expression, stops );
//     }

    /**
     * Convert expression to a string. Useful for debugging and displaying.
     * @return Expresion as a string.
     */
    public java.lang.String getExpression(){
	/* first create an array of HTML characters */
	java.util.Vector<java.lang.String> c = getStringVector( list.size() );
	java.lang.StringBuffer s = new java.lang.StringBuffer();
	for( int i = 0; i < c.size(); ++i )
	    s.append( c.elementAt( i ) );
	return s.toString();
    }

    /**
     * Convert expression to a string. Useful for debugging and displaying. Probably
     * obsolete.
     * param n The number of objects to try to convert.
     * @return Expresion as a string.
     */
    public java.lang.String getExpression( int n ){
	/* first create an array of HTML characters */
	java.util.Vector<java.lang.String> c = getStringVector( list.size() );
	java.lang.StringBuffer s = new java.lang.StringBuffer();
	//s.append( "<html><pre " );
	//s.append( ">" );
	int start = java.lang.Math.max( c.size() - n, 0 );
	for( int i = start; i < start + java.lang.Math.min( c.size(), n ); ++i )
	    s.append( c.elementAt( i ) );
	//s.append( "</pre></html>" );
	return s.toString();
    }
    
    /**
     * When you press AC you need a new expression.
     */
    public void clearExpression(){
	list.clear();
    }

    /**
     * Are there any objects in the current expression.
     * @return <em>true</em> if current expression is empty.
     */
    public boolean isEmpty(){
	return list.isEmpty();
    }

    /**
     * Get the last object. This is used by EqualsButton to find out whether
     * or not it should add an Ans object before evaluating an expression.
     * @return last object in the expression
     */
    public final PObject getLast(){
	if( list.isEmpty() )
	    return null;
	Object o = list.getLast();
	if( o instanceof PObject )
	    return (PObject)o;
	else
	    return null;
    }
    
    /**
     * Delete PObject at position index. Used for editing expressions.
     * This version is probably obsolete.
     * @return The deleted object, which would normally just be discarded
     */
    public boolean del(){
	if( list.isEmpty() )
	    return false;
	java.util.ListIterator i = list.listIterator( list.size() );
	i.previous();
	i.remove();
	return true;
    }
    
    /**
     * We need to can get a copy of the expression if we move up the history list.
     * @return A copy of the current expression
     */
    public java.util.LinkedList<PObject> getList(){
	java.util.LinkedList<PObject> result = new java.util.LinkedList<PObject>();
	for( Object object : list )
	    if( object instanceof PObject )
		result.add( (PObject)object );
	return result;
    }

    /**
     * If we move up or down the history list we change the current expression using
     * this function
     * @see #getList()
     * @param newlist A list of PObject objects to be copied into this Parser
     */
    public void setList( java.util.LinkedList<PObject> newlist ){
	list.clear();
	for( PObject object : newlist )
	    list.add( object );
    }

    /**
     * Parser keeps a copy of the Base. We do this because the Parser object
     * does not know about the CalculatorApplet object: the <em>controller</em> is
     * hidden from the <em>model</em>.
     * @return base
     */
    public final Base base(){
	return base;
    }

    /**
     * Parser keeps a copy of the Base. We do this because the Parser object
     * does not know about the CalculatorApplet object: the <em>controller</em> is
     * hidden from the <em>model</em>.
     * Value gets set by CalculatorApplet.
     * @param base The new base
     */
    public void base( Base base ){
	this.base = base;
    }

    /**
     * The expression: a list of objects. Actually PObject objects most of the time,
     * but it's convenient to keep a list of objects because during expression
     * evaluation, Double objects get put in the list.
     */
    private java.util.LinkedList<Object> list;
    /**
     * The base. Base.DECIMAL, Base.Octal, Base.HEXADECIMAL or Base.Binary.
     * @see #base()
     * @see Base
     */
    private Base base;

    /**
     * May be obsolete: used to witch font size within HTML. If it's not obsolete,
     * it probably belongs in a <em>view</em> class
     * @param fontSize A font size
     * @return The CSS to change font size.
     */
    public static java.lang.String font_size( float fontSize ){
	java.lang.String s = "style=\"font-size: "
	    + java.lang.Float.toString( fontSize )
	    + "\"";
	return s;
    }

    /**
     * Test code.
     */
    public static void main( java.lang.String args[] ){
	Parser parser = new Parser();
	parser.add( new Numeral( '3' ) );
	parser.add( new Numeral( '.' ) );
	parser.add( new Numeral( '1' ) );
	parser.add( new Numeral( '4' ) );
	parser.add( new Multiply() );
	parser.add( new LParen() );
	parser.add( new Numeral( '4' ) );
	parser.add( new Add() );
	parser.add( new Numeral( '5' ) );
	parser.add( new Cube() );
	parser.add( new Subtract() );
	parser.add( new Numeral( '5' ) );
	parser.add( new Combination() );
	parser.add( new Numeral( '2' ) );
	parser.add( new RParen() );
	javax.swing.JOptionPane.showMessageDialog( null, parser.getExpression() );
	System.out.println( parser.evaluate( AngleType.DEGREES ) );
    }

}
