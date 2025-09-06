package J;

import z3.k;

final class j extends n {
    private final Throwable a;

    public j(Throwable throwable0) {
        k.e(throwable0, "readException");
        super(null);
        this.a = throwable0;
    }

    public final Throwable a() {
        return this.a;
    }
}

