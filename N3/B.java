package n3;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import m3.c;
import m3.e;
import m3.i;
import m3.o;
import z3.g;
import z3.k;

public final class b extends e implements Serializable, List, RandomAccess {
    public static final class a extends e implements Serializable, List, RandomAccess {
        static final class n3.b.a.a implements ListIterator {
            private final a f;
            private int g;
            private int h;
            private int i;

            public n3.b.a.a(a b$a0, int v) {
                k.e(b$a0, "list");
                super();
                this.f = b$a0;
                this.g = v;
                this.h = -1;
                this.i = b$a0.modCount;
            }

            private final void a() {
                if(this.f.j.modCount != this.i) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override
            public void add(Object object0) {
                this.a();
                int v = this.g;
                this.g = v + 1;
                this.f.add(v, object0);
                this.h = -1;
                this.i = this.f.modCount;
            }

            @Override
            public boolean hasNext() {
                return this.g < this.f.h;
            }

            @Override
            public boolean hasPrevious() {
                return this.g > 0;
            }

            @Override
            public Object next() {
                this.a();
                if(this.g >= this.f.h) {
                    throw new NoSuchElementException();
                }
                int v = this.g;
                this.g = v + 1;
                this.h = v;
                return this.f.f[this.f.g + this.h];
            }

            @Override
            public int nextIndex() {
                return this.g;
            }

            @Override
            public Object previous() {
                this.a();
                int v = this.g;
                if(v <= 0) {
                    throw new NoSuchElementException();
                }
                this.g = v - 1;
                this.h = v - 1;
                return this.f.f[this.f.g + this.h];
            }

            @Override
            public int previousIndex() {
                return this.g - 1;
            }

            @Override
            public void remove() {
                this.a();
                int v = this.h;
                if(v == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f.remove(v);
                this.g = this.h;
                this.h = -1;
                this.i = this.f.modCount;
            }

            @Override
            public void set(Object object0) {
                this.a();
                int v = this.h;
                if(v == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f.set(v, object0);
            }
        }

        private Object[] f;
        private final int g;
        private int h;
        private final a i;
        private final b j;

        public a(Object[] arr_object, int v, int v1, a b$a0, b b0) {
            k.e(arr_object, "backing");
            k.e(b0, "root");
            super();
            this.f = arr_object;
            this.g = v;
            this.h = v1;
            this.i = b$a0;
            this.j = b0;
            this.modCount = b0.modCount;
        }

        @Override  // m3.e
        public int a() {
            this.n();
            return this.h;
        }

        @Override
        public void add(int v, Object object0) {
            this.o();
            this.n();
            c.f.b(v, this.h);
            this.m(this.g + v, object0);
        }

        @Override
        public boolean add(Object object0) {
            this.o();
            this.n();
            this.m(this.g + this.h, object0);
            return true;
        }

        @Override
        public boolean addAll(int v, Collection collection0) {
            k.e(collection0, "elements");
            this.o();
            this.n();
            c.f.b(v, this.h);
            int v1 = collection0.size();
            this.l(this.g + v, collection0, v1);
            return v1 > 0;
        }

        @Override
        public boolean addAll(Collection collection0) {
            k.e(collection0, "elements");
            this.o();
            this.n();
            int v = collection0.size();
            this.l(this.g + this.h, collection0, v);
            return v > 0;
        }

        @Override  // m3.e
        public Object c(int v) {
            this.o();
            this.n();
            c.f.a(v, this.h);
            return this.t(this.g + v);
        }

        @Override
        public void clear() {
            this.o();
            this.n();
            this.u(this.g, this.h);
        }

        @Override
        public boolean equals(Object object0) {
            this.n();
            return object0 == this || object0 instanceof List && this.p(((List)object0));
        }

        @Override
        public Object get(int v) {
            this.n();
            c.f.a(v, this.h);
            return this.f[this.g + v];
        }

        @Override
        public int hashCode() {
            this.n();
            return n3.c.i(this.f, this.g, this.h);
        }

        @Override
        public int indexOf(Object object0) {
            this.n();
            for(int v = 0; v < this.h; ++v) {
                if(k.a(this.f[this.g + v], object0)) {
                    return v;
                }
            }
            return -1;
        }

        @Override
        public boolean isEmpty() {
            this.n();
            return this.h == 0;
        }

        @Override
        public Iterator iterator() {
            return this.listIterator(0);
        }

        private final void l(int v, Collection collection0, int v1) {
            this.s();
            a b$a0 = this.i;
            if(b$a0 == null) {
                this.j.p(v, collection0, v1);
            }
            else {
                b$a0.l(v, collection0, v1);
            }
            this.f = this.j.f;
            this.h += v1;
        }

        @Override
        public int lastIndexOf(Object object0) {
            this.n();
            for(int v = this.h - 1; v >= 0; --v) {
                if(k.a(this.f[this.g + v], object0)) {
                    return v;
                }
            }
            return -1;
        }

        @Override
        public ListIterator listIterator() {
            return this.listIterator(0);
        }

        @Override
        public ListIterator listIterator(int v) {
            this.n();
            c.f.b(v, this.h);
            return new n3.b.a.a(this, v);
        }

        private final void m(int v, Object object0) {
            this.s();
            a b$a0 = this.i;
            if(b$a0 == null) {
                this.j.q(v, object0);
            }
            else {
                b$a0.m(v, object0);
            }
            this.f = this.j.f;
            ++this.h;
        }

        private final void n() {
            if(this.j.modCount != this.modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void o() {
            if(this.q()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean p(List list0) {
            return n3.c.h(this.f, this.g, this.h, list0);
        }

        private final boolean q() {
            return this.j.h;
        }

        @Override
        public boolean remove(Object object0) {
            this.o();
            this.n();
            int v = this.indexOf(object0);
            if(v >= 0) {
                this.remove(v);
            }
            return v >= 0;
        }

        @Override
        public boolean removeAll(Collection collection0) {
            k.e(collection0, "elements");
            this.o();
            this.n();
            return this.v(this.g, this.h, collection0, false) > 0;
        }

        @Override
        public boolean retainAll(Collection collection0) {
            k.e(collection0, "elements");
            this.o();
            this.n();
            return this.v(this.g, this.h, collection0, true) > 0;
        }

        private final void s() {
            ++this.modCount;
        }

        @Override
        public Object set(int v, Object object0) {
            this.o();
            this.n();
            c.f.a(v, this.h);
            Object[] arr_object = this.f;
            Object object1 = arr_object[this.g + v];
            arr_object[this.g + v] = object0;
            return object1;
        }

        @Override
        public List subList(int v, int v1) {
            c.f.c(v, v1, this.h);
            return new a(this.f, this.g + v, v1 - v, this, this.j);
        }

        private final Object t(int v) {
            this.s();
            Object object0 = this.i == null ? this.j.A(v) : this.i.t(v);
            --this.h;
            return object0;
        }

        @Override
        public Object[] toArray() {
            this.n();
            return i.f(this.f, this.g, this.h + this.g);
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            k.e(arr_object, "array");
            this.n();
            int v = this.h;
            if(arr_object.length < v) {
                Object[] arr_object1 = this.f;
                Class class0 = arr_object.getClass();
                Object[] arr_object2 = Arrays.copyOfRange(arr_object1, this.g, v + this.g, class0);
                k.d(arr_object2, "copyOfRange(...)");
                return arr_object2;
            }
            i.d(this.f, arr_object, 0, this.g, v + this.g);
            return o.f(this.h, arr_object);
        }

        @Override
        public String toString() {
            this.n();
            return n3.c.j(this.f, this.g, this.h, this);
        }

        private final void u(int v, int v1) {
            if(v1 > 0) {
                this.s();
            }
            a b$a0 = this.i;
            if(b$a0 == null) {
                this.j.B(v, v1);
            }
            else {
                b$a0.u(v, v1);
            }
            this.h -= v1;
        }

        private final int v(int v, int v1, Collection collection0, boolean z) {
            int v2 = this.i == null ? this.j.C(v, v1, collection0, z) : this.i.v(v, v1, collection0, z);
            if(v2 > 0) {
                this.s();
            }
            this.h -= v2;
            return v2;
        }

        private final Object writeReplace() {
            if(!this.q()) {
                throw new NotSerializableException("The list cannot be serialized while it is being built.");
            }
            return new h(this, 0);
        }
    }

    static final class n3.b.b {
        private n3.b.b() {
        }

        public n3.b.b(g g0) {
        }
    }

    static final class n3.b.c implements ListIterator {
        private final b f;
        private int g;
        private int h;
        private int i;

        public n3.b.c(b b0, int v) {
            k.e(b0, "list");
            super();
            this.f = b0;
            this.g = v;
            this.h = -1;
            this.i = b0.modCount;
        }

        private final void a() {
            if(this.f.modCount != this.i) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public void add(Object object0) {
            this.a();
            int v = this.g;
            this.g = v + 1;
            this.f.add(v, object0);
            this.h = -1;
            this.i = this.f.modCount;
        }

        @Override
        public boolean hasNext() {
            return this.g < this.f.g;
        }

        @Override
        public boolean hasPrevious() {
            return this.g > 0;
        }

        @Override
        public Object next() {
            this.a();
            if(this.g >= this.f.g) {
                throw new NoSuchElementException();
            }
            int v = this.g;
            this.g = v + 1;
            this.h = v;
            return this.f.f[this.h];
        }

        @Override
        public int nextIndex() {
            return this.g;
        }

        @Override
        public Object previous() {
            this.a();
            int v = this.g;
            if(v <= 0) {
                throw new NoSuchElementException();
            }
            this.g = v - 1;
            this.h = v - 1;
            return this.f.f[this.h];
        }

        @Override
        public int previousIndex() {
            return this.g - 1;
        }

        @Override
        public void remove() {
            this.a();
            int v = this.h;
            if(v == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f.remove(v);
            this.g = this.h;
            this.h = -1;
            this.i = this.f.modCount;
        }

        @Override
        public void set(Object object0) {
            this.a();
            int v = this.h;
            if(v == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f.set(v, object0);
        }
    }

    private Object[] f;
    private int g;
    private boolean h;
    private static final n3.b.b i;
    private static final b j;

    static {
        b.i = new n3.b.b(null);
        b b0 = new b(0);
        b0.h = true;
        b.j = b0;
    }

    public b(int v) {
        this.f = n3.c.d(v);
    }

    public b(int v, int v1, g g0) {
        if((v1 & 1) != 0) {
            v = 10;
        }
        this(v);
    }

    private final Object A(int v) {
        this.z();
        Object[] arr_object = this.f;
        Object object0 = arr_object[v];
        i.d(arr_object, arr_object, v, v + 1, this.g);
        n3.c.f(this.f, this.g - 1);
        --this.g;
        return object0;
    }

    private final void B(int v, int v1) {
        if(v1 > 0) {
            this.z();
        }
        i.d(this.f, this.f, v, v + v1, this.g);
        n3.c.g(this.f, this.g - v1, this.g);
        this.g -= v1;
    }

    private final int C(int v, int v1, Collection collection0, boolean z) {
        int v2 = 0;
        int v3 = 0;
        while(v2 < v1) {
            int v4 = v + v2;
            if(collection0.contains(this.f[v4]) == z) {
                ++v2;
                this.f[v3 + v] = this.f[v4];
                ++v3;
            }
            else {
                ++v2;
            }
        }
        int v5 = v1 - v3;
        i.d(this.f, this.f, v + v3, v1 + v, this.g);
        n3.c.g(this.f, this.g - v5, this.g);
        if(v5 > 0) {
            this.z();
        }
        this.g -= v5;
        return v5;
    }

    @Override  // m3.e
    public int a() {
        return this.g;
    }

    @Override
    public void add(int v, Object object0) {
        this.t();
        c.f.b(v, this.g);
        this.q(v, object0);
    }

    @Override
    public boolean add(Object object0) {
        this.t();
        this.q(this.g, object0);
        return true;
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        k.e(collection0, "elements");
        this.t();
        c.f.b(v, this.g);
        int v1 = collection0.size();
        this.p(v, collection0, v1);
        return v1 > 0;
    }

    @Override
    public boolean addAll(Collection collection0) {
        k.e(collection0, "elements");
        this.t();
        int v = collection0.size();
        this.p(this.g, collection0, v);
        return v > 0;
    }

    @Override  // m3.e
    public Object c(int v) {
        this.t();
        c.f.a(v, this.g);
        return this.A(v);
    }

    @Override
    public void clear() {
        this.t();
        this.B(0, this.g);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 == this || object0 instanceof List && this.u(((List)object0));
    }

    @Override
    public Object get(int v) {
        c.f.a(v, this.g);
        return this.f[v];
    }

    @Override
    public int hashCode() {
        return n3.c.i(this.f, 0, this.g);
    }

    @Override
    public int indexOf(Object object0) {
        for(int v = 0; v < this.g; ++v) {
            if(k.a(this.f[v], object0)) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.g == 0;
    }

    @Override
    public Iterator iterator() {
        return this.listIterator(0);
    }

    @Override
    public int lastIndexOf(Object object0) {
        for(int v = this.g - 1; v >= 0; --v) {
            if(k.a(this.f[v], object0)) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override
    public ListIterator listIterator(int v) {
        c.f.b(v, this.g);
        return new n3.b.c(this, v);
    }

    private final void p(int v, Collection collection0, int v1) {
        this.z();
        this.y(v, v1);
        Iterator iterator0 = collection0.iterator();
        for(int v2 = 0; v2 < v1; ++v2) {
            Object[] arr_object = this.f;
            Object object0 = iterator0.next();
            arr_object[v + v2] = object0;
        }
    }

    private final void q(int v, Object object0) {
        this.z();
        this.y(v, 1);
        this.f[v] = object0;
    }

    @Override
    public boolean remove(Object object0) {
        this.t();
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.remove(v);
        }
        return v >= 0;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        k.e(collection0, "elements");
        this.t();
        return this.C(0, this.g, collection0, false) > 0;
    }

    @Override
    public boolean retainAll(Collection collection0) {
        k.e(collection0, "elements");
        this.t();
        return this.C(0, this.g, collection0, true) > 0;
    }

    public final List s() {
        this.t();
        this.h = true;
        return this.g <= 0 ? b.j : this;
    }

    @Override
    public Object set(int v, Object object0) {
        this.t();
        c.f.a(v, this.g);
        Object[] arr_object = this.f;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        return object1;
    }

    @Override
    public List subList(int v, int v1) {
        c.f.c(v, v1, this.g);
        return new a(this.f, v, v1 - v, null, this);
    }

    private final void t() {
        if(this.h) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Object[] toArray() {
        return i.f(this.f, 0, this.g);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        k.e(arr_object, "array");
        int v = this.g;
        if(arr_object.length < v) {
            Object[] arr_object1 = Arrays.copyOfRange(this.f, 0, v, arr_object.getClass());
            k.d(arr_object1, "copyOfRange(...)");
            return arr_object1;
        }
        i.d(this.f, arr_object, 0, 0, v);
        return o.f(this.g, arr_object);
    }

    @Override
    public String toString() {
        return n3.c.j(this.f, 0, this.g, this);
    }

    private final boolean u(List list0) {
        return n3.c.h(this.f, 0, this.g, list0);
    }

    private final void v(int v) {
        if(v < 0) {
            throw new OutOfMemoryError();
        }
        Object[] arr_object = this.f;
        if(v > arr_object.length) {
            this.f = n3.c.e(this.f, c.f.d(arr_object.length, v));
        }
    }

    private final Object writeReplace() {
        if(!this.h) {
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }
        return new h(this, 0);
    }

    private final void x(int v) {
        this.v(this.g + v);
    }

    private final void y(int v, int v1) {
        this.x(v1);
        i.d(this.f, this.f, v + v1, v, this.g);
        this.g += v1;
    }

    private final void z() {
        ++this.modCount;
    }
}

