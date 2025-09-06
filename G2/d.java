package g2;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import l2.D;

public final class d implements a {
    static abstract class g2.d.a {
    }

    static final class b implements g {
        private b() {
        }

        b(g2.d.a d$a0) {
        }

        @Override  // g2.g
        public File a() {
            return null;
        }

        @Override  // g2.g
        public File b() {
            return null;
        }

        @Override  // g2.g
        public File c() {
            return null;
        }

        @Override  // g2.g
        public l2.B.a d() {
            return null;
        }

        @Override  // g2.g
        public File e() {
            return null;
        }

        @Override  // g2.g
        public File f() {
            return null;
        }

        @Override  // g2.g
        public File g() {
            return null;
        }
    }

    private final B2.a a;
    private final AtomicReference b;
    private static final g c;

    static {
        d.c = new b(null);
    }

    public d(B2.a a0) {
        this.b = new AtomicReference(null);
        this.a = a0;
        a0.a((B2.b b0) -> this.g(b0));
    }

    @Override  // g2.a
    public void a(String s, String s1, long v, D d0) {
        f.f().i("Deferring native open session: " + s);
        c c0 = (B2.b b0) -> d.h(s, s1, v, d0, b0);
        this.a.a(c0);
    }

    @Override  // g2.a
    public g b(String s) {
        a a0 = (a)this.b.get();
        return a0 == null ? d.c : a0.b(s);
    }

    @Override  // g2.a
    public boolean c() {
        a a0 = (a)this.b.get();
        return a0 != null && a0.c();
    }

    @Override  // g2.a
    public boolean d(String s) {
        a a0 = (a)this.b.get();
        return a0 != null && a0.d(s);
    }

    // 检测为 Lambda 实现
    public static void e(String s, String s1, long v, D d0, B2.b b0) [...]

    // 检测为 Lambda 实现
    public static void f(d d0, B2.b b0) [...]

    private void g(B2.b b0) {
        f.f().b("Crashlytics native component now available.");
        a a0 = (a)b0.get();
        this.b.set(a0);
    }

    private static void h(String s, String s1, long v, D d0, B2.b b0) {
        ((a)b0.get()).a(s, s1, v, d0);
    }
}

