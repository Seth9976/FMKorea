package androidx.work.impl;

import Z1.d;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.b;
import androidx.work.f;
import androidx.work.impl.foreground.a;
import androidx.work.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import x0.m;
import x0.u;
import y0.x;
import z0.c;

public class r implements e, a {
    static class androidx.work.impl.r.a implements Runnable {
        private e f;
        private final m g;
        private d h;

        androidx.work.impl.r.a(e e0, m m0, d d0) {
            this.f = e0;
            this.g = m0;
            this.h = d0;
        }

        @Override
        public void run() {
            boolean z;
            try {
                z = ((Boolean)this.h.get()).booleanValue();
            }
            catch(InterruptedException | ExecutionException unused_ex) {
                z = true;
            }
            this.f.f(this.g, z);
        }
    }

    private PowerManager.WakeLock f;
    private Context g;
    private b h;
    private c i;
    private WorkDatabase j;
    private Map k;
    private Map l;
    private Map m;
    private List n;
    private Set o;
    private final List p;
    private final Object q;
    private static final String r;

    static {
        r.r = "WM-Processor";
    }

    public r(Context context0, b b0, c c0, WorkDatabase workDatabase0, List list0) {
        this.g = context0;
        this.h = b0;
        this.i = c0;
        this.j = workDatabase0;
        this.l = new HashMap();
        this.k = new HashMap();
        this.n = list0;
        this.o = new HashSet();
        this.p = new ArrayList();
        this.f = null;
        this.q = new Object();
        this.m = new HashMap();
    }

    @Override  // androidx.work.impl.foreground.a
    public void a(String s, f f0) {
        synchronized(this.q) {
            k.e().f("WM-Processor", "Moving WorkSpec (" + s + ") to the foreground");
            I i0 = (I)this.l.remove(s);
            if(i0 != null) {
                if(this.f == null) {
                    PowerManager.WakeLock powerManager$WakeLock0 = x.b(this.g, "ProcessorForegroundLck");
                    this.f = powerManager$WakeLock0;
                    powerManager$WakeLock0.acquire();
                }
                this.k.put(s, i0);
                Intent intent0 = androidx.work.impl.foreground.b.d(this.g, i0.d(), f0);
                androidx.core.content.a.startForegroundService(this.g, intent0);
            }
        }
    }

    @Override  // androidx.work.impl.foreground.a
    public void b(String s) {
        synchronized(this.q) {
            this.k.remove(s);
            this.s();
        }
    }

    @Override  // androidx.work.impl.foreground.a
    public boolean c(String s) {
        synchronized(this.q) {
        }
        return this.k.containsKey(s);
    }

    @Override  // androidx.work.impl.e
    public void f(m m0, boolean z) {
        synchronized(this.q) {
            I i0 = (I)this.l.get(m0.b());
            if(i0 != null && m0.equals(i0.d())) {
                this.l.remove(m0.b());
            }
            k.e().a("WM-Processor", this.getClass().getSimpleName() + " " + m0.b() + " executed; reschedule = " + z);
            for(Object object1: this.p) {
                ((e)object1).f(m0, z);
            }
        }
    }

    public void g(e e0) {
        synchronized(this.q) {
            this.p.add(e0);
        }
    }

    public u h(String s) {
        synchronized(this.q) {
            I i0 = (I)this.k.get(s);
            if(i0 == null) {
                i0 = (I)this.l.get(s);
            }
            return i0 != null ? i0.e() : null;
        }
    }

    private static boolean i(String s, I i0) {
        if(i0 != null) {
            i0.g();
            k.e().a("WM-Processor", "WorkerWrapper interrupted for " + s);
            return true;
        }
        k.e().a("WM-Processor", "WorkerWrapper could not be found for " + s);
        return false;
    }

    public boolean j(String s) {
        synchronized(this.q) {
        }
        return this.o.contains(s);
    }

    public boolean k(String s) {
        synchronized(this.q) {
            return this.l.containsKey(s) || this.k.containsKey(s);
        }
    }

    // 检测为 Lambda 实现
    private void l(m m0, boolean z) [...]

    // 检测为 Lambda 实现
    private u m(ArrayList arrayList0, String s) [...]

    public void n(e e0) {
        synchronized(this.q) {
            this.p.remove(e0);
        }
    }

    private void o(m m0, boolean z) {
        this.i.a().execute(() -> this.f(m0, z));
    }

    public boolean p(v v0) {
        return this.q(v0, null);
    }

    public boolean q(v v0, androidx.work.WorkerParameters.a workerParameters$a0) {
        I i0;
        m m0 = v0.a();
        String s = m0.b();
        ArrayList arrayList0 = new ArrayList();
        u u0 = (u)this.j.z(() -> {
            arrayList0.addAll(this.j.J().a(s));
            return this.j.I().o(s);
        });
        if(u0 == null) {
            k.e().k("WM-Processor", "Didn\'t find WorkSpec for id " + m0);
            this.o(m0, false);
            return false;
        }
        synchronized(this.q) {
            if(this.k(s)) {
                Set set0 = (Set)this.m.get(s);
                Object object1 = set0.iterator().next();
                if(((v)object1).a().a() == m0.a()) {
                    set0.add(v0);
                    k.e().a("WM-Processor", "Work " + m0 + " is already enqueued for processing");
                }
                else {
                    this.o(m0, false);
                }
                return false;
            }
            if(u0.f() != m0.a()) {
                this.o(m0, false);
                return false;
            }
            i0 = new androidx.work.impl.I.c(this.g, this.h, this.i, this, this.j, u0, arrayList0).d(this.n).c(workerParameters$a0).b();
            d d0 = i0.c();
            d0.addListener(new androidx.work.impl.r.a(this, v0.a(), d0), this.i.a());
            this.l.put(s, i0);
            HashSet hashSet0 = new HashSet();
            hashSet0.add(v0);
            this.m.put(s, hashSet0);
        }
        this.i.b().execute(i0);
        k.e().a("WM-Processor", this.getClass().getSimpleName() + ": processing " + m0);
        return true;
    }

    public boolean r(String s) {
        I i0;
        synchronized(this.q) {
            k.e().a("WM-Processor", "Processor cancelling " + s);
            this.o.add(s);
            i0 = (I)this.k.remove(s);
            boolean z = i0 != null;
            if(i0 == null) {
                i0 = (I)this.l.remove(s);
            }
            if(i0 != null) {
                this.m.remove(s);
            }
        }
        boolean z1 = r.i(s, i0);
        if(z) {
            this.s();
        }
        return z1;
    }

    private void s() {
        synchronized(this.q) {
            if(this.k.isEmpty()) {
                Intent intent0 = androidx.work.impl.foreground.b.g(this.g);
                try {
                    this.g.startService(intent0);
                }
                catch(Throwable throwable0) {
                    k.e().d("WM-Processor", "Unable to stop foreground service", throwable0);
                }
                PowerManager.WakeLock powerManager$WakeLock0 = this.f;
                if(powerManager$WakeLock0 != null) {
                    powerManager$WakeLock0.release();
                    this.f = null;
                }
            }
        }
    }

    public boolean t(v v0) {
        I i0;
        String s = v0.a().b();
        synchronized(this.q) {
            k.e().a("WM-Processor", "Processor stopping foreground work " + s);
            i0 = (I)this.k.remove(s);
            if(i0 != null) {
                this.m.remove(s);
            }
        }
        return r.i(s, i0);
    }

    public boolean u(v v0) {
        String s = v0.a().b();
        synchronized(this.q) {
            I i0 = (I)this.l.remove(s);
            if(i0 == null) {
                k.e().a("WM-Processor", "WorkerWrapper could not be found for " + s);
                return false;
            }
            Set set0 = (Set)this.m.get(s);
            if(set0 != null && set0.contains(v0)) {
                k.e().a("WM-Processor", "Processor stopping background work " + s);
                this.m.remove(s);
                return r.i(s, i0);
            }
            return false;
        }
    }
}

