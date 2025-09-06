package t;

import s.e;
import s.i;

public class j extends m {
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
                a.a[b.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static int[] k;

    static {
        j.k = new int[2];
    }

    public j(e e0) {
        super(e0);
        this.h.e = t.f.a.i;
        this.i.e = t.f.a.j;
        this.f = 0;
    }

    @Override  // t.m
    public void a(d d0) {
        int v;
        if(a.a[this.j.ordinal()] == 3) {
            this.n(d0, this.b.B, this.b.D, 0);
            return;
        }
        if(!this.e.j && this.d == s.e.b.h) {
            e e0 = this.b;
            switch(e0.l) {
                case 2: {
                    e e1 = e0.G();
                    if(e1 != null) {
                        g g0 = e1.e.e;
                        if(g0.j) {
                            this.e.d(((int)(((float)g0.g) * this.b.q + 0.5f)));
                        }
                    }
                    break;
                }
                case 3: {
                    if(e0.m == 0 || e0.m == 3) {
                        f f0 = e0.f.h;
                        f f1 = e0.f.i;
                        boolean z = e0.B.d != null;
                        boolean z1 = e0.C.d != null;
                        boolean z2 = e0.D.d != null;
                        boolean z3 = e0.E.d != null;
                        int v1 = e0.u();
                        if(z && z1 && z2 && z3) {
                            float f2 = this.b.t();
                            if(f0.j && f1.j) {
                                f f3 = this.h;
                                if(f3.c && this.i.c) {
                                    int v2 = ((f)f3.l.get(0)).g + this.h.f;
                                    int v3 = ((f)this.i.l.get(0)).g;
                                    this.q(j.k, v2, v3 - this.i.f, f0.g + f0.f, f1.g - f1.f, f2, v1);
                                    this.e.d(j.k[0]);
                                    this.b.f.e.d(j.k[1]);
                                }
                                return;
                            }
                            f f4 = this.h;
                            if(f4.j) {
                                f f5 = this.i;
                                if(f5.j) {
                                    if(f0.c && f1.c) {
                                        int v4 = f4.g + f4.f;
                                        int v5 = f5.g - f5.f;
                                        int v6 = ((f)f0.l.get(0)).g + f0.f;
                                        int v7 = ((f)f1.l.get(0)).g;
                                        this.q(j.k, v4, v5, v6, v7 - f1.f, f2, v1);
                                        this.e.d(j.k[0]);
                                        this.b.f.e.d(j.k[1]);
                                        goto label_56;
                                    }
                                    return;
                                }
                            }
                        label_56:
                            f f6 = this.h;
                            if(f6.c && this.i.c && f0.c && f1.c) {
                                int v8 = ((f)f6.l.get(0)).g + this.h.f;
                                int v9 = ((f)this.i.l.get(0)).g - this.i.f;
                                int v10 = ((f)f0.l.get(0)).g + f0.f;
                                int v11 = ((f)f1.l.get(0)).g;
                                this.q(j.k, v8, v9, v10, v11 - f1.f, f2, v1);
                                this.e.d(j.k[0]);
                                this.b.f.e.d(j.k[1]);
                                break;
                            }
                            return;
                        }
                        else if(z && z2) {
                            if(!this.h.c || !this.i.c) {
                                return;
                            }
                            float f7 = this.b.t();
                            int v12 = ((f)this.h.l.get(0)).g + this.h.f;
                            int v13 = ((f)this.i.l.get(0)).g - this.i.f;
                            switch(v1) {
                                case -1: 
                                case 0: {
                                    int v14 = this.g(v13 - v12, 0);
                                    int v15 = (int)(((float)v14) * f7 + 0.5f);
                                    int v16 = this.g(v15, 1);
                                    if(v15 != v16) {
                                        v14 = (int)(((float)v16) / f7 + 0.5f);
                                    }
                                    this.e.d(v14);
                                    this.b.f.e.d(v16);
                                    break;
                                }
                                case 1: {
                                    int v17 = this.g(v13 - v12, 0);
                                    int v18 = (int)(((float)v17) / f7 + 0.5f);
                                    int v19 = this.g(v18, 1);
                                    if(v18 != v19) {
                                        v17 = (int)(((float)v19) * f7 + 0.5f);
                                    }
                                    this.e.d(v17);
                                    this.b.f.e.d(v19);
                                    break;
                                }
                            }
                        }
                        else if(z1 && z3) {
                            if(!f0.c || !f1.c) {
                                return;
                            }
                            float f8 = this.b.t();
                            int v20 = ((f)f0.l.get(0)).g + f0.f;
                            int v21 = ((f)f1.l.get(0)).g - f1.f;
                            switch(v1) {
                                case 0: {
                                    int v25 = this.g(v21 - v20, 1);
                                    int v26 = (int)(((float)v25) * f8 + 0.5f);
                                    int v27 = this.g(v26, 0);
                                    if(v26 != v27) {
                                        v25 = (int)(((float)v27) / f8 + 0.5f);
                                    }
                                    this.e.d(v27);
                                    this.b.f.e.d(v25);
                                    break;
                                }
                                case -1: 
                                case 1: {
                                    int v22 = this.g(v21 - v20, 1);
                                    int v23 = (int)(((float)v22) / f8 + 0.5f);
                                    int v24 = this.g(v23, 0);
                                    if(v23 != v24) {
                                        v22 = (int)(((float)v24) * f8 + 0.5f);
                                    }
                                    this.e.d(v24);
                                    this.b.f.e.d(v22);
                                }
                            }
                        }
                    }
                    else {
                        switch(e0.u()) {
                            case -1: {
                                v = (int)(((float)this.b.f.e.g) * this.b.t() + 0.5f);
                                break;
                            }
                            case 0: {
                                v = (int)(((float)this.b.f.e.g) / this.b.t() + 0.5f);
                                break;
                            }
                            case 1: {
                                v = (int)(((float)this.b.f.e.g) * this.b.t() + 0.5f);
                                break;
                            }
                            default: {
                                v = 0;
                            }
                        }
                        this.e.d(v);
                    }
                }
            }
        }
        if(!this.h.c || (!this.i.c || this.h.j && this.i.j && this.e.j)) {
            return;
        }
        if(!this.e.j && this.d == s.e.b.h && (this.b.l == 0 && !this.b.V())) {
            f f9 = (f)this.h.l.get(0);
            f f10 = (f)this.i.l.get(0);
            int v28 = f9.g + this.h.f;
            int v29 = f10.g + this.i.f;
            this.h.d(v28);
            this.i.d(v29);
            this.e.d(v29 - v28);
            return;
        }
        if(!this.e.j && this.d == s.e.b.h && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
            f f11 = (f)this.h.l.get(0);
            int v30 = Math.min(((f)this.i.l.get(0)).g + this.i.f - (f11.g + this.h.f), this.e.m);
            int v31 = this.b.p;
            this.e.d((v31 <= 0 ? Math.max(this.b.o, v30) : Math.min(v31, Math.max(this.b.o, v30))));
        }
        if(!this.e.j) {
            return;
        }
        f f12 = (f)this.h.l.get(0);
        f f13 = (f)this.i.l.get(0);
        int v32 = f12.g + this.h.f;
        int v33 = f13.g + this.i.f;
        float f14 = this.b.w();
        if(f12 == f13) {
            v32 = f12.g;
            v33 = f13.g;
            f14 = 0.5f;
        }
        this.h.d(((int)(((float)v32) + 0.5f + ((float)(v33 - v32 - this.e.g)) * f14)));
        this.i.d(this.h.g + this.e.g);
    }

    @Override  // t.m
    void d() {
        e e0 = this.b;
        if(e0.a) {
            this.e.d(e0.P());
        }
        if(this.e.j) {
            s.e.b e$b2 = s.e.b.i;
            if(this.d == e$b2) {
                e e2 = this.b.G();
                if(e2 != null && e2.y() == s.e.b.f || e2.y() == e$b2) {
                    this.b(this.h, e2.e.h, this.b.B.c());
                    this.b(this.i, e2.e.i, -this.b.D.c());
                    return;
                }
            }
        }
        else {
            s.e.b e$b0 = this.b.y();
            this.d = e$b0;
            if(e$b0 != s.e.b.h) {
                s.e.b e$b1 = s.e.b.i;
                if(e$b0 == e$b1) {
                    e e1 = this.b.G();
                    if(e1 != null && e1.y() == s.e.b.f || e1.y() == e$b1) {
                        int v = e1.P();
                        int v1 = this.b.B.c();
                        int v2 = this.b.D.c();
                        this.b(this.h, e1.e.h, this.b.B.c());
                        this.b(this.i, e1.e.i, -this.b.D.c());
                        this.e.d(v - v1 - v2);
                        return;
                    }
                }
                if(this.d == s.e.b.f) {
                    this.e.d(this.b.P());
                }
            }
        }
        g g0 = this.e;
        if(g0.j) {
            e e3 = this.b;
            if(e3.a) {
                s.d[] arr_d = e3.J;
                s.d d0 = arr_d[0];
                s.d d1 = d0.d;
                if(d1 != null && arr_d[1].d != null) {
                    if(e3.V()) {
                        this.h.f = this.b.J[0].c();
                        this.i.f = -this.b.J[1].c();
                        return;
                    }
                    f f0 = this.h(this.b.J[0]);
                    if(f0 != null) {
                        this.b(this.h, f0, this.b.J[0].c());
                    }
                    f f1 = this.h(this.b.J[1]);
                    if(f1 != null) {
                        this.b(this.i, f1, -this.b.J[1].c());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if(d1 == null) {
                    s.d d2 = arr_d[1];
                    if(d2.d != null) {
                        f f3 = this.h(d2);
                        if(f3 != null) {
                            this.b(this.i, f3, -this.b.J[1].c());
                            this.b(this.h, this.i, -this.e.g);
                        }
                    }
                    else if(!(e3 instanceof i) && e3.G() != null && this.b.m(s.d.b.l).d == null) {
                        this.b(this.h, this.b.G().e.h, this.b.Q());
                        this.b(this.i, this.h, this.e.g);
                    }
                }
                else {
                    f f2 = this.h(d0);
                    if(f2 != null) {
                        this.b(this.h, f2, this.b.J[0].c());
                        this.b(this.i, this.h, this.e.g);
                    }
                }
            }
            else {
                goto label_66;
            }
        }
        else {
        label_66:
            if(this.d == s.e.b.h) {
                e e4 = this.b;
                switch(e4.l) {
                    case 2: {
                        e e5 = e4.G();
                        if(e5 != null) {
                            g g1 = e5.f.e;
                            this.e.l.add(g1);
                            g1.k.add(this.e);
                            this.e.b = true;
                            this.e.k.add(this.h);
                            this.e.k.add(this.i);
                        }
                        break;
                    }
                    case 3: {
                        if(e4.m == 3) {
                            this.h.a = this;
                            this.i.a = this;
                            e4.f.h.a = this;
                            e4.f.i.a = this;
                            g0.a = this;
                            if(e4.X()) {
                                this.e.l.add(this.b.f.e);
                                this.b.f.e.k.add(this.e);
                                this.b.f.e.a = this;
                                this.e.l.add(this.b.f.h);
                                this.e.l.add(this.b.f.i);
                                this.b.f.h.k.add(this.e);
                                this.b.f.i.k.add(this.e);
                            }
                            else if(this.b.V()) {
                                this.b.f.e.l.add(this.e);
                                this.e.k.add(this.b.f.e);
                            }
                            else {
                                this.b.f.e.l.add(this.e);
                            }
                        }
                        else {
                            g g2 = e4.f.e;
                            g0.l.add(g2);
                            g2.k.add(this.e);
                            this.b.f.h.k.add(this.e);
                            this.b.f.i.k.add(this.e);
                            this.e.b = true;
                            this.e.k.add(this.h);
                            this.e.k.add(this.i);
                            this.h.l.add(this.e);
                            this.i.l.add(this.e);
                        }
                    }
                }
            }
            e e6 = this.b;
            s.d[] arr_d1 = e6.J;
            s.d d3 = arr_d1[0];
            s.d d4 = d3.d;
            if(d4 != null && arr_d1[1].d != null) {
                if(e6.V()) {
                    this.h.f = this.b.J[0].c();
                    this.i.f = -this.b.J[1].c();
                    return;
                }
                f f4 = this.h(this.b.J[0]);
                f f5 = this.h(this.b.J[1]);
                f4.b(this);
                f5.b(this);
                this.j = b.i;
                return;
            }
            if(d4 == null) {
                s.d d5 = arr_d1[1];
                if(d5.d != null) {
                    f f7 = this.h(d5);
                    if(f7 != null) {
                        this.b(this.i, f7, -this.b.J[1].c());
                        this.c(this.h, this.i, -1, this.e);
                    }
                }
                else if(!(e6 instanceof i) && e6.G() != null) {
                    this.b(this.h, this.b.G().e.h, this.b.Q());
                    this.c(this.i, this.h, 1, this.e);
                }
            }
            else {
                f f6 = this.h(d3);
                if(f6 != null) {
                    this.b(this.h, f6, this.b.J[0].c());
                    this.c(this.i, this.h, 1, this.e);
                }
            }
        }
    }

    @Override  // t.m
    public void e() {
        f f0 = this.h;
        if(f0.j) {
            this.b.F0(f0.g);
        }
    }

    @Override  // t.m
    void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override  // t.m
    boolean m() {
        return this.d != s.e.b.h || this.b.l == 0;
    }

    private void q(int[] arr_v, int v, int v1, int v2, int v3, float f, int v4) {
        int v5 = v1 - v;
        int v6 = v3 - v2;
        switch(v4) {
            case -1: {
                int v7 = (int)(((float)v6) * f + 0.5f);
                int v8 = (int)(((float)v5) / f + 0.5f);
                if(v7 <= v5) {
                    arr_v[0] = v7;
                    arr_v[1] = v6;
                    return;
                }
                if(v8 <= v6) {
                    arr_v[0] = v5;
                    arr_v[1] = v8;
                }
                return;
            }
            case 0: {
                arr_v[0] = (int)(((float)v6) * f + 0.5f);
                arr_v[1] = v6;
                return;
            }
            case 1: {
                arr_v[0] = v5;
                arr_v[1] = (int)(((float)v5) * f + 0.5f);
            }
        }
    }

    void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    @Override
    public String toString() {
        return "HorizontalRun " + this.b.r();
    }
}

