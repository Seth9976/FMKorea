package I3;

import l3.u;
import y3.l;

final class n0 extends j {
    private final l f;

    public n0(l l0) {
        this.f = l0;
    }

    @Override  // I3.k
    public void b(Throwable throwable0) {
        this.f.h(throwable0);
    }

    @Override  // y3.l
    public Object h(Object object0) {
        this.b(((Throwable)object0));
        return u.a;
    }

    @Override
    public String toString() {
        return "InvokeOnCancel[" + M.a(this.f) + '@' + M.b(this) + ']';
    }
}

