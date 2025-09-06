package com.google.common.collect;

import X1.f;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

class h extends AbstractMap implements Serializable {
    class d extends AbstractSet {
        final h f;

        @Override
        public void clear() {
            h.this.clear();
        }

        @Override
        public boolean contains(Object object0) {
            Map map0 = h.this.x();
            if(map0 != null) {
                return map0.entrySet().contains(object0);
            }
            if(object0 instanceof Map.Entry) {
                Object object1 = ((Map.Entry)object0).getKey();
                int v = h.this.E(object1);
                return v != -1 && f.a(h.this.X(v), ((Map.Entry)object0).getValue());
            }
            return false;
        }

        @Override
        public Iterator iterator() {
            return h.this.z();
        }

        @Override
        public boolean remove(Object object0) {
            Map map0 = h.this.x();
            if(map0 != null) {
                return map0.entrySet().remove(object0);
            }
            if(!(object0 instanceof Map.Entry) || h.this.K()) {
                return false;
            }
            int v = h.this.C();
            int v1 = i.f(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue(), v, h.this.O(), h.this.M(), h.this.N(), h.this.P());
            if(v1 == -1) {
                return false;
            }
            h.this.J(v1, v);
            h.f(h.this);
            h.this.D();
            return true;
        }

        @Override
        public int size() {
            return h.this.size();
        }
    }

    abstract class e implements Iterator {
        int f;
        int g;
        int h;
        final h i;

        private e() {
            this.f = h0.j;
            this.g = h0.A();
            this.h = -1;
        }

        e(a h$a0) {
        }

        private void a() {
            if(h.this.j != this.f) {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object c(int arg1);

        void d() {
            this.f += 0x20;
        }

        @Override
        public boolean hasNext() {
            return this.g >= 0;
        }

        @Override
        public Object next() {
            this.a();
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            this.h = this.g;
            Object object0 = this.c(this.g);
            this.g = h.this.B(this.g);
            return object0;
        }

        @Override
        public void remove() {
            this.a();
            com.google.common.collect.f.c(this.h >= 0);
            this.d();
            Object object0 = h.this.H(this.h);
            h.this.remove(object0);
            --this.g;
            this.h = -1;
        }
    }

    class com.google.common.collect.h.f extends AbstractSet {
        final h f;

        @Override
        public void clear() {
            h.this.clear();
        }

        @Override
        public boolean contains(Object object0) {
            return h.this.containsKey(object0);
        }

        @Override
        public Iterator iterator() {
            return h.this.I();
        }

        @Override
        public boolean remove(Object object0) {
            Map map0 = h.this.x();
            return map0 == null ? h.this.L(object0) != h.o : map0.keySet().remove(object0);
        }

        @Override
        public int size() {
            return h.this.size();
        }
    }

    final class g extends b {
        private final Object f;
        private int g;
        final h h;

        g(int v) {
            this.f = h0.H(v);
            this.g = v;
        }

        private void a() {
            if(this.g == -1 || this.g >= h.this.size()) {
                this.g = h.this.E(this.f);
            }
            else {
                Object object0 = h.this.H(this.g);
                if(!f.a(this.f, object0)) {
                    this.g = h.this.E(this.f);
                }
            }
        }

        @Override  // com.google.common.collect.b
        public Object getKey() {
            return this.f;
        }

        @Override  // com.google.common.collect.b
        public Object getValue() {
            Map map0 = h.this.x();
            if(map0 != null) {
                return D.a(map0.get(this.f));
            }
            this.a();
            return this.g == -1 ? null : h.this.X(this.g);
        }

        @Override
        public Object setValue(Object object0) {
            Map map0 = h.this.x();
            if(map0 != null) {
                return D.a(map0.put(this.f, object0));
            }
            this.a();
            int v = this.g;
            if(v == -1) {
                h.this.put(this.f, object0);
                return null;
            }
            Object object1 = h.this.X(v);
            h.this.W(this.g, object0);
            return object1;
        }
    }

    class com.google.common.collect.h.h extends AbstractCollection {
        final h f;

        @Override
        public void clear() {
            h.this.clear();
        }

        @Override
        public Iterator iterator() {
            return h.this.Y();
        }

        @Override
        public int size() {
            return h.this.size();
        }
    }

    private transient Object f;
    transient int[] g;
    transient Object[] h;
    transient Object[] i;
    private transient int j;
    private transient int k;
    private transient Set l;
    private transient Set m;
    private transient Collection n;
    private static final Object o;

    static {
        h.o = new Object();
    }

    h() {
        this.F(3);
    }

    // 去混淆评级： 低(20)
    int A() {
        return this.isEmpty() ? -1 : 0;
    }

    int B(int v) {
        return v + 1 < this.k ? v + 1 : -1;
    }

    private int C() {
        return (1 << (this.j & 0x1F)) - 1;
    }

    void D() {
        this.j += 0x20;
    }

    private int E(Object object0) {
        if(this.K()) {
            return -1;
        }
        int v = l.c(object0);
        int v1 = this.C();
        int v2 = i.h(this.O(), v & v1);
        if(v2 == 0) {
            return -1;
        }
        do {
            int v3 = this.y(v2 - 1);
            if((v3 & ~v1) == (v & ~v1) && f.a(object0, this.H(v2 - 1))) {
                return v2 - 1;
            }
            v2 = v3 & v1;
        }
        while(v2 != 0);
        return -1;
    }

    void F(int v) {
        X1.h.e(v >= 0, "Expected size must be >= 0");
        this.j = Y1.a.a(v, 1, 0x3FFFFFFF);
    }

    void G(int v, Object object0, Object object1, int v1, int v2) {
        this.T(v, v1 & ~v2);
        this.V(v, object0);
        this.W(v, object1);
    }

    private Object H(int v) {
        return this.N()[v];
    }

    Iterator I() {
        class a extends e {
            final h j;

            a() {
                super(null);
            }

            @Override  // com.google.common.collect.h$e
            Object c(int v) {
                return h.this.H(v);
            }
        }

        Map map0 = this.x();
        return map0 != null ? map0.keySet().iterator() : new a(this);
    }

    void J(int v, int v1) {
        int v5;
        Object object0 = this.O();
        int[] arr_v = this.M();
        Object[] arr_object = this.N();
        Object[] arr_object1 = this.P();
        int v2 = this.size();
        if(v < v2 - 1) {
            Object object1 = arr_object[v2 - 1];
            arr_object[v] = object1;
            arr_object1[v] = arr_object1[v2 - 1];
            arr_object[v2 - 1] = null;
            arr_object1[v2 - 1] = null;
            arr_v[v] = arr_v[v2 - 1];
            arr_v[v2 - 1] = 0;
            int v3 = l.c(object1) & v1;
            int v4 = i.h(object0, v3);
            if(v4 == v2) {
                i.i(object0, v3, v + 1);
                return;
            }
            while(true) {
                v5 = arr_v[v4 - 1];
                int v6 = v5 & v1;
                if(v6 == v2) {
                    break;
                }
                v4 = v6;
            }
            arr_v[v4 - 1] = v5 & ~v1 | v + 1 & v1;
            return;
        }
        arr_object[v] = null;
        arr_object1[v] = null;
        arr_v[v] = 0;
    }

    boolean K() {
        return this.f == null;
    }

    private Object L(Object object0) {
        if(this.K()) {
            return h.o;
        }
        int v = this.C();
        int v1 = i.f(object0, null, v, this.O(), this.M(), this.N(), null);
        if(v1 == -1) {
            return h.o;
        }
        Object object1 = this.X(v1);
        this.J(v1, v);
        --this.k;
        this.D();
        return object1;
    }

    private int[] M() {
        int[] arr_v = this.g;
        Objects.requireNonNull(arr_v);
        return arr_v;
    }

    private Object[] N() {
        Object[] arr_object = this.h;
        Objects.requireNonNull(arr_object);
        return arr_object;
    }

    private Object O() {
        Object object0 = this.f;
        Objects.requireNonNull(object0);
        return object0;
    }

    private Object[] P() {
        Object[] arr_object = this.i;
        Objects.requireNonNull(arr_object);
        return arr_object;
    }

    void Q(int v) {
        this.g = Arrays.copyOf(this.M(), v);
        this.h = Arrays.copyOf(this.N(), v);
        this.i = Arrays.copyOf(this.P(), v);
    }

    private void R(int v) {
        int[] arr_v = this.M();
        if(v > arr_v.length) {
            int v1 = Math.min(0x3FFFFFFF, Math.max(1, arr_v.length >>> 1) + arr_v.length | 1);
            if(v1 != arr_v.length) {
                this.Q(v1);
            }
        }
    }

    private int S(int v, int v1, int v2, int v3) {
        Object object0 = i.a(v1);
        if(v3 != 0) {
            i.i(object0, v2 & v1 - 1, v3 + 1);
        }
        Object object1 = this.O();
        int[] arr_v = this.M();
        for(int v4 = 0; v4 <= v; ++v4) {
            for(int v5 = i.h(object1, v4); v5 != 0; v5 = v6 & v) {
                int v6 = arr_v[v5 - 1];
                int v7 = v6 & ~v | v4;
                int v8 = v7 & v1 - 1;
                int v9 = i.h(object0, v8);
                i.i(object0, v8, v5);
                arr_v[v5 - 1] = v7 & ~(v1 - 1) | v9 & v1 - 1;
            }
        }
        this.f = object0;
        this.U(v1 - 1);
        return v1 - 1;
    }

    private void T(int v, int v1) {
        this.M()[v] = v1;
    }

    private void U(int v) {
        this.j = this.j & 0xFFFFFFE0 | 0x20 - Integer.numberOfLeadingZeros(v) & 0x1F;
    }

    private void V(int v, Object object0) {
        this.N()[v] = object0;
    }

    private void W(int v, Object object0) {
        this.P()[v] = object0;
    }

    private Object X(int v) {
        return this.P()[v];
    }

    Iterator Y() {
        class c extends e {
            final h j;

            c() {
                super(null);
            }

            @Override  // com.google.common.collect.h$e
            Object c(int v) {
                return h.this.X(v);
            }
        }

        Map map0 = this.x();
        return map0 != null ? map0.values().iterator() : new c(this);
    }

    @Override
    public void clear() {
        if(this.K()) {
            return;
        }
        this.D();
        Map map0 = this.x();
        if(map0 != null) {
            this.j = Y1.a.a(this.size(), 3, 0x3FFFFFFF);
            map0.clear();
            this.f = null;
            this.k = 0;
            return;
        }
        Arrays.fill(this.N(), 0, this.k, null);
        Arrays.fill(this.P(), 0, this.k, null);
        i.g(this.O());
        Arrays.fill(this.M(), 0, this.k, 0);
        this.k = 0;
    }

    @Override
    public boolean containsKey(Object object0) {
        Map map0 = this.x();
        return map0 == null ? this.E(object0) != -1 : map0.containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        Map map0 = this.x();
        if(map0 != null) {
            return map0.containsValue(object0);
        }
        for(int v = 0; v < this.k; ++v) {
            if(f.a(object0, this.X(v))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Set entrySet() {
        Set set0 = this.m;
        if(set0 == null) {
            set0 = this.t();
            this.m = set0;
        }
        return set0;
    }

    static int f(h h0) {
        int v = h0.k;
        h0.k = v - 1;
        return v;
    }

    @Override
    public Object get(Object object0) {
        Map map0 = this.x();
        if(map0 != null) {
            return map0.get(object0);
        }
        int v = this.E(object0);
        return v == -1 ? null : this.X(v);
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Set keySet() {
        Set set0 = this.l;
        if(set0 == null) {
            set0 = this.v();
            this.l = set0;
        }
        return set0;
    }

    void o(int v) {
    }

    int p(int v, int v1) [...] // Inlined contents

    @Override
    public Object put(Object object0, Object object1) {
        int v5;
        if(this.K()) {
            this.q();
        }
        Map map0 = this.x();
        if(map0 != null) {
            return map0.put(object0, object1);
        }
        int[] arr_v = this.M();
        Object[] arr_object = this.N();
        Object[] arr_object1 = this.P();
        int v = this.k;
        int v1 = l.c(object0);
        int v2 = this.C();
        int v3 = v1 & v2;
        int v4 = i.h(this.O(), v3);
        if(v4 == 0) {
            if(v + 1 > v2) {
                v5 = this.S(v2, i.e(v2), v1, v);
                goto label_36;
            }
            i.i(this.O(), v3, v + 1);
            v5 = v2;
            goto label_36;
        }
        int v6 = 0;
        while(true) {
            int v7 = arr_v[v4 - 1];
            if((v7 & ~v2) == (v1 & ~v2) && f.a(object0, arr_object[v4 - 1])) {
                Object object2 = arr_object1[v4 - 1];
                arr_object1[v4 - 1] = object1;
                return object2;
            }
            int v8 = v7 & v2;
            ++v6;
            if(v8 == 0) {
                if(v6 >= 9) {
                    return this.r().put(object0, object1);
                }
                if(v + 1 > v2) {
                    v5 = this.S(v2, i.e(v2), v1, v);
                }
                else {
                    arr_v[v4 - 1] = v7 & ~v2 | v + 1 & v2;
                    v5 = v2;
                }
            label_36:
                this.R(v + 1);
                this.G(v, object0, object1, v1, v5);
                this.k = v + 1;
                this.D();
                return null;
            }
            v4 = v8;
        }
    }

    int q() {
        X1.h.n(this.K(), "Arrays already allocated");
        int v = this.j;
        int v1 = i.j(v);
        this.f = i.a(v1);
        this.U(v1 - 1);
        this.g = new int[v];
        this.h = new Object[v];
        this.i = new Object[v];
        return v;
    }

    Map r() {
        Map map0 = this.u(this.C() + 1);
        for(int v = this.A(); v >= 0; v = this.B(v)) {
            map0.put(this.H(v), this.X(v));
        }
        this.f = map0;
        this.g = null;
        this.h = null;
        this.i = null;
        this.D();
        return map0;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        int v = objectInputStream0.readInt();
        if(v < 0) {
            throw new InvalidObjectException("Invalid size: " + v);
        }
        this.F(v);
        for(int v1 = 0; v1 < v; ++v1) {
            this.put(objectInputStream0.readObject(), objectInputStream0.readObject());
        }
    }

    @Override
    public Object remove(Object object0) {
        Map map0 = this.x();
        if(map0 != null) {
            return map0.remove(object0);
        }
        Object object1 = this.L(object0);
        return object1 == h.o ? null : object1;
    }

    public static h s() {
        return new h();
    }

    @Override
    public int size() {
        Map map0 = this.x();
        return map0 == null ? this.k : map0.size();
    }

    Set t() {
        return new d(this);
    }

    Map u(int v) {
        return new LinkedHashMap(v, 1.0f);
    }

    Set v() {
        return new com.google.common.collect.h.f(this);
    }

    @Override
    public Collection values() {
        Collection collection0 = this.n;
        if(collection0 == null) {
            collection0 = this.w();
            this.n = collection0;
        }
        return collection0;
    }

    Collection w() {
        return new com.google.common.collect.h.h(this);
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeInt(this.size());
        Iterator iterator0 = this.z();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            objectOutputStream0.writeObject(((Map.Entry)object0).getKey());
            objectOutputStream0.writeObject(((Map.Entry)object0).getValue());
        }
    }

    // 去混淆评级： 低(20)
    Map x() {
        return this.f instanceof Map ? ((Map)this.f) : null;
    }

    private int y(int v) {
        return this.M()[v];
    }

    Iterator z() {
        class com.google.common.collect.h.b extends e {
            final h j;

            com.google.common.collect.h.b() {
                super(null);
            }

            @Override  // com.google.common.collect.h$e
            Object c(int v) {
                return this.e(v);
            }

            Map.Entry e(int v) {
                return new g(h.this, v);
            }
        }

        Map map0 = this.x();
        return map0 != null ? map0.entrySet().iterator() : new com.google.common.collect.h.b(this);
    }
}

