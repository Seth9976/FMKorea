package I3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import z3.g;

public class z {
    private volatile int _handled;
    public final Throwable a;
    private static final AtomicIntegerFieldUpdater b;

    static {
        z.b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_handled");
    }

    public z(Throwable throwable0, boolean z) {
        this.a = throwable0;
        this._handled = z;
    }

    public z(Throwable throwable0, boolean z, int v, g g0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(throwable0, z);
    }

    public final boolean a() {
        return z.b.get(this) != 0;
    }

    public final boolean b() {
        return z.b.compareAndSet(this, 0, 1);
    }

    @Override
    public String toString() {
        return M.a(this) + '[' + this.a + ']';
    }
}

