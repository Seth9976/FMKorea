package z3;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class a implements Iterator {
    private final Object[] f;
    private int g;

    public a(Object[] arr_object) {
        k.e(arr_object, "array");
        super();
        this.f = arr_object;
    }

    @Override
    public boolean hasNext() {
        return this.g < this.f.length;
    }

    @Override
    public Object next() {
        try {
            int v = this.g;
            this.g = v + 1;
            return this.f[v];
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            --this.g;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException0.getMessage());
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

