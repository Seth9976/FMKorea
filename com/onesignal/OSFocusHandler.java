package com.onesignal;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.e;
import androidx.work.j.a;
import androidx.work.l;
import androidx.work.m;
import androidx.work.v;
import java.util.concurrent.TimeUnit;
import z3.g;
import z3.k;

public final class OSFocusHandler {
    public static final class OnLostFocusWorker extends Worker {
        public OnLostFocusWorker(Context context0, WorkerParameters workerParameters0) {
            k.e(context0, "context");
            k.e(workerParameters0, "workerParams");
            super(context0, workerParameters0);
        }

        @Override  // androidx.work.Worker
        public a doWork() {
            OSFocusHandler.b.a();
            a j$a0 = a.c();
            k.d(j$a0, "success()");
            return j$a0;
        }
    }

    public static final class com.onesignal.OSFocusHandler.a {
        private com.onesignal.OSFocusHandler.a() {
        }

        public com.onesignal.OSFocusHandler.a(g g0) {
        }

        public final void a() {
            com.onesignal.a a0 = b.b();
            if(a0 == null || a0.e() == null) {
                I1.Z1(false);
            }
            I1.p1(C.k, "OSFocusHandler running onAppLostFocus");
            OSFocusHandler.d = true;
            I1.m1();
            OSFocusHandler.e = true;
        }
    }

    private Runnable a;
    public static final com.onesignal.OSFocusHandler.a b;
    private static boolean c;
    private static boolean d;
    private static boolean e;

    static {
        OSFocusHandler.b = new com.onesignal.OSFocusHandler.a(null);
    }

    private final c d() {
        c c0 = new androidx.work.c.a().b(l.g).a();
        k.d(c0, "Builder()\n            .s…TED)\n            .build()");
        return c0;
    }

    public final void e(String s, Context context0) {
        k.e(s, "tag");
        k.e(context0, "context");
        F1.a(context0).a(s);
    }

    public final boolean f() [...] // 潜在的解密器

    public final boolean g() [...] // 潜在的解密器

    private final void h() {
        this.i();
        OSFocusHandler.d = false;
    }

    private final void i() {
        OSFocusHandler.c = false;
        Runnable runnable0 = this.a;
        if(runnable0 != null) {
            x1.b().a(runnable0);
        }
    }

    public final void j() {
        this.h();
        I1.p1(C.k, "OSFocusHandler running onAppFocus");
        I1.k1();
    }

    public final void k(String s, long v, Context context0) {
        k.e(s, "tag");
        k.e(context0, "context");
        c c0 = this.d();
        v v1 = ((androidx.work.m.a)((androidx.work.m.a)((androidx.work.m.a)new androidx.work.m.a(OnLostFocusWorker.class).i(c0)).k(v, TimeUnit.MILLISECONDS)).a(s)).b();
        k.d(v1, "Builder(OnLostFocusWorke…tag)\n            .build()");
        F1.a(context0).d(s, e.g, ((m)v1));
    }

    public final void l() {
        if(OSFocusHandler.c) {
            OSFocusHandler.c = false;
            this.a = null;
            I1.p1(C.k, "OSFocusHandler running onAppStartFocusLogic");
            I1.n1();
            return;
        }
        this.i();
    }

    public final void m() {
        x0 x00 = new x0();
        x1.b().c(1500L, x00);
        this.a = x00;
    }

    private static final void n() {
        OSFocusHandler.c = true;
        I1.p1(C.k, "OSFocusHandler setting stop state: true");
    }
}

