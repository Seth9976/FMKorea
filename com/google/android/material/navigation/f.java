package com.google.android.material.navigation;

import C.z;
import M1.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.core.view.Y;
import androidx.transition.t;
import androidx.transition.v;
import com.google.android.material.internal.o;
import java.util.HashSet;

public abstract class f extends ViewGroup implements k {
    private int A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private S1.k F;
    private boolean G;
    private ColorStateList H;
    private NavigationBarPresenter I;
    private e J;
    private static final int[] K;
    private static final int[] L;
    private final v f;
    private final View.OnClickListener g;
    private final B.e h;
    private final SparseArray i;
    private int j;
    private d[] k;
    private int l;
    private int m;
    private ColorStateList n;
    private int o;
    private ColorStateList p;
    private final ColorStateList q;
    private int r;
    private int s;
    private boolean t;
    private Drawable u;
    private ColorStateList v;
    private int w;
    private final SparseArray x;
    private int y;
    private int z;

    static {
        f.K = new int[]{0x10100A0};
        f.L = new int[]{0xFEFEFF62};
    }

    public f(Context context0) {
        class a implements View.OnClickListener {
            final f f;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                g g0 = ((d)view0).getItemData();
                if(!f.c(f.this).P(g0, f.a(f.this), 0)) {
                    g0.setChecked(true);
                }
            }
        }

        super(context0);
        this.h = new B.g(5);
        this.i = new SparseArray(5);
        this.l = 0;
        this.m = 0;
        this.x = new SparseArray(5);
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.G = false;
        this.q = this.e(0x1010038);
        if(this.isInEditMode()) {
            this.f = null;
        }
        else {
            androidx.transition.a a0 = new androidx.transition.a();
            this.f = a0;
            a0.r0(0);
            Context context1 = this.getContext();
            int v = this.getResources().getInteger(z1.f.b);
            a0.p0(((long)h.f(context1, z1.a.E, v)));
            a0.q0(h.g(this.getContext(), z1.a.L, A1.a.b));
            a0.j0(new o());
        }
        this.g = new a(this);
        Y.x0(this, 1);
    }

    static NavigationBarPresenter a(f f0) {
        return f0.I;
    }

    @Override  // androidx.appcompat.view.menu.k
    public void b(e e0) {
        this.J = e0;
    }

    static e c(f f0) {
        return f0.J;
    }

    public void d() {
        this.removeAllViews();
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                d d0 = arr_d[v];
                if(d0 != null) {
                    this.h.a(d0);
                    d0.h();
                }
            }
        }
        if(this.J.size() == 0) {
            this.l = 0;
            this.m = 0;
            this.k = null;
            return;
        }
        this.j();
        this.k = new d[this.J.size()];
        boolean z = this.h(this.j, this.J.G().size());
        for(int v1 = 0; v1 < this.J.size(); ++v1) {
            this.I.m(true);
            this.J.getItem(v1).setCheckable(true);
            this.I.m(false);
            d d1 = this.getNewItem();
            this.k[v1] = d1;
            d1.setIconTintList(this.n);
            d1.setIconSize(this.o);
            d1.setTextColor(this.q);
            d1.setTextAppearanceInactive(this.r);
            d1.setTextAppearanceActive(this.s);
            d1.setTextAppearanceActiveBoldEnabled(this.t);
            d1.setTextColor(this.p);
            int v2 = this.y;
            if(v2 != -1) {
                d1.setItemPaddingTop(v2);
            }
            int v3 = this.z;
            if(v3 != -1) {
                d1.setItemPaddingBottom(v3);
            }
            int v4 = this.A;
            if(v4 != -1) {
                d1.setActiveIndicatorLabelPadding(v4);
            }
            d1.setActiveIndicatorWidth(this.C);
            d1.setActiveIndicatorHeight(this.D);
            d1.setActiveIndicatorMarginHorizontal(this.E);
            d1.setActiveIndicatorDrawable(this.f());
            d1.setActiveIndicatorResizeable(this.G);
            d1.setActiveIndicatorEnabled(this.B);
            Drawable drawable0 = this.u;
            if(drawable0 == null) {
                d1.setItemBackground(this.w);
            }
            else {
                d1.setItemBackground(drawable0);
            }
            d1.setItemRippleColor(this.v);
            d1.setShifting(z);
            d1.setLabelVisibilityMode(this.j);
            g g0 = (g)this.J.getItem(v1);
            d1.e(g0, 0);
            d1.setItemPosition(v1);
            int v5 = g0.getItemId();
            d1.setOnTouchListener(((View.OnTouchListener)this.i.get(v5)));
            d1.setOnClickListener(this.g);
            if(this.l != 0 && v5 == this.l) {
                this.m = v1;
            }
            this.setBadgeIfNeeded(d1);
            this.addView(d1);
        }
        int v6 = Math.min(this.J.size() - 1, this.m);
        this.m = v6;
        this.J.getItem(v6).setChecked(true);
    }

    public ColorStateList e(int v) {
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
        return new ColorStateList(new int[][]{f.L, f.K, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList0.getColorForState(f.L, v2), v1, v2});
    }

    private Drawable f() {
        if(this.F != null && this.H != null) {
            Drawable drawable0 = new S1.g(this.F);
            ((S1.g)drawable0).V(this.H);
            return drawable0;
        }
        return null;
    }

    protected abstract d g(Context arg1);

    public int getActiveIndicatorLabelPadding() {
        return this.A;
    }

    SparseArray getBadgeDrawables() {
        return this.x;
    }

    public ColorStateList getIconTintList() {
        return this.n;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.H;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.B;
    }

    public int getItemActiveIndicatorHeight() {
        return this.D;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.E;
    }

    public S1.k getItemActiveIndicatorShapeAppearance() {
        return this.F;
    }

    public int getItemActiveIndicatorWidth() {
        return this.C;
    }

    public Drawable getItemBackground() {
        return this.k == null || this.k.length <= 0 ? this.u : this.k[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.w;
    }

    public int getItemIconSize() {
        return this.o;
    }

    public int getItemPaddingBottom() {
        return this.z;
    }

    public int getItemPaddingTop() {
        return this.y;
    }

    public ColorStateList getItemRippleColor() {
        return this.v;
    }

    public int getItemTextAppearanceActive() {
        return this.s;
    }

    public int getItemTextAppearanceInactive() {
        return this.r;
    }

    public ColorStateList getItemTextColor() {
        return this.p;
    }

    public int getLabelVisibilityMode() {
        return this.j;
    }

    protected e getMenu() {
        return this.J;
    }

    private d getNewItem() {
        d d0 = (d)this.h.b();
        return d0 == null ? this.g(this.getContext()) : d0;
    }

    public int getSelectedItemId() {
        return this.l;
    }

    protected int getSelectedItemPosition() {
        return this.m;
    }

    public int getWindowAnimations() {
        return 0;
    }

    protected boolean h(int v, int v1) {
        return v == -1 ? v1 > 3 : v == 0;
    }

    private boolean i(int v) {
        return v != -1;
    }

    private void j() {
        HashSet hashSet0 = new HashSet();
        for(int v1 = 0; v1 < this.J.size(); ++v1) {
            hashSet0.add(this.J.getItem(v1).getItemId());
        }
        for(int v = 0; v < this.x.size(); ++v) {
            int v2 = this.x.keyAt(v);
            if(!hashSet0.contains(v2)) {
                this.x.delete(v2);
            }
        }
    }

    void k(SparseArray sparseArray0) {
        for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
            int v2 = sparseArray0.keyAt(v1);
            if(this.x.indexOfKey(v2) < 0) {
                com.google.android.material.badge.a a0 = (com.google.android.material.badge.a)sparseArray0.get(v2);
                this.x.append(v2, a0);
            }
        }
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                d d0 = arr_d[v];
                int v3 = d0.getId();
                com.google.android.material.badge.a a1 = (com.google.android.material.badge.a)this.x.get(v3);
                if(a1 != null) {
                    d0.setBadge(a1);
                }
            }
        }
    }

    void l(int v) {
        int v1 = this.J.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItem menuItem0 = this.J.getItem(v2);
            if(v == menuItem0.getItemId()) {
                this.l = v;
                this.m = v2;
                menuItem0.setChecked(true);
                return;
            }
        }
    }

    public void m() {
        e e0 = this.J;
        if(e0 != null && this.k != null) {
            int v = e0.size();
            if(v != this.k.length) {
                this.d();
                return;
            }
            int v1 = this.l;
            for(int v2 = 0; v2 < v; ++v2) {
                MenuItem menuItem0 = this.J.getItem(v2);
                if(menuItem0.isChecked()) {
                    this.l = menuItem0.getItemId();
                    this.m = v2;
                }
            }
            if(v1 != this.l) {
                v v3 = this.f;
                if(v3 != null) {
                    t.a(this, v3);
                }
            }
            boolean z = this.h(this.j, this.J.G().size());
            for(int v4 = 0; v4 < v; ++v4) {
                this.I.m(true);
                this.k[v4].setLabelVisibilityMode(this.j);
                this.k[v4].setShifting(z);
                this.k[v4].e(((g)this.J.getItem(v4)), 0);
                this.I.m(false);
            }
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        z.P0(accessibilityNodeInfo0).o0(C.z.e.b(1, this.J.G().size(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(int v) {
        this.A = v;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setActiveIndicatorLabelPadding(v);
            }
        }
    }

    private void setBadgeIfNeeded(d d0) {
        int v = d0.getId();
        if(!this.i(v)) {
            return;
        }
        com.google.android.material.badge.a a0 = (com.google.android.material.badge.a)this.x.get(v);
        if(a0 != null) {
            d0.setBadge(a0);
        }
    }

    public void setIconTintList(ColorStateList colorStateList0) {
        this.n = colorStateList0;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setIconTintList(colorStateList0);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList0) {
        this.H = colorStateList0;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setActiveIndicatorDrawable(this.f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.B = z;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int v) {
        this.D = v;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setActiveIndicatorHeight(v);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int v) {
        this.E = v;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setActiveIndicatorMarginHorizontal(v);
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z) {
        this.G = z;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(S1.k k0) {
        this.F = k0;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setActiveIndicatorDrawable(this.f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int v) {
        this.C = v;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setActiveIndicatorWidth(v);
            }
        }
    }

    public void setItemBackground(Drawable drawable0) {
        this.u = drawable0;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setItemBackground(drawable0);
            }
        }
    }

    public void setItemBackgroundRes(int v) {
        this.w = v;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setItemBackground(v);
            }
        }
    }

    public void setItemIconSize(int v) {
        this.o = v;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setIconSize(v);
            }
        }
    }

    public void setItemPaddingBottom(int v) {
        this.z = v;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setItemPaddingBottom(v);
            }
        }
    }

    public void setItemPaddingTop(int v) {
        this.y = v;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                arr_d[v1].setItemPaddingTop(v);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList0) {
        this.v = colorStateList0;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setItemRippleColor(colorStateList0);
            }
        }
    }

    public void setItemTextAppearanceActive(int v) {
        this.s = v;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                d d0 = arr_d[v1];
                d0.setTextAppearanceActive(v);
                ColorStateList colorStateList0 = this.p;
                if(colorStateList0 != null) {
                    d0.setTextColor(colorStateList0);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.t = z;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setTextAppearanceActiveBoldEnabled(z);
            }
        }
    }

    public void setItemTextAppearanceInactive(int v) {
        this.r = v;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                d d0 = arr_d[v1];
                d0.setTextAppearanceInactive(v);
                ColorStateList colorStateList0 = this.p;
                if(colorStateList0 != null) {
                    d0.setTextColor(colorStateList0);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList0) {
        this.p = colorStateList0;
        d[] arr_d = this.k;
        if(arr_d != null) {
            for(int v = 0; v < arr_d.length; ++v) {
                arr_d[v].setTextColor(colorStateList0);
            }
        }
    }

    public void setLabelVisibilityMode(int v) {
        this.j = v;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter0) {
        this.I = navigationBarPresenter0;
    }
}

