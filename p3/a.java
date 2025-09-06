package P3;

import I3.M;
import N3.A;
import N3.F;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import z3.g;
import z3.k;
import z3.u;

public final class a implements Closeable, Executor {
    public static final class P3.a.a {
        private P3.a.a() {
        }

        public P3.a.a(g g0) {
        }
    }

    public abstract class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[d.values().length];
            try {
                arr_v[d.h.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.i.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.j.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    public final class c extends Thread {
        public final n f;
        private final u g;
        public d h;
        private long i;
        private volatile int indexInArray;
        private long j;
        private int k;
        public boolean l;
        final a m;
        private static final AtomicIntegerFieldUpdater n;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        static {
            c.n = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        }

        private c() {
            this.setDaemon(true);
            this.f = new n();
            this.g = new u();
            this.h = d.i;
            this.nextParkedWorker = a.q;
            this.k = B3.c.f.b();
        }

        public c(int v) {
            this.q(v);
        }

        public static final a a(c a$c0) {
            return a.this;
        }

        private final void b(int v) {
            if(v == 0) {
                return;
            }
            a.o.addAndGet(a.this, 0xFFFFFFFFFFE00000L);
            if(this.h != d.j) {
                this.h = d.i;
            }
        }

        private final void c(int v) {
            if(v == 0) {
                return;
            }
            if(this.u(d.g)) {
                a.this.R();
            }
        }

        private final void d(h h0) {
            int v = h0.g.b();
            this.k(v);
            this.c(v);
            a.this.M(h0);
            this.b(v);
        }

        private final h e(boolean z) {
            if(z) {
                boolean z1 = this.m(a.this.f * 2) == 0;
                if(z1) {
                    h h0 = this.o();
                    if(h0 != null) {
                        return h0;
                    }
                }
                h h1 = this.f.g();
                if(h1 != null) {
                    return h1;
                }
                if(!z1) {
                    h h2 = this.o();
                    return h2 == null ? this.v(3) : h2;
                }
                return this.v(3);
            }
            h h3 = this.o();
            return h3 == null ? this.v(3) : h3;
        }

        private final h f() {
            h h0 = this.f.h();
            if(h0 == null) {
                h0 = (h)a.this.k.d();
                return h0 == null ? this.v(1) : h0;
            }
            return h0;
        }

        // 去混淆评级： 低(20)
        public final h g(boolean z) {
            return this.s() ? this.e(z) : this.f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return c.n;
        }

        private final void k(int v) {
            this.i = 0L;
            if(this.h == d.h) {
                this.h = d.g;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.q;
        }

        public final int m(int v) {
            int v1 = this.k ^ this.k << 13;
            int v2 = v1 ^ v1 >> 17;
            int v3 = v2 ^ v2 << 5;
            this.k = v3;
            return (v - 1 & v) == 0 ? v3 & v - 1 : (v3 & 0x7FFFFFFF) % v;
        }

        private final void n() {
            if(this.i == 0L) {
                this.i = System.nanoTime() + a.this.h;
            }
            LockSupport.parkNanos(a.this.h);
            if(System.nanoTime() - this.i >= 0L) {
                this.i = 0L;
                this.w();
            }
        }

        private final h o() {
            if(this.m(2) == 0) {
                h h0 = (h)a.this.j.d();
                return h0 == null ? ((h)a.this.k.d()) : h0;
            }
            h h1 = (h)a.this.k.d();
            return h1 == null ? ((h)a.this.j.d()) : h1;
        }

        private final void p() {
        alab1:
            while(true) {
                boolean z = false;
                while(true) {
                    if(a.this.isTerminated() || this.h == d.j) {
                        break alab1;
                    }
                    h h0 = this.g(this.l);
                    if(h0 != null) {
                        this.j = 0L;
                        this.d(h0);
                        break;
                    }
                    this.l = false;
                    if(this.j == 0L) {
                        this.t();
                    }
                    else {
                        if(z) {
                            this.u(d.h);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.j);
                            this.j = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
            this.u(d.j);
        }

        public final void q(int v) {
            this.setName(a.this.i + "-worker-" + (v == 0 ? "TERMINATED" : String.valueOf(v)));
            this.indexInArray = v;
        }

        public final void r(Object object0) {
            this.nextParkedWorker = object0;
        }

        @Override
        public void run() {
            this.p();
        }

        private final boolean s() {
            if(this.h != d.f) {
                a a0 = a.this;
                AtomicLongFieldUpdater atomicLongFieldUpdater0 = a.o;
                do {
                    long v = atomicLongFieldUpdater0.get(a0);
                    if(((int)((0x7FFFFC0000000000L & v) >> 42)) == 0) {
                        return false;
                    }
                }
                while(!a.o.compareAndSet(a0, v, v - 0x40000000000L));
                this.h = d.f;
            }
            return true;
        }

        private final void t() {
            if(!this.l()) {
                a.this.K(this);
                return;
            }
            c.n.set(this, -1);
            while(this.l() && c.n.get(this) == -1 && !a.this.isTerminated() && this.h != d.j) {
                this.u(d.h);
                Thread.interrupted();
                this.n();
            }
        }

        public final boolean u(d a$d0) {
            d a$d1 = this.h;
            boolean z = a$d1 == d.f;
            if(z) {
                a.o.addAndGet(a.this, 0x40000000000L);
            }
            if(a$d1 != a$d0) {
                this.h = a$d0;
            }
            return z;
        }

        private final h v(int v) {
            long v1 = a.o.get(a.this);
            if(((int)(v1 & 0x1FFFFFL)) < 2) {
                return null;
            }
            int v2 = this.m(((int)(v1 & 0x1FFFFFL)));
            a a0 = a.this;
            long v4 = 0x7FFFFFFFFFFFFFFFL;
            for(int v3 = 0; v3 < ((int)(v1 & 0x1FFFFFL)); ++v3) {
                ++v2;
                v2 = v2 <= ((int)(v1 & 0x1FFFFFL)) ? v2 + 1 : 1;
                c a$c0 = (c)a0.l.b(v2);
                if(a$c0 != null && a$c0 != this) {
                    long v5 = a$c0.f.n(v, this.g);
                    if(v5 == -1L) {
                        h h0 = (h)this.g.f;
                        this.g.f = null;
                        return h0;
                    }
                    if(v5 > 0L) {
                        v4 = Math.min(v4, v5);
                    }
                }
            }
            if(v4 == 0x7FFFFFFFFFFFFFFFL) {
                v4 = 0L;
            }
            this.j = v4;
            return null;
        }

        private final void w() {
            a a0 = a.this;
            A a1 = a0.l;
            __monitor_enter(a1);
            try {
                if(!a0.isTerminated()) {
                    if(((int)(a.o.get(a0) & 0x1FFFFFL)) > a0.f) {
                        if(c.n.compareAndSet(this, -1, 1)) {
                            int v = this.indexInArray;
                            this.q(0);
                            a0.L(this, v, 0);
                            long v1 = a.o.getAndDecrement(a0);
                            if(((int)(v1 & 0x1FFFFFL)) != v) {
                                Object object0 = a0.l.b(((int)(v1 & 0x1FFFFFL)));
                                k.b(object0);
                                a0.l.c(v, ((c)object0));
                                ((c)object0).q(v);
                                a0.L(((c)object0), ((int)(v1 & 0x1FFFFFL)), v);
                            }
                            a0.l.c(((int)(v1 & 0x1FFFFFL)), null);
                            goto label_21;
                        }
                        goto label_24;
                    }
                    goto label_26;
                }
                goto label_28;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(a1);
            throw throwable0;
        label_21:
            __monitor_exit(a1);
            this.h = d.j;
            return;
        label_24:
            __monitor_exit(a1);
            return;
        label_26:
            __monitor_exit(a1);
            return;
        label_28:
            __monitor_exit(a1);
        }
    }

    public static enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        private static final d[] b() [...] // Inlined contents
    }

    private volatile int _isTerminated;
    private volatile long controlState;
    public final int f;
    public final int g;
    public final long h;
    public final String i;
    public final P3.d j;
    public final P3.d k;
    public final A l;
    public static final P3.a.a m;
    private static final AtomicLongFieldUpdater n;
    private static final AtomicLongFieldUpdater o;
    private static final AtomicIntegerFieldUpdater p;
    private volatile long parkedWorkersStack;
    public static final F q;

    static {
        a.m = new P3.a.a(null);
        a.n = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
        a.o = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
        a.p = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
        a.q = new F("NOT_IN_STACK");
    }

    public a(int v, int v1, long v2, String s) {
        this.f = v;
        this.g = v1;
        this.h = v2;
        this.i = s;
        if(v < 1) {
            throw new IllegalArgumentException(("Core pool size " + v + " should be at least 1").toString());
        }
        if(v1 < v) {
            throw new IllegalArgumentException(("Max pool size " + v1 + " should be greater than or equals to core pool size " + v).toString());
        }
        if(v1 > 0x1FFFFE) {
            throw new IllegalArgumentException(("Max pool size " + v1 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if(v2 <= 0L) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + v2 + " must be positive").toString());
        }
        this.j = new P3.d();
        this.k = new P3.d();
        this.l = new A((v + 1) * 2);
        this.controlState = ((long)v) << 42;
        this._isTerminated = 0;
    }

    private final c J() {
        c a$c0;
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = a.n;
        do {
            long v = atomicLongFieldUpdater0.get(this);
            a$c0 = (c)this.l.b(((int)(0x1FFFFFL & v)));
            if(a$c0 == null) {
                return null;
            }
            int v1 = this.w(a$c0);
        }
        while(v1 < 0 || !a.n.compareAndSet(this, v, ((long)v1) | v + 0x200000L & 0xFFFFFFFFFFE00000L));
        a$c0.r(a.q);
        return a$c0;
    }

    public final boolean K(c a$c0) {
        if(a$c0.i() != a.q) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = a.n;
        do {
            long v = atomicLongFieldUpdater0.get(this);
            a$c0.r(this.l.b(((int)(0x1FFFFFL & v))));
        }
        while(!a.n.compareAndSet(this, v, v + 0x200000L & 0xFFFFFFFFFFE00000L | ((long)a$c0.h())));
        return true;
    }

    public final void L(c a$c0, int v, int v1) {
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = a.n;
        do {
            long v2 = atomicLongFieldUpdater0.get(this);
            int v3 = (int)(0x1FFFFFL & v2);
            if(v3 == v) {
                v3 = v1 == 0 ? this.w(a$c0) : v1;
            }
        }
        while(v3 < 0 || !a.n.compareAndSet(this, v2, v2 + 0x200000L & 0xFFFFFFFFFFE00000L | ((long)v3)));
    }

    public final void M(h h0) {
        try {
            h0.run();
        }
        catch(Throwable throwable0) {
            Thread thread0 = Thread.currentThread();
            thread0.getUncaughtExceptionHandler().uncaughtException(thread0, throwable0);
        }
    }

    public final void N(long v) {
        h h1;
        if(!a.p.compareAndSet(this, 0, 1)) {
            return;
        }
        c a$c0 = this.r();
        synchronized(this.l) {
            long v2 = a.o.get(this);
        }
        if(1 <= ((int)(v2 & 0x1FFFFFL))) {
            for(int v3 = 1; true; ++v3) {
                Object object0 = this.l.b(v3);
                k.b(object0);
                c a$c1 = (c)object0;
                if(a$c1 != a$c0) {
                    while(a$c1.isAlive()) {
                        LockSupport.unpark(a$c1);
                        a$c1.join(v);
                    }
                    a$c1.f.f(this.k);
                }
                if(v3 == ((int)(v2 & 0x1FFFFFL))) {
                    break;
                }
            }
        }
        this.k.b();
        this.j.b();
        while(true) {
            if(a$c0 == null) {
                h h2 = (h)this.j.d();
                if(h2 == null) {
                    h1 = (h)this.k.d();
                    if(h1 != null) {
                        goto label_36;
                    }
                    break;
                }
                else {
                    h1 = h2;
                }
            }
            else {
                h h0 = a$c0.g(true);
                if(h0 != null) {
                    h1 = h0;
                }
            }
        label_36:
            this.M(h1);
        }
        if(a$c0 != null) {
            a$c0.u(d.j);
        }
        a.n.set(this, 0L);
        a.o.set(this, 0L);
    }

    private final void Q(long v, boolean z) {
        if(z) {
            return;
        }
        if(this.Z()) {
            return;
        }
        if(this.V(v)) {
            return;
        }
        this.Z();
    }

    public final void R() {
        if(this.Z()) {
            return;
        }
        if(a.Y(this, 0L, 1, null)) {
            return;
        }
        this.Z();
    }

    private final h U(c a$c0, h h0, boolean z) {
        if(a$c0 == null) {
            return h0;
        }
        if(a$c0.h == d.j) {
            return h0;
        }
        if(h0.g.b() == 0 && a$c0.h == d.g) {
            return h0;
        }
        a$c0.l = true;
        return a$c0.f.a(h0, z);
    }

    private final boolean V(long v) {
        if(D3.d.a(((int)(0x1FFFFFL & v)) - ((int)((v & 0x3FFFFE00000L) >> 21)), 0) < this.f) {
            int v1 = this.g();
            if(v1 == 1 && this.f > 1) {
                this.g();
            }
            return v1 > 0;
        }
        return false;
    }

    static boolean Y(a a0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = a.o.get(a0);
        }
        return a0.V(v);
    }

    private final boolean Z() {
        c a$c0;
        do {
            a$c0 = this.J();
            if(a$c0 == null) {
                return false;
            }
        }
        while(!c.j().compareAndSet(a$c0, -1, 0));
        LockSupport.unpark(a$c0);
        return true;
    }

    @Override
    public void close() {
        this.N(10000L);
    }

    @Override
    public void execute(Runnable runnable0) {
        a.v(this, runnable0, null, false, 6, null);
    }

    private final boolean f(h h0) {
        return h0.g.b() == 1 ? this.k.a(h0) : this.j.a(h0);
    }

    private final int g() {
        c a$c0;
        int v1;
        synchronized(this.l) {
            if(!this.isTerminated()) {
                AtomicLongFieldUpdater atomicLongFieldUpdater0 = a.o;
                long v = atomicLongFieldUpdater0.get(this);
                v1 = D3.d.a(((int)(v & 0x1FFFFFL)) - ((int)((v & 0x3FFFFE00000L) >> 21)), 0);
                if(v1 >= this.f) {
                    return 0;
                }
                goto label_9;
            }
            return -1;
        }
        return 0;
    label_9:
        if(((int)(v & 0x1FFFFFL)) >= this.g) {
            return 0;
        }
        int v2 = ((int)(a.o.get(this) & 0x1FFFFFL)) + 1;
        if(v2 <= 0 || this.l.b(v2) != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        a$c0 = new c(this, v2);
        this.l.c(v2, a$c0);
        if(v2 != ((int)(0x1FFFFFL & atomicLongFieldUpdater0.incrementAndGet(this)))) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        a$c0.start();
        return v1 + 1;
    }

    public final boolean isTerminated() {
        return a.p.get(this) != 0;
    }

    public final h j(Runnable runnable0, i i0) {
        long v = l.f.a();
        if(runnable0 instanceof h) {
            ((h)runnable0).f = v;
            ((h)runnable0).g = i0;
            return (h)runnable0;
        }
        return new P3.k(runnable0, v, i0);
    }

    private final c r() {
        Thread thread0 = Thread.currentThread();
        c a$c0 = thread0 instanceof c ? ((c)thread0) : null;
        return a$c0 == null || !k.a(c.a(a$c0), this) ? null : a$c0;
    }

    public final void t(Runnable runnable0, i i0, boolean z) {
        h h0 = this.j(runnable0, i0);
        boolean z1 = false;
        boolean z2 = h0.g.b() == 1;
        long v = z2 ? a.o.addAndGet(this, 0x200000L) : 0L;
        c a$c0 = this.r();
        h h1 = this.U(a$c0, h0, z);
        if(h1 != null && !this.f(h1)) {
            throw new RejectedExecutionException(this.i + " was terminated");
        }
        if(z && a$c0 != null) {
            z1 = true;
        }
        if(z2) {
            this.Q(v, z1);
            return;
        }
        if(z1) {
            return;
        }
        this.R();
    }

    @Override
    public String toString() {
        ArrayList arrayList0 = new ArrayList();
        int v = this.l.a();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        for(int v6 = 1; v6 < v; ++v6) {
            c a$c0 = (c)this.l.b(v6);
            if(a$c0 != null) {
                int v7 = a$c0.f.e();
                switch(b.a[a$c0.h.ordinal()]) {
                    case 1: {
                        ++v3;
                        break;
                    }
                    case 2: {
                        ++v2;
                        arrayList0.add(v7 + 'b');
                        break;
                    }
                    case 3: {
                        ++v1;
                        arrayList0.add(v7 + 'c');
                        break;
                    }
                    case 4: {
                        ++v4;
                        if(v7 > 0) {
                            arrayList0.add(v7 + 'd');
                        }
                        break;
                    }
                    case 5: {
                        ++v5;
                    }
                }
            }
        }
        long v8 = a.o.get(this);
        return this.i + '@' + M.b(this) + "[Pool Size {core = " + this.f + ", max = " + this.g + "}, Worker States {CPU = " + v1 + ", blocking = " + v2 + ", parked = " + v3 + ", dormant = " + v4 + ", terminated = " + v5 + "}, running workers queues = " + arrayList0 + ", global CPU queue size = " + this.j.c() + ", global blocking queue size = " + this.k.c() + ", Control State {created workers= " + ((int)(0x1FFFFFL & v8)) + ", blocking tasks = " + ((int)((0x3FFFFE00000L & v8) >> 21)) + ", CPUs acquired = " + (this.f - ((int)((0x7FFFFC0000000000L & v8) >> 42))) + "}]";
    }

    public static void v(a a0, Runnable runnable0, i i0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            i0 = l.g;
        }
        if((v & 4) != 0) {
            z = false;
        }
        a0.t(runnable0, i0, z);
    }

    private final int w(c a$c0) {
        for(Object object0 = a$c0.i(); true; object0 = ((c)object0).i()) {
            if(object0 == a.q) {
                return -1;
            }
            if(object0 == null) {
                return 0;
            }
            int v = ((c)object0).h();
            if(v != 0) {
                return v;
            }
        }
    }
}

