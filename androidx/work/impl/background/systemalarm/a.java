package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.k;
import x0.i;
import x0.j;
import x0.l;
import x0.m;

abstract class a {
    static abstract class androidx.work.impl.background.systemalarm.a.a {
        static void a(AlarmManager alarmManager0, int v, long v1, PendingIntent pendingIntent0) {
            alarmManager0.setExact(v, v1, pendingIntent0);
        }
    }

    private static final String a;

    static {
        a.a = "WM-Alarms";
    }

    public static void a(Context context0, WorkDatabase workDatabase0, m m0) {
        j j0 = workDatabase0.F();
        i i0 = j0.a(m0);
        if(i0 != null) {
            a.b(context0, m0, i0.c);
            k.e().a("WM-Alarms", "Removing SystemIdInfo for workSpecId (" + m0 + ")");
            j0.c(m0);
        }
    }

    private static void b(Context context0, m m0, int v) {
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        PendingIntent pendingIntent0 = PendingIntent.getService(context0, v, b.b(context0, m0), 0x24000000);
        if(pendingIntent0 != null && alarmManager0 != null) {
            k.e().a("WM-Alarms", "Cancelling existing alarm with (workSpecId, systemId) (" + m0 + ", " + v + ")");
            alarmManager0.cancel(pendingIntent0);
        }
    }

    public static void c(Context context0, WorkDatabase workDatabase0, m m0, long v) {
        j j0 = workDatabase0.F();
        i i0 = j0.a(m0);
        if(i0 != null) {
            a.b(context0, m0, i0.c);
            a.d(context0, m0, i0.c, v);
            return;
        }
        int v1 = new y0.k(workDatabase0).c();
        j0.g(l.a(m0, v1));
        a.d(context0, m0, v1, v);
    }

    private static void d(Context context0, m m0, int v, long v1) {
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        PendingIntent pendingIntent0 = PendingIntent.getService(context0, v, b.b(context0, m0), 0xC000000);
        if(alarmManager0 != null) {
            androidx.work.impl.background.systemalarm.a.a.a(alarmManager0, 0, v1, pendingIntent0);
        }
    }
}

