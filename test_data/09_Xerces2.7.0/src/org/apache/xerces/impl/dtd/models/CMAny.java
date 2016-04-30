/*
 * Copyright 2000-2002,2004,2005 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.xerces.impl.dtd.models;


/**
 * Content model any node.
 * 
 * @xerces.internal
 *
 * @version $Id: CMAny.java,v 1.6 2005/03/08 05:40:15 mrglavas Exp $
 */
public class CMAny
    extends CMNode {

    //
    // Data
    //

    /** 
     * The any content model type. This value is one of the following:
     * XMLContentSpec.CONTENTSPECNODE_ANY, 
     * XMLContentSpec.CONTENTSPECNODE_ANY_OTHER,
     * XMLContentSpec.CONTENTSPECNODE_ANY_LOCAL.
     */
    private int fType;

    /**
     * URI of the any content model. This value is set if the type is
     * of the following:
     * XMLContentSpec.CONTENTSPECNODE_ANY, 
     * XMLContentSpec.CONTENTSPECNODE_ANY_OTHER.
     */
    private String fURI;

    /**
     * Part of the algorithm to convert a regex directly to a DFA
     * numbers each leaf sequentially. If its -1, that means its an
     * epsilon node. Zero and greater are non-epsilon positions.
     */
    private int fPosition = -1;

    //
    // Constructors
    //

    /** Constructs a content model any. */
    public CMAny(int type, String uri, int position)  {
        super(type);

        // Store the information
        fType = type;
        fURI = uri;
        fPosition = position;
    }

    //
    // Package methods
    //

    final int getType() {
        return fType;
    }

    final String getURI() {
        return fURI;
    }

    final int getPosition()
    {
        return fPosition;
    }

    final void setPosition(int newPosition)
    {
        fPosition = newPosition;
    }

    //
    // CMNode methods
    //

    // package

    public boolean isNullable() 
    {
        // Leaf nodes are never nullable unless its an epsilon node
        return (fPosition == -1);
    }

    public String toString()
    {
        StringBuffer strRet = new StringBuffer();
        strRet.append("(");
        strRet.append("##any:uri=");
        strRet.append(fURI);
        strRet.append(')');
        if (fPosition >= 0)
        {
            strRet.append
            (
                " (Pos:"
                + Integer.toString(fPosition)
                + ")"
            );
        }
        return strRet.toString();
    }

    // protected

    protected void calcFirstPos(CMStateSet toSet) 
    {
        // If we are an epsilon node, then the first pos is an empty set
        if (fPosition == -1)
            toSet.zeroBits();

        // Otherwise, its just the one bit of our position
        else
            toSet.setBit(fPosition);
    }

    protected void calcLastPos(CMStateSet toSet) 
    {
        // If we are an epsilon node, then the last pos is an empty set
        if (fPosition == -1)
            toSet.zeroBits();

        // Otherwise, its just the one bit of our position
        else
            toSet.setBit(fPosition);
    }

} // class CMAny

