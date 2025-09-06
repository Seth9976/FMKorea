package P3;

import K3.g;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z3.u;

public final class n {
    private final AtomicReferenceArray a;
    private static final AtomicReferenceFieldUpdater b;
    private volatile int blockingTasksInBuffer;
    private static final AtomicIntegerFieldUpdater c;
    private volatile int consumerIndex;
    private static final AtomicIntegerFieldUpdater d;
    private static final AtomicIntegerFieldUpdater e;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        n.b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");
        n.c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");
        n.d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");
        n.e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");
    }

    public n() {
        this.a = new AtomicReferenceArray(0x80);
    }

    public final h a(h h0, boolean z) {
        if(z) {
            return this.b(h0);
        }
        h h1 = (h)n.b.getAndSet(this, h0);
        return h1 == null ? null : this.b(h1);
    }

    private final h b(h h0) {
        if(this.d() == 0x7F) {
            return h0;
        }
        if(h0.g.b() == 1) {
            n.e.incrementAndGet(this);
        }
        int v = n.c.get(this);
        while(this.a.get(v & 0x7F) != null) {
            Thread.yield();
        }
        this.a.lazySet(v & 0x7F, h0);
        n.c.incrementAndGet(this);
        return null;
    }

    private final void c(h h0) {
        if(h0 != null && h0.g.b() == 1) {
            n.e.decrementAndGet(this);
        }
    }

    private final int d() {
        return n.c.get(this) - n.d.get(this);
    }

    public final int e() {
        return n.b.get(this) == null ? this.d() : this.d() + 1;
    }

    public final void f(d d0) {
        h h0 = (h)n.b.getAndSet(this, null);
        if(h0 != null) {
            d0.a(h0);
        }
        while(this.j(d0)) {
        }
    }

    public final h g() {
        h h0 = (h)n.b.getAndSet(this, null);
        return h0 == null ? this.i() : h0;
    }

    public final h h() {
        return this.k(true);
    }

    private final h i() {
        h h0;
        int v;
        do {
            do {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = n.d;
                v = atomicIntegerFieldUpdater0.get(this);
                if(v - n.c.get(this) == 0) {
                    return null;
                }
            }
            while(!atomicIntegerFieldUpdater0.compareAndSet(this, v, v + 1));
            h0 = (h)this.a.getAndSet(v & 0x7F, null);
        }
        while(h0 == null);
        this.c(h0);
        return h0;
    }

    private final boolean j(d d0) {
        h h0 = this.i();
        if(h0 == null) {
            return false;
        }
        d0.a(h0);
        return true;
    }

    private final h k(boolean z) {
        h h1;
        while(true) {
            boolean z1 = true;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = n.b;
            h h0 = (h)atomicReferenceFieldUpdater0.get(this);
            if(h0 == null) {
                break;
            }
            if(h0.g.b() != 1) {
                z1 = false;
            }
            if(z1 != z) {
                break;
            }
            if(b.a(atomicReferenceFieldUpdater0, this, h0, null)) {
                return h0;
            }
        }
        int v = n.d.get(this);
        int v1 = n.c.get(this);
        do {
            if(v == v1 || z && n.e.get(this) == 0) {
                return null;
            }
            --v1;
            h1 = this.m(v1, z);
        }
        while(h1 == null);
        return h1;
    }

    private final h l(int v) {
        h h0;
        int v1 = n.d.get(this);
        int v2 = n.c.get(this);
        boolean z = true;
        if(v != 1) {
            z = false;
        }
        while(true) {
            if(v1 == v2 || z && n.e.get(this) == 0) {
                return null;
            }
            h0 = this.m(v1, z);
            if(h0 != null) {
                break;
            }
            ++v1;
        }
        return h0;
    }

    private final h m(int v, boolean z) {
        boolean z1 = true;
        h h0 = (h)this.a.get(v & 0x7F);
        if(h0 != null) {
            if(h0.g.b() != 1) {
                z1 = false;
            }
            if(z1 == z && g.a(this.a, v & 0x7F, h0, null)) {
                if(z) {
                    n.e.decrementAndGet(this);
                }
                return h0;
            }
        }
        return null;
    }

    public final long n(int v, u u0) {
        h h0 = v == 3 ? this.i() : this.l(v);
        if(h0 != null) {
            u0.f = h0;
            return -1L;
        }
        return this.o(v, u0);
    }

    private final long o(int v, u u0) {
        h h0;
        do {
            int v1 = 1;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = n.b;
            h0 = (h)atomicReferenceFieldUpdater0.get(this);
            if(h0 == null) {
                return -2L;
            }
            if(h0.g.b() != 1) {
                v1 = 2;
            }
            if((v1 & v) == 0) {
                return -2L;
            }
            long v2 = l.f.a() - h0.f;
            long v3 = l.b;
            if(v2 < v3) {
                return v3 - v2;
            }
        }
        while(!b.a(atomicReferenceFieldUpdater0, this, h0, null));
        u0.f = h0;
        return -1L;
    }
}

