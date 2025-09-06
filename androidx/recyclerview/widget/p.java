package androidx.recyclerview.widget;

import android.view.View;

class p {
    static class a {
        int a;
        int b;
        int c;
        int d;
        int e;

        a() {
            this.a = 0;
        }

        void a(int v) {
            this.a |= v;
        }

        boolean b() {
            if((this.a & 7) != 0 && (this.a & this.c(this.d, this.b)) == 0) {
                return false;
            }
            if((this.a & 0x70) != 0 && (this.a & this.c(this.d, this.c) << 4) == 0) {
                return false;
            }
            return (this.a & 0x700) == 0 || (this.a & this.c(this.e, this.b) << 8) != 0 ? (this.a & 0x7000) == 0 || (this.a & this.c(this.e, this.c) << 12) != 0 : false;
        }

        int c(int v, int v1) {
            if(v > v1) {
                return 1;
            }
            return v == v1 ? 2 : 4;
        }

        void d() {
            this.a = 0;
        }

        void e(int v, int v1, int v2, int v3) {
            this.b = v;
            this.c = v1;
            this.d = v2;
            this.e = v3;
        }
    }

    interface b {
        View a(int arg1);

        int b(View arg1);

        int c();

        int d();

        int e(View arg1);
    }

    final b a;
    a b;

    p(b p$b0) {
        this.a = p$b0;
        this.b = new a();
    }

    View a(int v, int v1, int v2, int v3) {
        int v4 = this.a.c();
        int v5 = this.a.d();
        int v6 = v1 <= v ? -1 : 1;
        View view0 = null;
        while(v != v1) {
            View view1 = this.a.a(v);
            int v7 = this.a.b(view1);
            int v8 = this.a.e(view1);
            this.b.e(v4, v5, v7, v8);
            if(v2 != 0) {
                this.b.d();
                this.b.a(v2);
                if(this.b.b()) {
                    return view1;
                }
            }
            if(v3 != 0) {
                this.b.d();
                this.b.a(v3);
                if(this.b.b()) {
                    view0 = view1;
                }
            }
            v += v6;
        }
        return view0;
    }

    boolean b(View view0, int v) {
        this.b.e(this.a.c(), this.a.d(), this.a.b(view0), this.a.e(view0));
        if(v != 0) {
            this.b.d();
            this.b.a(v);
            return this.b.b();
        }
        return false;
    }
}

