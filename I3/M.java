package I3;

import N3.C;
import N3.F;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p3.f;
import p3.j.b;
import p3.j;
import r3.e;
import z3.k;

public class m extends U implements P0, l, e {
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    private final f i;
    private final j j;
    private static final AtomicIntegerFieldUpdater k;
    private static final AtomicReferenceFieldUpdater l;
    private static final AtomicReferenceFieldUpdater m;

    static {
        m.k = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex");
        m.l = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
        m.m = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle");
    }

    public m(f f0, int v) {
        super(v);
        this.i = f0;
        this.j = f0.getContext();
        this._decisionAndIndex = 0x1FFFFFFF;
        this._state = d.f;
    }

    private final String A() {
        Object object0 = this.z();
        if(object0 instanceof E0) {
            return "Active";
        }
        return object0 instanceof p ? "Cancelled" : "Completed";
    }

    public void B() {
        X x0 = this.C();
        if(x0 == null) {
            return;
        }
        if(this.E()) {
            x0.e();
            m.m.set(this, D0.f);
        }
    }

    private final X C() {
        b j$b0 = this.getContext().a(q0.b);
        if(((q0)j$b0) == null) {
            return null;
        }
        X x0 = a.d(((q0)j$b0), true, false, new q(this), 2, null);
        androidx.concurrent.futures.b.a(m.m, this, null, x0);
        return x0;
    }

    private final void D(Object object0) {
        Object object1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = m.l;
        while(true) {
            while(true) {
                while(true) {
                label_1:
                    object1 = atomicReferenceFieldUpdater0.get(this);
                    if(!(object1 instanceof d)) {
                        break;
                    }
                    if(androidx.concurrent.futures.b.a(m.l, this, object1, object0)) {
                        return;
                    }
                }
                if((object1 instanceof I3.j ? true : object1 instanceof C)) {
                    this.H(object0, object1);
                    goto label_1;
                }
                if(object1 instanceof z) {
                    z z0 = (z)object1;
                    if(!z0.b()) {
                        this.H(object0, object1);
                    }
                    Throwable throwable0 = null;
                    if(object1 instanceof p) {
                        if(!(object1 instanceof z)) {
                            z0 = null;
                        }
                        if(z0 != null) {
                            throwable0 = z0.a;
                        }
                        if(object0 instanceof I3.j) {
                            this.n(((I3.j)object0), throwable0);
                            return;
                        }
                        k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        this.r(((C)object0), throwable0);
                    }
                    return;
                }
                if(!(object1 instanceof y)) {
                    break;
                }
                if(((y)object1).b != null) {
                    this.H(object0, object1);
                }
                if(object0 instanceof C) {
                    return;
                }
                k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                if(((y)object1).c()) {
                    this.n(((I3.j)object0), ((y)object1).e);
                    return;
                }
                y y0 = y.b(((y)object1), null, ((I3.j)object0), null, null, null, 29, null);
                if(androidx.concurrent.futures.b.a(m.l, this, object1, y0)) {
                    return;
                }
            }
            if(object0 instanceof C) {
                return;
            }
            k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            y y1 = new y(object1, ((I3.j)object0), null, null, null, 28, null);
            if(!androidx.concurrent.futures.b.a(m.l, this, object1, y1)) {
                goto label_1;
            }
            break;
        }
    }

    public boolean E() {
        return !(this.z() instanceof E0);
    }

    private final boolean F() {
        if(V.c(this.h)) {
            k.c(this.i, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            return ((N3.j)this.i).r();
        }
        return false;
    }

    private final I3.j G(y3.l l0) {
        return l0 instanceof I3.j ? ((I3.j)l0) : new n0(l0);
    }

    private final void H(Object object0, Object object1) {
        throw new IllegalStateException(("It\'s prohibited to register multiple handlers, tried to register " + object0 + ", already has " + object1).toString());
    }

    protected String I() [...] // 潜在的解密器

    public final void J(Throwable throwable0) {
        if(this.s(throwable0)) {
            return;
        }
        this.m(throwable0);
        this.u();
    }

    public final void K() {
        N3.j j0 = this.i instanceof N3.j ? ((N3.j)this.i) : null;
        if(j0 != null) {
            Throwable throwable0 = j0.u(this);
            if(throwable0 != null) {
                this.t();
                this.m(throwable0);
            }
        }
    }

    public final boolean L() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = m.l;
        Object object0 = atomicReferenceFieldUpdater0.get(this);
        if(object0 instanceof y && ((y)object0).d != null) {
            this.t();
            return false;
        }
        m.k.set(this, 0x1FFFFFFF);
        atomicReferenceFieldUpdater0.set(this, d.f);
        return true;
    }

    private final void M(Object object0, int v, y3.l l0) {
        Object object1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = m.l;
        while(true) {
            object1 = atomicReferenceFieldUpdater0.get(this);
            if(!(object1 instanceof E0)) {
                break;
            }
            Object object2 = this.O(((E0)object1), object0, v, l0, null);
            if(androidx.concurrent.futures.b.a(m.l, this, object1, object2)) {
                this.u();
                this.v(v);
                return;
            }
        }
        if(object1 instanceof p && ((p)object1).c()) {
            if(l0 != null) {
                this.q(l0, ((p)object1).a);
            }
            return;
        }
        this.l(object0);
        throw new l3.e();
    }

    static void N(m m0, Object object0, int v, y3.l l0, int v1, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if((v1 & 4) != 0) {
            l0 = null;
        }
        m0.M(object0, v, l0);
    }

    private final Object O(E0 e00, Object object0, int v, y3.l l0, Object object1) {
        if(!(object0 instanceof z) && (V.b(v) || object1 != null) && (l0 != null || e00 instanceof I3.j || object1 != null)) {
            return e00 instanceof I3.j ? new y(object0, ((I3.j)e00), l0, object1, null, 16, null) : new y(object0, null, l0, object1, null, 16, null);
        }
        return object0;
    }

    private final boolean P() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = m.k;
    alab1:
        while(true) {
            int v = atomicIntegerFieldUpdater0.get(this);
            switch(v >> 29) {
                case 0: {
                    if(!m.k.compareAndSet(this, v, 0x40000000 + (0x1FFFFFFF & v))) {
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

    private final F Q(Object object0, Object object1, y3.l l0) {
        Object object2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = m.l;
        while(true) {
            object2 = atomicReferenceFieldUpdater0.get(this);
            if(!(object2 instanceof E0)) {
                break;
            }
            Object object3 = this.O(((E0)object2), object0, this.h, l0, object1);
            if(androidx.concurrent.futures.b.a(m.l, this, object2, object3)) {
                this.u();
                return n.a;
            }
        }
        return !(object2 instanceof y) || object1 == null || ((y)object2).d != object1 ? null : n.a;
    }

    private final boolean R() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = m.k;
    alab1:
        while(true) {
            int v = atomicIntegerFieldUpdater0.get(this);
            switch(v >> 29) {
                case 0: {
                    if(!m.k.compareAndSet(this, v, 0x20000000 + (0x1FFFFFFF & v))) {
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

    @Override  // I3.P0
    public void a(C c0, int v) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = m.k;
        while(true) {
            int v1 = atomicIntegerFieldUpdater0.get(this);
            if((v1 & 0x1FFFFFFF) != 0x1FFFFFFF) {
                break;
            }
            if(atomicIntegerFieldUpdater0.compareAndSet(this, v1, (v1 >> 29 << 29) + v)) {
                this.D(c0);
                return;
            }
        }
        throw new IllegalStateException("invokeOnCancellation should be called at most once");
    }

    @Override  // I3.l
    public Object b(Object object0, Object object1, y3.l l0) {
        return this.Q(object0, object1, l0);
    }

    @Override  // I3.U
    public void c(Object object0, Throwable throwable0) {
        Object object1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = m.l;
    alab1:
        while(true) {
            do {
                object1 = atomicReferenceFieldUpdater0.get(this);
                if(object1 instanceof E0) {
                    break alab1;
                }
                if(object1 instanceof z) {
                    return;
                }
                if(!(object1 instanceof y)) {
                    goto label_12;
                }
                if(((y)object1).c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                y y0 = y.b(((y)object1), null, null, null, null, throwable0, 15, null);
            }
            while(!androidx.concurrent.futures.b.a(m.l, this, object1, y0));
            ((y)object1).d(this, throwable0);
            return;
        label_12:
            y y1 = new y(object1, null, null, null, throwable0, 14, null);
            if(androidx.concurrent.futures.b.a(m.l, this, object1, y1)) {
                return;
            }
        }
        throw new IllegalStateException("Not completed");
    }

    // 去混淆评级： 低(20)
    @Override  // r3.e
    public e d() {
        return this.i instanceof e ? ((e)this.i) : null;
    }

    @Override  // p3.f
    public void e(Object object0) {
        m.N(this, D.b(object0, this), this.h, null, 4, null);
    }

    @Override  // I3.U
    public final f f() {
        return this.i;
    }

    @Override  // I3.U
    public Throwable g(Object object0) {
        Throwable throwable0 = super.g(object0);
        return throwable0 == null ? null : throwable0;
    }

    @Override  // p3.f
    public j getContext() {
        return this.j;
    }

    // 去混淆评级： 低(20)
    @Override  // I3.U
    public Object h(Object object0) {
        return object0 instanceof y ? ((y)object0).a : object0;
    }

    @Override  // I3.l
    public void i(y3.l l0) {
        this.D(this.G(l0));
    }

    @Override  // I3.U
    public Object k() {
        return this.z();
    }

    private final Void l(Object object0) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + object0).toString());
    }

    @Override  // I3.l
    public boolean m(Throwable throwable0) {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = m.l;
        do {
            object0 = atomicReferenceFieldUpdater0.get(this);
            boolean z = false;
            if(!(object0 instanceof E0)) {
                return false;
            }
            if(object0 instanceof I3.j || object0 instanceof C) {
                z = true;
            }
            p p0 = new p(this, throwable0, z);
        }
        while(!androidx.concurrent.futures.b.a(m.l, this, object0, p0));
        if(((E0)object0) instanceof I3.j) {
            this.n(((I3.j)object0), throwable0);
        }
        else if(((E0)object0) instanceof C) {
            this.r(((C)object0), throwable0);
        }
        this.u();
        this.v(this.h);
        return true;
    }

    public final void n(I3.j j0, Throwable throwable0) {
        try {
            j0.b(throwable0);
        }
        catch(Throwable throwable1) {
            H.a(this.getContext(), new I3.C("Exception in invokeOnCancellation handler for " + this, throwable1));
        }
    }

    @Override  // I3.l
    public void o(Object object0, y3.l l0) {
        this.M(object0, this.h, l0);
    }

    @Override  // I3.l
    public void p(Object object0) {
        this.v(this.h);
    }

    public final void q(y3.l l0, Throwable throwable0) {
        try {
            l0.h(throwable0);
        }
        catch(Throwable throwable1) {
            H.a(this.getContext(), new I3.C("Exception in resume onCancellation handler for " + this, throwable1));
        }
    }

    private final void r(C c0, Throwable throwable0) {
        int v = m.k.get(this);
        if((v & 0x1FFFFFFF) == 0x1FFFFFFF) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            c0.o(v & 0x1FFFFFFF, throwable0, this.getContext());
        }
        catch(Throwable throwable1) {
            H.a(this.getContext(), new I3.C("Exception in invokeOnCancellation handler for " + this, throwable1));
        }
    }

    private final boolean s(Throwable throwable0) {
        if(!this.F()) {
            return false;
        }
        k.c(this.i, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((N3.j)this.i).s(throwable0);
    }

    public final void t() {
        X x0 = this.x();
        if(x0 == null) {
            return;
        }
        x0.e();
        m.m.set(this, D0.f);
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return "CancellableContinuation" + '(' + M.c(this.i) + "){" + this.A() + "}@" + M.b(this);
    }

    private final void u() {
        if(!this.F()) {
            this.t();
        }
    }

    private final void v(int v) {
        if(this.P()) {
            return;
        }
        V.a(this, v);
    }

    public Throwable w(q0 q00) {
        return q00.v();
    }

    private final X x() {
        return (X)m.m.get(this);
    }

    public final Object y() {
        boolean z = this.F();
        if(this.R()) {
            if(this.x() == null) {
                this.C();
            }
            if(z) {
                this.K();
            }
            return q3.b.c();
        }
        if(z) {
            this.K();
        }
        Object object0 = this.z();
        if(object0 instanceof z) {
            throw ((z)object0).a;
        }
        if(V.b(this.h)) {
            q0 q00 = (q0)this.getContext().a(q0.b);
            if(q00 != null && !q00.isActive()) {
                CancellationException cancellationException0 = q00.v();
                this.c(object0, cancellationException0);
                throw cancellationException0;
            }
        }
        return this.h(object0);
    }

    public final Object z() {
        return m.l.get(this);
    }
}

