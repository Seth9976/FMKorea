package S1;

import android.graphics.Matrix;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public class l {
    static abstract class a {
        static final l a;

        static {
            a.a = new l();
        }
    }

    public interface b {
        void a(m arg1, Matrix arg2, int arg3);

        void b(m arg1, Matrix arg2, int arg3);
    }

    static final class c {
        public final k a;
        public final Path b;
        public final RectF c;
        public final b d;
        public final float e;

        c(k k0, float f, RectF rectF0, b l$b0, Path path0) {
            this.d = l$b0;
            this.a = k0;
            this.e = f;
            this.c = rectF0;
            this.b = path0;
        }
    }

    private final m[] a;
    private final Matrix[] b;
    private final Matrix[] c;
    private final PointF d;
    private final Path e;
    private final Path f;
    private final m g;
    private final float[] h;
    private final float[] i;
    private final Path j;
    private final Path k;
    private boolean l;

    public l() {
        this.a = new m[4];
        this.b = new Matrix[4];
        this.c = new Matrix[4];
        this.d = new PointF();
        this.e = new Path();
        this.f = new Path();
        this.g = new m();
        this.h = new float[2];
        this.i = new float[2];
        this.j = new Path();
        this.k = new Path();
        this.l = true;
        for(int v = 0; v < 4; ++v) {
            this.a[v] = new m();
            this.b[v] = new Matrix();
            this.c[v] = new Matrix();
        }
    }

    private float a(int v) [...] // Inlined contents

    private void b(c l$c0, int v) {
        this.h[0] = this.a[v].k();
        this.h[1] = this.a[v].l();
        this.b[v].mapPoints(this.h);
        if(v == 0) {
            l$c0.b.moveTo(this.h[0], this.h[1]);
        }
        else {
            l$c0.b.lineTo(this.h[0], this.h[1]);
        }
        this.a[v].d(this.b[v], l$c0.b);
        b l$b0 = l$c0.d;
        if(l$b0 != null) {
            l$b0.b(this.a[v], this.b[v], v);
        }
    }

    private void c(c l$c0, int v) {
        int v1 = (v + 1) % 4;
        this.h[0] = this.a[v].i();
        this.h[1] = this.a[v].j();
        this.b[v].mapPoints(this.h);
        this.i[0] = this.a[v1].k();
        this.i[1] = this.a[v1].l();
        this.b[v1].mapPoints(this.i);
        float f = Math.max(((float)Math.hypot(this.h[0] - this.i[0], this.h[1] - this.i[1])) - 0.001f, 0.0f);
        float f1 = this.i(l$c0.c, v);
        this.g.n(0.0f, 0.0f);
        this.j(v, l$c0.a).b(f, f1, l$c0.e, this.g);
        this.j.reset();
        this.g.d(this.c[v], this.j);
        if(!this.l || !this.l(this.j, v) && !this.l(this.j, v1)) {
            this.g.d(this.c[v], l$c0.b);
        }
        else {
            this.j.op(this.j, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.k();
            this.h[1] = this.g.l();
            this.c[v].mapPoints(this.h);
            this.e.moveTo(this.h[0], this.h[1]);
            this.g.d(this.c[v], this.e);
        }
        b l$b0 = l$c0.d;
        if(l$b0 != null) {
            l$b0.a(this.g, this.c[v], v);
        }
    }

    public void d(k k0, float f, RectF rectF0, b l$b0, Path path0) {
        path0.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF0, Path.Direction.CW);
        c l$c0 = new c(k0, f, rectF0, l$b0, path0);
        for(int v1 = 0; v1 < 4; ++v1) {
            this.m(l$c0, v1);
            this.n(v1);
        }
        for(int v = 0; v < 4; ++v) {
            this.b(l$c0, v);
            this.c(l$c0, v);
        }
        path0.close();
        this.e.close();
        if(!this.e.isEmpty()) {
            path0.op(this.e, Path.Op.UNION);
        }
    }

    public void e(k k0, float f, RectF rectF0, Path path0) {
        this.d(k0, f, rectF0, null, path0);
    }

    private void f(int v, RectF rectF0, PointF pointF0) {
        switch(v) {
            case 1: {
                pointF0.set(rectF0.right, rectF0.bottom);
                return;
            }
            case 2: {
                pointF0.set(rectF0.left, rectF0.bottom);
                return;
            }
            case 3: {
                pointF0.set(rectF0.left, rectF0.top);
                return;
            }
            default: {
                pointF0.set(rectF0.right, rectF0.top);
            }
        }
    }

    private S1.c g(int v, k k0) {
        switch(v) {
            case 1: {
                return k0.l();
            }
            case 2: {
                return k0.j();
            }
            case 3: {
                return k0.r();
            }
            default: {
                return k0.t();
            }
        }
    }

    private d h(int v, k k0) {
        switch(v) {
            case 1: {
                return k0.k();
            }
            case 2: {
                return k0.i();
            }
            case 3: {
                return k0.q();
            }
            default: {
                return k0.s();
            }
        }
    }

    private float i(RectF rectF0, int v) {
        m m0 = this.a[v];
        this.h[0] = m0.c;
        this.h[1] = m0.d;
        this.b[v].mapPoints(this.h);
        return v == 1 || v == 3 ? Math.abs(rectF0.centerX() - this.h[0]) : Math.abs(rectF0.centerY() - this.h[1]);
    }

    private f j(int v, k k0) {
        switch(v) {
            case 1: {
                return k0.h();
            }
            case 2: {
                return k0.n();
            }
            case 3: {
                return k0.p();
            }
            default: {
                return k0.o();
            }
        }
    }

    public static l k() {
        return a.a;
    }

    private boolean l(Path path0, int v) {
        this.k.reset();
        this.a[v].d(this.b[v], this.k);
        RectF rectF0 = new RectF();
        path0.computeBounds(rectF0, true);
        this.k.computeBounds(rectF0, true);
        path0.op(this.k, Path.Op.INTERSECT);
        path0.computeBounds(rectF0, true);
        return !rectF0.isEmpty() || rectF0.width() > 1.0f && rectF0.height() > 1.0f;
    }

    private void m(c l$c0, int v) {
        S1.c c0 = this.g(v, l$c0.a);
        this.h(v, l$c0.a).b(this.a[v], 90.0f, l$c0.e, l$c0.c, c0);
        this.b[v].reset();
        this.f(v, l$c0.c, this.d);
        this.b[v].setTranslate(this.d.x, this.d.y);
        this.b[v].preRotate(((float)((v + 1) % 4 * 90)));
    }

    private void n(int v) {
        this.h[0] = this.a[v].i();
        this.h[1] = this.a[v].j();
        this.b[v].mapPoints(this.h);
        this.c[v].reset();
        this.c[v].setTranslate(this.h[0], this.h[1]);
        this.c[v].preRotate(((float)((v + 1) % 4 * 90)));
    }
}

