package r;

import java.util.Arrays;

public class a implements r.b.a {
    int a;
    private final b b;
    protected final c c;
    private int d;
    private i e;
    private int[] f;
    private int[] g;
    private float[] h;
    private int i;
    private int j;
    private boolean k;
    private static float l = 0.001f;

    static {
    }

    a(b b0, c c0) {
        this.a = 0;
        this.d = 8;
        this.e = null;
        this.f = new int[8];
        this.g = new int[8];
        this.h = new float[8];
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.b = b0;
        this.c = c0;
    }

    @Override  // r.b$a
    public float a(b b0, boolean z) {
        float f = this.g(b0.a);
        this.i(b0.a, z);
        r.b.a b$a0 = b0.e;
        int v = b$a0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            i i0 = b$a0.c(v1);
            this.j(i0, b$a0.g(i0) * f, z);
        }
        return f;
    }

    @Override  // r.b$a
    public int b() {
        return this.a;
    }

    @Override  // r.b$a
    public i c(int v) {
        int v1 = this.i;
        for(int v2 = 0; v1 != -1 && v2 < this.a; ++v2) {
            if(v2 == v) {
                return this.c.d[this.f[v1]];
            }
            v1 = this.g[v1];
        }
        return null;
    }

    @Override  // r.b$a
    public final void clear() {
        int v = this.i;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            i i0 = this.c.d[this.f[v]];
            if(i0 != null) {
                i0.c(this.b);
            }
            v = this.g[v];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    @Override  // r.b$a
    public void d() {
        int v = this.i;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            this.h[v] *= -1.0f;
            v = this.g[v];
        }
    }

    @Override  // r.b$a
    public float e(int v) {
        int v1 = this.i;
        for(int v2 = 0; v1 != -1 && v2 < this.a; ++v2) {
            if(v2 == v) {
                return this.h[v1];
            }
            v1 = this.g[v1];
        }
        return 0.0f;
    }

    @Override  // r.b$a
    public boolean f(i i0) {
        int v = this.i;
        if(v == -1) {
            return false;
        }
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            if(this.f[v] == i0.c) {
                return true;
            }
            v = this.g[v];
        }
        return false;
    }

    @Override  // r.b$a
    public final float g(i i0) {
        int v = this.i;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            if(this.f[v] == i0.c) {
                return this.h[v];
            }
            v = this.g[v];
        }
        return 0.0f;
    }

    @Override  // r.b$a
    public final void h(i i0, float f) {
        if(Float.compare(f, 0.0f) == 0) {
            this.i(i0, true);
            return;
        }
        int v = this.i;
        if(v == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = i0.c;
            this.g[0] = -1;
            ++i0.m;
            i0.a(this.b);
            ++this.a;
            if(!this.k) {
                int v1 = this.j + 1;
                this.j = v1;
                int[] arr_v = this.f;
                if(v1 >= arr_v.length) {
                    this.k = true;
                    this.j = arr_v.length - 1;
                }
            }
            return;
        }
        int v3 = -1;
        for(int v2 = 0; v != -1 && v2 < this.a; ++v2) {
            int v4 = this.f[v];
            int v5 = i0.c;
            if(v4 == v5) {
                this.h[v] = f;
                return;
            }
            if(v4 < v5) {
                v3 = v;
            }
            v = this.g[v];
        }
        int v6 = this.j;
        if(this.k) {
            int[] arr_v1 = this.f;
            if(arr_v1[v6] != -1) {
                v6 = arr_v1.length;
            }
        }
        else {
            ++v6;
        }
        if(v6 >= this.f.length && this.a < this.f.length) {
            for(int v7 = 0; true; ++v7) {
                int[] arr_v2 = this.f;
                if(v7 >= arr_v2.length) {
                    break;
                }
                if(arr_v2[v7] == -1) {
                    v6 = v7;
                    break;
                }
            }
        }
        int[] arr_v3 = this.f;
        if(v6 >= arr_v3.length) {
            v6 = arr_v3.length;
            int v8 = this.d * 2;
            this.d = v8;
            this.k = false;
            this.j = v6 - 1;
            this.h = Arrays.copyOf(this.h, v8);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[v6] = i0.c;
        this.h[v6] = f;
        if(v3 == -1) {
            this.g[v6] = this.i;
            this.i = v6;
        }
        else {
            int[] arr_v4 = this.g;
            arr_v4[v6] = arr_v4[v3];
            arr_v4[v3] = v6;
        }
        ++i0.m;
        i0.a(this.b);
        int v9 = this.a + 1;
        this.a = v9;
        if(!this.k) {
            ++this.j;
        }
        int[] arr_v5 = this.f;
        if(v9 >= arr_v5.length) {
            this.k = true;
        }
        if(this.j >= arr_v5.length) {
            this.k = true;
            this.j = arr_v5.length - 1;
        }
    }

    @Override  // r.b$a
    public final float i(i i0, boolean z) {
        if(this.e == i0) {
            this.e = null;
        }
        int v = this.i;
        if(v == -1) {
            return 0.0f;
        }
        int v1 = 0;
        int v2 = -1;
        while(v != -1 && v1 < this.a) {
            if(this.f[v] == i0.c) {
                if(v == this.i) {
                    this.i = this.g[v];
                }
                else {
                    this.g[v2] = this.g[v];
                }
                if(z) {
                    i0.c(this.b);
                }
                --i0.m;
                --this.a;
                this.f[v] = -1;
                if(this.k) {
                    this.j = v;
                }
                return this.h[v];
            }
            ++v1;
            v2 = v;
            v = this.g[v];
        }
        return 0.0f;
    }

    @Override  // r.b$a
    public void j(i i0, float f, boolean z) {
        if(f > -a.l && f < a.l) {
            return;
        }
        int v = this.i;
        if(v == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = i0.c;
            this.g[0] = -1;
            ++i0.m;
            i0.a(this.b);
            ++this.a;
            if(!this.k) {
                int v1 = this.j + 1;
                this.j = v1;
                int[] arr_v = this.f;
                if(v1 >= arr_v.length) {
                    this.k = true;
                    this.j = arr_v.length - 1;
                }
            }
            return;
        }
        int v3 = -1;
        for(int v2 = 0; v != -1 && v2 < this.a; ++v2) {
            int v4 = this.f[v];
            int v5 = i0.c;
            if(v4 == v5) {
                float[] arr_f = this.h;
                float f1 = arr_f[v] + f;
                if(Float.compare(f1, -a.l) > 0 && f1 < a.l) {
                    f1 = 0.0f;
                }
                arr_f[v] = f1;
                if(f1 == 0.0f) {
                    if(v == this.i) {
                        this.i = this.g[v];
                    }
                    else {
                        this.g[v3] = this.g[v];
                    }
                    if(z) {
                        i0.c(this.b);
                    }
                    if(this.k) {
                        this.j = v;
                    }
                    --i0.m;
                    --this.a;
                }
                return;
            }
            if(v4 < v5) {
                v3 = v;
            }
            v = this.g[v];
        }
        int v6 = this.j;
        if(this.k) {
            int[] arr_v1 = this.f;
            if(arr_v1[v6] != -1) {
                v6 = arr_v1.length;
            }
        }
        else {
            ++v6;
        }
        if(v6 >= this.f.length && this.a < this.f.length) {
            for(int v7 = 0; true; ++v7) {
                int[] arr_v2 = this.f;
                if(v7 >= arr_v2.length) {
                    break;
                }
                if(arr_v2[v7] == -1) {
                    v6 = v7;
                    break;
                }
            }
        }
        int[] arr_v3 = this.f;
        if(v6 >= arr_v3.length) {
            v6 = arr_v3.length;
            int v8 = this.d * 2;
            this.d = v8;
            this.k = false;
            this.j = v6 - 1;
            this.h = Arrays.copyOf(this.h, v8);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[v6] = i0.c;
        this.h[v6] = f;
        if(v3 == -1) {
            this.g[v6] = this.i;
            this.i = v6;
        }
        else {
            int[] arr_v4 = this.g;
            arr_v4[v6] = arr_v4[v3];
            arr_v4[v3] = v6;
        }
        ++i0.m;
        i0.a(this.b);
        ++this.a;
        if(!this.k) {
            ++this.j;
        }
        int[] arr_v5 = this.f;
        if(this.j >= arr_v5.length) {
            this.k = true;
            this.j = arr_v5.length - 1;
        }
    }

    @Override  // r.b$a
    public void k(float f) {
        int v = this.i;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            this.h[v] /= f;
            v = this.g[v];
        }
    }

    @Override
    public String toString() {
        int v = this.i;
        String s = "";
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            s = s + " -> " + this.h[v] + " : " + this.c.d[this.f[v]];
            v = this.g[v];
        }
        return s;
    }
}

