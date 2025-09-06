package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.p;
import androidx.work.k;
import y0.x;

public class SystemAlarmService extends p implements c {
    private g g;
    private boolean h;
    private static final String i;

    static {
        SystemAlarmService.i = "WM-SystemAlarmService";
    }

    @Override  // androidx.work.impl.background.systemalarm.g$c
    public void a() {
        this.h = true;
        k.e().a("WM-SystemAlarmService", "All commands completed in dispatcher");
        x.a();
        this.stopSelf();
    }

    private void e() {
        g g0 = new g(this);
        this.g = g0;
        g0.l(this);
    }

    @Override  // androidx.lifecycle.p
    public void onCreate() {
        super.onCreate();
        this.e();
        this.h = false;
    }

    @Override  // androidx.lifecycle.p
    public void onDestroy() {
        super.onDestroy();
        this.h = true;
        this.g.j();
    }

    @Override  // androidx.lifecycle.p
    public int onStartCommand(Intent intent0, int v, int v1) {
        super.onStartCommand(intent0, v, v1);
        if(this.h) {
            k.e().f("WM-SystemAlarmService", "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.g.j();
            this.e();
            this.h = false;
        }
        if(intent0 != null) {
            this.g.a(intent0, v1);
        }
        return 3;
    }
}

