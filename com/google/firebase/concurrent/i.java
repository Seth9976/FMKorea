package com.google.firebase.concurrent;

public final class i implements Runnable {
    public final o f;
    public final Runnable g;
    public final b h;

    public i(o o0, Runnable runnable0, b p$b0) {
        this.f = o0;
        this.g = runnable0;
        this.h = p$b0;
    }

    @Override
    public final void run() {
        o.g(this.f, this.g, this.h);
    }
}

