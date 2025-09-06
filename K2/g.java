package k2;

import java.util.concurrent.Callable;

public final class g implements Callable {
    public final i a;

    public g(i i0) {
        this.a = i0;
    }

    @Override
    public final Object call() {
        return i.a(this.a);
    }
}

