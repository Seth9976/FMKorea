package y0;

import java.util.concurrent.Callable;

public final class i implements Callable {
    public final k a;

    public i(k k0) {
        this.a = k0;
    }

    @Override
    public final Object call() {
        return k.b(this.a);
    }
}

