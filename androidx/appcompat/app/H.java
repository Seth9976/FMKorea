package androidx.appcompat.app;

public final class h implements Runnable {
    public final c f;
    public final Runnable g;

    public h(c g$c0, Runnable runnable0) {
        this.f = g$c0;
        this.g = runnable0;
    }

    @Override
    public final void run() {
        this.f.c(this.g);
    }
}

