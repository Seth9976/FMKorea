package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class m extends e implements SubMenu {
    private e B;
    private g C;

    public m(Context context0, e e0, g g0) {
        super(context0);
        this.B = e0;
        this.C = g0;
    }

    @Override  // androidx.appcompat.view.menu.e
    public e F() {
        return this.B.F();
    }

    @Override  // androidx.appcompat.view.menu.e
    public boolean I() {
        return this.B.I();
    }

    @Override  // androidx.appcompat.view.menu.e
    public boolean J() {
        return this.B.J();
    }

    @Override  // androidx.appcompat.view.menu.e
    public boolean K() {
        return this.B.K();
    }

    @Override  // androidx.appcompat.view.menu.e
    public void W(a e$a0) {
        this.B.W(e$a0);
    }

    @Override  // androidx.appcompat.view.menu.e
    public boolean f(g g0) {
        return this.B.f(g0);
    }

    @Override  // android.view.SubMenu
    public MenuItem getItem() {
        return this.C;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.view.menu.e
    boolean h(e e0, MenuItem menuItem0) {
        return super.h(e0, menuItem0) || this.B.h(e0, menuItem0);
    }

    public Menu j0() {
        return this.B;
    }

    @Override  // androidx.appcompat.view.menu.e
    public boolean m(g g0) {
        return this.B.m(g0);
    }

    @Override  // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.B.setGroupDividerEnabled(z);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderIcon(int v) {
        return (SubMenu)super.Z(v);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable0) {
        return (SubMenu)super.a0(drawable0);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderTitle(int v) {
        return (SubMenu)super.c0(v);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence0) {
        return (SubMenu)super.d0(charSequence0);
    }

    @Override  // android.view.SubMenu
    public SubMenu setHeaderView(View view0) {
        return (SubMenu)super.e0(view0);
    }

    @Override  // android.view.SubMenu
    public SubMenu setIcon(int v) {
        this.C.setIcon(v);
        return this;
    }

    @Override  // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable0) {
        this.C.setIcon(drawable0);
        return this;
    }

    @Override  // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.B.setQwertyMode(z);
    }

    // 去混淆评级： 低(25)
    @Override  // androidx.appcompat.view.menu.e
    public String v() {
        int v = this.C == null ? 0 : this.C.getItemId();
        return v == 0 ? null : "android:menu:actionviewstates:" + v;
    }
}

