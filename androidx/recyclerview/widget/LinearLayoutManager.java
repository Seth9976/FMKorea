package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends o implements b {
    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        static final class a implements Parcelable.Creator {
            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0);
            }

            public SavedState[] b(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        int f;
        int g;
        boolean h;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState() {
        }

        SavedState(Parcel parcel0) {
            this.f = parcel0.readInt();
            this.g = parcel0.readInt();
            this.h = parcel0.readInt() == 1;
        }

        public SavedState(SavedState linearLayoutManager$SavedState0) {
            this.f = linearLayoutManager$SavedState0.f;
            this.g = linearLayoutManager$SavedState0.g;
            this.h = linearLayoutManager$SavedState0.h;
        }

        boolean a() {
            return this.f >= 0;
        }

        void b() {
            this.f = -1;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.f);
            parcel0.writeInt(this.g);
            parcel0.writeInt(((int)this.h));
        }
    }

    static class androidx.recyclerview.widget.LinearLayoutManager.a {
        i a;
        int b;
        int c;
        boolean d;
        boolean e;

        androidx.recyclerview.widget.LinearLayoutManager.a() {
            this.e();
        }

        void a() {
            this.c = this.d ? this.a.i() : this.a.m();
        }

        public void b(View view0, int v) {
            this.c = this.d ? this.a.d(view0) + this.a.o() : this.a.g(view0);
            this.b = v;
        }

        public void c(View view0, int v) {
            int v1 = this.a.o();
            if(v1 >= 0) {
                this.b(view0, v);
                return;
            }
            this.b = v;
            if(this.d) {
                int v2 = this.a.i() - v1 - this.a.d(view0);
                this.c = this.a.i() - v2;
                if(v2 > 0) {
                    int v3 = this.a.e(view0);
                    int v4 = this.c - v3;
                    int v5 = this.a.m();
                    int v6 = v4 - (v5 + Math.min(this.a.g(view0) - v5, 0));
                    if(v6 < 0) {
                        this.c += Math.min(v2, -v6);
                    }
                }
            }
            else {
                int v7 = this.a.g(view0);
                int v8 = v7 - this.a.m();
                this.c = v7;
                if(v8 > 0) {
                    int v9 = this.a.e(view0);
                    int v10 = this.a.i();
                    int v11 = this.a.d(view0);
                    int v12 = this.a.i() - Math.min(0, v10 - v1 - v11) - (v7 + v9);
                    if(v12 < 0) {
                        this.c -= Math.min(v8, -v12);
                    }
                }
            }
        }

        boolean d(View view0, y recyclerView$y0) {
            p recyclerView$p0 = (p)view0.getLayoutParams();
            return !recyclerView$p0.c() && recyclerView$p0.a() >= 0 && recyclerView$p0.a() < recyclerView$y0.b();
        }

        void e() {
            this.b = -1;
            this.c = 0x80000000;
            this.d = false;
            this.e = false;
        }

        @Override
        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    public static class androidx.recyclerview.widget.LinearLayoutManager.b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    static class c {
        boolean a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        boolean j;
        int k;
        List l;
        boolean m;

        c() {
            this.a = true;
            this.h = 0;
            this.i = 0;
            this.j = false;
            this.l = null;
        }

        public void a() {
            this.b(null);
        }

        public void b(View view0) {
            View view1 = this.f(view0);
            if(view1 == null) {
                this.d = -1;
                return;
            }
            this.d = ((p)view1.getLayoutParams()).a();
        }

        boolean c(y recyclerView$y0) {
            return this.d >= 0 && this.d < recyclerView$y0.b();
        }

        View d(u recyclerView$u0) {
            if(this.l != null) {
                return this.e();
            }
            View view0 = recyclerView$u0.o(this.d);
            this.d += this.e;
            return view0;
        }

        private View e() {
            int v = this.l.size();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = ((B)this.l.get(v1)).a;
                p recyclerView$p0 = (p)view0.getLayoutParams();
                if(!recyclerView$p0.c() && this.d == recyclerView$p0.a()) {
                    this.b(view0);
                    return view0;
                }
            }
            return null;
        }

        public View f(View view0) {
            int v = this.l.size();
            View view1 = null;
            int v1 = 0x7FFFFFFF;
            for(int v2 = 0; v2 < v; ++v2) {
                View view2 = ((B)this.l.get(v2)).a;
                p recyclerView$p0 = (p)view2.getLayoutParams();
                if(view2 != view0 && !recyclerView$p0.c()) {
                    int v3 = (recyclerView$p0.a() - this.d) * this.e;
                    if(v3 >= 0 && v3 < v1) {
                        view1 = view2;
                        if(v3 == 0) {
                            break;
                        }
                        v1 = v3;
                    }
                }
            }
            return view1;
        }
    }

    int A;
    int B;
    private boolean C;
    SavedState D;
    final androidx.recyclerview.widget.LinearLayoutManager.a E;
    private final androidx.recyclerview.widget.LinearLayoutManager.b F;
    private int G;
    private int[] H;
    int s;
    private c t;
    i u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    public LinearLayoutManager(Context context0) {
        this(context0, 1, false);
    }

    public LinearLayoutManager(Context context0, int v, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = 0x80000000;
        this.D = null;
        this.E = new androidx.recyclerview.widget.LinearLayoutManager.a();
        this.F = new androidx.recyclerview.widget.LinearLayoutManager.b();
        this.G = 2;
        this.H = new int[2];
        this.G2(v);
        this.H2(z);
    }

    public LinearLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = 0x80000000;
        this.D = null;
        this.E = new androidx.recyclerview.widget.LinearLayoutManager.a();
        this.F = new androidx.recyclerview.widget.LinearLayoutManager.b();
        this.G = 2;
        this.H = new int[2];
        d recyclerView$o$d0 = o.m0(context0, attributeSet0, v, v1);
        this.G2(recyclerView$o$d0.a);
        this.H2(recyclerView$o$d0.c);
        this.I2(recyclerView$o$d0.d);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int A(y recyclerView$y0) {
        return this.U1(recyclerView$y0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int A1(int v, u recyclerView$u0, y recyclerView$y0) {
        return this.s == 1 ? 0 : this.F2(v, recyclerView$u0, recyclerView$y0);
    }

    private void A2(u recyclerView$u0, int v, int v1) {
        if(v == v1) {
            return;
        }
        if(v1 > v) {
            for(int v2 = v1 - 1; v2 >= v; --v2) {
                this.r1(v2, recyclerView$u0);
            }
            return;
        }
        while(v > v1) {
            this.r1(v, recyclerView$u0);
            --v;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void B1(int v) {
        this.A = v;
        this.B = 0x80000000;
        SavedState linearLayoutManager$SavedState0 = this.D;
        if(linearLayoutManager$SavedState0 != null) {
            linearLayoutManager$SavedState0.b();
        }
        this.x1();
    }

    private void B2(u recyclerView$u0, int v, int v1) {
        int v2 = this.O();
        if(v < 0) {
            return;
        }
        int v3 = this.u.h() - v + v1;
        if(this.x) {
            int v4 = 0;
            while(v4 < v2) {
                View view0 = this.N(v4);
                if(this.u.g(view0) >= v3 && this.u.q(view0) >= v3) {
                    ++v4;
                    continue;
                }
                this.A2(recyclerView$u0, 0, v4);
                return;
            }
        }
        else {
            int v5 = v2 - 1;
            while(v5 >= 0) {
                View view1 = this.N(v5);
                if(this.u.g(view1) >= v3 && this.u.q(view1) >= v3) {
                    --v5;
                }
                else {
                    this.A2(recyclerView$u0, v2 - 1, v5);
                    if(true) {
                        break;
                    }
                }
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int C1(int v, u recyclerView$u0, y recyclerView$y0) {
        return this.s == 0 ? 0 : this.F2(v, recyclerView$u0, recyclerView$y0);
    }

    private void C2(u recyclerView$u0, int v, int v1) {
        if(v < 0) {
            return;
        }
        int v2 = v - v1;
        int v3 = this.O();
        if(this.x) {
            int v4 = v3 - 1;
            while(v4 >= 0) {
                View view0 = this.N(v4);
                if(this.u.d(view0) <= v2 && this.u.p(view0) <= v2) {
                    --v4;
                    continue;
                }
                this.A2(recyclerView$u0, v3 - 1, v4);
                return;
            }
        }
        else {
            int v5 = 0;
            while(v5 < v3) {
                View view1 = this.N(v5);
                if(this.u.d(view1) <= v2 && this.u.p(view1) <= v2) {
                    ++v5;
                }
                else {
                    this.A2(recyclerView$u0, 0, v5);
                    if(true) {
                        break;
                    }
                }
            }
        }
    }

    boolean D2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }

    private void E2() {
        if(this.s != 1 && this.u2()) {
            this.x = !this.w;
            return;
        }
        this.x = this.w;
    }

    int F2(int v, u recyclerView$u0, y recyclerView$y0) {
        if(this.O() != 0 && v != 0) {
            this.X1();
            this.t.a = true;
            int v1 = v <= 0 ? -1 : 1;
            int v2 = Math.abs(v);
            this.M2(v1, v2, true, recyclerView$y0);
            int v3 = this.t.g + this.Y1(recyclerView$u0, this.t, recyclerView$y0, false);
            if(v3 < 0) {
                return 0;
            }
            if(v2 > v3) {
                v = v1 * v3;
            }
            this.u.r(-v);
            this.t.k = v;
            return v;
        }
        return 0;
    }

    public void G2(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("invalid orientation:" + v);
        }
        this.l(null);
        if(v != this.s || this.u == null) {
            i i0 = i.b(this, v);
            this.u = i0;
            this.E.a = i0;
            this.s = v;
            this.x1();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public View H(int v) {
        int v1 = this.O();
        if(v1 == 0) {
            return null;
        }
        int v2 = v - this.l0(this.N(0));
        if(v2 >= 0 && v2 < v1) {
            View view0 = this.N(v2);
            return this.l0(view0) == v ? view0 : super.H(v);
        }
        return super.H(v);
    }

    public void H2(boolean z) {
        this.l(null);
        if(z == this.w) {
            return;
        }
        this.w = z;
        this.x1();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public p I() {
        return new p(-2, -2);
    }

    public void I2(boolean z) {
        this.l(null);
        if(this.y == z) {
            return;
        }
        this.y = z;
        this.x1();
    }

    private boolean J2(u recyclerView$u0, y recyclerView$y0, androidx.recyclerview.widget.LinearLayoutManager.a linearLayoutManager$a0) {
        if(this.O() == 0) {
            return false;
        }
        View view0 = this.a0();
        if(view0 != null && linearLayoutManager$a0.d(view0, recyclerView$y0)) {
            linearLayoutManager$a0.c(view0, this.l0(view0));
            return true;
        }
        if(this.v != this.y) {
            return false;
        }
        View view1 = linearLayoutManager$a0.d ? this.m2(recyclerView$u0, recyclerView$y0) : this.n2(recyclerView$u0, recyclerView$y0);
        if(view1 != null) {
            linearLayoutManager$a0.b(view1, this.l0(view1));
            if(!recyclerView$y0.e() && this.P1() && (this.u.g(view1) >= this.u.i() || this.u.d(view1) < this.u.m())) {
                linearLayoutManager$a0.c = linearLayoutManager$a0.d ? this.u.i() : this.u.m();
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    boolean K1() {
        return this.c0() != 0x40000000 && this.t0() != 0x40000000 && this.u0();
    }

    private boolean K2(y recyclerView$y0, androidx.recyclerview.widget.LinearLayoutManager.a linearLayoutManager$a0) {
        boolean z = false;
        if(!recyclerView$y0.e()) {
            int v = this.A;
            if(v != -1) {
                if(v >= 0 && v < recyclerView$y0.b()) {
                    linearLayoutManager$a0.b = this.A;
                    if(this.D != null && this.D.a()) {
                        linearLayoutManager$a0.d = this.D.h;
                        if(this.D.h) {
                            linearLayoutManager$a0.c = this.u.i() - this.D.g;
                            return true;
                        }
                        linearLayoutManager$a0.c = this.u.m() + this.D.g;
                        return true;
                    }
                    if(this.B == 0x80000000) {
                        View view0 = this.H(this.A);
                        if(view0 != null) {
                            if(this.u.e(view0) > this.u.n()) {
                                linearLayoutManager$a0.a();
                                return true;
                            }
                            if(this.u.g(view0) - this.u.m() < 0) {
                                linearLayoutManager$a0.c = this.u.m();
                                linearLayoutManager$a0.d = false;
                                return true;
                            }
                            if(this.u.i() - this.u.d(view0) < 0) {
                                linearLayoutManager$a0.c = this.u.i();
                                linearLayoutManager$a0.d = true;
                                return true;
                            }
                            linearLayoutManager$a0.c = linearLayoutManager$a0.d ? this.u.d(view0) + this.u.o() : this.u.g(view0);
                            return true;
                        }
                        if(this.O() > 0) {
                            int v1 = this.l0(this.N(0));
                            if(this.A < v1 == this.x) {
                                z = true;
                            }
                            linearLayoutManager$a0.d = z;
                        }
                        linearLayoutManager$a0.a();
                        return true;
                    }
                    linearLayoutManager$a0.d = this.x;
                    if(this.x) {
                        linearLayoutManager$a0.c = this.u.i() - this.B;
                        return true;
                    }
                    linearLayoutManager$a0.c = this.u.m() + this.B;
                    return true;
                }
                this.A = -1;
                this.B = 0x80000000;
            }
        }
        return false;
    }

    private void L2(u recyclerView$u0, y recyclerView$y0, androidx.recyclerview.widget.LinearLayoutManager.a linearLayoutManager$a0) {
        if(this.K2(recyclerView$y0, linearLayoutManager$a0)) {
            return;
        }
        if(this.J2(recyclerView$u0, recyclerView$y0, linearLayoutManager$a0)) {
            return;
        }
        linearLayoutManager$a0.a();
        linearLayoutManager$a0.b = this.y ? recyclerView$y0.b() - 1 : 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void M0(RecyclerView recyclerView0, u recyclerView$u0) {
        super.M0(recyclerView0, recyclerView$u0);
        if(this.C) {
            this.o1(recyclerView$u0);
            recyclerView$u0.c();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void M1(RecyclerView recyclerView0, y recyclerView$y0, int v) {
        g g0 = new g(recyclerView0.getContext());
        g0.p(v);
        this.N1(g0);
    }

    private void M2(int v, int v1, boolean z, y recyclerView$y0) {
        int v7;
        c linearLayoutManager$c0 = this.t;
        linearLayoutManager$c0.m = this.D2();
        this.t.f = v;
        int[] arr_v = this.H;
        boolean z1 = false;
        arr_v[0] = 0;
        int v2 = 1;
        arr_v[1] = 0;
        this.Q1(recyclerView$y0, arr_v);
        int v3 = Math.max(0, this.H[0]);
        int v4 = Math.max(0, this.H[1]);
        if(v == 1) {
            z1 = true;
        }
        c linearLayoutManager$c1 = this.t;
        int v5 = z1 ? v4 : v3;
        linearLayoutManager$c1.h = v5;
        if(!z1) {
            v3 = v4;
        }
        linearLayoutManager$c1.i = v3;
        if(z1) {
            linearLayoutManager$c1.h = v5 + this.u.j();
            View view0 = this.q2();
            c linearLayoutManager$c2 = this.t;
            if(this.x) {
                v2 = -1;
            }
            linearLayoutManager$c2.e = v2;
            int v6 = this.l0(view0);
            c linearLayoutManager$c3 = this.t;
            linearLayoutManager$c2.d = v6 + linearLayoutManager$c3.e;
            linearLayoutManager$c3.b = this.u.d(view0);
            v7 = this.u.d(view0) - this.u.i();
        }
        else {
            View view1 = this.r2();
            c linearLayoutManager$c4 = this.t;
            linearLayoutManager$c4.h += this.u.m();
            c linearLayoutManager$c5 = this.t;
            if(!this.x) {
                v2 = -1;
            }
            linearLayoutManager$c5.e = v2;
            int v8 = this.l0(view1);
            c linearLayoutManager$c6 = this.t;
            linearLayoutManager$c5.d = v8 + linearLayoutManager$c6.e;
            linearLayoutManager$c6.b = this.u.g(view1);
            v7 = -this.u.g(view1) + this.u.m();
        }
        c linearLayoutManager$c7 = this.t;
        linearLayoutManager$c7.c = v1;
        if(z) {
            linearLayoutManager$c7.c = v1 - v7;
        }
        linearLayoutManager$c7.g = v7;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public View N0(View view0, int v, u recyclerView$u0, y recyclerView$y0) {
        this.E2();
        if(this.O() == 0) {
            return null;
        }
        int v1 = this.V1(v);
        if(v1 == 0x80000000) {
            return null;
        }
        this.X1();
        this.M2(v1, ((int)(((float)this.u.n()) * 0.333333f)), false, recyclerView$y0);
        this.t.g = 0x80000000;
        this.t.a = false;
        this.Y1(recyclerView$u0, this.t, recyclerView$y0, true);
        View view1 = v1 == -1 ? this.k2() : this.j2();
        View view2 = v1 == -1 ? this.r2() : this.q2();
        if(view2.hasFocusable()) {
            return view1 == null ? null : view2;
        }
        return view1;
    }

    private void N2(int v, int v1) {
        c linearLayoutManager$c0 = this.t;
        linearLayoutManager$c0.c = this.u.i() - v1;
        this.t.e = this.x ? -1 : 1;
        this.t.d = v;
        this.t.f = 1;
        this.t.b = v1;
        this.t.g = 0x80000000;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void O0(AccessibilityEvent accessibilityEvent0) {
        super.O0(accessibilityEvent0);
        if(this.O() > 0) {
            accessibilityEvent0.setFromIndex(this.d2());
            accessibilityEvent0.setToIndex(this.g2());
        }
    }

    private void O2(androidx.recyclerview.widget.LinearLayoutManager.a linearLayoutManager$a0) {
        this.N2(linearLayoutManager$a0.b, linearLayoutManager$a0.c);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean P1() {
        return this.D == null && this.v == this.y;
    }

    private void P2(int v, int v1) {
        c linearLayoutManager$c0 = this.t;
        linearLayoutManager$c0.c = v1 - this.u.m();
        this.t.d = v;
        this.t.e = this.x ? 1 : -1;
        this.t.f = -1;
        this.t.b = v1;
        this.t.g = 0x80000000;
    }

    protected void Q1(y recyclerView$y0, int[] arr_v) {
        int v1;
        int v = this.s2(recyclerView$y0);
        if(this.t.f == -1) {
            v1 = 0;
        }
        else {
            v1 = v;
            v = 0;
        }
        arr_v[0] = v;
        arr_v[1] = v1;
    }

    private void Q2(androidx.recyclerview.widget.LinearLayoutManager.a linearLayoutManager$a0) {
        this.P2(linearLayoutManager$a0.b, linearLayoutManager$a0.c);
    }

    void R1(y recyclerView$y0, c linearLayoutManager$c0, androidx.recyclerview.widget.RecyclerView.o.c recyclerView$o$c0) {
        int v = linearLayoutManager$c0.d;
        if(v >= 0 && v < recyclerView$y0.b()) {
            recyclerView$o$c0.a(v, Math.max(0, linearLayoutManager$c0.g));
        }
    }

    private int S1(y recyclerView$y0) {
        if(this.O() == 0) {
            return 0;
        }
        this.X1();
        return m.a(recyclerView$y0, this.u, this.c2(!this.z, true), this.b2(!this.z, true), this, this.z);
    }

    private int T1(y recyclerView$y0) {
        if(this.O() == 0) {
            return 0;
        }
        this.X1();
        return m.b(recyclerView$y0, this.u, this.c2(!this.z, true), this.b2(!this.z, true), this, this.z, this.x);
    }

    private int U1(y recyclerView$y0) {
        if(this.O() == 0) {
            return 0;
        }
        this.X1();
        return m.c(recyclerView$y0, this.u, this.c2(!this.z, true), this.b2(!this.z, true), this, this.z);
    }

    int V1(int v) {
        switch(v) {
            case 1: {
                if(this.s == 1) {
                    return -1;
                }
                return this.u2() ? 1 : -1;
            }
            case 2: {
                if(this.s == 1) {
                    return 1;
                }
                return this.u2() ? -1 : 1;
            }
            case 17: {
                return this.s == 0 ? -1 : 0x80000000;
            }
            case 33: {
                return this.s == 1 ? -1 : 0x80000000;
            }
            case 66: {
                return this.s == 0 ? 1 : 0x80000000;
            }
            case 130: {
                return this.s == 1 ? 1 : 0x80000000;
            }
            default: {
                return 0x80000000;
            }
        }
    }

    c W1() {
        return new c();
    }

    void X1() {
        if(this.t == null) {
            this.t = this.W1();
        }
    }

    int Y1(u recyclerView$u0, c linearLayoutManager$c0, y recyclerView$y0, boolean z) {
        int v = linearLayoutManager$c0.c;
        int v1 = linearLayoutManager$c0.g;
        if(v1 != 0x80000000) {
            if(v < 0) {
                linearLayoutManager$c0.g = v1 + v;
            }
            this.z2(recyclerView$u0, linearLayoutManager$c0);
        }
        int v2 = linearLayoutManager$c0.c + linearLayoutManager$c0.h;
        androidx.recyclerview.widget.LinearLayoutManager.b linearLayoutManager$b0 = this.F;
        while((linearLayoutManager$c0.m || v2 > 0) && linearLayoutManager$c0.c(recyclerView$y0)) {
            linearLayoutManager$b0.a();
            this.w2(recyclerView$u0, recyclerView$y0, linearLayoutManager$c0, linearLayoutManager$b0);
            if(linearLayoutManager$b0.b) {
                break;
            }
            linearLayoutManager$c0.b += linearLayoutManager$b0.a * linearLayoutManager$c0.f;
            if(!linearLayoutManager$b0.c || linearLayoutManager$c0.l != null || !recyclerView$y0.e()) {
                linearLayoutManager$c0.c -= linearLayoutManager$b0.a;
                v2 -= linearLayoutManager$b0.a;
            }
            int v3 = linearLayoutManager$c0.g;
            if(v3 != 0x80000000) {
                int v4 = v3 + linearLayoutManager$b0.a;
                linearLayoutManager$c0.g = v4;
                int v5 = linearLayoutManager$c0.c;
                if(v5 < 0) {
                    linearLayoutManager$c0.g = v4 + v5;
                }
                this.z2(recyclerView$u0, linearLayoutManager$c0);
            }
            if(z && linearLayoutManager$b0.d) {
                break;
            }
        }
        return v - linearLayoutManager$c0.c;
    }

    private View Z1() {
        return this.h2(0, this.O());
    }

    private View a2(u recyclerView$u0, y recyclerView$y0) {
        return this.l2(recyclerView$u0, recyclerView$y0, 0, this.O(), recyclerView$y0.b());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void b1(u recyclerView$u0, y recyclerView$y0) {
        int v19;
        int v18;
        int v17;
        int v11;
        int v8;
        int v6;
        int v5;
        int v = -1;
        if((this.D != null || this.A != -1) && recyclerView$y0.b() == 0) {
            this.o1(recyclerView$u0);
            return;
        }
        if(this.D != null && this.D.a()) {
            this.A = this.D.f;
        }
        this.X1();
        this.t.a = false;
        this.E2();
        View view0 = this.a0();
        androidx.recyclerview.widget.LinearLayoutManager.a linearLayoutManager$a0 = this.E;
        if(!linearLayoutManager$a0.e || this.A != -1 || this.D != null) {
            linearLayoutManager$a0.e();
            this.E.d = this.x ^ this.y;
            this.L2(recyclerView$u0, recyclerView$y0, this.E);
            this.E.e = true;
        }
        else if(view0 != null && (this.u.g(view0) >= this.u.i() || this.u.d(view0) <= this.u.m())) {
            int v1 = this.l0(view0);
            this.E.c(view0, v1);
        }
        this.t.f = this.t.k < 0 ? -1 : 1;
        int[] arr_v = this.H;
        arr_v[0] = 0;
        arr_v[1] = 0;
        this.Q1(recyclerView$y0, arr_v);
        int v2 = Math.max(0, this.H[0]) + this.u.m();
        int v3 = Math.max(0, this.H[1]) + this.u.j();
        if(recyclerView$y0.e()) {
            int v4 = this.A;
            if(v4 != -1 && this.B != 0x80000000) {
                View view1 = this.H(v4);
                if(view1 != null) {
                    if(this.x) {
                        v5 = this.u.i() - this.u.d(view1);
                        v6 = this.B;
                    }
                    else {
                        v6 = this.u.g(view1) - this.u.m();
                        v5 = this.B;
                    }
                    int v7 = v5 - v6;
                    if(v7 > 0) {
                        v2 += v7;
                    }
                    else {
                        v3 -= v7;
                    }
                }
            }
        }
        androidx.recyclerview.widget.LinearLayoutManager.a linearLayoutManager$a1 = this.E;
        if(!linearLayoutManager$a1.d) {
            if(!this.x) {
                v = 1;
            }
        }
        else if(this.x) {
            v = 1;
        }
        this.y2(recyclerView$u0, recyclerView$y0, linearLayoutManager$a1, v);
        this.B(recyclerView$u0);
        c linearLayoutManager$c0 = this.t;
        linearLayoutManager$c0.m = this.D2();
        this.t.j = recyclerView$y0.e();
        this.t.i = 0;
        androidx.recyclerview.widget.LinearLayoutManager.a linearLayoutManager$a2 = this.E;
        if(linearLayoutManager$a2.d) {
            this.Q2(linearLayoutManager$a2);
            this.t.h = v2;
            this.Y1(recyclerView$u0, this.t, recyclerView$y0, false);
            v8 = this.t.b;
            int v9 = this.t.d;
            int v10 = this.t.c;
            if(v10 > 0) {
                v3 += v10;
            }
            this.O2(this.E);
            this.t.h = v3;
            this.t.d += this.t.e;
            this.Y1(recyclerView$u0, this.t, recyclerView$y0, false);
            v11 = this.t.b;
            int v12 = this.t.c;
            if(v12 > 0) {
                this.P2(v9, v8);
                this.t.h = v12;
                this.Y1(recyclerView$u0, this.t, recyclerView$y0, false);
                v8 = this.t.b;
            }
        }
        else {
            this.O2(linearLayoutManager$a2);
            this.t.h = v3;
            this.Y1(recyclerView$u0, this.t, recyclerView$y0, false);
            v11 = this.t.b;
            int v13 = this.t.d;
            int v14 = this.t.c;
            if(v14 > 0) {
                v2 += v14;
            }
            this.Q2(this.E);
            this.t.h = v2;
            this.t.d += this.t.e;
            this.Y1(recyclerView$u0, this.t, recyclerView$y0, false);
            v8 = this.t.b;
            int v15 = this.t.c;
            if(v15 > 0) {
                this.N2(v13, v11);
                this.t.h = v15;
                this.Y1(recyclerView$u0, this.t, recyclerView$y0, false);
                v11 = this.t.b;
            }
        }
        if(this.O() > 0) {
            if((this.x ^ this.y) == 0) {
                int v20 = this.p2(v8, recyclerView$u0, recyclerView$y0, true);
                v17 = v8 + v20;
                v18 = v11 + v20;
                v19 = this.o2(v18, recyclerView$u0, recyclerView$y0, false);
            }
            else {
                int v16 = this.o2(v11, recyclerView$u0, recyclerView$y0, true);
                v17 = v8 + v16;
                v18 = v11 + v16;
                v19 = this.p2(v17, recyclerView$u0, recyclerView$y0, false);
            }
            v8 = v17 + v19;
            v11 = v18 + v19;
        }
        this.x2(recyclerView$u0, recyclerView$y0, v8, v11);
        if(recyclerView$y0.e()) {
            this.E.e();
        }
        else {
            this.u.s();
        }
        this.v = this.y;
    }

    // 去混淆评级： 低(20)
    View b2(boolean z, boolean z1) {
        return this.x ? this.i2(0, this.O(), z, z1) : this.i2(this.O() - 1, -1, z, z1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$x$b
    public PointF c(int v) {
        if(this.O() == 0) {
            return null;
        }
        boolean z = false;
        int v1 = 1;
        if(v < this.l0(this.N(0))) {
            z = true;
        }
        if(z != this.x) {
            v1 = -1;
        }
        return this.s == 0 ? new PointF(((float)v1), 0.0f) : new PointF(0.0f, ((float)v1));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void c1(y recyclerView$y0) {
        super.c1(recyclerView$y0);
        this.D = null;
        this.A = -1;
        this.B = 0x80000000;
        this.E.e();
    }

    // 去混淆评级： 低(20)
    View c2(boolean z, boolean z1) {
        return this.x ? this.i2(this.O() - 1, -1, z, z1) : this.i2(0, this.O(), z, z1);
    }

    public int d2() {
        View view0 = this.i2(0, this.O(), false, true);
        return view0 == null ? -1 : this.l0(view0);
    }

    private View e2() {
        return this.h2(this.O() - 1, -1);
    }

    private View f2(u recyclerView$u0, y recyclerView$y0) {
        return this.l2(recyclerView$u0, recyclerView$y0, this.O() - 1, -1, recyclerView$y0.b());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void g1(Parcelable parcelable0) {
        if(parcelable0 instanceof SavedState) {
            this.D = (SavedState)parcelable0;
            this.x1();
        }
    }

    public int g2() {
        View view0 = this.i2(this.O() - 1, -1, false, true);
        return view0 == null ? -1 : this.l0(view0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public Parcelable h1() {
        if(this.D != null) {
            return new SavedState(this.D);
        }
        Parcelable parcelable0 = new SavedState();
        if(this.O() > 0) {
            this.X1();
            int v = this.v ^ this.x;
            parcelable0.h = v;
            if(v != 0) {
                View view0 = this.q2();
                parcelable0.g = this.u.i() - this.u.d(view0);
                parcelable0.f = this.l0(view0);
                return parcelable0;
            }
            View view1 = this.r2();
            parcelable0.f = this.l0(view1);
            parcelable0.g = this.u.g(view1) - this.u.m();
            return parcelable0;
        }
        ((SavedState)parcelable0).b();
        return parcelable0;
    }

    View h2(int v, int v1) {
        this.X1();
        if(v1 > v || v1 < v) {
            if(this.u.g(this.N(v)) < this.u.m()) {
                return this.s == 0 ? this.e.a(v, v1, 0x4104, 0x4004) : this.f.a(v, v1, 0x4104, 0x4004);
            }
            return this.s == 0 ? this.e.a(v, v1, 0x1041, 0x1001) : this.f.a(v, v1, 0x1041, 0x1001);
        }
        return this.N(v);
    }

    View i2(int v, int v1, boolean z, boolean z1) {
        this.X1();
        int v2 = 320;
        int v3 = z ? 0x6003 : 320;
        if(!z1) {
            v2 = 0;
        }
        return this.s == 0 ? this.e.a(v, v1, v3, v2) : this.f.a(v, v1, v3, v2);
    }

    // 去混淆评级： 低(20)
    private View j2() {
        return this.x ? this.Z1() : this.e2();
    }

    // 去混淆评级： 低(20)
    private View k2() {
        return this.x ? this.e2() : this.Z1();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void l(String s) {
        if(this.D == null) {
            super.l(s);
        }
    }

    View l2(u recyclerView$u0, y recyclerView$y0, int v, int v1, int v2) {
        this.X1();
        int v3 = this.u.m();
        int v4 = this.u.i();
        int v5 = v1 <= v ? -1 : 1;
        View view0 = null;
        View view1 = null;
        while(v != v1) {
            View view2 = this.N(v);
            int v6 = this.l0(view2);
            if(v6 >= 0 && v6 < v2) {
                if(!((p)view2.getLayoutParams()).c()) {
                    if(this.u.g(view2) < v4 && this.u.d(view2) >= v3) {
                        return view2;
                    }
                    if(view0 == null) {
                        view0 = view2;
                    }
                }
                else if(view1 == null) {
                    view1 = view2;
                }
            }
            v += v5;
        }
        return view0 == null ? view1 : view0;
    }

    // 去混淆评级： 低(20)
    private View m2(u recyclerView$u0, y recyclerView$y0) {
        return this.x ? this.a2(recyclerView$u0, recyclerView$y0) : this.f2(recyclerView$u0, recyclerView$y0);
    }

    // 去混淆评级： 低(20)
    private View n2(u recyclerView$u0, y recyclerView$y0) {
        return this.x ? this.f2(recyclerView$u0, recyclerView$y0) : this.a2(recyclerView$u0, recyclerView$y0);
    }

    private int o2(int v, u recyclerView$u0, y recyclerView$y0, boolean z) {
        int v1 = this.u.i() - v;
        if(v1 > 0) {
            int v2 = this.F2(-v1, recyclerView$u0, recyclerView$y0);
            if(z) {
                int v3 = this.u.i() - (v - v2);
                if(v3 > 0) {
                    this.u.r(v3);
                    return v3 - v2;
                }
            }
            return -v2;
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean p() {
        return this.s == 0;
    }

    private int p2(int v, u recyclerView$u0, y recyclerView$y0, boolean z) {
        int v1 = v - this.u.m();
        if(v1 > 0) {
            int v2 = -this.F2(v1, recyclerView$u0, recyclerView$y0);
            if(z) {
                int v3 = v + v2 - this.u.m();
                if(v3 > 0) {
                    this.u.r(-v3);
                    return v2 - v3;
                }
            }
            return v2;
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean q() {
        return this.s == 1;
    }

    // 去混淆评级： 低(20)
    private View q2() {
        return this.x ? this.N(0) : this.N(this.O() - 1);
    }

    // 去混淆评级： 低(20)
    private View r2() {
        return this.x ? this.N(this.O() - 1) : this.N(0);
    }

    // 去混淆评级： 低(20)
    protected int s2(y recyclerView$y0) {
        return recyclerView$y0.d() ? this.u.n() : 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void t(int v, int v1, y recyclerView$y0, androidx.recyclerview.widget.RecyclerView.o.c recyclerView$o$c0) {
        if(this.s != 0) {
            v = v1;
        }
        if(this.O() != 0 && v != 0) {
            this.X1();
            this.M2((v <= 0 ? -1 : 1), Math.abs(v), true, recyclerView$y0);
            this.R1(recyclerView$y0, this.t, recyclerView$o$c0);
        }
    }

    public int t2() {
        return this.s;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void u(int v, androidx.recyclerview.widget.RecyclerView.o.c recyclerView$o$c0) {
        int v2;
        boolean z;
        int v1 = -1;
        if(this.D == null || !this.D.a()) {
            this.E2();
            z = this.x;
            v2 = this.A;
            if(v2 == -1) {
                v2 = z ? v - 1 : 0;
            }
        }
        else {
            z = this.D.h;
            v2 = this.D.f;
        }
        if(!z) {
            v1 = 1;
        }
        for(int v3 = 0; v3 < this.G && v2 >= 0 && v2 < v; ++v3) {
            recyclerView$o$c0.a(v2, 0);
            v2 += v1;
        }
    }

    protected boolean u2() {
        return this.d0() == 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int v(y recyclerView$y0) {
        return this.S1(recyclerView$y0);
    }

    public boolean v2() {
        return this.z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int w(y recyclerView$y0) {
        return this.T1(recyclerView$y0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean w0() {
        return true;
    }

    void w2(u recyclerView$u0, y recyclerView$y0, c linearLayoutManager$c0, androidx.recyclerview.widget.LinearLayoutManager.b linearLayoutManager$b0) {
        int v4;
        int v3;
        int v2;
        int v1;
        int v;
        View view0 = linearLayoutManager$c0.d(recyclerView$u0);
        if(view0 == null) {
            linearLayoutManager$b0.b = true;
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(linearLayoutManager$c0.l != null) {
            if(this.x == (linearLayoutManager$c0.f == -1)) {
                this.g(view0);
            }
            else {
                this.h(view0, 0);
            }
        }
        else if(this.x == (linearLayoutManager$c0.f == -1)) {
            this.i(view0);
        }
        else {
            this.j(view0, 0);
        }
        this.E0(view0, 0, 0);
        linearLayoutManager$b0.a = this.u.e(view0);
        if(this.s == 1) {
            if(this.u2()) {
                v = this.s0() - this.j0();
                v1 = v - this.u.f(view0);
            }
            else {
                v1 = this.i0();
                v = this.u.f(view0) + v1;
            }
            if(linearLayoutManager$c0.f == -1) {
                v2 = linearLayoutManager$c0.b;
                v3 = v;
                v4 = linearLayoutManager$c0.b - linearLayoutManager$b0.a;
            }
            else {
                v4 = linearLayoutManager$c0.b;
                v3 = v;
                v2 = linearLayoutManager$b0.a + linearLayoutManager$c0.b;
            }
        }
        else {
            int v5 = this.k0();
            int v6 = this.u.f(view0) + v5;
            if(linearLayoutManager$c0.f == -1) {
                v3 = linearLayoutManager$c0.b;
                v4 = v5;
                v2 = v6;
                v1 = linearLayoutManager$c0.b - linearLayoutManager$b0.a;
            }
            else {
                v4 = v5;
                v3 = linearLayoutManager$b0.a + linearLayoutManager$c0.b;
                v2 = v6;
                v1 = linearLayoutManager$c0.b;
            }
        }
        this.D0(view0, v1, v4, v3, v2);
        if(((p)viewGroup$LayoutParams0).c() || ((p)viewGroup$LayoutParams0).b()) {
            linearLayoutManager$b0.c = true;
        }
        linearLayoutManager$b0.d = view0.hasFocusable();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int x(y recyclerView$y0) {
        return this.U1(recyclerView$y0);
    }

    private void x2(u recyclerView$u0, y recyclerView$y0, int v, int v1) {
        if(recyclerView$y0.g() && this.O() != 0 && !recyclerView$y0.e() && this.P1()) {
            List list0 = recyclerView$u0.k();
            int v2 = list0.size();
            int v3 = this.l0(this.N(0));
            int v5 = 0;
            int v6 = 0;
            for(int v4 = 0; v4 < v2; ++v4) {
                B recyclerView$B0 = (B)list0.get(v4);
                if(!recyclerView$B0.v()) {
                    if(recyclerView$B0.m() < v3 == this.x) {
                        v6 += this.u.e(recyclerView$B0.a);
                    }
                    else {
                        v5 += this.u.e(recyclerView$B0.a);
                    }
                }
            }
            this.t.l = list0;
            if(v5 > 0) {
                this.P2(this.l0(this.r2()), v);
                this.t.h = v5;
                this.t.c = 0;
                this.t.a();
                this.Y1(recyclerView$u0, this.t, recyclerView$y0, false);
            }
            if(v6 > 0) {
                this.N2(this.l0(this.q2()), v1);
                this.t.h = v6;
                this.t.c = 0;
                this.t.a();
                this.Y1(recyclerView$u0, this.t, recyclerView$y0, false);
            }
            this.t.l = null;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int y(y recyclerView$y0) {
        return this.S1(recyclerView$y0);
    }

    void y2(u recyclerView$u0, y recyclerView$y0, androidx.recyclerview.widget.LinearLayoutManager.a linearLayoutManager$a0, int v) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int z(y recyclerView$y0) {
        return this.T1(recyclerView$y0);
    }

    private void z2(u recyclerView$u0, c linearLayoutManager$c0) {
        if(linearLayoutManager$c0.a && !linearLayoutManager$c0.m) {
            int v = linearLayoutManager$c0.g;
            int v1 = linearLayoutManager$c0.i;
            if(linearLayoutManager$c0.f == -1) {
                this.B2(recyclerView$u0, v, v1);
                return;
            }
            this.C2(recyclerView$u0, v, v1);
        }
    }
}

