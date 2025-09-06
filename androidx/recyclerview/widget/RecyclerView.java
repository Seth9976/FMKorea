package androidx.recyclerview.widget;

import C.z.f;
import C.z;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.app.E;
import androidx.core.view.B;
import androidx.core.view.C;
import androidx.core.view.Y;
import androidx.core.view.c0;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements B {
    class A implements Runnable {
        private int f;
        private int g;
        OverScroller h;
        Interpolator i;
        private boolean j;
        private boolean k;
        final RecyclerView l;

        A() {
            this.i = RecyclerView.J0;
            this.j = false;
            this.k = false;
            this.h = new OverScroller(recyclerView0.getContext(), RecyclerView.J0);
        }

        private int a(int v, int v1, int v2, int v3) {
            int v4 = Math.abs(v);
            int v5 = Math.abs(v1);
            boolean z = v4 > v5;
            int v6 = (int)Math.sqrt(v2 * v2 + v3 * v3);
            int v7 = z ? RecyclerView.this.getWidth() : RecyclerView.this.getHeight();
            float f = this.b(Math.min(1.0f, ((float)(((int)Math.sqrt(v * v + v1 * v1)))) * 1.0f / ((float)v7)));
            if(v6 > 0) {
                return Math.min(Math.round(Math.abs((((float)(v7 / 2)) + f * ((float)(v7 / 2))) / ((float)v6)) * 1000.0f) * 4, 2000);
            }
            if(!z) {
                v4 = v5;
            }
            return Math.min(((int)((((float)v4) / ((float)v7) + 1.0f) * 300.0f)), 2000);
        }

        private float b(float f) {
            return (float)Math.sin((f - 0.5f) * 0.471239f);
        }

        public void c(int v, int v1) {
            RecyclerView.this.setScrollState(2);
            this.g = 0;
            this.f = 0;
            Interpolator interpolator0 = RecyclerView.J0;
            if(this.i != interpolator0) {
                this.i = interpolator0;
                this.h = new OverScroller(RecyclerView.this.getContext(), interpolator0);
            }
            this.h.fling(0, 0, v, v1, 0x80000000, 0x7FFFFFFF, 0x80000000, 0x7FFFFFFF);
            this.e();
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            Y.g0(RecyclerView.this, this);
        }

        void e() {
            if(this.j) {
                this.k = true;
                return;
            }
            this.d();
        }

        public void f(int v, int v1, int v2, Interpolator interpolator0) {
            if(v2 == 0x80000000) {
                v2 = this.a(v, v1, 0, 0);
            }
            if(interpolator0 == null) {
                interpolator0 = RecyclerView.J0;
            }
            if(this.i != interpolator0) {
                this.i = interpolator0;
                this.h = new OverScroller(RecyclerView.this.getContext(), interpolator0);
            }
            this.g = 0;
            this.f = 0;
            RecyclerView.this.setScrollState(2);
            this.h.startScroll(0, 0, v, v1, v2);
            this.e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.h.abortAnimation();
        }

        @Override
        public void run() {
            int v10;
            int v5;
            int v4;
            RecyclerView recyclerView0 = RecyclerView.this;
            if(recyclerView0.r == null) {
                this.g();
                return;
            }
            this.k = false;
            this.j = true;
            recyclerView0.u();
            OverScroller overScroller0 = this.h;
            if(overScroller0.computeScrollOffset()) {
                int v = overScroller0.getCurrX();
                int v1 = overScroller0.getCurrY();
                int v2 = v - this.f;
                int v3 = v1 - this.g;
                this.f = v;
                this.g = v1;
                RecyclerView.this.x0[0] = 0;
                RecyclerView.this.x0[1] = 0;
                if(RecyclerView.this.F(v2, v3, RecyclerView.this.x0, null, 1)) {
                    v2 -= RecyclerView.this.x0[0];
                    v3 -= RecyclerView.this.x0[1];
                }
                if(RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(v2, v3);
                }
                RecyclerView recyclerView1 = RecyclerView.this;
                if(recyclerView1.q == null) {
                    v5 = 0;
                    v4 = 0;
                }
                else {
                    recyclerView1.x0[0] = 0;
                    recyclerView1.x0[1] = 0;
                    recyclerView1.h1(v2, v3, recyclerView1.x0);
                    v4 = RecyclerView.this.x0[0];
                    v5 = RecyclerView.this.x0[1];
                    v2 -= v4;
                    v3 -= v5;
                    x recyclerView$x0 = RecyclerView.this.r.g;
                    if(recyclerView$x0 != null && !recyclerView$x0.g() && recyclerView$x0.h()) {
                        int v6 = RecyclerView.this.l0.b();
                        if(v6 == 0) {
                            recyclerView$x0.r();
                        }
                        else {
                            if(recyclerView$x0.f() >= v6) {
                                recyclerView$x0.p(v6 - 1);
                            }
                            recyclerView$x0.j(v4, v5);
                        }
                    }
                }
                if(!RecyclerView.this.s.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView.this.x0[0] = 0;
                RecyclerView.this.x0[1] = 0;
                RecyclerView.this.G(v4, v5, v2, v3, null, 1, RecyclerView.this.x0);
                RecyclerView recyclerView2 = RecyclerView.this;
                int v7 = v2 - recyclerView2.x0[0];
                int v8 = v3 - recyclerView2.x0[1];
                if(v4 != 0 || v5 != 0) {
                    recyclerView2.I(v4, v5);
                }
                if(!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller0.getCurrX() == overScroller0.getFinalX();
                boolean z1 = overScroller0.getCurrY() == overScroller0.getFinalY();
                boolean z2 = overScroller0.isFinished() || (z || v7 != 0) && (z1 || v8 != 0);
                x recyclerView$x1 = RecyclerView.this.r.g;
                if(recyclerView$x1 != null && recyclerView$x1.g() || !z2) {
                    this.e();
                    RecyclerView recyclerView3 = RecyclerView.this;
                    e e0 = recyclerView3.j0;
                    if(e0 != null) {
                        e0.f(recyclerView3, v4, v5);
                    }
                }
                else {
                    if(RecyclerView.this.getOverScrollMode() != 2) {
                        int v9 = (int)overScroller0.getCurrVelocity();
                        if(v7 < 0) {
                            v10 = -v9;
                        }
                        else {
                            v10 = v7 <= 0 ? 0 : v9;
                        }
                        if(v8 < 0) {
                            v9 = -v9;
                        }
                        else if(v8 <= 0) {
                            v9 = 0;
                        }
                        RecyclerView.this.a(v10, v9);
                    }
                    RecyclerView.this.k0.b();
                }
            }
            x recyclerView$x2 = RecyclerView.this.r.g;
            if(recyclerView$x2 != null && recyclerView$x2.g()) {
                recyclerView$x2.j(0, 0);
            }
            this.j = false;
            if(this.k) {
                this.d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.u1(1);
        }
    }

    public static abstract class androidx.recyclerview.widget.RecyclerView.B {
        public final View a;
        WeakReference b;
        int c;
        int d;
        long e;
        int f;
        int g;
        androidx.recyclerview.widget.RecyclerView.B h;
        androidx.recyclerview.widget.RecyclerView.B i;
        int j;
        List k;
        List l;
        private int m;
        u n;
        boolean o;
        private int p;
        int q;
        RecyclerView r;
        private static final List s;

        static {
            androidx.recyclerview.widget.RecyclerView.B.s = Collections.emptyList();
        }

        public androidx.recyclerview.widget.RecyclerView.B(View view0) {
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.f = -1;
            this.g = -1;
            this.h = null;
            this.i = null;
            this.k = null;
            this.l = null;
            this.m = 0;
            this.n = null;
            this.o = false;
            this.p = 0;
            this.q = -1;
            if(view0 == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.a = view0;
        }

        void A(int v, boolean z) {
            if(this.d == -1) {
                this.d = this.c;
            }
            if(this.g == -1) {
                this.g = this.c;
            }
            if(z) {
                this.g += v;
            }
            this.c += v;
            if(this.a.getLayoutParams() != null) {
                ((p)this.a.getLayoutParams()).c = true;
            }
        }

        void B(RecyclerView recyclerView0) {
            int v = this.q;
            this.p = v == -1 ? Y.x(this.a) : v;
            recyclerView0.k1(this, 4);
        }

        void C(RecyclerView recyclerView0) {
            recyclerView0.k1(this, this.p);
            this.p = 0;
        }

        void D() {
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            this.d();
            this.p = 0;
            this.q = -1;
            RecyclerView.r(this);
        }

        void E() {
            if(this.d == -1) {
                this.d = this.c;
            }
        }

        void F(int v, int v1) {
            this.j = v & v1 | this.j & ~v1;
        }

        public final void G(boolean z) {
            int v = z ? this.m - 1 : this.m + 1;
            this.m = v;
            if(v < 0) {
                this.m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if(!z && v == 1) {
                this.j |= 16;
                return;
            }
            if(z && v == 0) {
                this.j &= -17;
            }
        }

        void H(u recyclerView$u0, boolean z) {
            this.n = recyclerView$u0;
            this.o = z;
        }

        boolean I() {
            return (this.j & 16) != 0;
        }

        boolean J() {
            return (this.j & 0x80) != 0;
        }

        void K() {
            this.n.J(this);
        }

        boolean L() {
            return (this.j & 0x20) != 0;
        }

        void a(Object object0) {
            if(object0 == null) {
                this.b(0x400);
                return;
            }
            if((0x400 & this.j) == 0) {
                this.g();
                this.k.add(object0);
            }
        }

        void b(int v) {
            this.j |= v;
        }

        void c() {
            this.d = -1;
            this.g = -1;
        }

        void d() {
            List list0 = this.k;
            if(list0 != null) {
                list0.clear();
            }
            this.j &= 0xFFFFFBFF;
        }

        void e() {
            this.j &= -33;
        }

        void f() {
            this.j &= 0xFFFFFEFF;
        }

        private void g() {
            if(this.k == null) {
                ArrayList arrayList0 = new ArrayList();
                this.k = arrayList0;
                this.l = Collections.unmodifiableList(arrayList0);
            }
        }

        boolean h() {
            return (this.j & 16) == 0 && Y.P(this.a);
        }

        void i(int v, int v1, boolean z) {
            this.b(8);
            this.A(v1, z);
            this.c = v;
        }

        public final int j() {
            return this.r == null ? -1 : this.r.b0(this);
        }

        public final long k() {
            return this.e;
        }

        public final int l() {
            return this.f;
        }

        public final int m() {
            return this.g == -1 ? this.c : this.g;
        }

        public final int n() {
            return this.d;
        }

        List o() {
            return (this.j & 0x400) != 0 || (this.k == null || this.k.size() == 0) ? androidx.recyclerview.widget.RecyclerView.B.s : this.l;
        }

        boolean p(int v) {
            return (v & this.j) != 0;
        }

        boolean q() {
            return (this.j & 0x200) != 0 || this.t();
        }

        boolean r() {
            return this.a.getParent() != null && this.a.getParent() != this.r;
        }

        boolean s() {
            return (this.j & 1) != 0;
        }

        boolean t() {
            return (this.j & 4) != 0;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder((this.getClass().isAnonymousClass() ? "ViewHolder" : this.getClass().getSimpleName()) + "{" + Integer.toHexString(this.hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
            if(this.w()) {
                stringBuilder0.append(" scrap ");
                stringBuilder0.append((this.o ? "[changeScrap]" : "[attachedScrap]"));
            }
            if(this.t()) {
                stringBuilder0.append(" invalid");
            }
            if(!this.s()) {
                stringBuilder0.append(" unbound");
            }
            if(this.z()) {
                stringBuilder0.append(" update");
            }
            if(this.v()) {
                stringBuilder0.append(" removed");
            }
            if(this.J()) {
                stringBuilder0.append(" ignored");
            }
            if(this.x()) {
                stringBuilder0.append(" tmpDetached");
            }
            if(!this.u()) {
                stringBuilder0.append(" not recyclable(" + this.m + ")");
            }
            if(this.q()) {
                stringBuilder0.append(" undefined adapter position");
            }
            if(this.a.getParent() == null) {
                stringBuilder0.append(" no parent");
            }
            stringBuilder0.append("}");
            return stringBuilder0.toString();
        }

        public final boolean u() {
            return (this.j & 16) == 0 && !Y.P(this.a);
        }

        boolean v() {
            return (this.j & 8) != 0;
        }

        boolean w() {
            return this.n != null;
        }

        boolean x() {
            return (this.j & 0x100) != 0;
        }

        boolean y() {
            return (this.j & 2) != 0;
        }

        boolean z() {
            return (this.j & 2) != 0;
        }
    }

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
        Parcelable h;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            if(classLoader0 == null) {
                classLoader0 = o.class.getClassLoader();
            }
            this.h = parcel0.readParcelable(classLoader0);
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        void b(SavedState recyclerView$SavedState0) {
            this.h = recyclerView$SavedState0.h;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeParcelable(this.h, 0);
        }
    }

    class androidx.recyclerview.widget.RecyclerView.a implements Runnable {
        final RecyclerView f;

        @Override
        public void run() {
            if(RecyclerView.this.y && !RecyclerView.this.isLayoutRequested()) {
                RecyclerView recyclerView0 = RecyclerView.this;
                if(!recyclerView0.v) {
                    recyclerView0.requestLayout();
                    return;
                }
                if(recyclerView0.B) {
                    recyclerView0.A = true;
                    return;
                }
                recyclerView0.u();
            }
        }
    }

    class b implements Runnable {
        final RecyclerView f;

        @Override
        public void run() {
            l recyclerView$l0 = RecyclerView.this.Q;
            if(recyclerView$l0 != null) {
                recyclerView$l0.u();
            }
            RecyclerView.this.r0 = false;
        }
    }

    static final class c implements Interpolator {
        @Override  // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
        }
    }

    class d implements androidx.recyclerview.widget.q.b {
        final RecyclerView a;

        @Override  // androidx.recyclerview.widget.q$b
        public void a(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
            RecyclerView.this.r.q1(recyclerView$B0.a, RecyclerView.this.g);
        }

        @Override  // androidx.recyclerview.widget.q$b
        public void b(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b0, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b1) {
            RecyclerView.this.l(recyclerView$B0, recyclerView$l$b0, recyclerView$l$b1);
        }

        @Override  // androidx.recyclerview.widget.q$b
        public void c(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b0, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b1) {
            RecyclerView.this.g.J(recyclerView$B0);
            RecyclerView.this.n(recyclerView$B0, recyclerView$l$b0, recyclerView$l$b1);
        }

        @Override  // androidx.recyclerview.widget.q$b
        public void d(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b0, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b1) {
            recyclerView$B0.G(false);
            RecyclerView recyclerView0 = RecyclerView.this;
            if(recyclerView0.H) {
                if(recyclerView0.Q.b(recyclerView$B0, recyclerView$B0, recyclerView$l$b0, recyclerView$l$b1)) {
                    RecyclerView.this.N0();
                }
            }
            else if(recyclerView0.Q.d(recyclerView$B0, recyclerView$l$b0, recyclerView$l$b1)) {
                RecyclerView.this.N0();
            }
        }
    }

    public static abstract class g {
        private final h a;
        private boolean b;

        public g() {
            this.a = new h();
            this.b = false;
        }

        public final void c(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, int v) {
            recyclerView$B0.c = v;
            if(this.i()) {
                recyclerView$B0.e = this.f(v);
            }
            recyclerView$B0.F(1, 0x207);
            androidx.core.os.u.a("RV OnBindView");
            this.n(recyclerView$B0, v, recyclerView$B0.o());
            recyclerView$B0.d();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = recyclerView$B0.a.getLayoutParams();
            if(viewGroup$LayoutParams0 instanceof p) {
                ((p)viewGroup$LayoutParams0).c = true;
            }
            androidx.core.os.u.b();
        }

        public final androidx.recyclerview.widget.RecyclerView.B d(ViewGroup viewGroup0, int v) {
            try {
                androidx.core.os.u.a("RV CreateView");
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = this.o(viewGroup0, v);
                if(recyclerView$B0.a.getParent() == null) {
                    recyclerView$B0.f = v;
                    return recyclerView$B0;
                }
            }
            finally {
                androidx.core.os.u.b();
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        }

        public abstract int e();

        public long f(int v) {
            return -1L;
        }

        public int g(int v) {
            return 0;
        }

        public final boolean h() {
            return this.a.a();
        }

        public final boolean i() {
            return this.b;
        }

        public final void j() {
            this.a.b();
        }

        public final void k(int v, Object object0) {
            this.a.c(v, 1, object0);
        }

        public void l(RecyclerView recyclerView0) {
        }

        public abstract void m(androidx.recyclerview.widget.RecyclerView.B arg1, int arg2);

        public void n(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, int v, List list0) {
            this.m(recyclerView$B0, v);
        }

        public abstract androidx.recyclerview.widget.RecyclerView.B o(ViewGroup arg1, int arg2);

        public void p(RecyclerView recyclerView0) {
        }

        public boolean q(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) [...] // Inlined contents

        public void r(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
        }

        public void s(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
        }

        public void t(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
        }

        public void u(i recyclerView$i0) {
            this.a.registerObserver(recyclerView$i0);
        }

        public void v(boolean z) {
            if(this.h()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.b = z;
        }

        public void w(i recyclerView$i0) {
            this.a.unregisterObserver(recyclerView$i0);
        }
    }

    static class h extends Observable {
        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for(int v = this.mObservers.size() - 1; v >= 0; --v) {
                ((i)this.mObservers.get(v)).a();
            }
        }

        public void c(int v, int v1, Object object0) {
            for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
                ((i)this.mObservers.get(v2)).b(v, v1, object0);
            }
        }
    }

    public static abstract class i {
        public abstract void a();

        public abstract void b(int arg1, int arg2, Object arg3);
    }

    public interface j {
    }

    public static class k {
        protected EdgeEffect a(RecyclerView recyclerView0, int v) {
            return new EdgeEffect(recyclerView0.getContext());
        }
    }

    public static abstract class l {
        interface androidx.recyclerview.widget.RecyclerView.l.a {
            void a(androidx.recyclerview.widget.RecyclerView.B arg1);
        }

        public static class androidx.recyclerview.widget.RecyclerView.l.b {
            public int a;
            public int b;
            public int c;
            public int d;

            public androidx.recyclerview.widget.RecyclerView.l.b a(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
                return this.b(recyclerView$B0, 0);
            }

            public androidx.recyclerview.widget.RecyclerView.l.b b(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, int v) {
                this.a = recyclerView$B0.a.getLeft();
                this.b = recyclerView$B0.a.getTop();
                this.c = recyclerView$B0.a.getRight();
                this.d = recyclerView$B0.a.getBottom();
                return this;
            }
        }

        private androidx.recyclerview.widget.RecyclerView.l.a a;
        private ArrayList b;
        private long c;
        private long d;
        private long e;
        private long f;

        public l() {
            this.a = null;
            this.b = new ArrayList();
            this.c = 120L;
            this.d = 120L;
            this.e = 0xFAL;
            this.f = 0xFAL;
        }

        public abstract boolean a(androidx.recyclerview.widget.RecyclerView.B arg1, androidx.recyclerview.widget.RecyclerView.l.b arg2, androidx.recyclerview.widget.RecyclerView.l.b arg3);

        public abstract boolean b(androidx.recyclerview.widget.RecyclerView.B arg1, androidx.recyclerview.widget.RecyclerView.B arg2, androidx.recyclerview.widget.RecyclerView.l.b arg3, androidx.recyclerview.widget.RecyclerView.l.b arg4);

        public abstract boolean c(androidx.recyclerview.widget.RecyclerView.B arg1, androidx.recyclerview.widget.RecyclerView.l.b arg2, androidx.recyclerview.widget.RecyclerView.l.b arg3);

        public abstract boolean d(androidx.recyclerview.widget.RecyclerView.B arg1, androidx.recyclerview.widget.RecyclerView.l.b arg2, androidx.recyclerview.widget.RecyclerView.l.b arg3);

        static int e(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
            int v = recyclerView$B0.j;
            if(recyclerView$B0.t()) {
                return 4;
            }
            if((v & 4) == 0) {
                int v1 = recyclerView$B0.n();
                int v2 = recyclerView$B0.j();
                return v1 == -1 || v2 == -1 || v1 == v2 ? v & 14 : v & 14 | 0x800;
            }
            return v & 14;
        }

        public abstract boolean f(androidx.recyclerview.widget.RecyclerView.B arg1);

        public boolean g(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, List list0) {
            return this.f(recyclerView$B0);
        }

        public final void h(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
            androidx.recyclerview.widget.RecyclerView.l.a recyclerView$l$a0 = this.a;
            if(recyclerView$l$a0 != null) {
                recyclerView$l$a0.a(recyclerView$B0);
            }
        }

        public final void i() {
            if(this.b.size() <= 0) {
                this.b.clear();
                return;
            }
            E.a(this.b.get(0));
            throw null;
        }

        public abstract void j(androidx.recyclerview.widget.RecyclerView.B arg1);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public long m() {
            return this.f;
        }

        public long n() {
            return this.e;
        }

        public long o() {
            return this.d;
        }

        public abstract boolean p();

        public androidx.recyclerview.widget.RecyclerView.l.b q() {
            return new androidx.recyclerview.widget.RecyclerView.l.b();
        }

        public void r(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
        }

        public androidx.recyclerview.widget.RecyclerView.l.b s(y recyclerView$y0, androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
            return this.q().a(recyclerView$B0);
        }

        public androidx.recyclerview.widget.RecyclerView.l.b t(y recyclerView$y0, androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, int v, List list0) {
            return this.q().a(recyclerView$B0);
        }

        public abstract void u();

        void v(androidx.recyclerview.widget.RecyclerView.l.a recyclerView$l$a0) {
            this.a = recyclerView$l$a0;
        }
    }

    class m implements androidx.recyclerview.widget.RecyclerView.l.a {
        final RecyclerView a;

        @Override  // androidx.recyclerview.widget.RecyclerView$l$a
        public void a(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
            recyclerView$B0.G(true);
            if(recyclerView$B0.h != null && recyclerView$B0.i == null) {
                recyclerView$B0.h = null;
            }
            recyclerView$B0.i = null;
            if(!recyclerView$B0.I() && !RecyclerView.this.W0(recyclerView$B0.a) && recyclerView$B0.x()) {
                RecyclerView.this.removeDetachedView(recyclerView$B0.a, false);
            }
        }
    }

    public static abstract class n {
        public void d(Rect rect0, int v, RecyclerView recyclerView0) {
            rect0.set(0, 0, 0, 0);
        }

        public void e(Rect rect0, View view0, RecyclerView recyclerView0, y recyclerView$y0) {
            this.d(rect0, ((p)view0.getLayoutParams()).a(), recyclerView0);
        }

        public void f(Canvas canvas0, RecyclerView recyclerView0) {
        }

        public void g(Canvas canvas0, RecyclerView recyclerView0, y recyclerView$y0) {
        }

        public void h(Canvas canvas0, RecyclerView recyclerView0) {
        }

        public void i(Canvas canvas0, RecyclerView recyclerView0, y recyclerView$y0) {
        }
    }

    public static abstract class o {
        class androidx.recyclerview.widget.RecyclerView.o.a implements androidx.recyclerview.widget.p.b {
            final o a;

            @Override  // androidx.recyclerview.widget.p$b
            public View a(int v) {
                return o.this.N(v);
            }

            @Override  // androidx.recyclerview.widget.p$b
            public int b(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return o.this.V(view0) - recyclerView$p0.leftMargin;
            }

            @Override  // androidx.recyclerview.widget.p$b
            public int c() {
                return o.this.i0();
            }

            @Override  // androidx.recyclerview.widget.p$b
            public int d() {
                int v = o.this.j0();
                return o.this.s0() - v;
            }

            @Override  // androidx.recyclerview.widget.p$b
            public int e(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return o.this.Y(view0) + recyclerView$p0.rightMargin;
            }
        }

        class androidx.recyclerview.widget.RecyclerView.o.b implements androidx.recyclerview.widget.p.b {
            final o a;

            @Override  // androidx.recyclerview.widget.p$b
            public View a(int v) {
                return o.this.N(v);
            }

            @Override  // androidx.recyclerview.widget.p$b
            public int b(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return o.this.Z(view0) - recyclerView$p0.topMargin;
            }

            @Override  // androidx.recyclerview.widget.p$b
            public int c() {
                return o.this.k0();
            }

            @Override  // androidx.recyclerview.widget.p$b
            public int d() {
                int v = o.this.h0();
                return o.this.b0() - v;
            }

            @Override  // androidx.recyclerview.widget.p$b
            public int e(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return o.this.T(view0) + recyclerView$p0.bottomMargin;
            }
        }

        public interface androidx.recyclerview.widget.RecyclerView.o.c {
            void a(int arg1, int arg2);
        }

        public static class androidx.recyclerview.widget.RecyclerView.o.d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;

        }

        androidx.recyclerview.widget.b a;
        RecyclerView b;
        private final androidx.recyclerview.widget.p.b c;
        private final androidx.recyclerview.widget.p.b d;
        androidx.recyclerview.widget.p e;
        androidx.recyclerview.widget.p f;
        x g;
        boolean h;
        boolean i;
        boolean j;
        private boolean k;
        private boolean l;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        public o() {
            androidx.recyclerview.widget.RecyclerView.o.a recyclerView$o$a0 = new androidx.recyclerview.widget.RecyclerView.o.a(this);
            this.c = recyclerView$o$a0;
            androidx.recyclerview.widget.RecyclerView.o.b recyclerView$o$b0 = new androidx.recyclerview.widget.RecyclerView.o.b(this);
            this.d = recyclerView$o$b0;
            this.e = new androidx.recyclerview.widget.p(recyclerView$o$a0);
            this.f = new androidx.recyclerview.widget.p(recyclerView$o$b0);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }

        public abstract int A(y arg1);

        private static boolean A0(int v, int v1, int v2) {
            int v3 = View.MeasureSpec.getMode(v1);
            int v4 = View.MeasureSpec.getSize(v1);
            if(v2 > 0 && v != v2) {
                return false;
            }
            switch(v3) {
                case 0x80000000: {
                    return v4 >= v;
                }
                case 0: {
                    return true;
                }
                default: {
                    return v3 == 0x40000000 ? v4 == v : false;
                }
            }
        }

        public abstract int A1(int arg1, u arg2, y arg3);

        public void B(u recyclerView$u0) {
            for(int v = this.O() - 1; v >= 0; --v) {
                this.z1(recyclerView$u0, v, this.N(v));
            }
        }

        public boolean B0() {
            return this.g != null && this.g.h();
        }

        public abstract void B1(int arg1);

        public void C(int v) {
            this.D(v, this.N(v));
        }

        // 去混淆评级： 低(20)
        public boolean C0(View view0, boolean z, boolean z1) {
            boolean z2 = this.e.b(view0, 0x6003) && this.f.b(view0, 0x6003);
            return z ? z2 : !z2;
        }

        public abstract int C1(int arg1, u arg2, y arg3);

        private void D(int v, View view0) {
            this.a.d(v);
        }

        public void D0(View view0, int v, int v1, int v2, int v3) {
            p recyclerView$p0 = (p)view0.getLayoutParams();
            view0.layout(v + recyclerView$p0.b.left + recyclerView$p0.leftMargin, v1 + recyclerView$p0.b.top + recyclerView$p0.topMargin, v2 - recyclerView$p0.b.right - recyclerView$p0.rightMargin, v3 - recyclerView$p0.b.bottom - recyclerView$p0.bottomMargin);
        }

        void D1(RecyclerView recyclerView0) {
            this.E1(View.MeasureSpec.makeMeasureSpec(recyclerView0.getWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(recyclerView0.getHeight(), 0x40000000));
        }

        void E(RecyclerView recyclerView0) {
            this.i = true;
            this.K0(recyclerView0);
        }

        public void E0(View view0, int v, int v1) {
            p recyclerView$p0 = (p)view0.getLayoutParams();
            Rect rect0 = this.b.k0(view0);
            int v2 = v + (rect0.left + rect0.right);
            int v3 = v1 + (rect0.top + rect0.bottom);
            int v4 = o.P(this.s0(), this.t0(), this.i0() + this.j0() + recyclerView$p0.leftMargin + recyclerView$p0.rightMargin + v2, recyclerView$p0.width, this.p());
            int v5 = o.P(this.b0(), this.c0(), this.k0() + this.h0() + recyclerView$p0.topMargin + recyclerView$p0.bottomMargin + v3, recyclerView$p0.height, this.q());
            if(this.J1(view0, v4, v5, recyclerView$p0)) {
                view0.measure(v4, v5);
            }
        }

        void E1(int v, int v1) {
            this.q = View.MeasureSpec.getSize(v);
            int v2 = View.MeasureSpec.getMode(v);
            this.o = v2;
            if(v2 == 0 && !RecyclerView.D0) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(v1);
            int v3 = View.MeasureSpec.getMode(v1);
            this.p = v3;
            if(v3 == 0 && !RecyclerView.D0) {
                this.r = 0;
            }
        }

        void F(RecyclerView recyclerView0, u recyclerView$u0) {
            this.i = false;
            this.M0(recyclerView0, recyclerView$u0);
        }

        public void F0(int v, int v1) {
            View view0 = this.N(v);
            if(view0 == null) {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + v + this.b.toString());
            }
            this.C(v);
            this.m(view0, v1);
        }

        public void F1(int v, int v1) {
            this.b.setMeasuredDimension(v, v1);
        }

        public View G(View view0) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 == null) {
                return null;
            }
            View view1 = recyclerView0.R(view0);
            if(view1 == null) {
                return null;
            }
            return this.a.n(view1) ? null : view1;
        }

        public void G0(int v) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                recyclerView0.A0(v);
            }
        }

        public void G1(Rect rect0, int v, int v1) {
            int v2 = rect0.width();
            int v3 = this.i0();
            int v4 = this.j0();
            int v5 = rect0.height();
            int v6 = this.k0();
            int v7 = this.h0();
            this.F1(o.s(v, v2 + v3 + v4, this.g0()), o.s(v1, v5 + v6 + v7, this.f0()));
        }

        public View H(int v) {
            int v1 = this.O();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = this.N(v2);
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
                if(recyclerView$B0 != null && recyclerView$B0.m() == v && !recyclerView$B0.J() && (this.b.l0.e() || !recyclerView$B0.v())) {
                    return view0;
                }
            }
            return null;
        }

        public void H0(int v) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                recyclerView0.B0(v);
            }
        }

        void H1(int v, int v1) {
            int v2 = this.O();
            if(v2 == 0) {
                this.b.w(v, v1);
                return;
            }
            int v3 = 0x80000000;
            int v4 = 0x7FFFFFFF;
            int v6 = 0x80000000;
            int v7 = 0x7FFFFFFF;
            for(int v5 = 0; v5 < v2; ++v5) {
                View view0 = this.N(v5);
                Rect rect0 = this.b.n;
                this.U(view0, rect0);
                int v8 = rect0.left;
                if(v8 < v7) {
                    v7 = v8;
                }
                int v9 = rect0.right;
                if(v9 > v3) {
                    v3 = v9;
                }
                int v10 = rect0.top;
                if(v10 < v4) {
                    v4 = v10;
                }
                int v11 = rect0.bottom;
                if(v11 > v6) {
                    v6 = v11;
                }
            }
            this.b.n.set(v7, v4, v3, v6);
            this.G1(this.b.n, v, v1);
        }

        public abstract p I();

        public void I0(g recyclerView$g0, g recyclerView$g1) {
        }

        void I1(RecyclerView recyclerView0) {
            if(recyclerView0 == null) {
                this.b = null;
                this.a = null;
                this.q = 0;
                this.r = 0;
            }
            else {
                this.b = recyclerView0;
                this.a = recyclerView0.j;
                this.q = recyclerView0.getWidth();
                this.r = recyclerView0.getHeight();
            }
            this.o = 0x40000000;
            this.p = 0x40000000;
        }

        public p J(Context context0, AttributeSet attributeSet0) {
            return new p(context0, attributeSet0);
        }

        public boolean J0(RecyclerView recyclerView0, ArrayList arrayList0, int v, int v1) [...] // Inlined contents

        // 去混淆评级： 低(40)
        boolean J1(View view0, int v, int v1, p recyclerView$p0) {
            return view0.isLayoutRequested() || !this.k || !o.A0(view0.getWidth(), v, recyclerView$p0.width) || !o.A0(view0.getHeight(), v1, recyclerView$p0.height);
        }

        public p K(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            if(viewGroup$LayoutParams0 instanceof p) {
                return new p(((p)viewGroup$LayoutParams0));
            }
            return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new p(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new p(viewGroup$LayoutParams0);
        }

        public void K0(RecyclerView recyclerView0) {
        }

        boolean K1() {
            return false;
        }

        public int L() [...] // Inlined contents

        public void L0(RecyclerView recyclerView0) {
        }

        // 去混淆评级： 低(30)
        boolean L1(View view0, int v, int v1, p recyclerView$p0) {
            return !this.k || !o.A0(view0.getMeasuredWidth(), v, recyclerView$p0.width) || !o.A0(view0.getMeasuredHeight(), v1, recyclerView$p0.height);
        }

        public int M(View view0) {
            return ((p)view0.getLayoutParams()).b.bottom;
        }

        public void M0(RecyclerView recyclerView0, u recyclerView$u0) {
        }

        public abstract void M1(RecyclerView arg1, y arg2, int arg3);

        public View N(int v) {
            return this.a == null ? null : this.a.f(v);
        }

        public abstract View N0(View arg1, int arg2, u arg3, y arg4);

        public void N1(x recyclerView$x0) {
            if(this.g != null && recyclerView$x0 != this.g && this.g.h()) {
                this.g.r();
            }
            this.g = recyclerView$x0;
            recyclerView$x0.q(this.b, this);
        }

        public int O() {
            return this.a == null ? 0 : this.a.g();
        }

        public void O0(AccessibilityEvent accessibilityEvent0) {
            this.P0(this.b.g, this.b.l0, accessibilityEvent0);
        }

        void O1() {
            x recyclerView$x0 = this.g;
            if(recyclerView$x0 != null) {
                recyclerView$x0.r();
            }
        }

        public static int P(int v, int v1, int v2, int v3, boolean z) {
            int v4 = Math.max(0, v - v2);
            if(z) {
                if(v3 < 0) {
                    return v3 == -1 && (v1 == 0x80000000 || v1 == 0x40000000) ? View.MeasureSpec.makeMeasureSpec(v4, v1) : 0;
                }
            }
            else if(v3 < 0) {
                switch(v3) {
                    case -2: {
                        return v1 == 0x80000000 || v1 == 0x40000000 ? View.MeasureSpec.makeMeasureSpec(v4, 0x80000000) : View.MeasureSpec.makeMeasureSpec(v4, 0);
                    }
                    case -1: {
                        return View.MeasureSpec.makeMeasureSpec(v4, v1);
                    }
                    default: {
                        return 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
        }

        public void P0(u recyclerView$u0, y recyclerView$y0, AccessibilityEvent accessibilityEvent0) {
            boolean z = true;
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null && accessibilityEvent0 != null) {
                if(!recyclerView0.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent0.setScrollable(z);
                g recyclerView$g0 = this.b.q;
                if(recyclerView$g0 != null) {
                    accessibilityEvent0.setItemCount(recyclerView$g0.e());
                }
            }
        }

        public boolean P1() {
            return false;
        }

        private int[] Q(View view0, Rect rect0) {
            int v = this.i0();
            int v1 = this.k0();
            int v2 = this.j0();
            int v3 = this.h0();
            int v4 = view0.getLeft() + rect0.left - view0.getScrollX();
            int v5 = view0.getTop() + rect0.top - view0.getScrollY();
            int v6 = v4 - v;
            int v7 = Math.min(0, v6);
            int v8 = v5 - v1;
            int v9 = Math.min(0, v8);
            int v10 = rect0.width() + v4 - (this.s0() - v2);
            int v11 = Math.max(0, v10);
            int v12 = Math.max(0, rect0.height() + v5 - (this.b0() - v3));
            if(this.d0() != 1) {
                if(v7 == 0) {
                    v7 = Math.min(v6, v11);
                }
                v11 = v7;
            }
            else if(v11 == 0) {
                v11 = Math.max(v7, v10);
            }
            if(v9 == 0) {
                v9 = Math.min(v8, v12);
            }
            return new int[]{v11, v9};
        }

        void Q0(z z0) {
            this.R0(this.b.g, this.b.l0, z0);
        }

        public boolean R() {
            return this.b != null && this.b.l;
        }

        public void R0(u recyclerView$u0, y recyclerView$y0, z z0) {
            if(this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                z0.a(0x2000);
                z0.F0(true);
            }
            if(this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                z0.a(0x1000);
                z0.F0(true);
            }
            z0.o0(C.z.e.b(this.o0(recyclerView$u0, recyclerView$y0), this.S(recyclerView$u0, recyclerView$y0), false, 0));
        }

        public int S(u recyclerView$u0, y recyclerView$y0) {
            return this.b == null || this.b.q == null || !this.p() ? 1 : this.b.q.e();
        }

        void S0(View view0, z z0) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
            if(recyclerView$B0 != null && !recyclerView$B0.v() && !this.a.n(recyclerView$B0.a)) {
                this.T0(this.b.g, this.b.l0, view0, z0);
            }
        }

        public int T(View view0) {
            return view0.getBottom() + this.M(view0);
        }

        public void T0(u recyclerView$u0, y recyclerView$y0, View view0, z z0) {
            int v = 0;
            int v1 = this.q() ? this.l0(view0) : 0;
            if(this.p()) {
                v = this.l0(view0);
            }
            z0.p0(f.a(v1, 1, v, 1, false, false));
        }

        public void U(View view0, Rect rect0) {
            RecyclerView.h0(view0, rect0);
        }

        public View U0(View view0, int v) [...] // Inlined contents

        public int V(View view0) {
            return view0.getLeft() - this.e0(view0);
        }

        public void V0(RecyclerView recyclerView0, int v, int v1) {
        }

        public int W(View view0) {
            Rect rect0 = ((p)view0.getLayoutParams()).b;
            return view0.getMeasuredHeight() + rect0.top + rect0.bottom;
        }

        public void W0(RecyclerView recyclerView0) {
        }

        public int X(View view0) {
            Rect rect0 = ((p)view0.getLayoutParams()).b;
            return view0.getMeasuredWidth() + rect0.left + rect0.right;
        }

        public void X0(RecyclerView recyclerView0, int v, int v1, int v2) {
        }

        public int Y(View view0) {
            return view0.getRight() + this.n0(view0);
        }

        public void Y0(RecyclerView recyclerView0, int v, int v1) {
        }

        public int Z(View view0) {
            return view0.getTop() - this.q0(view0);
        }

        public void Z0(RecyclerView recyclerView0, int v, int v1) {
        }

        public View a0() {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 == null) {
                return null;
            }
            View view0 = recyclerView0.getFocusedChild();
            return view0 == null || this.a.n(view0) ? null : view0;
        }

        public void a1(RecyclerView recyclerView0, int v, int v1, Object object0) {
        }

        public int b0() {
            return this.r;
        }

        public abstract void b1(u arg1, y arg2);

        public int c0() {
            return this.p;
        }

        public void c1(y recyclerView$y0) {
        }

        public int d0() {
            return Y.z(this.b);
        }

        public void d1(u recyclerView$u0, y recyclerView$y0, int v, int v1) {
            this.b.w(v, v1);
        }

        public int e() {
            g recyclerView$g0 = this.b == null ? null : this.b.getAdapter();
            return recyclerView$g0 == null ? 0 : recyclerView$g0.e();
        }

        public int e0(View view0) {
            return ((p)view0.getLayoutParams()).b.left;
        }

        // 去混淆评级： 低(20)
        public boolean e1(RecyclerView recyclerView0, View view0, View view1) {
            return this.B0() || recyclerView0.v0();
        }

        public int f0() {
            return Y.A(this.b);
        }

        public boolean f1(RecyclerView recyclerView0, y recyclerView$y0, View view0, View view1) {
            return this.e1(recyclerView0, view0, view1);
        }

        public void g(View view0) {
            this.h(view0, -1);
        }

        public int g0() {
            return Y.B(this.b);
        }

        public void g1(Parcelable parcelable0) {
        }

        public void h(View view0, int v) {
            this.k(view0, v, true);
        }

        public int h0() {
            return this.b == null ? 0 : this.b.getPaddingBottom();
        }

        public Parcelable h1() {
            return null;
        }

        public void i(View view0) {
            this.j(view0, -1);
        }

        public int i0() {
            return this.b == null ? 0 : this.b.getPaddingLeft();
        }

        public void i1(int v) {
        }

        public void j(View view0, int v) {
            this.k(view0, v, false);
        }

        public int j0() {
            return this.b == null ? 0 : this.b.getPaddingRight();
        }

        void j1(x recyclerView$x0) {
            if(this.g == recyclerView$x0) {
                this.g = null;
            }
        }

        private void k(View view0, int v, boolean z) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
            if(z || recyclerView$B0.v()) {
                this.b.k.b(recyclerView$B0);
            }
            else {
                this.b.k.p(recyclerView$B0);
            }
            p recyclerView$p0 = (p)view0.getLayoutParams();
            if(recyclerView$B0.L() || recyclerView$B0.w()) {
                if(recyclerView$B0.w()) {
                    recyclerView$B0.K();
                }
                else {
                    recyclerView$B0.e();
                }
                this.a.c(view0, v, view0.getLayoutParams(), false);
            }
            else if(view0.getParent() == this.b) {
                int v1 = this.a.m(view0);
                if(v == -1) {
                    v = this.a.g();
                }
                if(v1 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view0) + this.b.P());
                }
                if(v1 != v) {
                    this.b.r.F0(v1, v);
                }
            }
            else {
                this.a.a(view0, v, false);
                recyclerView$p0.c = true;
                if(this.g != null && this.g.h()) {
                    this.g.k(view0);
                }
            }
            if(recyclerView$p0.d) {
                recyclerView$B0.a.invalidate();
                recyclerView$p0.d = false;
            }
        }

        public int k0() {
            return this.b == null ? 0 : this.b.getPaddingTop();
        }

        boolean k1(int v, Bundle bundle0) {
            return this.l1(this.b.g, this.b.l0, v, bundle0);
        }

        public void l(String s) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                recyclerView0.o(s);
            }
        }

        public int l0(View view0) {
            return ((p)view0.getLayoutParams()).a();
        }

        public boolean l1(u recyclerView$u0, y recyclerView$y0, int v, Bundle bundle0) {
            int v2;
            int v1;
            int v3;
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 == null) {
                return false;
            }
            switch(v) {
                case 0x1000: {
                    v3 = recyclerView0.canScrollVertically(1) ? this.b0() - this.k0() - this.h0() : 0;
                    if(this.b.canScrollHorizontally(1)) {
                        v2 = v3;
                        v1 = this.s0() - this.i0() - this.j0();
                    }
                    else {
                        v2 = v3;
                        v1 = 0;
                    }
                    break;
                }
                case 0x2000: {
                    v3 = recyclerView0.canScrollVertically(-1) ? -(this.b0() - this.k0() - this.h0()) : 0;
                    if(this.b.canScrollHorizontally(-1)) {
                        v2 = v3;
                        v1 = -(this.s0() - this.i0() - this.j0());
                    }
                    else {
                        v2 = v3;
                        v1 = 0;
                    }
                    break;
                }
                default: {
                    v1 = 0;
                    v2 = 0;
                }
            }
            if(v2 == 0 && v1 == 0) {
                return false;
            }
            this.b.p1(v1, v2, null, 0x80000000, true);
            return true;
        }

        public void m(View view0, int v) {
            this.n(view0, v, ((p)view0.getLayoutParams()));
        }

        public static androidx.recyclerview.widget.RecyclerView.o.d m0(Context context0, AttributeSet attributeSet0, int v, int v1) {
            androidx.recyclerview.widget.RecyclerView.o.d recyclerView$o$d0 = new androidx.recyclerview.widget.RecyclerView.o.d();
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, f0.c.f, v, v1);
            recyclerView$o$d0.a = typedArray0.getInt(f0.c.g, 1);
            recyclerView$o$d0.b = typedArray0.getInt(f0.c.q, 1);
            recyclerView$o$d0.c = typedArray0.getBoolean(f0.c.p, false);
            recyclerView$o$d0.d = typedArray0.getBoolean(f0.c.r, false);
            typedArray0.recycle();
            return recyclerView$o$d0;
        }

        boolean m1(View view0, int v, Bundle bundle0) {
            return false;
        }

        public void n(View view0, int v, p recyclerView$p0) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
            if(recyclerView$B0.v()) {
                this.b.k.b(recyclerView$B0);
            }
            else {
                this.b.k.p(recyclerView$B0);
            }
            this.a.c(view0, v, recyclerView$p0, recyclerView$B0.v());
        }

        public int n0(View view0) {
            return ((p)view0.getLayoutParams()).b.right;
        }

        public boolean n1(u recyclerView$u0, y recyclerView$y0, View view0, int v, Bundle bundle0) [...] // Inlined contents

        public void o(View view0, Rect rect0) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 == null) {
                rect0.set(0, 0, 0, 0);
                return;
            }
            rect0.set(recyclerView0.k0(view0));
        }

        public int o0(u recyclerView$u0, y recyclerView$y0) {
            return this.b == null || this.b.q == null || !this.q() ? 1 : this.b.q.e();
        }

        public void o1(u recyclerView$u0) {
            for(int v = this.O() - 1; v >= 0; --v) {
                if(!RecyclerView.g0(this.N(v)).J()) {
                    this.r1(v, recyclerView$u0);
                }
            }
        }

        public abstract boolean p();

        public int p0(u recyclerView$u0, y recyclerView$y0) [...] // Inlined contents

        void p1(u recyclerView$u0) {
            int v = recyclerView$u0.j();
            for(int v1 = v - 1; v1 >= 0; --v1) {
                View view0 = recyclerView$u0.n(v1);
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
                if(!recyclerView$B0.J()) {
                    recyclerView$B0.G(false);
                    if(recyclerView$B0.x()) {
                        this.b.removeDetachedView(view0, false);
                    }
                    l recyclerView$l0 = this.b.Q;
                    if(recyclerView$l0 != null) {
                        recyclerView$l0.j(recyclerView$B0);
                    }
                    recyclerView$B0.G(true);
                    recyclerView$u0.y(view0);
                }
            }
            recyclerView$u0.e();
            if(v > 0) {
                this.b.invalidate();
            }
        }

        public abstract boolean q();

        public int q0(View view0) {
            return ((p)view0.getLayoutParams()).b.top;
        }

        public void q1(View view0, u recyclerView$u0) {
            this.t1(view0);
            recyclerView$u0.B(view0);
        }

        public boolean r(p recyclerView$p0) {
            return recyclerView$p0 != null;
        }

        public void r0(View view0, boolean z, Rect rect0) {
            if(z) {
                Rect rect1 = ((p)view0.getLayoutParams()).b;
                rect0.set(-rect1.left, -rect1.top, view0.getWidth() + rect1.right, view0.getHeight() + rect1.bottom);
            }
            else {
                rect0.set(0, 0, view0.getWidth(), view0.getHeight());
            }
            if(this.b != null) {
                Matrix matrix0 = view0.getMatrix();
                if(matrix0 != null && !matrix0.isIdentity()) {
                    RectF rectF0 = this.b.p;
                    rectF0.set(rect0);
                    matrix0.mapRect(rectF0);
                    rect0.set(((int)Math.floor(rectF0.left)), ((int)Math.floor(rectF0.top)), ((int)Math.ceil(rectF0.right)), ((int)Math.ceil(rectF0.bottom)));
                }
            }
            rect0.offset(view0.getLeft(), view0.getTop());
        }

        public void r1(int v, u recyclerView$u0) {
            View view0 = this.N(v);
            this.u1(v);
            recyclerView$u0.B(view0);
        }

        public static int s(int v, int v1, int v2) {
            int v3 = View.MeasureSpec.getMode(v);
            int v4 = View.MeasureSpec.getSize(v);
            switch(v3) {
                case 0x80000000: {
                    return Math.min(v4, Math.max(v1, v2));
                }
                case 0x40000000: {
                    return v4;
                }
                default: {
                    return Math.max(v1, v2);
                }
            }
        }

        public int s0() {
            return this.q;
        }

        public boolean s1(Runnable runnable0) {
            return this.b == null ? false : this.b.removeCallbacks(runnable0);
        }

        public void t(int v, int v1, y recyclerView$y0, androidx.recyclerview.widget.RecyclerView.o.c recyclerView$o$c0) {
        }

        public int t0() {
            return this.o;
        }

        public void t1(View view0) {
            this.a.p(view0);
        }

        public void u(int v, androidx.recyclerview.widget.RecyclerView.o.c recyclerView$o$c0) {
        }

        boolean u0() {
            int v = this.O();
            for(int v1 = 0; v1 < v; ++v1) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.N(v1).getLayoutParams();
                if(viewGroup$LayoutParams0.width < 0 && viewGroup$LayoutParams0.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void u1(int v) {
            if(this.N(v) != null) {
                this.a.q(v);
            }
        }

        public abstract int v(y arg1);

        public boolean v0() {
            return this.i;
        }

        public boolean v1(RecyclerView recyclerView0, View view0, Rect rect0, boolean z) {
            return this.w1(recyclerView0, view0, rect0, z, false);
        }

        public abstract int w(y arg1);

        public abstract boolean w0();

        public boolean w1(RecyclerView recyclerView0, View view0, Rect rect0, boolean z, boolean z1) {
            int[] arr_v = this.Q(view0, rect0);
            int v = arr_v[0];
            int v1 = arr_v[1];
            if(z1 && !this.x0(recyclerView0, v, v1) || v == 0 && v1 == 0) {
                return false;
            }
            if(z) {
                recyclerView0.scrollBy(v, v1);
                return true;
            }
            recyclerView0.m1(v, v1);
            return true;
        }

        public abstract int x(y arg1);

        private boolean x0(RecyclerView recyclerView0, int v, int v1) {
            View view0 = recyclerView0.getFocusedChild();
            if(view0 == null) {
                return false;
            }
            int v2 = this.i0();
            int v3 = this.k0();
            int v4 = this.j0();
            int v5 = this.h0();
            Rect rect0 = this.b.n;
            this.U(view0, rect0);
            return rect0.left - v < this.s0() - v4 && rect0.right - v > v2 && rect0.top - v1 < this.b0() - v5 && rect0.bottom - v1 > v3;
        }

        public void x1() {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                recyclerView0.requestLayout();
            }
        }

        public abstract int y(y arg1);

        public final boolean y0() {
            return this.l;
        }

        public void y1() {
            this.h = true;
        }

        public abstract int z(y arg1);

        public boolean z0(u recyclerView$u0, y recyclerView$y0) [...] // Inlined contents

        private void z1(u recyclerView$u0, int v, View view0) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
            if(recyclerView$B0.J()) {
                return;
            }
            if(recyclerView$B0.t() && !recyclerView$B0.v() && !this.b.q.i()) {
                this.u1(v);
                recyclerView$u0.C(recyclerView$B0);
                return;
            }
            this.C(v);
            recyclerView$u0.D(view0);
            this.b.k.k(recyclerView$B0);
        }
    }

    public static class p extends ViewGroup.MarginLayoutParams {
        androidx.recyclerview.widget.RecyclerView.B a;
        final Rect b;
        boolean c;
        boolean d;

        public p(int v, int v1) {
            super(v, v1);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(p recyclerView$p0) {
            super(recyclerView$p0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int a() {
            return this.a.m();
        }

        public boolean b() {
            return this.a.y();
        }

        public boolean c() {
            return this.a.v();
        }

        public boolean d() {
            return this.a.t();
        }
    }

    public static abstract class q {
        public abstract boolean a(int arg1, int arg2);
    }

    public interface r {
        void a(RecyclerView arg1, MotionEvent arg2);

        boolean b(RecyclerView arg1, MotionEvent arg2);

        void c(boolean arg1);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView0, int v) {
        }

        public abstract void b(RecyclerView arg1, int arg2, int arg3);
    }

    public static class t {
        static class androidx.recyclerview.widget.RecyclerView.t.a {
            final ArrayList a;
            int b;
            long c;
            long d;

            androidx.recyclerview.widget.RecyclerView.t.a() {
                this.a = new ArrayList();
                this.b = 5;
                this.c = 0L;
                this.d = 0L;
            }
        }

        SparseArray a;
        private int b;

        public t() {
            this.a = new SparseArray();
            this.b = 0;
        }

        void a() {
            ++this.b;
        }

        public void b() {
            for(int v = 0; v < this.a.size(); ++v) {
                ((androidx.recyclerview.widget.RecyclerView.t.a)this.a.valueAt(v)).a.clear();
            }
        }

        void c() {
            --this.b;
        }

        void d(int v, long v1) {
            androidx.recyclerview.widget.RecyclerView.t.a recyclerView$t$a0 = this.g(v);
            recyclerView$t$a0.d = this.j(recyclerView$t$a0.d, v1);
        }

        void e(int v, long v1) {
            androidx.recyclerview.widget.RecyclerView.t.a recyclerView$t$a0 = this.g(v);
            recyclerView$t$a0.c = this.j(recyclerView$t$a0.c, v1);
        }

        public androidx.recyclerview.widget.RecyclerView.B f(int v) {
            androidx.recyclerview.widget.RecyclerView.t.a recyclerView$t$a0 = (androidx.recyclerview.widget.RecyclerView.t.a)this.a.get(v);
            if(recyclerView$t$a0 != null && !recyclerView$t$a0.a.isEmpty()) {
                ArrayList arrayList0 = recyclerView$t$a0.a;
                for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                    if(!((androidx.recyclerview.widget.RecyclerView.B)arrayList0.get(v1)).r()) {
                        return (androidx.recyclerview.widget.RecyclerView.B)arrayList0.remove(v1);
                    }
                }
            }
            return null;
        }

        private androidx.recyclerview.widget.RecyclerView.t.a g(int v) {
            androidx.recyclerview.widget.RecyclerView.t.a recyclerView$t$a0 = (androidx.recyclerview.widget.RecyclerView.t.a)this.a.get(v);
            if(recyclerView$t$a0 == null) {
                recyclerView$t$a0 = new androidx.recyclerview.widget.RecyclerView.t.a();
                this.a.put(v, recyclerView$t$a0);
            }
            return recyclerView$t$a0;
        }

        void h(g recyclerView$g0, g recyclerView$g1, boolean z) {
            if(recyclerView$g0 != null) {
                this.c();
            }
            if(!z && this.b == 0) {
                this.b();
            }
            if(recyclerView$g1 != null) {
                this.a();
            }
        }

        public void i(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
            int v = recyclerView$B0.l();
            ArrayList arrayList0 = this.g(v).a;
            if(((androidx.recyclerview.widget.RecyclerView.t.a)this.a.get(v)).b <= arrayList0.size()) {
                return;
            }
            recyclerView$B0.D();
            arrayList0.add(recyclerView$B0);
        }

        long j(long v, long v1) {
            return v == 0L ? v1 : v / 4L * 3L + v1 / 4L;
        }

        boolean k(int v, long v1, long v2) {
            long v3 = this.g(v).d;
            return v3 == 0L || v1 + v3 < v2;
        }

        boolean l(int v, long v1, long v2) {
            long v3 = this.g(v).c;
            return v3 == 0L || v1 + v3 < v2;
        }
    }

    public final class u {
        final ArrayList a;
        ArrayList b;
        final ArrayList c;
        private final List d;
        private int e;
        int f;
        t g;
        final RecyclerView h;

        public u() {
            ArrayList arrayList0 = new ArrayList();
            this.a = arrayList0;
            this.b = null;
            this.c = new ArrayList();
            this.d = Collections.unmodifiableList(arrayList0);
            this.e = 2;
            this.f = 2;
        }

        void A(int v) {
            this.a(((androidx.recyclerview.widget.RecyclerView.B)this.c.get(v)), true);
            this.c.remove(v);
        }

        public void B(View view0) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
            if(recyclerView$B0.x()) {
                RecyclerView.this.removeDetachedView(view0, false);
            }
            if(recyclerView$B0.w()) {
                recyclerView$B0.K();
            }
            else if(recyclerView$B0.L()) {
                recyclerView$B0.e();
            }
            this.C(recyclerView$B0);
            if(RecyclerView.this.Q != null && !recyclerView$B0.u()) {
                RecyclerView.this.Q.j(recyclerView$B0);
            }
        }

        void C(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
            boolean z3;
            boolean z = false;
            boolean z1 = true;
            if(!recyclerView$B0.w() && recyclerView$B0.a.getParent() == null) {
                if(recyclerView$B0.x()) {
                    throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + recyclerView$B0 + RecyclerView.this.P());
                }
                if(recyclerView$B0.J()) {
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
                }
                boolean z2 = recyclerView$B0.h();
                if(recyclerView$B0.u()) {
                    if(this.f <= 0 || recyclerView$B0.p(0x20E)) {
                        z3 = false;
                    }
                    else {
                        int v = this.c.size();
                        if(v >= this.f && v > 0) {
                            this.A(0);
                            --v;
                        }
                        if(v > 0 && !RecyclerView.this.k0.d(recyclerView$B0.c)) {
                            int v1;
                            for(v1 = v - 1; v1 >= 0; --v1) {
                                int v2 = ((androidx.recyclerview.widget.RecyclerView.B)this.c.get(v1)).c;
                                if(!RecyclerView.this.k0.d(v2)) {
                                    break;
                                }
                            }
                            v = v1 + 1;
                        }
                        this.c.add(v, recyclerView$B0);
                        z3 = true;
                    }
                    if(z3) {
                        z1 = false;
                    }
                    else {
                        this.a(recyclerView$B0, true);
                    }
                    z = z3;
                }
                else {
                    z1 = false;
                }
                RecyclerView.this.k.q(recyclerView$B0);
                if(!z && !z1 && z2) {
                    recyclerView$B0.r = null;
                }
                return;
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Scrapped or attached views may not be recycled. isScrap:");
            stringBuilder0.append(recyclerView$B0.w());
            stringBuilder0.append(" isAttached:");
            if(recyclerView$B0.a.getParent() != null) {
                z = true;
            }
            stringBuilder0.append(z);
            stringBuilder0.append(RecyclerView.this.P());
            throw new IllegalArgumentException(stringBuilder0.toString());
        }

        void D(View view0) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
            if(!recyclerView$B0.p(12) && recyclerView$B0.y() && !RecyclerView.this.p(recyclerView$B0)) {
                if(this.b == null) {
                    this.b = new ArrayList();
                }
                recyclerView$B0.H(this, true);
                this.b.add(recyclerView$B0);
                return;
            }
            if(recyclerView$B0.t() && !recyclerView$B0.v() && !RecyclerView.this.q.i()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
            }
            recyclerView$B0.H(this, false);
            this.a.add(recyclerView$B0);
        }

        void E(t recyclerView$t0) {
            t recyclerView$t1 = this.g;
            if(recyclerView$t1 != null) {
                recyclerView$t1.c();
            }
            this.g = recyclerView$t0;
            if(recyclerView$t0 != null && RecyclerView.this.getAdapter() != null) {
                this.g.a();
            }
        }

        void F(androidx.recyclerview.widget.RecyclerView.z recyclerView$z0) {
        }

        public void G(int v) {
            this.e = v;
            this.K();
        }

        private boolean H(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, int v, int v1, long v2) {
            recyclerView$B0.r = RecyclerView.this;
            if(v2 != 0x7FFFFFFFFFFFFFFFL && !this.g.k(recyclerView$B0.l(), 0x153612A9F580L, v2)) {
                return false;
            }
            RecyclerView.this.q.c(recyclerView$B0, v);
            this.g.d(recyclerView$B0.l(), 4478092200L);
            this.b(recyclerView$B0);
            if(RecyclerView.this.l0.e()) {
                recyclerView$B0.g = v1;
            }
            return true;
        }

        androidx.recyclerview.widget.RecyclerView.B I(int v, boolean z, long v1) {
            p recyclerView$p0;
            boolean z3;
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B3;
            boolean z2;
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0;
            boolean z1 = true;
            if(v < 0 || v >= RecyclerView.this.l0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + v + "(" + v + "). Item count:" + RecyclerView.this.l0.b() + RecyclerView.this.P());
            }
            if(RecyclerView.this.l0.e()) {
                recyclerView$B0 = this.h(v);
                z2 = recyclerView$B0 == null ? false : true;
            }
            else {
                recyclerView$B0 = null;
                z2 = false;
            }
            if(recyclerView$B0 == null) {
                recyclerView$B0 = this.m(v, z);
                if(recyclerView$B0 != null) {
                    if(this.L(recyclerView$B0)) {
                        z2 = true;
                    }
                    else {
                        if(!z) {
                            recyclerView$B0.b(4);
                            if(recyclerView$B0.w()) {
                                RecyclerView.this.removeDetachedView(recyclerView$B0.a, false);
                                recyclerView$B0.K();
                            }
                            else if(recyclerView$B0.L()) {
                                recyclerView$B0.e();
                            }
                            this.C(recyclerView$B0);
                        }
                        recyclerView$B0 = null;
                    }
                }
            }
            if(recyclerView$B0 == null) {
                int v2 = RecyclerView.this.i.m(v);
                if(v2 < 0 || v2 >= RecyclerView.this.q.e()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + v + "(offset:" + v2 + ").state:" + RecyclerView.this.l0.b() + RecyclerView.this.P());
                }
                int v3 = RecyclerView.this.q.g(v2);
                if(RecyclerView.this.q.i()) {
                    recyclerView$B0 = this.l(RecyclerView.this.q.f(v2), v3, z);
                    if(recyclerView$B0 != null) {
                        recyclerView$B0.c = v2;
                        z2 = true;
                    }
                }
                if(recyclerView$B0 == null) {
                    androidx.recyclerview.widget.RecyclerView.B recyclerView$B1 = this.i().f(v3);
                    if(recyclerView$B1 != null) {
                        recyclerView$B1.D();
                        if(RecyclerView.C0) {
                            this.r(recyclerView$B1);
                        }
                    }
                    recyclerView$B0 = recyclerView$B1;
                }
                if(recyclerView$B0 == null) {
                    if(v1 != 0x7FFFFFFFFFFFFFFFL && !this.g.l(v3, 23332486600700L, v1)) {
                        return null;
                    }
                    androidx.recyclerview.widget.RecyclerView.B recyclerView$B2 = RecyclerView.this.q.d(RecyclerView.this, v3);
                    RecyclerView recyclerView0 = RecyclerView.V(recyclerView$B2.a);
                    if(recyclerView0 != null) {
                        recyclerView$B2.b = new WeakReference(recyclerView0);
                    }
                    this.g.e(v3, 952329400L);
                    recyclerView$B3 = recyclerView$B2;
                }
                else {
                    recyclerView$B3 = recyclerView$B0;
                }
            }
            else {
                recyclerView$B3 = recyclerView$B0;
            }
            if(z2 && !RecyclerView.this.l0.e() && recyclerView$B3.p(0x2000)) {
                recyclerView$B3.F(0, 0x2000);
                if(RecyclerView.this.l0.k) {
                    int v4 = l.e(recyclerView$B3);
                    l recyclerView$l0 = RecyclerView.this.Q;
                    List list0 = recyclerView$B3.o();
                    androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b0 = recyclerView$l0.t(RecyclerView.this.l0, recyclerView$B3, v4 | 0x1000, list0);
                    RecyclerView.this.S0(recyclerView$B3, recyclerView$l$b0);
                }
            }
            if(!RecyclerView.this.l0.e() || !recyclerView$B3.s()) {
                z3 = !recyclerView$B3.s() || recyclerView$B3.z() || recyclerView$B3.t() ? this.H(recyclerView$B3, RecyclerView.this.i.m(v), v, v1) : false;
            }
            else {
                recyclerView$B3.g = v;
                z3 = false;
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = recyclerView$B3.a.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                recyclerView$p0 = (p)RecyclerView.this.generateDefaultLayoutParams();
                recyclerView$B3.a.setLayoutParams(recyclerView$p0);
            }
            else if(RecyclerView.this.checkLayoutParams(viewGroup$LayoutParams0)) {
                recyclerView$p0 = (p)viewGroup$LayoutParams0;
            }
            else {
                recyclerView$p0 = (p)RecyclerView.this.generateLayoutParams(viewGroup$LayoutParams0);
                recyclerView$B3.a.setLayoutParams(recyclerView$p0);
            }
            recyclerView$p0.a = recyclerView$B3;
            if(!z2 || !z3) {
                z1 = false;
            }
            recyclerView$p0.d = z1;
            return recyclerView$B3;
        }

        void J(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
            if(recyclerView$B0.o) {
                this.b.remove(recyclerView$B0);
            }
            else {
                this.a.remove(recyclerView$B0);
            }
            recyclerView$B0.n = null;
            recyclerView$B0.o = false;
            recyclerView$B0.e();
        }

        void K() {
            o recyclerView$o0 = RecyclerView.this.r;
            this.f = this.e + (recyclerView$o0 == null ? 0 : recyclerView$o0.m);
            for(int v = this.c.size() - 1; v >= 0 && this.c.size() > this.f; --v) {
                this.A(v);
            }
        }

        boolean L(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
            if(recyclerView$B0.v()) {
                return RecyclerView.this.l0.e();
            }
            if(recyclerView$B0.c < 0 || recyclerView$B0.c >= RecyclerView.this.q.e()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + recyclerView$B0 + RecyclerView.this.P());
            }
            return RecyclerView.this.l0.e() || RecyclerView.this.q.g(recyclerView$B0.c) == recyclerView$B0.l() ? !RecyclerView.this.q.i() || recyclerView$B0.k() == RecyclerView.this.q.f(recyclerView$B0.c) : false;
        }

        void M(int v, int v1) {
            for(int v2 = this.c.size() - 1; v2 >= 0; --v2) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = (androidx.recyclerview.widget.RecyclerView.B)this.c.get(v2);
                if(recyclerView$B0 != null && (recyclerView$B0.c >= v && recyclerView$B0.c < v1 + v)) {
                    recyclerView$B0.b(2);
                    this.A(v2);
                }
            }
        }

        void a(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, boolean z) {
            RecyclerView.r(recyclerView$B0);
            View view0 = recyclerView$B0.a;
            androidx.recyclerview.widget.l l0 = RecyclerView.this.s0;
            if(l0 != null) {
                androidx.core.view.a a0 = l0.n();
                Y.o0(view0, (a0 instanceof androidx.recyclerview.widget.l.a ? ((androidx.recyclerview.widget.l.a)a0).n(view0) : null));
            }
            if(z) {
                this.g(recyclerView$B0);
            }
            recyclerView$B0.r = null;
            this.i().i(recyclerView$B0);
        }

        private void b(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
            if(RecyclerView.this.u0()) {
                View view0 = recyclerView$B0.a;
                if(Y.x(view0) == 0) {
                    Y.x0(view0, 1);
                }
                androidx.recyclerview.widget.l l0 = RecyclerView.this.s0;
                if(l0 == null) {
                    return;
                }
                androidx.core.view.a a0 = l0.n();
                if(a0 instanceof androidx.recyclerview.widget.l.a) {
                    ((androidx.recyclerview.widget.l.a)a0).o(view0);
                }
                Y.o0(view0, a0);
            }
        }

        public void c() {
            this.a.clear();
            this.z();
        }

        void d() {
            int v = this.c.size();
            for(int v2 = 0; v2 < v; ++v2) {
                ((androidx.recyclerview.widget.RecyclerView.B)this.c.get(v2)).c();
            }
            int v3 = this.a.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                ((androidx.recyclerview.widget.RecyclerView.B)this.a.get(v4)).c();
            }
            ArrayList arrayList0 = this.b;
            if(arrayList0 != null) {
                int v5 = arrayList0.size();
                for(int v1 = 0; v1 < v5; ++v1) {
                    ((androidx.recyclerview.widget.RecyclerView.B)this.b.get(v1)).c();
                }
            }
        }

        void e() {
            this.a.clear();
            ArrayList arrayList0 = this.b;
            if(arrayList0 != null) {
                arrayList0.clear();
            }
        }

        public int f(int v) {
            if(v < 0 || v >= RecyclerView.this.l0.b()) {
                throw new IndexOutOfBoundsException("invalid position " + v + ". State item count is " + RecyclerView.this.l0.b() + RecyclerView.this.P());
            }
            return RecyclerView.this.l0.e() ? RecyclerView.this.i.m(v) : v;
        }

        void g(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
            RecyclerView.this.getClass();
            g recyclerView$g0 = RecyclerView.this.q;
            if(recyclerView$g0 != null) {
                recyclerView$g0.t(recyclerView$B0);
            }
            RecyclerView recyclerView0 = RecyclerView.this;
            if(recyclerView0.l0 != null) {
                recyclerView0.k.q(recyclerView$B0);
            }
        }

        androidx.recyclerview.widget.RecyclerView.B h(int v) {
            ArrayList arrayList0 = this.b;
            if(arrayList0 != null) {
                int v1 = arrayList0.size();
                if(v1 != 0) {
                    for(int v3 = 0; v3 < v1; ++v3) {
                        androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = (androidx.recyclerview.widget.RecyclerView.B)this.b.get(v3);
                        if(!recyclerView$B0.L() && recyclerView$B0.m() == v) {
                            recyclerView$B0.b(0x20);
                            return recyclerView$B0;
                        }
                    }
                    if(RecyclerView.this.q.i()) {
                        int v4 = RecyclerView.this.i.m(v);
                        if(v4 > 0 && v4 < RecyclerView.this.q.e()) {
                            long v5 = RecyclerView.this.q.f(v4);
                            for(int v2 = 0; v2 < v1; ++v2) {
                                androidx.recyclerview.widget.RecyclerView.B recyclerView$B1 = (androidx.recyclerview.widget.RecyclerView.B)this.b.get(v2);
                                if(!recyclerView$B1.L() && recyclerView$B1.k() == v5) {
                                    recyclerView$B1.b(0x20);
                                    return recyclerView$B1;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        t i() {
            if(this.g == null) {
                this.g = new t();
            }
            return this.g;
        }

        int j() {
            return this.a.size();
        }

        public List k() {
            return this.d;
        }

        androidx.recyclerview.widget.RecyclerView.B l(long v, int v1, boolean z) {
            for(int v2 = this.a.size() - 1; v2 >= 0; --v2) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = (androidx.recyclerview.widget.RecyclerView.B)this.a.get(v2);
                if(recyclerView$B0.k() == v && !recyclerView$B0.L()) {
                    if(v1 == recyclerView$B0.l()) {
                        recyclerView$B0.b(0x20);
                        if(recyclerView$B0.v() && !RecyclerView.this.l0.e()) {
                            recyclerView$B0.F(2, 14);
                        }
                        return recyclerView$B0;
                    }
                    if(!z) {
                        this.a.remove(v2);
                        RecyclerView.this.removeDetachedView(recyclerView$B0.a, false);
                        this.y(recyclerView$B0.a);
                    }
                }
            }
            for(int v3 = this.c.size() - 1; v3 >= 0; --v3) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B1 = (androidx.recyclerview.widget.RecyclerView.B)this.c.get(v3);
                if(recyclerView$B1.k() == v && !recyclerView$B1.r()) {
                    if(v1 == recyclerView$B1.l()) {
                        if(!z) {
                            this.c.remove(v3);
                        }
                        return recyclerView$B1;
                    }
                    if(!z) {
                        this.A(v3);
                        return null;
                    }
                }
            }
            return null;
        }

        androidx.recyclerview.widget.RecyclerView.B m(int v, boolean z) {
            int v1 = this.a.size();
            for(int v3 = 0; v3 < v1; ++v3) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = (androidx.recyclerview.widget.RecyclerView.B)this.a.get(v3);
                if(!recyclerView$B0.L() && recyclerView$B0.m() == v && !recyclerView$B0.t() && (RecyclerView.this.l0.h || !recyclerView$B0.v())) {
                    recyclerView$B0.b(0x20);
                    return recyclerView$B0;
                }
            }
            if(!z) {
                View view0 = RecyclerView.this.j.e(v);
                if(view0 != null) {
                    androidx.recyclerview.widget.RecyclerView.B recyclerView$B1 = RecyclerView.g0(view0);
                    RecyclerView.this.j.s(view0);
                    int v4 = RecyclerView.this.j.m(view0);
                    if(v4 == -1) {
                        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + recyclerView$B1 + RecyclerView.this.P());
                    }
                    RecyclerView.this.j.d(v4);
                    this.D(view0);
                    recyclerView$B1.b(0x2020);
                    return recyclerView$B1;
                }
            }
            int v5 = this.c.size();
            for(int v2 = 0; v2 < v5; ++v2) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B2 = (androidx.recyclerview.widget.RecyclerView.B)this.c.get(v2);
                if(!recyclerView$B2.t() && recyclerView$B2.m() == v && !recyclerView$B2.r()) {
                    if(!z) {
                        this.c.remove(v2);
                    }
                    return recyclerView$B2;
                }
            }
            return null;
        }

        View n(int v) {
            return ((androidx.recyclerview.widget.RecyclerView.B)this.a.get(v)).a;
        }

        public View o(int v) {
            return this.p(v, false);
        }

        View p(int v, boolean z) {
            return this.I(v, z, 0x7FFFFFFFFFFFFFFFL).a;
        }

        private void q(ViewGroup viewGroup0, boolean z) {
            for(int v = viewGroup0.getChildCount() - 1; v >= 0; --v) {
                View view0 = viewGroup0.getChildAt(v);
                if(view0 instanceof ViewGroup) {
                    this.q(((ViewGroup)view0), true);
                }
            }
            if(!z) {
                return;
            }
            if(viewGroup0.getVisibility() == 4) {
                viewGroup0.setVisibility(0);
                viewGroup0.setVisibility(4);
                return;
            }
            int v1 = viewGroup0.getVisibility();
            viewGroup0.setVisibility(4);
            viewGroup0.setVisibility(v1);
        }

        private void r(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
            View view0 = recyclerView$B0.a;
            if(view0 instanceof ViewGroup) {
                this.q(((ViewGroup)view0), false);
            }
        }

        void s() {
            int v = this.c.size();
            for(int v1 = 0; v1 < v; ++v1) {
                p recyclerView$p0 = (p)((androidx.recyclerview.widget.RecyclerView.B)this.c.get(v1)).a.getLayoutParams();
                if(recyclerView$p0 != null) {
                    recyclerView$p0.c = true;
                }
            }
        }

        void t() {
            int v = this.c.size();
            for(int v1 = 0; v1 < v; ++v1) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = (androidx.recyclerview.widget.RecyclerView.B)this.c.get(v1);
                if(recyclerView$B0 != null) {
                    recyclerView$B0.b(6);
                    recyclerView$B0.a(null);
                }
            }
            g recyclerView$g0 = RecyclerView.this.q;
            if(recyclerView$g0 == null || !recyclerView$g0.i()) {
                this.z();
            }
        }

        void u(int v, int v1) {
            int v2 = this.c.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = (androidx.recyclerview.widget.RecyclerView.B)this.c.get(v3);
                if(recyclerView$B0 != null && recyclerView$B0.c >= v) {
                    recyclerView$B0.A(v1, true);
                }
            }
        }

        void v(int v, int v1) {
            int v4;
            int v3;
            int v2;
            if(v < v1) {
                v2 = -1;
                v3 = v;
                v4 = v1;
            }
            else {
                v2 = 1;
                v4 = v;
                v3 = v1;
            }
            int v5 = this.c.size();
            for(int v6 = 0; v6 < v5; ++v6) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = (androidx.recyclerview.widget.RecyclerView.B)this.c.get(v6);
                if(recyclerView$B0 != null) {
                    int v7 = recyclerView$B0.c;
                    if(v7 >= v3 && v7 <= v4) {
                        if(v7 == v) {
                            recyclerView$B0.A(v1 - v, false);
                        }
                        else {
                            recyclerView$B0.A(v2, false);
                        }
                    }
                }
            }
        }

        void w(int v, int v1, boolean z) {
            for(int v2 = this.c.size() - 1; v2 >= 0; --v2) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = (androidx.recyclerview.widget.RecyclerView.B)this.c.get(v2);
                if(recyclerView$B0 != null) {
                    int v3 = recyclerView$B0.c;
                    if(v3 >= v + v1) {
                        recyclerView$B0.A(-v1, z);
                    }
                    else if(v3 >= v) {
                        recyclerView$B0.b(8);
                        this.A(v2);
                    }
                }
            }
        }

        void x(g recyclerView$g0, g recyclerView$g1, boolean z) {
            this.c();
            this.i().h(recyclerView$g0, recyclerView$g1, z);
        }

        void y(View view0) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
            recyclerView$B0.n = null;
            recyclerView$B0.o = false;
            recyclerView$B0.e();
            this.C(recyclerView$B0);
        }

        void z() {
            for(int v = this.c.size() - 1; v >= 0; --v) {
                this.A(v);
            }
            this.c.clear();
            RecyclerView.this.k0.b();
        }
    }

    public interface v {
    }

    class w extends i {
        final RecyclerView a;

        @Override  // androidx.recyclerview.widget.RecyclerView$i
        public void a() {
            RecyclerView.this.o(null);
            RecyclerView.this.l0.g = true;
            RecyclerView.this.Q0(true);
            if(!RecyclerView.this.i.p()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$i
        public void b(int v, int v1, Object object0) {
            RecyclerView.this.o(null);
            if(RecyclerView.this.i.r(v, v1, object0)) {
                this.c();
            }
        }

        void c() {
            if(RecyclerView.E0) {
                RecyclerView recyclerView0 = RecyclerView.this;
                if(recyclerView0.w && recyclerView0.v) {
                    Y.g0(recyclerView0, recyclerView0.m);
                    return;
                }
            }
            RecyclerView.this.E = true;
            RecyclerView.this.requestLayout();
        }
    }

    public static abstract class x {
        public static class androidx.recyclerview.widget.RecyclerView.x.a {
            private int a;
            private int b;
            private int c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;

            public androidx.recyclerview.widget.RecyclerView.x.a(int v, int v1) {
                this(v, v1, 0x80000000, null);
            }

            public androidx.recyclerview.widget.RecyclerView.x.a(int v, int v1, int v2, Interpolator interpolator0) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = v;
                this.b = v1;
                this.c = v2;
                this.e = interpolator0;
            }

            boolean a() {
                return this.d >= 0;
            }

            public void b(int v) {
                this.d = v;
            }

            void c(RecyclerView recyclerView0) {
                int v = this.d;
                if(v >= 0) {
                    this.d = -1;
                    recyclerView0.x0(v);
                    this.f = false;
                    return;
                }
                if(this.f) {
                    this.e();
                    recyclerView0.i0.f(this.a, this.b, this.c, this.e);
                    int v1 = this.g + 1;
                    this.g = v1;
                    if(v1 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                    return;
                }
                this.g = 0;
            }

            public void d(int v, int v1, int v2, Interpolator interpolator0) {
                this.a = v;
                this.b = v1;
                this.c = v2;
                this.e = interpolator0;
                this.f = true;
            }

            private void e() {
                if(this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if(this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        public interface androidx.recyclerview.widget.RecyclerView.x.b {
            PointF c(int arg1);
        }

        private int a;
        private RecyclerView b;
        private o c;
        private boolean d;
        private boolean e;
        private View f;
        private final androidx.recyclerview.widget.RecyclerView.x.a g;
        private boolean h;

        public x() {
            this.a = -1;
            this.g = new androidx.recyclerview.widget.RecyclerView.x.a(0, 0);
        }

        public PointF a(int v) {
            o recyclerView$o0 = this.e();
            if(recyclerView$o0 instanceof androidx.recyclerview.widget.RecyclerView.x.b) {
                return ((androidx.recyclerview.widget.RecyclerView.x.b)recyclerView$o0).c(v);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + androidx.recyclerview.widget.RecyclerView.x.b.class.getCanonicalName());
            return null;
        }

        public View b(int v) {
            return this.b.r.H(v);
        }

        public int c() {
            return this.b.r.O();
        }

        public int d(View view0) {
            return this.b.e0(view0);
        }

        public o e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public boolean g() {
            return this.d;
        }

        public boolean h() {
            return this.e;
        }

        protected void i(PointF pointF0) {
            float f = (float)Math.sqrt(pointF0.x * pointF0.x + pointF0.y * pointF0.y);
            pointF0.x /= f;
            pointF0.y /= f;
        }

        void j(int v, int v1) {
            RecyclerView recyclerView0 = this.b;
            if(this.a == -1 || recyclerView0 == null) {
                this.r();
            }
            if(this.d && this.f == null && this.c != null) {
                PointF pointF0 = this.a(this.a);
                if(pointF0 != null) {
                    float f = pointF0.x;
                    if(f != 0.0f || pointF0.y != 0.0f) {
                        recyclerView0.h1(((int)Math.signum(f)), ((int)Math.signum(pointF0.y)), null);
                    }
                }
            }
            this.d = false;
            View view0 = this.f;
            if(view0 != null) {
                if(this.d(view0) == this.a) {
                    this.o(this.f, recyclerView0.l0, this.g);
                    this.g.c(recyclerView0);
                    this.r();
                }
                else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if(this.e) {
                this.l(v, v1, recyclerView0.l0, this.g);
                boolean z = this.g.a();
                this.g.c(recyclerView0);
                if(z && this.e) {
                    this.d = true;
                    recyclerView0.i0.e();
                }
            }
        }

        protected void k(View view0) {
            if(this.d(view0) == this.f()) {
                this.f = view0;
            }
        }

        protected abstract void l(int arg1, int arg2, y arg3, androidx.recyclerview.widget.RecyclerView.x.a arg4);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View arg1, y arg2, androidx.recyclerview.widget.RecyclerView.x.a arg3);

        public void p(int v) {
            this.a = v;
        }

        void q(RecyclerView recyclerView0, o recyclerView$o0) {
            recyclerView0.i0.g();
            if(this.h) {
                Log.w("RecyclerView", "An instance of " + this.getClass().getSimpleName() + " was started more than once. Each instance of" + this.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.b = recyclerView0;
            this.c = recyclerView$o0;
            int v = this.a;
            if(v == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView0.l0.a = v;
            this.e = true;
            this.d = true;
            this.f = this.b(this.f());
            this.m();
            this.b.i0.e();
            this.h = true;
        }

        protected final void r() {
            if(!this.e) {
                return;
            }
            this.e = false;
            this.n();
            this.b.l0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            this.c.j1(this);
            this.c = null;
            this.b = null;
        }
    }

    public static class y {
        int a;
        private SparseArray b;
        int c;
        int d;
        int e;
        int f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        int m;
        long n;
        int o;
        int p;
        int q;

        public y() {
            this.a = -1;
            this.c = 0;
            this.d = 0;
            this.e = 1;
            this.f = 0;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
        }

        void a(int v) {
            if((this.e & v) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(v) + " but it is " + Integer.toBinaryString(this.e));
            }
        }

        // 去混淆评级： 低(20)
        public int b() {
            return this.h ? this.c - this.d : this.f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.h;
        }

        void f(g recyclerView$g0) {
            this.e = 1;
            this.f = recyclerView$g0.e();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        @Override
        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    public static abstract class androidx.recyclerview.widget.RecyclerView.z {
    }

    boolean A;
    private final androidx.recyclerview.widget.q.b A0;
    boolean B;
    private static final int[] B0;
    private boolean C;
    static final boolean C0;
    private int D;
    static final boolean D0;
    boolean E;
    static final boolean E0;
    private final AccessibilityManager F;
    static final boolean F0;
    private List G;
    private static final boolean G0;
    boolean H;
    private static final boolean H0;
    boolean I;
    private static final Class[] I0;
    private int J;
    static final Interpolator J0;
    private int K;
    private k L;
    private EdgeEffect M;
    private EdgeEffect N;
    private EdgeEffect O;
    private EdgeEffect P;
    l Q;
    private int R;
    private int S;
    private VelocityTracker T;
    private int U;
    private int V;
    private int W;
    private int a0;
    private int b0;
    private q c0;
    private final int d0;
    private final int e0;
    private final w f;
    private float f0;
    final u g;
    private float g0;
    private SavedState h;
    private boolean h0;
    androidx.recyclerview.widget.a i;
    final A i0;
    androidx.recyclerview.widget.b j;
    e j0;
    final androidx.recyclerview.widget.q k;
    androidx.recyclerview.widget.e.b k0;
    boolean l;
    final y l0;
    final Runnable m;
    private s m0;
    final Rect n;
    private List n0;
    private final Rect o;
    boolean o0;
    final RectF p;
    boolean p0;
    g q;
    private androidx.recyclerview.widget.RecyclerView.l.a q0;
    o r;
    boolean r0;
    final ArrayList s;
    androidx.recyclerview.widget.l s0;
    private final ArrayList t;
    private final int[] t0;
    private r u;
    private C u0;
    boolean v;
    private final int[] v0;
    boolean w;
    private final int[] w0;
    boolean x;
    final int[] x0;
    boolean y;
    final List y0;
    private int z;
    private Runnable z0;

    static {
        RecyclerView.B0 = new int[]{0x1010436};
        RecyclerView.C0 = false;
        RecyclerView.D0 = true;
        RecyclerView.E0 = true;
        RecyclerView.F0 = true;
        RecyclerView.G0 = false;
        RecyclerView.H0 = false;
        RecyclerView.I0 = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        RecyclerView.J0 = new c();
    }

    public RecyclerView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, f0.a.a);
    }

    public RecyclerView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.f = new w(this);
        this.g = new u(this);
        this.k = new androidx.recyclerview.widget.q();
        this.m = new androidx.recyclerview.widget.RecyclerView.a(this);
        this.n = new Rect();
        this.o = new Rect();
        this.p = new RectF();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.z = 0;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        this.L = new k();
        this.Q = new androidx.recyclerview.widget.c();
        this.R = 0;
        this.S = -1;
        this.f0 = 1.401298E-45f;
        this.g0 = 1.401298E-45f;
        this.h0 = true;
        this.i0 = new A(this);
        this.k0 = RecyclerView.F0 ? new androidx.recyclerview.widget.e.b() : null;
        this.l0 = new y();
        this.o0 = false;
        this.p0 = false;
        this.q0 = new m(this);
        this.r0 = false;
        this.t0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = new ArrayList();
        this.z0 = new b(this);
        this.A0 = new d(this);
        this.setScrollContainer(true);
        this.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        this.b0 = viewConfiguration0.getScaledTouchSlop();
        this.f0 = c0.f(viewConfiguration0, context0);
        this.g0 = c0.j(viewConfiguration0, context0);
        this.d0 = viewConfiguration0.getScaledMinimumFlingVelocity();
        this.e0 = viewConfiguration0.getScaledMaximumFlingVelocity();
        this.setWillNotDraw(this.getOverScrollMode() == 2);
        this.Q.v(this.q0);
        this.o0();
        this.q0();
        this.p0();
        if(Y.x(this) == 0) {
            Y.x0(this, 1);
        }
        this.F = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.setAccessibilityDelegateCompat(new androidx.recyclerview.widget.l(this));
        int[] arr_v = f0.c.f;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, arr_v, v, 0);
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 29) {
            this.saveAttributeDataForStyleable(context0, arr_v, attributeSet0, typedArray0, v, 0);
        }
        String s = typedArray0.getString(f0.c.o);
        if(typedArray0.getInt(f0.c.i, -1) == -1) {
            this.setDescendantFocusability(0x40000);
        }
        this.l = typedArray0.getBoolean(f0.c.h, true);
        boolean z = typedArray0.getBoolean(f0.c.j, false);
        this.x = z;
        if(z) {
            this.r0(((StateListDrawable)typedArray0.getDrawable(f0.c.m)), typedArray0.getDrawable(f0.c.n), ((StateListDrawable)typedArray0.getDrawable(f0.c.k)), typedArray0.getDrawable(f0.c.l));
        }
        typedArray0.recycle();
        this.v(context0, s, attributeSet0, v, 0);
        int[] arr_v1 = RecyclerView.B0;
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, arr_v1, v, 0);
        if(v1 >= 29) {
            this.saveAttributeDataForStyleable(context0, arr_v1, attributeSet0, typedArray1, v, 0);
        }
        boolean z1 = typedArray1.getBoolean(0, true);
        typedArray1.recycle();
        this.setNestedScrollingEnabled(z1);
    }

    private void A() {
        int v = this.D;
        this.D = 0;
        if(v != 0 && this.u0()) {
            AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain();
            accessibilityEvent0.setEventType(0x800);
            C.b.b(accessibilityEvent0, v);
            this.sendAccessibilityEventUnchecked(accessibilityEvent0);
        }
    }

    public void A0(int v) {
        int v1 = this.j.g();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.j.f(v2).offsetLeftAndRight(v);
        }
    }

    void B() {
        if(this.q == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if(this.r == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.l0.j = false;
        if(this.l0.e == 1) {
            this.C();
            this.r.D1(this);
            this.D();
        }
        else if(this.i.q() || this.r.s0() != this.getWidth() || this.r.b0() != this.getHeight()) {
            this.r.D1(this);
            this.D();
        }
        else {
            this.r.D1(this);
        }
        this.E();
    }

    public void B0(int v) {
        int v1 = this.j.g();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.j.f(v2).offsetTopAndBottom(v);
        }
    }

    private void C() {
        boolean z = true;
        this.l0.a(1);
        this.Q(this.l0);
        this.l0.j = false;
        this.r1();
        this.k.f();
        this.H0();
        this.P0();
        this.e1();
        y recyclerView$y0 = this.l0;
        if(!recyclerView$y0.k || !this.p0) {
            z = false;
        }
        recyclerView$y0.i = z;
        this.p0 = false;
        this.o0 = false;
        recyclerView$y0.h = recyclerView$y0.l;
        recyclerView$y0.f = this.q.e();
        this.U(this.t0);
        if(this.l0.k) {
            int v = this.j.g();
            for(int v1 = 0; v1 < v; ++v1) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(this.j.f(v1));
                if(!recyclerView$B0.J() && (!recyclerView$B0.t() || this.q.i())) {
                    l recyclerView$l0 = this.Q;
                    int v2 = l.e(recyclerView$B0);
                    List list0 = recyclerView$B0.o();
                    androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b0 = recyclerView$l0.t(this.l0, recyclerView$B0, v2, list0);
                    this.k.e(recyclerView$B0, recyclerView$l$b0);
                    if(this.l0.i && recyclerView$B0.y() && !recyclerView$B0.v() && !recyclerView$B0.J() && !recyclerView$B0.t()) {
                        long v3 = this.c0(recyclerView$B0);
                        this.k.c(v3, recyclerView$B0);
                    }
                }
            }
        }
        if(this.l0.l) {
            this.f1();
            boolean z1 = this.l0.g;
            this.l0.g = false;
            this.r.b1(this.g, this.l0);
            this.l0.g = z1;
            for(int v4 = 0; v4 < this.j.g(); ++v4) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B1 = RecyclerView.g0(this.j.f(v4));
                if(!recyclerView$B1.J() && !this.k.i(recyclerView$B1)) {
                    int v5 = l.e(recyclerView$B1);
                    boolean z2 = recyclerView$B1.p(0x2000);
                    if(!z2) {
                        v5 |= 0x1000;
                    }
                    l recyclerView$l1 = this.Q;
                    List list1 = recyclerView$B1.o();
                    androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b1 = recyclerView$l1.t(this.l0, recyclerView$B1, v5, list1);
                    if(z2) {
                        this.S0(recyclerView$B1, recyclerView$l$b1);
                    }
                    else {
                        this.k.a(recyclerView$B1, recyclerView$l$b1);
                    }
                }
            }
        }
        this.s();
        this.I0();
        this.t1(false);
        this.l0.e = 2;
    }

    void C0(int v, int v1) {
        int v2 = this.j.j();
        for(int v3 = 0; v3 < v2; ++v3) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(this.j.i(v3));
            if(recyclerView$B0 != null && !recyclerView$B0.J() && recyclerView$B0.c >= v) {
                recyclerView$B0.A(v1, false);
                this.l0.g = true;
            }
        }
        this.g.u(v, v1);
        this.requestLayout();
    }

    private void D() {
        this.r1();
        this.H0();
        this.l0.a(6);
        this.i.j();
        this.l0.f = this.q.e();
        this.l0.d = 0;
        this.l0.h = false;
        this.r.b1(this.g, this.l0);
        this.l0.g = false;
        this.h = null;
        this.l0.k = this.l0.k && this.Q != null;
        this.l0.e = 4;
        this.I0();
        this.t1(false);
    }

    void D0(int v, int v1) {
        int v5;
        int v4;
        int v3;
        int v2 = this.j.j();
        if(v < v1) {
            v3 = -1;
            v4 = v;
            v5 = v1;
        }
        else {
            v5 = v;
            v4 = v1;
            v3 = 1;
        }
        for(int v6 = 0; v6 < v2; ++v6) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(this.j.i(v6));
            if(recyclerView$B0 != null) {
                int v7 = recyclerView$B0.c;
                if(v7 >= v4 && v7 <= v5) {
                    if(v7 == v) {
                        recyclerView$B0.A(v1 - v, false);
                    }
                    else {
                        recyclerView$B0.A(v3, false);
                    }
                    this.l0.g = true;
                }
            }
        }
        this.g.v(v, v1);
        this.requestLayout();
    }

    private void E() {
        this.l0.a(4);
        this.r1();
        this.H0();
        this.l0.e = 1;
        if(this.l0.k) {
            for(int v = this.j.g() - 1; v >= 0; --v) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(this.j.f(v));
                if(!recyclerView$B0.J()) {
                    long v1 = this.c0(recyclerView$B0);
                    androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b0 = this.Q.s(this.l0, recyclerView$B0);
                    androidx.recyclerview.widget.RecyclerView.B recyclerView$B1 = this.k.g(v1);
                    if(recyclerView$B1 == null || recyclerView$B1.J()) {
                        this.k.d(recyclerView$B0, recyclerView$l$b0);
                    }
                    else {
                        boolean z = this.k.h(recyclerView$B1);
                        boolean z1 = this.k.h(recyclerView$B0);
                        if(!z || recyclerView$B1 != recyclerView$B0) {
                            androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b1 = this.k.n(recyclerView$B1);
                            this.k.d(recyclerView$B0, recyclerView$l$b0);
                            androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b2 = this.k.m(recyclerView$B0);
                            if(recyclerView$l$b1 == null) {
                                this.l0(v1, recyclerView$B0, recyclerView$B1);
                            }
                            else {
                                this.m(recyclerView$B1, recyclerView$B0, recyclerView$l$b1, recyclerView$l$b2, z, z1);
                            }
                        }
                        else {
                            this.k.d(recyclerView$B0, recyclerView$l$b0);
                        }
                    }
                }
            }
            this.k.o(this.A0);
        }
        this.r.p1(this.g);
        this.l0.c = this.l0.f;
        this.H = false;
        this.I = false;
        this.l0.k = false;
        this.l0.l = false;
        this.r.h = false;
        ArrayList arrayList0 = this.g.b;
        if(arrayList0 != null) {
            arrayList0.clear();
        }
        o recyclerView$o0 = this.r;
        if(recyclerView$o0.n) {
            recyclerView$o0.m = 0;
            recyclerView$o0.n = false;
            this.g.K();
        }
        this.r.c1(this.l0);
        this.I0();
        this.t1(false);
        this.k.f();
        if(this.x(this.t0[0], this.t0[1])) {
            this.I(0, 0);
        }
        this.T0();
        this.c1();
    }

    void E0(int v, int v1, boolean z) {
        int v2 = this.j.j();
        for(int v3 = 0; v3 < v2; ++v3) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(this.j.i(v3));
            if(recyclerView$B0 != null && !recyclerView$B0.J()) {
                int v4 = recyclerView$B0.c;
                if(v4 >= v + v1) {
                    recyclerView$B0.A(-v1, z);
                    this.l0.g = true;
                }
                else if(v4 >= v) {
                    recyclerView$B0.i(v - 1, -v1, z);
                    this.l0.g = true;
                }
            }
        }
        this.g.w(v, v1, z);
        this.requestLayout();
    }

    public boolean F(int v, int v1, int[] arr_v, int[] arr_v1, int v2) {
        return this.getScrollingChildHelper().d(v, v1, arr_v, arr_v1, v2);
    }

    public void F0(View view0) {
    }

    public final void G(int v, int v1, int v2, int v3, int[] arr_v, int v4, int[] arr_v1) {
        this.getScrollingChildHelper().e(v, v1, v2, v3, arr_v, v4, arr_v1);
    }

    public void G0(View view0) {
    }

    void H(int v) {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 != null) {
            recyclerView$o0.i1(v);
        }
        s recyclerView$s0 = this.m0;
        if(recyclerView$s0 != null) {
            recyclerView$s0.a(this, v);
        }
        List list0 = this.n0;
        if(list0 != null) {
            for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                ((s)this.n0.get(v1)).a(this, v);
            }
        }
    }

    void H0() {
        ++this.J;
    }

    void I(int v, int v1) {
        ++this.K;
        int v2 = this.getScrollX();
        int v3 = this.getScrollY();
        this.onScrollChanged(v2, v3, v2 - v, v3 - v1);
        s recyclerView$s0 = this.m0;
        if(recyclerView$s0 != null) {
            recyclerView$s0.b(this, v, v1);
        }
        List list0 = this.n0;
        if(list0 != null) {
            for(int v4 = list0.size() - 1; v4 >= 0; --v4) {
                ((s)this.n0.get(v4)).b(this, v, v1);
            }
        }
        --this.K;
    }

    void I0() {
        this.J0(true);
    }

    void J() {
        for(int v = this.y0.size() - 1; v >= 0; --v) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = (androidx.recyclerview.widget.RecyclerView.B)this.y0.get(v);
            if(recyclerView$B0.a.getParent() == this && !recyclerView$B0.J()) {
                int v1 = recyclerView$B0.q;
                if(v1 != -1) {
                    Y.x0(recyclerView$B0.a, v1);
                    recyclerView$B0.q = -1;
                }
            }
        }
        this.y0.clear();
    }

    void J0(boolean z) {
        int v = this.J - 1;
        this.J = v;
        if(v < 1) {
            this.J = 0;
            if(z) {
                this.A();
                this.J();
            }
        }
    }

    private boolean K(MotionEvent motionEvent0) {
        r recyclerView$r0 = this.u;
        if(recyclerView$r0 == null) {
            return motionEvent0.getAction() == 0 ? false : this.T(motionEvent0);
        }
        recyclerView$r0.a(this, motionEvent0);
        switch(motionEvent0.getAction()) {
            case 1: 
            case 3: {
                this.u = null;
                return true;
            }
            default: {
                return true;
            }
        }
    }

    private void K0(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.S) {
            int v1 = v == 0 ? 1 : 0;
            this.S = motionEvent0.getPointerId(v1);
            float f = motionEvent0.getX(v1);
            this.W = (int)(f + 0.5f);
            this.U = (int)(f + 0.5f);
            float f1 = motionEvent0.getY(v1);
            this.a0 = (int)(f1 + 0.5f);
            this.V = (int)(f1 + 0.5f);
        }
    }

    void L() {
        if(this.P != null) {
            return;
        }
        EdgeEffect edgeEffect0 = this.L.a(this, 3);
        this.P = edgeEffect0;
        if(this.l) {
            edgeEffect0.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public void L0(int v) {
    }

    void M() {
        if(this.M != null) {
            return;
        }
        EdgeEffect edgeEffect0 = this.L.a(this, 0);
        this.M = edgeEffect0;
        if(this.l) {
            edgeEffect0.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }

    public void M0(int v, int v1) {
    }

    void N() {
        if(this.O != null) {
            return;
        }
        EdgeEffect edgeEffect0 = this.L.a(this, 2);
        this.O = edgeEffect0;
        if(this.l) {
            edgeEffect0.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }

    void N0() {
        if(!this.r0 && this.v) {
            Y.g0(this, this.z0);
            this.r0 = true;
        }
    }

    void O() {
        if(this.N != null) {
            return;
        }
        EdgeEffect edgeEffect0 = this.L.a(this, 1);
        this.N = edgeEffect0;
        if(this.l) {
            edgeEffect0.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    private boolean O0() {
        return this.Q != null && this.r.P1();
    }

    String P() {
        return " " + super.toString() + ", adapter:" + this.q + ", layout:" + this.r + ", context:" + this.getContext();
    }

    private void P0() {
        if(this.H) {
            this.i.v();
            if(this.I) {
                this.r.W0(this);
            }
        }
        if(this.O0()) {
            this.i.t();
        }
        else {
            this.i.j();
        }
        boolean z = true;
        boolean z1 = this.o0 || this.p0;
        this.l0.k = this.y && this.Q != null && ((this.H || z1 || this.r.h) && (!this.H || this.q.i()));
        y recyclerView$y0 = this.l0;
        if(!recyclerView$y0.k || !z1 || this.H || !this.O0()) {
            z = false;
        }
        recyclerView$y0.l = z;
    }

    final void Q(y recyclerView$y0) {
        if(this.getScrollState() == 2) {
            OverScroller overScroller0 = this.i0.h;
            recyclerView$y0.p = overScroller0.getFinalX() - overScroller0.getCurrX();
            recyclerView$y0.q = overScroller0.getFinalY() - overScroller0.getCurrY();
            return;
        }
        recyclerView$y0.p = 0;
        recyclerView$y0.q = 0;
    }

    void Q0(boolean z) {
        this.I |= z;
        this.H = true;
        this.z0();
    }

    public View R(View view0) {
        ViewParent viewParent0;
        for(viewParent0 = view0.getParent(); viewParent0 != null && viewParent0 != this && viewParent0 instanceof View; viewParent0 = view0.getParent()) {
            view0 = (View)viewParent0;
        }
        return viewParent0 == this ? view0 : null;
    }

    private void R0(float f, float f1, float f2, float f3) {
        int v1;
        int v = 1;
        if(Float.compare(f1, 0.0f) < 0) {
            this.M();
            androidx.core.widget.d.c(this.M, -f1 / ((float)this.getWidth()), 1.0f - f2 / ((float)this.getHeight()));
            v1 = 1;
        }
        else if(f1 > 0.0f) {
            this.N();
            androidx.core.widget.d.c(this.O, f1 / ((float)this.getWidth()), f2 / ((float)this.getHeight()));
            v1 = 1;
        }
        else {
            v1 = 0;
        }
        if(f3 < 0.0f) {
            this.O();
            androidx.core.widget.d.c(this.N, -f3 / ((float)this.getHeight()), f / ((float)this.getWidth()));
        }
        else if(f3 > 0.0f) {
            this.L();
            androidx.core.widget.d.c(this.P, f3 / ((float)this.getHeight()), 1.0f - f / ((float)this.getWidth()));
        }
        else {
            v = v1;
        }
        if(v != 0 || f1 != 0.0f || f3 != 0.0f) {
            Y.f0(this);
        }
    }

    public androidx.recyclerview.widget.RecyclerView.B S(View view0) {
        View view1 = this.R(view0);
        return view1 == null ? null : this.f0(view1);
    }

    void S0(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b0) {
        recyclerView$B0.F(0, 0x2000);
        if(this.l0.i && recyclerView$B0.y() && !recyclerView$B0.v() && !recyclerView$B0.J()) {
            long v = this.c0(recyclerView$B0);
            this.k.c(v, recyclerView$B0);
        }
        this.k.e(recyclerView$B0, recyclerView$l$b0);
    }

    private boolean T(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        int v1 = this.t.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            r recyclerView$r0 = (r)this.t.get(v2);
            if(recyclerView$r0.b(this, motionEvent0) && v != 3) {
                this.u = recyclerView$r0;
                return true;
            }
        }
        return false;
    }

    private void T0() {
        if(this.h0 && this.q != null && this.hasFocus() && this.getDescendantFocusability() != 0x60000 && (this.getDescendantFocusability() != 0x20000 || !this.isFocused())) {
            if(!this.isFocused()) {
                View view0 = this.getFocusedChild();
                if(RecyclerView.H0 && (view0.getParent() == null || !view0.hasFocus())) {
                    if(this.j.g() == 0) {
                        this.requestFocus();
                        return;
                    }
                }
                else if(!this.j.n(view0)) {
                    return;
                }
            }
            View view1 = null;
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = Long.compare(this.l0.n, -1L) == 0 || !this.q.i() ? null : this.Y(this.l0.n);
            if(recyclerView$B0 != null && !this.j.n(recyclerView$B0.a) && recyclerView$B0.a.hasFocusable()) {
                view1 = recyclerView$B0.a;
            }
            else if(this.j.g() > 0) {
                view1 = this.W();
            }
            if(view1 != null) {
                int v = this.l0.o;
                if(((long)v) != -1L) {
                    View view2 = view1.findViewById(v);
                    if(view2 != null && view2.isFocusable()) {
                        view1 = view2;
                    }
                }
                view1.requestFocus();
            }
        }
    }

    private void U(int[] arr_v) {
        int v = this.j.g();
        if(v == 0) {
            arr_v[0] = -1;
            arr_v[1] = -1;
            return;
        }
        int v1 = 0x7FFFFFFF;
        int v2 = 0x80000000;
        for(int v3 = 0; v3 < v; ++v3) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(this.j.f(v3));
            if(!recyclerView$B0.J()) {
                int v4 = recyclerView$B0.m();
                if(v4 < v1) {
                    v1 = v4;
                }
                if(v4 > v2) {
                    v2 = v4;
                }
            }
        }
        arr_v[0] = v1;
        arr_v[1] = v2;
    }

    private void U0() {
        boolean z;
        EdgeEffect edgeEffect0 = this.M;
        if(edgeEffect0 == null) {
            z = false;
        }
        else {
            edgeEffect0.onRelease();
            z = this.M.isFinished();
        }
        EdgeEffect edgeEffect1 = this.N;
        if(edgeEffect1 != null) {
            edgeEffect1.onRelease();
            z |= this.N.isFinished();
        }
        EdgeEffect edgeEffect2 = this.O;
        if(edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.P;
        if(edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.P.isFinished();
        }
        if(z) {
            Y.f0(this);
        }
    }

    static RecyclerView V(View view0) {
        if(!(view0 instanceof ViewGroup)) {
            return null;
        }
        if(view0 instanceof RecyclerView) {
            return (RecyclerView)view0;
        }
        int v = ((ViewGroup)view0).getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            RecyclerView recyclerView0 = RecyclerView.V(((ViewGroup)view0).getChildAt(v1));
            if(recyclerView0 != null) {
                return recyclerView0;
            }
        }
        return null;
    }

    void V0() {
        l recyclerView$l0 = this.Q;
        if(recyclerView$l0 != null) {
            recyclerView$l0.k();
        }
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 != null) {
            recyclerView$o0.o1(this.g);
            this.r.p1(this.g);
        }
        this.g.c();
    }

    private View W() {
        int v = this.l0.m == -1 ? 0 : this.l0.m;
        int v1 = this.l0.b();
        for(int v2 = v; v2 < v1; ++v2) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = this.X(v2);
            if(recyclerView$B0 == null) {
                break;
            }
            if(recyclerView$B0.a.hasFocusable()) {
                return recyclerView$B0.a;
            }
        }
        for(int v3 = Math.min(v1, v) - 1; v3 >= 0; --v3) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B1 = this.X(v3);
            if(recyclerView$B1 == null) {
                return null;
            }
            if(recyclerView$B1.a.hasFocusable()) {
                return recyclerView$B1.a;
            }
        }
        return null;
    }

    boolean W0(View view0) {
        this.r1();
        boolean z = this.j.r(view0);
        if(z) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
            this.g.J(recyclerView$B0);
            this.g.C(recyclerView$B0);
        }
        this.t1(!z);
        return z;
    }

    public androidx.recyclerview.widget.RecyclerView.B X(int v) {
        androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = null;
        if(this.H) {
            return null;
        }
        int v1 = this.j.j();
        for(int v2 = 0; v2 < v1; ++v2) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B1 = RecyclerView.g0(this.j.i(v2));
            if(recyclerView$B1 != null && !recyclerView$B1.v() && this.b0(recyclerView$B1) == v) {
                if(this.j.n(recyclerView$B1.a)) {
                    recyclerView$B0 = recyclerView$B1;
                    continue;
                }
                return recyclerView$B1;
            }
        }
        return recyclerView$B0;
    }

    public void X0(n recyclerView$n0) {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 != null) {
            recyclerView$o0.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.s.remove(recyclerView$n0);
        if(this.s.isEmpty()) {
            this.setWillNotDraw(this.getOverScrollMode() == 2);
        }
        this.y0();
        this.requestLayout();
    }

    public androidx.recyclerview.widget.RecyclerView.B Y(long v) {
        androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = null;
        if(this.q != null && this.q.i()) {
            int v1 = this.j.j();
            for(int v2 = 0; v2 < v1; ++v2) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B1 = RecyclerView.g0(this.j.i(v2));
                if(recyclerView$B1 != null && !recyclerView$B1.v() && recyclerView$B1.k() == v) {
                    if(this.j.n(recyclerView$B1.a)) {
                        recyclerView$B0 = recyclerView$B1;
                        continue;
                    }
                    return recyclerView$B1;
                }
            }
        }
        return recyclerView$B0;
    }

    public void Y0(r recyclerView$r0) {
        this.t.remove(recyclerView$r0);
        if(this.u == recyclerView$r0) {
            this.u = null;
        }
    }

    androidx.recyclerview.widget.RecyclerView.B Z(int v, boolean z) {
        int v1 = this.j.j();
        androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = null;
        int v2 = 0;
        while(v2 < v1) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B1 = RecyclerView.g0(this.j.i(v2));
            if(recyclerView$B1 != null && !recyclerView$B1.v()) {
                if(z) {
                    if(recyclerView$B1.c == v) {
                        goto label_10;
                    }
                    else {
                        goto label_14;
                    }
                    goto label_9;
                }
                else {
                label_9:
                    if(recyclerView$B1.m() == v) {
                    label_10:
                        if(this.j.n(recyclerView$B1.a)) {
                            recyclerView$B0 = recyclerView$B1;
                            goto label_14;
                        }
                        return recyclerView$B1;
                    }
                }
            }
        label_14:
            ++v2;
        }
        return recyclerView$B0;
    }

    public void Z0(s recyclerView$s0) {
        List list0 = this.n0;
        if(list0 != null) {
            list0.remove(recyclerView$s0);
        }
    }

    void a(int v, int v1) {
        if(v < 0) {
            this.M();
            if(this.M.isFinished()) {
                this.M.onAbsorb(-v);
            }
        }
        else if(v > 0) {
            this.N();
            if(this.O.isFinished()) {
                this.O.onAbsorb(v);
            }
        }
        if(v1 < 0) {
            this.O();
            if(this.N.isFinished()) {
                this.N.onAbsorb(-v1);
            }
        }
        else if(v1 > 0) {
            this.L();
            if(this.P.isFinished()) {
                this.P.onAbsorb(v1);
            }
        }
        if(v != 0 || v1 != 0) {
            Y.f0(this);
        }
    }

    public boolean a0(int v, int v1) {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if(this.B) {
            return false;
        }
        boolean z = recyclerView$o0.p();
        boolean z1 = this.r.q();
        if(!z || Math.abs(v) < this.d0) {
            v = 0;
        }
        if(!z1 || Math.abs(v1) < this.d0) {
            v1 = 0;
        }
        if(v == 0 && v1 == 0) {
            return false;
        }
        if(!this.dispatchNestedPreFling(((float)v), ((float)v1))) {
            boolean z2 = z || z1;
            this.dispatchNestedFling(((float)v), ((float)v1), z2);
            if(this.c0 != null && this.c0.a(v, v1)) {
                return true;
            }
            if(z2) {
                if(z1) {
                    z |= 2;
                }
                this.s1(((int)z), 1);
                this.i0.c(Math.max(-this.e0, Math.min(v, this.e0)), Math.max(-this.e0, Math.min(v1, this.e0)));
                return true;
            }
        }
        return false;
    }

    void a1() {
        int v = this.j.g();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.j.f(v1);
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = this.f0(view0);
            if(recyclerView$B0 != null) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B1 = recyclerView$B0.i;
                if(recyclerView$B1 != null) {
                    View view1 = recyclerView$B1.a;
                    int v2 = view0.getLeft();
                    int v3 = view0.getTop();
                    if(v2 != view1.getLeft() || v3 != view1.getTop()) {
                        view1.layout(v2, v3, view1.getWidth() + v2, view1.getHeight() + v3);
                    }
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void addFocusables(ArrayList arrayList0, int v, int v1) {
        super.addFocusables(arrayList0, v, v1);
    }

    // 去混淆评级： 低(20)
    int b0(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
        return recyclerView$B0.p(0x20C) || !recyclerView$B0.s() ? -1 : this.i.e(recyclerView$B0.c);
    }

    private void b1(View view0, View view1) {
        View view2 = view1 == null ? view0 : view1;
        int v = view2.getWidth();
        int v1 = view2.getHeight();
        this.n.set(0, 0, v, v1);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view2.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof p && !((p)viewGroup$LayoutParams0).c) {
            this.n.left -= ((p)viewGroup$LayoutParams0).b.left;
            this.n.right += ((p)viewGroup$LayoutParams0).b.right;
            this.n.top -= ((p)viewGroup$LayoutParams0).b.top;
            this.n.bottom += ((p)viewGroup$LayoutParams0).b.bottom;
        }
        if(view1 != null) {
            this.offsetDescendantRectToMyCoords(view1, this.n);
            this.offsetRectIntoDescendantCoords(view0, this.n);
        }
        this.r.w1(this, view0, this.n, !this.y, view1 == null);
    }

    // 去混淆评级： 低(20)
    long c0(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
        return this.q.i() ? recyclerView$B0.k() : ((long)recyclerView$B0.c);
    }

    private void c1() {
        this.l0.n = -1L;
        this.l0.m = -1;
        this.l0.o = -1;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof p && this.r.r(((p)viewGroup$LayoutParams0));
    }

    @Override  // android.view.View
    public int computeHorizontalScrollExtent() {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            return 0;
        }
        return recyclerView$o0.p() ? this.r.v(this.l0) : 0;
    }

    @Override  // android.view.View
    public int computeHorizontalScrollOffset() {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            return 0;
        }
        return recyclerView$o0.p() ? this.r.w(this.l0) : 0;
    }

    @Override  // android.view.View
    public int computeHorizontalScrollRange() {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            return 0;
        }
        return recyclerView$o0.p() ? this.r.x(this.l0) : 0;
    }

    @Override  // android.view.View
    public int computeVerticalScrollExtent() {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            return 0;
        }
        return recyclerView$o0.q() ? this.r.y(this.l0) : 0;
    }

    @Override  // android.view.View
    public int computeVerticalScrollOffset() {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            return 0;
        }
        return recyclerView$o0.q() ? this.r.z(this.l0) : 0;
    }

    @Override  // android.view.View
    public int computeVerticalScrollRange() {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            return 0;
        }
        return recyclerView$o0.q() ? this.r.A(this.l0) : 0;
    }

    public int d0(View view0) {
        androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
        return recyclerView$B0 == null ? -1 : recyclerView$B0.j();
    }

    private void d1() {
        VelocityTracker velocityTracker0 = this.T;
        if(velocityTracker0 != null) {
            velocityTracker0.clear();
        }
        this.u1(0);
        this.U0();
    }

    @Override  // android.view.View
    public boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.getScrollingChildHelper().a(f, f1, z);
    }

    @Override  // android.view.View
    public boolean dispatchNestedPreFling(float f, float f1) {
        return this.getScrollingChildHelper().b(f, f1);
    }

    @Override  // android.view.View
    public boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1) {
        return this.getScrollingChildHelper().c(v, v1, arr_v, arr_v1);
    }

    @Override  // android.view.View
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v) {
        return this.getScrollingChildHelper().f(v, v1, v2, v3, arr_v);
    }

    @Override  // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        this.onPopulateAccessibilityEvent(accessibilityEvent0);
        return true;
    }

    @Override  // android.view.ViewGroup
    protected void dispatchRestoreInstanceState(SparseArray sparseArray0) {
        this.dispatchThawSelfOnly(sparseArray0);
    }

    @Override  // android.view.ViewGroup
    protected void dispatchSaveInstanceState(SparseArray sparseArray0) {
        this.dispatchFreezeSelfOnly(sparseArray0);
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        int v6;
        int v3;
        super.draw(canvas0);
        int v = this.s.size();
        int v1 = 0;
        for(int v2 = 0; true; ++v2) {
            v3 = 1;
            if(v2 >= v) {
                break;
            }
            ((n)this.s.get(v2)).i(canvas0, this, this.l0);
        }
        if(this.M == null || this.M.isFinished()) {
            v6 = 0;
        }
        else {
            int v4 = canvas0.save();
            int v5 = this.l ? this.getPaddingBottom() : 0;
            canvas0.rotate(270.0f);
            canvas0.translate(((float)(v5 - this.getHeight())), 0.0f);
            v6 = this.M == null || !this.M.draw(canvas0) ? 0 : 1;
            canvas0.restoreToCount(v4);
        }
        if(this.N != null && !this.N.isFinished()) {
            int v7 = canvas0.save();
            if(this.l) {
                canvas0.translate(((float)this.getPaddingLeft()), ((float)this.getPaddingTop()));
            }
            v6 |= (this.N == null || !this.N.draw(canvas0) ? 0 : 1);
            canvas0.restoreToCount(v7);
        }
        if(this.O != null && !this.O.isFinished()) {
            int v8 = canvas0.save();
            int v9 = this.getWidth();
            int v10 = this.l ? this.getPaddingTop() : 0;
            canvas0.rotate(90.0f);
            canvas0.translate(((float)(-v10)), ((float)(-v9)));
            v6 |= (this.O == null || !this.O.draw(canvas0) ? 0 : 1);
            canvas0.restoreToCount(v8);
        }
        if(this.P != null && !this.P.isFinished()) {
            int v11 = canvas0.save();
            canvas0.rotate(180.0f);
            if(this.l) {
                canvas0.translate(((float)(-this.getWidth() + this.getPaddingRight())), ((float)(-this.getHeight() + this.getPaddingBottom())));
            }
            else {
                canvas0.translate(((float)(-this.getWidth())), ((float)(-this.getHeight())));
            }
            if(this.P != null && this.P.draw(canvas0)) {
                v1 = 1;
            }
            v6 |= v1;
            canvas0.restoreToCount(v11);
        }
        if(v6 != 0 || this.Q == null || this.s.size() <= 0 || !this.Q.p()) {
            v3 = v6;
        }
        if(v3 != 0) {
            Y.f0(this);
        }
    }

    @Override  // android.view.ViewGroup
    public boolean drawChild(Canvas canvas0, View view0, long v) {
        return super.drawChild(canvas0, view0, v);
    }

    public int e0(View view0) {
        androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
        return recyclerView$B0 == null ? -1 : recyclerView$B0.m();
    }

    private void e1() {
        int v;
        androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = null;
        View view0 = !this.h0 || !this.hasFocus() || this.q == null ? null : this.getFocusedChild();
        if(view0 != null) {
            recyclerView$B0 = this.S(view0);
        }
        if(recyclerView$B0 == null) {
            this.c1();
            return;
        }
        this.l0.n = this.q.i() ? recyclerView$B0.k() : -1L;
        y recyclerView$y0 = this.l0;
        if(this.H) {
            v = -1;
        }
        else {
            v = recyclerView$B0.v() ? recyclerView$B0.d : recyclerView$B0.j();
        }
        recyclerView$y0.m = v;
        this.l0.o = this.i0(recyclerView$B0.a);
    }

    public androidx.recyclerview.widget.RecyclerView.B f0(View view0) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 != null && viewParent0 != this) {
            throw new IllegalArgumentException("View " + view0 + " is not a direct child of " + this);
        }
        return RecyclerView.g0(view0);
    }

    void f1() {
        int v = this.j.j();
        for(int v1 = 0; v1 < v; ++v1) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(this.j.i(v1));
            if(!recyclerView$B0.J()) {
                recyclerView$B0.E();
            }
        }
    }

    @Override  // android.view.ViewGroup
    public View focusSearch(View view0, int v) {
        View view1;
        int v3;
        int v1 = 1;
        boolean z = this.q != null && this.r != null && !this.v0() && !this.B;
        FocusFinder focusFinder0 = FocusFinder.getInstance();
        if(!z || v != 1 && v != 2) {
            View view2 = focusFinder0.findNextFocus(this, view0, v);
            if(view2 != null || !z) {
                view1 = view2;
            }
            else {
                this.u();
                if(this.R(view0) == null) {
                    return null;
                }
                this.r1();
                view1 = this.r.N0(view0, v, this.g, this.l0);
                this.t1(false);
            }
        }
        else {
            if(this.r.q()) {
                int v2 = v == 2 ? 130 : 33;
                v3 = focusFinder0.findNextFocus(this, view0, v2) == null ? 1 : 0;
                if(RecyclerView.G0) {
                    v = v2;
                }
            }
            else {
                v3 = 0;
            }
            if(v3 == 0 && this.r.p()) {
                int v4 = ((this.r.d0() == 1 ? 1 : 0) ^ (v == 2 ? 1 : 0)) == 0 ? 17 : 66;
                if(focusFinder0.findNextFocus(this, view0, v4) != null) {
                    v1 = 0;
                }
                if(RecyclerView.G0) {
                    v = v4;
                }
                v3 = v1;
            }
            if(v3 != 0) {
                this.u();
                if(this.R(view0) == null) {
                    return null;
                }
                this.r1();
                this.r.N0(view0, v, this.g, this.l0);
                this.t1(false);
            }
            view1 = focusFinder0.findNextFocus(this, view0, v);
        }
        if(view1 != null && !view1.hasFocusable()) {
            if(this.getFocusedChild() == null) {
                return super.focusSearch(view0, v);
            }
            this.b1(view1, null);
            return view0;
        }
        return this.w0(view0, view1, v) ? view1 : super.focusSearch(view0, v);
    }

    private void g(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
        View view0 = recyclerView$B0.a;
        boolean z = view0.getParent() == this;
        androidx.recyclerview.widget.RecyclerView.B recyclerView$B1 = this.f0(view0);
        this.g.J(recyclerView$B1);
        if(recyclerView$B0.x()) {
            this.j.c(view0, -1, view0.getLayoutParams(), true);
            return;
        }
        if(!z) {
            this.j.b(view0, true);
            return;
        }
        this.j.k(view0);
    }

    static androidx.recyclerview.widget.RecyclerView.B g0(View view0) {
        return view0 == null ? null : ((p)view0.getLayoutParams()).a;
    }

    boolean g1(int v, int v1, MotionEvent motionEvent0) {
        int v7;
        int v6;
        int v5;
        int v4;
        this.u();
        if(this.q == null) {
            v4 = 0;
            v5 = 0;
            v6 = 0;
            v7 = 0;
        }
        else {
            this.x0[0] = 0;
            this.x0[1] = 0;
            this.h1(v, v1, this.x0);
            int v2 = this.x0[0];
            int v3 = v1 - this.x0[1];
            v4 = this.x0[1];
            v5 = v2;
            v6 = v - v2;
            v7 = v3;
        }
        if(!this.s.isEmpty()) {
            this.invalidate();
        }
        this.x0[0] = 0;
        this.x0[1] = 0;
        this.G(v5, v4, v6, v7, this.v0, 0, this.x0);
        int v8 = this.x0[0];
        int v9 = this.x0[1];
        int v10 = this.W;
        int v11 = this.v0[0];
        this.W = v10 - v11;
        int v12 = this.a0;
        int v13 = this.v0[1];
        this.a0 = v12 - v13;
        this.w0[0] += v11;
        this.w0[1] += v13;
        if(this.getOverScrollMode() != 2) {
            if(motionEvent0 != null && !androidx.core.view.A.a(motionEvent0, 0x2002)) {
                this.R0(motionEvent0.getX(), ((float)(v6 - v8)), motionEvent0.getY(), ((float)(v7 - v9)));
            }
            this.t(v, v1);
        }
        if(v5 != 0 || v4 != 0) {
            this.I(v5, v4);
        }
        if(!this.awakenScrollBars()) {
            this.invalidate();
        }
        return v8 != 0 || v9 != 0 || v5 != 0 || v4 != 0;
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + this.P());
        }
        return recyclerView$o0.I();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + this.P());
        }
        return recyclerView$o0.J(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + this.P());
        }
        return recyclerView$o0.K(viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.q;
    }

    @Override  // android.view.View
    public int getBaseline() {
        return this.r == null ? super.getBaseline() : -1;
    }

    @Override  // android.view.ViewGroup
    protected int getChildDrawingOrder(int v, int v1) {
        return super.getChildDrawingOrder(v, v1);
    }

    @Override  // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.l;
    }

    public androidx.recyclerview.widget.l getCompatAccessibilityDelegate() {
        return this.s0;
    }

    public k getEdgeEffectFactory() {
        return this.L;
    }

    public l getItemAnimator() {
        return this.Q;
    }

    public int getItemDecorationCount() {
        return this.s.size();
    }

    public o getLayoutManager() {
        return this.r;
    }

    public int getMaxFlingVelocity() {
        return this.e0;
    }

    public int getMinFlingVelocity() {
        return this.d0;
    }

    // 去混淆评级： 低(20)
    long getNanoTime() [...] // 潜在的解密器

    public q getOnFlingListener() {
        return this.c0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.h0;
    }

    public t getRecycledViewPool() {
        return this.g.i();
    }

    public int getScrollState() {
        return this.R;
    }

    private C getScrollingChildHelper() {
        if(this.u0 == null) {
            this.u0 = new C(this);
        }
        return this.u0;
    }

    public void h(n recyclerView$n0) {
        this.i(recyclerView$n0, -1);
    }

    static void h0(View view0, Rect rect0) {
        p recyclerView$p0 = (p)view0.getLayoutParams();
        rect0.set(view0.getLeft() - recyclerView$p0.b.left - recyclerView$p0.leftMargin, view0.getTop() - recyclerView$p0.b.top - recyclerView$p0.topMargin, view0.getRight() + recyclerView$p0.b.right + recyclerView$p0.rightMargin, view0.getBottom() + recyclerView$p0.b.bottom + recyclerView$p0.bottomMargin);
    }

    void h1(int v, int v1, int[] arr_v) {
        this.r1();
        this.H0();
        androidx.core.os.u.a("RV Scroll");
        this.Q(this.l0);
        int v2 = v == 0 ? 0 : this.r.A1(v, this.g, this.l0);
        int v3 = v1 == 0 ? 0 : this.r.C1(v1, this.g, this.l0);
        androidx.core.os.u.b();
        this.a1();
        this.I0();
        this.t1(false);
        if(arr_v != null) {
            arr_v[0] = v2;
            arr_v[1] = v3;
        }
    }

    @Override  // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.getScrollingChildHelper().j();
    }

    public void i(n recyclerView$n0, int v) {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 != null) {
            recyclerView$o0.l("Cannot add item decoration during a scroll  or layout");
        }
        if(this.s.isEmpty()) {
            this.setWillNotDraw(false);
        }
        if(v < 0) {
            this.s.add(recyclerView$n0);
        }
        else {
            this.s.add(v, recyclerView$n0);
        }
        this.y0();
        this.requestLayout();
    }

    private int i0(View view0) {
        int v = view0.getId();
        while(!view0.isFocused() && view0 instanceof ViewGroup && view0.hasFocus()) {
            view0 = ((ViewGroup)view0).getFocusedChild();
            if(view0.getId() != -1) {
                v = view0.getId();
            }
        }
        return v;
    }

    public void i1(int v) {
        if(this.B) {
            return;
        }
        this.v1();
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        recyclerView$o0.B1(v);
        this.awakenScrollBars();
    }

    @Override  // android.view.View
    public boolean isAttachedToWindow() {
        return this.v;
    }

    @Override  // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.B;
    }

    @Override  // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.getScrollingChildHelper().l();
    }

    public void j(r recyclerView$r0) {
        this.t.add(recyclerView$r0);
    }

    private String j0(Context context0, String s) {
        if(s.charAt(0) == 46) {
            return "com.fmkorea.m.fmk" + s;
        }
        return s.contains(".") ? s : RecyclerView.class.getPackage().getName() + '.' + s;
    }

    private void j1(g recyclerView$g0, boolean z, boolean z1) {
        g recyclerView$g1 = this.q;
        if(recyclerView$g1 != null) {
            recyclerView$g1.w(this.f);
        }
        if(!z || z1) {
            this.V0();
        }
        this.i.v();
        g recyclerView$g2 = this.q;
        this.q = recyclerView$g0;
        if(recyclerView$g0 != null) {
            recyclerView$g0.u(this.f);
        }
        this.g.x(recyclerView$g2, this.q, z);
        this.l0.g = true;
    }

    public void k(s recyclerView$s0) {
        if(this.n0 == null) {
            this.n0 = new ArrayList();
        }
        this.n0.add(recyclerView$s0);
    }

    Rect k0(View view0) {
        p recyclerView$p0 = (p)view0.getLayoutParams();
        if(!recyclerView$p0.c) {
            return recyclerView$p0.b;
        }
        if(this.l0.e() && (recyclerView$p0.b() || recyclerView$p0.d())) {
            return recyclerView$p0.b;
        }
        Rect rect0 = recyclerView$p0.b;
        rect0.set(0, 0, 0, 0);
        int v = this.s.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.n.set(0, 0, 0, 0);
            ((n)this.s.get(v1)).e(this.n, view0, this, this.l0);
            rect0.left += this.n.left;
            rect0.top += this.n.top;
            rect0.right += this.n.right;
            rect0.bottom += this.n.bottom;
        }
        recyclerView$p0.c = false;
        return rect0;
    }

    boolean k1(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, int v) {
        if(this.v0()) {
            recyclerView$B0.q = v;
            this.y0.add(recyclerView$B0);
            return false;
        }
        Y.x0(recyclerView$B0.a, v);
        return true;
    }

    void l(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b0, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b1) {
        recyclerView$B0.G(false);
        if(this.Q.a(recyclerView$B0, recyclerView$l$b0, recyclerView$l$b1)) {
            this.N0();
        }
    }

    private void l0(long v, androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, androidx.recyclerview.widget.RecyclerView.B recyclerView$B1) {
        int v1 = this.j.g();
        for(int v2 = 0; v2 < v1; ++v2) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B2 = RecyclerView.g0(this.j.f(v2));
            if(recyclerView$B2 != recyclerView$B0 && this.c0(recyclerView$B2) == v) {
                throw this.q == null || !this.q.i() ? new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + recyclerView$B2 + " \n View Holder 2:" + recyclerView$B0 + this.P()) : new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + recyclerView$B2 + " \n View Holder 2:" + recyclerView$B0 + this.P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + recyclerView$B1 + " cannot be found but it is necessary for " + recyclerView$B0 + this.P());
    }

    boolean l1(AccessibilityEvent accessibilityEvent0) {
        int v = 0;
        if(this.v0()) {
            int v1 = accessibilityEvent0 == null ? 0 : C.b.a(accessibilityEvent0);
            if(v1 != 0) {
                v = v1;
            }
            this.D |= v;
            return true;
        }
        return false;
    }

    private void m(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, androidx.recyclerview.widget.RecyclerView.B recyclerView$B1, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b0, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b1, boolean z, boolean z1) {
        recyclerView$B0.G(false);
        if(z) {
            this.g(recyclerView$B0);
        }
        if(recyclerView$B0 != recyclerView$B1) {
            if(z1) {
                this.g(recyclerView$B1);
            }
            recyclerView$B0.h = recyclerView$B1;
            this.g(recyclerView$B0);
            this.g.J(recyclerView$B0);
            recyclerView$B1.G(false);
            recyclerView$B1.i = recyclerView$B0;
        }
        if(this.Q.b(recyclerView$B0, recyclerView$B1, recyclerView$l$b0, recyclerView$l$b1)) {
            this.N0();
        }
    }

    // 去混淆评级： 低(30)
    public boolean m0() {
        return !this.y || this.H || this.i.p();
    }

    public void m1(int v, int v1) {
        this.n1(v, v1, null);
    }

    void n(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b0, androidx.recyclerview.widget.RecyclerView.l.b recyclerView$l$b1) {
        this.g(recyclerView$B0);
        recyclerView$B0.G(false);
        if(this.Q.c(recyclerView$B0, recyclerView$l$b0, recyclerView$l$b1)) {
            this.N0();
        }
    }

    private boolean n0() {
        int v = this.j.g();
        for(int v1 = 0; v1 < v; ++v1) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(this.j.f(v1));
            if(recyclerView$B0 != null && !recyclerView$B0.J() && recyclerView$B0.y()) {
                return true;
            }
        }
        return false;
    }

    public void n1(int v, int v1, Interpolator interpolator0) {
        this.o1(v, v1, interpolator0, 0x80000000);
    }

    void o(String s) {
        if(this.v0()) {
            throw s == null ? new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + this.P()) : new IllegalStateException(s);
        }
        if(this.K > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + this.P()));
        }
    }

    void o0() {
        class androidx.recyclerview.widget.RecyclerView.f implements androidx.recyclerview.widget.a.a {
            final RecyclerView a;

            @Override  // androidx.recyclerview.widget.a$a
            public void a(int v, int v1) {
                RecyclerView.this.D0(v, v1);
                RecyclerView.this.o0 = true;
            }

            @Override  // androidx.recyclerview.widget.a$a
            public void b(androidx.recyclerview.widget.a.b a$b0) {
                this.i(a$b0);
            }

            @Override  // androidx.recyclerview.widget.a$a
            public void c(int v, int v1, Object object0) {
                RecyclerView.this.x1(v, v1, object0);
                RecyclerView.this.p0 = true;
            }

            @Override  // androidx.recyclerview.widget.a$a
            public void d(androidx.recyclerview.widget.a.b a$b0) {
                this.i(a$b0);
            }

            @Override  // androidx.recyclerview.widget.a$a
            public androidx.recyclerview.widget.RecyclerView.B e(int v) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.this.Z(v, true);
                if(recyclerView$B0 == null) {
                    return null;
                }
                return RecyclerView.this.j.n(recyclerView$B0.a) ? null : recyclerView$B0;
            }

            @Override  // androidx.recyclerview.widget.a$a
            public void f(int v, int v1) {
                RecyclerView.this.E0(v, v1, false);
                RecyclerView.this.o0 = true;
            }

            @Override  // androidx.recyclerview.widget.a$a
            public void g(int v, int v1) {
                RecyclerView.this.C0(v, v1);
                RecyclerView.this.o0 = true;
            }

            @Override  // androidx.recyclerview.widget.a$a
            public void h(int v, int v1) {
                RecyclerView.this.E0(v, v1, true);
                RecyclerView.this.o0 = true;
                RecyclerView.this.l0.d += v1;
            }

            void i(androidx.recyclerview.widget.a.b a$b0) {
                switch(a$b0.a) {
                    case 1: {
                        RecyclerView.this.r.V0(RecyclerView.this, a$b0.b, a$b0.d);
                        return;
                    }
                    case 2: {
                        RecyclerView.this.r.Y0(RecyclerView.this, a$b0.b, a$b0.d);
                        return;
                    }
                    case 4: {
                        RecyclerView.this.r.a1(RecyclerView.this, a$b0.b, a$b0.d, a$b0.c);
                        return;
                    }
                    case 8: {
                        RecyclerView.this.r.X0(RecyclerView.this, a$b0.b, a$b0.d, 1);
                    }
                }
            }
        }

        this.i = new androidx.recyclerview.widget.a(new androidx.recyclerview.widget.RecyclerView.f(this));
    }

    public void o1(int v, int v1, Interpolator interpolator0, int v2) {
        this.p1(v, v1, interpolator0, v2, false);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.J = 0;
        boolean z = true;
        this.v = true;
        if(!this.y || this.isLayoutRequested()) {
            z = false;
        }
        this.y = z;
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 != null) {
            recyclerView$o0.E(this);
        }
        this.r0 = false;
        if(RecyclerView.F0) {
            ThreadLocal threadLocal0 = e.j;
            e e0 = (e)threadLocal0.get();
            this.j0 = e0;
            if(e0 == null) {
                this.j0 = new e();
                Display display0 = Y.t(this);
                if(this.isInEditMode() || display0 == null) {
                    f = 60.0f;
                }
                else {
                    f = display0.getRefreshRate();
                    if(f < 30.0f) {
                        f = 60.0f;
                    }
                }
                e e1 = this.j0;
                e1.h = (long)(1000000000.0f / f);
                threadLocal0.set(e1);
            }
            this.j0.a(this);
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l recyclerView$l0 = this.Q;
        if(recyclerView$l0 != null) {
            recyclerView$l0.k();
        }
        this.v1();
        this.v = false;
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 != null) {
            recyclerView$o0.F(this, this.g);
        }
        this.y0.clear();
        this.removeCallbacks(this.z0);
        this.k.j();
        if(RecyclerView.F0) {
            e e0 = this.j0;
            if(e0 != null) {
                e0.j(this);
                this.j0 = null;
            }
        }
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        int v = this.s.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((n)this.s.get(v1)).g(canvas0, this, this.l0);
        }
    }

    @Override  // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        float f1;
        float f;
        if(this.r == null) {
            return false;
        }
        if(this.B) {
            return false;
        }
        if(motionEvent0.getAction() == 8) {
            if((motionEvent0.getSource() & 2) != 0) {
                f = this.r.q() ? -motionEvent0.getAxisValue(9) : 0.0f;
                f1 = this.r.p() ? motionEvent0.getAxisValue(10) : 0.0f;
            }
            else if((motionEvent0.getSource() & 0x400000) == 0) {
                f = 0.0f;
                f1 = 0.0f;
            }
            else {
                float f2 = motionEvent0.getAxisValue(26);
                if(this.r.q()) {
                    f = -f2;
                    f1 = 0.0f;
                }
                else if(this.r.p()) {
                    f1 = f2;
                    f = 0.0f;
                }
                else {
                    f = 0.0f;
                    f1 = 0.0f;
                }
            }
            if(f != 0.0f || f1 != 0.0f) {
                this.g1(((int)(f1 * this.f0)), ((int)(f * this.g0)), motionEvent0);
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        if(this.B) {
            return false;
        }
        this.u = null;
        if(this.T(motionEvent0)) {
            this.q();
            return true;
        }
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            return false;
        }
        boolean z = recyclerView$o0.p();
        boolean z1 = this.r.q();
        if(this.T == null) {
            this.T = VelocityTracker.obtain();
        }
        this.T.addMovement(motionEvent0);
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        switch(v) {
            case 0: {
                if(this.C) {
                    this.C = false;
                }
                this.S = motionEvent0.getPointerId(0);
                float f = motionEvent0.getX();
                this.W = (int)(f + 0.5f);
                this.U = (int)(f + 0.5f);
                float f1 = motionEvent0.getY();
                this.a0 = (int)(f1 + 0.5f);
                this.V = (int)(f1 + 0.5f);
                if(this.R == 2) {
                    this.getParent().requestDisallowInterceptTouchEvent(true);
                    this.setScrollState(1);
                    this.u1(1);
                }
                this.w0[1] = 0;
                this.w0[0] = 0;
                if(z1) {
                    z |= 2;
                }
                this.s1(((int)z), 0);
                return this.R == 1;
            }
            case 1: {
                this.T.clear();
                this.u1(0);
                return this.R == 1;
            }
            case 2: {
                int v2 = motionEvent0.findPointerIndex(this.S);
                if(v2 < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.S + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                float f2 = motionEvent0.getX(v2);
                float f3 = motionEvent0.getY(v2);
                if(this.R != 1) {
                    int v3 = ((int)(f3 + 0.5f)) - this.V;
                    if(!z || Math.abs(((int)(f2 + 0.5f)) - this.U) <= this.b0) {
                        z2 = false;
                    }
                    else {
                        this.W = (int)(f2 + 0.5f);
                        z2 = true;
                    }
                    if(z1 && Math.abs(v3) > this.b0) {
                        this.a0 = (int)(f3 + 0.5f);
                        z2 = true;
                    }
                    if(z2) {
                        this.setScrollState(1);
                        return this.R == 1;
                    }
                }
                return this.R == 1;
            }
            case 3: {
                this.q();
                return this.R == 1;
            }
            case 5: {
                this.S = motionEvent0.getPointerId(v1);
                float f4 = motionEvent0.getX(v1);
                this.W = (int)(f4 + 0.5f);
                this.U = (int)(f4 + 0.5f);
                float f5 = motionEvent0.getY(v1);
                this.a0 = (int)(f5 + 0.5f);
                this.V = (int)(f5 + 0.5f);
                return this.R == 1;
            }
            case 6: {
                this.K0(motionEvent0);
                return this.R == 1;
            }
            default: {
                return this.R == 1;
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        androidx.core.os.u.a("RV OnLayout");
        this.B();
        androidx.core.os.u.b();
        this.y = true;
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            this.w(v, v1);
            return;
        }
        if(recyclerView$o0.w0()) {
            int v2 = View.MeasureSpec.getMode(v);
            int v3 = View.MeasureSpec.getMode(v1);
            this.r.d1(this.g, this.l0, v, v1);
            if(v2 == 0x40000000 && v3 == 0x40000000 || this.q == null) {
                return;
            }
            if(this.l0.e == 1) {
                this.C();
            }
            this.r.E1(v, v1);
            this.l0.j = true;
            this.D();
            this.r.H1(v, v1);
            if(this.r.K1()) {
                this.r.E1(View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000));
                this.l0.j = true;
                this.D();
                this.r.H1(v, v1);
            }
        }
        else {
            if(this.w) {
                this.r.d1(this.g, this.l0, v, v1);
                return;
            }
            if(this.E) {
                this.r1();
                this.H0();
                this.P0();
                this.I0();
                y recyclerView$y0 = this.l0;
                if(recyclerView$y0.l) {
                    recyclerView$y0.h = true;
                }
                else {
                    this.i.j();
                    this.l0.h = false;
                }
                this.E = false;
                this.t1(false);
            }
            else if(this.l0.l) {
                this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
                return;
            }
            g recyclerView$g0 = this.q;
            this.l0.f = recyclerView$g0 == null ? 0 : recyclerView$g0.e();
            this.r1();
            this.r.d1(this.g, this.l0, v, v1);
            this.t1(false);
            this.l0.h = false;
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int v, Rect rect0) {
        return this.v0() ? false : super.onRequestFocusInDescendants(v, rect0);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        this.h = (SavedState)parcelable0;
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 != null) {
            Parcelable parcelable1 = this.h.h;
            if(parcelable1 != null) {
                recyclerView$o0.g1(parcelable1);
            }
        }
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        SavedState recyclerView$SavedState0 = this.h;
        if(recyclerView$SavedState0 != null) {
            ((SavedState)parcelable0).b(recyclerView$SavedState0);
            return parcelable0;
        }
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 != null) {
            parcelable0.h = recyclerView$o0.h1();
            return parcelable0;
        }
        parcelable0.h = null;
        return parcelable0;
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(v != v2 || v1 != v3) {
            this.s0();
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        int v = 0;
        if(!this.B && !this.C) {
            if(this.K(motionEvent0)) {
                this.q();
                return true;
            }
            o recyclerView$o0 = this.r;
            if(recyclerView$o0 == null) {
                return false;
            }
            boolean z = recyclerView$o0.p();
            boolean z1 = this.r.q();
            if(this.T == null) {
                this.T = VelocityTracker.obtain();
            }
            int v1 = motionEvent0.getActionMasked();
            int v2 = motionEvent0.getActionIndex();
            if(v1 == 0) {
                this.w0[1] = 0;
                this.w0[0] = 0;
            }
            MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
            motionEvent1.offsetLocation(((float)this.w0[0]), ((float)this.w0[1]));
            switch(v1) {
                case 0: {
                    this.S = motionEvent0.getPointerId(0);
                    float f = motionEvent0.getX();
                    this.W = (int)(f + 0.5f);
                    this.U = (int)(f + 0.5f);
                    float f1 = motionEvent0.getY();
                    this.a0 = (int)(f1 + 0.5f);
                    this.V = (int)(f1 + 0.5f);
                    if(z1) {
                        z |= 2;
                    }
                    this.s1(((int)z), 0);
                    this.T.addMovement(motionEvent1);
                    break;
                }
                case 1: {
                    this.T.addMovement(motionEvent1);
                    this.T.computeCurrentVelocity(1000, ((float)this.e0));
                    float f2 = z ? -this.T.getXVelocity(this.S) : 0.0f;
                    float f3 = z1 ? -this.T.getYVelocity(this.S) : 0.0f;
                    if(f2 == 0.0f && f3 == 0.0f || !this.a0(((int)f2), ((int)f3))) {
                        this.setScrollState(0);
                    }
                    this.d1();
                    break;
                }
                case 2: {
                    int v3 = motionEvent0.findPointerIndex(this.S);
                    if(v3 < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.S + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    float f4 = motionEvent0.getX(v3);
                    float f5 = motionEvent0.getY(v3);
                    int v4 = this.W - ((int)(f4 + 0.5f));
                    int v5 = this.a0 - ((int)(f5 + 0.5f));
                    if(this.R != 1) {
                        if(z) {
                            v4 = v4 <= 0 ? Math.min(0, v4 + this.b0) : Math.max(0, v4 - this.b0);
                            z2 = v4 == 0 ? false : true;
                        }
                        else {
                            z2 = false;
                        }
                        if(z1) {
                            v5 = v5 <= 0 ? Math.min(0, v5 + this.b0) : Math.max(0, v5 - this.b0);
                            if(v5 != 0) {
                                z2 = true;
                            }
                        }
                        if(z2) {
                            this.setScrollState(1);
                        }
                    }
                    int v6 = v4;
                    int v7 = v5;
                    if(this.R == 1) {
                        this.x0[0] = 0;
                        this.x0[1] = 0;
                        if(this.F((z ? v6 : 0), (z1 ? v7 : 0), this.x0, this.v0, 0)) {
                            v6 -= this.x0[0];
                            v7 -= this.x0[1];
                            this.w0[0] += this.v0[0];
                            this.w0[1] += this.v0[1];
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        this.W = ((int)(f4 + 0.5f)) - this.v0[0];
                        this.a0 = ((int)(f5 + 0.5f)) - this.v0[1];
                        if(z1) {
                            v = v7;
                        }
                        if(this.g1((z ? v6 : 0), v, motionEvent0)) {
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        e e0 = this.j0;
                        if(e0 != null && (v6 != 0 || v7 != 0)) {
                            e0.f(this, v6, v7);
                        }
                    }
                    this.T.addMovement(motionEvent1);
                    break;
                }
                case 3: {
                    this.q();
                    this.T.addMovement(motionEvent1);
                    break;
                }
                case 5: {
                    this.S = motionEvent0.getPointerId(v2);
                    float f6 = motionEvent0.getX(v2);
                    this.W = (int)(f6 + 0.5f);
                    this.U = (int)(f6 + 0.5f);
                    float f7 = motionEvent0.getY(v2);
                    this.a0 = (int)(f7 + 0.5f);
                    this.V = (int)(f7 + 0.5f);
                    this.T.addMovement(motionEvent1);
                    break;
                }
                case 6: {
                    this.K0(motionEvent0);
                    this.T.addMovement(motionEvent1);
                    break;
                }
                default: {
                    this.T.addMovement(motionEvent1);
                }
            }
            motionEvent1.recycle();
            return true;
        }
        return false;
    }

    boolean p(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
        return this.Q == null || this.Q.g(recyclerView$B0, recyclerView$B0.o());
    }

    private void p0() {
        if(Y.y(this) == 0) {
            Y.z0(this, 8);
        }
    }

    void p1(int v, int v1, Interpolator interpolator0, int v2, boolean z) {
        int v3 = 0;
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if(this.B) {
            return;
        }
        if(!recyclerView$o0.p()) {
            v = 0;
        }
        if(!this.r.q()) {
            v1 = 0;
        }
        if(v != 0 || v1 != 0) {
            if(v2 != 0x80000000 && v2 <= 0) {
                this.scrollBy(v, v1);
                return;
            }
            if(z) {
                if(v != 0) {
                    v3 = 1;
                }
                if(v1 != 0) {
                    v3 |= 2;
                }
                this.s1(v3, 1);
            }
            this.i0.f(v, v1, v2, interpolator0);
        }
    }

    private void q() {
        this.d1();
        this.setScrollState(0);
    }

    private void q0() {
        class androidx.recyclerview.widget.RecyclerView.e implements androidx.recyclerview.widget.b.b {
            final RecyclerView a;

            @Override  // androidx.recyclerview.widget.b$b
            public View a(int v) {
                return RecyclerView.this.getChildAt(v);
            }

            @Override  // androidx.recyclerview.widget.b$b
            public void addView(View view0, int v) {
                RecyclerView.this.addView(view0, v);
                RecyclerView.this.y(view0);
            }

            @Override  // androidx.recyclerview.widget.b$b
            public void b(View view0) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
                if(recyclerView$B0 != null) {
                    recyclerView$B0.B(RecyclerView.this);
                }
            }

            @Override  // androidx.recyclerview.widget.b$b
            public int c() {
                return RecyclerView.this.getChildCount();
            }

            @Override  // androidx.recyclerview.widget.b$b
            public void d() {
                int v = this.c();
                for(int v1 = 0; v1 < v; ++v1) {
                    View view0 = this.a(v1);
                    RecyclerView.this.z(view0);
                    view0.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            @Override  // androidx.recyclerview.widget.b$b
            public int e(View view0) {
                return RecyclerView.this.indexOfChild(view0);
            }

            @Override  // androidx.recyclerview.widget.b$b
            public androidx.recyclerview.widget.RecyclerView.B f(View view0) {
                return RecyclerView.g0(view0);
            }

            @Override  // androidx.recyclerview.widget.b$b
            public void g(int v) {
                View view0 = this.a(v);
                if(view0 != null) {
                    androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
                    if(recyclerView$B0 != null) {
                        if(recyclerView$B0.x() && !recyclerView$B0.J()) {
                            throw new IllegalArgumentException("called detach on an already detached child " + recyclerView$B0 + RecyclerView.this.P());
                        }
                        recyclerView$B0.b(0x100);
                    }
                }
                RecyclerView.this.detachViewFromParent(v);
            }

            @Override  // androidx.recyclerview.widget.b$b
            public void h(View view0) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
                if(recyclerView$B0 != null) {
                    recyclerView$B0.C(RecyclerView.this);
                }
            }

            @Override  // androidx.recyclerview.widget.b$b
            public void i(int v) {
                View view0 = RecyclerView.this.getChildAt(v);
                if(view0 != null) {
                    RecyclerView.this.z(view0);
                    view0.clearAnimation();
                }
                RecyclerView.this.removeViewAt(v);
            }

            @Override  // androidx.recyclerview.widget.b$b
            public void j(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
                androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
                if(recyclerView$B0 != null) {
                    if(!recyclerView$B0.x() && !recyclerView$B0.J()) {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + recyclerView$B0 + RecyclerView.this.P());
                    }
                    recyclerView$B0.f();
                }
                RecyclerView.this.attachViewToParent(view0, v, viewGroup$LayoutParams0);
            }
        }

        this.j = new androidx.recyclerview.widget.b(new androidx.recyclerview.widget.RecyclerView.e(this));
    }

    public void q1(int v) {
        if(this.B) {
            return;
        }
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        recyclerView$o0.M1(this, this.l0, v);
    }

    static void r(androidx.recyclerview.widget.RecyclerView.B recyclerView$B0) {
        WeakReference weakReference0 = recyclerView$B0.b;
        if(weakReference0 != null) {
            for(View view0 = (View)weakReference0.get(); view0 != null; view0 = viewParent0 instanceof View ? ((View)viewParent0) : null) {
                if(view0 == recyclerView$B0.a) {
                    return;
                }
                ViewParent viewParent0 = view0.getParent();
            }
            recyclerView$B0.b = null;
        }
    }

    void r0(StateListDrawable stateListDrawable0, Drawable drawable0, StateListDrawable stateListDrawable1, Drawable drawable1) {
        if(stateListDrawable0 == null || drawable0 == null || stateListDrawable1 == null || drawable1 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + this.P());
        }
        Resources resources0 = this.getContext().getResources();
        new androidx.recyclerview.widget.d(this, stateListDrawable0, drawable0, stateListDrawable1, drawable1, resources0.getDimensionPixelSize(f0.b.a), resources0.getDimensionPixelSize(f0.b.c), resources0.getDimensionPixelOffset(f0.b.b));
    }

    void r1() {
        int v = this.z + 1;
        this.z = v;
        if(v == 1 && !this.B) {
            this.A = false;
        }
    }

    @Override  // android.view.ViewGroup
    protected void removeDetachedView(View view0, boolean z) {
        androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
        if(recyclerView$B0 != null) {
            if(recyclerView$B0.x()) {
                recyclerView$B0.f();
            }
            else if(!recyclerView$B0.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + recyclerView$B0 + this.P());
            }
        }
        view0.clearAnimation();
        this.z(view0);
        super.removeDetachedView(view0, z);
    }

    @Override  // android.view.ViewGroup
    public void requestChildFocus(View view0, View view1) {
        if(!this.r.f1(this, this.l0, view0, view1) && view1 != null) {
            this.b1(view0, view1);
        }
        super.requestChildFocus(view0, view1);
    }

    @Override  // android.view.ViewGroup
    public boolean requestChildRectangleOnScreen(View view0, Rect rect0, boolean z) {
        return this.r.v1(this, view0, rect0, z);
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int v = this.t.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((r)this.t.get(v1)).c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if(this.z == 0 && !this.B) {
            super.requestLayout();
            return;
        }
        this.A = true;
    }

    void s() {
        int v = this.j.j();
        for(int v1 = 0; v1 < v; ++v1) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(this.j.i(v1));
            if(!recyclerView$B0.J()) {
                recyclerView$B0.c();
            }
        }
        this.g.d();
    }

    void s0() {
        this.P = null;
        this.N = null;
        this.O = null;
        this.M = null;
    }

    public boolean s1(int v, int v1) {
        return this.getScrollingChildHelper().p(v, v1);
    }

    @Override  // android.view.View
    public void scrollBy(int v, int v1) {
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if(this.B) {
            return;
        }
        boolean z = recyclerView$o0.p();
        boolean z1 = this.r.q();
        if(z || z1) {
            if(!z) {
                v = 0;
            }
            if(!z1) {
                v1 = 0;
            }
            this.g1(v, v1, null);
        }
    }

    @Override  // android.view.View
    public void scrollTo(int v, int v1) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override  // android.view.View
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent0) {
        if(this.l1(accessibilityEvent0)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent0);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.l l0) {
        this.s0 = l0;
        Y.o0(this, l0);
    }

    public void setAdapter(g recyclerView$g0) {
        this.setLayoutFrozen(false);
        this.j1(recyclerView$g0, false, true);
        this.Q0(false);
        this.requestLayout();
    }

    public void setChildDrawingOrderCallback(j recyclerView$j0) {
        if(recyclerView$j0 == null) {
            return;
        }
        this.setChildrenDrawingOrderEnabled(false);
    }

    @Override  // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if(z != this.l) {
            this.s0();
        }
        this.l = z;
        super.setClipToPadding(z);
        if(this.y) {
            this.requestLayout();
        }
    }

    public void setEdgeEffectFactory(k recyclerView$k0) {
        B.h.g(recyclerView$k0);
        this.L = recyclerView$k0;
        this.s0();
    }

    public void setHasFixedSize(boolean z) {
        this.w = z;
    }

    public void setItemAnimator(l recyclerView$l0) {
        l recyclerView$l1 = this.Q;
        if(recyclerView$l1 != null) {
            recyclerView$l1.k();
            this.Q.v(null);
        }
        this.Q = recyclerView$l0;
        if(recyclerView$l0 != null) {
            recyclerView$l0.v(this.q0);
        }
    }

    public void setItemViewCacheSize(int v) {
        this.g.G(v);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        this.suppressLayout(z);
    }

    public void setLayoutManager(o recyclerView$o0) {
        if(recyclerView$o0 == this.r) {
            return;
        }
        this.v1();
        if(this.r == null) {
            this.g.c();
        }
        else {
            l recyclerView$l0 = this.Q;
            if(recyclerView$l0 != null) {
                recyclerView$l0.k();
            }
            this.r.o1(this.g);
            this.r.p1(this.g);
            this.g.c();
            if(this.v) {
                this.r.F(this, this.g);
            }
            this.r.I1(null);
            this.r = null;
        }
        this.j.o();
        this.r = recyclerView$o0;
        if(recyclerView$o0 != null) {
            if(recyclerView$o0.b != null) {
                throw new IllegalArgumentException("LayoutManager " + recyclerView$o0 + " is already attached to a RecyclerView:" + recyclerView$o0.b.P());
            }
            recyclerView$o0.I1(this);
            if(this.v) {
                this.r.E(this);
            }
        }
        this.g.K();
        this.requestLayout();
    }

    @Override  // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition0) {
        if(layoutTransition0 != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override  // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.getScrollingChildHelper().m(z);
    }

    public void setOnFlingListener(q recyclerView$q0) {
        this.c0 = recyclerView$q0;
    }

    @Deprecated
    public void setOnScrollListener(s recyclerView$s0) {
        this.m0 = recyclerView$s0;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.h0 = z;
    }

    public void setRecycledViewPool(t recyclerView$t0) {
        this.g.E(recyclerView$t0);
    }

    public void setRecyclerListener(v recyclerView$v0) {
    }

    void setScrollState(int v) {
        if(v == this.R) {
            return;
        }
        this.R = v;
        if(v != 2) {
            this.w1();
        }
        this.H(v);
    }

    public void setScrollingTouchSlop(int v) {
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(this.getContext());
        switch(v) {
            case 0: {
                break;
            }
            case 1: {
                this.b0 = viewConfiguration0.getScaledPagingTouchSlop();
                return;
            }
            default: {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + v + "; using default value");
                break;
            }
        }
        this.b0 = viewConfiguration0.getScaledTouchSlop();
    }

    public void setViewCacheExtension(androidx.recyclerview.widget.RecyclerView.z recyclerView$z0) {
    }

    @Override  // android.view.View
    public boolean startNestedScroll(int v) {
        return this.getScrollingChildHelper().o(v);
    }

    @Override  // android.view.View
    public void stopNestedScroll() {
        this.getScrollingChildHelper().q();
    }

    @Override  // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if(z != this.B) {
            this.o("Do not suppressLayout in layout or scroll");
            if(!z) {
                this.B = false;
                if(this.A && this.r != null && this.q != null) {
                    this.requestLayout();
                }
                this.A = false;
                return;
            }
            long v = SystemClock.uptimeMillis();
            this.onTouchEvent(MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0));
            this.B = true;
            this.C = true;
            this.v1();
        }
    }

    void t(int v, int v1) {
        boolean z;
        if(this.M == null || this.M.isFinished() || v <= 0) {
            z = false;
        }
        else {
            this.M.onRelease();
            z = this.M.isFinished();
        }
        if(this.O != null && !this.O.isFinished() && v < 0) {
            this.O.onRelease();
            z |= this.O.isFinished();
        }
        if(this.N != null && !this.N.isFinished() && v1 > 0) {
            this.N.onRelease();
            z |= this.N.isFinished();
        }
        if(this.P != null && !this.P.isFinished() && v1 < 0) {
            this.P.onRelease();
            z |= this.P.isFinished();
        }
        if(z) {
            Y.f0(this);
        }
    }

    public void t0() {
        if(this.s.size() == 0) {
            return;
        }
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 != null) {
            recyclerView$o0.l("Cannot invalidate item decorations during a scroll or layout");
        }
        this.y0();
        this.requestLayout();
    }

    void t1(boolean z) {
        if(this.z < 1) {
            this.z = 1;
        }
        if(!z && !this.B) {
            this.A = false;
        }
        if(this.z == 1) {
            if(z && this.A && !this.B && this.r != null && this.q != null) {
                this.B();
            }
            if(!this.B) {
                this.A = false;
            }
        }
        --this.z;
    }

    void u() {
        if(this.y && !this.H) {
            if(!this.i.p()) {
                return;
            }
            if(this.i.o(4) && !this.i.o(11)) {
                androidx.core.os.u.a("RV PartialInvalidate");
                this.r1();
                this.H0();
                this.i.t();
                if(!this.A) {
                    if(this.n0()) {
                        this.B();
                    }
                    else {
                        this.i.i();
                    }
                }
                this.t1(true);
                this.I0();
                androidx.core.os.u.b();
                return;
            }
            if(this.i.p()) {
                androidx.core.os.u.a("RV FullInvalidate");
                this.B();
                androidx.core.os.u.b();
            }
            return;
        }
        androidx.core.os.u.a("RV FullInvalidate");
        this.B();
        androidx.core.os.u.b();
    }

    boolean u0() {
        return this.F != null && this.F.isEnabled();
    }

    public void u1(int v) {
        this.getScrollingChildHelper().r(v);
    }

    private void v(Context context0, String s, AttributeSet attributeSet0, int v, int v1) {
        Constructor constructor0;
        Object[] arr_object;
        if(s != null) {
            String s1 = s.trim();
            if(!s1.isEmpty()) {
                String s2 = this.j0(context0, s1);
                try {
                    Class class0 = Class.forName(s2, false, (this.isInEditMode() ? this.getClass().getClassLoader() : context0.getClassLoader())).asSubclass(o.class);
                    try {
                        arr_object = null;
                        constructor0 = class0.getConstructor(RecyclerView.I0);
                        arr_object = new Object[]{context0, attributeSet0, v, v1};
                    }
                    catch(NoSuchMethodException noSuchMethodException0) {
                        try {
                            constructor0 = class0.getConstructor(null);
                        }
                        catch(NoSuchMethodException noSuchMethodException1) {
                            noSuchMethodException1.initCause(noSuchMethodException0);
                            throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Error creating LayoutManager " + s2, noSuchMethodException1);
                        }
                    }
                    constructor0.setAccessible(true);
                    this.setLayoutManager(((o)constructor0.newInstance(arr_object)));
                    return;
                }
                catch(ClassNotFoundException classNotFoundException0) {
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Could not instantiate the LayoutManager: " + s2, invocationTargetException0);
                }
                catch(InstantiationException instantiationException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Could not instantiate the LayoutManager: " + s2, instantiationException0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Cannot access non-public constructor " + s2, illegalAccessException0);
                }
                catch(ClassCastException classCastException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Class is not a LayoutManager " + s2, classCastException0);
                }
                throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Unable to find LayoutManager " + s2, classNotFoundException0);
            }
        }
    }

    public boolean v0() {
        return this.J > 0;
    }

    public void v1() {
        this.setScrollState(0);
        this.w1();
    }

    void w(int v, int v1) {
        this.setMeasuredDimension(o.s(v, this.getPaddingLeft() + this.getPaddingRight(), Y.B(this)), o.s(v1, this.getPaddingTop() + this.getPaddingBottom(), Y.A(this)));
    }

    private boolean w0(View view0, View view1, int v) {
        int v9;
        if(view1 == null || view1 == this || this.R(view1) == null) {
            return false;
        }
        if(view0 == null) {
            return true;
        }
        if(this.R(view0) == null) {
            return true;
        }
        int v1 = view0.getWidth();
        int v2 = view0.getHeight();
        this.n.set(0, 0, v1, v2);
        int v3 = view1.getWidth();
        int v4 = view1.getHeight();
        this.o.set(0, 0, v3, v4);
        this.offsetDescendantRectToMyCoords(view0, this.n);
        this.offsetDescendantRectToMyCoords(view1, this.o);
        int v5 = -1;
        int v6 = this.r.d0() == 1 ? -1 : 1;
        Rect rect0 = this.n;
        int v7 = rect0.left;
        Rect rect1 = this.o;
        int v8 = rect1.left;
        if(v7 >= v8 && rect0.right > v8 || rect0.right >= rect1.right) {
            v9 = rect0.right <= rect1.right && v7 < rect1.right || v7 <= v8 ? 0 : -1;
        }
        else {
            v9 = 1;
        }
        int v10 = rect0.top;
        int v11 = rect1.top;
        if((v10 < v11 || rect0.bottom <= v11) && rect0.bottom < rect1.bottom) {
            v5 = 1;
        }
        else if(rect0.bottom <= rect1.bottom && v10 < rect1.bottom || v10 <= v11) {
            v5 = 0;
        }
        switch(v) {
            case 1: {
                return v5 < 0 || v5 == 0 && v9 * v6 <= 0;
            }
            case 2: {
                return v5 > 0 || v5 == 0 && v9 * v6 >= 0;
            }
            case 17: {
                return v9 < 0;
            }
            case 33: {
                return v5 < 0;
            }
            case 66: {
                return v9 > 0;
            }
            case 130: {
                return v5 > 0;
            }
            default: {
                throw new IllegalArgumentException("Invalid direction: " + v + this.P());
            }
        }
    }

    private void w1() {
        this.i0.g();
        o recyclerView$o0 = this.r;
        if(recyclerView$o0 != null) {
            recyclerView$o0.O1();
        }
    }

    private boolean x(int v, int v1) {
        this.U(this.t0);
        return this.t0[0] != v || this.t0[1] != v1;
    }

    void x0(int v) {
        if(this.r == null) {
            return;
        }
        this.setScrollState(2);
        this.r.B1(v);
        this.awakenScrollBars();
    }

    void x1(int v, int v1, Object object0) {
        int v2 = this.j.j();
        for(int v3 = 0; v3 < v2; ++v3) {
            View view0 = this.j.i(v3);
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(view0);
            if(recyclerView$B0 != null && !recyclerView$B0.J() && (recyclerView$B0.c >= v && recyclerView$B0.c < v + v1)) {
                recyclerView$B0.b(2);
                recyclerView$B0.a(object0);
                ((p)view0.getLayoutParams()).c = true;
            }
        }
        this.g.M(v, v1);
    }

    void y(View view0) {
        RecyclerView.g0(view0);
        List list0 = this.G;
        if(list0 != null) {
            int v = list0.size();
            if(v - 1 >= 0) {
                E.a(this.G.get(v - 1));
                throw null;
            }
        }
    }

    void y0() {
        int v = this.j.j();
        for(int v1 = 0; v1 < v; ++v1) {
            ((p)this.j.i(v1).getLayoutParams()).c = true;
        }
        this.g.s();
    }

    void z(View view0) {
        RecyclerView.g0(view0);
        List list0 = this.G;
        if(list0 != null) {
            int v = list0.size();
            if(v - 1 >= 0) {
                E.a(this.G.get(v - 1));
                throw null;
            }
        }
    }

    void z0() {
        int v = this.j.j();
        for(int v1 = 0; v1 < v; ++v1) {
            androidx.recyclerview.widget.RecyclerView.B recyclerView$B0 = RecyclerView.g0(this.j.i(v1));
            if(recyclerView$B0 != null && !recyclerView$B0.J()) {
                recyclerView$B0.b(6);
            }
        }
        this.y0();
        this.g.t();
    }
}

