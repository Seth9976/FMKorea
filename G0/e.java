package g0;

import k0.h.b;
import k0.h.c;
import k0.h;
import z3.k;

public final class e implements c {
    private final c a;
    private final g0.c b;

    public e(c h$c0, g0.c c0) {
        k.e(h$c0, "delegate");
        k.e(c0, "autoCloser");
        super();
        this.a = h$c0;
        this.b = c0;
    }

    @Override  // k0.h$c
    public h a(b h$b0) {
        return this.b(h$b0);
    }

    public d b(b h$b0) {
        k.e(h$b0, "configuration");
        return new d(this.a.a(h$b0), this.b);
    }
}

