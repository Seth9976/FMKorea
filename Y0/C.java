package y0;

import android.text.TextUtils;
import androidx.work.e;
import androidx.work.impl.F;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.o;
import androidx.work.impl.x;
import androidx.work.k;
import androidx.work.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x0.a;
import x0.b;
import x0.n;
import x0.u;
import x0.v;

public class c implements Runnable {
    private final x f;
    private final o g;
    private static final String h;

    static {
        c.h = "WM-EnqueueRunnable";
    }

    public c(x x0) {
        this(x0, new o());
    }

    public c(x x0, o o0) {
        this.f = x0;
        this.g = o0;
    }

    public boolean a() {
        WorkDatabase workDatabase0 = this.f.g().r();
        workDatabase0.e();
        try {
            boolean z = c.e(this.f);
            workDatabase0.A();
            return z;
        }
        finally {
            workDatabase0.i();
        }
    }

    private static boolean b(x x0) {
        boolean z = c.c(x0.g(), x0.f(), ((String[])x.l(x0).toArray(new String[0])), x0.d(), x0.b());
        x0.k();
        return z;
    }

    private static boolean c(F f0, List list0, String[] arr_s, String s, e e0) {
        b b1;
        boolean z4;
        int v3;
        boolean z2;
        boolean z1;
        long v = System.currentTimeMillis();
        WorkDatabase workDatabase0 = f0.r();
        boolean z = arr_s != null && arr_s.length > 0;
        if(z) {
            int v1 = arr_s.length;
            z1 = false;
            z2 = false;
            v3 = 1;
            for(int v2 = 0; v2 < v1; ++v2) {
                String s1 = arr_s[v2];
                u u0 = workDatabase0.I().o(s1);
                if(u0 == null) {
                    k.e().c("WM-EnqueueRunnable", "Prerequisite " + s1 + " doesn\'t exist; not enqueuing");
                    return false;
                }
                t t0 = u0.b;
                v3 &= (t0 == t.h ? 1 : 0);
                if(t0 == t.i) {
                    z2 = true;
                }
                else if(t0 == t.k) {
                    z1 = true;
                }
            }
        }
        else {
            z1 = false;
            z2 = false;
            v3 = 1;
        }
        boolean z3 = TextUtils.isEmpty(s);
        if(z3 || z) {
            z4 = false;
        }
        else {
            List list1 = workDatabase0.I().d(s);
            if(list1.isEmpty()) {
                z4 = false;
            }
            else if(e0 != e.h && e0 != e.i) {
                if(e0 == e.g) {
                    for(Object object0: list1) {
                        t t1 = ((x0.u.b)object0).b;
                        if(t1 == t.f || t1 == t.g) {
                            return false;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                y0.b.c(s, f0, false).run();
                v v4 = workDatabase0.I();
                for(Object object1: list1) {
                    v4.a(((x0.u.b)object1).a);
                }
                z4 = true;
            }
            else {
                b b0 = workDatabase0.D();
                List list2 = new ArrayList();
                for(Object object2: list1) {
                    x0.u.b u$b0 = (x0.u.b)object2;
                    if(b0.d(u$b0.a)) {
                        b1 = b0;
                    }
                    else {
                        t t2 = u$b0.b;
                        b1 = b0;
                        int v5 = t2 == t.h ? 1 : 0;
                        if(t2 == t.i) {
                            z2 = true;
                        }
                        else if(t2 == t.k) {
                            z1 = true;
                        }
                        list2.add(u$b0.a);
                        v3 &= v5;
                    }
                    b0 = b1;
                }
                if(e0 == e.i && (z1 || z2)) {
                    v v6 = workDatabase0.I();
                    for(Object object3: v6.d(s)) {
                        v6.a(((x0.u.b)object3).a);
                    }
                    list2 = Collections.emptyList();
                    z1 = false;
                    z2 = false;
                }
                arr_s = (String[])list2.toArray(arr_s);
                z = arr_s.length > 0;
                z4 = false;
            }
        }
        for(Object object4: list0) {
            androidx.work.v v7 = (androidx.work.v)object4;
            u u1 = v7.d();
            if(!z || v3 != 0) {
                u1.n = v;
            }
            else if(z2) {
                u1.b = t.i;
            }
            else if(z1) {
                u1.b = t.k;
            }
            else {
                u1.b = t.j;
            }
            if(u1.b == t.f) {
                z4 = true;
            }
            workDatabase0.I().f(d.b(f0.p(), u1));
            if(z) {
                for(int v8 = 0; v8 < arr_s.length; ++v8) {
                    String s2 = arr_s[v8];
                    a a0 = new a(v7.b(), s2);
                    workDatabase0.D().c(a0);
                }
            }
            workDatabase0.J().b(v7.b(), v7.c());
            if(!z3) {
                workDatabase0.G().a(new n(s, v7.b()));
            }
        }
        return z4;
    }

    public androidx.work.n d() {
        return this.g;
    }

    private static boolean e(x x0) {
        List list0 = x0.e();
        boolean z = false;
        if(list0 != null) {
            for(Object object0: list0) {
                x x1 = (x)object0;
                if(x1.j()) {
                    k.e().k("WM-EnqueueRunnable", "Already enqueued work ids (" + TextUtils.join(", ", x1.c()) + ")");
                }
                else {
                    z |= c.e(x1);
                }
            }
        }
        return c.b(x0) | z;
    }

    public void f() {
        F f0 = this.f.g();
        androidx.work.impl.u.b(f0.k(), f0.r(), f0.p());
    }

    @Override
    public void run() {
        try {
            if(this.f.h()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.f + ")");
            }
            if(this.a()) {
                q.a(this.f.g().j(), RescheduleReceiver.class, true);
                this.f();
            }
            this.g.a(androidx.work.n.a);
            return;
        }
        catch(Throwable throwable0) {
        }
        androidx.work.n.b.a n$b$a0 = new androidx.work.n.b.a(throwable0);
        this.g.a(n$b$a0);
    }
}

