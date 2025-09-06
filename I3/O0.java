package I3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l3.u;
import y3.l;

final class o0 extends s0 {
    private volatile int _invoked;
    private final l j;
    private static final AtomicIntegerFieldUpdater k;

    static {
        o0.k = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_invoked");
    }

    public o0(l l0) {
        this.j = l0;
    }

    @Override  // y3.l
    public Object h(Object object0) {
        this.z(((Throwable)object0));
        return u.a;
    }

    @Override  // I3.B
    public void z(Throwable throwable0) {
        if(o0.k.compareAndSet(this, 0, 1)) {
            this.j.h(throwable0);
        }
    }
}

