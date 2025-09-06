package androidx.work;

import android.os.Build.VERSION;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import m3.L;
import x0.u;
import z3.g;
import z3.k;

public abstract class v {
    public static abstract class a {
        private final Class a;
        private boolean b;
        private UUID c;
        private u d;
        private final Set e;

        public a(Class class0) {
            k.e(class0, "workerClass");
            super();
            this.a = class0;
            UUID uUID0 = UUID.randomUUID();
            k.d(uUID0, "randomUUID()");
            this.c = uUID0;
            String s = this.c.toString();
            k.d(s, "id.toString()");
            String s1 = class0.getName();
            k.d(s1, "workerClass.name");
            this.d = new u(s, s1);
            String s2 = class0.getName();
            k.d(s2, "workerClass.name");
            this.e = L.g(new String[]{s2});
        }

        public final a a(String s) {
            k.e(s, "tag");
            this.e.add(s);
            return this.g();
        }

        public final v b() {
            v v0 = this.c();
            c c0 = this.d.j;
            boolean z = Build.VERSION.SDK_INT >= 24 && c0.e() || c0.f() || c0.g() || c0.h();
            u u0 = this.d;
            if(u0.q) {
                if(z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if(u0.g > 0L) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID uUID0 = UUID.randomUUID();
            k.d(uUID0, "randomUUID()");
            this.j(uUID0);
            return v0;
        }

        public abstract v c();

        public final boolean d() {
            return this.b;
        }

        public final UUID e() {
            return this.c;
        }

        public final Set f() {
            return this.e;
        }

        public abstract a g();

        public final u h() {
            return this.d;
        }

        public final a i(c c0) {
            k.e(c0, "constraints");
            this.d.j = c0;
            return this.g();
        }

        public final a j(UUID uUID0) {
            k.e(uUID0, "id");
            this.c = uUID0;
            String s = uUID0.toString();
            k.d(s, "id.toString()");
            this.d = new u(s, this.d);
            return this.g();
        }

        public a k(long v, TimeUnit timeUnit0) {
            k.e(timeUnit0, "timeUnit");
            u u0 = this.d;
            u0.g = timeUnit0.toMillis(v);
            if(0x7FFFFFFFFFFFFFFFL - System.currentTimeMillis() <= this.d.g) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
            }
            return this.g();
        }

        public final a l(d d0) {
            k.e(d0, "inputData");
            this.d.e = d0;
            return this.g();
        }
    }

    public static final class b {
        private b() {
        }

        public b(g g0) {
        }
    }

    private final UUID a;
    private final u b;
    private final Set c;
    public static final b d;

    static {
        v.d = new b(null);
    }

    public v(UUID uUID0, u u0, Set set0) {
        k.e(uUID0, "id");
        k.e(u0, "workSpec");
        k.e(set0, "tags");
        super();
        this.a = uUID0;
        this.b = u0;
        this.c = set0;
    }

    public UUID a() {
        return this.a;
    }

    public final String b() {
        String s = this.a().toString();
        k.d(s, "id.toString()");
        return s;
    }

    public final Set c() {
        return this.c;
    }

    public final u d() {
        return this.b;
    }
}

