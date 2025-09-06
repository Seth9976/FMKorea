package N3;

import I3.H;
import l3.u;
import p3.j;
import y3.l;

public abstract class x {
    public static final l a(l l0, Object object0, j j0) {
        static final class a extends z3.l implements l {
            final l g;
            final Object h;
            final j i;

            a(l l0, Object object0, j j0) {
                this.g = l0;
                this.h = object0;
                this.i = j0;
                super(1);
            }

            public final void b(Throwable throwable0) {
                x.b(this.g, this.h, this.i);
            }

            @Override  // y3.l
            public Object h(Object object0) {
                this.b(((Throwable)object0));
                return u.a;
            }
        }

        return new a(l0, object0, j0);
    }

    public static final void b(l l0, Object object0, j j0) {
        O o0 = x.c(l0, object0, null);
        if(o0 != null) {
            H.a(j0, o0);
        }
    }

    public static final O c(l l0, Object object0, O o0) {
        try {
            l0.h(object0);
            return o0;
        }
        catch(Throwable throwable0) {
            if(o0 != null && o0.getCause() != throwable0) {
                l3.a.a(o0, throwable0);
                return o0;
            }
            return new O("Exception in undelivered element handler for " + object0, throwable0);
        }
    }

    public static O d(l l0, Object object0, O o0, int v, Object object1) {
        if((v & 2) != 0) {
            o0 = null;
        }
        return x.c(l0, object0, o0);
    }
}

