package N3;

import I3.F;
import I3.H;
import I3.O;
import I3.S;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p3.j;
import p3.k;

public final class m extends F implements S {
    final class a implements Runnable {
        private Runnable f;
        final m g;

        public a(Runnable runnable0) {
            this.f = runnable0;
        }

        @Override
        public void run() {
            int v = 0;
            do {
                try {
                    this.f.run();
                }
                catch(Throwable throwable0) {
                    H.a(k.f, throwable0);
                }
                Runnable runnable0 = m.this.j0();
                if(runnable0 == null) {
                    return;
                }
                this.f = runnable0;
                ++v;
            }
            while(v < 16 || !m.this.h.f0(m.this));
            m.this.h.e0(m.this, this);
        }
    }

    private final F h;
    private final int i;
    private final S j;
    private final r k;
    private final Object l;
    private static final AtomicIntegerFieldUpdater m;
    private volatile int runningWorkers;

    static {
        m.m = AtomicIntegerFieldUpdater.newUpdater(m.class, "runningWorkers");
    }

    public m(F f0, int v) {
        this.h = f0;
        this.i = v;
        S s0 = f0 instanceof S ? ((S)f0) : null;
        if(s0 == null) {
            s0 = O.a();
        }
        this.j = s0;
        this.k = new r(false);
        this.l = new Object();
    }

    @Override  // I3.F
    public void e0(j j0, Runnable runnable0) {
        this.k.a(runnable0);
        if(m.m.get(this) < this.i && this.k0()) {
            Runnable runnable1 = this.j0();
            if(runnable1 != null) {
                a m$a0 = new a(this, runnable1);
                this.h.e0(this, m$a0);
            }
        }
    }

    private final Runnable j0() {
        Runnable runnable0;
        while((runnable0 = (Runnable)this.k.d()) == null) {
            synchronized(this.l) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = m.m;
                atomicIntegerFieldUpdater0.decrementAndGet(this);
                if(this.k.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater0.incrementAndGet(this);
            }
        }
        return runnable0;
    }

    private final boolean k0() {
        synchronized(this.l) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = m.m;
            if(atomicIntegerFieldUpdater0.get(this) >= this.i) {
                return false;
            }
            atomicIntegerFieldUpdater0.incrementAndGet(this);
            return true;
        }
    }
}

