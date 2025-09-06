package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

public abstract class p extends d implements Serializable {
    public static abstract class a {
        final Map a;
        Comparator b;
        Comparator c;

        public a() {
            this.a = G.c();
        }
    }

    static abstract class b {
        static final com.google.common.collect.L.b a;
        static final com.google.common.collect.L.b b;

        static {
            b.a = L.a(p.class, "map");
            b.b = L.a(p.class, "size");
        }
    }

    final transient o f;
    final transient int g;
    private static final long serialVersionUID;

    p(o o0, int v) {
        this.f = o0;
        this.g = v;
    }

    @Override  // com.google.common.collect.c
    public Map a() {
        return this.c();
    }

    @Override  // com.google.common.collect.c
    public boolean b(Object object0) {
        return object0 != null && super.b(object0);
    }

    public o c() {
        return this.f;
    }

    @Override  // com.google.common.collect.c
    public boolean equals(Object object0) {
        return super.equals(object0);
    }

    @Override  // com.google.common.collect.c
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // com.google.common.collect.c
    public String toString() {
        return super.toString();
    }
}

