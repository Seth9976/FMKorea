package androidx.work.impl.utils;

import B.a;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.A;
import androidx.work.impl.F;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.l;
import androidx.work.k;
import androidx.work.t;
import java.util.List;
import java.util.concurrent.TimeUnit;
import x0.u;
import x0.v;
import y0.f;
import y0.r;
import y0.s;

public class ForceStopRunnable implements Runnable {
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a;

        static {
            BroadcastReceiver.a = "WM-ForceStopRunnable$Rc";
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            if(intent0 != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent0.getAction())) {
                k.e().j("WM-ForceStopRunnable$Rc", "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.g(context0);
            }
        }
    }

    private final Context f;
    private final F g;
    private final r h;
    private int i;
    private static final String j;
    private static final long k;

    static {
        ForceStopRunnable.j = "WM-ForceStopRunnable";
        ForceStopRunnable.k = TimeUnit.DAYS.toMillis(3650L);
    }

    public ForceStopRunnable(Context context0, F f0) {
        this.f = context0.getApplicationContext();
        this.g = f0;
        this.h = f0.n();
        this.i = 0;
    }

    public boolean a() {
        boolean z = l.i(this.f, this.g);
        WorkDatabase workDatabase0 = this.g.r();
        v v0 = workDatabase0.I();
        x0.r r0 = workDatabase0.H();
        workDatabase0.e();
        try {
            List list0 = v0.k();
            boolean z1 = list0 != null && !list0.isEmpty();
            if(z1) {
                for(Object object0: list0) {
                    v0.h(t.f, ((u)object0).a);
                    v0.c(((u)object0).a, -1L);
                }
            }
            r0.c();
            workDatabase0.A();
            return z1 || z;
        }
        finally {
            workDatabase0.i();
        }
    }

    public void b() {
        boolean z = this.a();
        if(this.h()) {
            k.e().a("WM-ForceStopRunnable", "Rescheduling Workers.");
            this.g.v();
            this.g.n().e(false);
            return;
        }
        if(this.e()) {
            k.e().a("WM-ForceStopRunnable", "Application was force-stopped, rescheduling.");
            this.g.v();
            this.h.d(System.currentTimeMillis());
            return;
        }
        if(z) {
            k.e().a("WM-ForceStopRunnable", "Found unfinished work, scheduling it.");
            androidx.work.impl.u.b(this.g.k(), this.g.r(), this.g.p());
        }
    }

    static Intent c(Context context0) {
        Intent intent0 = new Intent();
        intent0.setComponent(new ComponentName(context0, BroadcastReceiver.class));
        intent0.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent0;
    }

    private static PendingIntent d(Context context0, int v) {
        return PendingIntent.getBroadcast(context0, -1, ForceStopRunnable.c(context0), v);
    }

    public boolean e() {
        try {
            int v = Build.VERSION.SDK_INT;
            PendingIntent pendingIntent0 = ForceStopRunnable.d(this.f, (v < 0x1F ? 0x20000000 : 0x22000000));
            if(v < 30) {
                if(pendingIntent0 != null) {
                    return false;
                }
                ForceStopRunnable.g(this.f);
                return true;
            }
            if(pendingIntent0 != null) {
                pendingIntent0.cancel();
            }
            List list0 = ((ActivityManager)this.f.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if(list0 == null || list0.isEmpty()) {
                return false;
            }
            long v1 = this.h.a();
            for(int v2 = 0; true; ++v2) {
                if(v2 >= list0.size()) {
                    return false;
                }
                ApplicationExitInfo applicationExitInfo0 = f.a(list0.get(v2));
                if(applicationExitInfo0.getReason() == 10 && applicationExitInfo0.getTimestamp() >= v1) {
                    return true;
                }
            }
        }
        catch(SecurityException | IllegalArgumentException securityException0) {
        }
        k.e().l("WM-ForceStopRunnable", "Ignoring exception", securityException0);
        return true;
    }

    public boolean f() {
        b b0 = this.g.k();
        if(TextUtils.isEmpty(b0.c())) {
            k.e().a("WM-ForceStopRunnable", "The default process name was not specified.");
            return true;
        }
        boolean z = s.b(this.f, b0);
        k.e().a("WM-ForceStopRunnable", "Is default app process = " + z);
        return z;
    }

    static void g(Context context0) {
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        PendingIntent pendingIntent0 = ForceStopRunnable.d(context0, (Build.VERSION.SDK_INT < 0x1F ? 0x8000000 : 0xA000000));
        long v = System.currentTimeMillis() + ForceStopRunnable.k;
        if(alarmManager0 != null) {
            alarmManager0.setExact(0, v, pendingIntent0);
        }
    }

    public boolean h() {
        return this.g.n().b();
    }

    public void i(long v) {
        try {
            Thread.sleep(v);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    @Override
    public void run() {
        try {
            if(!this.f()) {
                return;
            }
            while(true) {
                try {
                    A.d(this.f);
                }
                catch(SQLiteException sQLiteException0) {
                    k.e().c("WM-ForceStopRunnable", "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException0 = new IllegalStateException("Unexpected SQLite exception during migrations", sQLiteException0);
                    a a0 = this.g.k().e();
                    if(a0 == null) {
                        throw illegalStateException0;
                    }
                    a0.a(illegalStateException0);
                    break;
                }
                k.e().a("WM-ForceStopRunnable", "Performing cleanup operations.");
                try {
                    this.b();
                    break;
                }
                catch(SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException | SQLiteConstraintException | SQLiteAccessPermException sQLiteCantOpenDatabaseException0) {
                    int v1 = this.i + 1;
                    this.i = v1;
                    if(v1 >= 3) {
                        k.e().d("WM-ForceStopRunnable", "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store.", sQLiteCantOpenDatabaseException0);
                        IllegalStateException illegalStateException1 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store.", sQLiteCantOpenDatabaseException0);
                        a a1 = this.g.k().e();
                        if(a1 == null) {
                            throw illegalStateException1;
                        }
                        k.e().b("WM-ForceStopRunnable", "Routing exception to the specified exception handler", illegalStateException1);
                        a1.a(illegalStateException1);
                        break;
                    }
                    k.e().b("WM-ForceStopRunnable", "Retrying after " + ((long)v1) * 300L, sQLiteCantOpenDatabaseException0);
                    this.i(((long)this.i) * 300L);
                }
            }
        }
        finally {
            this.g.u();
        }
    }
}

