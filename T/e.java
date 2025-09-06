package t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import s.f;
import s.h;
import s.j;

public class e {
    private f a;
    private boolean b;
    private boolean c;
    private f d;
    private ArrayList e;
    private ArrayList f;
    private b g;
    private a h;
    ArrayList i;

    public e(f f0) {
        this.b = true;
        this.c = true;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = null;
        this.h = new a();
        this.i = new ArrayList();
        this.a = f0;
        this.d = f0;
    }

    private void a(t.f f0, int v, int v1, t.f f1, ArrayList arrayList0, k k0) {
        m m0 = f0.d;
        if(m0.c == null && (m0 != this.a.e && m0 != this.a.f)) {
            if(k0 == null) {
                k0 = new k(m0, v1);
                arrayList0.add(k0);
            }
            m0.c = k0;
            k0.a(m0);
            for(Object object0: m0.h.k) {
                d d0 = (d)object0;
                if(d0 instanceof t.f) {
                    this.a(((t.f)d0), v, 0, f1, arrayList0, k0);
                }
            }
            for(Object object1: m0.i.k) {
                d d1 = (d)object1;
                if(d1 instanceof t.f) {
                    this.a(((t.f)d1), v, 1, f1, arrayList0, k0);
                }
            }
            if(v == 1 && m0 instanceof l) {
                for(Object object2: ((l)m0).k.k) {
                    d d2 = (d)object2;
                    if(d2 instanceof t.f) {
                        this.a(((t.f)d2), 1, 2, f1, arrayList0, k0);
                    }
                }
            }
            for(Object object3: m0.h.l) {
                if(((t.f)object3) == f1) {
                    k0.b = true;
                }
                this.a(((t.f)object3), v, 0, f1, arrayList0, k0);
            }
            for(Object object4: m0.i.l) {
                if(((t.f)object4) == f1) {
                    k0.b = true;
                }
                this.a(((t.f)object4), v, 1, f1, arrayList0, k0);
            }
            if(v == 1 && m0 instanceof l) {
                for(Object object5: ((l)m0).k.l) {
                    this.a(((t.f)object5), 1, 2, f1, arrayList0, k0);
                }
            }
        }
    }

    private boolean b(f f0) {
        s.e.b e$b13;
        int v7;
        s.e.b e$b12;
        int v5;
        for(Object object0: f0.w0) {
            s.e e0 = (s.e)object0;
            s.e.b[] arr_e$b = e0.M;
            s.e.b e$b0 = arr_e$b[0];
            s.e.b e$b1 = arr_e$b[1];
            if(e0.O() == 8) {
                e0.a = true;
            }
            else {
                if(Float.compare(e0.q, 1.0f) < 0 && e$b0 == s.e.b.h) {
                    e0.l = 2;
                }
                if(e0.t < 1.0f && e$b1 == s.e.b.h) {
                    e0.m = 2;
                }
                if(Float.compare(e0.t(), 0.0f) > 0) {
                    s.e.b e$b2 = s.e.b.h;
                    if(e$b0 == e$b2 && (e$b1 == s.e.b.g || e$b1 == s.e.b.f)) {
                        e0.l = 3;
                    }
                    else if(e$b1 == e$b2 && (e$b0 == s.e.b.g || e$b0 == s.e.b.f)) {
                        e0.m = 3;
                    }
                    else if(e$b0 == e$b2 && e$b1 == e$b2) {
                        if(e0.l == 0) {
                            e0.l = 3;
                        }
                        if(e0.m == 0) {
                            e0.m = 3;
                        }
                    }
                }
                s.e.b e$b3 = s.e.b.h;
                if(e$b0 == e$b3 && e0.l == 1 && (e0.B.d == null || e0.D.d == null)) {
                    e$b0 = s.e.b.g;
                }
                if(e$b1 == e$b3 && e0.m == 1 && (e0.C.d == null || e0.E.d == null)) {
                    e$b1 = s.e.b.g;
                }
                e0.e.d = e$b0;
                int v = e0.l;
                e0.e.a = v;
                e0.f.d = e$b1;
                int v1 = e0.m;
                e0.f.a = v1;
                s.e.b e$b4 = s.e.b.i;
                if(e$b0 != e$b4 && e$b0 != s.e.b.f && e$b0 != s.e.b.g || e$b1 != e$b4 && e$b1 != s.e.b.f && e$b1 != s.e.b.g) {
                    if(e$b0 == e$b3) {
                        s.e.b e$b5 = s.e.b.g;
                        if(e$b1 == e$b5 || e$b1 == s.e.b.f) {
                            if(v == 3) {
                                if(e$b1 == e$b5) {
                                    this.l(e0, e$b5, 0, e$b5, 0);
                                }
                                int v2 = e0.v();
                                this.l(e0, s.e.b.f, ((int)(((float)v2) * e0.Q + 0.5f)), s.e.b.f, v2);
                                e0.e.e.d(e0.P());
                                e0.f.e.d(e0.v());
                                e0.a = true;
                                continue;
                            }
                            else if(v == 1) {
                                this.l(e0, e$b5, 0, e$b1, 0);
                                e0.e.e.m = e0.P();
                                continue;
                            }
                            else if(v == 2) {
                                s.e.b e$b6 = f0.M[0];
                                s.e.b e$b7 = s.e.b.f;
                                if(e$b6 == e$b7 || e$b6 == e$b4) {
                                    this.l(e0, e$b7, ((int)(e0.q * ((float)f0.P()) + 0.5f)), e$b1, e0.v());
                                    e0.e.e.d(e0.P());
                                    e0.f.e.d(e0.v());
                                    e0.a = true;
                                    continue;
                                }
                            }
                            else if(e0.J[0].d == null || e0.J[1].d == null) {
                                this.l(e0, e$b5, 0, e$b1, 0);
                                e0.e.e.d(e0.P());
                                e0.f.e.d(e0.v());
                                e0.a = true;
                                continue;
                            }
                        }
                    }
                    if(e$b1 == e$b3) {
                        s.e.b e$b8 = s.e.b.g;
                        if(e$b0 == e$b8 || e$b0 == s.e.b.f) {
                            if(v1 == 3) {
                                if(e$b0 == e$b8) {
                                    this.l(e0, e$b8, 0, e$b8, 0);
                                }
                                int v3 = e0.P();
                                this.l(e0, s.e.b.f, v3, s.e.b.f, ((int)(((float)v3) * (e0.u() == -1 ? 1.0f / e0.Q : e0.Q) + 0.5f)));
                                e0.e.e.d(e0.P());
                                e0.f.e.d(e0.v());
                                e0.a = true;
                                continue;
                            }
                            else if(v1 == 1) {
                                this.l(e0, e$b0, 0, e$b8, 0);
                                e0.f.e.m = e0.v();
                                continue;
                            }
                            else if(v1 == 2) {
                                s.e.b e$b9 = f0.M[1];
                                s.e.b e$b10 = s.e.b.f;
                                if(e$b9 == e$b10 || e$b9 == e$b4) {
                                    this.l(e0, e$b0, e0.P(), e$b10, ((int)(e0.t * ((float)f0.v()) + 0.5f)));
                                    e0.e.e.d(e0.P());
                                    e0.f.e.d(e0.v());
                                    e0.a = true;
                                    continue;
                                }
                            }
                            else if(e0.J[2].d == null || e0.J[3].d == null) {
                                this.l(e0, e$b8, 0, e$b1, 0);
                                e0.e.e.d(e0.P());
                                e0.f.e.d(e0.v());
                                e0.a = true;
                                continue;
                            }
                        }
                    }
                    if(e$b0 != e$b3 || e$b1 != e$b3) {
                        continue;
                    }
                    if(v == 1 || v1 == 1) {
                        this.l(e0, s.e.b.g, 0, s.e.b.g, 0);
                        e0.e.e.m = e0.P();
                        e0.f.e.m = e0.v();
                    }
                    else {
                        if(v1 != 2 || v != 2) {
                            continue;
                        }
                        s.e.b e$b11 = s.e.b.f;
                        if(f0.M[0] != e$b11 || f0.M[1] != e$b11) {
                            continue;
                        }
                        this.l(e0, e$b11, ((int)(e0.q * ((float)f0.P()) + 0.5f)), e$b11, ((int)(e0.t * ((float)f0.v()) + 0.5f)));
                        e0.e.e.d(e0.P());
                        e0.f.e.d(e0.v());
                        e0.a = true;
                    }
                }
                else {
                    int v4 = e0.P();
                    if(e$b0 == e$b4) {
                        v5 = f0.P() - e0.B.e - e0.D.e;
                        e$b12 = s.e.b.f;
                    }
                    else {
                        v5 = v4;
                        e$b12 = e$b0;
                    }
                    int v6 = e0.v();
                    if(e$b1 == e$b4) {
                        v7 = f0.v() - e0.C.e - e0.E.e;
                        e$b13 = s.e.b.f;
                    }
                    else {
                        v7 = v6;
                        e$b13 = e$b1;
                    }
                    this.l(e0, e$b12, v5, e$b13, v7);
                    e0.e.e.d(e0.P());
                    e0.f.e.d(e0.v());
                    e0.a = true;
                }
            }
        }
        return false;
    }

    public void c() {
        this.d(this.e);
        this.i.clear();
        k.h = 0;
        this.i(this.a.e, 0, this.i);
        this.i(this.a.f, 1, this.i);
        this.b = false;
    }

    public void d(ArrayList arrayList0) {
        arrayList0.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList0.add(this.d.e);
        arrayList0.add(this.d.f);
        Collection collection0 = null;
        for(Object object0: this.d.w0) {
            s.e e0 = (s.e)object0;
            if(e0 instanceof h) {
                arrayList0.add(new t.h(e0));
            }
            else {
                if(e0.V()) {
                    if(e0.c == null) {
                        e0.c = new c(e0, 0);
                    }
                    if(collection0 == null) {
                        collection0 = new HashSet();
                    }
                    ((HashSet)collection0).add(e0.c);
                }
                else {
                    arrayList0.add(e0.e);
                }
                if(e0.X()) {
                    if(e0.d == null) {
                        e0.d = new c(e0, 1);
                    }
                    if(collection0 == null) {
                        collection0 = new HashSet();
                    }
                    ((HashSet)collection0).add(e0.d);
                }
                else {
                    arrayList0.add(e0.f);
                }
                if(e0 instanceof j) {
                    arrayList0.add(new i(e0));
                }
            }
        }
        if(collection0 != null) {
            arrayList0.addAll(collection0);
        }
        for(Object object1: arrayList0) {
            ((m)object1).f();
        }
        for(Object object2: arrayList0) {
            m m0 = (m)object2;
            if(m0.b != this.d) {
                m0.d();
            }
        }
    }

    private int e(f f0, int v) {
        int v1 = this.i.size();
        long v2 = 0L;
        for(int v3 = 0; v3 < v1; ++v3) {
            v2 = Math.max(v2, ((k)this.i.get(v3)).b(f0, v));
        }
        return (int)v2;
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z1 = false;
        if(this.b || this.c) {
            for(Object object0: this.a.w0) {
                ((s.e)object0).a = false;
                ((s.e)object0).e.r();
                ((s.e)object0).f.q();
            }
            f f0 = this.a;
            f0.a = false;
            f0.e.r();
            this.a.f.q();
            this.c = false;
        }
        if(this.b(this.d)) {
            return false;
        }
        this.a.F0(0);
        this.a.G0(0);
        s.e.b e$b0 = this.a.s(0);
        s.e.b e$b1 = this.a.s(1);
        if(this.b) {
            this.c();
        }
        int v = this.a.Q();
        int v1 = this.a.R();
        this.a.e.h.d(v);
        this.a.f.h.d(v1);
        this.m();
        if(e$b0 == s.e.b.g || e$b1 == s.e.b.g) {
            if(z) {
                for(Object object1: this.e) {
                    if(!((m)object1).m()) {
                        z = false;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(z && e$b0 == s.e.b.g) {
                this.a.l0(s.e.b.f);
                this.a.E0(this.e(this.a, 0));
                this.a.e.e.d(this.a.P());
            }
            if(z && e$b1 == s.e.b.g) {
                this.a.A0(s.e.b.f);
                this.a.h0(this.e(this.a, 1));
                this.a.f.e.d(this.a.v());
            }
        }
        f f1 = this.a;
        s.e.b e$b2 = f1.M[0];
        s.e.b e$b3 = s.e.b.f;
        if(e$b2 == e$b3 || e$b2 == s.e.b.i) {
            int v2 = f1.P() + v;
            this.a.e.i.d(v2);
            this.a.e.e.d(v2 - v);
            this.m();
            f f2 = this.a;
            s.e.b e$b4 = f2.M[1];
            if(e$b4 == e$b3 || e$b4 == s.e.b.i) {
                int v3 = f2.v() + v1;
                this.a.f.i.d(v3);
                this.a.f.e.d(v3 - v1);
            }
            this.m();
            z2 = true;
        }
        else {
            z2 = false;
        }
        for(Object object2: this.e) {
            m m0 = (m)object2;
            if(m0.b != this.a || m0.g) {
                m0.e();
            }
        }
        for(Object object3: this.e) {
            m m1 = (m)object3;
            if(!z2 && m1.b == this.a || m1.h.j && (m1.i.j || m1 instanceof t.h) && (m1.e.j || m1 instanceof c || m1 instanceof t.h)) {
                continue;
            }
            this.a.l0(e$b0);
            this.a.A0(e$b1);
            return z1;
        }
        this.a.l0(e$b0);
        this.a.A0(e$b1);
        return true;
    }

    public boolean g(boolean z) {
        if(this.b) {
            for(Object object0: this.a.w0) {
                ((s.e)object0).a = false;
                ((s.e)object0).e.e.j = false;
                ((s.e)object0).e.g = false;
                ((s.e)object0).e.r();
                ((s.e)object0).f.e.j = false;
                ((s.e)object0).f.g = false;
                ((s.e)object0).f.q();
            }
            f f0 = this.a;
            f0.a = false;
            f0.e.e.j = false;
            f0.e.g = false;
            f0.e.r();
            this.a.f.e.j = false;
            this.a.f.g = false;
            this.a.f.q();
            this.c();
        }
        if(this.b(this.d)) {
            return false;
        }
        this.a.F0(0);
        this.a.G0(0);
        this.a.e.h.d(0);
        this.a.f.h.d(0);
        return true;
    }

    public boolean h(boolean z, int v) {
        boolean z2;
        boolean z1 = false;
        s.e.b e$b0 = this.a.s(0);
        s.e.b e$b1 = this.a.s(1);
        int v1 = this.a.Q();
        int v2 = this.a.R();
        if(z && (e$b0 == s.e.b.g || e$b1 == s.e.b.g)) {
            for(Object object0: this.e) {
                if(((m)object0).f == v && !((m)object0).m()) {
                    z = false;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(v != 0) {
                if(z && e$b1 == s.e.b.g) {
                    this.a.A0(s.e.b.f);
                    this.a.h0(this.e(this.a, 1));
                    this.a.f.e.d(this.a.v());
                }
            }
            else if(z && e$b0 == s.e.b.g) {
                this.a.l0(s.e.b.f);
                this.a.E0(this.e(this.a, 0));
                this.a.e.e.d(this.a.P());
            }
        }
        if(v == 0) {
            f f0 = this.a;
            s.e.b e$b2 = f0.M[0];
            if(e$b2 != s.e.b.f && e$b2 != s.e.b.i) {
                z2 = false;
            }
            else {
                int v3 = f0.P() + v1;
                this.a.e.i.d(v3);
                this.a.e.e.d(v3 - v1);
                z2 = true;
            }
        }
        else {
            f f1 = this.a;
            s.e.b e$b3 = f1.M[1];
            if(e$b3 == s.e.b.f || e$b3 == s.e.b.i) {
                int v4 = f1.v() + v2;
                this.a.f.i.d(v4);
                this.a.f.e.d(v4 - v2);
                z2 = true;
            }
            else {
                z2 = false;
            }
        }
        this.m();
        for(Object object1: this.e) {
            m m0 = (m)object1;
            if(m0.f == v && (m0.b != this.a || m0.g)) {
                m0.e();
            }
        }
        for(Object object2: this.e) {
            m m1 = (m)object2;
            if(m1.f != v || !z2 && m1.b == this.a || m1.h.j && m1.i.j && (m1 instanceof c || m1.e.j)) {
                continue;
            }
            this.a.l0(e$b0);
            this.a.A0(e$b1);
            return z1;
        }
        this.a.l0(e$b0);
        this.a.A0(e$b1);
        return true;
    }

    private void i(m m0, int v, ArrayList arrayList0) {
        for(Object object0: m0.h.k) {
            d d0 = (d)object0;
            if(d0 instanceof t.f) {
                this.a(((t.f)d0), v, 0, m0.i, arrayList0, null);
            }
            else if(d0 instanceof m) {
                this.a(((m)d0).h, v, 0, m0.i, arrayList0, null);
            }
        }
        for(Object object1: m0.i.k) {
            d d1 = (d)object1;
            if(d1 instanceof t.f) {
                this.a(((t.f)d1), v, 1, m0.h, arrayList0, null);
            }
            else if(d1 instanceof m) {
                this.a(((m)d1).i, v, 1, m0.h, arrayList0, null);
            }
        }
        if(v == 1) {
            for(Object object2: ((l)m0).k.k) {
                d d2 = (d)object2;
                if(d2 instanceof t.f) {
                    this.a(((t.f)d2), 1, 2, null, arrayList0, null);
                }
            }
        }
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.c = true;
    }

    private void l(s.e e0, s.e.b e$b0, int v, s.e.b e$b1, int v1) {
        this.h.a = e$b0;
        this.h.b = e$b1;
        this.h.c = v;
        this.h.d = v1;
        this.g.b(e0, this.h);
        e0.E0(this.h.e);
        e0.h0(this.h.f);
        e0.g0(this.h.h);
        e0.b0(this.h.g);
    }

    public void m() {
        for(Object object0: this.a.w0) {
            s.e e0 = (s.e)object0;
            if(!e0.a) {
                s.e.b[] arr_e$b = e0.M;
                boolean z = false;
                s.e.b e$b0 = arr_e$b[0];
                s.e.b e$b1 = arr_e$b[1];
                s.e.b e$b2 = s.e.b.g;
                boolean z1 = e$b0 == e$b2 || e$b0 == s.e.b.h && e0.l == 1;
                if(e$b1 == e$b2 || e$b1 == s.e.b.h && e0.m == 1) {
                    z = true;
                }
                g g0 = e0.e.e;
                boolean z2 = g0.j;
                g g1 = e0.f.e;
                boolean z3 = g1.j;
                if(z2 && z3) {
                    this.l(e0, s.e.b.f, g0.g, s.e.b.f, g1.g);
                    e0.a = true;
                }
                else if(z2 && z) {
                    this.l(e0, s.e.b.f, g0.g, e$b2, g1.g);
                    if(e$b1 == s.e.b.h) {
                        e0.f.e.m = e0.v();
                    }
                    else {
                        e0.f.e.d(e0.v());
                        e0.a = true;
                    }
                }
                else if(z3 && z1) {
                    this.l(e0, e$b2, g0.g, s.e.b.f, g1.g);
                    if(e$b0 == s.e.b.h) {
                        e0.e.e.m = e0.P();
                    }
                    else {
                        e0.e.e.d(e0.P());
                        e0.a = true;
                    }
                }
                if(e0.a) {
                    g g2 = e0.f.l;
                    if(g2 != null) {
                        g2.d(e0.n());
                    }
                }
            }
        }
    }

    public void n(b b$b0) {
        this.g = b$b0;
    }
}

