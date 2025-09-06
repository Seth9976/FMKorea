package z2;

import java.util.concurrent.Callable;

public final class d implements Callable {
    public final f a;

    public d(f f0) {
        this.a = f0;
    }

    @Override
    public final Object call() {
        return f.c(this.a);
    }
}

