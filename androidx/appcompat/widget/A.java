package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.Y;
import androidx.core.view.g0;
import androidx.core.view.h0;
import e.j;

abstract class a extends ViewGroup {
    public class androidx.appcompat.widget.a.a implements h0 {
        private boolean a;
        int b;
        final a c;

        protected androidx.appcompat.widget.a.a() {
            this.a = false;
        }

        @Override  // androidx.core.view.h0
        public void a(View view0) {
            this.a = true;
        }

        @Override  // androidx.core.view.h0
        public void b(View view0) {
            if(this.a) {
                return;
            }
            a.this.k = null;
            a.this.super.setVisibility(this.b);
        }

        @Override  // androidx.core.view.h0
        public void c(View view0) {
            a.this.super.setVisibility(0);
            this.a = false;
        }

        public androidx.appcompat.widget.a.a d(g0 g00, int v) {
            a.this.k = g00;
            this.b = v;
            return this;
        }
    }

    protected final androidx.appcompat.widget.a.a f;
    protected final Context g;
    protected ActionMenuView h;
    protected ActionMenuPresenter i;
    protected int j;
    protected g0 k;
    private boolean l;
    private boolean m;

    a(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.f = new androidx.appcompat.widget.a.a(this);
        TypedValue typedValue0 = new TypedValue();
        if(context0.getTheme().resolveAttribute(e.a.a, typedValue0, true) && typedValue0.resourceId != 0) {
            this.g = new ContextThemeWrapper(context0, typedValue0.resourceId);
            return;
        }
        this.g = context0;
    }

    protected int c(View view0, int v, int v1, int v2) {
        view0.measure(View.MeasureSpec.makeMeasureSpec(v, 0x80000000), v1);
        return Math.max(0, v - view0.getMeasuredWidth() - v2);
    }

    // 去混淆评级： 低(20)
    protected static int d(int v, int v1, boolean z) {
        return z ? v - v1 : v + v1;
    }

    protected int e(View view0, int v, int v1, int v2, boolean z) {
        int v3 = view0.getMeasuredWidth();
        int v4 = view0.getMeasuredHeight();
        int v5 = v1 + (v2 - v4) / 2;
        if(z) {
            view0.layout(v - v3, v5, v, v4 + v5);
            return -v3;
        }
        view0.layout(v, v5, v + v3, v4 + v5);
        return v3;
    }

    public g0 f(int v, long v1) {
        g0 g00 = this.k;
        if(g00 != null) {
            g00.c();
        }
        if(v == 0) {
            if(this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            g0 g01 = Y.e(this).b(1.0f);
            g01.f(v1);
            g01.h(this.f.d(g01, 0));
            return g01;
        }
        g0 g02 = Y.e(this).b(0.0f);
        g02.f(v1);
        g02.h(this.f.d(g02, v));
        return g02;
    }

    public int getAnimatedVisibility() {
        return this.k == null ? this.getVisibility() : this.f.b;
    }

    public int getContentHeight() {
        return this.j;
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(null, j.a, e.a.c, 0);
        this.setContentHeight(typedArray0.getLayoutDimension(j.j, 0));
        typedArray0.recycle();
        ActionMenuPresenter actionMenuPresenter0 = this.i;
        if(actionMenuPresenter0 != null) {
            actionMenuPresenter0.H(configuration0);
        }
    }

    @Override  // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 9) {
            this.m = false;
        }
        if(!this.m && (v == 9 && !super.onHoverEvent(motionEvent0))) {
            this.m = true;
        }
        if(v == 3 || v == 10) {
            this.m = false;
        }
        return true;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.l = false;
        }
        if(!this.l && (v == 0 && !super.onTouchEvent(motionEvent0))) {
            this.l = true;
        }
        if(v == 1 || v == 3) {
            this.l = false;
        }
        return true;
    }

    public abstract void setContentHeight(int arg1);

    @Override  // android.view.View
    public void setVisibility(int v) {
        if(v != this.getVisibility()) {
            g0 g00 = this.k;
            if(g00 != null) {
                g00.c();
            }
            super.setVisibility(v);
        }
    }
}

