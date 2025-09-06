package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class c {
    public static final class a {
        Object a;
        d b;
        private androidx.concurrent.futures.d c;
        private boolean d;

        a() {
            this.c = androidx.concurrent.futures.d.v();
        }

        void a() {
            this.a = null;
            this.b = null;
            this.c.r(null);
        }

        public boolean b(Object object0) {
            this.d = true;
            if(this.b == null || !this.b.b(object0)) {
                return false;
            }
            this.d();
            return true;
        }

        public boolean c() {
            this.d = true;
            if(this.b == null || !this.b.a(true)) {
                return false;
            }
            this.d();
            return true;
        }

        private void d() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public boolean e(Throwable throwable0) {
            this.d = true;
            if(this.b == null || !this.b.c(throwable0)) {
                return false;
            }
            this.d();
            return true;
        }

        @Override
        protected void finalize() {
            d c$d0 = this.b;
            if(c$d0 != null && !c$d0.isDone()) {
                c$d0.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
            if(!this.d) {
                androidx.concurrent.futures.d d0 = this.c;
                if(d0 != null) {
                    d0.r(null);
                }
            }
        }
    }

    static final class b extends Throwable {
        b(String s) {
            super(s);
        }

        @Override
        public Throwable fillInStackTrace() {
            synchronized(this) {
            }
            return this;
        }
    }

    public interface androidx.concurrent.futures.c.c {
        Object a(a arg1);
    }

    static final class d implements Z1.d {
        class androidx.concurrent.futures.c.d.a extends androidx.concurrent.futures.a {
            final d m;

            @Override  // androidx.concurrent.futures.a
            protected String o() {
                a c$a0 = (a)d.this.f.get();
                return c$a0 == null ? "Completer object has been garbage collected, future will fail soon" : "tag=[" + c$a0.a + "]";
            }
        }

        final WeakReference f;
        private final androidx.concurrent.futures.a g;

        d(a c$a0) {
            this.g = new androidx.concurrent.futures.c.d.a(this);
            this.f = new WeakReference(c$a0);
        }

        boolean a(boolean z) {
            return this.g.cancel(z);
        }

        @Override  // Z1.d
        public void addListener(Runnable runnable0, Executor executor0) {
            this.g.addListener(runnable0, executor0);
        }

        boolean b(Object object0) {
            return this.g.r(object0);
        }

        boolean c(Throwable throwable0) {
            return this.g.s(throwable0);
        }

        @Override
        public boolean cancel(boolean z) {
            a c$a0 = (a)this.f.get();
            boolean z1 = this.g.cancel(z);
            if(z1 && c$a0 != null) {
                c$a0.a();
            }
            return z1;
        }

        @Override
        public Object get() {
            return this.g.get();
        }

        @Override
        public Object get(long v, TimeUnit timeUnit0) {
            return this.g.get(v, timeUnit0);
        }

        @Override
        public boolean isCancelled() {
            return this.g.isCancelled();
        }

        @Override
        public boolean isDone() {
            return this.g.isDone();
        }

        @Override
        public String toString() {
            return this.g.toString();
        }
    }

    public static Z1.d a(androidx.concurrent.futures.c.c c$c0) {
        a c$a0 = new a();
        d c$d0 = new d(c$a0);
        c$a0.b = c$d0;
        c$a0.a = c$c0.getClass();
        try {
            Object object0 = c$c0.a(c$a0);
            if(object0 != null) {
                c$a0.a = object0;
                return c$d0;
            }
        }
        catch(Exception exception0) {
            c$d0.c(exception0);
        }
        return c$d0;
    }
}

