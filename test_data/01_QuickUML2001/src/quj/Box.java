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
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;
import java.io.PrintStream;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JFrame;
import quj.Item;
import quj.Member;
import quj.Method;
import quj.MoveEvent;
import quj.MoveListener;
import quj.SelectionEvent;
import quj.SelectionListener;

class Box
extends JComponent
implements MouseListener,
MouseMotionListener {
    Item item;
    boolean moving = false;
    Point mouseDown;
    boolean selected = false;
    private transient Dimension offscreensize;
    private transient FontMetrics fm;
    private transient Graphics offgraphics;
    private transient Image offscreen;
    private transient Dimension lastKnownSize;
    private transient boolean needsRedrawVar;
    private transient Vector selectionListeners;
    private transient Vector moveListeners;

    public static void main(String[] arrstring) {
        JFrame jFrame = new JFrame("Testing");
        jFrame.setSize(500, 500);
        Box box = new Box();
        box.setItem(Item.buildItem());
        jFrame.getContentPane().add(box);
        jFrame.setVisible(true);
    }

    public Box() {
        this.setBackground(Color.red);
        this.needsRedraw();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public Dimension getSize() {
        if (this.lastKnownSize == null) {
            this.computeSize();
        }
        return this.lastKnownSize;
    }

    public Dimension getPreferredSize() {
        return this.getSize();
    }

    public void needsRedraw() {
        this.needsRedrawVar = true;
    }

    public void paint(Graphics graphics) {
        this.initSelf();
        this.drawIfNeeded();
        graphics.drawImage(this.offscreen, 0, 0, null);
    }

    public void update(Graphics graphics) {
        this.paint(graphics);
    }

    String getTitleString() {
        return this.item.getName();
    }

    void setItem(Item item) {
        this.item = item;
        this.needsRedraw();
    }

    Item getItem() {
        return this.item;
    }

    String[] getMemberStrings() {
        Vector vector = this.item.getMembers();
        String[] arrstring = new String[vector.size()];
        int n = 0;
        while (n < vector.size()) {
            StringBuffer stringBuffer = new StringBuffer();
            Member member = (Member)vector.elementAt(n);
            stringBuffer.append(this.getUMLProtectionLevelString(member.getProtection().trim().toLowerCase()));
            String string = member.getName().trim();
            stringBuffer.append(string + ": ");
            string = member.getType().trim();
            stringBuffer.append(string);
            arrstring[n] = stringBuffer.toString();
            ++n;
        }
        return arrstring;
    }

    String[] getMethodStrings() {
        Vector vector = this.item.getMethods();
        String[] arrstring = new String[vector.size()];
        int n = 0;
        while (n < vector.size()) {
            StringBuffer stringBuffer = new StringBuffer();
            Method method = (Method)vector.elementAt(n);
            stringBuffer.append(this.getUMLProtectionLevelString(method.getProtection().trim().toLowerCase()));
            String string = method.getName().trim();
            stringBuffer.append(string + "(");
            Vector vector2 = method.getArgumentNames();
            int n2 = 0;
            while (n2 < vector2.size()) {
                String string2 = (String)vector2.elementAt(n2);
                String string3 = method.getArgument(string2);
                stringBuffer.append(string2 + ": " + string3);
                if (n2 != vector2.size() - 1) {
                    stringBuffer.append(", ");
                }
                ++n2;
            }
            stringBuffer.append(")");
            string = method.getType().trim();
            stringBuffer.append(": " + string);
            arrstring[n] = stringBuffer.toString();
            ++n;
        }
        return arrstring;
    }

    private FontMetrics getFM() {
        if (this.fm == null) {
            this.fm = this.getFontMetrics(this.getFont());
        }
        return this.fm;
    }

    private String getUMLProtectionLevelString(String string) {
        if (string.equals("private")) {
            return "-";
        }
        if (string.equals("")) {
            return ">";
        }
        if (string.equals("protected")) {
            return "#";
        }
        if (string.equals("public")) {
            return "+";
        }
        System.out.println("You have a typo. '" + string + "' is not a valid protection level.");
        return "";
    }

    private void computeSize() {
        int n;
        int n2 = 0;
        int n3 = 1;
        n2 = this.getFM().stringWidth(this.getTitleString());
        String[] arrstring = this.getMemberStrings();
        int n4 = 0;
        while (n4 < arrstring.length) {
            n = this.getFM().stringWidth(arrstring[n4]);
            if (n > n2) {
                n2 = n;
            }
            ++n3;
            ++n4;
        }
        arrstring = this.getMethodStrings();
        int n5 = 0;
        while (n5 < arrstring.length) {
            n = this.getFM().stringWidth(arrstring[n5]);
            if (n > n2) {
                n2 = n;
            }
            ++n3;
            ++n5;
        }
        int n6 = 18 + (this.getFM().getHeight() + 2) * n3;
        this.lastKnownSize = new Dimension(n2 += 8, n6);
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

    private void drawIfNeeded() {
        if (this.needsRedrawVar) {
            this.computeSize();
            Dimension dimension = this.getSize();
            this.offgraphics.setColor(Color.white);
            this.offgraphics.fillRect(0, 0, dimension.width, dimension.height);
            if (this.selected) {
                this.offgraphics.setColor(Color.red);
            } else {
                this.offgraphics.setColor(Color.black);
            }
            this.offgraphics.drawRect(0, 0, dimension.width - 1, dimension.height - 1);
            this.offgraphics.drawRect(1, 1, dimension.width - 3, dimension.height - 3);
            this.offgraphics.setColor(Color.black);
            String string = this.getTitleString();
            int n = this.getFM().stringWidth(string);
            int n2 = dimension.width / 2 - n / 2;
            int n3 = this.getFM().getHeight() + 4;
            this.offgraphics.drawString(string, n2, n3);
            this.offgraphics.drawLine(0, n3 + 4, dimension.width, n3 + 4);
            int n4 = n3 + 6 + this.getFM().getHeight();
            String[] arrstring = this.getMemberStrings();
            int n5 = 0;
            while (n5 < arrstring.length) {
                this.offgraphics.drawString(arrstring[n5], 4, n4);
                if (n5 != arrstring.length - 1) {
                    n4 += this.getFM().getHeight() + 2;
                }
                ++n5;
            }
            this.offgraphics.drawLine(0, n4 + 2, dimension.width, n4 + 2);
            n4 += 4 + this.getFM().getHeight();
            arrstring = this.getMethodStrings();
            int n6 = 0;
            while (n6 < arrstring.length) {
                this.offgraphics.drawString(arrstring[n6], 4, n4);
                if (n6 != arrstring.length - 1) {
                    n4 += this.getFM().getHeight() + 2;
                }
                ++n6;
            }
        }
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        this.fireSelectionEvent();
    }

    public void mouseEntered(MouseEvent mouseEvent) {
    }

    public void mouseExited(MouseEvent mouseEvent) {
    }

    public void mousePressed(MouseEvent mouseEvent) {
        this.mouseDown = mouseEvent.getPoint();
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        if (this.moving && this.mouseDown != null) {
            this.moving = false;
            Point point = mouseEvent.getPoint();
            int n = point.x - this.mouseDown.x;
            int n2 = point.y - this.mouseDown.y;
            this.fireMoveEvent(n, n2);
        }
    }

    public void mouseDragged(MouseEvent mouseEvent) {
        this.moving = true;
    }

    public void mouseMoved(MouseEvent mouseEvent) {
    }

    private void fireSelectionEvent() {
        if (this.selectionListeners != null) {
            int n = 0;
            while (n < this.selectionListeners.size()) {
                ((SelectionListener)this.selectionListeners.elementAt(n)).selectionEvent(new SelectionEvent(this, this.item));
                ++n;
            }
        }
    }

    void addSelectionListener(SelectionListener selectionListener) {
        if (this.selectionListeners == null) {
            this.selectionListeners = new Vector();
        }
        if (!this.selectionListeners.contains(selectionListener)) {
            this.selectionListeners.addElement(selectionListener);
        }
    }

    private void fireMoveEvent(int n, int n2) {
        if (this.moveListeners != null) {
            int n3 = 0;
            while (n3 < this.moveListeners.size()) {
                ((MoveListener)this.moveListeners.elementAt(n3)).moveEvent(new MoveEvent(this, this, n, n2));
                ++n3;
            }
        }
    }

    void addMoveListener(MoveListener moveListener) {
        if (this.moveListeners == null) {
            this.moveListeners = new Vector();
        }
        if (!this.moveListeners.contains(moveListener)) {
            this.moveListeners.addElement(moveListener);
        }
    }

    void setSelected(boolean bl) {
        this.needsRedraw();
        this.selected = bl;
        this.repaint();
    }
}

