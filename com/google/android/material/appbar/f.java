package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

abstract class f extends c {
    private g f;
    private int g;
    private int h;

    public f() {
        this.g = 0;
        this.h = 0;
    }

    public f(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.g = 0;
        this.h = 0;
    }

    public int I() {
        return this.f == null ? 0 : this.f.b();
    }

    protected void J(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        coordinatorLayout0.I(view0, v);
    }

    public boolean K(int v) {
        g g0 = this.f;
        if(g0 != null) {
            return g0.e(v);
        }
        this.g = v;
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean p(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        this.J(coordinatorLayout0, view0, v);
        if(this.f == null) {
            this.f = new g(view0);
        }
        this.f.c();
        this.f.a();
        int v1 = this.g;
        if(v1 != 0) {
            this.f.e(v1);
            this.g = 0;
        }
        int v2 = this.h;
        if(v2 != 0) {
            this.f.d(v2);
            this.h = 0;
        }
        return true;
    }
}

