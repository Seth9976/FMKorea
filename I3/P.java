package I3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p3.f;

public final class p extends z {
    private volatile int _resumed;
    private static final AtomicIntegerFieldUpdater c;

    static {
        p.c = AtomicIntegerFieldUpdater.newUpdater(p.class, "_resumed");
    }

    public p(f f0, Throwable throwable0, boolean z) {
        if(throwable0 == null) {
            throwable0 = new CancellationException("Continuation " + f0 + " was cancelled normally");
        }
        super(throwable0, z);
        this._resumed = 0;
    }

    public final boolean c() {
        return p.c.compareAndSet(this, 0, 1);
    }
}

