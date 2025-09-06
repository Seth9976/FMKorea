package t;

import s.e;

class h extends m {
    public h(e e0) {
        super(e0);
        e0.e.f();
        e0.f.f();
        this.f = ((s.h)e0).K0();
    }

    @Override  // t.m
    public void a(d d0) {
        f f0 = this.h;
        if(!f0.c) {
            return;
        }
        if(f0.j) {
            return;
        }
        float f1 = (float)((f)f0.l.get(0)).g;
        float f2 = ((s.h)this.b).N0();
        this.h.d(((int)(f1 * f2 + 0.5f)));
    }

    @Override  // t.m
    void d() {
        s.h h0 = (s.h)this.b;
        int v = h0.L0();
        int v1 = h0.M0();
        if(h0.K0() == 1) {
            if(v != -1) {
                this.h.l.add(this.b.N.e.h);
                this.b.N.e.h.k.add(this.h);
                this.h.f = v;
            }
            else if(v1 == -1) {
                this.h.b = true;
                this.h.l.add(this.b.N.e.i);
                this.b.N.e.i.k.add(this.h);
            }
            else {
                this.h.l.add(this.b.N.e.i);
                this.b.N.e.i.k.add(this.h);
                this.h.f = -v1;
            }
            this.q(this.b.e.h);
            this.q(this.b.e.i);
            return;
        }
        if(v != -1) {
            this.h.l.add(this.b.N.f.h);
            this.b.N.f.h.k.add(this.h);
            this.h.f = v;
        }
        else if(v1 == -1) {
            this.h.b = true;
            this.h.l.add(this.b.N.f.i);
            this.b.N.f.i.k.add(this.h);
        }
        else {
            this.h.l.add(this.b.N.f.i);
            this.b.N.f.i.k.add(this.h);
            this.h.f = -v1;
        }
        this.q(this.b.f.h);
        this.q(this.b.f.i);
    }

    @Override  // t.m
    public void e() {
        if(((s.h)this.b).K0() == 1) {
            this.b.F0(this.h.g);
            return;
        }
        this.b.G0(this.h.g);
    }

    @Override  // t.m
    void f() {
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

