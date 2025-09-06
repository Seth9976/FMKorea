package n3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import z3.k;

public final class e extends a {
    private final d f;

    public e(d d0) {
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
        return this.h(((Map.Entry)object0));
    }

    @Override
    public boolean addAll(Collection collection0) {
        k.e(collection0, "elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.f.clear();
    }

    @Override
    public boolean containsAll(Collection collection0) {
        k.e(collection0, "elements");
        return this.f.o(collection0);
    }

    @Override  // n3.a
    public boolean d(Map.Entry map$Entry0) {
        k.e(map$Entry0, "element");
        return this.f.p(map$Entry0);
    }

    @Override  // n3.a
    public boolean e(Map.Entry map$Entry0) {
        k.e(map$Entry0, "element");
        return this.f.K(map$Entry0);
    }

    public boolean h(Map.Entry map$Entry0) {
        k.e(map$Entry0, "element");
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        return this.f.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.f.t();
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
}

