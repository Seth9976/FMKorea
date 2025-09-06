package d2;

import B2.b;

public final class f implements b {
    public final String a;

    public f(String s) {
        this.a = s;
    }

    @Override  // B2.b
    public final Object get() {
        return g.a(this.a);
    }
}

