/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Point;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import quj.Box;
import quj.Item;

class UmlLayout
implements LayoutManager {
    private Vector boxes = new Vector();
    private Hashtable points;

    public void addLayoutComponent(String string, Component component) {
    }

    public void layoutContainer(Container container) {
        Component[] arrcomponent = container.getComponents();
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        Hashtable<String, Point> hashtable2 = new Hashtable<String, Point>();
        int n = 0;
        while (n < arrcomponent.length) {
            if (arrcomponent[n] instanceof Box) {
                Box box = (Box)arrcomponent[n];
                Point point = box.getLocation();
                Dimension dimension = box.getPreferredSize();
                box.setBounds(point.x, point.y, dimension.width, dimension.height);
                if (!box.getItem().getSuperClass().equals("") && !box.getItem().getName().equals("")) {
                    hashtable.put(box.getItem().getName(), box.getItem().getSuperClass());
                }
                if (!box.getItem().getName().equals("")) {
                    hashtable2.put(box.getItem().getName(), this.getCenter(box));
                }
            }
            ++n;
        }
        this.points = new Hashtable();
        Enumeration enumeration = hashtable.keys();
        while (enumeration.hasMoreElements()) {
            try {
                String string = (String)enumeration.nextElement();
                String string2 = (String)hashtable.get(string);
                Point point = (Point)hashtable2.get(string);
                Point point2 = (Point)hashtable2.get(string2);
                this.points.put(point, point2);
                continue;
            }
            catch (NullPointerException var14_14) {
                // empty catch block
            }
        }
    }

    public Dimension minimumLayoutSize(Container container) {
        return new Dimension(800, 800);
    }

    public Dimension preferredLayoutSize(Container container) {
        return new Dimension(800, 800);
    }

    public void removeLayoutComponent(Component component) {
    }

    public Hashtable getPoints() {
        if (this.points == null) {
            return new Hashtable();
        }
        return this.points;
    }

    private Point getCenter(Box box) {
        Point point = box.getLocation();
        Dimension dimension = box.getSize();
        int n = (2 * point.x + dimension.width) / 2;
        int n2 = (2 * point.y + dimension.height) / 2;
        return new Point(n, n2);
    }
}

