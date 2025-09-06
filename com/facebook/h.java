package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import com.facebook.internal.F;
import com.facebook.internal.G;
import com.facebook.internal.l.b;
import com.facebook.internal.l;
import com.facebook.internal.r;
import com.facebook.internal.u;
import com.facebook.internal.w;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class h {
    static final class a implements i {
        @Override  // com.facebook.h$i
        public GraphRequest a(AccessToken accessToken0, String s, JSONObject jSONObject0, e graphRequest$e0) {
            return GraphRequest.K(accessToken0, s, jSONObject0, graphRequest$e0);
        }
    }

    public interface i {
        GraphRequest a(AccessToken arg1, String arg2, JSONObject arg3, e arg4);
    }

    public interface j {
        void a();
    }

    private static final String a = "com.facebook.h";
    private static final HashSet b;
    private static Executor c;
    private static volatile String d;
    private static volatile String e;
    private static volatile String f;
    private static volatile Boolean g;
    private static volatile String h;
    private static AtomicLong i;
    private static volatile boolean j;
    private static boolean k;
    private static u l;
    private static Context m;
    private static int n;
    private static final Object o;
    private static String p;
    public static boolean q;
    public static boolean r;
    private static final AtomicBoolean s;
    private static Boolean t;
    private static i u;

    static {
        h.b = new HashSet(Arrays.asList(new q[]{q.k}));
        h.h = "facebook.com";
        h.i = new AtomicLong(0x10000L);
        h.j = false;
        h.k = false;
        h.n = 0xFACE;
        h.o = new Object();
        h.p = "v9.0";
        h.q = false;
        h.r = false;
        h.s = new AtomicBoolean(false);
        h.t = Boolean.FALSE;
        h.u = new a();
    }

    public static void A(Context context0, String s) {
        static final class com.facebook.h.h implements Runnable {
            final Context f;
            final String g;

            com.facebook.h.h(Context context0, String s) {
                this.f = context0;
                this.g = s;
                super();
            }

            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    h.z(this.f, this.g);
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        Class class0 = h.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            Context context1 = context0.getApplicationContext();
            h.m().execute(new com.facebook.h.h(context1, s));
            if(l.g(b.r) && U0.a.b()) {
                U0.a.d(s, "com.facebook.sdk.attributionTracking");
            }
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    public static void B(Context context0) {
        synchronized(h.class) {
            h.C(context0, null);
        }
    }

    public static void C(Context context0, j h$j0) {
        static final class com.facebook.h.b implements Callable {
            public File a() {
                return h.m.getCacheDir();
            }

            @Override
            public Object call() {
                return this.a();
            }
        }


        static final class c implements com.facebook.internal.l.a {
            @Override  // com.facebook.internal.l$a
            public void a(boolean z) {
                if(z) {
                    Z0.c.a();
                }
            }
        }


        static final class d implements com.facebook.internal.l.a {
            @Override  // com.facebook.internal.l$a
            public void a(boolean z) {
                if(z) {
                    com.facebook.appevents.i.a();
                }
            }
        }


        static final class com.facebook.h.e implements com.facebook.internal.l.a {
            @Override  // com.facebook.internal.l$a
            public void a(boolean z) {
                if(z) {
                    h.q = true;
                }
            }
        }


        static final class f implements com.facebook.internal.l.a {
            @Override  // com.facebook.internal.l$a
            public void a(boolean z) {
                if(z) {
                    h.r = true;
                }
            }
        }


        static final class g implements Callable {
            final Context a;

            g(j h$j0, Context context0) {
                this.a = context0;
                super();
            }

            public Void a() {
                com.facebook.b.h().i();
                s.b().c();
                if(AccessToken.s() && Profile.c() == null) {
                    Profile.b();
                }
                com.facebook.appevents.g.f(h.m, h.d);
                x.m();
                com.facebook.appevents.g.h(this.a.getApplicationContext()).b();
                return null;
            }

            @Override
            public Object call() {
                return this.a();
            }
        }

        synchronized(h.class) {
            AtomicBoolean atomicBoolean0 = h.s;
            if(atomicBoolean0.get()) {
                if(h$j0 != null) {
                    h$j0.a();
                }
                return;
            }
            G.i(context0, "applicationContext");
            G.e(context0, false);
            G.f(context0, false);
            h.m = context0.getApplicationContext();
            com.facebook.appevents.g.c(context0);
            h.y(h.m);
            if(!F.P(h.d)) {
                atomicBoolean0.set(true);
                if(h.h()) {
                    h.c();
                }
                if(h.m instanceof Application && x.g()) {
                    S0.a.x(((Application)h.m), h.d);
                }
                r.k();
                w.x();
                com.facebook.internal.b.b(h.m);
                h.l = new u(new com.facebook.h.b());
                c h$c0 = new c();
                l.a(b.v, h$c0);
                d h$d0 = new d();
                l.a(b.i, h$d0);
                com.facebook.h.e h$e0 = new com.facebook.h.e();
                l.a(b.C, h$e0);
                f h$f0 = new f();
                l.a(b.D, h$f0);
                FutureTask futureTask0 = new FutureTask(new g(h$j0, context0));
                h.m().execute(futureTask0);
                return;
            }
        }
        throw new com.facebook.e("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static void c() {
        h.t = Boolean.TRUE;
    }

    public static boolean d() {
        return x.e();
    }

    public static Context e() {
        G.k();
        return h.m;
    }

    public static String f() {
        G.k();
        return h.d;
    }

    public static String g() {
        G.k();
        return h.e;
    }

    public static boolean h() {
        return x.f();
    }

    public static boolean i() {
        return x.g();
    }

    public static int j() {
        G.k();
        return h.n;
    }

    public static String k() {
        G.k();
        return h.f;
    }

    public static boolean l() {
        return x.h();
    }

    public static Executor m() {
        synchronized(h.o) {
            if(h.c == null) {
                h.c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return h.c;
    }

    // 去混淆评级： 低(20)
    public static String n() [...] // 潜在的解密器

    // 去混淆评级： 低(40)
    public static String o() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static String p() {
        AccessToken accessToken0 = AccessToken.g();
        String s = accessToken0 == null ? null : accessToken0.l();
        if(s == null) {
            return "facebook.com";
        }
        return s.equals("gaming") ? "fb.gg" : "facebook.com";
    }

    public static boolean q(Context context0) {
        G.k();
        return context0.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static long r() {
        G.k();
        return h.i.get();
    }

    public static String s() [...] // Inlined contents

    public static boolean t() [...] // 潜在的解密器

    public static boolean u() {
        synchronized(h.class) {
            return h.t.booleanValue();
        }
    }

    public static boolean v() {
        return h.s.get();
    }

    public static boolean w() [...] // 潜在的解密器

    public static boolean x(q q0) {
        synchronized(h.b) {
        }
        return false;
    }

    static void y(Context context0) {
        ApplicationInfo applicationInfo0;
        if(context0 == null) {
            return;
        }
        try {
            applicationInfo0 = context0.getPackageManager().getApplicationInfo("com.fmkorea.m.fmk", 0x80);
            if(applicationInfo0 != null && applicationInfo0.metaData != null) {
                goto label_4;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return;
    label_4:
        if(h.d == null) {
            Object object0 = applicationInfo0.metaData.get("com.facebook.sdk.ApplicationId");
            if(!(object0 instanceof String)) {
                if(object0 instanceof Number) {
                    throw new com.facebook.e("App Ids cannot be directly placed in the manifest.They must be prefixed by \'fb\' or be placed in the string resource file.");
                }
            }
            else if(((String)object0).toLowerCase(Locale.ROOT).startsWith("fb")) {
                h.d = ((String)object0).substring(2);
            }
            else {
                h.d = (String)object0;
            }
        }
        if(h.e == null) {
            h.e = applicationInfo0.metaData.getString("com.facebook.sdk.ApplicationName");
        }
        if(h.f == null) {
            h.f = applicationInfo0.metaData.getString("com.facebook.sdk.ClientToken");
        }
        if(h.n == 0xFACE) {
            h.n = applicationInfo0.metaData.getInt("com.facebook.sdk.CallbackOffset", 0xFACE);
        }
        if(h.g == null) {
            h.g = Boolean.valueOf(applicationInfo0.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
        }
    }

    static void z(Context context0, String s) {
        Class class0 = h.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            try {
                if(context0 == null || s == null) {
                    throw new IllegalArgumentException("Both context and applicationId must be non-null");
                }
                com.facebook.internal.a a0 = com.facebook.internal.a.m(context0);
                SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                long v = sharedPreferences0.getLong(s + "ping", 0L);
                try {
                    String s1 = com.facebook.appevents.g.c(context0);
                    boolean z = h.q(context0);
                    JSONObject jSONObject0 = S0.c.a(S0.c.b.f, a0, s1, z, context0);
                }
                catch(JSONException jSONException0) {
                    throw new com.facebook.e("An error occurred while publishing install.", jSONException0);
                }
                if(v == 0L && h.u.a(null, String.format("%s/activities", new Object[]{s}), jSONObject0, null).g().g() == null) {
                    SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                    sharedPreferences$Editor0.putLong(s + "ping", System.currentTimeMillis());
                    sharedPreferences$Editor0.apply();
                    return;
                }
                return;
            }
            catch(Exception exception0) {
            }
            F.U("Facebook-publish", exception0);
            return;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
    }
}

