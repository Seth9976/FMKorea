package v0;

import x0.u;
import z3.k;

public final class b extends c {
    public b(w0.c c0) {
        k.e(c0, "tracker");
        super(c0);
    }

    @Override  // v0.c
    public boolean b(u u0) {
        k.e(u0, "workSpec");
        return u0.j.f();
    }

    @Override  // v0.c
    public boolean c(Object object0) {
        return this.i(((Boolean)object0).booleanValue());
    }

    public boolean i(boolean z) {
        return !z;
    }
}

