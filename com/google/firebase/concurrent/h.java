package com.google.firebase.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class h implements c {
    public final o a;
    public final Callable b;
    public final long c;
    public final TimeUnit d;

    public h(o o0, Callable callable0, long v, TimeUnit timeUnit0) {
        this.a = o0;
        this.b = callable0;
        this.c = v;
        this.d = timeUnit0;
    }

    @Override  // com.google.firebase.concurrent.p$c
    public final ScheduledFuture a(b p$b0) {
        return o.a(this.a, this.b, this.c, this.d, p$b0);
    }
}

