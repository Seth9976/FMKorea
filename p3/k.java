package p3;

import java.io.Serializable;
import y3.p;

public final class k implements Serializable, j {
    public static final k f;
    private static final long serialVersionUID;

    static {
        k.f = new k();
    }

    @Override  // p3.j
    public j N(j j0) {
        z3.k.e(j0, "context");
        return j0;
    }

    @Override  // p3.j
    public j U(c j$c0) {
        z3.k.e(j$c0, "key");
        return this;
    }

    @Override  // p3.j
    public Object Y(Object object0, p p0) {
        z3.k.e(p0, "operation");
        return object0;
    }

    @Override  // p3.j
    public b a(c j$c0) {
        z3.k.e(j$c0, "key");
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    private final Object readResolve() {
        return k.f;
    }

    @Override
    public String toString() {
        return "EmptyCoroutineContext";
    }
}

