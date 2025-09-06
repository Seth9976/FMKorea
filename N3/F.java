package n3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import z3.k;

public final class f extends m3.f implements Set {
    private final d f;

    public f(d d0) {
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
        throw new UnsupportedOperationException();
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
}

