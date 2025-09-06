package I3;

import N3.L;
import N3.s;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p3.j;
import z3.k;

public abstract class b0 extends c0 implements S {
    public static abstract class a extends L {
    }

    private volatile Object _delayed;
    private volatile int _isCompleted;
    private volatile Object _queue;
    private static final AtomicReferenceFieldUpdater k;
    private static final AtomicReferenceFieldUpdater l;
    private static final AtomicIntegerFieldUpdater m;

    static {
        b0.k = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_queue");
        b0.l = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_delayed");
        b0.m = AtomicIntegerFieldUpdater.newUpdater(b0.class, "_isCompleted");
    }

    public b0() {
        this._isCompleted = 0;
    }

    protected boolean A0() {
        if(!this.p0()) {
            return false;
        }
        a b0$a0 = (a)b0.l.get(this);
        Object object0 = b0.k.get(this);
        if(object0 == null) {
            return true;
        }
        return object0 instanceof s ? ((s)object0).g() : object0 == e0.a();
    }

    private final void B0() {
        a b0$a0 = (a)b0.l.get(this);
    }

    protected final void C0() {
        b0.k.set(this, null);
        b0.l.set(this, null);
    }

    private final void D0(boolean z) {
        b0.m.set(this, ((int)z));
    }

    @Override  // I3.F
    public final void e0(j j0, Runnable runnable0) {
        this.x0(runnable0);
    }

    @Override  // I3.a0
    protected long l0() {
        if(super.l0() == 0L) {
            return 0L;
        }
        Object object0 = b0.k.get(this);
        if(object0 != null) {
            if(!(object0 instanceof s)) {
                return object0 == e0.a() ? 0x7FFFFFFFFFFFFFFFL : 0L;
            }
            else if(!((s)object0).g()) {
                return 0L;
            }
        }
        a b0$a0 = (a)b0.l.get(this);
        return 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // I3.a0
    public long q0() {
        if(this.r0()) {
            return 0L;
        }
        a b0$a0 = (a)b0.l.get(this);
        Runnable runnable0 = this.w0();
        if(runnable0 != null) {
            runnable0.run();
            return 0L;
        }
        return this.l0();
    }

    @Override  // I3.a0
    public void shutdown() {
        L0.a.c();
        this.D0(true);
        this.v0();
        while(this.q0() <= 0L) {
        }
        this.B0();
    }

    private final void v0() {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = b0.k;
        do {
            while(true) {
                object0 = atomicReferenceFieldUpdater0.get(this);
                if(object0 != null) {
                    break;
                }
                if(b.a(b0.k, this, null, e0.a())) {
                    return;
                }
            }
            if(object0 instanceof s) {
                ((s)object0).d();
                return;
            }
            if(object0 == e0.a()) {
                return;
            }
            s s0 = new s(8, true);
            k.c(object0, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
            s0.a(((Runnable)object0));
        }
        while(!b.a(b0.k, this, object0, s0));
    }

    private final Runnable w0() {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = b0.k;
        while(true) {
            object0 = atomicReferenceFieldUpdater0.get(this);
            if(object0 == null) {
                return null;
            }
            if(object0 instanceof s) {
                k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                Object object1 = ((s)object0).j();
                if(object1 != s.h) {
                    return (Runnable)object1;
                }
                s s0 = ((s)object0).i();
                b.a(b0.k, this, object0, s0);
            }
            else {
                if(object0 == e0.a()) {
                    return null;
                }
                if(b.a(b0.k, this, object0, null)) {
                    break;
                }
            }
        }
        k.c(object0, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
        return (Runnable)object0;
    }

    public void x0(Runnable runnable0) {
        if(this.y0(runnable0)) {
            this.u0();
            return;
        }
        N.n.x0(runnable0);
    }

    private final boolean y0(Runnable runnable0) {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = b0.k;
        while(true) {
        alab1:
            while(true) {
                while(true) {
                label_1:
                    object0 = atomicReferenceFieldUpdater0.get(this);
                    if(this.z0()) {
                        return false;
                    }
                    if(object0 != null) {
                        break;
                    }
                    if(b.a(b0.k, this, null, runnable0)) {
                        return true;
                    }
                }
                if(!(object0 instanceof s)) {
                    goto label_19;
                }
                k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                int v = ((s)object0).a(runnable0);
                switch(v) {
                    case 0: {
                        return true;
                    label_14:
                        if(v != 2) {
                            break;
                        }
                        break alab1;
                    }
                    case 1: {
                        goto label_16;
                    }
                    default: {
                        goto label_14;
                    }
                }
            }
            return false;
        label_16:
            s s0 = ((s)object0).i();
            b.a(b0.k, this, object0, s0);
            goto label_1;
        label_19:
            if(object0 == e0.a()) {
                return false;
            }
            s s1 = new s(8, true);
            k.c(object0, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
            s1.a(((Runnable)object0));
            s1.a(runnable0);
            if(!b.a(b0.k, this, object0, s1)) {
                goto label_1;
            }
            break;
        }
        return true;
    }

    private final boolean z0() {
        return b0.m.get(this) != 0;
    }
}

