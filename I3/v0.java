package I3;

import java.util.concurrent.CancellationException;
import p3.j;

abstract class v0 {
    public static final x a(q0 q00) {
        return new t0(q00);
    }

    public static x b(q0 q00, int v, Object object0) {
        if((v & 1) != 0) {
            q00 = null;
        }
        return u0.a(q00);
    }

    public static final void c(j j0, CancellationException cancellationException0) {
        q0 q00 = (q0)j0.a(q0.b);
        if(q00 != null) {
            q00.Z(cancellationException0);
        }
    }

    public static void d(j j0, CancellationException cancellationException0, int v, Object object0) {
        if((v & 1) != 0) {
            cancellationException0 = null;
        }
        u0.c(j0, cancellationException0);
    }

    public static final void e(q0 q00) {
        if(!q00.isActive()) {
            throw q00.v();
        }
    }

    public static final void f(j j0) {
        q0 q00 = (q0)j0.a(q0.b);
        if(q00 != null) {
            u0.e(q00);
        }
    }
}

