package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class a implements j {
    protected Context f;
    protected Context g;
    protected e h;
    protected LayoutInflater i;
    protected LayoutInflater j;
    private androidx.appcompat.view.menu.j.a k;
    private int l;
    private int m;
    protected k n;
    private int o;

    public a(Context context0, int v, int v1) {
        this.f = context0;
        this.i = LayoutInflater.from(context0);
        this.l = v;
        this.m = v1;
    }

    protected void a(View view0, int v) {
        ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
        if(viewGroup0 != null) {
            viewGroup0.removeView(view0);
        }
        ((ViewGroup)this.n).addView(view0, v);
    }

    @Override  // androidx.appcompat.view.menu.j
    public void b(e e0, boolean z) {
        androidx.appcompat.view.menu.j.a j$a0 = this.k;
        if(j$a0 != null) {
            j$a0.b(e0, z);
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public void c(boolean z) {
        ViewGroup viewGroup0 = (ViewGroup)this.n;
        if(viewGroup0 == null) {
            return;
        }
        e e0 = this.h;
        int v = 0;
        if(e0 != null) {
            e0.t();
            ArrayList arrayList0 = this.h.G();
            int v1 = arrayList0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                g g0 = (g)arrayList0.get(v2);
                if(this.s(v3, g0)) {
                    View view0 = viewGroup0.getChildAt(v3);
                    g g1 = view0 instanceof androidx.appcompat.view.menu.k.a ? ((androidx.appcompat.view.menu.k.a)view0).getItemData() : null;
                    View view1 = this.p(g0, view0, viewGroup0);
                    if(g0 != g1) {
                        view1.setPressed(false);
                        view1.jumpDrawablesToCurrentState();
                    }
                    if(view1 != view0) {
                        this.a(view1, v3);
                    }
                    ++v3;
                }
            }
            v = v3;
        }
        while(v < viewGroup0.getChildCount()) {
            if(!this.n(viewGroup0, v)) {
                ++v;
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean e(e e0, g g0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean f(e e0, g g0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.j
    public void g(androidx.appcompat.view.menu.j.a j$a0) {
        this.k = j$a0;
    }

    @Override  // androidx.appcompat.view.menu.j
    public int getId() {
        return this.o;
    }

    @Override  // androidx.appcompat.view.menu.j
    public void h(Context context0, e e0) {
        this.g = context0;
        this.j = LayoutInflater.from(context0);
        this.h = e0;
    }

    public abstract void j(g arg1, androidx.appcompat.view.menu.k.a arg2);

    @Override  // androidx.appcompat.view.menu.j
    public boolean k(m m0) {
        androidx.appcompat.view.menu.j.a j$a0 = this.k;
        if(j$a0 != null) {
            if(m0 == null) {
                m0 = this.h;
            }
            return j$a0.c(m0);
        }
        return false;
    }

    public androidx.appcompat.view.menu.k.a m(ViewGroup viewGroup0) {
        return (androidx.appcompat.view.menu.k.a)this.i.inflate(this.m, viewGroup0, false);
    }

    protected boolean n(ViewGroup viewGroup0, int v) {
        viewGroup0.removeViewAt(v);
        return true;
    }

    public androidx.appcompat.view.menu.j.a o() {
        return this.k;
    }

    public View p(g g0, View view0, ViewGroup viewGroup0) {
        androidx.appcompat.view.menu.k.a k$a0 = view0 instanceof androidx.appcompat.view.menu.k.a ? ((androidx.appcompat.view.menu.k.a)view0) : this.m(viewGroup0);
        this.j(g0, k$a0);
        return (View)k$a0;
    }

    public k q(ViewGroup viewGroup0) {
        if(this.n == null) {
            k k0 = (k)this.i.inflate(this.l, viewGroup0, false);
            this.n = k0;
            k0.b(this.h);
            this.c(true);
        }
        return this.n;
    }

    public void r(int v) {
        this.o = v;
    }

    public abstract boolean s(int arg1, g arg2);
}

