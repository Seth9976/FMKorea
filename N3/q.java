package N3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z3.k;

public class q {
    public static abstract class a extends b {
        public final q b;
        public q c;

        public a(q q0) {
            this.b = q0;
        }

        @Override  // N3.b
        public void b(Object object0, Object object1) {
            this.e(((q)object0), object1);
        }

        public void e(q q0, Object object0) {
            q q1 = object0 == null ? this.c : this.b;
            if(q1 != null && androidx.concurrent.futures.b.a(q.f, q0, this, q1) && object0 == null) {
                q q2 = this.c;
                k.b(q2);
                this.b.q(q2);
            }
        }
    }

    private volatile Object _next;
    private volatile Object _prev;
    private volatile Object _removedRef;
    private static final AtomicReferenceFieldUpdater f;
    private static final AtomicReferenceFieldUpdater g;
    private static final AtomicReferenceFieldUpdater h;

    static {
        q.f = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next");
        q.g = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_prev");
        q.h = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_removedRef");
    }

    public q() {
        this._next = this;
        this._prev = this;
    }

    public final boolean m(q q0) {
        q.g.lazySet(q0, this);
        q.f.lazySet(q0, this);
        do {
            if(this.r() != this) {
                return false;
            }
        }
        while(!androidx.concurrent.futures.b.a(q.f, this, this, q0));
        q0.q(this);
        return true;
    }

    private final q o(y y0) {
        Object object0;
        q q2;
        q q1;
        while(true) {
            while(true) {
            label_0:
                q q0 = (q)q.g.get(this);
                q1 = q0;
            label_2:
                q2 = null;
            label_3:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = q.f;
                object0 = atomicReferenceFieldUpdater0.get(q1);
                if(object0 != this) {
                    break;
                }
                if(q0 == q1) {
                    return q1;
                }
                if(!androidx.concurrent.futures.b.a(q.g, this, q0, q1)) {
                    continue;
                }
                return q1;
            }
            if(this.u()) {
                return null;
            }
            if(object0 == y0) {
                return q1;
            }
            if(object0 instanceof y) {
                ((y)object0).a(q1);
                goto label_0;
            }
            if(!(object0 instanceof z)) {
                k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                q2 = q1;
                q1 = (q)object0;
                goto label_3;
            }
            if(q2 == null) {
                break;
            }
            if(!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater0, q2, q1, ((z)object0).a)) {
                goto label_0;
            }
            q1 = q2;
            goto label_2;
        }
        q1 = (q)q.g.get(q1);
        goto label_3;
    }

    private final q p(q q0) {
        while(q0.u()) {
            q0 = (q)q.g.get(q0);
        }
        return q0;
    }

    private final void q(q q0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = q.g;
        do {
            q q1 = (q)atomicReferenceFieldUpdater0.get(q0);
            if(this.r() != q0) {
                return;
            }
        }
        while(!androidx.concurrent.futures.b.a(q.g, q0, q1, this));
        if(this.u()) {
            q0.o(null);
        }
    }

    public final Object r() {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = q.f;
        while(true) {
            object0 = atomicReferenceFieldUpdater0.get(this);
            if(!(object0 instanceof y)) {
                break;
            }
            ((y)object0).a(this);
        }
        return object0;
    }

    public final q s() {
        return p.b(this.r());
    }

    public final q t() {
        q q0 = this.o(null);
        return q0 == null ? this.p(((q)q.g.get(this))) : q0;
    }

    @Override
    public String toString() [...] // 潜在的解密器

    public boolean u() {
        return this.r() instanceof z;
    }

    public boolean v() {
        return this.w() == null;
    }

    public final q w() {
        Object object0;
        do {
            object0 = this.r();
            if(object0 instanceof z) {
                return ((z)object0).a;
            }
            if(object0 == this) {
                return (q)object0;
            }
            k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            z z0 = ((q)object0).x();
        }
        while(!androidx.concurrent.futures.b.a(q.f, this, object0, z0));
        ((q)object0).o(null);
        return null;
    }

    private final z x() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = q.h;
        z z0 = (z)atomicReferenceFieldUpdater0.get(this);
        if(z0 == null) {
            z0 = new z(this);
            atomicReferenceFieldUpdater0.lazySet(this, z0);
        }
        return z0;
    }

    public final int y(q q0, q q1, a q$a0) {
        q.g.lazySet(q0, this);
        q.f.lazySet(q0, q1);
        q$a0.c = q1;
        if(!androidx.concurrent.futures.b.a(q.f, this, q1, q$a0)) {
            return 0;
        }
        return q$a0.a(this) == null ? 1 : 2;
    }
}

