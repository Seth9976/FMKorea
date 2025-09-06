package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

class b {
    static class a {
        long a;
        a b;

        a() {
            this.a = 0L;
        }

        void a(int v) {
            if(v >= 0x40) {
                a b$a0 = this.b;
                if(b$a0 != null) {
                    b$a0.a(v - 0x40);
                }
            }
            else {
                this.a &= ~(1L << v);
            }
        }

        int b(int v) {
            a b$a0 = this.b;
            if(b$a0 == null) {
                return v < 0x40 ? Long.bitCount(this.a & (1L << v) - 1L) : Long.bitCount(this.a);
            }
            return v >= 0x40 ? b$a0.b(v - 0x40) + Long.bitCount(this.a) : Long.bitCount(this.a & (1L << v) - 1L);
        }

        private void c() {
            if(this.b == null) {
                this.b = new a();
            }
        }

        boolean d(int v) {
            if(v >= 0x40) {
                this.c();
                return this.b.d(v - 0x40);
            }
            return (this.a & 1L << v) != 0L;
        }

        void e(int v, boolean z) {
            if(v >= 0x40) {
                this.c();
                this.b.e(v - 0x40, z);
                return;
            }
            boolean z1 = Long.compare(0x8000000000000000L & this.a, 0L) != 0;
            long v1 = (1L << v) - 1L;
            this.a = (this.a & ~v1) << 1 | this.a & v1;
            if(z) {
                this.h(v);
            }
            else {
                this.a(v);
            }
            if(z1 || this.b != null) {
                this.c();
                this.b.e(0, z1);
            }
        }

        boolean f(int v) {
            if(v >= 0x40) {
                this.c();
                return this.b.f(v - 0x40);
            }
            boolean z = Long.compare(this.a & 1L << v, 0L) != 0;
            long v1 = this.a & ~(1L << v);
            long v2 = (1L << v) - 1L;
            this.a = v1 & v2 | Long.rotateRight(~v2 & v1, 1);
            a b$a0 = this.b;
            if(b$a0 != null) {
                if(b$a0.d(0)) {
                    this.h(0x3F);
                }
                this.b.f(0);
            }
            return z;
        }

        void g() {
            this.a = 0L;
            a b$a0 = this.b;
            if(b$a0 != null) {
                b$a0.g();
            }
        }

        void h(int v) {
            if(v >= 0x40) {
                this.c();
                this.b.h(v - 0x40);
                return;
            }
            this.a |= 1L << v;
        }

        // 去混淆评级： 中等(50)
        @Override
        public String toString() [...] // 潜在的解密器
    }

    interface androidx.recyclerview.widget.b.b {
        View a(int arg1);

        void addView(View arg1, int arg2);

        void b(View arg1);

        int c();

        void d();

        int e(View arg1);

        B f(View arg1);

        void g(int arg1);

        void h(View arg1);

        void i(int arg1);

        void j(View arg1, int arg2, ViewGroup.LayoutParams arg3);
    }

    final androidx.recyclerview.widget.b.b a;
    final a b;
    final List c;

    b(androidx.recyclerview.widget.b.b b$b0) {
        this.a = b$b0;
        this.b = new a();
        this.c = new ArrayList();
    }

    void a(View view0, int v, boolean z) {
        int v1 = v >= 0 ? this.h(v) : this.a.c();
        this.b.e(v1, z);
        if(z) {
            this.l(view0);
        }
        this.a.addView(view0, v1);
    }

    void b(View view0, boolean z) {
        this.a(view0, -1, z);
    }

    void c(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0, boolean z) {
        int v1 = v >= 0 ? this.h(v) : this.a.c();
        this.b.e(v1, z);
        if(z) {
            this.l(view0);
        }
        this.a.j(view0, v1, viewGroup$LayoutParams0);
    }

    void d(int v) {
        int v1 = this.h(v);
        this.b.f(v1);
        this.a.g(v1);
    }

    View e(int v) {
        int v1 = this.c.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = (View)this.c.get(v2);
            B recyclerView$B0 = this.a.f(view0);
            if(recyclerView$B0.m() == v && !recyclerView$B0.t() && !recyclerView$B0.v()) {
                return view0;
            }
        }
        return null;
    }

    View f(int v) {
        int v1 = this.h(v);
        return this.a.a(v1);
    }

    int g() {
        return this.a.c() - this.c.size();
    }

    private int h(int v) {
        if(v < 0) {
            return -1;
        }
        int v1 = this.a.c();
        for(int v2 = v; v2 < v1; v2 += v3) {
            int v3 = v - (v2 - this.b.b(v2));
            if(v3 == 0) {
                while(this.b.d(v2)) {
                    ++v2;
                }
                return v2;
            }
        }
        return -1;
    }

    View i(int v) {
        return this.a.a(v);
    }

    int j() {
        return this.a.c();
    }

    void k(View view0) {
        int v = this.a.e(view0);
        if(v < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view0);
        }
        this.b.h(v);
        this.l(view0);
    }

    private void l(View view0) {
        this.c.add(view0);
        this.a.b(view0);
    }

    int m(View view0) {
        int v = this.a.e(view0);
        if(v == -1) {
            return -1;
        }
        return this.b.d(v) ? -1 : v - this.b.b(v);
    }

    boolean n(View view0) {
        return this.c.contains(view0);
    }

    void o() {
        this.b.g();
        for(int v = this.c.size() - 1; v >= 0; --v) {
            View view0 = (View)this.c.get(v);
            this.a.h(view0);
            this.c.remove(v);
        }
        this.a.d();
    }

    void p(View view0) {
        int v = this.a.e(view0);
        if(v < 0) {
            return;
        }
        if(this.b.f(v)) {
            this.t(view0);
        }
        this.a.i(v);
    }

    void q(int v) {
        int v1 = this.h(v);
        View view0 = this.a.a(v1);
        if(view0 == null) {
            return;
        }
        if(this.b.f(v1)) {
            this.t(view0);
        }
        this.a.i(v1);
    }

    boolean r(View view0) {
        int v = this.a.e(view0);
        if(v == -1) {
            this.t(view0);
            return true;
        }
        if(this.b.d(v)) {
            this.b.f(v);
            this.t(view0);
            this.a.i(v);
            return true;
        }
        return false;
    }

    void s(View view0) {
        int v = this.a.e(view0);
        if(v < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view0);
        }
        if(!this.b.d(v)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view0);
        }
        this.b.a(v);
        this.t(view0);
    }

    private boolean t(View view0) {
        if(this.c.remove(view0)) {
            this.a.h(view0);
            return true;
        }
        return false;
    }

    // 去混淆评级： 低(40)
    @Override
    public String toString() {
        return "0, hidden list:" + this.c.size();
    }
}

