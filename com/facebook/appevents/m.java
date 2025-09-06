package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;

public class m {
    private h a;

    public m(Context context0) {
        this(new h(context0, null, null));
    }

    public m(Context context0, String s) {
        this(new h(context0, s, null));
    }

    m(h h0) {
        this.a = h0;
    }

    public m(String s, String s1, AccessToken accessToken0) {
        this(new h(s, s1, accessToken0));
    }

    public void a() {
        this.a.c();
    }

    static Executor b() {
        return h.d();
    }

    public static a c() {
        return h.f();
    }

    static String d() {
        return h.h();
    }

    public void e(Bundle bundle0) {
        if((bundle0.getInt("previous") & 2) != 0 || com.facebook.h.i()) {
            this.a.p("fb_sdk_settings_changed", null, bundle0);
        }
    }

    public void f(String s, double f, Bundle bundle0) {
        if(com.facebook.h.i()) {
            this.a.l(s, f, bundle0);
        }
    }

    public void g(String s, Bundle bundle0) {
        if(com.facebook.h.i()) {
            this.a.m(s, bundle0);
        }
    }

    public void h(String s, String s1) {
        this.a.o(s, s1);
    }

    public void i(String s) {
        if(com.facebook.h.i()) {
            this.a.p(s, null, null);
        }
    }

    public void j(String s, Bundle bundle0) {
        if(com.facebook.h.i()) {
            this.a.p(s, null, bundle0);
        }
    }

    public void k(String s, Double double0, Bundle bundle0) {
        if(com.facebook.h.i()) {
            this.a.p(s, double0, bundle0);
        }
    }

    public void l(String s, BigDecimal bigDecimal0, Currency currency0, Bundle bundle0) {
        if(com.facebook.h.i()) {
            this.a.q(s, bigDecimal0, currency0, bundle0);
        }
    }

    public void m(BigDecimal bigDecimal0, Currency currency0, Bundle bundle0) {
        if(com.facebook.h.i()) {
            this.a.s(bigDecimal0, currency0, bundle0);
        }
    }

    public static void n(Map map0) {
        p.i(map0);
    }
}

