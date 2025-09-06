package com.google.android.material.search;

import M1.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class SearchView extends FrameLayout implements b, androidx.coordinatorlayout.widget.CoordinatorLayout.b {
    public static class Behavior extends c {
        public Behavior() {
        }

        public Behavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public boolean I(CoordinatorLayout coordinatorLayout0, SearchView searchView0, View view0) {
            throw null;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public boolean l(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            E.a(view0);
            return this.I(coordinatorLayout0, null, view1);
        }
    }

}

