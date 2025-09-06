package t;

import java.util.ArrayList;
import s.f;

class k {
    public int a;
    public boolean b;
    m c;
    m d;
    ArrayList e;
    int f;
    int g;
    public static int h;

    public k(m m0, int v) {
        this.a = 0;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = new ArrayList();
        this.f = k.h;
        ++k.h;
        this.c = m0;
        this.d = m0;
        this.g = v;
    }

    public void a(m m0) {
        this.e.add(m0);
        this.d = m0;
    }

    public long b(f f0, int v) {
        m m0 = this.c;
        long v1 = 0L;
        if(m0 instanceof c) {
            if(((c)m0).f != v) {
                return 0L;
            }
        }
        else if(v == 0) {
            if(!(m0 instanceof j)) {
                return 0L;
            }
        }
        else if(!(m0 instanceof l)) {
            return 0L;
        }
        j j0 = v == 0 ? f0.e : f0.f;
        t.f f1 = j0.h;
        j j1 = v == 0 ? f0.e : f0.f;
        t.f f2 = j1.i;
        boolean z = m0.h.l.contains(f1);
        boolean z1 = this.c.i.l.contains(f2);
        long v2 = this.c.j();
        if(z && z1) {
            long v3 = this.d(this.c.h, 0L);
            long v4 = this.c(this.c.i, 0L);
            long v5 = v3 - v2;
            m m1 = this.c;
            int v6 = m1.i.f;
            if(v5 >= ((long)(-v6))) {
                v5 += (long)v6;
            }
            int v7 = m1.h.f;
            long v8 = -v4 - v2 - ((long)v7);
            float f3 = m1.b.o(v);
            if(Float.compare(f3, 0.0f) > 0) {
                v1 = (long)(((float)(v8 < ((long)v7) ? -v4 - v2 - ((long)v7) : v8 - ((long)v7))) / f3 + ((float)v5) / (1.0f - f3));
            }
            return ((long)this.c.h.f) + (((long)(((float)v1) * f3 + 0.5f)) + v2 + ((long)(((float)v1) * (1.0f - f3) + 0.5f))) - ((long)this.c.i.f);
        }
        if(z) {
            return Math.max(this.d(this.c.h, ((long)this.c.h.f)), ((long)this.c.h.f) + v2);
        }
        if(z1) {
            return Math.max(-this.c(this.c.i, ((long)this.c.i.f)), ((long)(-this.c.i.f)) + v2);
        }
        int v9 = this.c.i.f;
        return ((long)this.c.h.f) + this.c.j() - ((long)v9);
    }

    private long c(t.f f0, long v) {
        m m0 = f0.d;
        if(m0 instanceof i) {
            return v;
        }
        int v1 = f0.k.size();
        long v3 = v;
        for(int v2 = 0; v2 < v1; ++v2) {
            d d0 = (d)f0.k.get(v2);
            if(d0 instanceof t.f && ((t.f)d0).d != m0) {
                v3 = Math.min(v3, this.c(((t.f)d0), ((long)((t.f)d0).f) + v));
            }
        }
        if(f0 == m0.i) {
            long v4 = v - m0.j();
            return Math.min(Math.min(v3, this.c(m0.h, v4)), v4 - ((long)m0.h.f));
        }
        return v3;
    }

    private long d(t.f f0, long v) {
        m m0 = f0.d;
        if(m0 instanceof i) {
            return v;
        }
        int v1 = f0.k.size();
        long v3 = v;
        for(int v2 = 0; v2 < v1; ++v2) {
            d d0 = (d)f0.k.get(v2);
            if(d0 instanceof t.f && ((t.f)d0).d != m0) {
                v3 = Math.max(v3, this.d(((t.f)d0), ((long)((t.f)d0).f) + v));
            }
        }
        if(f0 == m0.h) {
            long v4 = v + m0.j();
            return Math.max(Math.max(v3, this.d(m0.i, v4)), v4 - ((long)m0.i.f));
        }
        return v3;
    }
}

