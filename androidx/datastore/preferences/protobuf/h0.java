package androidx.datastore.preferences.protobuf;

import androidx.appcompat.app.E;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

abstract class h0 extends AbstractMap {
    class b implements Iterator {
        private int f;
        private Iterator g;
        final h0 h;

        private b() {
            this.f = h00.g.size();
        }

        b(a h0$a0) {
        }

        private Iterator a() {
            if(this.g == null) {
                this.g = h0.this.k.entrySet().iterator();
            }
            return this.g;
        }

        public Map.Entry c() {
            if(this.a().hasNext()) {
                return this.a().next();
            }
            int v = this.f - 1;
            this.f = v;
            return (Map.Entry)h0.this.g.get(v);
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean hasNext() {
            return this.f > 0 && this.f <= h0.this.g.size() || this.a().hasNext();
        }

        @Override
        public Object next() {
            return this.c();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class c extends g {
        final h0 g;

        private c() {
            super(null);
        }

        c(a h0$a0) {
        }

        @Override  // androidx.datastore.preferences.protobuf.h0$g
        public Iterator iterator() {
            return new b(h0.this, null);
        }
    }

    static abstract class d {
        static final class androidx.datastore.preferences.protobuf.h0.d.a implements Iterator {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static final class androidx.datastore.preferences.protobuf.h0.d.b implements Iterable {
            @Override
            public Iterator iterator() {
                return d.a;
            }
        }

        private static final Iterator a;
        private static final Iterable b;

        static {
            d.a = new androidx.datastore.preferences.protobuf.h0.d.a();
            d.b = new androidx.datastore.preferences.protobuf.h0.d.b();
        }

        static Iterable b() {
            return d.b;
        }
    }

    class e implements Comparable, Map.Entry {
        private final Comparable f;
        private Object g;
        final h0 h;

        e(Comparable comparable0, Object object0) {
            this.f = comparable0;
            this.g = object0;
        }

        e(Map.Entry map$Entry0) {
            this(((Comparable)map$Entry0.getKey()), map$Entry0.getValue());
        }

        public int b(e h0$e0) {
            return this.g().compareTo(h0$e0.g());
        }

        @Override
        public int compareTo(Object object0) {
            return this.b(((e)object0));
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(!(object0 instanceof Map.Entry)) {
                return false;
            }
            Object object1 = ((Map.Entry)object0).getKey();
            return this.f(this.f, object1) && this.f(this.g, ((Map.Entry)object0).getValue());
        }

        private boolean f(Object object0, Object object1) {
            return object0 == null ? object1 == null : object0.equals(object1);
        }

        public Comparable g() {
            return this.f;
        }

        @Override
        public Object getKey() {
            return this.g();
        }

        @Override
        public Object getValue() {
            return this.g;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.f == null ? 0 : this.f.hashCode();
            Object object0 = this.g;
            if(object0 != null) {
                v = object0.hashCode();
            }
            return v1 ^ v;
        }

        @Override
        public Object setValue(Object object0) {
            h0.this.h();
            Object object1 = this.g;
            this.g = object0;
            return object1;
        }

        @Override
        public String toString() {
            return this.f + "=" + this.g;
        }
    }

    class f implements Iterator {
        private int f;
        private boolean g;
        private Iterator h;
        final h0 i;

        private f() {
            this.f = -1;
        }

        f(a h0$a0) {
        }

        private Iterator a() {
            if(this.h == null) {
                this.h = h0.this.h.entrySet().iterator();
            }
            return this.h;
        }

        public Map.Entry c() {
            this.g = true;
            int v = this.f + 1;
            this.f = v;
            return v < h0.this.g.size() ? ((Map.Entry)h0.this.g.get(this.f)) : this.a().next();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean hasNext() {
            return this.f + 1 < h0.this.g.size() || !h0.this.h.isEmpty() && this.a().hasNext();
        }

        @Override
        public Object next() {
            return this.c();
        }

        @Override
        public void remove() {
            if(!this.g) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.g = false;
            h0.this.h();
            if(this.f < h0.this.g.size()) {
                int v = this.f;
                this.f = v - 1;
                h0.this.t(v);
                return;
            }
            this.a().remove();
        }
    }

    class g extends AbstractSet {
        final h0 f;

        private g() {
        }

        g(a h0$a0) {
        }

        public boolean a(Map.Entry map$Entry0) {
            if(!this.contains(map$Entry0)) {
                Comparable comparable0 = (Comparable)map$Entry0.getKey();
                Object object0 = map$Entry0.getValue();
                h0.this.s(comparable0, object0);
                return true;
            }
            return false;
        }

        @Override
        public boolean add(Object object0) {
            return this.a(((Map.Entry)object0));
        }

        @Override
        public void clear() {
            h0.this.clear();
        }

        @Override
        public boolean contains(Object object0) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = h0.this.get(object1);
            Object object3 = ((Map.Entry)object0).getValue();
            return object2 == object3 || object2 != null && object2.equals(object3);
        }

        @Override
        public Iterator iterator() {
            return new f(h0.this, null);
        }

        @Override
        public boolean remove(Object object0) {
            if(this.contains(((Map.Entry)object0))) {
                Object object1 = ((Map.Entry)object0).getKey();
                h0.this.remove(object1);
                return true;
            }
            return false;
        }

        @Override
        public int size() {
            return h0.this.size();
        }
    }

    private final int f;
    private List g;
    private Map h;
    private boolean i;
    private volatile g j;
    private Map k;
    private volatile c l;

    private h0(int v) {
        this.f = v;
        this.g = Collections.emptyList();
        this.h = Collections.emptyMap();
        this.k = Collections.emptyMap();
    }

    h0(int v, a h0$a0) {
        this(v);
    }

    @Override
    public void clear() {
        this.h();
        if(!this.g.isEmpty()) {
            this.g.clear();
        }
        if(!this.h.isEmpty()) {
            this.h.clear();
        }
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.g(((Comparable)object0)) >= 0 || this.h.containsKey(((Comparable)object0));
    }

    @Override
    public Set entrySet() {
        if(this.j == null) {
            this.j = new g(this, null);
        }
        return this.j;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h0)) {
            return super.equals(object0);
        }
        int v = this.size();
        if(v != ((h0)object0).size()) {
            return false;
        }
        int v1 = this.l();
        if(v1 != ((h0)object0).l()) {
            return this.entrySet().equals(((h0)object0).entrySet());
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            if(!this.k(v2).equals(((h0)object0).k(v2))) {
                return false;
            }
        }
        return v1 == v ? true : this.h.equals(((h0)object0).h);
    }

    private int g(Comparable comparable0) {
        int v = this.g.size();
        int v1 = v - 1;
        if(v1 >= 0) {
            int v2 = comparable0.compareTo(((e)this.g.get(v1)).g());
            if(v2 > 0) {
                return -(v + 1);
            }
            if(v2 == 0) {
                return v1;
            }
        }
        int v3 = 0;
        while(v3 <= v1) {
            int v4 = (v3 + v1) / 2;
            int v5 = comparable0.compareTo(((e)this.g.get(v4)).g());
            if(v5 < 0) {
                v1 = v4 - 1;
                continue;
            }
            if(v5 > 0) {
                v3 = v4 + 1;
                continue;
            }
            return v4;
        }
        return -(v3 + 1);
    }

    @Override
    public Object get(Object object0) {
        int v = this.g(((Comparable)object0));
        return v < 0 ? this.h.get(((Comparable)object0)) : ((e)this.g.get(v)).getValue();
    }

    private void h() {
        if(this.i) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public int hashCode() {
        int v = this.l();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((e)this.g.get(v1)).hashCode();
        }
        return this.m() <= 0 ? v2 : v2 + this.h.hashCode();
    }

    Set i() {
        if(this.l == null) {
            this.l = new c(this, null);
        }
        return this.l;
    }

    private void j() {
        this.h();
        if(this.g.isEmpty() && !(this.g instanceof ArrayList)) {
            this.g = new ArrayList(this.f);
        }
    }

    public Map.Entry k(int v) {
        return (Map.Entry)this.g.get(v);
    }

    public int l() {
        return this.g.size();
    }

    public int m() {
        return this.h.size();
    }

    public Iterable n() {
        return this.h.isEmpty() ? d.b() : this.h.entrySet();
    }

    private SortedMap o() {
        this.h();
        if(this.h.isEmpty() && !(this.h instanceof TreeMap)) {
            TreeMap treeMap0 = new TreeMap();
            this.h = treeMap0;
            this.k = treeMap0.descendingMap();
        }
        return (SortedMap)this.h;
    }

    public boolean p() {
        return this.i;
    }

    public void q() {
        if(!this.i) {
            this.h = this.h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.h);
            this.k = this.k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.k);
            this.i = true;
        }
    }

    static h0 r(int v) {
        static final class a extends h0 {
            a(int v) {
                super(v, null);
            }

            @Override
            public Object put(Object object0, Object object1) {
                E.a(object0);
                return super.s(null, object1);
            }

            @Override  // androidx.datastore.preferences.protobuf.h0
            public void q() {
                if(!this.p()) {
                    if(this.l() > 0) {
                        E.a(this.k(0).getKey());
                        throw null;
                    }
                    Iterator iterator0 = this.n().iterator();
                    if(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        E.a(((Map.Entry)object0).getKey());
                        throw null;
                    }
                }
                super.q();
            }
        }

        return new a(v);
    }

    @Override
    public Object remove(Object object0) {
        this.h();
        int v = this.g(((Comparable)object0));
        if(v >= 0) {
            return this.t(v);
        }
        return this.h.isEmpty() ? null : this.h.remove(((Comparable)object0));
    }

    public Object s(Comparable comparable0, Object object0) {
        this.h();
        int v = this.g(comparable0);
        if(v >= 0) {
            return ((e)this.g.get(v)).setValue(object0);
        }
        this.j();
        if(-(v + 1) >= this.f) {
            return this.o().put(comparable0, object0);
        }
        int v1 = this.f;
        if(this.g.size() == v1) {
            e h0$e0 = (e)this.g.remove(v1 - 1);
            this.o().put(h0$e0.g(), h0$e0.getValue());
        }
        this.g.add(-(v + 1), new e(this, comparable0, object0));
        return null;
    }

    @Override
    public int size() {
        return this.g.size() + this.h.size();
    }

    private Object t(int v) {
        this.h();
        Object object0 = ((e)this.g.remove(v)).getValue();
        if(!this.h.isEmpty()) {
            Iterator iterator0 = this.o().entrySet().iterator();
            List list0 = this.g;
            Object object1 = iterator0.next();
            list0.add(new e(this, ((Map.Entry)object1)));
            iterator0.remove();
        }
        return object0;
    }
}

