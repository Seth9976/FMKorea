package t;

import s.a;
import s.e;

class i extends m {
    public i(e e0) {
        super(e0);
    }

    @Override  // t.m
    public void a(d d0) {
        a a0 = (a)this.b;
        int v = a0.L0();
        int v1 = 0;
        int v2 = -1;
        for(Object object0: this.h.l) {
            int v3 = ((f)object0).g;
            if(v2 == -1 || v3 < v2) {
                v2 = v3;
            }
            if(v1 < v3) {
                v1 = v3;
            }
        }
        if(v != 0 && v != 2) {
            this.h.d(v1 + a0.M0());
            return;
        }
        this.h.d(v2 + a0.M0());
    }

    @Override  // t.m
    void d() {
        e e0 = this.b;
        if(e0 instanceof a) {
            this.h.b = true;
            boolean z = ((a)e0).K0();
            int v = 0;
            switch(((a)e0).L0()) {
                case 0: {
                    this.h.e = t.f.a.i;
                    while(v < ((a)e0).x0) {
                        e e4 = ((a)e0).w0[v];
                        if(z || e4.O() != 8) {
                            f f3 = e4.e.h;
                            f3.k.add(this.h);
                            this.h.l.add(f3);
                        }
                        ++v;
                    }
                    this.q(this.b.e.h);
                    this.q(this.b.e.i);
                    break;
                }
                case 1: {
                    this.h.e = t.f.a.j;
                    while(v < ((a)e0).x0) {
                        e e1 = ((a)e0).w0[v];
                        if(z || e1.O() != 8) {
                            f f0 = e1.e.i;
                            f0.k.add(this.h);
                            this.h.l.add(f0);
                        }
                        ++v;
                    }
                    this.q(this.b.e.h);
                    this.q(this.b.e.i);
                    return;
                }
                case 2: {
                    this.h.e = t.f.a.k;
                    while(v < ((a)e0).x0) {
                        e e2 = ((a)e0).w0[v];
                        if(z || e2.O() != 8) {
                            f f1 = e2.f.h;
                            f1.k.add(this.h);
                            this.h.l.add(f1);
                        }
                        ++v;
                    }
                    this.q(this.b.f.h);
                    this.q(this.b.f.i);
                    return;
                }
                case 3: {
                    this.h.e = t.f.a.l;
                    while(v < ((a)e0).x0) {
                        e e3 = ((a)e0).w0[v];
                        if(z || e3.O() != 8) {
                            f f2 = e3.f.i;
                            f2.k.add(this.h);
                            this.h.l.add(f2);
                        }
                        ++v;
                    }
                    this.q(this.b.f.h);
                    this.q(this.b.f.i);
                }
            }
        }
    }

    @Override  // t.m
    public void e() {
        e e0 = this.b;
        if(e0 instanceof a) {
            switch(((a)e0).L0()) {
                case 0: 
                case 1: {
                    this.b.F0(this.h.g);
                    break;
                }
                default: {
                    this.b.G0(this.h.g);
                }
            }
        }
    }

    @Override  // t.m
    void f() {
        this.c = null;
        this.h.c();
    }

    @Override  // t.m
    boolean m() {
        return false;
    }

    private void q(f f0) {
        this.h.k.add(f0);
        f0.l.add(this.h);
    }
}

