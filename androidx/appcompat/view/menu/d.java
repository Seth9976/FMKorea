package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class d extends BaseAdapter {
    e f;
    private int g;
    private boolean h;
    private final boolean i;
    private final LayoutInflater j;
    private final int k;

    public d(e e0, LayoutInflater layoutInflater0, boolean z, int v) {
        this.g = -1;
        this.i = z;
        this.j = layoutInflater0;
        this.f = e0;
        this.k = v;
        this.a();
    }

    void a() {
        g g0 = this.f.x();
        if(g0 != null) {
            ArrayList arrayList0 = this.f.B();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((g)arrayList0.get(v1)) == g0) {
                    this.g = v1;
                    return;
                }
            }
        }
        this.g = -1;
    }

    public e b() {
        return this.f;
    }

    public g c(int v) {
        ArrayList arrayList0 = this.i ? this.f.B() : this.f.G();
        if(this.g >= 0 && v >= this.g) {
            ++v;
        }
        return (g)arrayList0.get(v);
    }

    public void d(boolean z) {
        this.h = z;
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList0 = this.i ? this.f.B() : this.f.G();
        return this.g >= 0 ? arrayList0.size() - 1 : arrayList0.size();
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.c(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = this.j.inflate(this.k, viewGroup0, false);
        }
        int v1 = this.c(v).getGroupId();
        int v2 = v - 1 < 0 ? v1 : this.c(v - 1).getGroupId();
        ((ListMenuItemView)view0).setGroupDividerEnabled(this.f.I() && v1 != v2);
        if(this.h) {
            ((ListMenuItemView)view0).setForceShowIcon(true);
        }
        ((a)view0).e(this.c(v), 0);
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}

