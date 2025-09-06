package t1;

import java.util.concurrent.Executor;
import k3.a;
import o1.b;
import u1.d;

public final class w implements b {
    private final a a;
    private final a b;
    private final a c;
    private final a d;

    public w(a a0, a a1, a a2, a a3) {
        this.a = a0;
        this.b = a1;
        this.c = a2;
        this.d = a3;
    }

    public static w a(a a0, a a1, a a2, a a3) {
        return new w(a0, a1, a2, a3);
    }

    public v b() {
        return w.c(((Executor)this.a.get()), ((d)this.b.get()), ((x)this.c.get()), ((v1.b)this.d.get()));
    }

    public static v c(Executor executor0, d d0, x x0, v1.b b0) {
        return new v(executor0, d0, x0, b0);
    }

    @Override  // k3.a
    public Object get() {
        return this.b();
    }
}

