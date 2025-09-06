package com.google.firebase.messaging;

import A2.a;
import J2.h;
import J2.i;
import a2.e;
import androidx.annotation.Keep;
import androidx.appcompat.app.E;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import d2.c;
import d2.r;
import java.util.Arrays;
import java.util.List;
import k1.g;
import y2.d;
import z2.j;

@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    @Override  // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List getComponents() {
        return Arrays.asList(new c[]{c.e(FirebaseMessaging.class).h("fire-fcm").b(r.k(e.class)).b(r.h(a.class)).b(r.i(i.class)).b(r.i(j.class)).b(r.h(g.class)).b(r.k(C2.e.class)).b(r.k(d.class)).f(new y()).c().d(), h.b("fire-fcm", "23.2.0")});
    }

    private static FirebaseMessaging lambda$getComponents$0(d2.e e0) {
        Object object0 = e0.a(e.class);
        E.a(e0.a(a.class));
        return new FirebaseMessaging(((e)object0), null, e0.c(i.class), e0.c(j.class), ((C2.e)e0.a(C2.e.class)), ((g)e0.a(g.class)), ((d)e0.a(d.class)));
    }
}

