package com.google.common.collect;

import java.util.Iterator;

public abstract class S implements Iterator {
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

