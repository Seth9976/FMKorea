package B0;

import co.median.android.d;

public final class u implements Runnable {
    public final d f;
    public final boolean g;
    public final String h;

    public u(d d0, boolean z, String s) {
        this.f = d0;
        this.g = z;
        this.h = s;
    }

    @Override
    public final void run() {
        this.f.y(this.g, this.h);
    }
}

