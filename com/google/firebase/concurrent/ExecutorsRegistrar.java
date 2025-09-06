package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.ThreadPolicy;
import c2.a;
import com.google.firebase.components.ComponentRegistrar;
import d2.F;
import d2.x;
import e2.b;
import e2.c;
import e2.d;
import e2.e;
import e2.f;
import e2.g;
import e2.h;
import e2.i;
import e2.l;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final x a;
    static final x b;
    static final x c;
    static final x d;

    static {
        ExecutorsRegistrar.a = new x(new b());
        ExecutorsRegistrar.b = new x(new c());
        ExecutorsRegistrar.c = new x(new d());
        ExecutorsRegistrar.d = new x(new e());
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(new d2.c[]{d2.c.d(F.a(a.class, ScheduledExecutorService.class), new F[]{F.a(a.class, ExecutorService.class), F.a(a.class, Executor.class)}).f(new f()).d(), d2.c.d(F.a(c2.b.class, ScheduledExecutorService.class), new F[]{F.a(c2.b.class, ExecutorService.class), F.a(c2.b.class, Executor.class)}).f(new g()).d(), d2.c.d(F.a(c2.c.class, ScheduledExecutorService.class), new F[]{F.a(c2.c.class, ExecutorService.class), F.a(c2.c.class, Executor.class)}).f(new h()).d(), d2.c.c(F.a(c2.d.class, Executor.class)).f(new i()).d()});
    }

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder strictMode$ThreadPolicy$Builder0 = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int v = Build.VERSION.SDK_INT;
        strictMode$ThreadPolicy$Builder0.detectResourceMismatches();
        if(v >= 26) {
            e2.a.a(strictMode$ThreadPolicy$Builder0);
        }
        return strictMode$ThreadPolicy$Builder0.penaltyLog().build();
    }

    private static ThreadFactory j(String s, int v) {
        return new com.google.firebase.concurrent.b(s, v, null);
    }

    private static ThreadFactory k(String s, int v, StrictMode.ThreadPolicy strictMode$ThreadPolicy0) {
        return new com.google.firebase.concurrent.b(s, v, strictMode$ThreadPolicy0);
    }

    private static ScheduledExecutorService l(d2.e e0) {
        return (ScheduledExecutorService)ExecutorsRegistrar.a.get();
    }

    private static ScheduledExecutorService m(d2.e e0) {
        return (ScheduledExecutorService)ExecutorsRegistrar.c.get();
    }

    private static ScheduledExecutorService n(d2.e e0) {
        return (ScheduledExecutorService)ExecutorsRegistrar.b.get();
    }

    private static Executor o(d2.e e0) {
        return l.f;
    }

    private static ScheduledExecutorService p() {
        return ExecutorsRegistrar.u(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
    }

    private static ScheduledExecutorService q() {
        return ExecutorsRegistrar.u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.t())));
    }

    private static ScheduledExecutorService r() {
        return ExecutorsRegistrar.u(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
    }

    private static ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService0) {
        return new o(executorService0, ((ScheduledExecutorService)ExecutorsRegistrar.d.get()));
    }
}

