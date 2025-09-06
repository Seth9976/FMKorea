package androidx.work.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import m3.o;
import x0.m;
import x0.u;
import x0.x;
import z3.k;

public final class w {
    private final Object a;
    private final Map b;

    public w() {
        this.a = new Object();
        this.b = new LinkedHashMap();
    }

    public final boolean a(m m0) {
        k.e(m0, "id");
        synchronized(this.a) {
            return this.b.containsKey(m0);
        }
    }

    public final v b(m m0) {
        k.e(m0, "id");
        synchronized(this.a) {
            return (v)this.b.remove(m0);
        }
    }

    public final List c(String s) {
        k.e(s, "workSpecId");
        synchronized(this.a) {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object1: this.b.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(k.a(((m)map$Entry0.getKey()).b(), s)) {
                    linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                }
            }
            for(Object object2: linkedHashMap0.keySet()) {
                this.b.remove(((m)object2));
            }
            return o.F(linkedHashMap0.values());
        }
    }

    public final v d(m m0) {
        k.e(m0, "id");
        synchronized(this.a) {
            Map map0 = this.b;
            v v1 = map0.get(m0);
            if(v1 == null) {
                v1 = new v(m0);
                map0.put(m0, v1);
            }
            return v1;
        }
    }

    public final v e(u u0) {
        k.e(u0, "spec");
        return this.d(x.a(u0));
    }
}

