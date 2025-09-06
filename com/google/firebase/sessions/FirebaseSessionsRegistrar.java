package com.google.firebase.sessions;

import J2.h;
import K2.k;
import a2.e;
import androidx.annotation.Keep;
import c2.b;
import com.google.firebase.components.ComponentRegistrar;
import d2.F;
import d2.c;
import d2.r;
import java.util.List;
import m3.o;
import z3.g;

@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    public static final a Companion = null;
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final F backgroundDispatcher;
    private static final F blockingDispatcher;
    private static final F firebaseApp;
    private static final F firebaseInstallationsApi;
    private static final F transportFactory;

    static {
        FirebaseSessionsRegistrar.Companion = new a(null);
        FirebaseSessionsRegistrar.firebaseApp = F.b(e.class);
        FirebaseSessionsRegistrar.firebaseInstallationsApi = F.b(C2.e.class);
        FirebaseSessionsRegistrar.backgroundDispatcher = F.a(c2.a.class, I3.F.class);
        FirebaseSessionsRegistrar.blockingDispatcher = F.a(b.class, I3.F.class);
        FirebaseSessionsRegistrar.transportFactory = F.b(k1.g.class);
    }

    // 检测为 Lambda 实现
    public static k a(d2.e e0) [...]

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return o.k(new c[]{c.e(k.class).h("fire-sessions").b(r.j(FirebaseSessionsRegistrar.firebaseApp)).b(r.j(FirebaseSessionsRegistrar.firebaseInstallationsApi)).b(r.j(FirebaseSessionsRegistrar.backgroundDispatcher)).b(r.j(FirebaseSessionsRegistrar.blockingDispatcher)).b(r.l(FirebaseSessionsRegistrar.transportFactory)).f((d2.e e0) -> FirebaseSessionsRegistrar.getComponents$lambda-0(e0)).d(), h.b("fire-sessions", "1.0.0")});
    }

    private static final k getComponents$lambda-0(d2.e e0) {
        Object object0 = e0.g(FirebaseSessionsRegistrar.firebaseApp);
        z3.k.d(object0, "container.get(firebaseApp)");
        Object object1 = e0.g(FirebaseSessionsRegistrar.firebaseInstallationsApi);
        z3.k.d(object1, "container.get(firebaseInstallationsApi)");
        Object object2 = e0.g(FirebaseSessionsRegistrar.backgroundDispatcher);
        z3.k.d(object2, "container.get(backgroundDispatcher)");
        Object object3 = e0.g(FirebaseSessionsRegistrar.blockingDispatcher);
        z3.k.d(object3, "container.get(blockingDispatcher)");
        B2.b b0 = e0.b(FirebaseSessionsRegistrar.transportFactory);
        z3.k.d(b0, "container.getProvider(transportFactory)");
        return new k(((e)object0), ((C2.e)object1), ((I3.F)object2), ((I3.F)object3), b0);
    }
}

