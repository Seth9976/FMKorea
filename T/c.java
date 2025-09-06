package t;

import java.util.ArrayList;
import s.e.b;
import s.e;
import s.f;

public class c extends m {
    ArrayList k;
    private int l;

    public c(e e0, int v) {
        super(e0);
        this.k = new ArrayList();
        this.f = v;
        this.q();
    }

    @Override  // t.m
    public void a(d d0) {
        int v31;
        int v28;
        int v27;
        boolean z3;
        int v24;
        int v22;
        boolean z2;
        float f3;
        int v20;
        int v19;
        int v14;
        int v13;
        float f;
        int v9;
        int v8;
        int v3;
        if(this.h.j && this.i.j) {
            e e0 = this.b.G();
            boolean z = e0 == null || !(e0 instanceof f) ? false : ((f)e0).a1();
            int v = this.i.g - this.h.g;
            int v1 = this.k.size();
            int v2;
            for(v2 = 0; true; ++v2) {
                v3 = -1;
                if(v2 >= v1) {
                    v2 = -1;
                    break;
                }
                if(((m)this.k.get(v2)).b.O() != 8) {
                    break;
                }
            }
            int v4 = v1 - 1;
            while(v4 >= 0) {
                if(((m)this.k.get(v4)).b.O() == 8) {
                    --v4;
                }
                else {
                    v3 = v4;
                    if(true) {
                        break;
                    }
                }
            }
            int v5 = 0;
            int v6 = 0;
            while(v6 < 2) {
                int v7 = 0;
                v8 = 0;
                v9 = 0;
                int v10 = 0;
                f = 0.0f;
                while(v7 < v1) {
                    m m0 = (m)this.k.get(v7);
                    if(m0.b.O() != 8) {
                        ++v10;
                        if(v7 > 0 && v7 >= v2) {
                            v8 += m0.h.f;
                        }
                        g g0 = m0.e;
                        int v11 = g0.g;
                        boolean z1 = m0.d != b.h;
                        if(z1) {
                            int v12 = this.f;
                            if(v12 == 0 && !m0.b.e.e.j) {
                                return;
                            }
                            if(v12 == 1 && !m0.b.f.e.j) {
                                return;
                            }
                            v13 = v11;
                        }
                        else {
                            v13 = v11;
                            if(m0.a == 1 && v6 == 0) {
                                v14 = g0.m;
                                ++v9;
                                z1 = true;
                                goto label_56;
                            }
                            else if(g0.j) {
                                v14 = v13;
                                z1 = true;
                                goto label_56;
                            }
                        }
                        v14 = v13;
                    label_56:
                        if(z1) {
                            v8 += v14;
                        }
                        else {
                            ++v9;
                            float f1 = m0.b.q0[this.f];
                            if(f1 >= 0.0f) {
                                f += f1;
                            }
                        }
                        if(v7 < v1 - 1 && v7 < v3) {
                            v8 -= m0.i.f;
                        }
                    }
                    ++v7;
                }
                if(v8 < v || v9 == 0) {
                    v5 = v10;
                }
                else {
                    ++v6;
                    continue;
                }
                goto label_75;
            }
            v8 = 0;
            v9 = 0;
            f = 0.0f;
        label_75:
            int v15 = z ? this.i.g : this.h.g;
            if(v8 > v) {
                v15 = z ? v15 + ((int)(((float)(v8 - v)) / 2.0f + 0.5f)) : v15 - ((int)(((float)(v8 - v)) / 2.0f + 0.5f));
            }
            if(v9 > 0) {
                float f2 = (float)(v - v8);
                int v16 = (int)(f2 / ((float)v9) + 0.5f);
                int v17 = 0;
                int v18 = 0;
                while(v17 < v1) {
                    m m1 = (m)this.k.get(v17);
                    if(m1.b.O() == 8 || m1.d != b.h) {
                        z2 = z;
                        v22 = v5;
                        v19 = v15;
                        f3 = f2;
                    }
                    else {
                        g g1 = m1.e;
                        if(!g1.j) {
                            if(f > 0.0f) {
                                v19 = v15;
                                v20 = (int)(m1.b.q0[this.f] * f2 / f + 0.5f);
                            }
                            else {
                                v19 = v15;
                                v20 = v16;
                            }
                            if(this.f == 0) {
                                f3 = f2;
                                int v21 = m1.b.p;
                                z2 = z;
                                v22 = v5;
                                int v23 = m1.a == 1 ? Math.min(v20, g1.m) : v20;
                                v24 = v21 <= 0 ? Math.max(m1.b.o, v23) : Math.min(v21, Math.max(m1.b.o, v23));
                                if(v24 != v20) {
                                    ++v18;
                                    m1.e.d(v24);
                                    goto label_120;
                                }
                            }
                            else {
                                z2 = z;
                                v22 = v5;
                                f3 = f2;
                                int v25 = m1.b.s;
                                int v26 = m1.a == 1 ? Math.min(v20, g1.m) : v20;
                                v24 = v25 <= 0 ? Math.max(m1.b.r, v26) : Math.min(v25, Math.max(m1.b.r, v26));
                                if(v24 != v20) {
                                    ++v18;
                                    v20 = v24;
                                }
                            }
                            m1.e.d(v20);
                        }
                    }
                label_120:
                    ++v17;
                    v15 = v19;
                    f2 = f3;
                    z = z2;
                    v5 = v22;
                }
                z3 = z;
                v27 = v5;
                v28 = v15;
                if(v18 > 0) {
                    v9 -= v18;
                    v8 = 0;
                    for(int v29 = 0; v29 < v1; ++v29) {
                        m m2 = (m)this.k.get(v29);
                        if(m2.b.O() != 8) {
                            if(v29 > 0 && v29 >= v2) {
                                v8 += m2.h.f;
                            }
                            v8 += m2.e.g;
                            if(v29 < v1 - 1 && v29 < v3) {
                                v8 -= m2.i.f;
                            }
                        }
                    }
                }
                if(this.l == 2 && v18 == 0) {
                    this.l = 0;
                }
            }
            else {
                z3 = z;
                v27 = v5;
                v28 = v15;
            }
            if(v8 > v) {
                this.l = 2;
            }
            if(v27 > 0 && v9 == 0 && v2 == v3) {
                this.l = 2;
            }
            int v30 = this.l;
            if(v30 == 1) {
                if(v27 > 1) {
                    v31 = (v - v8) / (v27 - 1);
                }
                else {
                    v31 = v27 == 1 ? (v - v8) / 2 : 0;
                }
                if(v9 > 0) {
                    v31 = 0;
                }
                int v33 = v28;
                for(int v32 = 0; v32 < v1; ++v32) {
                    m m3 = (m)this.k.get((z3 ? v1 - (v32 + 1) : v32));
                    if(m3.b.O() == 8) {
                        m3.h.d(v33);
                        m3.i.d(v33);
                    }
                    else {
                        if(v32 > 0) {
                            v33 = z3 ? v33 - v31 : v33 + v31;
                        }
                        if(v32 > 0 && v32 >= v2) {
                            v33 = z3 ? v33 - m3.h.f : v33 + m3.h.f;
                        }
                        if(z3) {
                            m3.i.d(v33);
                        }
                        else {
                            m3.h.d(v33);
                        }
                        int v34 = m3.d != b.h || m3.a != 1 ? m3.e.g : m3.e.m;
                        v33 = z3 ? v33 - v34 : v33 + v34;
                        if(z3) {
                            m3.h.d(v33);
                        }
                        else {
                            m3.i.d(v33);
                        }
                        m3.g = true;
                        if(v32 < v1 - 1 && v32 < v3) {
                            v33 = z3 ? v33 - -m3.i.f : v33 - m3.i.f;
                        }
                    }
                }
                return;
            }
        alab1:
            switch(v30) {
                case 0: {
                    int v35 = (v - v8) / (v27 + 1);
                    if(v9 > 0) {
                        v35 = 0;
                    }
                    int v37 = v28;
                    for(int v36 = 0; v36 < v1; ++v36) {
                        m m4 = (m)this.k.get((z3 ? v1 - (v36 + 1) : v36));
                        if(m4.b.O() == 8) {
                            m4.h.d(v37);
                            m4.i.d(v37);
                        }
                        else {
                            int v38 = z3 ? v37 - v35 : v37 + v35;
                            if(v36 > 0 && v36 >= v2) {
                                v38 = z3 ? v38 - m4.h.f : v38 + m4.h.f;
                            }
                            if(z3) {
                                m4.i.d(v38);
                            }
                            else {
                                m4.h.d(v38);
                            }
                            int v39 = m4.d != b.h || m4.a != 1 ? m4.e.g : Math.min(m4.e.g, m4.e.m);
                            v37 = z3 ? v38 - v39 : v38 + v39;
                            if(z3) {
                                m4.h.d(v37);
                            }
                            else {
                                m4.i.d(v37);
                            }
                            if(v36 < v1 - 1 && v36 < v3) {
                                v37 = z3 ? v37 - -m4.i.f : v37 - m4.i.f;
                            }
                        }
                    }
                    return;
                }
                case 2: {
                    float f4 = this.f == 0 ? this.b.w() : this.b.K();
                    if(z3) {
                        f4 = 1.0f - f4;
                    }
                    int v40 = ((int)(((float)(v - v8)) * f4 + 0.5f)) >= 0 && v9 <= 0 ? ((int)(((float)(v - v8)) * f4 + 0.5f)) : 0;
                    int v41 = z3 ? v28 - v40 : v28 + v40;
                    for(int v42 = 0; true; ++v42) {
                        if(v42 >= v1) {
                            break alab1;
                        }
                        m m5 = (m)this.k.get((z3 ? v1 - (v42 + 1) : v42));
                        if(m5.b.O() == 8) {
                            m5.h.d(v41);
                            m5.i.d(v41);
                        }
                        else {
                            if(v42 > 0 && v42 >= v2) {
                                v41 = z3 ? v41 - m5.h.f : v41 + m5.h.f;
                            }
                            if(z3) {
                                m5.i.d(v41);
                            }
                            else {
                                m5.h.d(v41);
                            }
                            int v43 = m5.d != b.h || m5.a != 1 ? m5.e.g : m5.e.m;
                            v41 = z3 ? v41 - v43 : v41 + v43;
                            if(z3) {
                                m5.h.d(v41);
                            }
                            else {
                                m5.i.d(v41);
                            }
                            if(v42 < v1 - 1 && v42 < v3) {
                                v41 = z3 ? v41 - -m5.i.f : v41 - m5.i.f;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // t.m
    void d() {
        for(Object object0: this.k) {
            ((m)object0).d();
        }
        int v = this.k.size();
        if(v < 1) {
            return;
        }
        e e0 = ((m)this.k.get(0)).b;
        e e1 = ((m)this.k.get(v - 1)).b;
        if(this.f == 0) {
            s.d d0 = e0.B;
            s.d d1 = e1.D;
            t.f f0 = this.i(d0, 0);
            int v1 = d0.c();
            e e2 = this.r();
            if(e2 != null) {
                v1 = e2.B.c();
            }
            if(f0 != null) {
                this.b(this.h, f0, v1);
            }
            t.f f1 = this.i(d1, 0);
            int v2 = d1.c();
            e e3 = this.s();
            if(e3 != null) {
                v2 = e3.D.c();
            }
            if(f1 != null) {
                this.b(this.i, f1, -v2);
            }
        }
        else {
            s.d d2 = e0.C;
            s.d d3 = e1.E;
            t.f f2 = this.i(d2, 1);
            int v3 = d2.c();
            e e4 = this.r();
            if(e4 != null) {
                v3 = e4.C.c();
            }
            if(f2 != null) {
                this.b(this.h, f2, v3);
            }
            t.f f3 = this.i(d3, 1);
            int v4 = d3.c();
            e e5 = this.s();
            if(e5 != null) {
                v4 = e5.E.c();
            }
            if(f3 != null) {
                this.b(this.i, f3, -v4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override  // t.m
    public void e() {
        for(int v = 0; v < this.k.size(); ++v) {
            ((m)this.k.get(v)).e();
        }
    }

    @Override  // t.m
    void f() {
        this.c = null;
        for(Object object0: this.k) {
            ((m)object0).f();
        }
    }

    @Override  // t.m
    public long j() {
        int v = this.k.size();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            m m0 = (m)this.k.get(v2);
            v1 = v1 + ((long)m0.h.f) + m0.j() + ((long)m0.i.f);
        }
        return v1;
    }

    @Override  // t.m
    boolean m() {
        int v = this.k.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((m)this.k.get(v1)).m()) {
                return false;
            }
        }
        return true;
    }

    private void q() {
        e e2;
        e e0 = this.b;
        for(e e1 = e0.H(this.f); true; e1 = e0.H(this.f)) {
            e2 = e0;
            e0 = e1;
            if(e0 == null) {
                break;
            }
        }
        this.b = e2;
        this.k.add(e2.J(this.f));
        for(e e3 = e2.F(this.f); e3 != null; e3 = e3.F(this.f)) {
            this.k.add(e3.J(this.f));
        }
        for(Object object0: this.k) {
            m m0 = (m)object0;
            int v = this.f;
            if(v == 0) {
                m0.b.c = this;
            }
            else if(v == 1) {
                m0.b.d = this;
            }
        }
        if(this.f == 0 && ((f)this.b.G()).a1() && this.k.size() > 1) {
            this.b = ((m)this.k.get(this.k.size() - 1)).b;
        }
        this.l = this.f == 0 ? this.b.x() : this.b.L();
    }

    private e r() {
        for(int v = 0; v < this.k.size(); ++v) {
            m m0 = (m)this.k.get(v);
            if(m0.b.O() != 8) {
                return m0.b;
            }
        }
        return null;
    }

    private e s() {
        for(int v = this.k.size() - 1; v >= 0; --v) {
            m m0 = (m)this.k.get(v);
            if(m0.b.O() != 8) {
                return m0.b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String s = "ChainRun " + (this.f == 0 ? "horizontal : " : "vertical : ");
        for(Object object0: this.k) {
            s = s + "<" + ((m)object0) + "> ";
        }
        return s;
    }
}

