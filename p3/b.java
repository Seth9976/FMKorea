package P3;

import D3.d;
import I3.F;
import I3.g0;
import N3.I;
import java.util.concurrent.Executor;
import p3.j;
import p3.k;

public final class b extends g0 implements Executor {
    public static final b i;
    private static final F j;

    static {
        b.i = new b();
        int v = I.e("kotlinx.coroutines.io.parallelism", d.a(0x40, 8), 0, 0, 12, null);
        b.j = m.h.g0(v);
    }

    @Override
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override  // I3.F
    public void e0(j j0, Runnable runnable0) {
        b.j.e0(j0, runnable0);
    }

    @Override
    public void execute(Runnable runnable0) {
        this.e0(k.f, runnable0);
    }

    @Override  // I3.F
    public String toString() {
        return "Dispatchers.IO";
    }
}

