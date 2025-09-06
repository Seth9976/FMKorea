package com.google.firebase.installations;

import D2.d;
import F2.a;
import F2.b;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class i {
    private final a a;
    public static final long b;
    private static final Pattern c;
    private static i d;

    static {
        i.b = TimeUnit.HOURS.toSeconds(1L);
        i.c = Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    private i(a a0) {
        this.a = a0;
    }

    public long a() {
        return this.a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(this.a());
    }

    public static i c() {
        return i.d(b.a());
    }

    public static i d(a a0) {
        if(i.d == null) {
            i.d = new i(a0);
        }
        return i.d;
    }

    public long e() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public boolean f(d d0) {
        return TextUtils.isEmpty(d0.b()) ? true : d0.h() + d0.c() < this.b() + i.b;
    }

    static boolean g(String s) {
        return i.c.matcher(s).matches();
    }

    static boolean h(String s) {
        return s.contains(":");
    }
}

