package com.google.android.material.navigation;

import C.z;
import M1.h;
import Q1.b;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k.a;
import androidx.appcompat.widget.h0;
import androidx.core.view.K;
import androidx.core.view.Y;
import z1.c;
import z1.f;
import z1.i;

public abstract class d extends FrameLayout implements a {
    static class com.google.android.material.navigation.d.d {
        private com.google.android.material.navigation.d.d() {
        }

        com.google.android.material.navigation.d.d(com.google.android.material.navigation.d.a d$a0) {
        }

        protected float a(float f, float f1) {
            int v = Float.compare(f1, 0.0f);
            float f2 = v == 0 ? 0.8f : 0.0f;
            return v == 0 ? A1.a.b(0.0f, 1.0f, f2, 1.0f, f) : A1.a.b(0.0f, 1.0f, f2, 0.2f, f);
        }

        protected float b(float f, float f1) {
            return 0.4f + f * 0.6f;
        }

        protected float c(float f, float f1) {
            return 1.0f;
        }

        public void d(float f, float f1, View view0) {
            view0.setScaleX(this.b(f, f1));
            view0.setScaleY(this.c(f, f1));
            view0.setAlpha(this.a(f, f1));
        }
    }

    static class e extends com.google.android.material.navigation.d.d {
        private e() {
            super(null);
        }

        e(com.google.android.material.navigation.d.a d$a0) {
        }

        @Override  // com.google.android.material.navigation.d$d
        protected float c(float f, float f1) {
            return this.b(f, f1);
        }
    }

    private Drawable A;
    private Drawable B;
    private ValueAnimator C;
    private com.google.android.material.navigation.d.d D;
    private float E;
    private boolean F;
    private int G;
    private int H;
    private boolean I;
    private int J;
    private com.google.android.material.badge.a K;
    private static final int[] L;
    private static final com.google.android.material.navigation.d.d M;
    private static final com.google.android.material.navigation.d.d N;
    private boolean f;
    private ColorStateList g;
    Drawable h;
    private int i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float n;
    private int o;
    private boolean p;
    private final FrameLayout q;
    private final View r;
    private final ImageView s;
    private final ViewGroup t;
    private final TextView u;
    private final TextView v;
    private int w;
    private int x;
    private g y;
    private ColorStateList z;

    static {
        d.L = new int[]{0x10100A0};
        d.M = new com.google.android.material.navigation.d.d(null);
        d.N = new e(null);
    }

    public d(Context context0) {
        class com.google.android.material.navigation.d.a implements View.OnLayoutChangeListener {
            final d a;

            @Override  // android.view.View$OnLayoutChangeListener
            public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                if(d.a(d.this).getVisibility() == 0) {
                    ImageView imageView0 = d.a(d.this);
                    d.b(d.this, imageView0);
                }
            }
        }

        super(context0);
        this.f = false;
        this.w = -1;
        this.x = 0;
        this.D = d.M;
        this.E = 0.0f;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = false;
        this.J = 0;
        LayoutInflater.from(context0).inflate(this.getItemLayoutResId(), this, true);
        this.q = (FrameLayout)this.findViewById(z1.e.G);
        this.r = this.findViewById(z1.e.F);
        ImageView imageView0 = (ImageView)this.findViewById(z1.e.H);
        this.s = imageView0;
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(z1.e.I);
        this.t = viewGroup0;
        TextView textView0 = (TextView)this.findViewById(z1.e.K);
        this.u = textView0;
        TextView textView1 = (TextView)this.findViewById(z1.e.J);
        this.v = textView1;
        this.setBackgroundResource(0x7F080114);  // drawable:mtrl_navigation_bar_item_background
        this.i = this.getResources().getDimensionPixelSize(this.getItemDefaultMarginResId());
        this.j = viewGroup0.getPaddingBottom();
        this.k = this.getResources().getDimensionPixelSize(c.B);
        Y.x0(textView0, 2);
        Y.x0(textView1, 2);
        this.setFocusable(true);
        this.g(textView0.getTextSize(), textView1.getTextSize());
        if(imageView0 != null) {
            imageView0.addOnLayoutChangeListener(new com.google.android.material.navigation.d.a(this));
        }
    }

    static ImageView a(d d0) {
        return d0.s;
    }

    static void b(d d0, View view0) {
        d0.w(view0);
    }

    @Override  // androidx.appcompat.view.menu.k$a
    public boolean d() {
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        FrameLayout frameLayout0 = this.q;
        if(frameLayout0 != null && this.F) {
            frameLayout0.dispatchTouchEvent(motionEvent0);
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    @Override  // androidx.appcompat.view.menu.k$a
    public void e(g g0, int v) {
        this.y = g0;
        this.setCheckable(g0.isCheckable());
        this.setChecked(g0.isChecked());
        this.setEnabled(g0.isEnabled());
        this.setIcon(g0.getIcon());
        this.setTitle(g0.getTitle());
        this.setId(g0.getItemId());
        if(!TextUtils.isEmpty(g0.getContentDescription())) {
            this.setContentDescription(g0.getContentDescription());
        }
        CharSequence charSequence0 = TextUtils.isEmpty(g0.getTooltipText()) ? g0.getTitle() : g0.getTooltipText();
        if(Build.VERSION.SDK_INT > 23) {
            h0.a(this, charSequence0);
        }
        this.setVisibility((g0.isVisible() ? 0 : 8));
        this.f = true;
    }

    private void g(float f, float f1) {
        this.l = f - f1;
        this.m = f1 * 1.0f / f;
        this.n = f * 1.0f / f1;
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.r == null ? null : this.r.getBackground();
    }

    public com.google.android.material.badge.a getBadge() {
        return this.K;
    }

    private View getIconOrContainer() {
        View view0 = this.q;
        return view0 == null ? this.s : view0;
    }

    protected int getItemBackgroundResId() [...] // 潜在的解密器

    @Override  // androidx.appcompat.view.menu.k$a
    public g getItemData() {
        return this.y;
    }

    protected int getItemDefaultMarginResId() {
        return c.o0;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.w;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup0 = (ViewGroup)this.getParent();
        int v = viewGroup0.indexOfChild(this);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0 instanceof d && view0.getVisibility() == 0) {
                ++v2;
            }
        }
        return v2;
    }

    private int getSuggestedIconHeight() {
        return ((FrameLayout.LayoutParams)this.getIconOrContainer().getLayoutParams()).topMargin + this.getIconOrContainer().getMeasuredHeight();
    }

    private int getSuggestedIconWidth() {
        int v = this.K == null ? 0 : this.K.getMinimumWidth() - this.K.k();
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.getIconOrContainer().getLayoutParams();
        return Math.max(v, frameLayout$LayoutParams0.leftMargin) + this.s.getMeasuredWidth() + Math.max(v, frameLayout$LayoutParams0.rightMargin);
    }

    @Override  // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.t.getLayoutParams();
        int v = this.getSuggestedIconHeight();
        return this.t.getVisibility() == 0 ? v + this.k + frameLayout$LayoutParams0.topMargin + this.t.getMeasuredHeight() + frameLayout$LayoutParams0.bottomMargin : v + frameLayout$LayoutParams0.topMargin + this.t.getMeasuredHeight() + frameLayout$LayoutParams0.bottomMargin;
    }

    @Override  // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.t.getLayoutParams();
        int v = frameLayout$LayoutParams0.leftMargin + this.t.getMeasuredWidth() + frameLayout$LayoutParams0.rightMargin;
        return Math.max(this.getSuggestedIconWidth(), v);
    }

    void h() {
        this.p();
        this.y = null;
        this.E = 0.0f;
        this.f = false;
    }

    private static Drawable i(ColorStateList colorStateList0) {
        return new RippleDrawable(b.a(colorStateList0), null, null);
    }

    private FrameLayout j(View view0) {
        return view0 != this.s || !com.google.android.material.badge.b.a ? null : ((FrameLayout)this.s.getParent());
    }

    private boolean k() {
        return this.K != null;
    }

    private boolean l() {
        return this.I && this.o == 2;
    }

    private void m(float f) {
        class com.google.android.material.navigation.d.c implements ValueAnimator.AnimatorUpdateListener {
            final float a;
            final d b;

            com.google.android.material.navigation.d.c(float f) {
                this.a = f;
                super();
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                d.this.q(f, this.a);
            }
        }

        if(this.F && this.f && Y.R(this)) {
            ValueAnimator valueAnimator0 = this.C;
            if(valueAnimator0 != null) {
                valueAnimator0.cancel();
                this.C = null;
            }
            ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{this.E, f});
            this.C = valueAnimator1;
            valueAnimator1.addUpdateListener(new com.google.android.material.navigation.d.c(this, f));
            this.C.setInterpolator(h.g(this.getContext(), z1.a.J, A1.a.b));
            ValueAnimator valueAnimator2 = this.C;
            Context context0 = this.getContext();
            int v = this.getResources().getInteger(f.b);
            valueAnimator2.setDuration(((long)h.f(context0, z1.a.C, v)));
            this.C.start();
            return;
        }
        this.q(f, f);
    }

    private void n() {
        g g0 = this.y;
        if(g0 != null) {
            this.setChecked(g0.isChecked());
        }
    }

    private void o() {
        Drawable drawable0 = this.h;
        Drawable drawable1 = null;
        boolean z = true;
        if(this.g != null) {
            Drawable drawable2 = this.getActiveIndicatorDrawable();
            if(this.F && this.getActiveIndicatorDrawable() != null && this.q != null && drawable2 != null) {
                drawable1 = new RippleDrawable(b.d(this.g), null, drawable2);
                z = false;
            }
            else if(drawable0 == null) {
                drawable0 = d.i(this.g);
            }
        }
        FrameLayout frameLayout0 = this.q;
        if(frameLayout0 != null) {
            frameLayout0.setPadding(0, 0, 0, 0);
            this.q.setForeground(drawable1);
        }
        Y.s0(this, drawable0);
        if(Build.VERSION.SDK_INT >= 26) {
            com.google.android.material.navigation.c.a(this, z);
        }
    }

    @Override  // android.view.ViewGroup
    public int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.y != null && this.y.isCheckable() && this.y.isChecked()) {
            View.mergeDrawableStates(arr_v, d.L);
        }
        return arr_v;
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        if(this.K != null && this.K.isVisible()) {
            CharSequence charSequence0 = this.y.getTitle();
            if(!TextUtils.isEmpty(this.y.getContentDescription())) {
                charSequence0 = this.y.getContentDescription();
            }
            accessibilityNodeInfo0.setContentDescription(charSequence0 + ", " + this.K.h());
        }
        z z0 = z.P0(accessibilityNodeInfo0);
        z0.p0(C.z.f.a(0, 1, this.getItemVisiblePosition(), 1, false, this.isSelected()));
        if(this.isSelected()) {
            z0.n0(false);
            z0.e0(C.z.a.i);
        }
        z0.D0(this.getResources().getString(i.h));
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        class com.google.android.material.navigation.d.b implements Runnable {
            final int f;
            final d g;

            com.google.android.material.navigation.d.b(int v) {
                this.f = v;
                super();
            }

            @Override
            public void run() {
                d.this.x(this.f);
            }
        }

        super.onSizeChanged(v, v1, v2, v3);
        this.post(new com.google.android.material.navigation.d.b(this, v));
    }

    void p() {
        this.v(this.s);
    }

    private void q(float f, float f1) {
        View view0 = this.r;
        if(view0 != null) {
            this.D.d(f, f1, view0);
        }
        this.E = f;
    }

    private static void r(TextView textView0, int v) {
        androidx.core.widget.i.o(textView0, v);
        int v1 = P1.c.i(textView0.getContext(), v, 0);
        if(v1 != 0) {
            textView0.setTextSize(0, ((float)v1));
        }
    }

    private static void s(View view0, float f, float f1, int v) {
        view0.setScaleX(f);
        view0.setScaleY(f1);
        view0.setVisibility(v);
    }

    public void setActiveIndicatorDrawable(Drawable drawable0) {
        View view0 = this.r;
        if(view0 == null) {
            return;
        }
        view0.setBackgroundDrawable(drawable0);
        this.o();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.F = z;
        this.o();
        View view0 = this.r;
        if(view0 != null) {
            view0.setVisibility((z ? 0 : 8));
            this.requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int v) {
        this.H = v;
        this.x(this.getWidth());
    }

    public void setActiveIndicatorLabelPadding(int v) {
        if(this.k != v) {
            this.k = v;
            this.n();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int v) {
        this.J = v;
        this.x(this.getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.I = z;
    }

    public void setActiveIndicatorWidth(int v) {
        this.G = v;
        this.x(this.getWidth());
    }

    void setBadge(com.google.android.material.badge.a a0) {
        if(this.K == a0) {
            return;
        }
        if(this.k() && this.s != null) {
            Log.w("NavigationBar", "Multiple badges shouldn\'t be attached to one item.");
            this.v(this.s);
        }
        this.K = a0;
        ImageView imageView0 = this.s;
        if(imageView0 != null) {
            this.u(imageView0);
        }
    }

    public void setCheckable(boolean z) {
        this.refreshDrawableState();
    }

    public void setChecked(boolean z) {
        int v = this.v.getWidth();
        this.v.setPivotX(((float)(v / 2)));
        float f = (float)this.v.getBaseline();
        this.v.setPivotY(f);
        int v1 = this.u.getWidth();
        this.u.setPivotX(((float)(v1 / 2)));
        float f1 = (float)this.u.getBaseline();
        this.u.setPivotY(f1);
        this.m((z ? 1.0f : 0.0f));
        switch(this.o) {
            case -1: {
                if(!this.p) {
                    d.z(this.t, this.j);
                    if(z) {
                        d.t(this.getIconOrContainer(), ((int)(((float)this.i) + this.l)), 49);
                        d.s(this.v, 1.0f, 1.0f, 0);
                        d.s(this.u, this.m, this.m, 4);
                    }
                    else {
                        d.t(this.getIconOrContainer(), this.i, 49);
                        d.s(this.v, this.n, this.n, 4);
                        d.s(this.u, 1.0f, 1.0f, 0);
                    }
                }
                else if(z) {
                    d.t(this.getIconOrContainer(), this.i, 49);
                    d.z(this.t, this.j);
                    this.v.setVisibility(0);
                    this.u.setVisibility(4);
                }
                else {
                    d.t(this.getIconOrContainer(), this.i, 17);
                    d.z(this.t, 0);
                    this.v.setVisibility(4);
                    this.u.setVisibility(4);
                }
                break;
            }
            case 0: {
                if(z) {
                    d.t(this.getIconOrContainer(), this.i, 49);
                    d.z(this.t, this.j);
                    this.v.setVisibility(0);
                }
                else {
                    d.t(this.getIconOrContainer(), this.i, 17);
                    d.z(this.t, 0);
                    this.v.setVisibility(4);
                }
                this.u.setVisibility(4);
                break;
            }
            case 1: {
                d.z(this.t, this.j);
                if(z) {
                    d.t(this.getIconOrContainer(), ((int)(((float)this.i) + this.l)), 49);
                    d.s(this.v, 1.0f, 1.0f, 0);
                    d.s(this.u, this.m, this.m, 4);
                }
                else {
                    d.t(this.getIconOrContainer(), this.i, 49);
                    d.s(this.v, this.n, this.n, 4);
                    d.s(this.u, 1.0f, 1.0f, 0);
                }
                break;
            }
            case 2: {
                d.t(this.getIconOrContainer(), this.i, 17);
                this.v.setVisibility(8);
                this.u.setVisibility(8);
            }
        }
        this.refreshDrawableState();
        this.setSelected(z);
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.u.setEnabled(z);
        this.v.setEnabled(z);
        this.s.setEnabled(z);
        if(z) {
            Y.D0(this, K.b(this.getContext(), 1002));
            return;
        }
        Y.D0(this, null);
    }

    public void setIcon(Drawable drawable0) {
        if(drawable0 == this.A) {
            return;
        }
        this.A = drawable0;
        if(drawable0 != null) {
            Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
            if(drawable$ConstantState0 != null) {
                drawable0 = drawable$ConstantState0.newDrawable();
            }
            drawable0 = drawable0.mutate();
            this.B = drawable0;
            ColorStateList colorStateList0 = this.z;
            if(colorStateList0 != null) {
                androidx.core.graphics.drawable.a.o(drawable0, colorStateList0);
            }
        }
        this.s.setImageDrawable(drawable0);
    }

    public void setIconSize(int v) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.s.getLayoutParams();
        frameLayout$LayoutParams0.width = v;
        frameLayout$LayoutParams0.height = v;
        this.s.setLayoutParams(frameLayout$LayoutParams0);
    }

    public void setIconTintList(ColorStateList colorStateList0) {
        this.z = colorStateList0;
        if(this.y != null) {
            Drawable drawable0 = this.B;
            if(drawable0 != null) {
                androidx.core.graphics.drawable.a.o(drawable0, colorStateList0);
                this.B.invalidateSelf();
            }
        }
    }

    public void setItemBackground(int v) {
        this.setItemBackground((v == 0 ? null : androidx.core.content.a.getDrawable(this.getContext(), v)));
    }

    public void setItemBackground(Drawable drawable0) {
        if(drawable0 != null && drawable0.getConstantState() != null) {
            drawable0 = drawable0.getConstantState().newDrawable().mutate();
        }
        this.h = drawable0;
        this.o();
    }

    public void setItemPaddingBottom(int v) {
        if(this.j != v) {
            this.j = v;
            this.n();
        }
    }

    public void setItemPaddingTop(int v) {
        if(this.i != v) {
            this.i = v;
            this.n();
        }
    }

    public void setItemPosition(int v) {
        this.w = v;
    }

    public void setItemRippleColor(ColorStateList colorStateList0) {
        this.g = colorStateList0;
        this.o();
    }

    public void setLabelVisibilityMode(int v) {
        if(this.o != v) {
            this.o = v;
            this.y();
            this.x(this.getWidth());
            this.n();
        }
    }

    public void setShifting(boolean z) {
        if(this.p != z) {
            this.p = z;
            this.n();
        }
    }

    public void setTextAppearanceActive(int v) {
        this.x = v;
        d.r(this.v, v);
        this.g(this.u.getTextSize(), this.v.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        this.setTextAppearanceActive(this.x);
        Typeface typeface0 = this.v.getTypeface();
        this.v.setTypeface(typeface0, ((int)z));
    }

    public void setTextAppearanceInactive(int v) {
        d.r(this.u, v);
        this.g(this.u.getTextSize(), this.v.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList0) {
        if(colorStateList0 != null) {
            this.u.setTextColor(colorStateList0);
            this.v.setTextColor(colorStateList0);
        }
    }

    public void setTitle(CharSequence charSequence0) {
        this.u.setText(charSequence0);
        this.v.setText(charSequence0);
        if(this.y == null || TextUtils.isEmpty(this.y.getContentDescription())) {
            this.setContentDescription(charSequence0);
        }
        if(this.y != null && !TextUtils.isEmpty(this.y.getTooltipText())) {
            charSequence0 = this.y.getTooltipText();
        }
        if(Build.VERSION.SDK_INT > 23) {
            h0.a(this, charSequence0);
        }
    }

    private static void t(View view0, int v, int v1) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        frameLayout$LayoutParams0.topMargin = v;
        frameLayout$LayoutParams0.bottomMargin = v;
        frameLayout$LayoutParams0.gravity = v1;
        view0.setLayoutParams(frameLayout$LayoutParams0);
    }

    private void u(View view0) {
        if(!this.k()) {
            return;
        }
        if(view0 != null) {
            this.setClipChildren(false);
            this.setClipToPadding(false);
            com.google.android.material.badge.b.a(this.K, view0, this.j(view0));
        }
    }

    private void v(View view0) {
        if(!this.k()) {
            return;
        }
        if(view0 != null) {
            this.setClipChildren(true);
            this.setClipToPadding(true);
            com.google.android.material.badge.b.d(this.K, view0);
        }
        this.K = null;
    }

    private void w(View view0) {
        if(!this.k()) {
            return;
        }
        com.google.android.material.badge.b.e(this.K, view0, this.j(view0));
    }

    private void x(int v) {
        if(this.r != null && v > 0) {
            int v1 = Math.min(this.G, v - this.J * 2);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.r.getLayoutParams();
            frameLayout$LayoutParams0.height = this.l() ? v1 : this.H;
            frameLayout$LayoutParams0.width = v1;
            this.r.setLayoutParams(frameLayout$LayoutParams0);
        }
    }

    private void y() {
        if(this.l()) {
            this.D = d.N;
            return;
        }
        this.D = d.M;
    }

    private static void z(View view0, int v) {
        view0.setPadding(view0.getPaddingLeft(), view0.getPaddingTop(), view0.getPaddingRight(), v);
    }
}

