package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window.Callback;
import androidx.core.view.Y;
import androidx.core.view.i0;
import e.e;
import e.f;
import e.h;
import e.j;

public class g0 implements G {
    Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private ActionMenuPresenter n;
    private int o;
    private int p;
    private Drawable q;

    public g0(Toolbar toolbar0, boolean z) {
        this(toolbar0, z, h.a, e.n);
    }

    public g0(Toolbar toolbar0, boolean z, int v, int v1) {
        class a implements View.OnClickListener {
            final j.a f;
            final g0 g;

            a() {
                this.f = new j.a(g00.a.getContext(), 0, 0x102002C, 0, 0, g00.i);
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                Window.Callback window$Callback0 = g0.this.l;
                if(window$Callback0 != null && g0.this.m) {
                    window$Callback0.onMenuItemSelected(0, this.f);
                }
            }
        }

        this.o = 0;
        this.p = 0;
        this.a = toolbar0;
        this.i = toolbar0.getTitle();
        this.j = toolbar0.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar0.getNavigationIcon();
        c0 c00 = c0.v(toolbar0.getContext(), null, j.a, e.a.c, 0);
        this.q = c00.g(j.l);
        if(z) {
            CharSequence charSequence0 = c00.p(j.r);
            if(!TextUtils.isEmpty(charSequence0)) {
                this.F(charSequence0);
            }
            CharSequence charSequence1 = c00.p(j.p);
            if(!TextUtils.isEmpty(charSequence1)) {
                this.E(charSequence1);
            }
            Drawable drawable0 = c00.g(j.n);
            if(drawable0 != null) {
                this.C(drawable0);
            }
            Drawable drawable1 = c00.g(j.m);
            if(drawable1 != null) {
                this.setIcon(drawable1);
            }
            if(this.g == null) {
                Drawable drawable2 = this.q;
                if(drawable2 != null) {
                    this.x(drawable2);
                }
            }
            this.k(c00.k(j.h, 0));
            int v2 = c00.n(j.g, 0);
            if(v2 != 0) {
                this.A(LayoutInflater.from(this.a.getContext()).inflate(v2, this.a, false));
                this.k(this.b | 16);
            }
            int v3 = c00.m(j.j, 0);
            if(v3 > 0) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.a.getLayoutParams();
                viewGroup$LayoutParams0.height = v3;
                this.a.setLayoutParams(viewGroup$LayoutParams0);
            }
            int v4 = c00.e(j.f, -1);
            int v5 = c00.e(j.e, -1);
            if(v4 >= 0 || v5 >= 0) {
                this.a.K(Math.max(v4, 0), Math.max(v5, 0));
            }
            int v6 = c00.n(j.s, 0);
            if(v6 != 0) {
                this.a.O(this.a.getContext(), v6);
            }
            int v7 = c00.n(j.q, 0);
            if(v7 != 0) {
                this.a.N(this.a.getContext(), v7);
            }
            int v8 = c00.n(j.o, 0);
            if(v8 != 0) {
                this.a.setPopupTheme(v8);
            }
        }
        else {
            this.b = this.z();
        }
        c00.x();
        this.B(v);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a(this));
    }

    public void A(View view0) {
        View view1 = this.d;
        if(view1 != null && (this.b & 16) != 0) {
            this.a.removeView(view1);
        }
        this.d = view0;
        if(view0 != null && (this.b & 16) != 0) {
            this.a.addView(view0);
        }
    }

    public void B(int v) {
        if(v == this.p) {
            return;
        }
        this.p = v;
        if(TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            this.u(this.p);
        }
    }

    public void C(Drawable drawable0) {
        this.f = drawable0;
        this.J();
    }

    public void D(CharSequence charSequence0) {
        this.k = charSequence0;
        this.H();
    }

    public void E(CharSequence charSequence0) {
        this.j = charSequence0;
        if((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence0);
        }
    }

    public void F(CharSequence charSequence0) {
        this.h = true;
        this.G(charSequence0);
    }

    private void G(CharSequence charSequence0) {
        this.i = charSequence0;
        if((this.b & 8) != 0) {
            this.a.setTitle(charSequence0);
            if(this.h) {
                Y.r0(this.a.getRootView(), charSequence0);
            }
        }
    }

    private void H() {
        if((this.b & 4) != 0) {
            if(TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.p);
                return;
            }
            this.a.setNavigationContentDescription(this.k);
        }
    }

    private void I() {
        if((this.b & 4) != 0) {
            this.a.setNavigationIcon((this.g == null ? this.q : this.g));
            return;
        }
        this.a.setNavigationIcon(null);
    }

    private void J() {
        Drawable drawable0;
        int v = this.b;
        if((v & 2) == 0) {
            drawable0 = null;
        }
        else if((v & 1) != 0) {
            drawable0 = this.f;
            if(drawable0 == null) {
                drawable0 = this.e;
            }
        }
        else {
            drawable0 = this.e;
        }
        this.a.setLogo(drawable0);
    }

    @Override  // androidx.appcompat.widget.G
    public void a(Menu menu0, androidx.appcompat.view.menu.j.a j$a0) {
        if(this.n == null) {
            ActionMenuPresenter actionMenuPresenter0 = new ActionMenuPresenter(this.a.getContext());
            this.n = actionMenuPresenter0;
            actionMenuPresenter0.r(f.g);
        }
        this.n.g(j$a0);
        this.a.L(((androidx.appcompat.view.menu.e)menu0), this.n);
    }

    @Override  // androidx.appcompat.widget.G
    public boolean b() {
        return this.a.C();
    }

    @Override  // androidx.appcompat.widget.G
    public void c() {
        this.m = true;
    }

    @Override  // androidx.appcompat.widget.G
    public void collapseActionView() {
        this.a.e();
    }

    @Override  // androidx.appcompat.widget.G
    public boolean d() {
        return this.a.d();
    }

    @Override  // androidx.appcompat.widget.G
    public boolean e() {
        return this.a.B();
    }

    @Override  // androidx.appcompat.widget.G
    public boolean f() {
        return this.a.x();
    }

    @Override  // androidx.appcompat.widget.G
    public boolean g() {
        return this.a.R();
    }

    @Override  // androidx.appcompat.widget.G
    public Context getContext() {
        return this.a.getContext();
    }

    @Override  // androidx.appcompat.widget.G
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override  // androidx.appcompat.widget.G
    public void h() {
        this.a.f();
    }

    @Override  // androidx.appcompat.widget.G
    public void i(W w0) {
        View view0 = this.c;
        if(view0 != null) {
            ViewParent viewParent0 = view0.getParent();
            Toolbar toolbar0 = this.a;
            if(viewParent0 == toolbar0) {
                toolbar0.removeView(this.c);
            }
        }
        this.c = w0;
    }

    @Override  // androidx.appcompat.widget.G
    public boolean j() {
        return this.a.w();
    }

    @Override  // androidx.appcompat.widget.G
    public void k(int v) {
        int v1 = this.b ^ v;
        this.b = v;
        if(v1 != 0) {
            if((v1 & 4) != 0) {
                if((v & 4) != 0) {
                    this.H();
                }
                this.I();
            }
            if((v1 & 3) != 0) {
                this.J();
            }
            if((v1 & 8) != 0) {
                if((v & 8) == 0) {
                    this.a.setTitle(null);
                    this.a.setSubtitle(null);
                }
                else {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                }
            }
            if((v1 & 16) != 0) {
                View view0 = this.d;
                if(view0 != null) {
                    if((v & 16) != 0) {
                        this.a.addView(view0);
                        return;
                    }
                    this.a.removeView(view0);
                }
            }
        }
    }

    @Override  // androidx.appcompat.widget.G
    public Menu l() {
        return this.a.getMenu();
    }

    @Override  // androidx.appcompat.widget.G
    public void m(int v) {
        this.C((v == 0 ? null : f.a.b(this.getContext(), v)));
    }

    @Override  // androidx.appcompat.widget.G
    public int n() {
        return this.o;
    }

    @Override  // androidx.appcompat.widget.G
    public androidx.core.view.g0 o(int v, long v1) {
        class b extends i0 {
            private boolean a;
            final int b;
            final g0 c;

            b(int v) {
                this.b = v;
                super();
                this.a = false;
            }

            @Override  // androidx.core.view.i0
            public void a(View view0) {
                this.a = true;
            }

            @Override  // androidx.core.view.h0
            public void b(View view0) {
                if(!this.a) {
                    g0.this.a.setVisibility(this.b);
                }
            }

            @Override  // androidx.core.view.i0
            public void c(View view0) {
                g0.this.a.setVisibility(0);
            }
        }

        androidx.core.view.g0 g00 = Y.e(this.a);
        return v == 0 ? g00.b(1.0f).f(v1).h(new b(this, 0)) : g00.b(0.0f).f(v1).h(new b(this, v));
    }

    @Override  // androidx.appcompat.widget.G
    public void p(androidx.appcompat.view.menu.j.a j$a0, androidx.appcompat.view.menu.e.a e$a0) {
        this.a.M(j$a0, e$a0);
    }

    @Override  // androidx.appcompat.widget.G
    public void q(int v) {
        this.a.setVisibility(v);
    }

    @Override  // androidx.appcompat.widget.G
    public ViewGroup r() {
        return this.a;
    }

    @Override  // androidx.appcompat.widget.G
    public void s(boolean z) {
    }

    @Override  // androidx.appcompat.widget.G
    public void setIcon(int v) {
        this.setIcon((v == 0 ? null : f.a.b(this.getContext(), v)));
    }

    @Override  // androidx.appcompat.widget.G
    public void setIcon(Drawable drawable0) {
        this.e = drawable0;
        this.J();
    }

    @Override  // androidx.appcompat.widget.G
    public void setWindowCallback(Window.Callback window$Callback0) {
        this.l = window$Callback0;
    }

    @Override  // androidx.appcompat.widget.G
    public void setWindowTitle(CharSequence charSequence0) {
        if(!this.h) {
            this.G(charSequence0);
        }
    }

    @Override  // androidx.appcompat.widget.G
    public int t() {
        return this.b;
    }

    @Override  // androidx.appcompat.widget.G
    public void u(int v) {
        this.D((v == 0 ? null : this.getContext().getString(v)));
    }

    @Override  // androidx.appcompat.widget.G
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override  // androidx.appcompat.widget.G
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override  // androidx.appcompat.widget.G
    public void x(Drawable drawable0) {
        this.g = drawable0;
        this.I();
    }

    @Override  // androidx.appcompat.widget.G
    public void y(boolean z) {
        this.a.setCollapsible(z);
    }

    private int z() {
        if(this.a.getNavigationIcon() != null) {
            this.q = this.a.getNavigationIcon();
            return 15;
        }
        return 11;
    }
}

