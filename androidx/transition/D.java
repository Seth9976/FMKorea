package androidx.transition;

import androidx.core.os.d.a;

public final class d implements a {
    public final Runnable a;
    public final k b;
    public final Runnable c;

    public d(Runnable runnable0, k k0, Runnable runnable1) {
        this.a = runnable0;
        this.b = k0;
        this.c = runnable1;
    }

    @Override  // androidx.core.os.d$a
    public final void a() {
        e.x(this.a, this.b, this.c);
    }
}

