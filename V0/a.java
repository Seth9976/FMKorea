package v0;

import w0.h;
import x0.u;
import z3.k;

public final class a extends c {
    public a(h h0) {
        k.e(h0, "tracker");
        super(h0);
    }

    @Override  // v0.c
    public boolean b(u u0) {
        k.e(u0, "workSpec");
        return u0.j.g();
    }

    @Override  // v0.c
    public boolean c(Object object0) {
        return this.i(((Boolean)object0).booleanValue());
    }

    public boolean i(boolean z) {
        return !z;
    }
}

