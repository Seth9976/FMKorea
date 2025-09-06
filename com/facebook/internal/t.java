package com.facebook.internal;

import G3.h;

public final class t {
    private static volatile String a;
    public static final t b;

    static {
        t.b = new t();
    }

    public static final String a() {
        return t.a;
    }

    public static final boolean b() {
        return t.a != null && h.u(t.a, "Unity.", false, 2, null);
    }
}

