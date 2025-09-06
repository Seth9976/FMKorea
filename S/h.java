package s;

import r.i;

public class h extends e {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.i.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.h.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.k.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.l.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.m.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.n.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.f.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private int A0;
    private int B0;
    protected float w0;
    protected int x0;
    protected int y0;
    private d z0;

    public h() {
        this.w0 = -1.0f;
        this.x0 = -1;
        this.y0 = -1;
        this.z0 = this.C;
        this.A0 = 0;
        this.B0 = 0;
        this.K.clear();
        this.K.add(this.z0);
        for(int v = 0; v < this.J.length; ++v) {
            this.J[v] = this.z0;
        }
    }

    @Override  // s.e
    public void J0(r.d d0) {
        if(this.G() == null) {
            return;
        }
        int v = d0.x(this.z0);
        if(this.A0 == 1) {
            this.F0(v);
            this.G0(0);
            this.h0(this.G().v());
            this.E0(0);
            return;
        }
        this.F0(0);
        this.G0(v);
        this.E0(this.G().P());
        this.h0(0);
    }

    public int K0() {
        return this.A0;
    }

    public int L0() {
        return this.x0;
    }

    public int M0() {
        return this.y0;
    }

    public float N0() {
        return this.w0;
    }

    public void O0(int v) {
        if(v > -1) {
            this.w0 = -1.0f;
            this.x0 = v;
            this.y0 = -1;
        }
    }

    public void P0(int v) {
        if(v > -1) {
            this.w0 = -1.0f;
            this.x0 = -1;
            this.y0 = v;
        }
    }

    public void Q0(float f) {
        if(f > -1.0f) {
            this.w0 = f;
            this.x0 = -1;
            this.y0 = -1;
        }
    }

    public void R0(int v) {
        if(this.A0 == v) {
            return;
        }
        this.A0 = v;
        this.K.clear();
        this.z0 = this.A0 == 1 ? this.B : this.C;
        this.K.add(this.z0);
        for(int v1 = 0; v1 < this.J.length; ++v1) {
            this.J[v1] = this.z0;
        }
    }

    @Override  // s.e
    public void f(r.d d0) {
        f f0 = (f)this.G();
        if(f0 == null) {
            return;
        }
        d d1 = f0.m(b.g);
        d d2 = f0.m(b.i);
        int v = 1;
        int v1 = this.N == null || this.N.M[0] != s.e.b.g ? 0 : 1;
        if(this.A0 == 0) {
            d1 = f0.m(b.h);
            d2 = f0.m(b.j);
            if(this.N == null || this.N.M[1] != s.e.b.g) {
                v = 0;
            }
            v1 = v;
        }
        if(this.x0 != -1) {
            i i0 = d0.q(this.z0);
            d0.e(i0, d0.q(d1), this.x0, 8);
            if(v1 != 0) {
                d0.h(d0.q(d2), i0, 0, 5);
            }
        }
        else if(this.y0 != -1) {
            i i1 = d0.q(this.z0);
            i i2 = d0.q(d2);
            d0.e(i1, i2, -this.y0, 8);
            if(v1 != 0) {
                d0.h(i1, d0.q(d1), 0, 5);
                d0.h(i2, i1, 0, 5);
            }
        }
        else if(this.w0 != -1.0f) {
            d0.d(r.d.s(d0, d0.q(this.z0), d0.q(d2), this.w0));
        }
    }

    @Override  // s.e
    public boolean g() {
        return true;
    }

    @Override  // s.e
    public d m(b d$b0) {
        switch(a.a[d$b0.ordinal()]) {
            case 1: 
            case 2: {
                if(this.A0 == 1) {
                    return this.z0;
                }
                break;
            }
            case 3: 
            case 4: {
                if(this.A0 == 0) {
                    return this.z0;
                }
                break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return null;
            }
        }
        throw new AssertionError(d$b0.name());
    }
}

