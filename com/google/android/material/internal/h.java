package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;

public class h extends e {
    public h(Context context0) {
        super(context0);
    }

    @Override  // androidx.appcompat.view.menu.e
    public SubMenu addSubMenu(int v, int v1, int v2, CharSequence charSequence0) {
        g g0 = (g)this.a(v, v1, v2, charSequence0);
        SubMenu subMenu0 = new j(this.w(), this, g0);
        g0.x(((m)subMenu0));
        return subMenu0;
    }
}

