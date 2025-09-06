package com.facebook.internal;

import android.util.Log;
import com.facebook.h;
import com.facebook.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import z3.g;
import z3.k;

public final class v {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final void a(q q0, int v, String s, String s1) {
            k.e(q0, "behavior");
            k.e(s, "tag");
            k.e(s1, "string");
            if(h.x(q0)) {
                String s2 = this.g(s1);
                if(!G3.h.u(s, "FacebookSDK.", false, 2, null)) {
                    s = "FacebookSDK." + s;
                }
                Log.println(v, s, s2);
                if(q0 == q.k) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(q q0, int v, String s, String s1, Object[] arr_object) {
            k.e(q0, "behavior");
            k.e(s, "tag");
            k.e(s1, "format");
            k.e(arr_object, "args");
            if(h.x(q0)) {
                Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
                String s2 = String.format(s1, Arrays.copyOf(arr_object1, arr_object1.length));
                k.d(s2, "java.lang.String.format(format, *args)");
                this.a(q0, v, s, s2);
            }
        }

        public final void c(q q0, String s, String s1) {
            k.e(q0, "behavior");
            k.e(s, "tag");
            k.e(s1, "string");
            this.a(q0, 3, s, s1);
        }

        public final void d(q q0, String s, String s1, Object[] arr_object) {
            k.e(q0, "behavior");
            k.e(s, "tag");
            k.e(s1, "format");
            k.e(arr_object, "args");
            if(h.x(q0)) {
                Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
                String s2 = String.format(s1, Arrays.copyOf(arr_object1, arr_object1.length));
                k.d(s2, "java.lang.String.format(format, *args)");
                this.a(q0, 3, s, s2);
            }
        }

        public final void e(String s) {
            synchronized(this) {
                k.e(s, "accessToken");
                if(!h.x(q.g)) {
                    this.f(s, "ACCESS_TOKEN_REMOVED");
                }
            }
        }

        public final void f(String s, String s1) {
            synchronized(this) {
                k.e(s, "original");
                k.e(s1, "replace");
                v.e.put(s, s1);
            }
        }

        private final String g(String s) {
            synchronized(this) {
                String s1 = s;
                for(Object object0: v.e.entrySet()) {
                    s1 = G3.h.s(s1, ((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()), false, 4, null);
                }
                return s1;
            }
        }
    }

    private final q a;
    private final String b;
    private StringBuilder c;
    private int d;
    private static final HashMap e;
    public static final a f;

    static {
        v.f = new a(null);
        v.e = new HashMap();
    }

    public v(q q0, String s) {
        k.e(q0, "behavior");
        k.e(s, "tag");
        super();
        this.d = 3;
        G.j(s, "tag");
        this.a = q0;
        this.b = "FacebookSDK." + s;
        this.c = new StringBuilder();
    }

    public final void b(String s) {
        k.e(s, "string");
        if(this.l()) {
            this.c.append(s);
        }
    }

    public final void c(String s, Object[] arr_object) {
        k.e(s, "format");
        k.e(arr_object, "args");
        if(this.l()) {
            StringBuilder stringBuilder0 = this.c;
            Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
            String s1 = String.format(s, Arrays.copyOf(arr_object1, arr_object1.length));
            k.d(s1, "java.lang.String.format(format, *args)");
            stringBuilder0.append(s1);
        }
    }

    public final void d(String s, Object object0) {
        k.e(s, "key");
        k.e(object0, "value");
        this.c("  %s:\t%s\n", new Object[]{s, object0});
    }

    public final void e() {
        String s = this.c.toString();
        k.d(s, "contents.toString()");
        this.j(s);
        this.c = new StringBuilder();
    }

    public static final void f(q q0, int v, String s, String s1) {
        v.f.a(q0, v, s, s1);
    }

    public static final void g(q q0, int v, String s, String s1, Object[] arr_object) {
        v.f.b(q0, v, s, s1, arr_object);
    }

    public static final void h(q q0, String s, String s1) {
        v.f.c(q0, s, s1);
    }

    public static final void i(q q0, String s, String s1, Object[] arr_object) {
        v.f.d(q0, s, s1, arr_object);
    }

    public final void j(String s) {
        k.e(s, "string");
        v.f.a(this.a, this.d, this.b, s);
    }

    public static final void k(String s) {
        synchronized(v.class) {
            v.f.e(s);
        }
    }

    private final boolean l() {
        return h.x(this.a);
    }
}

