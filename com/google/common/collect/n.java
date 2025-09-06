package com.google.common.collect;

import X1.h;
import java.util.Iterator;

final class N extends q {
    final transient Object h;

    N(Object object0) {
        this.h = h.i(object0);
    }

    @Override  // com.google.common.collect.m
    int a(Object[] arr_object, int v) {
        arr_object[v] = this.h;
        return v + 1;
    }

    @Override  // com.google.common.collect.m
    public boolean contains(Object object0) {
        return this.h.equals(object0);
    }

    @Override  // com.google.common.collect.m
    boolean h() {
        return false;
    }

    @Override  // com.google.common.collect.q
    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override  // com.google.common.collect.q
    public S i() {
        return v.c(this.h);
    }

    @Override
    public Iterator iterator() {
        return this.i();
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public String toString() {
        return '[' + this.h.toString() + ']';
    }
}

