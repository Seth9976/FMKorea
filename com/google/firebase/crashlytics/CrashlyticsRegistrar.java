package com.google.firebase.crashlytics;

import J2.h;
import K2.k;
import L2.a;
import com.google.firebase.components.ComponentRegistrar;
import d2.c;
import d2.e;
import d2.r;
import f2.f;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        a.a.a(L2.b.a.f);
    }

    private com.google.firebase.crashlytics.a b(e e0) {
        a2.e e1 = (a2.e)e0.a(a2.e.class);
        B2.a a0 = e0.i(g2.a.class);
        B2.a a1 = e0.i(b2.a.class);
        return com.google.firebase.crashlytics.a.b(e1, ((C2.e)e0.a(C2.e.class)), ((k)e0.a(k.class)), a0, a1);
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(new c[]{c.e(com.google.firebase.crashlytics.a.class).h("fire-cls").b(r.k(a2.e.class)).b(r.k(C2.e.class)).b(r.k(k.class)).b(r.a(g2.a.class)).b(r.a(b2.a.class)).f(new f(this)).e().d(), h.b("fire-cls", "18.4.0")});
    }
}

