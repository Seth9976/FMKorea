package com.facebook.internal;

import com.facebook.FacebookRequestError.b;

public abstract class i {
    public static final int[] a;

    static {
        int[] arr_v = new int[b.values().length];
        i.a = arr_v;
        arr_v[b.g.ordinal()] = 1;
        arr_v[b.f.ordinal()] = 2;
        arr_v[b.h.ordinal()] = 3;
    }
}

