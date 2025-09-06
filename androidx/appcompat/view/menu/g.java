package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import e.h;
import w.b;

public final class g implements b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private boolean D;
    private ContextMenu.ContextMenuInfo E;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private int i;
    private char j;
    private int k;
    private Drawable l;
    private int m;
    e n;
    private m o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private ColorStateList t;
    private PorterDuff.Mode u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    g(e e0, int v, int v1, int v2, int v3, CharSequence charSequence0, int v4) {
        this.i = 0x1000;
        this.k = 0x1000;
        this.m = 0;
        this.t = null;
        this.u = null;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 16;
        this.D = false;
        this.n = e0;
        this.a = v1;
        this.b = v;
        this.c = v2;
        this.d = v3;
        this.e = charSequence0;
        this.z = v4;
    }

    boolean A() {
        return this.n.K() && this.g() != 0;
    }

    public boolean B() {
        return (this.z & 4) == 4;
    }

    @Override  // w.b
    public b a(androidx.core.view.b b0) {
        class a implements androidx.core.view.b.b {
            final g a;

            @Override  // androidx.core.view.b$b
            public void onActionProviderVisibilityChanged(boolean z) {
                g.this.n.M(g.this);
            }
        }

        androidx.core.view.b b1 = this.B;
        if(b1 != null) {
            b1.g();
        }
        this.A = null;
        this.B = b0;
        this.n.N(true);
        androidx.core.view.b b2 = this.B;
        if(b2 != null) {
            b2.i(new a(this));
        }
        return this;
    }

    @Override  // w.b
    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.n.L(this);
    }

    @Override  // w.b
    public boolean collapseActionView() {
        if((this.z & 8) == 0) {
            return false;
        }
        if(this.A == null) {
            return true;
        }
        return this.C == null || this.C.onMenuItemActionCollapse(this) ? this.n.f(this) : false;
    }

    private static void d(StringBuilder stringBuilder0, int v, int v1, String s) {
        if((v & v1) == v1) {
            stringBuilder0.append(s);
        }
    }

    private Drawable e(Drawable drawable0) {
        if(drawable0 != null && this.x && (this.v || this.w)) {
            drawable0 = drawable0.mutate();
            if(this.v) {
                androidx.core.graphics.drawable.a.o(drawable0, this.t);
            }
            if(this.w) {
                androidx.core.graphics.drawable.a.p(drawable0, this.u);
            }
            this.x = false;
        }
        return drawable0;
    }

    @Override  // w.b
    public boolean expandActionView() {
        if(!this.j()) {
            return false;
        }
        return this.C == null || this.C.onMenuItemActionExpand(this) ? this.n.m(this) : false;
    }

    public int f() {
        return this.d;
    }

    // 去混淆评级： 低(20)
    char g() {
        return this.n.J() ? this.j : this.h;
    }

    @Override  // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override  // w.b
    public View getActionView() {
        View view0 = this.A;
        if(view0 != null) {
            return view0;
        }
        androidx.core.view.b b0 = this.B;
        if(b0 != null) {
            View view1 = b0.c(this);
            this.A = view1;
            return view1;
        }
        return null;
    }

    @Override  // w.b
    public int getAlphabeticModifiers() {
        return this.k;
    }

    @Override  // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override  // w.b
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override  // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override  // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable0 = this.l;
        if(drawable0 != null) {
            return this.e(drawable0);
        }
        if(this.m != 0) {
            Drawable drawable1 = f.a.b(this.n.w(), this.m);
            this.m = 0;
            this.l = drawable1;
            return this.e(drawable1);
        }
        return null;
    }

    @Override  // w.b
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override  // w.b
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    @Override  // android.view.MenuItem
    public Intent getIntent() {
        return this.g;
    }

    @Override  // android.view.MenuItem
    public int getItemId() {
        return this.a;
    }

    @Override  // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override  // w.b
    public int getNumericModifiers() {
        return this.i;
    }

    @Override  // android.view.MenuItem
    public char getNumericShortcut() {
        return this.h;
    }

    @Override  // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override  // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitle() {
        return this.e;
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f == null ? this.e : this.f;
    }

    @Override  // w.b
    public CharSequence getTooltipText() {
        return this.s;
    }

    String h() {
        int v = this.g();
        if(v == 0) {
            return "";
        }
        Resources resources0 = this.n.w().getResources();
        StringBuilder stringBuilder0 = new StringBuilder();
        if(ViewConfiguration.get(this.n.w()).hasPermanentMenuKey()) {
            stringBuilder0.append(resources0.getString(h.m));
        }
        int v1 = this.n.J() ? this.k : this.i;
        g.d(stringBuilder0, v1, 0x10000, resources0.getString(h.i));
        g.d(stringBuilder0, v1, 0x1000, resources0.getString(h.e));
        g.d(stringBuilder0, v1, 2, resources0.getString(h.d));
        g.d(stringBuilder0, v1, 1, resources0.getString(h.j));
        g.d(stringBuilder0, v1, 4, resources0.getString(h.l));
        g.d(stringBuilder0, v1, 8, resources0.getString(h.h));
        switch(v) {
            case 8: {
                stringBuilder0.append(resources0.getString(h.f));
                return stringBuilder0.toString();
            }
            case 10: {
                stringBuilder0.append(resources0.getString(h.g));
                return stringBuilder0.toString();
            }
            case 0x20: {
                stringBuilder0.append(resources0.getString(h.k));
                return stringBuilder0.toString();
            }
            default: {
                stringBuilder0.append(((char)v));
                return stringBuilder0.toString();
            }
        }
    }

    @Override  // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    CharSequence i(androidx.appcompat.view.menu.k.a k$a0) {
        return k$a0 == null || !k$a0.d() ? this.getTitle() : this.getTitleCondensed();
    }

    @Override  // w.b
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override  // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override  // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override  // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.MenuItem
    public boolean isVisible() {
        return this.B == null || !this.B.f() ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        if((this.z & 8) != 0) {
            if(this.A == null) {
                androidx.core.view.b b0 = this.B;
                if(b0 != null) {
                    this.A = b0.c(this);
                }
            }
            return this.A != null;
        }
        return false;
    }

    public boolean k() {
        if(this.q != null && this.q.onMenuItemClick(this)) {
            return true;
        }
        if(this.n.h(this.n, this)) {
            return true;
        }
        Runnable runnable0 = this.p;
        if(runnable0 != null) {
            runnable0.run();
            return true;
        }
        if(this.g != null) {
            try {
                this.n.w().startActivity(this.g);
                return true;
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                Log.e("MenuItemImpl", "Can\'t find activity to handle intent; ignoring", activityNotFoundException0);
            }
        }
        return this.B != null && this.B.d();
    }

    public boolean l() {
        return (this.y & 0x20) == 0x20;
    }

    public boolean m() {
        return (this.y & 4) != 0;
    }

    public boolean n() {
        return (this.z & 1) == 1;
    }

    public boolean o() {
        return (this.z & 2) == 2;
    }

    public b p(int v) {
        Context context0 = this.n.w();
        this.q(LayoutInflater.from(context0).inflate(v, new LinearLayout(context0), false));
        return this;
    }

    public b q(View view0) {
        this.A = view0;
        this.B = null;
        if(view0 != null && view0.getId() == -1) {
            int v = this.a;
            if(v > 0) {
                view0.setId(v);
            }
        }
        this.n.L(this);
        return this;
    }

    public void r(boolean z) {
        this.D = z;
        this.n.N(false);
    }

    void s(boolean z) {
        int v = this.y;
        int v1 = (z ? 2 : 0) | v & -3;
        this.y = v1;
        if(v != v1) {
            this.n.N(false);
        }
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider0) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override  // w.b
    public MenuItem setActionView(int v) {
        return this.p(v);
    }

    @Override  // w.b
    public MenuItem setActionView(View view0) {
        return this.q(view0);
    }

    @Override  // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if(this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.n.N(false);
        return this;
    }

    @Override  // w.b
    public MenuItem setAlphabeticShortcut(char c, int v) {
        if(this.j == c && this.k == v) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(v);
        this.n.N(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int v = this.y;
        int v1 = z | v & -2;
        this.y = v1;
        if(v != v1) {
            this.n.N(false);
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if((this.y & 4) != 0) {
            this.n.Y(this);
            return this;
        }
        this.s(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence0) {
        return this.setContentDescription(charSequence0);
    }

    @Override  // w.b
    public b setContentDescription(CharSequence charSequence0) {
        this.r = charSequence0;
        this.n.N(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if(z) {
            this.y |= 16;
        }
        else {
            this.y &= -17;
        }
        this.n.N(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(int v) {
        this.l = null;
        this.m = v;
        this.x = true;
        this.n.N(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable0) {
        this.m = 0;
        this.l = drawable0;
        this.x = true;
        this.n.N(false);
        return this;
    }

    @Override  // w.b
    public MenuItem setIconTintList(ColorStateList colorStateList0) {
        this.t = colorStateList0;
        this.v = true;
        this.x = true;
        this.n.N(false);
        return this;
    }

    @Override  // w.b
    public MenuItem setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.u = porterDuff$Mode0;
        this.w = true;
        this.x = true;
        this.n.N(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIntent(Intent intent0) {
        this.g = intent0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if(this.h == c) {
            return this;
        }
        this.h = c;
        this.n.N(false);
        return this;
    }

    @Override  // w.b
    public MenuItem setNumericShortcut(char c, int v) {
        if(this.h == c && this.i == v) {
            return this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(v);
        this.n.N(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        this.C = menuItem$OnActionExpandListener0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        this.q = menuItem$OnMenuItemClickListener0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setShortcut(char c, char c1) {
        this.h = c;
        this.j = Character.toLowerCase(c1);
        this.n.N(false);
        return this;
    }

    @Override  // w.b
    public MenuItem setShortcut(char c, char c1, int v, int v1) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(v);
        this.j = Character.toLowerCase(c1);
        this.k = KeyEvent.normalizeMetaState(v1);
        this.n.N(false);
        return this;
    }

    @Override  // w.b
    public void setShowAsAction(int v) {
        if((v & 3) != 0 && (v & 3) != 1 && (v & 3) != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = v;
        this.n.L(this);
    }

    @Override  // w.b
    public MenuItem setShowAsActionFlags(int v) {
        return this.w(v);
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(int v) {
        return this.setTitle(this.n.w().getString(v));
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence0) {
        this.e = charSequence0;
        this.n.N(false);
        m m0 = this.o;
        if(m0 != null) {
            m0.setHeaderTitle(charSequence0);
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence0) {
        this.f = charSequence0;
        this.n.N(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence0) {
        return this.setTooltipText(charSequence0);
    }

    @Override  // w.b
    public b setTooltipText(CharSequence charSequence0) {
        this.s = charSequence0;
        this.n.N(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if(this.y(z)) {
            this.n.M(this);
        }
        return this;
    }

    public void t(boolean z) {
        this.y = (z ? 4 : 0) | this.y & -5;
    }

    @Override
    public String toString() {
        return this.e == null ? null : this.e.toString();
    }

    public void u(boolean z) {
        if(z) {
            this.y |= 0x20;
            return;
        }
        this.y &= -33;
    }

    void v(ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        this.E = contextMenu$ContextMenuInfo0;
    }

    public b w(int v) {
        this.setShowAsAction(v);
        return this;
    }

    public void x(m m0) {
        this.o = m0;
        m0.setHeaderTitle(this.getTitle());
    }

    boolean y(boolean z) {
        int v = this.y;
        int v1 = (z ? 0 : 8) | v & -9;
        this.y = v1;
        return v != v1;
    }

    public boolean z() {
        return this.n.C();
    }
}

