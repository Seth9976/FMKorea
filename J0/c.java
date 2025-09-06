package j0;

import android.os.Bundle;
import androidx.lifecycle.h.b;
import androidx.lifecycle.h;
import androidx.savedstate.Recreator;
import z3.g;
import z3.k;

public final class c {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final c a(d d0) {
            k.e(d0, "owner");
            return new c(d0, null);
        }
    }

    private final d a;
    private final androidx.savedstate.a b;
    private boolean c;
    public static final a d;

    static {
        c.d = new a(null);
    }

    private c(d d0) {
        this.a = d0;
        this.b = new androidx.savedstate.a();
    }

    public c(d d0, g g0) {
        this(d0);
    }

    public static final c a(d d0) {
        return c.d.a(d0);
    }

    public final androidx.savedstate.a b() {
        return this.b;
    }

    public final void c() {
        h h0 = this.a.getLifecycle();
        if(h0.b() != b.g) {
            throw new IllegalStateException("Restarter must be created only during owner\'s initialization stage");
        }
        h0.a(new Recreator(this.a));
        this.b.e(h0);
        this.c = true;
    }

    public final void d(Bundle bundle0) {
        if(!this.c) {
            this.c();
        }
        h h0 = this.a.getLifecycle();
        if(h0.b().f(b.i)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + h0.b()).toString());
        }
        this.b.f(bundle0);
    }

    public final void e(Bundle bundle0) {
        k.e(bundle0, "outBundle");
        this.b.g(bundle0);
    }
}

