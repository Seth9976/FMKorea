package t1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import m1.i;
import m1.p;
import n1.e;
import n1.f;
import n1.g;
import n1.m;
import u1.c;
import u1.d;
import v1.b;
import w1.a;

public class r {
    private final Context a;
    private final e b;
    private final d c;
    private final x d;
    private final Executor e;
    private final b f;
    private final a g;
    private final a h;
    private final c i;

    public r(Context context0, e e0, d d0, x x0, Executor executor0, b b0, a a0, a a1, c c0) {
        this.a = context0;
        this.b = e0;
        this.c = d0;
        this.d = x0;
        this.e = executor0;
        this.f = b0;
        this.g = a0;
        this.h = a1;
        this.i = c0;
    }

    // 检测为 Lambda 实现
    public static Iterable a(r r0, p p0) [...]

    // 检测为 Lambda 实现
    public static Object b(r r0, Iterable iterable0, p p0, long v) [...]

    // 检测为 Lambda 实现
    public static Object c(r r0) [...]

    // 检测为 Lambda 实现
    public static Boolean d(r r0, p p0) [...]

    // 检测为 Lambda 实现
    public static Object e(r r0, Iterable iterable0) [...]

    // 检测为 Lambda 实现
    public static Object f(r r0, p p0, int v) [...]

    // 检测为 Lambda 实现
    public static Object g(r r0, p p0, long v) [...]

    // 检测为 Lambda 实现
    public static Object h(r r0, Map map0) [...]

    // 检测为 Lambda 实现
    public static void i(r r0, p p0, int v, Runnable runnable0) [...]

    public i j(m m0) {
        Objects.requireNonNull(this.i);
        h h0 = new h(this.i);
        p1.a a0 = (p1.a)this.f.a(h0);
        return m0.a(i.a().i(this.g.a()).k(this.h.a()).j("GDT_CLIENT_METRICS").h(new m1.h(k1.b.b("proto"), new byte[0])).d());
    }

    boolean k() {
        NetworkInfo networkInfo0 = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnected();
    }

    private Boolean l(p p0) {
        return Boolean.valueOf(this.c.o(p0));
    }

    private Iterable m(p p0) {
        return this.c.b0(p0);
    }

    private Object n(Iterable iterable0, p p0, long v) {
        this.c.a0(iterable0);
        long v1 = this.g.a();
        this.c.E(p0, v1 + v);
        return null;
    }

    private Object o(Iterable iterable0) {
        this.c.e(iterable0);
        return null;
    }

    private Object p() {
        this.i.b();
        return null;
    }

    private Object q(Map map0) {
        for(Object object0: map0.entrySet()) {
            long v = (long)(((int)(((Integer)((Map.Entry)object0).getValue()))));
            String s = (String)((Map.Entry)object0).getKey();
            this.i.f(v, p1.c.b.l, s);
        }
        return null;
    }

    private Object r(p p0, long v) {
        long v1 = this.g.a();
        this.c.E(p0, v1 + v);
        return null;
    }

    private Object s(p p0, int v) {
        this.d.b(p0, v + 1);
        return null;
    }

    private void t(p p0, int v, Runnable runnable0) {
        try {
            Objects.requireNonNull(this.c);
            t1.i i0 = new t1.i(this.c);
            this.f.a(i0);
            if(this.k()) {
                this.u(p0, v);
            }
            else {
                j j0 = () -> this.s(p0, v);
                this.f.a(j0);
            }
        }
        catch(v1.a unused_ex) {
            this.d.b(p0, v + 1);
        }
        finally {
            runnable0.run();
        }
    }

    public g u(p p0, int v) {
        g g1;
        String s = p0.b();
        m m0 = this.b.a(s);
        long v1 = 0L;
        g g0 = g.e(0L);
        while(true) {
            k k0 = () -> this.l(p0);
            if(!((Boolean)this.f.a(k0)).booleanValue()) {
                break;
            }
            l l0 = () -> this.m(p0);
            Iterable iterable0 = (Iterable)this.f.a(l0);
            if(!iterable0.iterator().hasNext()) {
                return g0;
            }
            if(m0 == null) {
                q1.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", p0);
                g1 = g.a();
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    arrayList0.add(((u1.k)object0).b());
                }
                if(p0.e()) {
                    arrayList0.add(this.j(m0));
                }
                g1 = m0.b(f.a().b(arrayList0).c(p0.c()).a());
            }
            g0 = g1;
            if(g0.c() == n1.g.a.g) {
                t1.m m1 = () -> this.n(iterable0, p0, v1);
                this.f.a(m1);
                this.d.a(p0, v + 1, true);
                return g0;
            }
            n n0 = () -> this.o(iterable0);
            this.f.a(n0);
            if(g0.c() == n1.g.a.f) {
                v1 = Math.max(v1, g0.b());
                if(!p0.e()) {
                    continue;
                }
                o o0 = () -> this.p();
                this.f.a(o0);
            }
            else if(g0.c() == n1.g.a.i) {
                HashMap hashMap0 = new HashMap();
                for(Object object1: iterable0) {
                    String s1 = ((u1.k)object1).b().j();
                    if(hashMap0.containsKey(s1)) {
                        hashMap0.put(s1, ((int)(((int)(((Integer)hashMap0.get(s1)))) + 1)));
                    }
                    else {
                        hashMap0.put(s1, 1);
                    }
                }
                t1.p p1 = () -> this.q(hashMap0);
                this.f.a(p1);
            }
        }
        q q0 = () -> this.r(p0, v1);
        this.f.a(q0);
        return g0;
    }

    public void v(p p0, int v, Runnable runnable0) {
        t1.g g0 = () -> this.t(p0, v, runnable0);
        this.e.execute(g0);
    }
}

