/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.util.EventObject;
import quj.Item;

class SelectionEvent
extends EventObject {
    Item selected;

    public SelectionEvent(Object object, Item item) {
        super(object);
        this.selected = item;
    }

    public Item getSelected() {
        return this.selected;
    }
}

