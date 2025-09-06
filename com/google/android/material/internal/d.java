package com.google.android.material.internal;

import H1.a;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.Window;
import androidx.core.view.k0;

public abstract class d {
    public static void a(Window window0, boolean z, Integer integer0, Integer integer1) {
        boolean z1 = false;
        boolean z2 = integer0 == null || ((int)integer0) == 0;
        if(integer1 == null || ((int)integer1) == 0) {
            z1 = true;
        }
        if(z2 || z1) {
            int v = a.b(window0.getContext(), 0x1010031, 0xFF000000);
            if(z2) {
                integer0 = v;
            }
            if(z1) {
                integer1 = v;
            }
        }
        k0.b(window0, !z);
        int v1 = d.c(window0.getContext(), z);
        int v2 = d.b(window0.getContext(), z);
        window0.setStatusBarColor(v1);
        window0.setNavigationBarColor(v2);
        d.f(window0, d.d(v1, a.h(((int)integer0))));
        d.e(window0, d.d(v2, a.h(((int)integer1))));
    }

    private static int b(Context context0, boolean z) {
        if(z && Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.d.k(a.b(context0, 0x1010452, 0xFF000000), 0x80);
        }
        return z ? 0 : a.b(context0, 0x1010452, 0xFF000000);
    }

    // 去混淆评级： 低(20)
    private static int c(Context context0, boolean z) {
        return z ? 0 : a.b(context0, 0x1010451, 0xFF000000);
    }

    // 去混淆评级： 低(30)
    private static boolean d(int v, boolean z) {
        return a.h(v) || v == 0 && z;
    }

    public static void e(Window window0, boolean z) {
        k0.a(window0, window0.getDecorView()).b(z);
    }

    public static void f(Window window0, boolean z) {
        k0.a(window0, window0.getDecorView()).c(z);
    }
}

