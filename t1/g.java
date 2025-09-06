package t1;

import m1.p;

public final class g implements Runnable {
    public final r f;
    public final p g;
    public final int h;
    public final Runnable i;

    public g(r r0, p p0, int v, Runnable runnable0) {
        this.f = r0;
        this.g = p0;
        this.h = v;
        this.i = runnable0;
    }

    @Override
    public final void run() {
        r.i(this.f, this.g, this.h, this.i);
    }
}

