package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.Y;
import androidx.core.view.s;
import androidx.core.view.y0;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements D, E {
    public static class SavedState extends AbsSavedState {
        static final class a implements Parcelable.ClassLoaderCreator {
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
        SparseArray h;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            int v = parcel0.readInt();
            int[] arr_v = new int[v];
            parcel0.readIntArray(arr_v);
            Parcelable[] arr_parcelable = parcel0.readParcelableArray(classLoader0);
            this.h = new SparseArray(v);
            for(int v1 = 0; v1 < v; ++v1) {
                this.h.append(arr_v[v1], arr_parcelable[v1]);
            }
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            int v2 = this.h == null ? 0 : this.h.size();
            parcel0.writeInt(v2);
            int[] arr_v = new int[v2];
            Parcelable[] arr_parcelable = new Parcelable[v2];
            for(int v1 = 0; v1 < v2; ++v1) {
                arr_v[v1] = this.h.keyAt(v1);
                arr_parcelable[v1] = (Parcelable)this.h.valueAt(v1);
            }
            parcel0.writeIntArray(arr_v);
            parcel0.writeParcelableArray(arr_parcelable, v);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public c(Context context0, AttributeSet attributeSet0) {
        }

        public boolean A(CoordinatorLayout coordinatorLayout0, View view0, Rect rect0, boolean z) {
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout0, View view0, Parcelable parcelable0) {
        }

        public Parcelable C(CoordinatorLayout coordinatorLayout0, View view0) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean D(CoordinatorLayout coordinatorLayout0, View view0, View view1, View view2, int v) [...] // Inlined contents

        public boolean E(CoordinatorLayout coordinatorLayout0, View view0, View view1, View view2, int v, int v1) {
            return false;
        }

        public void F(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
        }

        public void G(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v) {
        }

        public boolean H(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout0, View view0) {
            return false;
        }

        public boolean f(CoordinatorLayout coordinatorLayout0, View view0, Rect rect0) {
            return false;
        }

        public int g(CoordinatorLayout coordinatorLayout0, View view0) [...] // Inlined contents

        public float h(CoordinatorLayout coordinatorLayout0, View view0) [...] // Inlined contents

        public boolean i(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            return false;
        }

        public y0 j(CoordinatorLayout coordinatorLayout0, View view0, y0 y00) [...] // Inlined contents

        public void k(f coordinatorLayout$f0) {
        }

        public boolean l(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
        }

        public void n() {
        }

        public boolean o(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout0, View view0, int v) {
            return false;
        }

        public boolean q(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2, int v3) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout0, View view0, View view1, float f, float f1, boolean z) [...] // Inlined contents

        public boolean s(CoordinatorLayout coordinatorLayout0, View view0, View view1, float f, float f1) {
            return false;
        }

        public void t(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int[] arr_v) {
        }

        public void u(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int[] arr_v, int v2) {
        }

        public void v(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int v2, int v3) {
        }

        public void w(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int v2, int v3, int v4) {
        }

        public void x(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
            arr_v[0] += v2;
            arr_v[1] += v3;
        }

        public void y(CoordinatorLayout coordinatorLayout0, View view0, View view1, View view2, int v) {
        }

        public void z(CoordinatorLayout coordinatorLayout0, View view0, View view1, View view2, int v, int v1) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    class e implements ViewGroup.OnHierarchyChangeListener {
        final CoordinatorLayout f;

        @Override  // android.view.ViewGroup$OnHierarchyChangeListener
        public void onChildViewAdded(View view0, View view1) {
            ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = CoordinatorLayout.this.w;
            if(viewGroup$OnHierarchyChangeListener0 != null) {
                viewGroup$OnHierarchyChangeListener0.onChildViewAdded(view0, view1);
            }
        }

        @Override  // android.view.ViewGroup$OnHierarchyChangeListener
        public void onChildViewRemoved(View view0, View view1) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = CoordinatorLayout.this.w;
            if(viewGroup$OnHierarchyChangeListener0 != null) {
                viewGroup$OnHierarchyChangeListener0.onChildViewRemoved(view0, view1);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        c a;
        boolean b;
        public int c;
        public int d;
        public int e;
        int f;
        public int g;
        public int h;
        int i;
        int j;
        View k;
        View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q;
        Object r;

        public f(int v, int v1) {
            super(v, v1);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        f(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, u.c.e);
            this.c = typedArray0.getInteger(u.c.f, 0);
            this.f = typedArray0.getResourceId(u.c.g, -1);
            this.d = typedArray0.getInteger(u.c.h, 0);
            this.e = typedArray0.getInteger(u.c.l, -1);
            this.g = typedArray0.getInt(u.c.k, 0);
            this.h = typedArray0.getInt(u.c.j, 0);
            boolean z = typedArray0.hasValue(u.c.i);
            this.b = z;
            if(z) {
                this.a = CoordinatorLayout.K(context0, attributeSet0, typedArray0.getString(3));
            }
            typedArray0.recycle();
            c coordinatorLayout$c0 = this.a;
            if(coordinatorLayout$c0 != null) {
                coordinatorLayout$c0.k(this);
            }
        }

        public f(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(f coordinatorLayout$f0) {
            super(coordinatorLayout$f0);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        boolean a() {
            return this.k == null && this.f != -1;
        }

        // 去混淆评级： 低(30)
        boolean b(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            return view1 == this.l || this.r(view1, Y.z(coordinatorLayout0)) || this.a != null && this.a.i(coordinatorLayout0, view0, view1);
        }

        boolean c() {
            if(this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        View d(CoordinatorLayout coordinatorLayout0, View view0) {
            if(this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if(this.k == null || !this.s(view0, coordinatorLayout0)) {
                this.m(view0, coordinatorLayout0);
            }
            return this.k;
        }

        public c e() {
            return this.a;
        }

        boolean f() {
            return this.p;
        }

        Rect g() {
            return this.q;
        }

        boolean h(CoordinatorLayout coordinatorLayout0, View view0) {
            if(this.m) {
                return true;
            }
            boolean z = this.a == null ? false : this.a.e(coordinatorLayout0, view0);
            this.m = z;
            return z;
        }

        boolean i(int v) {
            switch(v) {
                case 0: {
                    return this.n;
                }
                case 1: {
                    return this.o;
                }
                default: {
                    return false;
                }
            }
        }

        void j() {
            this.p = false;
        }

        void k(int v) {
            this.q(v, false);
        }

        void l() {
            this.m = false;
        }

        private void m(View view0, CoordinatorLayout coordinatorLayout0) {
            View view1 = coordinatorLayout0.findViewById(this.f);
            this.k = view1;
            if(view1 != null) {
                if(view1 == coordinatorLayout0) {
                    if(!coordinatorLayout0.isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    this.l = null;
                    this.k = null;
                    return;
                }
                for(ViewParent viewParent0 = view1.getParent(); viewParent0 != coordinatorLayout0 && viewParent0 != null; viewParent0 = viewParent0.getParent()) {
                    if(viewParent0 == view0) {
                        if(!coordinatorLayout0.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                        this.l = null;
                        this.k = null;
                        return;
                    }
                    if(viewParent0 instanceof View) {
                        view1 = (View)viewParent0;
                    }
                }
                this.l = view1;
                return;
            }
            if(!coordinatorLayout0.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout0.getResources().getResourceName(this.f) + " to anchor view " + view0);
            }
            this.l = null;
            this.k = null;
        }

        public void n(c coordinatorLayout$c0) {
            c coordinatorLayout$c1 = this.a;
            if(coordinatorLayout$c1 != coordinatorLayout$c0) {
                if(coordinatorLayout$c1 != null) {
                    coordinatorLayout$c1.n();
                }
                this.a = coordinatorLayout$c0;
                this.r = null;
                this.b = true;
                if(coordinatorLayout$c0 != null) {
                    coordinatorLayout$c0.k(this);
                }
            }
        }

        void o(boolean z) {
            this.p = z;
        }

        void p(Rect rect0) {
            this.q.set(rect0);
        }

        void q(int v, boolean z) {
            switch(v) {
                case 0: {
                    this.n = z;
                    return;
                }
                case 1: {
                    this.o = z;
                }
            }
        }

        private boolean r(View view0, int v) {
            int v1 = s.b(((f)view0.getLayoutParams()).g, v);
            return v1 != 0 && (s.b(this.h, v) & v1) == v1;
        }

        private boolean s(View view0, CoordinatorLayout coordinatorLayout0) {
            if(this.k.getId() != this.f) {
                return false;
            }
            View view1 = this.k;
            ViewParent viewParent0 = view1.getParent();
            while(viewParent0 != coordinatorLayout0) {
                if(viewParent0 != null && viewParent0 != view0) {
                    if(viewParent0 instanceof View) {
                        view1 = (View)viewParent0;
                    }
                    viewParent0 = viewParent0.getParent();
                    continue;
                }
                this.l = null;
                this.k = null;
                return false;
            }
            this.l = view1;
            return true;
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        final CoordinatorLayout f;

        @Override  // android.view.ViewTreeObserver$OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    static class h implements Comparator {
        public int a(View view0, View view1) {
            float f = Y.M(view0);
            float f1 = Y.M(view1);
            if(f > f1) {
                return -1;
            }
            return f < f1 ? 1 : 0;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.a(((View)object0), ((View)object1));
        }
    }

    static final Class[] A;
    static final ThreadLocal B;
    static final Comparator C;
    private static final B.e D;
    private final List f;
    private final androidx.coordinatorlayout.widget.b g;
    private final List h;
    private final List i;
    private Paint j;
    private final int[] k;
    private final int[] l;
    private boolean m;
    private boolean n;
    private int[] o;
    private View p;
    private View q;
    private g r;
    private boolean s;
    private y0 t;
    private boolean u;
    private Drawable v;
    ViewGroup.OnHierarchyChangeListener w;
    private G x;
    private final F y;
    static final String z;

    static {
        Package package0 = CoordinatorLayout.class.getPackage();
        CoordinatorLayout.z = package0 == null ? null : package0.getName();
        CoordinatorLayout.C = new h();
        CoordinatorLayout.A = new Class[]{Context.class, AttributeSet.class};
        CoordinatorLayout.B = new ThreadLocal();
        CoordinatorLayout.D = new B.g(12);
    }

    public CoordinatorLayout(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, u.a.a);
    }

    public CoordinatorLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.f = new ArrayList();
        this.g = new androidx.coordinatorlayout.widget.b();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = new int[2];
        this.l = new int[2];
        this.y = new F(this);
        TypedArray typedArray0 = v == 0 ? context0.obtainStyledAttributes(attributeSet0, u.c.b, 0, u.b.a) : context0.obtainStyledAttributes(attributeSet0, u.c.b, v, 0);
        if(Build.VERSION.SDK_INT >= 29) {
            if(v == 0) {
                this.saveAttributeDataForStyleable(context0, u.c.b, attributeSet0, typedArray0, 0, u.b.a);
            }
            else {
                this.saveAttributeDataForStyleable(context0, u.c.b, attributeSet0, typedArray0, v, 0);
            }
        }
        int v2 = typedArray0.getResourceId(u.c.c, 0);
        if(v2 != 0) {
            Resources resources0 = context0.getResources();
            this.o = resources0.getIntArray(v2);
            float f = resources0.getDisplayMetrics().density;
            for(int v1 = 0; v1 < this.o.length; ++v1) {
                this.o[v1] = (int)(((float)this.o[v1]) * f);
            }
        }
        this.v = typedArray0.getDrawable(u.c.d);
        typedArray0.recycle();
        this.X();
        super.setOnHierarchyChangeListener(new e(this));
        if(Y.x(this) == 0) {
            Y.x0(this, 1);
        }
    }

    private boolean A(View view0) {
        return this.g.j(view0);
    }

    public boolean B(View view0, int v, int v1) {
        Rect rect0 = CoordinatorLayout.a();
        this.t(view0, rect0);
        try {
            return rect0.contains(v, v1);
        }
        finally {
            CoordinatorLayout.O(rect0);
        }
    }

    private void C(View view0, int v) {
        f coordinatorLayout$f0 = (f)view0.getLayoutParams();
        Rect rect0 = CoordinatorLayout.a();
        rect0.set(this.getPaddingLeft() + coordinatorLayout$f0.leftMargin, this.getPaddingTop() + coordinatorLayout$f0.topMargin, this.getWidth() - this.getPaddingRight() - coordinatorLayout$f0.rightMargin, this.getHeight() - this.getPaddingBottom() - coordinatorLayout$f0.bottomMargin);
        if(this.t != null && Y.w(this) && !Y.w(view0)) {
            rect0.left += this.t.j();
            rect0.top += this.t.l();
            rect0.right -= this.t.k();
            rect0.bottom -= this.t.i();
        }
        Rect rect1 = CoordinatorLayout.a();
        s.a(CoordinatorLayout.S(coordinatorLayout$f0.c), view0.getMeasuredWidth(), view0.getMeasuredHeight(), rect0, rect1, v);
        view0.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
        CoordinatorLayout.O(rect0);
        CoordinatorLayout.O(rect1);
    }

    private void D(View view0, View view1, int v) {
        Rect rect0 = CoordinatorLayout.a();
        Rect rect1 = CoordinatorLayout.a();
        try {
            this.t(view1, rect0);
            this.u(view0, v, rect0, rect1);
            view0.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
        }
        finally {
            CoordinatorLayout.O(rect0);
            CoordinatorLayout.O(rect1);
        }
    }

    private void E(View view0, int v, int v1) {
        int v8;
        f coordinatorLayout$f0 = (f)view0.getLayoutParams();
        int v2 = s.b(CoordinatorLayout.T(coordinatorLayout$f0.c), v1);
        int v3 = this.getWidth();
        int v4 = this.getHeight();
        int v5 = view0.getMeasuredWidth();
        int v6 = view0.getMeasuredHeight();
        if(v1 == 1) {
            v = v3 - v;
        }
        int v7 = this.w(v) - v5;
        switch(v2 & 7) {
            case 1: {
                v7 += v5 / 2;
                break;
            }
            case 5: {
                v7 += v5;
            }
        }
        switch(v2 & 0x70) {
            case 16: {
                v8 = v6 / 2;
                break;
            }
            case 80: {
                v8 = v6;
                break;
            }
            default: {
                v8 = 0;
            }
        }
        int v9 = Math.max(this.getPaddingLeft() + coordinatorLayout$f0.leftMargin, Math.min(v7, v3 - this.getPaddingRight() - v5 - coordinatorLayout$f0.rightMargin));
        int v10 = Math.max(this.getPaddingTop() + coordinatorLayout$f0.topMargin, Math.min(v8, v4 - this.getPaddingBottom() - v6 - coordinatorLayout$f0.bottomMargin));
        view0.layout(v9, v10, v5 + v9, v6 + v10);
    }

    private void F(View view0, Rect rect0, int v) {
        int v9;
        boolean z;
        if(!Y.S(view0)) {
            return;
        }
        if(view0.getWidth() > 0 && view0.getHeight() > 0) {
            f coordinatorLayout$f0 = (f)view0.getLayoutParams();
            c coordinatorLayout$c0 = coordinatorLayout$f0.e();
            Rect rect1 = CoordinatorLayout.a();
            Rect rect2 = CoordinatorLayout.a();
            rect2.set(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            if(coordinatorLayout$c0 == null || !coordinatorLayout$c0.f(this, view0, rect1)) {
                rect1.set(rect2);
            }
            else if(!rect2.contains(rect1)) {
                throw new IllegalArgumentException("Rect should be within the child\'s bounds. Rect:" + rect1.toShortString() + " | Bounds:" + rect2.toShortString());
            }
            CoordinatorLayout.O(rect2);
            if(rect1.isEmpty()) {
                CoordinatorLayout.O(rect1);
                return;
            }
            int v1 = s.b(coordinatorLayout$f0.h, v);
            int v2 = 1;
            if((v1 & 0x30) == 0x30) {
                int v3 = rect1.top - coordinatorLayout$f0.topMargin - coordinatorLayout$f0.j;
                int v4 = rect0.top;
                if(v3 < v4) {
                    this.V(view0, v4 - v3);
                    z = true;
                }
                else {
                    z = false;
                }
            }
            else {
                z = false;
            }
            if((v1 & 80) == 80) {
                int v5 = this.getHeight() - rect1.bottom - coordinatorLayout$f0.bottomMargin + coordinatorLayout$f0.j;
                int v6 = rect0.bottom;
                if(v5 < v6) {
                    this.V(view0, v5 - v6);
                    z = true;
                }
            }
            if(!z) {
                this.V(view0, 0);
            }
            if((v1 & 3) == 3) {
                int v7 = rect1.left - coordinatorLayout$f0.leftMargin - coordinatorLayout$f0.i;
                int v8 = rect0.left;
                if(v7 < v8) {
                    this.U(view0, v8 - v7);
                    v9 = 1;
                }
                else {
                    v9 = 0;
                }
            }
            else {
                v9 = 0;
            }
            if((v1 & 5) == 5) {
                int v10 = this.getWidth() - rect1.right - coordinatorLayout$f0.rightMargin + coordinatorLayout$f0.i;
                int v11 = rect0.right;
                if(v10 < v11) {
                    this.U(view0, v10 - v11);
                }
                else {
                    v2 = v9;
                }
            }
            else {
                v2 = v9;
            }
            if(v2 == 0) {
                this.U(view0, 0);
            }
            CoordinatorLayout.O(rect1);
        }
    }

    void G(View view0, int v) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(((f)viewGroup$LayoutParams0).k != null) {
            Rect rect0 = CoordinatorLayout.a();
            Rect rect1 = CoordinatorLayout.a();
            Rect rect2 = CoordinatorLayout.a();
            this.t(((f)viewGroup$LayoutParams0).k, rect0);
            boolean z = false;
            this.q(view0, false, rect1);
            int v1 = view0.getMeasuredWidth();
            int v2 = view0.getMeasuredHeight();
            this.v(view0, v, rect0, rect2, ((f)viewGroup$LayoutParams0), v1, v2);
            if(rect2.left != rect1.left || rect2.top != rect1.top) {
                z = true;
            }
            this.d(((f)viewGroup$LayoutParams0), rect2, v1, v2);
            int v3 = rect2.left - rect1.left;
            int v4 = rect2.top - rect1.top;
            if(v3 != 0) {
                Y.Y(view0, v3);
            }
            if(v4 != 0) {
                Y.Z(view0, v4);
            }
            if(z) {
                c coordinatorLayout$c0 = ((f)viewGroup$LayoutParams0).e();
                if(coordinatorLayout$c0 != null) {
                    coordinatorLayout$c0.l(this, view0, ((f)viewGroup$LayoutParams0).k);
                }
            }
            CoordinatorLayout.O(rect0);
            CoordinatorLayout.O(rect1);
            CoordinatorLayout.O(rect2);
        }
    }

    final void H(int v) {
        int v6;
        boolean z;
        int v1 = Y.z(this);
        int v2 = this.f.size();
        Rect rect0 = CoordinatorLayout.a();
        Rect rect1 = CoordinatorLayout.a();
        Rect rect2 = CoordinatorLayout.a();
        int v3 = 0;
        while(v3 < v2) {
            View view0 = (View)this.f.get(v3);
            f coordinatorLayout$f0 = (f)view0.getLayoutParams();
            if(v != 0 || view0.getVisibility() != 8) {
                for(int v4 = 0; v4 < v3; ++v4) {
                    View view1 = (View)this.f.get(v4);
                    if(coordinatorLayout$f0.l == view1) {
                        this.G(view0, v1);
                    }
                }
                this.q(view0, true, rect1);
                if(coordinatorLayout$f0.g != 0 && !rect1.isEmpty()) {
                    int v5 = s.b(coordinatorLayout$f0.g, v1);
                    switch(v5 & 0x70) {
                        case 0x30: {
                            rect0.top = Math.max(rect0.top, rect1.bottom);
                            break;
                        }
                        case 80: {
                            rect0.bottom = Math.max(rect0.bottom, this.getHeight() - rect1.top);
                        }
                    }
                    switch(v5 & 7) {
                        case 3: {
                            rect0.left = Math.max(rect0.left, rect1.right);
                            break;
                        }
                        case 5: {
                            rect0.right = Math.max(rect0.right, this.getWidth() - rect1.left);
                        }
                    }
                }
                if(coordinatorLayout$f0.h != 0 && view0.getVisibility() == 0) {
                    this.F(view0, rect0, v1);
                }
                if(v == 2) {
                    v6 = v3 + 1;
                label_39:
                    while(v6 < v2) {
                        View view2 = (View)this.f.get(v6);
                        f coordinatorLayout$f1 = (f)view2.getLayoutParams();
                        c coordinatorLayout$c0 = coordinatorLayout$f1.e();
                        if(coordinatorLayout$c0 != null && coordinatorLayout$c0.i(this, view2, view0)) {
                            if(v != 0 || !coordinatorLayout$f1.f()) {
                                if(v == 2) {
                                    coordinatorLayout$c0.m(this, view2, view0);
                                    z = true;
                                }
                                else {
                                    z = coordinatorLayout$c0.l(this, view2, view0);
                                }
                                if(v == 1) {
                                    coordinatorLayout$f1.o(z);
                                }
                            }
                            else {
                                coordinatorLayout$f1.j();
                            }
                        }
                        ++v6;
                    }
                }
                else {
                    this.x(view0, rect2);
                    if(!rect2.equals(rect1)) {
                        this.N(view0, rect1);
                        v6 = v3 + 1;
                        goto label_39;
                    }
                }
            }
            ++v3;
        }
        CoordinatorLayout.O(rect0);
        CoordinatorLayout.O(rect1);
        CoordinatorLayout.O(rect2);
    }

    public void I(View view0, int v) {
        f coordinatorLayout$f0 = (f)view0.getLayoutParams();
        if(coordinatorLayout$f0.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view1 = coordinatorLayout$f0.k;
        if(view1 != null) {
            this.D(view0, view1, v);
            return;
        }
        int v1 = coordinatorLayout$f0.e;
        if(v1 >= 0) {
            this.E(view0, v1, v);
            return;
        }
        this.C(view0, v);
    }

    public void J(View view0, int v, int v1, int v2, int v3) {
        this.measureChildWithMargins(view0, v, v1, v2, v3);
    }

    static c K(Context context0, AttributeSet attributeSet0, String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(s.startsWith(".")) {
            s = "com.fmkorea.m.fmk" + s;
        }
        else if(s.indexOf(46) < 0) {
            String s1 = CoordinatorLayout.z;
            if(!TextUtils.isEmpty(s1)) {
                s = s1 + '.' + s;
            }
        }
        try {
            ThreadLocal threadLocal0 = CoordinatorLayout.B;
            Map map0 = (Map)threadLocal0.get();
            if(map0 == null) {
                map0 = new HashMap();
                threadLocal0.set(map0);
            }
            Constructor constructor0 = (Constructor)map0.get(s);
            if(constructor0 == null) {
                constructor0 = Class.forName(s, false, context0.getClassLoader()).getConstructor(CoordinatorLayout.A);
                constructor0.setAccessible(true);
                map0.put(s, constructor0);
            }
            return (c)constructor0.newInstance(context0, attributeSet0);
        }
        catch(Exception exception0) {
        }
        throw new RuntimeException("Could not inflate Behavior subclass " + s, exception0);
    }

    private boolean L(MotionEvent motionEvent0, int v) {
        int v1 = motionEvent0.getActionMasked();
        List list0 = this.h;
        this.z(list0);
        int v2 = list0.size();
        MotionEvent motionEvent1 = null;
        boolean z = false;
        boolean z1 = false;
        for(int v3 = 0; v3 < v2; ++v3) {
            View view0 = (View)list0.get(v3);
            f coordinatorLayout$f0 = (f)view0.getLayoutParams();
            c coordinatorLayout$c0 = coordinatorLayout$f0.e();
            if(!z && !z1 || v1 == 0) {
                if(!z && coordinatorLayout$c0 != null) {
                    switch(v) {
                        case 0: {
                            z = coordinatorLayout$c0.o(this, view0, motionEvent0);
                            break;
                        }
                        case 1: {
                            z = coordinatorLayout$c0.H(this, view0, motionEvent0);
                        }
                    }
                    if(z) {
                        this.p = view0;
                    }
                }
                boolean z2 = coordinatorLayout$f0.c();
                boolean z3 = coordinatorLayout$f0.h(this, view0);
                z1 = z3 && !z2;
                if(!z3 || z1) {
                    continue;
                }
                break;
            }
            else if(coordinatorLayout$c0 != null) {
                if(motionEvent1 == null) {
                    long v4 = SystemClock.uptimeMillis();
                    motionEvent1 = MotionEvent.obtain(v4, v4, 3, 0.0f, 0.0f, 0);
                }
                switch(v) {
                    case 0: {
                        coordinatorLayout$c0.o(this, view0, motionEvent1);
                        break;
                    }
                    case 1: {
                        coordinatorLayout$c0.H(this, view0, motionEvent1);
                    }
                }
            }
        }
        list0.clear();
        return z;
    }

    private void M() {
        this.f.clear();
        this.g.c();
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            f coordinatorLayout$f0 = this.y(view0);
            coordinatorLayout$f0.d(this, view0);
            this.g.b(view0);
            for(int v2 = 0; v2 < v; ++v2) {
                if(v2 != v1) {
                    View view1 = this.getChildAt(v2);
                    if(coordinatorLayout$f0.b(this, view0, view1)) {
                        if(!this.g.d(view1)) {
                            this.g.b(view1);
                        }
                        this.g.a(view1, view0);
                    }
                }
            }
        }
        ArrayList arrayList0 = this.g.i();
        this.f.addAll(arrayList0);
        Collections.reverse(this.f);
    }

    void N(View view0, Rect rect0) {
        ((f)view0.getLayoutParams()).p(rect0);
    }

    private static void O(Rect rect0) {
        rect0.setEmpty();
        CoordinatorLayout.D.a(rect0);
    }

    void P() {
        if(this.n && this.r != null) {
            this.getViewTreeObserver().removeOnPreDrawListener(this.r);
        }
        this.s = false;
    }

    private void Q(boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            c coordinatorLayout$c0 = ((f)view0.getLayoutParams()).e();
            if(coordinatorLayout$c0 != null) {
                long v2 = SystemClock.uptimeMillis();
                MotionEvent motionEvent0 = MotionEvent.obtain(v2, v2, 3, 0.0f, 0.0f, 0);
                if(z) {
                    coordinatorLayout$c0.o(this, view0, motionEvent0);
                }
                else {
                    coordinatorLayout$c0.H(this, view0, motionEvent0);
                }
                motionEvent0.recycle();
            }
        }
        for(int v3 = 0; v3 < v; ++v3) {
            ((f)this.getChildAt(v3).getLayoutParams()).l();
        }
        this.p = null;
        this.m = false;
    }

    private static int R(int v) {
        return v == 0 ? 17 : v;
    }

    private static int S(int v) {
        if((v & 7) == 0) {
            v |= 0x800003;
        }
        return (v & 0x70) == 0 ? v | 0x30 : v;
    }

    private static int T(int v) {
        return v == 0 ? 0x800035 : v;
    }

    private void U(View view0, int v) {
        f coordinatorLayout$f0 = (f)view0.getLayoutParams();
        int v1 = coordinatorLayout$f0.i;
        if(v1 != v) {
            Y.Y(view0, v - v1);
            coordinatorLayout$f0.i = v;
        }
    }

    private void V(View view0, int v) {
        f coordinatorLayout$f0 = (f)view0.getLayoutParams();
        int v1 = coordinatorLayout$f0.j;
        if(v1 != v) {
            Y.Z(view0, v - v1);
            coordinatorLayout$f0.j = v;
        }
    }

    // 检测为 Lambda 实现
    final y0 W(y0 y00) [...]

    private void X() {
        class androidx.coordinatorlayout.widget.CoordinatorLayout.a implements G {
            final CoordinatorLayout a;

            @Override  // androidx.core.view.G
            public y0 a(View view0, y0 y00) {
                return CoordinatorLayout.this.W(y00);
            }
        }

        if(Y.w(this)) {
            if(this.x == null) {
                this.x = (/* 缺少LAMBDA参数 */, y0 y00) -> {
                    if(!B.c.a(CoordinatorLayout.this.t, y00)) {
                        CoordinatorLayout.this.t = y00;
                        boolean z = false;
                        boolean z1 = y00 != null && y00.l() > 0;
                        CoordinatorLayout.this.u = z1;
                        if(!z1 && CoordinatorLayout.this.getBackground() == null) {
                            z = true;
                        }
                        CoordinatorLayout.this.setWillNotDraw(z);
                        y00 = CoordinatorLayout.this.e(y00);
                        CoordinatorLayout.this.requestLayout();
                    }
                    return y00;
                };
            }
            Y.B0(this, this.x);
            this.setSystemUiVisibility(0x500);
            return;
        }
        Y.B0(this, null);
    }

    private static Rect a() {
        Rect rect0 = (Rect)CoordinatorLayout.D.b();
        return rect0 == null ? new Rect() : rect0;
    }

    void b() {
        if(this.n) {
            if(this.r == null) {
                this.r = new g(this);
            }
            this.getViewTreeObserver().addOnPreDrawListener(this.r);
        }
        this.s = true;
    }

    private static int c(int v, int v1, int v2) {
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof f && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    private void d(f coordinatorLayout$f0, Rect rect0, int v, int v1) {
        int v2 = this.getWidth();
        int v3 = this.getHeight();
        int v4 = Math.max(this.getPaddingLeft() + coordinatorLayout$f0.leftMargin, Math.min(rect0.left, v2 - this.getPaddingRight() - v - coordinatorLayout$f0.rightMargin));
        int v5 = Math.max(this.getPaddingTop() + coordinatorLayout$f0.topMargin, Math.min(rect0.top, v3 - this.getPaddingBottom() - v1 - coordinatorLayout$f0.bottomMargin));
        rect0.set(v4, v5, v + v4, v1 + v5);
    }

    @Override  // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas0, View view0, long v) {
        boolean z = ((f)view0.getLayoutParams()).a == null;
        return super.drawChild(canvas0, view0, v);
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.v;
        if((drawable0 == null || !drawable0.isStateful() ? false : drawable0.setState(arr_v))) {
            this.invalidate();
        }
    }

    private y0 e(y0 y00) {
        if(y00.q()) {
            return y00;
        }
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(Y.w(view0) && ((f)view0.getLayoutParams()).e() != null && y00.q()) {
                break;
            }
        }
        return y00;
    }

    public void f(View view0) {
        List list0 = this.g.g(view0);
        if(list0 != null && !list0.isEmpty()) {
            for(int v = 0; v < list0.size(); ++v) {
                View view1 = (View)list0.get(v);
                c coordinatorLayout$c0 = ((f)view1.getLayoutParams()).e();
                if(coordinatorLayout$c0 != null) {
                    coordinatorLayout$c0.l(this, view1, view0);
                }
            }
        }
    }

    void g() {
        int v = this.getChildCount();
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.A(this.getChildAt(v1))) {
                z = true;
                break;
            }
        }
        if(z != this.s) {
            if(z) {
                this.b();
                return;
            }
            this.P();
        }
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.h();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.i(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.p(viewGroup$LayoutParams0);
    }

    final List getDependencySortedChildren() {
        this.M();
        return Collections.unmodifiableList(this.f);
    }

    public final y0 getLastWindowInsets() {
        return this.t;
    }

    @Override  // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.y.a();
    }

    public Drawable getStatusBarBackground() {
        return this.v;
    }

    @Override  // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), this.getPaddingTop() + this.getPaddingBottom());
    }

    @Override  // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), this.getPaddingLeft() + this.getPaddingRight());
    }

    protected f h() {
        return new f(-2, -2);
    }

    public f i(AttributeSet attributeSet0) {
        return new f(this.getContext(), attributeSet0);
    }

    @Override  // androidx.core.view.E
    public void j(View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        int v5 = this.getChildCount();
        boolean z = false;
        int v7 = 0;
        int v8 = 0;
        for(int v6 = 0; v6 < v5; ++v6) {
            View view1 = this.getChildAt(v6);
            if(view1.getVisibility() != 8) {
                f coordinatorLayout$f0 = (f)view1.getLayoutParams();
                if(coordinatorLayout$f0.i(v4)) {
                    c coordinatorLayout$c0 = coordinatorLayout$f0.e();
                    if(coordinatorLayout$c0 != null) {
                        this.k[0] = 0;
                        this.k[1] = 0;
                        coordinatorLayout$c0.x(this, view1, view0, v, v1, v2, v3, v4, this.k);
                        v7 = v2 <= 0 ? Math.min(v7, this.k[0]) : Math.max(v7, this.k[0]);
                        v8 = v3 <= 0 ? Math.min(v8, this.k[1]) : Math.max(v8, this.k[1]);
                        z = true;
                    }
                }
            }
        }
        arr_v[0] += v7;
        arr_v[1] += v8;
        if(z) {
            this.H(1);
        }
    }

    @Override  // androidx.core.view.D
    public void k(View view0, int v, int v1, int v2, int v3, int v4) {
        this.j(view0, v, v1, v2, v3, 0, this.l);
    }

    @Override  // androidx.core.view.D
    public boolean l(View view0, View view1, int v, int v1) {
        int v2 = this.getChildCount();
        boolean z = false;
        for(int v3 = 0; v3 < v2; ++v3) {
            View view2 = this.getChildAt(v3);
            if(view2.getVisibility() != 8) {
                f coordinatorLayout$f0 = (f)view2.getLayoutParams();
                c coordinatorLayout$c0 = coordinatorLayout$f0.e();
                if(coordinatorLayout$c0 == null) {
                    coordinatorLayout$f0.q(v1, false);
                }
                else {
                    boolean z1 = coordinatorLayout$c0.E(this, view2, view0, view1, v, v1);
                    z |= z1;
                    coordinatorLayout$f0.q(v1, z1);
                }
            }
        }
        return z;
    }

    @Override  // androidx.core.view.D
    public void m(View view0, View view1, int v, int v1) {
        this.y.c(view0, view1, v, v1);
        this.q = view1;
        int v2 = this.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            boolean z = !((f)this.getChildAt(v3).getLayoutParams()).i(v1);
        }
    }

    @Override  // androidx.core.view.D
    public void n(View view0, int v) {
        this.y.e(view0, v);
        int v1 = this.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view1 = this.getChildAt(v2);
            f coordinatorLayout$f0 = (f)view1.getLayoutParams();
            if(coordinatorLayout$f0.i(v)) {
                c coordinatorLayout$c0 = coordinatorLayout$f0.e();
                if(coordinatorLayout$c0 != null) {
                    coordinatorLayout$c0.G(this, view1, view0, v);
                }
                coordinatorLayout$f0.k(v);
                coordinatorLayout$f0.j();
            }
        }
        this.q = null;
    }

    @Override  // androidx.core.view.D
    public void o(View view0, int v, int v1, int[] arr_v, int v2) {
        int v3 = this.getChildCount();
        boolean z = false;
        int v5 = 0;
        int v6 = 0;
        for(int v4 = 0; v4 < v3; ++v4) {
            View view1 = this.getChildAt(v4);
            if(view1.getVisibility() != 8) {
                f coordinatorLayout$f0 = (f)view1.getLayoutParams();
                if(coordinatorLayout$f0.i(v2)) {
                    c coordinatorLayout$c0 = coordinatorLayout$f0.e();
                    if(coordinatorLayout$c0 != null) {
                        this.k[0] = 0;
                        this.k[1] = 0;
                        coordinatorLayout$c0.u(this, view1, view0, v, v1, this.k, v2);
                        v5 = v <= 0 ? Math.min(v5, this.k[0]) : Math.max(v5, this.k[0]);
                        v6 = v1 <= 0 ? Math.min(v6, this.k[1]) : Math.max(v6, this.k[1]);
                        z = true;
                    }
                }
            }
        }
        arr_v[0] = v5;
        arr_v[1] = v6;
        if(z) {
            this.H(1);
        }
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q(false);
        if(this.s) {
            if(this.r == null) {
                this.r = new g(this);
            }
            this.getViewTreeObserver().addOnPreDrawListener(this.r);
        }
        if(this.t == null && Y.w(this)) {
            Y.l0(this);
        }
        this.n = true;
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q(false);
        if(this.s && this.r != null) {
            this.getViewTreeObserver().removeOnPreDrawListener(this.r);
        }
        View view0 = this.q;
        if(view0 != null) {
            this.onStopNestedScroll(view0);
        }
        this.n = false;
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        if(this.u && this.v != null) {
            int v = this.t == null ? 0 : this.t.l();
            if(v > 0) {
                this.v.setBounds(0, 0, this.getWidth(), v);
                this.v.draw(canvas0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.Q(true);
        }
        boolean z = this.L(motionEvent0, 0);
        if(v == 1 || v == 3) {
            this.Q(true);
        }
        return z;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = Y.z(this);
        int v5 = this.f.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            View view0 = (View)this.f.get(v6);
            if(view0.getVisibility() != 8) {
                c coordinatorLayout$c0 = ((f)view0.getLayoutParams()).e();
                if(coordinatorLayout$c0 == null || !coordinatorLayout$c0.p(this, view0, v4)) {
                    this.I(view0, v4);
                }
            }
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v32;
        int v31;
        int v30;
        f coordinatorLayout$f1;
        int v29;
        int v28;
        int v23;
        int v22;
        int v18;
        this.M();
        this.g();
        int v2 = this.getPaddingLeft();
        int v3 = this.getPaddingTop();
        int v4 = this.getPaddingRight();
        int v5 = this.getPaddingBottom();
        int v6 = Y.z(this);
        int v7 = View.MeasureSpec.getMode(v);
        int v8 = View.MeasureSpec.getSize(v);
        int v9 = View.MeasureSpec.getMode(v1);
        int v10 = View.MeasureSpec.getSize(v1);
        int v11 = this.getSuggestedMinimumWidth();
        int v12 = this.getSuggestedMinimumHeight();
        boolean z = this.t != null && Y.w(this);
        int v13 = this.f.size();
        int v14 = v11;
        int v15 = v12;
        int v16 = 0;
        int v17 = 0;
        while(v17 < v13) {
            View view0 = (View)this.f.get(v17);
            if(view0.getVisibility() == 8) {
                v18 = v17;
            }
            else {
                f coordinatorLayout$f0 = (f)view0.getLayoutParams();
                int v19 = coordinatorLayout$f0.e;
                if(v19 < 0 || v7 == 0) {
                    v22 = v16;
                }
                else {
                    int v20 = this.w(v19);
                    int v21 = s.b(CoordinatorLayout.T(coordinatorLayout$f0.c), v6) & 7;
                    v22 = v16;
                    if(v21 == 3 && v6 != 1 || v21 == 5 && v6 == 1) {
                        v23 = Math.max(0, v8 - v4 - v20);
                        goto label_38;
                    }
                    else if(v21 == 5 && v6 != 1 || v21 == 3 && v6 == 1) {
                        v23 = Math.max(0, v20 - v2);
                        goto label_38;
                    }
                }
                v23 = 0;
            label_38:
                if(!z || Y.w(view0)) {
                    v28 = v;
                    v29 = v1;
                }
                else {
                    int v24 = this.t.j();
                    int v25 = this.t.k();
                    int v26 = this.t.l();
                    int v27 = this.t.i();
                    v28 = View.MeasureSpec.makeMeasureSpec(v8 - (v24 + v25), v7);
                    v29 = View.MeasureSpec.makeMeasureSpec(v10 - (v26 + v27), v9);
                }
                c coordinatorLayout$c0 = coordinatorLayout$f0.e();
                if(coordinatorLayout$c0 == null) {
                    coordinatorLayout$f1 = coordinatorLayout$f0;
                    v31 = v15;
                    v30 = v22;
                    v18 = v17;
                    v32 = v14;
                    this.J(view0, v28, v23, v29, 0);
                }
                else {
                    coordinatorLayout$f1 = coordinatorLayout$f0;
                    v30 = v22;
                    v18 = v17;
                    v31 = v15;
                    v32 = v14;
                    if(!coordinatorLayout$c0.q(this, view0, v28, v23, v29, 0)) {
                        this.J(view0, v28, v23, v29, 0);
                    }
                }
                int v33 = Math.max(v32, v2 + v4 + view0.getMeasuredWidth() + coordinatorLayout$f1.leftMargin + coordinatorLayout$f1.rightMargin);
                int v34 = Math.max(v31, v3 + v5 + view0.getMeasuredHeight() + coordinatorLayout$f1.topMargin + coordinatorLayout$f1.bottomMargin);
                v16 = View.combineMeasuredStates(v30, view0.getMeasuredState());
                v14 = v33;
                v15 = v34;
            }
            v17 = v18 + 1;
        }
        this.setMeasuredDimension(View.resolveSizeAndState(v14, v, 0xFF000000 & v16), View.resolveSizeAndState(v15, v1, v16 << 16));
    }

    @Override  // android.view.ViewGroup
    public boolean onNestedFling(View view0, float f, float f1, boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            if(view1.getVisibility() != 8) {
                boolean z1 = !((f)view1.getLayoutParams()).i(0);
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean onNestedPreFling(View view0, float f, float f1) {
        int v = this.getChildCount();
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            if(view1.getVisibility() != 8) {
                f coordinatorLayout$f0 = (f)view1.getLayoutParams();
                if(coordinatorLayout$f0.i(0)) {
                    c coordinatorLayout$c0 = coordinatorLayout$f0.e();
                    if(coordinatorLayout$c0 != null) {
                        z |= coordinatorLayout$c0.s(this, view1, view0, f, f1);
                    }
                }
            }
        }
        return z;
    }

    @Override  // android.view.ViewGroup
    public void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
        this.o(view0, v, v1, arr_v, 0);
    }

    @Override  // android.view.ViewGroup
    public void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        this.k(view0, v, v1, v2, v3, 0);
    }

    @Override  // android.view.ViewGroup
    public void onNestedScrollAccepted(View view0, View view1, int v) {
        this.m(view0, view1, v, 0);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        SparseArray sparseArray0 = ((SavedState)parcelable0).h;
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            int v2 = view0.getId();
            c coordinatorLayout$c0 = this.y(view0).e();
            if(v2 != -1 && coordinatorLayout$c0 != null) {
                Parcelable parcelable1 = (Parcelable)sparseArray0.get(v2);
                if(parcelable1 != null) {
                    coordinatorLayout$c0.B(this, view0, parcelable1);
                }
            }
        }
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray0 = new SparseArray();
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            int v2 = view0.getId();
            c coordinatorLayout$c0 = ((f)view0.getLayoutParams()).e();
            if(v2 != -1 && coordinatorLayout$c0 != null) {
                Parcelable parcelable1 = coordinatorLayout$c0.C(this, view0);
                if(parcelable1 != null) {
                    sparseArray0.append(v2, parcelable1);
                }
            }
        }
        parcelable0.h = sparseArray0;
        return parcelable0;
    }

    @Override  // android.view.ViewGroup
    public boolean onStartNestedScroll(View view0, View view1, int v) {
        return this.l(view0, view1, v, 0);
    }

    @Override  // android.view.ViewGroup
    public void onStopNestedScroll(View view0) {
        this.n(view0, 0);
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z1;
        boolean z;
        int v = motionEvent0.getActionMasked();
        if(this.p == null) {
            z = this.L(motionEvent0, 1);
            if(z) {
                goto label_7;
            }
            else {
                z1 = false;
            }
        }
        else {
            z = false;
        label_7:
            c coordinatorLayout$c0 = ((f)this.p.getLayoutParams()).e();
            z1 = coordinatorLayout$c0 == null ? false : coordinatorLayout$c0.H(this, this.p, motionEvent0);
        }
        MotionEvent motionEvent1 = null;
        if(this.p == null) {
            z1 |= super.onTouchEvent(motionEvent0);
        }
        else if(z) {
            long v1 = SystemClock.uptimeMillis();
            motionEvent1 = MotionEvent.obtain(v1, v1, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEvent1);
        }
        if(motionEvent1 != null) {
            motionEvent1.recycle();
        }
        if(v == 1 || v == 3) {
            this.Q(false);
        }
        return z1;
    }

    protected f p(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof f) {
            return new f(((f)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new f(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new f(viewGroup$LayoutParams0);
    }

    void q(View view0, boolean z, Rect rect0) {
        if(!view0.isLayoutRequested() && view0.getVisibility() != 8) {
            if(z) {
                this.t(view0, rect0);
                return;
            }
            rect0.set(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            return;
        }
        rect0.setEmpty();
    }

    public List r(View view0) {
        List list0 = this.g.h(view0);
        this.i.clear();
        if(list0 != null) {
            this.i.addAll(list0);
        }
        return this.i;
    }

    @Override  // android.view.ViewGroup
    public boolean requestChildRectangleOnScreen(View view0, Rect rect0, boolean z) {
        c coordinatorLayout$c0 = ((f)view0.getLayoutParams()).e();
        return coordinatorLayout$c0 == null || !coordinatorLayout$c0.A(this, view0, rect0, z) ? super.requestChildRectangleOnScreen(view0, rect0, z) : true;
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if(z && !this.m) {
            this.Q(false);
            this.m = true;
        }
    }

    public List s(View view0) {
        List list0 = this.g.g(view0);
        this.i.clear();
        if(list0 != null) {
            this.i.addAll(list0);
        }
        return this.i;
    }

    @Override  // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        this.X();
    }

    @Override  // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0) {
        this.w = viewGroup$OnHierarchyChangeListener0;
    }

    public void setStatusBarBackground(Drawable drawable0) {
        Drawable drawable1 = null;
        Drawable drawable2 = this.v;
        if(drawable2 != drawable0) {
            if(drawable2 != null) {
                drawable2.setCallback(null);
            }
            if(drawable0 != null) {
                drawable1 = drawable0.mutate();
            }
            this.v = drawable1;
            if(drawable1 != null) {
                if(drawable1.isStateful()) {
                    this.v.setState(this.getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.v, Y.z(this));
                this.v.setVisible(this.getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            Y.f0(this);
        }
    }

    public void setStatusBarBackgroundColor(int v) {
        this.setStatusBarBackground(new ColorDrawable(v));
    }

    public void setStatusBarBackgroundResource(int v) {
        this.setStatusBarBackground((v == 0 ? null : androidx.core.content.a.getDrawable(this.getContext(), v)));
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        if(this.v != null && this.v.isVisible() != (v == 0)) {
            this.v.setVisible(v == 0, false);
        }
    }

    void t(View view0, Rect rect0) {
        androidx.coordinatorlayout.widget.c.a(this, view0, rect0);
    }

    void u(View view0, int v, Rect rect0, Rect rect1) {
        f coordinatorLayout$f0 = (f)view0.getLayoutParams();
        int v1 = view0.getMeasuredWidth();
        int v2 = view0.getMeasuredHeight();
        this.v(view0, v, rect0, rect1, coordinatorLayout$f0, v1, v2);
        this.d(coordinatorLayout$f0, rect1, v1, v2);
    }

    private void v(View view0, int v, Rect rect0, Rect rect1, f coordinatorLayout$f0, int v1, int v2) {
        int v6;
        int v5;
        int v3 = s.b(CoordinatorLayout.R(coordinatorLayout$f0.c), v);
        int v4 = s.b(CoordinatorLayout.S(coordinatorLayout$f0.d), v);
        switch(v4 & 7) {
            case 1: {
                v5 = rect0.left + rect0.width() / 2;
                break;
            }
            case 5: {
                v5 = rect0.right;
                break;
            }
            default: {
                v5 = rect0.left;
            }
        }
        switch(v4 & 0x70) {
            case 16: {
                v6 = rect0.top + rect0.height() / 2;
                break;
            }
            case 80: {
                v6 = rect0.bottom;
                break;
            }
            default: {
                v6 = rect0.top;
            }
        }
        if((v3 & 7) == 1) {
            v5 -= v1 / 2;
        }
        else if((v3 & 7) != 5) {
            v5 -= v1;
        }
        if((v3 & 0x70) == 16) {
            v6 -= v2 / 2;
        }
        else if((v3 & 0x70) != 80) {
            v6 -= v2;
        }
        rect1.set(v5, v6, v1 + v5, v2 + v6);
    }

    @Override  // android.view.View
    protected boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.v;
    }

    private int w(int v) {
        int[] arr_v = this.o;
        if(arr_v == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + v);
            return 0;
        }
        if(v >= 0 && v < arr_v.length) {
            return arr_v[v];
        }
        Log.e("CoordinatorLayout", "Keyline index " + v + " out of range for " + this);
        return 0;
    }

    void x(View view0, Rect rect0) {
        rect0.set(((f)view0.getLayoutParams()).g());
    }

    f y(View view0) {
        f coordinatorLayout$f0 = (f)view0.getLayoutParams();
        if(!coordinatorLayout$f0.b) {
            if(view0 instanceof b) {
                c coordinatorLayout$c0 = ((b)view0).getBehavior();
                if(coordinatorLayout$c0 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                coordinatorLayout$f0.n(coordinatorLayout$c0);
                coordinatorLayout$f0.b = true;
                return coordinatorLayout$f0;
            }
            Class class0 = view0.getClass();
            d coordinatorLayout$d0 = null;
            while(class0 != null) {
                coordinatorLayout$d0 = (d)class0.getAnnotation(d.class);
                if(coordinatorLayout$d0 != null) {
                    break;
                }
                class0 = class0.getSuperclass();
            }
            if(coordinatorLayout$d0 != null) {
                try {
                    coordinatorLayout$f0.n(((c)coordinatorLayout$d0.value().getDeclaredConstructor(null).newInstance(null)));
                }
                catch(Exception exception0) {
                    Log.e("CoordinatorLayout", "Default behavior class " + coordinatorLayout$d0.value().getName() + " could not be instantiated. Did you forget a default constructor?", exception0);
                }
            }
            coordinatorLayout$f0.b = true;
        }
        return coordinatorLayout$f0;
    }

    private void z(List list0) {
        list0.clear();
        boolean z = this.isChildrenDrawingOrderEnabled();
        int v = this.getChildCount();
        for(int v1 = v - 1; v1 >= 0; --v1) {
            list0.add(this.getChildAt((z ? this.getChildDrawingOrder(v, v1) : v1)));
        }
        Comparator comparator0 = CoordinatorLayout.C;
        if(comparator0 != null) {
            Collections.sort(list0, comparator0);
        }
    }
}

