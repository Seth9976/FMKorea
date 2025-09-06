package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import androidx.appcompat.app.E;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;
import z1.j;

public abstract class BottomAppBar extends Toolbar implements b {
    public static class Behavior extends HideBottomViewOnScrollBehavior {
        class a implements View.OnLayoutChangeListener {
            final Behavior a;

            @Override  // android.view.View$OnLayoutChangeListener
            public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                E.a(Behavior.this.s.get());
                view0.removeOnLayoutChangeListener(this);
            }
        }

        private final Rect r;
        private WeakReference s;
        private int t;
        private final View.OnLayoutChangeListener u;

        public Behavior() {
            this.u = new a(this);
            this.r = new Rect();
        }

        public Behavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.u = new a(this);
            this.r = new Rect();
        }

        @Override  // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public boolean E(CoordinatorLayout coordinatorLayout0, View view0, View view1, View view2, int v, int v1) {
            E.a(view0);
            return this.T(coordinatorLayout0, null, view1, view2, v, v1);
        }

        public boolean S(CoordinatorLayout coordinatorLayout0, BottomAppBar bottomAppBar0, int v) {
            this.s = new WeakReference(bottomAppBar0);
            View view0 = BottomAppBar.U(bottomAppBar0);
            if(view0 != null && !Y.S(view0)) {
                BottomAppBar.W(bottomAppBar0, view0);
                this.t = ((f)view0.getLayoutParams()).bottomMargin;
                view0.addOnLayoutChangeListener(this.u);
                BottomAppBar.T(bottomAppBar0);
            }
            coordinatorLayout0.I(bottomAppBar0, v);
            return super.p(coordinatorLayout0, bottomAppBar0, v);
        }

        public boolean T(CoordinatorLayout coordinatorLayout0, BottomAppBar bottomAppBar0, View view0, View view1, int v, int v1) {
            throw null;
        }

        @Override  // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public boolean p(CoordinatorLayout coordinatorLayout0, View view0, int v) {
            E.a(view0);
            return this.S(coordinatorLayout0, null, v);
        }
    }

    private static final int c0;
    private static final int d0;
    private static final int e0;

    static {
        BottomAppBar.c0 = j.o;
        BottomAppBar.d0 = z1.a.C;
        BottomAppBar.e0 = z1.a.J;
    }

    static void T(BottomAppBar bottomAppBar0) {
        throw null;
    }

    static View U(BottomAppBar bottomAppBar0) {
        throw null;
    }

    private static void W(BottomAppBar bottomAppBar0, View view0) {
        ((f)view0.getLayoutParams()).d = 17;
        throw null;
    }
}

