package com.google.android.material.transformation;

import K1.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends c {
    private int f;

    public ExpandableBehavior() {
        this.f = 0;
    }

    public ExpandableBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = 0;
    }

    protected a I(CoordinatorLayout coordinatorLayout0, View view0) {
        List list0 = coordinatorLayout0.r(view0);
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = (View)list0.get(v1);
            if(this.i(coordinatorLayout0, view0, view1)) {
                E.a(view1);
                return null;
            }
        }
        return null;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public abstract boolean i(CoordinatorLayout arg1, View arg2, View arg3);

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean l(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
        E.a(view1);
        throw null;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean p(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        if(!Y.S(view0)) {
            this.I(coordinatorLayout0, view0);
        }
        return false;
    }
}

