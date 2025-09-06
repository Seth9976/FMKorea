package S1;

import R1.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class m {
    static class b extends g {
        private final d c;

        public b(d m$d0) {
            this.c = m$d0;
        }

        @Override  // S1.m$g
        public void b(Matrix matrix0, a a0, int v, Canvas canvas0) {
            float f = d.h(this.c);
            float f1 = d.i(this.c);
            a0.a(canvas0, matrix0, new RectF(d.b(this.c), d.c(this.c), d.d(this.c), d.e(this.c)), v, f, f1);
        }
    }

    static class c extends g {
        private final e c;
        private final float d;
        private final float e;

        public c(e m$e0, float f, float f1) {
            this.c = m$e0;
            this.d = f;
            this.e = f1;
        }

        @Override  // S1.m$g
        public void b(Matrix matrix0, a a0, int v, Canvas canvas0) {
            RectF rectF0 = new RectF(0.0f, 0.0f, ((float)Math.hypot(e.d(this.c) - this.e, e.b(this.c) - this.d)), 0.0f);
            this.a.set(matrix0);
            this.a.preTranslate(this.d, this.e);
            float f = this.c();
            this.a.preRotate(f);
            a0.b(canvas0, this.a, rectF0, v);
        }

        float c() {
            return (float)Math.toDegrees(Math.atan((e.d(this.c) - this.e) / (e.b(this.c) - this.d)));
        }
    }

    public static class d extends f {
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        private static final RectF h;

        static {
            d.h = new RectF();
        }

        public d(float f, float f1, float f2, float f3) {
            this.q(f);
            this.u(f1);
            this.r(f2);
            this.p(f3);
        }

        @Override  // S1.m$f
        public void a(Matrix matrix0, Path path0) {
            matrix0.invert(this.a);
            path0.transform(this.a);
            d.h.set(this.k(), this.o(), this.l(), this.j());
            path0.arcTo(d.h, this.m(), this.n(), false);
            path0.transform(matrix0);
        }

        static float b(d m$d0) {
            return m$d0.k();
        }

        static float c(d m$d0) {
            return m$d0.o();
        }

        static float d(d m$d0) {
            return m$d0.l();
        }

        static float e(d m$d0) {
            return m$d0.j();
        }

        static float h(d m$d0) {
            return m$d0.m();
        }

        static float i(d m$d0) {
            return m$d0.n();
        }

        private float j() {
            return this.e;
        }

        private float k() {
            return this.b;
        }

        private float l() {
            return this.d;
        }

        private float m() {
            return this.f;
        }

        private float n() {
            return this.g;
        }

        private float o() {
            return this.c;
        }

        private void p(float f) {
            this.e = f;
        }

        private void q(float f) {
            this.b = f;
        }

        private void r(float f) {
            this.d = f;
        }

        private void s(float f) {
            this.f = f;
        }

        private void t(float f) {
            this.g = f;
        }

        private void u(float f) {
            this.c = f;
        }
    }

    public static class e extends f {
        private float b;
        private float c;

        @Override  // S1.m$f
        public void a(Matrix matrix0, Path path0) {
            matrix0.invert(this.a);
            path0.transform(this.a);
            path0.lineTo(this.b, this.c);
            path0.transform(matrix0);
        }

        static float b(e m$e0) {
            return m$e0.b;
        }

        static float c(e m$e0, float f) {
            m$e0.b = f;
            return f;
        }

        static float d(e m$e0) {
            return m$e0.c;
        }

        static float e(e m$e0, float f) {
            m$e0.c = f;
            return f;
        }
    }

    public static abstract class f {
        protected final Matrix a;

        public f() {
            this.a = new Matrix();
        }

        public abstract void a(Matrix arg1, Path arg2);
    }

    static abstract class g {
        final Matrix a;
        static final Matrix b;

        static {
            g.b = new Matrix();
        }

        g() {
            this.a = new Matrix();
        }

        public final void a(a a0, int v, Canvas canvas0) {
            this.b(g.b, a0, v, canvas0);
        }

        public abstract void b(Matrix arg1, a arg2, int arg3, Canvas arg4);
    }

    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    private final List g;
    private final List h;
    private boolean i;

    public m() {
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.n(0.0f, 0.0f);
    }

    public void a(float f, float f1, float f2, float f3, float f4, float f5) {
        d m$d0 = new d(f, f1, f2, f3);
        d.f(m$d0, f4);
        d.g(m$d0, f5);
        this.g.add(m$d0);
        b m$b0 = new b(m$d0);
        float f6 = f4 + f5;
        if(f5 < 0.0f) {
            f4 = (f4 + 180.0f) % 360.0f;
        }
        this.c(m$b0, f4, (f5 < 0.0f ? (f6 + 180.0f) % 360.0f : f6));
        this.r((f + f2) * 0.5f + (f2 - f) / 2.0f * ((float)Math.cos(Math.toRadians(f6))));
        this.s((f1 + f3) * 0.5f + (f3 - f1) / 2.0f * ((float)Math.sin(Math.toRadians(f6))));
    }

    private void b(float f) {
        if(this.g() == f) {
            return;
        }
        float f1 = (f - this.g() + 360.0f) % 360.0f;
        if(f1 > 180.0f) {
            return;
        }
        d m$d0 = new d(this.i(), this.j(), this.i(), this.j());
        m$d0.s(this.g());
        m$d0.t(f1);
        b m$b0 = new b(m$d0);
        this.h.add(m$b0);
        this.p(f);
    }

    private void c(g m$g0, float f, float f1) {
        this.b(f);
        this.h.add(m$g0);
        this.p(f1);
    }

    public void d(Matrix matrix0, Path path0) {
        int v = this.g.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((f)this.g.get(v1)).a(matrix0, path0);
        }
    }

    boolean e() {
        return this.i;
    }

    g f(Matrix matrix0) {
        class S1.m.a extends g {
            final List c;
            final Matrix d;
            final m e;

            S1.m.a(List list0, Matrix matrix0) {
                this.c = list0;
                this.d = matrix0;
                super();
            }

            @Override  // S1.m$g
            public void b(Matrix matrix0, a a0, int v, Canvas canvas0) {
                for(Object object0: this.c) {
                    ((g)object0).b(this.d, a0, v, canvas0);
                }
            }
        }

        this.b(this.h());
        Matrix matrix1 = new Matrix(matrix0);
        return new S1.m.a(this, new ArrayList(this.h), matrix1);
    }

    private float g() {
        return this.e;
    }

    private float h() {
        return this.f;
    }

    float i() {
        return this.c;
    }

    float j() {
        return this.d;
    }

    float k() {
        return this.a;
    }

    float l() {
        return this.b;
    }

    public void m(float f, float f1) {
        e m$e0 = new e();
        e.c(m$e0, f);
        e.e(m$e0, f1);
        this.g.add(m$e0);
        c m$c0 = new c(m$e0, this.i(), this.j());
        this.c(m$c0, m$c0.c() + 270.0f, m$c0.c() + 270.0f);
        this.r(f);
        this.s(f1);
    }

    public void n(float f, float f1) {
        this.o(f, f1, 270.0f, 0.0f);
    }

    public void o(float f, float f1, float f2, float f3) {
        this.t(f);
        this.u(f1);
        this.r(f);
        this.s(f1);
        this.p(f2);
        this.q((f2 + f3) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }

    private void p(float f) {
        this.e = f;
    }

    private void q(float f) {
        this.f = f;
    }

    private void r(float f) {
        this.c = f;
    }

    private void s(float f) {
        this.d = f;
    }

    private void t(float f) {
        this.a = f;
    }

    private void u(float f) {
        this.b = f;
    }
}

