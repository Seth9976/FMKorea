package s;

import r.d;
import r.i;

public class a extends j {
    private int A0;
    private int y0;
    private boolean z0;

    public a() {
        this.y0 = 0;
        this.z0 = true;
        this.A0 = 0;
    }

    public boolean K0() {
        return this.z0;
    }

    public int L0() {
        return this.y0;
    }

    public int M0() {
        return this.A0;
    }

    protected void N0() {
        for(int v = 0; v < this.x0; ++v) {
            e e0 = this.w0[v];
            int v1 = this.y0;
            if(v1 == 0 || v1 == 1) {
                e0.o0(0, true);
            }
            else if(v1 == 2 || v1 == 3) {
                e0.o0(1, true);
            }
        }
    }

    public void O0(boolean z) {
        this.z0 = z;
    }

    public void P0(int v) {
        this.y0 = v;
    }

    public void Q0(int v) {
        this.A0 = v;
    }

    @Override  // s.e
    public void f(d d0) {
        boolean z;
        s.d[] arr_d1;
        s.d[] arr_d = this.J;
        arr_d[0] = this.B;
        arr_d[2] = this.C;
        arr_d[1] = this.D;
        arr_d[3] = this.E;
        for(int v = 0; true; ++v) {
            arr_d1 = this.J;
            if(v >= arr_d1.length) {
                break;
            }
            s.d d1 = arr_d1[v];
            d1.g = d0.q(d1);
        }
        int v1 = this.y0;
        if(v1 >= 0 && v1 < 4) {
            s.d d2 = arr_d1[v1];
            for(int v2 = 0; true; ++v2) {
                z = false;
                if(v2 >= this.x0) {
                    break;
                }
                e e0 = this.w0[v2];
                if((this.z0 || e0.g()) && ((this.y0 == 0 || this.y0 == 1) && e0.y() == b.h && e0.B.d != null && e0.D.d != null || (this.y0 == 2 || this.y0 == 3) && e0.M() == b.h && e0.C.d != null && e0.E.d != null)) {
                    z = true;
                    break;
                }
            }
            boolean z1 = this.B.i() || this.D.i();
            boolean z2 = this.C.i() || this.E.i();
            int v3 = z || (this.y0 != 0 || !z1) && (this.y0 != 2 || !z2) && (this.y0 != 1 || !z1) && (this.y0 != 3 || !z2) ? 4 : 5;
            for(int v4 = 0; v4 < this.x0; ++v4) {
                e e1 = this.w0[v4];
                if(this.z0 || e1.g()) {
                    i i0 = d0.q(e1.J[this.y0]);
                    int v5 = this.y0;
                    s.d d3 = e1.J[v5];
                    d3.g = i0;
                    int v6 = d3.d == null || d3.d.b != this ? 0 : d3.e;
                    if(v5 == 0 || v5 == 2) {
                        d0.i(d2.g, i0, this.A0 - v6, z);
                    }
                    else {
                        d0.g(d2.g, i0, this.A0 + v6, z);
                    }
                    d0.e(d2.g, i0, this.A0 + v6, v3);
                }
            }
            int v7 = this.y0;
            if(v7 == 0) {
                d0.e(this.D.g, this.B.g, 0, 8);
                d0.e(this.B.g, this.N.D.g, 0, 4);
                d0.e(this.B.g, this.N.B.g, 0, 0);
                return;
            }
            if(v7 == 1) {
                d0.e(this.B.g, this.D.g, 0, 8);
                d0.e(this.B.g, this.N.B.g, 0, 4);
                d0.e(this.B.g, this.N.D.g, 0, 0);
                return;
            }
            if(v7 == 2) {
                d0.e(this.E.g, this.C.g, 0, 8);
                d0.e(this.C.g, this.N.E.g, 0, 4);
                d0.e(this.C.g, this.N.C.g, 0, 0);
                return;
            }
            if(v7 == 3) {
                d0.e(this.C.g, this.E.g, 0, 8);
                d0.e(this.C.g, this.N.C.g, 0, 4);
                d0.e(this.C.g, this.N.E.g, 0, 0);
            }
        }
    }

    @Override  // s.e
    public boolean g() {
        return true;
    }

    @Override  // s.e
    public String toString() {
        String s = "[Barrier] " + this.r() + " {";
        for(int v = 0; v < this.x0; ++v) {
            e e0 = this.w0[v];
            if(v > 0) {
                s = s + ", ";
            }
            s = s + e0.r();
        }
        return s + "}";
    }
}

