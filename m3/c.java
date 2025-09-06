package m3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import z3.g;
import z3.k;

public abstract class c extends b implements List {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final void a(int v, int v1) {
            if(v < 0 || v >= v1) {
                throw new IndexOutOfBoundsException("index: " + v + ", size: " + v1);
            }
        }

        public final void b(int v, int v1) {
            if(v < 0 || v > v1) {
                throw new IndexOutOfBoundsException("index: " + v + ", size: " + v1);
            }
        }

        public final void c(int v, int v1, int v2) {
            if(v < 0 || v1 > v2) {
                throw new IndexOutOfBoundsException("fromIndex: " + v + ", toIndex: " + v1 + ", size: " + v2);
            }
            if(v > v1) {
                throw new IllegalArgumentException("fromIndex: " + v + " > toIndex: " + v1);
            }
        }

        public final int d(int v, int v1) {
            int v2 = v + (v >> 1) - v1 >= 0 ? v + (v >> 1) : v1;
            if(v2 - 0x7FFFFFF7 > 0) {
                return v1 <= 0x7FFFFFF7 ? 0x7FFFFFF7 : 0x7FFFFFFF;
            }
            return v2;
        }

        public final boolean e(Collection collection0, Collection collection1) {
            k.e(collection0, "c");
            k.e(collection1, "other");
            if(collection0.size() != collection1.size()) {
                return false;
            }
            Iterator iterator0 = collection1.iterator();
            for(Object object0: collection0) {
                Object object1 = iterator0.next();
                if(!k.a(object0, object1)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        public final int f(Collection collection0) {
            k.e(collection0, "c");
            int v = 1;
            for(Object object0: collection0) {
                v = v * 0x1F + (object0 == null ? 0 : object0.hashCode());
            }
            return v;
        }
    }

    class m3.c.b implements Iterator {
        private int f;
        final c g;

        protected final int a() {
            return this.f;
        }

        protected final void c(int v) {
            this.f = v;
        }

        @Override
        public boolean hasNext() {
            return this.f < c.this.size();
        }

        @Override
        public Object next() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int v = this.f;
            this.f = v + 1;
            return c.this.get(v);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    class m3.c.c extends m3.c.b implements ListIterator {
        final c h;

        public m3.c.c(int v) {
            c.f.b(v, c0.size());
            this.c(v);
        }

        @Override
        public void add(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean hasPrevious() {
            return this.a() > 0;
        }

        @Override
        public int nextIndex() {
            return this.a();
        }

        @Override
        public Object previous() {
            if(!this.hasPrevious()) {
                throw new NoSuchElementException();
            }
            this.c(this.a() - 1);
            return c.this.get(this.a());
        }

        @Override
        public int previousIndex() {
            return this.a() - 1;
        }

        @Override
        public void set(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    static final class d extends c implements RandomAccess {
        private final c g;
        private final int h;
        private int i;

        public d(c c0, int v, int v1) {
            k.e(c0, "list");
            super();
            this.g = c0;
            this.h = v;
            c.f.c(v, v1, c0.size());
            this.i = v1 - v;
        }

        @Override  // m3.b
        public int c() {
            return this.i;
        }

        @Override  // m3.c
        public Object get(int v) {
            c.f.a(v, this.i);
            return this.g.get(this.h + v);
        }
    }

    public static final a f;

    static {
        c.f = new a(null);
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof List ? c.f.e(this, ((Collection)object0)) : false;
    }

    @Override
    public abstract Object get(int arg1);

    @Override
    public int hashCode() {
        return c.f.f(this);
    }

    @Override
    public int indexOf(Object object0) {
        int v = 0;
        for(Object object1: this) {
            if(!k.a(object1, object0)) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return new m3.c.b(this);
    }

    @Override
    public int lastIndexOf(Object object0) {
        ListIterator listIterator0 = this.listIterator(this.size());
        while(listIterator0.hasPrevious()) {
            if(k.a(listIterator0.previous(), object0)) {
                return listIterator0.nextIndex();
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return new m3.c.c(this, 0);
    }

    @Override
    public ListIterator listIterator(int v) {
        return new m3.c.c(this, v);
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public List subList(int v, int v1) {
        return new d(this, v, v1);
    }
}

