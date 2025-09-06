package I3;

import N3.B;
import N3.J;
import O3.b;
import p3.f;
import p3.j;
import p3.k;
import r3.h;
import y3.p;

abstract class i {
    public static final P a(I i0, j j0, K k0, p p0) {
        P p1 = new Q(E.d(i0, j0), true);
        ((a)p1).K0(k0, p1, p0);
        return p1;
    }

    public static P b(I i0, j j0, K k0, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            j0 = k.f;
        }
        if((v & 2) != 0) {
            k0 = K.f;
        }
        return g.a(i0, j0, k0, p0);
    }

    public static final q0 c(I i0, j j0, K k0, p p0) {
        q0 q00 = new H0(E.d(i0, j0), true);
        ((a)q00).K0(k0, q00, p0);
        return q00;
    }

    public static q0 d(I i0, j j0, K k0, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            j0 = k.f;
        }
        if((v & 2) != 0) {
            k0 = K.f;
        }
        return g.c(i0, j0, k0, p0);
    }

    public static final Object e(j j0, p p0, f f0) {
        Object object2;
        Object object0;
        j j1 = f0.getContext();
        j j2 = E.e(j1, j0);
        u0.f(j2);
        if(j2 == j1) {
            B b0 = new B(j2, f0);
            object0 = b.b(b0, b0, p0);
        }
        else if(z3.k.a(j2.a(p3.g.e), j1.a(p3.g.e))) {
            N0 n00 = new N0(j2, f0);
            j j3 = n00.getContext();
            Object object1 = J.c(j3, null);
            try {
                object2 = b.b(n00, n00, p0);
            }
            finally {
                J.a(j3, object1);
            }
            object0 = object2;
        }
        else {
            T t0 = new T(j2, f0);
            O3.a.d(p0, t0, t0, null, 4, null);
            object0 = t0.L0();
        }
        if(object0 == q3.b.c()) {
            h.c(f0);
        }
        return object0;
    }
}

