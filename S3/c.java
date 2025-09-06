package s3;

import java.io.Serializable;
import m3.i;
import z3.k;

final class c extends m3.c implements Serializable, a {
    private final Enum[] g;

    public c(Enum[] arr_enum) {
        k.e(arr_enum, "entries");
        super();
        this.g = arr_enum;
    }

    @Override  // m3.b
    public int c() {
        return this.g.length;
    }

    @Override  // m3.b
    public final boolean contains(Object object0) {
        return object0 instanceof Enum ? this.e(((Enum)object0)) : false;
    }

    public boolean e(Enum enum0) {
        k.e(enum0, "element");
        return ((Enum)i.o(this.g, enum0.ordinal())) == enum0;
    }

    @Override  // m3.c
    public Object get(int v) {
        return this.h(v);
    }

    public Enum h(int v) {
        m3.c.f.a(v, this.g.length);
        return this.g[v];
    }

    public int i(Enum enum0) {
        k.e(enum0, "element");
        int v = enum0.ordinal();
        return ((Enum)i.o(this.g, v)) == enum0 ? v : -1;
    }

    @Override  // m3.c
    public final int indexOf(Object object0) {
        return object0 instanceof Enum ? this.i(((Enum)object0)) : -1;
    }

    public int k(Enum enum0) {
        k.e(enum0, "element");
        return this.indexOf(enum0);
    }

    @Override  // m3.c
    public final int lastIndexOf(Object object0) {
        return object0 instanceof Enum ? this.k(((Enum)object0)) : -1;
    }

    private final Object writeReplace() {
        return new d(this.g);
    }
}

