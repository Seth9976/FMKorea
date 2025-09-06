package g0;

import java.io.File;
import java.util.concurrent.Callable;
import k0.h.b;
import k0.h.c;
import k0.h;
import z3.k;

public final class z implements c {
    private final String a;
    private final File b;
    private final Callable c;
    private final c d;

    public z(String s, File file0, Callable callable0, c h$c0) {
        k.e(h$c0, "mDelegate");
        super();
        this.a = s;
        this.b = file0;
        this.c = callable0;
        this.d = h$c0;
    }

    @Override  // k0.h$c
    public h a(b h$b0) {
        k.e(h$b0, "configuration");
        h h0 = this.d.a(h$b0);
        return new y(h$b0.a, this.a, this.b, this.c, h$b0.c.a, h0);
    }
}

