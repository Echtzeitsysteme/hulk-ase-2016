/*
LICENSE:
                                                                 
   This program is free software; you can redistribute it and/or modify  
   it under the terms of the GNU General Public License as published by  
   the Free Software Foundation; either version 2 of the License, or     
   (at your option) any later version.                                   
                                                                         
   Copyright (C) 2004, GanttProject Development Team
 */
package net.sourceforge.ganttproject.export;

import net.sourceforge.ganttproject.GanttExportSettings;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * @author bard
 */
public class GanttChartExportData {
    final File myOutputFile;
    final GanttExportSettings myExportSettings;
    final String myImageFormat;

    public GanttChartExportData(File myOutputFile, GanttExportSettings myExportSettings, String myImageFormat) {
        this.myOutputFile = myOutputFile;
        this.myExportSettings = myExportSettings;
        this.myImageFormat = myImageFormat;
    }
}
