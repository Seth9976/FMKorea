package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

final class b0 extends c implements RandomAccess {
    private Object[] g;
    private int h;
    private static final b0 i;

    static {
        b0 b00 = new b0(new Object[0], 0);
        b0.i = b00;
        b00.b();
    }

    private b0(Object[] arr_object, int v) {
        this.g = arr_object;
        this.h = v;
    }

    @Override
    public void add(int v, Object object0) {
        this.a();
        if(v >= 0) {
            int v1 = this.h;
            if(v <= v1) {
                Object[] arr_object = this.g;
                if(v1 < arr_object.length) {
                    System.arraycopy(arr_object, v, arr_object, v + 1, v1 - v);
                }
                else {
                    Object[] arr_object1 = b0.c(v1 * 3 / 2 + 1);
                    System.arraycopy(this.g, 0, arr_object1, 0, v);
                    System.arraycopy(this.g, v, arr_object1, v + 1, this.h - v);
                    this.g = arr_object1;
                }
                this.g[v] = object0;
                ++this.h;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.h(v));
    }

    @Override  // androidx.datastore.preferences.protobuf.c
    public boolean add(Object object0) {
        this.a();
        int v = this.h;
        Object[] arr_object = this.g;
        if(v == arr_object.length) {
            this.g = Arrays.copyOf(arr_object, v * 3 / 2 + 1);
        }
        int v1 = this.h;
        this.h = v1 + 1;
        this.g[v1] = object0;
        ++this.modCount;
        return true;
    }

    private static Object[] c(int v) {
        return new Object[v];
    }

    public static b0 d() {
        return b0.i;
    }

    private void e(int v) {
        if(v < 0 || v >= this.h) {
            throw new IndexOutOfBoundsException(this.h(v));
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.y$b
    public b g(int v) {
        return this.i(v);
    }

    @Override
    public Object get(int v) {
        this.e(v);
        return this.g[v];
    }

    private String h(int v) {
        return "Index:" + v + ", Size:" + this.h;
    }

    public b0 i(int v) {
        if(v < this.h) {
            throw new IllegalArgumentException();
        }
        return new b0(Arrays.copyOf(this.g, v), this.h);
    }

    @Override
    public Object remove(int v) {
        this.a();
        this.e(v);
        Object[] arr_object = this.g;
        Object object0 = arr_object[v];
        int v1 = this.h;
        if(v < v1 - 1) {
            System.arraycopy(arr_object, v + 1, arr_object, v, v1 - v - 1);
        }
        --this.h;
        ++this.modCount;
        return object0;
    }

    @Override
    public Object set(int v, Object object0) {
        this.a();
        this.e(v);
        Object[] arr_object = this.g;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        ++this.modCount;
        return object1;
    }

    @Override
    public int size() {
        return this.h;
    }
}

