package com.facebook.login;

import android.net.Uri;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;

public abstract class a extends e {
    private static c f;
    private static f g;

    static {
    }

    public static f a() {
        f f0 = a.g;
        a.g = null;
        return f0;
    }

    public static void b(Uri uri0) {
        if(a.g == null) {
            a.c();
        }
        f f0 = a.g;
        if(f0 != null) {
            f0.f(uri0, null, null);
        }
    }

    private static void c() {
        if(a.g == null) {
            c c0 = a.f;
            if(c0 != null) {
                a.g = c0.c(null);
            }
        }
    }
}

