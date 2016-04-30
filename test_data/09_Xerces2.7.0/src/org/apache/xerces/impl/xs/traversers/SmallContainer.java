package org.apache.xerces.impl.xs.traversers;

class SmallContainer extends Container {
    String[] keys;
    SmallContainer(int size) {
        keys = new String[size];
        values = new OneAttr[size];
    }
    void put(String key, OneAttr value) {
        keys[pos] = key;
        values[pos++] = value;
    }
    OneAttr get(String key) {
        for (int i = 0; i < pos; i++) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }
}