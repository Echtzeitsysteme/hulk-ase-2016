/*
 * Decompiled with CFR 0_114.
 */
package quj;

import java.io.Serializable;

class Member
implements Serializable {
    boolean isStaticVar;
    boolean isTransientVar;
    boolean isFinalVar;
    String protection;
    String type;
    String name;
    String defaultValue;

    Member() {
    }

    boolean isStatic() {
        return this.isStaticVar;
    }

    void setStatic(boolean bl) {
        this.isStaticVar = bl;
    }

    boolean isTransient() {
        return this.isTransientVar;
    }

    void setTransient(boolean bl) {
        this.isTransientVar = bl;
    }

    boolean isFinal() {
        return this.isFinalVar;
    }

    void setFinal(boolean bl) {
        this.isFinalVar = bl;
    }

    void setProtection(String string) {
        this.protection = string;
    }

    String getProtection() {
        if (this.protection == null) {
            return "";
        }
        return this.protection;
    }

    void setType(String string) {
        this.type = string;
    }

    String getType() {
        if (this.type == null) {
            return "int";
        }
        return this.type;
    }

    void setName(String string) {
        this.name = string;
    }

    String getName() {
        if (this.name == null) {
            return "";
        }
        return this.name;
    }

    void setDefaultValue(String string) {
        this.defaultValue = string;
    }

    String getDefaultValue() {
        if (this.defaultValue == null) {
            return "";
        }
        return this.defaultValue;
    }

    public String toString() {
        return this.getType() + " " + this.getName();
    }
}

