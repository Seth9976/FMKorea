package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

public class c implements AdapterView.OnItemClickListener, j {
    class a extends BaseAdapter {
        private int f;
        final c g;

        public a() {
            this.f = -1;
            this.a();
        }

        void a() {
            g g0 = c.this.h.x();
            if(g0 != null) {
                ArrayList arrayList0 = c.this.h.B();
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(((g)arrayList0.get(v1)) == g0) {
                        this.f = v1;
                        return;
                    }
                }
            }
            this.f = -1;
        }

        public g b(int v) {
            ArrayList arrayList0 = c.this.h.B();
            int v1 = v + c.this.j;
            return (g)arrayList0.get((this.f < 0 || v1 < this.f ? v + c.this.j : v1 + 1));
        }

        @Override  // android.widget.Adapter
        public int getCount() {
            int v = c.this.h.B().size() - c.this.j;
            return this.f >= 0 ? v - 1 : v;
        }

        @Override  // android.widget.Adapter
        public Object getItem(int v) {
            return this.b(v);
        }

        @Override  // android.widget.Adapter
        public long getItemId(int v) {
            return (long)v;
        }

        @Override  // android.widget.Adapter
        public View getView(int v, View view0, ViewGroup viewGroup0) {
            if(view0 == null) {
                view0 = c.this.g.inflate(c.this.l, viewGroup0, false);
            }
            ((androidx.appcompat.view.menu.k.a)view0).e(this.b(v), 0);
            return view0;
        }

        @Override  // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            this.a();
            super.notifyDataSetChanged();
        }
    }

    Context f;
    LayoutInflater g;
    e h;
    ExpandedMenuView i;
    int j;
    int k;
    int l;
    private androidx.appcompat.view.menu.j.a m;
    a n;
    private int o;

    public c(int v, int v1) {
        this.l = v;
        this.k = v1;
    }

    public c(Context context0, int v) {
        this(v, 0);
        this.f = context0;
        this.g = LayoutInflater.from(context0);
    }

    public ListAdapter a() {
        if(this.n == null) {
            this.n = new a(this);
        }
        return this.n;
    }

    @Override  // androidx.appcompat.view.menu.j
    public void b(e e0, boolean z) {
        androidx.appcompat.view.menu.j.a j$a0 = this.m;
        if(j$a0 != null) {
            j$a0.b(e0, z);
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public void c(boolean z) {
        a c$a0 = this.n;
        if(c$a0 != null) {
            c$a0.notifyDataSetChanged();
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean d() {
        return false;
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
        this.m = j$a0;
    }

    @Override  // androidx.appcompat.view.menu.j
    public int getId() {
        return this.o;
    }

    @Override  // androidx.appcompat.view.menu.j
    public void h(Context context0, e e0) {
        if(this.k != 0) {
            ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, this.k);
            this.f = contextThemeWrapper0;
            this.g = LayoutInflater.from(contextThemeWrapper0);
        }
        else if(this.f != null) {
            this.f = context0;
            if(this.g == null) {
                this.g = LayoutInflater.from(context0);
            }
        }
        this.h = e0;
        a c$a0 = this.n;
        if(c$a0 != null) {
            c$a0.notifyDataSetChanged();
        }
    }

    @Override  // androidx.appcompat.view.menu.j
    public void i(Parcelable parcelable0) {
        this.m(((Bundle)parcelable0));
    }

    public k j(ViewGroup viewGroup0) {
        if(this.i == null) {
            this.i = (ExpandedMenuView)this.g.inflate(e.g.g, viewGroup0, false);
            if(this.n == null) {
                this.n = new a(this);
            }
            this.i.setAdapter(this.n);
            this.i.setOnItemClickListener(this);
        }
        return this.i;
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean k(m m0) {
        if(!m0.hasVisibleItems()) {
            return false;
        }
        new f(m0).d(null);
        androidx.appcompat.view.menu.j.a j$a0 = this.m;
        if(j$a0 != null) {
            j$a0.c(m0);
        }
        return true;
    }

    @Override  // androidx.appcompat.view.menu.j
    public Parcelable l() {
        if(this.i == null) {
            return null;
        }
        Parcelable parcelable0 = new Bundle();
        this.n(((Bundle)parcelable0));
        return parcelable0;
    }

    public void m(Bundle bundle0) {
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:list");
        if(sparseArray0 != null) {
            this.i.restoreHierarchyState(sparseArray0);
        }
    }

    public void n(Bundle bundle0) {
        SparseArray sparseArray0 = new SparseArray();
        ExpandedMenuView expandedMenuView0 = this.i;
        if(expandedMenuView0 != null) {
            expandedMenuView0.saveHierarchyState(sparseArray0);
        }
        bundle0.putSparseParcelableArray("android:menu:list", sparseArray0);
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.h.P(this.n.b(v), this, 0);
    }
}

