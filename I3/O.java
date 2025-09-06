package I3;

import N3.j;
import p3.f;

public abstract class o {
    public static final void a(l l0, X x0) {
        l0.i(new Y(x0));
    }

    public static final m b(f f0) {
        if(!(f0 instanceof j)) {
            return new m(f0, 1);
        }
        m m0 = ((j)f0).n();
        if(m0 != null) {
            if(!m0.L()) {
                m0 = null;
            }
            return m0 == null ? new m(f0, 2) : m0;
        }
        return new m(f0, 2);
    }
}

