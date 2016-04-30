package net.sourceforge.ganttproject.task.dependency;

import net.sourceforge.ganttproject.task.Task;

public class SearchKey implements Comparable {
    static final int DEPENDANT = 1;
    static final int DEPENDEE = 2;

    final int myFirstTaskID;
    final int myType;
    final int mySecondTaskID;

    public SearchKey(int type, TaskDependencyImpl taskDependency) {
        myType = type;
        Task firstTask, secondTask;
        switch(type) {
            case DEPENDANT:
                {
                    firstTask = taskDependency.getDependant();
                    secondTask = taskDependency.getDependee();
                    break;
                }
            case DEPENDEE:
                {
                    firstTask = taskDependency.getDependee();
                    secondTask = taskDependency.getDependant();
                    break;
                }
                default: {
                    throw new RuntimeException("Invalid type="+type);
                }
        }
        myFirstTaskID = firstTask.getTaskID();
        mySecondTaskID = secondTask.getTaskID();
    }

    protected SearchKey(int type, int firstTaskID, int secondTaskID) {
        myType = type;
        myFirstTaskID = firstTaskID;
        mySecondTaskID = secondTaskID;
    }
    public int compareTo(Object o) {
        SearchKey rvalue = (SearchKey) o;
        int result = myFirstTaskID - rvalue.myFirstTaskID;
        if (result==0) {
            result = myType - rvalue.myType;
        }
        if (result==0) {
            result = mySecondTaskID - rvalue.mySecondTaskID;
        }
        return result;
    }

    public boolean equals(Object obj) {
        SearchKey rvalue = (SearchKey) obj;
        return myFirstTaskID==rvalue.myFirstTaskID && myType==rvalue.myType && mySecondTaskID==rvalue.mySecondTaskID;
    }

    public int hashCode() {
        return 7*myFirstTaskID + 11*myType + 13*mySecondTaskID;
    }
}
