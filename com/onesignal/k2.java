package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

class k2 {
    private Object a;
    private Context b;
    private static Class c;
    private static AtomicLong d;
    private static AtomicLong e;
    private static R0 f;

    k2(Context context0) {
        this.b = context0;
    }

    static boolean a() {
        k2.c = FirebaseAnalytics.class;
        return true;
    }

    private String b(R0 r00) {
        if(!r00.l().isEmpty() && !r00.k().isEmpty()) {
            return r00.l() + " - " + r00.k();
        }
        return r00.m() == null ? "" : r00.m().substring(0, Math.min(10, r00.m().length()));
    }

    private Object c(Context context0) {
        if(this.a == null) {
            Method method0 = k2.d(k2.c);
            try {
                this.a = method0.invoke(null, context0);
                return this.a;
            }
            catch(Throwable throwable0) {
                throwable0.printStackTrace();
                return null;
            }
        }
        return this.a;
    }

    private static Method d(Class class0) {
        try {
            return class0.getMethod("getInstance", Context.class);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            noSuchMethodException0.printStackTrace();
            return null;
        }
    }

    private static Method e(Class class0) {
        try {
            return class0.getMethod("logEvent", String.class, Bundle.class);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            noSuchMethodException0.printStackTrace();
            return null;
        }
    }

    void f() {
        if(k2.d != null && k2.f != null) {
            long v = I1.H0().a();
            if(v - k2.d.get() > 120000L) {
                return;
            }
            if(k2.e != null && v - k2.e.get() < 30000L) {
                return;
            }
            try {
                Object object0 = this.c(this.b);
                Method method0 = k2.e(k2.c);
                Bundle bundle0 = new Bundle();
                bundle0.putString("source", "OneSignal");
                bundle0.putString("medium", "notification");
                bundle0.putString("notification_id", k2.f.i());
                bundle0.putString("campaign", this.b(k2.f));
                method0.invoke(object0, "os_notification_influence_open", bundle0);
            }
            catch(Throwable throwable0) {
                throwable0.printStackTrace();
            }
        }
    }

    void g(a1 a10) {
        if(k2.e == null) {
            k2.e = new AtomicLong();
        }
        k2.e.set(I1.H0().a());
        try {
            Object object0 = this.c(this.b);
            Method method0 = k2.e(k2.c);
            Bundle bundle0 = new Bundle();
            bundle0.putString("source", "OneSignal");
            bundle0.putString("medium", "notification");
            bundle0.putString("notification_id", a10.d().i());
            bundle0.putString("campaign", this.b(a10.d()));
            method0.invoke(object0, "os_notification_opened", bundle0);
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
    }

    void h(a1 a10) {
        try {
            Object object0 = this.c(this.b);
            Method method0 = k2.e(k2.c);
            Bundle bundle0 = new Bundle();
            bundle0.putString("source", "OneSignal");
            bundle0.putString("medium", "notification");
            bundle0.putString("notification_id", a10.d().i());
            bundle0.putString("campaign", this.b(a10.d()));
            method0.invoke(object0, "os_notification_received", bundle0);
            if(k2.d == null) {
                k2.d = new AtomicLong();
            }
            k2.d.set(I1.H0().a());
            k2.f = a10.d();
            return;
        }
        catch(Throwable throwable0) {
        }
        throwable0.printStackTrace();
    }
}

