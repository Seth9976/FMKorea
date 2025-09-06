package r3;

import p3.f;
import z3.h;
import z3.v;

public abstract class k extends d implements h {
    private final int i;

    public k(int v, f f0) {
        super(f0);
        this.i = v;
    }

    @Override  // z3.h
    public int c() {
        return this.i;
    }

    @Override  // r3.a
    public String toString() {
        if(this.r() == null) {
            String s = v.f(this);
            z3.k.d(s, "renderLambdaToString(...)");
            return s;
        }
        return super.toString();
    }
}

