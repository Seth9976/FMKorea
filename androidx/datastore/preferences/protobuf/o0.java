package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class o0 extends AbstractList implements D, RandomAccess {
    private final D f;

    public o0(D d0) {
        this.f = d0;
    }

    @Override  // androidx.datastore.preferences.protobuf.D
    public Object F(int v) {
        return this.f.F(v);
    }

    public String c(int v) {
        return (String)this.f.get(v);
    }

    @Override
    public Object get(int v) {
        return this.c(v);
    }

    @Override
    public Iterator iterator() {
        class b implements Iterator {
            Iterator f;
            final o0 g;

            b() {
                this.f = o00.f.iterator();
            }

            public String a() {
                return this.f.next();
            }

            @Override
            public boolean hasNext() {
                return this.f.hasNext();
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        return new b(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.D
    public void j(g g0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator(int v) {
        class a implements ListIterator {
            ListIterator f;
            final int g;
            final o0 h;

            a(int v) {
                this.g = v;
                super();
                this.f = o00.f.listIterator(v);
            }

            public void a(String s) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void add(Object object0) {
                this.a(((String)object0));
            }

            public String c() {
                return (String)this.f.next();
            }

            public String d() {
                return (String)this.f.previous();
            }

            public void e(String s) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean hasNext() {
                return this.f.hasNext();
            }

            @Override
            public boolean hasPrevious() {
                return this.f.hasPrevious();
            }

            @Override
            public Object next() {
                return this.c();
            }

            @Override
            public int nextIndex() {
                return this.f.nextIndex();
            }

            @Override
            public Object previous() {
                return this.d();
            }

            @Override
            public int previousIndex() {
                return this.f.previousIndex();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void set(Object object0) {
                this.e(((String)object0));
            }
        }

        return new a(this, v);
    }

    @Override  // androidx.datastore.preferences.protobuf.D
    public List r() {
        return this.f.r();
    }

    @Override
    public int size() {
        return this.f.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.D
    public D w() {
        return this;
    }
}

