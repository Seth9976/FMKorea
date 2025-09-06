package androidx.work.impl.background.systemalarm;

public final class e implements Runnable {
    public final f f;

    public e(f f0) {
        this.f = f0;
    }

    @Override
    public final void run() {
        this.f.i();
    }
}

