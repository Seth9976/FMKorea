package r;

import java.util.Arrays;
import java.util.HashSet;

public class i {
    public static enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN;

    }

    public boolean a;
    private String b;
    public int c;
    int d;
    public int e;
    public float f;
    public boolean g;
    float[] h;
    float[] i;
    a j;
    b[] k;
    int l;
    public int m;
    HashSet n;
    private static int o = 1;

    static {
    }

    public i(a i$a0, String s) {
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.g = false;
        this.h = new float[9];
        this.i = new float[9];
        this.k = new b[16];
        this.l = 0;
        this.m = 0;
        this.n = null;
        this.j = i$a0;
    }

    public final void a(b b0) {
        for(int v = 0; true; ++v) {
            int v1 = this.l;
            if(v >= v1) {
                break;
            }
            if(this.k[v] == b0) {
                return;
            }
        }
        b[] arr_b = this.k;
        if(v1 >= arr_b.length) {
            this.k = (b[])Arrays.copyOf(arr_b, arr_b.length * 2);
        }
        int v2 = this.l;
        this.k[v2] = b0;
        this.l = v2 + 1;
    }

    static void b() {
        ++i.o;
    }

    public final void c(b b0) {
        int v = this.l;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.k[v1] == b0) {
                while(v1 < v - 1) {
                    this.k[v1] = this.k[v1 + 1];
                    ++v1;
                }
                --this.l;
                return;
            }
        }
    }

    public void d() {
        this.b = null;
        this.j = a.j;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        int v = this.l;
        for(int v1 = 0; v1 < v; ++v1) {
            this.k[v1] = null;
        }
        this.l = 0;
        this.m = 0;
        this.a = false;
        Arrays.fill(this.i, 0.0f);
    }

    public void e(d d0, float f) {
        this.f = f;
        this.g = true;
        int v = this.l;
        for(int v1 = 0; v1 < v; ++v1) {
            this.k[v1].B(d0, this, false);
        }
        this.l = 0;
    }

    public void f(a i$a0, String s) {
        this.j = i$a0;
    }

    public final void g(b b0) {
        int v = this.l;
        for(int v1 = 0; v1 < v; ++v1) {
            this.k[v1].C(b0, false);
        }
        this.l = 0;
    }

    @Override
    public String toString() {
        return this.b == null ? "" + this.c : "" + this.b;
    }
}

