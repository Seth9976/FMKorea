package l2;

import androidx.appcompat.app.E;
import u2.c;
import u2.d;
import u2.e;

public final class a implements v2.a {
    static final class l2.a.a implements d {
        static final l2.a.a a;
        private static final c b;
        private static final c c;
        private static final c d;

        static {
            l2.a.a.a = new l2.a.a();
            l2.a.a.b = c.d("arch");
            l2.a.a.c = c.d("libraryName");
            l2.a.a.d = c.d("buildId");
        }

        // 检测为 Lambda 实现
        @Override  // u2.d
        public void a(Object object0, Object object1) [...]

        public void b(l2.B.a.a b$a$a0, e e0) {
            String s = b$a$a0.b();
            e0.e(l2.a.a.b, s);
            String s1 = b$a$a0.d();
            e0.e(l2.a.a.c, s1);
            String s2 = b$a$a0.c();
            e0.e(l2.a.a.d, s2);
        }
    }

    static final class b implements d {
        static final b a;
        private static final c b;
        private static final c c;
        private static final c d;
        private static final c e;
        private static final c f;
        private static final c g;
        private static final c h;
        private static final c i;
        private static final c j;

        static {
            b.a = new b();
            b.b = c.d("pid");
            b.c = c.d("processName");
            b.d = c.d("reasonCode");
            b.e = c.d("importance");
            b.f = c.d("pss");
            b.g = c.d("rss");
            b.h = c.d("timestamp");
            b.i = c.d("traceFile");
            b.j = c.d("buildIdMappingForArch");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            this.b(((l2.B.a)object0), ((e)object1));
        }

        public void b(l2.B.a b$a0, e e0) {
            int v = b$a0.d();
            e0.c(b.b, v);
            String s = b$a0.e();
            e0.e(b.c, s);
            int v1 = b$a0.g();
            e0.c(b.d, v1);
            int v2 = b$a0.c();
            e0.c(b.e, v2);
            long v3 = b$a0.f();
            e0.d(b.f, v3);
            long v4 = b$a0.h();
            e0.d(b.g, v4);
            long v5 = b$a0.i();
            e0.d(b.h, v5);
            String s1 = b$a0.j();
            e0.e(b.i, s1);
            C c0 = b$a0.b();
            e0.e(b.j, c0);
        }
    }

    static final class l2.a.c implements d {
        static final l2.a.c a;
        private static final c b;
        private static final c c;

        static {
            l2.a.c.a = new l2.a.c();
            l2.a.c.b = c.d("key");
            l2.a.c.c = c.d("value");
        }

        // 检测为 Lambda 实现
        @Override  // u2.d
        public void a(Object object0, Object object1) [...]

        public void b(l2.B.c b$c0, e e0) {
            String s = b$c0.b();
            e0.e(l2.a.c.b, s);
            String s1 = b$c0.c();
            e0.e(l2.a.c.c, s1);
        }
    }

    static final class l2.a.d implements d {
        static final l2.a.d a;
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

        static {
            l2.a.d.a = new l2.a.d();
            l2.a.d.b = c.d("sdkVersion");
            l2.a.d.c = c.d("gmpAppId");
            l2.a.d.d = c.d("platform");
            l2.a.d.e = c.d("installationUuid");
            l2.a.d.f = c.d("firebaseInstallationId");
            l2.a.d.g = c.d("buildVersion");
            l2.a.d.h = c.d("displayVersion");
            l2.a.d.i = c.d("session");
            l2.a.d.j = c.d("ndkPayload");
            l2.a.d.k = c.d("appExitInfo");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            this.b(((B)object0), ((e)object1));
        }

        public void b(B b0, e e0) {
            String s = b0.k();
            e0.e(l2.a.d.b, s);
            String s1 = b0.g();
            e0.e(l2.a.d.c, s1);
            int v = b0.j();
            e0.c(l2.a.d.d, v);
            String s2 = b0.h();
            e0.e(l2.a.d.e, s2);
            String s3 = b0.f();
            e0.e(l2.a.d.f, s3);
            String s4 = b0.d();
            e0.e(l2.a.d.g, s4);
            String s5 = b0.e();
            e0.e(l2.a.d.h, s5);
            l2.B.e b$e0 = b0.l();
            e0.e(l2.a.d.i, b$e0);
            l2.B.d b$d0 = b0.i();
            e0.e(l2.a.d.j, b$d0);
            l2.B.a b$a0 = b0.c();
            e0.e(l2.a.d.k, b$a0);
        }
    }

    static final class l2.a.e implements d {
        static final l2.a.e a;
        private static final c b;
        private static final c c;

        static {
            l2.a.e.a = new l2.a.e();
            l2.a.e.b = c.d("files");
            l2.a.e.c = c.d("orgId");
        }

        // 检测为 Lambda 实现
        @Override  // u2.d
        public void a(Object object0, Object object1) [...]

        public void b(l2.B.d b$d0, e e0) {
            C c0 = b$d0.b();
            e0.e(l2.a.e.b, c0);
            String s = b$d0.c();
            e0.e(l2.a.e.c, s);
        }
    }

    static final class f implements d {
        static final f a;
        private static final c b;
        private static final c c;

        static {
            f.a = new f();
            f.b = c.d("filename");
            f.c = c.d("contents");
        }

        // 检测为 Lambda 实现
        @Override  // u2.d
        public void a(Object object0, Object object1) [...]

        public void b(l2.B.d.b b$d$b0, e e0) {
            String s = b$d$b0.c();
            e0.e(f.b, s);
            byte[] arr_b = b$d$b0.b();
            e0.e(f.c, arr_b);
        }
    }

    static final class g implements d {
        static final g a;
        private static final c b;
        private static final c c;
        private static final c d;
        private static final c e;
        private static final c f;
        private static final c g;
        private static final c h;

        static {
            g.a = new g();
            g.b = c.d("identifier");
            g.c = c.d("version");
            g.d = c.d("displayVersion");
            g.e = c.d("organization");
            g.f = c.d("installationUuid");
            g.g = c.d("developmentPlatform");
            g.h = c.d("developmentPlatformVersion");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            this.b(((l2.B.e.a)object0), ((e)object1));
        }

        public void b(l2.B.e.a b$e$a0, e e0) {
            String s = b$e$a0.e();
            e0.e(g.b, s);
            String s1 = b$e$a0.h();
            e0.e(g.c, s1);
            String s2 = b$e$a0.d();
            e0.e(g.d, s2);
            b$e$a0.g();
            e0.e(g.e, null);
            String s3 = b$e$a0.f();
            e0.e(g.f, s3);
            String s4 = b$e$a0.b();
            e0.e(g.g, s4);
            String s5 = b$e$a0.c();
            e0.e(g.h, s5);
        }
    }

    static final class h implements d {
        static final h a;
        private static final c b;

        static {
            h.a = new h();
            h.b = c.d("clsId");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            E.a(object0);
            this.b(null, ((e)object1));
        }

        public void b(l2.B.e.a.b b$e$a$b0, e e0) {
            throw null;
        }
    }

    static final class i implements d {
        static final i a;
        private static final c b;
        private static final c c;
        private static final c d;
        private static final c e;
        private static final c f;
        private static final c g;
        private static final c h;
        private static final c i;
        private static final c j;

        static {
            i.a = new i();
            i.b = c.d("arch");
            i.c = c.d("model");
            i.d = c.d("cores");
            i.e = c.d("ram");
            i.f = c.d("diskSpace");
            i.g = c.d("simulator");
            i.h = c.d("state");
            i.i = c.d("manufacturer");
            i.j = c.d("modelClass");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            this.b(((l2.B.e.c)object0), ((e)object1));
        }

        public void b(l2.B.e.c b$e$c0, e e0) {
            int v = b$e$c0.b();
            e0.c(i.b, v);
            String s = b$e$c0.f();
            e0.e(i.c, s);
            int v1 = b$e$c0.c();
            e0.c(i.d, v1);
            long v2 = b$e$c0.h();
            e0.d(i.e, v2);
            long v3 = b$e$c0.d();
            e0.d(i.f, v3);
            boolean z = b$e$c0.j();
            e0.a(i.g, z);
            int v4 = b$e$c0.i();
            e0.c(i.h, v4);
            String s1 = b$e$c0.e();
            e0.e(i.i, s1);
            String s2 = b$e$c0.g();
            e0.e(i.j, s2);
        }
    }

    static final class j implements d {
        static final j a;
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

        static {
            j.a = new j();
            j.b = c.d("generator");
            j.c = c.d("identifier");
            j.d = c.d("appQualitySessionId");
            j.e = c.d("startedAt");
            j.f = c.d("endedAt");
            j.g = c.d("crashed");
            j.h = c.d("app");
            j.i = c.d("user");
            j.j = c.d("os");
            j.k = c.d("device");
            j.l = c.d("events");
            j.m = c.d("generatorType");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            this.b(((l2.B.e)object0), ((e)object1));
        }

        public void b(l2.B.e b$e0, e e0) {
            String s = b$e0.g();
            e0.e(j.b, s);
            byte[] arr_b = b$e0.j();
            e0.e(j.c, arr_b);
            String s1 = b$e0.c();
            e0.e(j.d, s1);
            long v = b$e0.l();
            e0.d(j.e, v);
            Long long0 = b$e0.e();
            e0.e(j.f, long0);
            boolean z = b$e0.n();
            e0.a(j.g, z);
            l2.B.e.a b$e$a0 = b$e0.b();
            e0.e(j.h, b$e$a0);
            l2.B.e.f b$e$f0 = b$e0.m();
            e0.e(j.i, b$e$f0);
            l2.B.e.e b$e$e0 = b$e0.k();
            e0.e(j.j, b$e$e0);
            l2.B.e.c b$e$c0 = b$e0.d();
            e0.e(j.k, b$e$c0);
            C c0 = b$e0.f();
            e0.e(j.l, c0);
            int v1 = b$e0.h();
            e0.c(j.m, v1);
        }
    }

    static final class k implements d {
        static final k a;
        private static final c b;
        private static final c c;
        private static final c d;
        private static final c e;
        private static final c f;

        static {
            k.a = new k();
            k.b = c.d("execution");
            k.c = c.d("customAttributes");
            k.d = c.d("internalKeys");
            k.e = c.d("background");
            k.f = c.d("uiOrientation");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            this.b(((l2.B.e.d.a)object0), ((e)object1));
        }

        public void b(l2.B.e.d.a b$e$d$a0, e e0) {
            l2.B.e.d.a.b b$e$d$a$b0 = b$e$d$a0.d();
            e0.e(k.b, b$e$d$a$b0);
            C c0 = b$e$d$a0.c();
            e0.e(k.c, c0);
            C c1 = b$e$d$a0.e();
            e0.e(k.d, c1);
            Boolean boolean0 = b$e$d$a0.b();
            e0.e(k.e, boolean0);
            int v = b$e$d$a0.f();
            e0.c(k.f, v);
        }
    }

    static final class l implements d {
        static final l a;
        private static final c b;
        private static final c c;
        private static final c d;
        private static final c e;

        static {
            l.a = new l();
            l.b = c.d("baseAddress");
            l.c = c.d("size");
            l.d = c.d("name");
            l.e = c.d("uuid");
        }

        // 检测为 Lambda 实现
        @Override  // u2.d
        public void a(Object object0, Object object1) [...]

        public void b(l2.B.e.d.a.b.a b$e$d$a$b$a0, e e0) {
            long v = b$e$d$a$b$a0.b();
            e0.d(l.b, v);
            long v1 = b$e$d$a$b$a0.d();
            e0.d(l.c, v1);
            String s = b$e$d$a$b$a0.c();
            e0.e(l.d, s);
            byte[] arr_b = b$e$d$a$b$a0.f();
            e0.e(l.e, arr_b);
        }
    }

    static final class m implements d {
        static final m a;
        private static final c b;
        private static final c c;
        private static final c d;
        private static final c e;
        private static final c f;

        static {
            m.a = new m();
            m.b = c.d("threads");
            m.c = c.d("exception");
            m.d = c.d("appExitInfo");
            m.e = c.d("signal");
            m.f = c.d("binaries");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            this.b(((l2.B.e.d.a.b)object0), ((e)object1));
        }

        public void b(l2.B.e.d.a.b b$e$d$a$b0, e e0) {
            C c0 = b$e$d$a$b0.f();
            e0.e(m.b, c0);
            l2.B.e.d.a.b.c b$e$d$a$b$c0 = b$e$d$a$b0.d();
            e0.e(m.c, b$e$d$a$b$c0);
            l2.B.a b$a0 = b$e$d$a$b0.b();
            e0.e(m.d, b$a0);
            l2.B.e.d.a.b.d b$e$d$a$b$d0 = b$e$d$a$b0.e();
            e0.e(m.e, b$e$d$a$b$d0);
            C c1 = b$e$d$a$b0.c();
            e0.e(m.f, c1);
        }
    }

    static final class n implements d {
        static final n a;
        private static final c b;
        private static final c c;
        private static final c d;
        private static final c e;
        private static final c f;

        static {
            n.a = new n();
            n.b = c.d("type");
            n.c = c.d("reason");
            n.d = c.d("frames");
            n.e = c.d("causedBy");
            n.f = c.d("overflowCount");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            this.b(((l2.B.e.d.a.b.c)object0), ((e)object1));
        }

        public void b(l2.B.e.d.a.b.c b$e$d$a$b$c0, e e0) {
            String s = b$e$d$a$b$c0.f();
            e0.e(n.b, s);
            String s1 = b$e$d$a$b$c0.e();
            e0.e(n.c, s1);
            C c0 = b$e$d$a$b$c0.c();
            e0.e(n.d, c0);
            l2.B.e.d.a.b.c b$e$d$a$b$c1 = b$e$d$a$b$c0.b();
            e0.e(n.e, b$e$d$a$b$c1);
            int v = b$e$d$a$b$c0.d();
            e0.c(n.f, v);
        }
    }

    static final class o implements d {
        static final o a;
        private static final c b;
        private static final c c;
        private static final c d;

        static {
            o.a = new o();
            o.b = c.d("name");
            o.c = c.d("code");
            o.d = c.d("address");
        }

        // 检测为 Lambda 实现
        @Override  // u2.d
        public void a(Object object0, Object object1) [...]

        public void b(l2.B.e.d.a.b.d b$e$d$a$b$d0, e e0) {
            String s = b$e$d$a$b$d0.d();
            e0.e(o.b, s);
            String s1 = b$e$d$a$b$d0.c();
            e0.e(o.c, s1);
            long v = b$e$d$a$b$d0.b();
            e0.d(o.d, v);
        }
    }

    static final class p implements d {
        static final p a;
        private static final c b;
        private static final c c;
        private static final c d;

        static {
            p.a = new p();
            p.b = c.d("name");
            p.c = c.d("importance");
            p.d = c.d("frames");
        }

        // 检测为 Lambda 实现
        @Override  // u2.d
        public void a(Object object0, Object object1) [...]

        public void b(l2.B.e.d.a.b.e b$e$d$a$b$e0, e e0) {
            String s = b$e$d$a$b$e0.d();
            e0.e(p.b, s);
            int v = b$e$d$a$b$e0.c();
            e0.c(p.c, v);
            C c0 = b$e$d$a$b$e0.b();
            e0.e(p.d, c0);
        }
    }

    static final class q implements d {
        static final q a;
        private static final c b;
        private static final c c;
        private static final c d;
        private static final c e;
        private static final c f;

        static {
            q.a = new q();
            q.b = c.d("pc");
            q.c = c.d("symbol");
            q.d = c.d("file");
            q.e = c.d("offset");
            q.f = c.d("importance");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            this.b(((l2.B.e.d.a.b.e.b)object0), ((e)object1));
        }

        public void b(l2.B.e.d.a.b.e.b b$e$d$a$b$e$b0, e e0) {
            long v = b$e$d$a$b$e$b0.e();
            e0.d(q.b, v);
            String s = b$e$d$a$b$e$b0.f();
            e0.e(q.c, s);
            String s1 = b$e$d$a$b$e$b0.b();
            e0.e(q.d, s1);
            long v1 = b$e$d$a$b$e$b0.d();
            e0.d(q.e, v1);
            int v2 = b$e$d$a$b$e$b0.c();
            e0.c(q.f, v2);
        }
    }

    static final class r implements d {
        static final r a;
        private static final c b;
        private static final c c;
        private static final c d;
        private static final c e;
        private static final c f;
        private static final c g;

        static {
            r.a = new r();
            r.b = c.d("batteryLevel");
            r.c = c.d("batteryVelocity");
            r.d = c.d("proximityOn");
            r.e = c.d("orientation");
            r.f = c.d("ramUsed");
            r.g = c.d("diskUsed");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            this.b(((l2.B.e.d.c)object0), ((e)object1));
        }

        public void b(l2.B.e.d.c b$e$d$c0, e e0) {
            Double double0 = b$e$d$c0.b();
            e0.e(r.b, double0);
            int v = b$e$d$c0.c();
            e0.c(r.c, v);
            boolean z = b$e$d$c0.g();
            e0.a(r.d, z);
            int v1 = b$e$d$c0.e();
            e0.c(r.e, v1);
            long v2 = b$e$d$c0.f();
            e0.d(r.f, v2);
            long v3 = b$e$d$c0.d();
            e0.d(r.g, v3);
        }
    }

    static final class s implements d {
        static final s a;
        private static final c b;
        private static final c c;
        private static final c d;
        private static final c e;
        private static final c f;

        static {
            s.a = new s();
            s.b = c.d("timestamp");
            s.c = c.d("type");
            s.d = c.d("app");
            s.e = c.d("device");
            s.f = c.d("log");
        }

        @Override  // u2.d
        public void a(Object object0, Object object1) {
            this.b(((l2.B.e.d)object0), ((e)object1));
        }

        public void b(l2.B.e.d b$e$d0, e e0) {
            long v = b$e$d0.e();
            e0.d(s.b, v);
            String s = b$e$d0.f();
            e0.e(s.c, s);
            l2.B.e.d.a b$e$d$a0 = b$e$d0.b();
            e0.e(s.d, b$e$d$a0);
            l2.B.e.d.c b$e$d$c0 = b$e$d0.c();
            e0.e(s.e, b$e$d$c0);
            l2.B.e.d.d b$e$d$d0 = b$e$d0.d();
            e0.e(s.f, b$e$d$d0);
        }
    }

    static final class t implements d {
        static final t a;
        private static final c b;

        static {
            t.a = new t();
            t.b = c.d("content");
        }

        // 检测为 Lambda 实现
        @Override  // u2.d
        public void a(Object object0, Object object1) [...]

        public void b(l2.B.e.d.d b$e$d$d0, e e0) {
            String s = b$e$d$d0.b();
            e0.e(t.b, s);
        }
    }

    static final class u implements d {
        static final u a;
        private static final c b;
        private static final c c;
        private static final c d;
        private static final c e;

        static {
            u.a = new u();
            u.b = c.d("platform");
            u.c = c.d("version");
            u.d = c.d("buildVersion");
            u.e = c.d("jailbroken");
        }

        // 检测为 Lambda 实现
        @Override  // u2.d
        public void a(Object object0, Object object1) [...]

        public void b(l2.B.e.e b$e$e0, e e0) {
            int v = b$e$e0.c();
            e0.c(u.b, v);
            String s = b$e$e0.d();
            e0.e(u.c, s);
            String s1 = b$e$e0.b();
            e0.e(u.d, s1);
            boolean z = b$e$e0.e();
            e0.a(u.e, z);
        }
    }

    static final class v implements d {
        static final v a;
        private static final c b;

        static {
            v.a = new v();
            v.b = c.d("identifier");
        }

        // 检测为 Lambda 实现
        @Override  // u2.d
        public void a(Object object0, Object object1) [...]

        public void b(l2.B.e.f b$e$f0, e e0) {
            String s = b$e$f0.b();
            e0.e(v.b, s);
        }
    }

    public static final v2.a a;

    static {
        a.a = new a();
    }

    @Override  // v2.a
    public void a(v2.b b0) {
        b0.a(B.class, l2.a.d.a);
        b0.a(l2.b.class, l2.a.d.a);
        b0.a(l2.B.e.class, j.a);
        b0.a(l2.h.class, j.a);
        b0.a(l2.B.e.a.class, g.a);
        b0.a(l2.i.class, g.a);
        b0.a(l2.B.e.a.b.class, h.a);
        b0.a(l2.j.class, h.a);
        b0.a(l2.B.e.f.class, (Object object0, Object object1) -> this.b(((l2.B.e.f)object0), ((e)object1)));
        b0.a(w.class, (Object object0, Object object1) -> this.b(((l2.B.e.f)object0), ((e)object1)));
        b0.a(l2.B.e.e.class, (Object object0, Object object1) -> this.b(((l2.B.e.e)object0), ((e)object1)));
        b0.a(l2.v.class, (Object object0, Object object1) -> this.b(((l2.B.e.e)object0), ((e)object1)));
        b0.a(l2.B.e.c.class, i.a);
        b0.a(l2.k.class, i.a);
        b0.a(l2.B.e.d.class, s.a);
        b0.a(l2.l.class, s.a);
        b0.a(l2.B.e.d.a.class, k.a);
        b0.a(l2.m.class, k.a);
        b0.a(l2.B.e.d.a.b.class, m.a);
        b0.a(l2.n.class, m.a);
        b0.a(l2.B.e.d.a.b.e.class, (Object object0, Object object1) -> this.b(((l2.B.e.d.a.b.e)object0), ((e)object1)));
        b0.a(l2.r.class, (Object object0, Object object1) -> this.b(((l2.B.e.d.a.b.e)object0), ((e)object1)));
        b0.a(l2.B.e.d.a.b.e.b.class, q.a);
        b0.a(l2.s.class, q.a);
        b0.a(l2.B.e.d.a.b.c.class, n.a);
        b0.a(l2.p.class, n.a);
        b0.a(l2.B.a.class, b.a);
        b0.a(l2.c.class, b.a);
        b0.a(l2.B.a.a.class, (Object object0, Object object1) -> this.b(((l2.B.a.a)object0), ((e)object1)));
        b0.a(l2.d.class, (Object object0, Object object1) -> this.b(((l2.B.a.a)object0), ((e)object1)));
        b0.a(l2.B.e.d.a.b.d.class, (Object object0, Object object1) -> this.b(((l2.B.e.d.a.b.d)object0), ((e)object1)));
        b0.a(l2.q.class, (Object object0, Object object1) -> this.b(((l2.B.e.d.a.b.d)object0), ((e)object1)));
        b0.a(l2.B.e.d.a.b.a.class, (Object object0, Object object1) -> this.b(((l2.B.e.d.a.b.a)object0), ((e)object1)));
        b0.a(l2.o.class, (Object object0, Object object1) -> this.b(((l2.B.e.d.a.b.a)object0), ((e)object1)));
        b0.a(l2.B.c.class, (Object object0, Object object1) -> this.b(((l2.B.c)object0), ((e)object1)));
        b0.a(l2.e.class, (Object object0, Object object1) -> this.b(((l2.B.c)object0), ((e)object1)));
        b0.a(l2.B.e.d.c.class, r.a);
        b0.a(l2.t.class, r.a);
        b0.a(l2.B.e.d.d.class, (Object object0, Object object1) -> this.b(((l2.B.e.d.d)object0), ((e)object1)));
        b0.a(l2.u.class, (Object object0, Object object1) -> this.b(((l2.B.e.d.d)object0), ((e)object1)));
        b0.a(l2.B.d.class, (Object object0, Object object1) -> this.b(((l2.B.d)object0), ((e)object1)));
        b0.a(l2.f.class, (Object object0, Object object1) -> this.b(((l2.B.d)object0), ((e)object1)));
        b0.a(l2.B.d.b.class, (Object object0, Object object1) -> this.b(((l2.B.d.b)object0), ((e)object1)));
        b0.a(l2.g.class, (Object object0, Object object1) -> this.b(((l2.B.d.b)object0), ((e)object1)));
    }
}

