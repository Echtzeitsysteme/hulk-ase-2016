/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.JComponent;
import quj.Box;
import quj.Item;
import quj.MoveEvent;
import quj.MoveListener;
import quj.SelectionListener;
import quj.UMLEditor;
import quj.UmlLayout;

class BoxPanel
extends JComponent
implements MoveListener,
Printable {
    private transient UmlLayout myLayout;
    private transient Dimension offscreensize;
    private transient FontMetrics fm;
    private transient Graphics offgraphics;
    private transient Image offscreen;
    private Box selectedBox;
    private UMLEditor editor;

    BoxPanel(UMLEditor uMLEditor) {
        this.editor = uMLEditor;
        this.myLayout = new UmlLayout();
        this.setLayout(this.myLayout);
        this.setItems(this.editor.getItems());
    }

    public int print(Graphics graphics, PageFormat pageFormat, int n) throws PrinterException {
        System.out.println("printing is screwed up");
        Dimension dimension = this.getSize();
        Dimension dimension2 = new Dimension((int)pageFormat.getPaper().getImageableWidth(), (int)pageFormat.getPaper().getImageableHeight());
        int n2 = (int)Math.ceil(dimension.width / dimension2.width);
        int n3 = (int)Math.ceil(dimension.height / dimension2.height);
        int n4 = n2 * n3 - 1;
        if (n > n4) {
            return 1;
        }
        int n5 = n / n2;
        int n6 = n % n2;
        Graphics2D graphics2D = (Graphics2D)graphics;
        int n7 = n5 * dimension2.width;
        int n8 = n6 * dimension2.height;
        graphics2D.drawImage(this.offscreen, n7, n8, dimension2.width, dimension2.height, null);
        return 0;
    }

    public void paintComponent(Graphics graphics) {
        this.initSelf();
        this.offgraphics.setColor(Color.white);
        this.offgraphics.setClip(0, 0, this.getSize().width, this.getSize().height);
        this.offgraphics.fillRect(0, 0, this.getSize().width, this.getSize().height);
        this.offgraphics.setColor(Color.black);
        Hashtable hashtable = this.myLayout.getPoints();
        Enumeration enumeration = hashtable.keys();
        while (enumeration.hasMoreElements()) {
            Point point = (Point)enumeration.nextElement();
            Point point2 = (Point)hashtable.get(point);
            this.offgraphics.drawLine(point.x, point.y, point2.x, point2.y);
        }
        graphics.drawImage(this.offscreen, 0, 0, null);
    }

    public Dimension getSize() {
        return this.getPreferredSize();
    }

    public Dimension getPreferredSize() {
        Component[] arrcomponent = this.getComponents();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (n3 < arrcomponent.length) {
            if (arrcomponent[n3] instanceof Box) {
                Box box = (Box)arrcomponent[n3];
                int n4 = box.getLocation().x + box.getSize().width;
                int n5 = box.getLocation().y + box.getSize().height;
                if (n4 > n) {
                    n = n4;
                }
                if (n5 > n2) {
                    n2 = n5;
                }
            }
            ++n3;
        }
        if (n < 100 || n2 < 100) {
            return new Dimension(100, 100);
        }
        return new Dimension(n + 4, n2 + 4);
    }

    public void moveEvent(MoveEvent moveEvent) {
        Box box = moveEvent.getMoved();
        Point point = box.getLocation();
        int n = point.x + moveEvent.getX();
        int n2 = point.y + moveEvent.getY();
        box.setLocation(new Point(n, n2));
        this.setSize(this.getPreferredSize());
        this.getParent().validate();
        this.doLayout();
        this.repaint();
        this.getParent().doLayout();
    }

    private void initSelf() {
        if (this.offscreen == null || this.offscreensize == null || this.offscreensize.width != this.getSize().width || this.offscreensize.height != this.getSize().height) {
            Dimension dimension;
            this.offscreensize = dimension = this.getSize();
            this.offscreen = this.createImage(dimension.width, dimension.height);
            this.offgraphics = this.offscreen.getGraphics();
            this.offgraphics.setFont(this.getFont());
            this.offgraphics.setColor(this.getBackground());
            this.offgraphics.fillRect(0, 0, dimension.width, dimension.height);
        }
    }

    void setItems(Vector vector) {
        this.removeAll();
        int n = 0;
        while (n < vector.size()) {
            this.addItemPrivate((Item)vector.elementAt(n));
            ++n;
        }
        this.doLayout();
        this.repaint();
    }

    void savePositions() {
        Component[] arrcomponent = this.getComponents();
        int n = 0;
        while (n < arrcomponent.length) {
            if (arrcomponent[n] instanceof Box) {
                Box box = (Box)arrcomponent[n];
                Item item = box.getItem();
                item.setX(box.getLocation().x);
                item.setY(box.getLocation().y);
            }
            ++n;
        }
    }

    void setCurrent(Item item) {
        Component[] arrcomponent = this.getComponents();
        int n = 0;
        while (n < arrcomponent.length) {
            Box box;
            if (arrcomponent[n] instanceof Box && (box = (Box)arrcomponent[n]).getItem() == item) {
                if (this.getSelectedBox() != null) {
                    this.getSelectedBox().setSelected(false);
                }
                box.setSelected(true);
                this.setSelectedBox(box);
                return;
            }
            ++n;
        }
    }

    Box getSelectedBox() {
        return this.selectedBox;
    }

    void setSelectedBox(Box box) {
        this.selectedBox = box;
    }

    void addItem(Item item) {
        this.addItemPrivate(item);
        this.doLayout();
        this.repaint();
    }

    private void addItemPrivate(Item item) {
        Box box = new Box();
        box.setLocation(new Point(item.getX(), item.getY()));
        box.setItem(item);
        box.addMoveListener(this);
        box.addSelectionListener(this.editor);
        box.needsRedraw();
        this.add(box);
    }

    void removeItem(Item item) {
        Component[] arrcomponent = this.getComponents();
        int n = 0;
        while (n < arrcomponent.length) {
            Box box;
            if (arrcomponent[n] instanceof Box && (box = (Box)arrcomponent[n]).getItem() == item) {
                this.remove(box);
                return;
            }
            ++n;
        }
    }
}

