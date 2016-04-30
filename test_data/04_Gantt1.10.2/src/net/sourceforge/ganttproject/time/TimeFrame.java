package net.sourceforge.ganttproject.time;

import net.sourceforge.ganttproject.time.TimeUnit;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * @author bard
 * Date: 01.02.2004
 */
public interface TimeFrame {
    Date getStartDate();
    Date getFinishDate();
    TimeUnit getTopUnit();
    TimeUnit getBottomUnit();
    int getUnitCount(TimeUnit unitLine);
    String getUnitText(TimeUnit unitLine, int position);
    Date getUnitStart(TimeUnit unitLine, int position);
    
}
