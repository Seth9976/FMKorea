package co.median.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.B;
import androidx.core.view.C;
import androidx.core.view.F;
import androidx.core.view.Y;

public abstract class b extends ViewGroup implements B {
    class a implements Animation.AnimationListener {
        final b a;

        @Override  // android.view.animation.Animation$AnimationListener
        public void onAnimationEnd(Animation animation0) {
            b b0 = b.this;
            if(b0.h) {
                b0.H.setAlpha(0xFF);
                b.this.H.start();
                b b1 = b.this;
                if(b1.N) {
                    j b$j0 = b1.g;
                    if(b$j0 != null) {
                        b$j0.c0();
                    }
                }
                b.this.r = b.this.A.getTop();
                return;
            }
            b0.k();
        }

        @Override  // android.view.animation.Animation$AnimationListener
        public void onAnimationRepeat(Animation animation0) {
        }

        @Override  // android.view.animation.Animation$AnimationListener
        public void onAnimationStart(Animation animation0) {
        }
    }

    class f extends Animation {
        final b f;

        @Override  // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation0) {
            int v = b.this.C + ((int)(((float)((b.this.P ? b.this.F : b.this.F - Math.abs(b.this.E)) - b.this.C)) * f));
            int v1 = b.this.A.getTop();
            b.this.setTargetOffsetTopAndBottom(v - v1);
            b.this.H.e(1.0f - f);
        }
    }

    class g extends Animation {
        final b f;

        @Override  // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation0) {
            b.this.i(f);
        }
    }

    public interface i {
    }

    public interface j {
        void c0();
    }

    co.median.android.widget.a A;
    private int B;
    protected int C;
    float D;
    protected int E;
    int F;
    int G;
    o0.a H;
    private Animation I;
    private Animation J;
    private Animation K;
    private Animation L;
    private Animation M;
    boolean N;
    private int O;
    boolean P;
    boolean Q;
    private Animation.AnimationListener R;
    private final Animation S;
    private final Animation T;
    private static final String U = "b";
    private static final int[] V;
    private View f;
    j g;
    boolean h;
    private int i;
    private float j;
    private float k;
    private final F l;
    private final C m;
    private final int[] n;
    private final int[] o;
    private boolean p;
    private int q;
    int r;
    private float s;
    private float t;
    private float u;
    private boolean v;
    private int w;
    boolean x;
    private boolean y;
    private final DecelerateInterpolator z;

    static {
        b.V = new int[]{0x101000E};
    }

    public b(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.h = false;
        this.j = -1.0f;
        this.n = new int[2];
        this.o = new int[2];
        this.w = -1;
        this.B = -1;
        this.Q = false;
        this.R = new a(this);
        this.S = new f(this);
        this.T = new g(this);
        this.i = ViewConfiguration.get(context0).getScaledTouchSlop();
        this.q = this.getResources().getInteger(0x10E0001);
        this.setWillNotDraw(false);
        this.z = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.O = (int)(displayMetrics0.density * 40.0f);
        this.d();
        this.setChildrenDrawingOrderEnabled(true);
        int v = (int)(displayMetrics0.density * 64.0f);
        this.F = v;
        this.j = (float)v;
        this.l = new F(this);
        this.m = new C(this);
        this.setNestedScrollingEnabled(true);
        this.r = -this.O;
        this.E = -this.O;
        this.i(1.0f);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, b.V);
        this.setEnabled(typedArray0.getBoolean(0, true));
        typedArray0.recycle();
    }

    private void a(int v, Animation.AnimationListener animation$AnimationListener0) {
        this.C = v;
        this.S.reset();
        this.S.setDuration(200L);
        this.S.setInterpolator(this.z);
        if(animation$AnimationListener0 != null) {
            this.A.d(animation$AnimationListener0);
        }
        this.A.clearAnimation();
        this.A.startAnimation(this.S);
    }

    private void b(int v, Animation.AnimationListener animation$AnimationListener0) {
        if(this.x) {
            this.r(v, animation$AnimationListener0);
            return;
        }
        this.C = v;
        this.T.reset();
        this.T.setDuration(200L);
        this.T.setInterpolator(this.z);
        if(animation$AnimationListener0 != null) {
            this.A.d(animation$AnimationListener0);
        }
        this.A.clearAnimation();
        this.A.startAnimation(this.T);
    }

    public boolean c() {
        View view0 = this.f;
        return view0 instanceof ListView ? androidx.core.widget.g.a(((ListView)view0), -1) : view0.canScrollVertically(-1);
    }

    private void d() {
        this.A = new co.median.android.widget.a(this.getContext(), 0xFFFAFAFA);
        o0.a a0 = new o0.a(this.getContext());
        this.H = a0;
        a0.l(1);
        this.A.setImageDrawable(this.H);
        this.A.setVisibility(8);
        this.addView(this.A);
    }

    @Override  // android.view.View
    public boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.m.a(f, f1, z);
    }

    @Override  // android.view.View
    public boolean dispatchNestedPreFling(float f, float f1) {
        return this.m.b(f, f1);
    }

    @Override  // android.view.View
    public boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1) {
        return this.m.c(v, v1, arr_v, arr_v1);
    }

    @Override  // android.view.View
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v) {
        return this.m.f(v, v1, v2, v3, arr_v);
    }

    private void e() {
        if(this.f == null) {
            for(int v = 0; v < this.getChildCount(); ++v) {
                View view0 = this.getChildAt(v);
                if(!view0.equals(this.A)) {
                    this.f = view0;
                    return;
                }
            }
        }
    }

    private void f(float f) {
        class e implements Animation.AnimationListener {
            final b a;

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationEnd(Animation animation0) {
                b b0 = b.this;
                if(!b0.x) {
                    b0.q(null);
                }
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationRepeat(Animation animation0) {
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationStart(Animation animation0) {
            }
        }

        if(f > this.j) {
            this.l(true, true);
            return;
        }
        this.h = false;
        this.H.j(0.0f, 0.0f);
        e b$e0 = this.x ? null : new e(this);
        this.b(this.r, b$e0);
        this.H.d(false);
    }

    // 去混淆评级： 低(20)
    private boolean g(Animation animation0) {
        return animation0 != null && animation0.hasStarted() && !animation0.hasEnded();
    }

    @Override  // android.view.ViewGroup
    protected int getChildDrawingOrder(int v, int v1) {
        int v2 = this.B;
        if(v2 < 0) {
            return v1;
        }
        if(v1 == v - 1) {
            return v2;
        }
        return v1 < v2 ? v1 : v1 + 1;
    }

    @Override  // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.l.a();
    }

    public int getProgressCircleDiameter() {
        return this.O;
    }

    public int getProgressViewEndOffset() {
        return this.F;
    }

    public int getProgressViewStartOffset() {
        return this.E;
    }

    private void h(float f) {
        this.H.d(true);
        float f1 = Math.min(1.0f, Math.abs(f / this.j));
        float f2 = ((float)Math.max(((double)f1) - 0.4, 0.0)) * 5.0f / 3.0f;
        float f3 = Math.abs(f) - this.j;
        int v = this.G;
        if(v <= 0) {
            v = this.P ? this.F - this.E : this.F;
        }
        float f4 = Math.max(0.0f, Math.min(f3, ((float)v) * 2.0f) / ((float)v));
        float f5 = ((float)(((double)(f4 / 4.0f)) - Math.pow(f4 / 4.0f, 2.0))) * 2.0f;
        int v1 = this.E + ((int)(((float)v) * f1 + ((float)v) * f5 * 2.0f));
        if(this.A.getVisibility() != 0) {
            this.A.setVisibility(0);
        }
        if(!this.x) {
            this.A.setScaleX(1.0f);
            this.A.setScaleY(1.0f);
        }
        if(this.x) {
            this.setAnimationProgress(Math.min(1.0f, f / this.j));
        }
        if(f >= this.j) {
            if(this.H.getAlpha() < 0xFF && !this.g(this.L)) {
                this.o();
            }
        }
        else if(this.H.getAlpha() > 76 && !this.g(this.K)) {
            this.p();
        }
        this.H.j(0.0f, Math.min(0.8f, f2 * 0.8f));
        this.H.e(Math.min(1.0f, f2));
        this.H.g((f2 * 0.4f - 0.25f + f5 * 2.0f) * 0.5f);
        this.setTargetOffsetTopAndBottom(v1 - this.r);
    }

    @Override  // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.m.j();
    }

    void i(float f) {
        this.setTargetOffsetTopAndBottom(this.C + ((int)(((float)(this.E - this.C)) * f)) - this.A.getTop());
    }

    @Override  // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.m.l();
    }

    private void j(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.w) {
            this.w = motionEvent0.getPointerId((v == 0 ? 1 : 0));
        }
    }

    void k() {
        this.A.clearAnimation();
        this.H.stop();
        this.A.setVisibility(8);
        this.setColorViewAlpha(0xFF);
        if(this.x) {
            this.setAnimationProgress(0.0f);
        }
        else {
            this.setTargetOffsetTopAndBottom(this.E - this.r);
        }
        this.r = this.A.getTop();
    }

    private void l(boolean z, boolean z1) {
        if(this.h != z) {
            this.N = z1;
            this.e();
            this.h = z;
            if(z) {
                this.a(this.r, this.R);
                return;
            }
            this.q(this.R);
        }
    }

    private Animation m(int v, int v1) {
        class d extends Animation {
            final int f;
            final int g;
            final b h;

            d(int v, int v1) {
                this.f = v;
                this.g = v1;
                super();
            }

            @Override  // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation0) {
                b.this.H.setAlpha(((int)(((float)this.f) + ((float)(this.g - this.f)) * f)));
            }
        }

        Animation animation0 = new d(this, v, v1);
        animation0.setDuration(300L);
        this.A.d(null);
        this.A.clearAnimation();
        this.A.startAnimation(animation0);
        return animation0;
    }

    private void n(float f) {
        float f1 = this.t;
        int v = this.i;
        if(f - f1 > ((float)v) && !this.v) {
            this.s = f1 + ((float)v);
            this.v = true;
            this.H.setAlpha(76);
        }
    }

    private void o() {
        this.L = this.m(this.H.getAlpha(), 0xFF);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k();
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        this.e();
        int v = motionEvent0.getActionMasked();
        if(this.y && v == 0) {
            this.y = false;
        }
        if(this.isEnabled() && !this.y && !this.h && !this.p && motionEvent0.getPointerCount() <= 1) {
            switch(v) {
                case 0: {
                    if(this.c()) {
                        return false;
                    }
                    this.setTargetOffsetTopAndBottom(this.E - this.A.getTop());
                    int v3 = motionEvent0.getPointerId(0);
                    this.w = v3;
                    this.v = false;
                    int v4 = motionEvent0.findPointerIndex(v3);
                    if(v4 < 0) {
                        return false;
                    }
                    this.t = motionEvent0.getY(v4);
                    this.u = motionEvent0.getX(v4);
                    break;
                }
                case 2: {
                    if(this.c() || this.Q) {
                        return false;
                    }
                    int v1 = this.w;
                    if(v1 == -1) {
                        Log.w("b", "Got ACTION_MOVE event but don\'t have an active pointer id.");
                        return false;
                    }
                    int v2 = motionEvent0.findPointerIndex(v1);
                    if(v2 < 0) {
                        return false;
                    }
                    float f = motionEvent0.getX() - this.u;
                    float f1 = motionEvent0.getY() - this.t;
                    if(f1 < 0.0f) {
                        this.Q = true;
                        return false;
                    }
                    if(Math.abs(f1) >= Math.abs(f)) {
                        this.n(motionEvent0.getY(v2));
                        return this.v;
                    }
                    break;
                }
                case 1: 
                case 3: {
                    this.Q = false;
                    this.v = false;
                    this.w = -1;
                    return false;
                }
                case 6: {
                    this.j(motionEvent0);
                    return this.v;
                }
                default: {
                    return this.v;
                }
            }
            return this.v;
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getMeasuredWidth();
        int v5 = this.getMeasuredHeight();
        if(this.getChildCount() == 0) {
            return;
        }
        if(this.f == null) {
            this.e();
        }
        View view0 = this.f;
        if(view0 == null) {
            return;
        }
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingTop();
        view0.layout(v6, v7, v4 - this.getPaddingLeft() - this.getPaddingRight() + v6, v5 - this.getPaddingTop() - this.getPaddingBottom() + v7);
        int v8 = this.A.getMeasuredWidth();
        int v9 = this.A.getMeasuredHeight();
        this.A.layout(v4 / 2 - v8 / 2, this.r, v4 / 2 + v8 / 2, v9 + this.r);
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.f == null) {
            this.e();
        }
        View view0 = this.f;
        if(view0 == null) {
            return;
        }
        view0.measure(View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), 0x40000000));
        this.A.measure(View.MeasureSpec.makeMeasureSpec(this.O, 0x40000000), View.MeasureSpec.makeMeasureSpec(this.O, 0x40000000));
        this.B = -1;
        for(int v2 = 0; v2 < this.getChildCount(); ++v2) {
            if(this.getChildAt(v2) == this.A) {
                this.B = v2;
                return;
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onNestedFling(View view0, float f, float f1, boolean z) {
        return this.dispatchNestedFling(f, f1, z);
    }

    @Override  // android.view.ViewGroup
    public boolean onNestedPreFling(View view0, float f, float f1) {
        return this.dispatchNestedPreFling(f, f1);
    }

    @Override  // android.view.ViewGroup
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
        if(v1 > 0) {
            float f = this.k;
            if(f > 0.0f) {
                if(((float)v1) > f) {
                    arr_v[1] = v1 - ((int)f);
                    this.k = 0.0f;
                }
                else {
                    this.k = f - ((float)v1);
                    arr_v[1] = v1;
                }
                this.h(this.k);
            }
        }
        if(this.P && v1 > 0 && this.k == 0.0f && Math.abs(v1 - arr_v[1]) > 0) {
            this.A.setVisibility(8);
        }
        int[] arr_v1 = this.n;
        if(this.dispatchNestedPreScroll(v - arr_v[0], v1 - arr_v[1], arr_v1, null)) {
            arr_v[0] += arr_v1[0];
            arr_v[1] += arr_v1[1];
        }
    }

    @Override  // android.view.ViewGroup
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        this.dispatchNestedScroll(v, v1, v2, v3, this.o);
        int v4 = v3 + this.o[1];
        if(v4 < 0 && !this.c()) {
            float f = this.k + ((float)Math.abs(v4));
            this.k = f;
            this.h(f);
        }
    }

    @Override  // android.view.ViewGroup
    public void onNestedScrollAccepted(View view0, View view1, int v) {
        this.l.b(view0, view1, v);
        this.startNestedScroll(v & 2);
        this.k = 0.0f;
        this.p = true;
    }

    // 去混淆评级： 低(30)
    @Override  // android.view.ViewGroup
    public boolean onStartNestedScroll(View view0, View view1, int v) {
        return this.isEnabled() && !this.y && !this.h && (v & 2) != 0;
    }

    @Override  // android.view.ViewGroup
    public void onStopNestedScroll(View view0) {
        this.l.d(view0);
        this.p = false;
        float f = this.k;
        if(f > 0.0f) {
            this.f(f);
            this.k = 0.0f;
        }
        this.stopNestedScroll();
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(this.y && v == 0) {
            this.y = false;
        }
        if(this.isEnabled() && !this.y && !this.c() && !this.h && !this.p) {
            switch(v) {
                case 0: {
                    this.w = motionEvent0.getPointerId(0);
                    this.v = false;
                    break;
                }
                case 1: {
                    int v2 = motionEvent0.findPointerIndex(this.w);
                    if(v2 < 0) {
                        Log.w("b", "Got ACTION_UP event but don\'t have an active pointer id.");
                        return false;
                    }
                    if(this.v) {
                        float f = motionEvent0.getY(v2);
                        this.v = false;
                        this.f((f - this.s) * 0.5f);
                    }
                    this.w = -1;
                    return false;
                }
                case 2: {
                    int v3 = motionEvent0.findPointerIndex(this.w);
                    if(v3 < 0) {
                        Log.w("b", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float f1 = motionEvent0.getX() - this.u;
                    if(Math.abs(motionEvent0.getY() - this.t) >= Math.abs(f1)) {
                        float f2 = motionEvent0.getY(v3);
                        this.n(f2);
                        if(this.v) {
                            float f3 = (f2 - this.s) * 0.5f;
                            if(f3 > 0.0f) {
                                this.h(f3);
                                return true;
                            }
                            return false;
                        }
                    }
                    break;
                }
                case 3: {
                    return false;
                }
                case 5: {
                    int v1 = motionEvent0.getActionIndex();
                    if(v1 < 0) {
                        Log.w("b", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.w = motionEvent0.getPointerId(v1);
                    return true;
                }
                case 6: {
                    this.j(motionEvent0);
                    return true;
                }
                default: {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    private void p() {
        this.K = this.m(this.H.getAlpha(), 76);
    }

    void q(Animation.AnimationListener animation$AnimationListener0) {
        class c extends Animation {
            final b f;

            @Override  // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation0) {
                b.this.setAnimationProgress(1.0f - f);
            }
        }

        c b$c0 = new c(this);
        this.J = b$c0;
        b$c0.setDuration(150L);
        this.A.d(animation$AnimationListener0);
        this.A.clearAnimation();
        this.A.startAnimation(this.J);
    }

    private void r(int v, Animation.AnimationListener animation$AnimationListener0) {
        class h extends Animation {
            final b f;

            @Override  // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation0) {
                b.this.setAnimationProgress(b.this.D + -b.this.D * f);
                b.this.i(f);
            }
        }

        this.C = v;
        this.D = this.A.getScaleX();
        h b$h0 = new h(this);
        this.M = b$h0;
        b$h0.setDuration(150L);
        if(animation$AnimationListener0 != null) {
            this.A.d(animation$AnimationListener0);
        }
        this.A.clearAnimation();
        this.A.startAnimation(this.M);
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if(this.f == null || Y.T(this.f)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    private void s(Animation.AnimationListener animation$AnimationListener0) {
        class co.median.android.widget.b.b extends Animation {
            final b f;

            @Override  // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation0) {
                b.this.setAnimationProgress(f);
            }
        }

        this.A.setVisibility(0);
        this.H.setAlpha(0xFF);
        co.median.android.widget.b.b b$b0 = new co.median.android.widget.b.b(this);
        this.I = b$b0;
        b$b0.setDuration(((long)this.q));
        if(animation$AnimationListener0 != null) {
            this.A.d(animation$AnimationListener0);
        }
        this.A.clearAnimation();
        this.A.startAnimation(this.I);
    }

    void setAnimationProgress(float f) {
        this.A.setScaleX(f);
        this.A.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int[] arr_v) {
        this.setColorSchemeResources(arr_v);
    }

    public void setColorSchemeColors(int[] arr_v) {
        this.e();
        this.H.f(arr_v);
    }

    public void setColorSchemeResources(int[] arr_v) {
        Context context0 = this.getContext();
        int[] arr_v1 = new int[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_v1[v] = androidx.core.content.a.getColor(context0, arr_v[v]);
        }
        this.setColorSchemeColors(arr_v1);
    }

    private void setColorViewAlpha(int v) {
        this.A.getBackground().setAlpha(v);
        this.H.setAlpha(v);
    }

    public void setDistanceToTriggerSync(int v) {
        this.j = (float)v;
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if(!z) {
            this.k();
        }
    }

    @Override  // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.m.m(z);
    }

    public void setOnChildScrollUpCallback(i b$i0) {
    }

    public void setOnRefreshListener(j b$j0) {
        this.g = b$j0;
    }

    @Deprecated
    public void setProgressBackgroundColor(int v) {
        this.setProgressBackgroundColorSchemeResource(v);
    }

    public void setProgressBackgroundColorSchemeColor(int v) {
        this.A.setBackgroundColor(v);
    }

    public void setProgressBackgroundColorSchemeResource(int v) {
        this.setProgressBackgroundColorSchemeColor(androidx.core.content.a.getColor(this.getContext(), v));
    }

    public void setRefreshing(boolean z) {
        if(z && !this.h) {
            this.h = true;
            this.setTargetOffsetTopAndBottom((this.P ? this.F : this.F + this.E) - this.r);
            this.N = false;
            this.s(this.R);
            return;
        }
        this.l(z, false);
    }

    public void setSize(int v) {
        if(v != 0 && v != 1) {
            return;
        }
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.O = v == 0 ? ((int)(displayMetrics0.density * 56.0f)) : ((int)(displayMetrics0.density * 40.0f));
        this.A.setImageDrawable(null);
        this.H.l(v);
        this.A.setImageDrawable(this.H);
    }

    public void setSlingshotDistance(int v) {
        this.G = v;
    }

    void setTargetOffsetTopAndBottom(int v) {
        this.A.bringToFront();
        Y.Z(this.A, v);
        this.r = this.A.getTop();
    }

    @Override  // android.view.View
    public boolean startNestedScroll(int v) {
        return this.m.o(v);
    }

    @Override  // android.view.View
    public void stopNestedScroll() {
        this.m.q();
    }
}

