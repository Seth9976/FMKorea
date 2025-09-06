package androidx.collection;

public class d implements Cloneable {
    private boolean f;
    private long[] g;
    private Object[] h;
    private int i;
    private static final Object j;

    static {
        d.j = new Object();
    }

    public d() {
        this(10);
    }

    public d(int v) {
        this.f = false;
        if(v == 0) {
            this.g = c.b;
            this.h = c.c;
            return;
        }
        int v1 = c.f(v);
        this.g = new long[v1];
        this.h = new Object[v1];
    }

    public void b(long v, Object object0) {
        int v1 = this.i;
        if(v1 != 0 && v <= this.g[v1 - 1]) {
            this.k(v, object0);
            return;
        }
        if(this.f && v1 >= this.g.length) {
            this.e();
        }
        int v2 = this.i;
        if(v2 >= this.g.length) {
            int v3 = c.f(v2 + 1);
            long[] arr_v = new long[v3];
            Object[] arr_object = new Object[v3];
            System.arraycopy(this.g, 0, arr_v, 0, this.g.length);
            System.arraycopy(this.h, 0, arr_object, 0, this.h.length);
            this.g = arr_v;
            this.h = arr_object;
        }
        this.g[v2] = v;
        this.h[v2] = object0;
        this.i = v2 + 1;
    }

    public void c() {
        int v = this.i;
        Object[] arr_object = this.h;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = null;
        }
        this.i = 0;
        this.f = false;
    }

    @Override
    public Object clone() {
        return this.d();
    }

    public d d() {
        try {
            d d0 = (d)super.clone();
            d0.g = (long[])this.g.clone();
            d0.h = (Object[])this.h.clone();
            return d0;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
    }

    private void e() {
        int v = this.i;
        long[] arr_v = this.g;
        Object[] arr_object = this.h;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(object0 != d.j) {
                if(v1 != v2) {
                    arr_v[v2] = arr_v[v1];
                    arr_object[v2] = object0;
                    arr_object[v1] = null;
                }
                ++v2;
            }
        }
        this.f = false;
        this.i = v2;
    }

    public Object f(long v) {
        return this.g(v, null);
    }

    public Object g(long v, Object object0) {
        int v1 = c.b(this.g, this.i, v);
        if(v1 >= 0) {
            Object object1 = this.h[v1];
            return object1 == d.j ? object0 : object1;
        }
        return object0;
    }

    public int i(long v) {
        if(this.f) {
            this.e();
        }
        return c.b(this.g, this.i, v);
    }

    public long j(int v) {
        if(this.f) {
            this.e();
        }
        return this.g[v];
    }

    public void k(long v, Object object0) {
        int v1 = c.b(this.g, this.i, v);
        if(v1 >= 0) {
            this.h[v1] = object0;
            return;
        }
        int v2 = ~v1;
        int v3 = this.i;
        if(v2 < v3) {
            Object[] arr_object = this.h;
            if(arr_object[v2] == d.j) {
                this.g[v2] = v;
                arr_object[v2] = object0;
                return;
            }
        }
        if(this.f && v3 >= this.g.length) {
            this.e();
            v2 = ~c.b(this.g, this.i, v);
        }
        int v4 = this.i;
        if(v4 >= this.g.length) {
            int v5 = c.f(v4 + 1);
            long[] arr_v = new long[v5];
            Object[] arr_object1 = new Object[v5];
            System.arraycopy(this.g, 0, arr_v, 0, this.g.length);
            System.arraycopy(this.h, 0, arr_object1, 0, this.h.length);
            this.g = arr_v;
            this.h = arr_object1;
        }
        int v6 = this.i;
        if(v6 - v2 != 0) {
            System.arraycopy(this.g, v2, this.g, v2 + 1, v6 - v2);
            System.arraycopy(this.h, v2, this.h, v2 + 1, this.i - v2);
        }
        this.g[v2] = v;
        this.h[v2] = object0;
        ++this.i;
    }

    public void l(long v) {
        int v1 = c.b(this.g, this.i, v);
        if(v1 >= 0) {
            Object[] arr_object = this.h;
            Object object0 = d.j;
            if(arr_object[v1] != object0) {
                arr_object[v1] = object0;
                this.f = true;
            }
        }
    }

    public void m(int v) {
        Object[] arr_object = this.h;
        Object object0 = d.j;
        if(arr_object[v] != object0) {
            arr_object[v] = object0;
            this.f = true;
        }
    }

    public int n() {
        if(this.f) {
            this.e();
        }
        return this.i;
    }

    public Object o(int v) {
        if(this.f) {
            this.e();
        }
        return this.h[v];
    }

    @Override
    public String toString() {
        if(this.n() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.i * 28);
        stringBuilder0.append('{');
        for(int v = 0; v < this.i; ++v) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(this.j(v));
            stringBuilder0.append('=');
            Object object0 = this.o(v);
            if(object0 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

