package W;

import z3.g;
import z3.k;

public final class d extends a {
    public d() {
        this(null, 1, null);
    }

    public d(a a0) {
        k.e(a0, "initialExtras");
        super();
        this.b().putAll(a0.b());
    }

    public d(a a0, int v, g g0) {
        if((v & 1) != 0) {
            a0 = W.a.a.b;
        }
        this(a0);
    }

    @Override  // W.a
    public Object a(b a$b0) {
        k.e(a$b0, "key");
        return this.b().get(a$b0);
    }

    public final void c(b a$b0, Object object0) {
        k.e(a$b0, "key");
        this.b().put(a$b0, object0);
    }
}

