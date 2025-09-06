package g0;

import z3.k;

public abstract class i extends A {
    public i(u u0) {
        k.e(u0, "database");
        super(u0);
    }

    protected abstract void i(k0.k arg1, Object arg2);

    public final void j(Object object0) {
        k0.k k0 = this.b();
        try {
            this.i(k0, object0);
            k0.d0();
        }
        finally {
            this.h(k0);
        }
    }
}

