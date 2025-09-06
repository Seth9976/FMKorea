package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;

public class g {
    public static enum a {
        AUTO,
        EXPLICIT_ONLY;

    }

    private h a;

    static {
    }

    private g(Context context0, String s, AccessToken accessToken0) {
        this.a = new h(context0, s, accessToken0);
    }

    public static void a(Application application0, String s) {
        h.a(application0, s);
    }

    public void b() {
        this.a.c();
    }

    public static String c(Context context0) {
        return h.e(context0);
    }

    public static a d() {
        return h.f();
    }

    public static String e() {
        return b.b();
    }

    public static void f(Context context0, String s) {
        h.i(context0, s);
    }

    public void g(String s, Bundle bundle0) {
        this.a.m(s, bundle0);
    }

    public static g h(Context context0) {
        return new g(context0, null, null);
    }

    public static void i() {
        h.u();
    }
}

