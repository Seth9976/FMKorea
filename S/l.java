package s;

import t.b.a;
import t.b.b;

public abstract class l extends j {
    private int A0;
    private int B0;
    private int C0;
    private int D0;
    private int E0;
    private int F0;
    private boolean G0;
    private int H0;
    private int I0;
    protected a J0;
    b K0;
    private int y0;
    private int z0;

    public l() {
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = false;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = new a();
        this.K0 = null;
    }

    public void K0(boolean z) {
        int v = this.C0;
        if(v > 0 || this.D0 > 0) {
            if(z) {
                this.E0 = this.D0;
                this.F0 = v;
                return;
            }
            this.E0 = v;
            this.F0 = this.D0;
        }
    }

    public void L0() {
        for(int v = 0; v < this.x0; ++v) {
            e e0 = this.w0[v];
            if(e0 != null) {
                e0.q0(true);
            }
        }
    }

    public int M0() {
        return this.I0;
    }

    public int N0() {
        return this.H0;
    }

    public int O0() {
        return this.z0;
    }

    public int P0() {
        return this.E0;
    }

    public int Q0() {
        return this.F0;
    }

    public int R0() {
        return this.y0;
    }

    public abstract void S0(int arg1, int arg2, int arg3, int arg4);

    protected void T0(e e0, s.e.b e$b0, int v, s.e.b e$b1, int v1) {
        while(this.K0 == null && this.G() != null) {
            this.K0 = ((f)this.G()).U0();
        }
        this.J0.a = e$b0;
        this.J0.b = e$b1;
        this.J0.c = v;
        this.J0.d = v1;
        this.K0.b(e0, this.J0);
        e0.E0(this.J0.e);
        e0.h0(this.J0.f);
        e0.g0(this.J0.h);
        e0.b0(this.J0.g);
    }

    protected boolean U0() {
        b b$b0 = this.N == null ? null : ((f)this.N).U0();
        if(b$b0 == null) {
            return false;
        }
        for(int v = 0; v < this.x0; ++v) {
            e e0 = this.w0[v];
            if(e0 != null && !(e0 instanceof h)) {
                s.e.b e$b0 = e0.s(0);
                s.e.b e$b1 = e0.s(1);
                s.e.b e$b2 = s.e.b.h;
                if(e$b0 != e$b2 || e0.l == 1 || e$b1 != e$b2 || e0.m == 1) {
                    if(e$b0 == e$b2) {
                        e$b0 = s.e.b.g;
                    }
                    if(e$b1 == e$b2) {
                        e$b1 = s.e.b.g;
                    }
                    this.J0.a = e$b0;
                    this.J0.b = e$b1;
                    this.J0.c = e0.P();
                    this.J0.d = e0.v();
                    b$b0.b(e0, this.J0);
                    e0.E0(this.J0.e);
                    e0.h0(this.J0.f);
                    e0.b0(this.J0.g);
                }
            }
        }
        return true;
    }

    public boolean V0() {
        return this.G0;
    }

    protected void W0(boolean z) {
        this.G0 = z;
    }

    public void X0(int v, int v1) {
        this.H0 = v;
        this.I0 = v1;
    }

    public void Y0(int v) {
        this.A0 = v;
        this.y0 = v;
        this.B0 = v;
        this.z0 = v;
        this.C0 = v;
        this.D0 = v;
    }

    public void Z0(int v) {
        this.z0 = v;
    }

    public void a1(int v) {
        this.D0 = v;
    }

    public void b1(int v) {
        this.A0 = v;
        this.E0 = v;
    }

    @Override  // s.j
    public void c(f f0) {
        this.L0();
    }

    public void c1(int v) {
        this.B0 = v;
        this.F0 = v;
    }

    public void d1(int v) {
        this.C0 = v;
        this.E0 = v;
        this.F0 = v;
    }

    public void e1(int v) {
        this.y0 = v;
    }
}

