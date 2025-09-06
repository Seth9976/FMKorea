package r;

import java.util.Arrays;
import java.util.Comparator;

public class h extends b {
    class r.h.b implements Comparable {
        i f;
        h g;
        final h h;

        public r.h.b(h h1) {
            this.g = h1;
        }

        public boolean b(i i0, float f) {
            boolean z = true;
            if(this.f.a) {
                for(int v1 = 0; v1 < 9; ++v1) {
                    float[] arr_f = this.f.i;
                    float f1 = arr_f[v1] + i0.i[v1] * f;
                    arr_f[v1] = f1;
                    if(Math.abs(f1) < 0.0001f) {
                        this.f.i[v1] = 0.0f;
                    }
                    else {
                        z = false;
                    }
                }
                if(z) {
                    h.this.G(this.f);
                }
                return false;
            }
            for(int v = 0; v < 9; ++v) {
                float f2 = i0.i[v];
                if(f2 == 0.0f) {
                    this.f.i[v] = 0.0f;
                }
                else {
                    this.f.i[v] = Math.abs(f2 * f) < 0.0001f ? 0.0f : f2 * f;
                }
            }
            return true;
        }

        @Override
        public int compareTo(Object object0) {
            return this.f.c - ((i)object0).c;
        }

        public void f(i i0) {
            this.f = i0;
        }

        public final boolean g() {
            for(int v = 8; v >= 0; --v) {
                float f = this.f.i[v];
                if(f > 0.0f) {
                    return false;
                }
                if(f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean h(i i0) {
            int v = 8;
            while(v >= 0) {
                float f = i0.i[v];
                float f1 = this.f.i[v];
                if(f1 == f) {
                    --v;
                    continue;
                }
                return f1 < f;
            }
            return false;
        }

        public void i() {
            Arrays.fill(this.f.i, 0.0f);
        }

        @Override
        public String toString() {
            String s = "[ ";
            if(this.f != null) {
                for(int v = 0; v < 9; ++v) {
                    s = s + this.f.i[v] + " ";
                }
            }
            return s + "] " + this.f;
        }
    }

    private int g;
    private i[] h;
    private i[] i;
    private int j;
    r.h.b k;
    c l;

    public h(c c0) {
        super(c0);
        this.g = 0x80;
        this.h = new i[0x80];
        this.i = new i[0x80];
        this.j = 0;
        this.k = new r.h.b(this, this);
        this.l = c0;
    }

    @Override  // r.b
    public void C(b b0, boolean z) {
        i i0 = b0.a;
        if(i0 == null) {
            return;
        }
        a b$a0 = b0.e;
        int v = b$a0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            i i1 = b$a0.c(v1);
            float f = b$a0.e(v1);
            this.k.f(i1);
            if(this.k.b(i0, f)) {
                this.F(i1);
            }
            this.b += b0.b * f;
        }
        this.G(i0);
    }

    private final void F(i i0) {
        class r.h.a implements Comparator {
            final h f;

            public int a(i i0, i i1) {
                return i0.c - i1.c;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.a(((i)object0), ((i)object1));
            }
        }

        int v3;
        i[] arr_i = this.h;
        if(this.j + 1 > arr_i.length) {
            i[] arr_i1 = (i[])Arrays.copyOf(arr_i, arr_i.length * 2);
            this.h = arr_i1;
            this.i = (i[])Arrays.copyOf(arr_i1, arr_i1.length * 2);
        }
        i[] arr_i2 = this.h;
        int v = this.j;
        arr_i2[v] = i0;
        this.j = v + 1;
        if(v + 1 > 1 && arr_i2[v].c > i0.c) {
            for(int v2 = 0; true; ++v2) {
                v3 = this.j;
                if(v2 >= v3) {
                    break;
                }
                this.i[v2] = this.h[v2];
            }
            Arrays.sort(this.i, 0, v3, new r.h.a(this));
            for(int v1 = 0; v1 < this.j; ++v1) {
                this.h[v1] = this.i[v1];
            }
        }
        i0.a = true;
        i0.a(this);
    }

    private final void G(i i0) {
        int v1;
        for(int v = 0; v < this.j; ++v) {
            if(this.h[v] == i0) {
                while(true) {
                    v1 = this.j;
                    if(v >= v1 - 1) {
                        break;
                    }
                    this.h[v] = this.h[v + 1];
                    ++v;
                }
                this.j = v1 - 1;
                i0.a = false;
                return;
            }
        }
    }

    @Override  // r.b
    public void b(i i0) {
        this.k.f(i0);
        this.k.i();
        i0.i[i0.e] = 1.0f;
        this.F(i0);
    }

    @Override  // r.b
    public i c(d d0, boolean[] arr_z) {
        int v1 = -1;
        for(int v = 0; v < this.j; ++v) {
            i i0 = this.h[v];
            if(!arr_z[i0.c]) {
                this.k.f(i0);
                if(v1 != -1) {
                    if(this.k.h(this.h[v1])) {
                        v1 = v;
                    }
                }
                else if(this.k.g()) {
                    v1 = v;
                }
            }
        }
        return v1 == -1 ? null : this.h[v1];
    }

    @Override  // r.b
    public void clear() {
        this.j = 0;
        this.b = 0.0f;
    }

    @Override  // r.b
    public String toString() {
        String s = " goal -> (" + this.b + ") : ";
        for(int v = 0; v < this.j; ++v) {
            this.k.f(this.h[v]);
            s = s + this.k + " ";
        }
        return s;
    }
}

