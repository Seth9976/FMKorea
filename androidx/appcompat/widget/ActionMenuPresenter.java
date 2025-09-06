package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import j.e;
import java.util.ArrayList;

class ActionMenuPresenter extends a implements androidx.core.view.b.a {
    @SuppressLint({"BanParcelableUsage"})
    static class SavedState implements Parcelable {
        class androidx.appcompat.widget.ActionMenuPresenter.SavedState.a implements Parcelable.Creator {
            androidx.appcompat.widget.ActionMenuPresenter.SavedState.a() {
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
            SavedState.CREATOR = new androidx.appcompat.widget.ActionMenuPresenter.SavedState.a();
        }

        SavedState() {
        }

        SavedState(Parcel parcel0) {
            this.f = parcel0.readInt();
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.f);
        }
    }

    class androidx.appcompat.widget.ActionMenuPresenter.a extends i {
        final ActionMenuPresenter m;

        public androidx.appcompat.widget.ActionMenuPresenter.a(Context context0, m m0, View view0) {
            super(context0, m0, view0, false, e.a.i);
            if(!((g)m0.getItem()).l()) {
                View view1 = actionMenuPresenter0.p;
                if(view1 == null) {
                    view1 = (View)actionMenuPresenter0.n;
                }
                this.f(view1);
            }
            this.j(actionMenuPresenter0.H);
        }

        @Override  // androidx.appcompat.view.menu.i
        protected void e() {
            ActionMenuPresenter.this.E = null;
            ActionMenuPresenter.this.I = 0;
            super.e();
        }
    }

    class b extends androidx.appcompat.view.menu.ActionMenuItemView.b {
        final ActionMenuPresenter a;

        @Override  // androidx.appcompat.view.menu.ActionMenuItemView$b
        public e a() {
            androidx.appcompat.widget.ActionMenuPresenter.a actionMenuPresenter$a0 = ActionMenuPresenter.this.E;
            return actionMenuPresenter$a0 != null ? actionMenuPresenter$a0.c() : null;
        }
    }

    class c implements Runnable {
        private androidx.appcompat.widget.ActionMenuPresenter.e f;
        final ActionMenuPresenter g;

        public c(androidx.appcompat.widget.ActionMenuPresenter.e actionMenuPresenter$e0) {
            this.f = actionMenuPresenter$e0;
        }

        @Override
        public void run() {
            if(ActionMenuPresenter.this.h != null) {
                ActionMenuPresenter.this.h.d();
            }
            View view0 = (View)ActionMenuPresenter.this.n;
            if(view0 != null && view0.getWindowToken() != null && this.f.m()) {
                ActionMenuPresenter.this.D = this.f;
            }
            ActionMenuPresenter.this.F = null;
        }
    }

    class d extends AppCompatImageView implements androidx.appcompat.widget.ActionMenuView.a {
        final ActionMenuPresenter i;

        public d(Context context0) {
            class androidx.appcompat.widget.ActionMenuPresenter.d.a extends O {
                final ActionMenuPresenter o;
                final d p;

                androidx.appcompat.widget.ActionMenuPresenter.d.a(View view0, ActionMenuPresenter actionMenuPresenter0) {
                    this.o = actionMenuPresenter0;
                    super(view0);
                }

                @Override  // androidx.appcompat.widget.O
                public e b() {
                    androidx.appcompat.widget.ActionMenuPresenter.e actionMenuPresenter$e0 = ActionMenuPresenter.this.D;
                    return actionMenuPresenter$e0 == null ? null : actionMenuPresenter$e0.c();
                }

                @Override  // androidx.appcompat.widget.O
                public boolean c() {
                    ActionMenuPresenter.this.M();
                    return true;
                }

                @Override  // androidx.appcompat.widget.O
                public boolean d() {
                    ActionMenuPresenter actionMenuPresenter0 = ActionMenuPresenter.this;
                    if(actionMenuPresenter0.F != null) {
                        return false;
                    }
                    actionMenuPresenter0.D();
                    return true;
                }
            }

            super(context0, null, e.a.h);
            this.setClickable(true);
            this.setFocusable(true);
            this.setVisibility(0);
            this.setEnabled(true);
            h0.a(this, this.getContentDescription());
            this.setOnTouchListener(new androidx.appcompat.widget.ActionMenuPresenter.d.a(this, this, actionMenuPresenter0));
        }

        @Override  // androidx.appcompat.widget.ActionMenuView$a
        public boolean a() {
            return false;
        }

        @Override  // androidx.appcompat.widget.ActionMenuView$a
        public boolean b() {
            return false;
        }

        @Override  // android.view.View
        public boolean performClick() {
            if(super.performClick()) {
                return true;
            }
            this.playSoundEffect(0);
            ActionMenuPresenter.this.M();
            return true;
        }

        @Override  // android.widget.ImageView
        protected boolean setFrame(int v, int v1, int v2, int v3) {
            boolean z = super.setFrame(v, v1, v2, v3);
            Drawable drawable0 = this.getDrawable();
            Drawable drawable1 = this.getBackground();
            if(drawable0 != null && drawable1 != null) {
                int v4 = this.getWidth();
                int v5 = this.getHeight();
                int v6 = Math.max(v4, v5);
                int v7 = (v4 + (this.getPaddingLeft() - this.getPaddingRight())) / 2;
                int v8 = (v5 + (this.getPaddingTop() - this.getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(drawable1, v7 - v6 / 2, v8 - v6 / 2, v7 + v6 / 2, v8 + v6 / 2);
            }
            return z;
        }
    }

    class androidx.appcompat.widget.ActionMenuPresenter.e extends i {
        final ActionMenuPresenter m;

        public androidx.appcompat.widget.ActionMenuPresenter.e(Context context0, androidx.appcompat.view.menu.e e0, View view0, boolean z) {
            super(context0, e0, view0, z, e.a.i);
            this.h(0x800005);
            this.j(actionMenuPresenter0.H);
        }

        @Override  // androidx.appcompat.view.menu.i
        protected void e() {
            if(ActionMenuPresenter.this.h != null) {
                ActionMenuPresenter.this.h.close();
            }
            ActionMenuPresenter.this.D = null;
            super.e();
        }
    }

    class f implements androidx.appcompat.view.menu.j.a {
        final ActionMenuPresenter f;

        @Override  // androidx.appcompat.view.menu.j$a
        public void b(androidx.appcompat.view.menu.e e0, boolean z) {
            if(e0 instanceof m) {
                e0.F().e(false);
            }
            androidx.appcompat.view.menu.j.a j$a0 = ActionMenuPresenter.this.o();
            if(j$a0 != null) {
                j$a0.b(e0, z);
            }
        }

        @Override  // androidx.appcompat.view.menu.j$a
        public boolean c(androidx.appcompat.view.menu.e e0) {
            if(e0 == ActionMenuPresenter.this.h) {
                return false;
            }
            ActionMenuPresenter.this.I = ((m)e0).getItem().getItemId();
            androidx.appcompat.view.menu.j.a j$a0 = ActionMenuPresenter.this.o();
            return j$a0 == null ? false : j$a0.c(e0);
        }
    }

    private boolean A;
    private int B;
    private final SparseBooleanArray C;
    androidx.appcompat.widget.ActionMenuPresenter.e D;
    androidx.appcompat.widget.ActionMenuPresenter.a E;
    c F;
    private b G;
    final f H;
    int I;
    d p;
    private Drawable q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    public ActionMenuPresenter(Context context0) {
        super(context0, e.g.c, e.g.b);
        this.C = new SparseBooleanArray();
        this.H = new f(this);
    }

    public boolean A() {
        return this.D() | this.E();
    }

    private View B(MenuItem menuItem0) {
        ViewGroup viewGroup0 = (ViewGroup)this.n;
        if(viewGroup0 == null) {
            return null;
        }
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0 instanceof androidx.appcompat.view.menu.k.a && ((androidx.appcompat.view.menu.k.a)view0).getItemData() == menuItem0) {
                return view0;
            }
        }
        return null;
    }

    public Drawable C() {
        d actionMenuPresenter$d0 = this.p;
        if(actionMenuPresenter$d0 != null) {
            return actionMenuPresenter$d0.getDrawable();
        }
        return this.r ? this.q : null;
    }

    public boolean D() {
        c actionMenuPresenter$c0 = this.F;
        if(actionMenuPresenter$c0 != null) {
            k k0 = this.n;
            if(k0 != null) {
                ((View)k0).removeCallbacks(actionMenuPresenter$c0);
                this.F = null;
                return true;
            }
        }
        androidx.appcompat.widget.ActionMenuPresenter.e actionMenuPresenter$e0 = this.D;
        if(actionMenuPresenter$e0 != null) {
            actionMenuPresenter$e0.b();
            return true;
        }
        return false;
    }

    public boolean E() {
        androidx.appcompat.widget.ActionMenuPresenter.a actionMenuPresenter$a0 = this.E;
        if(actionMenuPresenter$a0 != null) {
            actionMenuPresenter$a0.b();
            return true;
        }
        return false;
    }

    public boolean F() {
        return this.F != null || this.G();
    }

    public boolean G() {
        return this.D != null && this.D.d();
    }

    public void H(Configuration configuration0) {
        if(!this.x) {
            this.w = androidx.appcompat.view.a.b(this.g).d();
        }
        androidx.appcompat.view.menu.e e0 = this.h;
        if(e0 != null) {
            e0.N(true);
        }
    }

    public void I(boolean z) {
        this.A = z;
    }

    public void J(ActionMenuView actionMenuView0) {
        this.n = actionMenuView0;
        actionMenuView0.b(this.h);
    }

    public void K(Drawable drawable0) {
        d actionMenuPresenter$d0 = this.p;
        if(actionMenuPresenter$d0 != null) {
            actionMenuPresenter$d0.setImageDrawable(drawable0);
            return;
        }
        this.r = true;
        this.q = drawable0;
    }

    public void L(boolean z) {
        this.s = z;
        this.t = true;
    }

    public boolean M() {
        if(this.s && !this.G() && (this.h != null && this.n != null && this.F == null && !this.h.B().isEmpty())) {
            c actionMenuPresenter$c0 = new c(this, new androidx.appcompat.widget.ActionMenuPresenter.e(this, this.g, this.h, this.p, true));
            this.F = actionMenuPresenter$c0;
            ((View)this.n).post(actionMenuPresenter$c0);
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.a
    public void b(androidx.appcompat.view.menu.e e0, boolean z) {
        this.A();
        super.b(e0, z);
    }

    @Override  // androidx.appcompat.view.menu.a
    public void c(boolean z) {
        super.c(z);
        ((View)this.n).requestLayout();
        androidx.appcompat.view.menu.e e0 = this.h;
        int v = 0;
        if(e0 != null) {
            ArrayList arrayList0 = e0.u();
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                androidx.core.view.b b0 = ((g)arrayList0.get(v2)).b();
                if(b0 != null) {
                    b0.h(this);
                }
            }
        }
        ArrayList arrayList1 = this.h == null ? null : this.h.B();
        if(this.s && arrayList1 != null) {
            int v3 = arrayList1.size();
            if(v3 == 1) {
                v = !((g)arrayList1.get(0)).isActionViewExpanded();
            }
            else if(v3 > 0) {
                v = 1;
            }
        }
        if(v == 0) {
            d actionMenuPresenter$d0 = this.p;
            if(actionMenuPresenter$d0 != null) {
                ViewParent viewParent0 = actionMenuPresenter$d0.getParent();
                k k0 = this.n;
                if(viewParent0 == k0) {
                    ((ViewGroup)k0).removeView(this.p);
                }
            }
        }
        else {
            if(this.p == null) {
                this.p = new d(this, this.f);
            }
            ViewGroup viewGroup0 = (ViewGroup)this.p.getParent();
            if(viewGroup0 != this.n) {
                if(viewGroup0 != null) {
                    viewGroup0.removeView(this.p);
                }
                ActionMenuView actionMenuView0 = (ActionMenuView)this.n;
                actionMenuView0.addView(this.p, actionMenuView0.F());
            }
        }
        ((ActionMenuView)this.n).setOverflowReserved(this.s);
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean d() {
        boolean z4;
        int v14;
        int v9;
        int v8;
        int v;
        ArrayList arrayList0;
        androidx.appcompat.view.menu.e e0 = this.h;
        if(e0 == null) {
            arrayList0 = null;
            v = 0;
        }
        else {
            arrayList0 = e0.G();
            v = arrayList0.size();
        }
        int v1 = this.w;
        int v2 = this.v;
        ViewGroup viewGroup0 = (ViewGroup)this.n;
        boolean z = false;
        int v4 = 0;
        int v5 = 0;
        for(int v3 = 0; v3 < v; ++v3) {
            g g0 = (g)arrayList0.get(v3);
            if(g0.o()) {
                ++v4;
            }
            else if(g0.n()) {
                ++v5;
            }
            else {
                z = true;
            }
            if(this.A && g0.isActionViewExpanded()) {
                v1 = 0;
            }
        }
        if(this.s && (z || v5 + v4 > v1)) {
            --v1;
        }
        int v6 = v1 - v4;
        SparseBooleanArray sparseBooleanArray0 = this.C;
        sparseBooleanArray0.clear();
        if(this.y) {
            int v7 = this.B;
            v8 = v2 / v7;
            v9 = v7 + v2 % v7 / v8;
        }
        else {
            v9 = 0;
            v8 = 0;
        }
        int v10 = 0;
        int v11 = 0;
        while(v10 < v) {
            g g1 = (g)arrayList0.get(v10);
            if(g1.o()) {
                View view0 = this.p(g1, null, viewGroup0);
                if(this.y) {
                    v8 -= ActionMenuView.L(view0, v9, v8, 0, 0);
                }
                else {
                    view0.measure(0, 0);
                }
                int v12 = view0.getMeasuredWidth();
                v2 -= v12;
                if(v11 == 0) {
                    v11 = v12;
                }
                int v13 = g1.getGroupId();
                if(v13 != 0) {
                    sparseBooleanArray0.put(v13, true);
                }
                g1.u(true);
                v14 = v;
            }
            else if(g1.n()) {
                int v15 = g1.getGroupId();
                boolean z1 = sparseBooleanArray0.get(v15);
                boolean z2 = (v6 > 0 || z1) && v2 > 0 && (!this.y || v8 > 0);
                boolean z3 = z2;
                v14 = v;
                if(z2) {
                    View view1 = this.p(g1, null, viewGroup0);
                    if(this.y) {
                        int v16 = ActionMenuView.L(view1, v9, v8, 0, 0);
                        v8 -= v16;
                        if(v16 == 0) {
                            z3 = false;
                        }
                    }
                    else {
                        view1.measure(0, 0);
                    }
                    int v17 = view1.getMeasuredWidth();
                    v2 -= v17;
                    if(v11 == 0) {
                        v11 = v17;
                    }
                    if(!this.y) {
                        if(v2 + v11 > 0) {
                            z4 = true;
                        }
                    }
                    else if(v2 >= 0) {
                        z4 = true;
                    }
                    else {
                        z4 = false;
                    }
                    z2 = z3 & z4;
                }
                if(z2 && v15 != 0) {
                    sparseBooleanArray0.put(v15, true);
                }
                else if(z1) {
                    sparseBooleanArray0.put(v15, false);
                    for(int v18 = 0; v18 < v10; ++v18) {
                        g g2 = (g)arrayList0.get(v18);
                        if(g2.getGroupId() == v15) {
                            if(g2.l()) {
                                ++v6;
                            }
                            g2.u(false);
                        }
                    }
                }
                if(z2) {
                    --v6;
                }
                g1.u(z2);
            }
            else {
                v14 = v;
                g1.u(((boolean)0));
            }
            ++v10;
            v = v14;
        }
        return true;
    }

    @Override  // androidx.appcompat.view.menu.a
    public void h(Context context0, androidx.appcompat.view.menu.e e0) {
        super.h(context0, e0);
        Resources resources0 = context0.getResources();
        androidx.appcompat.view.a a0 = androidx.appcompat.view.a.b(context0);
        if(!this.t) {
            this.s = true;
        }
        if(!this.z) {
            this.u = a0.c();
        }
        if(!this.x) {
            this.w = a0.d();
        }
        int v = this.u;
        if(this.s) {
            if(this.p == null) {
                d actionMenuPresenter$d0 = new d(this, this.f);
                this.p = actionMenuPresenter$d0;
                if(this.r) {
                    actionMenuPresenter$d0.setImageDrawable(this.q);
                    this.q = null;
                    this.r = false;
                }
                this.p.measure(0, 0);
            }
            v -= this.p.getMeasuredWidth();
        }
        else {
            this.p = null;
        }
        this.v = v;
        this.B = (int)(resources0.getDisplayMetrics().density * 56.0f);
    }

    @Override  // androidx.appcompat.view.menu.j
    public void i(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            return;
        }
        int v = ((SavedState)parcelable0).f;
        if(v > 0) {
            MenuItem menuItem0 = this.h.findItem(v);
            if(menuItem0 != null) {
                this.k(((m)menuItem0.getSubMenu()));
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.a
    public void j(g g0, androidx.appcompat.view.menu.k.a k$a0) {
        k$a0.e(g0, 0);
        ((ActionMenuItemView)k$a0).setItemInvoker(((ActionMenuView)this.n));
        if(this.G == null) {
            this.G = new b(this);
        }
        ((ActionMenuItemView)k$a0).setPopupCallback(this.G);
    }

    @Override  // androidx.appcompat.view.menu.a
    public boolean k(m m0) {
        boolean z = false;
        if(!m0.hasVisibleItems()) {
            return false;
        }
        m m1;
        for(m1 = m0; m1.j0() != this.h; m1 = (m)m1.j0()) {
        }
        View view0 = this.B(m1.getItem());
        if(view0 == null) {
            return false;
        }
        this.I = m0.getItem().getItemId();
        int v = m0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = m0.getItem(v1);
            if(menuItem0.isVisible() && menuItem0.getIcon() != null) {
                z = true;
                break;
            }
        }
        androidx.appcompat.widget.ActionMenuPresenter.a actionMenuPresenter$a0 = new androidx.appcompat.widget.ActionMenuPresenter.a(this, this.g, m0, view0);
        this.E = actionMenuPresenter$a0;
        actionMenuPresenter$a0.g(z);
        this.E.k();
        super.k(m0);
        return true;
    }

    @Override  // androidx.appcompat.view.menu.j
    public Parcelable l() {
        Parcelable parcelable0 = new SavedState();
        parcelable0.f = this.I;
        return parcelable0;
    }

    @Override  // androidx.appcompat.view.menu.a
    public boolean n(ViewGroup viewGroup0, int v) {
        return viewGroup0.getChildAt(v) == this.p ? false : super.n(viewGroup0, v);
    }

    @Override  // androidx.appcompat.view.menu.a
    public View p(g g0, View view0, ViewGroup viewGroup0) {
        View view1 = g0.getActionView();
        if(view1 == null || g0.j()) {
            view1 = super.p(g0, view0, viewGroup0);
        }
        view1.setVisibility((g0.isActionViewExpanded() ? 8 : 0));
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
        if(!((ActionMenuView)viewGroup0).checkLayoutParams(viewGroup$LayoutParams0)) {
            view1.setLayoutParams(((ActionMenuView)viewGroup0).E(viewGroup$LayoutParams0));
        }
        return view1;
    }

    @Override  // androidx.appcompat.view.menu.a
    public k q(ViewGroup viewGroup0) {
        k k0 = this.n;
        k k1 = super.q(viewGroup0);
        if(k0 != k1) {
            ((ActionMenuView)k1).setPresenter(this);
        }
        return k1;
    }

    @Override  // androidx.appcompat.view.menu.a
    public boolean s(int v, g g0) {
        return g0.l();
    }
}

