package androidx.work.impl;

import android.content.Context;
import h0.b;
import k0.g;
import z3.k;

public final class s extends b {
    private final Context c;

    public s(Context context0, int v, int v1) {
        k.e(context0, "mContext");
        super(v, v1);
        this.c = context0;
    }

    @Override  // h0.b
    public void a(g g0) {
        k.e(g0, "db");
        if(this.b >= 10) {
            g0.z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            return;
        }
        this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
}

