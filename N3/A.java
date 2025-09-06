package n3;

import java.util.Map.Entry;
import m3.f;
import z3.k;

public abstract class a extends f {
    public final boolean c(Map.Entry map$Entry0) {
        k.e(map$Entry0, "element");
        return this.d(map$Entry0);
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof Map.Entry ? this.c(((Map.Entry)object0)) : false;
    }

    public abstract boolean d(Map.Entry arg1);

    public abstract boolean e(Map.Entry arg1);

    @Override
    public final boolean remove(Object object0) {
        return object0 instanceof Map.Entry ? this.e(((Map.Entry)object0)) : false;
    }
}

