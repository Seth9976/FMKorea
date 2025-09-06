package androidx.work.impl;

import android.content.Context;
import g0.t;
import g0.u;
import h0.b;
import java.util.concurrent.Executor;
import x0.e;
import x0.o;
import x0.r;
import x0.v;
import x0.z;
import z3.g;
import z3.k;

public abstract class WorkDatabase extends u {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final WorkDatabase b(Context context0, Executor executor0, boolean z) {
            k.e(context0, "context");
            k.e(executor0, "queryExecutor");
            return z ? ((WorkDatabase)t.c(context0, WorkDatabase.class).c().g(executor0).a(c.a).b(new b[]{i.c}).b(new b[]{new s(context0, 2, 3)}).b(new b[]{j.c}).b(new b[]{androidx.work.impl.k.c}).b(new b[]{new s(context0, 5, 6)}).b(new b[]{l.c}).b(new b[]{m.c}).b(new b[]{n.c}).b(new b[]{new G(context0)}).b(new b[]{new s(context0, 10, 11)}).b(new b[]{f.c}).b(new b[]{androidx.work.impl.g.c}).b(new b[]{h.c}).e().d()) : ((WorkDatabase)t.a(context0, WorkDatabase.class, "androidx.work.workdb").f((k0.h.b h$b0) -> {
                k.e(context0, "$context");
                k.e(h$b0, "configuration");
                k0.h.b.a h$b$a0 = k0.h.b.f.a(context0);
                h$b$a0.d(h$b0.b).c(h$b0.c).e(true).a(true);
                return new l0.f().a(h$b$a0.b());
            }).g(executor0).a(c.a).b(new b[]{i.c}).b(new b[]{new s(context0, 2, 3)}).b(new b[]{j.c}).b(new b[]{androidx.work.impl.k.c}).b(new b[]{new s(context0, 5, 6)}).b(new b[]{l.c}).b(new b[]{m.c}).b(new b[]{n.c}).b(new b[]{new G(context0)}).b(new b[]{new s(context0, 10, 11)}).b(new b[]{f.c}).b(new b[]{androidx.work.impl.g.c}).b(new b[]{h.c}).e().d());
        }

        // 检测为 Lambda 实现
        private static final k0.h c(Context context0, k0.h.b h$b0) [...]
    }

    public static final a p;

    static {
        WorkDatabase.p = new a(null);
    }

    public static final WorkDatabase C(Context context0, Executor executor0, boolean z) {
        return WorkDatabase.p.b(context0, executor0, z);
    }

    public abstract x0.b D();

    public abstract e E();

    public abstract x0.j F();

    public abstract o G();

    public abstract r H();

    public abstract v I();

    public abstract z J();
}

