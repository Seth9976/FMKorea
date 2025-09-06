package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import j.e;

abstract class h implements AdapterView.OnItemClickListener, j, e {
    private Rect f;

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
        return 0;
    }

    @Override  // androidx.appcompat.view.menu.j
    public void h(Context context0, androidx.appcompat.view.menu.e e0) {
    }

    public abstract void m(androidx.appcompat.view.menu.e arg1);

    protected boolean n() {
        return true;
    }

    public Rect o() {
        return this.f;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        ListAdapter listAdapter0 = (ListAdapter)adapterView0.getAdapter();
        h.z(listAdapter0).f.P(((MenuItem)listAdapter0.getItem(v)), this, (this.n() ? 0 : 4));
    }

    protected static int p(ListAdapter listAdapter0, ViewGroup viewGroup0, Context context0, int v) {
        int v2 = listAdapter0.getCount();
        int v3 = 0;
        int v4 = 0;
        View view0 = null;
        for(int v1 = 0; v1 < v2; ++v1) {
            int v5 = listAdapter0.getItemViewType(v1);
            if(v5 != v4) {
                view0 = null;
                v4 = v5;
            }
            if(viewGroup0 == null) {
                viewGroup0 = new FrameLayout(context0);
            }
            view0 = listAdapter0.getView(v1, view0, viewGroup0);
            view0.measure(0, 0);
            int v6 = view0.getMeasuredWidth();
            if(v6 >= v) {
                return v;
            }
            if(v6 > v3) {
                v3 = v6;
            }
        }
        return v3;
    }

    public abstract void q(View arg1);

    public void r(Rect rect0) {
        this.f = rect0;
    }

    public abstract void s(boolean arg1);

    public abstract void t(int arg1);

    public abstract void u(int arg1);

    public abstract void v(PopupWindow.OnDismissListener arg1);

    public abstract void w(boolean arg1);

    public abstract void x(int arg1);

    protected static boolean y(androidx.appcompat.view.menu.e e0) {
        int v = e0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = e0.getItem(v1);
            if(menuItem0.isVisible() && menuItem0.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    protected static d z(ListAdapter listAdapter0) {
        return listAdapter0 instanceof HeaderViewListAdapter ? ((d)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter()) : ((d)listAdapter0);
    }
}

