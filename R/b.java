package r;

import java.util.ArrayList;

public class b implements a {
    public interface r.b.a {
        float a(b arg1, boolean arg2);

        int b();

        i c(int arg1);

        void clear();

        void d();

        float e(int arg1);

        boolean f(i arg1);

        float g(i arg1);

        void h(i arg1, float arg2);

        float i(i arg1, boolean arg2);

        void j(i arg1, float arg2, boolean arg3);

        void k(float arg1);
    }

    i a;
    float b;
    boolean c;
    ArrayList d;
    public r.b.a e;
    boolean f;

    public b() {
        this.a = null;
        this.b = 0.0f;
        this.c = false;
        this.d = new ArrayList();
        this.f = false;
    }

    public b(c c0) {
        this.a = null;
        this.b = 0.0f;
        this.c = false;
        this.d = new ArrayList();
        this.f = false;
        this.e = new r.a(this, c0);
    }

    String A() {
        boolean z;
        String s = (this.a == null ? "0" : "" + this.a) + " = ";
        if(Float.compare(this.b, 0.0f) == 0) {
            z = false;
        }
        else {
            s = s + this.b;
            z = true;
        }
        int v1 = this.e.b();
        for(int v = 0; v < v1; ++v) {
            i i0 = this.e.c(v);
            if(i0 != null) {
                float f = this.e.e(v);
                int v2 = Float.compare(f, 0.0f);
                if(v2 != 0) {
                    String s1 = i0.toString();
                    if(z) {
                        if(v2 > 0) {
                            s = s + " + ";
                        }
                        else {
                            s = s + " - ";
                            f *= -1.0f;
                        }
                    }
                    else if(f < 0.0f) {
                        s = s + "- ";
                        f *= -1.0f;
                    }
                    s = f == 1.0f ? s + s1 : s + f + " " + s1;
                    z = true;
                }
            }
        }
        return z ? s : s + "0.0";
    }

    public void B(d d0, i i0, boolean z) {
        if(!i0.g) {
            return;
        }
        float f = this.e.g(i0);
        this.b += i0.f * f;
        this.e.i(i0, z);
        if(z) {
            i0.c(this);
        }
    }

    public void C(b b0, boolean z) {
        float f = this.e.a(b0, z);
        this.b += b0.b * f;
        if(z) {
            b0.a.c(this);
        }
    }

    public void D(d d0) {
        if(d0.f.length == 0) {
            return;
        }
        boolean z = false;
        while(!z) {
            int v = this.e.b();
            for(int v1 = 0; v1 < v; ++v1) {
                i i0 = this.e.c(v1);
                if(i0.d != -1 || i0.g) {
                    this.d.add(i0);
                }
            }
            if(this.d.size() > 0) {
                for(Object object0: this.d) {
                    i i1 = (i)object0;
                    if(i1.g) {
                        this.B(d0, i1, true);
                    }
                    else {
                        this.C(d0.f[i1.d], true);
                    }
                }
                this.d.clear();
            }
            else {
                z = true;
            }
        }
    }

    @Override  // r.d$a
    public void a(a d$a0) {
        if(d$a0 instanceof b) {
            this.a = null;
            this.e.clear();
            for(int v = 0; v < ((b)d$a0).e.b(); ++v) {
                i i0 = ((b)d$a0).e.c(v);
                float f = ((b)d$a0).e.e(v);
                this.e.j(i0, f, true);
            }
        }
    }

    @Override  // r.d$a
    public void b(i i0) {
        float f = 1.0f;
        switch(i0.e) {
            case 2: {
                f = 1000.0f;
                break;
            }
            case 3: {
                f = 1000000.0f;
                break;
            }
            case 4: {
                f = 1000000000.0f;
                break;
            }
            case 5: {
                f = 999999995904.0f;
            }
        }
        this.e.h(i0, f);
    }

    @Override  // r.d$a
    public i c(d d0, boolean[] arr_z) {
        return this.x(arr_z, null);
    }

    @Override  // r.d$a
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public b d(d d0, int v) {
        this.e.h(d0.o(v, "ep"), 1.0f);
        this.e.h(d0.o(v, "em"), -1.0f);
        return this;
    }

    b e(i i0, int v) {
        this.e.h(i0, ((float)v));
        return this;
    }

    boolean f(d d0) {
        boolean z;
        i i0 = this.g(d0);
        if(i0 == null) {
            z = true;
        }
        else {
            this.y(i0);
            z = false;
        }
        if(this.e.b() == 0) {
            this.f = true;
        }
        return z;
    }

    i g(d d0) {
        boolean z2;
        boolean z3;
        int v = this.e.b();
        i i0 = null;
        float f = 0.0f;
        float f1 = 0.0f;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        i i1 = null;
        while(v1 < v) {
            float f2 = this.e.e(v1);
            i i2 = this.e.c(v1);
            if(i2.j != r.i.a.f) {
                if(i0 == null && f2 < 0.0f) {
                    if(i1 == null) {
                        z3 = this.v(i2, d0);
                        goto label_32;
                    }
                    else if(f1 > f2) {
                        z3 = this.v(i2, d0);
                    label_32:
                        z1 = z3;
                        f1 = f2;
                        i1 = i2;
                    }
                    else if(!z1 && this.v(i2, d0)) {
                        f1 = f2;
                        i1 = i2;
                        z1 = true;
                    }
                }
            }
            else if(i0 == null) {
                z2 = this.v(i2, d0);
                goto label_17;
            }
            else if(f > f2) {
                z2 = this.v(i2, d0);
            label_17:
                z = z2;
                f = f2;
                i0 = i2;
            }
            else if(!z && this.v(i2, d0)) {
                f = f2;
                i0 = i2;
                z = true;
            }
            ++v1;
        }
        return i0 == null ? i1 : i0;
    }

    @Override  // r.d$a
    public i getKey() {
        return this.a;
    }

    b h(i i0, i i1, int v, float f, i i2, i i3, int v1) {
        if(i1 == i2) {
            this.e.h(i0, 1.0f);
            this.e.h(i3, 1.0f);
            this.e.h(i1, -2.0f);
            return this;
        }
        if(Float.compare(f, 0.5f) == 0) {
            this.e.h(i0, 1.0f);
            this.e.h(i1, -1.0f);
            this.e.h(i2, -1.0f);
            this.e.h(i3, 1.0f);
            if(v > 0 || v1 > 0) {
                this.b = (float)(v1 - v);
                return this;
            }
        }
        else {
            if(f <= 0.0f) {
                this.e.h(i0, -1.0f);
                this.e.h(i1, 1.0f);
                this.b = (float)v;
                return this;
            }
            if(f >= 1.0f) {
                this.e.h(i3, -1.0f);
                this.e.h(i2, 1.0f);
                this.b = (float)(-v1);
                return this;
            }
            this.e.h(i0, (1.0f - f) * 1.0f);
            this.e.h(i1, (1.0f - f) * -1.0f);
            this.e.h(i2, -1.0f * f);
            this.e.h(i3, 1.0f * f);
            if(v > 0 || v1 > 0) {
                this.b = ((float)(-v)) * (1.0f - f) + ((float)v1) * f;
            }
        }
        return this;
    }

    b i(i i0, int v) {
        this.a = i0;
        i0.f = (float)v;
        this.b = (float)v;
        this.f = true;
        return this;
    }

    b j(i i0, i i1, float f) {
        this.e.h(i0, -1.0f);
        this.e.h(i1, f);
        return this;
    }

    public b k(i i0, i i1, i i2, i i3, float f) {
        this.e.h(i0, -1.0f);
        this.e.h(i1, 1.0f);
        this.e.h(i2, f);
        this.e.h(i3, -f);
        return this;
    }

    public b l(float f, float f1, float f2, i i0, i i1, i i2, i i3) {
        this.b = 0.0f;
        if(Float.compare(f1, 0.0f) != 0 && f != f2) {
            if(f == 0.0f) {
                this.e.h(i0, 1.0f);
                this.e.h(i1, -1.0f);
                return this;
            }
            if(f2 == 0.0f) {
                this.e.h(i2, 1.0f);
                this.e.h(i3, -1.0f);
                return this;
            }
            float f3 = f / f1 / (f2 / f1);
            this.e.h(i0, 1.0f);
            this.e.h(i1, -1.0f);
            this.e.h(i3, f3);
            this.e.h(i2, -f3);
            return this;
        }
        this.e.h(i0, 1.0f);
        this.e.h(i1, -1.0f);
        this.e.h(i3, 1.0f);
        this.e.h(i2, -1.0f);
        return this;
    }

    public b m(i i0, int v) {
        if(v < 0) {
            this.b = (float)(-v);
            this.e.h(i0, 1.0f);
            return this;
        }
        this.b = (float)v;
        this.e.h(i0, -1.0f);
        return this;
    }

    public b n(i i0, i i1, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            this.b = (float)v;
        }
        if(!z) {
            this.e.h(i0, -1.0f);
            this.e.h(i1, 1.0f);
            return this;
        }
        this.e.h(i0, 1.0f);
        this.e.h(i1, -1.0f);
        return this;
    }

    public b o(i i0, i i1, i i2, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            this.b = (float)v;
        }
        if(!z) {
            this.e.h(i0, -1.0f);
            this.e.h(i1, 1.0f);
            this.e.h(i2, 1.0f);
            return this;
        }
        this.e.h(i0, 1.0f);
        this.e.h(i1, -1.0f);
        this.e.h(i2, -1.0f);
        return this;
    }

    public b p(i i0, i i1, i i2, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            this.b = (float)v;
        }
        if(!z) {
            this.e.h(i0, -1.0f);
            this.e.h(i1, 1.0f);
            this.e.h(i2, -1.0f);
            return this;
        }
        this.e.h(i0, 1.0f);
        this.e.h(i1, -1.0f);
        this.e.h(i2, 1.0f);
        return this;
    }

    public b q(i i0, i i1, i i2, i i3, float f) {
        this.e.h(i2, 0.5f);
        this.e.h(i3, 0.5f);
        this.e.h(i0, -0.5f);
        this.e.h(i1, -0.5f);
        this.b = -f;
        return this;
    }

    void r() {
        float f = this.b;
        if(f < 0.0f) {
            this.b = f * -1.0f;
            this.e.d();
        }
    }

    boolean s() {
        return this.a != null && (this.a.j == r.i.a.f || this.b >= 0.0f);
    }

    boolean t(i i0) {
        return this.e.f(i0);
    }

    @Override
    public String toString() {
        return this.A();
    }

    public boolean u() {
        return this.a == null && this.b == 0.0f && this.e.b() == 0;
    }

    private boolean v(i i0, d d0) {
        return i0.m <= 1;
    }

    public i w(i i0) {
        return this.x(null, i0);
    }

    private i x(boolean[] arr_z, i i0) {
        int v = this.e.b();
        i i1 = null;
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            float f1 = this.e.e(v1);
            if(f1 < 0.0f) {
                i i2 = this.e.c(v1);
                if((arr_z == null || !arr_z[i2.c]) && i2 != i0 && ((i2.j == r.i.a.h || i2.j == r.i.a.i) && f1 < f)) {
                    f = f1;
                    i1 = i2;
                }
            }
        }
        return i1;
    }

    void y(i i0) {
        i i1 = this.a;
        if(i1 != null) {
            this.e.h(i1, -1.0f);
            this.a = null;
        }
        float f = this.e.i(i0, true);
        this.a = i0;
        if(f * -1.0f == 1.0f) {
            return;
        }
        this.b /= f * -1.0f;
        this.e.k(f * -1.0f);
    }

    public void z() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }
}

