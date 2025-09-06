package K3;

import I3.P0;
import N3.C;
import N3.x;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p3.j;
import y3.l;
import z3.k;

public final class h extends C {
    private final b j;
    private final AtomicReferenceArray k;

    public h(long v, h h0, b b0, int v1) {
        super(v, h0, v1);
        this.j = b0;
        this.k = new AtomicReferenceArray(c.b * 2);
    }

    public final void A(int v, Object object0) {
        this.k.set(v * 2 + 1, object0);
    }

    public final void B(int v, Object object0) {
        this.z(v, object0);
    }

    @Override  // N3.C
    public int n() {
        return c.b;
    }

    @Override  // N3.C
    public void o(int v, Throwable throwable0, j j0) {
        Object object1;
        int v1 = c.b;
        int v2 = v < v1 ? 0 : 1;
        if(v2 != 0) {
            v -= v1;
        }
        Object object0 = this.v(v);
    alab1:
        do {
            do {
                object1 = this.w(v);
                if(object1 instanceof P0 || object1 instanceof n) {
                    continue alab1;
                }
                if(object1 == c.j || object1 == c.k) {
                    goto label_12;
                }
            }
            while(object1 == c.g || object1 == c.f);
            if(object1 != c.i && object1 != c.d && object1 != c.y()) {
                throw new IllegalStateException(("unexpected state: " + object1).toString());
            }
            return;
        label_12:
            this.s(v);
            if(v2 != 0) {
                l l0 = this.u().c;
                if(l0 != null) {
                    x.b(l0, object0, j0);
                }
            }
            return;
        }
        while(!this.r(v, object1, (v2 == 0 ? c.k : c.j)));
        this.s(v);
        this.x(v, ((boolean)(v2 ^ 1)));
        if(v2 != 0) {
            l l1 = this.u().c;
            if(l1 != null) {
                x.b(l1, object0, j0);
            }
        }
    }

    public final boolean r(int v, Object object0, Object object1) {
        return g.a(this.k, v * 2 + 1, object0, object1);
    }

    public final void s(int v) {
        this.z(v, null);
    }

    public final Object t(int v, Object object0) {
        return this.k.getAndSet(v * 2 + 1, object0);
    }

    public final b u() {
        k.b(this.j);
        return this.j;
    }

    public final Object v(int v) {
        return this.k.get(v * 2);
    }

    public final Object w(int v) {
        return this.k.get(v * 2 + 1);
    }

    public final void x(int v, boolean z) {
        if(z) {
            this.u().w0(this.h * ((long)c.b) + ((long)v));
        }
        this.p();
    }

    public final Object y(int v) {
        Object object0 = this.v(v);
        this.s(v);
        return object0;
    }

    private final void z(int v, Object object0) {
        this.k.lazySet(v * 2, object0);
    }
}

