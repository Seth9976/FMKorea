package l3;

import z3.g;
import z3.k;

public final class f implements Comparable {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    private final int f;
    private final int g;
    private final int h;
    private final int i;
    public static final a j;
    public static final f k;

    static {
        f.j = new a(null);
        f.k = l3.g.a();
    }

    public f(int v, int v1, int v2) {
        this.f = v;
        this.g = v1;
        this.h = v2;
        this.i = this.f(v, v1, v2);
    }

    public int b(f f0) {
        k.e(f0, "other");
        return this.i - f0.i;
    }

    @Override
    public int compareTo(Object object0) {
        return this.b(((f)object0));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        f f0 = object0 instanceof f ? ((f)object0) : null;
        return f0 == null ? false : this.i == f0.i;
    }

    private final int f(int v, int v1, int v2) {
        if(v < 0 || v >= 0x100 || v1 < 0 || v1 >= 0x100 || v2 < 0 || v2 >= 0x100) {
            throw new IllegalArgumentException(("Version components are out of range: " + v + '.' + v1 + '.' + v2).toString());
        }
        return (v << 16) + (v1 << 8) + v2;
    }

    @Override
    public int hashCode() {
        return this.i;
    }

    @Override
    public String toString() {
        return this.f + '.' + this.g + '.' + this.h;
    }
}

