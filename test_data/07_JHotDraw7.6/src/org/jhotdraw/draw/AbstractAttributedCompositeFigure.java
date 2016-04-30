/*
 * @(#)AbstractAttributedCompositeFigure.java  1.0  July 9, 2006
 *
 * Copyright (c) 1996-2006 by the original authors of JHotDraw
 * and all its contributors ("JHotDraw.org")
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * JHotDraw.org ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * JHotDraw.org.
 */

package org.jhotdraw.draw;

import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import java.io.*;
import static org.jhotdraw.draw.AttributeKeys.*;
import org.jhotdraw.geom.*;
import org.jhotdraw.xml.DOMInput;
import org.jhotdraw.xml.DOMOutput;
/**
 * An AbstractAttributedCompositeFigure is a CompositeFigure which has
 * its own attribute set. 
 *
 * @author Werner Randelshofer
 * @version 1.0 July 9, 2006 Created.
 */
public abstract class AbstractAttributedCompositeFigure extends AbstractCompositeFigure {
    private HashMap<AttributeKey, Object> attributes = new HashMap<AttributeKey,Object>();
    /**
     * Forbidden attributes can't be set by the setAttribute() operation.
     * They can only be changed by basicSetAttribute().
     */
    private HashSet<AttributeKey> forbiddenAttributes;
    
    /** Creates a new instance. */
    public AbstractAttributedCompositeFigure() {
    }
    
    /**
     * Sets an attribute of the figure.
     * AttributeKey name and semantics are defined by the class implementing
     * the figure interface.
     */
    public void setAttribute(AttributeKey key, Object newValue) {
        if (forbiddenAttributes == null
                || ! forbiddenAttributes.contains(key)) {
            
            Object oldValue = attributes.get(key);
            if (! attributes.containsKey(key)
            || oldValue != newValue
                    || oldValue != null && newValue != null && ! oldValue.equals(newValue)) {
                willChange();
//System.out.println("AttributedFigure.setAttribute "+key+"="+newValue);
                basicSetAttribute(key, newValue);
                fireAttributeChanged(key, oldValue, newValue);
                fireUndoableEditHappened(new AttributeChangeEdit(this, key, oldValue, newValue));
                changed();
            }
        }
    }
    
    public void setAttributeEnabled(AttributeKey key, boolean b) {
        if (forbiddenAttributes == null) {
            forbiddenAttributes = new HashSet<AttributeKey>();
        }
        if (b) {
            forbiddenAttributes.remove(key);
        } else {
            forbiddenAttributes.add(key);
        }
    }
    public boolean isAttributeEnabled(AttributeKey key) {
        return forbiddenAttributes == null || ! forbiddenAttributes.contains(key);
    }
    
    public void setAttributes(HashMap<AttributeKey, Object> map) {
        for (Map.Entry<AttributeKey, Object> entry : map.entrySet()) {
            setAttribute(entry.getKey(), entry.getValue());
        }
    }
    public Map<AttributeKey, Object> getAttributes() {
        return new HashMap<AttributeKey,Object>(attributes);
    }
    /**
     * Sets an attribute of the figure.
     * AttributeKey name and semantics are defined by the class implementing
     * the figure interface.
     */
    public void basicSetAttribute(AttributeKey key, Object newValue) {
        if (forbiddenAttributes == null
                || ! forbiddenAttributes.contains(key)) {
            attributes.put(key, newValue);
        }
        basicSetAttributeOnChildren(key, newValue);
    }

    
    protected void basicSetAttributeOnChildren(AttributeKey key, Object newValue) {
        for (Figure child : getChildren()) {
            child.basicSetAttribute(key, newValue);
        }
    }
    
    /**
     * Gets an attribute from the figure.
     */
    public Object getAttribute(AttributeKey key) {
        return hasAttribute(key) ? attributes.get(key) : key.getDefaultValue();
    }
    
    
    public void drawFigure(Graphics2D g) {
        drawChildren(g);
        if (AttributeKeys.FILL_COLOR.get(this) != null) {
            g.setColor(AttributeKeys.FILL_COLOR.get(this));
            drawFill(g);
        }
        if (STROKE_COLOR.get(this) != null && STROKE_WIDTH.get(this) > 0d) {
            g.setStroke(AttributeKeys.getStroke(this));
            g.setColor(STROKE_COLOR.get(this));
            
            drawStroke(g);
        }
        if (TEXT_COLOR.get(this) != null) {
            if (TEXT_SHADOW_COLOR.get(this) != null &&
                    TEXT_SHADOW_OFFSET.get(this) != null) {
                Dimension2DDouble d = TEXT_SHADOW_OFFSET.get(this);
                g.translate(d.width, d.height);
                g.setColor(TEXT_SHADOW_COLOR.get(this));
                drawText(g);
                g.translate(-d.width,-d.height);
            }
            g.setColor(TEXT_COLOR.get(this));
            drawText(g);
        }
        if (isConnectorsVisible()) {
            drawConnectors(g);
        }
    }
    
    protected void drawChildren(Graphics2D g) {
        for (Figure child : getChildren()) {
            child.draw(g);
        }
    }

    protected void drawConnectors(Graphics2D g) {
    }
    
    
    public Stroke getStroke() {
        return AttributeKeys.getStroke(this);
    }
    
    public double getStrokeMiterLimitFactor() {
        Number value = (Number) getAttribute(AttributeKeys.STROKE_MITER_LIMIT_FACTOR);
        return (value != null) ? value.doubleValue() : 10f;
    }
    
    
    public Rectangle2D.Double getFigureDrawBounds() {
        double width = AttributeKeys.getStrokeTotalWidth(this) / 2d;
        if (STROKE_JOIN.get(this) == BasicStroke.JOIN_MITER) {
            width *= STROKE_MITER_LIMIT_FACTOR.get(this);
        }
        width++;
        Rectangle2D.Double r = getBounds();
        Geom.grow(r, width, width);
        return r;
    }
    
    /**
     * This method is called by method draw() to draw the fill
     * area of the figure. AttributedFigure configures the Graphics2D
     * object with the FILL_COLOR attribute before calling this method.
     * If the FILL_COLOR attribute is null, this method is not called.
     */
    protected abstract void drawFill(java.awt.Graphics2D g);
    /**
     * This method is called by method draw() to draw the lines of the figure
     *. AttributedFigure configures the Graphics2D object with
     * the STROKE_COLOR attribute before calling this method.
     * If the STROKE_COLOR attribute is null, this method is not called.
     */
    /**
     * This method is called by method draw() to draw the text of the figure
     *. AttributedFigure configures the Graphics2D object with
     * the TEXT_COLOR attribute before calling this method.
     * If the TEXT_COLOR attribute is null, this method is not called.
     */
    protected abstract void drawStroke(java.awt.Graphics2D g);
    protected void drawText(java.awt.Graphics2D g) {
    }
    
    public AbstractAttributedCompositeFigure clone() {
        AbstractAttributedCompositeFigure that = (AbstractAttributedCompositeFigure) super.clone();
        that.attributes = new HashMap<AttributeKey,Object>(this.attributes);
        if (this.forbiddenAttributes != null) {
            that.forbiddenAttributes = new HashSet<AttributeKey>(this.forbiddenAttributes);
        }
        return that;
    }
    
    protected void writeAttributes(DOMOutput out) throws IOException {
        Figure prototype = (Figure) out.getPrototype();
        
        boolean isElementOpen = false;
        for (Map.Entry<AttributeKey, Object> entry : attributes.entrySet()) {
            AttributeKey key = entry.getKey();
            if (forbiddenAttributes == null
                    || ! forbiddenAttributes.contains(key)) {
                Object prototypeValue = key.get(prototype);
                Object attributeValue = key.get(this);
                if (prototypeValue != attributeValue ||
                        (prototypeValue != null && attributeValue != null &&
                        ! prototypeValue.equals(attributeValue))) {
                    if (! isElementOpen) {
                        out.openElement("a");
                        isElementOpen = true;
                    }
                    out.openElement(key.getKey());
                    out.writeObject(entry.getValue());
                    out.closeElement();
                }
            }
        }
        if (isElementOpen) {
            out.closeElement();
        }
    }
    protected void readAttributes(DOMInput in) throws IOException {
        if (in.getElementCount("a") > 0) {
            in.openElement("a");
            for (int i=in.getElementCount() - 1; i >= 0; i-- ) {
                in.openElement(i);
                String name = in.getTagName();
                Object value = in.readObject();
                AttributeKey key = getAttributeKey(name);
                if (key != null && key.isAssignable(value)) {
                    if (forbiddenAttributes == null
                            || ! forbiddenAttributes.contains(key)) {
                        setAttribute(key, value);
                    }
                }
                in.closeElement();
            }
            in.closeElement();
        }
    }
    
    protected AttributeKey getAttributeKey(String name) {
        return AttributeKeys.supportedAttributeMap.get(name);
    }
    
    
    /**
     * Applies all attributes of this figure to that figure.
     */
    protected void applyAttributesTo(Figure that) {
        for (Map.Entry<AttributeKey, Object> entry : attributes.entrySet()) {
            that.setAttribute(entry.getKey(), entry.getValue());
        }
    }
    
    
    public void write(DOMOutput out) throws IOException {
        super.write(out);
        writeAttributes(out);
    }
    
    public void read(DOMInput in) throws IOException {
        super.read(in);
        readAttributes(in);
    }
    
    public void removeAttribute(AttributeKey key) {
        if (hasAttribute(key)) {
            Object oldValue = getAttribute(key);
            attributes.remove(key);
            fireAttributeChanged(key, oldValue, key.getDefaultValue());
        }
    }
    
    public boolean hasAttribute(AttributeKey key) {
        return attributes.containsKey(key);
    }
}
