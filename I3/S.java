package I3;

import l3.u;

public final class s extends s0 implements r {
    public final t j;

    public s(t t0) {
        this.j = t0;
    }

    @Override  // I3.r
    public boolean b(Throwable throwable0) {
        return this.A().D(throwable0);
    }

    @Override  // I3.r
    public q0 getParent() {
        return this.A();
    }

    @Override  // y3.l
    public Object h(Object object0) {
        this.z(((Throwable)object0));
        return u.a;
    }

    @Override  // I3.B
    public void z(Throwable throwable0) {
        x0 x00 = this.A();
        this.j.L(x00);
    }
}

