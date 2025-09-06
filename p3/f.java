package P3;

import I3.g0;
import p3.j;

public abstract class f extends g0 {
    private final int i;
    private final int j;
    private final long k;
    private final String l;
    private a m;

    public f(int v, int v1, long v2, String s) {
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.l = s;
        this.m = this.h0();
    }

    @Override  // I3.F
    public void e0(j j0, Runnable runnable0) {
        a.v(this.m, runnable0, null, false, 6, null);
    }

    private final a h0() {
        return new a(this.i, this.j, this.k, this.l);
    }

    public final void i0(Runnable runnable0, i i0, boolean z) {
        this.m.t(runnable0, i0, z);
    }
}

