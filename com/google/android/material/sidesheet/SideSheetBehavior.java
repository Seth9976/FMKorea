package com.google.android.material.sidesheet;

import C.C;
import M1.b;
import M1.g;
import S1.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import androidx.core.view.s;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import z1.i;
import z1.j;

public class SideSheetBehavior extends c implements b {
    public static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        final int h;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.h = parcel0.readInt();
        }

        public SavedState(Parcelable parcelable0, SideSheetBehavior sideSheetBehavior0) {
            super(parcelable0);
            this.h = sideSheetBehavior0.n;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.h);
        }
    }

    class com.google.android.material.sidesheet.SideSheetBehavior.a extends H.c.c {
        final SideSheetBehavior a;

        @Override  // H.c$c
        public int a(View view0, int v, int v1) {
            return x.a.b(v, SideSheetBehavior.this.f.g(), SideSheetBehavior.this.f.f());
        }

        @Override  // H.c$c
        public int b(View view0, int v, int v1) {
            return view0.getTop();
        }

        @Override  // H.c$c
        public int d(View view0) {
            return SideSheetBehavior.this.s + SideSheetBehavior.this.k0();
        }

        @Override  // H.c$c
        public void j(int v) {
            if(v == 1 && SideSheetBehavior.this.m) {
                SideSheetBehavior.this.J0(1);
            }
        }

        @Override  // H.c$c
        public void k(View view0, int v, int v1, int v2, int v3) {
            View view1 = SideSheetBehavior.this.f0();
            if(view1 != null) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view1.getLayoutParams();
                if(viewGroup$MarginLayoutParams0 != null) {
                    int v4 = view0.getLeft();
                    int v5 = view0.getRight();
                    SideSheetBehavior.this.f.p(viewGroup$MarginLayoutParams0, v4, v5);
                    view1.setLayoutParams(viewGroup$MarginLayoutParams0);
                }
            }
            SideSheetBehavior.this.a0(view0, v);
        }

        @Override  // H.c$c
        public void l(View view0, float f, float f1) {
            int v = SideSheetBehavior.this.W(view0, f, f1);
            SideSheetBehavior.this.O0(view0, v, true);
        }

        @Override  // H.c$c
        public boolean m(View view0, int v) {
            return SideSheetBehavior.this.n == 1 ? false : SideSheetBehavior.this.w != null && SideSheetBehavior.this.w.get() == view0;
        }
    }

    class com.google.android.material.sidesheet.SideSheetBehavior.c {
        private int a;
        private boolean b;
        private final Runnable c;
        final SideSheetBehavior d;

        com.google.android.material.sidesheet.SideSheetBehavior.c() {
            this.c = () -> this.c();
        }

        // 检测为 Lambda 实现
        public static void a(com.google.android.material.sidesheet.SideSheetBehavior.c sideSheetBehavior$c0) [...]

        void b(int v) {
            if(SideSheetBehavior.this.w != null && SideSheetBehavior.this.w.get() != null) {
                this.a = v;
                if(!this.b) {
                    Y.g0(((View)SideSheetBehavior.this.w.get()), this.c);
                    this.b = true;
                }
            }
        }

        private void c() {
            this.b = false;
            if(SideSheetBehavior.this.p != null && SideSheetBehavior.this.p.m(true)) {
                this.b(this.a);
                return;
            }
            if(SideSheetBehavior.this.n == 2) {
                SideSheetBehavior.this.J0(this.a);
            }
        }
    }

    private g A;
    private int B;
    private final Set C;
    private final H.c.c D;
    private static final int E;
    private static final int F;
    private com.google.android.material.sidesheet.c f;
    private float g;
    private S1.g h;
    private ColorStateList i;
    private k j;
    private final com.google.android.material.sidesheet.SideSheetBehavior.c k;
    private float l;
    private boolean m;
    private int n;
    private int o;
    private H.c p;
    private boolean q;
    private float r;
    private int s;
    private int t;
    private int u;
    private int v;
    private WeakReference w;
    private WeakReference x;
    private int y;
    private VelocityTracker z;

    static {
        SideSheetBehavior.E = i.B;
        SideSheetBehavior.F = j.m;
    }

    public SideSheetBehavior() {
        this.k = new com.google.android.material.sidesheet.SideSheetBehavior.c(this);
        this.m = true;
        this.n = 5;
        this.o = 5;
        this.r = 0.1f;
        this.y = -1;
        this.C = new LinkedHashSet();
        this.D = new com.google.android.material.sidesheet.SideSheetBehavior.a(this);
    }

    public SideSheetBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.k = new com.google.android.material.sidesheet.SideSheetBehavior.c(this);
        this.m = true;
        this.n = 5;
        this.o = 5;
        this.r = 0.1f;
        this.y = -1;
        this.C = new LinkedHashSet();
        this.D = new com.google.android.material.sidesheet.SideSheetBehavior.a(this);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, z1.k.E6);
        if(typedArray0.hasValue(z1.k.G6)) {
            this.i = P1.c.a(context0, typedArray0, 3);
        }
        if(typedArray0.hasValue(z1.k.J6)) {
            this.j = k.e(context0, attributeSet0, 0, SideSheetBehavior.F).m();
        }
        if(typedArray0.hasValue(z1.k.I6)) {
            this.E0(typedArray0.getResourceId(5, -1));
        }
        this.Z(context0);
        this.l = typedArray0.getDimension(z1.k.F6, -1.0f);
        this.F0(typedArray0.getBoolean(z1.k.H6, true));
        typedArray0.recycle();
        this.g = (float)ViewConfiguration.get(context0).getScaledMaximumFlingVelocity();
    }

    private void A0(CoordinatorLayout coordinatorLayout0) {
        if(this.x == null) {
            int v = this.y;
            if(v != -1) {
                View view0 = coordinatorLayout0.findViewById(v);
                if(view0 != null) {
                    this.x = new WeakReference(view0);
                }
            }
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public void B(CoordinatorLayout coordinatorLayout0, View view0, Parcelable parcelable0) {
        if(((SavedState)parcelable0).a() != null) {
            super.B(coordinatorLayout0, view0, ((SavedState)parcelable0).a());
        }
        int v = ((SavedState)parcelable0).h;
        if(v == 1 || v == 2) {
            v = 5;
        }
        this.n = v;
        this.o = v;
    }

    private void B0(View view0, C.z.a z$a0, int v) {
        Y.k0(view0, z$a0, null, this.Y(v));
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public Parcelable C(CoordinatorLayout coordinatorLayout0, View view0) {
        return new SavedState(super.C(coordinatorLayout0, view0), this);
    }

    private void C0() {
        VelocityTracker velocityTracker0 = this.z;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.z = null;
        }
    }

    private void D0(View view0, Runnable runnable0) {
        if(this.v0(view0)) {
            view0.post(runnable0);
            return;
        }
        runnable0.run();
    }

    public void E0(int v) {
        this.y = v;
        this.X();
        WeakReference weakReference0 = this.w;
        if(weakReference0 != null) {
            View view0 = (View)weakReference0.get();
            if(v != -1 && Y.S(view0)) {
                view0.requestLayout();
            }
        }
    }

    public void F0(boolean z) {
        this.m = z;
    }

    private void G0(int v) {
        if(this.f != null && this.f.j() == v) {
            return;
        }
        switch(v) {
            case 0: {
                this.f = new com.google.android.material.sidesheet.b(this);
                if(this.j != null && !this.s0()) {
                    S1.k.b k$b0 = this.j.v();
                    k$b0.E(0.0f).w(0.0f);
                    this.R0(k$b0.m());
                }
                return;
            }
            case 1: {
                this.f = new com.google.android.material.sidesheet.a(this);
                if(this.j != null && !this.r0()) {
                    S1.k.b k$b1 = this.j.v();
                    k$b1.A(0.0f).s(0.0f);
                    this.R0(k$b1.m());
                }
                return;
            }
            default: {
                throw new IllegalArgumentException("Invalid sheet edge position value: " + v + ". Must be " + 0 + " or " + 1 + ".");
            }
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean H(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        if(!view0.isShown()) {
            return false;
        }
        int v = motionEvent0.getActionMasked();
        if(this.n == 1 && v == 0) {
            return true;
        }
        if(this.K0()) {
            this.p.F(motionEvent0);
        }
        if(v == 0) {
            this.C0();
        }
        if(this.z == null) {
            this.z = VelocityTracker.obtain();
        }
        this.z.addMovement(motionEvent0);
        if(this.K0() && v == 2 && !this.q && this.t0(motionEvent0)) {
            this.p.b(view0, motionEvent0.getPointerId(motionEvent0.getActionIndex()));
        }
        return !this.q;
    }

    private void H0(View view0, int v) {
        this.G0((s.b(((f)view0.getLayoutParams()).c, v) == 3 ? 1 : 0));
    }

    // 检测为 Lambda 实现
    public static boolean I(SideSheetBehavior sideSheetBehavior0, int v, View view0, C.C.a c$a0) [...]

    public void I0(int v) {
        if(v == 1 || v == 2) {
            throw new IllegalArgumentException("STATE_" + (v == 1 ? "DRAGGING" : "SETTLING") + " should not be set externally.");
        }
        if(this.w != null && this.w.get() != null) {
            this.D0(((View)this.w.get()), () -> this.z0(v));
            return;
        }
        this.J0(v);
    }

    // 检测为 Lambda 实现
    public static void J(SideSheetBehavior sideSheetBehavior0, int v) [...]

    void J0(int v) {
        if(this.n == v) {
            return;
        }
        this.n = v;
        if(v == 3 || v == 5) {
            this.o = v;
        }
        WeakReference weakReference0 = this.w;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        if(view0 == null) {
            return;
        }
        this.S0(view0);
        Iterator iterator0 = this.C.iterator();
        if(!iterator0.hasNext()) {
            this.P0();
            return;
        }
        Object object0 = iterator0.next();
        E.a(object0);
        throw null;
    }

    // 检测为 Lambda 实现
    public static void K(SideSheetBehavior sideSheetBehavior0, ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, View view0, ValueAnimator valueAnimator0) [...]

    // 去混淆评级： 低(20)
    private boolean K0() {
        return this.p != null && (this.m || this.n == 1);
    }

    boolean L0(View view0, float f) {
        return this.f.n(view0, f);
    }

    // 去混淆评级： 低(20)
    private boolean M0(View view0) {
        return (view0.isShown() || Y.o(view0) != null) && this.m;
    }

    public boolean N0() [...] // Inlined contents

    private void O0(View view0, int v, boolean z) {
        if(this.w0(view0, v, z)) {
            this.J0(2);
            this.k.b(v);
            return;
        }
        this.J0(v);
    }

    private void P0() {
        WeakReference weakReference0 = this.w;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        if(view0 == null) {
            return;
        }
        Y.i0(view0, 0x40000);
        Y.i0(view0, 0x100000);
        if(this.n != 5) {
            this.B0(view0, C.z.a.y, 5);
        }
        if(this.n != 3) {
            this.B0(view0, C.z.a.w, 3);
        }
    }

    private void Q0() {
        if(this.w != null && this.w.get() != null) {
            View view0 = (View)this.w.get();
            View view1 = this.f0();
            if(view1 == null) {
                return;
            }
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view1.getLayoutParams();
            if(viewGroup$MarginLayoutParams0 == null) {
                return;
            }
            float f = (float)this.s;
            float f1 = view0.getScaleX();
            this.f.o(viewGroup$MarginLayoutParams0, ((int)(f * f1 + ((float)this.v))));
            view1.requestLayout();
        }
    }

    private void R0(k k0) {
        S1.g g0 = this.h;
        if(g0 != null) {
            g0.setShapeAppearanceModel(k0);
        }
    }

    private void S0(View view0) {
        int v = this.n == 5 ? 4 : 0;
        if(view0.getVisibility() != v) {
            view0.setVisibility(v);
        }
    }

    private int U(int v, View view0) {
        switch(this.n) {
            case 1: 
            case 2: {
                return v - this.f.h(view0);
            }
            case 3: {
                return 0;
            }
            case 5: {
                return this.f.e();
            }
            default: {
                throw new IllegalStateException("Unexpected value: " + this.n);
            }
        }
    }

    private float V(float f, float f1) {
        return Math.abs(f - f1);
    }

    private int W(View view0, float f, float f1) {
        if(!this.u0(f)) {
            if(this.L0(view0, f)) {
                return !this.f.m(f, f1) && !this.f.l(view0) ? 3 : 5;
            }
            if(f == 0.0f || !d.a(f, f1)) {
                int v = view0.getLeft();
                return Math.abs(v - this.g0()) >= Math.abs(v - this.f.e()) ? 5 : 3;
            }
            return 5;
        }
        return 3;
    }

    private void X() {
        WeakReference weakReference0 = this.x;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.x = null;
    }

    private C Y(int v) {
        return (View view0, C.C.a c$a0) -> this.x0(v, view0, c$a0);
    }

    private void Z(Context context0) {
        if(this.j == null) {
            return;
        }
        S1.g g0 = new S1.g(this.j);
        this.h = g0;
        g0.K(context0);
        ColorStateList colorStateList0 = this.i;
        if(colorStateList0 != null) {
            this.h.V(colorStateList0);
            return;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x1010031, typedValue0, true);
        this.h.setTint(typedValue0.data);
    }

    @Override  // M1.b
    public void a(androidx.activity.b b0) {
        g g0 = this.A;
        if(g0 == null) {
            return;
        }
        g0.j(b0);
    }

    private void a0(View view0, int v) {
        if(!this.C.isEmpty()) {
            this.f.b(v);
            Iterator iterator0 = this.C.iterator();
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                E.a(object0);
                throw null;
            }
        }
    }

    @Override  // M1.b
    public void b(androidx.activity.b b0) {
        g g0 = this.A;
        if(g0 == null) {
            return;
        }
        g0.l(b0, this.h0());
        this.Q0();
    }

    private void b0(View view0) {
        if(Y.o(view0) == null) {
            Y.r0(view0, view0.getResources().getString(SideSheetBehavior.E));
        }
    }

    @Override  // M1.b
    public void c() {
        class com.google.android.material.sidesheet.SideSheetBehavior.b extends AnimatorListenerAdapter {
            final SideSheetBehavior a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                SideSheetBehavior.this.J0(5);
                if(SideSheetBehavior.this.w != null && SideSheetBehavior.this.w.get() != null) {
                    ((View)SideSheetBehavior.this.w.get()).requestLayout();
                }
            }
        }

        g g0 = this.A;
        if(g0 == null) {
            return;
        }
        androidx.activity.b b0 = g0.c();
        if(b0 != null && Build.VERSION.SDK_INT >= 34) {
            this.A.h(b0, this.h0(), new com.google.android.material.sidesheet.SideSheetBehavior.b(this), this.e0());
            return;
        }
        this.I0(5);
    }

    private int c0(int v, int v1, int v2, int v3) {
        int v4 = ViewGroup.getChildMeasureSpec(v, v1, v3);
        if(v2 == -1) {
            return v4;
        }
        int v5 = View.MeasureSpec.getMode(v4);
        int v6 = View.MeasureSpec.getSize(v4);
        if(v5 != 0x40000000) {
            if(v6 != 0) {
                v2 = Math.min(v6, v2);
            }
            return View.MeasureSpec.makeMeasureSpec(v2, 0x80000000);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(v6, v2), 0x40000000);
    }

    @Override  // M1.b
    public void d() {
        g g0 = this.A;
        if(g0 == null) {
            return;
        }
        g0.f();
    }

    int d0() {
        return this.s;
    }

    private ValueAnimator.AnimatorUpdateListener e0() {
        View view0 = this.f0();
        if(view0 == null) {
            return null;
        }
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        return viewGroup$MarginLayoutParams0 == null ? null : (ValueAnimator valueAnimator0) -> this.y0(viewGroup$MarginLayoutParams0, this.f.c(viewGroup$MarginLayoutParams0), view0, valueAnimator0);
    }

    public View f0() {
        return this.x == null ? null : ((View)this.x.get());
    }

    public int g0() {
        return this.f.d();
    }

    private int h0() {
        return this.f == null || this.f.j() == 0 ? 5 : 3;
    }

    public float i0() {
        return this.r;
    }

    float j0() [...] // Inlined contents

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public void k(f coordinatorLayout$f0) {
        super.k(coordinatorLayout$f0);
        this.w = null;
        this.p = null;
        this.A = null;
    }

    int k0() {
        return this.v;
    }

    int l0(int v) {
        switch(v) {
            case 3: {
                return this.g0();
            }
            case 5: {
                return this.f.e();
            }
            default: {
                throw new IllegalArgumentException("Invalid state to get outer edge offset: " + v);
            }
        }
    }

    int m0() {
        return this.u;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public void n() {
        super.n();
        this.w = null;
        this.p = null;
        this.A = null;
    }

    int n0() {
        return this.t;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean o(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        if(!this.M0(view0)) {
            this.q = true;
            return false;
        }
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.C0();
        }
        if(this.z == null) {
            this.z = VelocityTracker.obtain();
        }
        this.z.addMovement(motionEvent0);
        switch(v) {
            case 0: {
                this.B = (int)motionEvent0.getX();
                return !this.q && (this.p != null && this.p.P(motionEvent0));
            label_13:
                if(v == 3) {
                    goto label_14;
                }
                break;
            }
            case 1: {
            label_14:
                if(this.q) {
                    this.q = false;
                    return false;
                }
                break;
            }
            default: {
                goto label_13;
            }
        }
        return !this.q && (this.p != null && this.p.P(motionEvent0));
    }

    int o0() [...] // Inlined contents

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean p(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        if(Y.w(coordinatorLayout0) && !Y.w(view0)) {
            view0.setFitsSystemWindows(true);
        }
        if(this.w == null) {
            this.w = new WeakReference(view0);
            this.A = new g(view0);
            S1.g g0 = this.h;
            if(g0 == null) {
                ColorStateList colorStateList0 = this.i;
                if(colorStateList0 != null) {
                    Y.t0(view0, colorStateList0);
                }
            }
            else {
                Y.s0(view0, g0);
                this.h.U((this.l == -1.0f ? Y.u(view0) : this.l));
            }
            this.S0(view0);
            this.P0();
            if(Y.x(view0) == 0) {
                Y.x0(view0, 1);
            }
            this.b0(view0);
        }
        this.H0(view0, v);
        if(this.p == null) {
            this.p = H.c.o(coordinatorLayout0, this.D);
        }
        int v1 = this.f.h(view0);
        coordinatorLayout0.I(view0, v);
        this.t = coordinatorLayout0.getWidth();
        this.u = this.f.i(coordinatorLayout0);
        this.s = view0.getWidth();
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        this.v = viewGroup$MarginLayoutParams0 == null ? 0 : this.f.a(viewGroup$MarginLayoutParams0);
        Y.Y(view0, this.U(v1, view0));
        this.A0(coordinatorLayout0);
        for(Object object0: this.C) {
            E.a(object0);
        }
        return true;
    }

    H.c p0() {
        return this.p;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean q(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2, int v3) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        view0.measure(this.c0(v, coordinatorLayout0.getPaddingLeft() + coordinatorLayout0.getPaddingRight() + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, -1, viewGroup$MarginLayoutParams0.width), this.c0(v2, coordinatorLayout0.getPaddingTop() + coordinatorLayout0.getPaddingBottom() + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + v3, -1, viewGroup$MarginLayoutParams0.height));
        return true;
    }

    private f q0() {
        WeakReference weakReference0 = this.w;
        if(weakReference0 != null) {
            View view0 = (View)weakReference0.get();
            return view0 == null || !(view0.getLayoutParams() instanceof f) ? null : ((f)view0.getLayoutParams());
        }
        return null;
    }

    private boolean r0() {
        f coordinatorLayout$f0 = this.q0();
        return coordinatorLayout$f0 != null && coordinatorLayout$f0.leftMargin > 0;
    }

    private boolean s0() {
        f coordinatorLayout$f0 = this.q0();
        return coordinatorLayout$f0 != null && coordinatorLayout$f0.rightMargin > 0;
    }

    private boolean t0(MotionEvent motionEvent0) {
        return this.K0() ? this.V(((float)this.B), motionEvent0.getX()) > ((float)this.p.z()) : false;
    }

    private boolean u0(float f) {
        return this.f.k(f);
    }

    private boolean v0(View view0) {
        ViewParent viewParent0 = view0.getParent();
        return viewParent0 != null && viewParent0.isLayoutRequested() && Y.R(view0);
    }

    private boolean w0(View view0, int v, boolean z) {
        int v1 = this.l0(v);
        H.c c0 = this.p0();
        if(c0 != null) {
            return z ? c0.O(v1, view0.getTop()) : c0.Q(view0, v1, view0.getTop());
        }
        return false;
    }

    private boolean x0(int v, View view0, C.C.a c$a0) {
        this.I0(v);
        return true;
    }

    private void y0(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, View view0, ValueAnimator valueAnimator0) {
        this.f.o(viewGroup$MarginLayoutParams0, A1.a.c(v, 0, valueAnimator0.getAnimatedFraction()));
        view0.requestLayout();
    }

    private void z0(int v) {
        View view0 = (View)this.w.get();
        if(view0 != null) {
            this.O0(view0, v, false);
        }
    }
}

