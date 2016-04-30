package org.apache.xerces.impl.xs.traversers;

class OneElement {
    // the list of attributes that can appear in one element
    public Container attrList;
    // does this element allow attributes from non-schema namespace
    public boolean allowNonSchemaAttr;

    public OneElement (Container attrList) {
        this(attrList, true);
    }

    public OneElement (Container attrList, boolean allowNonSchemaAttr) {
        this.attrList = attrList;
        this.allowNonSchemaAttr = allowNonSchemaAttr;
    }
}