package l3;

import java.io.Serializable;
import z3.k;

public final class m implements Serializable {
    private final Object f;
    private final Object g;

    public m(Object object0, Object object1) {
        this.f = object0;
        this.g = object1;
    }

    public final Object a() {
        return this.f;
    }

    public final Object b() {
        return this.g;
    }

    public final Object c() {
        return this.f;
    }

    public final Object d() {
        return this.g;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m)) {
            return false;
        }
        return k.a(this.f, ((m)object0).f) ? k.a(this.g, ((m)object0).g) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.f == null ? 0 : this.f.hashCode();
        Object object0 = this.g;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public String toString() {
        return '(' + this.f + ", " + this.g + ')';
    }
}

