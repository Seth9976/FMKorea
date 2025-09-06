package androidx.core.content.res;

public final class j implements Runnable {
    public final e f;
    public final int g;

    public j(e h$e0, int v) {
        this.f = h$e0;
        this.g = v;
    }

    @Override
    public final void run() {
        this.f.f(this.g);
    }
}

