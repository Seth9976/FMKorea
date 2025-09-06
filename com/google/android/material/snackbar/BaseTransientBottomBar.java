package com.google.android.material.snackbar;

import S1.g;
import S1.k;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.t;

public abstract class BaseTransientBottomBar {
    public static class Behavior extends SwipeDismissBehavior {
        private final b p;

        public Behavior() {
            this.p = new b(this);
        }

        @Override  // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view0) {
            return this.p.a(view0);
        }

        @Override  // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean o(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
            this.p.b(coordinatorLayout0, view0, motionEvent0);
            return super.o(coordinatorLayout0, view0, motionEvent0);
        }
    }

    class a implements Handler.Callback {
        a() {
            super();
        }

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(Message message0) {
            switch(message0.what) {
                case 0: {
                    E.a(message0.obj);
                    throw null;
                }
                case 1: {
                    E.a(message0.obj);
                    throw null;
                }
                default: {
                    return false;
                }
            }
        }
    }

    public static class b {
        public b(SwipeDismissBehavior swipeDismissBehavior0) {
            swipeDismissBehavior0.P(0.1f);
            swipeDismissBehavior0.O(0.6f);
            swipeDismissBehavior0.Q(0);
        }

        public boolean a(View view0) {
            return view0 instanceof c;
        }

        public void b(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
            switch(motionEvent0.getActionMasked()) {
                case 0: {
                    if(coordinatorLayout0.B(view0, ((int)motionEvent0.getX()), ((int)motionEvent0.getY()))) {
                        com.google.android.material.snackbar.a.b().e(null);
                    }
                    return;
                }
                case 1: 
                case 3: {
                    com.google.android.material.snackbar.a.b().f(null);
                }
            }
        }
    }

    public static abstract class c extends FrameLayout {
        class com.google.android.material.snackbar.BaseTransientBottomBar.c.a implements View.OnTouchListener {
            com.google.android.material.snackbar.BaseTransientBottomBar.c.a() {
                super();
            }

            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                return true;
            }
        }

        k f;
        private int g;
        private final float h;
        private final float i;
        private final int j;
        private final int k;
        private ColorStateList l;
        private PorterDuff.Mode m;
        private Rect n;
        private boolean o;
        private static final View.OnTouchListener p;

        static {
            c.p = new com.google.android.material.snackbar.BaseTransientBottomBar.c.a();
        }

        protected c(Context context0, AttributeSet attributeSet0) {
            super(V1.a.c(context0, attributeSet0, 0, 0), attributeSet0);
            Context context1 = this.getContext();
            TypedArray typedArray0 = context1.obtainStyledAttributes(attributeSet0, z1.k.M6);
            if(typedArray0.hasValue(z1.k.T6)) {
                Y.w0(this, ((float)typedArray0.getDimensionPixelSize(6, 0)));
            }
            this.g = typedArray0.getInt(z1.k.P6, 0);
            if(typedArray0.hasValue(z1.k.V6) || typedArray0.hasValue(z1.k.W6)) {
                this.f = k.e(context1, attributeSet0, 0, 0).m();
            }
            this.h = typedArray0.getFloat(z1.k.Q6, 1.0f);
            this.setBackgroundTintList(P1.c.a(context1, typedArray0, z1.k.R6));
            this.setBackgroundTintMode(t.i(typedArray0.getInt(z1.k.S6, -1), PorterDuff.Mode.SRC_IN));
            this.i = typedArray0.getFloat(z1.k.O6, 1.0f);
            this.j = typedArray0.getDimensionPixelSize(z1.k.N6, -1);
            this.k = typedArray0.getDimensionPixelSize(z1.k.U6, -1);
            typedArray0.recycle();
            this.setOnTouchListener(c.p);
            this.setFocusable(true);
            if(this.getBackground() == null) {
                Y.s0(this, this.a());
            }
        }

        private Drawable a() {
            int v = H1.a.k(this, z1.a.p, z1.a.m, this.getBackgroundOverlayColorAlpha());
            k k0 = this.f;
            g g0 = k0 == null ? BaseTransientBottomBar.c(v, this.getResources()) : BaseTransientBottomBar.d(v, k0);
            if(this.l != null) {
                androidx.core.graphics.drawable.a.o(g0, this.l);
                return g0;
            }
            return g0;
        }

        private void b(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            this.n = new Rect(viewGroup$MarginLayoutParams0.leftMargin, viewGroup$MarginLayoutParams0.topMargin, viewGroup$MarginLayoutParams0.rightMargin, viewGroup$MarginLayoutParams0.bottomMargin);
        }

        float getActionTextColorAlpha() {
            return this.i;
        }

        int getAnimationMode() {
            return this.g;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.h;
        }

        int getMaxInlineActionWidth() {
            return this.k;
        }

        int getMaxWidth() {
            return this.j;
        }

        @Override  // android.view.ViewGroup
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            Y.l0(this);
        }

        @Override  // android.view.ViewGroup
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override  // android.widget.FrameLayout
        protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
            super.onLayout(z, v, v1, v2, v3);
        }

        @Override  // android.widget.FrameLayout
        protected void onMeasure(int v, int v1) {
            super.onMeasure(v, v1);
            if(this.j > 0) {
                int v2 = this.getMeasuredWidth();
                int v3 = this.j;
                if(v2 > v3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(v3, 0x40000000), v1);
                }
            }
        }

        void setAnimationMode(int v) {
            this.g = v;
        }

        @Override  // android.view.View
        public void setBackground(Drawable drawable0) {
            this.setBackgroundDrawable(drawable0);
        }

        @Override  // android.view.View
        public void setBackgroundDrawable(Drawable drawable0) {
            if(drawable0 != null && this.l != null) {
                drawable0 = androidx.core.graphics.drawable.a.r(drawable0.mutate());
                androidx.core.graphics.drawable.a.o(drawable0, this.l);
                androidx.core.graphics.drawable.a.p(drawable0, this.m);
            }
            super.setBackgroundDrawable(drawable0);
        }

        @Override  // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList0) {
            this.l = colorStateList0;
            if(this.getBackground() != null) {
                Drawable drawable0 = androidx.core.graphics.drawable.a.r(this.getBackground().mutate());
                androidx.core.graphics.drawable.a.o(drawable0, colorStateList0);
                androidx.core.graphics.drawable.a.p(drawable0, this.m);
                if(drawable0 != this.getBackground()) {
                    super.setBackgroundDrawable(drawable0);
                }
            }
        }

        @Override  // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
            this.m = porterDuff$Mode0;
            if(this.getBackground() != null) {
                Drawable drawable0 = androidx.core.graphics.drawable.a.r(this.getBackground().mutate());
                androidx.core.graphics.drawable.a.p(drawable0, porterDuff$Mode0);
                if(drawable0 != this.getBackground()) {
                    super.setBackgroundDrawable(drawable0);
                }
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar0) {
        }

        @Override  // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super.setLayoutParams(viewGroup$LayoutParams0);
            if(!this.o && viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                this.b(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
            }
        }

        @Override  // android.view.View
        public void setOnClickListener(View.OnClickListener view$OnClickListener0) {
            this.setOnTouchListener((view$OnClickListener0 == null ? c.p : null));
            super.setOnClickListener(view$OnClickListener0);
        }
    }

    private static final TimeInterpolator a;
    private static final TimeInterpolator b;
    private static final TimeInterpolator c;
    static final Handler d;
    private static final boolean e;
    private static final int[] f;
    private static final String g;

    static {
        BaseTransientBottomBar.a = A1.a.b;
        BaseTransientBottomBar.b = A1.a.a;
        BaseTransientBottomBar.c = A1.a.d;
        BaseTransientBottomBar.e = false;
        BaseTransientBottomBar.f = new int[]{z1.a.R};
        BaseTransientBottomBar.g = "BaseTransientBottomBar";
        BaseTransientBottomBar.d = new Handler(Looper.getMainLooper(), new a());
    }

    private static GradientDrawable c(int v, Resources resources0) {
        float f = resources0.getDimension(z1.c.t0);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(0);
        gradientDrawable0.setCornerRadius(f);
        gradientDrawable0.setColor(v);
        return gradientDrawable0;
    }

    private static g d(int v, k k0) {
        g g0 = new g(k0);
        g0.V(ColorStateList.valueOf(v));
        return g0;
    }
}

