package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.widget.Q;
import androidx.appcompat.widget.S;
import androidx.core.view.s;
import e.g;
import java.util.ArrayList;
import java.util.List;

final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener, j {
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final b f;

        @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
        public void onGlobalLayout() {
            if(b.this.a() && b.this.n.size() > 0 && !((d)b.this.n.get(0)).a.A()) {
                View view0 = b.this.u;
                if(view0 != null && view0.isShown()) {
                    for(Object object0: b.this.n) {
                        ((d)object0).a.show();
                    }
                    return;
                }
                b.this.dismiss();
            }
        }
    }

    class androidx.appcompat.view.menu.b.b implements View.OnAttachStateChangeListener {
        final b f;

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view0) {
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view0) {
            ViewTreeObserver viewTreeObserver0 = b.this.D;
            if(viewTreeObserver0 != null) {
                if(!viewTreeObserver0.isAlive()) {
                    b.this.D = view0.getViewTreeObserver();
                }
                b.this.D.removeGlobalOnLayoutListener(b.this.o);
            }
            view0.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements Q {
        final b f;

        @Override  // androidx.appcompat.widget.Q
        public void c(e e0, MenuItem menuItem0) {
            class androidx.appcompat.view.menu.b.c.a implements Runnable {
                final d f;
                final MenuItem g;
                final e h;
                final c i;

                androidx.appcompat.view.menu.b.c.a(d b$d0, MenuItem menuItem0, e e0) {
                    this.f = b$d0;
                    this.g = menuItem0;
                    this.h = e0;
                    super();
                }

                @Override
                public void run() {
                    d b$d0 = this.f;
                    if(b$d0 != null) {
                        b.this.F = true;
                        b$d0.b.e(false);
                        b.this.F = false;
                    }
                    if(this.g.isEnabled() && this.g.hasSubMenu()) {
                        this.h.O(this.g, 4);
                    }
                }
            }

            d b$d0 = null;
            b.this.l.removeCallbacksAndMessages(null);
            int v = b.this.n.size();
            int v1;
            for(v1 = 0; true; ++v1) {
                if(v1 >= v) {
                    v1 = -1;
                    break;
                }
                if(e0 == ((d)b.this.n.get(v1)).b) {
                    break;
                }
            }
            if(v1 == -1) {
                return;
            }
            if(v1 + 1 < b.this.n.size()) {
                b$d0 = (d)b.this.n.get(v1 + 1);
            }
            androidx.appcompat.view.menu.b.c.a b$c$a0 = new androidx.appcompat.view.menu.b.c.a(this, b$d0, menuItem0, e0);
            long v2 = SystemClock.uptimeMillis();
            b.this.l.postAtTime(b$c$a0, e0, v2 + 200L);
        }

        @Override  // androidx.appcompat.widget.Q
        public void f(e e0, MenuItem menuItem0) {
            b.this.l.removeCallbacksAndMessages(e0);
        }
    }

    static class d {
        public final S a;
        public final e b;
        public final int c;

        public d(S s0, e e0, int v) {
            this.a = s0;
            this.b = e0;
            this.c = v;
        }

        public ListView a() {
            return this.a.j();
        }
    }

    private boolean A;
    private boolean B;
    private androidx.appcompat.view.menu.j.a C;
    ViewTreeObserver D;
    private PopupWindow.OnDismissListener E;
    boolean F;
    private static final int G;
    private final Context g;
    private final int h;
    private final int i;
    private final int j;
    private final boolean k;
    final Handler l;
    private final List m;
    final List n;
    final ViewTreeObserver.OnGlobalLayoutListener o;
    private final View.OnAttachStateChangeListener p;
    private final Q q;
    private int r;
    private int s;
    private View t;
    View u;
    private int v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    static {
        b.G = g.e;
    }

    public b(Context context0, View view0, int v, int v1, boolean z) {
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new a(this);
        this.p = new androidx.appcompat.view.menu.b.b(this);
        this.q = new c(this);
        this.r = 0;
        this.s = 0;
        this.g = context0;
        this.t = view0;
        this.i = v;
        this.j = v1;
        this.k = z;
        this.A = false;
        this.v = this.E();
        Resources resources0 = context0.getResources();
        this.h = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(e.d.b));
        this.l = new Handler();
    }

    private S A() {
        S s0 = new S(this.g, null, this.i, this.j);
        s0.T(this.q);
        s0.K(this);
        s0.J(this);
        s0.C(this.t);
        s0.F(this.s);
        s0.I(true);
        s0.H(2);
        return s0;
    }

    private int B(e e0) {
        int v = this.n.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(e0 == ((d)this.n.get(v1)).b) {
                return v1;
            }
        }
        return -1;
    }

    private MenuItem C(e e0, e e1) {
        int v = e0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = e0.getItem(v1);
            if(menuItem0.hasSubMenu() && e1 == menuItem0.getSubMenu()) {
                return menuItem0;
            }
        }
        return null;
    }

    private View D(d b$d0, e e0) {
        androidx.appcompat.view.menu.d d0;
        int v1;
        MenuItem menuItem0 = this.C(b$d0.b, e0);
        if(menuItem0 == null) {
            return null;
        }
        ListView listView0 = b$d0.a();
        ListAdapter listAdapter0 = listView0.getAdapter();
        int v = 0;
        if(listAdapter0 instanceof HeaderViewListAdapter) {
            v1 = ((HeaderViewListAdapter)listAdapter0).getHeadersCount();
            d0 = (androidx.appcompat.view.menu.d)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter();
        }
        else {
            d0 = (androidx.appcompat.view.menu.d)listAdapter0;
            v1 = 0;
        }
        int v2 = d0.getCount();
        while(true) {
            if(v >= v2) {
                v = -1;
                break;
            }
            if(menuItem0 == d0.c(v)) {
                break;
            }
            ++v;
        }
        if(v == -1) {
            return null;
        }
        int v3 = v + v1 - listView0.getFirstVisiblePosition();
        return v3 < 0 || v3 >= listView0.getChildCount() ? null : listView0.getChildAt(v3);
    }

    private int E() {
        return this.t.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int F(int v) {
        ListView listView0 = ((d)this.n.get(this.n.size() - 1)).a();
        int[] arr_v = new int[2];
        listView0.getLocationOnScreen(arr_v);
        Rect rect0 = new Rect();
        this.u.getWindowVisibleDisplayFrame(rect0);
        if(this.v == 1) {
            return arr_v[0] + listView0.getWidth() + v <= rect0.right ? 1 : 0;
        }
        return arr_v[0] - v >= 0 ? 0 : 1;
    }

    private void G(e e0) {
        int v4;
        int v3;
        int v2;
        View view0;
        d b$d0;
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.g);
        androidx.appcompat.view.menu.d d0 = new androidx.appcompat.view.menu.d(e0, layoutInflater0, this.k, b.G);
        if(!this.a() && this.A) {
            d0.d(true);
        }
        else if(this.a()) {
            d0.d(h.y(e0));
        }
        int v = h.p(d0, null, this.g, this.h);
        S s0 = this.A();
        s0.o(d0);
        s0.E(v);
        s0.F(this.s);
        if(this.n.size() > 0) {
            b$d0 = (d)this.n.get(this.n.size() - 1);
            view0 = this.D(b$d0, e0);
        }
        else {
            b$d0 = null;
            view0 = null;
        }
        if(view0 == null) {
            if(this.w) {
                s0.d(this.y);
            }
            if(this.x) {
                s0.k(this.z);
            }
            s0.G(this.o());
        }
        else {
            s0.U(false);
            s0.R(null);
            int v1 = this.F(v);
            this.v = v1;
            if(Build.VERSION.SDK_INT >= 26) {
                s0.C(view0);
                v2 = 0;
                v3 = 0;
            }
            else {
                int[] arr_v = new int[2];
                this.t.getLocationOnScreen(arr_v);
                int[] arr_v1 = new int[2];
                view0.getLocationOnScreen(arr_v1);
                if((this.s & 7) == 5) {
                    arr_v[0] += this.t.getWidth();
                    arr_v1[0] += view0.getWidth();
                }
                v3 = arr_v1[0] - arr_v[0];
                v2 = arr_v1[1] - arr_v[1];
            }
            if((this.s & 5) != 5) {
                v4 = v1 == 1 ? v3 + view0.getWidth() : v3 - v;
            }
            else if(v1 != 1) {
                v4 = v3 - view0.getWidth();
            }
            else {
                v4 = v3 + v;
            }
            s0.d(v4);
            s0.M(true);
            s0.k(v2);
        }
        d b$d1 = new d(s0, e0, this.v);
        this.n.add(b$d1);
        s0.show();
        ListView listView0 = s0.j();
        listView0.setOnKeyListener(this);
        if(b$d0 == null && this.B && e0.z() != null) {
            FrameLayout frameLayout0 = (FrameLayout)layoutInflater0.inflate(g.l, listView0, false);
            TextView textView0 = (TextView)frameLayout0.findViewById(0x1020016);
            frameLayout0.setEnabled(false);
            textView0.setText(e0.z());
            listView0.addHeaderView(frameLayout0, null, false);
            s0.show();
        }
    }

    @Override  // j.e
    public boolean a() {
        return this.n.size() > 0 && ((d)this.n.get(0)).a.a();
    }

    @Override  // androidx.appcompat.view.menu.j
    public void b(e e0, boolean z) {
        int v = this.B(e0);
        if(v < 0) {
            return;
        }
        if(v + 1 < this.n.size()) {
            ((d)this.n.get(v + 1)).b.e(false);
        }
        d b$d0 = (d)this.n.remove(v);
        b$d0.b.R(this);
        if(this.F) {
            b$d0.a.S(null);
            b$d0.a.D(0);
        }
        b$d0.a.dismiss();
        int v1 = this.n.size();
        this.v = v1 > 0 ? ((d)this.n.get(v1 - 1)).c : this.E();
        if(v1 == 0) {
            this.dismiss();
            androidx.appcompat.view.menu.j.a j$a0 = this.C;
            if(j$a0 != null) {
                j$a0.b(e0, true);
            }
            ViewTreeObserver viewTreeObserver0 = this.D;
            if(viewTreeObserver0 != null) {
                if(viewTreeObserver0.isAlive()) {
                    this.D.removeGlobalOnLayoutListener(this.o);
                }
                this.D = null;
            }
            this.u.removeOnAttachStateChangeListener(this.p);
            this.E.onDismiss();
            return;
        }
        if(z) {
            ((d)this.n.get(0)).b.e(false);
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public void c(boolean z) {
        for(Object object0: this.n) {
            h.z(((d)object0).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean d() {
        return false;
    }

    @Override  // j.e
    public void dismiss() {
        int v = this.n.size();
        if(v > 0) {
            d[] arr_b$d = (d[])this.n.toArray(new d[v]);
            for(int v1 = v - 1; v1 >= 0; --v1) {
                d b$d0 = arr_b$d[v1];
                if(b$d0.a.a()) {
                    b$d0.a.dismiss();
                }
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public void g(androidx.appcompat.view.menu.j.a j$a0) {
        this.C = j$a0;
    }

    @Override  // androidx.appcompat.view.menu.j
    public void i(Parcelable parcelable0) {
    }

    // 去混淆评级： 低(20)
    @Override  // j.e
    public ListView j() {
        return this.n.isEmpty() ? null : ((d)this.n.get(this.n.size() - 1)).a();
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean k(m m0) {
        for(Object object0: this.n) {
            d b$d0 = (d)object0;
            if(m0 == b$d0.b) {
                b$d0.a().requestFocus();
                return true;
            }
            if(false) {
                break;
            }
        }
        if(m0.hasVisibleItems()) {
            this.m(m0);
            androidx.appcompat.view.menu.j.a j$a0 = this.C;
            if(j$a0 != null) {
                j$a0.c(m0);
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.j
    public Parcelable l() {
        return null;
    }

    @Override  // androidx.appcompat.view.menu.h
    public void m(e e0) {
        e0.c(this, this.g);
        if(this.a()) {
            this.G(e0);
            return;
        }
        this.m.add(e0);
    }

    @Override  // androidx.appcompat.view.menu.h
    protected boolean n() {
        return false;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public void onDismiss() {
        d b$d0;
        int v = this.n.size();
        for(int v1 = 0; true; ++v1) {
            b$d0 = null;
            if(v1 >= v) {
                break;
            }
            d b$d1 = (d)this.n.get(v1);
            if(!b$d1.a.a()) {
                b$d0 = b$d1;
                break;
            }
        }
        if(b$d0 != null) {
            b$d0.b.e(false);
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
        if(this.t != view0) {
            this.t = view0;
            this.s = s.b(this.r, view0.getLayoutDirection());
        }
    }

    @Override  // androidx.appcompat.view.menu.h
    public void s(boolean z) {
        this.A = z;
    }

    @Override  // j.e
    public void show() {
        if(this.a()) {
            return;
        }
        for(Object object0: this.m) {
            this.G(((e)object0));
        }
        this.m.clear();
        View view0 = this.t;
        this.u = view0;
        if(view0 != null) {
            boolean z = this.D == null;
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            this.D = viewTreeObserver0;
            if(z) {
                viewTreeObserver0.addOnGlobalLayoutListener(this.o);
            }
            this.u.addOnAttachStateChangeListener(this.p);
        }
    }

    @Override  // androidx.appcompat.view.menu.h
    public void t(int v) {
        if(this.r != v) {
            this.r = v;
            this.s = s.b(v, this.t.getLayoutDirection());
        }
    }

    @Override  // androidx.appcompat.view.menu.h
    public void u(int v) {
        this.w = true;
        this.y = v;
    }

    @Override  // androidx.appcompat.view.menu.h
    public void v(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.E = popupWindow$OnDismissListener0;
    }

    @Override  // androidx.appcompat.view.menu.h
    public void w(boolean z) {
        this.B = z;
    }

    @Override  // androidx.appcompat.view.menu.h
    public void x(int v) {
        this.x = true;
        this.z = v;
    }
}

