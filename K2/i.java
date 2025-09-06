package k2;

import com.facebook.internal.q;
import j2.k;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import o2.f;

public class i {
    class a {
        final AtomicMarkableReference a;
        private final AtomicReference b;
        private final boolean c;
        final i d;

        public a(boolean z) {
            this.b = new AtomicReference(null);
            this.c = z;
            this.a = new AtomicMarkableReference(new b(0x40, (z ? 0x2000 : 0x400)), false);
        }

        // 检测为 Lambda 实现
        public static Void a(a i$a0) [...]

        public Map b() {
            return ((b)this.a.getReference()).a();
        }

        private Void c() {
            this.b.set(null);
            this.e();
            return null;
        }

        private void d() {
            h h0 = () -> this.c();
            if(q.a(this.b, null, h0)) {
                i.this.b.h(h0);
            }
        }

        private void e() {
            Map map0;
            synchronized(this) {
                if(this.a.isMarked()) {
                    map0 = ((b)this.a.getReference()).a();
                    b b0 = (b)this.a.getReference();
                    this.a.set(b0, false);
                }
                else {
                    map0 = null;
                }
            }
            if(map0 != null) {
                i.this.a.l(i.this.c, map0, this.c);
            }
        }

        public boolean f(String s, String s1) {
            synchronized(this) {
                if(!((b)this.a.getReference()).d(s, s1)) {
                    return false;
                }
                b b0 = (b)this.a.getReference();
                this.a.set(b0, true);
            }
            this.d();
            return true;
        }
    }

    private final d a;
    private final k b;
    private final String c;
    private final a d;
    private final a e;
    private final AtomicMarkableReference f;

    public i(String s, f f0, k k0) {
        this.d = new a(this, false);
        this.e = new a(this, true);
        this.f = new AtomicMarkableReference(null, false);
        this.c = s;
        this.a = new d(f0);
        this.b = k0;
    }

    // 检测为 Lambda 实现
    public static Object a(i i0) [...]

    public Map e() {
        return this.d.b();
    }

    public Map f() {
        return this.e.b();
    }

    public String g() {
        return (String)this.f.getReference();
    }

    private Object h() {
        this.k();
        return null;
    }

    public static i i(String s, f f0, k k0) {
        d d0 = new d(f0);
        i i0 = new i(s, f0, k0);
        ((b)i0.d.a.getReference()).e(d0.g(s, false));
        ((b)i0.e.a.getReference()).e(d0.g(s, true));
        String s1 = d0.h(s);
        i0.f.set(s1, false);
        return i0;
    }

    public static String j(String s, f f0) {
        return new d(f0).h(s);
    }

    private void k() {
        String s;
        boolean z = false;
        synchronized(this.f) {
            if(this.f.isMarked()) {
                s = this.g();
                this.f.set(s, false);
                z = true;
            }
            else {
                s = null;
            }
        }
        if(z) {
            this.a.m(this.c, s);
        }
    }

    public boolean l(String s, String s1) {
        return this.e.f(s, s1);
    }

    public void m(String s) {
        String s1 = b.c(s, 0x400);
        synchronized(this.f) {
            if(j2.i.B(s1, ((String)this.f.getReference()))) {
                return;
            }
            this.f.set(s1, true);
        }
        g g0 = () -> this.h();
        this.b.h(g0);
    }
}

