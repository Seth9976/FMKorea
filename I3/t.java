package I3;

import N3.B;
import N3.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p3.f;
import p3.j;
import q3.b;

public final class T extends B {
    private volatile int _decision;
    private static final AtomicIntegerFieldUpdater j;

    static {
        T.j = AtomicIntegerFieldUpdater.newUpdater(T.class, "_decision");
    }

    public T(j j0, f f0) {
        super(j0, f0);
    }

    @Override  // N3.B
    protected void H0(Object object0) {
        if(this.M0()) {
            return;
        }
        k.c(b.b(this.i), D.a(object0, this.i), null, 2, null);
    }

    public final Object L0() {
        if(this.N0()) {
            return b.c();
        }
        Object object0 = y0.h(this.b0());
        if(object0 instanceof z) {
            throw ((z)object0).a;
        }
        return object0;
    }

    private final boolean M0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = T.j;
    alab1:
        while(true) {
            switch(atomicIntegerFieldUpdater0.get(this)) {
                case 0: {
                    if(!T.j.compareAndSet(this, 0, 2)) {
                        break;
                    }
                    break alab1;
                }
                case 1: {
                    return false;
                }
                default: {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
        return true;
    }

    private final boolean N0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = T.j;
    alab1:
        while(true) {
            switch(atomicIntegerFieldUpdater0.get(this)) {
                case 0: {
                    if(!T.j.compareAndSet(this, 0, 1)) {
                        break;
                    }
                    break alab1;
                }
                case 2: {
                    return false;
                }
                default: {
                    throw new IllegalStateException("Already suspended");
                }
            }
        }
        return true;
    }

    @Override  // N3.B
    protected void q(Object object0) {
        this.H0(object0);
    }
}

