package I3;

import N3.F;
import N3.q;
import N3.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l3.u;
import p3.f;
import p3.j;
import r3.h;
import y3.l;
import y3.p;
import z3.k;

public class x0 implements F0, q0, t {
    static final class a extends m {
        private final x0 n;

        public a(f f0, x0 x00) {
            super(f0, 1);
            this.n = x00;
        }

        @Override  // I3.m
        protected String I() {
            return "AwaitContinuation";
        }

        @Override  // I3.m
        public Throwable w(q0 q00) {
            Object object0 = this.n.b0();
            if(object0 instanceof c) {
                Throwable throwable0 = ((c)object0).e();
                if(throwable0 != null) {
                    return throwable0;
                }
            }
            return object0 instanceof z ? ((z)object0).a : q00.v();
        }
    }

    static final class b extends w0 {
        private final x0 j;
        private final c k;
        private final s l;
        private final Object m;

        public b(x0 x00, c x0$c0, s s0, Object object0) {
            this.j = x00;
            this.k = x0$c0;
            this.l = s0;
            this.m = object0;
        }

        @Override  // y3.l
        public Object h(Object object0) {
            this.z(((Throwable)object0));
            return u.a;
        }

        @Override  // I3.B
        public void z(Throwable throwable0) {
            this.j.F(this.k, this.l, this.m);
        }
    }

    static final class c implements l0 {
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;
        private final C0 f;
        private static final AtomicIntegerFieldUpdater g;
        private static final AtomicReferenceFieldUpdater h;
        private static final AtomicReferenceFieldUpdater i;

        static {
            c.g = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");
            c.h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");
            c.i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        }

        public c(C0 c00, boolean z, Throwable throwable0) {
            this.f = c00;
            this._isCompleting = z;
            this._rootCause = throwable0;
        }

        public final void a(Throwable throwable0) {
            Throwable throwable1 = this.e();
            if(throwable1 == null) {
                this.l(throwable0);
                return;
            }
            if(throwable0 == throwable1) {
                return;
            }
            Object object0 = this.c();
            if(object0 == null) {
                this.k(throwable0);
                return;
            }
            if(object0 instanceof Throwable) {
                if(throwable0 == object0) {
                    return;
                }
                ArrayList arrayList0 = this.b();
                arrayList0.add(object0);
                arrayList0.add(throwable0);
                this.k(arrayList0);
                return;
            }
            if(!(object0 instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + object0).toString());
            }
            ((ArrayList)object0).add(throwable0);
        }

        private final ArrayList b() {
            return new ArrayList(4);
        }

        private final Object c() {
            return c.i.get(this);
        }

        @Override  // I3.l0
        public C0 d() {
            return this.f;
        }

        public final Throwable e() {
            return (Throwable)c.h.get(this);
        }

        public final boolean f() {
            return this.e() != null;
        }

        public final boolean g() {
            return c.g.get(this) != 0;
        }

        public final boolean h() {
            return this.c() == y0.e();
        }

        public final List i(Throwable throwable0) {
            List list0;
            Object object0 = this.c();
            if(object0 == null) {
                list0 = this.b();
            }
            else if(object0 instanceof Throwable) {
                ArrayList arrayList0 = this.b();
                arrayList0.add(object0);
                list0 = arrayList0;
            }
            else if(object0 instanceof ArrayList) {
                list0 = (ArrayList)object0;
            }
            else {
                throw new IllegalStateException(("State is " + object0).toString());
            }
            Throwable throwable1 = this.e();
            if(throwable1 != null) {
                ((ArrayList)list0).add(0, throwable1);
            }
            if(throwable0 != null && !k.a(throwable0, throwable1)) {
                ((ArrayList)list0).add(throwable0);
            }
            this.k(y0.e());
            return list0;
        }

        @Override  // I3.l0
        public boolean isActive() {
            return this.e() == null;
        }

        public final void j(boolean z) {
            c.g.set(this, ((int)z));
        }

        private final void k(Object object0) {
            c.i.set(this, object0);
        }

        public final void l(Throwable throwable0) {
            c.h.set(this, throwable0);
        }

        @Override
        public String toString() {
            return "Finishing[cancelling=" + this.f() + ", completing=" + this.g() + ", rootCause=" + this.e() + ", exceptions=" + this.c() + ", list=" + this.d() + ']';
        }
    }

    private volatile Object _parentHandle;
    private volatile Object _state;
    private static final AtomicReferenceFieldUpdater f;
    private static final AtomicReferenceFieldUpdater g;

    static {
        x0.f = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_state");
        x0.g = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_parentHandle");
    }

    public x0(boolean z) {
        this._state = z ? y0.c() : y0.d();
    }

    private final Object A(Object object0) {
        while(true) {
            Object object1 = this.b0();
            if(!(object1 instanceof l0) || object1 instanceof c && ((c)object1).g()) {
                break;
            }
            Object object2 = this.E0(object1, new z(this.G(object0), false, 2, null));
            if(object2 != y0.b()) {
                return object2;
            }
        }
        return y0.a();
    }

    public static CancellationException A0(x0 x00, Throwable throwable0, String s, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if((v & 1) != 0) {
            s = null;
        }
        return x00.z0(throwable0, s);
    }

    private final boolean B(Throwable throwable0) {
        if(this.h0()) {
            return true;
        }
        r r0 = this.a0();
        return r0 == null || r0 == D0.f ? throwable0 instanceof CancellationException : r0.b(throwable0) || throwable0 instanceof CancellationException;
    }

    public final String B0() {
        return this.m0() + '{' + this.y0(this.b0()) + '}';
    }

    protected String C() [...] // 潜在的解密器

    private final boolean C0(l0 l00, Object object0) {
        Object object1 = y0.g(object0);
        if(!androidx.concurrent.futures.b.a(x0.f, this, l00, object1)) {
            return false;
        }
        this.r0(object0);
        this.E(l00, object0);
        return true;
    }

    // 去混淆评级： 低(40)
    public boolean D(Throwable throwable0) {
        return throwable0 instanceof CancellationException ? true : this.y(throwable0) && this.T();
    }

    private final boolean D0(l0 l00, Throwable throwable0) {
        C0 c00 = this.X(l00);
        if(c00 == null) {
            return false;
        }
        c x0$c0 = new c(c00, false, throwable0);
        if(!androidx.concurrent.futures.b.a(x0.f, this, l00, x0$c0)) {
            return false;
        }
        this.o0(c00, throwable0);
        return true;
    }

    private final void E(l0 l00, Object object0) {
        r r0 = this.a0();
        if(r0 != null) {
            r0.e();
            this.w0(D0.f);
        }
        Throwable throwable0 = null;
        z z0 = object0 instanceof z ? ((z)object0) : null;
        if(z0 != null) {
            throwable0 = z0.a;
        }
        if(l00 instanceof w0) {
            try {
                ((w0)l00).z(throwable0);
            }
            catch(Throwable throwable1) {
                this.e0(new C("Exception in completion handler " + l00 + " for " + this, throwable1));
            }
            return;
        }
        C0 c00 = l00.d();
        if(c00 != null) {
            this.p0(c00, throwable0);
        }
    }

    private final Object E0(Object object0, Object object1) {
        if(!(object0 instanceof l0)) {
            return y0.a();
        }
        if((object0 instanceof Z || object0 instanceof w0) && !(object0 instanceof s) && !(object1 instanceof z)) {
            return this.C0(((l0)object0), object1) ? object1 : y0.b();
        }
        return this.F0(((l0)object0), object1);
    }

    private final void F(c x0$c0, s s0, Object object0) {
        s s1 = this.n0(s0);
        if(s1 != null && this.G0(x0$c0, s1, object0)) {
            return;
        }
        this.q(this.H(x0$c0, object0));
    }

    private final Object F0(l0 l00, Object object0) {
        Throwable throwable0 = null;
        C0 c00 = this.X(l00);
        if(c00 == null) {
            return y0.b();
        }
        c x0$c0 = l00 instanceof c ? ((c)l00) : null;
        if(x0$c0 == null) {
            x0$c0 = new c(c00, false, null);
        }
        z3.u u0 = new z3.u();
        synchronized(x0$c0) {
            if(x0$c0.g()) {
                return y0.a();
            }
            x0$c0.j(true);
            if(x0$c0 != l00 && !androidx.concurrent.futures.b.a(x0.f, this, l00, x0$c0)) {
                return y0.b();
            }
            boolean z = x0$c0.f();
            z z1 = object0 instanceof z ? ((z)object0) : null;
            if(z1 != null) {
                x0$c0.a(z1.a);
            }
            Throwable throwable1 = x0$c0.e();
            if(!z) {
                throwable0 = throwable1;
            }
            u0.f = throwable0;
        }
        if(throwable0 != null) {
            this.o0(c00, throwable0);
        }
        s s0 = this.I(l00);
        return s0 != null && this.G0(x0$c0, s0, object0) ? y0.b : this.H(x0$c0, object0);
    }

    private final Throwable G(Object object0) {
        if((object0 == null ? true : object0 instanceof Throwable)) {
            return ((Throwable)object0) == null ? new r0(x0.c(this), null, this) : ((Throwable)object0);
        }
        k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((F0)object0).V();
    }

    private final boolean G0(c x0$c0, s s0, Object object0) {
        do {
            b x0$b0 = new b(this, x0$c0, s0, object0);
            if(I3.q0.a.d(s0.j, false, false, x0$b0, 1, null) != D0.f) {
                return true;
            }
            s0 = this.n0(s0);
        }
        while(s0 != null);
        return false;
    }

    private final Object H(c x0$c0, Object object0) {
        Throwable throwable1;
        z z0 = object0 instanceof z ? ((z)object0) : null;
        Throwable throwable0 = z0 == null ? null : z0.a;
        synchronized(x0$c0) {
            x0$c0.f();
            List list0 = x0$c0.i(throwable0);
            throwable1 = this.S(x0$c0, list0);
            if(throwable1 != null) {
                this.n(throwable1, list0);
            }
        }
        if(throwable1 != null && throwable1 != throwable0) {
            object0 = new z(throwable1, false, 2, null);
        }
        if(throwable1 != null && (this.B(throwable1) || this.d0(throwable1))) {
            k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((z)object0).b();
        }
        this.r0(object0);
        Object object1 = y0.g(object0);
        androidx.concurrent.futures.b.a(x0.f, this, x0$c0, object1);
        this.E(x0$c0, object0);
        return object0;
    }

    private final s I(l0 l00) {
        s s0 = l00 instanceof s ? ((s)l00) : null;
        if(s0 == null) {
            C0 c00 = l00.d();
            return c00 == null ? null : this.n0(c00);
        }
        return s0;
    }

    @Override  // I3.t
    public final void L(F0 f00) {
        this.y(f00);
    }

    @Override  // p3.j
    public j N(j j0) {
        return I3.q0.a.f(this, j0);
    }

    public final Object O() {
        Object object0 = this.b0();
        if(object0 instanceof l0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if(object0 instanceof z) {
            throw ((z)object0).a;
        }
        return y0.h(object0);
    }

    private final Throwable P(Object object0) {
        z z0 = object0 instanceof z ? ((z)object0) : null;
        return z0 == null ? null : z0.a;
    }

    private final Throwable S(c x0$c0, List list0) {
        if(list0.isEmpty()) {
            return x0$c0.f() ? new r0(x0.c(this), null, this) : null;
        }
        for(Object object0: list0) {
            if(!(((Throwable)object0) instanceof CancellationException)) {
                return ((Throwable)object0) == null ? ((Throwable)list0.get(0)) : ((Throwable)object0);
            }
            if(false) {
                break;
            }
        }
        return (Throwable)list0.get(0);
    }

    public boolean T() {
        return true;
    }

    @Override  // p3.j
    public j U(p3.j.c j$c0) {
        return I3.q0.a.e(this, j$c0);
    }

    @Override  // I3.F0
    public CancellationException V() {
        Throwable throwable0;
        Object object0 = this.b0();
        CancellationException cancellationException0 = null;
        if(object0 instanceof c) {
            throwable0 = ((c)object0).e();
        }
        else if(object0 instanceof z) {
            throwable0 = ((z)object0).a;
        }
        else if(!(object0 instanceof l0)) {
            throwable0 = null;
        }
        else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + object0).toString());
        }
        if(throwable0 instanceof CancellationException) {
            cancellationException0 = (CancellationException)throwable0;
        }
        return cancellationException0 == null ? new r0("Parent job is " + this.y0(object0), throwable0, this) : cancellationException0;
    }

    public boolean W() {
        return false;
    }

    private final C0 X(l0 l00) {
        C0 c00 = l00.d();
        if(c00 == null) {
            if(l00 instanceof Z) {
                return new C0();
            }
            if(!(l00 instanceof w0)) {
                throw new IllegalStateException(("State should have list: " + l00).toString());
            }
            this.u0(((w0)l00));
            return null;
        }
        return c00;
    }

    @Override  // p3.j
    public Object Y(Object object0, p p0) {
        return I3.q0.a.b(this, object0, p0);
    }

    @Override  // I3.q0
    public void Z(CancellationException cancellationException0) {
        if(cancellationException0 == null) {
            cancellationException0 = new r0(x0.c(this), null, this);
        }
        this.z(cancellationException0);
    }

    @Override  // p3.j$b
    public p3.j.b a(p3.j.c j$c0) {
        return I3.q0.a.c(this, j$c0);
    }

    public final r a0() {
        return (r)x0.g.get(this);
    }

    public final Object b0() {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = x0.f;
        while(true) {
            object0 = atomicReferenceFieldUpdater0.get(this);
            if(!(object0 instanceof y)) {
                break;
            }
            ((y)object0).a(this);
        }
        return object0;
    }

    // 去混淆评级： 低(20)
    public static final String c(x0 x00) {
        return "Job was cancelled";
    }

    protected boolean d0(Throwable throwable0) {
        return false;
    }

    public void e0(Throwable throwable0) {
        throw throwable0;
    }

    @Override  // I3.q0
    public final X f(l l0) {
        return this.t(false, true, l0);
    }

    protected final void f0(q0 q00) {
        if(q00 == null) {
            this.w0(D0.f);
            return;
        }
        q00.start();
        r r0 = q00.w(this);
        this.w0(r0);
        if(this.g0()) {
            r0.e();
            this.w0(D0.f);
        }
    }

    public final boolean g0() {
        return !(this.b0() instanceof l0);
    }

    @Override  // p3.j$b
    public final p3.j.c getKey() {
        return q0.b;
    }

    @Override  // I3.q0
    public q0 getParent() {
        r r0 = this.a0();
        return r0 == null ? null : r0.getParent();
    }

    protected boolean h0() {
        return false;
    }

    private final Object i0(Object object0) {
        Object object2;
        Object object1;
        Throwable throwable0 = null;
        Throwable throwable1 = null;
        do {
            do {
                object1 = this.b0();
                if(object1 instanceof c) {
                    synchronized(object1) {
                        if(((c)object1).h()) {
                            return y0.f();
                        }
                        boolean z = ((c)object1).f();
                        if(object0 != null || !z) {
                            if(throwable1 == null) {
                                throwable1 = this.G(object0);
                            }
                            ((c)object1).a(throwable1);
                        }
                        Throwable throwable2 = ((c)object1).e();
                        if(!z) {
                            throwable0 = throwable2;
                        }
                    }
                    if(throwable0 != null) {
                        this.o0(((c)object1).d(), throwable0);
                    }
                    return y0.a();
                }
                if(!(object1 instanceof l0)) {
                    return y0.f();
                }
                if(throwable1 == null) {
                    throwable1 = this.G(object0);
                }
                if(!((l0)object1).isActive()) {
                    goto label_29;
                }
            }
            while(!this.D0(((l0)object1), throwable1));
            return y0.a();
        label_29:
            object2 = this.E0(object1, new z(throwable1, false, 2, null));
            if(object2 == y0.a()) {
                throw new IllegalStateException(("Cannot happen in " + object1).toString());
            }
        }
        while(object2 == y0.b());
        return object2;
    }

    @Override  // I3.q0
    public boolean isActive() {
        Object object0 = this.b0();
        return object0 instanceof l0 && ((l0)object0).isActive();
    }

    public final boolean j0(Object object0) {
        Object object1;
        do {
            object1 = this.E0(this.b0(), object0);
            if(object1 == y0.a()) {
                return false;
            }
            if(object1 == y0.b) {
                return true;
            }
        }
        while(object1 == y0.b());
        this.q(object1);
        return true;
    }

    public final Object k0(Object object0) {
        Object object1;
        while((object1 = this.E0(this.b0(), object0)) != y0.a()) {
            if(object1 != y0.b()) {
                return object1;
            }
        }
        throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + object0, this.P(object0));
    }

    private final boolean l(Object object0, C0 c00, w0 w00) {
        public static final class d extends N3.q.a {
            final x0 d;
            final Object e;

            public d(q q0, x0 x00, Object object0) {
                this.d = x00;
                this.e = object0;
                super(q0);
            }

            @Override  // N3.b
            public Object d(Object object0) {
                return this.f(((q)object0));
            }

            public Object f(q q0) {
                return this.d.b0() == this.e ? null : N3.p.a();
            }
        }

        d x0$d0 = new d(w00, this, object0);
    alab1:
        while(true) {
            switch(c00.t().y(w00, c00, x0$d0)) {
                case 1: {
                    return true;
                }
                case 2: {
                    break alab1;
                }
            }
        }
        return false;
    }

    private final w0 l0(l l0, boolean z) {
        w0 w00 = null;
        if(z) {
            if(l0 instanceof s0) {
                w00 = (s0)l0;
            }
            if(w00 == null) {
                w00 = new o0(l0);
            }
        }
        else {
            if(l0 instanceof w0) {
                w00 = (w0)l0;
            }
            if(w00 == null) {
                w00 = new p0(l0);
            }
        }
        w00.B(this);
        return w00;
    }

    public String m0() {
        return M.a(this);
    }

    private final void n(Throwable throwable0, List list0) {
        if(list0.size() <= 1) {
            return;
        }
        Set set0 = Collections.newSetFromMap(new IdentityHashMap(list0.size()));
        for(Object object0: list0) {
            Throwable throwable1 = (Throwable)object0;
            if(throwable1 != throwable0 && !(throwable1 instanceof CancellationException) && set0.add(throwable1)) {
                l3.a.a(throwable0, throwable1);
            }
        }
    }

    private final s n0(q q0) {
        while(q0.u()) {
            q0 = q0.t();
        }
        do {
            do {
                q0 = q0.s();
            }
            while(q0.u());
            if(q0 instanceof s) {
                return (s)q0;
            }
        }
        while(!(q0 instanceof C0));
        return null;
    }

    private final void o0(C0 c00, Throwable throwable0) {
        Object object0 = c00.r();
        k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        q q0 = (q)object0;
        Throwable throwable1 = null;
        while(!k.a(q0, c00)) {
            if(q0 instanceof s0) {
                w0 w00 = (w0)q0;
                try {
                    w00.z(throwable0);
                }
                catch(Throwable throwable2) {
                    if(throwable1 == null) {
                        throwable1 = new C("Exception in completion handler " + w00 + " for " + this, throwable2);
                    }
                    else {
                        l3.a.a(throwable1, throwable2);
                    }
                }
            }
            q0 = q0.s();
        }
        if(throwable1 != null) {
            this.e0(throwable1);
        }
        this.B(throwable0);
    }

    private final void p0(C0 c00, Throwable throwable0) {
        Object object0 = c00.r();
        k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        q q0 = (q)object0;
        Throwable throwable1 = null;
        while(!k.a(q0, c00)) {
            if(q0 instanceof w0) {
                w0 w00 = (w0)q0;
                try {
                    w00.z(throwable0);
                }
                catch(Throwable throwable2) {
                    if(throwable1 == null) {
                        throwable1 = new C("Exception in completion handler " + w00 + " for " + this, throwable2);
                    }
                    else {
                        l3.a.a(throwable1, throwable2);
                    }
                }
            }
            q0 = q0.s();
        }
        if(throwable1 != null) {
            this.e0(throwable1);
        }
    }

    protected void q(Object object0) {
    }

    protected void q0(Throwable throwable0) {
    }

    protected void r0(Object object0) {
    }

    protected final Object s(f f0) {
        do {
            Object object0 = this.b0();
            if(!(object0 instanceof l0)) {
                if(object0 instanceof z) {
                    throw ((z)object0).a;
                }
                return y0.h(object0);
            }
        }
        while(this.x0(object0) < 0);
        return this.u(f0);
    }

    protected void s0() {
    }

    @Override  // I3.q0
    public final boolean start() {
    alab1:
        while(true) {
            switch(this.x0(this.b0())) {
                case 0: {
                    return false;
                }
                case 1: {
                    break alab1;
                }
            }
        }
        return true;
    }

    @Override  // I3.q0
    public final X t(boolean z, boolean z1, l l0) {
        Object object0;
        Throwable throwable0;
        X x0 = this.l0(l0, z);
        while(true) {
            do {
            label_1:
                throwable0 = null;
                object0 = this.b0();
                if(!(object0 instanceof Z)) {
                    goto label_9;
                }
                if(!((Z)object0).isActive()) {
                    this.t0(((Z)object0));
                    goto label_1;
                }
            }
            while(!androidx.concurrent.futures.b.a(x0.f, this, object0, x0));
            return x0;
        label_9:
            if(!(object0 instanceof l0)) {
                break;
            }
            C0 c00 = ((l0)object0).d();
            if(c00 == null) {
                k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                this.u0(((w0)object0));
                goto label_1;
            }
            X x1 = D0.f;
            if(z && object0 instanceof c) {
                __monitor_enter(object0);
                try {
                    throwable0 = ((c)object0).e();
                    if(throwable0 == null || l0 instanceof s && !((c)object0).g()) {
                        if(this.l(object0, c00, ((w0)x0))) {
                            goto label_27;
                        }
                        else {
                            goto label_25;
                        }
                    }
                    goto label_31;
                }
                catch(Throwable throwable1) {
                }
                __monitor_exit(object0);
                throw throwable1;
            label_25:
                __monitor_exit(object0);
                goto label_1;
            label_27:
                if(throwable0 == null) {
                    __monitor_exit(object0);
                    return x0;
                }
                x1 = x0;
            label_31:
                __monitor_exit(object0);
            }
            if(throwable0 != null) {
                if(z1) {
                    l0.h(throwable0);
                }
                return x1;
            }
            if(this.l(object0, c00, ((w0)x0))) {
                return x0;
            }
        }
        if(z1) {
            z z2 = object0 instanceof z ? ((z)object0) : null;
            if(z2 != null) {
                throwable0 = z2.a;
            }
            l0.h(throwable0);
        }
        return D0.f;
    }

    private final void t0(Z z0) {
        C0 c00 = new C0();
        if(!z0.isActive()) {
            c00 = new k0(c00);
        }
        androidx.concurrent.futures.b.a(x0.f, this, z0, c00);
    }

    @Override
    public String toString() {
        return this.B0() + '@' + M.b(this);
    }

    private final Object u(f f0) {
        a x0$a0 = new a(q3.b.b(f0), this);
        x0$a0.B();
        o.a(x0$a0, this.f(new G0(x0$a0)));
        Object object0 = x0$a0.y();
        if(object0 == q3.b.c()) {
            h.c(f0);
        }
        return object0;
    }

    private final void u0(w0 w00) {
        w00.m(new C0());
        q q0 = w00.s();
        androidx.concurrent.futures.b.a(x0.f, this, w00, q0);
    }

    @Override  // I3.q0
    public final CancellationException v() {
        Object object0 = this.b0();
        if(object0 instanceof c) {
            Throwable throwable0 = ((c)object0).e();
            if(throwable0 != null) {
                CancellationException cancellationException0 = this.z0(throwable0, M.a(this) + " is cancelling");
                if(cancellationException0 != null) {
                    return cancellationException0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if(object0 instanceof l0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        return object0 instanceof z ? x0.A0(this, ((z)object0).a, null, 1, null) : new r0(M.a(this) + " has completed normally", null, this);
    }

    public final void v0(w0 w00) {
        while(true) {
            Object object0 = this.b0();
            if(!(object0 instanceof w0)) {
                break;
            }
            if(object0 != w00) {
                return;
            }
            if(androidx.concurrent.futures.b.a(x0.f, this, object0, y0.c())) {
                return;
            }
        }
        if(object0 instanceof l0 && ((l0)object0).d() != null) {
            w00.v();
        }
    }

    @Override  // I3.q0
    public final r w(t t0) {
        X x0 = I3.q0.a.d(this, true, false, new s(t0), 2, null);
        k.c(x0, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r)x0;
    }

    public final void w0(r r0) {
        x0.g.set(this, r0);
    }

    public final boolean x(Throwable throwable0) {
        return this.y(throwable0);
    }

    private final int x0(Object object0) {
        if(object0 instanceof Z) {
            if(((Z)object0).isActive()) {
                return 0;
            }
            if(!androidx.concurrent.futures.b.a(x0.f, this, object0, y0.c())) {
                return -1;
            }
            this.s0();
            return 1;
        }
        if(object0 instanceof k0) {
            C0 c00 = ((k0)object0).d();
            if(!androidx.concurrent.futures.b.a(x0.f, this, object0, c00)) {
                return -1;
            }
            this.s0();
            return 1;
        }
        return 0;
    }

    public final boolean y(Object object0) {
        F f0 = y0.a();
        if(this.W()) {
            f0 = this.A(object0);
            if(f0 == y0.b) {
                return true;
            }
        }
        if(f0 == y0.a()) {
            f0 = this.i0(object0);
        }
        if(f0 != y0.a() && f0 != y0.b) {
            if(f0 == y0.f()) {
                return false;
            }
            this.q(f0);
        }
        return true;
    }

    private final String y0(Object object0) {
        if(object0 instanceof c) {
            if(((c)object0).f()) {
                return "Cancelling";
            }
            return ((c)object0).g() ? "Completing" : "Active";
        }
        if(object0 instanceof l0) {
            return ((l0)object0).isActive() ? "Active" : "New";
        }
        return object0 instanceof z ? "Cancelled" : "Completed";
    }

    public void z(Throwable throwable0) {
        this.y(throwable0);
    }

    protected final CancellationException z0(Throwable throwable0, String s) {
        CancellationException cancellationException0 = throwable0 instanceof CancellationException ? ((CancellationException)throwable0) : null;
        if(cancellationException0 == null) {
            if(s == null) {
                s = x0.c(this);
            }
            return new r0(s, throwable0, this);
        }
        return cancellationException0;
    }
}

