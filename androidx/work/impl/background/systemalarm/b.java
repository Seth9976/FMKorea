package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e;
import androidx.work.impl.v;
import androidx.work.impl.w;
import androidx.work.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x0.m;
import x0.u;

public class b implements e {
    private final Context f;
    private final Map g;
    private final Object h;
    private final w i;
    private static final String j;

    static {
        b.j = "WM-CommandHandler";
    }

    b(Context context0, w w0) {
        this.f = context0;
        this.i = w0;
        this.g = new HashMap();
        this.h = new Object();
    }

    static Intent a(Context context0) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent0;
    }

    static Intent b(Context context0, m m0) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_DELAY_MET");
        return b.q(intent0, m0);
    }

    static Intent c(Context context0, m m0, boolean z) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_EXECUTION_COMPLETED");
        intent0.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return b.q(intent0, m0);
    }

    static Intent d(Context context0, m m0) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_SCHEDULE_WORK");
        return b.q(intent0, m0);
    }

    static Intent e(Context context0, m m0) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_STOP_WORK");
        return b.q(intent0, m0);
    }

    @Override  // androidx.work.impl.e
    public void f(m m0, boolean z) {
        synchronized(this.h) {
            f f0 = (f)this.g.remove(m0);
            this.i.b(m0);
            if(f0 != null) {
                f0.h(z);
            }
        }
    }

    private void g(Intent intent0, int v, g g0) {
        k.e().a("WM-CommandHandler", "Handling constraints changed " + intent0);
        new c(this.f, v, g0).a();
    }

    private void h(Intent intent0, int v, g g0) {
        synchronized(this.h) {
            m m0 = b.p(intent0);
            k.e().a("WM-CommandHandler", "Handing delay met for " + m0);
            if(this.g.containsKey(m0)) {
                k.e().a("WM-CommandHandler", "WorkSpec " + m0 + " is is already being handled for ACTION_DELAY_MET");
            }
            else {
                v v2 = this.i.d(m0);
                f f0 = new f(this.f, v, g0, v2);
                this.g.put(m0, f0);
                f0.g();
            }
        }
    }

    private void i(Intent intent0, int v) {
        m m0 = b.p(intent0);
        boolean z = intent0.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        k.e().a("WM-CommandHandler", "Handling onExecutionCompleted " + intent0 + ", " + v);
        this.f(m0, z);
    }

    private void j(Intent intent0, int v, g g0) {
        k.e().a("WM-CommandHandler", "Handling reschedule " + intent0 + ", " + v);
        g0.g().v();
    }

    private void k(Intent intent0, int v, g g0) {
        m m0 = b.p(intent0);
        k.e().a("WM-CommandHandler", "Handling schedule work for " + m0);
        WorkDatabase workDatabase0 = g0.g().r();
        workDatabase0.e();
        try {
            u u0 = workDatabase0.I().o(m0.b());
            if(u0 == null) {
                k.e().k("WM-CommandHandler", "Skipping scheduling " + m0 + " because it\'s no longer in the DB");
                return;
            }
            long v2 = u0.c();
            if(u0.h()) {
                k.e().a("WM-CommandHandler", "Opportunistically setting an alarm for " + m0 + "at " + v2);
                a.c(this.f, workDatabase0, m0, v2);
                Intent intent1 = b.a(this.f);
                g0.e().a().execute(new androidx.work.impl.background.systemalarm.g.b(g0, intent1, v));
            }
            else {
                k.e().a("WM-CommandHandler", "Setting up Alarms for " + m0 + "at " + v2);
                a.c(this.f, workDatabase0, m0, v2);
            }
            workDatabase0.A();
        }
        finally {
            workDatabase0.i();
        }
    }

    private void l(Intent intent0, g g0) {
        List list0;
        Bundle bundle0 = intent0.getExtras();
        String s = bundle0.getString("KEY_WORKSPEC_ID");
        if(bundle0.containsKey("KEY_WORKSPEC_GENERATION")) {
            int v = bundle0.getInt("KEY_WORKSPEC_GENERATION");
            list0 = new ArrayList(1);
            m m0 = new m(s, v);
            v v1 = this.i.b(m0);
            if(v1 != null) {
                list0.add(v1);
            }
        }
        else {
            list0 = this.i.c(s);
        }
        for(Object object0: list0) {
            k.e().a("WM-CommandHandler", "Handing stopWork work for " + s);
            g0.g().A(((v)object0));
            a.a(this.f, g0.g().r(), ((v)object0).a());
            g0.f(((v)object0).a(), false);
        }
    }

    private static boolean m(Bundle bundle0, String[] arr_s) {
        if(bundle0 != null && !bundle0.isEmpty()) {
            for(int v = 0; v < arr_s.length; ++v) {
                if(bundle0.get(arr_s[v]) == null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    boolean n() {
        synchronized(this.h) {
        }
        return !this.g.isEmpty();
    }

    void o(Intent intent0, int v, g g0) {
        String s = intent0.getAction();
        if("ACTION_CONSTRAINTS_CHANGED".equals(s)) {
            this.g(intent0, v, g0);
            return;
        }
        if("ACTION_RESCHEDULE".equals(s)) {
            this.j(intent0, v, g0);
            return;
        }
        if(!b.m(intent0.getExtras(), new String[]{"KEY_WORKSPEC_ID"})) {
            k.e().c("WM-CommandHandler", "Invalid request for " + s + " , requires " + "KEY_WORKSPEC_ID" + " .");
            return;
        }
        if("ACTION_SCHEDULE_WORK".equals(s)) {
            this.k(intent0, v, g0);
            return;
        }
        if("ACTION_DELAY_MET".equals(s)) {
            this.h(intent0, v, g0);
            return;
        }
        if("ACTION_STOP_WORK".equals(s)) {
            this.l(intent0, g0);
            return;
        }
        if("ACTION_EXECUTION_COMPLETED".equals(s)) {
            this.i(intent0, v);
            return;
        }
        k.e().k("WM-CommandHandler", "Ignoring intent " + intent0);
    }

    static m p(Intent intent0) {
        return new m(intent0.getStringExtra("KEY_WORKSPEC_ID"), intent0.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent0, m m0) {
        intent0.putExtra("KEY_WORKSPEC_ID", m0.b());
        intent0.putExtra("KEY_WORKSPEC_GENERATION", m0.a());
        return intent0;
    }
}

