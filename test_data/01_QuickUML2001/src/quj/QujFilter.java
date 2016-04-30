/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.io.File;
import java.io.FilenameFilter;

class QujFilter
implements FilenameFilter {
    QujFilter() {
    }

    public boolean accept(File file, String string) {
        return string.endsWith(".quj");
    }
}

