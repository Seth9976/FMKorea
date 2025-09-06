package r3;

import p3.f;
import p3.j;

public final class c implements f {
    public static final c f;

    static {
        c.f = new c();
    }

    @Override  // p3.f
    public void e(Object object0) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override  // p3.f
    public j getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override
    public String toString() {
        return "This continuation is already complete";
    }
}

