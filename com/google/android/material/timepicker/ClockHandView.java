package com.google.android.material.timepicker;

import M1.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.Y;
import com.google.android.material.internal.t;
import java.util.ArrayList;
import java.util.List;
import z1.a;
import z1.c;
import z1.j;
import z1.k;

class ClockHandView extends View {
    public interface b {
        void a(float arg1, boolean arg2);
    }

    private final int f;
    private final TimeInterpolator g;
    private final ValueAnimator h;
    private boolean i;
    private float j;
    private float k;
    private boolean l;
    private final int m;
    private boolean n;
    private final List o;
    private final int p;
    private final float q;
    private final Paint r;
    private final RectF s;
    private final int t;
    private float u;
    private boolean v;
    private double w;
    private int x;
    private int y;

    public ClockHandView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.A);
    }

    public ClockHandView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.h = new ValueAnimator();
        this.o = new ArrayList();
        Paint paint0 = new Paint();
        this.r = paint0;
        this.s = new RectF();
        this.y = 1;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, k.X1, v, j.y);
        this.f = h.f(context0, a.C, 200);
        this.g = h.g(context0, a.J, A1.a.b);
        this.x = typedArray0.getDimensionPixelSize(k.Z1, 0);
        this.p = typedArray0.getDimensionPixelSize(k.a2, 0);
        Resources resources0 = this.getResources();
        this.t = resources0.getDimensionPixelSize(c.E);
        this.q = (float)resources0.getDimensionPixelSize(c.C);
        int v1 = typedArray0.getColor(k.Y1, 0);
        paint0.setAntiAlias(true);
        paint0.setColor(v1);
        this.n(0.0f);
        this.m = ViewConfiguration.get(context0).getScaledTouchSlop();
        Y.x0(this, 2);
        typedArray0.recycle();
    }

    public void b(b clockHandView$b0) {
        this.o.add(clockHandView$b0);
    }

    private void c(float f, float f1) {
        this.y = L1.a.a(this.getWidth() / 2, this.getHeight() / 2, f, f1) <= ((float)this.h(2)) + t.c(this.getContext(), 12) ? 2 : 1;
    }

    private void d(Canvas canvas0) {
        int v = this.getHeight();
        int v1 = this.getWidth();
        int v2 = this.h(this.y);
        float f = ((float)Math.cos(this.w)) * ((float)v2) + ((float)(v1 / 2));
        float f1 = ((float)v2) * ((float)Math.sin(this.w)) + ((float)(v / 2));
        this.r.setStrokeWidth(0.0f);
        canvas0.drawCircle(f, f1, ((float)this.p), this.r);
        double f2 = Math.sin(this.w);
        double f3 = Math.cos(this.w);
        double f4 = (double)(((float)(v2 - this.p)));
        this.r.setStrokeWidth(((float)this.t));
        canvas0.drawLine(((float)(v1 / 2)), ((float)(v / 2)), ((float)(v1 / 2 + ((int)(f3 * f4)))), ((float)(v / 2 + ((int)(f4 * f2)))), this.r);
        canvas0.drawCircle(((float)(v1 / 2)), ((float)(v / 2)), this.q, this.r);
    }

    public RectF e() {
        return this.s;
    }

    private int f(float f, float f1) {
        int v = this.getWidth();
        int v1 = (int)Math.toDegrees(Math.atan2(f1 - ((float)(this.getHeight() / 2)), f - ((float)(v / 2))));
        return v1 + 90 >= 0 ? v1 + 90 : v1 + 450;
    }

    public float g() {
        return this.u;
    }

    private int h(int v) {
        return v == 2 ? Math.round(((float)this.x) * 0.66f) : this.x;
    }

    public int i() {
        return this.p;
    }

    private Pair j(float f) {
        float f1 = this.g();
        if(Math.abs(f1 - f) > 180.0f) {
            if(Float.compare(f1, 180.0f) > 0 && f < 180.0f) {
                f += 360.0f;
            }
            if(f1 < 180.0f && f > 180.0f) {
                f1 += 360.0f;
            }
        }
        return new Pair(f1, f);
    }

    private boolean k(float f, float f1, boolean z, boolean z1, boolean z2) {
        int v = this.f(f, f1);
        boolean z3 = false;
        boolean z4 = Float.compare(this.g(), v) != 0;
        if(z1 && z4) {
            return true;
        }
        if(!z4 && !z) {
            return false;
        }
        if(z2 && this.i) {
            z3 = true;
        }
        this.o(((float)v), z3);
        return true;
    }

    // 检测为 Lambda 实现
    private void l(ValueAnimator valueAnimator0) [...]

    public void m(int v) {
        this.x = v;
        this.invalidate();
    }

    public void n(float f) {
        this.o(f, false);
    }

    public void o(float f, boolean z) {
        class com.google.android.material.timepicker.ClockHandView.a extends AnimatorListenerAdapter {
            final ClockHandView a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationCancel(Animator animator0) {
                animator0.end();
            }
        }

        ValueAnimator valueAnimator0 = this.h;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
        if(!z) {
            this.p(f, false);
            return;
        }
        Pair pair0 = this.j(f);
        this.h.setFloatValues(new float[]{((float)(((Float)pair0.first))), ((float)(((Float)pair0.second)))});
        this.h.setDuration(((long)this.f));
        this.h.setInterpolator(this.g);
        com.google.android.material.timepicker.b b0 = (ValueAnimator valueAnimator0) -> this.p(((float)(((Float)valueAnimator0.getAnimatedValue()))), true);
        this.h.addUpdateListener(b0);
        com.google.android.material.timepicker.ClockHandView.a clockHandView$a0 = new com.google.android.material.timepicker.ClockHandView.a(this);
        this.h.addListener(clockHandView$a0);
        this.h.start();
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        this.d(canvas0);
    }

    @Override  // android.view.View
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(!this.h.isRunning()) {
            this.n(this.g());
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        boolean z1;
        boolean z;
        int v = motionEvent0.getActionMasked();
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        switch(v) {
            case 0: {
                this.j = f;
                this.k = f1;
                this.l = true;
                this.v = false;
                z1 = true;
                z = false;
                z2 = false;
                break;
            }
            case 1: {
            label_17:
                int v1 = (int)(f - this.j);
                int v2 = (int)(f1 - this.k);
                this.l = v1 * v1 + v2 * v2 > this.m;
                z = this.v;
                if(this.n) {
                    this.c(f, f1);
                }
                z2 = v == 1;
                z1 = false;
                break;
            }
            default: {
                if(v == 2) {
                    goto label_17;
                }
                else {
                    z = false;
                    z1 = false;
                    z2 = false;
                }
            }
        }
        this.v |= this.k(f, f1, z, z1, z2);
        return true;
    }

    private void p(float f, boolean z) {
        this.u = f % 360.0f;
        this.w = Math.toRadians(f % 360.0f - 90.0f);
        int v = this.getHeight();
        int v1 = this.getWidth();
        float f1 = (float)this.h(this.y);
        float f2 = ((float)(v1 / 2)) + ((float)Math.cos(this.w)) * f1;
        float f3 = ((float)(v / 2)) + f1 * ((float)Math.sin(this.w));
        this.s.set(f2 - ((float)this.p), f3 - ((float)this.p), f2 + ((float)this.p), f3 + ((float)this.p));
        for(Object object0: this.o) {
            ((b)object0).a(f % 360.0f, z);
        }
        this.invalidate();
    }

    void q(boolean z) {
        if(this.n && !z) {
            this.y = 1;
        }
        this.n = z;
        this.invalidate();
    }
}

