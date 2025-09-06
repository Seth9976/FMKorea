package androidx.work.impl.background.systemalarm;

public final class d implements Runnable {
    public final f f;

    public d(f f0) {
        this.f = f0;
    }

    @Override
    public final void run() {
        this.f.j();
    }
}

