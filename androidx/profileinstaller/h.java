package androidx.profileinstaller;

public final class h implements Runnable {
    public final c f;
    public final int g;
    public final Object h;

    public h(c i$c0, int v, Object object0) {
        this.f = i$c0;
        this.g = v;
        this.h = object0;
    }

    @Override
    public final void run() {
        this.f.b(this.g, this.h);
    }
}

