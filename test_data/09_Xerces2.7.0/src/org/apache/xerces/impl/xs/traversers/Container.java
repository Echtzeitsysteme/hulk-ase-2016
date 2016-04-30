package org.apache.xerces.impl.xs.traversers;

abstract class Container {
    static final int THRESHOLD = 5;
    static Container getContainer(int size) {
        if (size > THRESHOLD)
            return new LargeContainer(size);
        else
            return new SmallContainer(size);
    }
    abstract void put(String key, OneAttr value);
    abstract OneAttr get(String key);

    OneAttr[] values;
    int pos = 0;
}