package androidx.recyclerview.widget;

import C.z.f;
import C.z;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    public static final class a extends c {
        @Override  // androidx.recyclerview.widget.GridLayoutManager$c
        public int e(int v, int v1) {
            return v % v1;
        }

        @Override  // androidx.recyclerview.widget.GridLayoutManager$c
        public int f(int v) {
            return 1;
        }
    }

    public static class b extends p {
        int e;
        int f;

        public b(int v, int v1) {
            super(v, v1);
            this.e = -1;
            this.f = 0;
        }

        public b(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.e = -1;
            this.f = 0;
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }
    }

    public static abstract class c {
        final SparseIntArray a;
        final SparseIntArray b;
        private boolean c;
        private boolean d;

        public c() {
            this.a = new SparseIntArray();
            this.b = new SparseIntArray();
            this.c = false;
            this.d = false;
        }

        static int a(SparseIntArray sparseIntArray0, int v) {
            int v1 = sparseIntArray0.size() - 1;
            int v2 = 0;
            while(v2 <= v1) {
                int v3 = v2 + v1 >>> 1;
                if(sparseIntArray0.keyAt(v3) < v) {
                    v2 = v3 + 1;
                }
                else {
                    v1 = v3 - 1;
                }
            }
            return v2 - 1 < 0 || v2 - 1 >= sparseIntArray0.size() ? -1 : sparseIntArray0.keyAt(v2 - 1);
        }

        int b(int v, int v1) {
            if(!this.d) {
                return this.d(v, v1);
            }
            int v2 = this.b.get(v, -1);
            if(v2 != -1) {
                return v2;
            }
            int v3 = this.d(v, v1);
            this.b.put(v, v3);
            return v3;
        }

        int c(int v, int v1) {
            if(!this.c) {
                return this.e(v, v1);
            }
            int v2 = this.a.get(v, -1);
            if(v2 != -1) {
                return v2;
            }
            int v3 = this.e(v, v1);
            this.a.put(v, v3);
            return v3;
        }

        public int d(int v, int v1) {
            int v5;
            int v4;
            int v3;
            if(this.d) {
                int v2 = c.a(this.b, v);
                if(v2 == -1) {
                    v3 = 0;
                    v4 = 0;
                    v5 = 0;
                }
                else {
                    v3 = this.b.get(v2);
                    v4 = v2 + 1;
                    v5 = this.c(v2, v1) + this.f(v2);
                    if(v5 == v1) {
                        ++v3;
                        v5 = 0;
                    }
                }
            }
            else {
                v3 = 0;
                v4 = 0;
                v5 = 0;
            }
            int v6 = this.f(v);
            while(v4 < v) {
                int v7 = this.f(v4);
                v5 += v7;
                if(v5 == v1) {
                    ++v3;
                    v5 = 0;
                }
                else if(v5 > v1) {
                    ++v3;
                    v5 = v7;
                }
                ++v4;
            }
            return v5 + v6 <= v1 ? v3 : v3 + 1;
        }

        public abstract int e(int arg1, int arg2);

        public abstract int f(int arg1);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }
    }

    boolean I;
    int J;
    int[] K;
    View[] L;
    final SparseIntArray M;
    final SparseIntArray N;
    c O;
    final Rect P;
    private boolean Q;

    public GridLayoutManager(Context context0, int v, int v1, boolean z) {
        super(context0, v1, z);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        this.h3(v);
    }

    public GridLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        this.h3(o.m0(context0, attributeSet0, v, v1).b);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int A(y recyclerView$y0) {
        return this.Q ? this.X2(recyclerView$y0) : super.A(recyclerView$y0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int A1(int v, u recyclerView$u0, y recyclerView$y0) {
        this.i3();
        this.Z2();
        return super.A1(v, recyclerView$u0, recyclerView$y0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int C1(int v, u recyclerView$u0, y recyclerView$y0) {
        this.i3();
        this.Z2();
        return super.C1(v, recyclerView$u0, recyclerView$y0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void G1(Rect rect0, int v, int v1) {
        int v5;
        int v4;
        if(this.K == null) {
            super.G1(rect0, v, v1);
        }
        int v2 = this.i0() + this.j0();
        int v3 = this.k0() + this.h0();
        if(this.s == 1) {
            v4 = o.s(v1, rect0.height() + v3, this.f0());
            v5 = o.s(v, this.K[this.K.length - 1] + v2, this.g0());
        }
        else {
            v5 = o.s(v, rect0.width() + v2, this.g0());
            v4 = o.s(v1, this.K[this.K.length - 1] + v3, this.f0());
        }
        this.F1(v5, v4);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public p I() {
        return this.s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void I2(boolean z) {
        if(z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.I2(false);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public p J(Context context0, AttributeSet attributeSet0) {
        return new b(context0, attributeSet0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public p K(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new b(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new b(viewGroup$LayoutParams0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public View N0(View view0, int v, u recyclerView$u0, y recyclerView$y0) {
        int v17;
        int v16;
        int v15;
        int v14;
        View view5;
        int v5;
        int v4;
        int v3;
        View view1 = this.G(view0);
        View view2 = null;
        if(view1 == null) {
            return null;
        }
        b gridLayoutManager$b0 = (b)view1.getLayoutParams();
        int v1 = gridLayoutManager$b0.e;
        int v2 = gridLayoutManager$b0.f + v1;
        if(super.N0(view0, v, recyclerView$u0, recyclerView$y0) == null) {
            return null;
        }
        if(this.V1(v) == 1 == this.x) {
            v4 = this.O();
            v5 = 1;
            v3 = 0;
        }
        else {
            v3 = this.O() - 1;
            v4 = -1;
            v5 = -1;
        }
        int v6 = this.s != 1 || !this.u2() ? 0 : 1;
        int v7 = this.b3(recyclerView$u0, recyclerView$y0, v3);
        int v8 = -1;
        int v9 = -1;
        int v10 = 0;
        int v11 = 0;
        int v12 = v3;
        View view3 = null;
        while(v12 != v4) {
            int v13 = this.b3(recyclerView$u0, recyclerView$y0, v12);
            View view4 = this.N(v12);
            if(view4 == view1) {
                break;
            }
            if(!view4.hasFocusable() || v13 == v7) {
                b gridLayoutManager$b1 = (b)view4.getLayoutParams();
                int v18 = gridLayoutManager$b1.e;
                int v19 = gridLayoutManager$b1.f + v18;
                if(view4.hasFocusable() && v18 == v1 && v19 == v2) {
                    return view4;
                }
                if((!view4.hasFocusable() || view2 != null) && (view4.hasFocusable() || view3 != null)) {
                    view5 = view3;
                    int v20 = Math.min(v19, v2) - Math.max(v18, v1);
                    if(view4.hasFocusable()) {
                        if(v20 <= v10 && (v20 != v10 || v6 != (v18 <= v8 ? 0 : 1))) {
                            v14 = v10;
                            v15 = v4;
                            v16 = v9;
                            v17 = v11;
                            goto label_95;
                        }
                        else {
                        label_49:
                            v14 = v10;
                            v15 = v4;
                            v16 = v9;
                            v17 = v11;
                            goto label_73;
                        }
                        goto label_59;
                    }
                    else {
                    label_59:
                        if(view2 == null) {
                            v14 = v10;
                            v15 = v4;
                            int v21 = 1;
                            if(this.C0(view4, false, true)) {
                                v17 = v11;
                                if(v20 > v17) {
                                    v16 = v9;
                                    goto label_73;
                                }
                                else if(v20 == v17) {
                                    v16 = v9;
                                    if(v18 <= v16) {
                                        v21 = 0;
                                    }
                                    if(v6 == v21) {
                                    label_73:
                                        if(view4.hasFocusable()) {
                                            v8 = gridLayoutManager$b1.e;
                                            v9 = v16;
                                            v11 = v17;
                                            view3 = view5;
                                            view2 = view4;
                                            v10 = Math.min(v19, v2) - Math.max(v18, v1);
                                        }
                                        else {
                                            v11 = Math.min(v19, v2) - Math.max(v18, v1);
                                            v9 = gridLayoutManager$b1.e;
                                            v10 = v14;
                                            view3 = view4;
                                        }
                                        goto label_99;
                                    }
                                }
                                else {
                                    v16 = v9;
                                }
                            }
                            else {
                                v16 = v9;
                                v17 = v11;
                            }
                        }
                        else {
                            v14 = v10;
                            v15 = v4;
                            v16 = v9;
                            v17 = v11;
                        }
                    }
                }
                else {
                    view5 = view3;
                    goto label_49;
                }
            }
            else {
                if(view2 != null) {
                    break;
                }
                view5 = view3;
                v14 = v10;
                v15 = v4;
                v16 = v9;
                v17 = v11;
            }
        label_95:
            v9 = v16;
            v11 = v17;
            v10 = v14;
            view3 = view5;
        label_99:
            v12 += v5;
            v4 = v15;
        }
        return view2 == null ? view3 : view2;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public boolean P1() {
        return this.D == null && !this.I;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    void R1(y recyclerView$y0, androidx.recyclerview.widget.LinearLayoutManager.c linearLayoutManager$c0, androidx.recyclerview.widget.RecyclerView.o.c recyclerView$o$c0) {
        int v = this.J;
        for(int v1 = 0; v1 < this.J && linearLayoutManager$c0.c(recyclerView$y0) && v > 0; ++v1) {
            int v2 = linearLayoutManager$c0.d;
            recyclerView$o$c0.a(v2, Math.max(0, linearLayoutManager$c0.g));
            v -= this.O.f(v2);
            linearLayoutManager$c0.d += linearLayoutManager$c0.e;
        }
    }

    private void R2(u recyclerView$u0, y recyclerView$y0, int v, boolean z) {
        int v4;
        int v3;
        int v2;
        int v1 = 0;
        if(z) {
            v2 = 1;
            v3 = v;
            v4 = 0;
        }
        else {
            v4 = v - 1;
            v3 = -1;
            v2 = -1;
        }
        while(v4 != v3) {
            View view0 = this.L[v4];
            b gridLayoutManager$b0 = (b)view0.getLayoutParams();
            int v5 = this.d3(recyclerView$u0, recyclerView$y0, this.l0(view0));
            gridLayoutManager$b0.f = v5;
            gridLayoutManager$b0.e = v1;
            v1 += v5;
            v4 += v2;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int S(u recyclerView$u0, y recyclerView$y0) {
        if(this.s == 1) {
            return this.J;
        }
        return recyclerView$y0.b() >= 1 ? this.b3(recyclerView$u0, recyclerView$y0, recyclerView$y0.b() - 1) + 1 : 0;
    }

    private void S2() {
        int v = this.O();
        for(int v1 = 0; v1 < v; ++v1) {
            b gridLayoutManager$b0 = (b)this.N(v1).getLayoutParams();
            int v2 = gridLayoutManager$b0.a();
            this.M.put(v2, gridLayoutManager$b0.f());
            this.N.put(v2, gridLayoutManager$b0.e());
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void T0(u recyclerView$u0, y recyclerView$y0, View view0, z z0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof b)) {
            super.S0(view0, z0);
            return;
        }
        int v = this.b3(recyclerView$u0, recyclerView$y0, ((b)viewGroup$LayoutParams0).a());
        if(this.s == 0) {
            z0.p0(f.a(((b)viewGroup$LayoutParams0).e(), ((b)viewGroup$LayoutParams0).f(), v, 1, false, false));
            return;
        }
        z0.p0(f.a(v, 1, ((b)viewGroup$LayoutParams0).e(), ((b)viewGroup$LayoutParams0).f(), false, false));
    }

    private void T2(int v) {
        this.K = GridLayoutManager.U2(this.K, this.J, v);
    }

    static int[] U2(int[] arr_v, int v, int v1) {
        int v7;
        if(arr_v == null || arr_v.length != v + 1 || arr_v[arr_v.length - 1] != v1) {
            arr_v = new int[v + 1];
        }
        int v3 = 0;
        arr_v[0] = 0;
        int v4 = v1 / v;
        int v5 = v1 % v;
        int v6 = 0;
        for(int v2 = 1; v2 <= v; ++v2) {
            v3 += v5;
            if(v3 <= 0 || v - v3 >= v5) {
                v7 = v4;
            }
            else {
                v7 = v4 + 1;
                v3 -= v;
            }
            v6 += v7;
            arr_v[v2] = v6;
        }
        return arr_v;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void V0(RecyclerView recyclerView0, int v, int v1) {
        this.O.h();
        this.O.g();
    }

    private void V2() {
        this.M.clear();
        this.N.clear();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void W0(RecyclerView recyclerView0) {
        this.O.h();
        this.O.g();
    }

    private int W2(y recyclerView$y0) {
        if(this.O() != 0 && recyclerView$y0.b() != 0) {
            this.X1();
            boolean z = this.v2();
            View view0 = this.c2(!z, true);
            View view1 = this.b2(!z, true);
            if(view0 != null && view1 != null) {
                int v = this.O.b(this.l0(view0), this.J);
                int v1 = this.O.b(this.l0(view1), this.J);
                int v2 = this.O.b(recyclerView$y0.b() - 1, this.J);
                int v3 = this.x ? Math.max(0, v2 + 1 - Math.max(v, v1) - 1) : Math.max(0, Math.min(v, v1));
                if(!z) {
                    return v3;
                }
                int v4 = this.u.d(view1);
                int v5 = this.u.g(view0);
                int v6 = this.O.b(this.l0(view0), this.J);
                return Math.round(((float)v3) * (((float)Math.abs(v4 - v5)) / ((float)(this.O.b(this.l0(view1), this.J) - v6 + 1))) + ((float)(this.u.m() - this.u.g(view0))));
            }
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void X0(RecyclerView recyclerView0, int v, int v1, int v2) {
        this.O.h();
        this.O.g();
    }

    private int X2(y recyclerView$y0) {
        if(this.O() != 0 && recyclerView$y0.b() != 0) {
            this.X1();
            View view0 = this.c2(!this.v2(), true);
            View view1 = this.b2(!this.v2(), true);
            if(view0 != null && view1 != null) {
                if(!this.v2()) {
                    return this.O.b(recyclerView$y0.b() - 1, this.J) + 1;
                }
                int v = this.u.d(view1);
                int v1 = this.u.g(view0);
                int v2 = this.O.b(this.l0(view0), this.J);
                return (int)(((float)(v - v1)) / ((float)(this.O.b(this.l0(view1), this.J) - v2 + 1)) * ((float)(this.O.b(recyclerView$y0.b() - 1, this.J) + 1)));
            }
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void Y0(RecyclerView recyclerView0, int v, int v1) {
        this.O.h();
        this.O.g();
    }

    private void Y2(u recyclerView$u0, y recyclerView$y0, androidx.recyclerview.widget.LinearLayoutManager.a linearLayoutManager$a0, int v) {
        int v1 = this.c3(recyclerView$u0, recyclerView$y0, linearLayoutManager$a0.b);
        if(v == 1) {
            while(v1 > 0) {
                int v2 = linearLayoutManager$a0.b;
                if(v2 <= 0) {
                    return;
                }
                linearLayoutManager$a0.b = v2 - 1;
                v1 = this.c3(recyclerView$u0, recyclerView$y0, v2 - 1);
            }
        }
        else {
            int v3 = recyclerView$y0.b();
            int v4 = linearLayoutManager$a0.b;
            while(v4 < v3 - 1) {
                int v5 = this.c3(recyclerView$u0, recyclerView$y0, v4 + 1);
                if(v5 <= v1) {
                    break;
                }
                ++v4;
                v1 = v5;
            }
            linearLayoutManager$a0.b = v4;
        }
    }

    private void Z2() {
        if(this.L == null || this.L.length != this.J) {
            this.L = new View[this.J];
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void a1(RecyclerView recyclerView0, int v, int v1, Object object0) {
        this.O.h();
        this.O.g();
    }

    int a3(int v, int v1) {
        return this.s != 1 || !this.u2() ? this.K[v1 + v] - this.K[v] : this.K[this.J - v] - this.K[this.J - v - v1];
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void b1(u recyclerView$u0, y recyclerView$y0) {
        if(recyclerView$y0.e()) {
            this.S2();
        }
        super.b1(recyclerView$u0, recyclerView$y0);
        this.V2();
    }

    private int b3(u recyclerView$u0, y recyclerView$y0, int v) {
        if(!recyclerView$y0.e()) {
            return this.O.b(v, this.J);
        }
        int v1 = recyclerView$u0.f(v);
        if(v1 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + v);
            return 0;
        }
        return this.O.b(v1, this.J);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void c1(y recyclerView$y0) {
        super.c1(recyclerView$y0);
        this.I = false;
    }

    private int c3(u recyclerView$u0, y recyclerView$y0, int v) {
        if(!recyclerView$y0.e()) {
            return this.O.c(v, this.J);
        }
        int v1 = this.N.get(v, -1);
        if(v1 != -1) {
            return v1;
        }
        int v2 = recyclerView$u0.f(v);
        if(v2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + v);
            return 0;
        }
        return this.O.c(v2, this.J);
    }

    private int d3(u recyclerView$u0, y recyclerView$y0, int v) {
        if(!recyclerView$y0.e()) {
            return this.O.f(v);
        }
        int v1 = this.M.get(v, -1);
        if(v1 != -1) {
            return v1;
        }
        int v2 = recyclerView$u0.f(v);
        if(v2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + v);
            return 1;
        }
        return this.O.f(v2);
    }

    private void e3(float f, int v) {
        this.T2(Math.max(Math.round(f * ((float)this.J)), v));
    }

    private void f3(View view0, int v, boolean z) {
        int v5;
        int v4;
        b gridLayoutManager$b0 = (b)view0.getLayoutParams();
        int v1 = gridLayoutManager$b0.b.top + gridLayoutManager$b0.b.bottom + gridLayoutManager$b0.topMargin + gridLayoutManager$b0.bottomMargin;
        int v2 = gridLayoutManager$b0.b.left + gridLayoutManager$b0.b.right + gridLayoutManager$b0.leftMargin + gridLayoutManager$b0.rightMargin;
        int v3 = this.a3(gridLayoutManager$b0.e, gridLayoutManager$b0.f);
        if(this.s == 1) {
            v4 = o.P(v3, v, v2, gridLayoutManager$b0.width, false);
            v5 = o.P(this.u.n(), this.c0(), v1, gridLayoutManager$b0.height, true);
        }
        else {
            v5 = o.P(v3, v, v1, gridLayoutManager$b0.height, false);
            v4 = o.P(this.u.n(), this.t0(), v2, gridLayoutManager$b0.width, true);
        }
        this.g3(view0, v4, v5, z);
    }

    private void g3(View view0, int v, int v1, boolean z) {
        p recyclerView$p0 = (p)view0.getLayoutParams();
        if((z ? this.L1(view0, v, v1, recyclerView$p0) : this.J1(view0, v, v1, recyclerView$p0))) {
            view0.measure(v, v1);
        }
    }

    public void h3(int v) {
        if(v == this.J) {
            return;
        }
        this.I = true;
        if(v < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + v);
        }
        this.J = v;
        this.O.h();
        this.x1();
    }

    private void i3() {
        int v1;
        int v;
        if(this.t2() == 1) {
            v = this.s0() - this.j0();
            v1 = this.i0();
        }
        else {
            v = this.b0() - this.h0();
            v1 = this.k0();
        }
        this.T2(v - v1);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
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
            if(v6 >= 0 && v6 < v2 && this.c3(recyclerView$u0, recyclerView$y0, v6) == 0) {
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

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int o0(u recyclerView$u0, y recyclerView$y0) {
        if(this.s == 0) {
            return this.J;
        }
        return recyclerView$y0.b() >= 1 ? this.b3(recyclerView$u0, recyclerView$y0, recyclerView$y0.b() - 1) + 1 : 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean r(p recyclerView$p0) {
        return recyclerView$p0 instanceof b;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int w(y recyclerView$y0) {
        return this.Q ? this.W2(recyclerView$y0) : super.w(recyclerView$y0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    void w2(u recyclerView$u0, y recyclerView$y0, androidx.recyclerview.widget.LinearLayoutManager.c linearLayoutManager$c0, androidx.recyclerview.widget.LinearLayoutManager.b linearLayoutManager$b0) {
        int v31;
        int v29;
        int v28;
        int v27;
        int v24;
        int v23;
        int v22;
        int v21;
        int v20;
        int v19;
        int v18;
        int v16;
        int v15;
        int v = this.u.l();
        int v1 = this.O() <= 0 ? 0 : this.K[this.J];
        if(v != 0x40000000) {
            this.i3();
        }
        boolean z = linearLayoutManager$c0.e == 1;
        int v2 = z ? this.J : this.c3(recyclerView$u0, recyclerView$y0, linearLayoutManager$c0.d) + this.d3(recyclerView$u0, recyclerView$y0, linearLayoutManager$c0.d);
        int v3;
        for(v3 = 0; v3 < this.J && linearLayoutManager$c0.c(recyclerView$y0) && v2 > 0; ++v3) {
            int v4 = linearLayoutManager$c0.d;
            int v5 = this.d3(recyclerView$u0, recyclerView$y0, v4);
            if(v5 > this.J) {
                throw new IllegalArgumentException("Item at position " + v4 + " requires " + v5 + " spans but GridLayoutManager has only " + this.J + " spans.");
            }
            v2 -= v5;
            if(v2 < 0) {
                break;
            }
            View view0 = linearLayoutManager$c0.d(recyclerView$u0);
            if(view0 == null) {
                break;
            }
            this.L[v3] = view0;
        }
        if(v3 == 0) {
            linearLayoutManager$b0.b = true;
            return;
        }
        this.R2(recyclerView$u0, recyclerView$y0, v3, z);
        float f = 0.0f;
        int v7 = 0;
        for(int v6 = 0; v6 < v3; ++v6) {
            View view1 = this.L[v6];
            if(linearLayoutManager$c0.l == null) {
                if(z) {
                    this.i(view1);
                }
                else {
                    this.j(view1, 0);
                }
            }
            else if(z) {
                this.g(view1);
            }
            else {
                this.h(view1, 0);
            }
            this.o(view1, this.P);
            this.f3(view1, v, false);
            int v8 = this.u.e(view1);
            if(v8 > v7) {
                v7 = v8;
            }
            b gridLayoutManager$b0 = (b)view1.getLayoutParams();
            float f1 = ((float)this.u.f(view1)) * 1.0f / ((float)gridLayoutManager$b0.f);
            if(f1 > f) {
                f = f1;
            }
        }
        if(v != 0x40000000) {
            this.e3(f, v1);
            v7 = 0;
            for(int v9 = 0; v9 < v3; ++v9) {
                View view2 = this.L[v9];
                this.f3(view2, 0x40000000, true);
                int v10 = this.u.e(view2);
                if(v10 > v7) {
                    v7 = v10;
                }
            }
        }
        for(int v11 = 0; v11 < v3; ++v11) {
            View view3 = this.L[v11];
            if(this.u.e(view3) != v7) {
                b gridLayoutManager$b1 = (b)view3.getLayoutParams();
                int v12 = gridLayoutManager$b1.b.top + gridLayoutManager$b1.b.bottom + gridLayoutManager$b1.topMargin + gridLayoutManager$b1.bottomMargin;
                int v13 = gridLayoutManager$b1.b.left + gridLayoutManager$b1.b.right + gridLayoutManager$b1.leftMargin + gridLayoutManager$b1.rightMargin;
                int v14 = this.a3(gridLayoutManager$b1.e, gridLayoutManager$b1.f);
                if(this.s == 1) {
                    v15 = o.P(v14, 0x40000000, v13, gridLayoutManager$b1.width, false);
                    v16 = View.MeasureSpec.makeMeasureSpec(v7 - v12, 0x40000000);
                }
                else {
                    int v17 = View.MeasureSpec.makeMeasureSpec(v7 - v13, 0x40000000);
                    v16 = o.P(v14, 0x40000000, v12, gridLayoutManager$b1.height, false);
                    v15 = v17;
                }
                this.g3(view3, v15, v16, true);
            }
        }
        linearLayoutManager$b0.a = v7;
        if(this.s == 1) {
            if(linearLayoutManager$c0.f == -1) {
                v18 = linearLayoutManager$c0.b;
                v19 = v18 - v7;
            }
            else {
                v19 = linearLayoutManager$c0.b;
                v18 = v19 + v7;
            }
            v20 = v19;
            v21 = 0;
            v22 = 0;
        }
        else {
            if(linearLayoutManager$c0.f == -1) {
                v23 = linearLayoutManager$c0.b;
                v24 = v23 - v7;
            }
            else {
                v24 = linearLayoutManager$c0.b;
                v23 = v24 + v7;
            }
            v22 = v24;
            v20 = 0;
            v21 = v23;
            v18 = 0;
        }
        int v25 = 0;
        while(v25 < v3) {
            View view4 = this.L[v25];
            b gridLayoutManager$b2 = (b)view4.getLayoutParams();
            if(this.s == 1) {
                if(this.u2()) {
                    int v26 = this.i0() + this.K[this.J - gridLayoutManager$b2.e];
                    v22 = v26 - this.u.f(view4);
                    v27 = v18;
                    v28 = v26;
                    v29 = v20;
                    goto label_123;
                }
                else {
                    int v30 = this.i0() + this.K[gridLayoutManager$b2.e];
                    v27 = v18;
                    v31 = v30;
                    v29 = v20;
                    v28 = this.u.f(view4) + v30;
                    goto label_124;
                }
                goto label_119;
            }
            else {
            label_119:
                int v32 = this.k0() + this.K[gridLayoutManager$b2.e];
                v29 = v32;
                v28 = v21;
                v27 = this.u.f(view4) + v32;
            }
        label_123:
            v31 = v22;
        label_124:
            this.D0(view4, v31, v29, v28, v27);
            if(gridLayoutManager$b2.c() || gridLayoutManager$b2.b()) {
                linearLayoutManager$b0.c = true;
            }
            linearLayoutManager$b0.d |= view4.hasFocusable();
            ++v25;
            v18 = v27;
            v21 = v28;
            v20 = v29;
            v22 = v31;
        }
        Arrays.fill(this.L, null);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int x(y recyclerView$y0) {
        return this.Q ? this.X2(recyclerView$y0) : super.x(recyclerView$y0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    void y2(u recyclerView$u0, y recyclerView$y0, androidx.recyclerview.widget.LinearLayoutManager.a linearLayoutManager$a0, int v) {
        super.y2(recyclerView$u0, recyclerView$y0, linearLayoutManager$a0, v);
        this.i3();
        if(recyclerView$y0.b() > 0 && !recyclerView$y0.e()) {
            this.Y2(recyclerView$u0, recyclerView$y0, linearLayoutManager$a0, v);
        }
        this.Z2();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public int z(y recyclerView$y0) {
        return this.Q ? this.W2(recyclerView$y0) : super.z(recyclerView$y0);
    }
}

