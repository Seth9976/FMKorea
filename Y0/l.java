package y0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import k0.g;
import x0.d;
import z3.k;

public abstract class l {
    public static final int a(WorkDatabase workDatabase0, String s) {
        return l.d(workDatabase0, s);
    }

    public static final void b(WorkDatabase workDatabase0, String s, int v) {
        l.e(workDatabase0, s, v);
    }

    public static final void c(Context context0, g g0) {
        k.e(context0, "context");
        k.e(g0, "sqLiteDatabase");
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("androidx.work.util.id", 0);
        if(sharedPreferences0.contains("next_job_scheduler_id") || sharedPreferences0.contains("next_job_scheduler_id")) {
            int v = sharedPreferences0.getInt("next_job_scheduler_id", 0);
            int v1 = sharedPreferences0.getInt("next_alarm_manager_id", 0);
            g0.c();
            try {
                g0.z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", v});
                g0.z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", v1});
                sharedPreferences0.edit().clear().apply();
                g0.y();
            }
            finally {
                g0.I();
            }
        }
    }

    private static final int d(WorkDatabase workDatabase0, String s) {
        Long long0 = workDatabase0.E().a(s);
        int v = 0;
        int v1 = long0 == null ? 0 : ((int)(((long)long0)));
        if(v1 != 0x7FFFFFFF) {
            v = v1 + 1;
        }
        l.e(workDatabase0, s, v);
        return v1;
    }

    private static final void e(WorkDatabase workDatabase0, String s, int v) {
        workDatabase0.E().b(new d(s, ((long)v)));
    }
}

