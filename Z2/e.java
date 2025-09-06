package z2;

import java.util.concurrent.Callable;

public final class e implements Callable {
    public final f a;

    public e(f f0) {
        this.a = f0;
    }

    @Override
    public final Object call() {
        return f.f(this.a);
    }
}

