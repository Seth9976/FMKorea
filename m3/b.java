package m3;

import java.util.Collection;
import z3.f;
import z3.k;

public abstract class b implements Collection {
    // 检测为 Lambda 实现
    public static CharSequence a(b b0, Object object0) [...]

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int c();

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object object0) {
        if(!this.isEmpty()) {
            for(Object object1: this) {
                if(k.a(object1, object0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
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

    private static final CharSequence d(b b0, Object object0) {
        return object0 == b0 ? "(this Collection)" : String.valueOf(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
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
        return this.c();
    }

    @Override
    public Object[] toArray() {
        return f.a(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        k.e(arr_object, "array");
        return f.b(this, arr_object);
    }

    @Override
    public String toString() {
        return o.w(this, ", ", "[", "]", 0, null, (Object object0) -> b.d(this, object0), 24, null);
    }
}

