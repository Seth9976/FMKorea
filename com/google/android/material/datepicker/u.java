package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

abstract class u {
    static AtomicReference a;

    static {
        u.a = new AtomicReference();
    }

    static long a(long v) {
        Calendar calendar0 = u.k();
        calendar0.setTimeInMillis(v);
        return u.c(calendar0).getTimeInMillis();
    }

    private static DateFormat b(String s, Locale locale0) {
        DateFormat dateFormat0 = DateFormat.getInstanceForSkeleton(s, locale0);
        dateFormat0.setTimeZone(u.j());
        dateFormat0.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return dateFormat0;
    }

    static Calendar c(Calendar calendar0) {
        Calendar calendar1 = u.l(calendar0);
        Calendar calendar2 = u.k();
        calendar2.set(calendar1.get(1), calendar1.get(2), calendar1.get(5));
        return calendar2;
    }

    private static java.text.DateFormat d(int v, Locale locale0) {
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance(v, locale0);
        dateFormat0.setTimeZone(u.h());
        return dateFormat0;
    }

    static java.text.DateFormat e(Locale locale0) {
        return u.d(0, locale0);
    }

    static DateFormat f(Locale locale0) {
        return u.b("MMMMEEEEd", locale0);
    }

    static o g() {
        o o0 = (o)u.a.get();
        return o0 == null ? o.c() : o0;
    }

    private static TimeZone h() {
        return TimeZone.getTimeZone("UTC");
    }

    static Calendar i() {
        Calendar calendar0 = u.g().a();
        calendar0.set(11, 0);
        calendar0.set(12, 0);
        calendar0.set(13, 0);
        calendar0.set(14, 0);
        calendar0.setTimeZone(u.h());
        return calendar0;
    }

    private static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar k() {
        return u.l(null);
    }

    static Calendar l(Calendar calendar0) {
        Calendar calendar1 = Calendar.getInstance(u.h());
        if(calendar0 == null) {
            calendar1.clear();
            return calendar1;
        }
        calendar1.setTimeInMillis(calendar0.getTimeInMillis());
        return calendar1;
    }

    static DateFormat m(Locale locale0) {
        return u.b("yMMMM", locale0);
    }

    static DateFormat n(Locale locale0) {
        return u.b("yMMMMEEEEd", locale0);
    }
}

