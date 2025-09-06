package com.facebook.internal;

import com.facebook.h;
import java.util.Arrays;
import java.util.Collection;
import z3.k;

public final class z {
    private static final String a;
    private static final Collection b;
    private static final Collection c;
    private static final String d;
    public static final z e;

    static {
        z.e = new z();
        k.d("com.facebook.internal.z", "ServerProtocol::class.java.name");
        z.a = "com.facebook.internal.z";
        z.b = F.r0(new String[]{"service_disabled", "AndroidAuthKillSwitchException"});
        z.c = F.r0(new String[]{"access_denied", "OAuthAccessDeniedException"});
        z.d = "CONNECTION_FAILURE";
    }

    public static final String a() [...] // Inlined contents

    // 去混淆评级： 低(40)
    public static final String b() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final String c() [...] // 潜在的解密器

    public static final Collection d() {
        return z.b;
    }

    public static final Collection e() {
        return z.c;
    }

    public static final String f() {
        String s = String.format("https://graph.%s", Arrays.copyOf(new Object[]{h.p()}, 1));
        k.d(s, "java.lang.String.format(format, *args)");
        return s;
    }

    public static final String g() {
        String s = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{h.p()}, 1));
        k.d(s, "java.lang.String.format(format, *args)");
        return s;
    }
}

