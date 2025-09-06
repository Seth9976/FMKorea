package y0;

import androidx.work.impl.F;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.o;
import androidx.work.impl.t;
import androidx.work.impl.u;
import androidx.work.n;
import java.util.LinkedList;
import java.util.UUID;
import x0.v;

public abstract class b implements Runnable {
    private final o f;

    public b() {
        this.f = new o();
    }

    void a(F f0, String s) {
        this.f(f0.r(), s);
        f0.o().r(s);
        for(Object object0: f0.p()) {
            ((t)object0).c(s);
        }
    }

    public static b b(UUID uUID0, F f0) {
        class a extends b {
            final F g;
            final UUID h;

            a(F f0, UUID uUID0) {
                this.h = uUID0;
                super();
            }

            @Override  // y0.b
            void h() {
                WorkDatabase workDatabase0 = this.g.r();
                workDatabase0.e();
                try {
                    this.a(this.g, this.h.toString());
                    workDatabase0.A();
                }
                finally {
                    workDatabase0.i();
                }
                this.g(this.g);
            }
        }

        return new a(f0, uUID0);
    }

    public static b c(String s, F f0, boolean z) {
        class c extends b {
            final F g;
            final String h;
            final boolean i;

            c(F f0, String s, boolean z) {
                this.h = s;
                this.i = z;
                super();
            }

            @Override  // y0.b
            void h() {
                WorkDatabase workDatabase0 = this.g.r();
                workDatabase0.e();
                try {
                    for(Object object0: workDatabase0.I().m(this.h)) {
                        this.a(this.g, ((String)object0));
                    }
                    workDatabase0.A();
                }
                finally {
                    workDatabase0.i();
                }
                if(this.i) {
                    this.g(this.g);
                }
            }
        }

        return new c(f0, s, z);
    }

    public static b d(String s, F f0) {
        class y0.b.b extends b {
            final F g;
            final String h;

            y0.b.b(F f0, String s) {
                this.h = s;
                super();
            }

            @Override  // y0.b
            void h() {
                WorkDatabase workDatabase0 = this.g.r();
                workDatabase0.e();
                try {
                    for(Object object0: workDatabase0.I().r(this.h)) {
                        this.a(this.g, ((String)object0));
                    }
                    workDatabase0.A();
                }
                finally {
                    workDatabase0.i();
                }
                this.g(this.g);
            }
        }

        return new y0.b.b(f0, s);
    }

    public n e() {
        return this.f;
    }

    private void f(WorkDatabase workDatabase0, String s) {
        v v0 = workDatabase0.I();
        x0.b b0 = workDatabase0.D();
        LinkedList linkedList0 = new LinkedList();
        linkedList0.add(s);
        while(!linkedList0.isEmpty()) {
            String s1 = (String)linkedList0.remove();
            androidx.work.t t0 = v0.n(s1);
            if(t0 != androidx.work.t.h && t0 != androidx.work.t.i) {
                v0.h(androidx.work.t.k, s1);
            }
            linkedList0.addAll(b0.a(s1));
        }
    }

    void g(F f0) {
        u.b(f0.k(), f0.r(), f0.p());
    }

    abstract void h();

    @Override
    public void run() {
        try {
            this.h();
            this.f.a(n.a);
        }
        catch(Throwable throwable0) {
            androidx.work.n.b.a n$b$a0 = new androidx.work.n.b.a(throwable0);
            this.f.a(n$b$a0);
        }
    }
}

