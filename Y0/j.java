package y0;

import java.util.concurrent.Callable;

public final class j implements Callable {
    public final k a;
    public final int b;
    public final int c;

    public j(k k0, int v, int v1) {
        this.a = k0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final Object call() {
        return k.a(this.a, this.b, this.c);
    }
}

