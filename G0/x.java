package g0;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import k0.i;
import k0.j;
import z3.g;
import z3.k;

public final class x implements i, j {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final x a(String s, int v) {
            k.e(s, "query");
            TreeMap treeMap0 = x.o;
            synchronized(treeMap0) {
                Map.Entry map$Entry0 = treeMap0.ceilingEntry(v);
                if(map$Entry0 != null) {
                    treeMap0.remove(map$Entry0.getKey());
                    x x0 = (x)map$Entry0.getValue();
                    x0.j(s, v);
                    k.d(x0, "sqliteQuery");
                    return x0;
                }
            }
            x x1 = new x(v, null);
            x1.j(s, v);
            return x1;
        }

        public final void b() {
            TreeMap treeMap0 = x.o;
            if(treeMap0.size() > 15) {
                int v = treeMap0.size() - 10;
                Iterator iterator0 = treeMap0.descendingKeySet().iterator();
                k.d(iterator0, "queryPool.descendingKeySet().iterator()");
                while(v > 0) {
                    iterator0.next();
                    iterator0.remove();
                    --v;
                }
            }
        }
    }

    private final int f;
    private volatile String g;
    public final long[] h;
    public final double[] i;
    public final String[] j;
    public final byte[][] k;
    private final int[] l;
    private int m;
    public static final a n;
    public static final TreeMap o;

    static {
        x.n = new a(null);
        x.o = new TreeMap();
    }

    private x(int v) {
        this.f = v;
        this.l = new int[v + 1];
        this.h = new long[v + 1];
        this.i = new double[v + 1];
        this.j = new String[v + 1];
        this.k = new byte[v + 1][];
    }

    public x(int v, g g0) {
        this(v);
    }

    @Override  // k0.i
    public void D(int v, byte[] arr_b) {
        k.e(arr_b, "value");
        this.l[v] = 5;
        this.k[v] = arr_b;
    }

    @Override  // k0.i
    public void P(int v) {
        this.l[v] = 1;
    }

    @Override  // k0.j
    public void a(i i0) {
        k.e(i0, "statement");
        int v = this.g();
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                switch(this.l[v1]) {
                    case 1: {
                        i0.P(v1);
                        break;
                    }
                    case 2: {
                        i0.x(v1, this.h[v1]);
                        break;
                    }
                    case 3: {
                        i0.q(v1, this.i[v1]);
                        break;
                    }
                    case 4: {
                        String s = this.j[v1];
                        if(s == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        i0.l(v1, s);
                        break;
                    }
                    case 5: {
                        byte[] arr_b = this.k[v1];
                        if(arr_b == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        i0.D(v1, arr_b);
                        break;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
        }
    }

    @Override  // k0.j
    public String b() {
        String s = this.g;
        if(s == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return s;
    }

    @Override
    public void close() {
    }

    public static final x f(String s, int v) {
        return x.n.a(s, v);
    }

    public int g() {
        return this.m;
    }

    public final void j(String s, int v) {
        k.e(s, "query");
        this.g = s;
        this.m = v;
    }

    @Override  // k0.i
    public void l(int v, String s) {
        k.e(s, "value");
        this.l[v] = 4;
        this.j[v] = s;
    }

    @Override  // k0.i
    public void q(int v, double f) {
        this.l[v] = 3;
        this.i[v] = f;
    }

    public final void release() {
        synchronized(x.o) {
            x.o.put(this.f, this);
            x.n.b();
        }
    }

    @Override  // k0.i
    public void x(int v, long v1) {
        this.l[v] = 2;
        this.h[v] = v1;
    }
}

