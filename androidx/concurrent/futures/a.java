package androidx.concurrent.futures;

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
    static abstract class androidx.concurrent.futures.a.a {
    }

    static abstract class b {
        private b() {
        }

        b(androidx.concurrent.futures.a.a a$a0) {
        }

        abstract boolean a(a arg1, e arg2, e arg3);

        abstract boolean b(a arg1, Object arg2, Object arg3);

        abstract boolean c(a arg1, h arg2, h arg3);

        abstract void d(h arg1, h arg2);

        abstract void e(h arg1, Thread arg2);
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

    static final class androidx.concurrent.futures.a.d {
        class androidx.concurrent.futures.a.d.a extends Throwable {
            androidx.concurrent.futures.a.d.a(String s) {
            }

            @Override
            public Throwable fillInStackTrace() {
                synchronized(this) {
                }
                return this;
            }
        }

        final Throwable a;
        static final androidx.concurrent.futures.a.d b;

        static {
            androidx.concurrent.futures.a.d.b = new androidx.concurrent.futures.a.d(new androidx.concurrent.futures.a.d.a("Failure occurred while trying to finish a future."));
        }

        androidx.concurrent.futures.a.d(Throwable throwable0) {
            this.a = (Throwable)a.h(throwable0);
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

        @Override  // androidx.concurrent.futures.a$b
        boolean a(a a0, e a$e0, e a$e1) {
            return androidx.concurrent.futures.b.a(this.d, a0, a$e0, a$e1);
        }

        @Override  // androidx.concurrent.futures.a$b
        boolean b(a a0, Object object0, Object object1) {
            return androidx.concurrent.futures.b.a(this.e, a0, object0, object1);
        }

        @Override  // androidx.concurrent.futures.a$b
        boolean c(a a0, h a$h0, h a$h1) {
            return androidx.concurrent.futures.b.a(this.c, a0, a$h0, a$h1);
        }

        @Override  // androidx.concurrent.futures.a$b
        void d(h a$h0, h a$h1) {
            this.b.lazySet(a$h0, a$h1);
        }

        @Override  // androidx.concurrent.futures.a$b
        void e(h a$h0, Thread thread0) {
            this.a.lazySet(a$h0, thread0);
        }
    }

    static final class g extends b {
        g() {
            super(null);
        }

        @Override  // androidx.concurrent.futures.a$b
        boolean a(a a0, e a$e0, e a$e1) {
            synchronized(a0) {
                if(a0.g == a$e0) {
                    a0.g = a$e1;
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.concurrent.futures.a$b
        boolean b(a a0, Object object0, Object object1) {
            synchronized(a0) {
                if(a0.f == object0) {
                    a0.f = object1;
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.concurrent.futures.a$b
        boolean c(a a0, h a$h0, h a$h1) {
            synchronized(a0) {
                if(a0.h == a$h0) {
                    a0.h = a$h1;
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.concurrent.futures.a$b
        void d(h a$h0, h a$h1) {
            a$h0.b = a$h1;
        }

        @Override  // androidx.concurrent.futures.a$b
        void e(h a$h0, Thread thread0) {
            a$h0.a = thread0;
        }
    }

    static final class h {
        volatile Thread a;
        volatile h b;
        static final h c;

        static {
            h.c = new h(false);
        }

        h() {
            a.k.e(this, Thread.currentThread());
        }

        h(boolean z) {
        }

        void a(h a$h0) {
            a.k.d(this, a$h0);
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
    volatile h h;
    static final boolean i;
    private static final Logger j;
    static final b k;
    private static final Object l;

    static {
        f a$f0;
        a.i = false;
        a.j = Logger.getLogger("androidx.concurrent.futures.a");
        try {
            a$f0 = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "h"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "g"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "f"));
            throwable0 = null;
        }
        catch(Throwable throwable0) {
            a$f0 = new g();
        }
        a.k = a$f0;
        if(throwable0 != null) {
            a.j.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable0);
        }
        a.l = new Object();
    }

    @Override  // Z1.d
    public final void addListener(Runnable runnable0, Executor executor0) {
        a.h(runnable0);
        a.h(executor0);
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
        a.k(runnable0, executor0);
    }

    private void b(StringBuilder stringBuilder0) {
        try {
            Object object0 = a.m(this);
            stringBuilder0.append("SUCCESS, result=[");
            stringBuilder0.append(this.t(object0));
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

    @Override
    public final boolean cancel(boolean z) {
        c a$c0;
        if(this.f == null) {
            if(a.i) {
                a$c0 = new c(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                a$c0 = z ? c.c : c.d;
            }
            if(a.k.b(this, null, a$c0)) {
                a.j(this);
                return true;
            }
        }
        return false;
    }

    protected void f() {
    }

    private static CancellationException g(String s, Throwable throwable0) {
        CancellationException cancellationException0 = new CancellationException(s);
        cancellationException0.initCause(throwable0);
        return cancellationException0;
    }

    @Override
    public final Object get() {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.f;
        if(object0 != null) {
            return this.l(object0);
        }
        h a$h0 = this.h;
        if(a$h0 != h.c) {
            h a$h1 = new h();
            while(true) {
                a$h1.a(a$h0);
                if(a.k.c(this, a$h0, a$h1)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.f;
                        if(object1 != null) {
                            return this.l(object1);
                        }
                    }
                    this.q(a$h1);
                    throw new InterruptedException();
                }
                a$h0 = this.h;
                if(a$h0 == h.c) {
                    break;
                }
            }
        }
        return this.l(this.f);
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.f;
        if(object0 != null) {
            return this.l(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            h a$h0 = this.h;
            if(a$h0 != h.c) {
                h a$h1 = new h();
                while(true) {
                    a$h1.a(a$h0);
                    if(a.k.c(this, a$h0, a$h1)) {
                        do {
                            LockSupport.parkNanos(this, v1);
                            if(Thread.interrupted()) {
                                this.q(a$h1);
                                throw new InterruptedException();
                            }
                            Object object1 = this.f;
                            if(object1 != null) {
                                return this.l(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.q(a$h1);
                        goto label_26;
                    }
                    a$h0 = this.h;
                    if(a$h0 == h.c) {
                        break;
                    }
                }
            }
            return this.l(this.f);
        }
    label_26:
        while(v1 > 0L) {
            Object object2 = this.f;
            if(object2 != null) {
                return this.l(object2);
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

    static Object h(Object object0) {
        object0.getClass();
        return object0;
    }

    private e i(e a$e0) {
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

    @Override
    public final boolean isCancelled() {
        return this.f instanceof c;
    }

    @Override
    public final boolean isDone() {
        return this.f != null;
    }

    static void j(a a0) {
        a0.p();
        a0.f();
        for(e a$e0 = a0.i(null); a$e0 != null; a$e0 = a$e1) {
            e a$e1 = a$e0.c;
            a.k(a$e0.a, a$e0.b);
        }
    }

    private static void k(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            a.j.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, runtimeException0);
        }
    }

    private Object l(Object object0) {
        if(object0 instanceof c) {
            throw a.g("Task was cancelled.", ((c)object0).b);
        }
        if(object0 instanceof androidx.concurrent.futures.a.d) {
            throw new ExecutionException(((androidx.concurrent.futures.a.d)object0).a);
        }
        return object0 == a.l ? null : object0;
    }

    static Object m(Future future0) {
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

    protected void n() {
    }

    // 去混淆评级： 低(20)
    protected String o() {
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    private void p() {
        h a$h0;
        do {
            a$h0 = this.h;
        }
        while(!a.k.c(this, a$h0, h.c));
        while(a$h0 != null) {
            a$h0.b();
            a$h0 = a$h0.b;
        }
    }

    private void q(h a$h0) {
        a$h0.a = null;
    alab1:
        while(true) {
            h a$h1 = this.h;
            if(a$h1 == h.c) {
                return;
            }
            h a$h2 = null;
            while(true) {
                if(a$h1 == null) {
                    break alab1;
                }
                h a$h3 = a$h1.b;
                if(a$h1.a != null) {
                    a$h2 = a$h1;
                }
                else if(a$h2 == null) {
                    if(a.k.c(this, a$h1, a$h3)) {
                        a$h1 = a$h3;
                        continue;
                    }
                    break;
                }
                else {
                    a$h2.b = a$h3;
                    if(a$h2.a == null) {
                        break;
                    }
                }
                a$h1 = a$h3;
            }
        }
    }

    protected boolean r(Object object0) {
        if(object0 == null) {
            object0 = a.l;
        }
        if(a.k.b(this, null, object0)) {
            a.j(this);
            return true;
        }
        return false;
    }

    protected boolean s(Throwable throwable0) {
        androidx.concurrent.futures.a.d a$d0 = new androidx.concurrent.futures.a.d(((Throwable)a.h(throwable0)));
        if(a.k.b(this, null, a$d0)) {
            a.j(this);
            return true;
        }
        return false;
    }

    private String t(Object object0) {
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
            this.b(stringBuilder0);
        }
        else {
            try {
                s = this.o();
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
                this.b(stringBuilder0);
            }
            else {
                stringBuilder0.append("PENDING");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    // 去混淆评级： 低(20)
    protected final boolean u() {
        return this.f instanceof c && ((c)this.f).a;
    }
}

