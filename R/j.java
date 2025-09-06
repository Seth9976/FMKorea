package r;

import java.util.Arrays;

public class j implements a {
    private final int a;
    private int b;
    private int c;
    int[] d;
    int[] e;
    int[] f;
    float[] g;
    int[] h;
    int[] i;
    int j;
    int k;
    private final b l;
    protected final c m;
    private static float n = 0.001f;

    static {
    }

    j(b b0, c c0) {
        this.a = -1;
        this.b = 16;
        this.c = 16;
        this.d = new int[16];
        this.e = new int[16];
        this.f = new int[16];
        this.g = new float[16];
        this.h = new int[16];
        this.i = new int[16];
        this.j = 0;
        this.k = -1;
        this.l = b0;
        this.m = c0;
        this.clear();
    }

    @Override  // r.b$a
    public float a(b b0, boolean z) {
        float f = this.g(b0.a);
        this.i(b0.a, z);
        j j0 = (j)b0.e;
        int v = j0.b();
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            int v3 = j0.f[v2];
            if(v3 != -1) {
                this.j(this.m.d[v3], j0.g[v2] * f, z);
                ++v1;
            }
        }
        return f;
    }

    @Override  // r.b$a
    public int b() {
        return this.j;
    }

    @Override  // r.b$a
    public i c(int v) {
        int v1 = this.j;
        if(v1 == 0) {
            return null;
        }
        int v2 = this.k;
        for(int v3 = 0; v3 < v1; ++v3) {
            if(v3 == v && v2 != -1) {
                return this.m.d[this.f[v2]];
            }
            v2 = this.i[v2];
            if(v2 == -1) {
                break;
            }
        }
        return null;
    }

    @Override  // r.b$a
    public void clear() {
        int v = this.j;
        for(int v1 = 0; v1 < v; ++v1) {
            i i0 = this.c(v1);
            if(i0 != null) {
                i0.c(this.l);
            }
        }
        for(int v2 = 0; v2 < this.b; ++v2) {
            this.f[v2] = -1;
            this.e[v2] = -1;
        }
        for(int v3 = 0; v3 < this.c; ++v3) {
            this.d[v3] = -1;
        }
        this.j = 0;
        this.k = -1;
    }

    @Override  // r.b$a
    public void d() {
        int v = this.j;
        int v1 = this.k;
        for(int v2 = 0; v2 < v; ++v2) {
            this.g[v1] *= -1.0f;
            v1 = this.i[v1];
            if(v1 == -1) {
                break;
            }
        }
    }

    @Override  // r.b$a
    public float e(int v) {
        int v1 = this.j;
        int v2 = this.k;
        for(int v3 = 0; v3 < v1; ++v3) {
            if(v3 == v) {
                return this.g[v2];
            }
            v2 = this.i[v2];
            if(v2 == -1) {
                break;
            }
        }
        return 0.0f;
    }

    @Override  // r.b$a
    public boolean f(i i0) {
        return this.p(i0) != -1;
    }

    @Override  // r.b$a
    public float g(i i0) {
        int v = this.p(i0);
        return v == -1 ? 0.0f : this.g[v];
    }

    @Override  // r.b$a
    public void h(i i0, float f) {
        if(Float.compare(f, -j.n) > 0 && f < j.n) {
            this.i(i0, true);
            return;
        }
        if(this.j == 0) {
            this.m(0, i0, f);
            this.l(i0, 0);
            this.k = 0;
            return;
        }
        int v1 = this.p(i0);
        if(v1 != -1) {
            this.g[v1] = f;
            return;
        }
        if(this.j + 1 >= this.b) {
            this.o();
        }
        int v2 = this.j;
        int v3 = this.k;
        int v4 = -1;
        for(int v = 0; v < v2; ++v) {
            int v5 = this.f[v3];
            int v6 = i0.c;
            if(v5 == v6) {
                this.g[v3] = f;
                return;
            }
            if(v5 < v6) {
                v4 = v3;
            }
            v3 = this.i[v3];
            if(v3 == -1) {
                break;
            }
        }
        this.q(v4, i0, f);
    }

    @Override  // r.b$a
    public float i(i i0, boolean z) {
        int v = this.p(i0);
        if(v == -1) {
            return 0.0f;
        }
        this.r(i0);
        float f = this.g[v];
        if(this.k == v) {
            this.k = this.i[v];
        }
        this.f[v] = -1;
        int[] arr_v = this.h;
        int v1 = arr_v[v];
        if(v1 != -1) {
            this.i[v1] = this.i[v];
        }
        int v2 = this.i[v];
        if(v2 != -1) {
            arr_v[v2] = arr_v[v];
        }
        --this.j;
        --i0.m;
        if(z) {
            i0.c(this.l);
        }
        return f;
    }

    @Override  // r.b$a
    public void j(i i0, float f, boolean z) {
        if(f > -j.n && f < j.n) {
            return;
        }
        int v = this.p(i0);
        if(v == -1) {
            this.h(i0, f);
            return;
        }
        float[] arr_f = this.g;
        float f1 = arr_f[v] + f;
        arr_f[v] = f1;
        if(f1 > -j.n && f1 < j.n) {
            arr_f[v] = 0.0f;
            this.i(i0, z);
        }
    }

    @Override  // r.b$a
    public void k(float f) {
        int v = this.j;
        int v1 = this.k;
        for(int v2 = 0; v2 < v; ++v2) {
            this.g[v1] /= f;
            v1 = this.i[v1];
            if(v1 == -1) {
                break;
            }
        }
    }

    private void l(i i0, int v) {
        int[] arr_v1;
        int v1 = i0.c % this.c;
        int[] arr_v = this.d;
        int v2 = arr_v[v1];
        if(v2 == -1) {
            arr_v[v1] = v;
        }
        else {
            while(true) {
                arr_v1 = this.e;
                int v3 = arr_v1[v2];
                if(v3 == -1) {
                    break;
                }
                v2 = v3;
            }
            arr_v1[v2] = v;
        }
        this.e[v] = -1;
    }

    private void m(int v, i i0, float f) {
        this.f[v] = i0.c;
        this.g[v] = f;
        this.h[v] = -1;
        this.i[v] = -1;
        i0.a(this.l);
        ++i0.m;
        ++this.j;
    }

    private int n() {
        for(int v = 0; v < this.b; ++v) {
            if(this.f[v] == -1) {
                return v;
            }
        }
        return -1;
    }

    private void o() {
        int v = this.b * 2;
        this.f = Arrays.copyOf(this.f, v);
        this.g = Arrays.copyOf(this.g, v);
        this.h = Arrays.copyOf(this.h, v);
        this.i = Arrays.copyOf(this.i, v);
        this.e = Arrays.copyOf(this.e, v);
        for(int v1 = this.b; v1 < v; ++v1) {
            this.f[v1] = -1;
            this.e[v1] = -1;
        }
        this.b = v;
    }

    public int p(i i0) {
        if(this.j == 0) {
            return -1;
        }
        int v = i0.c;
        int v1 = this.d[v % this.c];
        if(v1 == -1) {
            return -1;
        }
        if(this.f[v1] == v) {
            return v1;
        }
        do {
            v1 = this.e[v1];
        }
        while(v1 != -1 && this.f[v1] != v);
        if(v1 == -1) {
            return -1;
        }
        return this.f[v1] == v ? v1 : -1;
    }

    private void q(int v, i i0, float f) {
        int v1 = this.n();
        this.m(v1, i0, f);
        if(v == -1) {
            this.h[v1] = -1;
            if(this.j > 0) {
                this.i[v1] = this.k;
                this.k = v1;
            }
            else {
                this.i[v1] = -1;
            }
        }
        else {
            this.h[v1] = v;
            int[] arr_v = this.i;
            arr_v[v1] = arr_v[v];
            arr_v[v] = v1;
        }
        int v2 = this.i[v1];
        if(v2 != -1) {
            this.h[v2] = v1;
        }
        this.l(i0, v1);
    }

    private void r(i i0) {
        int v3;
        int[] arr_v2;
        int v = i0.c;
        int v1 = v % this.c;
        int[] arr_v = this.d;
        int v2 = arr_v[v1];
        if(v2 == -1) {
            return;
        }
        if(this.f[v2] == v) {
            int[] arr_v1 = this.e;
            arr_v[v1] = arr_v1[v2];
            arr_v1[v2] = -1;
            return;
        }
        while(true) {
            arr_v2 = this.e;
            v3 = arr_v2[v2];
            if(v3 == -1 || this.f[v3] == v) {
                break;
            }
            v2 = v3;
        }
        if(v3 != -1 && this.f[v3] == v) {
            arr_v2[v2] = arr_v2[v3];
            arr_v2[v3] = -1;
        }
    }

    @Override
    public String toString() {
        String s = this.hashCode() + " { ";
        int v = this.j;
        for(int v1 = 0; v1 < v; ++v1) {
            i i0 = this.c(v1);
            if(i0 != null) {
                int v2 = this.p(i0);
                String s1 = s + i0 + " = " + this.e(v1) + " " + "[p: ";
                String s2 = this.h[v2] == -1 ? s1 + "none" : s1 + this.m.d[this.f[this.h[v2]]];
                s = (this.i[v2] == -1 ? s2 + ", n: " + "none" : s2 + ", n: " + this.m.d[this.f[this.i[v2]]]) + "]";
            }
        }
        return s + " }";
    }
}

