package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

public abstract class f {
    private static String a() {
        return Build.MANUFACTURER == null ? "" : Build.MANUFACTURER.toLowerCase(Locale.ENGLISH);
    }

    public static boolean b() {
        return f.a().equals("meizu");
    }
}

