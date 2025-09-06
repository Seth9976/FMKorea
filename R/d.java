package r;

import java.util.Arrays;
import java.util.HashMap;
import s.e;

public class d {
    interface a {
        void a(a arg1);

        void b(i arg1);

        i c(d arg1, boolean[] arg2);

        void clear();

        i getKey();
    }

    class b extends r.b {
        final d g;

        public b(c c0) {
            this.e = new j(this, c0);
        }
    }

    int a;
    private HashMap b;
    private a c;
    private int d;
    private int e;
    r.b[] f;
    public boolean g;
    public boolean h;
    private boolean[] i;
    int j;
    int k;
    private int l;
    final c m;
    private i[] n;
    private int o;
    private a p;
    private static int q = 1000;
    public static boolean r = true;
    public static long s;
    public static long t;

    static {
    }

    public d() {
        this.a = 0;
        this.b = null;
        this.d = 0x20;
        this.e = 0x20;
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = new boolean[0x20];
        this.j = 1;
        this.k = 0;
        this.l = 0x20;
        this.n = new i[d.q];
        this.o = 0;
        this.f = new r.b[0x20];
        this.C();
        c c0 = new c();
        this.m = c0;
        this.c = new h(c0);
        if(d.r) {
            this.p = new b(this, c0);
            return;
        }
        this.p = new r.b(c0);
    }

    void A(a d$a0) {
        this.u(d$a0);
        this.B(d$a0, false);
        this.n();
    }

    private final int B(a d$a0, boolean z) {
        for(int v = 0; v < this.j; ++v) {
            this.i[v] = false;
        }
        int v1 = 0;
        boolean z1 = false;
        while(!z1) {
            ++v1;
            if(v1 >= this.j * 2) {
                return v1;
            }
            if(d$a0.getKey() != null) {
                boolean[] arr_z = this.i;
                arr_z[d$a0.getKey().c] = true;
            }
            i i0 = d$a0.c(this, this.i);
            if(i0 != null) {
                boolean[] arr_z1 = this.i;
                int v2 = i0.c;
                if(arr_z1[v2]) {
                    return v1;
                }
                arr_z1[v2] = true;
            }
            if(i0 == null) {
                z1 = true;
            }
            else {
                float f = 3.402823E+38f;
                int v4 = -1;
                for(int v3 = 0; v3 < this.k; ++v3) {
                    r.b b0 = this.f[v3];
                    if(b0.a.j != r.i.a.f && !b0.f && b0.t(i0)) {
                        float f1 = b0.e.g(i0);
                        if(f1 < 0.0f) {
                            float f2 = -b0.b / f1;
                            if(f2 < f) {
                                v4 = v3;
                                f = f2;
                            }
                        }
                    }
                }
                if(v4 <= -1) {
                    continue;
                }
                r.b b1 = this.f[v4];
                b1.a.d = -1;
                b1.y(i0);
                b1.a.d = v4;
                b1.a.g(b1);
            }
        }
        return v1;
    }

    private void C() {
        int v = 0;
        if(d.r) {
            while(true) {
                r.b[] arr_b = this.f;
                if(v >= arr_b.length) {
                    break;
                }
                r.b b0 = arr_b[v];
                if(b0 != null) {
                    this.m.a.a(b0);
                }
                this.f[v] = null;
                ++v;
            }
        }
        else {
            while(true) {
                r.b[] arr_b1 = this.f;
                if(v >= arr_b1.length) {
                    break;
                }
                r.b b1 = arr_b1[v];
                if(b1 != null) {
                    this.m.b.a(b1);
                }
                this.f[v] = null;
                ++v;
            }
        }
    }

    public void D() {
        c c0;
        for(int v = 0; true; ++v) {
            c0 = this.m;
            i[] arr_i = c0.d;
            if(v >= arr_i.length) {
                break;
            }
            i i0 = arr_i[v];
            if(i0 != null) {
                i0.d();
            }
        }
        c0.c.c(this.n, this.o);
        this.o = 0;
        Arrays.fill(this.m.d, null);
        HashMap hashMap0 = this.b;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
        this.a = 0;
        this.c.clear();
        this.j = 1;
        for(int v1 = 0; v1 < this.k; ++v1) {
            this.f[v1].c = false;
        }
        this.C();
        this.k = 0;
        if(d.r) {
            this.p = new b(this, this.m);
            return;
        }
        this.p = new r.b(this.m);
    }

    private i a(r.i.a i$a0, String s) {
        i i0 = (i)this.m.c.b();
        if(i0 == null) {
            i0 = new i(i$a0, s);
        }
        else {
            i0.d();
        }
        i0.f(i$a0, s);
        int v = d.q;
        if(this.o >= v) {
            d.q = v * 2;
            this.n = (i[])Arrays.copyOf(this.n, v * 2);
        }
        int v1 = this.o;
        this.o = v1 + 1;
        this.n[v1] = i0;
        return i0;
    }

    public void b(e e0, e e1, float f, int v) {
        i i0 = this.q(e0.m(s.d.b.g));
        i i1 = this.q(e0.m(s.d.b.h));
        i i2 = this.q(e0.m(s.d.b.i));
        i i3 = this.q(e0.m(s.d.b.j));
        i i4 = this.q(e1.m(s.d.b.g));
        i i5 = this.q(e1.m(s.d.b.h));
        i i6 = this.q(e1.m(s.d.b.i));
        i i7 = this.q(e1.m(s.d.b.j));
        r.b b0 = this.r();
        b0.q(i1, i3, i5, i7, ((float)(Math.sin(f) * ((double)v))));
        this.d(b0);
        r.b b1 = this.r();
        b1.q(i0, i2, i4, i6, ((float)(Math.cos(f) * ((double)v))));
        this.d(b1);
    }

    public void c(i i0, i i1, int v, float f, i i2, i i3, int v1, int v2) {
        r.b b0 = this.r();
        b0.h(i0, i1, v, f, i2, i3, v1);
        if(v2 != 8) {
            b0.d(this, v2);
        }
        this.d(b0);
    }

    public void d(r.b b0) {
        int v = 1;
        if(b0 == null) {
            return;
        }
        if(this.k + 1 >= this.l || this.j + 1 >= this.e) {
            this.y();
        }
        int v1 = 0;
        if(!b0.f) {
            b0.D(this);
            if(b0.u()) {
                return;
            }
            b0.r();
            if(b0.f(this)) {
                i i0 = this.p();
                b0.a = i0;
                this.l(b0);
                this.p.a(b0);
                this.B(this.p, true);
                if(i0.d == -1) {
                    if(b0.a == i0) {
                        i i1 = b0.w(i0);
                        if(i1 != null) {
                            b0.y(i1);
                        }
                    }
                    if(!b0.f) {
                        b0.a.g(b0);
                    }
                    --this.k;
                }
            }
            else {
                v = 0;
            }
            if(!b0.s()) {
                return;
            }
            v1 = v;
        }
        if(v1 == 0) {
            this.l(b0);
        }
    }

    public r.b e(i i0, i i1, int v, int v1) {
        if(v1 == 8 && i1.g && i0.d == -1) {
            i0.e(this, i1.f + ((float)v));
            return null;
        }
        r.b b0 = this.r();
        b0.n(i0, i1, v);
        if(v1 != 8) {
            b0.d(this, v1);
        }
        this.d(b0);
        return b0;
    }

    public void f(i i0, int v) {
        int v1 = i0.d;
        if(v1 == -1) {
            i0.e(this, ((float)v));
            return;
        }
        r.b b0 = this.f[v1];
        if(b0.f) {
            b0.b = (float)v;
            return;
        }
        if(b0.e.b() == 0) {
            b0.f = true;
            b0.b = (float)v;
            return;
        }
        r.b b1 = this.r();
        b1.m(i0, v);
        this.d(b1);
    }

    public void g(i i0, i i1, int v, boolean z) {
        r.b b0 = this.r();
        i i2 = this.t();
        i2.e = 0;
        b0.o(i0, i1, i2, v);
        this.d(b0);
    }

    public void h(i i0, i i1, int v, int v1) {
        r.b b0 = this.r();
        i i2 = this.t();
        i2.e = 0;
        b0.o(i0, i1, i2, v);
        if(v1 != 8) {
            this.m(b0, ((int)(b0.e.g(i2) * -1.0f)), v1);
        }
        this.d(b0);
    }

    public void i(i i0, i i1, int v, boolean z) {
        r.b b0 = this.r();
        i i2 = this.t();
        i2.e = 0;
        b0.p(i0, i1, i2, v);
        this.d(b0);
    }

    public void j(i i0, i i1, int v, int v1) {
        r.b b0 = this.r();
        i i2 = this.t();
        i2.e = 0;
        b0.p(i0, i1, i2, v);
        if(v1 != 8) {
            this.m(b0, ((int)(b0.e.g(i2) * -1.0f)), v1);
        }
        this.d(b0);
    }

    public void k(i i0, i i1, i i2, i i3, float f, int v) {
        r.b b0 = this.r();
        b0.k(i0, i1, i2, i3, f);
        if(v != 8) {
            b0.d(this, v);
        }
        this.d(b0);
    }

    private final void l(r.b b0) {
        if(d.r) {
            r.b b1 = this.f[this.k];
            if(b1 != null) {
                this.m.a.a(b1);
            }
        }
        else {
            r.b b2 = this.f[this.k];
            if(b2 != null) {
                this.m.b.a(b2);
            }
        }
        int v = this.k;
        this.f[v] = b0;
        b0.a.d = v;
        this.k = v + 1;
        b0.a.g(b0);
    }

    void m(r.b b0, int v, int v1) {
        b0.e(this.o(v1, null), v);
    }

    private void n() {
        for(int v = 0; v < this.k; ++v) {
            r.b b0 = this.f[v];
            b0.a.f = b0.b;
        }
    }

    public i o(int v, String s) {
        if(this.j + 1 >= this.e) {
            this.y();
        }
        i i0 = this.a(r.i.a.i, s);
        int v1 = this.a + 1;
        this.a = v1;
        ++this.j;
        i0.c = v1;
        i0.e = v;
        this.m.d[v1] = i0;
        this.c.b(i0);
        return i0;
    }

    public i p() {
        if(this.j + 1 >= this.e) {
            this.y();
        }
        i i0 = this.a(r.i.a.h, null);
        int v = this.a + 1;
        this.a = v;
        ++this.j;
        i0.c = v;
        this.m.d[v] = i0;
        return i0;
    }

    public i q(Object object0) {
        i i0 = null;
        if(object0 == null) {
            return null;
        }
        if(this.j + 1 >= this.e) {
            this.y();
        }
        if(object0 instanceof s.d) {
            i0 = ((s.d)object0).f();
            if(i0 == null) {
                ((s.d)object0).m(this.m);
                i0 = ((s.d)object0).f();
            }
            int v = i0.c;
            if(v == -1 || v > this.a || this.m.d[v] == null) {
                if(v != -1) {
                    i0.d();
                }
                int v1 = this.a + 1;
                this.a = v1;
                ++this.j;
                i0.c = v1;
                i0.j = r.i.a.f;
                this.m.d[v1] = i0;
            }
        }
        return i0;
    }

    public r.b r() {
        r.b b0;
        if(d.r) {
            b0 = (r.b)this.m.a.b();
            if(b0 == null) {
                b0 = new b(this, this.m);
                ++d.t;
            }
            else {
                b0.z();
            }
        }
        else {
            b0 = (r.b)this.m.b.b();
            if(b0 == null) {
                b0 = new r.b(this.m);
                ++d.s;
            }
            else {
                b0.z();
            }
        }
        i.b();
        return b0;
    }

    public static r.b s(d d0, i i0, i i1, float f) {
        return d0.r().j(i0, i1, f);
    }

    public i t() {
        if(this.j + 1 >= this.e) {
            this.y();
        }
        i i0 = this.a(r.i.a.h, null);
        int v = this.a + 1;
        this.a = v;
        ++this.j;
        i0.c = v;
        this.m.d[v] = i0;
        return i0;
    }

    private int u(a d$a0) {
        for(int v = 0; v < this.k; ++v) {
            r.b b0 = this.f[v];
            if(b0.a.j != r.i.a.f && b0.b < 0.0f) {
                int v1 = 0;
                boolean z = false;
                while(!z) {
                    ++v1;
                    float f = 3.402823E+38f;
                    int v2 = -1;
                    int v3 = -1;
                    int v5 = 0;
                    for(int v4 = 0; v4 < this.k; ++v4) {
                        r.b b1 = this.f[v4];
                        if(b1.a.j != r.i.a.f && !b1.f && b1.b < 0.0f) {
                            for(int v6 = 1; v6 < this.j; ++v6) {
                                i i0 = this.m.d[v6];
                                float f1 = b1.e.g(i0);
                                if(f1 > 0.0f) {
                                    for(int v7 = 0; v7 < 9; ++v7) {
                                        float f2 = i0.h[v7] / f1;
                                        if(f2 < f && v7 == v5 || v7 > v5) {
                                            f = f2;
                                            v2 = v4;
                                            v3 = v6;
                                            v5 = v7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(v2 == -1) {
                        z = true;
                    }
                    else {
                        r.b b2 = this.f[v2];
                        b2.a.d = -1;
                        b2.y(this.m.d[v3]);
                        b2.a.d = v2;
                        b2.a.g(b2);
                    }
                    if(v1 > this.j / 2) {
                        z = true;
                    }
                }
                return v1;
            }
        }
        return 0;
    }

    public c v() {
        return this.m;
    }

    public static r.e w() {
        return null;
    }

    public int x(Object object0) {
        i i0 = ((s.d)object0).f();
        return i0 == null ? 0 : ((int)(i0.f + 0.5f));
    }

    private void y() {
        int v = this.d * 2;
        this.d = v;
        this.f = (r.b[])Arrays.copyOf(this.f, v);
        this.m.d = (i[])Arrays.copyOf(this.m.d, this.d);
        int v1 = this.d;
        this.i = new boolean[v1];
        this.e = v1;
        this.l = v1;
    }

    public void z() {
        if(!this.g && !this.h) {
            this.A(this.c);
            return;
        }
        for(int v = 0; v < this.k; ++v) {
            if(!this.f[v].f) {
                this.A(this.c);
                return;
            }
        }
        this.n();
    }
}

