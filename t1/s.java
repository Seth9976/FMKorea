package t1;

import android.content.Context;
import java.util.concurrent.Executor;
import k3.a;
import n1.e;
import o1.b;
import u1.c;
import u1.d;

public final class s implements b {
    private final a a;
    private final a b;
    private final a c;
    private final a d;
    private final a e;
    private final a f;
    private final a g;
    private final a h;
    private final a i;

    public s(a a0, a a1, a a2, a a3, a a4, a a5, a a6, a a7, a a8) {
        this.a = a0;
        this.b = a1;
        this.c = a2;
        this.d = a3;
        this.e = a4;
        this.f = a5;
        this.g = a6;
        this.h = a7;
        this.i = a8;
    }

    public static s a(a a0, a a1, a a2, a a3, a a4, a a5, a a6, a a7, a a8) {
        return new s(a0, a1, a2, a3, a4, a5, a6, a7, a8);
    }

    public r b() {
        return s.c(((Context)this.a.get()), ((e)this.b.get()), ((d)this.c.get()), ((x)this.d.get()), ((Executor)this.e.get()), ((v1.b)this.f.get()), ((w1.a)this.g.get()), ((w1.a)this.h.get()), ((c)this.i.get()));
    }

    public static r c(Context context0, e e0, d d0, x x0, Executor executor0, v1.b b0, w1.a a0, w1.a a1, c c0) {
        return new r(context0, e0, d0, x0, executor0, b0, a0, a1, c0);
    }

    @Override  // k3.a
    public Object get() {
        return this.b();
    }
}

