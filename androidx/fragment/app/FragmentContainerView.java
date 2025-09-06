package androidx.fragment.app;

import R.c;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.Y;
import androidx.core.view.y0;
import java.util.ArrayList;
import java.util.List;
import z3.g;
import z3.k;

public final class FragmentContainerView extends FrameLayout {
    public static final class a {
        public static final a a;

        static {
            a.a = new a();
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0, View view0, WindowInsets windowInsets0) {
            k.e(view$OnApplyWindowInsetsListener0, "onApplyWindowInsetsListener");
            k.e(view0, "v");
            k.e(windowInsets0, "insets");
            WindowInsets windowInsets1 = view$OnApplyWindowInsetsListener0.onApplyWindowInsets(view0, windowInsets0);
            k.d(windowInsets1, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsets1;
        }
    }

    private final List f;
    private final List g;
    private View.OnApplyWindowInsetsListener h;
    private boolean i;

    public FragmentContainerView(Context context0, AttributeSet attributeSet0) {
        k.e(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public FragmentContainerView(Context context0, AttributeSet attributeSet0, int v) {
        k.e(context0, "context");
        String s1;
        super(context0, attributeSet0, v);
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        if(attributeSet0 != null) {
            String s = attributeSet0.getClassAttribute();
            k.d(c.e, "FragmentContainerView");
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, c.e, 0, 0);
            if(s == null) {
                s = typedArray0.getString(c.f);
                s1 = "android:name";
            }
            else {
                s1 = "class";
            }
            typedArray0.recycle();
            if(s != null && !this.isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + s1 + "=\"" + s + '\"');
            }
        }
    }

    public FragmentContainerView(Context context0, AttributeSet attributeSet0, int v, int v1, g g0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public FragmentContainerView(Context context0, AttributeSet attributeSet0, FragmentManager fragmentManager0) {
        k.e(context0, "context");
        k.e(attributeSet0, "attrs");
        k.e(fragmentManager0, "fm");
        super(context0, attributeSet0);
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        String s = attributeSet0.getClassAttribute();
        k.d(c.e, "FragmentContainerView");
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, c.e, 0, 0);
        if(s == null) {
            s = typedArray0.getString(c.f);
        }
        String s1 = typedArray0.getString(c.g);
        typedArray0.recycle();
        int v = this.getId();
        if(s != null && fragmentManager0.h0(v) == null) {
            if(v == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + s + (s1 == null ? "" : " with tag " + s1));
            }
            Fragment fragment0 = fragmentManager0.s0().a(context0.getClassLoader(), s);
            k.d(fragment0, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragment0.onInflate(context0, attributeSet0, null);
            fragmentManager0.p().p(true).c(this, fragment0, s1).j();
        }
        fragmentManager0.Z0(this);
    }

    private final void a(View view0) {
        if(this.g.contains(view0)) {
            this.f.add(view0);
        }
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        k.e(view0, "child");
        if(FragmentManager.B0(view0) == null) {
            throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view0 + " is not associated with a Fragment.").toString());
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets0) {
        y0 y01;
        k.e(windowInsets0, "insets");
        y0 y00 = y0.x(windowInsets0);
        k.d(y00, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0 = this.h;
        if(view$OnApplyWindowInsetsListener0 == null) {
            y01 = Y.a0(this, y00);
        }
        else {
            k.b(view$OnApplyWindowInsetsListener0);
            y01 = y0.x(a.a.a(view$OnApplyWindowInsetsListener0, this, windowInsets0));
        }
        k.d(y01, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if(!y01.q()) {
            int v = this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                Y.g(this.getChildAt(v1), y01);
            }
        }
        return windowInsets0;
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        k.e(canvas0, "canvas");
        if(this.i) {
            for(Object object0: this.f) {
                super.drawChild(canvas0, ((View)object0), this.getDrawingTime());
            }
        }
        super.dispatchDraw(canvas0);
    }

    @Override  // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas0, View view0, long v) {
        k.e(canvas0, "canvas");
        k.e(view0, "child");
        return !this.i || this.f.isEmpty() || !this.f.contains(view0) ? super.drawChild(canvas0, view0, v) : false;
    }

    @Override  // android.view.ViewGroup
    public void endViewTransition(View view0) {
        k.e(view0, "view");
        this.g.remove(view0);
        if(this.f.remove(view0)) {
            this.i = true;
        }
        super.endViewTransition(view0);
    }

    public final Fragment getFragment() {
        return FragmentManager.k0(this).h0(this.getId());
    }

    @Override  // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets0) {
        k.e(windowInsets0, "insets");
        return windowInsets0;
    }

    @Override  // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for(int v = this.getChildCount() - 1; -1 < v; --v) {
            View view0 = this.getChildAt(v);
            k.d(view0, "view");
            this.a(view0);
        }
        super.removeAllViewsInLayout();
    }

    @Override  // android.view.ViewGroup
    public void removeView(View view0) {
        k.e(view0, "view");
        this.a(view0);
        super.removeView(view0);
    }

    @Override  // android.view.ViewGroup
    public void removeViewAt(int v) {
        View view0 = this.getChildAt(v);
        k.d(view0, "view");
        this.a(view0);
        super.removeViewAt(v);
    }

    @Override  // android.view.ViewGroup
    public void removeViewInLayout(View view0) {
        k.e(view0, "view");
        this.a(view0);
        super.removeViewInLayout(view0);
    }

    @Override  // android.view.ViewGroup
    public void removeViews(int v, int v1) {
        for(int v2 = v; v2 < v + v1; ++v2) {
            View view0 = this.getChildAt(v2);
            k.d(view0, "view");
            this.a(view0);
        }
        super.removeViews(v, v1);
    }

    @Override  // android.view.ViewGroup
    public void removeViewsInLayout(int v, int v1) {
        for(int v2 = v; v2 < v + v1; ++v2) {
            View view0 = this.getChildAt(v2);
            k.d(view0, "view");
            this.a(view0);
        }
        super.removeViewsInLayout(v, v1);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.i = z;
    }

    @Override  // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition0) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override  // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0) {
        k.e(view$OnApplyWindowInsetsListener0, "listener");
        this.h = view$OnApplyWindowInsetsListener0;
    }

    @Override  // android.view.ViewGroup
    public void startViewTransition(View view0) {
        k.e(view0, "view");
        if(view0.getParent() == this) {
            this.g.add(view0);
        }
        super.startViewTransition(view0);
    }
}

