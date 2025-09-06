package n3;

import java.util.Collection;
import java.util.Iterator;
import m3.d;
import z3.k;

public final class g extends d implements Collection {
    private final n3.d f;

    public g(n3.d d0) {
        k.e(d0, "backing");
        super();
        this.f = d0;
    }

    @Override  // m3.d
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
        return this.f.containsValue(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.f.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.f.Q();
    }

    @Override
    public boolean remove(Object object0) {
        return this.f.O(object0);
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

