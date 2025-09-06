package androidx.recyclerview.widget;

import androidx.core.os.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class e implements Runnable {
    static final class a implements Comparator {
        public int a(c e$c0, c e$c1) {
            RecyclerView recyclerView0 = e$c0.d;
            if((recyclerView0 == null ? 1 : 0) != (e$c1.d == null ? 1 : 0)) {
                return recyclerView0 == null ? 1 : -1;
            }
            boolean z = e$c0.a;
            if(z != e$c1.a) {
                return z ? -1 : 1;
            }
            int v = e$c1.b - e$c0.b;
            if(v != 0) {
                return v;
            }
            int v1 = e$c0.c - e$c1.c;
            return v1 == 0 ? 0 : v1;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.a(((c)object0), ((c)object1));
        }
    }

    static class b implements androidx.recyclerview.widget.RecyclerView.o.c {
        int a;
        int b;
        int[] c;
        int d;

        @Override  // androidx.recyclerview.widget.RecyclerView$o$c
        public void a(int v, int v1) {
            if(v < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if(v1 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int v2 = this.d;
            int[] arr_v = this.c;
            if(arr_v == null) {
                int[] arr_v1 = new int[4];
                this.c = arr_v1;
                Arrays.fill(arr_v1, -1);
            }
            else if(v2 * 2 >= arr_v.length) {
                int[] arr_v2 = new int[v2 * 4];
                this.c = arr_v2;
                System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
            }
            int[] arr_v3 = this.c;
            arr_v3[v2 * 2] = v;
            arr_v3[v2 * 2 + 1] = v1;
            ++this.d;
        }

        void b() {
            int[] arr_v = this.c;
            if(arr_v != null) {
                Arrays.fill(arr_v, -1);
            }
            this.d = 0;
        }

        void c(RecyclerView recyclerView0, boolean z) {
            this.d = 0;
            int[] arr_v = this.c;
            if(arr_v != null) {
                Arrays.fill(arr_v, -1);
            }
            o recyclerView$o0 = recyclerView0.r;
            if(recyclerView0.q != null && recyclerView$o0 != null && recyclerView$o0.y0()) {
                if(!z) {
                    if(!recyclerView0.m0()) {
                        recyclerView$o0.t(this.a, this.b, recyclerView0.l0, this);
                    }
                }
                else if(!recyclerView0.i.p()) {
                    recyclerView$o0.u(recyclerView0.q.e(), this);
                }
                int v = this.d;
                if(v > recyclerView$o0.m) {
                    recyclerView$o0.m = v;
                    recyclerView$o0.n = z;
                    recyclerView0.g.K();
                }
            }
        }

        boolean d(int v) {
            if(this.c != null) {
                int v1 = this.d * 2;
                for(int v2 = 0; v2 < v1; v2 += 2) {
                    if(this.c[v2] == v) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int v, int v1) {
            this.a = v;
            this.b = v1;
        }
    }

    static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    ArrayList f;
    long g;
    long h;
    private ArrayList i;
    static final ThreadLocal j;
    static Comparator k;

    static {
        e.j = new ThreadLocal();
        e.k = new a();
    }

    e() {
        this.f = new ArrayList();
        this.i = new ArrayList();
    }

    public void a(RecyclerView recyclerView0) {
        this.f.add(recyclerView0);
    }

    private void b() {
        c e$c0;
        int v = this.f.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            RecyclerView recyclerView0 = (RecyclerView)this.f.get(v1);
            if(recyclerView0.getWindowVisibility() == 0) {
                recyclerView0.k0.c(recyclerView0, false);
                v2 += recyclerView0.k0.d;
            }
        }
        this.i.ensureCapacity(v2);
        int v4 = 0;
        for(int v3 = 0; v3 < v; ++v3) {
            RecyclerView recyclerView1 = (RecyclerView)this.f.get(v3);
            if(recyclerView1.getWindowVisibility() == 0) {
                b e$b0 = recyclerView1.k0;
                int v5 = Math.abs(e$b0.a) + Math.abs(e$b0.b);
                for(int v6 = 0; v6 < e$b0.d * 2; v6 += 2) {
                    if(v4 >= this.i.size()) {
                        e$c0 = new c();
                        this.i.add(e$c0);
                    }
                    else {
                        e$c0 = (c)this.i.get(v4);
                    }
                    int[] arr_v = e$b0.c;
                    int v7 = arr_v[v6 + 1];
                    e$c0.a = v7 <= v5;
                    e$c0.b = v5;
                    e$c0.c = v7;
                    e$c0.d = recyclerView1;
                    e$c0.e = arr_v[v6];
                    ++v4;
                }
            }
        }
        Collections.sort(this.i, e.k);
    }

    private void c(c e$c0, long v) {
        B recyclerView$B0 = this.i(e$c0.d, e$c0.e, (e$c0.a ? 0x7FFFFFFFFFFFFFFFL : v));
        if(recyclerView$B0 != null && recyclerView$B0.b != null && recyclerView$B0.s() && !recyclerView$B0.t()) {
            this.h(((RecyclerView)recyclerView$B0.b.get()), v);
        }
    }

    private void d(long v) {
        for(int v1 = 0; v1 < this.i.size(); ++v1) {
            c e$c0 = (c)this.i.get(v1);
            if(e$c0.d == null) {
                break;
            }
            this.c(e$c0, v);
            e$c0.a();
        }
    }

    static boolean e(RecyclerView recyclerView0, int v) {
        int v1 = recyclerView0.j.j();
        for(int v2 = 0; v2 < v1; ++v2) {
            B recyclerView$B0 = RecyclerView.g0(recyclerView0.j.i(v2));
            if(recyclerView$B0.c == v && !recyclerView$B0.t()) {
                return true;
            }
        }
        return false;
    }

    void f(RecyclerView recyclerView0, int v, int v1) {
        if(recyclerView0.isAttachedToWindow() && this.g == 0L) {
            this.g = 23272492358300L;
            recyclerView0.post(this);
        }
        recyclerView0.k0.e(v, v1);
    }

    void g(long v) {
        this.b();
        this.d(v);
    }

    private void h(RecyclerView recyclerView0, long v) {
        if(recyclerView0 == null) {
            return;
        }
        if(recyclerView0.H && recyclerView0.j.j() != 0) {
            recyclerView0.V0();
        }
        b e$b0 = recyclerView0.k0;
        e$b0.c(recyclerView0, true);
        if(e$b0.d != 0) {
            try {
                u.a("RV Nested Prefetch");
                recyclerView0.l0.f(recyclerView0.q);
                for(int v2 = 0; v2 < e$b0.d * 2; v2 += 2) {
                    this.i(recyclerView0, e$b0.c[v2], v);
                }
            }
            finally {
                u.b();
            }
        }
    }

    private B i(RecyclerView recyclerView0, int v, long v1) {
        if(e.e(recyclerView0, v)) {
            return null;
        }
        try {
            androidx.recyclerview.widget.RecyclerView.u recyclerView$u0 = recyclerView0.g;
            recyclerView0.H0();
            B recyclerView$B0 = recyclerView$u0.I(v, false, v1);
            if(recyclerView$B0 != null) {
                if(!recyclerView$B0.s() || recyclerView$B0.t()) {
                    recyclerView$u0.a(recyclerView$B0, false);
                }
                else {
                    recyclerView$u0.B(recyclerView$B0.a);
                }
            }
            return recyclerView$B0;
        }
        finally {
            recyclerView0.J0(false);
        }
    }

    public void j(RecyclerView recyclerView0) {
        this.f.remove(recyclerView0);
    }

    @Override
    public void run() {
        try {
            u.a("RV Prefetch");
            if(!this.f.isEmpty()) {
                int v = this.f.size();
                long v2 = 0L;
                for(int v1 = 0; v1 < v; ++v1) {
                    RecyclerView recyclerView0 = (RecyclerView)this.f.get(v1);
                    if(recyclerView0.getWindowVisibility() == 0) {
                        v2 = Math.max(recyclerView0.getDrawingTime(), v2);
                    }
                }
                if(v2 != 0L) {
                    this.g(TimeUnit.MILLISECONDS.toNanos(v2) + this.h);
                    goto label_18;
                }
            }
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        this.g = 0L;
        u.b();
        throw throwable0;
    label_18:
        this.g = 0L;
        u.b();
        return;
    label_21:
        this.g = 0L;
        u.b();
    }
}

