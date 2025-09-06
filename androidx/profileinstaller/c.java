package androidx.profileinstaller;

public final class c implements Runnable {
    public final d f;
    public final int g;
    public final Object h;

    public c(d d0, int v, Object object0) {
        this.f = d0;
        this.g = v;
        this.h = object0;
    }

    @Override
    public final void run() {
        this.f.g(this.g, this.h);
    }
}

