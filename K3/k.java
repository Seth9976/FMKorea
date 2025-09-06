package K3;

import I3.P0;
import N3.F;
import N3.O;
import N3.x;
import l3.u;
import y3.l;

public class k extends b {
    private final int n;
    private final a o;

    public k(int v, a a0, l l0) {
        super(v, l0);
        this.n = v;
        this.o = a0;
        if(a0 == a.f) {
            throw new IllegalArgumentException("This implementation does not support suspension for senders, use b instead");
        }
        if(v < 1) {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + v + " was specified").toString());
        }
    }

    @Override  // K3.b
    protected boolean S() {
        return this.o == a.g;
    }

    @Override  // K3.b
    public Object d(Object object0) {
        return this.z0(object0, false);
    }

    private final Object x0(Object object0, boolean z) {
        Object object1 = super.d(object0);
        if(!f.f(object1) && !f.e(object1)) {
            if(z) {
                l l0 = this.c;
                if(l0 != null) {
                    O o0 = x.d(l0, object0, null, 2, null);
                    if(o0 != null) {
                        throw o0;
                    }
                }
            }
            return f.a.c(u.a);
        }
        return object1;
    }

    private final Object y0(Object object0) {
        h h2;
        F f0 = c.d;
        h h0 = (h)b.i.get(this);
        while(true) {
            long v = b.e.getAndIncrement(this);
            long v1 = v & 0xFFFFFFFFFFFFFFFL;
            boolean z = this.R(v);
            int v2 = c.b;
            long v3 = v1 / ((long)v2);
            int v4 = (int)(v1 % ((long)v2));
            if(h0.h == v3) {
            label_16:
                h2 = h0;
            }
            else {
                h h1 = this.B(v3, h0);
                if(h1 == null) {
                    if(!z) {
                        continue;
                    }
                    Throwable throwable0 = this.G();
                    return f.a.a(throwable0);
                }
                else {
                    h2 = h1;
                    goto label_17;
                }
                goto label_16;
            }
        label_17:
            switch(this.s0(h2, v4, object0, v1, f0, z)) {
                case 0: {
                    h2.b();
                    return f.a.c(u.a);
                }
                case 1: {
                    return f.a.c(u.a);
                }
                case 2: {
                    if(z) {
                        h2.p();
                        Throwable throwable2 = this.G();
                        return f.a.a(throwable2);
                    }
                    P0 p00 = f0 instanceof P0 ? ((P0)f0) : null;
                    if(p00 != null) {
                        this.e0(p00, h2, v4);
                    }
                    this.x(h2.h * ((long)v2) + ((long)v4));
                    return f.a.c(u.a);
                }
                case 3: {
                    throw new IllegalStateException("unexpected");
                }
                case 4: {
                    if(v1 < this.F()) {
                        h2.b();
                    }
                    Throwable throwable1 = this.G();
                    return f.a.a(throwable1);
                }
                case 5: {
                    h2.b();
                }
            }
            h0 = h2;
        }
    }

    private final Object z0(Object object0, boolean z) {
        return this.o == a.h ? this.x0(object0, z) : this.y0(object0);
    }
}

