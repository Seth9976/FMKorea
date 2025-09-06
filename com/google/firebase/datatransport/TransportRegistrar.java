package com.google.firebase.datatransport;

import J2.h;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d2.c;
import d2.e;
import d2.r;
import java.util.Arrays;
import java.util.List;
import k1.g;
import m1.u;
import s2.a;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(new c[]{c.e(g.class).h("fire-transport").b(r.k(Context.class)).f(new a()).d(), h.b("fire-transport", "18.1.8")});
    }

    private static g lambda$getComponents$0(e e0) {
        u.f(((Context)e0.a(Context.class)));
        return u.c().g(com.google.android.datatransport.cct.a.h);
    }
}

