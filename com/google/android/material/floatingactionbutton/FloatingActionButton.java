package com.google.android.material.floatingactionbutton;

import K1.a;
import S1.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.u;
import java.util.List;
import z1.k;

public abstract class FloatingActionButton extends u implements a, n, b {
    public static class BaseBehavior extends c {
        private Rect f;
        private boolean g;

        public BaseBehavior() {
            this.g = true;
        }

        public BaseBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, k.t2);
            this.g = typedArray0.getBoolean(k.u2, true);
            typedArray0.recycle();
        }

        public boolean I(CoordinatorLayout coordinatorLayout0, FloatingActionButton floatingActionButton0, Rect rect0) {
            throw null;
        }

        private static boolean J(View view0) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            return viewGroup$LayoutParams0 instanceof f ? ((f)viewGroup$LayoutParams0).e() instanceof BottomSheetBehavior : false;
        }

        private void K(CoordinatorLayout coordinatorLayout0, FloatingActionButton floatingActionButton0) {
            throw null;
        }

        public boolean L(CoordinatorLayout coordinatorLayout0, FloatingActionButton floatingActionButton0, View view0) {
            if(view0 instanceof AppBarLayout) {
                this.O(coordinatorLayout0, ((AppBarLayout)view0), floatingActionButton0);
                return false;
            }
            if(BaseBehavior.J(view0)) {
                this.P(view0, floatingActionButton0);
            }
            return false;
        }

        public boolean M(CoordinatorLayout coordinatorLayout0, FloatingActionButton floatingActionButton0, int v) {
            List list0 = coordinatorLayout0.r(floatingActionButton0);
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = (View)list0.get(v2);
                if(!(view0 instanceof AppBarLayout)) {
                    if(!BaseBehavior.J(view0) || !this.P(view0, floatingActionButton0)) {
                        continue;
                    }
                    break;
                }
                else if(this.O(coordinatorLayout0, ((AppBarLayout)view0), floatingActionButton0)) {
                    break;
                }
            }
            coordinatorLayout0.I(floatingActionButton0, v);
            this.K(coordinatorLayout0, floatingActionButton0);
            return true;
        }

        private boolean N(View view0, FloatingActionButton floatingActionButton0) {
            throw null;
        }

        private boolean O(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, FloatingActionButton floatingActionButton0) {
            if(!this.N(appBarLayout0, floatingActionButton0)) {
                return false;
            }
            if(this.f == null) {
                this.f = new Rect();
            }
            Rect rect0 = this.f;
            com.google.android.material.internal.c.a(coordinatorLayout0, appBarLayout0, rect0);
            throw rect0.bottom > appBarLayout0.getMinimumHeightForVisibleOverlappingContent() ? null : null;
        }

        private boolean P(View view0, FloatingActionButton floatingActionButton0) {
            if(this.N(view0, floatingActionButton0)) {
                throw null;
            }
            return false;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public boolean f(CoordinatorLayout coordinatorLayout0, View view0, Rect rect0) {
            E.a(view0);
            return this.I(coordinatorLayout0, null, rect0);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public void k(f coordinatorLayout$f0) {
            if(coordinatorLayout$f0.h == 0) {
                coordinatorLayout$f0.h = 80;
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public boolean l(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            E.a(view0);
            return this.L(coordinatorLayout0, null, view1);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public boolean p(CoordinatorLayout coordinatorLayout0, View view0, int v) {
            E.a(view0);
            return this.M(coordinatorLayout0, null, v);
        }
    }

    public static class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public boolean I(CoordinatorLayout coordinatorLayout0, FloatingActionButton floatingActionButton0, Rect rect0) {
            return super.I(coordinatorLayout0, floatingActionButton0, rect0);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public boolean L(CoordinatorLayout coordinatorLayout0, FloatingActionButton floatingActionButton0, View view0) {
            return super.L(coordinatorLayout0, floatingActionButton0, view0);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public boolean M(CoordinatorLayout coordinatorLayout0, FloatingActionButton floatingActionButton0, int v) {
            return super.M(coordinatorLayout0, floatingActionButton0, v);
        }

        @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior
        public void k(f coordinatorLayout$f0) {
            super.k(coordinatorLayout$f0);
        }
    }

}

