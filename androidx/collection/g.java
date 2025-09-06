package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class g {
    int[] f;
    Object[] g;
    int h;
    static Object[] i;
    static int j;
    static Object[] k;
    static int l;

    public g() {
        this.f = c.a;
        this.g = c.c;
        this.h = 0;
    }

    public g(int v) {
        if(v == 0) {
            this.f = c.a;
            this.g = c.c;
        }
        else {
            this.a(v);
        }
        this.h = 0;
    }

    public g(g g0) {
        if(g0 != null) {
            this.k(g0);
        }
    }

    private void a(int v) {
        switch(v) {
            case 4: {
                Class class0 = g.class;
                synchronized(class0) {
                    Object[] arr_object = g.i;
                    if(arr_object != null) {
                        this.g = arr_object;
                        g.i = (Object[])arr_object[0];
                        this.f = (int[])arr_object[1];
                        arr_object[1] = null;
                        arr_object[0] = null;
                        --g.j;
                        return;
                    }
                }
                break;
            }
            case 8: {
                Class class1 = g.class;
                synchronized(class1) {
                    Object[] arr_object1 = g.k;
                    if(arr_object1 != null) {
                        this.g = arr_object1;
                        g.k = (Object[])arr_object1[0];
                        this.f = (int[])arr_object1[1];
                        arr_object1[1] = null;
                        arr_object1[0] = null;
                        --g.l;
                        return;
                    }
                }
            }
        }
        this.f = new int[v];
        this.g = new Object[v << 1];
    }

    private static int c(int[] arr_v, int v, int v1) {
        try {
            return c.a(arr_v, v, v1);
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int v = this.h;
        if(v > 0) {
            int[] arr_v = this.f;
            Object[] arr_object = this.g;
            this.f = c.a;
            this.g = c.c;
            this.h = 0;
            g.e(arr_v, arr_object, v);
        }
        if(this.h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object object0) {
        return this.g(object0) >= 0;
    }

    public boolean containsValue(Object object0) {
        return this.i(object0) >= 0;
    }

    public void d(int v) {
        int v1 = this.h;
        int[] arr_v = this.f;
        if(arr_v.length < v) {
            Object[] arr_object = this.g;
            this.a(v);
            if(this.h > 0) {
                System.arraycopy(arr_v, 0, this.f, 0, v1);
                System.arraycopy(arr_object, 0, this.g, 0, v1 << 1);
            }
            g.e(arr_v, arr_object, v1);
        }
        if(this.h != v1) {
            throw new ConcurrentModificationException();
        }
    }

    private static void e(int[] arr_v, Object[] arr_object, int v) {
        switch(arr_v.length) {
            case 4: {
                Class class0 = g.class;
                synchronized(class0) {
                    if(g.j < 10) {
                        arr_object[0] = g.i;
                        arr_object[1] = arr_v;
                        for(int v2 = (v << 1) - 1; v2 >= 2; --v2) {
                            arr_object[v2] = null;
                        }
                        g.i = arr_object;
                        ++g.j;
                    }
                }
                return;
            }
            case 8: {
                Class class1 = g.class;
                synchronized(class1) {
                    if(g.l < 10) {
                        arr_object[0] = g.k;
                        arr_object[1] = arr_v;
                        for(int v4 = (v << 1) - 1; v4 >= 2; --v4) {
                            arr_object[v4] = null;
                        }
                        g.k = arr_object;
                        ++g.l;
                    }
                }
            }
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof g) {
            g g0 = (g)object0;
            if(this.size() != g0.size()) {
                return false;
            }
            try {
                for(int v = 0; true; ++v) {
                    if(v >= this.h) {
                        return true;
                    }
                    Object object1 = this.j(v);
                    Object object2 = this.n(v);
                    Object object3 = g0.get(object1);
                    if(object2 != null) {
                        if(object2.equals(object3)) {
                            continue;
                        }
                        break;
                    }
                    else if(object3 != null || !g0.containsKey(object1)) {
                        return false;
                    }
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
            return false;
        }
        if(object0 instanceof Map) {
            Map map0 = (Map)object0;
            if(this.size() != map0.size()) {
                return false;
            }
            try {
                for(int v1 = 0; v1 < this.h; ++v1) {
                    Object object4 = this.j(v1);
                    Object object5 = this.n(v1);
                    Object object6 = map0.get(object4);
                    if(object5 == null) {
                        if(object6 != null || !map0.containsKey(object4)) {
                            return false;
                        }
                    }
                    else if(!object5.equals(object6)) {
                        return false;
                    }
                }
                return true;
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    int f(Object object0, int v) {
        int v1 = this.h;
        if(v1 == 0) {
            return -1;
        }
        int v2 = g.c(this.f, v1, v);
        if(v2 < 0) {
            return v2;
        }
        if(object0.equals(this.g[v2 << 1])) {
            return v2;
        }
        int v3;
        for(v3 = v2 + 1; v3 < v1 && this.f[v3] == v; ++v3) {
            if(object0.equals(this.g[v3 << 1])) {
                return v3;
            }
        }
        for(int v4 = v2 - 1; v4 >= 0 && this.f[v4] == v; --v4) {
            if(object0.equals(this.g[v4 << 1])) {
                return v4;
            }
        }
        return ~v3;
    }

    public int g(Object object0) {
        return object0 == null ? this.h() : this.f(object0, object0.hashCode());
    }

    public Object get(Object object0) {
        return this.getOrDefault(object0, null);
    }

    public Object getOrDefault(Object object0, Object object1) {
        int v = this.g(object0);
        return v < 0 ? object1 : this.g[(v << 1) + 1];
    }

    int h() {
        int v = this.h;
        if(v == 0) {
            return -1;
        }
        int v1 = g.c(this.f, v, 0);
        if(v1 < 0) {
            return v1;
        }
        if(this.g[v1 << 1] == null) {
            return v1;
        }
        int v2;
        for(v2 = v1 + 1; v2 < v && this.f[v2] == 0; ++v2) {
            if(this.g[v2 << 1] == null) {
                return v2;
            }
        }
        for(int v3 = v1 - 1; v3 >= 0 && this.f[v3] == 0; --v3) {
            if(this.g[v3 << 1] == null) {
                return v3;
            }
        }
        return ~v2;
    }

    @Override
    public int hashCode() {
        int[] arr_v = this.f;
        Object[] arr_object = this.g;
        int v = this.h;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 1; v2 < v; v1 += 2) {
            Object object0 = arr_object[v1];
            v3 += (object0 == null ? 0 : object0.hashCode()) ^ arr_v[v2];
            ++v2;
        }
        return v3;
    }

    int i(Object object0) {
        int v = this.h * 2;
        Object[] arr_object = this.g;
        if(object0 == null) {
            for(int v1 = 1; v1 < v; v1 += 2) {
                if(arr_object[v1] == null) {
                    return v1 >> 1;
                }
            }
            return -1;
        }
        for(int v2 = 1; v2 < v; v2 += 2) {
            if(object0.equals(arr_object[v2])) {
                return v2 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.h <= 0;
    }

    public Object j(int v) {
        return this.g[v << 1];
    }

    public void k(g g0) {
        int v = g0.h;
        this.d(this.h + v);
        if(this.h != 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                this.put(g0.j(v1), g0.n(v1));
            }
        }
        else if(v > 0) {
            System.arraycopy(g0.f, 0, this.f, 0, v);
            System.arraycopy(g0.g, 0, this.g, 0, v << 1);
            this.h = v;
        }
    }

    public Object l(int v) {
        Object[] arr_object = this.g;
        Object object0 = arr_object[(v << 1) + 1];
        int v1 = this.h;
        int v2 = 0;
        if(v1 <= 1) {
            g.e(this.f, arr_object, v1);
            this.f = c.a;
            this.g = c.c;
        }
        else {
            int[] arr_v = this.f;
            int v3 = 8;
            if(arr_v.length <= 8 || v1 >= arr_v.length / 3) {
                if(v < v1 - 1) {
                    int v5 = v1 - 1 - v;
                    System.arraycopy(arr_v, v + 1, arr_v, v, v5);
                    System.arraycopy(this.g, v + 1 << 1, this.g, v << 1, v5 << 1);
                }
                Object[] arr_object1 = this.g;
                int v6 = v1 - 1 << 1;
                arr_object1[v6] = null;
                arr_object1[v6 + 1] = null;
            }
            else {
                if(v1 > 8) {
                    v3 = v1 + (v1 >> 1);
                }
                this.a(v3);
                if(v1 != this.h) {
                    throw new ConcurrentModificationException();
                }
                if(v > 0) {
                    System.arraycopy(arr_v, 0, this.f, 0, v);
                    System.arraycopy(arr_object, 0, this.g, 0, v << 1);
                }
                if(v < v1 - 1) {
                    int v4 = v1 - 1 - v;
                    System.arraycopy(arr_v, v + 1, this.f, v, v4);
                    System.arraycopy(arr_object, v + 1 << 1, this.g, v << 1, v4 << 1);
                }
            }
            v2 = v1 - 1;
        }
        if(v1 != this.h) {
            throw new ConcurrentModificationException();
        }
        this.h = v2;
        return object0;
    }

    public Object m(int v, Object object0) {
        int v1 = (v << 1) + 1;
        Object[] arr_object = this.g;
        Object object1 = arr_object[v1];
        arr_object[v1] = object0;
        return object1;
    }

    public Object n(int v) {
        return this.g[(v << 1) + 1];
    }

    public Object put(Object object0, Object object1) {
        int v2;
        int v1;
        int v = this.h;
        if(object0 == null) {
            v1 = this.h();
            v2 = 0;
        }
        else {
            int v3 = object0.hashCode();
            v2 = v3;
            v1 = this.f(object0, v3);
        }
        if(v1 >= 0) {
            int v4 = (v1 << 1) + 1;
            Object[] arr_object = this.g;
            Object object2 = arr_object[v4];
            arr_object[v4] = object1;
            return object2;
        }
        int v5 = 8;
        int[] arr_v = this.f;
        if(v >= arr_v.length) {
            if(v >= 8) {
                v5 = (v >> 1) + v;
            }
            else if(v < 4) {
                v5 = 4;
            }
            Object[] arr_object1 = this.g;
            this.a(v5);
            if(v != this.h) {
                throw new ConcurrentModificationException();
            }
            int[] arr_v1 = this.f;
            if(arr_v1.length > 0) {
                System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
                System.arraycopy(arr_object1, 0, this.g, 0, arr_object1.length);
            }
            g.e(arr_v, arr_object1, v);
        }
        if(~v1 < v) {
            System.arraycopy(this.f, ~v1, this.f, -v1, v - ~v1);
            System.arraycopy(this.g, ~v1 << 1, this.g, -v1 << 1, this.h - ~v1 << 1);
        }
        int v6 = this.h;
        if(v == v6) {
            int[] arr_v2 = this.f;
            if(~v1 < arr_v2.length) {
                arr_v2[~v1] = v2;
                Object[] arr_object2 = this.g;
                arr_object2[~v1 << 1] = object0;
                arr_object2[(~v1 << 1) + 1] = object1;
                this.h = v6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object object0, Object object1) {
        Object object2 = this.get(object0);
        return object2 == null ? this.put(object0, object1) : object2;
    }

    public Object remove(Object object0) {
        int v = this.g(object0);
        return v < 0 ? null : this.l(v);
    }

    public boolean remove(Object object0, Object object1) {
        int v = this.g(object0);
        if(v >= 0) {
            Object object2 = this.n(v);
            if(object1 == object2 || object1 != null && object1.equals(object2)) {
                this.l(v);
                return true;
            }
        }
        return false;
    }

    public Object replace(Object object0, Object object1) {
        int v = this.g(object0);
        return v < 0 ? null : this.m(v, object1);
    }

    public boolean replace(Object object0, Object object1, Object object2) {
        int v = this.g(object0);
        if(v >= 0) {
            Object object3 = this.n(v);
            if(object3 == object1 || object1 != null && object1.equals(object3)) {
                this.m(v, object2);
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.h;
    }

    @Override
    public String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.h * 28);
        stringBuilder0.append('{');
        for(int v = 0; v < this.h; ++v) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.j(v);
            if(object0 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
            stringBuilder0.append('=');
            Object object1 = this.n(v);
            if(object1 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object1);
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

