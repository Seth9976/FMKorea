package com.google.android.material.bottomsheet;

import C.C;
import M1.b;
import M1.f;
import S1.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import androidx.core.view.y0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import z1.i;
import z1.j;

public class BottomSheetBehavior extends c implements b {
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
        final int h;
        int i;
        boolean j;
        boolean k;
        boolean l;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.h = parcel0.readInt();
            this.i = parcel0.readInt();
            boolean z = false;
            this.j = parcel0.readInt() == 1;
            this.k = parcel0.readInt() == 1;
            if(parcel0.readInt() == 1) {
                z = true;
            }
            this.l = z;
        }

        public SavedState(Parcelable parcelable0, BottomSheetBehavior bottomSheetBehavior0) {
            super(parcelable0);
            this.h = bottomSheetBehavior0.R;
            this.i = bottomSheetBehavior0.k;
            this.j = bottomSheetBehavior0.g;
            this.k = bottomSheetBehavior0.O;
            this.l = bottomSheetBehavior0.P;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.h);
            parcel0.writeInt(this.i);
            parcel0.writeInt(((int)this.j));
            parcel0.writeInt(((int)this.k));
            parcel0.writeInt(((int)this.l));
        }
    }

    class e extends H.c.c {
        private long a;
        final BottomSheetBehavior b;

        @Override  // H.c$c
        public int a(View view0, int v, int v1) {
            return view0.getLeft();
        }

        @Override  // H.c$c
        public int b(View view0, int v, int v1) {
            return x.a.b(v, BottomSheetBehavior.this.q0(), this.e(view0));
        }

        // 去混淆评级： 低(20)
        @Override  // H.c$c
        public int e(View view0) {
            return BottomSheetBehavior.this.i0() ? BottomSheetBehavior.this.a0 : BottomSheetBehavior.this.M;
        }

        @Override  // H.c$c
        public void j(int v) {
            if(v == 1 && BottomSheetBehavior.this.Q) {
                BottomSheetBehavior.this.S0(1);
            }
        }

        @Override  // H.c$c
        public void k(View view0, int v, int v1, int v2, int v3) {
            BottomSheetBehavior.this.n0(v1);
        }

        @Override  // H.c$c
        public void l(View view0, float f, float f1) {
            int v = 6;
            if(Float.compare(f1, 0.0f) >= 0) {
                if(!BottomSheetBehavior.this.O || !BottomSheetBehavior.this.W0(view0, f1)) {
                    if(f1 == 0.0f || Math.abs(f) > Math.abs(f1)) {
                        int v2 = view0.getTop();
                        if(!BottomSheetBehavior.this.g) {
                            BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.this;
                            int v3 = bottomSheetBehavior0.K;
                            if(v2 >= v3) {
                                if(Math.abs(v2 - v3) >= Math.abs(v2 - BottomSheetBehavior.this.M)) {
                                    v = 4;
                                }
                            }
                            else if(v2 < Math.abs(v2 - bottomSheetBehavior0.M)) {
                                v = 3;
                            }
                        }
                        else if(Math.abs(v2 - BottomSheetBehavior.this.J) >= Math.abs(v2 - BottomSheetBehavior.this.M)) {
                            v = 4;
                        }
                        else {
                            v = 3;
                        }
                    }
                    else if(!BottomSheetBehavior.this.g) {
                        int v1 = view0.getTop();
                        if(Math.abs(v1 - BottomSheetBehavior.this.K) >= Math.abs(v1 - BottomSheetBehavior.this.M)) {
                            v = 4;
                        }
                    }
                    else {
                        v = 4;
                    }
                }
                else if(Math.abs(f) < Math.abs(f1) && f1 > ((float)BottomSheetBehavior.this.j) || this.n(view0)) {
                    v = 5;
                }
                else if(BottomSheetBehavior.this.g || Math.abs(view0.getTop() - BottomSheetBehavior.this.q0()) < Math.abs(view0.getTop() - BottomSheetBehavior.this.K)) {
                    v = 3;
                }
            }
            else if(BottomSheetBehavior.this.g) {
                v = 3;
            }
            else if(view0.getTop() <= BottomSheetBehavior.this.K) {
                v = 3;
            }
            BottomSheetBehavior.this.Z0(view0, v, true);
        }

        @Override  // H.c$c
        public boolean m(View view0, int v) {
            BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.this;
            int v1 = bottomSheetBehavior0.R;
            if(v1 == 1) {
                return false;
            }
            if(bottomSheetBehavior0.j0) {
                return false;
            }
            if(v1 == 3 && bottomSheetBehavior0.h0 == v) {
                View view1 = bottomSheetBehavior0.d0 == null ? null : ((View)bottomSheetBehavior0.d0.get());
                if(view1 != null && view1.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.a = System.currentTimeMillis();
            WeakReference weakReference0 = BottomSheetBehavior.this.b0;
            return weakReference0 != null && weakReference0.get() == view0;
        }

        private boolean n(View view0) {
            return view0.getTop() > (BottomSheetBehavior.this.a0 + BottomSheetBehavior.this.q0()) / 2;
        }
    }

    class g {
        class com.google.android.material.bottomsheet.BottomSheetBehavior.g.a implements Runnable {
            final g f;

            @Override
            public void run() {
                g.this.b = false;
                H.c c0 = BottomSheetBehavior.this.T;
                if(c0 != null && c0.m(true)) {
                    g.this.c(g.this.a);
                    return;
                }
                g bottomSheetBehavior$g0 = g.this;
                BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.this;
                if(bottomSheetBehavior0.R == 2) {
                    bottomSheetBehavior0.S0(bottomSheetBehavior$g0.a);
                }
            }
        }

        private int a;
        private boolean b;
        private final Runnable c;
        final BottomSheetBehavior d;

        private g() {
            this.c = new com.google.android.material.bottomsheet.BottomSheetBehavior.g.a(this);
        }

        g(com.google.android.material.bottomsheet.BottomSheetBehavior.a bottomSheetBehavior$a0) {
        }

        void c(int v) {
            WeakReference weakReference0 = BottomSheetBehavior.this.b0;
            if(weakReference0 != null && weakReference0.get() != null) {
                this.a = v;
                if(!this.b) {
                    Y.g0(((View)BottomSheetBehavior.this.b0.get()), this.c);
                    this.b = true;
                }
            }
        }
    }

    private boolean A;
    private int B;
    private int C;
    private boolean D;
    private k E;
    private boolean F;
    private final g G;
    private ValueAnimator H;
    int I;
    int J;
    int K;
    float L;
    int M;
    float N;
    boolean O;
    private boolean P;
    private boolean Q;
    int R;
    int S;
    H.c T;
    private boolean U;
    private int V;
    private boolean W;
    private float X;
    private int Y;
    int Z;
    int a0;
    WeakReference b0;
    WeakReference c0;
    WeakReference d0;
    private final ArrayList e0;
    private int f;
    private VelocityTracker f0;
    private boolean g;
    f g0;
    private boolean h;
    int h0;
    private float i;
    private int i0;
    private int j;
    boolean j0;
    private int k;
    private Map k0;
    private boolean l;
    final SparseIntArray l0;
    private int m;
    private final H.c.c m0;
    private int n;
    private static final int n0;
    private S1.g o;
    private ColorStateList p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    static {
        BottomSheetBehavior.n0 = j.h;
    }

    public BottomSheetBehavior() {
        this.f = 0;
        this.g = true;
        this.h = false;
        this.q = -1;
        this.r = -1;
        this.G = new g(this, null);
        this.L = 0.5f;
        this.N = -1.0f;
        this.Q = true;
        this.R = 4;
        this.S = 4;
        this.X = 0.1f;
        this.e0 = new ArrayList();
        this.i0 = -1;
        this.l0 = new SparseIntArray();
        this.m0 = new e(this);
    }

    public BottomSheetBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = 0;
        this.g = true;
        this.h = false;
        this.q = -1;
        this.r = -1;
        this.G = new g(this, null);
        this.L = 0.5f;
        this.N = -1.0f;
        this.Q = true;
        this.R = 4;
        this.S = 4;
        this.X = 0.1f;
        this.e0 = new ArrayList();
        this.i0 = -1;
        this.l0 = new SparseIntArray();
        this.m0 = new e(this);
        this.n = context0.getResources().getDimensionPixelSize(z1.c.m0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, z1.k.w0);
        if(typedArray0.hasValue(z1.k.A0)) {
            this.p = P1.c.a(context0, typedArray0, 3);
        }
        if(typedArray0.hasValue(z1.k.S0)) {
            this.E = k.e(context0, attributeSet0, z1.a.f, BottomSheetBehavior.n0).m();
        }
        this.l0(context0);
        this.m0();
        this.N = typedArray0.getDimension(z1.k.z0, -1.0f);
        if(typedArray0.hasValue(z1.k.x0)) {
            this.L0(typedArray0.getDimensionPixelSize(0, -1));
        }
        if(typedArray0.hasValue(z1.k.y0)) {
            this.K0(typedArray0.getDimensionPixelSize(1, -1));
        }
        TypedValue typedValue0 = typedArray0.peekValue(z1.k.G0);
        if(typedValue0 == null || typedValue0.data != -1) {
            this.M0(typedArray0.getDimensionPixelSize(9, -1));
        }
        else {
            this.M0(-1);
        }
        this.J0(typedArray0.getBoolean(z1.k.F0, false));
        this.H0(typedArray0.getBoolean(z1.k.K0, false));
        this.G0(typedArray0.getBoolean(z1.k.D0, true));
        this.Q0(typedArray0.getBoolean(z1.k.J0, false));
        this.E0(typedArray0.getBoolean(z1.k.B0, true));
        this.O0(typedArray0.getInt(z1.k.H0, 0));
        this.I0(typedArray0.getFloat(z1.k.E0, 0.5f));
        TypedValue typedValue1 = typedArray0.peekValue(z1.k.C0);
        if(typedValue1 == null || typedValue1.type != 16) {
            this.F0(typedArray0.getDimensionPixelOffset(5, 0));
        }
        else {
            this.F0(typedValue1.data);
        }
        this.P0(typedArray0.getInt(z1.k.I0, 500));
        this.u = typedArray0.getBoolean(z1.k.O0, false);
        this.v = typedArray0.getBoolean(z1.k.P0, false);
        this.w = typedArray0.getBoolean(z1.k.Q0, false);
        this.x = typedArray0.getBoolean(z1.k.R0, true);
        this.y = typedArray0.getBoolean(z1.k.L0, false);
        this.z = typedArray0.getBoolean(z1.k.M0, false);
        this.A = typedArray0.getBoolean(z1.k.N0, false);
        this.D = typedArray0.getBoolean(z1.k.T0, true);
        typedArray0.recycle();
        this.i = (float)ViewConfiguration.get(context0).getScaledMaximumFlingVelocity();
    }

    private void A0(View view0, C.z.a z$a0, int v) {
        Y.k0(view0, z$a0, null, this.k0(v));
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public void B(CoordinatorLayout coordinatorLayout0, View view0, Parcelable parcelable0) {
        super.B(coordinatorLayout0, view0, ((SavedState)parcelable0).a());
        this.C0(((SavedState)parcelable0));
        int v = ((SavedState)parcelable0).h;
        if(v != 1 && v != 2) {
            this.R = v;
            this.S = v;
            return;
        }
        this.R = 4;
        this.S = 4;
    }

    private void B0() {
        this.h0 = -1;
        this.i0 = -1;
        VelocityTracker velocityTracker0 = this.f0;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.f0 = null;
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public Parcelable C(CoordinatorLayout coordinatorLayout0, View view0) {
        return new SavedState(super.C(coordinatorLayout0, view0), this);
    }

    private void C0(SavedState bottomSheetBehavior$SavedState0) {
        int v = this.f;
        if(v == 0) {
            return;
        }
        if(v == -1 || (v & 1) == 1) {
            this.k = bottomSheetBehavior$SavedState0.i;
        }
        if(v == -1 || (v & 2) == 2) {
            this.g = bottomSheetBehavior$SavedState0.j;
        }
        if(v == -1 || (v & 4) == 4) {
            this.O = bottomSheetBehavior$SavedState0.k;
        }
        if(v == -1 || (v & 8) == 8) {
            this.P = bottomSheetBehavior$SavedState0.l;
        }
    }

    private void D0(View view0, Runnable runnable0) {
        if(this.y0(view0)) {
            view0.post(runnable0);
            return;
        }
        runnable0.run();
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean E(CoordinatorLayout coordinatorLayout0, View view0, View view1, View view2, int v, int v1) {
        this.V = 0;
        this.W = false;
        return (v & 2) != 0;
    }

    public void E0(boolean z) {
        this.Q = z;
    }

    public void F0(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.I = v;
        this.c1(this.R, true);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public void G(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v) {
        int v1 = 3;
        if(view0.getTop() == this.q0()) {
            this.S0(3);
            return;
        }
        if(this.d0 == null || view1 != this.d0.get() || !this.W) {
            return;
        }
        if(this.V <= 0) {
            if(this.O && this.W0(view0, this.s0())) {
                v1 = 5;
            }
            else if(this.V == 0) {
                int v2 = view0.getTop();
                if(!this.g) {
                    int v3 = this.K;
                    if(v2 >= v3) {
                        v1 = Math.abs(v2 - v3) < Math.abs(v2 - this.M) ? 6 : 4;
                    }
                    else if(v2 >= Math.abs(v2 - this.M)) {
                        v1 = 6;
                    }
                }
                else if(Math.abs(v2 - this.J) >= Math.abs(v2 - this.M)) {
                    v1 = 4;
                }
            }
            else if(this.g) {
                v1 = 4;
            }
            else {
                int v4 = view0.getTop();
                v1 = Math.abs(v4 - this.K) < Math.abs(v4 - this.M) ? 6 : 4;
            }
        }
        else if(!this.g && view0.getTop() > this.K) {
            v1 = 6;
        }
        this.Z0(view0, v1, false);
        this.W = false;
    }

    public void G0(boolean z) {
        if(this.g == z) {
            return;
        }
        this.g = z;
        if(this.b0 != null) {
            this.c0();
        }
        this.S0((!this.g || this.R != 6 ? this.R : 3));
        this.c1(this.R, true);
        this.a1();
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean H(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        if(!view0.isShown()) {
            return false;
        }
        int v = motionEvent0.getActionMasked();
        if(this.R == 1 && v == 0) {
            return true;
        }
        if(this.V0()) {
            this.T.F(motionEvent0);
        }
        if(v == 0) {
            this.B0();
        }
        if(this.f0 == null) {
            this.f0 = VelocityTracker.obtain();
        }
        this.f0.addMovement(motionEvent0);
        if(this.V0() && v == 2 && !this.U && Math.abs(((float)this.i0) - motionEvent0.getY()) > ((float)this.T.z())) {
            this.T.b(view0, motionEvent0.getPointerId(motionEvent0.getActionIndex()));
        }
        return !this.U;
    }

    public void H0(boolean z) {
        this.t = z;
    }

    public void I0(float f) {
        if(f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.L = f;
        if(this.b0 != null) {
            this.e0();
        }
    }

    public void J0(boolean z) {
        if(this.O != z) {
            this.O = z;
            if(!z && this.R == 5) {
                this.R0(4);
            }
            this.a1();
        }
    }

    public void K0(int v) {
        this.r = v;
    }

    public void L0(int v) {
        this.q = v;
    }

    public void M0(int v) {
        this.N0(v, false);
    }

    public final void N0(int v, boolean z) {
        if(v == -1) {
            if(!this.l) {
                this.l = true;
                this.e1(z);
            }
        }
        else if(this.l || this.k != v) {
            this.l = false;
            this.k = Math.max(0, v);
            this.e1(z);
        }
    }

    public void O0(int v) {
        this.f = v;
    }

    public void P0(int v) {
        this.j = v;
    }

    public void Q0(boolean z) {
        this.P = z;
    }

    public void R0(int v) {
        class com.google.android.material.bottomsheet.BottomSheetBehavior.a implements Runnable {
            final View f;
            final int g;
            final BottomSheetBehavior h;

            com.google.android.material.bottomsheet.BottomSheetBehavior.a(View view0, int v) {
                this.f = view0;
                this.g = v;
                super();
            }

            @Override
            public void run() {
                BottomSheetBehavior.this.Z0(this.f, this.g, false);
            }
        }

        if(v == 1 || v == 2) {
            throw new IllegalArgumentException("STATE_" + (v == 1 ? "DRAGGING" : "SETTLING") + " should not be set externally.");
        }
        if(!this.O && v == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + 5);
            return;
        }
        int v1 = v != 6 || !this.g || this.r0(6) > this.J ? v : 3;
        if(this.b0 != null && this.b0.get() != null) {
            View view0 = (View)this.b0.get();
            this.D0(view0, new com.google.android.material.bottomsheet.BottomSheetBehavior.a(this, view0, v1));
            return;
        }
        this.S0(v);
    }

    void S0(int v) {
        if(this.R == v) {
            return;
        }
        this.R = v;
        if(v == 3 || v == 4 || v == 6 || this.O && v == 5) {
            this.S = v;
        }
        WeakReference weakReference0 = this.b0;
        if(weakReference0 == null) {
            return;
        }
        if(((View)weakReference0.get()) == null) {
            return;
        }
        if(v == 3) {
            this.d1(true);
        }
        else if(v == 4 || v == 5 || v == 6) {
            this.d1(false);
        }
        this.c1(v, true);
        if(this.e0.size() <= 0) {
            this.a1();
            return;
        }
        E.a(this.e0.get(0));
        throw null;
    }

    private void T0(View view0) {
        class d implements com.google.android.material.internal.t.c {
            final boolean a;
            final BottomSheetBehavior b;

            d(boolean z) {
                this.a = z;
                super();
            }

            @Override  // com.google.android.material.internal.t$c
            public y0 a(View view0, y0 y00, com.google.android.material.internal.t.d t$d0) {
                int v6;
                androidx.core.graphics.e e0 = y00.f(7);
                androidx.core.graphics.e e1 = y00.f(0x20);
                BottomSheetBehavior.this.C = e0.b;
                boolean z = t.g(view0);
                int v = view0.getPaddingBottom();
                int v1 = view0.getPaddingLeft();
                int v2 = view0.getPaddingRight();
                if(BottomSheetBehavior.U(BottomSheetBehavior.this)) {
                    int v3 = y00.i();
                    BottomSheetBehavior.W(BottomSheetBehavior.this, v3);
                    v = t$d0.d + BottomSheetBehavior.V(BottomSheetBehavior.this);
                }
                if(BottomSheetBehavior.X(BottomSheetBehavior.this)) {
                    v1 = (z ? t$d0.c : t$d0.a) + e0.a;
                }
                if(BottomSheetBehavior.Y(BottomSheetBehavior.this)) {
                    v2 = (z ? t$d0.a : t$d0.c) + e0.c;
                }
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
                int v4 = 1;
                if(BottomSheetBehavior.Z(BottomSheetBehavior.this)) {
                    int v5 = e0.a;
                    if(viewGroup$MarginLayoutParams0.leftMargin == v5) {
                        v6 = 0;
                    }
                    else {
                        viewGroup$MarginLayoutParams0.leftMargin = v5;
                        v6 = 1;
                    }
                }
                else {
                    v6 = 0;
                }
                if(BottomSheetBehavior.a0(BottomSheetBehavior.this)) {
                    int v7 = e0.c;
                    if(viewGroup$MarginLayoutParams0.rightMargin != v7) {
                        viewGroup$MarginLayoutParams0.rightMargin = v7;
                        v6 = 1;
                    }
                }
                if(BottomSheetBehavior.this.A) {
                    int v8 = e0.b;
                    if(viewGroup$MarginLayoutParams0.topMargin == v8) {
                        v4 = v6;
                    }
                    else {
                        viewGroup$MarginLayoutParams0.topMargin = v8;
                    }
                }
                else {
                    v4 = v6;
                }
                if(v4 != 0) {
                    view0.setLayoutParams(viewGroup$MarginLayoutParams0);
                }
                view0.setPadding(v1, view0.getPaddingTop(), v2, v);
                if(this.a) {
                    BottomSheetBehavior.this.s = e1.d;
                }
                if(BottomSheetBehavior.U(BottomSheetBehavior.this) || this.a) {
                    BottomSheetBehavior.this.e1(false);
                }
                return y00;
            }
        }

        boolean z = Build.VERSION.SDK_INT >= 29 && !this.v0() && !this.l;
        if(!this.u && !this.v && !this.w && !this.y && !this.z && !this.A && !z) {
            return;
        }
        t.b(view0, new d(this, z));
    }

    static boolean U(BottomSheetBehavior bottomSheetBehavior0) {
        return bottomSheetBehavior0.u;
    }

    public boolean U0(long v, float f) {
        return false;
    }

    static int V(BottomSheetBehavior bottomSheetBehavior0) {
        return bottomSheetBehavior0.B;
    }

    // 去混淆评级： 低(20)
    private boolean V0() {
        return this.T != null && (this.Q || this.R == 1);
    }

    static int W(BottomSheetBehavior bottomSheetBehavior0, int v) {
        bottomSheetBehavior0.B = v;
        return v;
    }

    boolean W0(View view0, float f) {
        if(this.P) {
            return true;
        }
        if(view0.getTop() < this.M) {
            return false;
        }
        int v = this.g0();
        return Math.abs(((float)view0.getTop()) + f * this.X - ((float)this.M)) / ((float)v) > 0.5f;
    }

    static boolean X(BottomSheetBehavior bottomSheetBehavior0) {
        return bottomSheetBehavior0.v;
    }

    public boolean X0() [...] // Inlined contents

    static boolean Y(BottomSheetBehavior bottomSheetBehavior0) {
        return bottomSheetBehavior0.w;
    }

    public boolean Y0() [...] // Inlined contents

    static boolean Z(BottomSheetBehavior bottomSheetBehavior0) {
        return bottomSheetBehavior0.y;
    }

    private void Z0(View view0, int v, boolean z) {
        int v1 = this.r0(v);
        H.c c0 = this.T;
        if(c0 != null) {
            if(!z) {
                if(c0.Q(view0, view0.getLeft(), v1)) {
                    this.S0(2);
                    this.c1(v, true);
                    this.G.c(v);
                    return;
                }
            }
            else if(c0.O(view0.getLeft(), v1)) {
                this.S0(2);
                this.c1(v, true);
                this.G.c(v);
                return;
            }
        }
        this.S0(v);
    }

    @Override  // M1.b
    public void a(androidx.activity.b b0) {
        f f0 = this.g0;
        if(f0 == null) {
            return;
        }
        f0.j(b0);
    }

    static boolean a0(BottomSheetBehavior bottomSheetBehavior0) {
        return bottomSheetBehavior0.z;
    }

    private void a1() {
        WeakReference weakReference0 = this.b0;
        if(weakReference0 != null) {
            this.b1(((View)weakReference0.get()), 0);
        }
        WeakReference weakReference1 = this.c0;
        if(weakReference1 != null) {
            this.b1(((View)weakReference1.get()), 1);
        }
    }

    @Override  // M1.b
    public void b(androidx.activity.b b0) {
        f f0 = this.g0;
        if(f0 == null) {
            return;
        }
        f0.l(b0);
    }

    private int b0(View view0, int v, int v1) {
        return Y.c(view0, view0.getResources().getString(v), this.k0(v1));
    }

    private void b1(View view0, int v) {
        if(view0 == null) {
            return;
        }
        this.j0(view0, v);
        int v1 = 6;
        if(!this.g && this.R != 6) {
            int v2 = this.b0(view0, i.a, 6);
            this.l0.put(v, v2);
        }
        if(this.O && this.R != 5) {
            this.A0(view0, C.z.a.y, 5);
        }
        switch(this.R) {
            case 3: {
                if(this.g) {
                    v1 = 4;
                }
                this.A0(view0, C.z.a.x, v1);
                return;
            }
            case 4: {
                if(this.g) {
                    v1 = 3;
                }
                this.A0(view0, C.z.a.w, v1);
                return;
            }
            case 6: {
                this.A0(view0, C.z.a.x, 4);
                this.A0(view0, C.z.a.w, 3);
            }
        }
    }

    @Override  // M1.b
    public void c() {
        class com.google.android.material.bottomsheet.BottomSheetBehavior.b extends AnimatorListenerAdapter {
            final BottomSheetBehavior a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                BottomSheetBehavior.this.S0(5);
                WeakReference weakReference0 = BottomSheetBehavior.this.b0;
                if(weakReference0 != null && weakReference0.get() != null) {
                    ((View)BottomSheetBehavior.this.b0.get()).requestLayout();
                }
            }
        }

        f f0 = this.g0;
        if(f0 == null) {
            return;
        }
        androidx.activity.b b0 = f0.c();
        int v = 4;
        if(b0 != null && Build.VERSION.SDK_INT >= 34) {
            if(this.O) {
                this.g0.h(b0, new com.google.android.material.bottomsheet.BottomSheetBehavior.b(this));
                return;
            }
            this.g0.i(b0, null);
            this.R0(4);
            return;
        }
        if(this.O) {
            v = 5;
        }
        this.R0(v);
    }

    private void c0() {
        int v = this.g0();
        if(this.g) {
            this.M = Math.max(this.a0 - v, this.J);
            return;
        }
        this.M = this.a0 - v;
    }

    private void c1(int v, boolean z) {
        if(v == 2) {
            return;
        }
        boolean z1 = this.u0();
        if(this.F != z1 && this.o != null) {
            this.F = z1;
            float f = 1.0f;
            if(z) {
                ValueAnimator valueAnimator0 = this.H;
                if(valueAnimator0 != null) {
                    if(valueAnimator0.isRunning()) {
                        this.H.reverse();
                        return;
                    }
                    float f1 = this.o.w();
                    if(z1) {
                        f = this.f0();
                    }
                    this.H.setFloatValues(new float[]{f1, f});
                    this.H.start();
                    return;
                }
            }
            if(this.H != null && this.H.isRunning()) {
                this.H.cancel();
            }
            S1.g g0 = this.o;
            if(this.F) {
                f = this.f0();
            }
            g0.W(f);
        }
    }

    @Override  // M1.b
    public void d() {
        f f0 = this.g0;
        if(f0 == null) {
            return;
        }
        f0.f();
    }

    private float d0(float f, RoundedCorner roundedCorner0) {
        if(roundedCorner0 != null) {
            float f1 = (float)roundedCorner0.getRadius();
            return f1 <= 0.0f || f <= 0.0f ? 0.0f : f1 / f;
        }
        return 0.0f;
    }

    private void d1(boolean z) {
        WeakReference weakReference0 = this.b0;
        if(weakReference0 == null) {
            return;
        }
        ViewParent viewParent0 = ((View)weakReference0.get()).getParent();
        if(!(viewParent0 instanceof CoordinatorLayout)) {
            return;
        }
        int v = ((CoordinatorLayout)viewParent0).getChildCount();
        if(z) {
            if(this.k0 == null) {
                this.k0 = new HashMap(v);
                goto label_12;
            }
            return;
        }
    label_12:
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = ((CoordinatorLayout)viewParent0).getChildAt(v1);
            if(view0 != this.b0.get()) {
                if(z) {
                    this.k0.put(view0, view0.getImportantForAccessibility());
                    if(this.h) {
                        Y.x0(view0, 4);
                    }
                }
                else if(this.h && (this.k0 != null && this.k0.containsKey(view0))) {
                    Y.x0(view0, ((int)(((Integer)this.k0.get(view0)))));
                }
            }
        }
        if(!z) {
            this.k0 = null;
            return;
        }
        if(this.h) {
            ((View)this.b0.get()).sendAccessibilityEvent(8);
        }
    }

    private void e0() {
        this.K = (int)(((float)this.a0) * (1.0f - this.L));
    }

    private void e1(boolean z) {
        if(this.b0 != null) {
            this.c0();
            if(this.R == 4) {
                View view0 = (View)this.b0.get();
                if(view0 != null) {
                    if(z) {
                        this.R0(4);
                        return;
                    }
                    view0.requestLayout();
                }
            }
        }
    }

    private float f0() {
        if(this.o != null && (this.b0 != null && this.b0.get() != null && Build.VERSION.SDK_INT >= 0x1F)) {
            View view0 = (View)this.b0.get();
            if(this.t0()) {
                WindowInsets windowInsets0 = view0.getRootWindowInsets();
                return windowInsets0 == null ? 0.0f : Math.max(this.d0(this.o.D(), windowInsets0.getRoundedCorner(0)), this.d0(this.o.E(), windowInsets0.getRoundedCorner(1)));
            }
        }
        return 0.0f;
    }

    private int g0() {
        if(this.l) {
            return Math.min(Math.max(this.m, this.a0 - this.Z * 9 / 16), this.Y) + this.B;
        }
        if(!this.t && !this.u) {
            return this.s <= 0 ? this.k + this.B : Math.max(this.k, this.s + this.n);
        }
        return this.k + this.B;
    }

    private float h0(int v) {
        return v > this.M || this.M == this.q0() ? ((float)(this.M - v)) / ((float)(this.a0 - this.M)) : ((float)(this.M - v)) / ((float)(this.M - this.q0()));
    }

    private boolean i0() {
        return this.w0();
    }

    private void j0(View view0, int v) {
        if(view0 == null) {
            return;
        }
        Y.i0(view0, 0x80000);
        Y.i0(view0, 0x40000);
        Y.i0(view0, 0x100000);
        int v1 = this.l0.get(v, -1);
        if(v1 != -1) {
            Y.i0(view0, v1);
            this.l0.delete(v);
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public void k(androidx.coordinatorlayout.widget.CoordinatorLayout.f coordinatorLayout$f0) {
        super.k(coordinatorLayout$f0);
        this.b0 = null;
        this.T = null;
        this.g0 = null;
    }

    private C k0(int v) {
        class com.google.android.material.bottomsheet.BottomSheetBehavior.f implements C {
            final int a;
            final BottomSheetBehavior b;

            com.google.android.material.bottomsheet.BottomSheetBehavior.f(int v) {
                this.a = v;
                super();
            }

            @Override  // C.C
            public boolean a(View view0, C.C.a c$a0) {
                BottomSheetBehavior.this.R0(this.a);
                return true;
            }
        }

        return new com.google.android.material.bottomsheet.BottomSheetBehavior.f(this, v);
    }

    private void l0(Context context0) {
        if(this.E == null) {
            return;
        }
        S1.g g0 = new S1.g(this.E);
        this.o = g0;
        g0.K(context0);
        ColorStateList colorStateList0 = this.p;
        if(colorStateList0 != null) {
            this.o.V(colorStateList0);
            return;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x1010031, typedValue0, true);
        this.o.setTint(typedValue0.data);
    }

    private void m0() {
        class com.google.android.material.bottomsheet.BottomSheetBehavior.c implements ValueAnimator.AnimatorUpdateListener {
            final BottomSheetBehavior a;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                if(BottomSheetBehavior.this.o != null) {
                    BottomSheetBehavior.this.o.W(f);
                }
            }
        }

        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{this.f0(), 1.0f});
        this.H = valueAnimator0;
        valueAnimator0.setDuration(500L);
        this.H.addUpdateListener(new com.google.android.material.bottomsheet.BottomSheetBehavior.c(this));
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public void n() {
        super.n();
        this.b0 = null;
        this.T = null;
        this.g0 = null;
    }

    void n0(int v) {
        if(((View)this.b0.get()) != null && !this.e0.isEmpty()) {
            this.h0(v);
            if(this.e0.size() > 0) {
                E.a(this.e0.get(0));
                throw null;
            }
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean o(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        if(view0.isShown() && this.Q) {
            int v = motionEvent0.getActionMasked();
            if(v == 0) {
                this.B0();
            }
            if(this.f0 == null) {
                this.f0 = VelocityTracker.obtain();
            }
            this.f0.addMovement(motionEvent0);
            View view1 = null;
            switch(v) {
                case 0: {
                    int v1 = (int)motionEvent0.getX();
                    this.i0 = (int)motionEvent0.getY();
                    if(this.R != 2) {
                        View view2 = this.d0 == null ? null : ((View)this.d0.get());
                        if(view2 != null && coordinatorLayout0.B(view2, v1, this.i0)) {
                            this.h0 = motionEvent0.getPointerId(motionEvent0.getActionIndex());
                            this.j0 = true;
                        }
                    }
                    this.U = this.h0 == -1 && !coordinatorLayout0.B(view0, v1, this.i0);
                    break;
                }
                case 1: {
                label_20:
                    this.j0 = false;
                    this.h0 = -1;
                    if(this.U) {
                        this.U = false;
                        return false;
                    }
                    break;
                }
                default: {
                    if(v == 3) {
                        goto label_20;
                    }
                }
            }
            if(!this.U && (this.T != null && this.T.P(motionEvent0))) {
                return true;
            }
            WeakReference weakReference0 = this.d0;
            if(weakReference0 != null) {
                view1 = (View)weakReference0.get();
            }
            return v == 2 && view1 != null && !this.U && this.R != 1 && !coordinatorLayout0.B(view1, ((int)motionEvent0.getX()), ((int)motionEvent0.getY())) && this.T != null && (this.i0 != -1 && Math.abs(((float)this.i0) - motionEvent0.getY()) > ((float)this.T.z()));
        }
        this.U = true;
        return false;
    }

    View o0(View view0) {
        if(view0.getVisibility() != 0) {
            return null;
        }
        if(Y.T(view0)) {
            return view0;
        }
        if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = this.o0(((ViewGroup)view0).getChildAt(v1));
                if(view1 != null) {
                    return view1;
                }
            }
        }
        return null;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean p(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        if(Y.w(coordinatorLayout0) && !Y.w(view0)) {
            view0.setFitsSystemWindows(true);
        }
        if(this.b0 == null) {
            this.m = coordinatorLayout0.getResources().getDimensionPixelSize(z1.c.h);
            this.T0(view0);
            Y.J0(view0, new com.google.android.material.bottomsheet.a(view0));
            this.b0 = new WeakReference(view0);
            this.g0 = new f(view0);
            S1.g g0 = this.o;
            if(g0 == null) {
                ColorStateList colorStateList0 = this.p;
                if(colorStateList0 != null) {
                    Y.t0(view0, colorStateList0);
                }
            }
            else {
                Y.s0(view0, g0);
                this.o.U((this.N == -1.0f ? Y.u(view0) : this.N));
            }
            this.a1();
            if(Y.x(view0) == 0) {
                Y.x0(view0, 1);
            }
        }
        if(this.T == null) {
            this.T = H.c.o(coordinatorLayout0, this.m0);
        }
        int v1 = view0.getTop();
        coordinatorLayout0.I(view0, v);
        this.Z = coordinatorLayout0.getWidth();
        this.a0 = coordinatorLayout0.getHeight();
        int v2 = view0.getHeight();
        this.Y = v2;
        int v3 = this.a0;
        int v4 = this.C;
        if(v3 - v2 < v4) {
            if(this.x) {
                int v5 = this.r;
                if(v5 != -1) {
                    v3 = Math.min(v3, v5);
                }
                this.Y = v3;
            }
            else {
                int v6 = v3 - v4;
                int v7 = this.r;
                if(v7 != -1) {
                    v6 = Math.min(v6, v7);
                }
                this.Y = v6;
            }
        }
        this.J = Math.max(0, this.a0 - this.Y);
        this.e0();
        this.c0();
        int v8 = this.R;
        if(v8 == 3) {
            Y.Z(view0, this.q0());
        }
        else if(v8 == 6) {
            Y.Z(view0, this.K);
        }
        else if(!this.O || v8 != 5) {
            switch(v8) {
                case 1: 
                case 2: {
                    Y.Z(view0, v1 - view0.getTop());
                    break;
                }
                case 4: {
                    Y.Z(view0, this.M);
                }
            }
        }
        else {
            Y.Z(view0, this.a0);
        }
        this.c1(this.R, false);
        this.d0 = new WeakReference(this.o0(view0));
        if(this.e0.size() <= 0) {
            return true;
        }
        E.a(this.e0.get(0));
        throw null;
    }

    private int p0(int v, int v1, int v2, int v3) {
        int v4 = ViewGroup.getChildMeasureSpec(v, v1, v3);
        if(v2 == -1) {
            return v4;
        }
        int v5 = View.MeasureSpec.getMode(v4);
        int v6 = View.MeasureSpec.getSize(v4);
        if(v5 != 0x40000000) {
            if(v6 != 0) {
                v2 = Math.min(v6, v2);
            }
            return View.MeasureSpec.makeMeasureSpec(v2, 0x80000000);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(v6, v2), 0x40000000);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean q(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2, int v3) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        view0.measure(this.p0(v, coordinatorLayout0.getPaddingLeft() + coordinatorLayout0.getPaddingRight() + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, this.q, viewGroup$MarginLayoutParams0.width), this.p0(v2, coordinatorLayout0.getPaddingTop() + coordinatorLayout0.getPaddingBottom() + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + v3, this.r, viewGroup$MarginLayoutParams0.height));
        return true;
    }

    public int q0() {
        if(this.g) {
            return this.J;
        }
        return this.x ? Math.max(this.I, 0) : Math.max(this.I, this.C);
    }

    private int r0(int v) {
        switch(v) {
            case 3: {
                return this.q0();
            }
            case 4: {
                return this.M;
            }
            case 5: {
                return this.a0;
            }
            case 6: {
                return this.K;
            }
            default: {
                throw new IllegalArgumentException("Invalid state to get top offset: " + v);
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean s(CoordinatorLayout coordinatorLayout0, View view0, View view1, float f, float f1) {
        return this.d0 != null && view1 == this.d0.get() && (this.R != 3 || super.s(coordinatorLayout0, view0, view1, f, f1));
    }

    private float s0() {
        VelocityTracker velocityTracker0 = this.f0;
        if(velocityTracker0 == null) {
            return 0.0f;
        }
        velocityTracker0.computeCurrentVelocity(1000, this.i);
        return this.f0.getYVelocity(this.h0);
    }

    private boolean t0() {
        if(this.b0 != null && this.b0.get() != null) {
            int[] arr_v = new int[2];
            ((View)this.b0.get()).getLocationOnScreen(arr_v);
            return arr_v[1] == 0;
        }
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public void u(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int[] arr_v, int v2) {
        if(v2 == 1) {
            return;
        }
        if(view1 != (this.d0 == null ? null : ((View)this.d0.get()))) {
            return;
        }
        int v3 = view0.getTop();
        int v4 = v3 - v1;
        if(v1 <= 0) {
            if(v1 < 0 && !view1.canScrollVertically(-1)) {
                if(v4 <= this.M || this.i0()) {
                    if(!this.Q) {
                        return;
                    }
                    arr_v[1] = v1;
                    Y.Z(view0, -v1);
                    this.S0(1);
                }
                else {
                    int v6 = v3 - this.M;
                    arr_v[1] = v6;
                    Y.Z(view0, -v6);
                    this.S0(4);
                }
            }
        }
        else if(v4 < this.q0()) {
            int v5 = v3 - this.q0();
            arr_v[1] = v5;
            Y.Z(view0, -v5);
            this.S0(3);
        }
        else {
            if(!this.Q) {
                return;
            }
            arr_v[1] = v1;
            Y.Z(view0, -v1);
            this.S0(1);
        }
        this.n0(view0.getTop());
        this.V = v1;
        this.W = true;
    }

    // 去混淆评级： 低(20)
    private boolean u0() {
        return this.R == 3 && (this.D || this.t0());
    }

    public boolean v0() {
        return this.t;
    }

    public boolean w0() {
        return this.O;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public void x(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
    }

    public boolean x0() [...] // Inlined contents

    private boolean y0(View view0) {
        ViewParent viewParent0 = view0.getParent();
        return viewParent0 != null && viewParent0.isLayoutRequested() && Y.R(view0);
    }

    public boolean z0() [...] // Inlined contents
}

