package com.google.firebase.ktx;

import I3.F;
import I3.i0;
import androidx.annotation.Keep;
import c2.c;
import com.google.firebase.components.ComponentRegistrar;
import d2.e;
import d2.h;
import d2.r;
import java.util.List;
import java.util.concurrent.Executor;
import m3.o;
import z3.k;

@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        public static final class a implements h {
            public static final a a;

            static {
                a.a = new a();
            }

            // 检测为 Lambda 实现
            @Override  // d2.h
            public Object a(e e0) [...]

            public final F b(e e0) {
                Object object0 = e0.g(d2.F.a(c2.a.class, Executor.class));
                k.d(object0, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return i0.a(((Executor)object0));
            }
        }


        public static final class b implements h {
            public static final b a;

            static {
                b.a = new b();
            }

            // 检测为 Lambda 实现
            @Override  // d2.h
            public Object a(e e0) [...]

            public final F b(e e0) {
                Object object0 = e0.g(d2.F.a(c.class, Executor.class));
                k.d(object0, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return i0.a(((Executor)object0));
            }
        }


        public static final class com.google.firebase.ktx.FirebaseCommonKtxRegistrar.c implements h {
            public static final com.google.firebase.ktx.FirebaseCommonKtxRegistrar.c a;

            static {
                com.google.firebase.ktx.FirebaseCommonKtxRegistrar.c.a = new com.google.firebase.ktx.FirebaseCommonKtxRegistrar.c();
            }

            // 检测为 Lambda 实现
            @Override  // d2.h
            public Object a(e e0) [...]

            public final F b(e e0) {
                Object object0 = e0.g(d2.F.a(c2.b.class, Executor.class));
                k.d(object0, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return i0.a(((Executor)object0));
            }
        }


        public static final class d implements h {
            public static final d a;

            static {
                d.a = new d();
            }

            // 检测为 Lambda 实现
            @Override  // d2.h
            public Object a(e e0) [...]

            public final F b(e e0) {
                Object object0 = e0.g(d2.F.a(c2.d.class, Executor.class));
                k.d(object0, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return i0.a(((Executor)object0));
            }
        }

        d2.c c0 = d2.c.c(d2.F.a(c2.a.class, F.class)).b(r.j(d2.F.a(c2.a.class, Executor.class))).f((e e0) -> this.b(e0)).d();
        k.d(c0, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        d2.c c1 = d2.c.c(d2.F.a(c.class, F.class)).b(r.j(d2.F.a(c.class, Executor.class))).f((e e0) -> this.b(e0)).d();
        k.d(c1, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        d2.c c2 = d2.c.c(d2.F.a(c2.b.class, F.class)).b(r.j(d2.F.a(c2.b.class, Executor.class))).f((e e0) -> this.b(e0)).d();
        k.d(c2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        d2.c c3 = d2.c.c(d2.F.a(c2.d.class, F.class)).b(r.j(d2.F.a(c2.d.class, Executor.class))).f((e e0) -> this.b(e0)).d();
        k.d(c3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return o.k(new d2.c[]{c0, c1, c2, c3});
    }
}

