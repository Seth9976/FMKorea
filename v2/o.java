package V2;

import O2.a;
import O2.g;
import R2.b;
import java.util.Map;

public final class o implements g {
    private final j a;

    public o() {
        this.a = new j();
    }

    @Override  // O2.g
    public b a(String s, a a0, int v, int v1, Map map0) {
        if(a0 != a.t) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got " + a0);
        }
        return this.a.a("0" + s, a.m, v, v1, map0);
    }
}

