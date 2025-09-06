package B;

import z3.k;

public class f implements e {
    private final Object[] a;
    private int b;

    public f(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[v];
    }

    @Override  // B.e
    public boolean a(Object object0) {
        k.e(object0, "instance");
        if(this.c(object0)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int v = this.b;
        Object[] arr_object = this.a;
        if(v < arr_object.length) {
            arr_object[v] = object0;
            this.b = v + 1;
            return true;
        }
        return false;
    }

    @Override  // B.e
    public Object b() {
        int v = this.b;
        if(v > 0) {
            Object object0 = this.a[v - 1];
            k.c(object0, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.a[v - 1] = null;
            --this.b;
            return object0;
        }
        return null;
    }

    private final boolean c(Object object0) {
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.a[v1] == object0) {
                return true;
            }
        }
        return false;
    }
}

