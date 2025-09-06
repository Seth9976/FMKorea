package s;

import java.util.ArrayList;

public class c {
    protected e a;
    protected e b;
    protected e c;
    protected e d;
    protected e e;
    protected e f;
    protected e g;
    protected ArrayList h;
    protected int i;
    protected int j;
    protected float k;
    int l;
    int m;
    int n;
    boolean o;
    private int p;
    private boolean q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    private boolean v;

    public c(e e0, int v, boolean z) {
        this.k = 0.0f;
        this.a = e0;
        this.p = v;
        this.q = z;
    }

    public void a() {
        if(!this.v) {
            this.b();
        }
        this.v = true;
    }

    private void b() {
        int v = this.p * 2;
        e e0 = this.a;
        boolean z = true;
        this.o = true;
        e e1 = e0;
        boolean z1 = false;
        while(!z1) {
            ++this.i;
            int v1 = this.p;
            e e2 = null;
            e0.s0[v1] = null;
            e0.r0[v1] = null;
            if(e0.O() != 8) {
                ++this.l;
                b e$b0 = b.h;
                if(e0.s(this.p) != e$b0) {
                    this.m += e0.A(this.p);
                }
                this.m = this.m + e0.J[v].c() + e0.J[v + 1].c();
                this.n = this.n + e0.J[v].c() + e0.J[v + 1].c();
                if(this.b == null) {
                    this.b = e0;
                }
                this.d = e0;
                int v2 = this.p;
                if(e0.M[v2] == e$b0) {
                    switch(e0.n[v2]) {
                        case 0: 
                        case 2: 
                        case 3: {
                            ++this.j;
                            float f = e0.q0[v2];
                            if(f > 0.0f) {
                                this.k += f;
                            }
                            if(c.c(e0, v2)) {
                                if(f < 0.0f) {
                                    this.r = true;
                                }
                                else {
                                    this.s = true;
                                }
                                if(this.h == null) {
                                    this.h = new ArrayList();
                                }
                                this.h.add(e0);
                            }
                            if(this.f == null) {
                                this.f = e0;
                            }
                            e e3 = this.g;
                            if(e3 != null) {
                                e3.r0[this.p] = e0;
                            }
                            this.g = e0;
                        }
                    }
                    if(this.p != 0) {
                        if(e0.m != 0) {
                            this.o = false;
                        }
                        else if(e0.r != 0 || e0.s != 0) {
                            this.o = false;
                        }
                    }
                    else if(e0.l != 0) {
                        this.o = false;
                    }
                    else if(e0.o != 0 || e0.p != 0) {
                        this.o = false;
                    }
                    if(e0.Q != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if(e1 != e0) {
                e1.s0[this.p] = e0;
            }
            d d0 = e0.J[v + 1].d;
            if(d0 != null) {
                e e4 = d0.b;
                d d1 = e4.J[v].d;
                if(d1 != null && d1.b == e0) {
                    e2 = e4;
                }
            }
            if(e2 == null) {
                e2 = e0;
                z1 = true;
            }
            e1 = e0;
            e0 = e2;
        }
        e e5 = this.b;
        if(e5 != null) {
            this.m -= e5.J[v].c();
        }
        e e6 = this.d;
        if(e6 != null) {
            this.m -= e6.J[v + 1].c();
        }
        this.c = e0;
        this.e = this.p != 0 || !this.q ? this.a : e0;
        if(!this.s || !this.r) {
            z = false;
        }
        this.t = z;
    }

    private static boolean c(e e0, int v) {
        if(e0.O() != 8 && e0.M[v] == b.h) {
            switch(e0.n[v]) {
                case 0: 
                case 3: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }
}

