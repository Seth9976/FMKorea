package com.google.common.collect;

import X1.h;

abstract class f {
    static void a(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException("null key in entry: null=" + object1);
        }
        if(object1 == null) {
            throw new NullPointerException("null value in entry: " + object0 + "=null");
        }
    }

    static int b(int v, String s) {
        if(v < 0) {
            throw new IllegalArgumentException(s + " cannot be negative but was: " + v);
        }
        return v;
    }

    static void c(boolean z) {
        h.n(z, "no calls to next() since the last call to remove()");
    }
}

