package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k1.b;
import m1.g;

public final class a implements g {
    private final String a;
    private final String b;
    static final String c;
    static final String d;
    private static final String e;
    private static final Set f;
    public static final a g;
    public static final a h;

    // 去混淆评级： 低(25)
    static {
        a.c = "https://firebaselogging.googleapis.com/v0cc/log/batch?format=json_proto3";
        a.d = "https://firebaselogging-pa.googleapis.com/v1/firelog/legacy/batchlog";
        a.e = "AIzaSyCckkiH8i2ZARwOs1LEzFKld15aOG8ozKo";
        a.f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{b.b("proto"), b.b("json")})));
        a.g = new a("https://firebaselogging.googleapis.com/v0cc/log/batch?format=json_proto3", null);
        a.h = new a("https://firebaselogging-pa.googleapis.com/v1/firelog/legacy/batchlog", "AIzaSyCckkiH8i2ZARwOs1LEzFKld15aOG8ozKo");
    }

    public a(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // m1.g
    public Set a() {
        return a.f;
    }

    public byte[] b() {
        String s = this.b;
        if(s == null && this.a == null) {
            return null;
        }
        String s1 = this.a;
        if(s == null) {
            s = "";
        }
        return String.format("%s%s%s%s", "1$", s1, "\\", s).getBytes(Charset.forName("UTF-8"));
    }

    public static a c(byte[] arr_b) {
        String s = new String(arr_b, Charset.forName("UTF-8"));
        if(!s.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] arr_s = s.substring(2).split("\\Q\\\\E", 2);
        if(arr_s.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String s1 = arr_s[0];
        if(s1.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String s2 = arr_s[1];
        if(s2.isEmpty()) {
            s2 = null;
        }
        return new a(s1, s2);
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    @Override  // m1.f
    public byte[] getExtras() {
        return this.b();
    }

    @Override  // m1.f
    public String getName() {
        return "cct";
    }
}

