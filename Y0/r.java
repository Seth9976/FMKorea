package y0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import k0.g;
import x0.d;

public class r {
    private final WorkDatabase a;

    public r(WorkDatabase workDatabase0) {
        this.a = workDatabase0;
    }

    public long a() {
        Long long0 = this.a.E().a("last_force_stop_ms");
        return long0 == null ? 0L : ((long)long0);
    }

    public boolean b() {
        Long long0 = this.a.E().a("reschedule_needed");
        return long0 != null && ((long)long0) == 1L;
    }

    public static void c(Context context0, g g0) {
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("androidx.work.util.preferences", 0);
        if(sharedPreferences0.contains("reschedule_needed") || sharedPreferences0.contains("last_cancel_all_time_ms")) {
            long v = 0L;
            long v1 = sharedPreferences0.getLong("last_cancel_all_time_ms", 0L);
            if(sharedPreferences0.getBoolean("reschedule_needed", false)) {
                v = 1L;
            }
            g0.c();
            try {
                g0.z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", v1});
                g0.z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", v});
                sharedPreferences0.edit().clear().apply();
                g0.y();
            }
            finally {
                g0.I();
            }
        }
    }

    public void d(long v) {
        d d0 = new d("last_force_stop_ms", v);
        this.a.E().b(d0);
    }

    public void e(boolean z) {
        d d0 = new d("reschedule_needed", z);
        this.a.E().b(d0);
    }
}

