package com.google.firebase.concurrent;

public final class j implements Runnable {
    public final o f;
    public final Runnable g;
    public final b h;

    public j(o o0, Runnable runnable0, b p$b0) {
        this.f = o0;
        this.g = runnable0;
        this.h = p$b0;
    }

    @Override
    public final void run() {
        o.j(this.f, this.g, this.h);
    }
}

