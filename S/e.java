package s;

import java.util.ArrayList;
import r.i;
import t.c;
import t.f;
import t.j;
import t.l;
import t.m;

public class e {
    static abstract class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[b.values().length];
            a.b = arr_v;
            try {
                arr_v[b.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.h.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[s.d.b.values().length];
            a.a = arr_v1;
            try {
                arr_v1[s.d.b.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[s.d.b.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[s.d.b.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[s.d.b.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[s.d.b.k.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[s.d.b.l.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[s.d.b.m.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[s.d.b.n.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[s.d.b.f.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT;

    }

    private boolean A;
    public d B;
    public d C;
    public d D;
    public d E;
    d F;
    d G;
    d H;
    d I;
    public d[] J;
    protected ArrayList K;
    private boolean[] L;
    public b[] M;
    public e N;
    int O;
    int P;
    public float Q;
    protected int R;
    protected int S;
    protected int T;
    int U;
    int V;
    protected int W;
    protected int X;
    int Y;
    protected int Z;
    public boolean a;
    protected int a0;
    public m[] b;
    float b0;
    public c c;
    float c0;
    public c d;
    private Object d0;
    public j e;
    private int e0;
    public l f;
    private int f0;
    public boolean[] g;
    private String g0;
    public int[] h;
    private String h0;
    boolean i;
    boolean i0;
    public int j;
    boolean j0;
    public int k;
    boolean k0;
    public int l;
    boolean l0;
    public int m;
    int m0;
    public int[] n;
    int n0;
    public int o;
    boolean o0;
    public int p;
    boolean p0;
    public float q;
    public float[] q0;
    public int r;
    protected e[] r0;
    public int s;
    protected e[] s0;
    public float t;
    e t0;
    int u;
    e u0;
    float v;
    public static float v0 = 0.5f;
    private int[] w;
    private float x;
    private boolean y;
    private boolean z;

    static {
    }

    public e() {
        this.a = false;
        this.b = new m[2];
        this.e = new j(this);
        this.f = new l(this);
        this.g = new boolean[]{true, true};
        this.h = new int[]{0, 0, 0, 0};
        this.i = false;
        this.j = -1;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        this.n = new int[2];
        this.o = 0;
        this.p = 0;
        this.q = 1.0f;
        this.r = 0;
        this.s = 0;
        this.t = 1.0f;
        this.u = -1;
        this.v = 1.0f;
        this.w = new int[]{0x7FFFFFFF, 0x7FFFFFFF};
        this.x = 0.0f;
        this.y = false;
        this.A = false;
        this.B = new d(this, s.d.b.g);
        this.C = new d(this, s.d.b.h);
        this.D = new d(this, s.d.b.i);
        this.E = new d(this, s.d.b.j);
        this.F = new d(this, s.d.b.k);
        this.G = new d(this, s.d.b.m);
        this.H = new d(this, s.d.b.n);
        d d0 = new d(this, s.d.b.l);
        this.I = d0;
        this.J = new d[]{this.B, this.D, this.C, this.E, this.F, d0};
        this.K = new ArrayList();
        this.L = new boolean[2];
        this.M = new b[]{b.f, b.f};
        this.N = null;
        this.O = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.b0 = e.v0;
        this.c0 = e.v0;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = null;
        this.k0 = false;
        this.l0 = false;
        this.m0 = 0;
        this.n0 = 0;
        this.q0 = new float[]{-1.0f, -1.0f};
        this.r0 = new e[]{null, null};
        this.s0 = new e[]{null, null};
        this.t0 = null;
        this.u0 = null;
        this.d();
    }

    public int A(int v) {
        if(v == 0) {
            return this.P();
        }
        return v == 1 ? this.v() : 0;
    }

    public void A0(b e$b0) {
        this.M[1] = e$b0;
    }

    public int B() {
        return this.w[1];
    }

    public void B0(int v, int v1, int v2, float f) {
        this.m = v;
        this.r = v1;
        if(v2 == 0x7FFFFFFF) {
            v2 = 0;
        }
        this.s = v2;
        this.t = f;
        if(f > 0.0f && f < 1.0f && v == 0) {
            this.m = 2;
        }
    }

    public int C() {
        return this.w[0];
    }

    public void C0(float f) {
        this.q0[1] = f;
    }

    public int D() {
        return this.a0;
    }

    public void D0(int v) {
        this.f0 = v;
    }

    public int E() {
        return this.Z;
    }

    public void E0(int v) {
        this.O = v;
        int v1 = this.Z;
        if(v < v1) {
            this.O = v1;
        }
    }

    public e F(int v) {
        if(v == 0) {
            d d0 = this.D.d;
            return d0 == null || d0.d != this.D ? null : d0.b;
        }
        if(v == 1) {
            d d1 = this.E.d;
            return d1 == null || d1.d != this.E ? null : d1.b;
        }
        return null;
    }

    public void F0(int v) {
        this.S = v;
    }

    public e G() {
        return this.N;
    }

    public void G0(int v) {
        this.T = v;
    }

    public e H(int v) {
        if(v == 0) {
            d d0 = this.B.d;
            return d0 == null || d0.d != this.B ? null : d0.b;
        }
        if(v == 1) {
            d d1 = this.C.d;
            return d1 == null || d1.d != this.C ? null : d1.b;
        }
        return null;
    }

    public void H0(boolean z, boolean z1, boolean z2, boolean z3) {
        if(this.u == -1) {
            if(z2 && !z3) {
                this.u = 0;
            }
            else if(!z2 && z3) {
                this.u = 1;
                if(this.R == -1) {
                    this.v = 1.0f / this.v;
                }
            }
        }
        if(this.u == 0 && (!this.C.j() || !this.E.j())) {
            this.u = 1;
        }
        else if(this.u == 1 && (!this.B.j() || !this.D.j())) {
            this.u = 0;
        }
        if(this.u == -1 && (!this.C.j() || !this.E.j() || !this.B.j() || !this.D.j())) {
            if(this.C.j() && this.E.j()) {
                this.u = 0;
            }
            else if(this.B.j() && this.D.j()) {
                this.v = 1.0f / this.v;
                this.u = 1;
            }
        }
        if(this.u == -1) {
            int v = this.o;
            if(v > 0 && this.r == 0) {
                this.u = 0;
                return;
            }
            if(v == 0 && this.r > 0) {
                this.v = 1.0f / this.v;
                this.u = 1;
            }
        }
    }

    public int I() {
        return this.Q() + this.O;
    }

    public void I0(boolean z, boolean z1) {
        int v = z & this.e.k();
        int v1 = z1 & this.f.k();
        int v2 = this.e.h.g;
        int v3 = this.f.h.g;
        int v4 = this.e.i.g;
        int v5 = this.f.i.g;
        if(v4 - v2 < 0 || v5 - v3 < 0 || (v2 == 0x80000000 || v2 == 0x7FFFFFFF) || (v3 == 0x80000000 || v3 == 0x7FFFFFFF) || (v4 == 0x80000000 || v4 == 0x7FFFFFFF) || (v5 == 0x80000000 || v5 == 0x7FFFFFFF)) {
            v4 = 0;
            v2 = 0;
            v5 = 0;
            v3 = 0;
        }
        int v6 = v4 - v2;
        int v7 = v5 - v3;
        if(v != 0) {
            this.S = v2;
        }
        if(v1 != 0) {
            this.T = v3;
        }
        if(this.f0 == 8) {
            this.O = 0;
            this.P = 0;
            return;
        }
        if(v != 0) {
            if(this.M[0] == b.f) {
                int v8 = this.O;
                if(v6 < v8) {
                    v6 = v8;
                }
            }
            this.O = v6;
            int v9 = this.Z;
            if(v6 < v9) {
                this.O = v9;
            }
        }
        if(v1 != 0) {
            if(this.M[1] == b.f) {
                int v10 = this.P;
                if(v7 < v10) {
                    v7 = v10;
                }
            }
            this.P = v7;
            int v11 = this.a0;
            if(v7 < v11) {
                this.P = v11;
            }
        }
    }

    public m J(int v) {
        if(v == 0) {
            return this.e;
        }
        return v == 1 ? this.f : null;
    }

    public void J0(r.d d0) {
        int v = d0.x(this.B);
        int v1 = d0.x(this.C);
        int v2 = d0.x(this.D);
        int v3 = d0.x(this.E);
        j j0 = this.e;
        f f0 = j0.h;
        if(f0.j) {
            f f1 = j0.i;
            if(f1.j) {
                v = f0.g;
                v2 = f1.g;
            }
        }
        l l0 = this.f;
        f f2 = l0.h;
        if(f2.j) {
            f f3 = l0.i;
            if(f3.j) {
                v1 = f2.g;
                v3 = f3.g;
            }
        }
        if(v2 - v < 0 || v3 - v1 < 0 || (v == 0x80000000 || v == 0x7FFFFFFF) || (v1 == 0x80000000 || v1 == 0x7FFFFFFF) || (v2 == 0x80000000 || v2 == 0x7FFFFFFF) || (v3 == 0x80000000 || v3 == 0x7FFFFFFF)) {
            v = 0;
            v3 = 0;
            v1 = 0;
            v2 = 0;
        }
        this.f0(v, v1, v2, v3);
    }

    public float K() {
        return this.c0;
    }

    public int L() {
        return this.n0;
    }

    public b M() {
        return this.M[1];
    }

    public int N() {
        int v = this.B == null ? 0 : this.C.e;
        return this.D == null ? v : v + this.E.e;
    }

    public int O() {
        return this.f0;
    }

    public int P() {
        return this.f0 == 8 ? 0 : this.O;
    }

    public int Q() {
        return this.N == null || !(this.N instanceof s.f) ? this.S : ((s.f)this.N).C0 + this.S;
    }

    public int R() {
        return this.N == null || !(this.N instanceof s.f) ? this.T : ((s.f)this.N).D0 + this.T;
    }

    public boolean S() {
        return this.y;
    }

    public void T(s.d.b d$b0, e e0, s.d.b d$b1, int v, int v1) {
        this.m(d$b0).b(e0.m(d$b1), v, v1, true);
    }

    private boolean U(int v) {
        d[] arr_d = this.J;
        d d0 = arr_d[v * 2];
        if(d0.d != null && d0.d.d != d0) {
            d d1 = arr_d[v * 2 + 1];
            return d1.d != null && d1.d.d == d1;
        }
        return false;
    }

    public boolean V() {
        d d0 = this.B.d;
        if(d0 == null || d0.d != this.B) {
            d d1 = this.D.d;
            return d1 != null && d1.d == this.D;
        }
        return true;
    }

    public boolean W() {
        return this.z;
    }

    public boolean X() {
        d d0 = this.C.d;
        if(d0 == null || d0.d != this.C) {
            d d1 = this.E.d;
            return d1 != null && d1.d == this.E;
        }
        return true;
    }

    public void Y() {
        this.B.l();
        this.C.l();
        this.D.l();
        this.E.l();
        this.F.l();
        this.G.l();
        this.H.l();
        this.I.l();
        this.N = null;
        this.x = 0.0f;
        this.O = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = e.v0;
        this.c0 = e.v0;
        b[] arr_e$b = this.M;
        arr_e$b[0] = b.f;
        arr_e$b[1] = b.f;
        this.d0 = null;
        this.e0 = 0;
        this.f0 = 0;
        this.h0 = null;
        this.i0 = false;
        this.j0 = false;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = false;
        this.p0 = false;
        float[] arr_f = this.q0;
        arr_f[0] = -1.0f;
        arr_f[1] = -1.0f;
        this.j = -1;
        this.k = -1;
        int[] arr_v = this.w;
        arr_v[0] = 0x7FFFFFFF;
        arr_v[1] = 0x7FFFFFFF;
        this.l = 0;
        this.m = 0;
        this.q = 1.0f;
        this.t = 1.0f;
        this.p = 0x7FFFFFFF;
        this.s = 0x7FFFFFFF;
        this.o = 0;
        this.r = 0;
        this.i = false;
        this.u = -1;
        this.v = 1.0f;
        this.k0 = false;
        this.l0 = false;
        boolean[] arr_z = this.g;
        arr_z[0] = true;
        arr_z[1] = true;
        this.A = false;
        boolean[] arr_z1 = this.L;
        arr_z1[0] = false;
        arr_z1[1] = false;
    }

    public void Z() {
        int v = this.K.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((d)this.K.get(v1)).l();
        }
    }

    public void a0(r.c c0) {
        this.B.m(c0);
        this.C.m(c0);
        this.D.m(c0);
        this.E.m(c0);
        this.F.m(c0);
        this.I.m(c0);
        this.G.m(c0);
        this.H.m(c0);
    }

    public void b0(int v) {
        this.Y = v;
        this.y = v > 0;
    }

    public void c0(Object object0) {
        this.d0 = object0;
    }

    private void d() {
        this.K.add(this.B);
        this.K.add(this.C);
        this.K.add(this.D);
        this.K.add(this.E);
        this.K.add(this.G);
        this.K.add(this.H);
        this.K.add(this.I);
        this.K.add(this.F);
    }

    public void d0(String s) {
        this.g0 = s;
    }

    // 去混淆评级： 低(20)
    boolean e() [...] // 潜在的解密器

    public void e0(String s) {
        float f2;
        if(s != null && s.length() != 0) {
            int v = s.length();
            int v1 = s.indexOf(44);
            int v2 = 0;
            int v3 = -1;
            if(v1 > 0 && v1 < v - 1) {
                String s1 = s.substring(0, v1);
                if(!s1.equalsIgnoreCase("W")) {
                    v2 = s1.equalsIgnoreCase("H") ? 1 : -1;
                }
                v3 = v2;
                v2 = v1 + 1;
            }
            int v4 = s.indexOf(58);
            if(v4 < 0 || v4 >= v - 1) {
                String s4 = s.substring(v2);
                if(s4.length() > 0) {
                    try {
                        f2 = Float.parseFloat(s4);
                        goto label_29;
                    label_28:
                        f2 = 0.0f;
                    }
                    catch(NumberFormatException unused_ex) {
                        goto label_28;
                    }
                }
                else {
                    goto label_28;
                }
            }
            else {
                String s2 = s.substring(v2, v4);
                String s3 = s.substring(v4 + 1);
                if(s2.length() <= 0 || s3.length() <= 0) {
                    goto label_28;
                }
                else {
                    try {
                        float f = Float.parseFloat(s2);
                        float f1 = Float.parseFloat(s3);
                        if(f <= 0.0f || f1 <= 0.0f) {
                            goto label_28;
                        }
                        else if(v3 == 1) {
                            f2 = Math.abs(f1 / f);
                        }
                        else {
                            f2 = Math.abs(f / f1);
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                        goto label_28;
                    }
                }
            }
        label_29:
            if(f2 > 0.0f) {
                this.Q = f2;
                this.R = v3;
            }
            return;
        }
        this.Q = 0.0f;
    }

    public void f(r.d d0) {
        int v13;
        int v12;
        boolean z16;
        b e$b4;
        boolean z15;
        boolean z14;
        boolean z8;
        int v10;
        int v9;
        int v8;
        int v7;
        boolean z7;
        boolean z6;
        boolean z5;
        boolean z4;
        boolean z3;
        boolean z2;
        i i0 = d0.q(this.B);
        i i1 = d0.q(this.D);
        i i2 = d0.q(this.C);
        i i3 = d0.q(this.E);
        i i4 = d0.q(this.F);
        f f0 = this.e.h;
        if(f0.j && this.e.i.j && (this.f.h.j && this.f.i.j)) {
            d0.f(i0, f0.g);
            d0.f(i1, this.e.i.g);
            d0.f(i2, this.f.h.g);
            d0.f(i3, this.f.i.g);
            d0.f(i4, this.f.k.g);
            e e0 = this.N;
            if(e0 != null) {
                boolean z = e0.M[0] == b.g;
                boolean z1 = e0 != null && e0.M[1] == b.g;
                if(z && this.g[0] && !this.V()) {
                    d0.h(d0.q(this.N.D), i1, 0, 8);
                }
                if(z1 && this.g[1] && !this.X()) {
                    d0.h(d0.q(this.N.E), i3, 0, 8);
                }
            }
            return;
        }
        e e1 = this.N;
        if(e1 == null) {
            z3 = false;
            z2 = false;
            z7 = false;
            z6 = false;
        }
        else {
            z2 = e1.M[0] == b.g;
            z3 = e1 != null && e1.M[1] == b.g;
            if(this.U(0)) {
                ((s.f)this.N).N0(this, 0);
                z4 = true;
            }
            else {
                z4 = this.V();
            }
            if(this.U(1)) {
                ((s.f)this.N).N0(this, 1);
                z5 = true;
            }
            else {
                z5 = this.X();
            }
            if(!z4 && z2 && this.f0 != 8 && this.B.d == null && this.D.d == null) {
                d0.h(d0.q(this.N.D), i1, 0, 1);
            }
            if(!z5 && z3 && this.f0 != 8 && this.C.d == null && this.E.d == null && this.F == null) {
                d0.h(d0.q(this.N.E), i3, 0, 1);
            }
            z6 = z4;
            z7 = z5;
        }
        int v = this.O;
        int v1 = v < this.Z ? this.Z : v;
        int v2 = this.P;
        int v3 = v2 < this.a0 ? this.a0 : v2;
        b[] arr_e$b = this.M;
        b e$b0 = arr_e$b[0];
        b e$b1 = b.h;
        b e$b2 = arr_e$b[1];
        int v4 = this.R;
        this.u = v4;
        float f1 = this.Q;
        this.v = f1;
        int v5 = this.l;
        int v6 = this.m;
        if(Float.compare(f1, 0.0f) <= 0 || this.f0 == 8) {
            v9 = v6;
            v8 = v5;
            v7 = v1;
            v10 = v3;
            z8 = false;
        }
        else {
            if(e$b0 == e$b1 && v5 == 0) {
                v5 = 3;
            }
            if(e$b2 == e$b1 && v6 == 0) {
                v6 = 3;
            }
            if(e$b0 == e$b1 && e$b2 == e$b1 && v5 == 3 && v6 == 3) {
                this.H0(z2, z3, e$b0 != e$b1, e$b2 != e$b1);
                goto label_97;
            }
            else if(e$b0 == e$b1 && v5 == 3) {
                this.u = 0;
                v7 = (int)(f1 * ((float)v2));
                if(e$b2 == e$b1) {
                    v9 = v6;
                    v8 = 3;
                    v10 = v3;
                    z8 = true;
                }
                else {
                    v8 = 4;
                    v9 = v6;
                    v10 = v3;
                    z8 = false;
                }
            }
            else if(e$b2 != e$b1 || v6 != 3) {
            label_97:
                v9 = v6;
                v8 = v5;
                v7 = v1;
                v10 = v3;
                z8 = true;
            }
            else {
                this.u = 1;
                if(v4 == -1) {
                    this.v = 1.0f / f1;
                }
                int v11 = (int)(this.v * ((float)v));
                if(e$b0 == e$b1) {
                    v10 = v11;
                    v9 = 3;
                    v8 = v5;
                    v7 = v1;
                    z8 = true;
                }
                else {
                    v9 = 4;
                    v10 = v11;
                    v8 = v5;
                    v7 = v1;
                    z8 = false;
                }
            }
        }
        int[] arr_v = this.n;
        arr_v[0] = v8;
        arr_v[1] = v9;
        this.i = z8;
        boolean z9 = z8 && (this.u == -1 || this.u == 0);
        b e$b3 = b.g;
        boolean z10 = this.M[0] == e$b3 && this instanceof s.f;
        boolean z11 = this.I.j();
        boolean[] arr_z = this.L;
        boolean z12 = arr_z[0];
        boolean z13 = arr_z[1];
        i i5 = null;
        if(this.j == 2) {
            z14 = z3;
            e$b4 = e$b3;
            z16 = z8;
            z15 = z2;
        }
        else {
            f f2 = this.e.h;
            if(!f2.j || !this.e.i.j) {
                i i6 = this.N == null ? null : d0.q(this.N.D);
                i i7 = this.N == null ? null : d0.q(this.N.B);
                z15 = z2;
                z14 = z3;
                e$b4 = e$b3;
                z16 = z8;
                this.h(d0, true, z15, z14, this.g[0], i7, i6, this.M[0], z10, this.B, this.D, this.S, (z10 ? 0 : v7), this.Z, this.w[0], this.b0, z9, z6, z7, z12, v8, v9, this.o, this.p, this.q, !z11);
            }
            else {
                d0.f(i0, f2.g);
                d0.f(i1, this.e.i.g);
                if(this.N != null && z2 && this.g[0] && !this.V()) {
                    d0.h(d0.q(this.N.D), i1, 0, 8);
                }
                z14 = z3;
                z15 = z2;
                e$b4 = e$b3;
                z16 = z8;
            }
        }
        f f3 = this.f.h;
        if(!f3.j || !this.f.i.j) {
            v12 = 1;
        }
        else {
            d0.f(i2, f3.g);
            d0.f(i3, this.f.i.g);
            d0.f(i4, this.f.k.g);
            e e2 = this.N;
            if(e2 != null && !z7 && z14 && this.g[1]) {
                d0.h(d0.q(e2.E), i3, 0, 8);
            }
            v12 = 0;
        }
        if((this.k == 2 ? 0 : v12) != 0) {
            boolean z17 = this.M[1] == e$b4 && this instanceof s.f;
            if(z17) {
                v10 = 0;
            }
            boolean z18 = z16 && (this.u == -1 || this.u == 1);
            i i8 = this.N == null ? null : d0.q(this.N.E);
            e e3 = this.N;
            if(e3 != null) {
                i5 = d0.q(e3.C);
            }
            if(this.Y <= 0 && this.f0 != 8) {
                v13 = !z11;
            }
            else {
                d0.e(i4, i2, this.n(), 8);
                d d1 = this.F.d;
                if(d1 == null) {
                    if(this.f0 == 8) {
                        d0.e(i4, i2, 0, 8);
                    }
                    v13 = !z11;
                }
                else {
                    d0.e(i4, d0.q(d1), 0, 8);
                    if(z14) {
                        d0.h(i8, d0.q(this.E), 0, 5);
                    }
                    v13 = 0;
                }
            }
            this.h(d0, false, z14, z15, this.g[1], i5, i8, this.M[1], z17, this.C, this.E, this.T, v10, this.a0, this.w[1], this.c0, z18, z7, z6, z13, v9, v8, this.r, this.s, this.t, ((boolean)v13));
        }
        if(z16) {
            if(this.u == 1) {
                d0.k(i3, i2, i1, i0, this.v, 8);
            }
            else {
                d0.k(i1, i0, i3, i2, this.v, 8);
            }
        }
        if(this.I.j()) {
            d0.b(this, this.I.g().e(), ((float)Math.toRadians(this.x + 90.0f)), this.I.c());
        }
    }

    public void f0(int v, int v1, int v2, int v3) {
        int v4 = v2 - v;
        int v5 = v3 - v1;
        this.S = v;
        this.T = v1;
        if(this.f0 == 8) {
            this.O = 0;
            this.P = 0;
            return;
        }
        b[] arr_e$b = this.M;
        b e$b0 = b.f;
        if(arr_e$b[0] == e$b0) {
            int v6 = this.O;
            if(v4 < v6) {
                v4 = v6;
            }
        }
        if(arr_e$b[1] == e$b0) {
            int v7 = this.P;
            if(v5 < v7) {
                v5 = v7;
            }
        }
        this.O = v4;
        this.P = v5;
        int v8 = this.a0;
        if(v5 < v8) {
            this.P = v8;
        }
        int v9 = this.Z;
        if(v4 < v9) {
            this.O = v9;
        }
    }

    public boolean g() {
        return this.f0 != 8;
    }

    public void g0(boolean z) {
        this.y = z;
    }

    private void h(r.d d0, boolean z, boolean z1, boolean z2, boolean z3, i i0, i i1, b e$b0, boolean z4, d d1, d d2, int v, int v1, int v2, int v3, float f, boolean z5, boolean z6, boolean z7, boolean z8, int v4, int v5, int v6, int v7, float f1, boolean z9) {
        int v39;
        int v38;
        int v37;
        int v36;
        int v35;
        e e6;
        e e5;
        e e4;
        int v34;
        e e3;
        int v33;
        int v32;
        int v31;
        int v30;
        int v29;
        int v28;
        int v27;
        int v26;
        int v25;
        boolean z13;
        int v24;
        int v23;
        int v22;
        int v20;
        int v19;
        i i7;
        i i6;
        int v18;
        boolean z12;
        int v16;
        int v15;
        int v14;
        int v13;
        int v12;
        int v11;
        i i2 = d0.q(d1);
        i i3 = d0.q(d2);
        i i4 = d0.q(d1.g());
        i i5 = d0.q(d2.g());
        int v8 = d1.j();
        boolean z10 = d2.j();
        boolean z11 = this.I.j();
        int v9 = z10 ? v8 + 1 : v8;
        if(z11) {
            ++v9;
        }
        int v10 = z5 ? 3 : v4;
        if(a.b[e$b0.ordinal()] == 4) {
            v11 = v10;
            v12 = v11 == 4 ? 0 : 1;
        }
        else {
            v11 = v10;
            v12 = 0;
        }
        if(this.f0 == 8) {
            v13 = 0;
            v12 = 0;
        }
        else {
            v13 = v1;
        }
        if(z9) {
            if(v8 == 0 && !z10 && !z11) {
                d0.f(i2, v);
            }
            else if(v8 != 0 && !z10) {
                d0.e(i2, i4, d1.c(), 8);
            }
        }
        if(v12 == 0) {
            if(z4) {
                d0.e(i3, i2, 0, 3);
                if(v2 > 0) {
                    d0.h(i3, i2, v2, 8);
                }
                if(v3 < 0x7FFFFFFF) {
                    d0.j(i3, i2, v3, 8);
                }
            }
            else {
                d0.e(i3, i2, v13, 8);
            }
            v14 = v6;
            v15 = v7;
            v16 = 0;
            z12 = z3;
            v18 = v9;
        }
        else if(v9 == 2 || z5 || v11 != 0 && v11 != 1) {
            int v17 = v6 == -2 ? v13 : v6;
            v15 = v7 == -2 ? v13 : v7;
            if(v13 > 0 && v11 != 1) {
                v13 = 0;
            }
            if(v17 > 0) {
                d0.h(i3, i2, v17, 8);
                v13 = Math.max(v13, v17);
            }
            if(v15 > 0) {
                if(!z1 || v11 != 1) {
                    d0.j(i3, i2, v15, 8);
                }
                v13 = Math.min(v13, v15);
            }
            if(v11 == 1) {
                if(z1) {
                    d0.e(i3, i2, v13, 8);
                }
                else {
                    if(!z6) {
                    }
                    d0.e(i3, i2, v13, 5);
                    d0.j(i3, i2, v13, 8);
                }
                v14 = v17;
                v16 = v12;
                z12 = z3;
                v18 = v9;
            }
            else if(v11 == 2) {
                s.d.b d$b0 = s.d.b.h;
                if(d1.h() == d$b0 || d1.h() == s.d.b.j) {
                    i6 = d0.q(this.N.m(d$b0));
                    i7 = d0.q(this.N.m(s.d.b.j));
                }
                else {
                    i6 = d0.q(this.N.m(s.d.b.g));
                    i7 = d0.q(this.N.m(s.d.b.i));
                }
                v18 = v9;
                d0.d(d0.r().k(i3, i2, i7, i6, f1));
                z12 = z3;
                v14 = v17;
                v16 = 0;
            }
            else {
                v18 = v9;
                v14 = v17;
                v16 = v12;
                z12 = true;
            }
        }
        else {
            d0.e(i3, i2, (v7 <= 0 ? Math.max(v6, v13) : Math.min(v7, Math.max(v6, v13))), 8);
            z12 = z3;
            v14 = v6;
            v15 = v7;
            v16 = 0;
            v18 = v9;
        }
        if(z9) {
            if(z6) {
                v19 = v18;
                v20 = 1;
                goto label_287;
            }
            if((v8 != 0 || z10 || z11) && (v8 == 0 || z10)) {
                if(v8 == 0 && z10) {
                    d0.e(i3, i5, -d2.c(), 8);
                    if(z1) {
                        d0.h(i2, i0, 0, 5);
                    }
                }
                else if(v8 != 0 && z10) {
                    e e0 = d1.d.b;
                    e e1 = d2.d.b;
                    e e2 = this.G();
                    int v21 = 6;
                    if(v16 == 0) {
                        v28 = 1;
                        v27 = 1;
                        v26 = 6;
                        v29 = 4;
                        z13 = false;
                        v25 = 5;
                    }
                    else if(v11 == 0) {
                        if(v15 != 0 || v14 != 0) {
                            z13 = false;
                            v23 = 5;
                            v24 = 5;
                            v22 = 1;
                        }
                        else {
                            v22 = 0;
                            v23 = 8;
                            v24 = 8;
                            z13 = true;
                        }
                        if(e0 instanceof s.a || e1 instanceof s.a) {
                            v25 = v23;
                            v26 = 6;
                            v27 = v22;
                            v28 = 0;
                            v29 = 4;
                        }
                        else {
                            v25 = v23;
                            v26 = 6;
                            v27 = v22;
                            v28 = 0;
                            v29 = v24;
                        }
                    }
                    else {
                        switch(v11) {
                            case 1: {
                                v25 = 8;
                                v26 = 6;
                                v28 = 1;
                                v29 = 4;
                                z13 = false;
                                v27 = 1;
                                break;
                            }
                            case 3: {
                                if(this.u == -1) {
                                    if(!z7) {
                                        v26 = 8;
                                    }
                                    else if(z1) {
                                        v26 = 5;
                                    }
                                    else {
                                        v26 = 4;
                                    }
                                    v28 = 1;
                                    v29 = 5;
                                    z13 = true;
                                    v27 = 1;
                                    v25 = 8;
                                }
                                else if(z5) {
                                    if(v5 == 1 || v5 == 2) {
                                        v30 = 5;
                                        v31 = 4;
                                    }
                                    else {
                                        v30 = 8;
                                        v31 = 5;
                                    }
                                    v25 = v30;
                                    v29 = v31;
                                    v28 = 1;
                                    z13 = true;
                                    v27 = 1;
                                    v26 = 6;
                                }
                                else if(v15 > 0) {
                                    v28 = 1;
                                    z13 = true;
                                    v27 = 1;
                                    v26 = 6;
                                    v29 = 5;
                                    v25 = 5;
                                    break;
                                }
                                else if(v15 != 0 || v14 != 0) {
                                    v28 = 1;
                                    z13 = true;
                                    v27 = 1;
                                    v26 = 6;
                                    v29 = 4;
                                    v25 = 5;
                                }
                                else if(!z7) {
                                    v28 = 1;
                                    z13 = true;
                                    v27 = 1;
                                    v26 = 6;
                                    v29 = 8;
                                    v25 = 5;
                                }
                                else {
                                    v25 = e0 == e2 || e1 == e2 ? 5 : 4;
                                    v28 = 1;
                                    z13 = true;
                                    v27 = 1;
                                    v26 = 6;
                                    v29 = 4;
                                }
                                break;
                            }
                            default: {
                                v26 = 6;
                                v28 = 0;
                                v29 = 4;
                                z13 = false;
                                v27 = 0;
                                v25 = 5;
                                break;
                            }
                        }
                    }
                    if(v28 == 0 || i4 != i5 || e0 == e2) {
                        v32 = v28;
                        v33 = 1;
                    }
                    else {
                        v32 = 0;
                        v33 = 0;
                    }
                    if(v27 == 0) {
                        e3 = e2;
                        e5 = e0;
                        v34 = v11;
                        e4 = e1;
                    }
                    else {
                        e3 = e2;
                        v34 = v11;
                        e4 = e1;
                        e5 = e0;
                        d0.c(i2, i4, d1.c(), f, i5, i3, d2.c(), (this.f0 == 8 ? 4 : v26));
                    }
                    if(this.f0 == 8) {
                        return;
                    }
                    if(v32 == 0) {
                        e6 = e5;
                    }
                    else {
                        if(!z1 || i4 == i5 || v16 != 0) {
                            e6 = e5;
                            v35 = v25;
                        }
                        else {
                            e6 = e5;
                            v35 = !(e6 instanceof s.a) && !(e4 instanceof s.a) ? v25 : 6;
                        }
                        d0.h(i2, i4, d1.c(), v35);
                        d0.j(i3, i5, -d2.c(), v35);
                        v25 = v35;
                    }
                    if(!z1 || !z8 || e6 instanceof s.a || e4 instanceof s.a) {
                        v36 = v29;
                        v37 = v25;
                        v38 = v33;
                    }
                    else {
                        v36 = 6;
                        v37 = 6;
                        v38 = 1;
                    }
                    if(v38 != 0) {
                        if(!z13 || z7 && !z2) {
                            v39 = v36;
                        }
                        else {
                            if(e6 != e3 && e4 != e3) {
                                v21 = v36;
                            }
                            if(e6 instanceof h || e4 instanceof h) {
                                v21 = 5;
                            }
                            if(e6 instanceof s.a || e4 instanceof s.a) {
                                v21 = 5;
                            }
                            v39 = Math.max((z7 ? 5 : v21), v36);
                        }
                        if(z1) {
                            v39 = Math.min(v37, v39);
                            if(z5 && !z7 && (e6 == e3 || e4 == e3)) {
                                v39 = 4;
                            }
                        }
                        d0.e(i2, i4, d1.c(), v39);
                        d0.e(i3, i5, -d2.c(), v39);
                    }
                    if(z1) {
                        int v40 = i0 == i4 ? d1.c() : 0;
                        if(i4 != i0) {
                            d0.h(i2, i0, v40, 5);
                        }
                    }
                    if(z1 && v16 != 0 && v2 == 0 && v14 == 0) {
                        if(v16 == 0 || v34 != 3) {
                            d0.h(i3, i2, 0, 5);
                        }
                        else {
                            d0.h(i3, i2, 0, 8);
                        }
                    }
                }
            }
            if(z1 && z12) {
                int v41 = d2.d == null ? 0 : d2.c();
                if(i5 != i1) {
                    d0.h(i1, i3, v41, 5);
                }
            }
            return;
        }
        else {
            v20 = 1;
            v19 = v18;
        }
    label_287:
        if(v19 < 2 && z1 && z12) {
            d0.h(i2, i0, 0, 8);
            int v42 = z || this.F.d == null ? 1 : 0;
            if(z) {
                v20 = v42;
            }
            else {
                d d3 = this.F.d;
                if(d3 == null) {
                    v20 = v42;
                }
                else if(d3.b.Q == 0.0f || (d3.b.M[0] != b.h || d3.b.M[1] != b.h)) {
                    v20 = 0;
                }
            }
            if(v20 != 0) {
                d0.h(i1, i3, 0, 8);
            }
        }
    }

    public void h0(int v) {
        this.P = v;
        int v1 = this.a0;
        if(v < v1) {
            this.P = v1;
        }
    }

    public void i(s.d.b d$b0, e e0, s.d.b d$b1, int v) {
        boolean z1;
        s.d.b d$b2 = s.d.b.l;
        if(d$b0 != d$b2) {
            s.d.b d$b9 = s.d.b.m;
            if(d$b0 == d$b9) {
                s.d.b d$b10 = s.d.b.g;
                if(d$b1 == d$b10 || d$b1 == s.d.b.i) {
                    d d4 = this.m(d$b10);
                    d d5 = e0.m(d$b1);
                    d d6 = this.m(s.d.b.i);
                    d4.a(d5, 0);
                    d6.a(d5, 0);
                    this.m(d$b9).a(d5, 0);
                    return;
                }
            }
            s.d.b d$b11 = s.d.b.n;
            if(d$b0 == d$b11) {
                s.d.b d$b12 = s.d.b.h;
                if(d$b1 == d$b12 || d$b1 == s.d.b.j) {
                    d d7 = e0.m(d$b1);
                    this.m(d$b12).a(d7, 0);
                    this.m(s.d.b.j).a(d7, 0);
                    this.m(d$b11).a(d7, 0);
                    return;
                }
            }
            if(d$b0 == d$b9 && d$b1 == d$b9) {
                this.m(s.d.b.g).a(e0.m(s.d.b.g), 0);
                this.m(s.d.b.i).a(e0.m(s.d.b.i), 0);
                this.m(d$b9).a(e0.m(d$b1), 0);
                return;
            }
            if(d$b0 == d$b11 && d$b1 == d$b11) {
                this.m(s.d.b.h).a(e0.m(s.d.b.h), 0);
                this.m(s.d.b.j).a(e0.m(s.d.b.j), 0);
                this.m(d$b11).a(e0.m(d$b1), 0);
                return;
            }
            d d8 = this.m(d$b0);
            d d9 = e0.m(d$b1);
            if(d8.k(d9)) {
                s.d.b d$b13 = s.d.b.k;
                if(d$b0 == d$b13) {
                    d d10 = this.m(s.d.b.h);
                    d d11 = this.m(s.d.b.j);
                    if(d10 != null) {
                        d10.l();
                    }
                    if(d11 != null) {
                        d11.l();
                    }
                    v = 0;
                }
                else if(d$b0 == s.d.b.h || d$b0 == s.d.b.j) {
                    d d15 = this.m(d$b13);
                    if(d15 != null) {
                        d15.l();
                    }
                    d d16 = this.m(d$b2);
                    if(d16.g() != d9) {
                        d16.l();
                    }
                    d d17 = this.m(d$b0).d();
                    d d18 = this.m(d$b11);
                    if(d18.j()) {
                        d17.l();
                        d18.l();
                    }
                }
                else if(d$b0 == s.d.b.g || d$b0 == s.d.b.i) {
                    d d12 = this.m(d$b2);
                    if(d12.g() != d9) {
                        d12.l();
                    }
                    d d13 = this.m(d$b0).d();
                    d d14 = this.m(d$b9);
                    if(d14.j()) {
                        d13.l();
                        d14.l();
                    }
                }
                d8.a(d9, v);
            }
        }
        else if(d$b1 == d$b2) {
            s.d.b d$b3 = s.d.b.g;
            d d0 = this.m(d$b3);
            s.d.b d$b4 = s.d.b.i;
            d d1 = this.m(d$b4);
            s.d.b d$b5 = s.d.b.h;
            d d2 = this.m(d$b5);
            s.d.b d$b6 = s.d.b.j;
            d d3 = this.m(d$b6);
            boolean z = true;
            if((d0 == null || !d0.j()) && (d1 == null || !d1.j())) {
                this.i(d$b3, e0, d$b3, 0);
                this.i(d$b4, e0, d$b4, 0);
                z1 = true;
            }
            else {
                z1 = false;
            }
            if((d2 == null || !d2.j()) && (d3 == null || !d3.j())) {
                this.i(d$b5, e0, d$b5, 0);
                this.i(d$b6, e0, d$b6, 0);
            }
            else {
                z = false;
            }
            if(z1 && z) {
                this.m(d$b2).a(e0.m(d$b2), 0);
                return;
            }
            if(z1) {
                this.m(s.d.b.m).a(e0.m(s.d.b.m), 0);
                return;
            }
            if(z) {
                this.m(s.d.b.n).a(e0.m(s.d.b.n), 0);
            }
        }
        else {
            s.d.b d$b7 = s.d.b.g;
            if(d$b1 == d$b7 || d$b1 == s.d.b.i) {
                this.i(d$b7, e0, d$b1, 0);
                this.i(s.d.b.i, e0, d$b1, 0);
                this.m(d$b2).a(e0.m(d$b1), 0);
                return;
            }
            s.d.b d$b8 = s.d.b.h;
            if(d$b1 == d$b8 || d$b1 == s.d.b.j) {
                this.i(d$b8, e0, d$b1, 0);
                this.i(s.d.b.j, e0, d$b1, 0);
                this.m(d$b2).a(e0.m(d$b1), 0);
            }
        }
    }

    public void i0(float f) {
        this.b0 = f;
    }

    public void j(d d0, d d1, int v) {
        if(d0.e() == this) {
            this.i(d0.h(), d1.e(), d1.h(), v);
        }
    }

    public void j0(int v) {
        this.m0 = v;
    }

    public void k(e e0, float f, int v) {
        this.T(s.d.b.l, e0, s.d.b.l, v, 0);
        this.x = f;
    }

    public void k0(int v, int v1) {
        this.S = v;
        int v2 = v1 - v;
        this.O = v2;
        int v3 = this.Z;
        if(v2 < v3) {
            this.O = v3;
        }
    }

    public void l(r.d d0) {
        d0.q(this.B);
        d0.q(this.C);
        d0.q(this.D);
        d0.q(this.E);
        if(this.Y > 0) {
            d0.q(this.F);
        }
    }

    public void l0(b e$b0) {
        this.M[0] = e$b0;
    }

    public d m(s.d.b d$b0) {
        switch(a.a[d$b0.ordinal()]) {
            case 1: {
                return this.B;
            }
            case 2: {
                return this.C;
            }
            case 3: {
                return this.D;
            }
            case 4: {
                return this.E;
            }
            case 5: {
                return this.F;
            }
            case 6: {
                return this.I;
            }
            case 7: {
                return this.G;
            }
            case 8: {
                return this.H;
            }
            case 9: {
                return null;
            }
            default: {
                throw new AssertionError(d$b0.name());
            }
        }
    }

    public void m0(int v, int v1, int v2, float f) {
        this.l = v;
        this.o = v1;
        if(v2 == 0x7FFFFFFF) {
            v2 = 0;
        }
        this.p = v2;
        this.q = f;
        if(f > 0.0f && f < 1.0f && v == 0) {
            this.l = 2;
        }
    }

    public int n() {
        return this.Y;
    }

    public void n0(float f) {
        this.q0[0] = f;
    }

    public float o(int v) {
        if(v == 0) {
            return this.b0;
        }
        return v == 1 ? this.c0 : -1.0f;
    }

    protected void o0(int v, boolean z) {
        this.L[v] = z;
    }

    public int p() {
        return this.R() + this.P;
    }

    public void p0(boolean z) {
        this.z = z;
    }

    public Object q() {
        return this.d0;
    }

    public void q0(boolean z) {
        this.A = z;
    }

    public String r() {
        return this.g0;
    }

    public void r0(int v) {
        this.w[1] = v;
    }

    public b s(int v) {
        if(v == 0) {
            return this.y();
        }
        return v == 1 ? this.M() : null;
    }

    public void s0(int v) {
        this.w[0] = v;
    }

    public float t() {
        return this.Q;
    }

    public void t0(int v) {
        if(v < 0) {
            this.a0 = 0;
            return;
        }
        this.a0 = v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = "";
        stringBuilder0.append((this.h0 == null ? "" : "type: " + this.h0 + " "));
        if(this.g0 != null) {
            s = "id: " + this.g0 + " ";
        }
        stringBuilder0.append(s);
        stringBuilder0.append("(");
        stringBuilder0.append(this.S);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.T);
        stringBuilder0.append(") - (");
        stringBuilder0.append(this.O);
        stringBuilder0.append(" x ");
        stringBuilder0.append(this.P);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    public int u() {
        return this.R;
    }

    public void u0(int v) {
        if(v < 0) {
            this.Z = 0;
            return;
        }
        this.Z = v;
    }

    public int v() {
        return this.f0 == 8 ? 0 : this.P;
    }

    public void v0(int v, int v1) {
        this.S = v;
        this.T = v1;
    }

    public float w() {
        return this.b0;
    }

    public void w0(e e0) {
        this.N = e0;
    }

    public int x() {
        return this.m0;
    }

    public void x0(float f) {
        this.c0 = f;
    }

    public b y() {
        return this.M[0];
    }

    public void y0(int v) {
        this.n0 = v;
    }

    public int z() {
        int v = this.B == null ? 0 : this.B.e;
        return this.D == null ? v : v + this.D.e;
    }

    public void z0(int v, int v1) {
        this.T = v;
        int v2 = v1 - v;
        this.P = v2;
        int v3 = this.a0;
        if(v2 < v3) {
            this.P = v3;
        }
    }
}

