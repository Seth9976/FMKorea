package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b implements Collection, Set {
    private int[] f;
    Object[] g;
    int h;
    private f i;
    private static final int[] j;
    private static final Object[] k;
    private static Object[] l;
    private static int m;
    private static Object[] n;
    private static int o;

    static {
        b.j = new int[0];
        b.k = new Object[0];
    }

    public b() {
        this(0);
    }

    public b(int v) {
        if(v == 0) {
            this.f = b.j;
            this.g = b.k;
        }
        else {
            this.a(v);
        }
        this.h = 0;
    }

    private void a(int v) {
        switch(v) {
            case 4: {
                Class class0 = b.class;
                synchronized(class0) {
                    Object[] arr_object = b.l;
                    if(arr_object != null) {
                        this.g = arr_object;
                        b.l = (Object[])arr_object[0];
                        this.f = (int[])arr_object[1];
                        arr_object[1] = null;
                        arr_object[0] = null;
                        --b.m;
                        return;
                    }
                }
                break;
            }
            case 8: {
                Class class1 = b.class;
                synchronized(class1) {
                    Object[] arr_object1 = b.n;
                    if(arr_object1 != null) {
                        this.g = arr_object1;
                        b.n = (Object[])arr_object1[0];
                        this.f = (int[])arr_object1[1];
                        arr_object1[1] = null;
                        arr_object1[0] = null;
                        --b.o;
                        return;
                    }
                }
            }
        }
        this.f = new int[v];
        this.g = new Object[v];
    }

    @Override
    public boolean add(Object object0) {
        int v1;
        int v;
        if(object0 == null) {
            v = this.i();
            v1 = 0;
        }
        else {
            int v2 = object0.hashCode();
            v1 = v2;
            v = this.h(object0, v2);
        }
        if(v >= 0) {
            return false;
        }
        int v3 = 8;
        int v4 = this.h;
        int[] arr_v = this.f;
        if(v4 >= arr_v.length) {
            if(v4 >= 8) {
                v3 = (v4 >> 1) + v4;
            }
            else if(v4 < 4) {
                v3 = 4;
            }
            Object[] arr_object = this.g;
            this.a(v3);
            int[] arr_v1 = this.f;
            if(arr_v1.length > 0) {
                System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
                System.arraycopy(arr_object, 0, this.g, 0, arr_object.length);
            }
            b.d(arr_v, arr_object, this.h);
        }
        int v5 = this.h;
        if(~v < v5) {
            System.arraycopy(this.f, ~v, this.f, -v, v5 - ~v);
            System.arraycopy(this.g, ~v, this.g, -v, this.h - ~v);
        }
        this.f[~v] = v1;
        this.g[~v] = object0;
        ++this.h;
        return true;
    }

    @Override
    public boolean addAll(Collection collection0) {
        this.c(this.h + collection0.size());
        boolean z = false;
        for(Object object0: collection0) {
            z |= this.add(object0);
        }
        return z;
    }

    public void c(int v) {
        int[] arr_v = this.f;
        if(arr_v.length < v) {
            Object[] arr_object = this.g;
            this.a(v);
            int v1 = this.h;
            if(v1 > 0) {
                System.arraycopy(arr_v, 0, this.f, 0, v1);
                System.arraycopy(arr_object, 0, this.g, 0, this.h);
            }
            b.d(arr_v, arr_object, this.h);
        }
    }

    @Override
    public void clear() {
        int v = this.h;
        if(v != 0) {
            b.d(this.f, this.g, v);
            this.f = b.j;
            this.g = b.k;
            this.h = 0;
        }
    }

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public boolean containsAll(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private static void d(int[] arr_v, Object[] arr_object, int v) {
        switch(arr_v.length) {
            case 4: {
                Class class0 = b.class;
                synchronized(class0) {
                    if(b.m < 10) {
                        arr_object[0] = b.l;
                        arr_object[1] = arr_v;
                        for(int v2 = v - 1; v2 >= 2; --v2) {
                            arr_object[v2] = null;
                        }
                        b.l = arr_object;
                        ++b.m;
                    }
                }
                return;
            }
            case 8: {
                Class class1 = b.class;
                synchronized(class1) {
                    if(b.o < 10) {
                        arr_object[0] = b.n;
                        arr_object[1] = arr_v;
                        for(int v4 = v - 1; v4 >= 2; --v4) {
                            arr_object[v4] = null;
                        }
                        b.n = arr_object;
                        ++b.o;
                    }
                }
            }
        }
    }

    private f e() {
        class a extends f {
            final b d;

            @Override  // androidx.collection.f
            protected void a() {
                b.this.clear();
            }

            @Override  // androidx.collection.f
            protected Object b(int v, int v1) {
                return b.this.g[v];
            }

            @Override  // androidx.collection.f
            protected Map c() {
                throw new UnsupportedOperationException("not a map");
            }

            @Override  // androidx.collection.f
            protected int d() {
                return b.this.h;
            }

            @Override  // androidx.collection.f
            protected int e(Object object0) {
                return b.this.indexOf(object0);
            }

            @Override  // androidx.collection.f
            protected int f(Object object0) {
                return b.this.indexOf(object0);
            }

            @Override  // androidx.collection.f
            protected void g(Object object0, Object object1) {
                b.this.add(object0);
            }

            @Override  // androidx.collection.f
            protected void h(int v) {
                b.this.k(v);
            }

            @Override  // androidx.collection.f
            protected Object i(int v, Object object0) {
                throw new UnsupportedOperationException("not a map");
            }
        }

        if(this.i == null) {
            this.i = new a(this);
        }
        return this.i;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set0 = (Set)object0;
            if(this.size() != set0.size()) {
                return false;
            }
            try {
                for(int v = 0; true; ++v) {
                    if(v >= this.h) {
                        return true;
                    }
                    if(!set0.contains(this.l(v))) {
                        return false;
                    }
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    private int h(Object object0, int v) {
        int v1 = this.h;
        if(v1 == 0) {
            return -1;
        }
        int v2 = c.a(this.f, v1, v);
        if(v2 < 0) {
            return v2;
        }
        if(object0.equals(this.g[v2])) {
            return v2;
        }
        int v3;
        for(v3 = v2 + 1; v3 < v1 && this.f[v3] == v; ++v3) {
            if(object0.equals(this.g[v3])) {
                return v3;
            }
        }
        for(int v4 = v2 - 1; v4 >= 0 && this.f[v4] == v; --v4) {
            if(object0.equals(this.g[v4])) {
                return v4;
            }
        }
        return ~v3;
    }

    @Override
    public int hashCode() {
        int[] arr_v = this.f;
        int v = this.h;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += arr_v[v1];
        }
        return v2;
    }

    private int i() {
        int v = this.h;
        if(v == 0) {
            return -1;
        }
        int v1 = c.a(this.f, v, 0);
        if(v1 < 0) {
            return v1;
        }
        if(this.g[v1] == null) {
            return v1;
        }
        int v2;
        for(v2 = v1 + 1; v2 < v && this.f[v2] == 0; ++v2) {
            if(this.g[v2] == null) {
                return v2;
            }
        }
        for(int v3 = v1 - 1; v3 >= 0 && this.f[v3] == 0; --v3) {
            if(this.g[v3] == null) {
                return v3;
            }
        }
        return ~v2;
    }

    public int indexOf(Object object0) {
        return object0 == null ? this.i() : this.h(object0, object0.hashCode());
    }

    @Override
    public boolean isEmpty() {
        return this.h <= 0;
    }

    @Override
    public Iterator iterator() {
        return this.e().m().iterator();
    }

    public Object k(int v) {
        Object[] arr_object = this.g;
        Object object0 = arr_object[v];
        int v1 = this.h;
        if(v1 <= 1) {
            b.d(this.f, arr_object, v1);
            this.f = b.j;
            this.g = b.k;
            this.h = 0;
            return object0;
        }
        int[] arr_v = this.f;
        int v2 = 8;
        if(arr_v.length <= 8 || v1 >= arr_v.length / 3) {
            this.h = v1 - 1;
            if(v < v1 - 1) {
                System.arraycopy(arr_v, v + 1, arr_v, v, v1 - 1 - v);
                System.arraycopy(this.g, v + 1, this.g, v, this.h - v);
            }
            this.g[this.h] = null;
        }
        else {
            if(v1 > 8) {
                v2 = v1 + (v1 >> 1);
            }
            this.a(v2);
            --this.h;
            if(v > 0) {
                System.arraycopy(arr_v, 0, this.f, 0, v);
                System.arraycopy(arr_object, 0, this.g, 0, v);
            }
            int v3 = this.h;
            if(v < v3) {
                System.arraycopy(arr_v, v + 1, this.f, v, v3 - v);
                System.arraycopy(arr_object, v + 1, this.g, v, this.h - v);
                return object0;
            }
        }
        return object0;
    }

    public Object l(int v) {
        return this.g[v];
    }

    @Override
    public boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.k(v);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        boolean z = false;
        for(Object object0: collection0) {
            z |= this.remove(object0);
        }
        return z;
    }

    @Override
    public boolean retainAll(Collection collection0) {
        int v = this.h - 1;
        boolean z = false;
        while(v >= 0) {
            if(!collection0.contains(this.g[v])) {
                this.k(v);
                z = true;
            }
            --v;
        }
        return z;
    }

    @Override
    public int size() {
        return this.h;
    }

    @Override
    public Object[] toArray() {
        int v = this.h;
        Object[] arr_object = new Object[v];
        System.arraycopy(this.g, 0, arr_object, 0, v);
        return arr_object;
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        if(arr_object.length < this.h) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), this.h);
        }
        System.arraycopy(this.g, 0, arr_object, 0, this.h);
        int v = this.h;
        if(arr_object.length > v) {
            arr_object[v] = null;
        }
        return arr_object;
    }

    @Override
    public String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.h * 14);
        stringBuilder0.append('{');
        for(int v = 0; v < this.h; ++v) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.l(v);
            if(object0 == this) {
                stringBuilder0.append("(this Set)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

