/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import quj.Member;

class Method
extends Member
implements Serializable {
    boolean isConstructorVar;
    Vector exceptions;
    Hashtable arguments;
    boolean isAbstractVar;
    String definition;

    Method() {
    }

    void setConstructor(boolean bl) {
        this.isConstructorVar = bl;
    }

    boolean isConstructor() {
        return this.isConstructorVar;
    }

    void setAbstract(boolean bl) {
        this.isAbstractVar = bl;
    }

    boolean isAbstract() {
        return this.isAbstractVar;
    }

    Vector getExceptions() {
        if (this.exceptions == null) {
            this.exceptions = new Vector();
        }
        return this.exceptions;
    }

    void clearArguments() {
        if (this.arguments != null) {
            this.arguments.clear();
        }
    }

    void setArgument(String string, String string2) {
        if (this.arguments == null) {
            this.arguments = new Hashtable();
        }
        this.arguments.put(string, string2);
    }

    void removeArgument(String string) {
        if (this.arguments == null) {
            return;
        }
        this.arguments.remove(string);
    }

    String getArgument(String string) {
        return (String)this.arguments.get(string);
    }

    Vector getArgumentNames() {
        if (this.arguments == null) {
            return new Vector();
        }
        Enumeration enumeration = this.arguments.keys();
        Vector vector = new Vector();
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
        return vector;
    }

    String getType() {
        if (this.type == null) {
            if (this.isConstructor()) {
                return this.getName();
            }
            return "void";
        }
        return this.type;
    }

    String getDefinition() {
        if (this.definition == null) {
            return "";
        }
        return this.definition;
    }

    void setDefinition(String string) {
        this.definition = string;
    }
}

