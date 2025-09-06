package R3;

import I3.P0;
import K3.g;
import N3.C;
import N3.D;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l3.u;
import y3.l;
import y3.p;
import z3.j;
import z3.k;

public class d {
    private volatile int _availablePermits;
    private final int a;
    private final l b;
    private static final AtomicReferenceFieldUpdater c;
    private static final AtomicLongFieldUpdater d;
    private volatile long deqIdx;
    private static final AtomicReferenceFieldUpdater e;
    private volatile long enqIdx;
    private static final AtomicLongFieldUpdater f;
    private static final AtomicIntegerFieldUpdater g;
    private volatile Object head;
    private volatile Object tail;

    static {
        d.c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head");
        d.d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx");
        d.e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail");
        d.f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx");
        d.g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits");
    }

    public d(int v, int v1) {
        static final class b extends z3.l implements l {
            final d g;

            b(d d0) {
                this.g = d0;
                super(1);
            }

            public final void b(Throwable throwable0) {
                this.g.i();
            }

            @Override  // y3.l
            public Object h(Object object0) {
                this.b(((Throwable)object0));
                return u.a;
            }
        }

        this.a = v;
        if(v <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + v).toString());
        }
        if(v1 < 0 || v1 > v) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + v).toString());
        }
        f f0 = new f(0L, null, 2);
        this.head = f0;
        this.tail = f0;
        this._availablePermits = v - v1;
        this.b = new b(this);
    }

    protected final void d(I3.l l0) {
        do {
            if(this.g() > 0) {
                l0.o(u.a, this.b);
                return;
            }
            k.c(l0, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
        }
        while(!this.e(((P0)l0)));
    }

    private final boolean e(P0 p00) {
        final class a extends j implements p {
            public static final a o;

            static {
                a.o = new a();
            }

            a() {
                super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.p(((Number)object0).longValue(), ((f)object1));
            }

            public final f p(long v, f f0) {
                return e.a(v, f0);
            }
        }

        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = d.e;
        f f0 = (f)atomicReferenceFieldUpdater0.get(this);
        long v = d.f.getAndIncrement(this);
        a d$a0 = a.o;
    alab1:
        while(true) {
            object0 = N3.d.c(f0, v / 16L, d$a0);
            if(D.c(object0)) {
                break;
            }
            C c0 = D.b(object0);
            while(true) {
                C c1 = (C)atomicReferenceFieldUpdater0.get(this);
                if(c1.h >= c0.h) {
                    break alab1;
                }
                if(!c0.q()) {
                    break;
                }
                if(androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater0, this, c1, c0)) {
                    if(!c1.m()) {
                        break alab1;
                    }
                    c1.k();
                    break alab1;
                }
                if(c0.m()) {
                    c0.k();
                }
            }
        }
        f f1 = (f)D.b(object0);
        if(g.a(f1.r(), ((int)(v % 16L)), null, p00)) {
            p00.a(f1, ((int)(v % 16L)));
            return true;
        }
        if(g.a(f1.r(), ((int)(v % 16L)), e.b, e.c)) {
            if(!(p00 instanceof I3.l)) {
                throw new IllegalStateException(("unexpected: " + p00).toString());
            }
            k.c(p00, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((I3.l)p00).o(u.a, this.b);
            return true;
        }
        return false;
    }

    private final void f() {
        do {
            int v = d.g.get(this);
        }
        while(v > this.a && !d.g.compareAndSet(this, v, this.a));
    }

    private final int g() {
        int v;
        do {
            v = d.g.getAndDecrement(this);
        }
        while(v > this.a);
        return v;
    }

    public int h() {
        return Math.max(d.g.get(this), 0);
    }

    public void i() {
        int v;
        while((v = d.g.getAndIncrement(this)) < this.a) {
            if(v >= 0) {
                return;
            }
            if(this.l()) {
                return;
            }
        }
        this.f();
        throw new IllegalStateException(("The number of released permits cannot be greater than " + this.a).toString());
    }

    public boolean j() {
        while(true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = d.g;
            int v = atomicIntegerFieldUpdater0.get(this);
            if(v > this.a) {
                this.f();
            }
            else {
                if(v <= 0) {
                    return false;
                }
                if(atomicIntegerFieldUpdater0.compareAndSet(this, v, v - 1)) {
                    break;
                }
            }
        }
        return true;
    }

    private final boolean k(Object object0) {
        if(!(object0 instanceof I3.l)) {
            throw new IllegalStateException(("unexpected: " + object0).toString());
        }
        k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        Object object1 = ((I3.l)object0).b(u.a, null, this.b);
        if(object1 != null) {
            ((I3.l)object0).p(object1);
            return true;
        }
        return false;
    }

    private final boolean l() {
        final class c extends j implements p {
            public static final c o;

            static {
                c.o = new c();
            }

            c() {
                super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
            }

            @Override  // y3.p
            public Object k(Object object0, Object object1) {
                return this.p(((Number)object0).longValue(), ((f)object1));
            }

            public final f p(long v, f f0) {
                return e.a(v, f0);
            }
        }

        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = d.c;
        f f0 = (f)atomicReferenceFieldUpdater0.get(this);
        long v = d.d.getAndIncrement(this);
        c d$c0 = c.o;
    alab1:
        while(true) {
            object0 = N3.d.c(f0, v / 16L, d$c0);
            if(D.c(object0)) {
                break;
            }
            C c0 = D.b(object0);
            while(true) {
                C c1 = (C)atomicReferenceFieldUpdater0.get(this);
                if(c1.h >= c0.h) {
                    break alab1;
                }
                if(!c0.q()) {
                    break;
                }
                if(androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater0, this, c1, c0)) {
                    if(!c1.m()) {
                        break alab1;
                    }
                    c1.k();
                    break alab1;
                }
                if(c0.m()) {
                    c0.k();
                }
            }
        }
        f f1 = (f)D.b(object0);
        f1.b();
        if(Long.compare(f1.h, v / 16L) > 0) {
            return false;
        }
        Object object1 = f1.r().getAndSet(((int)(v % 16L)), e.b);
        if(object1 == null) {
            for(int v1 = 0; v1 < 100; ++v1) {
                if(f1.r().get(((int)(v % 16L))) == e.c) {
                    return true;
                }
            }
            return !g.a(f1.r(), ((int)(v % 16L)), e.b, e.d);
        }
        return object1 == e.e ? false : this.k(object1);
    }
}

