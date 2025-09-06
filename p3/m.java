package P3;

import I3.F;
import N3.n;
import p3.j;

final class m extends F {
    public static final m h;

    static {
        m.h = new m();
    }

    @Override  // I3.F
    public void e0(j j0, Runnable runnable0) {
        c.n.i0(runnable0, l.h, false);
    }

    @Override  // I3.F
    public F g0(int v) {
        n.a(v);
        return v >= l.d ? this : super.g0(v);
    }
}

