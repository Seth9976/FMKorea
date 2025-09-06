package androidx.drawerlayout.widget;

import C.C;
import C.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.f0;
import androidx.core.view.Y;
import androidx.core.view.s;
import androidx.core.view.y0;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class DrawerLayout extends ViewGroup {
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
        int h;
        int i;
        int j;
        int k;
        int l;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.h = parcel0.readInt();
            this.i = parcel0.readInt();
            this.j = parcel0.readInt();
            this.k = parcel0.readInt();
            this.l = parcel0.readInt();
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
            this.h = 0;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.h);
            parcel0.writeInt(this.i);
            parcel0.writeInt(this.j);
            parcel0.writeInt(this.k);
            parcel0.writeInt(this.l);
        }
    }

    class androidx.drawerlayout.widget.DrawerLayout.a extends androidx.core.view.a {
        private final Rect d;
        final DrawerLayout e;

        androidx.drawerlayout.widget.DrawerLayout.a() {
            this.d = new Rect();
        }

        @Override  // androidx.core.view.a
        public boolean a(View view0, AccessibilityEvent accessibilityEvent0) {
            if(accessibilityEvent0.getEventType() == 0x20) {
                List list0 = accessibilityEvent0.getText();
                View view1 = DrawerLayout.this.r();
                if(view1 != null) {
                    int v = DrawerLayout.this.v(view1);
                    CharSequence charSequence0 = DrawerLayout.this.u(v);
                    if(charSequence0 != null) {
                        list0.add(charSequence0);
                    }
                }
                return true;
            }
            return super.a(view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.a
        public void f(View view0, AccessibilityEvent accessibilityEvent0) {
            super.f(view0, accessibilityEvent0);
            accessibilityEvent0.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override  // androidx.core.view.a
        public void g(View view0, z z0) {
            if(DrawerLayout.U) {
                super.g(view0, z0);
            }
            else {
                z z1 = z.a0(z0);
                super.g(view0, z1);
                z0.I0(view0);
                ViewParent viewParent0 = Y.F(view0);
                if(viewParent0 instanceof View) {
                    z0.B0(((View)viewParent0));
                }
                this.o(z0, z1);
                this.n(z0, ((ViewGroup)view0));
            }
            z0.m0("androidx.drawerlayout.widget.DrawerLayout");
            z0.t0(false);
            z0.u0(false);
            z0.e0(C.z.a.e);
            z0.e0(C.z.a.f);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.core.view.a
        public boolean i(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
            return DrawerLayout.U || DrawerLayout.C(view0) ? super.i(viewGroup0, view0, accessibilityEvent0) : false;
        }

        private void n(z z0, ViewGroup viewGroup0) {
            int v = viewGroup0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = viewGroup0.getChildAt(v1);
                if(DrawerLayout.C(view0)) {
                    z0.c(view0);
                }
            }
        }

        private void o(z z0, z z1) {
            z1.n(this.d);
            z0.j0(this.d);
            z0.N0(z1.Y());
            z0.z0(z1.y());
            z0.m0(z1.q());
            z0.q0(z1.t());
            z0.r0(z1.N());
            z0.u0(z1.P());
            z0.g0(z1.I());
            z0.G0(z1.V());
            z0.a(z1.k());
        }
    }

    static abstract class b {
        static OnBackInvokedDispatcher a(DrawerLayout drawerLayout0) {
            return drawerLayout0.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable0) {
            Objects.requireNonNull(runnable0);
            return new f0(runnable0);
        }

        static void c(Object object0, Object object1) {
            ((OnBackInvokedDispatcher)object0).registerOnBackInvokedCallback(1000000, ((OnBackInvokedCallback)object1));
        }

        static void d(Object object0, Object object1) {
            ((OnBackInvokedDispatcher)object0).unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object1));
        }
    }

    static final class c extends androidx.core.view.a {
        @Override  // androidx.core.view.a
        public void g(View view0, z z0) {
            super.g(view0, z0);
            if(!DrawerLayout.C(view0)) {
                z0.B0(null);
            }
        }
    }

    public interface d {
        void a(View arg1);

        void b(View arg1);

        void c(int arg1);

        void d(View arg1, float arg2);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public int a;
        float b;
        boolean c;
        int d;

        public e(int v, int v1) {
            super(v, v1);
            this.a = 0;
        }

        public e(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = 0;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, DrawerLayout.T);
            this.a = typedArray0.getInt(0, 0);
            typedArray0.recycle();
        }

        public e(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = 0;
        }

        public e(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.a = 0;
        }

        public e(e drawerLayout$e0) {
            super(drawerLayout$e0);
            this.a = drawerLayout$e0.a;
        }
    }

    public static abstract class f implements d {
        @Override  // androidx.drawerlayout.widget.DrawerLayout$d
        public void c(int v) {
        }

        @Override  // androidx.drawerlayout.widget.DrawerLayout$d
        public void d(View view0, float f) {
        }
    }

    class g extends H.c.c {
        private final int a;
        private H.c b;
        private final Runnable c;
        final DrawerLayout d;

        g(int v) {
            this.c = () -> {
                int v2;
                View view0;
                int v = this.b.x();
                int v1 = 0;
                boolean z = this.a == 3;
                if(z) {
                    view0 = DrawerLayout.this.p(3);
                    if(view0 != null) {
                        v1 = -view0.getWidth();
                    }
                    v2 = v1 + v;
                }
                else {
                    view0 = DrawerLayout.this.p(5);
                    v2 = DrawerLayout.this.getWidth() - v;
                }
                if(view0 != null && (z && view0.getLeft() < v2 || !z && view0.getLeft() > v2) && DrawerLayout.this.t(view0) == 0) {
                    e drawerLayout$e0 = (e)view0.getLayoutParams();
                    this.b.Q(view0, v2, view0.getTop());
                    drawerLayout$e0.c = true;
                    DrawerLayout.this.invalidate();
                    this.n();
                    DrawerLayout.this.d();
                }
            };
            this.a = v;
        }

        @Override  // H.c$c
        public int a(View view0, int v, int v1) {
            if(DrawerLayout.this.e(view0, 3)) {
                return Math.max(-view0.getWidth(), Math.min(v, 0));
            }
            int v2 = DrawerLayout.this.getWidth();
            return Math.max(v2 - view0.getWidth(), Math.min(v, v2));
        }

        @Override  // H.c$c
        public int b(View view0, int v, int v1) {
            return view0.getTop();
        }

        // 去混淆评级： 低(20)
        @Override  // H.c$c
        public int d(View view0) {
            return DrawerLayout.this.G(view0) ? view0.getWidth() : 0;
        }

        @Override  // H.c$c
        public void f(int v, int v1) {
            View view0 = (v & 1) == 1 ? DrawerLayout.this.p(3) : DrawerLayout.this.p(5);
            if(view0 != null && DrawerLayout.this.t(view0) == 0) {
                this.b.b(view0, v1);
            }
        }

        @Override  // H.c$c
        public boolean g(int v) {
            return false;
        }

        @Override  // H.c$c
        public void h(int v, int v1) {
            DrawerLayout.this.postDelayed(this.c, 0xA0L);
        }

        @Override  // H.c$c
        public void i(View view0, int v) {
            ((e)view0.getLayoutParams()).c = false;
            this.n();
        }

        @Override  // H.c$c
        public void j(int v) {
            View view0 = this.b.v();
            DrawerLayout.this.c0(v, view0);
        }

        @Override  // H.c$c
        public void k(View view0, int v, int v1, int v2, int v3) {
            int v4 = view0.getWidth();
            float f = (DrawerLayout.this.e(view0, 3) ? ((float)(v + v4)) : ((float)(DrawerLayout.this.getWidth() - v))) / ((float)v4);
            DrawerLayout.this.Y(view0, f);
            view0.setVisibility((f == 0.0f ? 4 : 0));
            DrawerLayout.this.invalidate();
        }

        @Override  // H.c$c
        public void l(View view0, float f, float f1) {
            int v2;
            float f2 = DrawerLayout.this.w(view0);
            int v = view0.getWidth();
            if(DrawerLayout.this.e(view0, 3)) {
                int v1 = Float.compare(f, 0.0f);
                v2 = v1 > 0 || v1 == 0 && f2 > 0.5f ? 0 : -v;
            }
            else {
                int v3 = DrawerLayout.this.getWidth();
                if(f < 0.0f || f == 0.0f && f2 > 0.5f) {
                    v3 -= v;
                }
                v2 = v3;
            }
            this.b.O(v2, view0.getTop());
            DrawerLayout.this.invalidate();
        }

        // 去混淆评级： 低(20)
        @Override  // H.c$c
        public boolean m(View view0, int v) {
            return DrawerLayout.this.G(view0) && DrawerLayout.this.e(view0, this.a) && DrawerLayout.this.t(view0) == 0;
        }

        private void n() {
            View view0 = DrawerLayout.this.p((this.a == 3 ? 5 : 3));
            if(view0 != null) {
                DrawerLayout.this.h(view0);
            }
        }

        // 检测为 Lambda 实现
        void o() [...]

        public void p() {
            DrawerLayout.this.removeCallbacks(this.c);
        }

        public void q(H.c c0) {
            this.b = c0;
        }
    }

    private List A;
    private float B;
    private float C;
    private Drawable D;
    private Drawable E;
    private Drawable F;
    private CharSequence G;
    private CharSequence H;
    private y0 I;
    private boolean J;
    private Drawable K;
    private Drawable L;
    private Drawable M;
    private Drawable N;
    private final ArrayList O;
    private Rect P;
    private Matrix Q;
    private final C R;
    private static final int[] S;
    static final int[] T;
    static final boolean U;
    private static final boolean V;
    private static final boolean W;
    private final c f;
    private float g;
    private final int h;
    private int i;
    private float j;
    private final Paint k;
    private final H.c l;
    private final H.c m;
    private final g n;
    private final g o;
    private int p;
    private boolean q;
    private boolean r;
    private OnBackInvokedCallback s;
    private OnBackInvokedDispatcher t;
    private int u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private d z;

    static {
        DrawerLayout.S = new int[]{0x1010434};
        DrawerLayout.T = new int[]{0x10100B3};
        boolean z = true;
        DrawerLayout.U = true;
        DrawerLayout.V = true;
        if(Build.VERSION.SDK_INT < 29) {
            z = false;
        }
        DrawerLayout.W = z;
    }

    public DrawerLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.f = new c();
        this.i = 0x99000000;
        this.k = new Paint();
        this.r = true;
        this.u = 3;
        this.v = 3;
        this.w = 3;
        this.x = 3;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.R = (View view0, C.C.a c$a0) -> {
            if(this.F(view0) && this.t(view0) != 2) {
                this.h(view0);
                return true;
            }
            return false;
        };
        this.setDescendantFocusability(0x40000);
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.h = (int)(64.0f * displayMetrics0.density + 0.5f);
        float f = displayMetrics0.density * 400.0f;
        g drawerLayout$g0 = new g(this, 3);
        this.n = drawerLayout$g0;
        g drawerLayout$g1 = new g(this, 5);
        this.o = drawerLayout$g1;
        H.c c0 = H.c.n(this, 1.0f, drawerLayout$g0);
        this.l = c0;
        c0.M(1);
        c0.N(f);
        drawerLayout$g0.q(c0);
        H.c c1 = H.c.n(this, 1.0f, drawerLayout$g1);
        this.m = c1;
        c1.M(2);
        c1.N(f);
        drawerLayout$g1.q(c1);
        this.setFocusableInTouchMode(true);
        Y.x0(this, 1);
        Y.o0(this, new androidx.drawerlayout.widget.DrawerLayout.a(this));
        this.setMotionEventSplittingEnabled(false);
        if(Y.w(this)) {
            Y.B0(this, (View view0, y0 y00) -> {
                ((DrawerLayout)view0).W(y00, y00.m().b > 0);
                return y00.c();
            });
            this.setSystemUiVisibility(0x500);
            TypedArray typedArray0 = context0.obtainStyledAttributes(DrawerLayout.S);
            try {
                this.D = typedArray0.getDrawable(0);
            }
            finally {
                typedArray0.recycle();
            }
        }
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, N.b.a, v, 0);
        try {
            int v3 = N.b.b;
            this.g = typedArray1.hasValue(v3) ? typedArray1.getDimension(v3, 0.0f) : this.getResources().getDimension(N.a.a);
        }
        finally {
            typedArray1.recycle();
        }
        this.O = new ArrayList();
    }

    private boolean A() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((e)this.getChildAt(v1).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    private boolean B() {
        return this.r() != null;
    }

    static boolean C(View view0) {
        switch(Y.x(view0)) {
            case 2: 
            case 4: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    boolean D(View view0) {
        return ((e)view0.getLayoutParams()).a == 0;
    }

    public boolean E(int v) {
        View view0 = this.p(v);
        return view0 == null ? false : this.F(view0);
    }

    public boolean F(View view0) {
        if(!this.G(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return (((e)view0.getLayoutParams()).d & 1) == 1;
    }

    boolean G(View view0) {
        int v = s.b(((e)view0.getLayoutParams()).a, Y.z(view0));
        return (v & 3) == 0 ? (v & 5) != 0 : true;
    }

    public boolean H(int v) {
        View view0 = this.p(v);
        return view0 == null ? false : this.I(view0);
    }

    public boolean I(View view0) {
        if(!this.G(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return ((e)view0.getLayoutParams()).b > 0.0f;
    }

    private boolean J(float f, float f1, View view0) {
        if(this.P == null) {
            this.P = new Rect();
        }
        view0.getHitRect(this.P);
        return this.P.contains(((int)f), ((int)f1));
    }

    // 检测为 Lambda 实现
    private boolean K(View view0, C.C.a c$a0) [...]

    // 检测为 Lambda 实现
    private static y0 L(View view0, y0 y00) [...]

    private void M(Drawable drawable0, int v) {
        if(drawable0 != null && androidx.core.graphics.drawable.a.h(drawable0)) {
            androidx.core.graphics.drawable.a.m(drawable0, v);
        }
    }

    void N(View view0, float f) {
        float f1 = this.w(view0);
        float f2 = (float)view0.getWidth();
        view0.offsetLeftAndRight((this.e(view0, 3) ? ((int)(f2 * f)) - ((int)(f1 * f2)) : -(((int)(f2 * f)) - ((int)(f1 * f2)))));
        this.Y(view0, f);
    }

    public void O(int v) {
        this.P(v, true);
    }

    public void P(int v, boolean z) {
        View view0 = this.p(v);
        if(view0 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.y(v));
        }
        this.R(view0, z);
    }

    public void Q(View view0) {
        this.R(view0, true);
    }

    public void R(View view0, boolean z) {
        if(!this.G(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a sliding drawer");
        }
        e drawerLayout$e0 = (e)view0.getLayoutParams();
        if(this.r) {
            drawerLayout$e0.b = 1.0f;
            drawerLayout$e0.d = 1;
            this.b0(view0, true);
            this.a0(view0);
            this.Z();
        }
        else if(z) {
            drawerLayout$e0.d |= 2;
            if(this.e(view0, 3)) {
                int v = view0.getTop();
                this.l.Q(view0, 0, v);
            }
            else {
                int v1 = this.getWidth();
                int v2 = view0.getWidth();
                int v3 = view0.getTop();
                this.m.Q(view0, v1 - v2, v3);
            }
        }
        else {
            this.N(view0, 1.0f);
            this.c0(0, view0);
            view0.setVisibility(0);
        }
        this.invalidate();
    }

    public void S(d drawerLayout$d0) {
        List list0 = this.A;
        if(list0 == null) {
            return;
        }
        list0.remove(drawerLayout$d0);
    }

    private Drawable T() {
        int v = Y.z(this);
        if(v == 0) {
            Drawable drawable0 = this.K;
            if(drawable0 != null) {
                this.M(drawable0, 0);
                return this.K;
            }
        }
        else {
            Drawable drawable1 = this.L;
            if(drawable1 != null) {
                this.M(drawable1, v);
                return this.L;
            }
        }
        return this.M;
    }

    private Drawable U() {
        int v = Y.z(this);
        if(v == 0) {
            Drawable drawable0 = this.L;
            if(drawable0 != null) {
                this.M(drawable0, 0);
                return this.L;
            }
        }
        else {
            Drawable drawable1 = this.K;
            if(drawable1 != null) {
                this.M(drawable1, v);
                return this.K;
            }
        }
        return this.N;
    }

    private void V() {
        if(DrawerLayout.V) {
            return;
        }
        this.E = this.T();
        this.F = this.U();
    }

    public void W(y0 y00, boolean z) {
        this.I = y00;
        this.J = z;
        this.setWillNotDraw(!z && this.getBackground() == null);
        this.requestLayout();
    }

    public void X(int v, int v1) {
        int v2 = s.b(v1, Y.z(this));
        switch(v1) {
            case 3: {
                this.u = v;
                break;
            }
            case 5: {
                this.v = v;
                break;
            }
            case 0x800003: {
                this.w = v;
                break;
            }
            case 0x800005: {
                this.x = v;
            }
        }
        if(v != 0) {
            (v2 == 3 ? this.l : this.m).a();
        }
        switch(v) {
            case 1: {
                View view0 = this.p(v2);
                if(view0 != null) {
                    this.h(view0);
                    return;
                }
                break;
            }
            case 2: {
                View view1 = this.p(v2);
                if(view1 != null) {
                    this.Q(view1);
                    return;
                }
                break;
            }
        }
    }

    void Y(View view0, float f) {
        e drawerLayout$e0 = (e)view0.getLayoutParams();
        if(f == drawerLayout$e0.b) {
            return;
        }
        drawerLayout$e0.b = f;
        this.n(view0, f);
    }

    void Z() {
        if(Build.VERSION.SDK_INT >= 33) {
            View view0 = this.r();
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = b.a(this);
            boolean z = view0 != null && onBackInvokedDispatcher0 != null && this.t(view0) == 0 && Y.R(this);
            if(z && this.t == null) {
                if(this.s == null) {
                    this.s = b.b(() -> this.k(false));
                }
                b.c(onBackInvokedDispatcher0, this.s);
                this.t = onBackInvokedDispatcher0;
                return;
            }
            if(!z) {
                OnBackInvokedDispatcher onBackInvokedDispatcher1 = this.t;
                if(onBackInvokedDispatcher1 != null) {
                    b.d(onBackInvokedDispatcher1, this.s);
                    this.t = null;
                }
            }
        }
    }

    private void a0(View view0) {
        C.z.a z$a0 = C.z.a.y;
        Y.i0(view0, z$a0.b());
        if(this.F(view0) && this.t(view0) != 2) {
            Y.k0(view0, z$a0, null, this.R);
        }
    }

    @Override  // android.view.ViewGroup
    public void addFocusables(ArrayList arrayList0, int v, int v1) {
        if(this.getDescendantFocusability() == 0x60000) {
            return;
        }
        int v2 = this.getChildCount();
        boolean z = false;
        for(int v4 = 0; v4 < v2; ++v4) {
            View view0 = this.getChildAt(v4);
            if(!this.G(view0)) {
                this.O.add(view0);
            }
            else if(this.F(view0)) {
                view0.addFocusables(arrayList0, v, v1);
                z = true;
            }
        }
        if(!z) {
            int v5 = this.O.size();
            for(int v3 = 0; v3 < v5; ++v3) {
                View view1 = (View)this.O.get(v3);
                if(view1.getVisibility() == 0) {
                    view1.addFocusables(arrayList0, v, v1);
                }
            }
        }
        this.O.clear();
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        if(this.q() != null || this.G(view0)) {
            Y.x0(view0, 4);
        }
        else {
            Y.x0(view0, 1);
        }
        if(!DrawerLayout.U) {
            Y.o0(view0, this.f);
        }
    }

    private void b0(View view0, boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            if((z || this.G(view1)) && (!z || view1 != view0)) {
                Y.x0(view1, 4);
            }
            else {
                Y.x0(view1, 1);
            }
        }
    }

    public void c(d drawerLayout$d0) {
        if(this.A == null) {
            this.A = new ArrayList();
        }
        this.A.add(drawerLayout$d0);
    }

    void c0(int v, View view0) {
        int v1 = 2;
        int v2 = this.l.A();
        int v3 = this.m.A();
        if(v2 == 1 || v3 == 1) {
            v1 = 1;
        }
        else if(v2 != 2 && v3 != 2) {
            v1 = 0;
        }
        if(view0 != null && v == 0) {
            float f = ((e)view0.getLayoutParams()).b;
            if(f == 0.0f) {
                this.l(view0);
            }
            else if(f == 1.0f) {
                this.m(view0);
            }
        }
        if(v1 != this.p) {
            this.p = v1;
            List list0 = this.A;
            if(list0 != null) {
                for(int v4 = list0.size() - 1; v4 >= 0; --v4) {
                    ((d)this.A.get(v4)).c(v1);
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof e && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public void computeScroll() {
        int v = this.getChildCount();
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            f = Math.max(f, ((e)this.getChildAt(v1).getLayoutParams()).b);
        }
        this.j = f;
        if(this.l.m(true) || this.m.m(true)) {
            Y.f0(this);
        }
    }

    void d() {
        if(!this.y) {
            long v = SystemClock.uptimeMillis();
            MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
            int v1 = this.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                this.getChildAt(v2).dispatchTouchEvent(motionEvent0);
            }
            motionEvent0.recycle();
            this.y = true;
        }
    }

    @Override  // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent0) {
        if((motionEvent0.getSource() & 2) != 0 && motionEvent0.getAction() != 10 && this.j > 0.0f) {
            int v = this.getChildCount();
            if(v != 0) {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                for(int v1 = v - 1; v1 >= 0; --v1) {
                    View view0 = this.getChildAt(v1);
                    if(this.J(f, f1, view0) && !this.D(view0) && this.o(motionEvent0, view0)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas0, View view0, long v) {
        int v1 = this.getHeight();
        boolean z = this.D(view0);
        int v2 = this.getWidth();
        int v3 = canvas0.save();
        int v4 = 0;
        if(z) {
            int v5 = this.getChildCount();
            int v7 = 0;
            for(int v6 = 0; v6 < v5; ++v6) {
                View view1 = this.getChildAt(v6);
                if(view1 != view0 && view1.getVisibility() == 0 && DrawerLayout.z(view1) && this.G(view1) && view1.getHeight() >= v1) {
                    if(this.e(view1, 3)) {
                        int v8 = view1.getRight();
                        if(v8 > v7) {
                            v7 = v8;
                        }
                    }
                    else {
                        int v9 = view1.getLeft();
                        if(v9 < v2) {
                            v2 = v9;
                        }
                    }
                }
            }
            canvas0.clipRect(v7, 0, v2, this.getHeight());
            v4 = v7;
        }
        boolean z1 = super.drawChild(canvas0, view0, v);
        canvas0.restoreToCount(v3);
        float f = this.j;
        if(f > 0.0f && z) {
            this.k.setColor(this.i & 0xFFFFFF | ((int)(((float)((0xFF000000 & this.i) >>> 24)) * f)) << 24);
            canvas0.drawRect(((float)v4), 0.0f, ((float)v2), ((float)this.getHeight()), this.k);
            return z1;
        }
        if(this.E != null && this.e(view0, 3)) {
            int v10 = this.E.getIntrinsicWidth();
            int v11 = view0.getRight();
            this.E.setBounds(v11, view0.getTop(), v10 + v11, view0.getBottom());
            this.E.setAlpha(((int)(Math.max(0.0f, Math.min(((float)v11) / ((float)this.l.x()), 1.0f)) * 255.0f)));
            this.E.draw(canvas0);
            return z1;
        }
        if(this.F != null && this.e(view0, 5)) {
            int v12 = this.F.getIntrinsicWidth();
            int v13 = view0.getLeft();
            float f1 = Math.max(0.0f, Math.min(((float)(this.getWidth() - v13)) / ((float)this.m.x()), 1.0f));
            this.F.setBounds(v13 - v12, view0.getTop(), v13, view0.getBottom());
            this.F.setAlpha(((int)(f1 * 255.0f)));
            this.F.draw(canvas0);
        }
        return z1;
    }

    boolean e(View view0, int v) {
        return (this.v(view0) & v) == v;
    }

    public void f(int v) {
        this.g(v, true);
    }

    public void g(int v, boolean z) {
        View view0 = this.p(v);
        if(view0 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.y(v));
        }
        this.i(view0, z);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new e(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof e) {
            return new e(((e)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new e(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new e(viewGroup$LayoutParams0);
    }

    // 去混淆评级： 低(20)
    public float getDrawerElevation() {
        return DrawerLayout.V ? this.g : 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.D;
    }

    public void h(View view0) {
        this.i(view0, true);
    }

    public void i(View view0, boolean z) {
        if(!this.G(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a sliding drawer");
        }
        e drawerLayout$e0 = (e)view0.getLayoutParams();
        if(this.r) {
            drawerLayout$e0.b = 0.0f;
            drawerLayout$e0.d = 0;
        }
        else if(z) {
            drawerLayout$e0.d |= 4;
            if(this.e(view0, 3)) {
                int v = view0.getWidth();
                int v1 = view0.getTop();
                this.l.Q(view0, -v, v1);
            }
            else {
                int v2 = this.getWidth();
                int v3 = view0.getTop();
                this.m.Q(view0, v2, v3);
            }
        }
        else {
            this.N(view0, 0.0f);
            this.c0(0, view0);
            view0.setVisibility(4);
        }
        this.invalidate();
    }

    // 检测为 Lambda 实现
    public void j() [...]

    void k(boolean z) {
        boolean z2;
        int v = this.getChildCount();
        boolean z1 = false;
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            e drawerLayout$e0 = (e)view0.getLayoutParams();
            if(this.G(view0) && (!z || drawerLayout$e0.c)) {
                int v2 = view0.getWidth();
                if(this.e(view0, 3)) {
                    int v3 = view0.getTop();
                    z2 = this.l.Q(view0, -v2, v3);
                }
                else {
                    int v4 = this.getWidth();
                    int v5 = view0.getTop();
                    z2 = this.m.Q(view0, v4, v5);
                }
                z1 |= z2;
                drawerLayout$e0.c = false;
            }
        }
        this.n.p();
        this.o.p();
        if(z1) {
            this.invalidate();
        }
    }

    void l(View view0) {
        e drawerLayout$e0 = (e)view0.getLayoutParams();
        if((drawerLayout$e0.d & 1) == 1) {
            drawerLayout$e0.d = 0;
            List list0 = this.A;
            if(list0 != null) {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    ((d)this.A.get(v)).b(view0);
                }
            }
            this.b0(view0, false);
            this.a0(view0);
            this.Z();
            if(this.hasWindowFocus()) {
                View view1 = this.getRootView();
                if(view1 != null) {
                    view1.sendAccessibilityEvent(0x20);
                }
            }
        }
    }

    void m(View view0) {
        e drawerLayout$e0 = (e)view0.getLayoutParams();
        if((drawerLayout$e0.d & 1) == 0) {
            drawerLayout$e0.d = 1;
            List list0 = this.A;
            if(list0 != null) {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    ((d)this.A.get(v)).a(view0);
                }
            }
            this.b0(view0, true);
            this.a0(view0);
            this.Z();
            if(this.hasWindowFocus()) {
                this.sendAccessibilityEvent(0x20);
            }
        }
    }

    void n(View view0, float f) {
        List list0 = this.A;
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                ((d)this.A.get(v)).d(view0, f);
            }
        }
    }

    private boolean o(MotionEvent motionEvent0, View view0) {
        boolean z;
        if(!view0.getMatrix().isIdentity()) {
            MotionEvent motionEvent1 = this.x(motionEvent0, view0);
            z = view0.dispatchGenericMotionEvent(motionEvent1);
            motionEvent1.recycle();
            return z;
        }
        float f = (float)(this.getScrollX() - view0.getLeft());
        float f1 = (float)(this.getScrollY() - view0.getTop());
        motionEvent0.offsetLocation(f, f1);
        z = view0.dispatchGenericMotionEvent(motionEvent0);
        motionEvent0.offsetLocation(-f, -f1);
        return z;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = true;
        this.Z();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = true;
        this.Z();
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        if(this.J && this.D != null) {
            int v = this.I == null ? 0 : this.I.l();
            if(v > 0) {
                this.D.setBounds(0, 0, this.getWidth(), v);
                this.D.draw(canvas0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        int v = motionEvent0.getActionMasked();
        boolean z = this.l.P(motionEvent0);
        boolean z1 = this.m.P(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                this.B = f;
                this.C = f1;
                if(this.j > 0.0f) {
                    View view0 = this.l.t(((int)f), ((int)f1));
                    z2 = view0 == null || !this.D(view0) ? false : true;
                }
                else {
                    z2 = false;
                }
                this.y = false;
                return z || z1 || z2 || this.A() || this.y;
            }
            case 2: {
                if(this.l.d(3)) {
                    this.n.p();
                    this.o.p();
                    return z || z1 || this.A() || this.y;
                }
                return z || z1 || this.A() || this.y;
            }
            case 1: 
            case 3: {
                this.k(true);
                this.y = false;
                return z || z1 || this.A() || this.y;
            }
            default: {
                return z || z1 || this.A() || this.y;
            }
        }
    }

    @Override  // android.view.View
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(v == 4 && this.B()) {
            keyEvent0.startTracking();
            return true;
        }
        return super.onKeyDown(v, keyEvent0);
    }

    @Override  // android.view.View
    public boolean onKeyUp(int v, KeyEvent keyEvent0) {
        if(v == 4) {
            View view0 = this.r();
            if(view0 != null && this.t(view0) == 0) {
                this.j();
            }
            return view0 != null;
        }
        return super.onKeyUp(v, keyEvent0);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        float f;
        int v10;
        this.q = true;
        int v4 = v2 - v;
        int v5 = this.getChildCount();
        for(int v6 = 0; v6 < v5; ++v6) {
            View view0 = this.getChildAt(v6);
            if(view0.getVisibility() != 8) {
                e drawerLayout$e0 = (e)view0.getLayoutParams();
                if(this.D(view0)) {
                    int v7 = drawerLayout$e0.leftMargin;
                    view0.layout(v7, drawerLayout$e0.topMargin, view0.getMeasuredWidth() + v7, drawerLayout$e0.topMargin + view0.getMeasuredHeight());
                }
                else {
                    int v8 = view0.getMeasuredWidth();
                    int v9 = view0.getMeasuredHeight();
                    if(this.e(view0, 3)) {
                        v10 = ((int)(drawerLayout$e0.b * ((float)v8))) - v8;
                        f = ((float)(v8 + v10)) / ((float)v8);
                    }
                    else {
                        int v11 = v4 - ((int)(drawerLayout$e0.b * ((float)v8)));
                        f = ((float)(v4 - v11)) / ((float)v8);
                        v10 = v11;
                    }
                    boolean z1 = f != drawerLayout$e0.b;
                    switch(drawerLayout$e0.a & 0x70) {
                        case 16: {
                            int v12 = v3 - v1;
                            int v13 = (v12 - v9) / 2;
                            int v14 = drawerLayout$e0.topMargin;
                            if(v13 < v14) {
                                v13 = v14;
                            }
                            else {
                                int v15 = drawerLayout$e0.bottomMargin;
                                if(v13 + v9 > v12 - v15) {
                                    v13 = v12 - v15 - v9;
                                }
                            }
                            view0.layout(v10, v13, v8 + v10, v9 + v13);
                            break;
                        }
                        case 80: {
                            view0.layout(v10, v3 - v1 - drawerLayout$e0.bottomMargin - view0.getMeasuredHeight(), v8 + v10, v3 - v1 - drawerLayout$e0.bottomMargin);
                            break;
                        }
                        default: {
                            view0.layout(v10, drawerLayout$e0.topMargin, v8 + v10, v9 + drawerLayout$e0.topMargin);
                        }
                    }
                    if(z1) {
                        this.Y(view0, f);
                    }
                    int v16 = drawerLayout$e0.b > 0.0f ? 0 : 4;
                    if(view0.getVisibility() != v16) {
                        view0.setVisibility(v16);
                    }
                }
            }
        }
        if(DrawerLayout.W) {
            y0 y00 = Y.G(this);
            if(y00 != null) {
                androidx.core.graphics.e e0 = y00.h();
                this.l.L(Math.max(this.l.w(), e0.a));
                this.m.L(Math.max(this.m.w(), e0.c));
            }
        }
        this.q = false;
        this.r = false;
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = View.MeasureSpec.getSize(v1);
        if(v2 != 0x40000000 || v3 != 0x40000000) {
            if(!this.isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if(v2 == 0) {
                v4 = 300;
            }
            if(v3 == 0) {
                v5 = 300;
            }
        }
        this.setMeasuredDimension(v4, v5);
        boolean z = this.I != null && Y.w(this);
        int v6 = Y.z(this);
        int v7 = this.getChildCount();
        boolean z1 = false;
        boolean z2 = false;
        for(int v8 = 0; v8 < v7; ++v8) {
            View view0 = this.getChildAt(v8);
            if(view0.getVisibility() != 8) {
                e drawerLayout$e0 = (e)view0.getLayoutParams();
                if(z) {
                    int v9 = s.b(drawerLayout$e0.a, v6);
                    if(Y.w(view0)) {
                        y0 y00 = this.I;
                        if(v9 == 3) {
                            y00 = y00.r(y00.j(), y00.l(), 0, y00.i());
                        }
                        else if(v9 == 5) {
                            y00 = y00.r(0, y00.l(), y00.k(), y00.i());
                        }
                        Y.g(view0, y00);
                    }
                    else {
                        y0 y01 = this.I;
                        if(v9 == 3) {
                            y01 = y01.r(y01.j(), y01.l(), 0, y01.i());
                        }
                        else if(v9 == 5) {
                            y01 = y01.r(0, y01.l(), y01.k(), y01.i());
                        }
                        drawerLayout$e0.leftMargin = y01.j();
                        drawerLayout$e0.topMargin = y01.l();
                        drawerLayout$e0.rightMargin = y01.k();
                        drawerLayout$e0.bottomMargin = y01.i();
                    }
                }
                if(this.D(view0)) {
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v4 - drawerLayout$e0.leftMargin - drawerLayout$e0.rightMargin, 0x40000000), View.MeasureSpec.makeMeasureSpec(v5 - drawerLayout$e0.topMargin - drawerLayout$e0.bottomMargin, 0x40000000));
                }
                else {
                    if(!this.G(view0)) {
                        throw new IllegalStateException("Child " + view0 + " at index " + v8 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if(DrawerLayout.V) {
                        float f = Y.u(view0);
                        float f1 = this.g;
                        if(f != f1) {
                            Y.w0(view0, f1);
                        }
                    }
                    int v10 = this.v(view0) & 7;
                    if(v10 == 3 && z1 || v10 != 3 && z2) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + DrawerLayout.y(v10) + " but this " + "DrawerLayout" + " already has a drawer view along that edge");
                    }
                    if(v10 == 3) {
                        z1 = true;
                    }
                    else {
                        z2 = true;
                    }
                    view0.measure(ViewGroup.getChildMeasureSpec(v, this.h + drawerLayout$e0.leftMargin + drawerLayout$e0.rightMargin, drawerLayout$e0.width), ViewGroup.getChildMeasureSpec(v1, drawerLayout$e0.topMargin + drawerLayout$e0.bottomMargin, drawerLayout$e0.height));
                    continue;
                }
            }
        }
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        int v = ((SavedState)parcelable0).h;
        if(v != 0) {
            View view0 = this.p(v);
            if(view0 != null) {
                this.Q(view0);
            }
        }
        int v1 = ((SavedState)parcelable0).i;
        if(v1 != 3) {
            this.X(v1, 3);
        }
        int v2 = ((SavedState)parcelable0).j;
        if(v2 != 3) {
            this.X(v2, 5);
        }
        int v3 = ((SavedState)parcelable0).k;
        if(v3 != 3) {
            this.X(v3, 0x800003);
        }
        int v4 = ((SavedState)parcelable0).l;
        if(v4 != 3) {
            this.X(v4, 0x800005);
        }
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        this.V();
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        int v = this.getChildCount();
        int v1 = 0;
        while(v1 < v) {
            e drawerLayout$e0 = (e)this.getChildAt(v1).getLayoutParams();
            if(drawerLayout$e0.d != 1 && drawerLayout$e0.d != 2) {
                ++v1;
            }
            else {
                parcelable0.h = drawerLayout$e0.a;
                if(true) {
                    break;
                }
            }
        }
        parcelable0.i = this.u;
        parcelable0.j = this.v;
        parcelable0.k = this.w;
        parcelable0.l = this.x;
        return parcelable0;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        this.l.F(motionEvent0);
        this.m.F(motionEvent0);
        int v = motionEvent0.getAction();
        boolean z = false;
        switch(v & 0xFF) {
            case 0: {
                float f4 = motionEvent0.getX();
                float f5 = motionEvent0.getY();
                this.B = f4;
                this.C = f5;
                this.y = false;
                break;
            }
            case 1: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                View view0 = this.l.t(((int)f), ((int)f1));
                if(view0 == null || !this.D(view0)) {
                    z = true;
                }
                else {
                    float f2 = f - this.B;
                    float f3 = f1 - this.C;
                    int v1 = this.l.z();
                    if(f2 * f2 + f3 * f3 < ((float)(v1 * v1))) {
                        View view1 = this.q();
                        if(view1 == null || this.t(view1) == 2) {
                            z = true;
                        }
                    }
                    else {
                        z = true;
                    }
                }
                this.k(z);
                return true;
            label_23:
                if((v & 0xFF) == 3) {
                    this.k(true);
                    this.y = false;
                    return true;
                }
                break;
            }
            default: {
                goto label_23;
            }
        }
        return true;
    }

    View p(int v) {
        int v1 = s.b(v, Y.z(this));
        int v2 = this.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            View view0 = this.getChildAt(v3);
            if((this.v(view0) & 7) == (v1 & 7)) {
                return view0;
            }
        }
        return null;
    }

    View q() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if((((e)view0.getLayoutParams()).d & 1) == 1) {
                return view0;
            }
        }
        return null;
    }

    View r() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(this.G(view0) && this.I(view0)) {
                return view0;
            }
        }
        return null;
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if(z) {
            this.k(true);
        }
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if(!this.q) {
            super.requestLayout();
        }
    }

    public int s(int v) {
        int v1 = Y.z(this);
        switch(v) {
            case 3: {
                int v2 = this.u;
                if(v2 != 3) {
                    return v2;
                }
                int v3 = v1 == 0 ? this.w : this.x;
                return v3 == 3 ? 0 : v3;
            }
            case 5: {
                int v4 = this.v;
                if(v4 != 3) {
                    return v4;
                }
                int v5 = v1 == 0 ? this.x : this.w;
                return v5 == 3 ? 0 : v5;
            }
            case 0x800003: {
                int v6 = this.w;
                if(v6 != 3) {
                    return v6;
                }
                int v7 = v1 == 0 ? this.u : this.v;
                return v7 == 3 ? 0 : v7;
            }
            case 0x800005: {
                int v8 = this.x;
                if(v8 != 3) {
                    return v8;
                }
                int v9 = v1 == 0 ? this.v : this.u;
                return v9 == 3 ? 0 : v9;
            }
            default: {
                return 0;
            }
        }
    }

    public void setDrawerElevation(float f) {
        this.g = f;
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(this.G(view0)) {
                Y.w0(view0, this.g);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d drawerLayout$d0) {
        d drawerLayout$d1 = this.z;
        if(drawerLayout$d1 != null) {
            this.S(drawerLayout$d1);
        }
        if(drawerLayout$d0 != null) {
            this.c(drawerLayout$d0);
        }
        this.z = drawerLayout$d0;
    }

    public void setDrawerLockMode(int v) {
        this.X(v, 3);
        this.X(v, 5);
    }

    public void setScrimColor(int v) {
        this.i = v;
        this.invalidate();
    }

    public void setStatusBarBackground(int v) {
        this.D = v == 0 ? null : androidx.core.content.a.getDrawable(this.getContext(), v);
        this.invalidate();
    }

    public void setStatusBarBackground(Drawable drawable0) {
        this.D = drawable0;
        this.invalidate();
    }

    public void setStatusBarBackgroundColor(int v) {
        this.D = new ColorDrawable(v);
        this.invalidate();
    }

    public int t(View view0) {
        if(!this.G(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return this.s(((e)view0.getLayoutParams()).a);
    }

    public CharSequence u(int v) {
        int v1 = s.b(v, Y.z(this));
        if(v1 == 3) {
            return this.G;
        }
        return v1 == 5 ? this.H : null;
    }

    int v(View view0) {
        return s.b(((e)view0.getLayoutParams()).a, Y.z(this));
    }

    float w(View view0) {
        return ((e)view0.getLayoutParams()).b;
    }

    private MotionEvent x(MotionEvent motionEvent0, View view0) {
        int v = this.getScrollX();
        int v1 = view0.getLeft();
        int v2 = this.getScrollY();
        int v3 = view0.getTop();
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.offsetLocation(((float)(v - v1)), ((float)(v2 - v3)));
        Matrix matrix0 = view0.getMatrix();
        if(!matrix0.isIdentity()) {
            if(this.Q == null) {
                this.Q = new Matrix();
            }
            matrix0.invert(this.Q);
            motionEvent1.transform(this.Q);
        }
        return motionEvent1;
    }

    static String y(int v) {
        if((v & 3) == 3) {
            return "LEFT";
        }
        return (v & 5) == 5 ? "RIGHT" : Integer.toHexString(v);
    }

    private static boolean z(View view0) {
        Drawable drawable0 = view0.getBackground();
        return drawable0 != null && drawable0.getOpacity() == -1;
    }
}

