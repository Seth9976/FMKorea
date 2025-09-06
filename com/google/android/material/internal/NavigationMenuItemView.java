package com.google.android.material.internal;

import C.z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k.a;
import androidx.appcompat.widget.h0;
import androidx.core.content.res.h;
import androidx.core.view.Y;
import androidx.core.widget.i;
import z1.c;
import z1.d;

public class NavigationMenuItemView extends e implements a {
    class com.google.android.material.internal.NavigationMenuItemView.a extends androidx.core.view.a {
        final NavigationMenuItemView d;

        @Override  // androidx.core.view.a
        public void g(View view0, z z0) {
            super.g(view0, z0);
            z0.k0(NavigationMenuItemView.this.C);
        }
    }

    private int A;
    private boolean B;
    boolean C;
    boolean D;
    private final CheckedTextView E;
    private FrameLayout F;
    private g G;
    private ColorStateList H;
    private boolean I;
    private Drawable J;
    private final androidx.core.view.a K;
    private static final int[] L;

    static {
        NavigationMenuItemView.L = new int[]{0x10100A0};
    }

    public NavigationMenuItemView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public NavigationMenuItemView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.D = true;
        com.google.android.material.internal.NavigationMenuItemView.a navigationMenuItemView$a0 = new com.google.android.material.internal.NavigationMenuItemView.a(this);
        this.K = navigationMenuItemView$a0;
        this.setOrientation(0);
        LayoutInflater.from(context0).inflate(z1.g.g, this, true);
        this.setIconSize(context0.getResources().getDimensionPixelSize(c.i));
        CheckedTextView checkedTextView0 = (CheckedTextView)this.findViewById(z1.e.f);
        this.E = checkedTextView0;
        checkedTextView0.setDuplicateParentStateEnabled(true);
        Y.o0(checkedTextView0, navigationMenuItemView$a0);
    }

    private void B() {
        if(this.F()) {
            this.E.setVisibility(8);
            FrameLayout frameLayout0 = this.F;
            if(frameLayout0 != null) {
                androidx.appcompat.widget.LinearLayoutCompat.a linearLayoutCompat$a0 = (androidx.appcompat.widget.LinearLayoutCompat.a)frameLayout0.getLayoutParams();
                linearLayoutCompat$a0.width = -1;
                this.F.setLayoutParams(linearLayoutCompat$a0);
            }
        }
        else {
            this.E.setVisibility(0);
            FrameLayout frameLayout1 = this.F;
            if(frameLayout1 != null) {
                androidx.appcompat.widget.LinearLayoutCompat.a linearLayoutCompat$a1 = (androidx.appcompat.widget.LinearLayoutCompat.a)frameLayout1.getLayoutParams();
                linearLayoutCompat$a1.width = -2;
                this.F.setLayoutParams(linearLayoutCompat$a1);
            }
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue0 = new TypedValue();
        if(this.getContext().getTheme().resolveAttribute(e.a.t, typedValue0, true)) {
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            ColorDrawable colorDrawable0 = new ColorDrawable(typedValue0.data);
            stateListDrawable0.addState(NavigationMenuItemView.L, colorDrawable0);
            stateListDrawable0.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable0;
        }
        return null;
    }

    public void D(g g0, boolean z) {
        this.D = z;
        this.e(g0, 0);
    }

    public void E() {
        FrameLayout frameLayout0 = this.F;
        if(frameLayout0 != null) {
            frameLayout0.removeAllViews();
        }
        this.E.setCompoundDrawables(null, null, null, null);
    }

    private boolean F() {
        return this.G.getTitle() == null && this.G.getIcon() == null && this.G.getActionView() != null;
    }

    @Override  // androidx.appcompat.view.menu.k$a
    public boolean d() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.k$a
    public void e(g g0, int v) {
        this.G = g0;
        if(g0.getItemId() > 0) {
            this.setId(g0.getItemId());
        }
        this.setVisibility((g0.isVisible() ? 0 : 8));
        if(this.getBackground() == null) {
            Y.s0(this, this.C());
        }
        this.setCheckable(g0.isCheckable());
        this.setChecked(g0.isChecked());
        this.setEnabled(g0.isEnabled());
        this.setTitle(g0.getTitle());
        this.setIcon(g0.getIcon());
        this.setActionView(g0.getActionView());
        this.setContentDescription(g0.getContentDescription());
        h0.a(this, g0.getTooltipText());
        this.B();
    }

    @Override  // androidx.appcompat.view.menu.k$a
    public g getItemData() {
        return this.G;
    }

    @Override  // android.view.ViewGroup
    protected int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.G != null && this.G.isCheckable() && this.G.isChecked()) {
            View.mergeDrawableStates(arr_v, NavigationMenuItemView.L);
        }
        return arr_v;
    }

    private void setActionView(View view0) {
        if(view0 != null) {
            if(this.F == null) {
                this.F = (FrameLayout)((ViewStub)this.findViewById(z1.e.e)).inflate();
            }
            if(view0.getParent() != null) {
                ((ViewGroup)view0.getParent()).removeView(view0);
            }
            this.F.removeAllViews();
            this.F.addView(view0);
        }
    }

    public void setCheckable(boolean z) {
        this.refreshDrawableState();
        if(this.C != z) {
            this.C = z;
            this.K.l(this.E, 0x800);
        }
    }

    public void setChecked(boolean z) {
        this.refreshDrawableState();
        this.E.setChecked(z);
        Typeface typeface0 = this.E.getTypeface();
        this.E.setTypeface(typeface0, (!z || !this.D ? 0 : 1));
    }

    public void setHorizontalPadding(int v) {
        this.setPadding(v, this.getPaddingTop(), v, this.getPaddingBottom());
    }

    public void setIcon(Drawable drawable0) {
        if(drawable0 != null) {
            if(this.I) {
                Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
                if(drawable$ConstantState0 != null) {
                    drawable0 = drawable$ConstantState0.newDrawable();
                }
                drawable0 = drawable0.mutate();
                androidx.core.graphics.drawable.a.o(drawable0, this.H);
            }
            drawable0.setBounds(0, 0, this.A, this.A);
        }
        else if(this.B) {
            if(this.J == null) {
                Resources resources0 = this.getResources();
                Resources.Theme resources$Theme0 = this.getContext().getTheme();
                Drawable drawable1 = h.f(resources0, d.l, resources$Theme0);
                this.J = drawable1;
                if(drawable1 != null) {
                    drawable1.setBounds(0, 0, this.A, this.A);
                }
            }
            drawable0 = this.J;
        }
        i.i(this.E, drawable0, null, null, null);
    }

    public void setIconPadding(int v) {
        this.E.setCompoundDrawablePadding(v);
    }

    public void setIconSize(int v) {
        this.A = v;
    }

    void setIconTintList(ColorStateList colorStateList0) {
        this.H = colorStateList0;
        this.I = colorStateList0 != null;
        g g0 = this.G;
        if(g0 != null) {
            this.setIcon(g0.getIcon());
        }
    }

    public void setMaxLines(int v) {
        this.E.setMaxLines(v);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.B = z;
    }

    public void setTextAppearance(int v) {
        i.o(this.E, v);
    }

    public void setTextColor(ColorStateList colorStateList0) {
        this.E.setTextColor(colorStateList0);
    }

    public void setTitle(CharSequence charSequence0) {
        this.E.setText(charSequence0);
    }
}

