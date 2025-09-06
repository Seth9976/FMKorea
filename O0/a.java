package o0;

import B.h;
import T.b;
import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public class a extends Drawable implements Animatable {
    static class c {
        final RectF a;
        final Paint b;
        final Paint c;
        final Paint d;
        float e;
        float f;
        float g;
        float h;
        int[] i;
        int j;
        float k;
        float l;
        float m;
        boolean n;
        Path o;
        float p;
        float q;
        int r;
        int s;
        int t;
        int u;

        c() {
            this.a = new RectF();
            Paint paint0 = new Paint();
            this.b = paint0;
            Paint paint1 = new Paint();
            this.c = paint1;
            Paint paint2 = new Paint();
            this.d = paint2;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 0xFF;
            paint0.setStrokeCap(Paint.Cap.SQUARE);
            paint0.setAntiAlias(true);
            paint0.setStyle(Paint.Style.STROKE);
            paint1.setStyle(Paint.Style.FILL);
            paint1.setAntiAlias(true);
            paint2.setColor(0);
        }

        void A() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }

        void a(Canvas canvas0, Rect rect0) {
            float f = this.q <= 0.0f ? ((float)Math.min(rect0.width(), rect0.height())) / 2.0f - Math.max(((float)this.r) * this.p / 2.0f, this.h / 2.0f) : this.h / 2.0f + this.q;
            this.a.set(((float)rect0.centerX()) - f, ((float)rect0.centerY()) - f, ((float)rect0.centerX()) + f, ((float)rect0.centerY()) + f);
            float f1 = (this.e + this.g) * 360.0f;
            float f2 = (this.f + this.g) * 360.0f - f1;
            this.b.setColor(this.u);
            this.b.setAlpha(this.t);
            float f3 = this.h / 2.0f;
            this.a.inset(f3, f3);
            canvas0.drawCircle(this.a.centerX(), this.a.centerY(), this.a.width() / 2.0f, this.d);
            this.a.inset(-f3, -f3);
            canvas0.drawArc(this.a, f1, f2, false, this.b);
            this.b(canvas0, f1, f2, this.a);
        }

        void b(Canvas canvas0, float f, float f1, RectF rectF0) {
            if(this.n) {
                Path path0 = this.o;
                if(path0 == null) {
                    Path path1 = new Path();
                    this.o = path1;
                    path1.setFillType(Path.FillType.EVEN_ODD);
                }
                else {
                    path0.reset();
                }
                float f2 = Math.min(rectF0.width(), rectF0.height());
                float f3 = ((float)this.r) * this.p / 2.0f;
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(((float)this.r) * this.p, 0.0f);
                this.o.lineTo(((float)this.r) * this.p / 2.0f, ((float)this.s) * this.p);
                this.o.offset(f2 / 2.0f + rectF0.centerX() - f3, rectF0.centerY() + this.h / 2.0f);
                this.o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas0.save();
                canvas0.rotate(f + f1, rectF0.centerX(), rectF0.centerY());
                canvas0.drawPath(this.o, this.c);
                canvas0.restore();
            }
        }

        int c() {
            return this.t;
        }

        float d() {
            return this.f;
        }

        int e() {
            int[] arr_v = this.i;
            return arr_v[this.f()];
        }

        int f() {
            return (this.j + 1) % this.i.length;
        }

        float g() {
            return this.e;
        }

        int h() {
            return this.i[this.j];
        }

        float i() {
            return this.l;
        }

        float j() {
            return this.m;
        }

        float k() {
            return this.k;
        }

        void l() {
            this.t(this.f());
        }

        void m() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.y(0.0f);
            this.v(0.0f);
            this.w(0.0f);
        }

        void n(int v) {
            this.t = v;
        }

        void o(float f, float f1) {
            this.r = (int)f;
            this.s = (int)f1;
        }

        void p(float f) {
            if(f != this.p) {
                this.p = f;
            }
        }

        void q(float f) {
            this.q = f;
        }

        void r(int v) {
            this.u = v;
        }

        void s(ColorFilter colorFilter0) {
            this.b.setColorFilter(colorFilter0);
        }

        void t(int v) {
            this.j = v;
            this.u = this.i[v];
        }

        void u(int[] arr_v) {
            this.i = arr_v;
            this.t(0);
        }

        void v(float f) {
            this.f = f;
        }

        void w(float f) {
            this.g = f;
        }

        void x(boolean z) {
            if(this.n != z) {
                this.n = z;
            }
        }

        void y(float f) {
            this.e = f;
        }

        void z(float f) {
            this.h = f;
            this.b.setStrokeWidth(f);
        }
    }

    private final c f;
    private float g;
    private Resources h;
    private Animator i;
    float j;
    boolean k;
    private static final Interpolator l;
    private static final Interpolator m;
    private static final int[] n;

    static {
        a.l = new LinearInterpolator();
        a.m = new b();
        a.n = new int[]{0xFF000000};
    }

    public a(Context context0) {
        this.h = ((Context)h.g(context0)).getResources();
        c a$c0 = new c();
        this.f = a$c0;
        a$c0.u(a.n);
        this.k(2.5f);
        this.m();
    }

    private void a(float f, c a$c0) {
        this.n(f, a$c0);
        a$c0.y(a$c0.k() + (a$c0.i() - 0.01f - a$c0.k()) * f);
        a$c0.v(a$c0.i());
        a$c0.w(a$c0.j() + (((float)(Math.floor(a$c0.j() / 0.8f) + 1.0)) - a$c0.j()) * f);
    }

    void b(float f, c a$c0, boolean z) {
        float f3;
        float f2;
        if(this.k) {
            this.a(f, a$c0);
            return;
        }
        if(f != 1.0f || z) {
            float f1 = a$c0.j();
            if(Float.compare(f, 0.5f) < 0) {
                f2 = a$c0.k();
                f3 = a.m.getInterpolation(f / 0.5f) * 0.79f + 0.01f + f2;
            }
            else {
                float f4 = a$c0.k();
                f2 = f4 + 0.79f - ((1.0f - a.m.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f + 0.01f);
                f3 = f4 + 0.79f;
            }
            float f5 = (f + this.j) * 216.0f;
            a$c0.y(f2);
            a$c0.v(f3);
            a$c0.w(f1 + 0.21f * f);
            this.h(f5);
        }
    }

    private int c(float f, int v, int v1) {
        int v2 = v >> 24 & 0xFF;
        int v3 = v >> 16 & 0xFF;
        int v4 = v >> 8 & 0xFF;
        return v2 + ((int)(((float)((v1 >> 24 & 0xFF) - v2)) * f)) << 24 | v3 + ((int)(((float)((v1 >> 16 & 0xFF) - v3)) * f)) << 16 | v4 + ((int)(((float)((v1 >> 8 & 0xFF) - v4)) * f)) << 8 | (v & 0xFF) + ((int)(f * ((float)((v1 & 0xFF) - (v & 0xFF)))));
    }

    public void d(boolean z) {
        this.f.x(z);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Rect rect0 = this.getBounds();
        canvas0.save();
        canvas0.rotate(this.g, rect0.exactCenterX(), rect0.exactCenterY());
        this.f.a(canvas0, rect0);
        canvas0.restore();
    }

    public void e(float f) {
        this.f.p(f);
        this.invalidateSelf();
    }

    public void f(int[] arr_v) {
        this.f.u(arr_v);
        this.f.t(0);
        this.invalidateSelf();
    }

    public void g(float f) {
        this.f.w(f);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f.c();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private void h(float f) {
        this.g = f;
    }

    private void i(float f, float f1, float f2, float f3) {
        float f4 = this.h.getDisplayMetrics().density;
        this.f.z(f1 * f4);
        this.f.q(f * f4);
        this.f.t(0);
        this.f.o(f2 * f4, f3 * f4);
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.i.isRunning();
    }

    public void j(float f, float f1) {
        this.f.y(f);
        this.f.v(f1);
        this.invalidateSelf();
    }

    public void k(float f) {
        this.f.z(f);
        this.invalidateSelf();
    }

    public void l(int v) {
        if(v == 0) {
            this.i(11.0f, 3.0f, 12.0f, 6.0f);
        }
        else {
            this.i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        this.invalidateSelf();
    }

    private void m() {
        class o0.a.a implements ValueAnimator.AnimatorUpdateListener {
            final c a;
            final a b;

            o0.a.a(c a$c0) {
                this.a = a$c0;
                super();
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                a.this.n(f, this.a);
                a.this.b(f, this.a, false);
                a.this.invalidateSelf();
            }
        }


        class o0.a.b implements Animator.AnimatorListener {
            final c a;
            final a b;

            o0.a.b(c a$c0) {
                this.a = a$c0;
                super();
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
                a.this.b(1.0f, this.a, true);
                this.a.A();
                this.a.l();
                a a0 = a.this;
                if(a0.k) {
                    a0.k = false;
                    animator0.cancel();
                    animator0.setDuration(0x534L);
                    animator0.start();
                    this.a.x(false);
                    return;
                }
                ++a0.j;
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
                a.this.j = 0.0f;
            }
        }

        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator0.addUpdateListener(new o0.a.a(this, this.f));
        valueAnimator0.setRepeatCount(-1);
        valueAnimator0.setRepeatMode(1);
        valueAnimator0.setInterpolator(a.l);
        valueAnimator0.addListener(new o0.a.b(this, this.f));
        this.i = valueAnimator0;
    }

    void n(float f, c a$c0) {
        if(f > 0.75f) {
            a$c0.r(this.c((f - 0.75f) / 0.25f, a$c0.h(), a$c0.e()));
            return;
        }
        a$c0.r(a$c0.h());
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.f.n(v);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.f.s(colorFilter0);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        this.i.cancel();
        this.f.A();
        if(this.f.d() != this.f.g()) {
            this.k = true;
            this.i.setDuration(666L);
            this.i.start();
            return;
        }
        this.f.t(0);
        this.f.m();
        this.i.setDuration(0x534L);
        this.i.start();
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        this.i.cancel();
        this.h(0.0f);
        this.f.x(false);
        this.f.t(0);
        this.f.m();
        this.invalidateSelf();
    }
}

