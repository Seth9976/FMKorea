package m1;

import k3.a;
import o1.b;
import s1.e;
import t1.r;
import t1.v;

public final class w implements b {
    private final a a;
    private final a b;
    private final a c;
    private final a d;
    private final a e;

    public w(a a0, a a1, a a2, a a3, a a4) {
        this.a = a0;
        this.b = a1;
        this.c = a2;
        this.d = a3;
        this.e = a4;
    }

    public static w a(a a0, a a1, a a2, a a3, a a4) {
        return new w(a0, a1, a2, a3, a4);
    }

    public u b() {
        return w.c(((w1.a)this.a.get()), ((w1.a)this.b.get()), ((e)this.c.get()), ((r)this.d.get()), ((v)this.e.get()));
    }

    public static u c(w1.a a0, w1.a a1, e e0, r r0, v v0) {
        return new u(a0, a1, e0, r0, v0);
    }

    @Override  // k3.a
    public Object get() {
        return this.b();
    }
}

