package com.google.android.material.navigation;

import M1.b;
import M1.c;
import M1.g;
import S1.o;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.c0;
import androidx.core.view.Y;
import androidx.core.view.s;
import androidx.core.view.y0;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout.f;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.i;
import com.google.android.material.internal.k;
import com.google.android.material.internal.q;
import com.google.android.material.internal.v;
import java.util.Objects;
import z1.j;

public class NavigationView extends k implements b {
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
        public Bundle h;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.h = parcel0.readBundle(classLoader0);
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeBundle(this.h);
        }
    }

    class com.google.android.material.navigation.NavigationView.a extends f {
        final NavigationView a;

        @Override  // androidx.drawerlayout.widget.DrawerLayout$d
        public void a(View view0) {
            NavigationView navigationView0 = NavigationView.this;
            if(view0 == navigationView0) {
                c c0 = navigationView0.A;
                Objects.requireNonNull(c0);
                view0.post(new h(c0));
            }
        }

        @Override  // androidx.drawerlayout.widget.DrawerLayout$d
        public void b(View view0) {
            NavigationView navigationView0 = NavigationView.this;
            if(view0 == navigationView0) {
                navigationView0.A.e();
                NavigationView.this.t();
            }
        }
    }

    public interface d {
        boolean a(MenuItem arg1);
    }

    private final c A;
    private final androidx.drawerlayout.widget.DrawerLayout.d B;
    private static final int[] C;
    private static final int[] D;
    private static final int E;
    private final com.google.android.material.internal.h m;
    private final i n;
    d o;
    private final int p;
    private final int[] q;
    private MenuInflater r;
    private ViewTreeObserver.OnGlobalLayoutListener s;
    private boolean t;
    private boolean u;
    private int v;
    private final boolean w;
    private final int x;
    private final o y;
    private final g z;

    static {
        NavigationView.C = new int[]{0x10100A0};
        NavigationView.D = new int[]{0xFEFEFF62};
        NavigationView.E = j.i;
    }

    public NavigationView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, z1.a.O);
    }

    public NavigationView(Context context0, AttributeSet attributeSet0, int v) {
        class com.google.android.material.navigation.NavigationView.b implements androidx.appcompat.view.menu.e.a {
            final NavigationView f;

            @Override  // androidx.appcompat.view.menu.e$a
            public boolean a(e e0, MenuItem menuItem0) {
                d navigationView$d0 = NavigationView.this.o;
                return navigationView$d0 != null && navigationView$d0.a(menuItem0);
            }

            @Override  // androidx.appcompat.view.menu.e$a
            public void b(e e0) {
            }
        }

        int v1 = NavigationView.E;
        super(V1.a.c(context0, attributeSet0, v, v1), attributeSet0, v);
        i i0 = new i();
        this.n = i0;
        this.q = new int[2];
        this.t = true;
        this.u = true;
        this.v = 0;
        this.y = o.a(this);
        this.z = new g(this);
        this.A = new c(this);
        this.B = new com.google.android.material.navigation.NavigationView.a(this);
        Context context1 = this.getContext();
        com.google.android.material.internal.h h0 = new com.google.android.material.internal.h(context1);
        this.m = h0;
        c0 c00 = q.j(context1, attributeSet0, z1.k.t5, v, v1, new int[0]);
        if(c00.s(z1.k.u5)) {
            Y.s0(this, c00.g(1));
        }
        int v2 = c00.f(z1.k.A5, 0);
        this.v = v2;
        this.w = v2 == 0;
        this.x = this.getResources().getDimensionPixelSize(z1.c.A);
        Drawable drawable0 = this.getBackground();
        ColorStateList colorStateList0 = com.google.android.material.drawable.d.f(drawable0);
        if(drawable0 == null || colorStateList0 != null) {
            S1.g g0 = new S1.g(S1.k.e(context1, attributeSet0, v, v1).m());
            if(colorStateList0 != null) {
                g0.V(colorStateList0);
            }
            g0.K(context1);
            Y.s0(this, g0);
        }
        if(c00.s(z1.k.B5)) {
            this.setElevation(((float)c00.f(8, 0)));
        }
        this.setFitsSystemWindows(c00.a(z1.k.v5, false));
        this.p = c00.f(z1.k.w5, 0);
        ColorStateList colorStateList1 = c00.s(z1.k.W5) ? c00.c(0x1F) : null;
        int v3 = c00.s(z1.k.Z5) ? c00.n(34, 0) : 0;
        if(v3 == 0 && colorStateList1 == null) {
            colorStateList1 = this.k(0x1010038);
        }
        ColorStateList colorStateList2 = c00.s(z1.k.H5) ? c00.c(14) : this.k(0x1010038);
        int v4 = c00.s(z1.k.R5) ? c00.n(24, 0) : 0;
        boolean z = c00.a(z1.k.S5, true);
        if(c00.s(z1.k.G5)) {
            this.setItemIconSize(c00.f(13, 0));
        }
        ColorStateList colorStateList3 = c00.s(z1.k.T5) ? c00.c(26) : null;
        if(v4 == 0 && colorStateList3 == null) {
            colorStateList3 = this.k(0x1010036);
        }
        Drawable drawable1 = c00.g(z1.k.D5);
        if(drawable1 == null && this.n(c00)) {
            drawable1 = this.l(c00);
            ColorStateList colorStateList4 = P1.c.b(context1, c00, z1.k.J5);
            if(colorStateList4 != null) {
                Drawable drawable2 = this.m(c00, null);
                i0.J(new RippleDrawable(Q1.b.d(colorStateList4), null, drawable2));
            }
        }
        if(c00.s(z1.k.E5)) {
            this.setItemHorizontalPadding(c00.f(11, 0));
        }
        if(c00.s(z1.k.U5)) {
            this.setItemVerticalPadding(c00.f(27, 0));
        }
        this.setDividerInsetStart(c00.f(z1.k.z5, 0));
        this.setDividerInsetEnd(c00.f(z1.k.y5, 0));
        this.setSubheaderInsetStart(c00.f(z1.k.Y5, 0));
        this.setSubheaderInsetEnd(c00.f(z1.k.X5, 0));
        this.setTopInsetScrimEnabled(c00.a(z1.k.a6, true));
        this.setBottomInsetScrimEnabled(c00.a(z1.k.x5, true));
        int v5 = c00.f(z1.k.F5, 0);
        this.setItemMaxLines(c00.k(z1.k.I5, 1));
        h0.W(new com.google.android.material.navigation.NavigationView.b(this));
        i0.H(1);
        i0.h(context1, h0);
        if(v3 != 0) {
            i0.X(v3);
        }
        i0.U(colorStateList1);
        i0.N(colorStateList2);
        i0.T(this.getOverScrollMode());
        if(v4 != 0) {
            i0.P(v4);
        }
        i0.Q(z);
        i0.R(colorStateList3);
        i0.I(drawable1);
        i0.L(v5);
        h0.b(i0);
        this.addView(((View)i0.y(this)));
        if(c00.s(z1.k.V5)) {
            this.p(c00.n(28, 0));
        }
        if(c00.s(z1.k.C5)) {
            this.o(c00.n(9, 0));
        }
        c00.x();
        this.w();
    }

    @Override  // M1.b
    public void a(androidx.activity.b b0) {
        this.v();
        this.z.j(b0);
    }

    @Override  // M1.b
    public void b(androidx.activity.b b0) {
        Pair pair0 = this.v();
        this.z.l(b0, ((androidx.drawerlayout.widget.DrawerLayout.e)pair0.second).a);
        if(this.w) {
            float f = this.z.a(b0.a());
            this.v = A1.a.c(0, this.x, f);
            this.u(this.getWidth(), this.getHeight());
        }
    }

    @Override  // M1.b
    public void c() {
        Pair pair0 = this.v();
        DrawerLayout drawerLayout0 = (DrawerLayout)pair0.first;
        androidx.activity.b b0 = this.z.c();
        if(b0 != null && Build.VERSION.SDK_INT >= 34) {
            int v = ((androidx.drawerlayout.widget.DrawerLayout.e)pair0.second).a;
            Animator.AnimatorListener animator$AnimatorListener0 = com.google.android.material.navigation.b.b(drawerLayout0, this);
            ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0 = com.google.android.material.navigation.b.c(drawerLayout0);
            this.z.h(b0, v, animator$AnimatorListener0, valueAnimator$AnimatorUpdateListener0);
            return;
        }
        drawerLayout0.h(this);
    }

    @Override  // M1.b
    public void d() {
        this.v();
        this.z.f();
        this.t();
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        com.google.android.material.navigation.g g0 = (Canvas canvas0) -> super.dispatchDraw(canvas0);
        this.y.d(canvas0, g0);
    }

    @Override  // com.google.android.material.internal.k
    protected void e(y0 y00) {
        this.n.m(y00);
    }

    g getBackHelper() {
        return this.z;
    }

    public MenuItem getCheckedItem() {
        return this.n.n();
    }

    public int getDividerInsetEnd() {
        return this.n.o();
    }

    public int getDividerInsetStart() {
        return this.n.p();
    }

    public int getHeaderCount() {
        return this.n.q();
    }

    public Drawable getItemBackground() {
        return this.n.r();
    }

    public int getItemHorizontalPadding() {
        return this.n.s();
    }

    public int getItemIconPadding() {
        return this.n.t();
    }

    public ColorStateList getItemIconTintList() {
        return this.n.w();
    }

    public int getItemMaxLines() {
        return this.n.u();
    }

    public ColorStateList getItemTextColor() {
        return this.n.v();
    }

    public int getItemVerticalPadding() {
        return this.n.x();
    }

    public Menu getMenu() {
        return this.m;
    }

    private MenuInflater getMenuInflater() {
        if(this.r == null) {
            this.r = new androidx.appcompat.view.g(this.getContext());
        }
        return this.r;
    }

    public int getSubheaderInsetEnd() {
        return this.n.z();
    }

    public int getSubheaderInsetStart() {
        return this.n.A();
    }

    private ColorStateList k(int v) {
        TypedValue typedValue0 = new TypedValue();
        if(!this.getContext().getTheme().resolveAttribute(v, typedValue0, true)) {
            return null;
        }
        ColorStateList colorStateList0 = f.a.a(this.getContext(), typedValue0.resourceId);
        if(!this.getContext().getTheme().resolveAttribute(e.a.v, typedValue0, true)) {
            return null;
        }
        int v1 = typedValue0.data;
        int v2 = colorStateList0.getDefaultColor();
        return new ColorStateList(new int[][]{NavigationView.D, NavigationView.C, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList0.getColorForState(NavigationView.D, v2), v1, v2});
    }

    private Drawable l(c0 c00) {
        return this.m(c00, P1.c.b(this.getContext(), c00, z1.k.M5));
    }

    private Drawable m(c0 c00, ColorStateList colorStateList0) {
        int v = c00.n(z1.k.K5, 0);
        int v1 = c00.n(z1.k.L5, 0);
        S1.g g0 = new S1.g(S1.k.b(this.getContext(), v, v1).m());
        g0.V(colorStateList0);
        return new InsetDrawable(g0, c00.f(z1.k.P5, 0), c00.f(z1.k.Q5, 0), c00.f(z1.k.O5, 0), c00.f(z1.k.N5, 0));
    }

    // 去混淆评级： 低(20)
    private boolean n(c0 c00) {
        return c00.s(z1.k.K5) || c00.s(z1.k.L5);
    }

    public View o(int v) {
        return this.n.C(v);
    }

    @Override  // com.google.android.material.internal.k
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        S1.h.e(this);
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 instanceof DrawerLayout && this.A.b()) {
            ((DrawerLayout)viewParent0).S(this.B);
            ((DrawerLayout)viewParent0).c(this.B);
            if(((DrawerLayout)viewParent0).F(this)) {
                this.A.d();
            }
        }
    }

    @Override  // com.google.android.material.internal.k
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeOnGlobalLayoutListener(this.s);
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 instanceof DrawerLayout) {
            ((DrawerLayout)viewParent0).S(this.B);
        }
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        switch(View.MeasureSpec.getMode(v)) {
            case 0x80000000: {
                v = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(v), this.p), 0x40000000);
                break;
            }
            case 0: {
                v = View.MeasureSpec.makeMeasureSpec(this.p, 0x40000000);
            }
        }
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.m.T(((SavedState)parcelable0).h);
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        Bundle bundle0 = new Bundle();
        parcelable0.h = bundle0;
        this.m.V(bundle0);
        return parcelable0;
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.u(v, v1);
    }

    public void p(int v) {
        this.n.Y(true);
        this.getMenuInflater().inflate(v, this.m);
        this.n.Y(false);
        this.n.c(false);
    }

    public boolean q() {
        return this.u;
    }

    public boolean r() {
        return this.t;
    }

    // 检测为 Lambda 实现
    private void s(Canvas canvas0) [...]

    public void setBottomInsetScrimEnabled(boolean z) {
        this.u = z;
    }

    public void setCheckedItem(int v) {
        MenuItem menuItem0 = this.m.findItem(v);
        if(menuItem0 != null) {
            this.n.E(((androidx.appcompat.view.menu.g)menuItem0));
        }
    }

    public void setCheckedItem(MenuItem menuItem0) {
        int v = menuItem0.getItemId();
        MenuItem menuItem1 = this.m.findItem(v);
        if(menuItem1 == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.n.E(((androidx.appcompat.view.menu.g)menuItem1));
    }

    public void setDividerInsetEnd(int v) {
        this.n.F(v);
    }

    public void setDividerInsetStart(int v) {
        this.n.G(v);
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        S1.h.d(this, f);
    }

    public void setForceCompatClippingEnabled(boolean z) {
        this.y.g(this, z);
    }

    public void setItemBackground(Drawable drawable0) {
        this.n.I(drawable0);
    }

    public void setItemBackgroundResource(int v) {
        this.setItemBackground(androidx.core.content.a.getDrawable(this.getContext(), v));
    }

    public void setItemHorizontalPadding(int v) {
        this.n.K(v);
    }

    public void setItemHorizontalPaddingResource(int v) {
        int v1 = this.getResources().getDimensionPixelSize(v);
        this.n.K(v1);
    }

    public void setItemIconPadding(int v) {
        this.n.L(v);
    }

    public void setItemIconPaddingResource(int v) {
        int v1 = this.getResources().getDimensionPixelSize(v);
        this.n.L(v1);
    }

    public void setItemIconSize(int v) {
        this.n.M(v);
    }

    public void setItemIconTintList(ColorStateList colorStateList0) {
        this.n.N(colorStateList0);
    }

    public void setItemMaxLines(int v) {
        this.n.O(v);
    }

    public void setItemTextAppearance(int v) {
        this.n.P(v);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.n.Q(z);
    }

    public void setItemTextColor(ColorStateList colorStateList0) {
        this.n.R(colorStateList0);
    }

    public void setItemVerticalPadding(int v) {
        this.n.S(v);
    }

    public void setItemVerticalPaddingResource(int v) {
        int v1 = this.getResources().getDimensionPixelSize(v);
        this.n.S(v1);
    }

    public void setNavigationItemSelectedListener(d navigationView$d0) {
        this.o = navigationView$d0;
    }

    @Override  // android.view.View
    public void setOverScrollMode(int v) {
        super.setOverScrollMode(v);
        i i0 = this.n;
        if(i0 != null) {
            i0.T(v);
        }
    }

    public void setSubheaderInsetEnd(int v) {
        this.n.V(v);
    }

    public void setSubheaderInsetStart(int v) {
        this.n.W(v);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.t = z;
    }

    private void t() {
        if(this.w && this.v != 0) {
            this.v = 0;
            this.u(this.getWidth(), this.getHeight());
        }
    }

    private void u(int v, int v1) {
        if(this.getParent() instanceof DrawerLayout && this.getLayoutParams() instanceof androidx.drawerlayout.widget.DrawerLayout.e && (this.v > 0 || this.w) && this.getBackground() instanceof S1.g) {
            boolean z = s.b(((androidx.drawerlayout.widget.DrawerLayout.e)this.getLayoutParams()).a, Y.z(this)) == 3;
            S1.g g0 = (S1.g)this.getBackground();
            S1.k.b k$b0 = g0.B().v().o(((float)this.v));
            if(z) {
                k$b0.A(0.0f);
                k$b0.s(0.0f);
            }
            else {
                k$b0.E(0.0f);
                k$b0.w(0.0f);
            }
            S1.k k0 = k$b0.m();
            g0.setShapeAppearanceModel(k0);
            this.y.f(this, k0);
            RectF rectF0 = new RectF(0.0f, 0.0f, ((float)v), ((float)v1));
            this.y.e(this, rectF0);
            this.y.h(this, true);
        }
    }

    private Pair v() {
        ViewParent viewParent0 = this.getParent();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(!(viewParent0 instanceof DrawerLayout) || !(viewGroup$LayoutParams0 instanceof androidx.drawerlayout.widget.DrawerLayout.e)) {
            throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
        }
        return new Pair(((DrawerLayout)viewParent0), ((androidx.drawerlayout.widget.DrawerLayout.e)viewGroup$LayoutParams0));
    }

    private void w() {
        class com.google.android.material.navigation.NavigationView.c implements ViewTreeObserver.OnGlobalLayoutListener {
            final NavigationView f;

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                NavigationView.this.getLocationOnScreen(NavigationView.this.q);
                boolean z = true;
                boolean z1 = NavigationView.this.q[1] == 0;
                NavigationView.this.n.D(z1);
                NavigationView.this.setDrawTopInsetForeground(z1 && NavigationView.this.r());
                boolean z2 = NavigationView.this.q[0] == 0 || NavigationView.this.q[0] + NavigationView.this.getWidth() == 0;
                NavigationView.this.setDrawLeftInsetForeground(z2);
                Activity activity0 = com.google.android.material.internal.b.a(NavigationView.this.getContext());
                if(activity0 != null) {
                    Rect rect0 = v.a(activity0);
                    boolean z3 = rect0.height() - NavigationView.this.getHeight() == NavigationView.this.q[1];
                    boolean z4 = Color.alpha(activity0.getWindow().getNavigationBarColor()) != 0;
                    NavigationView.this.setDrawBottomInsetForeground(z3 && z4 && NavigationView.this.q());
                    if(rect0.width() != NavigationView.this.q[0] && rect0.width() - NavigationView.this.getWidth() != NavigationView.this.q[0]) {
                        z = false;
                    }
                    NavigationView.this.setDrawRightInsetForeground(z);
                }
            }
        }

        this.s = new com.google.android.material.navigation.NavigationView.c(this);
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.s);
    }
}

