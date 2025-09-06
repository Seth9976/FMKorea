package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.Y;

class d extends n implements r {
    class a implements Runnable {
        final d f;

        @Override
        public void run() {
            d.this.q(500);
        }
    }

    class b extends s {
        final d a;

        @Override  // androidx.recyclerview.widget.RecyclerView$s
        public void b(RecyclerView recyclerView0, int v, int v1) {
            int v2 = recyclerView0.computeHorizontalScrollOffset();
            int v3 = recyclerView0.computeVerticalScrollOffset();
            d.this.B(v2, v3);
        }
    }

    class c extends AnimatorListenerAdapter {
        private boolean a;
        final d b;

        c() {
            this.a = false;
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationCancel(Animator animator0) {
            this.a = true;
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            if(this.a) {
                this.a = false;
                return;
            }
            if(((float)(((Float)d.this.z.getAnimatedValue()))) == 0.0f) {
                d.this.A = 0;
                d.this.y(0);
                return;
            }
            d.this.A = 2;
            d.this.v();
        }
    }

    class androidx.recyclerview.widget.d.d implements ValueAnimator.AnimatorUpdateListener {
        final d a;

        @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator0) {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            d.this.c.setAlpha(((int)(f * 255.0f)));
            d.this.d.setAlpha(((int)(f * 255.0f)));
            d.this.v();
        }
    }

    int A;
    private final Runnable B;
    private final s C;
    private static final int[] D;
    private static final int[] E;
    private final int a;
    private final int b;
    final StateListDrawable c;
    final Drawable d;
    private final int e;
    private final int f;
    private final StateListDrawable g;
    private final Drawable h;
    private final int i;
    private final int j;
    int k;
    int l;
    float m;
    int n;
    int o;
    float p;
    private int q;
    private int r;
    private RecyclerView s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private final int[] x;
    private final int[] y;
    final ValueAnimator z;

    static {
        d.D = new int[]{0x10100A7};
        d.E = new int[0];
    }

    d(RecyclerView recyclerView0, StateListDrawable stateListDrawable0, Drawable drawable0, StateListDrawable stateListDrawable1, Drawable drawable1, int v, int v1, int v2) {
        this.q = 0;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.v = 0;
        this.w = 0;
        this.x = new int[2];
        this.y = new int[2];
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.z = valueAnimator0;
        this.A = 0;
        this.B = () -> {
            int v1 = d.this.A;
            if(v1 == 1) {
                d.this.z.cancel();
            }
            else if(v1 != 2) {
                return;
            }
            d.this.A = 3;
            float[] arr_f = {((float)(((Float)d.this.z.getAnimatedValue()))), 0.0f};
            d.this.z.setFloatValues(arr_f);
            d.this.z.setDuration(((long)500));
            d.this.z.start();
        };
        this.C = new b(this);
        this.c = stateListDrawable0;
        this.d = drawable0;
        this.g = stateListDrawable1;
        this.h = drawable1;
        this.e = Math.max(v, stateListDrawable0.getIntrinsicWidth());
        this.f = Math.max(v, drawable0.getIntrinsicWidth());
        this.i = Math.max(v, stateListDrawable1.getIntrinsicWidth());
        this.j = Math.max(v, drawable1.getIntrinsicWidth());
        this.a = v1;
        this.b = v2;
        stateListDrawable0.setAlpha(0xFF);
        drawable0.setAlpha(0xFF);
        valueAnimator0.addListener(new c(this));
        valueAnimator0.addUpdateListener(new androidx.recyclerview.widget.d.d(this));
        this.j(recyclerView0);
    }

    public void A() {
        int v = this.A;
        if(v == 0) {
        label_4:
            this.A = 1;
            float[] arr_f = {((float)(((Float)this.z.getAnimatedValue()))), 1.0f};
            this.z.setFloatValues(arr_f);
            this.z.setDuration(500L);
            this.z.setStartDelay(0L);
            this.z.start();
        }
        else if(v == 3) {
            this.z.cancel();
            goto label_4;
        }
    }

    void B(int v, int v1) {
        int v2 = this.s.computeVerticalScrollRange();
        int v3 = this.r;
        this.t = v2 - v3 > 0 && v3 >= this.a;
        int v4 = this.s.computeHorizontalScrollRange();
        int v5 = this.q;
        boolean z = v4 - v5 > 0 && v5 >= this.a;
        this.u = z;
        boolean z1 = this.t;
        if(!z1 && !z) {
            if(this.v != 0) {
                this.y(0);
            }
            return;
        }
        if(z1) {
            this.l = (int)(((float)v3) * (((float)v1) + ((float)v3) / 2.0f) / ((float)v2));
            this.k = Math.min(v3, v3 * v3 / v2);
        }
        if(this.u) {
            this.o = (int)(((float)v5) * (((float)v) + ((float)v5) / 2.0f) / ((float)v4));
            this.n = Math.min(v5, v5 * v5 / v4);
        }
        if(this.v == 0 || this.v == 1) {
            this.y(1);
        }
    }

    private void C(float f) {
        int[] arr_v = this.p();
        float f1 = Math.max(arr_v[0], Math.min(arr_v[1], f));
        if(Math.abs(((float)this.l) - f1) < 2.0f) {
            return;
        }
        int v = this.x(this.m, f1, arr_v, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if(v != 0) {
            this.s.scrollBy(0, v);
        }
        this.m = f1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$r
    public void a(RecyclerView recyclerView0, MotionEvent motionEvent0) {
        if(this.v == 0) {
            return;
        }
        switch(motionEvent0.getAction()) {
            case 0: {
                boolean z = this.u(motionEvent0.getX(), motionEvent0.getY());
                boolean z1 = this.t(motionEvent0.getX(), motionEvent0.getY());
                if(z || z1) {
                    if(z1) {
                        this.w = 1;
                        this.p = (float)(((int)motionEvent0.getX()));
                    }
                    else if(z) {
                        this.w = 2;
                        this.m = (float)(((int)motionEvent0.getY()));
                    }
                    this.y(2);
                    return;
                }
                break;
            }
            case 1: {
                if(this.v == 2) {
                    this.m = 0.0f;
                    this.p = 0.0f;
                    this.y(1);
                    this.w = 0;
                    return;
                }
            label_22:
                if(motionEvent0.getAction() == 2 && this.v == 2) {
                    this.A();
                    if(this.w == 1) {
                        this.r(motionEvent0.getX());
                    }
                    if(this.w == 2) {
                        this.C(motionEvent0.getY());
                    }
                }
                break;
            }
            default: {
                goto label_22;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$r
    public boolean b(RecyclerView recyclerView0, MotionEvent motionEvent0) {
        int v = this.v;
        if(v == 1) {
            boolean z = this.u(motionEvent0.getX(), motionEvent0.getY());
            boolean z1 = this.t(motionEvent0.getX(), motionEvent0.getY());
            if(motionEvent0.getAction() == 0 && (z || z1)) {
                if(z1) {
                    this.w = 1;
                    this.p = (float)(((int)motionEvent0.getX()));
                }
                else if(z) {
                    this.w = 2;
                    this.m = (float)(((int)motionEvent0.getY()));
                }
                this.y(2);
                return true;
            }
            return false;
        }
        return v == 2;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$r
    public void c(boolean z) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$n
    public void i(Canvas canvas0, RecyclerView recyclerView0, y recyclerView$y0) {
        if(this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
            if(this.A != 0) {
                if(this.t) {
                    this.n(canvas0);
                }
                if(this.u) {
                    this.m(canvas0);
                }
            }
            return;
        }
        this.q = this.s.getWidth();
        this.r = this.s.getHeight();
        this.y(0);
    }

    public void j(RecyclerView recyclerView0) {
        RecyclerView recyclerView1 = this.s;
        if(recyclerView1 == recyclerView0) {
            return;
        }
        if(recyclerView1 != null) {
            this.l();
        }
        this.s = recyclerView0;
        if(recyclerView0 != null) {
            this.z();
        }
    }

    private void k() {
        this.s.removeCallbacks(this.B);
    }

    private void l() {
        this.s.X0(this);
        this.s.Y0(this);
        this.s.Z0(this.C);
        this.k();
    }

    private void m(Canvas canvas0) {
        int v = this.r - this.i;
        int v1 = this.o - this.n / 2;
        this.g.setBounds(0, 0, this.n, this.i);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas0.translate(0.0f, ((float)v));
        this.h.draw(canvas0);
        canvas0.translate(((float)v1), 0.0f);
        this.g.draw(canvas0);
        canvas0.translate(((float)(-v1)), ((float)(-v)));
    }

    private void n(Canvas canvas0) {
        int v = this.q - this.e;
        int v1 = this.l - this.k / 2;
        this.c.setBounds(0, 0, this.e, this.k);
        this.d.setBounds(0, 0, this.f, this.r);
        if(this.s()) {
            this.d.draw(canvas0);
            canvas0.translate(((float)this.e), ((float)v1));
            canvas0.scale(-1.0f, 1.0f);
            this.c.draw(canvas0);
            canvas0.scale(1.0f, 1.0f);
            canvas0.translate(((float)(-this.e)), ((float)(-v1)));
            return;
        }
        canvas0.translate(((float)v), 0.0f);
        this.d.draw(canvas0);
        canvas0.translate(0.0f, ((float)v1));
        this.c.draw(canvas0);
        canvas0.translate(((float)(-v)), ((float)(-v1)));
    }

    private int[] o() {
        this.y[0] = this.b;
        this.y[1] = this.q - this.b;
        return this.y;
    }

    private int[] p() {
        this.x[0] = this.b;
        this.x[1] = this.r - this.b;
        return this.x;
    }

    // 检测为 Lambda 实现
    void q(int v) [...]

    private void r(float f) {
        int[] arr_v = this.o();
        float f1 = Math.max(arr_v[0], Math.min(arr_v[1], f));
        if(Math.abs(((float)this.o) - f1) < 2.0f) {
            return;
        }
        int v = this.x(this.p, f1, arr_v, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if(v != 0) {
            this.s.scrollBy(v, 0);
        }
        this.p = f1;
    }

    private boolean s() {
        return Y.z(this.s) == 1;
    }

    boolean t(float f, float f1) {
        return f1 >= ((float)(this.r - this.i)) && (f >= ((float)(this.o - this.n / 2)) && f <= ((float)(this.o + this.n / 2)));
    }

    boolean u(float f, float f1) {
        if(this.s()) {
            return f <= ((float)(this.e / 2)) ? f1 >= ((float)(this.l - this.k / 2)) && f1 <= ((float)(this.l + this.k / 2)) : false;
        }
        return f >= ((float)(this.q - this.e)) ? f1 >= ((float)(this.l - this.k / 2)) && f1 <= ((float)(this.l + this.k / 2)) : false;
    }

    void v() {
        this.s.invalidate();
    }

    private void w(int v) {
        this.k();
        this.s.postDelayed(this.B, ((long)v));
    }

    private int x(float f, float f1, int[] arr_v, int v, int v1, int v2) {
        int v3 = arr_v[1] - arr_v[0];
        if(v3 == 0) {
            return 0;
        }
        int v4 = v - v2;
        int v5 = (int)((f1 - f) / ((float)v3) * ((float)v4));
        return v1 + v5 >= v4 || v1 + v5 < 0 ? 0 : v5;
    }

    void y(int v) {
        if(v == 2 && this.v != 2) {
            this.c.setState(d.D);
            this.k();
        }
        if(v == 0) {
            this.v();
        }
        else {
            this.A();
        }
        if(this.v == 2 && v != 2) {
            this.c.setState(d.E);
            this.w(1200);
        }
        else if(v == 1) {
            this.w(1500);
        }
        this.v = v;
    }

    private void z() {
        this.s.h(this);
        this.s.j(this);
        this.s.k(this.C);
    }
}

