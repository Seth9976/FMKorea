package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import androidx.work.impl.F;
import androidx.work.impl.e;
import androidx.work.impl.r;
import androidx.work.impl.w;
import androidx.work.k;
import java.util.ArrayList;
import java.util.List;
import x0.m;
import y0.D;
import y0.x;
import z0.a;

public class g implements e {
    static class b implements Runnable {
        private final g f;
        private final Intent g;
        private final int h;

        b(g g0, Intent intent0, int v) {
            this.f = g0;
            this.g = intent0;
            this.h = v;
        }

        @Override
        public void run() {
            this.f.a(this.g, this.h);
        }
    }

    interface c {
        void a();
    }

    static class d implements Runnable {
        private final g f;

        d(g g0) {
            this.f = g0;
        }

        @Override
        public void run() {
            this.f.c();
        }
    }

    final Context f;
    final z0.c g;
    private final D h;
    private final r i;
    private final F j;
    final androidx.work.impl.background.systemalarm.b k;
    final List l;
    Intent m;
    private c n;
    private w o;
    static final String p;

    static {
        g.p = "WM-SystemAlarmDispatche";
    }

    g(Context context0) {
        this(context0, null, null);
    }

    g(Context context0, r r0, F f0) {
        Context context1 = context0.getApplicationContext();
        this.f = context1;
        this.o = new w();
        this.k = new androidx.work.impl.background.systemalarm.b(context1, this.o);
        if(f0 == null) {
            f0 = F.m(context0);
        }
        this.j = f0;
        this.h = new D(f0.k().k());
        if(r0 == null) {
            r0 = f0.o();
        }
        this.i = r0;
        this.g = f0.s();
        r0.g(this);
        this.l = new ArrayList();
        this.m = null;
    }

    // 检测为 Lambda 实现
    public boolean a(Intent intent0, int v) [...]

    private void b() {
        if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    void c() {
        k.e().a("WM-SystemAlarmDispatche", "Checking if commands are complete.");
        this.b();
        synchronized(this.l) {
            if(this.m != null) {
                k.e().a("WM-SystemAlarmDispatche", "Removing command " + this.m);
                if(!((Intent)this.l.remove(0)).equals(this.m)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.m = null;
            }
            a a0 = this.g.b();
            if(!this.k.n() && this.l.isEmpty() && !a0.F()) {
                k.e().a("WM-SystemAlarmDispatche", "No more commands & intents.");
                c g$c0 = this.n;
                if(g$c0 != null) {
                    g$c0.a();
                }
            }
            else if(!this.l.isEmpty()) {
                this.k();
            }
        }
    }

    r d() {
        return this.i;
    }

    z0.c e() {
        return this.g;
    }

    @Override  // androidx.work.impl.e
    public void f(m m0, boolean z) {
        this.g.a().execute(() -> {
            k.e().a("WM-SystemAlarmDispatche", "Adding command " + androidx.work.impl.background.systemalarm.b.c(this.f, m0, z) + " (" + 0 + ")");
            this.b();
            String s = androidx.work.impl.background.systemalarm.b.c(this.f, m0, z).getAction();
            if(TextUtils.isEmpty(s)) {
                k.e().k("WM-SystemAlarmDispatche", "Unknown command. Ignoring");
                return false;
            }
            if("ACTION_CONSTRAINTS_CHANGED".equals(s) && this.i("ACTION_CONSTRAINTS_CHANGED")) {
                return false;
            }
            androidx.work.impl.background.systemalarm.b.c(this.f, m0, z).putExtra("KEY_START_ID", 0);
            synchronized(this.l) {
                this.l.add(androidx.work.impl.background.systemalarm.b.c(this.f, m0, z));
                if(this.l.isEmpty()) {
                    this.k();
                }
                return true;
            }
        });
    }

    F g() {
        return this.j;
    }

    D h() {
        return this.h;
    }

    private boolean i(String s) {
        this.b();
        synchronized(this.l) {
            for(Object object0: this.l) {
                if(s.equals(((Intent)object0).getAction())) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    void j() {
        k.e().a("WM-SystemAlarmDispatche", "Destroying SystemAlarmDispatcher");
        this.i.n(this);
        this.n = null;
    }

    private void k() {
        class androidx.work.impl.background.systemalarm.g.a implements Runnable {
            final g f;

            @Override
            public void run() {
                synchronized(g.this.l) {
                    g.this.m = (Intent)g.this.l.get(0);
                }
                Intent intent0 = g.this.m;
                if(intent0 != null) {
                    String s = intent0.getAction();
                    int v1 = g.this.m.getIntExtra("KEY_START_ID", 0);
                    k.e().a("WM-SystemAlarmDispatche", "Processing command " + g.this.m + ", " + v1);
                    PowerManager.WakeLock powerManager$WakeLock0 = x.b(g.this.f, s + " (" + v1 + ")");
                    try {
                        k.e().a("WM-SystemAlarmDispatche", "Acquiring operation wake lock (" + s + ") " + powerManager$WakeLock0);
                        powerManager$WakeLock0.acquire();
                        g.this.k.o(g.this.m, v1, g.this);
                    }
                    catch(Throwable throwable0) {
                        k.e().d("WM-SystemAlarmDispatche", "Unexpected error in onHandleIntent", throwable0);
                    }
                    finally {
                        k.e().a("WM-SystemAlarmDispatche", "Releasing operation wake lock (" + s + ") " + powerManager$WakeLock0);
                        powerManager$WakeLock0.release();
                        g.this.g.a().execute(new d(g.this));
                    }
                }
            }
        }

        this.b();
        PowerManager.WakeLock powerManager$WakeLock0 = x.b(this.f, "ProcessCommand");
        try {
            powerManager$WakeLock0.acquire();
            androidx.work.impl.background.systemalarm.g.a g$a0 = new androidx.work.impl.background.systemalarm.g.a(this);
            this.j.s().c(g$a0);
        }
        finally {
            powerManager$WakeLock0.release();
        }
    }

    void l(c g$c0) {
        if(this.n != null) {
            k.e().c("WM-SystemAlarmDispatche", "A completion listener for SystemAlarmDispatcher already exists.");
            return;
        }
        this.n = g$c0;
    }
}

