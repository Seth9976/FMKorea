package w0;

import java.util.List;

public final class g implements Runnable {
    public final List f;
    public final h g;

    public g(List list0, h h0) {
        this.f = list0;
        this.g = h0;
    }

    @Override
    public final void run() {
        h.b(this.f, this.g);
    }
}

