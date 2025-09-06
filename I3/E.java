package I3;

import java.util.concurrent.locks.LockSupport;
import p3.j;
import z3.k;

final class e extends a {
    private final Thread i;
    private final a0 j;

    public e(j j0, Thread thread0, a0 a00) {
        super(j0, true, true);
        this.i = thread0;
        this.j = a00;
    }

    public final Object L0() {
        InterruptedException interruptedException0;
        a0 a00 = this.j;
        z z0 = null;
        if(a00 != null) {
            a0.n0(a00, false, 1, null);
        }
        try {
            while(!Thread.interrupted()) {
                long v1 = this.j == null ? 0x7FFFFFFFFFFFFFFFL : this.j.q0();
                if(!this.g0()) {
                    LockSupport.parkNanos(this, v1);
                    continue;
                }
                Object object0 = y0.h(this.b0());
                if(object0 instanceof z) {
                    z0 = (z)object0;
                }
                if(z0 != null) {
                    throw z0.a;
                }
                return object0;
            }
            interruptedException0 = new InterruptedException();
            this.x(interruptedException0);
        }
        finally {
            a0 a01 = this.j;
            if(a01 != null) {
                a0.i0(a01, false, 1, null);
            }
        }
        throw interruptedException0;
    }

    @Override  // I3.x0
    protected boolean h0() {
        return true;
    }

    @Override  // I3.x0
    protected void q(Object object0) {
        if(!k.a(Thread.currentThread(), this.i)) {
            LockSupport.unpark(this.i);
        }
    }
}

