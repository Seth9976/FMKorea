package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.g;

public final class e extends androidx.appcompat.view.menu.e {
    private final Class B;
    private final int C;

    public e(Context context0, Class class0, int v) {
        super(context0);
        this.B = class0;
        this.C = v;
    }

    @Override  // androidx.appcompat.view.menu.e
    protected MenuItem a(int v, int v1, int v2, CharSequence charSequence0) {
        if(this.size() + 1 <= this.C) {
            this.i0();
            MenuItem menuItem0 = super.a(v, v1, v2, charSequence0);
            if(menuItem0 instanceof g) {
                ((g)menuItem0).t(true);
            }
            this.h0();
            return menuItem0;
        }
        String s = this.B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + s + " is " + this.C + ". Limit can be checked with " + s + "#getMaxItemCount()");
    }

    @Override  // androidx.appcompat.view.menu.e
    public SubMenu addSubMenu(int v, int v1, int v2, CharSequence charSequence0) {
        throw new UnsupportedOperationException(this.B.getSimpleName() + " does not support submenus");
    }
}

