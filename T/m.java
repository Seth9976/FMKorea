package t;

import s.d.b;
import s.e;

public abstract class m implements d {
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
                a.a[b.k.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.j.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static enum t.m.b {
        NONE,
        START,
        END,
        CENTER;

    }

    public int a;
    e b;
    k c;
    protected s.e.b d;
    g e;
    public int f;
    boolean g;
    public f h;
    public f i;
    protected t.m.b j;

    public m(e e0) {
        this.e = new g(this);
        this.f = 0;
        this.g = false;
        this.h = new f(this);
        this.i = new f(this);
        this.j = t.m.b.f;
        this.b = e0;
    }

    @Override  // t.d
    public abstract void a(d arg1);

    protected final void b(f f0, f f1, int v) {
        f0.l.add(f1);
        f0.f = v;
        f1.k.add(f0);
    }

    protected final void c(f f0, f f1, int v, g g0) {
        f0.l.add(f1);
        f0.l.add(this.e);
        f0.h = v;
        f0.i = g0;
        f1.k.add(f0);
        g0.k.add(f0);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int v, int v1) {
        int v3;
        if(v1 == 0) {
            int v2 = this.b.p;
            v3 = v2 <= 0 ? Math.max(this.b.o, v) : Math.min(v2, v);
            return v3 == v ? v : v3;
        }
        int v4 = this.b.s;
        v3 = v4 <= 0 ? Math.max(this.b.r, v) : Math.min(v4, v);
        return v3 == v ? v : v3;
    }

    protected final f h(s.d d0) {
        s.d d1 = d0.d;
        if(d1 == null) {
            return null;
        }
        e e0 = d1.b;
        switch(a.a[d1.c.ordinal()]) {
            case 1: {
                return e0.e.h;
            }
            case 2: {
                return e0.e.i;
            }
            case 3: {
                return e0.f.h;
            }
            case 4: {
                return e0.f.k;
            }
            case 5: {
                return e0.f.i;
            }
            default: {
                return null;
            }
        }
    }

    protected final f i(s.d d0, int v) {
        s.d d1 = d0.d;
        if(d1 == null) {
            return null;
        }
        e e0 = d1.b;
        j j0 = v == 0 ? e0.e : e0.f;
        switch(a.a[d1.c.ordinal()]) {
            case 1: 
            case 3: {
                return j0.h;
            }
            case 2: 
            case 5: {
                return j0.i;
            }
            default: {
                return null;
            }
        }
    }

    // 去混淆评级： 低(20)
    public long j() {
        return this.e.j ? ((long)this.e.g) : 0L;
    }

    public boolean k() {
        return this.g;
    }

    private void l(int v, int v1) {
        switch(this.a) {
            case 0: {
                this.e.d(this.g(v1, v));
                return;
            }
            case 1: {
                int v2 = Math.min(this.g(this.e.m, v), v1);
                this.e.d(v2);
                return;
            }
            case 2: {
                e e0 = this.b.G();
                if(e0 != null) {
                    j j0 = v == 0 ? e0.e : e0.f;
                    g g0 = j0.e;
                    if(g0.j) {
                        this.e.d(this.g(((int)(((float)g0.g) * (v == 0 ? this.b.q : this.b.t) + 0.5f)), v));
                        return;
                    }
                }
                break;
            }
            case 3: {
                e e1 = this.b;
                j j1 = e1.e;
                if(j1.d != s.e.b.h || j1.a != 3 || (e1.f.d != s.e.b.h || e1.f.a != 3)) {
                    if(v == 0) {
                        j1 = e1.f;
                    }
                    if(j1.e.j) {
                        float f = e1.t();
                        this.e.d((v == 1 ? ((int)(((float)j1.e.g) / f + 0.5f)) : ((int)(f * ((float)j1.e.g) + 0.5f))));
                        return;
                    }
                }
                break;
            }
        }
    }

    abstract boolean m();

    protected void n(d d0, s.d d1, s.d d2, int v) {
        f f0 = this.h(d1);
        f f1 = this.h(d2);
        if(f0.j && f1.j) {
            int v1 = f0.g + d1.c();
            int v2 = f1.g - d2.c();
            int v3 = v2 - v1;
            if(!this.e.j && this.d == s.e.b.h) {
                this.l(v, v3);
            }
            g g0 = this.e;
            if(!g0.j) {
                return;
            }
            if(g0.g == v3) {
                this.h.d(v1);
                this.i.d(v2);
                return;
            }
            float f2 = v == 0 ? this.b.w() : this.b.K();
            if(f0 == f1) {
                v1 = f0.g;
                v2 = f1.g;
                f2 = 0.5f;
            }
            this.h.d(((int)(((float)v1) + 0.5f + ((float)(v2 - v1 - this.e.g)) * f2)));
            this.i.d(this.h.g + this.e.g);
        }
    }

    protected void o(d d0) {
    }

    protected void p(d d0) {
    }
}

