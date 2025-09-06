package androidx.recyclerview.widget;

import B.e;
import B.f;
import androidx.collection.d;
import androidx.collection.g;

class q {
    static class a {
        int a;
        b b;
        b c;
        static e d;

        static {
            a.d = new f(20);
        }

        static void a() {
            while(a.d.b() != null) {
            }
        }

        static a b() {
            a q$a0 = (a)a.d.b();
            return q$a0 == null ? new a() : q$a0;
        }

        static void c(a q$a0) {
            q$a0.a = 0;
            q$a0.b = null;
            q$a0.c = null;
            a.d.a(q$a0);
        }
    }

    interface androidx.recyclerview.widget.q.b {
        void a(B arg1);

        void b(B arg1, b arg2, b arg3);

        void c(B arg1, b arg2, b arg3);

        void d(B arg1, b arg2, b arg3);
    }

    final g a;
    final d b;

    q() {
        this.a = new g();
        this.b = new d();
    }

    void a(B recyclerView$B0, b recyclerView$l$b0) {
        a q$a0 = (a)this.a.get(recyclerView$B0);
        if(q$a0 == null) {
            q$a0 = a.b();
            this.a.put(recyclerView$B0, q$a0);
        }
        q$a0.a |= 2;
        q$a0.b = recyclerView$l$b0;
    }

    void b(B recyclerView$B0) {
        a q$a0 = (a)this.a.get(recyclerView$B0);
        if(q$a0 == null) {
            q$a0 = a.b();
            this.a.put(recyclerView$B0, q$a0);
        }
        q$a0.a |= 1;
    }

    void c(long v, B recyclerView$B0) {
        this.b.k(v, recyclerView$B0);
    }

    void d(B recyclerView$B0, b recyclerView$l$b0) {
        a q$a0 = (a)this.a.get(recyclerView$B0);
        if(q$a0 == null) {
            q$a0 = a.b();
            this.a.put(recyclerView$B0, q$a0);
        }
        q$a0.c = recyclerView$l$b0;
        q$a0.a |= 8;
    }

    void e(B recyclerView$B0, b recyclerView$l$b0) {
        a q$a0 = (a)this.a.get(recyclerView$B0);
        if(q$a0 == null) {
            q$a0 = a.b();
            this.a.put(recyclerView$B0, q$a0);
        }
        q$a0.b = recyclerView$l$b0;
        q$a0.a |= 4;
    }

    void f() {
        this.a.clear();
        this.b.c();
    }

    B g(long v) {
        return (B)this.b.f(v);
    }

    boolean h(B recyclerView$B0) {
        a q$a0 = (a)this.a.get(recyclerView$B0);
        return q$a0 != null && (q$a0.a & 1) != 0;
    }

    boolean i(B recyclerView$B0) {
        a q$a0 = (a)this.a.get(recyclerView$B0);
        return q$a0 != null && (q$a0.a & 4) != 0;
    }

    void j() {
        a.a();
    }

    public void k(B recyclerView$B0) {
        this.p(recyclerView$B0);
    }

    private b l(B recyclerView$B0, int v) {
        b recyclerView$l$b0;
        int v1 = this.a.g(recyclerView$B0);
        if(v1 < 0) {
            return null;
        }
        a q$a0 = (a)this.a.n(v1);
        if(q$a0 != null) {
            int v2 = q$a0.a;
            if((v2 & v) != 0) {
                int v3 = ~v & v2;
                q$a0.a = v3;
                if(v == 4) {
                    recyclerView$l$b0 = q$a0.b;
                }
                else if(v == 8) {
                    recyclerView$l$b0 = q$a0.c;
                }
                else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if((v3 & 12) == 0) {
                    this.a.l(v1);
                    a.c(q$a0);
                }
                return recyclerView$l$b0;
            }
        }
        return null;
    }

    b m(B recyclerView$B0) {
        return this.l(recyclerView$B0, 8);
    }

    b n(B recyclerView$B0) {
        return this.l(recyclerView$B0, 4);
    }

    void o(androidx.recyclerview.widget.q.b q$b0) {
        for(int v = this.a.size() - 1; v >= 0; --v) {
            B recyclerView$B0 = (B)this.a.j(v);
            a q$a0 = (a)this.a.l(v);
            int v1 = q$a0.a;
            if((v1 & 3) == 3) {
                q$b0.a(recyclerView$B0);
            }
            else if((v1 & 1) != 0) {
                b recyclerView$l$b0 = q$a0.b;
                if(recyclerView$l$b0 == null) {
                    q$b0.a(recyclerView$B0);
                }
                else {
                    q$b0.c(recyclerView$B0, recyclerView$l$b0, q$a0.c);
                }
            }
            else if((v1 & 14) == 14) {
                q$b0.b(recyclerView$B0, q$a0.b, q$a0.c);
            }
            else if((v1 & 12) == 12) {
                q$b0.d(recyclerView$B0, q$a0.b, q$a0.c);
            }
            else if((v1 & 4) != 0) {
                q$b0.c(recyclerView$B0, q$a0.b, null);
            }
            else if((v1 & 8) != 0) {
                q$b0.b(recyclerView$B0, q$a0.b, q$a0.c);
            }
            a.c(q$a0);
        }
    }

    void p(B recyclerView$B0) {
        a q$a0 = (a)this.a.get(recyclerView$B0);
        if(q$a0 == null) {
            return;
        }
        q$a0.a &= -2;
    }

    void q(B recyclerView$B0) {
        for(int v = this.b.n() - 1; v >= 0; --v) {
            if(recyclerView$B0 == this.b.o(v)) {
                this.b.m(v);
                break;
            }
        }
        a q$a0 = (a)this.a.remove(recyclerView$B0);
        if(q$a0 != null) {
            a.c(q$a0);
        }
    }
}

