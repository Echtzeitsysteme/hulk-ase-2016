/***************************************************************************
                           GanttCalendar.java  -  description
                             -------------------
    begin                : dec 2002
    copyright            : (C) 2002 by Thomas Alexandre
    email                : alexthomas(at)ganttproject.org
 ***************************************************************************/

/***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/



package net.sourceforge.ganttproject;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import net.sourceforge.ganttproject.language.GanttLanguage;
import net.sourceforge.ganttproject.time.gregorian.GregorianCalendar;

/** 
  * Class use for calendar
  */
public class GanttCalendar extends GregorianCalendar implements Serializable
{
	private GanttLanguage language = GanttLanguage.getInstance();
    private boolean isFixed;

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }

	/** Default constructor */
	public GanttCalendar () 
	{
		super();
	}
	
	/** Constructor with a year, a month and a day */
	public GanttCalendar (int year, int month, int date)
	{
		super(year, month, date);
	}

	
	/** Copy constructor */
	public GanttCalendar (GanttCalendar g)
	{
		super(g.getYear(), g.getMonth(), g.getDate());
	}
	
	public GanttCalendar (Date date)
   {
     super();
     setTime(date);
   }

//////////////////////////////////////////////////////////////////////////////////////////////////////

	  public static GanttCalendar parseXMLDate(String s)
	  {
		  GanttCalendar tmp = new GanttCalendar();
		  //Get "/" caracters
		  int fb=s.indexOf('/');
		  int sb=s.indexOf('/',fb+1);
		  //Get all fiels
		  String d = s.substring(0,fb);
		  String m = s.substring(fb+1,sb);
		  String y = s.substring(sb+1);
			
		  //Set the date
		  tmp.set(Calendar.YEAR, new Integer(y).hashCode());
		  tmp.set(Calendar.MONTH, new Integer(m).hashCode()-1);
		  tmp.set(Calendar.DATE, new Integer(d).hashCode());
		  
		  return tmp;
	  }

	/** Return a clone of the calendar */
	public GanttCalendar Clone()
	{
		GanttCalendar clone = new GanttCalendar(getYear(), getMonth(), getDay());
        clone.setFixed(isFixed());
		return clone;
	}

	/**  Return the date to A string */
	public String toString ()
	{
		return (language.formatDate(this));
	}
	
	public String toXMLString() {
		return getDate() + "/" + (getMonth() + 1) + "/" + getYear();
	}


	/** Return the year */
	public int getYear() { return this.get(Calendar.YEAR); }

	/** Return the month */
	public int getMonth() { return this.get(Calendar.MONTH); }

	/** Return the day */
	public int getDate() { return this.get(Calendar.DATE); }

	/** Return the day */
	public int getDay() { return this.get(Calendar.DAY_OF_MONTH ); }
	
	/** Return the number of the day on the week */
	public int getDayWeek() { return this.get(Calendar.DAY_OF_WEEK ); }
	
	/** Return the numbner of the week on the year */
	public int getWeek() { return this.get(Calendar.WEEK_OF_YEAR ); }
	
	/** Return an array with all name of month */
	public String [] getDayMonthLanguage() 
	{
		String [] res = new String [12];
		for(int i=0;i<12;i++)
			res[i] = language.getMonth(i);
		return res; 
	}
	
	/** Return an array with all name of day */
	public String [] getDayWeekLanguage() 
	{
		String [] res = new String [7];
		for(int i=0;i<7;i++)
			res[i] = language.getDay(i);
		return res; 
	}
	
	
	/** Change the year of the date */
	public void setYear(int y) { this.set(Calendar.YEAR, y); }

	/** Change the month of the date */
	public void setMonth(int m) { this.set(Calendar.MONTH, m); }

	/** Change the date of the date */
	public void setDay(int d) { this.set(Calendar.DAY_OF_MONTH, d); }
	
	

	/** Add a number of day to the current date */
	public void add (int dayNumber)
	{
		this.add(Calendar.DATE, dayNumber);
	}
	
	/** Change the year of the date, and return a copy */
	public GanttCalendar newAdd (int dayNumber)
	{
		GanttCalendar gc = new GanttCalendar(getYear(), getMonth(), getDate());
		gc.add(Calendar.DATE, dayNumber);
		return gc;
	}

	/** Return the difference (in day) between two date */
	public int diff( GanttCalendar d )
	{
		int res=0;
		GanttCalendar d1;
		GanttCalendar d2;
		
		if(this.compareTo(d)==0) return res;
		
		else if(compareTo(d)<0) {
			d1 = this.Clone();
			d2 = new GanttCalendar(d);
		}
		else {
			d1 = new GanttCalendar(d);
			d2 = this.Clone();
		}

		while(d1.compareTo(d2)!=0)
		{
			d1.add(1);
			res++;
		}
		return res;
	}
	
	/** Return the string of the month. */
	public String getdayMonth() { return language.getMonth(getMonth()); }
	
	/** Return the string of the day. */
	public String getdayWeek() {return language.getDay(this.get(Calendar.DAY_OF_WEEK)-1);}
	
	/** Return the number of day on the month */
	public int getNumberOfDay() 
	{
		return this.getActualMaximum(Calendar.DATE);
	}
	
	/**
	 * This function returns the signal represented by an int
	**/
	private int module(int number){	  
	  if (number > 0)
	    return 1;
	  else if (number < 0) return -1;
	  else return 0;
	}
	
	/** This function compare two date
	  * @return 0 If the two date are equals
	  * @return -1 if the date is before when
	  * @return 1 if the date is after when
	  */
	public int compareTo (GanttCalendar when)
	{
		int[] comparissons = { Calendar.YEAR , Calendar.MONTH , Calendar.DATE };
	  	for (int i = 0; i < comparissons.length ; i++){
	  	  switch (module(this.get(comparissons[i]) - when.get(comparissons[i]))){
	  	  case -1:
	  	    return -1;
	  	  case 1:
	  	    return 1;
	  	  default:	  		  
	  	    break;
	  	  }
	  	}	  	
	  	return 0; 
	}
	
	
	/** Is the date equals to when */
	public boolean equals (GanttCalendar when)
	{
		return getYear() == when.getYear()
        && getMonth() == when.getMonth()
        && getDay() == when.getDay()		;
	}
	
	/** Change date to next month. */
	public void goNextMonth() { this.add(Calendar.MONTH,1); }
	
	/** Change date to previous month. */	
	public void goPrevMonth() { this.add(Calendar.MONTH,-1); }
		
	/**Change the value of a filed */	
	public void go (int field, int value) { this.add(field,value);	}
	
	
	/** Return the actually date */
	public static String getDateAndTime()
	{		
		GanttCalendar c= new GanttCalendar();		
		return c.toString() + " - " + GanttLanguage.getInstance().formatTime(c);
	}
}
