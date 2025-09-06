package z3;

import java.io.Serializable;

public abstract class l implements Serializable, h {
    private final int f;

    public l(int v) {
        this.f = v;
    }

    @Override  // z3.h
    public int c() {
        return this.f;
    }

    @Override
    public String toString() {
        String s = v.g(this);
        k.d(s, "renderLambdaToString(...)");
        return s;
    }
}

