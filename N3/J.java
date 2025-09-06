package n3;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m3.f;
import z3.g;
import z3.k;

public final class j extends f implements Serializable, Set {
    static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    private final d f;
    private static final a g;
    private static final j h;

    static {
        j.g = new a(null);
        j.h = new j(d.s.e());
    }

    public j() {
        this(new d());
    }

    public j(int v) {
        this(new d(v));
    }

    public j(d d0) {
        k.e(d0, "backing");
        super();
        this.f = d0;
    }

    @Override  // m3.f
    public int a() {
        return this.f.size();
    }

    @Override
    public boolean add(Object object0) {
        return this.f.j(object0) >= 0;
    }

    @Override
    public boolean addAll(Collection collection0) {
        k.e(collection0, "elements");
        this.f.m();
        return super.addAll(collection0);
    }

    public final Set c() {
        this.f.l();
        return this.size() <= 0 ? j.h : this;
    }

    @Override
    public void clear() {
        this.f.clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.f.containsKey(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.f.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.f.E();
    }

    @Override
    public boolean remove(Object object0) {
        return this.f.N(object0);
    }

    @Override
    public boolean removeAll(Collection collection0) {
        k.e(collection0, "elements");
        this.f.m();
        return super.removeAll(collection0);
    }

    @Override
    public boolean retainAll(Collection collection0) {
        k.e(collection0, "elements");
        this.f.m();
        return super.retainAll(collection0);
    }

    private final Object writeReplace() {
        if(!this.f.D()) {
            throw new NotSerializableException("The set cannot be serialized while it is being built.");
        }
        return new h(this, 1);
    }
}

