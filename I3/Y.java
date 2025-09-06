package I3;

import y3.l;
import z3.g;
import z3.k;

final class y {
    public final Object a;
    public final j b;
    public final l c;
    public final Object d;
    public final Throwable e;

    public y(Object object0, j j0, l l0, Object object1, Throwable throwable0) {
        this.a = object0;
        this.b = j0;
        this.c = l0;
        this.d = object1;
        this.e = throwable0;
    }

    public y(Object object0, j j0, l l0, Object object1, Throwable throwable0, int v, g g0) {
        this(object0, ((v & 2) == 0 ? j0 : null), ((v & 4) == 0 ? l0 : null), ((v & 8) == 0 ? object1 : null), ((v & 16) == 0 ? throwable0 : null));
    }

    public final y a(Object object0, j j0, l l0, Object object1, Throwable throwable0) {
        return new y(object0, j0, l0, object1, throwable0);
    }

    public static y b(y y0, Object object0, j j0, l l0, Object object1, Throwable throwable0, int v, Object object2) {
        if((v & 1) != 0) {
            object0 = y0.a;
        }
        if((v & 2) != 0) {
            j0 = y0.b;
        }
        if((v & 4) != 0) {
            l0 = y0.c;
        }
        if((v & 8) != 0) {
            object1 = y0.d;
        }
        if((v & 16) != 0) {
            throwable0 = y0.e;
        }
        return y0.a(object0, j0, l0, object1, throwable0);
    }

    public final boolean c() {
        return this.e != null;
    }

    public final void d(m m0, Throwable throwable0) {
        j j0 = this.b;
        if(j0 != null) {
            m0.n(j0, throwable0);
        }
        l l0 = this.c;
        if(l0 != null) {
            m0.q(l0, throwable0);
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof y)) {
            return false;
        }
        if(!k.a(this.a, ((y)object0).a)) {
            return false;
        }
        if(!k.a(this.b, ((y)object0).b)) {
            return false;
        }
        if(!k.a(this.c, ((y)object0).c)) {
            return false;
        }
        return k.a(this.d, ((y)object0).d) ? k.a(this.e, ((y)object0).e) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        Throwable throwable0 = this.e;
        if(throwable0 != null) {
            v = throwable0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }
}

