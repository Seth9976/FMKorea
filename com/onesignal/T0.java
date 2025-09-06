package com.onesignal;

import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;

class t0 {
    static abstract class b {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[com.onesignal.y1.b.values().length];
            b.b = arr_v;
            try {
                arr_v[com.onesignal.y1.b.h.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.b[com.onesignal.y1.b.k.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.b[com.onesignal.y1.b.g.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.b[com.onesignal.y1.b.l.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.b[com.onesignal.y1.b.i.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.b[com.onesignal.y1.b.j.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[a.values().length];
            b.a = arr_v1;
            try {
                arr_v1[a.h.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[a.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    interface c {
        void a();

        void b(String arg1);
    }

    private final c a;
    private final ArrayList b;
    private static Date c;

    static {
        t0.c = new Date();
    }

    t0(c t0$c0) {
        this.b = new ArrayList();
        this.a = t0$c0;
    }

    boolean c(y1 y10) {
        class com.onesignal.t0.a extends TimerTask {
            final String f;
            final t0 g;

            com.onesignal.t0.a(String s) {
                this.f = s;
                super();
            }

            @Override
            public void run() {
                t0.this.b.remove(this.f);
                t0.this.a.a();
            }
        }

        long v1;
        if(y10.e == null) {
            return false;
        }
        synchronized(this.b) {
            if(!(y10.e instanceof Number)) {
                return false;
            }
            switch(b.a[y10.b.ordinal()]) {
                case 1: {
                    v1 = new Date().getTime() - t0.c.getTime();
                    break;
                }
                case 2: {
                    if(I1.m0().Y()) {
                        return false;
                    }
                    Date date0 = I1.m0().t;
                    v1 = date0 == null ? 0xF423FL : new Date().getTime() - date0.getTime();
                    break;
                }
                default: {
                    v1 = 0L;
                }
            }
            String s = y10.a;
            double f = ((Number)y10.e).doubleValue();
            if(t0.d(((long)(f * 1000.0)), v1, y10.d)) {
                this.a.b(s);
                return true;
            }
            long v2 = ((long)(f * 1000.0)) - v1;
            if(v2 <= 0L) {
                return false;
            }
            if(this.b.contains(s)) {
                return false;
            }
            u0.a(new com.onesignal.t0.a(this, s), s, v2);
            this.b.add(s);
            return false;
        }
    }

    private static boolean d(double f, double f1, com.onesignal.y1.b y1$b0) {
        switch(b.b[y1$b0.ordinal()]) {
            case 1: {
                return f1 < f;
            }
            case 2: {
                return f1 <= f || t0.f(f, f1);
            }
            case 3: {
                return f1 >= f;
            }
            case 4: {
                return f1 >= f || t0.f(f, f1);
            }
            case 5: {
                return t0.f(f, f1);
            }
            case 6: {
                return !t0.f(f, f1);
            }
            default: {
                I1.p1(C.h, "Attempted to apply an invalid operator on a time-based in-app-message trigger: " + y1$b0.toString());
                return false;
            }
        }
    }

    static void e() {
        t0.c = new Date();
    }

    private static boolean f(double f, double f1) {
        return Math.abs(f - f1) < 0.3;
    }
}

