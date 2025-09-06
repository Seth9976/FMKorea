package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.impl.v;
import androidx.work.k;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import u0.c;
import u0.e;
import w0.o;
import x0.m;
import x0.u;
import x0.x;
import y0.D.a;

public class f implements c, a {
    private final Context f;
    private final int g;
    private final m h;
    private final g i;
    private final e j;
    private final Object k;
    private int l;
    private final Executor m;
    private final Executor n;
    private PowerManager.WakeLock o;
    private boolean p;
    private final v q;
    private static final String r;

    static {
        f.r = "WM-DelayMetCommandHandl";
    }

    f(Context context0, int v, g g0, v v1) {
        this.f = context0;
        this.g = v;
        this.i = g0;
        this.h = v1.a();
        this.q = v1;
        o o0 = g0.g().q();
        this.m = g0.e().b();
        this.n = g0.e().a();
        this.j = new e(o0, this);
        this.p = false;
        this.l = 0;
        this.k = new Object();
    }

    @Override  // u0.c
    public void a(List list0) {
        d d0 = () -> {
            String s = this.h.b();
            if(this.l < 2) {
                this.l = 2;
                k.e().a("WM-DelayMetCommandHandl", "Stopping work for WorkSpec " + s);
                Intent intent0 = b.e(this.f, this.h);
                androidx.work.impl.background.systemalarm.g.b g$b0 = new androidx.work.impl.background.systemalarm.g.b(this.i, intent0, this.g);
                this.n.execute(g$b0);
                if(this.i.d().k(this.h.b())) {
                    k.e().a("WM-DelayMetCommandHandl", "WorkSpec " + s + " needs to be rescheduled");
                    Intent intent1 = b.d(this.f, this.h);
                    androidx.work.impl.background.systemalarm.g.b g$b1 = new androidx.work.impl.background.systemalarm.g.b(this.i, intent1, this.g);
                    this.n.execute(g$b1);
                    return;
                }
                k.e().a("WM-DelayMetCommandHandl", "Processor does not have WorkSpec " + s + ". No need to reschedule");
                return;
            }
            k.e().a("WM-DelayMetCommandHandl", "Already stopped work for " + s);
        };
        this.m.execute(d0);
    }

    @Override  // y0.D$a
    public void b(m m0) {
        k.e().a("WM-DelayMetCommandHandl", "Exceeded time limits on execution for " + m0);
        d d0 = () -> {
            String s = this.h.b();
            if(this.l < 2) {
                this.l = 2;
                k.e().a("WM-DelayMetCommandHandl", "Stopping work for WorkSpec " + s);
                Intent intent0 = b.e(this.f, this.h);
                androidx.work.impl.background.systemalarm.g.b g$b0 = new androidx.work.impl.background.systemalarm.g.b(this.i, intent0, this.g);
                this.n.execute(g$b0);
                if(this.i.d().k(this.h.b())) {
                    k.e().a("WM-DelayMetCommandHandl", "WorkSpec " + s + " needs to be rescheduled");
                    Intent intent1 = b.d(this.f, this.h);
                    androidx.work.impl.background.systemalarm.g.b g$b1 = new androidx.work.impl.background.systemalarm.g.b(this.i, intent1, this.g);
                    this.n.execute(g$b1);
                    return;
                }
                k.e().a("WM-DelayMetCommandHandl", "Processor does not have WorkSpec " + s + ". No need to reschedule");
                return;
            }
            k.e().a("WM-DelayMetCommandHandl", "Already stopped work for " + s);
        };
        this.m.execute(d0);
    }

    @Override  // u0.c
    public void e(List list0) {
        for(Object object0: list0) {
            if(x.a(((u)object0)).equals(this.h)) {
                androidx.work.impl.background.systemalarm.e e0 = () -> {
                    if(this.l == 0) {
                        this.l = 1;
                        k.e().a("WM-DelayMetCommandHandl", "onAllConstraintsMet for " + this.h);
                        if(this.i.d().p(this.q)) {
                            this.i.h().a(this.h, 600000L, this);
                            return;
                        }
                        this.f();
                        return;
                    }
                    k.e().a("WM-DelayMetCommandHandl", "Already started work for " + this.h);
                };
                this.m.execute(e0);
                return;
            }
            if(false) {
                break;
            }
        }
    }

    private void f() {
        synchronized(this.k) {
            this.j.d();
            this.i.h().b(this.h);
            if(this.o != null && this.o.isHeld()) {
                k.e().a("WM-DelayMetCommandHandl", "Releasing wakelock " + this.o + "for WorkSpec " + this.h);
                this.o.release();
            }
        }
    }

    void g() {
        String s = this.h.b();
        this.o = y0.x.b(this.f, s + " (" + this.g + ")");
        k.e().a("WM-DelayMetCommandHandl", "Acquiring wakelock " + this.o + "for WorkSpec " + s);
        this.o.acquire();
        u u0 = this.i.g().r().I().o(s);
        if(u0 == null) {
            d d0 = () -> {
                String s = this.h.b();
                if(this.l < 2) {
                    this.l = 2;
                    k.e().a("WM-DelayMetCommandHandl", "Stopping work for WorkSpec " + s);
                    Intent intent0 = b.e(this.f, this.h);
                    androidx.work.impl.background.systemalarm.g.b g$b0 = new androidx.work.impl.background.systemalarm.g.b(this.i, intent0, this.g);
                    this.n.execute(g$b0);
                    if(this.i.d().k(this.h.b())) {
                        k.e().a("WM-DelayMetCommandHandl", "WorkSpec " + s + " needs to be rescheduled");
                        Intent intent1 = b.d(this.f, this.h);
                        androidx.work.impl.background.systemalarm.g.b g$b1 = new androidx.work.impl.background.systemalarm.g.b(this.i, intent1, this.g);
                        this.n.execute(g$b1);
                        return;
                    }
                    k.e().a("WM-DelayMetCommandHandl", "Processor does not have WorkSpec " + s + ". No need to reschedule");
                    return;
                }
                k.e().a("WM-DelayMetCommandHandl", "Already stopped work for " + s);
            };
            this.m.execute(d0);
            return;
        }
        boolean z = u0.h();
        this.p = z;
        if(!z) {
            k.e().a("WM-DelayMetCommandHandl", "No constraints for " + s);
            this.e(Collections.singletonList(u0));
            return;
        }
        List list0 = Collections.singletonList(u0);
        this.j.a(list0);
    }

    void h(boolean z) {
        k.e().a("WM-DelayMetCommandHandl", "onExecuted " + this.h + ", " + z);
        this.f();
        if(z) {
            Intent intent0 = b.d(this.f, this.h);
            androidx.work.impl.background.systemalarm.g.b g$b0 = new androidx.work.impl.background.systemalarm.g.b(this.i, intent0, this.g);
            this.n.execute(g$b0);
        }
        if(this.p) {
            Intent intent1 = b.a(this.f);
            androidx.work.impl.background.systemalarm.g.b g$b1 = new androidx.work.impl.background.systemalarm.g.b(this.i, intent1, this.g);
            this.n.execute(g$b1);
        }
    }

    // 检测为 Lambda 实现
    private void i() [...]

    // 检测为 Lambda 实现
    private void j() [...]
}

