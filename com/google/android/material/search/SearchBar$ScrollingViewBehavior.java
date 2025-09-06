package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior;
import com.google.android.material.appbar.AppBarLayout;

public class SearchBar.ScrollingViewBehavior extends ScrollingViewBehavior {
    private boolean m;

    public SearchBar.ScrollingViewBehavior() {
        this.m = false;
    }

    public SearchBar.ScrollingViewBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.m = false;
    }

    @Override  // com.google.android.material.appbar.e
    protected boolean T() {
        return true;
    }

    private void Y(AppBarLayout appBarLayout0) {
        appBarLayout0.setBackgroundColor(0);
        appBarLayout0.setTargetElevation(0.0f);
    }

    @Override  // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
    public boolean l(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
        boolean z = super.l(coordinatorLayout0, view0, view1);
        if(!this.m && view1 instanceof AppBarLayout) {
            this.m = true;
            this.Y(((AppBarLayout)view1));
        }
        return z;
    }
}

