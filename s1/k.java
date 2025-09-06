package S1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

public class k {
    static abstract class a {
    }

    public static final class b {
        private d a;
        private d b;
        private d c;
        private d d;
        private c e;
        private c f;
        private c g;
        private c h;
        private f i;
        private f j;
        private f k;
        private f l;

        public b() {
            this.a = h.b();
            this.b = h.b();
            this.c = h.b();
            this.d = h.b();
            this.e = new S1.a(0.0f);
            this.f = new S1.a(0.0f);
            this.g = new S1.a(0.0f);
            this.h = new S1.a(0.0f);
            this.i = h.c();
            this.j = h.c();
            this.k = h.c();
            this.l = h.c();
        }

        public b(k k0) {
            this.a = h.b();
            this.b = h.b();
            this.c = h.b();
            this.d = h.b();
            this.e = new S1.a(0.0f);
            this.f = new S1.a(0.0f);
            this.g = new S1.a(0.0f);
            this.h = new S1.a(0.0f);
            this.i = h.c();
            this.j = h.c();
            this.k = h.c();
            h.c();
            this.a = k0.a;
            this.b = k0.b;
            this.c = k0.c;
            this.d = k0.d;
            this.e = k0.e;
            this.f = k0.f;
            this.g = k0.g;
            this.h = k0.h;
            this.i = k0.i;
            this.j = k0.j;
            this.k = k0.k;
            this.l = k0.l;
        }

        public b A(float f) {
            this.e = new S1.a(f);
            return this;
        }

        public b B(c c0) {
            this.e = c0;
            return this;
        }

        public b C(int v, c c0) {
            return this.D(h.a(v)).F(c0);
        }

        public b D(d d0) {
            this.b = d0;
            float f = b.n(d0);
            if(f != -1.0f) {
                this.E(f);
            }
            return this;
        }

        public b E(float f) {
            this.f = new S1.a(f);
            return this;
        }

        public b F(c c0) {
            this.f = c0;
            return this;
        }

        static d a(b k$b0) {
            return k$b0.a;
        }

        static f b(b k$b0) {
            return k$b0.j;
        }

        static f c(b k$b0) {
            return k$b0.k;
        }

        static f d(b k$b0) {
            return k$b0.l;
        }

        static d e(b k$b0) {
            return k$b0.b;
        }

        static d f(b k$b0) {
            return k$b0.c;
        }

        static d g(b k$b0) {
            return k$b0.d;
        }

        static c h(b k$b0) {
            return k$b0.e;
        }

        static c i(b k$b0) {
            return k$b0.f;
        }

        static c j(b k$b0) {
            return k$b0.g;
        }

        static c k(b k$b0) {
            return k$b0.h;
        }

        static f l(b k$b0) {
            return k$b0.i;
        }

        public k m() {
            return new k(this, null);
        }

        private static float n(d d0) {
            if(d0 instanceof j) {
                return ((j)d0).a;
            }
            return d0 instanceof e ? ((e)d0).a : -1.0f;
        }

        public b o(float f) {
            return this.A(f).E(f).w(f).s(f);
        }

        public b p(c c0) {
            return this.B(c0).F(c0).x(c0).t(c0);
        }

        public b q(int v, c c0) {
            return this.r(h.a(v)).t(c0);
        }

        public b r(d d0) {
            this.d = d0;
            float f = b.n(d0);
            if(f != -1.0f) {
                this.s(f);
            }
            return this;
        }

        public b s(float f) {
            this.h = new S1.a(f);
            return this;
        }

        public b t(c c0) {
            this.h = c0;
            return this;
        }

        public b u(int v, c c0) {
            return this.v(h.a(v)).x(c0);
        }

        public b v(d d0) {
            this.c = d0;
            float f = b.n(d0);
            if(f != -1.0f) {
                this.w(f);
            }
            return this;
        }

        public b w(float f) {
            this.g = new S1.a(f);
            return this;
        }

        public b x(c c0) {
            this.g = c0;
            return this;
        }

        public b y(int v, c c0) {
            return this.z(h.a(v)).B(c0);
        }

        public b z(d d0) {
            this.a = d0;
            float f = b.n(d0);
            if(f != -1.0f) {
                this.A(f);
            }
            return this;
        }
    }

    public interface S1.k.c {
        c a(c arg1);
    }

    d a;
    d b;
    d c;
    d d;
    c e;
    c f;
    c g;
    c h;
    f i;
    f j;
    f k;
    f l;
    public static final c m;

    static {
        k.m = new i(0.5f);
    }

    public k() {
        this.a = h.b();
        this.b = h.b();
        this.c = h.b();
        this.d = h.b();
        this.e = new S1.a(0.0f);
        this.f = new S1.a(0.0f);
        this.g = new S1.a(0.0f);
        this.h = new S1.a(0.0f);
        this.i = h.c();
        this.j = h.c();
        this.k = h.c();
        this.l = h.c();
    }

    private k(b k$b0) {
        this.a = b.a(k$b0);
        this.b = b.e(k$b0);
        this.c = b.f(k$b0);
        this.d = b.g(k$b0);
        this.e = b.h(k$b0);
        this.f = b.i(k$b0);
        this.g = b.j(k$b0);
        this.h = b.k(k$b0);
        this.i = b.l(k$b0);
        this.j = b.b(k$b0);
        this.k = b.c(k$b0);
        this.l = b.d(k$b0);
    }

    k(b k$b0, a k$a0) {
        this(k$b0);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context0, int v, int v1) {
        return k.c(context0, v, v1, 0);
    }

    private static b c(Context context0, int v, int v1, int v2) {
        return k.d(context0, v, v1, new S1.a(((float)v2)));
    }

    private static b d(Context context0, int v, int v1, c c0) {
        ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, v);
        if(v1 != 0) {
            contextThemeWrapper0 = new ContextThemeWrapper(contextThemeWrapper0, v1);
        }
        TypedArray typedArray0 = contextThemeWrapper0.obtainStyledAttributes(z1.k.s6);
        try {
            int v3 = typedArray0.getInt(z1.k.t6, 0);
            int v4 = typedArray0.getInt(z1.k.w6, v3);
            int v5 = typedArray0.getInt(z1.k.x6, v3);
            int v6 = typedArray0.getInt(z1.k.v6, v3);
            int v7 = typedArray0.getInt(z1.k.u6, v3);
            c c1 = k.m(typedArray0, z1.k.y6, c0);
            c c2 = k.m(typedArray0, z1.k.B6, c1);
            c c3 = k.m(typedArray0, z1.k.C6, c1);
            c c4 = k.m(typedArray0, z1.k.A6, c1);
            c c5 = k.m(typedArray0, z1.k.z6, c1);
            return new b().y(v4, c2).C(v5, c3).u(v6, c4).q(v7, c5);
        }
        finally {
            typedArray0.recycle();
        }
    }

    public static b e(Context context0, AttributeSet attributeSet0, int v, int v1) {
        return k.f(context0, attributeSet0, v, v1, 0);
    }

    public static b f(Context context0, AttributeSet attributeSet0, int v, int v1, int v2) {
        return k.g(context0, attributeSet0, v, v1, new S1.a(((float)v2)));
    }

    public static b g(Context context0, AttributeSet attributeSet0, int v, int v1, c c0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, z1.k.t4, v, v1);
        int v2 = typedArray0.getResourceId(z1.k.u4, 0);
        int v3 = typedArray0.getResourceId(z1.k.v4, 0);
        typedArray0.recycle();
        return k.d(context0, v2, v3, c0);
    }

    public f h() {
        return this.k;
    }

    public d i() {
        return this.d;
    }

    public c j() {
        return this.h;
    }

    public d k() {
        return this.c;
    }

    public c l() {
        return this.g;
    }

    private static c m(TypedArray typedArray0, int v, c c0) {
        TypedValue typedValue0 = typedArray0.peekValue(v);
        if(typedValue0 == null) {
            return c0;
        }
        int v1 = typedValue0.type;
        if(v1 == 5) {
            return new S1.a(((float)TypedValue.complexToDimensionPixelSize(typedValue0.data, typedArray0.getResources().getDisplayMetrics())));
        }
        return v1 == 6 ? new i(typedValue0.getFraction(1.0f, 1.0f)) : c0;
    }

    public f n() {
        return this.l;
    }

    public f o() {
        return this.j;
    }

    public f p() {
        return this.i;
    }

    public d q() {
        return this.a;
    }

    public c r() {
        return this.e;
    }

    public d s() {
        return this.b;
    }

    public c t() {
        return this.f;
    }

    // 去混淆评级： 低(36)
    public boolean u(RectF rectF0) {
        boolean z = this.l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float f = this.e.a(rectF0);
        return z && (this.f.a(rectF0) == f && this.h.a(rectF0) == f && this.g.a(rectF0) == f) && (this.b instanceof j && this.a instanceof j && this.c instanceof j && this.d instanceof j);
    }

    public b v() {
        return new b(this);
    }

    public k w(float f) {
        return this.v().o(f).m();
    }

    public k x(c c0) {
        return this.v().p(c0).m();
    }

    public k y(S1.k.c k$c0) {
        return this.v().B(k$c0.a(this.r())).F(k$c0.a(this.t())).t(k$c0.a(this.j())).x(k$c0.a(this.l())).m();
    }
}

