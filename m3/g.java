package m3;

import java.util.Collection;
import java.util.Iterator;
import z3.b;
import z3.f;
import z3.k;

final class g implements Collection {
    private final Object[] f;
    private final boolean g;

    public g(Object[] arr_object, boolean z) {
        k.e(arr_object, "values");
        super();
        this.f = arr_object;
        this.g = z;
    }

    public int a() {
        return this.f.length;
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object object0) {
        return i.k(this.f, object0);
    }

    @Override
    public boolean containsAll(Collection collection0) {
        k.e(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return this.f.length == 0;
    }

    @Override
    public Iterator iterator() {
        return b.a(this.f);
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.a();
    }

    @Override
    public final Object[] toArray() {
        return p.b(this.f, this.g);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        k.e(arr_object, "array");
        return f.b(this, arr_object);
    }
}

