package K2;

import G3.h;
import java.util.Locale;
import java.util.UUID;
import y3.a;
import z3.g;
import z3.j;
import z3.k;

public final class r {
    private final boolean a;
    private final w b;
    private final a c;
    private final String d;
    private int e;
    private o f;

    public r(boolean z, w w0, a a0) {
        k.e(w0, "timeProvider");
        k.e(a0, "uuidGenerator");
        super();
        this.a = z;
        this.b = w0;
        this.c = a0;
        this.d = this.b();
        this.e = -1;
    }

    public r(boolean z, w w0, a a0, int v, g g0) {
        final class K2.r.a extends j implements a {
            public static final K2.r.a o;

            static {
                K2.r.a.o = new K2.r.a();
            }

            K2.r.a() {
                super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
            }

            @Override  // y3.a
            public Object a() {
                return this.p();
            }

            public final UUID p() {
                return UUID.randomUUID();
            }
        }

        if((v & 4) != 0) {
            a0 = K2.r.a.o;
        }
        this(z, w0, a0);
    }

    public final o a() {
        int v = this.e + 1;
        this.e = v;
        String s = v == 0 ? this.d : this.b();
        int v1 = this.e;
        long v2 = this.b.b();
        this.f = new o(s, this.d, v1, v2);
        return this.d();
    }

    private final String b() {
        String s = ((UUID)this.c.a()).toString();
        k.d(s, "uuidGenerator().toString()");
        String s1 = h.s(s, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        k.d(s1, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return s1;
    }

    public final boolean c() {
        return this.a;
    }

    public final o d() {
        o o0 = this.f;
        if(o0 != null) {
            return o0;
        }
        k.p("currentSession");
        return null;
    }

    public final boolean e() {
        return this.f != null;
    }
}

