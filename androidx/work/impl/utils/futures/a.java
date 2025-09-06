package androidx.work.impl.utils.futures;

import Z1.d;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a implements d {
    static abstract class androidx.work.impl.utils.futures.a.a {
    }

    static abstract class b {
        private b() {
        }

        b(androidx.work.impl.utils.futures.a.a a$a0) {
        }

        abstract boolean a(a arg1, e arg2, e arg3);

        abstract boolean b(a arg1, Object arg2, Object arg3);

        abstract boolean c(a arg1, i arg2, i arg3);

        abstract void d(i arg1, i arg2);

        abstract void e(i arg1, Thread arg2);
    }

    static final class c {
        final boolean a;
        final Throwable b;
        static final c c;
        static final c d;

        static {
            if(a.i) {
                c.d = null;
                c.c = null;
                return;
            }
            c.d = new c(false, null);
            c.c = new c(true, null);
        }

        c(boolean z, Throwable throwable0) {
            this.a = z;
            this.b = throwable0;
        }
    }

    static final class androidx.work.impl.utils.futures.a.d {
        class androidx.work.impl.utils.futures.a.d.a extends Throwable {
            androidx.work.impl.utils.futures.a.d.a(String s) {
            }

            @Override
            public Throwable fillInStackTrace() {
                synchronized(this) {
                }
                return this;
            }
        }

        final Throwable a;
        static final androidx.work.impl.utils.futures.a.d b;

        static {
            androidx.work.impl.utils.futures.a.d.b = new androidx.work.impl.utils.futures.a.d(new androidx.work.impl.utils.futures.a.d.a("Failure occurred while trying to finish a future."));
        }

        androidx.work.impl.utils.futures.a.d(Throwable throwable0) {
            this.a = (Throwable)a.d(throwable0);
        }
    }

    static final class e {
        final Runnable a;
        final Executor b;
        e c;
        static final e d;

        static {
            e.d = new e(null, null);
        }

        e(Runnable runnable0, Executor executor0) {
            this.a = runnable0;
            this.b = executor0;
        }
    }

    static final class f extends b {
        final AtomicReferenceFieldUpdater a;
        final AtomicReferenceFieldUpdater b;
        final AtomicReferenceFieldUpdater c;
        final AtomicReferenceFieldUpdater d;
        final AtomicReferenceFieldUpdater e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4) {
            super(null);
            this.a = atomicReferenceFieldUpdater0;
            this.b = atomicReferenceFieldUpdater1;
            this.c = atomicReferenceFieldUpdater2;
            this.d = atomicReferenceFieldUpdater3;
            this.e = atomicReferenceFieldUpdater4;
        }

        @Override  // androidx.work.impl.utils.futures.a$b
        boolean a(a a0, e a$e0, e a$e1) {
            return androidx.concurrent.futures.b.a(this.d, a0, a$e0, a$e1);
        }

        @Override  // androidx.work.impl.utils.futures.a$b
        boolean b(a a0, Object object0, Object object1) {
            return androidx.concurrent.futures.b.a(this.e, a0, object0, object1);
        }

        @Override  // androidx.work.impl.utils.futures.a$b
        boolean c(a a0, i a$i0, i a$i1) {
            return androidx.concurrent.futures.b.a(this.c, a0, a$i0, a$i1);
        }

        @Override  // androidx.work.impl.utils.futures.a$b
        void d(i a$i0, i a$i1) {
            this.b.lazySet(a$i0, a$i1);
        }

        @Override  // androidx.work.impl.utils.futures.a$b
        void e(i a$i0, Thread thread0) {
            this.a.lazySet(a$i0, thread0);
        }
    }

    static final class g implements Runnable {
        final a f;
        final d g;

        g(a a0, d d0) {
            this.f = a0;
            this.g = d0;
        }

        @Override
        public void run() {
            if(this.f.f != this) {
                return;
            }
            Object object0 = a.i(this.g);
            if(a.k.b(this.f, this, object0)) {
                a.f(this.f);
            }
        }
    }

    static final class h extends b {
        h() {
            super(null);
        }

        @Override  // androidx.work.impl.utils.futures.a$b
        boolean a(a a0, e a$e0, e a$e1) {
            synchronized(a0) {
                if(a0.g == a$e0) {
                    a0.g = a$e1;
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.work.impl.utils.futures.a$b
        boolean b(a a0, Object object0, Object object1) {
            synchronized(a0) {
                if(a0.f == object0) {
                    a0.f = object1;
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.work.impl.utils.futures.a$b
        boolean c(a a0, i a$i0, i a$i1) {
            synchronized(a0) {
                if(a0.h == a$i0) {
                    a0.h = a$i1;
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.work.impl.utils.futures.a$b
        void d(i a$i0, i a$i1) {
            a$i0.b = a$i1;
        }

        @Override  // androidx.work.impl.utils.futures.a$b
        void e(i a$i0, Thread thread0) {
            a$i0.a = thread0;
        }
    }

    static final class i {
        volatile Thread a;
        volatile i b;
        static final i c;

        static {
            i.c = new i(false);
        }

        i() {
            a.k.e(this, Thread.currentThread());
        }

        i(boolean z) {
        }

        void a(i a$i0) {
            a.k.d(this, a$i0);
        }

        void b() {
            Thread thread0 = this.a;
            if(thread0 != null) {
                this.a = null;
                LockSupport.unpark(thread0);
            }
        }
    }

    volatile Object f;
    volatile e g;
    volatile i h;
    static final boolean i;
    private static final Logger j;
    static final b k;
    private static final Object l;

    static {
        f a$f0;
        a.i = false;
        a.j = Logger.getLogger("androidx.work.impl.utils.futures.a");
        try {
            a$f0 = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "h"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "g"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "f"));
            throwable0 = null;
        }
        catch(Throwable throwable0) {
            a$f0 = new h();
        }
        a.k = a$f0;
        if(throwable0 != null) {
            a.j.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable0);
        }
        a.l = new Object();
    }

    private void a(StringBuilder stringBuilder0) {
        try {
            Object object0 = a.j(this);
            stringBuilder0.append("SUCCESS, result=[");
            stringBuilder0.append(this.r(object0));
            stringBuilder0.append("]");
        }
        catch(ExecutionException executionException0) {
            stringBuilder0.append("FAILURE, cause=[");
            stringBuilder0.append(executionException0.getCause());
            stringBuilder0.append("]");
        }
        catch(CancellationException unused_ex) {
            stringBuilder0.append("CANCELLED");
        }
        catch(RuntimeException runtimeException0) {
            stringBuilder0.append("UNKNOWN, cause=[");
            stringBuilder0.append(runtimeException0.getClass());
            stringBuilder0.append(" thrown from get()]");
        }
    }

    @Override  // Z1.d
    public final void addListener(Runnable runnable0, Executor executor0) {
        a.d(runnable0);
        a.d(executor0);
        e a$e0 = this.g;
        if(a$e0 != e.d) {
            e a$e1 = new e(runnable0, executor0);
            while(true) {
                a$e1.c = a$e0;
                if(a.k.a(this, a$e0, a$e1)) {
                    return;
                }
                a$e0 = this.g;
                if(a$e0 == e.d) {
                    break;
                }
            }
        }
        a.g(runnable0, executor0);
    }

    protected void b() {
    }

    private static CancellationException c(String s, Throwable throwable0) {
        CancellationException cancellationException0 = new CancellationException(s);
        cancellationException0.initCause(throwable0);
        return cancellationException0;
    }

    @Override
    public final boolean cancel(boolean z) {
        c a$c0;
        Object object0 = this.f;
        if((object0 == null | object0 instanceof g) != 0) {
            if(a.i) {
                a$c0 = new c(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                a$c0 = z ? c.c : c.d;
            }
            a a0 = this;
            boolean z1 = false;
            while(true) {
                if(a.k.b(a0, object0, a$c0)) {
                    a.f(a0);
                    if(object0 instanceof g) {
                        d d0 = ((g)object0).g;
                        if(!(d0 instanceof a)) {
                            d0.cancel(z);
                            return true;
                        }
                        a0 = (a)d0;
                        object0 = a0.f;
                        if((object0 == null | object0 instanceof g) != 0) {
                            z1 = true;
                            continue;
                        }
                    }
                    return true;
                }
                object0 = a0.f;
                if(!(object0 instanceof g)) {
                    break;
                }
            }
            return z1;
        }
        return false;
    }

    static Object d(Object object0) {
        object0.getClass();
        return object0;
    }

    private e e(e a$e0) {
        do {
            e a$e1 = this.g;
        }
        while(!a.k.a(this, a$e1, e.d));
        e a$e2 = a$e0;
        for(e a$e3 = a$e1; a$e3 != null; a$e3 = a$e4) {
            e a$e4 = a$e3.c;
            a$e3.c = a$e2;
            a$e2 = a$e3;
        }
        return a$e2;
    }

    static void f(a a0) {
        Runnable runnable0;
        e a$e1;
        e a$e0 = null;
        while(true) {
            a0.m();
            a$e1 = a0.e(a$e0);
        label_3:
            if(a$e1 == null) {
                return;
            }
            a$e0 = a$e1.c;
            runnable0 = a$e1.a;
            if(!(runnable0 instanceof g)) {
                break;
            }
            a0 = ((g)runnable0).f;
            if(a0.f != ((g)runnable0)) {
                a$e1 = a$e0;
                goto label_3;
            }
            Object object0 = a.i(((g)runnable0).g);
            if(!a.k.b(a0, ((g)runnable0), object0)) {
                a$e1 = a$e0;
                goto label_3;
            }
        }
        a.g(runnable0, a$e1.b);
        a$e1 = a$e0;
        goto label_3;
    }

    private static void g(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            a.j.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, runtimeException0);
        }
    }

    @Override
    public final Object get() {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.f;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof g)) != 0) {
            return this.h(object0);
        }
        i a$i0 = this.h;
        if(a$i0 != i.c) {
            i a$i1 = new i();
            while(true) {
                a$i1.a(a$i0);
                if(a.k.c(this, a$i0, a$i1)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.f;
                        if(((object1 == null ? 0 : 1) & !(object1 instanceof g)) != 0) {
                            return this.h(object1);
                        }
                    }
                    this.n(a$i1);
                    throw new InterruptedException();
                }
                a$i0 = this.h;
                if(a$i0 == i.c) {
                    break;
                }
            }
        }
        return this.h(this.f);
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.f;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof g)) != 0) {
            return this.h(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            i a$i0 = this.h;
            if(a$i0 != i.c) {
                i a$i1 = new i();
                while(true) {
                    a$i1.a(a$i0);
                    if(a.k.c(this, a$i0, a$i1)) {
                        do {
                            LockSupport.parkNanos(this, v1);
                            if(Thread.interrupted()) {
                                this.n(a$i1);
                                throw new InterruptedException();
                            }
                            Object object1 = this.f;
                            if(((object1 == null ? 0 : 1) & !(object1 instanceof g)) != 0) {
                                return this.h(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.n(a$i1);
                        goto label_26;
                    }
                    a$i0 = this.h;
                    if(a$i0 == i.c) {
                        break;
                    }
                }
            }
            return this.h(this.f);
        }
    label_26:
        while(v1 > 0L) {
            Object object2 = this.f;
            if(((object2 == null ? 0 : 1) & !(object2 instanceof g)) != 0) {
                return this.h(object2);
            }
            if(Thread.interrupted()) {
                throw new InterruptedException();
            }
            v1 = v2 - System.nanoTime();
        }
        String s = this.toString();
        Locale locale0 = Locale.ROOT;
        String s1 = timeUnit0.toString().toLowerCase(locale0);
        String s2 = "Waited " + v + " " + timeUnit0.toString().toLowerCase(locale0);
        if(v1 + 1000L < 0L) {
            String s3 = s2 + " (plus ";
            long v3 = timeUnit0.convert(-v1, TimeUnit.NANOSECONDS);
            long v4 = -v1 - timeUnit0.toNanos(v3);
            int v5 = Long.compare(v3, 0L);
            boolean z = v5 == 0 || v4 > 1000L;
            if(v5 > 0) {
                s3 = (z ? s3 + v3 + " " + s1 + "," : s3 + v3 + " " + s1) + " ";
            }
            if(z) {
                s3 = s3 + v4 + " nanoseconds ";
            }
            s2 = s3 + "delay)";
        }
        throw this.isDone() ? new TimeoutException(s2 + " but future completed as timeout expired") : new TimeoutException(s2 + " for " + s);
    }

    private Object h(Object object0) {
        if(object0 instanceof c) {
            throw a.c("Task was cancelled.", ((c)object0).b);
        }
        if(object0 instanceof androidx.work.impl.utils.futures.a.d) {
            throw new ExecutionException(((androidx.work.impl.utils.futures.a.d)object0).a);
        }
        return object0 == a.l ? null : object0;
    }

    static Object i(d d0) {
        if(d0 instanceof a) {
            c a$c0 = ((a)d0).f;
            if(a$c0 instanceof c && a$c0.a) {
                return a$c0.b == null ? c.d : new c(false, a$c0.b);
            }
            return a$c0;
        }
        boolean z = d0.isCancelled();
        if((!a.i & z) != 0) {
            return c.d;
        }
        try {
            Object object0 = a.j(d0);
            return object0 == null ? a.l : object0;
        }
        catch(ExecutionException executionException0) {
            return new androidx.work.impl.utils.futures.a.d(executionException0.getCause());
        }
        catch(CancellationException cancellationException0) {
            return !z ? new androidx.work.impl.utils.futures.a.d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + d0, cancellationException0)) : new c(false, cancellationException0);
        }
        catch(Throwable throwable0) {
            return new androidx.work.impl.utils.futures.a.d(throwable0);
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.f instanceof c;
    }

    @Override
    public final boolean isDone() {
        return this.f == null ? 0 : !(this.f instanceof g) & 1;
    }

    private static Object j(Future future0) {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = future0.get();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        return object0;
    }

    protected void k() {
    }

    protected String l() {
        Object object0 = this.f;
        if(object0 instanceof g) {
            return "setFuture=[" + this.r(((g)object0).g) + "]";
        }
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    private void m() {
        i a$i0;
        do {
            a$i0 = this.h;
        }
        while(!a.k.c(this, a$i0, i.c));
        while(a$i0 != null) {
            a$i0.b();
            a$i0 = a$i0.b;
        }
    }

    private void n(i a$i0) {
        a$i0.a = null;
    alab1:
        while(true) {
            i a$i1 = this.h;
            if(a$i1 == i.c) {
                return;
            }
            i a$i2 = null;
            while(true) {
                if(a$i1 == null) {
                    break alab1;
                }
                i a$i3 = a$i1.b;
                if(a$i1.a != null) {
                    a$i2 = a$i1;
                }
                else if(a$i2 == null) {
                    if(a.k.c(this, a$i1, a$i3)) {
                        a$i1 = a$i3;
                        continue;
                    }
                    break;
                }
                else {
                    a$i2.b = a$i3;
                    if(a$i2.a == null) {
                        break;
                    }
                }
                a$i1 = a$i3;
            }
        }
    }

    protected boolean o(Object object0) {
        if(object0 == null) {
            object0 = a.l;
        }
        if(a.k.b(this, null, object0)) {
            a.f(this);
            return true;
        }
        return false;
    }

    protected boolean p(Throwable throwable0) {
        androidx.work.impl.utils.futures.a.d a$d0 = new androidx.work.impl.utils.futures.a.d(((Throwable)a.d(throwable0)));
        if(a.k.b(this, null, a$d0)) {
            a.f(this);
            return true;
        }
        return false;
    }

    protected boolean q(d d0) {
        androidx.work.impl.utils.futures.a.d a$d0;
        a.d(d0);
        Object object0 = this.f;
        if(object0 == null) {
            if(d0.isDone()) {
                Object object1 = a.i(d0);
                if(a.k.b(this, null, object1)) {
                    a.f(this);
                    return true;
                }
                return false;
            }
            g a$g0 = new g(this, d0);
            if(a.k.b(this, null, a$g0)) {
                try {
                    d0.addListener(a$g0, androidx.work.impl.utils.futures.b.f);
                }
                catch(Throwable throwable0) {
                    try {
                        a$d0 = new androidx.work.impl.utils.futures.a.d(throwable0);
                    }
                    catch(Throwable unused_ex) {
                        a$d0 = androidx.work.impl.utils.futures.a.d.b;
                    }
                    a.k.b(this, a$g0, a$d0);
                }
                return true;
            }
            object0 = this.f;
        }
        if(object0 instanceof c) {
            d0.cancel(((c)object0).a);
        }
        return false;
    }

    private String r(Object object0) {
        return object0 == this ? "this future" : String.valueOf(object0);
    }

    @Override
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append("[status=");
        if(this.isCancelled()) {
            stringBuilder0.append("CANCELLED");
        }
        else if(this.isDone()) {
            this.a(stringBuilder0);
        }
        else {
            try {
                s = this.l();
            }
            catch(RuntimeException runtimeException0) {
                s = "Exception thrown from implementation: " + runtimeException0.getClass();
            }
            if(s != null && !s.isEmpty()) {
                stringBuilder0.append("PENDING, info=[");
                stringBuilder0.append(s);
                stringBuilder0.append("]");
            }
            else if(this.isDone()) {
                this.a(stringBuilder0);
            }
            else {
                stringBuilder0.append("PENDING");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

