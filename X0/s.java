package x0;

import androidx.work.d;
import g0.A;
import g0.i;
import g0.u;
import java.util.Collections;
import java.util.List;
import k0.k;

public final class s implements r {
    private final u a;
    private final i b;
    private final A c;
    private final A d;

    public s(u u0) {
        class a extends i {
            final s d;

            a(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }

            @Override  // g0.i
            public void i(k k0, Object object0) {
                this.k(k0, ((q)object0));
            }

            public void k(k k0, q q0) {
                if(q0.b() == null) {
                    k0.P(1);
                }
                else {
                    k0.l(1, q0.b());
                }
                byte[] arr_b = d.n(q0.a());
                if(arr_b == null) {
                    k0.P(2);
                    return;
                }
                k0.D(2, arr_b);
            }
        }


        class b extends A {
            final s d;

            b(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
        }


        class c extends A {
            final s d;

            c(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "DELETE FROM WorkProgress";
            }
        }

        this.a = u0;
        this.b = new a(this, u0);
        this.c = new b(this, u0);
        this.d = new c(this, u0);
    }

    @Override  // x0.r
    public void a(String s) {
        this.a.d();
        k k0 = this.c.b();
        if(s == null) {
            k0.P(1);
        }
        else {
            k0.l(1, s);
        }
        this.a.e();
        try {
            k0.m();
            this.a.A();
        }
        finally {
            this.a.i();
            this.c.h(k0);
        }
    }

    @Override  // x0.r
    public void b(q q0) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(q0);
            this.a.A();
        }
        finally {
            this.a.i();
        }
    }

    @Override  // x0.r
    public void c() {
        this.a.d();
        k k0 = this.d.b();
        this.a.e();
        try {
            k0.m();
            this.a.A();
        }
        finally {
            this.a.i();
            this.d.h(k0);
        }
    }

    public static List d() {
        return Collections.emptyList();
    }
}

