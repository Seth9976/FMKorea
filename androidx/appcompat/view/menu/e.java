package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.c0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import w.a;

public class e implements a {
    public interface androidx.appcompat.view.menu.e.a {
        boolean a(e arg1, MenuItem arg2);

        void b(e arg1);
    }

    public interface b {
        boolean a(g arg1);
    }

    private static final int[] A;
    private final Context a;
    private final Resources b;
    private boolean c;
    private boolean d;
    private androidx.appcompat.view.menu.e.a e;
    private ArrayList f;
    private ArrayList g;
    private boolean h;
    private ArrayList i;
    private ArrayList j;
    private boolean k;
    private int l;
    private ContextMenu.ContextMenuInfo m;
    CharSequence n;
    Drawable o;
    View p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private ArrayList v;
    private CopyOnWriteArrayList w;
    private g x;
    private boolean y;
    private boolean z;

    static {
        e.A = new int[]{1, 4, 5, 3, 2, 0};
    }

    public e(Context context0) {
        this.l = 0;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = new ArrayList();
        this.w = new CopyOnWriteArrayList();
        this.y = false;
        this.a = context0;
        this.b = context0.getResources();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        this.g0(true);
    }

    public View A() {
        return this.p;
    }

    public ArrayList B() {
        this.t();
        return this.j;
    }

    boolean C() {
        return this.t;
    }

    private static int D(int v) {
        int v1 = (0xFFFF0000 & v) >> 16;
        if(v1 >= 0) {
            int[] arr_v = e.A;
            if(v1 < arr_v.length) {
                return v & 0xFFFF | arr_v[v1] << 16;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    Resources E() {
        return this.b;
    }

    public e F() {
        return this;
    }

    public ArrayList G() {
        if(!this.h) {
            return this.g;
        }
        this.g.clear();
        int v = this.f.size();
        for(int v1 = 0; v1 < v; ++v1) {
            g g0 = (g)this.f.get(v1);
            if(g0.isVisible()) {
                this.g.add(g0);
            }
        }
        this.h = false;
        this.k = true;
        return this.g;
    }

    public boolean H() {
        return !this.q;
    }

    public boolean I() {
        return this.y;
    }

    boolean J() {
        return this.c;
    }

    public boolean K() {
        return this.d;
    }

    void L(g g0) {
        this.k = true;
        this.N(true);
    }

    void M(g g0) {
        this.h = true;
        this.N(true);
    }

    public void N(boolean z) {
        if(!this.q) {
            if(z) {
                this.h = true;
                this.k = true;
            }
            this.i(z);
            return;
        }
        this.r = true;
        if(z) {
            this.s = true;
        }
    }

    public boolean O(MenuItem menuItem0, int v) {
        return this.P(menuItem0, null, v);
    }

    public boolean P(MenuItem menuItem0, j j0, int v) {
        if(((g)menuItem0) != null && ((g)menuItem0).isEnabled()) {
            boolean z = ((g)menuItem0).k();
            androidx.core.view.b b0 = ((g)menuItem0).b();
            boolean z1 = b0 != null && b0.a();
            if(((g)menuItem0).j()) {
                z |= ((g)menuItem0).expandActionView();
                if(z) {
                    this.e(true);
                    return true;
                }
            }
            else if(((g)menuItem0).hasSubMenu() || z1) {
                if((v & 4) == 0) {
                    this.e(false);
                }
                if(!((g)menuItem0).hasSubMenu()) {
                    ((g)menuItem0).x(new m(this.w(), this, ((g)menuItem0)));
                }
                m m0 = (m)((g)menuItem0).getSubMenu();
                if(z1) {
                    b0.e(m0);
                }
                z |= this.l(m0, j0);
                if(!z) {
                    this.e(true);
                }
            }
            else if((v & 1) == 0) {
                this.e(true);
                return z;
            }
            return z;
        }
        return false;
    }

    private void Q(int v, boolean z) {
        if(v >= 0 && v < this.f.size()) {
            this.f.remove(v);
            if(z) {
                this.N(true);
            }
        }
    }

    public void R(j j0) {
        for(Object object0: this.w) {
            WeakReference weakReference0 = (WeakReference)object0;
            j j1 = (j)weakReference0.get();
            if(j1 == null || j1 == j0) {
                this.w.remove(weakReference0);
            }
        }
    }

    public void S(Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:actionviewstates");
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = this.getItem(v1);
            View view0 = menuItem0.getActionView();
            if(view0 != null && view0.getId() != -1) {
                view0.restoreHierarchyState(sparseArray0);
            }
            if(menuItem0.hasSubMenu()) {
                ((m)menuItem0.getSubMenu()).S(bundle0);
            }
        }
        int v2 = bundle0.getInt("android:menu:expandedactionview");
        if(v2 > 0) {
            MenuItem menuItem1 = this.findItem(v2);
            if(menuItem1 != null) {
                menuItem1.expandActionView();
            }
        }
    }

    public void T(Bundle bundle0) {
        this.j(bundle0);
    }

    public void U(Bundle bundle0) {
        int v = this.size();
        SparseArray sparseArray0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = this.getItem(v1);
            View view0 = menuItem0.getActionView();
            if(view0 != null && view0.getId() != -1) {
                if(sparseArray0 == null) {
                    sparseArray0 = new SparseArray();
                }
                view0.saveHierarchyState(sparseArray0);
                if(menuItem0.isActionViewExpanded()) {
                    bundle0.putInt("android:menu:expandedactionview", menuItem0.getItemId());
                }
            }
            if(menuItem0.hasSubMenu()) {
                ((m)menuItem0.getSubMenu()).U(bundle0);
            }
        }
        if(sparseArray0 != null) {
            bundle0.putSparseParcelableArray("android:menu:actionviewstates", sparseArray0);
        }
    }

    public void V(Bundle bundle0) {
        this.k(bundle0);
    }

    public void W(androidx.appcompat.view.menu.e.a e$a0) {
        this.e = e$a0;
    }

    public e X(int v) {
        this.l = v;
        return this;
    }

    void Y(MenuItem menuItem0) {
        int v = menuItem0.getGroupId();
        int v1 = this.f.size();
        this.i0();
        for(int v2 = 0; v2 < v1; ++v2) {
            g g0 = (g)this.f.get(v2);
            if(g0.getGroupId() == v && g0.m() && g0.isCheckable()) {
                g0.s(g0 == menuItem0);
            }
        }
        this.h0();
    }

    protected e Z(int v) {
        this.b0(0, null, v, null, null);
        return this;
    }

    protected MenuItem a(int v, int v1, int v2, CharSequence charSequence0) {
        int v3 = e.D(v2);
        MenuItem menuItem0 = this.g(v, v1, v2, v3, charSequence0, this.l);
        ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0 = this.m;
        if(contextMenu$ContextMenuInfo0 != null) {
            ((g)menuItem0).v(contextMenu$ContextMenuInfo0);
        }
        this.f.add(e.p(this.f, v3), menuItem0);
        this.N(true);
        return menuItem0;
    }

    protected e a0(Drawable drawable0) {
        this.b0(0, null, 0, drawable0, null);
        return this;
    }

    @Override  // android.view.Menu
    public MenuItem add(int v) {
        return this.a(0, 0, 0, this.b.getString(v));
    }

    @Override  // android.view.Menu
    public MenuItem add(int v, int v1, int v2, int v3) {
        return this.a(v, v1, v2, this.b.getString(v3));
    }

    @Override  // android.view.Menu
    public MenuItem add(int v, int v1, int v2, CharSequence charSequence0) {
        return this.a(v, v1, v2, charSequence0);
    }

    @Override  // android.view.Menu
    public MenuItem add(CharSequence charSequence0) {
        return this.a(0, 0, 0, charSequence0);
    }

    @Override  // android.view.Menu
    public int addIntentOptions(int v, int v1, int v2, ComponentName componentName0, Intent[] arr_intent, Intent intent0, int v3, MenuItem[] arr_menuItem) {
        PackageManager packageManager0 = this.a.getPackageManager();
        List list0 = packageManager0.queryIntentActivityOptions(componentName0, arr_intent, intent0, 0);
        int v5 = list0 == null ? 0 : list0.size();
        if((v3 & 1) == 0) {
            this.removeGroup(v);
        }
        for(int v4 = 0; v4 < v5; ++v4) {
            ResolveInfo resolveInfo0 = (ResolveInfo)list0.get(v4);
            Intent intent1 = new Intent((resolveInfo0.specificIndex >= 0 ? arr_intent[resolveInfo0.specificIndex] : intent0));
            intent1.setComponent(new ComponentName(resolveInfo0.activityInfo.applicationInfo.packageName, resolveInfo0.activityInfo.name));
            MenuItem menuItem0 = this.add(v, v1, v2, resolveInfo0.loadLabel(packageManager0)).setIcon(resolveInfo0.loadIcon(packageManager0)).setIntent(intent1);
            if(arr_menuItem != null) {
                int v6 = resolveInfo0.specificIndex;
                if(v6 >= 0) {
                    arr_menuItem[v6] = menuItem0;
                }
            }
        }
        return v5;
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v) {
        return this.addSubMenu(0, 0, 0, this.b.getString(v));
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v, int v1, int v2, int v3) {
        return this.addSubMenu(v, v1, v2, this.b.getString(v3));
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v, int v1, int v2, CharSequence charSequence0) {
        g g0 = (g)this.a(v, v1, v2, charSequence0);
        SubMenu subMenu0 = new m(this.a, this, g0);
        g0.x(((m)subMenu0));
        return subMenu0;
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence0) {
        return this.addSubMenu(0, 0, 0, charSequence0);
    }

    public void b(j j0) {
        this.c(j0, this.a);
    }

    private void b0(int v, CharSequence charSequence0, int v1, Drawable drawable0, View view0) {
        Resources resources0 = this.E();
        if(view0 == null) {
            if(v > 0) {
                this.n = resources0.getText(v);
            }
            else if(charSequence0 != null) {
                this.n = charSequence0;
            }
            if(v1 > 0) {
                this.o = androidx.core.content.a.getDrawable(this.w(), v1);
            }
            else if(drawable0 != null) {
                this.o = drawable0;
            }
            this.p = null;
        }
        else {
            this.p = view0;
            this.n = null;
            this.o = null;
        }
        this.N(false);
    }

    public void c(j j0, Context context0) {
        this.w.add(new WeakReference(j0));
        j0.h(context0, this);
        this.k = true;
    }

    protected e c0(int v) {
        this.b0(v, null, 0, null, null);
        return this;
    }

    @Override  // android.view.Menu
    public void clear() {
        g g0 = this.x;
        if(g0 != null) {
            this.f(g0);
        }
        this.f.clear();
        this.N(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        this.N(false);
    }

    @Override  // android.view.Menu
    public void close() {
        this.e(true);
    }

    public void d() {
        androidx.appcompat.view.menu.e.a e$a0 = this.e;
        if(e$a0 != null) {
            e$a0.b(this);
        }
    }

    protected e d0(CharSequence charSequence0) {
        this.b0(0, charSequence0, 0, null, null);
        return this;
    }

    public final void e(boolean z) {
        if(this.u) {
            return;
        }
        this.u = true;
        for(Object object0: this.w) {
            WeakReference weakReference0 = (WeakReference)object0;
            j j0 = (j)weakReference0.get();
            if(j0 == null) {
                this.w.remove(weakReference0);
            }
            else {
                j0.b(this, z);
            }
        }
        this.u = false;
    }

    protected e e0(View view0) {
        this.b0(0, null, 0, null, view0);
        return this;
    }

    public boolean f(g g0) {
        boolean z = false;
        if(!this.w.isEmpty() && this.x == g0) {
            this.i0();
            for(Object object0: this.w) {
                WeakReference weakReference0 = (WeakReference)object0;
                j j0 = (j)weakReference0.get();
                if(j0 == null) {
                    this.w.remove(weakReference0);
                }
                else {
                    z = j0.e(this, g0);
                    if(z) {
                        break;
                    }
                }
            }
            this.h0();
            if(z) {
                this.x = null;
            }
        }
        return z;
    }

    public void f0(boolean z) {
        this.z = z;
    }

    @Override  // android.view.Menu
    public MenuItem findItem(int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItem menuItem0 = (g)this.f.get(v2);
            if(((g)menuItem0).getItemId() == v) {
                return menuItem0;
            }
            if(((g)menuItem0).hasSubMenu()) {
                MenuItem menuItem1 = ((g)menuItem0).getSubMenu().findItem(v);
                if(menuItem1 != null) {
                    return menuItem1;
                }
            }
        }
        return null;
    }

    private g g(int v, int v1, int v2, int v3, CharSequence charSequence0, int v4) {
        return new g(this, v, v1, v2, v3, charSequence0, v4);
    }

    private void g0(boolean z) {
        this.d = z && this.b.getConfiguration().keyboard != 1 && c0.l(ViewConfiguration.get(this.a), this.a);
    }

    @Override  // android.view.Menu
    public MenuItem getItem(int v) {
        return (MenuItem)this.f.get(v);
    }

    boolean h(e e0, MenuItem menuItem0) {
        return this.e != null && this.e.a(e0, menuItem0);
    }

    public void h0() {
        this.q = false;
        if(this.r) {
            this.r = false;
            this.N(this.s);
        }
    }

    @Override  // android.view.Menu
    public boolean hasVisibleItems() {
        if(this.z) {
            return true;
        }
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((g)this.f.get(v1)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    private void i(boolean z) {
        if(this.w.isEmpty()) {
            return;
        }
        this.i0();
        for(Object object0: this.w) {
            WeakReference weakReference0 = (WeakReference)object0;
            j j0 = (j)weakReference0.get();
            if(j0 == null) {
                this.w.remove(weakReference0);
            }
            else {
                j0.c(z);
            }
        }
        this.h0();
    }

    public void i0() {
        if(!this.q) {
            this.q = true;
            this.r = false;
            this.s = false;
        }
    }

    @Override  // android.view.Menu
    public boolean isShortcutKey(int v, KeyEvent keyEvent0) {
        return this.r(v, keyEvent0) != null;
    }

    private void j(Bundle bundle0) {
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:presenters");
        if(sparseArray0 != null && !this.w.isEmpty()) {
            for(Object object0: this.w) {
                WeakReference weakReference0 = (WeakReference)object0;
                j j0 = (j)weakReference0.get();
                if(j0 == null) {
                    this.w.remove(weakReference0);
                }
                else {
                    int v = j0.getId();
                    if(v > 0) {
                        Parcelable parcelable0 = (Parcelable)sparseArray0.get(v);
                        if(parcelable0 != null) {
                            j0.i(parcelable0);
                        }
                    }
                }
            }
        }
    }

    private void k(Bundle bundle0) {
        if(this.w.isEmpty()) {
            return;
        }
        SparseArray sparseArray0 = new SparseArray();
        for(Object object0: this.w) {
            WeakReference weakReference0 = (WeakReference)object0;
            j j0 = (j)weakReference0.get();
            if(j0 == null) {
                this.w.remove(weakReference0);
            }
            else {
                int v = j0.getId();
                if(v > 0) {
                    Parcelable parcelable0 = j0.l();
                    if(parcelable0 != null) {
                        sparseArray0.put(v, parcelable0);
                    }
                }
            }
        }
        bundle0.putSparseParcelableArray("android:menu:presenters", sparseArray0);
    }

    private boolean l(m m0, j j0) {
        boolean z = false;
        if(this.w.isEmpty()) {
            return false;
        }
        if(j0 != null) {
            z = j0.k(m0);
        }
        for(Object object0: this.w) {
            WeakReference weakReference0 = (WeakReference)object0;
            j j1 = (j)weakReference0.get();
            if(j1 == null) {
                this.w.remove(weakReference0);
            }
            else if(!z) {
                z = j1.k(m0);
            }
        }
        return z;
    }

    public boolean m(g g0) {
        boolean z = false;
        if(this.w.isEmpty()) {
            return false;
        }
        this.i0();
        for(Object object0: this.w) {
            WeakReference weakReference0 = (WeakReference)object0;
            j j0 = (j)weakReference0.get();
            if(j0 == null) {
                this.w.remove(weakReference0);
            }
            else {
                z = j0.f(this, g0);
                if(z) {
                    break;
                }
            }
        }
        this.h0();
        if(z) {
            this.x = g0;
        }
        return z;
    }

    public int n(int v) {
        return this.o(v, 0);
    }

    public int o(int v, int v1) {
        int v2 = this.size();
        if(v1 < 0) {
            v1 = 0;
        }
        while(v1 < v2) {
            if(((g)this.f.get(v1)).getGroupId() == v) {
                return v1;
            }
            ++v1;
        }
        return -1;
    }

    private static int p(ArrayList arrayList0, int v) {
        for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
            if(((g)arrayList0.get(v1)).f() <= v) {
                return v1 + 1;
            }
        }
        return 0;
    }

    @Override  // android.view.Menu
    public boolean performIdentifierAction(int v, int v1) {
        return this.O(this.findItem(v), v1);
    }

    @Override  // android.view.Menu
    public boolean performShortcut(int v, KeyEvent keyEvent0, int v1) {
        g g0 = this.r(v, keyEvent0);
        boolean z = g0 == null ? false : this.O(g0, v1);
        if((v1 & 2) != 0) {
            this.e(true);
        }
        return z;
    }

    public int q(int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(((g)this.f.get(v2)).getItemId() == v) {
                return v2;
            }
        }
        return -1;
    }

    g r(int v, KeyEvent keyEvent0) {
        ArrayList arrayList0 = this.v;
        arrayList0.clear();
        this.s(arrayList0, v, keyEvent0);
        if(arrayList0.isEmpty()) {
            return null;
        }
        int v1 = keyEvent0.getMetaState();
        KeyCharacterMap.KeyData keyCharacterMap$KeyData0 = new KeyCharacterMap.KeyData();
        keyEvent0.getKeyData(keyCharacterMap$KeyData0);
        int v2 = arrayList0.size();
        if(v2 == 1) {
            return (g)arrayList0.get(0);
        }
        boolean z = this.J();
        for(int v3 = 0; v3 < v2; ++v3) {
            g g0 = (g)arrayList0.get(v3);
            int v4 = z ? g0.getAlphabeticShortcut() : g0.getNumericShortcut();
            if(v4 == keyCharacterMap$KeyData0.meta[0] && (v1 & 2) == 0 || v4 == keyCharacterMap$KeyData0.meta[2] && (v1 & 2) != 0 || z && v4 == 8 && v == 67) {
                return g0;
            }
        }
        return null;
    }

    @Override  // android.view.Menu
    public void removeGroup(int v) {
        int v1 = this.n(v);
        if(v1 >= 0) {
            int v2 = this.f.size();
            for(int v3 = 0; v3 < v2 - v1 && ((g)this.f.get(v1)).getGroupId() == v; ++v3) {
                this.Q(v1, false);
            }
            this.N(true);
        }
    }

    @Override  // android.view.Menu
    public void removeItem(int v) {
        this.Q(this.q(v), true);
    }

    void s(List list0, int v, KeyEvent keyEvent0) {
        boolean z = this.J();
        int v1 = keyEvent0.getModifiers();
        KeyCharacterMap.KeyData keyCharacterMap$KeyData0 = new KeyCharacterMap.KeyData();
        if(!keyEvent0.getKeyData(keyCharacterMap$KeyData0) && v != 67) {
            return;
        }
        int v2 = this.f.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            g g0 = (g)this.f.get(v3);
            if(g0.hasSubMenu()) {
                ((e)g0.getSubMenu()).s(list0, v, keyEvent0);
            }
            int v4 = z ? g0.getAlphabeticShortcut() : g0.getNumericShortcut();
            if((v1 & 0x1100F) == ((z ? g0.getAlphabeticModifiers() : g0.getNumericModifiers()) & 0x1100F) && v4 != 0 && ((v4 == keyCharacterMap$KeyData0.meta[0] || v4 == keyCharacterMap$KeyData0.meta[2] || z && v4 == 8 && v == 67) && g0.isEnabled())) {
                list0.add(g0);
            }
        }
    }

    @Override  // android.view.Menu
    public void setGroupCheckable(int v, boolean z, boolean z1) {
        int v1 = this.f.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            g g0 = (g)this.f.get(v2);
            if(g0.getGroupId() == v) {
                g0.t(z1);
                g0.setCheckable(z);
            }
        }
    }

    @Override  // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override  // android.view.Menu
    public void setGroupEnabled(int v, boolean z) {
        int v1 = this.f.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            g g0 = (g)this.f.get(v2);
            if(g0.getGroupId() == v) {
                g0.setEnabled(z);
            }
        }
    }

    @Override  // android.view.Menu
    public void setGroupVisible(int v, boolean z) {
        int v1 = this.f.size();
        boolean z1 = false;
        for(int v2 = 0; v2 < v1; ++v2) {
            g g0 = (g)this.f.get(v2);
            if(g0.getGroupId() == v && g0.y(z)) {
                z1 = true;
            }
        }
        if(z1) {
            this.N(true);
        }
    }

    @Override  // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        this.N(false);
    }

    @Override  // android.view.Menu
    public int size() {
        return this.f.size();
    }

    public void t() {
        ArrayList arrayList0 = this.G();
        if(!this.k) {
            return;
        }
        boolean z = false;
        for(Object object0: this.w) {
            WeakReference weakReference0 = (WeakReference)object0;
            j j0 = (j)weakReference0.get();
            if(j0 == null) {
                this.w.remove(weakReference0);
            }
            else {
                z |= j0.d();
            }
        }
        if(z) {
            this.i.clear();
            this.j.clear();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                g g0 = (g)arrayList0.get(v1);
                if(g0.l()) {
                    this.i.add(g0);
                }
                else {
                    this.j.add(g0);
                }
            }
        }
        else {
            this.i.clear();
            this.j.clear();
            this.j.addAll(this.G());
        }
        this.k = false;
    }

    public ArrayList u() {
        this.t();
        return this.i;
    }

    protected String v() [...] // 潜在的解密器

    public Context w() {
        return this.a;
    }

    public g x() {
        return this.x;
    }

    public Drawable y() {
        return this.o;
    }

    public CharSequence z() {
        return this.n;
    }
}

