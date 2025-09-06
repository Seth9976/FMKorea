package androidx.work.impl;

import x0.m;

public final class q implements Runnable {
    public final r f;
    public final m g;
    public final boolean h;

    public q(r r0, m m0, boolean z) {
        this.f = r0;
        this.g = m0;
        this.h = z;
    }

    @Override
    public final void run() {
        this.f.l(this.g, this.h);
    }
}

