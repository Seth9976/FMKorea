package com.facebook.appevents;

import android.content.Context;
import com.facebook.h;
import java.util.HashMap;
import java.util.Set;

class d {
    private final HashMap a;

    public d() {
        this.a = new HashMap();
    }

    public void a(a a0, c c0) {
        synchronized(this) {
            this.e(a0).a(c0);
        }
    }

    public void b(n n0) {
        synchronized(this) {
            if(n0 == null) {
                return;
            }
            for(Object object0: n0.c()) {
                o o0 = this.e(((a)object0));
                for(Object object1: n0.b(((a)object0))) {
                    o0.a(((c)object1));
                }
            }
        }
    }

    public o c(a a0) {
        synchronized(this) {
            return (o)this.a.get(a0);
        }
    }

    public int d() {
        synchronized(this) {
            int v1 = 0;
            for(Object object0: this.a.values()) {
                v1 += ((o)object0).c();
            }
            return v1;
        }
    }

    private o e(a a0) {
        synchronized(this) {
            o o0 = (o)this.a.get(a0);
            if(o0 == null) {
                Context context0 = h.e();
                o0 = new o(com.facebook.internal.a.m(context0), g.c(context0));
            }
            this.a.put(a0, o0);
            return o0;
        }
    }

    public Set f() {
        synchronized(this) {
            return this.a.keySet();
        }
    }
}

