package com.google.firebase.analytics.connector.internal;

import J2.h;
import a2.e;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import b2.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import d2.c;
import d2.r;
import java.util.Arrays;
import java.util.List;
import y2.d;

@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    @SuppressLint({"MissingPermission"})
    @Keep
    @KeepForSdk
    public List getComponents() {
        return Arrays.asList(new c[]{c.e(a.class).b(r.k(e.class)).b(r.k(Context.class)).b(r.k(d.class)).f(b.a).e().d(), h.b("fire-analytics", "21.5.0")});
    }

    static a lambda$getComponents$0(d2.e e0) {
        return b2.b.d(((e)e0.a(e.class)), ((Context)e0.a(Context.class)), ((d)e0.a(d.class)));
    }
}

