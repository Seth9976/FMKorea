package k2;

import java.io.File;
import o2.f;

public class c {
    static abstract class a {
    }

    static final class b implements k2.a {
        private b() {
        }

        b(a c$a0) {
        }

        @Override  // k2.a
        public void a() {
        }

        @Override  // k2.a
        public String b() {
            return null;
        }

        @Override  // k2.a
        public byte[] c() {
            return null;
        }

        @Override  // k2.a
        public void d() {
        }

        @Override  // k2.a
        public void e(long v, String s) {
        }
    }

    private final f a;
    private k2.a b;
    private static final b c;

    static {
        c.c = new b(null);
    }

    public c(f f0) {
        this.a = f0;
        this.b = c.c;
    }

    public c(f f0, String s) {
        this(f0);
        this.e(s);
    }

    public void a() {
        this.b.d();
    }

    public byte[] b() {
        return this.b.c();
    }

    public String c() {
        return this.b.b();
    }

    private File d(String s) {
        return this.a.o(s, "userlog");
    }

    public final void e(String s) {
        this.b.a();
        this.b = c.c;
        if(s == null) {
            return;
        }
        this.f(this.d(s), 0x10000);
    }

    void f(File file0, int v) {
        this.b = new k2.f(file0, v);
    }

    public void g(long v, String s) {
        this.b.e(v, s);
    }
}

