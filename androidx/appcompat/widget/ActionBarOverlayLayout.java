package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.Y;
import androidx.core.view.y0;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements F, D, E {
    class a extends AnimatorListenerAdapter {
        final ActionBarOverlayLayout a;

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationCancel(Animator animator0) {
            ActionBarOverlayLayout.this.F = null;
            ActionBarOverlayLayout.this.o = false;
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            ActionBarOverlayLayout.this.F = null;
            ActionBarOverlayLayout.this.o = false;
        }
    }

    class b implements Runnable {
        final ActionBarOverlayLayout f;

        @Override
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout.this.F = ActionBarOverlayLayout.this.i.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.G);
        }
    }

    class c implements Runnable {
        final ActionBarOverlayLayout f;

        @Override
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout.this.F = ActionBarOverlayLayout.this.i.animate().translationY(((float)(-ActionBarOverlayLayout.this.i.getHeight()))).setListener(ActionBarOverlayLayout.this.G);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean arg1);

        void d();

        void e();

        void onWindowVisibilityChanged(int arg1);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int v, int v1) {
            super(v, v1);
        }

        public e(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public e(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
        }
    }

    static final class f extends View {
        f(Context context0) {
            super(context0);
            this.setWillNotDraw(true);
        }

        @Override  // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    private y0 A;
    private y0 B;
    private y0 C;
    private d D;
    private OverScroller E;
    ViewPropertyAnimator F;
    final AnimatorListenerAdapter G;
    private final Runnable H;
    private final Runnable I;
    private final androidx.core.view.F J;
    private final f K;
    static final int[] L;
    private static final y0 M;
    private static final Rect N;
    private int f;
    private int g;
    private ContentFrameLayout h;
    ActionBarContainer i;
    private G j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    boolean o;
    private int p;
    private int q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private final Rect x;
    private final Rect y;
    private y0 z;

    static {
        ActionBarOverlayLayout.L = new int[]{e.a.b, 0x1010059};
        ActionBarOverlayLayout.M = new androidx.core.view.y0.b().d(androidx.core.graphics.e.b(0, 1, 0, 1)).a();
        ActionBarOverlayLayout.N = new Rect();
    }

    public ActionBarOverlayLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.g = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = new Rect();
        this.y = new Rect();
        this.z = y0.b;
        this.A = y0.b;
        this.B = y0.b;
        this.C = y0.b;
        this.G = new a(this);
        this.H = new b(this);
        this.I = new c(this);
        this.w(context0);
        this.J = new androidx.core.view.F(this);
        f actionBarOverlayLayout$f0 = new f(context0);
        this.K = actionBarOverlayLayout$f0;
        this.addView(actionBarOverlayLayout$f0);
    }

    void A() {
        if(this.h == null) {
            this.h = (ContentFrameLayout)this.findViewById(e.f.b);
            this.i = (ActionBarContainer)this.findViewById(e.f.c);
            this.j = this.u(this.findViewById(e.f.a));
        }
    }

    private void B() {
        this.v();
        this.H.run();
    }

    private boolean C(float f) {
        this.E.fling(0, 0, 0, ((int)f), 0, 0, 0x80000000, 0x7FFFFFFF);
        return this.E.getFinalY() > this.i.getHeight();
    }

    @Override  // androidx.appcompat.widget.F
    public void a(Menu menu0, androidx.appcompat.view.menu.j.a j$a0) {
        this.A();
        this.j.a(menu0, j$a0);
    }

    @Override  // androidx.appcompat.widget.F
    public boolean b() {
        this.A();
        return this.j.b();
    }

    @Override  // androidx.appcompat.widget.F
    public void c() {
        this.A();
        this.j.c();
    }

    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof e;
    }

    @Override  // androidx.appcompat.widget.F
    public boolean d() {
        this.A();
        return this.j.d();
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        super.draw(canvas0);
        if(this.k != null) {
            int v = this.i.getVisibility() == 0 ? ((int)(((float)this.i.getBottom()) + this.i.getTranslationY() + 0.5f)) : 0;
            this.k.setBounds(0, v, this.getWidth(), this.k.getIntrinsicHeight() + v);
            this.k.draw(canvas0);
        }
    }

    @Override  // androidx.appcompat.widget.F
    public boolean e() {
        this.A();
        return this.j.e();
    }

    @Override  // androidx.appcompat.widget.F
    public boolean f() {
        this.A();
        return this.j.f();
    }

    @Override  // android.view.View
    protected boolean fitSystemWindows(Rect rect0) {
        return super.fitSystemWindows(rect0);
    }

    @Override  // androidx.appcompat.widget.F
    public boolean g() {
        this.A();
        return this.j.g();
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.s();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.t(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new e(viewGroup$LayoutParams0);
    }

    public int getActionBarHideOffset() {
        return this.i == null ? 0 : -((int)this.i.getTranslationY());
    }

    @Override  // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.J.a();
    }

    public CharSequence getTitle() {
        this.A();
        return this.j.getTitle();
    }

    @Override  // androidx.appcompat.widget.F
    public void h(int v) {
        this.A();
        switch(v) {
            case 2: {
                this.j.v();
                return;
            }
            case 5: {
                this.j.w();
                return;
            }
            case 109: {
                this.setOverlayMode(true);
            }
        }
    }

    @Override  // androidx.appcompat.widget.F
    public void i() {
        this.A();
        this.j.h();
    }

    @Override  // androidx.core.view.E
    public void j(View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        this.k(view0, v, v1, v2, v3, v4);
    }

    @Override  // androidx.core.view.D
    public void k(View view0, int v, int v1, int v2, int v3, int v4) {
        if(v4 == 0) {
            this.onNestedScroll(view0, v, v1, v2, v3);
        }
    }

    @Override  // androidx.core.view.D
    public boolean l(View view0, View view1, int v, int v1) {
        return v1 == 0 && this.onStartNestedScroll(view0, view1, v);
    }

    @Override  // androidx.core.view.D
    public void m(View view0, View view1, int v, int v1) {
        if(v1 == 0) {
            this.onNestedScrollAccepted(view0, view1, v);
        }
    }

    @Override  // androidx.core.view.D
    public void n(View view0, int v) {
        if(v == 0) {
            this.onStopNestedScroll(view0);
        }
    }

    @Override  // androidx.core.view.D
    public void o(View view0, int v, int v1, int[] arr_v, int v2) {
    }

    @Override  // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets0) {
        this.A();
        y0 y00 = y0.y(windowInsets0, this);
        Rect rect0 = new Rect(y00.j(), y00.l(), y00.k(), y00.i());
        boolean z = this.q(this.i, rect0, true, true, false, true);
        Y.f(this, y00, this.r);
        y0 y01 = y00.o(this.r.left, this.r.top, this.r.right, this.r.bottom);
        this.z = y01;
        boolean z1 = true;
        if(!this.A.equals(y01)) {
            this.A = this.z;
            z = true;
        }
        if(this.s.equals(this.r)) {
            z1 = z;
        }
        else {
            this.s.set(this.r);
        }
        if(z1) {
            this.requestLayout();
        }
        return y00.a().c().b().w();
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.w(this.getContext());
        Y.l0(this);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v();
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getChildCount();
        int v5 = this.getPaddingLeft();
        int v6 = this.getPaddingTop();
        for(int v7 = 0; v7 < v4; ++v7) {
            View view0 = this.getChildAt(v7);
            if(view0.getVisibility() != 8) {
                e actionBarOverlayLayout$e0 = (e)view0.getLayoutParams();
                int v8 = view0.getMeasuredWidth();
                int v9 = view0.getMeasuredHeight();
                int v10 = actionBarOverlayLayout$e0.leftMargin + v5;
                int v11 = actionBarOverlayLayout$e0.topMargin + v6;
                view0.layout(v10, v11, v8 + v10, v9 + v11);
            }
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v5;
        this.A();
        this.measureChildWithMargins(this.i, v, 0, v1, 0);
        e actionBarOverlayLayout$e0 = (e)this.i.getLayoutParams();
        int v2 = Math.max(0, this.i.getMeasuredWidth() + actionBarOverlayLayout$e0.leftMargin + actionBarOverlayLayout$e0.rightMargin);
        int v3 = Math.max(0, this.i.getMeasuredHeight() + actionBarOverlayLayout$e0.topMargin + actionBarOverlayLayout$e0.bottomMargin);
        int v4 = View.combineMeasuredStates(0, this.i.getMeasuredState());
        boolean z = (Y.L(this) & 0x100) != 0;
        if(z) {
            v5 = this.f;
            if(this.m && this.i.getTabContainer() != null) {
                v5 += this.f;
            }
        }
        else {
            v5 = this.i.getVisibility() == 8 ? 0 : this.i.getMeasuredHeight();
        }
        this.t.set(this.r);
        this.B = this.z;
        if(this.l || z || !this.r()) {
            androidx.core.graphics.e e0 = androidx.core.graphics.e.b(this.B.j(), this.B.l() + v5, this.B.k(), this.B.i());
            this.B = new androidx.core.view.y0.b(this.B).d(e0).a();
        }
        else {
            this.t.top += v5;
            this.t.bottom = this.t.bottom;
            this.B = this.B.o(0, v5, 0, 0);
        }
        this.q(this.h, this.t, true, true, true, true);
        if(!this.C.equals(this.B)) {
            this.C = this.B;
            Y.g(this.h, this.B);
        }
        this.measureChildWithMargins(this.h, v, 0, v1, 0);
        e actionBarOverlayLayout$e1 = (e)this.h.getLayoutParams();
        int v6 = Math.max(v2, this.h.getMeasuredWidth() + actionBarOverlayLayout$e1.leftMargin + actionBarOverlayLayout$e1.rightMargin);
        int v7 = Math.max(v3, this.h.getMeasuredHeight() + actionBarOverlayLayout$e1.topMargin + actionBarOverlayLayout$e1.bottomMargin);
        int v8 = View.combineMeasuredStates(v4, this.h.getMeasuredState());
        int v9 = this.getPaddingLeft();
        int v10 = this.getPaddingRight();
        int v11 = Math.max(v7 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(v6 + (v9 + v10), this.getSuggestedMinimumWidth()), v, v8), View.resolveSizeAndState(v11, v1, v8 << 16));
    }

    @Override  // android.view.ViewGroup
    public boolean onNestedFling(View view0, float f, float f1, boolean z) {
        if(this.n && z) {
            if(this.C(f1)) {
                this.p();
            }
            else {
                this.B();
            }
            this.o = true;
            return true;
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean onNestedPreFling(View view0, float f, float f1) {
        return false;
    }

    @Override  // android.view.ViewGroup
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
    }

    @Override  // android.view.ViewGroup
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        int v4 = this.p + v1;
        this.p = v4;
        this.setActionBarHideOffset(v4);
    }

    @Override  // android.view.ViewGroup
    public void onNestedScrollAccepted(View view0, View view1, int v) {
        this.J.b(view0, view1, v);
        this.p = this.getActionBarHideOffset();
        this.v();
        d actionBarOverlayLayout$d0 = this.D;
        if(actionBarOverlayLayout$d0 != null) {
            actionBarOverlayLayout$d0.e();
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onStartNestedScroll(View view0, View view1, int v) {
        return (v & 2) == 0 || this.i.getVisibility() != 0 ? false : this.n;
    }

    @Override  // android.view.ViewGroup
    public void onStopNestedScroll(View view0) {
        if(this.n && !this.o) {
            if(this.p <= this.i.getHeight()) {
                this.z();
            }
            else {
                this.y();
            }
        }
        d actionBarOverlayLayout$d0 = this.D;
        if(actionBarOverlayLayout$d0 != null) {
            actionBarOverlayLayout$d0.b();
        }
    }

    @Override  // android.view.View
    public void onWindowSystemUiVisibilityChanged(int v) {
        super.onWindowSystemUiVisibilityChanged(v);
        this.A();
        int v1 = this.q ^ v;
        this.q = v;
        int v2 = (v & 0x100) == 0 ? 0 : 1;
        d actionBarOverlayLayout$d0 = this.D;
        if(actionBarOverlayLayout$d0 != null) {
            actionBarOverlayLayout$d0.c(((boolean)(v2 ^ 1)));
            if((v & 4) == 0 || v2 == 0) {
                this.D.a();
            }
            else {
                this.D.d();
            }
        }
        if((v1 & 0x100) != 0 && this.D != null) {
            Y.l0(this);
        }
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        this.g = v;
        d actionBarOverlayLayout$d0 = this.D;
        if(actionBarOverlayLayout$d0 != null) {
            actionBarOverlayLayout$d0.onWindowVisibilityChanged(v);
        }
    }

    private void p() {
        this.v();
        this.I.run();
    }

    private boolean q(View view0, Rect rect0, boolean z, boolean z1, boolean z2, boolean z3) {
        boolean z4;
        e actionBarOverlayLayout$e0 = (e)view0.getLayoutParams();
        if(z) {
            int v = rect0.left;
            if(actionBarOverlayLayout$e0.leftMargin == v) {
                z4 = false;
            }
            else {
                actionBarOverlayLayout$e0.leftMargin = v;
                z4 = true;
            }
        }
        else {
            z4 = false;
        }
        if(z1) {
            int v1 = rect0.top;
            if(actionBarOverlayLayout$e0.topMargin != v1) {
                actionBarOverlayLayout$e0.topMargin = v1;
                z4 = true;
            }
        }
        if(z3) {
            int v2 = rect0.right;
            if(actionBarOverlayLayout$e0.rightMargin != v2) {
                actionBarOverlayLayout$e0.rightMargin = v2;
                z4 = true;
            }
        }
        if(z2) {
            int v3 = rect0.bottom;
            if(actionBarOverlayLayout$e0.bottomMargin != v3) {
                actionBarOverlayLayout$e0.bottomMargin = v3;
                return true;
            }
        }
        return z4;
    }

    private boolean r() {
        Y.f(this.K, ActionBarOverlayLayout.M, this.u);
        return !this.u.equals(ActionBarOverlayLayout.N);
    }

    protected e s() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int v) {
        this.v();
        int v1 = Math.max(0, Math.min(v, this.i.getHeight()));
        this.i.setTranslationY(((float)(-v1)));
    }

    public void setActionBarVisibilityCallback(d actionBarOverlayLayout$d0) {
        this.D = actionBarOverlayLayout$d0;
        if(this.getWindowToken() != null) {
            this.D.onWindowVisibilityChanged(this.g);
            int v = this.q;
            if(v != 0) {
                this.onWindowSystemUiVisibilityChanged(v);
                Y.l0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if(z != this.n) {
            this.n = z;
            if(!z) {
                this.v();
                this.setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int v) {
        this.A();
        this.j.setIcon(v);
    }

    public void setIcon(Drawable drawable0) {
        this.A();
        this.j.setIcon(drawable0);
    }

    public void setLogo(int v) {
        this.A();
        this.j.m(v);
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int v) {
    }

    @Override  // androidx.appcompat.widget.F
    public void setWindowCallback(Window.Callback window$Callback0) {
        this.A();
        this.j.setWindowCallback(window$Callback0);
    }

    @Override  // androidx.appcompat.widget.F
    public void setWindowTitle(CharSequence charSequence0) {
        this.A();
        this.j.setWindowTitle(charSequence0);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public e t(AttributeSet attributeSet0) {
        return new e(this.getContext(), attributeSet0);
    }

    private G u(View view0) {
        if(view0 instanceof G) {
            return (G)view0;
        }
        if(!(view0 instanceof Toolbar)) {
            throw new IllegalStateException("Can\'t make a decor toolbar out of " + view0.getClass().getSimpleName());
        }
        return ((Toolbar)view0).getWrapper();
    }

    void v() {
        this.removeCallbacks(this.H);
        this.removeCallbacks(this.I);
        ViewPropertyAnimator viewPropertyAnimator0 = this.F;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
        }
    }

    private void w(Context context0) {
        TypedArray typedArray0 = this.getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.L);
        boolean z = false;
        this.f = typedArray0.getDimensionPixelSize(0, 0);
        Drawable drawable0 = typedArray0.getDrawable(1);
        this.k = drawable0;
        if(drawable0 == null) {
            z = true;
        }
        this.setWillNotDraw(z);
        typedArray0.recycle();
        this.E = new OverScroller(context0);
    }

    public boolean x() {
        return this.l;
    }

    private void y() {
        this.v();
        this.postDelayed(this.I, 600L);
    }

    private void z() {
        this.v();
        this.postDelayed(this.H, 600L);
    }
}

