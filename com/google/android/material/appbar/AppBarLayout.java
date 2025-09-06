package com.google.android.material.appbar;

import C.z;
import S1.g;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.B;
import androidx.core.view.G;
import androidx.core.view.Y;
import androidx.core.view.y0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z1.j;
import z1.k;

public class AppBarLayout extends LinearLayout implements b {
    public static class BaseBehavior extends d {
        public static class SavedState extends AbsSavedState {
            class a implements Parcelable.ClassLoaderCreator {
                a() {
                    super();
                }

                public SavedState a(Parcel parcel0) {
                    return new SavedState(parcel0, null);
                }

                public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                    return new SavedState(parcel0, classLoader0);
                }

                public SavedState[] c(int v) {
                    return new SavedState[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.a(parcel0);
                }

                @Override  // android.os.Parcelable$ClassLoaderCreator
                public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                    return this.b(parcel0, classLoader0);
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.c(v);
                }
            }

            public static final Parcelable.Creator CREATOR;
            boolean h;
            boolean i;
            int j;
            float k;
            boolean l;

            static {
                SavedState.CREATOR = new a();
            }

            public SavedState(Parcel parcel0, ClassLoader classLoader0) {
                super(parcel0, classLoader0);
                boolean z = false;
                this.h = parcel0.readByte() != 0;
                this.i = parcel0.readByte() != 0;
                this.j = parcel0.readInt();
                this.k = parcel0.readFloat();
                if(parcel0.readByte() != 0) {
                    z = true;
                }
                this.l = z;
            }

            public SavedState(Parcelable parcelable0) {
                super(parcelable0);
            }

            @Override  // androidx.customview.view.AbsSavedState
            public void writeToParcel(Parcel parcel0, int v) {
                super.writeToParcel(parcel0, v);
                parcel0.writeByte(((byte)this.h));
                parcel0.writeByte(((byte)this.i));
                parcel0.writeInt(this.j);
                parcel0.writeFloat(this.k);
                parcel0.writeByte(((byte)this.l));
            }
        }

        private int p;
        private int q;
        private ValueAnimator r;
        private SavedState s;
        private WeakReference t;

        public BaseBehavior() {
        }

        public BaseBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        private void A0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
            int v = appBarLayout0.getTopInset() + appBarLayout0.getPaddingTop();
            int v1 = this.Q() - v;
            int v2 = this.i0(appBarLayout0, v1);
            if(v2 >= 0) {
                View view0 = appBarLayout0.getChildAt(v2);
                com.google.android.material.appbar.AppBarLayout.d appBarLayout$d0 = (com.google.android.material.appbar.AppBarLayout.d)view0.getLayoutParams();
                int v3 = appBarLayout$d0.c();
                if((v3 & 17) == 17) {
                    int v4 = -view0.getTop();
                    int v5 = -view0.getBottom();
                    if(v2 == 0 && Y.w(appBarLayout0) && Y.w(view0)) {
                        v4 -= appBarLayout0.getTopInset();
                    }
                    if(BaseBehavior.e0(v3, 2)) {
                        v5 += Y.A(view0);
                    }
                    else if(BaseBehavior.e0(v3, 5)) {
                        int v6 = Y.A(view0) + v5;
                        if(v1 < v6) {
                            v4 = v6;
                        }
                        else {
                            v5 = v6;
                        }
                    }
                    if(BaseBehavior.e0(v3, 0x20)) {
                        v4 += appBarLayout$d0.topMargin;
                        v5 -= appBarLayout$d0.bottomMargin;
                    }
                    this.Z(coordinatorLayout0, appBarLayout0, x.a.b(this.b0(v1, v5, v4) + v, -appBarLayout0.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public void B(CoordinatorLayout coordinatorLayout0, View view0, Parcelable parcelable0) {
            this.s0(coordinatorLayout0, ((AppBarLayout)view0), parcelable0);
        }

        private void B0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v, int v1, boolean z) {
            View view0 = BaseBehavior.h0(appBarLayout0, v);
            boolean z1 = false;
            if(view0 != null) {
                int v2 = ((com.google.android.material.appbar.AppBarLayout.d)view0.getLayoutParams()).c();
                if((v2 & 1) != 0) {
                    int v3 = Y.A(view0);
                    if(v1 <= 0 || (v2 & 12) == 0) {
                        if((v2 & 2) != 0 && -v >= view0.getBottom() - v3 - appBarLayout0.getTopInset()) {
                            z1 = true;
                        }
                    }
                    else if(-v >= view0.getBottom() - v3 - appBarLayout0.getTopInset()) {
                        z1 = true;
                    }
                }
            }
            if(appBarLayout0.o()) {
                z1 = appBarLayout0.B(this.g0(coordinatorLayout0));
            }
            if(z || appBarLayout0.y(z1) && this.z0(coordinatorLayout0, appBarLayout0)) {
                if(appBarLayout0.getBackground() != null) {
                    appBarLayout0.getBackground().jumpToCurrentState();
                }
                if(appBarLayout0.getForeground() != null) {
                    appBarLayout0.getForeground().jumpToCurrentState();
                }
                if(appBarLayout0.getStateListAnimator() != null) {
                    appBarLayout0.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public Parcelable C(CoordinatorLayout coordinatorLayout0, View view0) {
            return this.t0(coordinatorLayout0, ((AppBarLayout)view0));
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public boolean E(CoordinatorLayout coordinatorLayout0, View view0, View view1, View view2, int v, int v1) {
            return this.u0(coordinatorLayout0, ((AppBarLayout)view0), view1, view2, v, v1);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public void G(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v) {
            this.v0(coordinatorLayout0, ((AppBarLayout)view0), view1, v);
        }

        @Override  // com.google.android.material.appbar.d
        boolean L(View view0) {
            return this.c0(((AppBarLayout)view0));
        }

        @Override  // com.google.android.material.appbar.d
        int O(View view0) {
            return this.k0(((AppBarLayout)view0));
        }

        @Override  // com.google.android.material.appbar.d
        int P(View view0) {
            return this.l0(((AppBarLayout)view0));
        }

        @Override  // com.google.android.material.appbar.d
        int Q() {
            return this.I() + this.p;
        }

        @Override  // com.google.android.material.appbar.d
        void R(CoordinatorLayout coordinatorLayout0, View view0) {
            this.n0(coordinatorLayout0, ((AppBarLayout)view0));
        }

        @Override  // com.google.android.material.appbar.d
        int U(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2) {
            return this.y0(coordinatorLayout0, ((AppBarLayout)view0), v, v1, v2);
        }

        private void Y(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
            class com.google.android.material.appbar.AppBarLayout.BaseBehavior.b extends androidx.core.view.a {
                final AppBarLayout d;
                final CoordinatorLayout e;
                final BaseBehavior f;

                com.google.android.material.appbar.AppBarLayout.BaseBehavior.b(AppBarLayout appBarLayout0, CoordinatorLayout coordinatorLayout0) {
                    this.d = appBarLayout0;
                    this.e = coordinatorLayout0;
                    super();
                }

                @Override  // androidx.core.view.a
                public void g(View view0, z z0) {
                    super.g(view0, z0);
                    z0.m0("android.widget.ScrollView");
                    if(this.d.getTotalScrollRange() == 0) {
                        return;
                    }
                    View view1 = BaseBehavior.this.j0(this.e);
                    if(view1 == null) {
                        return;
                    }
                    if(!BaseBehavior.this.f0(this.d)) {
                        return;
                    }
                    if(BaseBehavior.this.Q() != -this.d.getTotalScrollRange()) {
                        z0.b(C.z.a.q);
                        z0.F0(true);
                    }
                    if(BaseBehavior.this.Q() != 0) {
                        if(!view1.canScrollVertically(-1)) {
                            z0.b(C.z.a.r);
                            z0.F0(true);
                        }
                        else if(-this.d.getDownNestedPreScrollRange() != 0) {
                            z0.b(C.z.a.r);
                            z0.F0(true);
                        }
                    }
                }

                @Override  // androidx.core.view.a
                public boolean j(View view0, int v, Bundle bundle0) {
                    switch(v) {
                        case 0x1000: {
                            this.d.setExpanded(false);
                            return true;
                        }
                        case 0x2000: {
                            if(BaseBehavior.this.Q() != 0) {
                                View view1 = BaseBehavior.this.j0(this.e);
                                if(!view1.canScrollVertically(-1)) {
                                    this.d.setExpanded(true);
                                    return true;
                                }
                                int v1 = this.d.getDownNestedPreScrollRange();
                                if(-v1 != 0) {
                                    BaseBehavior.this.q0(this.e, this.d, view1, 0, -v1, new int[]{0, 0}, 1);
                                    return true;
                                }
                            }
                            return false;
                        }
                        default: {
                            return super.j(view0, v, bundle0);
                        }
                    }
                }
            }

            if(!Y.N(coordinatorLayout0)) {
                Y.o0(coordinatorLayout0, new com.google.android.material.appbar.AppBarLayout.BaseBehavior.b(this, appBarLayout0, coordinatorLayout0));
            }
        }

        private void Z(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v, float f) {
            int v1 = Math.abs(this.Q() - v);
            float f1 = Math.abs(f);
            this.a0(coordinatorLayout0, appBarLayout0, v, (f1 > 0.0f ? Math.round(((float)v1) / f1 * 1000.0f) * 3 : ((int)((((float)v1) / ((float)appBarLayout0.getHeight()) + 1.0f) * 150.0f))));
        }

        private void a0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v, int v1) {
            class com.google.android.material.appbar.AppBarLayout.BaseBehavior.a implements ValueAnimator.AnimatorUpdateListener {
                final CoordinatorLayout a;
                final AppBarLayout b;
                final BaseBehavior c;

                com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
                    this.a = coordinatorLayout0;
                    this.b = appBarLayout0;
                    super();
                }

                @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                    int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                    BaseBehavior.this.T(this.a, this.b, v);
                }
            }

            int v2 = this.Q();
            if(v2 == v) {
                if(this.r != null && this.r.isRunning()) {
                    this.r.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator0 = this.r;
            if(valueAnimator0 == null) {
                ValueAnimator valueAnimator1 = new ValueAnimator();
                this.r = valueAnimator1;
                valueAnimator1.setInterpolator(A1.a.e);
                this.r.addUpdateListener(new com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(this, coordinatorLayout0, appBarLayout0));
            }
            else {
                valueAnimator0.cancel();
            }
            this.r.setDuration(((long)Math.min(v1, 600)));
            this.r.setIntValues(new int[]{v2, v});
            this.r.start();
        }

        private int b0(int v, int v1, int v2) {
            return v < (v1 + v2) / 2 ? v1 : v2;
        }

        boolean c0(AppBarLayout appBarLayout0) {
            WeakReference weakReference0 = this.t;
            if(weakReference0 != null) {
                View view0 = (View)weakReference0.get();
                return view0 != null && view0.isShown() && !view0.canScrollVertically(-1);
            }
            return true;
        }

        private boolean d0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0) {
            return appBarLayout0.k() && coordinatorLayout0.getHeight() - view0.getHeight() <= appBarLayout0.getHeight();
        }

        private static boolean e0(int v, int v1) {
            return (v & v1) == v1;
        }

        private boolean f0(AppBarLayout appBarLayout0) {
            int v = appBarLayout0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((com.google.android.material.appbar.AppBarLayout.d)appBarLayout0.getChildAt(v1).getLayoutParams()).a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View g0(CoordinatorLayout coordinatorLayout0) {
            int v = coordinatorLayout0.getChildCount();
            int v1 = 0;
            while(v1 < v) {
                View view0 = coordinatorLayout0.getChildAt(v1);
                if(!(view0 instanceof B) && !(view0 instanceof AbsListView) && !(view0 instanceof ScrollView)) {
                    ++v1;
                    continue;
                }
                return view0;
            }
            return null;
        }

        private static View h0(AppBarLayout appBarLayout0, int v) {
            int v1 = Math.abs(v);
            int v2 = appBarLayout0.getChildCount();
            for(int v3 = 0; v3 < v2; ++v3) {
                View view0 = appBarLayout0.getChildAt(v3);
                if(v1 >= view0.getTop() && v1 <= view0.getBottom()) {
                    return view0;
                }
            }
            return null;
        }

        private int i0(AppBarLayout appBarLayout0, int v) {
            int v1 = appBarLayout0.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = appBarLayout0.getChildAt(v2);
                int v3 = view0.getTop();
                int v4 = view0.getBottom();
                com.google.android.material.appbar.AppBarLayout.d appBarLayout$d0 = (com.google.android.material.appbar.AppBarLayout.d)view0.getLayoutParams();
                if(BaseBehavior.e0(appBarLayout$d0.c(), 0x20)) {
                    v3 -= appBarLayout$d0.topMargin;
                    v4 += appBarLayout$d0.bottomMargin;
                }
                if(v3 <= -v && v4 >= -v) {
                    return v2;
                }
            }
            return -1;
        }

        private View j0(CoordinatorLayout coordinatorLayout0) {
            int v = coordinatorLayout0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = coordinatorLayout0.getChildAt(v1);
                if(((f)view0.getLayoutParams()).e() instanceof ScrollingViewBehavior) {
                    return view0;
                }
            }
            return null;
        }

        int k0(AppBarLayout appBarLayout0) {
            return -appBarLayout0.getDownNestedScrollRange() + appBarLayout0.getTopInset();
        }

        int l0(AppBarLayout appBarLayout0) {
            return appBarLayout0.getTotalScrollRange();
        }

        private int m0(AppBarLayout appBarLayout0, int v) {
            int v1 = Math.abs(v);
            int v2 = appBarLayout0.getChildCount();
            int v3 = 0;
            for(int v4 = 0; v4 < v2; ++v4) {
                View view0 = appBarLayout0.getChildAt(v4);
                com.google.android.material.appbar.AppBarLayout.d appBarLayout$d0 = (com.google.android.material.appbar.AppBarLayout.d)view0.getLayoutParams();
                Interpolator interpolator0 = appBarLayout$d0.d();
                if(v1 >= view0.getTop() && v1 <= view0.getBottom()) {
                    if(interpolator0 == null) {
                        break;
                    }
                    int v5 = appBarLayout$d0.c();
                    if((v5 & 1) != 0) {
                        v3 = view0.getHeight() + appBarLayout$d0.topMargin + appBarLayout$d0.bottomMargin;
                        if((v5 & 2) != 0) {
                            v3 -= Y.A(view0);
                        }
                    }
                    if(Y.w(view0)) {
                        v3 -= appBarLayout0.getTopInset();
                    }
                    if(v3 <= 0) {
                        break;
                    }
                    int v6 = Math.round(((float)v3) * interpolator0.getInterpolation(((float)(v1 - view0.getTop())) / ((float)v3)));
                    return Integer.signum(v) * (view0.getTop() + v6);
                }
            }
            return v;
        }

        void n0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
            this.A0(coordinatorLayout0, appBarLayout0);
            if(appBarLayout0.o()) {
                appBarLayout0.y(appBarLayout0.B(this.g0(coordinatorLayout0)));
            }
        }

        public boolean o0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v) {
            boolean z = super.p(coordinatorLayout0, appBarLayout0, v);
            int v1 = appBarLayout0.getPendingAction();
            SavedState appBarLayout$BaseBehavior$SavedState0 = this.s;
            if(appBarLayout$BaseBehavior$SavedState0 == null || (v1 & 8) != 0) {
                if(v1 != 0) {
                    boolean z1 = (v1 & 4) != 0;
                    if((v1 & 2) != 0) {
                        int v3 = appBarLayout0.getUpNestedPreScrollRange();
                        if(z1) {
                            this.Z(coordinatorLayout0, appBarLayout0, -v3, 0.0f);
                        }
                        else {
                            this.T(coordinatorLayout0, appBarLayout0, -v3);
                        }
                    }
                    else if((v1 & 1) != 0) {
                        if(z1) {
                            this.Z(coordinatorLayout0, appBarLayout0, 0, 0.0f);
                        }
                        else {
                            this.T(coordinatorLayout0, appBarLayout0, 0);
                        }
                    }
                }
            }
            else if(appBarLayout$BaseBehavior$SavedState0.h) {
                this.T(coordinatorLayout0, appBarLayout0, -appBarLayout0.getTotalScrollRange());
            }
            else if(appBarLayout$BaseBehavior$SavedState0.i) {
                this.T(coordinatorLayout0, appBarLayout0, 0);
            }
            else {
                View view0 = appBarLayout0.getChildAt(appBarLayout$BaseBehavior$SavedState0.j);
                int v2 = view0.getBottom();
                this.T(coordinatorLayout0, appBarLayout0, (this.s.l ? Y.A(view0) + appBarLayout0.getTopInset() : Math.round(((float)view0.getHeight()) * this.s.k)) - v2);
            }
            appBarLayout0.u();
            this.s = null;
            this.K(x.a.b(this.I(), -appBarLayout0.getTotalScrollRange(), 0));
            this.B0(coordinatorLayout0, appBarLayout0, this.I(), 0, true);
            appBarLayout0.s(this.I());
            this.Y(coordinatorLayout0, appBarLayout0);
            return z;
        }

        @Override  // com.google.android.material.appbar.f
        public boolean p(CoordinatorLayout coordinatorLayout0, View view0, int v) {
            return this.o0(coordinatorLayout0, ((AppBarLayout)view0), v);
        }

        public boolean p0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v, int v1, int v2, int v3) {
            if(((f)appBarLayout0.getLayoutParams()).height == -2) {
                coordinatorLayout0.J(appBarLayout0, v, v1, 0, v3);
                return true;
            }
            return super.q(coordinatorLayout0, appBarLayout0, v, v1, v2, v3);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public boolean q(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2, int v3) {
            return this.p0(coordinatorLayout0, ((AppBarLayout)view0), v, v1, v2, v3);
        }

        public void q0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, int v, int v1, int[] arr_v, int v2) {
            int v4;
            int v3;
            if(v1 != 0) {
                if(v1 < 0) {
                    v3 = -appBarLayout0.getTotalScrollRange();
                    v4 = appBarLayout0.getDownNestedPreScrollRange() + v3;
                }
                else {
                    v3 = -appBarLayout0.getUpNestedPreScrollRange();
                    v4 = 0;
                }
                if(v3 != v4) {
                    arr_v[1] = this.S(coordinatorLayout0, appBarLayout0, v1, v3, v4);
                }
            }
            if(appBarLayout0.o()) {
                appBarLayout0.y(appBarLayout0.B(view0));
            }
        }

        public void r0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
            if(v3 < 0) {
                arr_v[1] = this.S(coordinatorLayout0, appBarLayout0, v3, -appBarLayout0.getDownNestedScrollRange(), 0);
            }
            if(v3 == 0) {
                this.Y(coordinatorLayout0, appBarLayout0);
            }
        }

        public void s0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, Parcelable parcelable0) {
            if(parcelable0 instanceof SavedState) {
                this.w0(((SavedState)parcelable0), true);
                super.B(coordinatorLayout0, appBarLayout0, this.s.a());
                return;
            }
            super.B(coordinatorLayout0, appBarLayout0, parcelable0);
            this.s = null;
        }

        public Parcelable t0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
            Parcelable parcelable0 = super.C(coordinatorLayout0, appBarLayout0);
            SavedState appBarLayout$BaseBehavior$SavedState0 = this.x0(parcelable0, appBarLayout0);
            return appBarLayout$BaseBehavior$SavedState0 != null ? appBarLayout$BaseBehavior$SavedState0 : parcelable0;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public void u(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int[] arr_v, int v2) {
            this.q0(coordinatorLayout0, ((AppBarLayout)view0), view1, v, v1, arr_v, v2);
        }

        public boolean u0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, View view1, int v, int v1) {
            boolean z = (v & 2) != 0 && (appBarLayout0.o() || this.d0(coordinatorLayout0, appBarLayout0, view0));
            if(z) {
                ValueAnimator valueAnimator0 = this.r;
                if(valueAnimator0 != null) {
                    valueAnimator0.cancel();
                }
            }
            this.t = null;
            this.q = v1;
            return z;
        }

        public void v0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, int v) {
            if(this.q == 0 || v == 1) {
                this.A0(coordinatorLayout0, appBarLayout0);
                if(appBarLayout0.o()) {
                    appBarLayout0.y(appBarLayout0.B(view0));
                }
            }
            this.t = new WeakReference(view0);
        }

        void w0(SavedState appBarLayout$BaseBehavior$SavedState0, boolean z) {
            if(this.s == null || z) {
                this.s = appBarLayout$BaseBehavior$SavedState0;
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public void x(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
            this.r0(coordinatorLayout0, ((AppBarLayout)view0), view1, v, v1, v2, v3, v4, arr_v);
        }

        SavedState x0(Parcelable parcelable0, AppBarLayout appBarLayout0) {
            int v = this.I();
            int v1 = appBarLayout0.getChildCount();
            boolean z = false;
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = appBarLayout0.getChildAt(v2);
                int v3 = view0.getBottom() + v;
                if(view0.getTop() + v <= 0 && v3 >= 0) {
                    if(parcelable0 == null) {
                        parcelable0 = AbsSavedState.g;
                    }
                    SavedState appBarLayout$BaseBehavior$SavedState0 = new SavedState(parcelable0);
                    appBarLayout$BaseBehavior$SavedState0.i = v == 0;
                    appBarLayout$BaseBehavior$SavedState0.h = v != 0 && -v >= appBarLayout0.getTotalScrollRange();
                    appBarLayout$BaseBehavior$SavedState0.j = v2;
                    if(v3 == Y.A(view0) + appBarLayout0.getTopInset()) {
                        z = true;
                    }
                    appBarLayout$BaseBehavior$SavedState0.l = z;
                    appBarLayout$BaseBehavior$SavedState0.k = ((float)v3) / ((float)view0.getHeight());
                    return appBarLayout$BaseBehavior$SavedState0;
                }
            }
            return null;
        }

        int y0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v, int v1, int v2) {
            int v3 = this.Q();
            int v4 = 0;
            if(v1 == 0 || v3 < v1 || v3 > v2) {
                this.p = 0;
            }
            else {
                int v5 = x.a.b(v, v1, v2);
                if(v3 != v5) {
                    int v6 = appBarLayout0.i() ? this.m0(appBarLayout0, v5) : v5;
                    boolean z = this.K(v6);
                    this.p = v5 - v6;
                    int v7 = 1;
                    if(z) {
                        while(v4 < appBarLayout0.getChildCount()) {
                            com.google.android.material.appbar.AppBarLayout.d appBarLayout$d0 = (com.google.android.material.appbar.AppBarLayout.d)appBarLayout0.getChildAt(v4).getLayoutParams();
                            com.google.android.material.appbar.AppBarLayout.b appBarLayout$b0 = appBarLayout$d0.b();
                            if(appBarLayout$b0 != null && (appBarLayout$d0.c() & 1) != 0) {
                                appBarLayout$b0.a(appBarLayout0, appBarLayout0.getChildAt(v4), ((float)this.I()));
                            }
                            ++v4;
                        }
                    }
                    if(!z && appBarLayout0.i()) {
                        coordinatorLayout0.f(appBarLayout0);
                    }
                    appBarLayout0.s(this.I());
                    if(v5 < v3) {
                        v7 = -1;
                    }
                    this.B0(coordinatorLayout0, appBarLayout0, v5, v7, false);
                    v4 = v3 - v5;
                }
            }
            this.Y(coordinatorLayout0, appBarLayout0);
            return v4;
        }

        private boolean z0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
            List list0 = coordinatorLayout0.s(appBarLayout0);
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                c coordinatorLayout$c0 = ((f)((View)list0.get(v1)).getLayoutParams()).e();
                if(coordinatorLayout$c0 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior)coordinatorLayout$c0).O() != 0;
                }
            }
            return false;
        }
    }

    public static class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        @Override  // com.google.android.material.appbar.d
        public boolean H(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
            return super.H(coordinatorLayout0, view0, motionEvent0);
        }

        @Override  // com.google.android.material.appbar.f
        public int I() {
            return super.I();
        }

        @Override  // com.google.android.material.appbar.f
        public boolean K(int v) {
            return super.K(v);
        }

        @Override  // com.google.android.material.appbar.d
        public boolean o(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
            return super.o(coordinatorLayout0, view0, motionEvent0);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public boolean o0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v) {
            return super.o0(coordinatorLayout0, appBarLayout0, v);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public boolean p0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v, int v1, int v2, int v3) {
            return super.p0(coordinatorLayout0, appBarLayout0, v, v1, v2, v3);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void q0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, int v, int v1, int[] arr_v, int v2) {
            super.q0(coordinatorLayout0, appBarLayout0, view0, v, v1, arr_v, v2);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void r0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
            super.r0(coordinatorLayout0, appBarLayout0, view0, v, v1, v2, v3, v4, arr_v);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void s0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, Parcelable parcelable0) {
            super.s0(coordinatorLayout0, appBarLayout0, parcelable0);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public Parcelable t0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
            return super.t0(coordinatorLayout0, appBarLayout0);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public boolean u0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, View view1, int v, int v1) {
            return super.u0(coordinatorLayout0, appBarLayout0, view0, view1, v, v1);
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$BaseBehavior
        public void v0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, int v) {
            super.v0(coordinatorLayout0, appBarLayout0, view0, v);
        }
    }

    public static class ScrollingViewBehavior extends e {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, k.o6);
            this.S(typedArray0.getDimensionPixelSize(k.p6, 0));
            typedArray0.recycle();
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public boolean A(CoordinatorLayout coordinatorLayout0, View view0, Rect rect0, boolean z) {
            AppBarLayout appBarLayout0 = this.U(coordinatorLayout0.r(view0));
            if(appBarLayout0 != null) {
                Rect rect1 = new Rect(rect0);
                rect1.offset(view0.getLeft(), view0.getTop());
                int v = coordinatorLayout0.getWidth();
                int v1 = coordinatorLayout0.getHeight();
                this.i.set(0, 0, v, v1);
                if(!this.i.contains(rect1)) {
                    appBarLayout0.v(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override  // com.google.android.material.appbar.e
        View L(List list0) {
            return this.U(list0);
        }

        @Override  // com.google.android.material.appbar.e
        float N(View view0) {
            if(view0 instanceof AppBarLayout) {
                int v = ((AppBarLayout)view0).getTotalScrollRange();
                int v1 = ((AppBarLayout)view0).getDownNestedPreScrollRange();
                int v2 = ScrollingViewBehavior.V(((AppBarLayout)view0));
                if(v1 != 0 && v + v2 <= v1) {
                    return 0.0f;
                }
                int v3 = v - v1;
                return v3 == 0 ? 0.0f : ((float)v2) / ((float)v3) + 1.0f;
            }
            return 0.0f;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.material.appbar.e
        int P(View view0) {
            return view0 instanceof AppBarLayout ? ((AppBarLayout)view0).getTotalScrollRange() : super.P(view0);
        }

        AppBarLayout U(List list0) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = (View)list0.get(v1);
                if(view0 instanceof AppBarLayout) {
                    return (AppBarLayout)view0;
                }
            }
            return null;
        }

        private static int V(AppBarLayout appBarLayout0) {
            c coordinatorLayout$c0 = ((f)appBarLayout0.getLayoutParams()).e();
            return coordinatorLayout$c0 instanceof BaseBehavior ? ((BaseBehavior)coordinatorLayout$c0).Q() : 0;
        }

        private void W(View view0, View view1) {
            c coordinatorLayout$c0 = ((f)view1.getLayoutParams()).e();
            if(coordinatorLayout$c0 instanceof BaseBehavior) {
                Y.Z(view0, view1.getBottom() - view0.getTop() + ((BaseBehavior)coordinatorLayout$c0).p + this.Q() - this.M(view1));
            }
        }

        private void X(View view0, View view1) {
            if(view1 instanceof AppBarLayout && ((AppBarLayout)view1).o()) {
                ((AppBarLayout)view1).y(((AppBarLayout)view1).B(view0));
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public boolean i(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            return view1 instanceof AppBarLayout;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public boolean l(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            this.W(view0, view1);
            this.X(view0, view1);
            return false;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
        public void m(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            if(view1 instanceof AppBarLayout) {
                Y.o0(coordinatorLayout0, null);
            }
        }

        @Override  // com.google.android.material.appbar.f
        public boolean p(CoordinatorLayout coordinatorLayout0, View view0, int v) {
            return super.p(coordinatorLayout0, view0, v);
        }

        @Override  // com.google.android.material.appbar.e
        public boolean q(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2, int v3) {
            return super.q(coordinatorLayout0, view0, v, v1, v2, v3);
        }
    }

    public static abstract class com.google.android.material.appbar.AppBarLayout.b {
        public abstract void a(AppBarLayout arg1, View arg2, float arg3);
    }

    public static class com.google.android.material.appbar.AppBarLayout.c extends com.google.android.material.appbar.AppBarLayout.b {
        private final Rect a;
        private final Rect b;

        public com.google.android.material.appbar.AppBarLayout.c() {
            this.a = new Rect();
            this.b = new Rect();
        }

        @Override  // com.google.android.material.appbar.AppBarLayout$b
        public void a(AppBarLayout appBarLayout0, View view0, float f) {
            com.google.android.material.appbar.AppBarLayout.c.b(this.a, appBarLayout0, view0);
            float f1 = ((float)this.a.top) - Math.abs(f);
            if(Float.compare(f1, 0.0f) <= 0) {
                float f2 = x.a.a(Math.abs(f1 / ((float)this.a.height())), 0.0f, 1.0f);
                float f3 = -f1 - ((float)this.a.height()) * 0.3f * (1.0f - (1.0f - f2) * (1.0f - f2));
                view0.setTranslationY(f3);
                view0.getDrawingRect(this.b);
                this.b.offset(0, ((int)(-f3)));
                if(f3 >= ((float)this.b.height())) {
                    view0.setVisibility(4);
                }
                else {
                    view0.setVisibility(0);
                }
                Y.v0(view0, this.b);
                return;
            }
            Y.v0(view0, null);
            view0.setTranslationY(0.0f);
            view0.setVisibility(0);
        }

        private static void b(Rect rect0, AppBarLayout appBarLayout0, View view0) {
            view0.getDrawingRect(rect0);
            appBarLayout0.offsetDescendantRectToMyCoords(view0, rect0);
            rect0.offset(0, -appBarLayout0.getTopInset());
        }
    }

    public static class com.google.android.material.appbar.AppBarLayout.d extends LinearLayout.LayoutParams {
        int a;
        private com.google.android.material.appbar.AppBarLayout.b b;
        Interpolator c;

        public com.google.android.material.appbar.AppBarLayout.d(int v, int v1) {
            super(v, v1);
            this.a = 1;
        }

        public com.google.android.material.appbar.AppBarLayout.d(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = 1;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, k.v);
            this.a = typedArray0.getInt(k.x, 0);
            this.f(typedArray0.getInt(k.w, 0));
            if(typedArray0.hasValue(k.y)) {
                this.c = AnimationUtils.loadInterpolator(context0, typedArray0.getResourceId(2, 0));
            }
            typedArray0.recycle();
        }

        public com.google.android.material.appbar.AppBarLayout.d(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = 1;
        }

        public com.google.android.material.appbar.AppBarLayout.d(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.a = 1;
        }

        public com.google.android.material.appbar.AppBarLayout.d(LinearLayout.LayoutParams linearLayout$LayoutParams0) {
            super(linearLayout$LayoutParams0);
            this.a = 1;
        }

        private com.google.android.material.appbar.AppBarLayout.b a(int v) {
            return v != 1 ? null : new com.google.android.material.appbar.AppBarLayout.c();
        }

        public com.google.android.material.appbar.AppBarLayout.b b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }

        public Interpolator d() {
            return this.c;
        }

        boolean e() {
            return (this.a & 1) == 1 && (this.a & 10) != 0;
        }

        public void f(int v) {
            this.b = this.a(v);
        }
    }

    private Drawable A;
    private Integer B;
    private final float C;
    private Behavior D;
    private static final int E;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private y0 l;
    private List m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private WeakReference s;
    private final boolean t;
    private ValueAnimator u;
    private ValueAnimator.AnimatorUpdateListener v;
    private final List w;
    private final long x;
    private final TimeInterpolator y;
    private int[] z;

    static {
        AppBarLayout.E = j.f;
    }

    public AppBarLayout(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, z1.a.b);
    }

    public AppBarLayout(Context context0, AttributeSet attributeSet0, int v) {
        class com.google.android.material.appbar.AppBarLayout.a implements G {
            final AppBarLayout a;

            @Override  // androidx.core.view.G
            public y0 a(View view0, y0 y00) {
                return AppBarLayout.this.t(y00);
            }
        }

        int v1 = AppBarLayout.E;
        super(V1.a.c(context0, attributeSet0, v, v1), attributeSet0, v);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.k = 0;
        this.w = new ArrayList();
        Context context1 = this.getContext();
        boolean z = true;
        this.setOrientation(1);
        int v2 = Build.VERSION.SDK_INT;
        if(this.getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            h.a(this);
        }
        h.c(this, attributeSet0, v, v1);
        TypedArray typedArray0 = q.i(context1, attributeSet0, k.k, v, v1, new int[0]);
        Y.s0(this, typedArray0.getDrawable(k.l));
        ColorStateList colorStateList0 = P1.c.a(context1, typedArray0, k.r);
        if(colorStateList0 == null) {
            z = false;
        }
        this.t = z;
        ColorStateList colorStateList1 = com.google.android.material.drawable.d.f(this.getBackground());
        if(colorStateList1 != null) {
            g g0 = new g();
            g0.V(colorStateList1);
            if(colorStateList0 == null) {
                this.m(context1, g0);
            }
            else {
                this.l(g0, colorStateList1, colorStateList0);
            }
        }
        int v3 = this.getResources().getInteger(z1.f.a);
        this.x = (long)M1.h.f(context1, z1.a.D, v3);
        this.y = M1.h.g(context1, z1.a.N, A1.a.a);
        if(typedArray0.hasValue(k.p)) {
            this.w(typedArray0.getBoolean(4, false), false, false);
        }
        if(typedArray0.hasValue(k.o)) {
            h.b(this, ((float)typedArray0.getDimensionPixelSize(3, 0)));
        }
        if(v2 >= 26) {
            if(typedArray0.hasValue(k.n)) {
                com.google.android.material.appbar.a.a(this, typedArray0.getBoolean(2, false));
            }
            if(typedArray0.hasValue(k.m)) {
                this.setTouchscreenBlocksFocus(typedArray0.getBoolean(1, false));
            }
        }
        this.C = this.getResources().getDimension(z1.c.a);
        this.q = typedArray0.getBoolean(k.q, false);
        this.r = typedArray0.getResourceId(k.s, -1);
        this.setStatusBarForeground(typedArray0.getDrawable(k.t));
        typedArray0.recycle();
        Y.B0(this, (/* 缺少LAMBDA参数 */, y0 y00) -> {
            y0 y01 = Y.w(AppBarLayout.this) ? y00 : null;
            if(!B.c.a(AppBarLayout.this.l, y01)) {
                AppBarLayout.this.l = y01;
                AppBarLayout.this.E();
                AppBarLayout.this.requestLayout();
            }
            return y00;
        });
    }

    private boolean A() {
        return this.A != null && this.getTopInset() > 0;
    }

    boolean B(View view0) {
        View view1 = this.e(view0);
        if(view1 != null) {
            view0 = view1;
        }
        return view0 != null && (view0.canScrollVertically(-1) || view0.getScrollY() > 0);
    }

    private boolean C() {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            return view0.getVisibility() != 8 && !Y.w(view0);
        }
        return false;
    }

    private void D(float f, float f1) {
        ValueAnimator valueAnimator0 = this.u;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{f, f1});
        this.u = valueAnimator1;
        valueAnimator1.setDuration(this.x);
        this.u.setInterpolator(this.y);
        ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0 = this.v;
        if(valueAnimator$AnimatorUpdateListener0 != null) {
            this.u.addUpdateListener(valueAnimator$AnimatorUpdateListener0);
        }
        this.u.start();
    }

    private void E() {
        this.setWillNotDraw(!this.A());
    }

    private void c() {
        WeakReference weakReference0 = this.s;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.s = null;
    }

    @Override  // android.widget.LinearLayout
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof com.google.android.material.appbar.AppBarLayout.d;
    }

    private Integer d() {
        Drawable drawable0 = this.A;
        if(drawable0 instanceof g) {
            return ((g)drawable0).y();
        }
        ColorStateList colorStateList0 = com.google.android.material.drawable.d.f(drawable0);
        return colorStateList0 == null ? null : colorStateList0.getDefaultColor();
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        super.draw(canvas0);
        if(this.A()) {
            int v = canvas0.save();
            canvas0.translate(0.0f, ((float)(-this.f)));
            this.A.draw(canvas0);
            canvas0.restoreToCount(v);
        }
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.A;
        if(drawable0 != null && drawable0.isStateful() && drawable0.setState(arr_v)) {
            this.invalidateDrawable(drawable0);
        }
    }

    private View e(View view0) {
        if(this.s == null) {
            int v = this.r;
            if(v != -1) {
                View view1 = view0 == null ? null : view0.findViewById(v);
                if(view1 == null && this.getParent() instanceof ViewGroup) {
                    view1 = ((ViewGroup)this.getParent()).findViewById(this.r);
                }
                if(view1 != null) {
                    this.s = new WeakReference(view1);
                }
            }
        }
        return this.s == null ? null : ((View)this.s.get());
    }

    protected com.google.android.material.appbar.AppBarLayout.d f() {
        return new com.google.android.material.appbar.AppBarLayout.d(-1, -2);
    }

    public com.google.android.material.appbar.AppBarLayout.d g(AttributeSet attributeSet0) {
        return new com.google.android.material.appbar.AppBarLayout.d(this.getContext(), attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.f();
    }

    @Override  // android.widget.LinearLayout
    protected LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return this.f();
    }

    @Override  // android.widget.LinearLayout
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.g(attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.h(viewGroup$LayoutParams0);
    }

    @Override  // android.widget.LinearLayout
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.g(attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    protected LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.h(viewGroup$LayoutParams0);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$b
    public c getBehavior() {
        Behavior appBarLayout$Behavior0 = new Behavior();
        this.D = appBarLayout$Behavior0;
        return appBarLayout$Behavior0;
    }

    int getDownNestedPreScrollRange() {
        int v6;
        int v = this.h;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount() - 1;
        int v2 = 0;
        while(v1 >= 0) {
            View view0 = this.getChildAt(v1);
            if(view0.getVisibility() != 8) {
                com.google.android.material.appbar.AppBarLayout.d appBarLayout$d0 = (com.google.android.material.appbar.AppBarLayout.d)view0.getLayoutParams();
                int v3 = view0.getMeasuredHeight();
                int v4 = appBarLayout$d0.a;
                if((v4 & 5) == 5) {
                    int v5 = appBarLayout$d0.topMargin + appBarLayout$d0.bottomMargin;
                    if((v4 & 8) == 0) {
                        v6 = (v4 & 2) == 0 ? v5 + v3 : v5 + (v3 - Y.A(view0));
                    }
                    else {
                        v6 = v5 + Y.A(view0);
                    }
                    if(v1 == 0 && Y.w(view0)) {
                        v6 = Math.min(v6, v3 - this.getTopInset());
                    }
                    v2 += v6;
                }
                else {
                    if(v2 <= 0) {
                        goto label_22;
                    }
                    break;
                }
            }
        label_22:
            --v1;
        }
        int v7 = Math.max(0, v2);
        this.h = v7;
        return v7;
    }

    int getDownNestedScrollRange() {
        int v = this.i;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = this.getChildAt(v2);
            if(view0.getVisibility() != 8) {
                com.google.android.material.appbar.AppBarLayout.d appBarLayout$d0 = (com.google.android.material.appbar.AppBarLayout.d)view0.getLayoutParams();
                int v4 = view0.getMeasuredHeight() + (appBarLayout$d0.topMargin + appBarLayout$d0.bottomMargin);
                int v5 = appBarLayout$d0.a;
                if((v5 & 1) == 0) {
                    break;
                }
                v3 += v4;
                if((v5 & 2) != 0) {
                    v3 -= Y.A(view0);
                    break;
                }
            }
        }
        int v6 = Math.max(0, v3);
        this.i = v6;
        return v6;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.r;
    }

    public g getMaterialShapeBackground() {
        Drawable drawable0 = this.getBackground();
        return drawable0 instanceof g ? ((g)drawable0) : null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int v = this.getTopInset();
        int v1 = Y.A(this);
        if(v1 != 0) {
            return v1 * 2 + v;
        }
        int v2 = this.getChildCount();
        v1 = v2 < 1 ? 0 : Y.A(this.getChildAt(v2 - 1));
        return v1 == 0 ? this.getHeight() / 3 : v1 * 2 + v;
    }

    int getPendingAction() {
        return this.k;
    }

    public Drawable getStatusBarForeground() {
        return this.A;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        return this.l == null ? 0 : this.l.l();
    }

    public final int getTotalScrollRange() {
        int v = this.g;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = this.getChildAt(v2);
            if(view0.getVisibility() != 8) {
                com.google.android.material.appbar.AppBarLayout.d appBarLayout$d0 = (com.google.android.material.appbar.AppBarLayout.d)view0.getLayoutParams();
                int v4 = view0.getMeasuredHeight();
                int v5 = appBarLayout$d0.a;
                if((v5 & 1) == 0) {
                    break;
                }
                v3 += v4 + appBarLayout$d0.topMargin + appBarLayout$d0.bottomMargin;
                v3 = v2 != 0 || !Y.w(view0) ? v3 + (v4 + appBarLayout$d0.topMargin + appBarLayout$d0.bottomMargin) : v3 - this.getTopInset();
                if((v5 & 2) != 0) {
                    v3 -= Y.A(view0);
                    break;
                }
            }
        }
        int v6 = Math.max(0, v3);
        this.g = v6;
        return v6;
    }

    int getUpNestedPreScrollRange() {
        return this.getTotalScrollRange();
    }

    protected com.google.android.material.appbar.AppBarLayout.d h(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams) {
            return new com.google.android.material.appbar.AppBarLayout.d(((LinearLayout.LayoutParams)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new com.google.android.material.appbar.AppBarLayout.d(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new com.google.android.material.appbar.AppBarLayout.d(viewGroup$LayoutParams0);
    }

    boolean i() {
        return this.j;
    }

    private boolean j() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((com.google.android.material.appbar.AppBarLayout.d)this.getChildAt(v1).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    boolean k() {
        return this.getTotalScrollRange() != 0;
    }

    private void l(g g0, ColorStateList colorStateList0, ColorStateList colorStateList1) {
        this.v = (ValueAnimator valueAnimator0) -> {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            int v = H1.a.j(colorStateList0.getDefaultColor(), colorStateList1.getDefaultColor(), f);
            g0.V(ColorStateList.valueOf(v));
            if(this.A != null && (this.B != null && this.B.equals(H1.a.f(this.getContext(), z1.a.p)))) {
                androidx.core.graphics.drawable.a.n(this.A, v);
            }
            if(!this.w.isEmpty()) {
                for(Object object0: this.w) {
                    E.a(object0);
                    if(g0.v() != null) {
                        throw null;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        };
        Y.s0(this, g0);
    }

    private void m(Context context0, g g0) {
        g0.K(context0);
        this.v = (ValueAnimator valueAnimator0) -> {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            g0.U(f);
            Drawable drawable0 = this.A;
            if(drawable0 instanceof g) {
                ((g)drawable0).U(f);
            }
            Iterator iterator0 = this.w.iterator();
            if(!iterator0.hasNext()) {
                return;
            }
            Object object0 = iterator0.next();
            E.a(object0);
            throw null;
        };
        Y.s0(this, g0);
    }

    private void n() {
        SavedState appBarLayout$BaseBehavior$SavedState0 = this.D == null || this.g == -1 || this.k != 0 ? null : this.D.x0(AbsSavedState.g, this);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        if(appBarLayout$BaseBehavior$SavedState0 != null) {
            this.D.w0(appBarLayout$BaseBehavior$SavedState0, false);
        }
    }

    public boolean o() {
        return this.q;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        S1.h.e(this);
    }

    @Override  // android.view.ViewGroup
    protected int[] onCreateDrawableState(int v) {
        if(this.z == null) {
            this.z = new int[4];
        }
        int[] arr_v = this.z;
        int[] arr_v1 = super.onCreateDrawableState(v + arr_v.length);
        boolean z = this.o;
        arr_v[0] = z ? z1.a.W : 0x80FBFBE3;
        arr_v[1] = !z || !this.p ? -z1.a.X : z1.a.X;
        arr_v[2] = z ? z1.a.T : 0x80FBFBE7;
        arr_v[3] = !z || !this.p ? -z1.a.S : z1.a.S;
        return View.mergeDrawableStates(arr_v1, arr_v);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c();
    }

    @Override  // android.widget.LinearLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        boolean z1 = true;
        if(Y.w(this) && this.C()) {
            int v4 = this.getTopInset();
            for(int v5 = this.getChildCount() - 1; v5 >= 0; --v5) {
                Y.Z(this.getChildAt(v5), v4);
            }
        }
        this.n();
        this.j = false;
        int v6 = this.getChildCount();
        for(int v7 = 0; v7 < v6; ++v7) {
            if(((com.google.android.material.appbar.AppBarLayout.d)this.getChildAt(v7).getLayoutParams()).d() != null) {
                this.j = true;
                break;
            }
        }
        Drawable drawable0 = this.A;
        if(drawable0 != null) {
            drawable0.setBounds(0, 0, this.getWidth(), this.getTopInset());
        }
        if(!this.n) {
            if(!this.q && !this.j()) {
                z1 = false;
            }
            this.x(z1);
        }
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getMode(v1);
        if(v2 != 0x40000000 && Y.w(this) && this.C()) {
            int v3 = this.getMeasuredHeight();
            switch(v2) {
                case 0x80000000: {
                    v3 = x.a.b(this.getMeasuredHeight() + this.getTopInset(), 0, View.MeasureSpec.getSize(v1));
                    break;
                }
                case 0: {
                    v3 += this.getTopInset();
                }
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), v3);
        }
        this.n();
    }

    private boolean p() {
        return this.getBackground() instanceof g;
    }

    // 检测为 Lambda 实现
    private void q(ColorStateList colorStateList0, ColorStateList colorStateList1, g g0, Integer integer0, ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    private void r(g g0, ValueAnimator valueAnimator0) [...]

    void s(int v) {
        this.f = v;
        if(!this.willNotDraw()) {
            Y.f0(this);
        }
        List list0 = this.m;
        if(list0 != null) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                E.a(this.m.get(v2));
            }
        }
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        S1.h.d(this, f);
    }

    public void setExpanded(boolean z) {
        this.v(z, Y.S(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.q = z;
    }

    public void setLiftOnScrollTargetView(View view0) {
        this.r = -1;
        if(view0 == null) {
            this.c();
            return;
        }
        this.s = new WeakReference(view0);
    }

    public void setLiftOnScrollTargetViewId(int v) {
        this.r = v;
        this.c();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.n = z;
    }

    @Override  // android.widget.LinearLayout
    public void setOrientation(int v) {
        if(v != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    public void setStatusBarForeground(Drawable drawable0) {
        Drawable drawable1 = null;
        Drawable drawable2 = this.A;
        if(drawable2 != drawable0) {
            if(drawable2 != null) {
                drawable2.setCallback(null);
            }
            if(drawable0 != null) {
                drawable1 = drawable0.mutate();
            }
            this.A = drawable1;
            this.B = this.d();
            Drawable drawable3 = this.A;
            if(drawable3 != null) {
                if(drawable3.isStateful()) {
                    this.A.setState(this.getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.A, Y.z(this));
                this.A.setVisible(this.getVisibility() == 0, false);
                this.A.setCallback(this);
            }
            this.E();
            Y.f0(this);
        }
    }

    public void setStatusBarForegroundColor(int v) {
        this.setStatusBarForeground(new ColorDrawable(v));
    }

    public void setStatusBarForegroundResource(int v) {
        this.setStatusBarForeground(f.a.b(this.getContext(), v));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        h.b(this, f);
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        Drawable drawable0 = this.A;
        if(drawable0 != null) {
            drawable0.setVisible(v == 0, false);
        }
    }

    // 检测为 Lambda 实现
    y0 t(y0 y00) [...]

    void u() {
        this.k = 0;
    }

    public void v(boolean z, boolean z1) {
        this.w(z, z1, true);
    }

    @Override  // android.view.View
    protected boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.A;
    }

    // 去混淆评级： 低(20)
    private void w(boolean z, boolean z1, boolean z2) {
        this.k = (z ? 1 : 2) | (z1 ? 4 : 0) | (z2 ? 8 : 0);
        this.requestLayout();
    }

    private boolean x(boolean z) {
        if(this.o != z) {
            this.o = z;
            this.refreshDrawableState();
            return true;
        }
        return false;
    }

    boolean y(boolean z) {
        return this.z(z, !this.n);
    }

    boolean z(boolean z, boolean z1) {
        if(z1 && this.p != z) {
            float f = 0.0f;
            this.p = z;
            this.refreshDrawableState();
            if(this.p()) {
                if(this.t) {
                    if(z) {
                        f = 1.0f;
                    }
                    this.D((z ? 0.0f : 1.0f), f);
                    return true;
                }
                if(this.q) {
                    float f1 = z ? 0.0f : this.C;
                    if(z) {
                        f = this.C;
                    }
                    this.D(f1, f);
                }
            }
            return true;
        }
        return false;
    }
}

