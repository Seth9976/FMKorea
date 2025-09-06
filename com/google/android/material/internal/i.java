package com.google.android.material.internal;

import C.z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.core.view.Y;
import androidx.core.view.y0;
import androidx.recyclerview.widget.RecyclerView.B;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class i implements j {
    class a implements View.OnClickListener {
        final i f;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            boolean z = true;
            i.this.Y(true);
            g g0 = ((NavigationMenuItemView)view0).getItemData();
            if(g0 == null || !g0.isCheckable() || !i.this.i.P(g0, i.this, 0)) {
                z = false;
            }
            else {
                i.this.k.J(g0);
            }
            i.this.Y(false);
            if(z) {
                i.this.c(false);
            }
        }
    }

    static class b extends l {
        public b(View view0) {
            super(view0);
        }
    }

    class c extends androidx.recyclerview.widget.RecyclerView.g {
        private final ArrayList c;
        private g d;
        private boolean e;
        final i f;

        c() {
            this.c = new ArrayList();
            this.G();
        }

        public Bundle A() {
            Bundle bundle0 = new Bundle();
            g g0 = this.d;
            if(g0 != null) {
                bundle0.putInt("android:menu:checked", g0.getItemId());
            }
            SparseArray sparseArray0 = new SparseArray();
            int v = this.c.size();
            for(int v1 = 0; v1 < v; ++v1) {
                e i$e0 = (e)this.c.get(v1);
                if(i$e0 instanceof com.google.android.material.internal.i.g) {
                    g g1 = ((com.google.android.material.internal.i.g)i$e0).a();
                    View view0 = g1 == null ? null : g1.getActionView();
                    if(view0 != null) {
                        ParcelableSparseArray parcelableSparseArray0 = new ParcelableSparseArray();
                        view0.saveHierarchyState(parcelableSparseArray0);
                        sparseArray0.put(g1.getItemId(), parcelableSparseArray0);
                    }
                }
            }
            bundle0.putSparseParcelableArray("android:menu:action_views", sparseArray0);
            return bundle0;
        }

        public g B() {
            return this.d;
        }

        int C() {
            int v1 = 0;
            for(int v = 0; v < i.this.k.e(); ++v) {
                switch(i.this.k.g(v)) {
                    case 0: 
                    case 1: {
                        ++v1;
                    }
                }
            }
            return v1;
        }

        public void D(l i$l0, int v) {
            switch(this.g(v)) {
                case 0: {
                    NavigationMenuItemView navigationMenuItemView0 = (NavigationMenuItemView)i$l0.a;
                    navigationMenuItemView0.setIconTintList(i.this.r);
                    navigationMenuItemView0.setTextAppearance(i.this.o);
                    ColorStateList colorStateList0 = i.this.q;
                    if(colorStateList0 != null) {
                        navigationMenuItemView0.setTextColor(colorStateList0);
                    }
                    Drawable drawable0 = i.this.s;
                    Y.s0(navigationMenuItemView0, (drawable0 == null ? null : drawable0.getConstantState().newDrawable()));
                    RippleDrawable rippleDrawable0 = i.this.t;
                    if(rippleDrawable0 != null) {
                        navigationMenuItemView0.setForeground(rippleDrawable0.getConstantState().newDrawable());
                    }
                    com.google.android.material.internal.i.g i$g0 = (com.google.android.material.internal.i.g)this.c.get(v);
                    navigationMenuItemView0.setNeedsEmptyIcon(i$g0.b);
                    int v1 = i.this.u;
                    int v2 = i.this.v;
                    navigationMenuItemView0.setPadding(v1, v2, v1, v2);
                    navigationMenuItemView0.setIconPadding(i.this.w);
                    i i0 = i.this;
                    if(i0.C) {
                        navigationMenuItemView0.setIconSize(i0.x);
                    }
                    navigationMenuItemView0.setMaxLines(i.this.E);
                    navigationMenuItemView0.D(i$g0.a(), i.this.p);
                    this.I(navigationMenuItemView0, v, false);
                    return;
                }
                case 1: {
                    TextView textView0 = (TextView)i$l0.a;
                    textView0.setText(((com.google.android.material.internal.i.g)this.c.get(v)).a().getTitle());
                    androidx.core.widget.i.o(textView0, i.this.m);
                    textView0.setPadding(i.this.A, textView0.getPaddingTop(), i.this.B, textView0.getPaddingBottom());
                    ColorStateList colorStateList1 = i.this.n;
                    if(colorStateList1 != null) {
                        textView0.setTextColor(colorStateList1);
                    }
                    this.I(textView0, v, true);
                    return;
                }
                case 2: {
                    f i$f0 = (f)this.c.get(v);
                    i$l0.a.setPadding(i.this.y, i$f0.b(), i.this.z, i$f0.a());
                }
            }
        }

        public l E(ViewGroup viewGroup0, int v) {
            switch(v) {
                case 0: {
                    return new com.google.android.material.internal.i.i(i.this.l, viewGroup0, i.this.I);
                }
                case 1: {
                    return new k(i.this.l, viewGroup0);
                }
                case 2: {
                    return new com.google.android.material.internal.i.j(i.this.l, viewGroup0);
                }
                case 3: {
                    return new b(i.this.g);
                }
                default: {
                    return null;
                }
            }
        }

        public void F(l i$l0) {
            if(i$l0 instanceof com.google.android.material.internal.i.i) {
                ((NavigationMenuItemView)i$l0.a).E();
            }
        }

        private void G() {
            if(this.e) {
                return;
            }
            this.e = true;
            this.c.clear();
            d i$d0 = new d();
            this.c.add(i$d0);
            int v = i.this.i.G().size();
            int v1 = -1;
            boolean z = false;
            int v3 = 0;
            for(int v2 = 0; v2 < v; ++v2) {
                g g0 = (g)i.this.i.G().get(v2);
                if(g0.isChecked()) {
                    this.J(g0);
                }
                if(g0.isCheckable()) {
                    g0.t(false);
                }
                if(g0.hasSubMenu()) {
                    SubMenu subMenu0 = g0.getSubMenu();
                    if(subMenu0.hasVisibleItems()) {
                        if(v2 != 0) {
                            f i$f0 = new f(i.this.G, 0);
                            this.c.add(i$f0);
                        }
                        com.google.android.material.internal.i.g i$g0 = new com.google.android.material.internal.i.g(g0);
                        this.c.add(i$g0);
                        int v4 = this.c.size();
                        int v5 = subMenu0.size();
                        boolean z1 = false;
                        for(int v6 = 0; v6 < v5; ++v6) {
                            g g1 = (g)subMenu0.getItem(v6);
                            if(g1.isVisible()) {
                                if(!z1 && g1.getIcon() != null) {
                                    z1 = true;
                                }
                                if(g1.isCheckable()) {
                                    g1.t(false);
                                }
                                if(g0.isChecked()) {
                                    this.J(g0);
                                }
                                com.google.android.material.internal.i.g i$g1 = new com.google.android.material.internal.i.g(g1);
                                this.c.add(i$g1);
                            }
                        }
                        if(z1) {
                            this.z(v4, this.c.size());
                        }
                    }
                }
                else {
                    int v7 = g0.getGroupId();
                    if(v7 != v1) {
                        v3 = this.c.size();
                        z = g0.getIcon() != null;
                        if(v2 != 0) {
                            ++v3;
                            int v8 = i.this.G;
                            f i$f1 = new f(v8, v8);
                            this.c.add(i$f1);
                        }
                    }
                    else if(!z && g0.getIcon() != null) {
                        this.z(v3, this.c.size());
                        z = true;
                    }
                    com.google.android.material.internal.i.g i$g2 = new com.google.android.material.internal.i.g(g0);
                    i$g2.b = z;
                    this.c.add(i$g2);
                    v1 = v7;
                }
            }
            this.e = false;
        }

        public void H(Bundle bundle0) {
            int v1 = bundle0.getInt("android:menu:checked", 0);
            if(v1 != 0) {
                this.e = true;
                int v2 = this.c.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    e i$e0 = (e)this.c.get(v3);
                    if(i$e0 instanceof com.google.android.material.internal.i.g) {
                        g g0 = ((com.google.android.material.internal.i.g)i$e0).a();
                        if(g0 != null && g0.getItemId() == v1) {
                            this.J(g0);
                            break;
                        }
                    }
                }
                this.e = false;
                this.G();
            }
            SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:action_views");
            if(sparseArray0 != null) {
                int v4 = this.c.size();
                for(int v = 0; v < v4; ++v) {
                    e i$e1 = (e)this.c.get(v);
                    if(i$e1 instanceof com.google.android.material.internal.i.g) {
                        g g1 = ((com.google.android.material.internal.i.g)i$e1).a();
                        if(g1 != null) {
                            View view0 = g1.getActionView();
                            if(view0 != null) {
                                ParcelableSparseArray parcelableSparseArray0 = (ParcelableSparseArray)sparseArray0.get(g1.getItemId());
                                if(parcelableSparseArray0 != null) {
                                    view0.restoreHierarchyState(parcelableSparseArray0);
                                }
                            }
                        }
                    }
                }
            }
        }

        private void I(View view0, int v, boolean z) {
            class com.google.android.material.internal.i.c.a extends androidx.core.view.a {
                final int d;
                final boolean e;
                final c f;

                com.google.android.material.internal.i.c.a(int v, boolean z) {
                    this.d = v;
                    this.e = z;
                    super();
                }

                @Override  // androidx.core.view.a
                public void g(View view0, z z0) {
                    super.g(view0, z0);
                    int v = c.x(c.this, this.d);
                    boolean z1 = view0.isSelected();
                    z0.p0(C.z.f.a(v, 1, 1, 1, this.e, z1));
                }
            }

            Y.o0(view0, new com.google.android.material.internal.i.c.a(this, v, z));
        }

        public void J(g g0) {
            if(this.d != g0 && g0.isCheckable()) {
                g g1 = this.d;
                if(g1 != null) {
                    g1.setChecked(false);
                }
                this.d = g0;
                g0.setChecked(true);
            }
        }

        public void K(boolean z) {
            this.e = z;
        }

        public void L() {
            this.G();
            this.j();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$g
        public int e() {
            return this.c.size();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$g
        public long f(int v) {
            return (long)v;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$g
        public int g(int v) {
            e i$e0 = (e)this.c.get(v);
            if(i$e0 instanceof f) {
                return 2;
            }
            if(i$e0 instanceof d) {
                return 3;
            }
            if(!(i$e0 instanceof com.google.android.material.internal.i.g)) {
                throw new RuntimeException("Unknown item type.");
            }
            return ((com.google.android.material.internal.i.g)i$e0).a().hasSubMenu() ? 1 : 0;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$g
        public void m(B recyclerView$B0, int v) {
            this.D(((l)recyclerView$B0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$g
        public B o(ViewGroup viewGroup0, int v) {
            return this.E(viewGroup0, v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$g
        public void t(B recyclerView$B0) {
            this.F(((l)recyclerView$B0));
        }

        static int x(c i$c0, int v) {
            return i$c0.y(v);
        }

        private int y(int v) {
            int v2 = v;
            for(int v1 = 0; v1 < v; ++v1) {
                switch(i.this.k.g(v1)) {
                    case 2: 
                    case 3: {
                        --v2;
                    }
                }
            }
            return v2;
        }

        private void z(int v, int v1) {
            while(v < v1) {
                ((com.google.android.material.internal.i.g)this.c.get(v)).b = true;
                ++v;
            }
        }
    }

    static class d implements e {
    }

    interface e {
    }

    static class f implements e {
        private final int a;
        private final int b;

        public f(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    static class com.google.android.material.internal.i.g implements e {
        private final g a;
        boolean b;

        com.google.android.material.internal.i.g(g g0) {
            this.a = g0;
        }

        public g a() {
            return this.a;
        }
    }

    class h extends androidx.recyclerview.widget.l {
        final i f;

        h(RecyclerView recyclerView0) {
            super(recyclerView0);
        }

        @Override  // androidx.recyclerview.widget.l
        public void g(View view0, z z0) {
            super.g(view0, z0);
            z0.o0(C.z.e.a(i.this.k.C(), 1, false));
        }
    }

    static class com.google.android.material.internal.i.i extends l {
        public com.google.android.material.internal.i.i(LayoutInflater layoutInflater0, ViewGroup viewGroup0, View.OnClickListener view$OnClickListener0) {
            super(layoutInflater0.inflate(z1.g.b, viewGroup0, false));
            this.a.setOnClickListener(view$OnClickListener0);
        }
    }

    static class com.google.android.material.internal.i.j extends l {
        public com.google.android.material.internal.i.j(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
            super(layoutInflater0.inflate(z1.g.d, viewGroup0, false));
        }
    }

    static class k extends l {
        public k(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
            super(layoutInflater0.inflate(z1.g.e, viewGroup0, false));
        }
    }

    static abstract class l extends B {
        public l(View view0) {
            super(view0);
        }
    }

    int A;
    int B;
    boolean C;
    boolean D;
    private int E;
    private int F;
    int G;
    private int H;
    final View.OnClickListener I;
    private NavigationMenuView f;
    LinearLayout g;
    private androidx.appcompat.view.menu.j.a h;
    androidx.appcompat.view.menu.e i;
    private int j;
    c k;
    LayoutInflater l;
    int m;
    ColorStateList n;
    int o;
    boolean p;
    ColorStateList q;
    ColorStateList r;
    Drawable s;
    RippleDrawable t;
    int u;
    int v;
    int w;
    int x;
    int y;
    int z;

    public i() {
        this.m = 0;
        this.o = 0;
        this.p = true;
        this.D = true;
        this.H = -1;
        this.I = new a(this);
    }

    public int A() {
        return this.A;
    }

    private boolean B() {
        return this.q() > 0;
    }

    public View C(int v) {
        View view0 = this.l.inflate(v, this.g, false);
        this.j(view0);
        return view0;
    }

    public void D(boolean z) {
        if(this.D != z) {
            this.D = z;
            this.Z();
        }
    }

    public void E(g g0) {
        this.k.J(g0);
    }

    public void F(int v) {
        this.z = v;
        this.c(false);
    }

    public void G(int v) {
        this.y = v;
        this.c(false);
    }

    public void H(int v) {
        this.j = v;
    }

    public void I(Drawable drawable0) {
        this.s = drawable0;
        this.c(false);
    }

    public void J(RippleDrawable rippleDrawable0) {
        this.t = rippleDrawable0;
        this.c(false);
    }

    public void K(int v) {
        this.u = v;
        this.c(false);
    }

    public void L(int v) {
        this.w = v;
        this.c(false);
    }

    public void M(int v) {
        if(this.x != v) {
            this.x = v;
            this.C = true;
            this.c(false);
        }
    }

    public void N(ColorStateList colorStateList0) {
        this.r = colorStateList0;
        this.c(false);
    }

    public void O(int v) {
        this.E = v;
        this.c(false);
    }

    public void P(int v) {
        this.o = v;
        this.c(false);
    }

    public void Q(boolean z) {
        this.p = z;
        this.c(false);
    }

    public void R(ColorStateList colorStateList0) {
        this.q = colorStateList0;
        this.c(false);
    }

    public void S(int v) {
        this.v = v;
        this.c(false);
    }

    public void T(int v) {
        this.H = v;
        NavigationMenuView navigationMenuView0 = this.f;
        if(navigationMenuView0 != null) {
            navigationMenuView0.setOverScrollMode(v);
        }
    }

    public void U(ColorStateList colorStateList0) {
        this.n = colorStateList0;
        this.c(false);
    }

    public void V(int v) {
        this.B = v;
        this.c(false);
    }

    public void W(int v) {
        this.A = v;
        this.c(false);
    }

    public void X(int v) {
        this.m = v;
        this.c(false);
    }

    public void Y(boolean z) {
        c i$c0 = this.k;
        if(i$c0 != null) {
            i$c0.K(z);
        }
    }

    private void Z() {
        int v = this.B() || !this.D ? 0 : this.F;
        this.f.setPadding(0, v, 0, this.f.getPaddingBottom());
    }

    @Override  // androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e e0, boolean z) {
        androidx.appcompat.view.menu.j.a j$a0 = this.h;
        if(j$a0 != null) {
            j$a0.b(e0, z);
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public void c(boolean z) {
        c i$c0 = this.k;
        if(i$c0 != null) {
            i$c0.L();
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean d() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean e(androidx.appcompat.view.menu.e e0, g g0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean f(androidx.appcompat.view.menu.e e0, g g0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.j
    public int getId() {
        return this.j;
    }

    @Override  // androidx.appcompat.view.menu.j
    public void h(Context context0, androidx.appcompat.view.menu.e e0) {
        this.l = LayoutInflater.from(context0);
        this.i = e0;
        this.G = context0.getResources().getDimensionPixelOffset(z1.c.j);
    }

    @Override  // androidx.appcompat.view.menu.j
    public void i(Parcelable parcelable0) {
        if(parcelable0 instanceof Bundle) {
            SparseArray sparseArray0 = ((Bundle)parcelable0).getSparseParcelableArray("android:menu:list");
            if(sparseArray0 != null) {
                this.f.restoreHierarchyState(sparseArray0);
            }
            Bundle bundle0 = ((Bundle)parcelable0).getBundle("android:menu:adapter");
            if(bundle0 != null) {
                this.k.H(bundle0);
            }
            SparseArray sparseArray1 = ((Bundle)parcelable0).getSparseParcelableArray("android:menu:header");
            if(sparseArray1 != null) {
                this.g.restoreHierarchyState(sparseArray1);
            }
        }
    }

    public void j(View view0) {
        this.g.addView(view0);
        this.f.setPadding(0, 0, 0, this.f.getPaddingBottom());
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean k(m m0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.j
    public Parcelable l() {
        Parcelable parcelable0 = new Bundle();
        if(this.f != null) {
            SparseArray sparseArray0 = new SparseArray();
            this.f.saveHierarchyState(sparseArray0);
            ((Bundle)parcelable0).putSparseParcelableArray("android:menu:list", sparseArray0);
        }
        c i$c0 = this.k;
        if(i$c0 != null) {
            ((Bundle)parcelable0).putBundle("android:menu:adapter", i$c0.A());
        }
        if(this.g != null) {
            SparseArray sparseArray1 = new SparseArray();
            this.g.saveHierarchyState(sparseArray1);
            ((Bundle)parcelable0).putSparseParcelableArray("android:menu:header", sparseArray1);
        }
        return parcelable0;
    }

    public void m(y0 y00) {
        int v = y00.l();
        if(this.F != v) {
            this.F = v;
            this.Z();
        }
        this.f.setPadding(0, this.f.getPaddingTop(), 0, y00.i());
        Y.g(this.g, y00);
    }

    public g n() {
        return this.k.B();
    }

    public int o() {
        return this.z;
    }

    public int p() {
        return this.y;
    }

    public int q() {
        return this.g.getChildCount();
    }

    public Drawable r() {
        return this.s;
    }

    public int s() {
        return this.u;
    }

    public int t() {
        return this.w;
    }

    public int u() {
        return this.E;
    }

    public ColorStateList v() {
        return this.q;
    }

    public ColorStateList w() {
        return this.r;
    }

    public int x() {
        return this.v;
    }

    public androidx.appcompat.view.menu.k y(ViewGroup viewGroup0) {
        if(this.f == null) {
            NavigationMenuView navigationMenuView0 = (NavigationMenuView)this.l.inflate(z1.g.f, viewGroup0, false);
            this.f = navigationMenuView0;
            navigationMenuView0.setAccessibilityDelegateCompat(new h(this, this.f));
            if(this.k == null) {
                c i$c0 = new c(this);
                this.k = i$c0;
                i$c0.v(true);
            }
            int v = this.H;
            if(v != -1) {
                this.f.setOverScrollMode(v);
            }
            LinearLayout linearLayout0 = (LinearLayout)this.l.inflate(z1.g.c, this.f, false);
            this.g = linearLayout0;
            Y.x0(linearLayout0, 2);
            this.f.setAdapter(this.k);
        }
        return this.f;
    }

    public int z() {
        return this.B;
    }
}

