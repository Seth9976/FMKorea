package l3;

import java.io.Serializable;
import z3.k;

public final class q implements Serializable {
    private final Object f;
    private final Object g;
    private final Object h;

    public q(Object object0, Object object1, Object object2) {
        this.f = object0;
        this.g = object1;
        this.h = object2;
    }

    public final Object a() {
        return this.f;
    }

    public final Object b() {
        return this.g;
    }

    public final Object c() {
        return this.h;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q)) {
            return false;
        }
        if(!k.a(this.f, ((q)object0).f)) {
            return false;
        }
        return k.a(this.g, ((q)object0).g) ? k.a(this.h, ((q)object0).h) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.f == null ? 0 : this.f.hashCode();
        int v2 = this.g == null ? 0 : this.g.hashCode();
        Object object0 = this.h;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return '(' + this.f + ", " + this.g + ", " + this.h + ')';
    }
}

