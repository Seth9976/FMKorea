package androidx.core.widget;

import C.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.A;
import androidx.core.view.B;
import androidx.core.view.C;
import androidx.core.view.E;
import androidx.core.view.F;
import androidx.core.view.Y;
import androidx.core.view.o;
import androidx.core.view.p;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements B, E {
    static class SavedState extends View.BaseSavedState {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0);
            }

            public SavedState[] b(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        public int f;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState(Parcel parcel0) {
            super(parcel0);
            this.f = parcel0.readInt();
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f + "}";
        }

        @Override  // android.view.View$BaseSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.f);
        }
    }

    static class androidx.core.widget.NestedScrollView.a extends androidx.core.view.a {
        @Override  // androidx.core.view.a
        public void f(View view0, AccessibilityEvent accessibilityEvent0) {
            super.f(view0, accessibilityEvent0);
            accessibilityEvent0.setClassName("android.widget.ScrollView");
            accessibilityEvent0.setScrollable(((NestedScrollView)view0).getScrollRange() > 0);
            accessibilityEvent0.setScrollX(((NestedScrollView)view0).getScrollX());
            accessibilityEvent0.setScrollY(((NestedScrollView)view0).getScrollY());
            C.B.a(accessibilityEvent0, ((NestedScrollView)view0).getScrollX());
            C.B.b(accessibilityEvent0, ((NestedScrollView)view0).getScrollRange());
        }

        @Override  // androidx.core.view.a
        public void g(View view0, z z0) {
            super.g(view0, z0);
            z0.m0("android.widget.ScrollView");
            if(((NestedScrollView)view0).isEnabled()) {
                int v = ((NestedScrollView)view0).getScrollRange();
                if(v > 0) {
                    z0.F0(true);
                    if(((NestedScrollView)view0).getScrollY() > 0) {
                        z0.b(C.z.a.r);
                        z0.b(C.z.a.C);
                    }
                    if(((NestedScrollView)view0).getScrollY() < v) {
                        z0.b(C.z.a.q);
                        z0.b(C.z.a.E);
                    }
                }
            }
        }

        @Override  // androidx.core.view.a
        public boolean j(View view0, int v, Bundle bundle0) {
            if(super.j(view0, v, bundle0)) {
                return true;
            }
            if(!((NestedScrollView)view0).isEnabled()) {
                return false;
            }
            int v1 = ((NestedScrollView)view0).getHeight();
            Rect rect0 = new Rect();
            if(((NestedScrollView)view0).getMatrix().isIdentity() && ((NestedScrollView)view0).getGlobalVisibleRect(rect0)) {
                v1 = rect0.height();
            }
            switch(v) {
                case 0x2000: 
                case 0x1020038: {
                    int v5 = ((NestedScrollView)view0).getPaddingBottom();
                    int v6 = ((NestedScrollView)view0).getPaddingTop();
                    int v7 = Math.max(((NestedScrollView)view0).getScrollY() - (v1 - v5 - v6), 0);
                    if(v7 != ((NestedScrollView)view0).getScrollY()) {
                        ((NestedScrollView)view0).W(0, v7, true);
                        return true;
                    }
                    return false;
                }
                case 0x1000: 
                case 0x102003A: {
                    int v2 = ((NestedScrollView)view0).getPaddingBottom();
                    int v3 = ((NestedScrollView)view0).getPaddingTop();
                    int v4 = Math.min(((NestedScrollView)view0).getScrollY() + (v1 - v2 - v3), ((NestedScrollView)view0).getScrollRange());
                    if(v4 != ((NestedScrollView)view0).getScrollY()) {
                        ((NestedScrollView)view0).W(0, v4, true);
                        return true;
                    }
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
    }

    static abstract class b {
        static boolean a(ViewGroup viewGroup0) {
            return viewGroup0.getClipToPadding();
        }
    }

    class c implements p {
        final NestedScrollView a;

        @Override  // androidx.core.view.p
        public boolean a(float f) {
            if(f == 0.0f) {
                return false;
            }
            this.c();
            NestedScrollView.this.v(((int)f));
            return true;
        }

        @Override  // androidx.core.view.p
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override  // androidx.core.view.p
        public void c() {
            NestedScrollView.this.i.abortAnimation();
        }
    }

    public interface d {
        void a(NestedScrollView arg1, int arg2, int arg3, int arg4, int arg5);
    }

    private int A;
    private SavedState B;
    private final F C;
    private final C D;
    private float E;
    private d F;
    final c G;
    o H;
    private static final float I;
    private static final androidx.core.widget.NestedScrollView.a J;
    private static final int[] K;
    private final float f;
    private long g;
    private final Rect h;
    private OverScroller i;
    public EdgeEffect j;
    public EdgeEffect k;
    private int l;
    private boolean m;
    private boolean n;
    private View o;
    private boolean p;
    private VelocityTracker q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private int w;
    private final int[] x;
    private final int[] y;
    private int z;

    static {
        NestedScrollView.I = 2.358202f;
        NestedScrollView.J = new androidx.core.widget.NestedScrollView.a();
        NestedScrollView.K = new int[]{0x101017A};
    }

    public NestedScrollView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, v.a.c);
    }

    public NestedScrollView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.h = new Rect();
        this.m = true;
        this.n = false;
        this.o = null;
        this.p = false;
        this.s = true;
        this.w = -1;
        this.x = new int[2];
        this.y = new int[2];
        c nestedScrollView$c0 = new c(this);
        this.G = nestedScrollView$c0;
        this.H = new o(this.getContext(), nestedScrollView$c0);
        this.j = androidx.core.widget.d.a(context0, attributeSet0);
        this.k = androidx.core.widget.d.a(context0, attributeSet0);
        this.f = context0.getResources().getDisplayMetrics().density * 51890.199219f;
        this.B();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, NestedScrollView.K, v, 0);
        this.setFillViewport(typedArray0.getBoolean(0, false));
        typedArray0.recycle();
        this.C = new F(this);
        this.D = new C(this);
        this.setNestedScrollingEnabled(true);
        Y.o0(this, NestedScrollView.J);
    }

    private void A() {
        VelocityTracker velocityTracker0 = this.q;
        if(velocityTracker0 == null) {
            this.q = VelocityTracker.obtain();
            return;
        }
        velocityTracker0.clear();
    }

    private void B() {
        this.i = new OverScroller(this.getContext());
        this.setFocusable(true);
        this.setDescendantFocusability(0x40000);
        this.setWillNotDraw(false);
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(this.getContext());
        this.t = viewConfiguration0.getScaledTouchSlop();
        this.u = viewConfiguration0.getScaledMinimumFlingVelocity();
        this.v = viewConfiguration0.getScaledMaximumFlingVelocity();
    }

    private void C() {
        if(this.q == null) {
            this.q = VelocityTracker.obtain();
        }
    }

    private void D(int v, int v1) {
        this.l = v;
        this.w = v1;
        this.X(2, 0);
    }

    private boolean E(View view0) {
        return !this.G(view0, 0, this.getHeight());
    }

    private static boolean F(View view0, View view1) {
        if(view0 == view1) {
            return true;
        }
        ViewParent viewParent0 = view0.getParent();
        return viewParent0 instanceof ViewGroup && NestedScrollView.F(((View)viewParent0), view1);
    }

    private boolean G(View view0, int v, int v1) {
        view0.getDrawingRect(this.h);
        this.offsetDescendantRectToMyCoords(view0, this.h);
        return this.h.bottom + v >= this.getScrollY() && this.h.top - v <= this.getScrollY() + v1;
    }

    private void H(int v, int v1, int[] arr_v) {
        int v2 = this.getScrollY();
        this.scrollBy(0, v);
        int v3 = this.getScrollY() - v2;
        if(arr_v != null) {
            arr_v[1] += v3;
        }
        this.D.e(0, v3, 0, v - v3, null, v1, arr_v);
    }

    private void I(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.w) {
            int v1 = v == 0 ? 1 : 0;
            this.l = (int)motionEvent0.getY(v1);
            this.w = motionEvent0.getPointerId(v1);
            VelocityTracker velocityTracker0 = this.q;
            if(velocityTracker0 != null) {
                velocityTracker0.clear();
            }
        }
    }

    boolean J(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, boolean z) {
        boolean z2;
        boolean z1;
        int v8 = this.getOverScrollMode();
        int v9 = v2 + v;
        int v10 = v8 == 0 || v8 == 1 && this.computeHorizontalScrollRange() > this.computeHorizontalScrollExtent() ? v6 : 0;
        int v11 = v3 + v1;
        int v12 = v8 == 0 || v8 == 1 && this.computeVerticalScrollRange() > this.computeVerticalScrollExtent() ? v7 : 0;
        int v13 = v10 + v4;
        int v14 = v12 + v5;
        if(v9 > v13) {
            v9 = v13;
            z1 = true;
        }
        else if(v9 < -v10) {
            z1 = true;
            v9 = -v10;
        }
        else {
            z1 = false;
        }
        if(v11 > v14) {
            v11 = v14;
            z2 = true;
        }
        else if(v11 < -v12) {
            z2 = true;
            v11 = -v12;
        }
        else {
            z2 = false;
        }
        if(z2 && !this.y(1)) {
            this.i.springBack(v9, v11, 0, 0, 0, this.getScrollRange());
        }
        this.onOverScrolled(v9, v11, z1, z2);
        return z1 || z2;
    }

    public boolean K(int v) {
        int v1 = this.getHeight();
        if(v == 130) {
            this.h.top = this.getScrollY() + v1;
            int v2 = this.getChildCount();
            if(v2 > 0) {
                View view0 = this.getChildAt(v2 - 1);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
                int v3 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin + this.getPaddingBottom();
                Rect rect0 = this.h;
                if(rect0.top + v1 > v3) {
                    rect0.top = v3 - v1;
                }
            }
        }
        else {
            this.h.top = this.getScrollY() - v1;
            Rect rect1 = this.h;
            if(rect1.top < 0) {
                rect1.top = 0;
            }
        }
        int v4 = v1 + this.h.top;
        this.h.bottom = v4;
        return this.O(v, this.h.top, v4);
    }

    private void L() {
        VelocityTracker velocityTracker0 = this.q;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.q = null;
        }
    }

    private int M(int v, float f) {
        float f4;
        float f1 = f / ((float)this.getWidth());
        float f2 = ((float)v) / ((float)this.getHeight());
        float f3 = 0.0f;
        if(androidx.core.widget.d.b(this.j) != 0.0f) {
            f4 = -androidx.core.widget.d.d(this.j, -f2, f1);
            if(androidx.core.widget.d.b(this.j) == 0.0f) {
                this.j.onRelease();
            }
            f3 = f4;
        }
        else if(androidx.core.widget.d.b(this.k) != 0.0f) {
            f4 = androidx.core.widget.d.d(this.k, f2, 1.0f - f1);
            if(androidx.core.widget.d.b(this.k) == 0.0f) {
                this.k.onRelease();
            }
            f3 = f4;
        }
        int v1 = Math.round(f3 * ((float)this.getHeight()));
        if(v1 != 0) {
            this.invalidate();
        }
        return v1;
    }

    private void N(boolean z) {
        if(z) {
            this.X(2, 1);
        }
        else {
            this.Z(1);
        }
        this.A = this.getScrollY();
        this.postInvalidateOnAnimation();
    }

    private boolean O(int v, int v1, int v2) {
        int v3 = this.getHeight();
        int v4 = this.getScrollY();
        int v5 = v3 + v4;
        boolean z = false;
        View view0 = this.u(v == 33, v1, v2);
        if(view0 == null) {
            view0 = this;
        }
        if(v1 < v4 || v2 > v5) {
            this.P((v == 33 ? v2 - v5 : v1 - v4), 0, 1, true);
            z = true;
        }
        if(view0 != this.findFocus()) {
            view0.requestFocus(v);
        }
        return z;
    }

    private int P(int v, int v1, int v2, boolean z) {
        int v5;
        int v4;
        if(v2 == 1) {
            this.X(2, 1);
        }
        int v3 = 0;
        if(this.i(0, v, this.y, this.x, v2)) {
            v4 = v - this.y[1];
            v5 = this.x[1];
        }
        else {
            v4 = v;
            v5 = 0;
        }
        int v6 = this.getScrollY();
        int v7 = this.getScrollRange();
        boolean z1 = this.d() && !z;
        int v8 = !this.J(0, v4, 0, v6, 0, v7, 0, 0, true) || this.y(v2) ? 0 : 1;
        int v9 = this.getScrollY();
        this.y[1] = 0;
        this.p(0, v9 - v6, 0, v4 - (v9 - v6), this.x, v2, this.y);
        int v10 = v5 + this.x[1];
        int v11 = v4 - this.y[1];
        int v12 = v6 + v11;
        if(v12 >= 0) {
            if(v12 > v7 && z1) {
                androidx.core.widget.d.d(this.k, ((float)v11) / ((float)this.getHeight()), 1.0f - ((float)v1) / ((float)this.getWidth()));
                if(!this.j.isFinished()) {
                    this.j.onRelease();
                }
            }
        }
        else if(z1) {
            androidx.core.widget.d.d(this.j, ((float)(-v11)) / ((float)this.getHeight()), ((float)v1) / ((float)this.getWidth()));
            if(!this.k.isFinished()) {
                this.k.onRelease();
            }
        }
        if(!this.j.isFinished() || !this.k.isFinished()) {
            this.postInvalidateOnAnimation();
        }
        else {
            v3 = v8;
        }
        if(v3 != 0 && v2 == 0) {
            VelocityTracker velocityTracker0 = this.q;
            if(velocityTracker0 != null) {
                velocityTracker0.clear();
            }
        }
        if(v2 == 1) {
            this.Z(1);
            this.j.onRelease();
            this.k.onRelease();
        }
        return v10;
    }

    private void Q(View view0) {
        view0.getDrawingRect(this.h);
        this.offsetDescendantRectToMyCoords(view0, this.h);
        int v = this.g(this.h);
        if(v != 0) {
            this.scrollBy(0, v);
        }
    }

    private boolean R(Rect rect0, boolean z) {
        int v = this.g(rect0);
        if(v != 0) {
            if(z) {
                this.scrollBy(0, v);
                return true;
            }
            this.T(0, v);
        }
        return v != 0;
    }

    private boolean S(EdgeEffect edgeEffect0, int v) {
        return v <= 0 ? this.x(-v) < androidx.core.widget.d.b(edgeEffect0) * ((float)this.getHeight()) : true;
    }

    public final void T(int v, int v1) {
        this.U(v, v1, 0xFA, false);
    }

    private void U(int v, int v1, int v2, boolean z) {
        if(this.getChildCount() == 0) {
            return;
        }
        if(AnimationUtils.currentAnimationTimeMillis() - this.g > 0xFAL) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            int v3 = view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin;
            int v4 = this.getHeight();
            int v5 = this.getPaddingTop();
            int v6 = this.getPaddingBottom();
            int v7 = this.getScrollY();
            this.i.startScroll(this.getScrollX(), v7, 0, Math.max(0, Math.min(v1 + v7, Math.max(0, v3 - (v4 - v5 - v6)))) - v7, v2);
            this.N(z);
        }
        else {
            if(!this.i.isFinished()) {
                this.a();
            }
            this.scrollBy(v, v1);
        }
        this.g = AnimationUtils.currentAnimationTimeMillis();
    }

    void V(int v, int v1, int v2, boolean z) {
        this.U(v - this.getScrollX(), v1 - this.getScrollY(), v2, z);
    }

    void W(int v, int v1, boolean z) {
        this.V(v, v1, 0xFA, z);
    }

    public boolean X(int v, int v1) {
        return this.D.p(v, v1);
    }

    private boolean Y(MotionEvent motionEvent0) {
        boolean z;
        if(Float.compare(androidx.core.widget.d.b(this.j), 0.0f) == 0) {
            z = false;
        }
        else {
            androidx.core.widget.d.d(this.j, 0.0f, motionEvent0.getX() / ((float)this.getWidth()));
            z = true;
        }
        if(androidx.core.widget.d.b(this.k) != 0.0f) {
            androidx.core.widget.d.d(this.k, 0.0f, 1.0f - motionEvent0.getX() / ((float)this.getWidth()));
            return true;
        }
        return z;
    }

    public void Z(int v) {
        this.D.r(v);
    }

    private void a() {
        this.i.abortAnimation();
        this.Z(1);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0, v);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0, viewGroup$LayoutParams0);
    }

    public boolean c(int v) {
        View view0 = this.findFocus();
        if(view0 == this) {
            view0 = null;
        }
        View view1 = FocusFinder.getInstance().findNextFocus(this, view0, v);
        int v1 = this.getMaxScrollAmount();
        if(view1 == null || !this.G(view1, v1, this.getHeight())) {
            if(v == 33 && this.getScrollY() < v1) {
                v1 = this.getScrollY();
            }
            else if(v == 130 && this.getChildCount() > 0) {
                View view2 = this.getChildAt(0);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view2.getLayoutParams();
                v1 = Math.min(view2.getBottom() + frameLayout$LayoutParams0.bottomMargin - (this.getScrollY() + this.getHeight() - this.getPaddingBottom()), v1);
            }
            if(v1 == 0) {
                return false;
            }
            if(v != 130) {
                v1 = -v1;
            }
            this.P(v1, 0, 1, true);
        }
        else {
            view1.getDrawingRect(this.h);
            this.offsetDescendantRectToMyCoords(view1, this.h);
            this.P(this.g(this.h), 0, 1, true);
            view1.requestFocus(v);
        }
        if(view0 != null && view0.isFocused() && this.E(view0)) {
            int v2 = this.getDescendantFocusability();
            this.setDescendantFocusability(0x20000);
            this.requestFocus();
            this.setDescendantFocusability(v2);
        }
        return true;
    }

    @Override  // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override  // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override  // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override  // android.view.View
    public void computeScroll() {
        if(this.i.isFinished()) {
            return;
        }
        this.i.computeScrollOffset();
        int v = this.i.getCurrY();
        int v1 = this.h(v - this.A);
        this.A = v;
        this.y[1] = 0;
        this.i(0, v1, this.y, null, 1);
        int v2 = v1 - this.y[1];
        int v3 = this.getScrollRange();
        if(v2 != 0) {
            int v4 = this.getScrollY();
            this.J(0, v2, this.getScrollX(), v4, 0, v3, 0, 0, false);
            int v5 = this.getScrollY() - v4;
            int v6 = v2 - v5;
            this.y[1] = 0;
            this.p(0, v5, 0, v6, this.x, 1, this.y);
            v2 = v6 - this.y[1];
        }
        if(v2 != 0) {
            int v7 = this.getOverScrollMode();
            if(v7 == 0 || v7 == 1 && v3 > 0) {
                if(v2 >= 0) {
                    if(this.k.isFinished()) {
                        this.k.onAbsorb(((int)this.i.getCurrVelocity()));
                    }
                }
                else if(this.j.isFinished()) {
                    this.j.onAbsorb(((int)this.i.getCurrVelocity()));
                }
            }
            this.a();
        }
        if(!this.i.isFinished()) {
            this.postInvalidateOnAnimation();
            return;
        }
        this.Z(1);
    }

    @Override  // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override  // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override  // android.view.View
    public int computeVerticalScrollRange() {
        int v = this.getChildCount();
        int v1 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        if(v == 0) {
            return v1;
        }
        View view0 = this.getChildAt(0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        int v2 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin;
        int v3 = this.getScrollY();
        int v4 = Math.max(0, v2 - v1);
        if(v3 < 0) {
            return v2 - v3;
        }
        return v3 <= v4 ? v2 : v2 + (v3 - v4);
    }

    private boolean d() {
        int v = this.getOverScrollMode();
        return v == 0 || v == 1 && this.getScrollRange() > 0;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0) || this.t(keyEvent0);
    }

    @Override  // android.view.View
    public boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.D.a(f, f1, z);
    }

    @Override  // android.view.View
    public boolean dispatchNestedPreFling(float f, float f1) {
        return this.D.b(f, f1);
    }

    @Override  // android.view.View
    public boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1) {
        return this.i(v, v1, arr_v, arr_v1, 0);
    }

    @Override  // android.view.View
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v) {
        return this.D.f(v, v1, v2, v3, arr_v);
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        int v6;
        super.draw(canvas0);
        int v = this.getScrollY();
        int v1 = 0;
        if(!this.j.isFinished()) {
            int v2 = canvas0.save();
            int v3 = this.getWidth();
            int v4 = this.getHeight();
            int v5 = Math.min(0, v);
            if(b.a(this)) {
                v3 -= this.getPaddingLeft() + this.getPaddingRight();
                v6 = this.getPaddingLeft();
            }
            else {
                v6 = 0;
            }
            if(b.a(this)) {
                v4 -= this.getPaddingTop() + this.getPaddingBottom();
                v5 += this.getPaddingTop();
            }
            canvas0.translate(((float)v6), ((float)v5));
            this.j.setSize(v3, v4);
            if(this.j.draw(canvas0)) {
                this.postInvalidateOnAnimation();
            }
            canvas0.restoreToCount(v2);
        }
        if(!this.k.isFinished()) {
            int v7 = canvas0.save();
            int v8 = this.getWidth();
            int v9 = this.getHeight();
            int v10 = Math.max(this.getScrollRange(), v) + v9;
            if(b.a(this)) {
                v8 -= this.getPaddingLeft() + this.getPaddingRight();
                v1 = this.getPaddingLeft();
            }
            if(b.a(this)) {
                v9 -= this.getPaddingTop() + this.getPaddingBottom();
                v10 -= this.getPaddingBottom();
            }
            canvas0.translate(((float)(v1 - v8)), ((float)v10));
            canvas0.rotate(180.0f, ((float)v8), 0.0f);
            this.k.setSize(v8, v9);
            if(this.k.draw(canvas0)) {
                this.postInvalidateOnAnimation();
            }
            canvas0.restoreToCount(v7);
        }
    }

    private boolean e() {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            return view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin > this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
        }
        return false;
    }

    private static int f(int v, int v1, int v2) {
        if(v1 < v2 && v >= 0) {
            return v1 + v <= v2 ? v : v2 - v1;
        }
        return 0;
    }

    protected int g(Rect rect0) {
        if(this.getChildCount() == 0) {
            return 0;
        }
        int v = this.getHeight();
        int v1 = this.getScrollY();
        int v2 = v1 + v;
        int v3 = this.getVerticalFadingEdgeLength();
        if(rect0.top > 0) {
            v1 += v3;
        }
        View view0 = this.getChildAt(0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        int v4 = rect0.bottom >= view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin ? v2 : v2 - v3;
        int v5 = rect0.bottom;
        if(v5 > v4 && rect0.top > v1) {
            return rect0.height() <= v ? Math.min(rect0.bottom - v4, view0.getBottom() + frameLayout$LayoutParams0.bottomMargin - v2) : Math.min(rect0.top - v1, view0.getBottom() + frameLayout$LayoutParams0.bottomMargin - v2);
        }
        if(rect0.top < v1 && v5 < v4) {
            return rect0.height() <= v ? Math.max(-(v1 - rect0.top), -this.getScrollY()) : Math.max(-(v4 - rect0.bottom), -this.getScrollY());
        }
        return 0;
    }

    @Override  // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if(this.getChildCount() == 0) {
            return 0.0f;
        }
        View view0 = this.getChildAt(0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        int v = this.getVerticalFadingEdgeLength();
        int v1 = this.getHeight();
        int v2 = this.getPaddingBottom();
        int v3 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin - this.getScrollY() - (v1 - v2);
        return v3 >= v ? 1.0f : ((float)v3) / ((float)v);
    }

    public int getMaxScrollAmount() {
        return (int)(((float)this.getHeight()) * 0.5f);
    }

    @Override  // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.C.a();
    }

    int getScrollRange() {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            return Math.max(0, view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin - (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()));
        }
        return 0;
    }

    @Override  // android.view.View
    protected float getTopFadingEdgeStrength() {
        if(this.getChildCount() == 0) {
            return 0.0f;
        }
        int v = this.getVerticalFadingEdgeLength();
        int v1 = this.getScrollY();
        return v1 >= v ? 1.0f : ((float)v1) / ((float)v);
    }

    float getVerticalScrollFactorCompat() {
        if(this.E == 0.0f) {
            TypedValue typedValue0 = new TypedValue();
            Context context0 = this.getContext();
            if(!context0.getTheme().resolveAttribute(0x101004D, typedValue0, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.E = typedValue0.getDimension(context0.getResources().getDisplayMetrics());
            return this.E;
        }
        return this.E;
    }

    int h(int v) {
        int v1 = this.getHeight();
        if(v > 0 && androidx.core.widget.d.b(this.j) != 0.0f) {
            int v2 = Math.round(((float)(-v1)) / 4.0f * androidx.core.widget.d.d(this.j, ((float)(-v)) * 4.0f / ((float)v1), 0.5f));
            if(v2 != v) {
                this.j.finish();
            }
            return v - v2;
        }
        if(v < 0 && androidx.core.widget.d.b(this.k) != 0.0f) {
            int v3 = Math.round(((float)v1) / 4.0f * androidx.core.widget.d.d(this.k, ((float)v) * 4.0f / ((float)v1), 0.5f));
            if(v3 != v) {
                this.k.finish();
            }
            return v - v3;
        }
        return v;
    }

    @Override  // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.y(0);
    }

    public boolean i(int v, int v1, int[] arr_v, int[] arr_v1, int v2) {
        return this.D.d(v, v1, arr_v, arr_v1, v2);
    }

    @Override  // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.D.l();
    }

    @Override  // androidx.core.view.E
    public void j(View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        this.H(v3, v4, arr_v);
    }

    @Override  // androidx.core.view.D
    public void k(View view0, int v, int v1, int v2, int v3, int v4) {
        this.H(v3, v4, null);
    }

    @Override  // androidx.core.view.D
    public boolean l(View view0, View view1, int v, int v1) {
        return (v & 2) != 0;
    }

    @Override  // androidx.core.view.D
    public void m(View view0, View view1, int v, int v1) {
        this.C.c(view0, view1, v, v1);
        this.X(2, v1);
    }

    @Override  // android.view.ViewGroup
    protected void measureChild(View view0, int v, int v1) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingLeft() + this.getPaddingRight(), viewGroup$LayoutParams0.width), 0);
    }

    @Override  // android.view.ViewGroup
    protected void measureChildWithMargins(View view0, int v, int v1, int v2, int v3) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, viewGroup$MarginLayoutParams0.width), View.MeasureSpec.makeMeasureSpec(viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin, 0));
    }

    @Override  // androidx.core.view.D
    public void n(View view0, int v) {
        this.C.e(view0, v);
        this.Z(v);
    }

    @Override  // androidx.core.view.D
    public void o(View view0, int v, int v1, int[] arr_v, int v2) {
        this.i(v, v1, arr_v, null, v2);
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = false;
    }

    @Override  // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        int v1;
        float f;
        int v;
        if(motionEvent0.getAction() == 8 && !this.p) {
            if(A.a(motionEvent0, 2)) {
                v = 9;
                f = motionEvent0.getAxisValue(9);
                v1 = (int)motionEvent0.getX();
            }
            else if(A.a(motionEvent0, 0x400000)) {
                float f1 = motionEvent0.getAxisValue(26);
                v1 = this.getWidth() / 2;
                v = 26;
                f = f1;
            }
            else {
                v = 0;
                v1 = 0;
                f = 0.0f;
            }
            if(f != 0.0f) {
                this.P(-((int)(f * this.getVerticalScrollFactorCompat())), v1, 1, A.a(motionEvent0, 0x2002));
                if(v != 0) {
                    this.H.g(motionEvent0, v);
                }
                return true;
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        boolean z = true;
        if(v == 2 && this.p) {
            return true;
        }
        if((v & 0xFF) == 0) {
            int v4 = (int)motionEvent0.getY();
            if(!this.z(((int)motionEvent0.getX()), v4)) {
                if(!this.Y(motionEvent0) && this.i.isFinished()) {
                    z = false;
                }
                this.p = z;
                this.L();
                return this.p;
            }
            this.l = v4;
            this.w = motionEvent0.getPointerId(0);
            this.A();
            this.q.addMovement(motionEvent0);
            this.i.computeScrollOffset();
            if(!this.Y(motionEvent0) && this.i.isFinished()) {
                z = false;
            }
            this.p = z;
            this.X(2, 0);
        }
        else {
            switch(v & 0xFF) {
                case 1: {
                    goto label_8;
                }
                case 2: {
                    goto label_17;
                }
            }
            switch(v & 0xFF) {
                case 3: {
                label_8:
                    this.p = false;
                    this.w = -1;
                    this.L();
                    if(this.i.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                        this.postInvalidateOnAnimation();
                    }
                    this.Z(0);
                    return this.p;
                }
                case 6: {
                    this.I(motionEvent0);
                    return this.p;
                }
                default: {
                    return this.p;
                }
            }
        label_17:
            int v1 = this.w;
            if(v1 != -1) {
                int v2 = motionEvent0.findPointerIndex(v1);
                if(v2 == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + v1 + " in onInterceptTouchEvent");
                    return this.p;
                }
                int v3 = (int)motionEvent0.getY(v2);
                if(Math.abs(v3 - this.l) > this.t && (2 & this.getNestedScrollAxes()) == 0) {
                    this.p = true;
                    this.l = v3;
                    this.C();
                    this.q.addMovement(motionEvent0);
                    this.z = 0;
                    ViewParent viewParent0 = this.getParent();
                    if(viewParent0 != null) {
                        viewParent0.requestDisallowInterceptTouchEvent(true);
                        return this.p;
                    }
                }
            }
        }
        return this.p;
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        int v4 = 0;
        this.m = false;
        if(this.o != null && NestedScrollView.F(this.o, this)) {
            this.Q(this.o);
        }
        this.o = null;
        if(!this.n) {
            if(this.B != null) {
                this.scrollTo(this.getScrollX(), this.B.f);
                this.B = null;
            }
            if(this.getChildCount() > 0) {
                View view0 = this.getChildAt(0);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
                v4 = view0.getMeasuredHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin;
            }
            int v5 = this.getPaddingTop();
            int v6 = this.getPaddingBottom();
            int v7 = this.getScrollY();
            int v8 = NestedScrollView.f(v7, v3 - v1 - v5 - v6, v4);
            if(v8 != v7) {
                this.scrollTo(this.getScrollX(), v8);
            }
        }
        this.scrollTo(this.getScrollX(), this.getScrollY());
        this.n = true;
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(!this.r) {
            return;
        }
        if(View.MeasureSpec.getMode(v1) == 0) {
            return;
        }
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            int v2 = view0.getMeasuredHeight();
            int v3 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - frameLayout$LayoutParams0.topMargin - frameLayout$LayoutParams0.bottomMargin;
            if(v2 < v3) {
                view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingLeft() + this.getPaddingRight() + frameLayout$LayoutParams0.leftMargin + frameLayout$LayoutParams0.rightMargin, frameLayout$LayoutParams0.width), View.MeasureSpec.makeMeasureSpec(v3, 0x40000000));
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onNestedFling(View view0, float f, float f1, boolean z) {
        if(!z) {
            this.dispatchNestedFling(0.0f, f1, true);
            this.v(((int)f1));
            return true;
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean onNestedPreFling(View view0, float f, float f1) {
        return this.dispatchNestedPreFling(f, f1);
    }

    @Override  // android.view.ViewGroup
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
        this.o(view0, v, v1, arr_v, 0);
    }

    @Override  // android.view.ViewGroup
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        this.H(v3, 0, null);
    }

    @Override  // android.view.ViewGroup
    public void onNestedScrollAccepted(View view0, View view1, int v) {
        this.m(view0, view1, v, 0);
    }

    @Override  // android.view.View
    protected void onOverScrolled(int v, int v1, boolean z, boolean z1) {
        super.scrollTo(v, v1);
    }

    @Override  // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int v, Rect rect0) {
        switch(v) {
            case 1: {
                v = 33;
                break;
            }
            case 2: {
                v = 130;
            }
        }
        View view0 = rect0 == null ? FocusFinder.getInstance().findNextFocus(this, null, v) : FocusFinder.getInstance().findNextFocusFromRect(this, rect0, v);
        if(view0 == null) {
            return false;
        }
        return this.E(view0) ? false : view0.requestFocus(v, rect0);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        this.B = (SavedState)parcelable0;
        this.requestLayout();
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.f = this.getScrollY();
        return parcelable0;
    }

    @Override  // android.view.View
    protected void onScrollChanged(int v, int v1, int v2, int v3) {
        super.onScrollChanged(v, v1, v2, v3);
        d nestedScrollView$d0 = this.F;
        if(nestedScrollView$d0 != null) {
            nestedScrollView$d0.a(this, v, v1, v2, v3);
        }
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        View view0 = this.findFocus();
        if(view0 != null && this != view0 && this.G(view0, 0, v3)) {
            view0.getDrawingRect(this.h);
            this.offsetDescendantRectToMyCoords(view0, this.h);
            this.q(this.g(this.h));
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onStartNestedScroll(View view0, View view1, int v) {
        return this.l(view0, view1, v, 0);
    }

    @Override  // android.view.ViewGroup
    public void onStopNestedScroll(View view0) {
        this.n(view0, 0);
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        this.C();
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.z = 0;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.offsetLocation(0.0f, ((float)this.z));
        switch(v) {
            case 0: {
                if(this.getChildCount() == 0) {
                    return false;
                }
                if(this.p) {
                    ViewParent viewParent0 = this.getParent();
                    if(viewParent0 != null) {
                        viewParent0.requestDisallowInterceptTouchEvent(true);
                    }
                }
                if(!this.i.isFinished()) {
                    this.a();
                }
                this.D(((int)motionEvent0.getY()), motionEvent0.getPointerId(0));
                break;
            }
            case 1: {
                VelocityTracker velocityTracker0 = this.q;
                velocityTracker0.computeCurrentVelocity(1000, ((float)this.v));
                int v1 = (int)velocityTracker0.getYVelocity(this.w);
                if(Math.abs(v1) < this.u) {
                    if(this.i.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                        this.postInvalidateOnAnimation();
                    }
                }
                else if(!this.r(v1) && !this.dispatchNestedPreFling(0.0f, ((float)(-v1)))) {
                    this.dispatchNestedFling(0.0f, ((float)(-v1)), true);
                    this.v(-v1);
                }
                this.s();
                break;
            }
            case 2: {
                int v2 = motionEvent0.findPointerIndex(this.w);
                if(v2 == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.w + " in onTouchEvent");
                }
                else {
                    int v3 = (int)motionEvent0.getY(v2);
                    int v4 = this.l - v3;
                    int v5 = v4 - this.M(v4, motionEvent0.getX(v2));
                    if(!this.p && Math.abs(v5) > this.t) {
                        ViewParent viewParent1 = this.getParent();
                        if(viewParent1 != null) {
                            viewParent1.requestDisallowInterceptTouchEvent(true);
                        }
                        this.p = true;
                        v5 = v5 <= 0 ? v5 + this.t : v5 - this.t;
                    }
                    if(this.p) {
                        int v6 = this.P(v5, ((int)motionEvent0.getX(v2)), 0, false);
                        this.l = v3 - v6;
                        this.z += v6;
                    }
                }
                break;
            }
            case 3: {
                if(this.p && this.getChildCount() > 0 && this.i.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                    this.postInvalidateOnAnimation();
                }
                this.s();
                break;
            }
            case 5: {
                int v7 = motionEvent0.getActionIndex();
                this.l = (int)motionEvent0.getY(v7);
                this.w = motionEvent0.getPointerId(v7);
                break;
            }
            case 6: {
                this.I(motionEvent0);
                this.l = (int)motionEvent0.getY(motionEvent0.findPointerIndex(this.w));
            }
        }
        VelocityTracker velocityTracker1 = this.q;
        if(velocityTracker1 != null) {
            velocityTracker1.addMovement(motionEvent1);
        }
        motionEvent1.recycle();
        return true;
    }

    public void p(int v, int v1, int v2, int v3, int[] arr_v, int v4, int[] arr_v1) {
        this.D.e(v, v1, v2, v3, arr_v, v4, arr_v1);
    }

    private void q(int v) {
        if(v != 0) {
            if(this.s) {
                this.T(0, v);
                return;
            }
            this.scrollBy(0, v);
        }
    }

    private boolean r(int v) {
        if(androidx.core.widget.d.b(this.j) != 0.0f) {
            if(this.S(this.j, v)) {
                this.j.onAbsorb(v);
                return true;
            }
            this.v(-v);
            return true;
        }
        if(androidx.core.widget.d.b(this.k) != 0.0f) {
            if(this.S(this.k, -v)) {
                this.k.onAbsorb(-v);
                return true;
            }
            this.v(-v);
            return true;
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public void requestChildFocus(View view0, View view1) {
        if(this.m) {
            this.o = view1;
        }
        else {
            this.Q(view1);
        }
        super.requestChildFocus(view0, view1);
    }

    @Override  // android.view.ViewGroup
    public boolean requestChildRectangleOnScreen(View view0, Rect rect0, boolean z) {
        rect0.offset(view0.getLeft() - view0.getScrollX(), view0.getTop() - view0.getScrollY());
        return this.R(rect0, z);
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if(z) {
            this.L();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.m = true;
        super.requestLayout();
    }

    private void s() {
        this.w = -1;
        this.p = false;
        this.L();
        this.Z(0);
        this.j.onRelease();
        this.k.onRelease();
    }

    @Override  // android.view.View
    public void scrollTo(int v, int v1) {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            int v2 = NestedScrollView.f(v, this.getWidth() - this.getPaddingLeft() - this.getPaddingRight(), view0.getWidth() + frameLayout$LayoutParams0.leftMargin + frameLayout$LayoutParams0.rightMargin);
            int v3 = NestedScrollView.f(v1, this.getHeight() - this.getPaddingTop() - this.getPaddingBottom(), view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin);
            if(v2 != this.getScrollX() || v3 != this.getScrollY()) {
                super.scrollTo(v2, v3);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if(z != this.r) {
            this.r = z;
            this.requestLayout();
        }
    }

    @Override  // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.D.m(z);
    }

    public void setOnScrollChangeListener(d nestedScrollView$d0) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.s = z;
    }

    @Override  // android.widget.FrameLayout
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override  // android.view.View
    public boolean startNestedScroll(int v) {
        return this.X(v, 0);
    }

    @Override  // android.view.View
    public void stopNestedScroll() {
        this.Z(0);
    }

    public boolean t(KeyEvent keyEvent0) {
        this.h.setEmpty();
        int v = 130;
        if(!this.e()) {
            if(this.isFocused() && keyEvent0.getKeyCode() != 4) {
                View view0 = this.findFocus();
                if(view0 == this) {
                    view0 = null;
                }
                View view1 = FocusFinder.getInstance().findNextFocus(this, view0, 130);
                return view1 != null && view1 != this && view1.requestFocus(130);
            }
            return false;
        }
        if(keyEvent0.getAction() == 0) {
            switch(keyEvent0.getKeyCode()) {
                case 19: {
                    return keyEvent0.isAltPressed() ? this.w(33) : this.c(33);
                }
                case 20: {
                    return keyEvent0.isAltPressed() ? this.w(130) : this.c(130);
                }
                case 62: {
                    if(keyEvent0.isShiftPressed()) {
                        v = 33;
                    }
                    this.K(v);
                    return false;
                }
                case 92: {
                    return this.w(33);
                }
                case 93: {
                    return this.w(130);
                }
                case 0x7A: {
                    this.K(33);
                    return false;
                }
                case 0x7B: {
                    this.K(130);
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    private View u(boolean z, int v, int v1) {
        ArrayList arrayList0 = this.getFocusables(2);
        int v2 = arrayList0.size();
        View view0 = null;
        int v4 = 0;
        for(int v3 = 0; v3 < v2; ++v3) {
            View view1 = (View)arrayList0.get(v3);
            int v5 = view1.getTop();
            int v6 = view1.getBottom();
            if(v < v6 && v5 < v1) {
                int v7 = v >= v5 || v6 >= v1 ? 0 : 1;
                if(view0 == null) {
                    view0 = view1;
                    v4 = v7;
                }
                else {
                    boolean z1 = z && v5 < view0.getTop() || !z && v6 > view0.getBottom();
                    if(v4 == 0) {
                        if(v7 != 0) {
                            view0 = view1;
                            v4 = 1;
                        }
                        else if(z1) {
                            view0 = view1;
                        }
                    }
                    else if(v7 != 0 && z1) {
                        view0 = view1;
                    }
                }
            }
        }
        return view0;
    }

    public void v(int v) {
        if(this.getChildCount() > 0) {
            this.i.fling(this.getScrollX(), this.getScrollY(), 0, v, 0, 0, 0x80000000, 0x7FFFFFFF, 0, 0);
            this.N(true);
        }
    }

    public boolean w(int v) {
        int v1 = this.getHeight();
        this.h.top = 0;
        this.h.bottom = v1;
        if(v == 130) {
            int v2 = this.getChildCount();
            if(v2 > 0) {
                View view0 = this.getChildAt(v2 - 1);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
                this.h.bottom = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin + this.getPaddingBottom();
                this.h.top = this.h.bottom - v1;
            }
        }
        return this.O(v, this.h.top, this.h.bottom);
    }

    private float x(int v) {
        return (float)(((double)(this.f * 0.015f)) * Math.exp(((double)NestedScrollView.I) / (((double)NestedScrollView.I) - 1.0) * Math.log(((float)Math.abs(v)) * 0.35f / (this.f * 0.015f))));
    }

    public boolean y(int v) {
        return this.D.k(v);
    }

    private boolean z(int v, int v1) {
        if(this.getChildCount() > 0) {
            int v2 = this.getScrollY();
            View view0 = this.getChildAt(0);
            return v1 >= view0.getTop() - v2 && v1 < view0.getBottom() - v2 && v >= view0.getLeft() && v < view0.getRight();
        }
        return false;
    }
}

