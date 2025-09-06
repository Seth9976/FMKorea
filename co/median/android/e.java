package co.median.android;

public final class e implements Runnable {
    public final g f;
    public final a g;

    public e(g g0, a g$a0) {
        this.f = g0;
        this.g = g$a0;
    }

    @Override
    public final void run() {
        this.f.k(this.g);
    }
}

