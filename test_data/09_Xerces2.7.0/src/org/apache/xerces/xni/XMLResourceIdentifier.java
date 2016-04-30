/*
 * Copyright 2000-2004 The Apache Software Foundation.
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

package org.apache.xerces.xni;

/**
 * <p> This represents the basic physical description of the location of any
 * XML resource (a Schema grammar, a DTD, a general entity etc.) </p>
 *
 * @author Neil Graham, IBM
 * @version $Id: XMLResourceIdentifier.java,v 1.5 2004/02/24 23:15:54 mrglavas Exp $
 */

public interface XMLResourceIdentifier {
    
    /** Sets the public identifier. */
    public void setPublicId(String publicId);

    /** Returns the public identifier. */
    public String getPublicId();
    
    /** Sets the expanded system identifier. */
    public void setExpandedSystemId(String systemId);
    
    /** Returns the expanded system identifier. */
    public String getExpandedSystemId();
    
    /** Sets the literal system identifier. */
    public void setLiteralSystemId(String systemId);
     
    /** Returns the literal system identifier. */
    public String getLiteralSystemId();
    
    /** Setsthe base URI against which the literal SystemId is to be 
        resolved.*/
    public void setBaseSystemId(String systemId); 
    
    /** <p> Returns the base URI against which the literal SystemId is to be 
        resolved. </p> */
    public String getBaseSystemId();

    /** Sets the namespace of the resource. */
    public void setNamespace(String namespace);
     
    /** Returns the namespace of the resource. */
    public String getNamespace();
    
} // XMLResourceIdentifier
