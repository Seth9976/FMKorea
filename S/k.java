package s;

import r.d;

public abstract class k {
    static boolean[] a;

    static {
        k.a = new boolean[3];
    }

    static void a(f f0, d d0, e e0) {
        e0.j = -1;
        e0.k = -1;
        b e$b0 = b.g;
        if(f0.M[0] != e$b0 && e0.M[0] == b.i) {
            int v = e0.B.e;
            int v1 = f0.P() - e0.D.e;
            s.d d1 = e0.B;
            d1.g = d0.q(d1);
            s.d d2 = e0.D;
            d2.g = d0.q(d2);
            d0.f(e0.B.g, v);
            d0.f(e0.D.g, v1);
            e0.j = 2;
            e0.k0(v, v1);
        }
        if(f0.M[1] != e$b0 && e0.M[1] == b.i) {
            int v2 = e0.C.e;
            int v3 = f0.v() - e0.E.e;
            s.d d3 = e0.C;
            d3.g = d0.q(d3);
            s.d d4 = e0.E;
            d4.g = d0.q(d4);
            d0.f(e0.C.g, v2);
            d0.f(e0.E.g, v3);
            if(e0.Y > 0 || e0.O() == 8) {
                s.d d5 = e0.F;
                d5.g = d0.q(d5);
                d0.f(e0.F.g, e0.Y + v2);
            }
            e0.k = 2;
            e0.z0(v2, v3);
        }
    }

    public static final boolean b(int v, int v1) {
        return (v & v1) == v1;
    }
}

