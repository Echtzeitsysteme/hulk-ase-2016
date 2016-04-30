/*
 * Copyright 2004 The Apache Software Foundation.
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

package org.apache.xerces.impl.dv.xs;

import org.apache.xerces.impl.dv.InvalidDatatypeValueException;
import org.apache.xerces.impl.dv.ValidationContext;

/**
 * Represent the schema type "anyAtomicType"
 * 
 * @xerces.experimental
 *
 * @author Ankit Pasricha, IBM
 * 
 * @version $Id: AnyAtomicDV.java,v 1.2 2004/10/06 14:56:47 mrglavas Exp $
 */
class AnyAtomicDV extends TypeValidator {
    
    public short getAllowedFacets() {
        return 0;
    }
    
    public Object getActualValue(String content, ValidationContext context) throws InvalidDatatypeValueException {
        return content;
    }
    
} // class AnyAtomicDV
