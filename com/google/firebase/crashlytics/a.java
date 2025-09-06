package com.google.firebase.crashlytics;

import K2.k;
import a2.e;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import g2.d;
import g2.f;
import j2.i;
import j2.j;
import j2.o;
import j2.u;
import j2.w;
import j2.y;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class a {
    final o a;

    private a(o o0) {
        this.a = o0;
    }

    public static a a() {
        a a0 = (a)e.k().i(a.class);
        if(a0 == null) {
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        }
        return a0;
    }

    static a b(e e0, C2.e e1, k k0, B2.a a0, B2.a a1) {
        class com.google.firebase.crashlytics.a.a implements Continuation {
            com.google.firebase.crashlytics.a.a() {
                super();
            }

            @Override  // com.google.android.gms.tasks.Continuation
            public Object then(Task task0) {
                if(!task0.isSuccessful()) {
                    f.f().e("Error fetching settings.", task0.getException());
                }
                return null;
            }
        }


        class b implements Callable {
            final boolean a;
            final o b;
            final q2.f c;

            b(boolean z, o o0, q2.f f0) {
                this.b = o0;
                this.c = f0;
                super();
            }

            public Void a() {
                if(this.a) {
                    this.b.g(this.c);
                }
                return null;
            }

            @Override
            public Object call() {
                return this.a();
            }
        }

        j2.a a2;
        Context context0 = e0.j();
        f.f().g("Initializing Firebase Crashlytics 18.4.0 for com.fmkorea.m.fmk");
        o2.f f0 = new o2.f(context0);
        u u0 = new u(e0);
        y y0 = new y(context0, "com.fmkorea.m.fmk", e1, u0);
        d d0 = new d(a0);
        f2.d d1 = new f2.d(a1);
        ExecutorService executorService0 = w.c("Crashlytics Exception Handler");
        j j0 = new j(u0);
        k0.c(j0);
        o o0 = new o(e0, y0, d0, u0, d1.e(), d1.d(), f0, executorService0, j0);
        String s = e0.m().c();
        String s1 = i.o(context0);
        List list0 = i.l(context0);
        f.f().b("Mapping file ID is: " + s1);
        for(Object object0: list0) {
            f.f().b(String.format("Build id for %s on %s: %s", ((j2.f)object0).c(), ((j2.f)object0).a(), ((j2.f)object0).b()));
        }
        g2.e e2 = new g2.e(context0);
        try {
            a2 = j2.a.a(context0, y0, s, s1, list0, e2);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            f.f().e("Error retrieving app package info.", packageManager$NameNotFoundException0);
            return null;
        }
        f.f().i("Installer package name is: " + a2.d);
        ExecutorService executorService1 = w.c("com.google.firebase.crashlytics.startup");
        q2.f f1 = q2.f.l(context0, s, y0, new n2.b(), a2.f, a2.g, f0, u0);
        f1.o(executorService1).continueWith(executorService1, new com.google.firebase.crashlytics.a.a());
        Tasks.call(executorService1, new b(o0.o(a2, f1), o0, f1));
        return new a(o0);
    }

    public void c(String s) {
        this.a.k(s);
    }

    public void d(Throwable throwable0) {
        if(throwable0 == null) {
            f.f().k("A null value was passed to recordException. Ignoring.");
            return;
        }
        this.a.l(throwable0);
    }

    public void e(boolean z) {
        this.a.p(Boolean.valueOf(z));
    }

    public void f(String s) {
        this.a.q(s);
    }
}

