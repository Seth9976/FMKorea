package com.google.firebase.concurrent;

import androidx.concurrent.futures.a;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class p extends a implements ScheduledFuture {
    interface b {
        void a(Throwable arg1);

        void set(Object arg1);
    }

    interface c {
        ScheduledFuture a(b arg1);
    }

    private final ScheduledFuture m;

    p(c p$c0) {
        class com.google.firebase.concurrent.p.a implements b {
            final p a;

            @Override  // com.google.firebase.concurrent.p$b
            public void a(Throwable throwable0) {
                p.w(p.this, throwable0);
            }

            @Override  // com.google.firebase.concurrent.p$b
            public void set(Object object0) {
                p.v(p.this, object0);
            }
        }

        this.m = p$c0.a(new com.google.firebase.concurrent.p.a(this));
    }

    @Override
    public int compareTo(Object object0) {
        return this.x(((Delayed)object0));
    }

    @Override  // androidx.concurrent.futures.a
    protected void f() {
        boolean z = this.u();
        this.m.cancel(z);
    }

    @Override
    public long getDelay(TimeUnit timeUnit0) {
        return this.m.getDelay(timeUnit0);
    }

    static boolean v(p p0, Object object0) {
        return p0.r(object0);
    }

    static boolean w(p p0, Throwable throwable0) {
        return p0.s(throwable0);
    }

    public int x(Delayed delayed0) {
        return this.m.compareTo(delayed0);
    }
}

