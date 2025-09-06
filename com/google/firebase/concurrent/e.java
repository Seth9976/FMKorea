package com.google.firebase.concurrent;

public final class e implements Runnable {
    public final Runnable f;
    public final b g;

    public e(Runnable runnable0, b p$b0) {
        this.f = runnable0;
        this.g = p$b0;
    }

    @Override
    public final void run() {
        o.i(this.f, this.g);
    }
}

