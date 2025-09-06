package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.f;
import androidx.work.impl.F;
import androidx.work.impl.e;
import androidx.work.k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import u0.c;
import u0.d;
import x0.m;
import x0.u;
import x0.x;

public class b implements e, c {
    interface androidx.work.impl.foreground.b.b {
        void b(int arg1, int arg2, Notification arg3);

        void c(int arg1, Notification arg2);

        void d(int arg1);

        void stop();
    }

    private Context f;
    private F g;
    private final z0.c h;
    final Object i;
    m j;
    final Map k;
    final Map l;
    final Set m;
    final d n;
    private androidx.work.impl.foreground.b.b o;
    static final String p;

    static {
        b.p = "WM-SystemFgDispatcher";
    }

    b(Context context0) {
        this.f = context0;
        this.i = new Object();
        F f0 = F.m(context0);
        this.g = f0;
        this.h = f0.s();
        this.j = null;
        this.k = new LinkedHashMap();
        this.m = new HashSet();
        this.l = new HashMap();
        this.n = new u0.e(this.g.q(), this);
        this.g.o().g(this);
    }

    @Override  // u0.c
    public void a(List list0) {
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                k.e().a("WM-SystemFgDispatcher", "Constraints unmet for WorkSpec " + ((u)object0).a);
                this.g.z(x.a(((u)object0)));
            }
        }
    }

    public static Intent c(Context context0, m m0, f f0) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_NOTIFY");
        intent0.putExtra("KEY_NOTIFICATION_ID", f0.c());
        intent0.putExtra("KEY_FOREGROUND_SERVICE_TYPE", f0.a());
        intent0.putExtra("KEY_NOTIFICATION", f0.b());
        intent0.putExtra("KEY_WORKSPEC_ID", m0.b());
        intent0.putExtra("KEY_GENERATION", m0.a());
        return intent0;
    }

    public static Intent d(Context context0, m m0, f f0) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_START_FOREGROUND");
        intent0.putExtra("KEY_WORKSPEC_ID", m0.b());
        intent0.putExtra("KEY_GENERATION", m0.a());
        intent0.putExtra("KEY_NOTIFICATION_ID", f0.c());
        intent0.putExtra("KEY_FOREGROUND_SERVICE_TYPE", f0.a());
        intent0.putExtra("KEY_NOTIFICATION", f0.b());
        return intent0;
    }

    @Override  // u0.c
    public void e(List list0) {
    }

    @Override  // androidx.work.impl.e
    public void f(m m0, boolean z) {
        synchronized(this.i) {
            u u0 = (u)this.l.remove(m0);
            if((u0 == null ? false : this.m.remove(u0))) {
                this.n.a(this.m);
            }
        }
        f f0 = (f)this.k.remove(m0);
        if(m0.equals(this.j) && this.k.size() > 0) {
            Iterator iterator0 = this.k.entrySet().iterator();
            Object object1 = iterator0.next();
            Map.Entry map$Entry0;
            for(map$Entry0 = (Map.Entry)object1; iterator0.hasNext(); map$Entry0 = (Map.Entry)object2) {
                Object object2 = iterator0.next();
            }
            this.j = (m)map$Entry0.getKey();
            if(this.o != null) {
                f f1 = (f)map$Entry0.getValue();
                this.o.b(f1.c(), f1.a(), f1.b());
                this.o.d(f1.c());
            }
        }
        androidx.work.impl.foreground.b.b b$b0 = this.o;
        if(f0 != null && b$b0 != null) {
            k.e().a("WM-SystemFgDispatcher", "Removing Notification (id: " + f0.c() + ", workSpecId: " + m0 + ", notificationType: " + f0.a());
            b$b0.d(f0.c());
        }
    }

    public static Intent g(Context context0) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_STOP_FOREGROUND");
        return intent0;
    }

    private void h(Intent intent0) {
        k.e().f("WM-SystemFgDispatcher", "Stopping foreground work for " + intent0);
        String s = intent0.getStringExtra("KEY_WORKSPEC_ID");
        if(s != null && !TextUtils.isEmpty(s)) {
            this.g.h(UUID.fromString(s));
        }
    }

    private void i(Intent intent0) {
        int v = 0;
        int v1 = intent0.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int v2 = intent0.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String s = intent0.getStringExtra("KEY_WORKSPEC_ID");
        m m0 = new m(s, intent0.getIntExtra("KEY_GENERATION", 0));
        Notification notification0 = (Notification)intent0.getParcelableExtra("KEY_NOTIFICATION");
        k.e().a("WM-SystemFgDispatcher", "Notifying with (id:" + v1 + ", workSpecId: " + s + ", notificationType :" + v2 + ")");
        if(notification0 != null && this.o != null) {
            f f0 = new f(v1, notification0, v2);
            this.k.put(m0, f0);
            if(this.j == null) {
                this.j = m0;
                this.o.b(v1, v2, notification0);
                return;
            }
            this.o.c(v1, notification0);
            if(v2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for(Object object0: this.k.entrySet()) {
                    v |= ((f)((Map.Entry)object0).getValue()).a();
                }
                f f1 = (f)this.k.get(this.j);
                if(f1 != null) {
                    this.o.b(f1.c(), v, f1.b());
                }
            }
        }
    }

    private void j(Intent intent0) {
        class a implements Runnable {
            final String f;
            final b g;

            a(String s) {
                this.f = s;
                super();
            }

            @Override
            public void run() {
                u u0 = b.this.g.o().h(this.f);
                if(u0 != null && u0.h()) {
                    synchronized(b.this.i) {
                        m m0 = x.a(u0);
                        b.this.l.put(m0, u0);
                        b.this.m.add(u0);
                        b.this.n.a(b.this.m);
                    }
                }
            }
        }

        k.e().f("WM-SystemFgDispatcher", "Started foreground service " + intent0);
        a b$a0 = new a(this, intent0.getStringExtra("KEY_WORKSPEC_ID"));
        this.h.c(b$a0);
    }

    void k(Intent intent0) {
        k.e().f("WM-SystemFgDispatcher", "Stopping foreground service");
        androidx.work.impl.foreground.b.b b$b0 = this.o;
        if(b$b0 != null) {
            b$b0.stop();
        }
    }

    void l() {
        this.o = null;
        synchronized(this.i) {
            this.n.d();
        }
        this.g.o().n(this);
    }

    void m(Intent intent0) {
        String s = intent0.getAction();
        if("ACTION_START_FOREGROUND".equals(s)) {
            this.j(intent0);
            this.i(intent0);
            return;
        }
        if("ACTION_NOTIFY".equals(s)) {
            this.i(intent0);
            return;
        }
        if("ACTION_CANCEL_WORK".equals(s)) {
            this.h(intent0);
            return;
        }
        if("ACTION_STOP_FOREGROUND".equals(s)) {
            this.k(intent0);
        }
    }

    void n(androidx.work.impl.foreground.b.b b$b0) {
        if(this.o != null) {
            k.e().c("WM-SystemFgDispatcher", "A callback already exists.");
            return;
        }
        this.o = b$b0;
    }
}

