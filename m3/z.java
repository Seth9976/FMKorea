package m3;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class z implements ListIterator {
    public static final z f;

    static {
        z.f = new z();
    }

    public Void a() {
        throw new NoSuchElementException();
    }

    @Override
    public void add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void c() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public Object next() {
        return this.a();
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public Object previous() {
        return this.c();
    }

    @Override
    public int previousIndex() {
        return -1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void set(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

