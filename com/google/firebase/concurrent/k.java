package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

public final class k implements Callable {
    public final o a;
    public final Callable b;
    public final b c;

    public k(o o0, Callable callable0, b p$b0) {
        this.a = o0;
        this.b = callable0;
        this.c = p$b0;
    }

    @Override
    public final Object call() {
        return o.h(this.a, this.b, this.c);
    }
}

