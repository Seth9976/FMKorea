package co.median.android.widget;

import B0.x0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.core.content.res.h;
import androidx.core.view.Y;
import z3.k;

public final class SwipeHistoryNavigationLayout extends FrameLayout {
    public interface a {
        void a();

        void b();

        String c();

        boolean d();

        boolean e();

        boolean f();

        boolean g();

        boolean h();
    }

    private boolean A;
    private boolean B;
    private boolean C;
    private float D;
    private float E;
    private float F;
    private boolean G;
    private float H;
    private float I;
    private boolean J;
    private a K;
    private final g f;
    private final g g;
    private final EdgeEffect h;
    private final float i;
    private final float j;
    private final Drawable k;
    private final Drawable l;
    private final Drawable m;
    private final String n;
    private final int o;
    private int p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private int z;

    public SwipeHistoryNavigationLayout(Context context0, AttributeSet attributeSet0) {
        k.e(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public SwipeHistoryNavigationLayout(Context context0, AttributeSet attributeSet0, int v) {
        public static final class b implements a {
            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public void a() {
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public void b() {
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public String c() {
                return "";
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public boolean d() {
                return true;
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public boolean e() {
                return true;
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public boolean f() {
                return true;
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public boolean g() {
                return true;
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public boolean h() {
                return true;
            }
        }

        k.e(context0, "context");
        super(context0, attributeSet0, v);
        float f = this.getResources().getDimension(0x7F0700B3);  // dimen:handle_icon_size
        this.i = f;
        this.j = f / (((float)this.getContext().getResources().getDisplayMetrics().densityDpi) / 160.0f);
        this.q = NaNf;
        this.r = NaNf;
        this.s = NaNf;
        this.t = NaNf;
        this.u = NaNf;
        this.v = 0.05f;
        this.w = 0.16f;
        this.x = 80.0f;
        this.y = 30.0f;
        this.z = 0x80000000;
        this.D = NaNf;
        this.E = NaNf;
        this.F = NaNf;
        this.K = new b();
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, x0.W1, 0, 0);
        Drawable drawable0 = typedArray0.getDrawable(1);
        this.k = drawable0;
        Drawable drawable1 = typedArray0.getDrawable(3);
        if(drawable1 == null) {
            drawable1 = h.f(typedArray0.getResources(), 0x7F0800BB, context0.getTheme());  // drawable:ic_baseline_arrow_back_24
        }
        this.l = drawable1;
        Drawable drawable2 = typedArray0.getDrawable(5);
        if(drawable2 == null) {
            drawable2 = h.f(typedArray0.getResources(), 0x7F0800BC, context0.getTheme());  // drawable:ic_baseline_arrow_forward_24
        }
        this.m = drawable2;
        String s = typedArray0.getString(4);
        if(s == null) {
            s = "";
        }
        this.n = s;
        int v1 = typedArray0.getColor(2, h.d(typedArray0.getResources(), 0x7F060330, context0.getTheme()));  // color:swipe_nav_inactive
        this.o = v1;
        this.p = typedArray0.getColor(0, h.d(typedArray0.getResources(), 0x7F06032E, context0.getTheme()));  // color:swipe_nav_active
        this.f = new g(context0, drawable0, drawable1, s, v1, this.p);
        this.g = new g(context0, drawable0, drawable2, "", v1, this.p);
        this.h = new EdgeEffect(context0);
        this.setWillNotDraw(false);
    }

    public SwipeHistoryNavigationLayout(Context context0, AttributeSet attributeSet0, int v, int v1, z3.g g0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final boolean a(float f) {
        return f <= this.s;
    }

    private final boolean b(float f) {
        return f >= this.t;
    }

    private final void c() {
        if(this.A) {
            this.f.i();
            this.f.g();
            return;
        }
        if(this.B) {
            this.g.i();
            this.g.g();
        }
    }

    private final void d() {
        String s = this.K.c();
        this.f.setText(s);
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        boolean z;
        k.e(canvas0, "canvas");
        super.draw(canvas0);
        switch(this.getOverScrollMode()) {
            case 0: 
            case 1: {
                if(this.h.isFinished()) {
                    z = false;
                }
                else {
                    int v = canvas0.save();
                    int v1 = this.getWidth();
                    int v2 = this.getHeight();
                    int v3 = this.getPaddingTop();
                    int v4 = this.getPaddingBottom();
                    canvas0.rotate(90.0f);
                    canvas0.translate(((float)this.getPaddingTop()), -((float)v1));
                    this.h.setSize(v2 - v3 - v4, v1);
                    z = this.h.draw(canvas0);
                    canvas0.restoreToCount(v);
                }
                break;
            }
            default: {
                this.h.finish();
                z = false;
            }
        }
        if(z) {
            Y.f0(this);
        }
    }

    private final void e() {
        this.f.setTranslationX(Math.min(this.F - this.y - ((float)this.z) - this.i, this.u - this.i));
    }

    private final void f() {
        float f = ((float)this.z) - (this.F - this.y);
        float f1 = (float)this.getWidth();
        this.g.setTranslationX(Math.max(f + this.i / 2.0f, f1 - this.u));
    }

    private final boolean g() {
        this.h.onRelease();
        if(this.A) {
            if(this.G) {
                this.c();
                this.K.f();
            }
            Property property0 = View.TRANSLATION_X;
            float[] arr_f = {this.f.getTranslationX(), this.q};
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.f, property0, arr_f);
            objectAnimator0.setDuration(400L);
            objectAnimator0.start();
        }
        else if(this.B) {
            if(this.G) {
                this.c();
                this.K.d();
            }
            Property property1 = View.TRANSLATION_X;
            float[] arr_f1 = {this.g.getTranslationX(), this.r};
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.g, property1, arr_f1);
            objectAnimator1.setDuration(400L);
            objectAnimator1.start();
        }
        this.A = false;
        this.B = false;
        this.G = false;
        this.C = false;
        return this.h.isFinished();
    }

    public final a getSwipeNavListener() {
        return this.K;
    }

    private final void h() {
    }

    private final void i() {
        if(this.A && this.K.h()) {
            this.K.b();
            this.f.e();
            this.f.k();
            return;
        }
        if(this.B && this.K.e()) {
            this.K.a();
            this.g.e();
            this.g.k();
        }
    }

    @Override  // android.view.View
    public boolean isNestedScrollingEnabled() {
        return true;
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2, 19);
        this.addView(this.f, frameLayout$LayoutParams0);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-2, -2, 16);
        this.addView(this.g, frameLayout$LayoutParams1);
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        if(!this.K.g()) {
            return false;
        }
        Integer integer0 = motionEvent0 == null ? null : motionEvent0.getAction();
        if(integer0 == null || ((int)integer0) != 0) {
            if(integer0 != null && ((int)integer0) == 2) {
                float f = Math.abs(this.H - motionEvent0.getX());
                float f1 = Math.abs(this.I - motionEvent0.getY());
                if(this.C) {
                    return true;
                }
                if((this.A || this.B) && ((f > this.y || f1 > this.y) && !this.J)) {
                    this.J = true;
                    if(((double)(((float)Math.atan2(f1, f)))) <= 0.523599) {
                        this.C = true;
                        this.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
                return false;
            }
            if(integer0 != null && ((int)integer0) == 1) {
                this.H = 0.0f;
                this.I = 0.0f;
                this.A = false;
                this.B = false;
                return this.C ? true : super.onInterceptTouchEvent(motionEvent0);
            }
        }
        else {
            this.J = false;
            this.H = motionEvent0.getX();
            this.I = motionEvent0.getY();
            if(this.a(motionEvent0.getX()) && this.K.h()) {
                this.A = true;
                this.z = (int)motionEvent0.getX();
                this.d();
                return super.onInterceptTouchEvent(motionEvent0);
            }
            if(this.b(motionEvent0.getX()) && this.K.e()) {
                this.B = true;
                this.z = this.getWidth();
                return super.onInterceptTouchEvent(motionEvent0);
            }
        }
        return super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(z) {
            this.q = -this.i;
            this.f.setTranslationX(-this.i);
            float f = ((float)this.getWidth()) + this.i;
            this.r = f;
            this.g.setTranslationX(f);
            this.s = ((float)this.getWidth()) * this.v;
            this.t = ((float)this.getWidth()) - this.s;
            this.u = ((float)this.getWidth()) * this.w;
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z1;
        Integer integer0 = motionEvent0 == null ? null : motionEvent0.getAction();
        boolean z = false;
        if(integer0 != null && ((int)integer0) == 2) {
            float f = motionEvent0.getX();
            this.D = f;
            this.E = this.F;
            this.F = Math.abs(f - ((float)this.z));
            if(this.A && this.K.g() && this.F >= this.y) {
                this.e();
                z1 = false;
            }
            else if(!this.B || !this.K.g() || this.F < this.y) {
                z1 = false;
            }
            else if(this.K.e()) {
                this.f();
                z1 = false;
            }
            else {
                float f1 = this.F;
                float f2 = this.E;
                if(f1 > f2) {
                    float f3 = Math.abs(f1 - f2) / ((float)this.getWidth());
                    this.h.onPull(f3);
                    z1 = true;
                }
                else {
                    z1 = false;
                }
            }
            if(this.F <= this.u + this.x + this.j) {
                if(this.G) {
                    this.G = false;
                    this.c();
                }
            }
            else if(!this.G) {
                this.G = true;
                this.i();
            }
            z = z1;
        }
        else if(integer0 != null && ((int)integer0) == 1) {
            z1 = this.g();
            this.getParent().requestDisallowInterceptTouchEvent(false);
            z = z1;
        }
        if(z) {
            Y.f0(this);
        }
        return super.onTouchEvent(motionEvent0);
    }

    public final void setActiveColor(int v) {
        this.p = v;
        this.g.setActiveColor(v);
        this.f.setActiveColor(v);
    }

    public final void setSwipeNavListener(a swipeHistoryNavigationLayout$a0) {
        k.e(swipeHistoryNavigationLayout$a0, "<set-?>");
        this.K = swipeHistoryNavigationLayout$a0;
    }
}

