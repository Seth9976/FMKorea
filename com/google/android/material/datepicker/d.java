package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import z1.i;

abstract class d {
    static String a(Context context0, long v, boolean z, boolean z1, boolean z2) {
        String s = d.d(v);
        if(z) {
            s = String.format(context0.getString(i.v), s);
        }
        if(z1) {
            return String.format(context0.getString(i.u), s);
        }
        return z2 ? String.format(context0.getString(i.r), s) : s;
    }

    static String b(long v) {
        return d.c(v, Locale.getDefault());
    }

    static String c(long v, Locale locale0) {
        return Build.VERSION.SDK_INT < 24 ? u.e(locale0).format(new Date(v)) : u.f(locale0).format(new Date(v));
    }

    // 去混淆评级： 低(20)
    static String d(long v) {
        return d.i(v) ? d.b(v) : d.g(v);
    }

    static String e(Context context0, int v) {
        return u.i().get(1) == v ? String.format(context0.getString(i.s), v) : String.format(context0.getString(i.t), v);
    }

    static String f(long v) {
        return Build.VERSION.SDK_INT < 24 ? DateUtils.formatDateTime(null, v, 0x2024) : u.m(Locale.getDefault()).format(new Date(v));
    }

    static String g(long v) {
        return d.h(v, Locale.getDefault());
    }

    static String h(long v, Locale locale0) {
        return Build.VERSION.SDK_INT < 24 ? u.e(locale0).format(new Date(v)) : u.n(locale0).format(new Date(v));
    }

    private static boolean i(long v) {
        Calendar calendar0 = u.i();
        Calendar calendar1 = u.k();
        calendar1.setTimeInMillis(v);
        return calendar0.get(1) == calendar1.get(1);
    }
}

