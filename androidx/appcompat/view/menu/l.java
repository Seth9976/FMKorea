package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.widget.S;
import e.g;

final class l extends h implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener, j {
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final l f;

        @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
        public void onGlobalLayout() {
            if(l.this.a() && !l.this.n.A()) {
                View view0 = l.this.s;
                if(view0 != null && view0.isShown()) {
                    l.this.n.show();
                    return;
                }
                l.this.dismiss();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        final l f;

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view0) {
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view0) {
            ViewTreeObserver viewTreeObserver0 = l.this.u;
            if(viewTreeObserver0 != null) {
                if(!viewTreeObserver0.isAlive()) {
                    l.this.u = view0.getViewTreeObserver();
                }
                l.this.u.removeGlobalOnLayoutListener(l.this.o);
            }
            view0.removeOnAttachStateChangeListener(this);
        }
    }

    private static final int A;
    private final Context g;
    private final e h;
    private final d i;
    private final boolean j;
    private final int k;
    private final int l;
    private final int m;
    final S n;
    final ViewTreeObserver.OnGlobalLayoutListener o;
    private final View.OnAttachStateChangeListener p;
    private PopupWindow.OnDismissListener q;
    private View r;
    View s;
    private androidx.appcompat.view.menu.j.a t;
    ViewTreeObserver u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private boolean z;

    static {
        l.A = g.m;
    }

    public l(Context context0, e e0, View view0, int v, int v1, boolean z) {
        this.o = new a(this);
        this.p = new b(this);
        this.y = 0;
        this.g = context0;
        this.h = e0;
        this.j = z;
        this.i = new d(e0, LayoutInflater.from(context0), z, l.A);
        this.l = v;
        this.m = v1;
        Resources resources0 = context0.getResources();
        this.k = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(e.d.b));
        this.r = view0;
        this.n = new S(context0, null, v, v1);
        e0.c(this, context0);
    }

    private boolean A() {
        if(this.a()) {
            return true;
        }
        if(!this.v) {
            View view0 = this.r;
            if(view0 != null) {
                this.s = view0;
                this.n.J(this);
                this.n.K(this);
                this.n.I(true);
                View view1 = this.s;
                boolean z = this.u == null;
                ViewTreeObserver viewTreeObserver0 = view1.getViewTreeObserver();
                this.u = viewTreeObserver0;
                if(z) {
                    viewTreeObserver0.addOnGlobalLayoutListener(this.o);
                }
                view1.addOnAttachStateChangeListener(this.p);
                this.n.C(view1);
                this.n.F(this.y);
                if(!this.w) {
                    this.x = h.p(this.i, null, this.g, this.k);
                    this.w = true;
                }
                this.n.E(this.x);
                this.n.H(2);
                this.n.G(this.o());
                this.n.show();
                ListView listView0 = this.n.j();
                listView0.setOnKeyListener(this);
                if(this.z && this.h.z() != null) {
                    FrameLayout frameLayout0 = (FrameLayout)LayoutInflater.from(this.g).inflate(g.l, listView0, false);
                    TextView textView0 = (TextView)frameLayout0.findViewById(0x1020016);
                    if(textView0 != null) {
                        textView0.setText(this.h.z());
                    }
                    frameLayout0.setEnabled(false);
                    listView0.addHeaderView(frameLayout0, null, false);
                }
                this.n.o(this.i);
                this.n.show();
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // j.e
    public boolean a() {
        return !this.v && this.n.a();
    }

    @Override  // androidx.appcompat.view.menu.j
    public void b(e e0, boolean z) {
        if(e0 != this.h) {
            return;
        }
        this.dismiss();
        androidx.appcompat.view.menu.j.a j$a0 = this.t;
        if(j$a0 != null) {
            j$a0.b(e0, z);
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public void c(boolean z) {
        this.w = false;
        d d0 = this.i;
        if(d0 != null) {
            d0.notifyDataSetChanged();
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean d() {
        return false;
    }

    @Override  // j.e
    public void dismiss() {
        if(this.a()) {
            this.n.dismiss();
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public void g(androidx.appcompat.view.menu.j.a j$a0) {
        this.t = j$a0;
    }

    @Override  // androidx.appcompat.view.menu.j
    public void i(Parcelable parcelable0) {
    }

    @Override  // j.e
    public ListView j() {
        return this.n.j();
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean k(m m0) {
        if(m0.hasVisibleItems()) {
            i i0 = new i(this.g, m0, this.s, this.j, this.l, this.m);
            i0.j(this.t);
            i0.g(h.y(m0));
            i0.i(this.q);
            this.q = null;
            this.h.e(false);
            int v = this.n.b();
            int v1 = this.n.n();
            if((Gravity.getAbsoluteGravity(this.y, this.r.getLayoutDirection()) & 7) == 5) {
                v += this.r.getWidth();
            }
            if(i0.n(v, v1)) {
                androidx.appcompat.view.menu.j.a j$a0 = this.t;
                if(j$a0 != null) {
                    j$a0.c(m0);
                }
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.j
    public Parcelable l() {
        return null;
    }

    @Override  // androidx.appcompat.view.menu.h
    public void m(e e0) {
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public void onDismiss() {
        this.v = true;
        this.h.close();
        ViewTreeObserver viewTreeObserver0 = this.u;
        if(viewTreeObserver0 != null) {
            if(!viewTreeObserver0.isAlive()) {
                this.u = this.s.getViewTreeObserver();
            }
            this.u.removeGlobalOnLayoutListener(this.o);
            this.u = null;
        }
        this.s.removeOnAttachStateChangeListener(this.p);
        PopupWindow.OnDismissListener popupWindow$OnDismissListener0 = this.q;
        if(popupWindow$OnDismissListener0 != null) {
            popupWindow$OnDismissListener0.onDismiss();
        }
    }

    @Override  // android.view.View$OnKeyListener
    public boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 1 && v == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.h
    public void q(View view0) {
        this.r = view0;
    }

    @Override  // androidx.appcompat.view.menu.h
    public void s(boolean z) {
        this.i.d(z);
    }

    @Override  // j.e
    public void show() {
        if(!this.A()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override  // androidx.appcompat.view.menu.h
    public void t(int v) {
        this.y = v;
    }

    @Override  // androidx.appcompat.view.menu.h
    public void u(int v) {
        this.n.d(v);
    }

    @Override  // androidx.appcompat.view.menu.h
    public void v(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.q = popupWindow$OnDismissListener0;
    }

    @Override  // androidx.appcompat.view.menu.h
    public void w(boolean z) {
        this.z = z;
    }

    @Override  // androidx.appcompat.view.menu.h
    public void x(int v) {
        this.n.k(v);
    }
}

