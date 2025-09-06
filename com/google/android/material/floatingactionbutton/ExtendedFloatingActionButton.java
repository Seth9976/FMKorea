package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import z1.j;
import z1.k;

public abstract class ExtendedFloatingActionButton extends MaterialButton implements b {
    public static class ExtendedFloatingActionButtonBehavior extends c {
        private Rect f;
        private boolean g;
        private boolean h;

        public ExtendedFloatingActionButtonBehavior() {
            this.g = false;
            this.h = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, k.p2);
            this.g = typedArray0.getBoolean(k.q2, false);
            this.h = typedArray0.getBoolean(k.r2, true);
            typedArray0.recycle();
        }

        protected void I(ExtendedFloatingActionButton extendedFloatingActionButton0) {
            ExtendedFloatingActionButton.j(extendedFloatingActionButton0, (this.h ? 3 : 0), null);
        }

        public boolean J(CoordinatorLayout coordinatorLayout0, ExtendedFloatingActionButton extendedFloatingActionButton0, Rect rect0) {
            return super.f(coordinatorLayout0, extendedFloatingActionButton0, rect0);
        }

        private static boolean K(View view0) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            return viewGroup$LayoutParams0 instanceof f ? ((f)viewGroup$LayoutParams0).e() instanceof BottomSheetBehavior : false;
        }

        public boolean L(CoordinatorLayout coordinatorLayout0, ExtendedFloatingActionButton extendedFloatingActionButton0, View view0) {
            if(view0 instanceof AppBarLayout) {
                this.P(coordinatorLayout0, ((AppBarLayout)view0), extendedFloatingActionButton0);
                return false;
            }
            if(ExtendedFloatingActionButtonBehavior.K(view0)) {
                this.Q(view0, extendedFloatingActionButton0);
            }
            return false;
        }

        public boolean M(CoordinatorLayout coordinatorLayout0, ExtendedFloatingActionButton extendedFloatingActionButton0, int v) {
            List list0 = coordinatorLayout0.r(extendedFloatingActionButton0);
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = (View)list0.get(v2);
                if(!(view0 instanceof AppBarLayout)) {
                    if(!ExtendedFloatingActionButtonBehavior.K(view0) || !this.Q(view0, extendedFloatingActionButton0)) {
                        continue;
                    }
                    break;
                }
                else if(this.P(coordinatorLayout0, ((AppBarLayout)view0), extendedFloatingActionButton0)) {
                    break;
                }
            }
            coordinatorLayout0.I(extendedFloatingActionButton0, v);
            return true;
        }

        private boolean N(View view0, ExtendedFloatingActionButton extendedFloatingActionButton0) {
            throw null;
        }

        protected void O(ExtendedFloatingActionButton extendedFloatingActionButton0) {
            ExtendedFloatingActionButton.j(extendedFloatingActionButton0, (this.h ? 2 : 1), null);
        }

        private boolean P(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, ExtendedFloatingActionButton extendedFloatingActionButton0) {
            if(!this.N(appBarLayout0, extendedFloatingActionButton0)) {
                return false;
            }
            if(this.f == null) {
                this.f = new Rect();
            }
            Rect rect0 = this.f;
            com.google.android.material.internal.c.a(coordinatorLayout0, appBarLayout0, rect0);
            if(rect0.bottom <= appBarLayout0.getMinimumHeightForVisibleOverlappingContent()) {
                this.O(extendedFloatingActionButton0);
                return true;
            }
            this.I(extendedFloatingActionButton0);
            return true;
        }

        private boolean Q(View view0, ExtendedFloatingActionButton extendedFloatingActionButton0) {
            if(this.N(view0, extendedFloatingActionButton0)) {
                throw null;
            }
            return false;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public boolean f(CoordinatorLayout coordinatorLayout0, View view0, Rect rect0) {
            E.a(view0);
            return this.J(coordinatorLayout0, null, rect0);
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

    class a extends Property {
        a(Class class0, String s) {
            super(class0, s);
        }

        public Float a(View view0) {
            return (float)view0.getLayoutParams().width;
        }

        public void b(View view0, Float float0) {
            view0.getLayoutParams().width = float0.intValue();
            view0.requestLayout();
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((View)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((View)object0), ((Float)object1));
        }
    }

    class com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.b extends Property {
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.b(Class class0, String s) {
            super(class0, s);
        }

        public Float a(View view0) {
            return (float)view0.getLayoutParams().height;
        }

        public void b(View view0, Float float0) {
            view0.getLayoutParams().height = float0.intValue();
            view0.requestLayout();
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((View)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((View)object0), ((Float)object1));
        }
    }

    class com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.c extends Property {
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.c(Class class0, String s) {
            super(class0, s);
        }

        public Float a(View view0) {
            return (float)Y.E(view0);
        }

        public void b(View view0, Float float0) {
            Y.C0(view0, float0.intValue(), view0.getPaddingTop(), Y.D(view0), view0.getPaddingBottom());
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((View)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((View)object0), ((Float)object1));
        }
    }

    class d extends Property {
        d(Class class0, String s) {
            super(class0, s);
        }

        public Float a(View view0) {
            return (float)Y.D(view0);
        }

        public void b(View view0, Float float0) {
            Y.C0(view0, Y.E(view0), view0.getPaddingTop(), float0.intValue(), view0.getPaddingBottom());
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((View)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((View)object0), ((Float)object1));
        }
    }

    public static abstract class e {
    }

    static final Property A;
    static final Property B;
    static final Property C;
    static final Property D;
    private static final int z;

    static {
        ExtendedFloatingActionButton.z = j.u;
        ExtendedFloatingActionButton.A = new a(Float.class, "width");
        ExtendedFloatingActionButton.B = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.b(Float.class, "height");
        ExtendedFloatingActionButton.C = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.c(Float.class, "paddingStart");
        ExtendedFloatingActionButton.D = new d(Float.class, "paddingEnd");
    }

    static void j(ExtendedFloatingActionButton extendedFloatingActionButton0, int v, e extendedFloatingActionButton$e0) {
        throw null;
    }
}

