package org.apache.xerces.impl.xs.traversers;

import java.util.Hashtable;

class LargeContainer extends Container {
    Hashtable items;
    LargeContainer(int size) {
        items = new Hashtable(size*2+1);
        values = new OneAttr[size];
    }
    void put(String key, OneAttr value) {
        items.put(key, value);
        values[pos++] = value;
    }
    OneAttr get(String key) {
        OneAttr ret = (OneAttr)items.get(key);
        return ret;
    }
}