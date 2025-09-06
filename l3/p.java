package l3;

import java.io.Serializable;
import y3.a;
import z3.g;
import z3.k;

final class p implements Serializable, h {
    private a f;
    private volatile Object g;
    private final Object h;

    public p(a a0, Object object0) {
        k.e(a0, "initializer");
        super();
        this.f = a0;
        this.g = s.a;
        if(object0 == null) {
            object0 = this;
        }
        this.h = object0;
    }

    public p(a a0, Object object0, int v, g g0) {
        if((v & 2) != 0) {
            object0 = null;
        }
        this(a0, object0);
    }

    @Override  // l3.h
    public Object getValue() {
        Object object0 = this.g;
        s s0 = s.a;
        if(object0 != s0) {
            return object0;
        }
        synchronized(this.h) {
            Object object2 = this.g;
            if(object2 == s0) {
                a a0 = this.f;
                k.b(a0);
                object2 = a0.a();
                this.g = object2;
                this.f = null;
            }
            return object2;
        }
    }

    @Override  // l3.h
    public boolean isInitialized() {
        return this.g != s.a;
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return this.isInitialized() ? String.valueOf(this.getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new d(this.getValue());
    }
}

