package com.google.common.collect;

public abstract class g {
    static StringBuilder a(int v) {
        f.b(v, "size");
        return new StringBuilder(((int)Math.min(((long)v) * 8L, 0x40000000L)));
    }
}

