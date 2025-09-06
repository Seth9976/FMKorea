package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

public final class n implements Runnable {
    public final Callable f;
    public final b g;

    public n(Callable callable0, b p$b0) {
        this.f = callable0;
        this.g = p$b0;
    }

    @Override
    public final void run() {
        o.e(this.f, this.g);
    }
}

