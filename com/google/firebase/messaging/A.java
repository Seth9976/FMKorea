package com.google.firebase.messaging;

import androidx.appcompat.app.E;
import u2.c;
import u2.d;
import u2.e;

public final class a implements v2.a {
    static final class com.google.firebase.messaging.a.a implements d {
        static final com.google.firebase.messaging.a.a a;
        private static final c b;
        private static final c c;
        private static final c d;
        private static final c e;
        private static final c f;
        private static final c g;
        private static final c h;
        private static final c i;
        private static final c j;
        private static final c k;
        private static final c l;
        private static final c m;
        private static final c n;
        private static final c o;
        private static final c p;

        static {
            com.google.firebase.messaging.a.a.a = new com.google.firebase.messaging.a.a();
            com.google.firebase.messaging.a.a.b = c.a("projectNumber").b(x2.a.b().c(1).a()).a();
            com.google.firebase.messaging.a.a.c = c.a("messageId").b(x2.a.b().c(2).a()).a();
            com.google.firebase.messaging.a.a.d = c.a("instanceId").b(x2.a.b().c(3).a()).a();
            com.google.firebase.messaging.a.a.e = c.a("messageType").b(x2.a.b().c(4).a()).a();
            com.google.firebase.messaging.a.a.f = c.a("sdkPlatform").b(x2.a.b().c(5).a()).a();
            com.google.firebase.messaging.a.a.g = c.a("packageName").b(x2.a.b().c(6).a()).a();
            com.google.firebase.messaging.a.a.h = c.a("collapseKey").b(x2.a.b().c(7).a()).a();
            com.google.firebase.messaging.a.a.i = c.a("priority").b(x2.a.b().c(8).a()).a();
            com.google.firebase.messaging.a.a.j = c.a("ttl").b(x2.a.b().c(9).a()).a();
            com.google.firebase.messaging.a.a.k = c.a("topic").b(x2.a.b().c(10).a()).a();
            com.google.firebase.messaging.a.a.l = c.a("bulkId").b(x2.a.b().c(11).a()).a();
            com.google.firebase.messaging.a.a.m = c.a("event").b(x2.a.b().c(12).a()).a();
            com.google.firebase.messaging.a.a.n = c.a("analyticsLabel").b(x2.a.b().c(13).a()).a();
            com.google.firebase.messaging.a.a.o = c.a("campaignId").b(x2.a.b().c(14).a()).a();
            com.google.firebase.messaging.a.a.p = c.a("composerLabel").b(x2.a.b().c(15).a()).a();
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            this.b(((H2.a)object0), ((e)object1));
        }

        public void b(H2.a a0, e e0) {
            e0.d(com.google.firebase.messaging.a.a.b, a0.l());
            e0.e(com.google.firebase.messaging.a.a.c, a0.h());
            e0.e(com.google.firebase.messaging.a.a.d, a0.g());
            e0.e(com.google.firebase.messaging.a.a.e, a0.i());
            e0.e(com.google.firebase.messaging.a.a.f, a0.m());
            e0.e(com.google.firebase.messaging.a.a.g, a0.j());
            e0.e(com.google.firebase.messaging.a.a.h, a0.d());
            e0.c(com.google.firebase.messaging.a.a.i, a0.k());
            e0.c(com.google.firebase.messaging.a.a.j, a0.o());
            e0.e(com.google.firebase.messaging.a.a.k, a0.n());
            e0.d(com.google.firebase.messaging.a.a.l, a0.b());
            e0.e(com.google.firebase.messaging.a.a.m, a0.f());
            e0.e(com.google.firebase.messaging.a.a.n, a0.a());
            e0.d(com.google.firebase.messaging.a.a.o, a0.c());
            e0.e(com.google.firebase.messaging.a.a.p, a0.e());
        }
    }

    static final class b implements d {
        static final b a;
        private static final c b;

        static {
            b.a = new b();
            b.b = c.a("messagingClientEvent").b(x2.a.b().c(1).a()).a();
        }

        // 检测为 Lambda 实现
        @Override  // u2.d
        public void a(Object object0, Object object1) [...]

        public void b(H2.b b0, e e0) {
            H2.a a0 = b0.a();
            e0.e(b.b, a0);
        }
    }

    static final class com.google.firebase.messaging.a.c implements d {
        static final com.google.firebase.messaging.a.c a;
        private static final c b;

        static {
            com.google.firebase.messaging.a.c.a = new com.google.firebase.messaging.a.c();
            com.google.firebase.messaging.a.c.b = c.d("messagingClientEventExtension");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            E.a(object0);
            this.b(null, ((e)object1));
        }

        public void b(H h0, e e0) {
            throw null;
        }
    }

    public static final v2.a a;

    static {
        a.a = new a();
    }

    @Override  // v2.a
    public void a(v2.b b0) {
        b0.a(H.class, com.google.firebase.messaging.a.c.a);
        b0.a(H2.b.class, (Object object0, Object object1) -> this.b(((H2.b)object0), ((e)object1)));
        b0.a(H2.a.class, com.google.firebase.messaging.a.a.a);
    }
}

