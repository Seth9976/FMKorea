package t;

import s.e;
import s.i;

public class l extends m {
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

    public f k;
    g l;

    public l(e e0) {
        super(e0);
        f f0 = new f(this);
        this.k = f0;
        this.l = null;
        this.h.e = t.f.a.k;
        this.i.e = t.f.a.l;
        f0.e = t.f.a.m;
        this.f = 1;
    }

    @Override  // t.m
    public void a(d d0) {
        int v;
        if(a.a[this.j.ordinal()] == 3) {
            this.n(d0, this.b.C, this.b.E, 1);
            return;
        }
        if(this.e.c && !this.e.j && this.d == s.e.b.h) {
            e e0 = this.b;
            switch(e0.m) {
                case 2: {
                    e e1 = e0.G();
                    if(e1 != null) {
                        g g0 = e1.f.e;
                        if(g0.j) {
                            this.e.d(((int)(((float)g0.g) * this.b.t + 0.5f)));
                        }
                    }
                    break;
                }
                case 3: {
                    if(e0.e.e.j) {
                        switch(e0.u()) {
                            case -1: {
                                v = (int)(((float)this.b.e.e.g) / this.b.t() + 0.5f);
                                break;
                            }
                            case 0: {
                                v = (int)(((float)this.b.e.e.g) * this.b.t() + 0.5f);
                                break;
                            }
                            case 1: {
                                v = (int)(((float)this.b.e.e.g) / this.b.t() + 0.5f);
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
        if(!this.e.j && this.d == s.e.b.h && (this.b.l == 0 && !this.b.X())) {
            f f0 = (f)this.h.l.get(0);
            f f1 = (f)this.i.l.get(0);
            int v1 = f0.g + this.h.f;
            int v2 = f1.g + this.i.f;
            this.h.d(v1);
            this.i.d(v2);
            this.e.d(v2 - v1);
            return;
        }
        if(!this.e.j && this.d == s.e.b.h && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
            f f2 = (f)this.h.l.get(0);
            int v3 = ((f)this.i.l.get(0)).g + this.i.f - (f2.g + this.h.f);
            g g1 = this.e;
            int v4 = g1.m;
            if(v3 < v4) {
                g1.d(v3);
            }
            else {
                g1.d(v4);
            }
        }
        if(!this.e.j) {
            return;
        }
        if(this.h.l.size() > 0 && this.i.l.size() > 0) {
            f f3 = (f)this.h.l.get(0);
            f f4 = (f)this.i.l.get(0);
            int v5 = f3.g + this.h.f;
            int v6 = f4.g + this.i.f;
            float f5 = this.b.K();
            if(f3 == f4) {
                v5 = f3.g;
                v6 = f4.g;
                f5 = 0.5f;
            }
            this.h.d(((int)(((float)v5) + 0.5f + ((float)(v6 - v5 - this.e.g)) * f5)));
            this.i.d(this.h.g + this.e.g);
        }
    }

    @Override  // t.m
    void d() {
        e e0 = this.b;
        if(e0.a) {
            this.e.d(e0.v());
        }
        if(!this.e.j) {
            this.d = this.b.M();
            if(this.b.S()) {
                this.l = new t.a(this);
            }
            s.e.b e$b0 = this.d;
            if(e$b0 != s.e.b.h) {
                if(e$b0 == s.e.b.i) {
                    e e1 = this.b.G();
                    if(e1 != null && e1.M() == s.e.b.f) {
                        int v = e1.v();
                        int v1 = this.b.C.c();
                        int v2 = this.b.E.c();
                        this.b(this.h, e1.f.h, this.b.C.c());
                        this.b(this.i, e1.f.i, -this.b.E.c());
                        this.e.d(v - v1 - v2);
                        return;
                    }
                }
                if(this.d == s.e.b.f) {
                    this.e.d(this.b.v());
                }
            }
        }
        else if(this.d == s.e.b.i) {
            e e2 = this.b.G();
            if(e2 != null && e2.M() == s.e.b.f) {
                this.b(this.h, e2.f.h, this.b.C.c());
                this.b(this.i, e2.f.i, -this.b.E.c());
                return;
            }
        }
        g g0 = this.e;
        boolean z = g0.j;
        if(z) {
            e e3 = this.b;
            if(e3.a) {
                s.d[] arr_d = e3.J;
                s.d d0 = arr_d[2];
                s.d d1 = d0.d;
                if(d1 != null && arr_d[3].d != null) {
                    if(e3.X()) {
                        this.h.f = this.b.J[2].c();
                        this.i.f = -this.b.J[3].c();
                    }
                    else {
                        f f0 = this.h(this.b.J[2]);
                        if(f0 != null) {
                            this.b(this.h, f0, this.b.J[2].c());
                        }
                        f f1 = this.h(this.b.J[3]);
                        if(f1 != null) {
                            this.b(this.i, f1, -this.b.J[3].c());
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    if(this.b.S()) {
                        this.b(this.k, this.h, this.b.n());
                    }
                }
                else if(d1 != null) {
                    f f2 = this.h(d0);
                    if(f2 != null) {
                        this.b(this.h, f2, this.b.J[2].c());
                        this.b(this.i, this.h, this.e.g);
                        if(this.b.S()) {
                            this.b(this.k, this.h, this.b.n());
                        }
                    }
                }
                else {
                    s.d d2 = arr_d[3];
                    if(d2.d == null) {
                        s.d d3 = arr_d[4];
                        if(d3.d != null) {
                            f f4 = this.h(d3);
                            if(f4 != null) {
                                this.b(this.k, f4, 0);
                                this.b(this.h, this.k, -this.b.n());
                                this.b(this.i, this.h, this.e.g);
                            }
                        }
                        else if(!(e3 instanceof i) && e3.G() != null && this.b.m(s.d.b.l).d == null) {
                            this.b(this.h, this.b.G().f.h, this.b.R());
                            this.b(this.i, this.h, this.e.g);
                            if(this.b.S()) {
                                this.b(this.k, this.h, this.b.n());
                            }
                        }
                    }
                    else {
                        f f3 = this.h(d2);
                        if(f3 != null) {
                            this.b(this.i, f3, -this.b.J[3].c());
                            this.b(this.h, this.i, -this.e.g);
                        }
                        if(this.b.S()) {
                            this.b(this.k, this.h, this.b.n());
                        }
                    }
                }
            }
            else {
                goto label_83;
            }
        }
        else {
        label_83:
            if(z || this.d != s.e.b.h) {
                g0.b(this);
            }
            else {
                e e4 = this.b;
                switch(e4.m) {
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
                        if(!e4.X()) {
                            e e6 = this.b;
                            if(e6.l != 3) {
                                g g2 = e6.e.e;
                                this.e.l.add(g2);
                                g2.k.add(this.e);
                                this.e.b = true;
                                this.e.k.add(this.h);
                                this.e.k.add(this.i);
                            }
                        }
                    }
                }
            }
            e e7 = this.b;
            s.d[] arr_d1 = e7.J;
            s.d d4 = arr_d1[2];
            s.d d5 = d4.d;
            if(d5 != null && arr_d1[3].d != null) {
                if(e7.X()) {
                    this.h.f = this.b.J[2].c();
                    this.i.f = -this.b.J[3].c();
                }
                else {
                    f f5 = this.h(this.b.J[2]);
                    f f6 = this.h(this.b.J[3]);
                    f5.b(this);
                    f6.b(this);
                    this.j = b.i;
                }
                if(this.b.S()) {
                    this.c(this.k, this.h, 1, this.l);
                }
            }
            else if(d5 == null) {
                s.d d6 = arr_d1[3];
                if(d6.d == null) {
                    s.d d7 = arr_d1[4];
                    if(d7.d != null) {
                        f f9 = this.h(d7);
                        if(f9 != null) {
                            this.b(this.k, f9, 0);
                            this.c(this.h, this.k, -1, this.l);
                            this.c(this.i, this.h, 1, this.e);
                        }
                    }
                    else if(!(e7 instanceof i) && e7.G() != null) {
                        this.b(this.h, this.b.G().f.h, this.b.R());
                        this.c(this.i, this.h, 1, this.e);
                        if(this.b.S()) {
                            this.c(this.k, this.h, 1, this.l);
                        }
                        s.e.b e$b2 = s.e.b.h;
                        if(this.d == e$b2 && this.b.t() > 0.0f) {
                            j j1 = this.b.e;
                            if(j1.d == e$b2) {
                                j1.e.k.add(this.e);
                                this.e.l.add(this.b.e.e);
                                this.e.a = this;
                            }
                        }
                    }
                }
                else {
                    f f8 = this.h(d6);
                    if(f8 != null) {
                        this.b(this.i, f8, -this.b.J[3].c());
                        this.c(this.h, this.i, -1, this.e);
                        if(this.b.S()) {
                            this.c(this.k, this.h, 1, this.l);
                        }
                    }
                }
            }
            else {
                f f7 = this.h(d4);
                if(f7 != null) {
                    this.b(this.h, f7, this.b.J[2].c());
                    this.c(this.i, this.h, 1, this.e);
                    if(this.b.S()) {
                        this.c(this.k, this.h, 1, this.l);
                    }
                    s.e.b e$b1 = s.e.b.h;
                    if(this.d == e$b1 && this.b.t() > 0.0f) {
                        j j0 = this.b.e;
                        if(j0.d == e$b1) {
                            j0.e.k.add(this.e);
                            this.e.l.add(this.b.e.e);
                            this.e.a = this;
                        }
                    }
                }
            }
            if(this.e.l.size() == 0) {
                this.e.c = true;
            }
        }
    }

    @Override  // t.m
    public void e() {
        f f0 = this.h;
        if(f0.j) {
            this.b.G0(f0.g);
        }
    }

    @Override  // t.m
    void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override  // t.m
    boolean m() {
        return this.d != s.e.b.h || this.b.m == 0;
    }

    void q() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    @Override
    public String toString() {
        return "VerticalRun " + this.b.r();
    }
}

