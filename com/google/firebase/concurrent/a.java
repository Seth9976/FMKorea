package com.google.firebase.concurrent;

public final class a implements Runnable {
    public final b f;
    public final Runnable g;

    public a(b b0, Runnable runnable0) {
        this.f = b0;
        this.g = runnable0;
    }

    @Override
    public final void run() {
        b.a(this.f, this.g);
    }
}

