package I3;

import l3.n;

public abstract class w {
    public static final u a(q0 q00) {
        return new v(q00);
    }

    public static u b(q0 q00, int v, Object object0) {
        if((v & 1) != 0) {
            q00 = null;
        }
        return w.a(q00);
    }

    public static final boolean c(u u0, Object object0) {
        Throwable throwable0 = n.b(object0);
        return throwable0 == null ? u0.R(object0) : u0.Q(throwable0);
    }
}

