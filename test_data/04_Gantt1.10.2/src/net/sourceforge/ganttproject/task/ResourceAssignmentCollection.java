package net.sourceforge.ganttproject.task;

import net.sourceforge.ganttproject.resource.ProjectResource;

/**
 * @author bard
 */
public interface ResourceAssignmentCollection extends MutableResourceAssignmentCollection {
    ResourceAssignment[] getAssignments();
    ResourceAssignment getAssignment(ProjectResource resource);
    ResourceAssignmentMutator createMutator();    
}

interface MutableResourceAssignmentCollection {
    ResourceAssignment addAssignment(ProjectResource resource);
    void deleteAssignment(ProjectResource resource);
}
