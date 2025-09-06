package y0;

import androidx.work.impl.utils.futures.c;

public final class z implements Runnable {
    public final A f;
    public final c g;

    public z(A a0, c c0) {
        this.f = a0;
        this.g = c0;
    }

    @Override
    public final void run() {
        this.f.c(this.g);
    }
}

