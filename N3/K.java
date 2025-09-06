package N3;

import I3.D;
import I3.E;
import I3.L0;
import I3.N0;
import I3.a0;
import I3.q0;
import java.util.concurrent.CancellationException;
import l3.n;
import l3.o;
import p3.f;
import p3.j;
import y3.l;

public abstract class k {
    private static final F a;
    public static final F b;

    static {
        k.a = new F("UNDEFINED");
        k.b = new F("REUSABLE_CLAIMED");
    }

    public static final F a() {
        return k.a;
    }

    public static final void b(f f0, Object object0, l l0) {
        Object object2;
        j j3;
        if(f0 instanceof N3.j) {
            N3.j j0 = (N3.j)f0;
            Object object1 = D.c(object0, l0);
            j j1 = j0.getContext();
            if(j0.i.f0(j1)) {
                j0.k = object1;
                j0.h = 1;
                j j2 = j0.getContext();
                j0.i.e0(j2, j0);
                return;
            }
            a0 a00 = L0.a.b();
            if(a00.o0()) {
                j0.k = object1;
                j0.h = 1;
                a00.k0(j0);
                return;
            }
            a00.m0(true);
            try {
                q0 q00 = (q0)j0.getContext().a(q0.b);
                if(q00 == null || q00.isActive()) {
                    j3 = j0.j.getContext();
                    object2 = J.c(j3, j0.l);
                    N0 n00 = object2 == J.a ? null : E.g(j0.j, j3, object2);
                    goto label_26;
                }
                else {
                    CancellationException cancellationException0 = q00.v();
                    j0.c(object1, cancellationException0);
                    j0.e(n.a(o.a(cancellationException0)));
                }
                goto label_40;
            }
            catch(Throwable throwable0) {
                goto label_43;
            }
            try {
            label_26:
                j0.j.e(object0);
                goto label_35;
            }
            catch(Throwable throwable1) {
                try {
                    if(n00 == null) {
                        J.a(j3, object2);
                    }
                    else if(n00.L0()) {
                        J.a(j3, object2);
                    }
                    throw throwable1;
                label_35:
                    if(n00 == null) {
                        J.a(j3, object2);
                    }
                    else if(n00.L0()) {
                        J.a(j3, object2);
                    }
                    while(true) {
                    label_40:
                        if(!a00.r0()) {
                            goto label_48;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
            }
            try {
            label_43:
                j0.j(throwable0, null);
            }
            catch(Throwable throwable2) {
                a00.h0(true);
                throw throwable2;
            }
        label_48:
            a00.h0(true);
            return;
        }
        f0.e(object0);
    }

    public static void c(f f0, Object object0, l l0, int v, Object object1) {
        if((v & 2) != 0) {
            l0 = null;
        }
        k.b(f0, object0, l0);
    }
}

