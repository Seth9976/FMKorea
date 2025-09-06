package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x.a;

class g {
    private final f a;
    private final List b;
    private final List c;
    private final float[] d;
    private final float[] e;
    private final float f;
    private final float g;

    private g(f f0, List list0, List list1) {
        this.a = f0;
        this.b = Collections.unmodifiableList(list0);
        this.c = Collections.unmodifiableList(list1);
        c f$c0 = ((f)list0.get(list0.size() - 1)).c();
        c f$c1 = f0.c();
        float f1 = f$c0.a - f$c1.a;
        this.f = f1;
        c f$c2 = f0.j();
        c f$c3 = ((f)list1.get(list1.size() - 1)).j();
        float f2 = f$c2.a - f$c3.a;
        this.g = f2;
        this.d = g.m(f1, list0, true);
        this.e = g.m(f2, list1, false);
    }

    private f a(List list0, float f, float[] arr_f) {
        float[] arr_f1 = g.o(list0, f, arr_f);
        return arr_f1[0] >= 0.5f ? ((f)list0.get(((int)arr_f1[2]))) : ((f)list0.get(((int)arr_f1[1])));
    }

    private static int b(f f0, float f1) {
        for(int v = f0.i(); v < f0.g().size(); ++v) {
            if(f1 == ((c)f0.g().get(v)).c) {
                return v;
            }
        }
        return f0.g().size() - 1;
    }

    private static int c(f f0) {
        for(int v = 0; v < f0.g().size(); ++v) {
            if(!((c)f0.g().get(v)).e) {
                return v;
            }
        }
        return -1;
    }

    private static int d(f f0, float f1) {
        for(int v = f0.b() - 1; v >= 0; --v) {
            if(f1 == ((c)f0.g().get(v)).c) {
                return v;
            }
        }
        return 0;
    }

    private static int e(f f0) {
        for(int v = f0.g().size() - 1; v >= 0; --v) {
            if(!((c)f0.g().get(v)).e) {
                return v;
            }
        }
        return -1;
    }

    static g f(b b0, f f0, float f1, float f2, float f3) {
        return new g(f0, g.p(b0, f0, f1, f2), g.n(b0, f0, f1, f3));
    }

    f g() {
        return this.a;
    }

    f h() {
        return (f)this.c.get(this.c.size() - 1);
    }

    Map i(int v, int v1, int v2, boolean z) {
        float f = this.a.f();
        Map map0 = new HashMap();
        int v4 = 0;
        for(int v3 = 0; true; ++v3) {
            int v5 = -1;
            if(v3 >= v) {
                break;
            }
            int v6 = z ? v - v3 - 1 : v3;
            if(!z) {
                v5 = 1;
            }
            if(((float)v6) * f * ((float)v5) > ((float)v2) - this.g || v3 >= v - this.c.size()) {
                map0.put(v6, ((f)this.c.get(a.b(v4, 0, this.c.size() - 1))));
                ++v4;
            }
        }
        int v7 = v - 1;
        int v8 = 0;
        while(v7 >= 0) {
            int v9 = z ? v - v7 - 1 : v7;
            if(((float)v9) * f * ((float)(z ? -1 : 1)) < ((float)v1) + this.f || v7 < this.b.size()) {
                map0.put(v9, ((f)this.b.get(a.b(v8, 0, this.b.size() - 1))));
                ++v8;
            }
            --v7;
        }
        return map0;
    }

    public f j(float f, float f1, float f2) {
        return this.k(f, f1, f2, false);
    }

    f k(float f, float f1, float f2, boolean z) {
        float f7;
        float f3 = this.f + f1;
        float f4 = f2 - this.g;
        float f5 = this.l().a().g;
        float f6 = this.h().h().h;
        if(this.f == f5) {
            f3 += f5;
        }
        if(this.g == f6) {
            f4 -= f6;
        }
        if(Float.compare(f, f3) < 0) {
            f7 = A1.a.b(1.0f, 0.0f, f1, f3, f);
            return z ? this.a(this.b, f7, this.d) : g.s(this.b, f7, this.d);
        }
        if(f > f4) {
            f7 = A1.a.b(0.0f, 1.0f, f4, f2, f);
            return z ? this.a(this.c, f7, this.e) : g.s(this.c, f7, this.e);
        }
        return this.a;
    }

    f l() {
        return (f)this.b.get(this.b.size() - 1);
    }

    private static float[] m(float f, List list0, boolean z) {
        float f3;
        int v = list0.size();
        float[] arr_f = new float[v];
        for(int v1 = 1; v1 < v; ++v1) {
            f f1 = (f)list0.get(v1 - 1);
            f f2 = (f)list0.get(v1);
            if(z) {
                c f$c0 = f2.c();
                c f$c1 = f1.c();
                f3 = f$c0.a - f$c1.a;
            }
            else {
                c f$c2 = f1.j();
                c f$c3 = f2.j();
                f3 = f$c2.a - f$c3.a;
            }
            arr_f[v1] = v1 == v - 1 ? 1.0f : arr_f[v1 - 1] + f3 / f;
        }
        return arr_f;
    }

    private static List n(b b0, f f0, float f1, float f2) {
        List list0 = new ArrayList();
        list0.add(f0);
        int v = g.e(f0);
        int v1 = b0.f() ? b0.a() : b0.b();
        if(!g.r(b0, f0) && v != -1) {
            int v2 = v - f0.i();
            c f$c0 = f0.c();
            c f$c1 = f0.c();
            float f3 = f$c0.b - f$c1.d / 2.0f;
            if(v2 <= 0 && f0.h().f > 0.0f) {
                list0.add(g.v(f0, f3 - f0.h().f, ((float)v1)));
                return list0;
            }
            int v3 = 0;
            for(float f4 = 0.0f; v3 < v2; f4 = f6) {
                f f5 = (f)list0.get(list0.size() - 1);
                int v4 = v - v3;
                float f6 = f4 + ((c)f0.g().get(v4)).f;
                int v5 = v4 + 1;
                f f7 = g.t(f5, v, (v5 >= f0.g().size() ? 0 : g.d(f5, ((c)f0.g().get(v5)).c) + 1), f3 - f6, f0.b() + v3 + 1, f0.i() + v3 + 1, ((float)v1));
                if(v3 == v2 - 1 && f2 > 0.0f) {
                    f7 = g.u(f7, f2, ((float)v1), false, f1);
                }
                list0.add(f7);
                ++v3;
            }
            return list0;
        }
        if(f2 > 0.0f) {
            list0.add(g.u(f0, f2, ((float)v1), false, f1));
        }
        return list0;
    }

    private static float[] o(List list0, float f, float[] arr_f) {
        int v = list0.size();
        float f1 = arr_f[0];
        int v1 = 1;
        while(v1 < v) {
            float f2 = arr_f[v1];
            if(f <= f2) {
                return new float[]{A1.a.b(0.0f, 1.0f, f1, f2, f), ((float)(v1 - 1)), ((float)v1)};
            }
            ++v1;
            f1 = f2;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List p(b b0, f f0, float f1, float f2) {
        List list0 = new ArrayList();
        list0.add(f0);
        int v = g.c(f0);
        int v1 = b0.f() ? b0.a() : b0.b();
        if(!g.q(f0) && v != -1) {
            int v2 = f0.b() - v;
            c f$c0 = f0.c();
            c f$c1 = f0.c();
            float f3 = f$c0.b - f$c1.d / 2.0f;
            if(v2 <= 0 && f0.a().f > 0.0f) {
                list0.add(g.v(f0, f3 + f0.a().f, ((float)v1)));
                return list0;
            }
            int v3 = 0;
            for(float f4 = 0.0f; v3 < v2; f4 = f6) {
                f f5 = (f)list0.get(list0.size() - 1);
                int v4 = v + v3;
                float f6 = f4 + ((c)f0.g().get(v4)).f;
                int v5 = v4 - 1;
                f f7 = g.t(f5, v, (v5 < 0 ? f0.g().size() - 1 : g.b(f5, ((c)f0.g().get(v5)).c) - 1), f3 + f6, f0.b() - v3 - 1, f0.i() - v3 - 1, ((float)v1));
                if(v3 == v2 - 1 && f2 > 0.0f) {
                    f7 = g.u(f7, f2, ((float)v1), true, f1);
                }
                list0.add(f7);
                ++v3;
            }
            return list0;
        }
        if(f2 > 0.0f) {
            list0.add(g.u(f0, f2, ((float)v1), true, f1));
        }
        return list0;
    }

    private static boolean q(f f0) {
        c f$c0 = f0.a();
        c f$c1 = f0.a();
        return f$c0.b - f$c1.d / 2.0f >= 0.0f && f0.a() == f0.d();
    }

    private static boolean r(b b0, f f0) {
        int v = b0.b();
        if(b0.f()) {
            v = b0.a();
        }
        c f$c0 = f0.h();
        c f$c1 = f0.h();
        return f$c0.b + f$c1.d / 2.0f <= ((float)v) && f0.h() == f0.k();
    }

    private static f s(List list0, float f, float[] arr_f) {
        float[] arr_f1 = g.o(list0, f, arr_f);
        return f.m(((f)list0.get(((int)arr_f1[1]))), ((f)list0.get(((int)arr_f1[2]))), arr_f1[0]);
    }

    private static f t(f f0, int v, int v1, float f1, int v2, int v3, float f2) {
        ArrayList arrayList0 = new ArrayList(f0.g());
        arrayList0.add(v1, ((c)arrayList0.remove(v)));
        com.google.android.material.carousel.f.b f$b0 = new com.google.android.material.carousel.f.b(f0.f(), f2);
        for(int v4 = 0; v4 < arrayList0.size(); ++v4) {
            c f$c0 = (c)arrayList0.get(v4);
            f$b0.e(f1 + f$c0.d / 2.0f, f$c0.c, f$c0.d, v4 >= v2 && v4 <= v3, f$c0.e, f$c0.f);
            f1 += f$c0.d;
        }
        return f$b0.i();
    }

    private static f u(f f0, float f1, float f2, boolean z, float f3) {
        ArrayList arrayList0 = new ArrayList(f0.g());
        com.google.android.material.carousel.f.b f$b0 = new com.google.android.material.carousel.f.b(f0.f(), f2);
        float f4 = f1 / ((float)f0.l());
        float f5 = z ? f1 : 0.0f;
        for(int v = 0; v < arrayList0.size(); ++v) {
            c f$c0 = (c)arrayList0.get(v);
            if(f$c0.e) {
                f$b0.e(f$c0.b, f$c0.c, f$c0.d, false, true, f$c0.f);
            }
            else {
                float f6 = f$c0.d - f4;
                float f7 = f6 / 2.0f + f5;
                float f8 = f7 - f$c0.b;
                f$b0.f(f7, 1.0f - (f6 - f3) / (f0.f() - f3), f6, v >= f0.b() && v <= f0.i(), false, f$c0.f, (z ? f8 : 0.0f), (z ? 0.0f : f8));
                f5 += f6;
            }
        }
        return f$b0.i();
    }

    private static f v(f f0, float f1, float f2) {
        return g.t(f0, 0, 0, f1, f0.b(), f0.i(), f2);
    }
}

