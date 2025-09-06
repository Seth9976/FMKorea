package androidx.recyclerview.widget;

import C.z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends o implements b {
    static class LazySpanLookup {
        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            static final class a implements Parcelable.Creator {
                public FullSpanItem a(Parcel parcel0) {
                    return new FullSpanItem(parcel0);
                }

                public FullSpanItem[] b(int v) {
                    return new FullSpanItem[v];
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
            int[] h;
            boolean i;

            static {
                FullSpanItem.CREATOR = new a();
            }

            FullSpanItem() {
            }

            FullSpanItem(Parcel parcel0) {
                this.f = parcel0.readInt();
                this.g = parcel0.readInt();
                this.i = parcel0.readInt() == 1;
                int v = parcel0.readInt();
                if(v > 0) {
                    int[] arr_v = new int[v];
                    this.h = arr_v;
                    parcel0.readIntArray(arr_v);
                }
            }

            int a(int v) {
                return this.h == null ? 0 : this.h[v];
            }

            @Override  // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override
            public String toString() {
                return "FullSpanItem{mPosition=" + this.f + ", mGapDir=" + this.g + ", mHasUnwantedGapAfter=" + this.i + ", mGapPerSpan=" + Arrays.toString(this.h) + '}';
            }

            @Override  // android.os.Parcelable
            public void writeToParcel(Parcel parcel0, int v) {
                parcel0.writeInt(this.f);
                parcel0.writeInt(this.g);
                parcel0.writeInt(((int)this.i));
                int[] arr_v = this.h;
                if(arr_v != null && arr_v.length > 0) {
                    parcel0.writeInt(arr_v.length);
                    parcel0.writeIntArray(this.h);
                    return;
                }
                parcel0.writeInt(0);
            }
        }

        int[] a;
        List b;

        public void a(FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0) {
            if(this.b == null) {
                this.b = new ArrayList();
            }
            int v = this.b.size();
            for(int v1 = 0; v1 < v; ++v1) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 = (FullSpanItem)this.b.get(v1);
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.f == staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.f) {
                    this.b.remove(v1);
                }
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.f >= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.f) {
                    this.b.add(v1, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0);
                    return;
                }
            }
            this.b.add(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0);
        }

        void b() {
            int[] arr_v = this.a;
            if(arr_v != null) {
                Arrays.fill(arr_v, -1);
            }
            this.b = null;
        }

        void c(int v) {
            int[] arr_v = this.a;
            if(arr_v == null) {
                int[] arr_v1 = new int[Math.max(v, 10) + 1];
                this.a = arr_v1;
                Arrays.fill(arr_v1, -1);
                return;
            }
            if(v >= arr_v.length) {
                int[] arr_v2 = new int[this.o(v)];
                this.a = arr_v2;
                System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
                Arrays.fill(this.a, arr_v.length, this.a.length, -1);
            }
        }

        int d(int v) {
            List list0 = this.b;
            if(list0 != null) {
                for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                    if(((FullSpanItem)this.b.get(v1)).f >= v) {
                        this.b.remove(v1);
                    }
                }
            }
            return this.h(v);
        }

        public FullSpanItem e(int v, int v1, int v2, boolean z) {
            List list0 = this.b;
            if(list0 == null) {
                return null;
            }
            int v3 = list0.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = (FullSpanItem)this.b.get(v4);
                int v5 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.f;
                if(v5 >= v1) {
                    return null;
                }
                if(v5 >= v && (v2 == 0 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.g == v2 || z && staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.i)) {
                    return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0;
                }
            }
            return null;
        }

        public FullSpanItem f(int v) {
            List list0 = this.b;
            if(list0 == null) {
                return null;
            }
            for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = (FullSpanItem)this.b.get(v1);
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.f == v) {
                    return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0;
                }
            }
            return null;
        }

        int g(int v) {
            return this.a == null || v >= this.a.length ? -1 : this.a[v];
        }

        int h(int v) {
            int[] arr_v = this.a;
            if(arr_v == null) {
                return -1;
            }
            if(v >= arr_v.length) {
                return -1;
            }
            int v1 = this.i(v);
            if(v1 == -1) {
                Arrays.fill(this.a, v, this.a.length, -1);
                return this.a.length;
            }
            Arrays.fill(this.a, v, v1 + 1, -1);
            return v1 + 1;
        }

        private int i(int v) {
            if(this.b == null) {
                return -1;
            }
            FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = this.f(v);
            if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 != null) {
                this.b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0);
            }
            int v1 = this.b.size();
            int v2;
            for(v2 = 0; true; ++v2) {
                if(v2 >= v1) {
                    v2 = -1;
                    break;
                }
                if(((FullSpanItem)this.b.get(v2)).f >= v) {
                    break;
                }
            }
            if(v2 != -1) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 = (FullSpanItem)this.b.get(v2);
                this.b.remove(v2);
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.f;
            }
            return -1;
        }

        void j(int v, int v1) {
            if(this.a != null && v < this.a.length) {
                int v2 = v + v1;
                this.c(v2);
                System.arraycopy(this.a, v, this.a, v2, this.a.length - v - v1);
                Arrays.fill(this.a, v, v2, -1);
                this.l(v, v1);
            }
        }

        void k(int v, int v1) {
            if(this.a != null && v < this.a.length) {
                int v2 = v + v1;
                this.c(v2);
                System.arraycopy(this.a, v2, this.a, v, this.a.length - v - v1);
                Arrays.fill(this.a, this.a.length - v1, this.a.length, -1);
                this.m(v, v1);
            }
        }

        private void l(int v, int v1) {
            List list0 = this.b;
            if(list0 == null) {
                return;
            }
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = (FullSpanItem)this.b.get(v2);
                int v3 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.f;
                if(v3 >= v) {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.f = v3 + v1;
                }
            }
        }

        private void m(int v, int v1) {
            List list0 = this.b;
            if(list0 == null) {
                return;
            }
            for(int v2 = list0.size() - 1; v2 >= 0; --v2) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = (FullSpanItem)this.b.get(v2);
                int v3 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.f;
                if(v3 >= v) {
                    if(v3 < v + v1) {
                        this.b.remove(v2);
                    }
                    else {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.f = v3 - v1;
                    }
                }
            }
        }

        void n(int v, d staggeredGridLayoutManager$d0) {
            this.c(v);
            this.a[v] = staggeredGridLayoutManager$d0.e;
        }

        int o(int v) {
            int v1;
            for(v1 = this.a.length; v1 <= v; v1 *= 2) {
            }
            return v1;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        static final class androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.a implements Parcelable.Creator {
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
        int h;
        int[] i;
        int j;
        int[] k;
        List l;
        boolean m;
        boolean n;
        boolean o;

        static {
            SavedState.CREATOR = new androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.a();
        }

        public SavedState() {
        }

        SavedState(Parcel parcel0) {
            this.f = parcel0.readInt();
            this.g = parcel0.readInt();
            int v = parcel0.readInt();
            this.h = v;
            if(v > 0) {
                int[] arr_v = new int[v];
                this.i = arr_v;
                parcel0.readIntArray(arr_v);
            }
            int v1 = parcel0.readInt();
            this.j = v1;
            if(v1 > 0) {
                int[] arr_v1 = new int[v1];
                this.k = arr_v1;
                parcel0.readIntArray(arr_v1);
            }
            boolean z = false;
            this.m = parcel0.readInt() == 1;
            this.n = parcel0.readInt() == 1;
            if(parcel0.readInt() == 1) {
                z = true;
            }
            this.o = z;
            this.l = parcel0.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState staggeredGridLayoutManager$SavedState0) {
            this.h = staggeredGridLayoutManager$SavedState0.h;
            this.f = staggeredGridLayoutManager$SavedState0.f;
            this.g = staggeredGridLayoutManager$SavedState0.g;
            this.i = staggeredGridLayoutManager$SavedState0.i;
            this.j = staggeredGridLayoutManager$SavedState0.j;
            this.k = staggeredGridLayoutManager$SavedState0.k;
            this.m = staggeredGridLayoutManager$SavedState0.m;
            this.n = staggeredGridLayoutManager$SavedState0.n;
            this.o = staggeredGridLayoutManager$SavedState0.o;
            this.l = staggeredGridLayoutManager$SavedState0.l;
        }

        void a() {
            this.i = null;
            this.h = 0;
            this.f = -1;
            this.g = -1;
        }

        void b() {
            this.i = null;
            this.h = 0;
            this.j = 0;
            this.k = null;
            this.l = null;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.f);
            parcel0.writeInt(this.g);
            parcel0.writeInt(this.h);
            if(this.h > 0) {
                parcel0.writeIntArray(this.i);
            }
            parcel0.writeInt(this.j);
            if(this.j > 0) {
                parcel0.writeIntArray(this.k);
            }
            parcel0.writeInt(((int)this.m));
            parcel0.writeInt(((int)this.n));
            parcel0.writeInt(((int)this.o));
            parcel0.writeList(this.l);
        }
    }

    class androidx.recyclerview.widget.StaggeredGridLayoutManager.a implements Runnable {
        final StaggeredGridLayoutManager f;

        @Override
        public void run() {
            StaggeredGridLayoutManager.this.W1();
        }
    }

    class androidx.recyclerview.widget.StaggeredGridLayoutManager.b {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;
        final StaggeredGridLayoutManager g;

        androidx.recyclerview.widget.StaggeredGridLayoutManager.b() {
            this.c();
        }

        void a() {
            this.b = this.c ? StaggeredGridLayoutManager.this.u.i() : StaggeredGridLayoutManager.this.u.m();
        }

        void b(int v) {
            if(this.c) {
                this.b = StaggeredGridLayoutManager.this.u.i() - v;
                return;
            }
            this.b = StaggeredGridLayoutManager.this.u.m() + v;
        }

        void c() {
            this.a = -1;
            this.b = 0x80000000;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] arr_v = this.f;
            if(arr_v != null) {
                Arrays.fill(arr_v, -1);
            }
        }

        void d(d[] arr_staggeredGridLayoutManager$d) {
            if(this.f == null || this.f.length < arr_staggeredGridLayoutManager$d.length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for(int v = 0; v < arr_staggeredGridLayoutManager$d.length; ++v) {
                int[] arr_v = this.f;
                arr_v[v] = arr_staggeredGridLayoutManager$d[v].p(0x80000000);
            }
        }
    }

    public static class c extends p {
        d e;
        boolean f;

        public c(int v, int v1) {
            super(v, v1);
        }

        public c(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public c(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
        }

        public c(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
        }

        public final int e() {
            return this.e == null ? -1 : this.e.e;
        }

        public boolean f() {
            return this.f;
        }
    }

    class d {
        ArrayList a;
        int b;
        int c;
        int d;
        final int e;
        final StaggeredGridLayoutManager f;

        d(int v) {
            this.a = new ArrayList();
            this.b = 0x80000000;
            this.c = 0x80000000;
            this.d = 0;
            this.e = v;
        }

        void a(View view0) {
            c staggeredGridLayoutManager$c0 = this.n(view0);
            staggeredGridLayoutManager$c0.e = this;
            this.a.add(view0);
            this.c = 0x80000000;
            if(this.a.size() == 1) {
                this.b = 0x80000000;
            }
            if(staggeredGridLayoutManager$c0.c() || staggeredGridLayoutManager$c0.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view0);
            }
        }

        void b(boolean z, int v) {
            int v1 = z ? this.l(0x80000000) : this.p(0x80000000);
            this.e();
            if(v1 == 0x80000000) {
                return;
            }
            if(z && v1 < StaggeredGridLayoutManager.this.u.i() || !z && v1 > StaggeredGridLayoutManager.this.u.m()) {
                return;
            }
            if(v != 0x80000000) {
                v1 += v;
            }
            this.c = v1;
            this.b = v1;
        }

        void c() {
            View view0 = (View)this.a.get(this.a.size() - 1);
            c staggeredGridLayoutManager$c0 = this.n(view0);
            this.c = StaggeredGridLayoutManager.this.u.d(view0);
            if(staggeredGridLayoutManager$c0.f) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = StaggeredGridLayoutManager.this.E.f(staggeredGridLayoutManager$c0.a());
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.g == 1) {
                    this.c += staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a(this.e);
                }
            }
        }

        void d() {
            View view0 = (View)this.a.get(0);
            c staggeredGridLayoutManager$c0 = this.n(view0);
            this.b = StaggeredGridLayoutManager.this.u.g(view0);
            if(staggeredGridLayoutManager$c0.f) {
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = StaggeredGridLayoutManager.this.E.f(staggeredGridLayoutManager$c0.a());
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 != null && staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.g == -1) {
                    this.b -= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.a(this.e);
                }
            }
        }

        void e() {
            this.a.clear();
            this.q();
            this.d = 0;
        }

        // 去混淆评级： 低(20)
        public int f() {
            return StaggeredGridLayoutManager.this.z ? this.i(this.a.size() - 1, -1, true) : this.i(0, this.a.size(), true);
        }

        // 去混淆评级： 低(20)
        public int g() {
            return StaggeredGridLayoutManager.this.z ? this.i(0, this.a.size(), true) : this.i(this.a.size() - 1, -1, true);
        }

        int h(int v, int v1, boolean z, boolean z1, boolean z2) {
            boolean z4;
            int v2 = StaggeredGridLayoutManager.this.u.m();
            int v3 = StaggeredGridLayoutManager.this.u.i();
            int v4 = v1 <= v ? -1 : 1;
            while(v != v1) {
                View view0 = (View)this.a.get(v);
                int v5 = StaggeredGridLayoutManager.this.u.g(view0);
                int v6 = StaggeredGridLayoutManager.this.u.d(view0);
                boolean z3 = false;
                if(!z2) {
                    if(v5 < v3) {
                        z4 = true;
                    }
                }
                else if(v5 <= v3) {
                    z4 = true;
                }
                else {
                    z4 = false;
                }
                if(!z2) {
                    if(v6 > v2) {
                        z3 = true;
                    }
                }
                else if(v6 >= v2) {
                    z3 = true;
                }
                if(z4 && z3) {
                    if(!z || !z1) {
                        if(z1) {
                            return StaggeredGridLayoutManager.this.l0(view0);
                        }
                        if(v5 < v2 || v6 > v3) {
                            return StaggeredGridLayoutManager.this.l0(view0);
                        }
                    }
                    else if(v5 >= v2 && v6 <= v3) {
                        return StaggeredGridLayoutManager.this.l0(view0);
                    }
                }
                v += v4;
            }
            return -1;
        }

        int i(int v, int v1, boolean z) {
            return this.h(v, v1, false, false, z);
        }

        public int j() {
            return this.d;
        }

        int k() {
            int v = this.c;
            if(v != 0x80000000) {
                return v;
            }
            this.c();
            return this.c;
        }

        int l(int v) {
            int v1 = this.c;
            if(v1 != 0x80000000) {
                return v1;
            }
            if(this.a.size() == 0) {
                return v;
            }
            this.c();
            return this.c;
        }

        public View m(int v, int v1) {
            View view0 = null;
            if(v1 == -1) {
                int v2 = this.a.size();
                int v3 = 0;
                while(v3 < v2) {
                    View view1 = (View)this.a.get(v3);
                    if(StaggeredGridLayoutManager.this.z && StaggeredGridLayoutManager.this.l0(view1) <= v || (!StaggeredGridLayoutManager.this.z && StaggeredGridLayoutManager.this.l0(view1) >= v || !view1.hasFocusable())) {
                        return view0;
                    }
                    ++v3;
                    view0 = view1;
                }
                return view0;
            }
            else {
                int v4 = this.a.size() - 1;
                while(v4 >= 0) {
                    View view2 = (View)this.a.get(v4);
                    if(StaggeredGridLayoutManager.this.z && StaggeredGridLayoutManager.this.l0(view2) >= v || (!StaggeredGridLayoutManager.this.z && StaggeredGridLayoutManager.this.l0(view2) <= v || !view2.hasFocusable())) {
                        break;
                    }
                    --v4;
                    view0 = view2;
                }
            }
            return view0;
        }

        c n(View view0) {
            return (c)view0.getLayoutParams();
        }

        int o() {
            int v = this.b;
            if(v != 0x80000000) {
                return v;
            }
            this.d();
            return this.b;
        }

        int p(int v) {
            int v1 = this.b;
            if(v1 != 0x80000000) {
                return v1;
            }
            if(this.a.size() == 0) {
                return v;
            }
            this.d();
            return this.b;
        }

        void q() {
            this.b = 0x80000000;
            this.c = 0x80000000;
        }

        void r(int v) {
            int v1 = this.b;
            if(v1 != 0x80000000) {
                this.b = v1 + v;
            }
            int v2 = this.c;
            if(v2 != 0x80000000) {
                this.c = v2 + v;
            }
        }

        void s() {
            int v = this.a.size();
            View view0 = (View)this.a.remove(v - 1);
            c staggeredGridLayoutManager$c0 = this.n(view0);
            staggeredGridLayoutManager$c0.e = null;
            if(staggeredGridLayoutManager$c0.c() || staggeredGridLayoutManager$c0.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(view0);
            }
            if(v == 1) {
                this.b = 0x80000000;
            }
            this.c = 0x80000000;
        }

        void t() {
            View view0 = (View)this.a.remove(0);
            c staggeredGridLayoutManager$c0 = this.n(view0);
            staggeredGridLayoutManager$c0.e = null;
            if(this.a.size() == 0) {
                this.c = 0x80000000;
            }
            if(staggeredGridLayoutManager$c0.c() || staggeredGridLayoutManager$c0.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(view0);
            }
            this.b = 0x80000000;
        }

        void u(View view0) {
            c staggeredGridLayoutManager$c0 = this.n(view0);
            staggeredGridLayoutManager$c0.e = this;
            this.a.add(0, view0);
            this.b = 0x80000000;
            if(this.a.size() == 1) {
                this.c = 0x80000000;
            }
            if(staggeredGridLayoutManager$c0.c() || staggeredGridLayoutManager$c0.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view0);
            }
        }

        void v(int v) {
            this.b = v;
            this.c = v;
        }
    }

    boolean A;
    private BitSet B;
    int C;
    int D;
    LazySpanLookup E;
    private int F;
    private boolean G;
    private boolean H;
    private SavedState I;
    private int J;
    private final Rect K;
    private final androidx.recyclerview.widget.StaggeredGridLayoutManager.b L;
    private boolean M;
    private boolean N;
    private int[] O;
    private final Runnable P;
    private int s;
    d[] t;
    i u;
    i v;
    private int w;
    private int x;
    private final f y;
    boolean z;

    public StaggeredGridLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.s = -1;
        this.z = false;
        this.A = false;
        this.C = -1;
        this.D = 0x80000000;
        this.E = new LazySpanLookup();
        this.F = 2;
        this.K = new Rect();
        this.L = new androidx.recyclerview.widget.StaggeredGridLayoutManager.b(this);
        this.M = false;
        this.N = true;
        this.P = () -> {
            int v1;
            int v;
            if(StaggeredGridLayoutManager.this.O() != 0 && StaggeredGridLayoutManager.this.F != 0 && StaggeredGridLayoutManager.this.v0()) {
                if(StaggeredGridLayoutManager.this.A) {
                    v = StaggeredGridLayoutManager.this.o2();
                    v1 = StaggeredGridLayoutManager.this.n2();
                }
                else {
                    v = StaggeredGridLayoutManager.this.n2();
                    v1 = StaggeredGridLayoutManager.this.o2();
                }
                if(v == 0 && StaggeredGridLayoutManager.this.v2() != null) {
                    StaggeredGridLayoutManager.this.E.b();
                    StaggeredGridLayoutManager.this.y1();
                    StaggeredGridLayoutManager.this.x1();
                    return true;
                }
                if(!StaggeredGridLayoutManager.this.M) {
                    return false;
                }
                int v2 = StaggeredGridLayoutManager.this.A ? -1 : 1;
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = StaggeredGridLayoutManager.this.E.e(v, v1 + 1, v2, true);
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 == null) {
                    StaggeredGridLayoutManager.this.M = false;
                    StaggeredGridLayoutManager.this.E.d(v1 + 1);
                    return false;
                }
                FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 = StaggeredGridLayoutManager.this.E.e(v, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.f, -v2, true);
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 == null) {
                    StaggeredGridLayoutManager.this.E.d(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.f);
                }
                else {
                    StaggeredGridLayoutManager.this.E.d(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.f + 1);
                }
                StaggeredGridLayoutManager.this.y1();
                StaggeredGridLayoutManager.this.x1();
                return true;
            }
            return false;
        };
        androidx.recyclerview.widget.RecyclerView.o.d recyclerView$o$d0 = o.m0(context0, attributeSet0, v, v1);
        this.L2(recyclerView$o$d0.a);
        this.N2(recyclerView$o$d0.b);
        this.M2(recyclerView$o$d0.c);
        this.y = new f();
        this.e2();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int A(y recyclerView$y0) {
        return this.a2(recyclerView$y0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int A1(int v, u recyclerView$u0, y recyclerView$y0) {
        return this.J2(v, recyclerView$u0, recyclerView$y0);
    }

    private void A2(u recyclerView$u0, y recyclerView$y0, boolean z) {
        boolean z1 = true;
        androidx.recyclerview.widget.StaggeredGridLayoutManager.b staggeredGridLayoutManager$b0 = this.L;
        if((this.I != null || this.C != -1) && recyclerView$y0.b() == 0) {
            this.o1(recyclerView$u0);
            staggeredGridLayoutManager$b0.c();
            return;
        }
        boolean z2 = !staggeredGridLayoutManager$b0.e || this.C != -1 || this.I != null;
        if(z2) {
            staggeredGridLayoutManager$b0.c();
            if(this.I == null) {
                this.I2();
                staggeredGridLayoutManager$b0.c = this.A;
            }
            else {
                this.R1(staggeredGridLayoutManager$b0);
            }
            this.R2(recyclerView$y0, staggeredGridLayoutManager$b0);
            staggeredGridLayoutManager$b0.e = true;
        }
        if(this.I == null && this.C == -1 && (staggeredGridLayoutManager$b0.c != this.G || this.x2() != this.H)) {
            this.E.b();
            staggeredGridLayoutManager$b0.d = true;
        }
        if(this.O() > 0 && (this.I == null || this.I.h < 1)) {
            if(staggeredGridLayoutManager$b0.d) {
                for(int v = 0; v < this.s; ++v) {
                    this.t[v].e();
                    int v1 = staggeredGridLayoutManager$b0.b;
                    if(v1 != 0x80000000) {
                        this.t[v].v(v1);
                    }
                }
            }
            else if(z2 || this.L.f == null) {
                for(int v3 = 0; v3 < this.s; ++v3) {
                    this.t[v3].b(this.A, staggeredGridLayoutManager$b0.b);
                }
                this.L.d(this.t);
            }
            else {
                for(int v2 = 0; v2 < this.s; ++v2) {
                    d staggeredGridLayoutManager$d0 = this.t[v2];
                    staggeredGridLayoutManager$d0.e();
                    staggeredGridLayoutManager$d0.v(this.L.f[v2]);
                }
            }
        }
        this.B(recyclerView$u0);
        this.y.a = false;
        this.M = false;
        this.T2(this.v.n());
        this.S2(staggeredGridLayoutManager$b0.a, recyclerView$y0);
        if(staggeredGridLayoutManager$b0.c) {
            this.K2(-1);
            this.f2(recyclerView$u0, this.y, recyclerView$y0);
            this.K2(1);
        }
        else {
            this.K2(1);
            this.f2(recyclerView$u0, this.y, recyclerView$y0);
            this.K2(-1);
        }
        this.y.c = staggeredGridLayoutManager$b0.a + this.y.d;
        this.f2(recyclerView$u0, this.y, recyclerView$y0);
        this.H2();
        if(this.O() > 0) {
            if(this.A) {
                this.l2(recyclerView$u0, recyclerView$y0, true);
                this.m2(recyclerView$u0, recyclerView$y0, false);
            }
            else {
                this.m2(recyclerView$u0, recyclerView$y0, true);
                this.l2(recyclerView$u0, recyclerView$y0, false);
            }
        }
        if(!z || recyclerView$y0.e() || this.F == 0 || this.O() <= 0 || !this.M && this.v2() == null) {
            z1 = false;
        }
        else {
            this.s1(this.P);
            if(!this.W1()) {
                z1 = false;
            }
        }
        if(recyclerView$y0.e()) {
            this.L.c();
        }
        this.G = staggeredGridLayoutManager$b0.c;
        this.H = this.x2();
        if(z1) {
            this.L.c();
            this.A2(recyclerView$u0, recyclerView$y0, false);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void B1(int v) {
        SavedState staggeredGridLayoutManager$SavedState0 = this.I;
        if(staggeredGridLayoutManager$SavedState0 != null && staggeredGridLayoutManager$SavedState0.f != v) {
            staggeredGridLayoutManager$SavedState0.a();
        }
        this.C = v;
        this.D = 0x80000000;
        this.x1();
    }

    private boolean B2(int v) {
        return this.w == 0 ? v == -1 != this.A : v == -1 == this.A == this.x2();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int C1(int v, u recyclerView$u0, y recyclerView$y0) {
        return this.J2(v, recyclerView$u0, recyclerView$y0);
    }

    void C2(int v, y recyclerView$y0) {
        int v2;
        int v1;
        if(v > 0) {
            v1 = this.o2();
            v2 = 1;
        }
        else {
            v1 = this.n2();
            v2 = -1;
        }
        this.y.a = true;
        this.S2(v1, recyclerView$y0);
        this.K2(v2);
        this.y.c = v1 + this.y.d;
        this.y.b = Math.abs(v);
    }

    private void D2(View view0) {
        for(int v = this.s - 1; v >= 0; --v) {
            this.t[v].u(view0);
        }
    }

    private void E2(u recyclerView$u0, f f0) {
        if(f0.a && !f0.i) {
            if(f0.b == 0) {
                if(f0.e == -1) {
                    this.F2(recyclerView$u0, f0.g);
                    return;
                }
                this.G2(recyclerView$u0, f0.f);
                return;
            }
            if(f0.e == -1) {
                int v = f0.f - this.q2(f0.f);
                this.F2(recyclerView$u0, (v >= 0 ? f0.g - Math.min(v, f0.b) : f0.g));
                return;
            }
            int v1 = this.r2(f0.g) - f0.g;
            this.G2(recyclerView$u0, (v1 >= 0 ? Math.min(v1, f0.b) + f0.f : f0.f));
        }
    }

    private void F2(u recyclerView$u0, int v) {
        for(int v1 = this.O() - 1; v1 >= 0; --v1) {
            View view0 = this.N(v1);
            if(this.u.g(view0) < v || this.u.q(view0) < v) {
                break;
            }
            c staggeredGridLayoutManager$c0 = (c)view0.getLayoutParams();
            if(staggeredGridLayoutManager$c0.f) {
                for(int v3 = 0; v3 < this.s; ++v3) {
                    if(this.t[v3].a.size() == 1) {
                        return;
                    }
                }
                for(int v2 = 0; v2 < this.s; ++v2) {
                    this.t[v2].s();
                }
            }
            else {
                if(staggeredGridLayoutManager$c0.e.a.size() == 1) {
                    return;
                }
                staggeredGridLayoutManager$c0.e.s();
            }
            this.q1(view0, recyclerView$u0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void G0(int v) {
        super.G0(v);
        for(int v1 = 0; v1 < this.s; ++v1) {
            this.t[v1].r(v);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void G1(Rect rect0, int v, int v1) {
        int v5;
        int v4;
        int v2 = this.i0() + this.j0();
        int v3 = this.k0() + this.h0();
        if(this.w == 1) {
            v4 = o.s(v1, rect0.height() + v3, this.f0());
            v5 = o.s(v, this.x * this.s + v2, this.g0());
        }
        else {
            v5 = o.s(v, rect0.width() + v2, this.g0());
            v4 = o.s(v1, this.x * this.s + v3, this.f0());
        }
        this.F1(v5, v4);
    }

    private void G2(u recyclerView$u0, int v) {
        while(this.O() > 0) {
            View view0 = this.N(0);
            if(this.u.d(view0) > v || this.u.p(view0) > v) {
                break;
            }
            c staggeredGridLayoutManager$c0 = (c)view0.getLayoutParams();
            if(staggeredGridLayoutManager$c0.f) {
                for(int v2 = 0; v2 < this.s; ++v2) {
                    if(this.t[v2].a.size() == 1) {
                        return;
                    }
                }
                for(int v1 = 0; v1 < this.s; ++v1) {
                    this.t[v1].t();
                }
            }
            else {
                if(staggeredGridLayoutManager$c0.e.a.size() == 1) {
                    return;
                }
                staggeredGridLayoutManager$c0.e.t();
            }
            this.q1(view0, recyclerView$u0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void H0(int v) {
        super.H0(v);
        for(int v1 = 0; v1 < this.s; ++v1) {
            this.t[v1].r(v);
        }
    }

    private void H2() {
        if(this.v.k() == 0x40000000) {
            return;
        }
        int v = this.O();
        float f = 0.0f;
        for(int v2 = 0; v2 < v; ++v2) {
            View view0 = this.N(v2);
            float f1 = (float)this.v.e(view0);
            if(f1 >= f) {
                if(((c)view0.getLayoutParams()).f()) {
                    f1 = f1 * 1.0f / ((float)this.s);
                }
                f = Math.max(f, f1);
            }
        }
        int v3 = this.x;
        int v4 = Math.round(f * ((float)this.s));
        this.T2((this.v.k() == 0x80000000 ? Math.min(v4, this.v.n()) : Math.round(f * ((float)this.s))));
        if(this.x == v3) {
            return;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.N(v1);
            c staggeredGridLayoutManager$c0 = (c)view1.getLayoutParams();
            if(!staggeredGridLayoutManager$c0.f) {
                if(!this.x2() || this.w != 1) {
                    int v5 = this.x * staggeredGridLayoutManager$c0.e.e;
                    int v6 = staggeredGridLayoutManager$c0.e.e * v3;
                    if(this.w == 1) {
                        view1.offsetLeftAndRight(v5 - v6);
                    }
                    else {
                        view1.offsetTopAndBottom(v5 - v6);
                    }
                }
                else {
                    view1.offsetLeftAndRight(-(this.s - 1 - staggeredGridLayoutManager$c0.e.e) * this.x - -(this.s - 1 - staggeredGridLayoutManager$c0.e.e) * v3);
                }
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public p I() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    private void I2() {
        if(this.w != 1 && this.x2()) {
            this.A = !this.z;
            return;
        }
        this.A = this.z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public p J(Context context0, AttributeSet attributeSet0) {
        return new c(context0, attributeSet0);
    }

    int J2(int v, u recyclerView$u0, y recyclerView$y0) {
        if(this.O() != 0 && v != 0) {
            this.C2(v, recyclerView$y0);
            int v1 = this.f2(recyclerView$u0, this.y, recyclerView$y0);
            if(this.y.b >= v1) {
                v = v >= 0 ? v1 : -v1;
            }
            this.u.r(-v);
            this.G = this.A;
            this.y.b = 0;
            this.E2(recyclerView$u0, this.y);
            return v;
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public p K(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new c(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new c(viewGroup$LayoutParams0);
    }

    private void K2(int v) {
        this.y.e = v;
        this.y.d = this.A == (v == -1) ? 1 : -1;
    }

    public void L2(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        this.l(null);
        if(v == this.w) {
            return;
        }
        this.w = v;
        i i0 = this.u;
        this.u = this.v;
        this.v = i0;
        this.x1();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void M0(RecyclerView recyclerView0, u recyclerView$u0) {
        super.M0(recyclerView0, recyclerView$u0);
        this.s1(this.P);
        for(int v = 0; v < this.s; ++v) {
            this.t[v].e();
        }
        recyclerView0.requestLayout();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void M1(RecyclerView recyclerView0, y recyclerView$y0, int v) {
        g g0 = new g(recyclerView0.getContext());
        g0.p(v);
        this.N1(g0);
    }

    public void M2(boolean z) {
        this.l(null);
        SavedState staggeredGridLayoutManager$SavedState0 = this.I;
        if(staggeredGridLayoutManager$SavedState0 != null && staggeredGridLayoutManager$SavedState0.m != z) {
            staggeredGridLayoutManager$SavedState0.m = z;
        }
        this.z = z;
        this.x1();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public View N0(View view0, int v, u recyclerView$u0, y recyclerView$y0) {
        if(this.O() == 0) {
            return null;
        }
        View view1 = this.G(view0);
        if(view1 == null) {
            return null;
        }
        this.I2();
        int v1 = this.b2(v);
        if(v1 == 0x80000000) {
            return null;
        }
        c staggeredGridLayoutManager$c0 = (c)view1.getLayoutParams();
        boolean z = staggeredGridLayoutManager$c0.f;
        d staggeredGridLayoutManager$d0 = staggeredGridLayoutManager$c0.e;
        int v2 = v1 == 1 ? this.o2() : this.n2();
        this.S2(v2, recyclerView$y0);
        this.K2(v1);
        this.y.c = this.y.d + v2;
        this.y.b = (int)(((float)this.u.n()) * 0.333333f);
        this.y.h = true;
        this.y.a = false;
        this.f2(recyclerView$u0, this.y, recyclerView$y0);
        this.G = this.A;
        if(!z) {
            View view2 = staggeredGridLayoutManager$d0.m(v2, v1);
            if(view2 != null && view2 != view1) {
                return view2;
            }
        }
        if(this.B2(v1)) {
            for(int v4 = this.s - 1; v4 >= 0; --v4) {
                View view3 = this.t[v4].m(v2, v1);
                if(view3 != null && view3 != view1) {
                    return view3;
                }
            }
        }
        else {
            for(int v5 = 0; v5 < this.s; ++v5) {
                View view4 = this.t[v5].m(v2, v1);
                if(view4 != null && view4 != view1) {
                    return view4;
                }
            }
        }
        boolean z1 = !this.z == (v1 == -1 ? 1 : 0);
        if(!z) {
            View view5 = this.H((z1 ? staggeredGridLayoutManager$d0.f() : staggeredGridLayoutManager$d0.g()));
            if(view5 != null && view5 != view1) {
                return view5;
            }
        }
        if(this.B2(v1)) {
            for(int v6 = this.s - 1; v6 >= 0; --v6) {
                if(v6 != staggeredGridLayoutManager$d0.e) {
                    View view6 = this.H((z1 ? this.t[v6].f() : this.t[v6].g()));
                    if(view6 != null && view6 != view1) {
                        return view6;
                    }
                }
            }
            return null;
        }
        for(int v3 = 0; v3 < this.s; ++v3) {
            View view7 = this.H((z1 ? this.t[v3].f() : this.t[v3].g()));
            if(view7 != null && view7 != view1) {
                return view7;
            }
        }
        return null;
    }

    public void N2(int v) {
        this.l(null);
        if(v != this.s) {
            this.w2();
            this.s = v;
            this.B = new BitSet(this.s);
            this.t = new d[this.s];
            for(int v1 = 0; v1 < this.s; ++v1) {
                d[] arr_staggeredGridLayoutManager$d = this.t;
                arr_staggeredGridLayoutManager$d[v1] = new d(this, v1);
            }
            this.x1();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void O0(AccessibilityEvent accessibilityEvent0) {
        super.O0(accessibilityEvent0);
        if(this.O() > 0) {
            View view0 = this.i2(false);
            View view1 = this.h2(false);
            if(view0 != null && view1 != null) {
                int v = this.l0(view0);
                int v1 = this.l0(view1);
                if(v < v1) {
                    accessibilityEvent0.setFromIndex(v);
                    accessibilityEvent0.setToIndex(v1);
                    return;
                }
                accessibilityEvent0.setFromIndex(v1);
                accessibilityEvent0.setToIndex(v);
            }
        }
    }

    private void O2(int v, int v1) {
        for(int v2 = 0; v2 < this.s; ++v2) {
            if(!this.t[v2].a.isEmpty()) {
                this.U2(this.t[v2], v, v1);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean P1() {
        return this.I == null;
    }

    private boolean P2(y recyclerView$y0, androidx.recyclerview.widget.StaggeredGridLayoutManager.b staggeredGridLayoutManager$b0) {
        staggeredGridLayoutManager$b0.a = this.G ? this.k2(recyclerView$y0.b()) : this.g2(recyclerView$y0.b());
        staggeredGridLayoutManager$b0.b = 0x80000000;
        return true;
    }

    private void Q1(View view0) {
        for(int v = this.s - 1; v >= 0; --v) {
            this.t[v].a(view0);
        }
    }

    boolean Q2(y recyclerView$y0, androidx.recyclerview.widget.StaggeredGridLayoutManager.b staggeredGridLayoutManager$b0) {
        boolean z = false;
        if(!recyclerView$y0.e()) {
            int v = this.C;
            if(v != -1) {
                if(v >= 0 && v < recyclerView$y0.b()) {
                    if(this.I != null && this.I.f != -1 && this.I.h >= 1) {
                        staggeredGridLayoutManager$b0.b = 0x80000000;
                        staggeredGridLayoutManager$b0.a = this.C;
                        return true;
                    }
                    View view0 = this.H(this.C);
                    if(view0 != null) {
                        staggeredGridLayoutManager$b0.a = this.A ? this.o2() : this.n2();
                        if(this.D != 0x80000000) {
                            if(staggeredGridLayoutManager$b0.c) {
                                staggeredGridLayoutManager$b0.b = this.u.i() - this.D - this.u.d(view0);
                                return true;
                            }
                            staggeredGridLayoutManager$b0.b = this.u.m() + this.D - this.u.g(view0);
                            return true;
                        }
                        if(this.u.e(view0) > this.u.n()) {
                            staggeredGridLayoutManager$b0.b = staggeredGridLayoutManager$b0.c ? this.u.i() : this.u.m();
                            return true;
                        }
                        int v1 = this.u.g(view0) - this.u.m();
                        if(v1 < 0) {
                            staggeredGridLayoutManager$b0.b = -v1;
                            return true;
                        }
                        int v2 = this.u.i() - this.u.d(view0);
                        if(v2 < 0) {
                            staggeredGridLayoutManager$b0.b = v2;
                            return true;
                        }
                        staggeredGridLayoutManager$b0.b = 0x80000000;
                        return true;
                    }
                    int v3 = this.C;
                    staggeredGridLayoutManager$b0.a = v3;
                    int v4 = this.D;
                    if(v4 == 0x80000000) {
                        if(this.V1(v3) == 1) {
                            z = true;
                        }
                        staggeredGridLayoutManager$b0.c = z;
                        staggeredGridLayoutManager$b0.a();
                    }
                    else {
                        staggeredGridLayoutManager$b0.b(v4);
                    }
                    staggeredGridLayoutManager$b0.d = true;
                    return true;
                }
                this.C = -1;
                this.D = 0x80000000;
            }
        }
        return false;
    }

    private void R1(androidx.recyclerview.widget.StaggeredGridLayoutManager.b staggeredGridLayoutManager$b0) {
        SavedState staggeredGridLayoutManager$SavedState0 = this.I;
        int v = staggeredGridLayoutManager$SavedState0.h;
        if(v > 0) {
            if(v == this.s) {
                for(int v1 = 0; v1 < this.s; ++v1) {
                    this.t[v1].e();
                    SavedState staggeredGridLayoutManager$SavedState1 = this.I;
                    int v2 = staggeredGridLayoutManager$SavedState1.i[v1];
                    if(v2 != 0x80000000) {
                        v2 += (staggeredGridLayoutManager$SavedState1.n ? this.u.i() : this.u.m());
                    }
                    this.t[v1].v(v2);
                }
            }
            else {
                staggeredGridLayoutManager$SavedState0.b();
                this.I.f = this.I.g;
            }
        }
        this.H = this.I.o;
        this.M2(this.I.m);
        this.I2();
        SavedState staggeredGridLayoutManager$SavedState2 = this.I;
        int v3 = staggeredGridLayoutManager$SavedState2.f;
        if(v3 == -1) {
            staggeredGridLayoutManager$b0.c = this.A;
        }
        else {
            this.C = v3;
            staggeredGridLayoutManager$b0.c = staggeredGridLayoutManager$SavedState2.n;
        }
        if(staggeredGridLayoutManager$SavedState2.j > 1) {
            this.E.a = staggeredGridLayoutManager$SavedState2.k;
            this.E.b = staggeredGridLayoutManager$SavedState2.l;
        }
    }

    void R2(y recyclerView$y0, androidx.recyclerview.widget.StaggeredGridLayoutManager.b staggeredGridLayoutManager$b0) {
        if(this.Q2(recyclerView$y0, staggeredGridLayoutManager$b0)) {
            return;
        }
        if(this.P2(recyclerView$y0, staggeredGridLayoutManager$b0)) {
            return;
        }
        staggeredGridLayoutManager$b0.a();
        staggeredGridLayoutManager$b0.a = 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int S(u recyclerView$u0, y recyclerView$y0) {
        return this.w == 1 ? this.s : super.S(recyclerView$u0, recyclerView$y0);
    }

    boolean S1() {
        int v = this.t[0].l(0x80000000);
        for(int v1 = 1; v1 < this.s; ++v1) {
            if(this.t[v1].l(0x80000000) != v) {
                return false;
            }
        }
        return true;
    }

    private void S2(int v, y recyclerView$y0) {
        int v3;
        int v2;
        boolean z = false;
        this.y.b = 0;
        this.y.c = v;
        if(this.B0()) {
            int v1 = recyclerView$y0.c();
            if(v1 == -1) {
                v2 = 0;
                v3 = 0;
            }
            else if(this.A == v1 < v) {
                v2 = this.u.n();
                v3 = 0;
            }
            else {
                v3 = this.u.n();
                v2 = 0;
            }
        }
        else {
            v2 = 0;
            v3 = 0;
        }
        if(this.R()) {
            this.y.f = this.u.m() - v3;
            this.y.g = this.u.i() + v2;
        }
        else {
            this.y.g = this.u.h() + v2;
            this.y.f = -v3;
        }
        f f0 = this.y;
        f0.h = false;
        f0.a = true;
        if(this.u.k() == 0 && this.u.h() == 0) {
            z = true;
        }
        f0.i = z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void T0(u recyclerView$u0, y recyclerView$y0, View view0, z z0) {
        int v = 1;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof c)) {
            super.S0(view0, z0);
            return;
        }
        if(this.w == 0) {
            int v1 = ((c)viewGroup$LayoutParams0).e();
            if(((c)viewGroup$LayoutParams0).f) {
                v = this.s;
            }
            z0.p0(C.z.f.a(v1, v, -1, -1, false, false));
            return;
        }
        int v2 = ((c)viewGroup$LayoutParams0).e();
        if(((c)viewGroup$LayoutParams0).f) {
            v = this.s;
        }
        z0.p0(C.z.f.a(-1, -1, v2, v, false, false));
    }

    boolean T1() {
        int v = this.t[0].p(0x80000000);
        for(int v1 = 1; v1 < this.s; ++v1) {
            if(this.t[v1].p(0x80000000) != v) {
                return false;
            }
        }
        return true;
    }

    void T2(int v) {
        this.x = v / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(v, this.v.k());
    }

    private void U1(View view0, c staggeredGridLayoutManager$c0, f f0) {
        if(f0.e == 1) {
            if(staggeredGridLayoutManager$c0.f) {
                this.Q1(view0);
                return;
            }
            staggeredGridLayoutManager$c0.e.a(view0);
            return;
        }
        if(staggeredGridLayoutManager$c0.f) {
            this.D2(view0);
            return;
        }
        staggeredGridLayoutManager$c0.e.u(view0);
    }

    private void U2(d staggeredGridLayoutManager$d0, int v, int v1) {
        int v2 = staggeredGridLayoutManager$d0.j();
        if(v == -1) {
            if(staggeredGridLayoutManager$d0.o() + v2 <= v1) {
                this.B.set(staggeredGridLayoutManager$d0.e, false);
            }
        }
        else if(staggeredGridLayoutManager$d0.k() - v2 >= v1) {
            this.B.set(staggeredGridLayoutManager$d0.e, false);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void V0(RecyclerView recyclerView0, int v, int v1) {
        this.u2(v, v1, 1);
    }

    private int V1(int v) {
        if(this.O() == 0) {
            return this.A ? 1 : -1;
        }
        return v < this.n2() == this.A ? 1 : -1;
    }

    private int V2(int v, int v1, int v2) {
        if(v1 == 0 && v2 == 0) {
            return v;
        }
        int v3 = View.MeasureSpec.getMode(v);
        return v3 == 0x80000000 || v3 == 0x40000000 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(v) - v1 - v2), v3) : v;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void W0(RecyclerView recyclerView0) {
        this.E.b();
        this.x1();
    }

    // 检测为 Lambda 实现
    boolean W1() [...]

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void X0(RecyclerView recyclerView0, int v, int v1, int v2) {
        this.u2(v, v1, 8);
    }

    private boolean X1(d staggeredGridLayoutManager$d0) {
        if(this.A) {
            return staggeredGridLayoutManager$d0.k() >= this.u.i() ? false : !staggeredGridLayoutManager$d0.n(((View)staggeredGridLayoutManager$d0.a.get(staggeredGridLayoutManager$d0.a.size() - 1))).f;
        }
        return staggeredGridLayoutManager$d0.o() <= this.u.m() ? false : !staggeredGridLayoutManager$d0.n(((View)staggeredGridLayoutManager$d0.a.get(0))).f;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void Y0(RecyclerView recyclerView0, int v, int v1) {
        this.u2(v, v1, 2);
    }

    private int Y1(y recyclerView$y0) {
        return this.O() == 0 ? 0 : m.a(recyclerView$y0, this.u, this.i2(!this.N), this.h2(!this.N), this, this.N);
    }

    private int Z1(y recyclerView$y0) {
        return this.O() == 0 ? 0 : m.b(recyclerView$y0, this.u, this.i2(!this.N), this.h2(!this.N), this, this.N, this.A);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void a1(RecyclerView recyclerView0, int v, int v1, Object object0) {
        this.u2(v, v1, 4);
    }

    private int a2(y recyclerView$y0) {
        return this.O() == 0 ? 0 : m.c(recyclerView$y0, this.u, this.i2(!this.N), this.h2(!this.N), this, this.N);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void b1(u recyclerView$u0, y recyclerView$y0) {
        this.A2(recyclerView$u0, recyclerView$y0, true);
    }

    private int b2(int v) {
        switch(v) {
            case 1: {
                if(this.w == 1) {
                    return -1;
                }
                return this.x2() ? 1 : -1;
            }
            case 2: {
                if(this.w == 1) {
                    return 1;
                }
                return this.x2() ? -1 : 1;
            }
            case 17: {
                return this.w == 0 ? -1 : 0x80000000;
            }
            case 33: {
                return this.w == 1 ? -1 : 0x80000000;
            }
            case 66: {
                return this.w == 0 ? 1 : 0x80000000;
            }
            case 130: {
                return this.w == 1 ? 1 : 0x80000000;
            }
            default: {
                return 0x80000000;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$x$b
    public PointF c(int v) {
        int v1 = this.V1(v);
        PointF pointF0 = new PointF();
        if(v1 == 0) {
            return null;
        }
        if(this.w == 0) {
            pointF0.x = (float)v1;
            pointF0.y = 0.0f;
            return pointF0;
        }
        pointF0.x = 0.0f;
        pointF0.y = (float)v1;
        return pointF0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void c1(y recyclerView$y0) {
        super.c1(recyclerView$y0);
        this.C = -1;
        this.D = 0x80000000;
        this.I = null;
        this.L.c();
    }

    private FullSpanItem c2(int v) {
        FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = new FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.h = new int[this.s];
        for(int v1 = 0; v1 < this.s; ++v1) {
            int[] arr_v = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.h;
            arr_v[v1] = v - this.t[v1].l(v);
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0;
    }

    private FullSpanItem d2(int v) {
        FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = new FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.h = new int[this.s];
        for(int v1 = 0; v1 < this.s; ++v1) {
            int[] arr_v = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.h;
            arr_v[v1] = this.t[v1].p(v) - v;
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0;
    }

    private void e2() {
        this.u = i.b(this, this.w);
        this.v = i.b(this, 1 - this.w);
    }

    private int f2(u recyclerView$u0, f f0, y recyclerView$y0) {
        int v14;
        int v11;
        int v10;
        int v7;
        int v6;
        d staggeredGridLayoutManager$d0;
        int v;
        this.B.set(0, this.s, true);
        if(!this.y.i) {
            v = f0.e == 1 ? f0.g + f0.b : f0.f - f0.b;
        }
        else if(f0.e == 1) {
            v = 0x7FFFFFFF;
        }
        else {
            v = 0x80000000;
        }
        this.O2(f0.e, v);
        int v1 = this.A ? this.u.i() : this.u.m();
        boolean z;
        for(z = false; f0.a(recyclerView$y0) && (this.y.i || !this.B.isEmpty()); z = true) {
            View view0 = f0.b(recyclerView$u0);
            c staggeredGridLayoutManager$c0 = (c)view0.getLayoutParams();
            int v2 = staggeredGridLayoutManager$c0.a();
            int v3 = this.E.g(v2);
            boolean z1 = v3 == -1;
            if(z1) {
                staggeredGridLayoutManager$d0 = staggeredGridLayoutManager$c0.f ? this.t[0] : this.t2(f0);
                this.E.n(v2, staggeredGridLayoutManager$d0);
            }
            else {
                staggeredGridLayoutManager$d0 = this.t[v3];
            }
            staggeredGridLayoutManager$c0.e = staggeredGridLayoutManager$d0;
            if(f0.e == 1) {
                this.i(view0);
            }
            else {
                this.j(view0, 0);
            }
            this.z2(view0, staggeredGridLayoutManager$c0, false);
            if(f0.e == 1) {
                int v4 = staggeredGridLayoutManager$c0.f ? this.p2(v1) : staggeredGridLayoutManager$d0.l(v1);
                int v5 = this.u.e(view0);
                if(z1 && staggeredGridLayoutManager$c0.f) {
                    FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = this.c2(v4);
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.g = -1;
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.f = v2;
                    this.E.a(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0);
                }
                v6 = v5 + v4;
                v7 = v4;
            }
            else {
                int v8 = staggeredGridLayoutManager$c0.f ? this.s2(v1) : staggeredGridLayoutManager$d0.p(v1);
                v7 = v8 - this.u.e(view0);
                if(z1 && staggeredGridLayoutManager$c0.f) {
                    FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 = this.d2(v8);
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.g = 1;
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.f = v2;
                    this.E.a(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1);
                }
                v6 = v8;
            }
            if(staggeredGridLayoutManager$c0.f && f0.d == -1) {
                if(z1) {
                    this.M = true;
                }
                else if(!(f0.e == 1 ? this.S1() : this.T1()) != 0) {
                    FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = this.E.f(v2);
                    if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 != null) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.i = true;
                    }
                    this.M = true;
                }
            }
            this.U1(view0, staggeredGridLayoutManager$c0, f0);
            if(!this.x2() || this.w != 1) {
                int v12 = staggeredGridLayoutManager$c0.f ? this.v.m() : staggeredGridLayoutManager$d0.e * this.x + this.v.m();
                v11 = v12;
                v10 = this.v.e(view0) + v12;
            }
            else {
                int v9 = staggeredGridLayoutManager$c0.f ? this.v.i() : this.v.i() - (this.s - 1 - staggeredGridLayoutManager$d0.e) * this.x;
                v10 = v9;
                v11 = v9 - this.v.e(view0);
            }
            if(this.w == 1) {
                this.D0(view0, v11, v7, v10, v6);
            }
            else {
                this.D0(view0, v7, v11, v6, v10);
            }
            if(staggeredGridLayoutManager$c0.f) {
                this.O2(this.y.e, v);
            }
            else {
                this.U2(staggeredGridLayoutManager$d0, this.y.e, v);
            }
            this.E2(recyclerView$u0, this.y);
            if(this.y.h && view0.hasFocusable()) {
                if(staggeredGridLayoutManager$c0.f) {
                    this.B.clear();
                }
                else {
                    this.B.set(staggeredGridLayoutManager$d0.e, false);
                }
            }
        }
        if(!z) {
            this.E2(recyclerView$u0, this.y);
        }
        if(this.y.e == -1) {
            int v13 = this.s2(this.u.m());
            v14 = this.u.m() - v13;
            return v14 <= 0 ? 0 : Math.min(f0.b, v14);
        }
        v14 = this.p2(this.u.i()) - this.u.i();
        return v14 <= 0 ? 0 : Math.min(f0.b, v14);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void g1(Parcelable parcelable0) {
        if(parcelable0 instanceof SavedState) {
            this.I = (SavedState)parcelable0;
            this.x1();
        }
    }

    private int g2(int v) {
        int v1 = this.O();
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = this.l0(this.N(v2));
            if(v3 >= 0 && v3 < v) {
                return v3;
            }
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public Parcelable h1() {
        int v1;
        if(this.I != null) {
            return new SavedState(this.I);
        }
        Parcelable parcelable0 = new SavedState();
        parcelable0.m = this.z;
        parcelable0.n = this.G;
        parcelable0.o = this.H;
        LazySpanLookup staggeredGridLayoutManager$LazySpanLookup0 = this.E;
        if(staggeredGridLayoutManager$LazySpanLookup0 == null) {
            parcelable0.j = 0;
        }
        else {
            int[] arr_v = staggeredGridLayoutManager$LazySpanLookup0.a;
            if(arr_v == null) {
                parcelable0.j = 0;
            }
            else {
                parcelable0.k = arr_v;
                parcelable0.j = arr_v.length;
                parcelable0.l = staggeredGridLayoutManager$LazySpanLookup0.b;
            }
        }
        if(this.O() > 0) {
            parcelable0.f = this.G ? this.o2() : this.n2();
            parcelable0.g = this.j2();
            parcelable0.h = this.s;
            parcelable0.i = new int[this.s];
            for(int v = 0; v < this.s; ++v) {
                if(this.G) {
                    v1 = this.t[v].l(0x80000000);
                    if(v1 != 0x80000000) {
                        v1 -= this.u.i();
                    }
                }
                else {
                    v1 = this.t[v].p(0x80000000);
                    if(v1 != 0x80000000) {
                        v1 -= this.u.m();
                    }
                }
                parcelable0.i[v] = v1;
            }
            return parcelable0;
        }
        parcelable0.f = -1;
        parcelable0.g = -1;
        parcelable0.h = 0;
        return parcelable0;
    }

    View h2(boolean z) {
        int v = this.u.m();
        int v1 = this.u.i();
        int v2 = this.O() - 1;
        View view0 = null;
        while(v2 >= 0) {
            View view1 = this.N(v2);
            int v3 = this.u.g(view1);
            int v4 = this.u.d(view1);
            if(v4 > v && v3 < v1) {
                if(v4 <= v1 || !z) {
                    return view1;
                }
                if(view0 == null) {
                    view0 = view1;
                }
            }
            --v2;
        }
        return view0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void i1(int v) {
        if(v == 0) {
            this.W1();
        }
    }

    View i2(boolean z) {
        int v = this.u.m();
        int v1 = this.u.i();
        int v2 = this.O();
        View view0 = null;
        for(int v3 = 0; v3 < v2; ++v3) {
            View view1 = this.N(v3);
            int v4 = this.u.g(view1);
            if(this.u.d(view1) > v && v4 < v1) {
                if(v4 >= v || !z) {
                    return view1;
                }
                if(view0 == null) {
                    view0 = view1;
                }
            }
        }
        return view0;
    }

    int j2() {
        View view0 = this.A ? this.h2(true) : this.i2(true);
        return view0 == null ? -1 : this.l0(view0);
    }

    private int k2(int v) {
        for(int v1 = this.O() - 1; v1 >= 0; --v1) {
            int v2 = this.l0(this.N(v1));
            if(v2 >= 0 && v2 < v) {
                return v2;
            }
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void l(String s) {
        if(this.I == null) {
            super.l(s);
        }
    }

    private void l2(u recyclerView$u0, y recyclerView$y0, boolean z) {
        int v = this.p2(0x80000000);
        if(v == 0x80000000) {
            return;
        }
        int v1 = this.u.i() - v;
        if(v1 > 0) {
            int v2 = v1 - -this.J2(-v1, recyclerView$u0, recyclerView$y0);
            if(z && v2 > 0) {
                this.u.r(v2);
            }
        }
    }

    private void m2(u recyclerView$u0, y recyclerView$y0, boolean z) {
        int v = this.s2(0x7FFFFFFF);
        if(v == 0x7FFFFFFF) {
            return;
        }
        int v1 = v - this.u.m();
        if(v1 > 0) {
            int v2 = v1 - this.J2(v1, recyclerView$u0, recyclerView$y0);
            if(z && v2 > 0) {
                this.u.r(-v2);
            }
        }
    }

    int n2() {
        return this.O() == 0 ? 0 : this.l0(this.N(0));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int o0(u recyclerView$u0, y recyclerView$y0) {
        return this.w == 0 ? this.s : super.o0(recyclerView$u0, recyclerView$y0);
    }

    int o2() {
        int v = this.O();
        return v == 0 ? 0 : this.l0(this.N(v - 1));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean p() {
        return this.w == 0;
    }

    private int p2(int v) {
        int v1 = this.t[0].l(v);
        for(int v2 = 1; v2 < this.s; ++v2) {
            int v3 = this.t[v2].l(v);
            if(v3 > v1) {
                v1 = v3;
            }
        }
        return v1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean q() {
        return this.w == 1;
    }

    private int q2(int v) {
        int v1 = this.t[0].p(v);
        for(int v2 = 1; v2 < this.s; ++v2) {
            int v3 = this.t[v2].p(v);
            if(v3 > v1) {
                v1 = v3;
            }
        }
        return v1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean r(p recyclerView$p0) {
        return recyclerView$p0 instanceof c;
    }

    private int r2(int v) {
        int v1 = this.t[0].l(v);
        for(int v2 = 1; v2 < this.s; ++v2) {
            int v3 = this.t[v2].l(v);
            if(v3 < v1) {
                v1 = v3;
            }
        }
        return v1;
    }

    private int s2(int v) {
        int v1 = this.t[0].p(v);
        for(int v2 = 1; v2 < this.s; ++v2) {
            int v3 = this.t[v2].p(v);
            if(v3 < v1) {
                v1 = v3;
            }
        }
        return v1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void t(int v, int v1, y recyclerView$y0, androidx.recyclerview.widget.RecyclerView.o.c recyclerView$o$c0) {
        int v6;
        int v5;
        if(this.w != 0) {
            v = v1;
        }
        if(this.O() != 0 && v != 0) {
            this.C2(v, recyclerView$y0);
            if(this.O == null || this.O.length < this.s) {
                this.O = new int[this.s];
            }
            int v4 = 0;
            for(int v3 = 0; v3 < this.s; ++v3) {
                f f0 = this.y;
                if(f0.d == -1) {
                    v5 = f0.f;
                    v6 = this.t[v3].p(v5);
                }
                else {
                    v5 = this.t[v3].l(f0.g);
                    v6 = this.y.g;
                }
                int v7 = v5 - v6;
                if(v7 >= 0) {
                    this.O[v4] = v7;
                    ++v4;
                }
            }
            Arrays.sort(this.O, 0, v4);
            for(int v2 = 0; v2 < v4 && this.y.a(recyclerView$y0); ++v2) {
                recyclerView$o$c0.a(this.y.c, this.O[v2]);
                this.y.c += this.y.d;
            }
        }
    }

    private d t2(f f0) {
        int v2;
        int v1;
        int v;
        if(this.B2(f0.e)) {
            v = this.s - 1;
            v1 = -1;
            v2 = -1;
        }
        else {
            v1 = this.s;
            v = 0;
            v2 = 1;
        }
        d staggeredGridLayoutManager$d0 = null;
        if(f0.e == 1) {
            int v3 = this.u.m();
            int v4 = 0x7FFFFFFF;
            while(v != v1) {
                d staggeredGridLayoutManager$d1 = this.t[v];
                int v5 = staggeredGridLayoutManager$d1.l(v3);
                if(v5 < v4) {
                    staggeredGridLayoutManager$d0 = staggeredGridLayoutManager$d1;
                    v4 = v5;
                }
                v += v2;
            }
            return staggeredGridLayoutManager$d0;
        }
        int v6 = this.u.i();
        int v7 = 0x80000000;
        while(v != v1) {
            d staggeredGridLayoutManager$d2 = this.t[v];
            int v8 = staggeredGridLayoutManager$d2.p(v6);
            if(v8 > v7) {
                staggeredGridLayoutManager$d0 = staggeredGridLayoutManager$d2;
                v7 = v8;
            }
            v += v2;
        }
        return staggeredGridLayoutManager$d0;
    }

    private void u2(int v, int v1, int v2) {
        int v5;
        int v4;
        int v3 = this.A ? this.o2() : this.n2();
        if(v2 != 8) {
            v4 = v + v1;
            v5 = v;
        }
        else if(v < v1) {
            v4 = v1 + 1;
            v5 = v;
        }
        else {
            v4 = v + 1;
            v5 = v1;
        }
        this.E.h(v5);
        if(v2 == 1) {
            this.E.j(v, v1);
        }
        else {
            switch(v2) {
                case 2: {
                    this.E.k(v, v1);
                    break;
                }
                case 8: {
                    this.E.k(v, 1);
                    this.E.j(v1, 1);
                }
            }
        }
        if(v4 <= v3) {
            return;
        }
        if(v5 <= (this.A ? this.n2() : this.o2())) {
            this.x1();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int v(y recyclerView$y0) {
        return this.Y1(recyclerView$y0);
    }

    View v2() {
        int v = this.O();
        int v1 = v - 1;
        BitSet bitSet0 = new BitSet(this.s);
        bitSet0.set(0, this.s, true);
        int v2 = -1;
        int v3 = this.w != 1 || !this.x2() ? -1 : 1;
        if(this.A) {
            v = -1;
        }
        else {
            v1 = 0;
        }
        if(v1 < v) {
            v2 = 1;
        }
        while(v1 != v) {
            View view0 = this.N(v1);
            c staggeredGridLayoutManager$c0 = (c)view0.getLayoutParams();
            if(bitSet0.get(staggeredGridLayoutManager$c0.e.e)) {
                if(this.X1(staggeredGridLayoutManager$c0.e)) {
                    return view0;
                }
                bitSet0.clear(staggeredGridLayoutManager$c0.e.e);
            }
            if(!staggeredGridLayoutManager$c0.f) {
                int v4 = v1 + v2;
                if(v4 != v) {
                    View view1 = this.N(v4);
                    if(this.A) {
                        int v5 = this.u.d(view0);
                        int v6 = this.u.d(view1);
                        if(v5 < v6) {
                            return view0;
                        }
                        if(v5 == v6) {
                            goto label_35;
                        }
                    }
                    else {
                        int v7 = this.u.g(view0);
                        int v8 = this.u.g(view1);
                        if(v7 > v8) {
                            return view0;
                        }
                        if(v7 == v8) {
                        label_35:
                            c staggeredGridLayoutManager$c1 = (c)view1.getLayoutParams();
                            if((staggeredGridLayoutManager$c0.e.e - staggeredGridLayoutManager$c1.e.e >= 0 ? 0 : 1) != (v3 >= 0 ? 0 : 1)) {
                                return view0;
                            }
                        }
                    }
                }
            }
            v1 += v2;
        }
        return null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int w(y recyclerView$y0) {
        return this.Z1(recyclerView$y0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean w0() {
        return this.F != 0;
    }

    public void w2() {
        this.E.b();
        this.x1();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int x(y recyclerView$y0) {
        return this.a2(recyclerView$y0);
    }

    boolean x2() {
        return this.d0() == 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int y(y recyclerView$y0) {
        return this.Y1(recyclerView$y0);
    }

    private void y2(View view0, int v, int v1, boolean z) {
        this.o(view0, this.K);
        c staggeredGridLayoutManager$c0 = (c)view0.getLayoutParams();
        int v2 = this.V2(v, staggeredGridLayoutManager$c0.leftMargin + this.K.left, staggeredGridLayoutManager$c0.rightMargin + this.K.right);
        int v3 = this.V2(v1, staggeredGridLayoutManager$c0.topMargin + this.K.top, staggeredGridLayoutManager$c0.bottomMargin + this.K.bottom);
        if((z ? this.L1(view0, v2, v3, staggeredGridLayoutManager$c0) : this.J1(view0, v2, v3, staggeredGridLayoutManager$c0))) {
            view0.measure(v2, v3);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int z(y recyclerView$y0) {
        return this.Z1(recyclerView$y0);
    }

    private void z2(View view0, c staggeredGridLayoutManager$c0, boolean z) {
        if(staggeredGridLayoutManager$c0.f) {
            if(this.w == 1) {
                this.y2(view0, this.J, o.P(this.b0(), this.c0(), this.k0() + this.h0(), staggeredGridLayoutManager$c0.height, true), z);
                return;
            }
            this.y2(view0, o.P(this.s0(), this.t0(), this.i0() + this.j0(), staggeredGridLayoutManager$c0.width, true), this.J, z);
            return;
        }
        if(this.w == 1) {
            this.y2(view0, o.P(this.x, this.t0(), 0, staggeredGridLayoutManager$c0.width, false), o.P(this.b0(), this.c0(), this.k0() + this.h0(), staggeredGridLayoutManager$c0.height, true), z);
            return;
        }
        this.y2(view0, o.P(this.s0(), this.t0(), this.i0() + this.j0(), staggeredGridLayoutManager$c0.width, true), o.P(this.x, this.c0(), 0, staggeredGridLayoutManager$c0.height, false), z);
    }
}

