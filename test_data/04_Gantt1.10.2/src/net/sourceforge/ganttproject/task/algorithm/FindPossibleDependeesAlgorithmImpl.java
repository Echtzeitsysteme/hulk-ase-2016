package net.sourceforge.ganttproject.task.algorithm;

import net.sourceforge.ganttproject.task.Task;
import net.sourceforge.ganttproject.task.TaskContainmentHierarchyFacade;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: bard
 */
public abstract class FindPossibleDependeesAlgorithmImpl implements FindPossibleDependeesAlgorithm {
    private TaskContainmentHierarchyFacade myContainmentFacade;

    public FindPossibleDependeesAlgorithmImpl() {
    }

    public Task[] run(Task dependant) {
        myContainmentFacade = createContainmentFacade();
        ArrayList result = new ArrayList();
        Task root = myContainmentFacade.getRoot();
        Task[] nestedTasks = myContainmentFacade.getNestedTasks(root);
        processTask(nestedTasks, dependant, result);
        return (Task[]) result.toArray(new Task[0]);
    }

    protected abstract TaskContainmentHierarchyFacade createContainmentFacade();

    private void processTask(Task[] taskList, Task dependant, ArrayList result) {
        for (int i=0; i<taskList.length; i++) {
            Task next = taskList[i];
            if (!next.equals(dependant)) {
                Task[] nested = myContainmentFacade.getNestedTasks(next);
                //if (nested.length==0) {
                    result.add(next);
                //}
                //else {
                    processTask(nested, dependant, result);
                //}
            }
        }
    }
}
