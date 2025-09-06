package t0;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.impl.F;
import androidx.work.impl.e;
import androidx.work.impl.t;
import androidx.work.impl.v;
import androidx.work.impl.w;
import androidx.work.k;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import u0.c;
import u0.d;
import w0.o;
import x0.m;
import x0.u;
import x0.x;
import y0.s;

public class b implements e, t, c {
    private final Context f;
    private final F g;
    private final d h;
    private final Set i;
    private a j;
    private boolean k;
    private final Object l;
    private final w m;
    Boolean n;
    private static final String o;

    static {
        b.o = "WM-GreedyScheduler";
    }

    public b(Context context0, androidx.work.b b0, o o0, F f0) {
        this.i = new HashSet();
        this.m = new w();
        this.f = context0;
        this.g = f0;
        this.h = new u0.e(o0, this);
        this.j = new a(this, b0.k());
        this.l = new Object();
    }

    @Override  // u0.c
    public void a(List list0) {
        for(Object object0: list0) {
            m m0 = x.a(((u)object0));
            k.e().a("WM-GreedyScheduler", "Constraints not met: Cancelling work ID " + m0);
            v v0 = this.m.b(m0);
            if(v0 != null) {
                this.g.A(v0);
            }
        }
    }

    @Override  // androidx.work.impl.t
    public boolean b() {
        return false;
    }

    @Override  // androidx.work.impl.t
    public void c(String s) {
        if(this.n == null) {
            this.g();
        }
        if(!this.n.booleanValue()) {
            k.e().f("WM-GreedyScheduler", "Ignoring schedule request in non-main process");
            return;
        }
        this.h();
        k.e().a("WM-GreedyScheduler", "Cancelling work ID " + s);
        a a0 = this.j;
        if(a0 != null) {
            a0.b(s);
        }
        for(Object object0: this.m.c(s)) {
            this.g.A(((v)object0));
        }
    }

    @Override  // androidx.work.impl.t
    public void d(u[] arr_u) {
        if(this.n == null) {
            this.g();
        }
        if(!this.n.booleanValue()) {
            k.e().f("WM-GreedyScheduler", "Ignoring schedule request in a secondary process");
            return;
        }
        this.h();
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        for(int v = 0; v < arr_u.length; ++v) {
            u u0 = arr_u[v];
            m m0 = x.a(u0);
            if(!this.m.a(m0)) {
                long v1 = u0.c();
                long v2 = System.currentTimeMillis();
                if(u0.b == androidx.work.t.f) {
                    if(v2 < v1) {
                        a a0 = this.j;
                        if(a0 != null) {
                            a0.a(u0);
                        }
                    }
                    else if(u0.h()) {
                        int v3 = Build.VERSION.SDK_INT;
                        if(u0.j.h()) {
                            k.e().a("WM-GreedyScheduler", "Ignoring " + u0 + ". Requires device idle.");
                        }
                        else if(v3 < 24 || !u0.j.e()) {
                            hashSet0.add(u0);
                            hashSet1.add(u0.a);
                        }
                        else {
                            k.e().a("WM-GreedyScheduler", "Ignoring " + u0 + ". Requires ContentUri triggers.");
                        }
                    }
                    else {
                        m m1 = x.a(u0);
                        if(!this.m.a(m1)) {
                            k.e().a("WM-GreedyScheduler", "Starting work for " + u0.a);
                            v v4 = this.m.e(u0);
                            this.g.x(v4);
                        }
                    }
                }
            }
        }
        synchronized(this.l) {
            if(!hashSet0.isEmpty()) {
                String s = TextUtils.join(",", hashSet1);
                k.e().a("WM-GreedyScheduler", "Starting tracking for " + s);
                this.i.addAll(hashSet0);
                this.h.a(this.i);
            }
        }
    }

    @Override  // u0.c
    public void e(List list0) {
        for(Object object0: list0) {
            m m0 = x.a(((u)object0));
            if(!this.m.a(m0)) {
                k.e().a("WM-GreedyScheduler", "Constraints met: Scheduling work ID " + m0);
                v v0 = this.m.d(m0);
                this.g.x(v0);
            }
        }
    }

    @Override  // androidx.work.impl.e
    public void f(m m0, boolean z) {
        this.m.b(m0);
        this.i(m0);
    }

    private void g() {
        this.n = Boolean.valueOf(s.b(this.f, this.g.k()));
    }

    private void h() {
        if(!this.k) {
            this.g.o().g(this);
            this.k = true;
        }
    }

    private void i(m m0) {
        synchronized(this.l) {
            for(Object object1: this.i) {
                u u0 = (u)object1;
                if(x.a(u0).equals(m0)) {
                    k.e().a("WM-GreedyScheduler", "Stopping tracking for " + m0);
                    this.i.remove(u0);
                    this.h.a(this.i);
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
    }
}

