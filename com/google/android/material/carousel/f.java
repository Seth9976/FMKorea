package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class f {
    static abstract class a {
    }

    static final class b {
        private final float a;
        private final float b;
        private final List c;
        private c d;
        private c e;
        private int f;
        private int g;
        private float h;
        private int i;

        b(float f, float f1) {
            this.c = new ArrayList();
            this.f = -1;
            this.g = -1;
            this.h = 0.0f;
            this.i = -1;
            this.a = f;
            this.b = f1;
        }

        b a(float f, float f1, float f2) {
            return this.d(f, f1, f2, false, true);
        }

        b b(float f, float f1, float f2) {
            return this.c(f, f1, f2, false);
        }

        b c(float f, float f1, float f2, boolean z) {
            return this.d(f, f1, f2, z, false);
        }

        b d(float f, float f1, float f2, boolean z, boolean z1) {
            float f3 = f - f2 / 2.0f;
            float f4 = f2 / 2.0f + f;
            float f5 = this.b;
            if(f4 > f5) {
                return this.e(f, f1, f2, z, z1, Math.abs(f4 - Math.max(f4 - f2, f5)));
            }
            return f3 < 0.0f ? this.e(f, f1, f2, z, z1, Math.abs(f3 - Math.min(f3 + f2, 0.0f))) : this.e(f, f1, f2, z, z1, 0.0f);
        }

        b e(float f, float f1, float f2, boolean z, boolean z1, float f3) {
            return this.f(f, f1, f2, z, z1, f3, 0.0f, 0.0f);
        }

        b f(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4, float f5) {
            if(f2 <= 0.0f) {
                return this;
            }
            if(z1) {
                if(z) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                if(this.i != -1 && this.i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.i = this.c.size();
            }
            c f$c0 = new c(1.401298E-45f, f, f1, f2, z1, f3, f4, f5);
            if(z) {
                if(this.d == null) {
                    this.d = f$c0;
                    this.f = this.c.size();
                }
                if(this.g != -1 && this.c.size() - this.g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if(f2 != this.d.d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.e = f$c0;
                this.g = this.c.size();
            }
            else {
                if(this.d == null && f$c0.d < this.h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if(this.e != null && f$c0.d > this.h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.h = f$c0.d;
            this.c.add(f$c0);
            return this;
        }

        b g(float f, float f1, float f2, int v) {
            return this.h(f, f1, f2, v, false);
        }

        b h(float f, float f1, float f2, int v, boolean z) {
            if(v > 0 && f2 > 0.0f) {
                for(int v1 = 0; v1 < v; ++v1) {
                    this.c(((float)v1) * f2 + f, f1, f2, z);
                }
            }
            return this;
        }

        f i() {
            if(this.d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < this.c.size(); ++v) {
                c f$c0 = (c)this.c.get(v);
                arrayList0.add(new c(this.d.b - ((float)this.f) * this.a + ((float)v) * this.a, f$c0.b, f$c0.c, f$c0.d, f$c0.e, f$c0.f, f$c0.g, f$c0.h));
            }
            return new f(this.a, arrayList0, this.f, this.g, null);
        }

        private static float j(float f, float f1, int v, int v1) [...] // Inlined contents
    }

    static final class c {
        final float a;
        final float b;
        final float c;
        final float d;
        final boolean e;
        final float f;
        final float g;
        final float h;

        c(float f, float f1, float f2, float f3) {
            this(f, f1, f2, f3, false, 0.0f, 0.0f, 0.0f);
        }

        c(float f, float f1, float f2, float f3, boolean z, float f4, float f5, float f6) {
            this.a = f;
            this.b = f1;
            this.c = f2;
            this.d = f3;
            this.e = z;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        static c a(c f$c0, c f$c1, float f) {
            return new c(f$c0.a + f * (f$c1.a - f$c0.a), f$c0.b + f * (f$c1.b - f$c0.b), f$c0.c + f * (f$c1.c - f$c0.c), f$c0.d + f * (f$c1.d - f$c0.d));
        }
    }

    private final float a;
    private final List b;
    private final int c;
    private final int d;

    private f(float f, List list0, int v, int v1) {
        this.a = f;
        this.b = Collections.unmodifiableList(list0);
        this.c = v;
        this.d = v1;
    }

    f(float f, List list0, int v, int v1, a f$a0) {
        this(f, list0, v, v1);
    }

    c a() {
        return (c)this.b.get(this.c);
    }

    int b() {
        return this.c;
    }

    c c() {
        return (c)this.b.get(0);
    }

    c d() {
        for(int v = 0; v < this.b.size(); ++v) {
            c f$c0 = (c)this.b.get(v);
            if(!f$c0.e) {
                return f$c0;
            }
        }
        return null;
    }

    List e() {
        return this.b.subList(this.c, this.d + 1);
    }

    float f() {
        return this.a;
    }

    List g() {
        return this.b;
    }

    c h() {
        return (c)this.b.get(this.d);
    }

    int i() {
        return this.d;
    }

    c j() {
        return (c)this.b.get(this.b.size() - 1);
    }

    c k() {
        for(int v = this.b.size() - 1; v >= 0; --v) {
            c f$c0 = (c)this.b.get(v);
            if(!f$c0.e) {
                return f$c0;
            }
        }
        return null;
    }

    int l() {
        int v = 0;
        for(Object object0: this.b) {
            if(((c)object0).e) {
                ++v;
            }
        }
        return this.b.size() - v;
    }

    static f m(f f0, f f1, float f2) {
        if(f0.f() != f1.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List list0 = f0.g();
        List list1 = f1.g();
        if(list0.size() != list1.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < f0.g().size(); ++v) {
            arrayList0.add(c.a(((c)list0.get(v)), ((c)list1.get(v)), f2));
        }
        return new f(f0.f(), arrayList0, A1.a.c(f0.b(), f1.b(), f2), A1.a.c(f0.i(), f1.i(), f2));
    }

    static f n(f f0, float f1) {
        b f$b0 = new b(f0.f(), f1);
        c f$c0 = f0.j();
        c f$c1 = f0.j();
        float f2 = f1 - f$c0.b - f$c1.d / 2.0f;
        for(int v = f0.g().size() - 1; v >= 0; --v) {
            Object object0 = f0.g().get(v);
            f$b0.d(f2 + ((c)object0).d / 2.0f, ((c)object0).c, ((c)object0).d, v >= f0.b() && v <= f0.i(), ((c)object0).e);
            f2 += ((c)object0).d;
        }
        return f$b0.i();
    }
}

