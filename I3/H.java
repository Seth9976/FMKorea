package I3;

import p3.g;
import p3.j;
import p3.k;
import y3.p;

abstract class h {
    public static final Object a(j j0, p p0) {
        j j2;
        a0 a00;
        Thread thread0 = Thread.currentThread();
        g g0 = (g)j0.a(g.e);
        if(g0 == null) {
            a00 = L0.a.b();
            j j1 = j0.N(a00);
            j2 = E.d(j0.f, j1);
        }
        else {
            if(g0 instanceof a0) {
                a0 a01 = (a0)g0;
            }
            a00 = L0.a.a();
            j2 = E.d(j0.f, j0);
        }
        e e0 = new e(j2, thread0, a00);
        e0.K0(K.f, e0, p0);
        return e0.L0();
    }

    public static Object b(j j0, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            j0 = k.f;
        }
        return I3.g.e(j0, p0);
    }
}

