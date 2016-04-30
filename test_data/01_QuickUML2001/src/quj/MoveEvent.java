/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.util.EventObject;
import quj.Box;

class MoveEvent
extends EventObject {
    Box moved;
    int dx;
    int dy;

    public MoveEvent(Object object, Box box, int n, int n2) {
        super(object);
        this.moved = box;
        this.dx = n;
        this.dy = n2;
    }

    public Box getMoved() {
        return this.moved;
    }

    public int getX() {
        return this.dx;
    }

    public int getY() {
        return this.dy;
    }
}

