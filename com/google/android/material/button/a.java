package com.google.android.material.button;

import P1.c;
import Q1.b;
import S1.g;
import S1.k;
import S1.n;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.Y;
import com.google.android.material.internal.t;

class a {
    private final MaterialButton a;
    private k b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private PorterDuff.Mode i;
    private ColorStateList j;
    private ColorStateList k;
    private ColorStateList l;
    private Drawable m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private LayerDrawable s;
    private int t;
    private static final boolean u;
    private static final boolean v;

    static {
        a.u = true;
        a.v = false;
    }

    a(MaterialButton materialButton0, k k0) {
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = true;
        this.a = materialButton0;
        this.b = k0;
    }

    void A(boolean z) {
        this.n = z;
        this.J();
    }

    void B(ColorStateList colorStateList0) {
        if(this.k != colorStateList0) {
            this.k = colorStateList0;
            this.J();
        }
    }

    void C(int v) {
        if(this.h != v) {
            this.h = v;
            this.J();
        }
    }

    void D(ColorStateList colorStateList0) {
        if(this.j != colorStateList0) {
            this.j = colorStateList0;
            if(this.f() != null) {
                androidx.core.graphics.drawable.a.o(this.f(), this.j);
            }
        }
    }

    void E(PorterDuff.Mode porterDuff$Mode0) {
        if(this.i != porterDuff$Mode0) {
            this.i = porterDuff$Mode0;
            if(this.f() != null && this.i != null) {
                androidx.core.graphics.drawable.a.p(this.f(), this.i);
            }
        }
    }

    void F(boolean z) {
        this.r = z;
    }

    private void G(int v, int v1) {
        int v2 = Y.E(this.a);
        int v3 = this.a.getPaddingTop();
        int v4 = Y.D(this.a);
        int v5 = this.a.getPaddingBottom();
        int v6 = this.e;
        int v7 = this.f;
        this.f = v1;
        this.e = v;
        if(!this.o) {
            this.H();
        }
        Y.C0(this.a, v2, v3 + v - v6, v4, v5 + v1 - v7);
    }

    private void H() {
        Drawable drawable0 = this.a();
        this.a.setInternalBackground(drawable0);
        g g0 = this.f();
        if(g0 != null) {
            g0.U(((float)this.t));
            g0.setState(this.a.getDrawableState());
        }
    }

    private void I(k k0) {
        if(a.v && !this.o) {
            int v = Y.E(this.a);
            int v1 = this.a.getPaddingTop();
            int v2 = Y.D(this.a);
            int v3 = this.a.getPaddingBottom();
            this.H();
            Y.C0(this.a, v, v1, v2, v3);
            return;
        }
        if(this.f() != null) {
            this.f().setShapeAppearanceModel(k0);
        }
        if(this.n() != null) {
            this.n().setShapeAppearanceModel(k0);
        }
        if(this.e() != null) {
            this.e().setShapeAppearanceModel(k0);
        }
    }

    private void J() {
        g g0 = this.f();
        g g1 = this.n();
        if(g0 != null) {
            g0.a0(((float)this.h), this.k);
            if(g1 != null) {
                g1.Z(((float)this.h), (this.n ? H1.a.d(this.a, z1.a.p) : 0));
            }
        }
    }

    private InsetDrawable K(Drawable drawable0) {
        return new InsetDrawable(drawable0, this.c, this.e, this.d, this.f);
    }

    private Drawable a() {
        g g0 = new g(this.b);
        g0.K(this.a.getContext());
        androidx.core.graphics.drawable.a.o(g0, this.j);
        PorterDuff.Mode porterDuff$Mode0 = this.i;
        if(porterDuff$Mode0 != null) {
            androidx.core.graphics.drawable.a.p(g0, porterDuff$Mode0);
        }
        g0.a0(((float)this.h), this.k);
        g g1 = new g(this.b);
        g1.setTint(0);
        g1.Z(((float)this.h), (this.n ? H1.a.d(this.a, z1.a.p) : 0));
        if(a.u) {
            g g2 = new g(this.b);
            this.m = g2;
            androidx.core.graphics.drawable.a.n(g2, -1);
            LayerDrawable layerDrawable0 = new RippleDrawable(b.d(this.l), this.K(new LayerDrawable(new Drawable[]{g1, g0})), this.m);
            this.s = layerDrawable0;
            return layerDrawable0;
        }
        Q1.a a0 = new Q1.a(this.b);
        this.m = a0;
        androidx.core.graphics.drawable.a.o(a0, b.d(this.l));
        LayerDrawable layerDrawable1 = new LayerDrawable(new Drawable[]{g1, g0, this.m});
        this.s = layerDrawable1;
        return this.K(layerDrawable1);
    }

    int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public n e() {
        if(this.s != null && this.s.getNumberOfLayers() > 1) {
            return this.s.getNumberOfLayers() <= 2 ? ((n)this.s.getDrawable(1)) : ((n)this.s.getDrawable(2));
        }
        return null;
    }

    g f() {
        return this.g(false);
    }

    private g g(boolean z) {
        if(this.s != null && this.s.getNumberOfLayers() > 0) {
            return a.u ? ((g)((LayerDrawable)((InsetDrawable)this.s.getDrawable(0)).getDrawable()).getDrawable(!z)) : ((g)this.s.getDrawable(!z));
        }
        return null;
    }

    ColorStateList h() {
        return this.l;
    }

    k i() {
        return this.b;
    }

    ColorStateList j() {
        return this.k;
    }

    int k() {
        return this.h;
    }

    ColorStateList l() {
        return this.j;
    }

    PorterDuff.Mode m() {
        return this.i;
    }

    private g n() {
        return this.g(true);
    }

    boolean o() {
        return this.o;
    }

    boolean p() {
        return this.q;
    }

    boolean q() {
        return this.r;
    }

    void r(TypedArray typedArray0) {
        this.c = typedArray0.getDimensionPixelOffset(z1.k.j3, 0);
        this.d = typedArray0.getDimensionPixelOffset(z1.k.k3, 0);
        this.e = typedArray0.getDimensionPixelOffset(z1.k.l3, 0);
        this.f = typedArray0.getDimensionPixelOffset(z1.k.m3, 0);
        if(typedArray0.hasValue(z1.k.q3)) {
            int v = typedArray0.getDimensionPixelSize(8, -1);
            this.g = v;
            this.z(this.b.w(((float)v)));
            this.p = true;
        }
        this.h = typedArray0.getDimensionPixelSize(z1.k.A3, 0);
        this.i = t.i(typedArray0.getInt(z1.k.p3, -1), PorterDuff.Mode.SRC_IN);
        this.j = c.a(this.a.getContext(), typedArray0, z1.k.o3);
        this.k = c.a(this.a.getContext(), typedArray0, z1.k.z3);
        this.l = c.a(this.a.getContext(), typedArray0, z1.k.y3);
        this.q = typedArray0.getBoolean(z1.k.n3, false);
        this.t = typedArray0.getDimensionPixelSize(z1.k.r3, 0);
        this.r = typedArray0.getBoolean(z1.k.B3, true);
        int v1 = Y.E(this.a);
        int v2 = this.a.getPaddingTop();
        int v3 = Y.D(this.a);
        int v4 = this.a.getPaddingBottom();
        if(typedArray0.hasValue(z1.k.i3)) {
            this.t();
        }
        else {
            this.H();
        }
        Y.C0(this.a, v1 + this.c, v2 + this.e, v3 + this.d, v4 + this.f);
    }

    void s(int v) {
        if(this.f() != null) {
            this.f().setTint(v);
        }
    }

    void t() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    void u(boolean z) {
        this.q = z;
    }

    void v(int v) {
        if(!this.p || this.g != v) {
            this.g = v;
            this.p = true;
            this.z(this.b.w(((float)v)));
        }
    }

    public void w(int v) {
        this.G(this.e, v);
    }

    public void x(int v) {
        this.G(v, this.f);
    }

    void y(ColorStateList colorStateList0) {
        if(this.l != colorStateList0) {
            this.l = colorStateList0;
            boolean z = a.u;
            if(z && this.a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable)this.a.getBackground()).setColor(b.d(colorStateList0));
                return;
            }
            if(!z && this.a.getBackground() instanceof Q1.a) {
                ((Q1.a)this.a.getBackground()).setTintList(b.d(colorStateList0));
            }
        }
    }

    void z(k k0) {
        this.b = k0;
        this.I(k0);
    }
}

