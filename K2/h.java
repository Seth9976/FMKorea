package k2;

import java.util.concurrent.Callable;

public final class h implements Callable {
    public final a a;

    public h(a i$a0) {
        this.a = i$a0;
    }

    @Override
    public final Object call() {
        return a.a(this.a);
    }
}

