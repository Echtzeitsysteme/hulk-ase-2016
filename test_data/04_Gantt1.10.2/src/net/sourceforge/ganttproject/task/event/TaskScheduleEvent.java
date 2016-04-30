package net.sourceforge.ganttproject.task.event;

import net.sourceforge.ganttproject.GanttCalendar;
import net.sourceforge.ganttproject.task.Task;

import java.util.EventObject;

/**
 * Created by IntelliJ IDEA.
 * User: bard
 */
public class TaskScheduleEvent extends EventObject {
    private final GanttCalendar myOldStartDate;
    private final GanttCalendar myOldFinishDate;
    private final GanttCalendar myNewStartDate;
    private final GanttCalendar myNewFinishDate;

    public TaskScheduleEvent(Task source, GanttCalendar oldStartDate, GanttCalendar oldFinishDate, GanttCalendar newStartDate, GanttCalendar newFinishDate) {
        super(source);
        myOldStartDate = oldStartDate;
        myOldFinishDate = oldFinishDate;
        myNewStartDate = newStartDate;
        myNewFinishDate = newFinishDate;
    }

    public GanttCalendar getOldStartDate() {
        return myOldStartDate;
    }

    public GanttCalendar getOldFinishDate() {
        return myOldFinishDate;
    }

    public GanttCalendar getNewStartDate() {
        return myNewStartDate;
    }

    public GanttCalendar getNewFinishDate() {
        return myNewFinishDate;
    }
        
}
