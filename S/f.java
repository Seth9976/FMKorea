package s;

import java.util.ArrayList;
import java.util.Arrays;
import r.d;
import t.b;
import t.e;

public class f extends m {
    private boolean A0;
    protected d B0;
    int C0;
    int D0;
    int E0;
    int F0;
    int G0;
    int H0;
    c[] I0;
    c[] J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public int N0;
    public int O0;
    private int P0;
    public boolean Q0;
    private boolean R0;
    private boolean S0;
    int T0;
    b x0;
    public e y0;
    protected t.b.b z0;

    public f() {
        this.x0 = new b(this);
        this.y0 = new e(this);
        this.z0 = null;
        this.A0 = false;
        this.B0 = new d();
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = new c[4];
        this.J0 = new c[4];
        this.K0 = false;
        this.L0 = false;
        this.M0 = false;
        this.N0 = 0;
        this.O0 = 0;
        this.P0 = 0x107;
        this.Q0 = false;
        this.R0 = false;
        this.S0 = false;
        this.T0 = 0;
    }

    @Override  // s.e
    public void I0(boolean z, boolean z1) {
        super.I0(z, z1);
        int v = this.w0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((s.e)this.w0.get(v1)).I0(z, z1);
        }
    }

    @Override  // s.m
    public void K0() {
        int v15;
        boolean z3;
        this.S = 0;
        this.T = 0;
        int v = Math.max(0, this.P());
        int v1 = Math.max(0, this.v());
        this.R0 = false;
        this.S0 = false;
        boolean z = this.d1(0x40) || this.d1(0x80);
        d d0 = this.B0;
        d0.g = false;
        d0.h = false;
        if(this.P0 != 0 && z) {
            d0.h = true;
        }
        s.e.b[] arr_e$b = this.M;
        s.e.b e$b0 = arr_e$b[1];
        s.e.b e$b1 = arr_e$b[0];
        ArrayList arrayList0 = this.w0;
        boolean z1 = this.y() == s.e.b.g || this.M() == s.e.b.g;
        this.e1();
        int v2 = this.w0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            s.e e0 = (s.e)this.w0.get(v3);
            if(e0 instanceof m) {
                ((m)e0).K0();
            }
        }
        int v5 = 0;
        boolean z2 = true;
        for(int v4 = 0; z2; ++v4) {
            try {
                this.B0.D();
                this.e1();
                this.l(this.B0);
                for(int v6 = 0; v6 < v2; ++v6) {
                    ((s.e)this.w0.get(v6)).l(this.B0);
                }
                z2 = this.O0(this.B0);
                if(z2) {
                    this.B0.z();
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
                System.out.println("EXCEPTION : " + exception0);
            }
            if(z2) {
                this.i1(this.B0, k.a);
            }
            else {
                this.J0(this.B0);
                for(int v7 = 0; v7 < v2; ++v7) {
                    ((s.e)this.w0.get(v7)).J0(this.B0);
                }
            }
            if(!z1 || v4 + 1 >= 8 || !k.a[2]) {
                z3 = false;
            }
            else {
                int v9 = 0;
                int v10 = 0;
                for(int v8 = 0; v8 < v2; ++v8) {
                    s.e e1 = (s.e)this.w0.get(v8);
                    v9 = Math.max(v9, e1.S + e1.P());
                    v10 = Math.max(v10, e1.T + e1.v());
                }
                int v11 = Math.max(this.Z, v9);
                int v12 = Math.max(this.a0, v10);
                s.e.b e$b2 = s.e.b.g;
                if(e$b1 != e$b2 || this.P() >= v11) {
                    z3 = false;
                }
                else {
                    this.E0(v11);
                    this.M[0] = e$b2;
                    z3 = true;
                    v5 = 1;
                }
                if(e$b0 == e$b2 && this.v() < v12) {
                    this.h0(v12);
                    this.M[1] = e$b2;
                    z3 = true;
                    v5 = 1;
                }
            }
            int v13 = Math.max(this.Z, this.P());
            if(v13 > this.P()) {
                this.E0(v13);
                this.M[0] = s.e.b.f;
                z3 = true;
                v5 = 1;
            }
            int v14 = Math.max(this.a0, this.v());
            if(v14 > this.v()) {
                this.h0(v14);
                this.M[1] = s.e.b.f;
                z3 = true;
                v15 = 1;
            }
            else {
                v15 = v5;
            }
            if(v15 == 0) {
                s.e.b e$b3 = s.e.b.g;
                if(this.M[0] == e$b3 && v > 0 && this.P() > v) {
                    this.R0 = true;
                    this.M[0] = s.e.b.f;
                    this.E0(v);
                    z3 = true;
                    v15 = 1;
                }
                if(this.M[1] == e$b3 && v1 > 0 && this.v() > v1) {
                    this.S0 = true;
                    this.M[1] = s.e.b.f;
                    this.h0(v1);
                    z2 = true;
                    v5 = 1;
                }
            }
            else {
                z2 = z3;
                v5 = v15;
            }
        }
        this.w0 = arrayList0;
        if(v5 != 0) {
            s.e.b[] arr_e$b1 = this.M;
            arr_e$b1[0] = e$b1;
            arr_e$b1[1] = e$b0;
        }
        this.a0(this.B0.v());
    }

    void N0(s.e e0, int v) {
        if(v == 0) {
            this.P0(e0);
            return;
        }
        if(v == 1) {
            this.Q0(e0);
        }
    }

    public boolean O0(d d0) {
        this.f(d0);
        int v = this.w0.size();
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            s.e e0 = (s.e)this.w0.get(v1);
            e0.o0(0, false);
            e0.o0(1, false);
            if(e0 instanceof a) {
                z = true;
            }
        }
        if(z) {
            for(int v2 = 0; v2 < v; ++v2) {
                s.e e1 = (s.e)this.w0.get(v2);
                if(e1 instanceof a) {
                    ((a)e1).N0();
                }
            }
        }
        for(int v3 = 0; v3 < v; ++v3) {
            s.e e2 = (s.e)this.w0.get(v3);
        }
        for(int v4 = 0; v4 < v; ++v4) {
            s.e e3 = (s.e)this.w0.get(v4);
            if(e3 instanceof f) {
                s.e.b[] arr_e$b = e3.M;
                s.e.b e$b0 = arr_e$b[0];
                s.e.b e$b1 = arr_e$b[1];
                s.e.b e$b2 = s.e.b.g;
                if(e$b0 == e$b2) {
                    e3.l0(s.e.b.f);
                }
                if(e$b1 == e$b2) {
                    e3.A0(s.e.b.f);
                }
                e3.f(d0);
                if(e$b0 == e$b2) {
                    e3.l0(e$b0);
                }
                if(e$b1 == e$b2) {
                    e3.A0(e$b1);
                }
            }
            else {
                k.a(this, d0, e3);
                e3.f(d0);
            }
        }
        if(this.G0 > 0) {
            s.b.a(this, d0, 0);
        }
        if(this.H0 > 0) {
            s.b.a(this, d0, 1);
        }
        return true;
    }

    private void P0(s.e e0) {
        c[] arr_c = this.J0;
        if(this.G0 + 1 >= arr_c.length) {
            this.J0 = (c[])Arrays.copyOf(arr_c, arr_c.length * 2);
        }
        c[] arr_c1 = this.J0;
        int v = this.G0;
        arr_c1[v] = new c(e0, 0, this.a1());
        ++this.G0;
    }

    private void Q0(s.e e0) {
        c[] arr_c = this.I0;
        if(this.H0 + 1 >= arr_c.length) {
            this.I0 = (c[])Arrays.copyOf(arr_c, arr_c.length * 2);
        }
        c[] arr_c1 = this.I0;
        int v = this.H0;
        arr_c1[v] = new c(e0, 1, this.a1());
        ++this.H0;
    }

    public boolean R0(boolean z) {
        return this.y0.f(z);
    }

    public boolean S0(boolean z) {
        return this.y0.g(z);
    }

    public boolean T0(boolean z, int v) {
        return this.y0.h(z, v);
    }

    public t.b.b U0() {
        return this.z0;
    }

    public int V0() {
        return this.P0;
    }

    public boolean W0() [...] // 潜在的解密器

    public void X0() {
        this.y0.j();
    }

    @Override  // s.m
    public void Y() {
        this.B0.D();
        this.C0 = 0;
        this.E0 = 0;
        this.D0 = 0;
        this.F0 = 0;
        this.Q0 = false;
        super.Y();
    }

    public void Y0() {
        this.y0.k();
    }

    public boolean Z0() {
        return this.S0;
    }

    public boolean a1() {
        return this.A0;
    }

    public boolean b1() {
        return this.R0;
    }

    public long c1(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8) {
        this.C0 = v7;
        this.D0 = v8;
        return this.x0.d(this, v, v7, v8, v1, v2, v3, v4, v5, v6);
    }

    public boolean d1(int v) {
        return (this.P0 & v) == v;
    }

    private void e1() {
        this.G0 = 0;
        this.H0 = 0;
    }

    public void f1(t.b.b b$b0) {
        this.z0 = b$b0;
        this.y0.n(b$b0);
    }

    public void g1(int v) {
        this.P0 = v;
        d.r = k.b(v, 0x100);
    }

    public void h1(boolean z) {
        this.A0 = z;
    }

    public void i1(d d0, boolean[] arr_z) {
        arr_z[2] = false;
        this.J0(d0);
        int v1 = this.w0.size();
        for(int v = 0; v < v1; ++v) {
            ((s.e)this.w0.get(v)).J0(d0);
        }
    }

    public void j1() {
        this.x0.e(this);
    }
}

