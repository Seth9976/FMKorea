package com.google.firebase.installations;

import C2.e;
import androidx.annotation.Keep;
import c2.a;
import c2.b;
import com.google.firebase.components.ComponentRegistrar;
import d2.F;
import d2.c;
import d2.r;
import e2.j;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import z2.h;
import z2.i;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    // 检测为 Lambda 实现
    public static e a(d2.e e0) [...]

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(new c[]{c.e(e.class).h("fire-installations").b(r.k(a2.e.class)).b(r.i(i.class)).b(r.j(F.a(a.class, ExecutorService.class))).b(r.j(F.a(b.class, Executor.class))).f((d2.e e0) -> FirebaseInstallationsRegistrar.lambda$getComponents$0(e0)).d(), h.a(), J2.h.b("fire-installations", "17.1.3")});
    }

    private static e lambda$getComponents$0(d2.e e0) {
        return new com.google.firebase.installations.c(((a2.e)e0.a(a2.e.class)), e0.c(i.class), ((ExecutorService)e0.g(F.a(a.class, ExecutorService.class))), j.a(((Executor)e0.g(F.a(b.class, Executor.class)))));
    }
}

