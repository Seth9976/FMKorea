package J;

import z3.k;

final class h extends n {
    private final Throwable a;

    public h(Throwable throwable0) {
        k.e(throwable0, "finalException");
        super(null);
        this.a = throwable0;
    }

    public final Throwable a() {
        return this.a;
    }
}

