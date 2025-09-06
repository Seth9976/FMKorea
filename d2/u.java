package d2;

import java.util.Map.Entry;
import y2.a;

public final class u implements Runnable {
    public final Map.Entry f;

    public u(Map.Entry map$Entry0, a a0) {
        this.f = map$Entry0;
    }

    @Override
    public final void run() {
        v.c(this.f, null);
    }
}

