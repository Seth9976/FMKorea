package androidx.collection;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class a extends g implements Map {
    f m;

    public a() {
    }

    public a(int v) {
        super(v);
    }

    public a(g g0) {
        super(g0);
    }

    @Override
    public Set entrySet() {
        return this.o().l();
    }

    @Override
    public Set keySet() {
        return this.o().m();
    }

    private f o() {
        class androidx.collection.a.a extends f {
            final a d;

            @Override  // androidx.collection.f
            protected void a() {
                a.this.clear();
            }

            @Override  // androidx.collection.f
            protected Object b(int v, int v1) {
                return a.this.g[(v << 1) + v1];
            }

            @Override  // androidx.collection.f
            protected Map c() {
                return a.this;
            }

            @Override  // androidx.collection.f
            protected int d() {
                return a.this.h;
            }

            @Override  // androidx.collection.f
            protected int e(Object object0) {
                return a.this.g(object0);
            }

            @Override  // androidx.collection.f
            protected int f(Object object0) {
                return a.this.i(object0);
            }

            @Override  // androidx.collection.f
            protected void g(Object object0, Object object1) {
                a.this.put(object0, object1);
            }

            @Override  // androidx.collection.f
            protected void h(int v) {
                a.this.l(v);
            }

            @Override  // androidx.collection.f
            protected Object i(int v, Object object0) {
                return a.this.m(v, object0);
            }
        }

        if(this.m == null) {
            this.m = new androidx.collection.a.a(this);
        }
        return this.m;
    }

    public boolean p(Collection collection0) {
        return f.p(this, collection0);
    }

    @Override
    public void putAll(Map map0) {
        this.d(this.h + map0.size());
        for(Object object0: map0.entrySet()) {
            this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @Override
    public Collection values() {
        return this.o().n();
    }
}

