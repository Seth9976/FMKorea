package K3;

import I3.P0;
import I3.m;
import N3.C;
import N3.D;
import N3.F;
import N3.O;
import N3.x;
import androidx.appcompat.app.E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l3.n;
import l3.o;
import l3.u;
import p3.f;
import y3.l;
import y3.p;
import y3.q;
import z3.k;
import z3.y;

public class b implements d {
    private volatile Object _closeCause;
    private final int b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    public final l c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private final q d;
    private static final AtomicLongFieldUpdater e;
    private static final AtomicLongFieldUpdater f;
    private static final AtomicLongFieldUpdater g;
    private static final AtomicLongFieldUpdater h;
    private static final AtomicReferenceFieldUpdater i;
    private static final AtomicReferenceFieldUpdater j;
    private static final AtomicReferenceFieldUpdater k;
    private static final AtomicReferenceFieldUpdater l;
    private static final AtomicReferenceFieldUpdater m;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    static {
        b.e = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");
        b.f = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");
        b.g = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");
        b.h = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");
        b.i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");
        b.j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");
        b.k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");
        b.l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");
        b.m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    }

    public b(int v, l l0) {
        static final class a extends z3.l implements q {
            final b g;

            a(b b0) {
                this.g = b0;
                super(3);
            }

            public final l b(Q3.a a0, Object object0, Object object1) {
                static final class K3.b.a.a extends z3.l implements l {
                    final Object g;
                    final b h;

                    K3.b.a.a(Object object0, b b0, Q3.a a0) {
                        this.g = object0;
                        this.h = b0;
                        super(1);
                    }

                    public final void b(Throwable throwable0) {
                        F f0 = c.y();
                        if(this.g != f0) {
                            throw null;
                        }
                    }

                    @Override  // y3.l
                    public Object h(Object object0) {
                        this.b(((Throwable)object0));
                        return u.a;
                    }
                }

                return new K3.b.a.a(object1, this.g, a0);
            }

            @Override  // y3.q
            public Object f(Object object0, Object object1, Object object2) {
                E.a(object0);
                return this.b(null, object1, object2);
            }
        }

        this.b = v;
        this.c = l0;
        if(v < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + v + ", should be >=0").toString());
        }
        this.bufferEnd = c.s(v);
        this.completedExpandBuffersAndPauseFlag = this.C();
        h h0 = new h(0L, null, this, 3);
        this.sendSegment = h0;
        this.receiveSegment = h0;
        if(this.T()) {
            h0 = c.m();
            k.c(h0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = h0;
        this.d = l0 == null ? null : new a(this);
        this._closeCause = c.l();
    }

    private final h A(long v, h h0) {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = b.j;
        p p0 = (p)c.x();
    alab1:
        while(true) {
            object0 = N3.d.c(h0, v, p0);
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
        if(D.c(object0)) {
            this.w();
            long v1 = this.H();
            if(h0.h * ((long)c.b) >= v1) {
                return null;
            }
            h0.b();
            return null;
        }
        h h1 = (h)D.b(object0);
        if(!this.T() && v <= this.C() / ((long)c.b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1 = b.k;
            while(true) {
                C c2 = (C)atomicReferenceFieldUpdater1.get(this);
                if(c2.h >= h1.h || !h1.q()) {
                    break;
                }
                if(androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater1, this, c2, h1)) {
                    if(!c2.m()) {
                        break;
                    }
                    c2.k();
                    break;
                }
                if(h1.m()) {
                    h1.k();
                }
            }
        }
        long v2 = h1.h;
        if(v2 > v) {
            this.u0(v2 * ((long)c.b));
            long v3 = this.H();
            if(h1.h * ((long)c.b) < v3) {
                h1.b();
                return null;
            }
            return null;
        }
        return h1;
    }

    private final h B(long v, h h0) {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = b.i;
        p p0 = (p)c.x();
    alab1:
        while(true) {
            object0 = N3.d.c(h0, v, p0);
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
        if(D.c(object0)) {
            this.w();
            long v1 = this.F();
            if(h0.h * ((long)c.b) >= v1) {
                return null;
            }
            h0.b();
            return null;
        }
        h h1 = (h)D.b(object0);
        long v2 = h1.h;
        if(v2 > v) {
            this.v0(v2 * ((long)c.b));
            long v3 = this.F();
            if(h1.h * ((long)c.b) < v3) {
                h1.b();
                return null;
            }
            return null;
        }
        return h1;
    }

    private final long C() {
        return b.g.get(this);
    }

    protected final Throwable D() {
        return (Throwable)b.l.get(this);
    }

    private final Throwable E() {
        Throwable throwable0 = this.D();
        return throwable0 == null ? new i("Channel was closed") : throwable0;
    }

    public final long F() {
        return b.f.get(this);
    }

    protected final Throwable G() {
        Throwable throwable0 = this.D();
        return throwable0 == null ? new j("Channel was closed") : throwable0;
    }

    public final long H() {
        return b.e.get(this) & 0xFFFFFFFFFFFFFFFL;
    }

    public final boolean I() {
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = b.j;
            h h0 = (h)atomicReferenceFieldUpdater0.get(this);
            long v = this.F();
            if(Long.compare(this.H(), v) <= 0) {
                return false;
            }
            int v1 = c.b;
            long v2 = v / ((long)v1);
            if(h0.h != v2) {
                h h1 = this.A(v2, h0);
                if(h1 == null) {
                    if(((h)atomicReferenceFieldUpdater0.get(this)).h >= v2) {
                        continue;
                    }
                    return false;
                }
                else {
                    h0 = h1;
                }
            }
            h0.b();
            if(this.M(h0, ((int)(v % ((long)v1))), v)) {
                return true;
            }
            b.f.compareAndSet(this, v, v + 1L);
        }
    }

    private final void J(long v) {
        if((b.h.addAndGet(this, v) & 0x4000000000000000L) != 0L) {
            while((b.h.get(this) & 0x4000000000000000L) != 0L) {
            }
        }
    }

    static void K(b b0, long v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if((v1 & 1) != 0) {
            v = 1L;
        }
        b0.J(v);
    }

    private final void L() {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = b.m;
        do {
            object0 = atomicReferenceFieldUpdater0.get(this);
        }
        while(!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater0, this, object0, (object0 == null ? c.d() : c.e())));
        if(object0 == null) {
            return;
        }
        l l0 = (l)y.a(object0, 1);
        ((l)object0).h(this.D());
    }

    private final boolean M(h h0, int v, long v1) {
        do {
            Object object0 = h0.w(v);
            if(object0 != null && object0 != c.k()) {
                if(object0 == c.d) {
                    return true;
                }
                if(object0 == c.j()) {
                    return false;
                }
                if(object0 == c.y()) {
                    return false;
                }
                if(object0 == c.f()) {
                    return false;
                }
                if(object0 == c.n()) {
                    return false;
                }
                if(object0 == c.o()) {
                    return true;
                }
                return object0 == c.p() ? false : v1 == this.F();
            }
        }
        while(!h0.r(v, object0, c.n()));
        this.y();
        return false;
    }

    private final boolean N(long v, boolean z) {
        switch(((int)(v >> 60))) {
            case 0: 
            case 1: {
                return false;
            }
            case 2: {
                this.v(v & 0xFFFFFFFFFFFFFFFL);
                return !z || !this.I();
            }
            case 3: {
                this.u(v & 0xFFFFFFFFFFFFFFFL);
                return true;
            }
            default: {
                throw new IllegalStateException(("unexpected close status: " + ((int)(v >> 60))).toString());
            }
        }
    }

    public boolean O() {
        return this.P(b.e.get(this));
    }

    private final boolean P(long v) {
        return this.N(v, true);
    }

    public boolean Q() {
        return this.R(b.e.get(this));
    }

    private final boolean R(long v) {
        return this.N(v, false);
    }

    protected boolean S() {
        return false;
    }

    private final boolean T() {
        long v = this.C();
        return v == 0L || v == 0x7FFFFFFFFFFFFFFFL;
    }

    private final long U(h h0) {
        do {
            for(int v = c.b - 1; -1 < v; --v) {
                long v1 = h0.h * ((long)c.b) + ((long)v);
                if(v1 < this.F()) {
                    return -1L;
                }
                while(true) {
                    Object object0 = h0.w(v);
                    if(object0 != null && object0 != c.e) {
                        if(object0 != c.d) {
                            break;
                        }
                        return v1;
                    }
                    if(h0.r(v, object0, c.y())) {
                        h0.p();
                        break;
                    }
                }
            }
            h0 = (h)h0.g();
        }
        while(h0 != null);
        return -1L;
    }

    private final void V() {
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = b.e;
        do {
            long v = atomicLongFieldUpdater0.get(this);
        }
        while(((int)(v >> 60)) == 0 && !atomicLongFieldUpdater0.compareAndSet(this, v, c.b(0xFFFFFFFFFFFFFFFL & v, 1)));
    }

    private final void W() {
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = b.e;
        do {
            long v = atomicLongFieldUpdater0.get(this);
        }
        while(!atomicLongFieldUpdater0.compareAndSet(this, v, c.b(0xFFFFFFFFFFFFFFFL & v, 3)));
    }

    private final void X() {
        long v1;
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = b.e;
        do {
            long v = atomicLongFieldUpdater0.get(this);
            switch(((int)(v >> 60))) {
                case 0: {
                    v1 = c.b(v & 0xFFFFFFFFFFFFFFFL, 2);
                    break;
                }
                case 1: {
                    v1 = c.b(v & 0xFFFFFFFFFFFFFFFL, 3);
                    break;
                }
                default: {
                    return;
                }
            }
        }
        while(!atomicLongFieldUpdater0.compareAndSet(this, v, v1));
    }

    private final void Y(long v, h h0) {
        while(h0.h < v) {
            h h1 = (h)h0.e();
            if(h1 == null) {
                break;
            }
            h0 = h1;
        }
    alab1:
        while(true) {
            if(h0.h()) {
                h h2 = (h)h0.e();
                if(h2 != null) {
                    h0 = h2;
                    continue;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = b.k;
            while(true) {
                C c0 = (C)atomicReferenceFieldUpdater0.get(this);
                if(c0.h >= h0.h) {
                    break alab1;
                }
                if(!h0.q()) {
                    break;
                }
                if(androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater0, this, c0, h0)) {
                    if(!c0.m()) {
                        break alab1;
                    }
                    c0.k();
                    return;
                }
                if(h0.m()) {
                    h0.k();
                }
            }
        }
    }

    protected void Z() {
    }

    @Override  // K3.l
    public Object a(f f0) {
        return b.f0(this, f0);
    }

    private final void a0(I3.l l0) {
        l0.e(n.a(o.a(this.E())));
    }

    @Override  // K3.l
    public Object b() {
        Object object0;
        h h2;
        long v = b.f.get(this);
        long v1 = b.e.get(this);
        if(this.P(v1)) {
            Throwable throwable0 = this.D();
            return K3.f.a.a(throwable0);
        }
        if(v >= (v1 & 0xFFFFFFFFFFFFFFFL)) {
            return K3.f.a.b();
        }
        F f0 = c.k;
        h h0 = (h)b.j.get(this);
        while(true) {
            if(this.O()) {
                Throwable throwable1 = this.D();
                return K3.f.a.a(throwable1);
            }
            long v2 = b.f.getAndIncrement(this);
            long v3 = v2 / ((long)c.b);
            int v4 = (int)(v2 % ((long)c.b));
            if(h0.h == v3) {
                h2 = h0;
            }
            else {
                h h1 = this.A(v3, h0);
                if(h1 == null) {
                    continue;
                }
                h2 = h1;
            }
            object0 = this.q0(h2, v4, v2, f0);
            if(object0 == c.m) {
                P0 p00 = f0 instanceof P0 ? ((P0)f0) : null;
                if(p00 != null) {
                    this.d0(p00, h2, v4);
                }
                this.w0(v2);
                h2.p();
                return K3.f.a.b();
            }
            if(object0 != c.o) {
                break;
            }
            if(v2 < this.H()) {
                h2.b();
            }
            h0 = h2;
        }
        if(object0 == c.n) {
            throw new IllegalStateException("unexpected");
        }
        h2.b();
        return K3.f.a.c(object0);
    }

    protected void b0() {
    }

    @Override  // K3.m
    public boolean c(Throwable throwable0) {
        return this.t(throwable0, false);
    }

    protected void c0() {
    }

    @Override  // K3.m
    public Object d(Object object0) {
        h h2;
        int v3;
        if(this.l0(b.e.get(this))) {
            return K3.f.a.b();
        }
        F f0 = c.j;
        h h0 = (h)b.i.get(this);
    alab1:
        while(true) {
            long v = b.e.getAndIncrement(this);
            long v1 = v & 0xFFFFFFFFFFFFFFFL;
            boolean z = this.R(v);
            long v2 = v1 / ((long)c.b);
            v3 = (int)(v1 % ((long)c.b));
            if(h0.h == v2) {
            label_16:
                h2 = h0;
            }
            else {
                h h1 = this.B(v2, h0);
                if(h1 == null) {
                    if(!z) {
                        continue;
                    }
                    goto label_31;
                }
                else {
                    h2 = h1;
                    goto label_17;
                }
                goto label_16;
            }
        label_17:
            switch(this.s0(h2, v3, object0, v1, f0, z)) {
                case 0: {
                    h2.b();
                    return K3.f.a.c(u.a);
                }
                case 1: {
                    return K3.f.a.c(u.a);
                }
                case 2: {
                    goto label_29;
                }
                case 3: {
                    throw new IllegalStateException("unexpected");
                }
                case 4: {
                    break alab1;
                }
                case 5: {
                    h2.b();
                    h0 = h2;
                    break;
                }
                default: {
                    h0 = h2;
                    break;
                }
            }
        }
        if(v1 >= this.F()) {
            goto label_31;
        }
        h2.b();
        goto label_31;
    label_29:
        if(z) {
            h2.p();
        label_31:
            Throwable throwable0 = this.G();
            return K3.f.a.a(throwable0);
        }
        P0 p00 = f0 instanceof P0 ? ((P0)f0) : null;
        if(p00 != null) {
            this.e0(p00, h2, v3);
        }
        h2.p();
        return K3.f.a.b();
    }

    private final void d0(P0 p00, h h0, int v) {
        p00.a(h0, v);
    }

    private final void e0(P0 p00, h h0, int v) {
        p00.a(h0, v + c.b);
    }

    static Object f0(b b0, f f0) {
        h h0 = (h)b.g().get(b0);
        while(!b0.O()) {
            long v = b.h().getAndIncrement(b0);
            long v1 = v / ((long)c.b);
            int v2 = (int)(v % ((long)c.b));
            if(h0.h != v1) {
                h h1 = b0.A(v1, h0);
                if(h1 == null) {
                    continue;
                }
                h0 = h1;
            }
            Object object0 = b.o(b0, h0, v2, v, null);
            if(object0 == c.q()) {
                throw new IllegalStateException("unexpected");
            }
            if(object0 == c.o) {
                if(v >= b0.H()) {
                    continue;
                }
                h0.b();
                continue;
            }
            if(object0 == c.r()) {
                return b0.g0(h0, v2, v, f0);
            }
            h0.b();
            return object0;
        }
        throw N3.E.a(b0.E());
    }

    private final Object g0(h h0, int v, long v1, f f0) {
        m m0 = I3.o.b(q3.b.b(f0));
        try {
            l l0 = null;
            Object object0 = b.o(this, h0, v, v1, m0);
            if(object0 == c.m) {
                b.m(this, m0, h0, v);
            }
            else if(object0 == c.o) {
                if(v1 < this.H()) {
                    h0.b();
                }
                h h1 = (h)b.j.get(this);
                while(!this.O()) {
                    long v2 = b.f.getAndIncrement(this);
                    long v3 = v2 / ((long)c.b);
                    int v4 = (int)(v2 % ((long)c.b));
                    if(h1.h != v3) {
                        h h2 = this.A(v3, h1);
                        if(h2 == null) {
                            continue;
                        }
                        h1 = h2;
                    }
                    object0 = b.o(this, h1, v4, v2, m0);
                    if(object0 == c.m) {
                        goto label_31;
                    }
                    if(object0 == c.o) {
                        if(v2 >= this.H()) {
                            continue;
                        }
                        h1.b();
                        continue;
                    }
                    if(object0 == c.n) {
                        throw new IllegalStateException("unexpected");
                    }
                    h1.b();
                    l l1 = this.c;
                    if(l1 == null) {
                        m0.o(object0, null);
                        goto label_49;
                    label_31:
                        if(m0 instanceof P0) {
                            l0 = m0;
                        }
                        if(l0 != null) {
                            b.m(this, ((P0)l0), h1, v4);
                        }
                    }
                    else {
                        m0.o(object0, x.a(l1, object0, m0.getContext()));
                    }
                    goto label_49;
                }
                b.l(this, m0);
            }
            else {
                h0.b();
                l l2 = this.c;
                if(l2 != null) {
                    l0 = x.a(l2, object0, m0.getContext());
                }
                m0.o(object0, l0);
            }
        }
        catch(Throwable throwable0) {
            m0.K();
            throw throwable0;
        }
    label_49:
        Object object1 = m0.y();
        if(object1 == q3.b.c()) {
            r3.h.c(f0);
        }
        return object1;
    }

    private final void h0(h h0) {
        P0 p00;
        Object object1;
        l l0 = this.c;
        Throwable throwable0 = null;
        Object object0 = N3.l.b(null, 1, null);
    alab1:
        do {
            int v = c.b - 1;
            while(-1 < v) {
                long v1 = h0.h * ((long)c.b) + ((long)v);
            alab2:
                do {
                    do {
                        do {
                            do {
                                object1 = h0.w(v);
                                if(object1 == c.i) {
                                    break alab1;
                                }
                                if(object1 != c.d) {
                                    goto label_16;
                                }
                                if(v1 < this.F()) {
                                    break alab1;
                                }
                            }
                            while(!h0.r(v, object1, c.y()));
                            if(l0 != null) {
                                throwable0 = x.c(l0, h0.v(v), ((O)throwable0));
                            }
                            h0.s(v);
                            h0.p();
                            break;
                        label_16:
                            if(object1 == c.e || object1 == null) {
                                continue alab2;
                            }
                            if(object1 instanceof P0 || object1 instanceof K3.n) {
                                goto label_21;
                            }
                            if(object1 == c.g || object1 == c.f) {
                                break alab1;
                            }
                        }
                        while(object1 == c.g);
                        goto label_32;
                    label_21:
                        if(v1 < this.F()) {
                            break alab1;
                        }
                        p00 = object1 instanceof K3.n ? ((K3.n)object1).a : ((P0)object1);
                    }
                    while(!h0.r(v, object1, c.y()));
                    if(l0 != null) {
                        throwable0 = x.c(l0, h0.v(v), ((O)throwable0));
                    }
                    object0 = N3.l.c(object0, p00);
                    h0.s(v);
                    h0.p();
                    goto label_32;
                }
                while(!h0.r(v, object1, c.y()));
                h0.p();
            label_32:
                --v;
            }
            h0 = (h)h0.g();
        }
        while(h0 != null);
        if(object0 != null) {
            if(object0 instanceof ArrayList) {
                k.c(object0, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                for(int v2 = ((ArrayList)object0).size() - 1; -1 < v2; --v2) {
                    this.j0(((P0)((ArrayList)object0).get(v2)));
                }
            }
            else {
                this.j0(((P0)object0));
            }
        }
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    private final void i0(P0 p00) {
        this.k0(p00, true);
    }

    private final void j0(P0 p00) {
        this.k0(p00, false);
    }

    private final void k0(P0 p00, boolean z) {
        if(!(p00 instanceof I3.l)) {
            throw new IllegalStateException(("Unexpected waiter: " + p00).toString());
        }
        ((f)p00).e(n.a(o.a((z ? this.E() : this.G()))));
    }

    public static final void l(b b0, I3.l l0) {
        b0.a0(l0);
    }

    // 去混淆评级： 低(20)
    private final boolean l0(long v) {
        return this.R(v) ? false : !this.q(v & 0xFFFFFFFFFFFFFFFL);
    }

    private final boolean m0(Object object0, Object object1) {
        if(!(object0 instanceof I3.l)) {
            throw new IllegalStateException(("Unexpected receiver type: " + object0).toString());
        }
        k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        return this.c == null ? c.A(((I3.l)object0), object1, null) : c.A(((I3.l)object0), object1, x.a(this.c, object1, ((I3.l)object0).getContext()));
    }

    private final boolean n0(Object object0, h h0, int v) {
        if(!(object0 instanceof I3.l)) {
            throw new IllegalStateException(("Unexpected waiter: " + object0).toString());
        }
        k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        return c.B(((I3.l)object0), u.a, null, 2, null);
    }

    private final boolean o0(h h0, int v, long v1) {
        Object object0 = h0.w(v);
        if(object0 instanceof P0 && v1 >= b.f.get(this) && h0.r(v, object0, c.g)) {
            if(this.n0(object0, h0, v)) {
                h0.A(v, c.d);
                return true;
            }
            h0.A(v, c.j);
            h0.x(v, false);
            return false;
        }
        return this.p0(h0, v, v1);
    }

    private final boolean p0(h h0, int v, long v1) {
        Object object0;
        do {
            while(true) {
            alab1:
                while(true) {
                    do {
                        object0 = h0.w(v);
                        if(!(object0 instanceof P0)) {
                            break alab1;
                        }
                        if(v1 >= b.f.get(this)) {
                            goto label_5;
                        }
                    }
                    while(!h0.r(v, object0, new K3.n(((P0)object0))));
                    return true;
                label_5:
                    if(h0.r(v, object0, c.g)) {
                        if(this.n0(object0, h0, v)) {
                            h0.A(v, c.d);
                            return true;
                        }
                        h0.A(v, c.j);
                        h0.x(v, false);
                        return false;
                    }
                }
                if(object0 == c.j) {
                    return false;
                }
                if(object0 != null) {
                    break;
                }
                if(h0.r(v, null, c.e)) {
                    return true;
                }
            }
            if(object0 == c.d) {
                return true;
            }
            if(object0 == c.h || object0 == c.i || object0 == c.k || object0 == c.y()) {
                return true;
            }
        }
        while(object0 == c.f);
        throw new IllegalStateException(("Unexpected cell state: " + object0).toString());
    }

    private final boolean q(long v) {
        return v < this.C() || v < this.F() + ((long)this.b);
    }

    private final Object q0(h h0, int v, long v1, Object object0) {
        Object object1 = h0.w(v);
        if(object1 == null) {
            if(v1 >= (b.e.get(this) & 0xFFFFFFFFFFFFFFFL)) {
                if(object0 == null) {
                    return c.n;
                }
                if(h0.r(v, null, object0)) {
                    this.y();
                    return c.m;
                }
            }
        }
        else if(object1 == c.d && h0.r(v, object1, c.i)) {
            this.y();
            return h0.y(v);
        }
        return this.r0(h0, v, v1, object0);
    }

    private final void r(h h0, long v) {
        Object object1;
        Object object0 = N3.l.b(null, 1, null);
    alab1:
        while(h0 != null) {
            int v1 = c.b - 1;
            while(-1 < v1) {
                if(h0.h * ((long)c.b) + ((long)v1) < v) {
                    break alab1;
                }
            alab2:
                while(true) {
                    do {
                        do {
                            object1 = h0.w(v1);
                            if(object1 == null || object1 == c.e) {
                                goto label_17;
                            }
                            if(!(object1 instanceof K3.n)) {
                                goto label_12;
                            }
                        }
                        while(!h0.r(v1, object1, c.y()));
                        object0 = N3.l.c(object0, ((K3.n)object1).a);
                        h0.x(v1, true);
                        break alab2;
                    label_12:
                        if(!(object1 instanceof P0)) {
                            break alab2;
                        }
                    }
                    while(!h0.r(v1, object1, c.y()));
                    object0 = N3.l.c(object0, object1);
                    h0.x(v1, true);
                    break;
                label_17:
                    if(h0.r(v1, object1, c.y())) {
                        h0.p();
                        break;
                    }
                }
                --v1;
            }
            h0 = (h)h0.g();
        }
        if(object0 != null) {
            if(!(object0 instanceof ArrayList)) {
                this.i0(((P0)object0));
                return;
            }
            k.c(object0, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            for(int v2 = ((ArrayList)object0).size() - 1; -1 < v2; --v2) {
                this.i0(((P0)((ArrayList)object0).get(v2)));
            }
        }
    }

    private final Object r0(h h0, int v, long v1, Object object0) {
        P0 p00;
        do {
            while(true) {
            alab1:
                while(true) {
                    do {
                        p00 = h0.w(v);
                        if(p00 == null || p00 == c.e) {
                            break alab1;
                        }
                        if(p00 != c.d) {
                            goto label_6;
                        }
                    }
                    while(!h0.r(v, p00, c.i));
                    this.y();
                    return h0.y(v);
                label_6:
                    if(p00 == c.j) {
                        return c.o;
                    }
                    if(p00 == c.h) {
                        return c.o;
                    }
                    if(p00 == c.y()) {
                        this.y();
                        return c.o;
                    }
                    if(p00 != c.g && h0.r(v, p00, c.f)) {
                        boolean z = p00 instanceof K3.n;
                        if(z) {
                            p00 = ((K3.n)p00).a;
                        }
                        if(this.n0(p00, h0, v)) {
                            h0.A(v, c.i);
                            this.y();
                            return h0.y(v);
                        }
                        h0.A(v, c.j);
                        h0.x(v, false);
                        if(z) {
                            this.y();
                        }
                        return c.o;
                    }
                }
                if(v1 >= (b.e.get(this) & 0xFFFFFFFFFFFFFFFL)) {
                    break;
                }
                if(h0.r(v, p00, c.h)) {
                    this.y();
                    return c.o;
                }
            }
            if(object0 == null) {
                return c.n;
            }
        }
        while(!h0.r(v, p00, object0));
        this.y();
        return c.m;
    }

    private final h s() {
        h h0 = b.k.get(this);
        h h1 = (h)b.i.get(this);
        if(h1.h > h0.h) {
            h0 = h1;
        }
        h h2 = (h)b.j.get(this);
        if(h2.h > h0.h) {
            h0 = h2;
        }
        return (h)N3.d.b(h0);
    }

    private final int s0(h h0, int v, Object object0, long v1, Object object1, boolean z) {
        h0.B(v, object0);
        if(z) {
            return this.t0(h0, v, object0, v1, object1, true);
        }
        Object object2 = h0.w(v);
        if(object2 == null) {
            if(this.q(v1)) {
                return h0.r(v, null, c.d) ? 1 : this.t0(h0, v, object0, v1, object1, false);
            }
            if(object1 == null) {
                return 3;
            }
            return h0.r(v, null, object1) ? 2 : this.t0(h0, v, object0, v1, object1, false);
        }
        if(object2 instanceof P0) {
            h0.s(v);
            if(this.m0(object2, object0)) {
                h0.A(v, c.i);
                return 0;
            }
            if(h0.t(v, c.k) != c.k) {
                h0.x(v, true);
            }
            return 5;
        }
        return this.t0(h0, v, object0, v1, object1, false);
    }

    protected boolean t(Throwable throwable0, boolean z) {
        if(z) {
            this.V();
        }
        boolean z1 = androidx.concurrent.futures.b.a(b.l, this, c.s, throwable0);
        if(z) {
            this.W();
        }
        else {
            this.X();
        }
        this.w();
        if(z1) {
            this.L();
        }
        return z1;
    }

    private final int t0(h h0, int v, Object object0, long v1, Object object1, boolean z) {
        P0 p00;
        while(true) {
        alab1:
            while(true) {
                do {
                    do {
                        p00 = h0.w(v);
                        if(p00 != null) {
                            break alab1;
                        }
                        if(!this.q(v1) || z) {
                            goto label_5;
                        }
                    }
                    while(!h0.r(v, null, c.d));
                    return 1;
                label_5:
                    if(!z) {
                        goto label_9;
                    }
                }
                while(!h0.r(v, null, c.j));
                h0.x(v, false);
                return 4;
            label_9:
                if(object1 == null) {
                    return 3;
                }
                if(h0.r(v, null, object1)) {
                    return 2;
                }
            }
            if(p00 != c.e) {
                break;
            }
            if(h0.r(v, p00, c.d)) {
                return 1;
            }
        }
        if(p00 == c.k) {
            h0.s(v);
            return 5;
        }
        if(p00 == c.h) {
            h0.s(v);
            return 5;
        }
        if(p00 == c.y()) {
            h0.s(v);
            this.w();
            return 4;
        }
        h0.s(v);
        if(p00 instanceof K3.n) {
            p00 = ((K3.n)p00).a;
        }
        if(this.m0(p00, object0)) {
            h0.A(v, c.i);
            return 0;
        }
        if(h0.t(v, c.k) != c.k) {
            h0.x(v, true);
        }
        return 5;
    }

    @Override
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        switch(((int)(b.e.get(this) >> 60))) {
            case 2: {
                stringBuilder0.append("closed,");
                break;
            }
            case 3: {
                stringBuilder0.append("cancelled,");
            }
        }
        stringBuilder0.append("capacity=" + this.b + ',');
        stringBuilder0.append("data=[");
        Iterable iterable0 = m3.o.k(new h[]{b.j.get(this), b.i.get(this), b.k.get(this)});
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((h)object0) != c.a) {
                arrayList0.add(object0);
            }
        }
        Iterator iterator1 = arrayList0.iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator1.next();
        if(iterator1.hasNext()) {
            long v = ((h)object1).h;
            while(true) {
                Object object2 = iterator1.next();
                long v1 = ((h)object2).h;
                if(v > v1) {
                    object1 = object2;
                    v = v1;
                }
                if(!iterator1.hasNext()) {
                    break;
                }
            }
        }
        h h0 = (h)object1;
        long v2 = this.F();
        long v3 = this.H();
    alab1:
        do {
            int v4 = c.b;
            int v5 = 0;
            while(v5 < v4) {
                long v6 = h0.h * ((long)c.b) + ((long)v5);
                int v7 = Long.compare(v6, v3);
                if(v7 >= 0 && v6 >= v2) {
                    break alab1;
                }
                Object object3 = h0.w(v5);
                Object object4 = h0.v(v5);
                if(object3 instanceof I3.l) {
                    int v8 = Long.compare(v6, v2);
                    if(v8 < 0 && v7 >= 0) {
                        s = "receive";
                    }
                    else if(v7 >= 0 || v8 < 0) {
                        s = "cont";
                    }
                    else {
                        s = "send";
                    }
                    goto label_56;
                }
                else if(object3 instanceof K3.n) {
                    s = "EB(" + object3 + ')';
                    goto label_56;
                }
                else if((k.a(object3, c.f) ? true : k.a(object3, c.g))) {
                    s = "resuming_sender";
                    goto label_56;
                }
                else if(!((((((object3 == null ? true : k.a(object3, c.e)) ? true : k.a(object3, c.i)) ? true : k.a(object3, c.h)) ? true : k.a(object3, c.k)) ? true : k.a(object3, c.j)) ? true : k.a(object3, c.y()))) {
                    s = object3.toString();
                label_56:
                    if(object4 == null) {
                        stringBuilder0.append(s + ',');
                    }
                    else {
                        stringBuilder0.append('(' + s + ',' + object4 + "),");
                    }
                }
                ++v5;
            }
            h0 = (h)h0.e();
        }
        while(h0 != null);
        if(G3.h.i0(stringBuilder0) == 44) {
            k.d(stringBuilder0.deleteCharAt(stringBuilder0.length() - 1), "this.deleteCharAt(index)");
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    private final void u(long v) {
        this.h0(this.v(v));
    }

    private final void u0(long v) {
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = b.f;
        do {
            long v1 = atomicLongFieldUpdater0.get(this);
            if(v1 >= v) {
                return;
            }
        }
        while(!b.f.compareAndSet(this, v1, v));
    }

    private final h v(long v) {
        h h0 = this.s();
        if(this.S()) {
            long v1 = this.U(h0);
            if(v1 != -1L) {
                this.x(v1);
            }
        }
        this.r(h0, v);
        return h0;
    }

    private final void v0(long v) {
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = b.e;
        do {
            long v1 = atomicLongFieldUpdater0.get(this);
            if((0xFFFFFFFFFFFFFFFL & v1) >= v) {
                return;
            }
        }
        while(!b.e.compareAndSet(this, v1, c.b(0xFFFFFFFFFFFFFFFL & v1, ((int)(v1 >> 60)))));
    }

    private final void w() {
        this.Q();
    }

    public final void w0(long v) {
        AtomicLongFieldUpdater atomicLongFieldUpdater1;
        if(this.T()) {
            return;
        }
        while(this.C() <= v) {
        }
        int v1 = c.c;
        for(int v2 = 0; v2 < v1; ++v2) {
            long v3 = this.C();
            if(v3 == (0x3FFFFFFFFFFFFFFFL & b.h.get(this)) && v3 == this.C()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = b.h;
        do {
            long v4 = atomicLongFieldUpdater0.get(this);
        }
        while(!atomicLongFieldUpdater0.compareAndSet(this, v4, c.u(v4 & 0x3FFFFFFFFFFFFFFFL, true)));
        while(true) {
            long v5 = this.C();
            atomicLongFieldUpdater1 = b.h;
            long v6 = atomicLongFieldUpdater1.get(this);
            long v7 = v6 & 0x3FFFFFFFFFFFFFFFL;
            if(v5 == v7 && v5 == this.C()) {
                break;
            }
            if((0x4000000000000000L & v6) == 0L) {
                atomicLongFieldUpdater1.compareAndSet(this, v6, c.u(v7, true));
            }
        }
        do {
            long v8 = atomicLongFieldUpdater1.get(this);
        }
        while(!atomicLongFieldUpdater1.compareAndSet(this, v8, c.u(v8 & 0x3FFFFFFFFFFFFFFFL, false)));
    }

    protected final void x(long v) {
        O o0;
        l l0;
        Object object0;
        int v4;
        long v1;
        h h0 = (h)b.j.get(this);
        while(true) {
            while(true) {
                while(true) {
                    while(true) {
                        do {
                        label_1:
                            AtomicLongFieldUpdater atomicLongFieldUpdater0 = b.f;
                            v1 = atomicLongFieldUpdater0.get(this);
                            long v2 = this.C();
                            if(v < Math.max(((long)this.b) + v1, v2)) {
                                return;
                            }
                        }
                        while(!atomicLongFieldUpdater0.compareAndSet(this, v1, v1 + 1L));
                        long v3 = v1 / ((long)c.b);
                        v4 = (int)(v1 % ((long)c.b));
                        if(h0.h == v3) {
                            break;
                        }
                        h h1 = this.A(v3, h0);
                        if(h1 != null) {
                            h0 = h1;
                            break;
                        }
                    }
                    object0 = this.q0(h0, v4, v1, null);
                    if(object0 != c.o) {
                        break;
                    }
                    if(v1 < this.H()) {
                        h0.b();
                    }
                }
                h0.b();
                l0 = this.c;
                if(l0 == null) {
                    goto label_1;
                }
                break;
            }
            o0 = x.d(l0, object0, null, 2, null);
            if(o0 == null) {
                goto label_1;
            }
            break;
        }
        throw o0;
    }

    private final void y() {
        if(this.T()) {
            return;
        }
        h h0 = (h)b.k.get(this);
        while(true) {
            long v = b.g.getAndIncrement(this);
            int v1 = c.b;
            long v2 = v / ((long)v1);
            if(Long.compare(this.H(), v) <= 0) {
                if(h0.h < v2 && h0.e() != null) {
                    this.Y(v2, h0);
                }
                b.K(this, 0L, 1, null);
                return;
            }
            if(h0.h != v2) {
                h h1 = this.z(v2, h0, v);
                if(h1 == null) {
                    continue;
                }
                h0 = h1;
            }
            if(this.o0(h0, ((int)(v % ((long)v1))), v)) {
                b.K(this, 0L, 1, null);
                return;
            }
            b.K(this, 0L, 1, null);
        }
    }

    private final h z(long v, h h0, long v1) {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = b.k;
        p p0 = (p)c.x();
    alab1:
        while(true) {
            object0 = N3.d.c(h0, v, p0);
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
        if(D.c(object0)) {
            this.w();
            this.Y(v, h0);
            b.K(this, 0L, 1, null);
            return null;
        }
        C c2 = D.b(object0);
        long v2 = ((h)c2).h;
        if(v2 > v) {
            int v3 = c.b;
            if(b.g.compareAndSet(this, v1 + 1L, ((long)v3) * v2)) {
                this.J(((h)c2).h * ((long)v3) - v1);
                return null;
            }
            b.K(this, 0L, 1, null);
            return null;
        }
        return (h)c2;
    }
}

