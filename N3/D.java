package n3;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import z3.g;
import z3.k;

public final class d implements Serializable, Map {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public static final int b(a d$a0, int v) {
            return d$a0.d(v);
        }

        private final int c(int v) {
            return Integer.highestOneBit(D3.d.a(v, 1) * 3);
        }

        private final int d(int v) {
            return Integer.numberOfLeadingZeros(v) + 1;
        }

        public final d e() {
            return d.t;
        }
    }

    public static final class b extends n3.d.d implements Iterator {
        public b(d d0) {
            k.e(d0, "map");
            super(d0);
        }

        public c i() {
            this.a();
            if(this.c() >= this.e().k) {
                throw new NoSuchElementException();
            }
            int v = this.c();
            this.g(v + 1);
            this.h(v);
            c d$c0 = new c(this.e(), this.d());
            this.f();
            return d$c0;
        }

        public final void j(StringBuilder stringBuilder0) {
            k.e(stringBuilder0, "sb");
            if(this.c() >= this.e().k) {
                throw new NoSuchElementException();
            }
            int v = this.c();
            this.g(v + 1);
            this.h(v);
            Object object0 = this.e().f[this.d()];
            if(object0 == this.e()) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
            stringBuilder0.append('=');
            Object[] arr_object = this.e().g;
            k.b(arr_object);
            Object object1 = arr_object[this.d()];
            if(object1 == this.e()) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object1);
            }
            this.f();
        }

        public final int k() {
            if(this.c() >= this.e().k) {
                throw new NoSuchElementException();
            }
            int v = this.c();
            this.g(v + 1);
            this.h(v);
            Object object0 = this.e().f[this.d()];
            int v1 = 0;
            int v2 = object0 == null ? 0 : object0.hashCode();
            Object[] arr_object = this.e().g;
            k.b(arr_object);
            Object object1 = arr_object[this.d()];
            if(object1 != null) {
                v1 = object1.hashCode();
            }
            this.f();
            return v2 ^ v1;
        }

        @Override
        public Object next() {
            return this.i();
        }
    }

    public static final class c implements Map.Entry {
        private final d f;
        private final int g;
        private final int h;

        public c(d d0, int v) {
            k.e(d0, "map");
            super();
            this.f = d0;
            this.g = v;
            this.h = d0.m;
        }

        private final void a() {
            if(this.f.m != this.h) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof Map.Entry && k.a(((Map.Entry)object0).getKey(), this.getKey()) && k.a(((Map.Entry)object0).getValue(), this.getValue());
        }

        @Override
        public Object getKey() {
            this.a();
            return this.f.f[this.g];
        }

        @Override
        public Object getValue() {
            this.a();
            Object[] arr_object = this.f.g;
            k.b(arr_object);
            return arr_object[this.g];
        }

        @Override
        public int hashCode() {
            Object object0 = this.getKey();
            int v = 0;
            int v1 = object0 == null ? 0 : object0.hashCode();
            Object object1 = this.getValue();
            if(object1 != null) {
                v = object1.hashCode();
            }
            return v1 ^ v;
        }

        @Override
        public Object setValue(Object object0) {
            this.a();
            this.f.m();
            Object[] arr_object = this.f.k();
            Object object1 = arr_object[this.g];
            arr_object[this.g] = object0;
            return object1;
        }

        @Override
        public String toString() {
            return this.getKey() + '=' + this.getValue();
        }
    }

    public static abstract class n3.d.d {
        private final d f;
        private int g;
        private int h;
        private int i;

        public n3.d.d(d d0) {
            k.e(d0, "map");
            super();
            this.f = d0;
            this.h = -1;
            this.i = d0.m;
            this.f();
        }

        public final void a() {
            if(this.f.m != this.i) {
                throw new ConcurrentModificationException();
            }
        }

        public final int c() {
            return this.g;
        }

        public final int d() {
            return this.h;
        }

        public final d e() {
            return this.f;
        }

        public final void f() {
            while(this.g < this.f.k) {
                int v = this.g;
                if(this.f.h[v] >= 0) {
                    break;
                }
                this.g = v + 1;
            }
        }

        public final void g(int v) {
            this.g = v;
        }

        public final void h(int v) {
            this.h = v;
        }

        public final boolean hasNext() {
            return this.g < this.f.k;
        }

        public final void remove() {
            this.a();
            if(this.h == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f.m();
            this.f.L(this.h);
            this.h = -1;
            this.i = this.f.m;
        }
    }

    public static final class e extends n3.d.d implements Iterator {
        public e(d d0) {
            k.e(d0, "map");
            super(d0);
        }

        @Override
        public Object next() {
            this.a();
            if(this.c() >= this.e().k) {
                throw new NoSuchElementException();
            }
            int v = this.c();
            this.g(v + 1);
            this.h(v);
            Object object0 = this.e().f[this.d()];
            this.f();
            return object0;
        }
    }

    public static final class f extends n3.d.d implements Iterator {
        public f(d d0) {
            k.e(d0, "map");
            super(d0);
        }

        @Override
        public Object next() {
            this.a();
            if(this.c() >= this.e().k) {
                throw new NoSuchElementException();
            }
            int v = this.c();
            this.g(v + 1);
            this.h(v);
            Object[] arr_object = this.e().g;
            k.b(arr_object);
            Object object0 = arr_object[this.d()];
            this.f();
            return object0;
        }
    }

    private Object[] f;
    private Object[] g;
    private int[] h;
    private int[] i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private n3.f o;
    private n3.g p;
    private n3.e q;
    private boolean r;
    public static final a s;
    private static final d t;

    static {
        d.s = new a(null);
        d d0 = new d(0);
        d0.r = true;
        d.t = d0;
    }

    public d() {
        this(8);
    }

    public d(int v) {
        this(n3.c.d(v), null, new int[v], new int[a.a(d.s, v)], 2, 0);
    }

    private d(Object[] arr_object, Object[] arr_object1, int[] arr_v, int[] arr_v1, int v, int v1) {
        this.f = arr_object;
        this.g = arr_object1;
        this.h = arr_v;
        this.i = arr_v1;
        this.j = v;
        this.k = v1;
        this.l = a.b(d.s, this.y());
    }

    public int A() {
        return this.n;
    }

    public Collection B() {
        n3.g g0 = this.p;
        if(g0 == null) {
            g0 = new n3.g(this);
            this.p = g0;
        }
        return g0;
    }

    private final int C(Object object0) {
        return object0 == null ? 0 : object0.hashCode() * -1640531527 >>> this.l;
    }

    public final boolean D() {
        return this.r;
    }

    public final e E() {
        return new e(this);
    }

    private final boolean F(Collection collection0) {
        boolean z = false;
        if(collection0.isEmpty()) {
            return false;
        }
        this.s(collection0.size());
        for(Object object0: collection0) {
            if(this.G(((Map.Entry)object0))) {
                z = true;
            }
        }
        return z;
    }

    private final boolean G(Map.Entry map$Entry0) {
        int v = this.j(map$Entry0.getKey());
        Object[] arr_object = this.k();
        if(v >= 0) {
            arr_object[v] = map$Entry0.getValue();
            return true;
        }
        Object object0 = arr_object[-v - 1];
        if(!k.a(map$Entry0.getValue(), object0)) {
            arr_object[-v - 1] = map$Entry0.getValue();
            return true;
        }
        return false;
    }

    private final boolean H(int v) {
        int v1 = this.C(this.f[v]);
        int v2 = this.j;
        while(true) {
            int[] arr_v = this.i;
            if(arr_v[v1] == 0) {
                arr_v[v1] = v + 1;
                this.h[v] = v1;
                return true;
            }
            --v2;
            if(v2 < 0) {
                return false;
            }
            if(v1 == 0) {
                v1 = this.y() - 1;
            }
            else {
                --v1;
            }
        }
    }

    private final void I() {
        ++this.m;
    }

    private final void J(int v) {
        this.I();
        if(this.k > this.size()) {
            this.n(false);
        }
        this.i = new int[v];
        this.l = a.b(d.s, v);
        for(int v1 = 0; v1 < this.k; ++v1) {
            if(!this.H(v1)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    public final boolean K(Map.Entry map$Entry0) {
        k.e(map$Entry0, "entry");
        this.m();
        int v = this.u(map$Entry0.getKey());
        if(v < 0) {
            return false;
        }
        Object[] arr_object = this.g;
        k.b(arr_object);
        if(!k.a(arr_object[v], map$Entry0.getValue())) {
            return false;
        }
        this.L(v);
        return true;
    }

    private final void L(int v) {
        n3.c.f(this.f, v);
        Object[] arr_object = this.g;
        if(arr_object != null) {
            n3.c.f(arr_object, v);
        }
        this.M(this.h[v]);
        this.h[v] = -1;
        this.n = this.size() - 1;
        this.I();
    }

    private final void M(int v) {
        int v1 = D3.d.b(this.j * 2, this.y() / 2);
        int v2 = 0;
        int v3 = v;
        do {
            v = v == 0 ? this.y() - 1 : v - 1;
            ++v2;
            if(v2 > this.j) {
                this.i[v3] = 0;
                return;
            }
            int[] arr_v = this.i;
            int v4 = arr_v[v];
            if(v4 == 0) {
                arr_v[v3] = 0;
                return;
            }
            if(v4 < 0) {
                arr_v[v3] = -1;
                v3 = v;
                v2 = 0;
            }
            else if((this.C(this.f[v4 - 1]) - v & this.y() - 1) >= v2) {
                this.i[v3] = v4;
                this.h[v4 - 1] = v3;
                v3 = v;
                v2 = 0;
            }
            --v1;
        }
        while(v1 >= 0);
        this.i[v3] = -1;
    }

    public final boolean N(Object object0) {
        this.m();
        int v = this.u(object0);
        if(v < 0) {
            return false;
        }
        this.L(v);
        return true;
    }

    public final boolean O(Object object0) {
        this.m();
        int v = this.v(object0);
        if(v < 0) {
            return false;
        }
        this.L(v);
        return true;
    }

    private final boolean P(int v) {
        int v1 = this.w() - this.k;
        int v2 = this.k - this.size();
        return v1 < v && v1 + v2 >= v && v2 >= this.w() / 4;
    }

    public final f Q() {
        return new f(this);
    }

    @Override
    public void clear() {
        this.m();
        int v = this.k - 1;
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                int[] arr_v = this.h;
                int v2 = arr_v[v1];
                if(v2 >= 0) {
                    this.i[v2] = 0;
                    arr_v[v1] = -1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        n3.c.g(this.f, 0, this.k);
        Object[] arr_object = this.g;
        if(arr_object != null) {
            n3.c.g(arr_object, 0, this.k);
        }
        this.n = 0;
        this.k = 0;
        this.I();
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.u(object0) >= 0;
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.v(object0) >= 0;
    }

    @Override
    public final Set entrySet() {
        return this.x();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 == this || object0 instanceof Map && this.q(((Map)object0));
    }

    @Override
    public Object get(Object object0) {
        int v = this.u(object0);
        if(v < 0) {
            return null;
        }
        Object[] arr_object = this.g;
        k.b(arr_object);
        return arr_object[v];
    }

    @Override
    public int hashCode() {
        int v = 0;
        b d$b0 = this.t();
        while(d$b0.hasNext()) {
            v += d$b0.k();
        }
        return v;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public final int j(Object object0) {
        int v;
        this.m();
        while(true) {
            v = this.C(object0);
            int v1 = D3.d.b(this.j * 2, this.y() / 2);
            int v2 = 0;
        label_4:
            int v3 = this.i[v];
            if(v3 <= 0) {
                if(this.k >= this.w()) {
                    this.s(1);
                    continue;
                }
                int v4 = this.k;
                this.k = v4 + 1;
                this.f[v4] = object0;
                this.h[v4] = v;
                this.i[v] = v4 + 1;
                this.n = this.size() + 1;
                this.I();
                if(v2 > this.j) {
                    this.j = v2;
                }
                return v4;
            }
            if(k.a(this.f[v3 - 1], object0)) {
                return -v3;
            }
            ++v2;
            if(v2 <= v1) {
                break;
            }
            this.J(this.y() * 2);
        }
        if(v != 0) {
            --v;
            goto label_4;
        }
        v = this.y() - 1;
        goto label_4;
    }

    private final Object[] k() {
        Object[] arr_object = this.g;
        if(arr_object != null) {
            return arr_object;
        }
        Object[] arr_object1 = n3.c.d(this.w());
        this.g = arr_object1;
        return arr_object1;
    }

    @Override
    public final Set keySet() {
        return this.z();
    }

    public final Map l() {
        this.m();
        this.r = true;
        if(this.size() > 0) {
            return this;
        }
        k.c(d.t, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return d.t;
    }

    public final void m() {
        if(this.r) {
            throw new UnsupportedOperationException();
        }
    }

    private final void n(boolean z) {
        int v2;
        Object[] arr_object = this.g;
        int v1 = 0;
        for(int v = 0; true; ++v) {
            v2 = this.k;
            if(v >= v2) {
                break;
            }
            int[] arr_v = this.h;
            int v3 = arr_v[v];
            if(v3 >= 0) {
                this.f[v1] = this.f[v];
                if(arr_object != null) {
                    arr_object[v1] = arr_object[v];
                }
                if(z) {
                    arr_v[v1] = v3;
                    this.i[v3] = v1 + 1;
                }
                ++v1;
            }
        }
        n3.c.g(this.f, v1, v2);
        if(arr_object != null) {
            n3.c.g(arr_object, v1, this.k);
        }
        this.k = v1;
    }

    public final boolean o(Collection collection0) {
        k.e(collection0, "m");
        for(Object object0: collection0) {
            if(object0 != null) {
                try {
                    if(!this.p(((Map.Entry)object0))) {
                        return false;
                    }
                    continue;
                }
                catch(ClassCastException unused_ex) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean p(Map.Entry map$Entry0) {
        k.e(map$Entry0, "entry");
        int v = this.u(map$Entry0.getKey());
        if(v < 0) {
            return false;
        }
        Object[] arr_object = this.g;
        k.b(arr_object);
        return k.a(arr_object[v], map$Entry0.getValue());
    }

    @Override
    public Object put(Object object0, Object object1) {
        this.m();
        int v = this.j(object0);
        Object[] arr_object = this.k();
        if(v < 0) {
            Object object2 = arr_object[-v - 1];
            arr_object[-v - 1] = object1;
            return object2;
        }
        arr_object[v] = object1;
        return null;
    }

    @Override
    public void putAll(Map map0) {
        k.e(map0, "from");
        this.m();
        this.F(map0.entrySet());
    }

    private final boolean q(Map map0) {
        return this.size() == map0.size() && this.o(map0.entrySet());
    }

    private final void r(int v) {
        if(v < 0) {
            throw new OutOfMemoryError();
        }
        if(v > this.w()) {
            int v1 = m3.c.f.d(this.w(), v);
            this.f = n3.c.e(this.f, v1);
            this.g = this.g == null ? null : n3.c.e(this.g, v1);
            int[] arr_v = Arrays.copyOf(this.h, v1);
            k.d(arr_v, "copyOf(...)");
            this.h = arr_v;
            int v2 = d.s.c(v1);
            if(v2 > this.y()) {
                this.J(v2);
            }
        }
    }

    @Override
    public Object remove(Object object0) {
        this.m();
        int v = this.u(object0);
        if(v < 0) {
            return null;
        }
        Object[] arr_object = this.g;
        k.b(arr_object);
        Object object1 = arr_object[v];
        this.L(v);
        return object1;
    }

    private final void s(int v) {
        if(this.P(v)) {
            this.n(true);
            return;
        }
        this.r(this.k + v);
    }

    @Override
    public final int size() {
        return this.A();
    }

    public final b t() {
        return new b(this);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.size() * 3 + 2);
        stringBuilder0.append("{");
        b d$b0 = this.t();
        for(int v = 0; d$b0.hasNext(); ++v) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            d$b0.j(stringBuilder0);
        }
        stringBuilder0.append("}");
        String s = stringBuilder0.toString();
        k.d(s, "toString(...)");
        return s;
    }

    private final int u(Object object0) {
        int v = this.C(object0);
        int v1 = this.j;
        while(true) {
            int v2 = this.i[v];
            if(v2 == 0) {
                return -1;
            }
            if(v2 > 0 && k.a(this.f[v2 - 1], object0)) {
                return v2 - 1;
            }
            --v1;
            if(v1 < 0) {
                return -1;
            }
            if(v == 0) {
                v = this.y() - 1;
            }
            else {
                --v;
            }
        }
    }

    private final int v(Object object0) {
        int v = this.k;
    alab1:
        while(true) {
            do {
                --v;
                if(v < 0) {
                    break alab1;
                }
                if(this.h[v] < 0) {
                    continue alab1;
                }
                Object[] arr_object = this.g;
                k.b(arr_object);
            }
            while(!k.a(arr_object[v], object0));
            return v;
        }
        return -1;
    }

    @Override
    public final Collection values() {
        return this.B();
    }

    public final int w() {
        return this.f.length;
    }

    private final Object writeReplace() {
        if(!this.r) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        return new i(this);
    }

    public Set x() {
        n3.e e0 = this.q;
        if(e0 == null) {
            e0 = new n3.e(this);
            this.q = e0;
        }
        return e0;
    }

    private final int y() {
        return this.i.length;
    }

    public Set z() {
        n3.f f0 = this.o;
        if(f0 == null) {
            f0 = new n3.f(this);
            this.o = f0;
        }
        return f0;
    }
}

