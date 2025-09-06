package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import w.a;

public class d extends b implements Menu {
    private final a d;

    public d(Context context0, a a0) {
        super(context0);
        if(a0 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.d = a0;
    }

    @Override  // android.view.Menu
    public MenuItem add(int v) {
        return this.c(this.d.add(v));
    }

    @Override  // android.view.Menu
    public MenuItem add(int v, int v1, int v2, int v3) {
        return this.c(this.d.add(v, v1, v2, v3));
    }

    @Override  // android.view.Menu
    public MenuItem add(int v, int v1, int v2, CharSequence charSequence0) {
        return this.c(this.d.add(v, v1, v2, charSequence0));
    }

    @Override  // android.view.Menu
    public MenuItem add(CharSequence charSequence0) {
        return this.c(this.d.add(charSequence0));
    }

    @Override  // android.view.Menu
    public int addIntentOptions(int v, int v1, int v2, ComponentName componentName0, Intent[] arr_intent, Intent intent0, int v3, MenuItem[] arr_menuItem) {
        MenuItem[] arr_menuItem1 = arr_menuItem == null ? null : new MenuItem[arr_menuItem.length];
        int v4 = this.d.addIntentOptions(v, v1, v2, componentName0, arr_intent, intent0, v3, arr_menuItem1);
        if(arr_menuItem1 != null) {
            for(int v5 = 0; v5 < arr_menuItem1.length; ++v5) {
                arr_menuItem[v5] = this.c(arr_menuItem1[v5]);
            }
        }
        return v4;
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v) {
        return this.d(this.d.addSubMenu(v));
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v, int v1, int v2, int v3) {
        return this.d(this.d.addSubMenu(v, v1, v2, v3));
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v, int v1, int v2, CharSequence charSequence0) {
        return this.d(this.d.addSubMenu(v, v1, v2, charSequence0));
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence0) {
        return this.d(this.d.addSubMenu(charSequence0));
    }

    @Override  // android.view.Menu
    public void clear() {
        this.e();
        this.d.clear();
    }

    @Override  // android.view.Menu
    public void close() {
        this.d.close();
    }

    @Override  // android.view.Menu
    public MenuItem findItem(int v) {
        return this.c(this.d.findItem(v));
    }

    @Override  // android.view.Menu
    public MenuItem getItem(int v) {
        return this.c(this.d.getItem(v));
    }

    @Override  // android.view.Menu
    public boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    @Override  // android.view.Menu
    public boolean isShortcutKey(int v, KeyEvent keyEvent0) {
        return this.d.isShortcutKey(v, keyEvent0);
    }

    @Override  // android.view.Menu
    public boolean performIdentifierAction(int v, int v1) {
        return this.d.performIdentifierAction(v, v1);
    }

    @Override  // android.view.Menu
    public boolean performShortcut(int v, KeyEvent keyEvent0, int v1) {
        return this.d.performShortcut(v, keyEvent0, v1);
    }

    @Override  // android.view.Menu
    public void removeGroup(int v) {
        this.f(v);
        this.d.removeGroup(v);
    }

    @Override  // android.view.Menu
    public void removeItem(int v) {
        this.g(v);
        this.d.removeItem(v);
    }

    @Override  // android.view.Menu
    public void setGroupCheckable(int v, boolean z, boolean z1) {
        this.d.setGroupCheckable(v, z, z1);
    }

    @Override  // android.view.Menu
    public void setGroupEnabled(int v, boolean z) {
        this.d.setGroupEnabled(v, z);
    }

    @Override  // android.view.Menu
    public void setGroupVisible(int v, boolean z) {
        this.d.setGroupVisible(v, z);
    }

    @Override  // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    @Override  // android.view.Menu
    public int size() {
        return this.d.size();
    }
}

