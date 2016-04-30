/*
LICENSE:
                                                                 
   This program is free software; you can redistribute it and/or modify  
   it under the terms of the GNU General Public License as published by  
   the Free Software Foundation; either version 2 of the License, or     
   (at your option) any later version.                                   
                                                                         
   Copyright (C) 2004, GanttProject Development Team
 */
package net.sourceforge.ganttproject.time;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * @author bard
 */
public class TimeUnitFunctionOfDateImpl extends TimeUnitDateFrameableImpl implements TimeUnitFunctionOfDate {
    private final DateFrameable myDirectFrameable;

    public TimeUnitFunctionOfDateImpl(String name, TimeUnitGraph graph, TimeUnit directAtomUnit, DateFrameable framer) {
        super(name, graph, directAtomUnit, framer);
        if (!(directAtomUnit instanceof DateFrameable)) {
            throw new IllegalArgumentException("Only date frameable time units may be used as atoms for functions of date");
        }
        myDirectFrameable = (DateFrameable)directAtomUnit;
    }

    public TimeUnit createTimeUnit(Date date) {
        return new ParameterizedTimeUnitImpl(date);
    }

    public int getAtomCount(TimeUnit atomUnit) {
        throw new UnsupportedOperationException("This time unit is function of date. Use method createTimeUnit() to create a parameterized instance.");
    }

    private class ParameterizedTimeUnitImpl implements TimeUnit, DateFrameable {
        private final Date myBaseDate;
        private final Date myRightDate;
        private final Date myLeftDate;
        private int myAtomCount = -1;
        private TextFormatter myTextFormatter;

        public ParameterizedTimeUnitImpl(Date myBaseDate) {
            this.myBaseDate = myBaseDate;
            this.myRightDate = TimeUnitFunctionOfDateImpl.this.adjustRight(myBaseDate);
            this.myLeftDate = TimeUnitFunctionOfDateImpl.this.adjustLeft(myBaseDate);
        }

        public String getName() {
            return TimeUnitFunctionOfDateImpl.this.getName();
        }

        public boolean isConstructedFrom(TimeUnit unit) {
            return TimeUnitFunctionOfDateImpl.this.isConstructedFrom(unit);
        }

        public int getAtomCount(TimeUnit atomUnit) {
            if (atomUnit==TimeUnitFunctionOfDateImpl.this || atomUnit==this) {
                return 1;
            }
            int directAtomCount = getDirectAtomCount();
            return directAtomCount*getDirectAtomUnit().getAtomCount(atomUnit);
        }

        private int getDirectAtomCount() {
            if (myAtomCount==-1) {
                myAtomCount = 0;
                for (Date leftDate = TimeUnitFunctionOfDateImpl.this.myDirectFrameable.jumpLeft(myRightDate);
                     leftDate.compareTo(myLeftDate)>=0; myAtomCount++) {

                    leftDate = TimeUnitFunctionOfDateImpl.this.myDirectFrameable.jumpLeft(leftDate);
                }
            }
            return myAtomCount;
        }

        public TimeUnit getDirectAtomUnit() {
            return TimeUnitFunctionOfDateImpl.this.getDirectAtomUnit();
        }

		public Date adjustRight(Date baseDate) {
			return TimeUnitFunctionOfDateImpl.this.adjustRight(baseDate);
		}
		public Date adjustLeft(Date baseDate) {
			return TimeUnitFunctionOfDateImpl.this.adjustLeft(baseDate);
		}

		public Date jumpLeft(Date baseDate) {
			return TimeUnitFunctionOfDateImpl.this.jumpLeft(baseDate);
		}

        public void setTextFormatter(TextFormatter formatter) {
            TimeUnitFunctionOfDateImpl.this.setTextFormatter(formatter);
        }

        public String format(Date baseDate) {
            TextFormatter formatter = TimeUnitFunctionOfDateImpl.this.getTextFormatter();
            return formatter==null ? "" : formatter.format(this, baseDate);
        }
    }
}
