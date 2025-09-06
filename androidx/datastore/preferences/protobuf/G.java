package androidx.datastore.preferences.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class g implements Serializable, Iterable {
    static final class b implements Comparator {
        public int a(g g0, g g1) {
            androidx.datastore.preferences.protobuf.g.g g$g0 = g0.o();
            androidx.datastore.preferences.protobuf.g.g g$g1 = g1.o();
            while(g$g0.hasNext() && g$g1.hasNext()) {
                int v = Integer.compare(g.a(g$g0.b()), g.a(g$g1.b()));
                if(v != 0) {
                    return v;
                }
                if(false) {
                    break;
                }
            }
            return Integer.compare(g0.size(), g1.size());
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.a(((g)object0), ((g)object1));
        }
    }

    static abstract class c implements androidx.datastore.preferences.protobuf.g.g {
        public final Byte a() {
            return this.b();
        }

        @Override
        public Object next() {
            return this.a();
        }

        @Override
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static final class d implements f {
        private d() {
        }

        d(a g$a0) {
        }

        @Override  // androidx.datastore.preferences.protobuf.g$f
        public byte[] a(byte[] arr_b, int v, int v1) {
            return Arrays.copyOfRange(arr_b, v, v1 + v);
        }
    }

    static final class e extends i {
        private final int k;
        private final int l;
        private static final long serialVersionUID = 1L;

        e(byte[] arr_b, int v, int v1) {
            super(arr_b);
            g.e(v, v + v1, arr_b.length);
            this.k = v;
            this.l = v1;
        }

        @Override  // androidx.datastore.preferences.protobuf.g$i
        protected int D() {
            return this.k;
        }

        @Override  // androidx.datastore.preferences.protobuf.g$i
        public byte c(int v) {
            g.d(v, this.size());
            return this.j[this.k + v];
        }

        @Override  // androidx.datastore.preferences.protobuf.g$i
        protected void l(byte[] arr_b, int v, int v1, int v2) {
            System.arraycopy(this.j, this.D() + v, arr_b, v1, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.g$i
        byte m(int v) {
            return this.j[this.k + v];
        }

        private void readObject(ObjectInputStream objectInputStream0) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override  // androidx.datastore.preferences.protobuf.g$i
        public int size() {
            return this.l;
        }

        Object writeReplace() {
            return g.z(this.t());
        }
    }

    interface f {
        byte[] a(byte[] arg1, int arg2, int arg3);
    }

    public interface androidx.datastore.preferences.protobuf.g.g extends Iterator {
        byte b();
    }

    static abstract class h extends g {
        @Override
        public Iterator iterator() {
            return super.o();
        }
    }

    static class i extends h {
        protected final byte[] j;
        private static final long serialVersionUID = 1L;

        i(byte[] arr_b) {
            arr_b.getClass();
            this.j = arr_b;
        }

        @Override  // androidx.datastore.preferences.protobuf.g
        final void B(androidx.datastore.preferences.protobuf.f f0) {
            f0.a(this.j, this.D(), this.size());
        }

        final boolean C(g g0, int v, int v1) {
            if(v1 > g0.size()) {
                throw new IllegalArgumentException("Length too large: " + v1 + this.size());
            }
            int v2 = v + v1;
            if(v2 > g0.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + v + ", " + v1 + ", " + g0.size());
            }
            if(g0 instanceof i) {
                byte[] arr_b = this.j;
                byte[] arr_b1 = ((i)g0).j;
                int v3 = this.D();
                int v4 = this.D();
                for(int v5 = ((i)g0).D() + v; v4 < v3 + v1; ++v5) {
                    if(arr_b[v4] != arr_b1[v5]) {
                        return false;
                    }
                    ++v4;
                }
                return true;
            }
            return g0.s(v, v2).equals(this.s(0, v1));
        }

        protected int D() {
            return 0;
        }

        @Override  // androidx.datastore.preferences.protobuf.g
        public byte c(int v) {
            return this.j[v];
        }

        @Override  // androidx.datastore.preferences.protobuf.g
        public final boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(!(object0 instanceof g)) {
                return false;
            }
            if(this.size() != ((g)object0).size()) {
                return false;
            }
            if(this.size() == 0) {
                return true;
            }
            if(object0 instanceof i) {
                int v = this.q();
                int v1 = ((i)object0).q();
                return v == 0 || v1 == 0 || v == v1 ? this.C(((i)object0), 0, this.size()) : false;
            }
            return object0.equals(this);
        }

        @Override  // androidx.datastore.preferences.protobuf.g
        protected void l(byte[] arr_b, int v, int v1, int v2) {
            System.arraycopy(this.j, v, arr_b, v1, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.g
        byte m(int v) {
            return this.j[v];
        }

        @Override  // androidx.datastore.preferences.protobuf.g
        public final boolean n() {
            int v = this.D();
            return q0.n(this.j, v, this.size() + v);
        }

        @Override  // androidx.datastore.preferences.protobuf.g
        protected final int p(int v, int v1, int v2) {
            return y.i(v, this.j, this.D() + v1, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.g
        public final g s(int v, int v1) {
            int v2 = g.e(v, v1, this.size());
            return v2 == 0 ? g.g : new e(this.j, this.D() + v, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.j.length;
        }

        @Override  // androidx.datastore.preferences.protobuf.g
        protected final String x(Charset charset0) {
            return new String(this.j, this.D(), this.size(), charset0);
        }
    }

    static final class j implements f {
        private j() {
        }

        j(a g$a0) {
        }

        @Override  // androidx.datastore.preferences.protobuf.g$f
        public byte[] a(byte[] arr_b, int v, int v1) {
            byte[] arr_b1 = new byte[v1];
            System.arraycopy(arr_b, v, arr_b1, 0, v1);
            return arr_b1;
        }
    }

    private int f;
    public static final g g;
    private static final f h;
    private static final Comparator i;

    static {
        g.g = new i(y.c);
        g.h = new d(null);
        g.i = new b();
    }

    g() {
        this.f = 0;
    }

    static g A(byte[] arr_b, int v, int v1) {
        return new e(arr_b, v, v1);
    }

    abstract void B(androidx.datastore.preferences.protobuf.f arg1);

    static int a(byte b) {
        return b & 0xFF;
    }

    public abstract byte c(int arg1);

    static void d(int v, int v1) {
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException("Index > length: " + v + ", " + v1) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
    }

    static int e(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + v + " < 0");
            }
            throw v1 >= v ? new IndexOutOfBoundsException("End index: " + v1 + " >= " + v2) : new IndexOutOfBoundsException("Beginning index larger than ending index: " + v + ", " + v1);
        }
        return v3;
    }

    @Override
    public abstract boolean equals(Object arg1);

    public static g h(byte[] arr_b) {
        return g.i(arr_b, 0, arr_b.length);
    }

    @Override
    public final int hashCode() {
        int v = this.f;
        if(v == 0) {
            int v1 = this.size();
            v = this.p(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.f = v;
        }
        return v;
    }

    public static g i(byte[] arr_b, int v, int v1) {
        g.e(v, v + v1, arr_b.length);
        return new i(g.h.a(arr_b, v, v1));
    }

    public static g k(String s) {
        return new i(s.getBytes(y.a));
    }

    protected abstract void l(byte[] arg1, int arg2, int arg3, int arg4);

    abstract byte m(int arg1);

    public abstract boolean n();

    public androidx.datastore.preferences.protobuf.g.g o() {
        class a extends c {
            private int f;
            private final int g;
            final g h;

            a() {
                this.f = 0;
                this.g = g0.size();
            }

            @Override  // androidx.datastore.preferences.protobuf.g$g
            public byte b() {
                int v = this.f;
                if(v >= this.g) {
                    throw new NoSuchElementException();
                }
                this.f = v + 1;
                return g.this.m(v);
            }

            @Override
            public boolean hasNext() {
                return this.f < this.g;
            }
        }

        return new a(this);
    }

    protected abstract int p(int arg1, int arg2, int arg3);

    protected final int q() {
        return this.f;
    }

    public abstract g s(int arg1, int arg2);

    public abstract int size();

    public final byte[] t() {
        int v = this.size();
        if(v == 0) {
            return y.c;
        }
        byte[] arr_b = new byte[v];
        this.l(arr_b, 0, 0, v);
        return arr_b;
    }

    @Override
    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
    }

    private static int u(byte b) [...] // Inlined contents

    public final String v(Charset charset0) {
        return this.size() == 0 ? "" : this.x(charset0);
    }

    protected abstract String x(Charset arg1);

    public final String y() {
        return this.v(y.a);
    }

    static g z(byte[] arr_b) {
        return new i(arr_b);
    }
}

