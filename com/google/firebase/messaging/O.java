package com.google.firebase.messaging;

import android.content.Intent;

public final class o implements Runnable {
    public final p f;
    public final Intent g;

    public o(p p0, Intent intent0) {
        this.f = p0;
        this.g = intent0;
    }

    @Override
    public final void run() {
        p.a(this.f, this.g);
    }
}

