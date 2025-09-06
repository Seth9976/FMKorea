package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import w.b;

public class a implements b {
    private final int a;
    private final int b;
    private final int c;
    private CharSequence d;
    private CharSequence e;
    private Intent f;
    private char g;
    private int h;
    private char i;
    private int j;
    private Drawable k;
    private Context l;
    private MenuItem.OnMenuItemClickListener m;
    private CharSequence n;
    private CharSequence o;
    private ColorStateList p;
    private PorterDuff.Mode q;
    private boolean r;
    private boolean s;
    private int t;

    public a(Context context0, int v, int v1, int v2, int v3, CharSequence charSequence0) {
        this.h = 0x1000;
        this.j = 0x1000;
        this.p = null;
        this.q = null;
        this.r = false;
        this.s = false;
        this.t = 16;
        this.l = context0;
        this.a = v1;
        this.b = v;
        this.c = v3;
        this.d = charSequence0;
    }

    @Override  // w.b
    public b a(androidx.core.view.b b0) {
        throw new UnsupportedOperationException();
    }

    @Override  // w.b
    public androidx.core.view.b b() {
        return null;
    }

    private void c() {
        Drawable drawable0 = this.k;
        if(drawable0 != null && (this.r || this.s)) {
            this.k = drawable0;
            Drawable drawable1 = drawable0.mutate();
            this.k = drawable1;
            if(this.r) {
                androidx.core.graphics.drawable.a.o(drawable1, this.p);
            }
            if(this.s) {
                androidx.core.graphics.drawable.a.p(this.k, this.q);
            }
        }
    }

    @Override  // w.b
    public boolean collapseActionView() {
        return false;
    }

    public b d(int v) {
        throw new UnsupportedOperationException();
    }

    public b e(View view0) {
        throw new UnsupportedOperationException();
    }

    @Override  // w.b
    public boolean expandActionView() {
        return false;
    }

    public b f(int v) {
        return this;
    }

    @Override  // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override  // w.b
    public View getActionView() {
        return null;
    }

    @Override  // w.b
    public int getAlphabeticModifiers() {
        return this.j;
    }

    @Override  // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.i;
    }

    @Override  // w.b
    public CharSequence getContentDescription() {
        return this.n;
    }

    @Override  // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override  // android.view.MenuItem
    public Drawable getIcon() {
        return this.k;
    }

    @Override  // w.b
    public ColorStateList getIconTintList() {
        return this.p;
    }

    @Override  // w.b
    public PorterDuff.Mode getIconTintMode() {
        return this.q;
    }

    @Override  // android.view.MenuItem
    public Intent getIntent() {
        return this.f;
    }

    @Override  // android.view.MenuItem
    public int getItemId() {
        return this.a;
    }

    @Override  // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override  // w.b
    public int getNumericModifiers() {
        return this.h;
    }

    @Override  // android.view.MenuItem
    public char getNumericShortcut() {
        return this.g;
    }

    @Override  // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override  // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitle() {
        return this.d;
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.e == null ? this.d : this.e;
    }

    @Override  // w.b
    public CharSequence getTooltipText() {
        return this.o;
    }

    @Override  // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override  // w.b
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override  // android.view.MenuItem
    public boolean isCheckable() {
        return (this.t & 1) != 0;
    }

    @Override  // android.view.MenuItem
    public boolean isChecked() {
        return (this.t & 2) != 0;
    }

    @Override  // android.view.MenuItem
    public boolean isEnabled() {
        return (this.t & 16) != 0;
    }

    @Override  // android.view.MenuItem
    public boolean isVisible() {
        return (this.t & 8) == 0;
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider0) {
        throw new UnsupportedOperationException();
    }

    @Override  // w.b
    public MenuItem setActionView(int v) {
        return this.d(v);
    }

    @Override  // w.b
    public MenuItem setActionView(View view0) {
        return this.e(view0);
    }

    @Override  // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.i = Character.toLowerCase(c);
        return this;
    }

    @Override  // w.b
    public MenuItem setAlphabeticShortcut(char c, int v) {
        this.i = Character.toLowerCase(c);
        this.j = KeyEvent.normalizeMetaState(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.t = z | this.t & -2;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.t = (z ? 2 : 0) | this.t & -3;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence0) {
        return this.setContentDescription(charSequence0);
    }

    @Override  // w.b
    public b setContentDescription(CharSequence charSequence0) {
        this.n = charSequence0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.t = (z ? 16 : 0) | this.t & -17;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(int v) {
        this.k = androidx.core.content.a.getDrawable(this.l, v);
        this.c();
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable0) {
        this.k = drawable0;
        this.c();
        return this;
    }

    @Override  // w.b
    public MenuItem setIconTintList(ColorStateList colorStateList0) {
        this.p = colorStateList0;
        this.r = true;
        this.c();
        return this;
    }

    @Override  // w.b
    public MenuItem setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.q = porterDuff$Mode0;
        this.s = true;
        this.c();
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIntent(Intent intent0) {
        this.f = intent0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.g = c;
        return this;
    }

    @Override  // w.b
    public MenuItem setNumericShortcut(char c, int v) {
        this.g = c;
        this.h = KeyEvent.normalizeMetaState(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        throw new UnsupportedOperationException();
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        this.m = menuItem$OnMenuItemClickListener0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setShortcut(char c, char c1) {
        this.g = c;
        this.i = Character.toLowerCase(c1);
        return this;
    }

    @Override  // w.b
    public MenuItem setShortcut(char c, char c1, int v, int v1) {
        this.g = c;
        this.h = KeyEvent.normalizeMetaState(v);
        this.i = Character.toLowerCase(c1);
        this.j = KeyEvent.normalizeMetaState(v1);
        return this;
    }

    @Override  // w.b
    public void setShowAsAction(int v) {
    }

    @Override  // w.b
    public MenuItem setShowAsActionFlags(int v) {
        return this.f(v);
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(int v) {
        this.d = this.l.getResources().getString(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence0) {
        this.d = charSequence0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence0) {
        this.e = charSequence0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence0) {
        return this.setTooltipText(charSequence0);
    }

    @Override  // w.b
    public b setTooltipText(CharSequence charSequence0) {
        this.o = charSequence0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int v = 8;
        int v1 = this.t & 8;
        if(z) {
            v = 0;
        }
        this.t = v1 | v;
        return this;
    }
}

