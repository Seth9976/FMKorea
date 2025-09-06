package I3;

import z3.k;

public abstract class w0 extends B implements X, l0 {
    public x0 i;

    public final x0 A() {
        x0 x00 = this.i;
        if(x00 != null) {
            return x00;
        }
        k.p("job");
        return null;
    }

    public final void B(x0 x00) {
        this.i = x00;
    }

    @Override  // I3.l0
    public C0 d() {
        return null;
    }

    @Override  // I3.X
    public void e() {
        this.A().v0(this);
    }

    @Override  // I3.l0
    public boolean isActive() {
        return true;
    }

    @Override  // N3.q
    public String toString() {
        return M.a(this) + '@' + M.b(this) + "[job@" + M.b(this.A()) + ']';
    }
}

