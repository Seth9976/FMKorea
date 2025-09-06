package O3;

import I3.y0;
import I3.z;
import N3.B;
import N3.J;
import l3.n;
import l3.o;
import p3.f;
import p3.j;
import r3.h;
import y3.p;
import z3.y;

public abstract class b {
    public static final void a(p p0, Object object0, f f0) {
        Object object2;
        f f1 = h.a(f0);
        try {
            j j0 = f0.getContext();
            Object object1 = J.c(j0, null);
            try {
                object2 = ((p)y.a(p0, 2)).k(object0, f1);
            }
            finally {
                J.a(j0, object1);
            }
        }
        catch(Throwable throwable0) {
            f1.e(n.a(o.a(throwable0)));
            return;
        }
        if(object2 != q3.b.c()) {
            f1.e(object2);
        }
    }

    public static final Object b(B b0, Object object0, p p0) {
        z z0;
        try {
            z0 = ((p)y.a(p0, 2)).k(object0, b0);
        }
        catch(Throwable throwable0) {
            z0 = new z(throwable0, false, 2, null);
        }
        if(z0 == q3.b.c()) {
            return q3.b.c();
        }
        Object object1 = b0.k0(z0);
        if(object1 == y0.b) {
            return q3.b.c();
        }
        if(object1 instanceof z) {
            throw ((z)object1).a;
        }
        return y0.h(object1);
    }
}

