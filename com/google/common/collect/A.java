package com.google.common.collect;

import X1.h;
import java.util.NoSuchElementException;

abstract class a extends T {
    private final int f;
    private int g;

    protected a(int v, int v1) {
        h.k(v1, v);
        this.f = v;
        this.g = v1;
    }

    protected abstract Object a(int arg1);

    @Override
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override
    public final boolean hasPrevious() {
        return this.g > 0;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int v = this.g;
        this.g = v + 1;
        return this.a(v);
    }

    @Override
    public final int nextIndex() {
        return this.g;
    }

    @Override
    public final Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        int v = this.g - 1;
        this.g = v;
        return this.a(v);
    }

    @Override
    public final int previousIndex() {
        return this.g - 1;
    }
}

