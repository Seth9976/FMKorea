package androidx.work.impl;

import android.content.ContentValues;
import h0.a;
import k0.g;
import z3.k;

public final class b implements a {
    @Override  // h0.a
    public void a(g g0) {
        k.e(g0, "db");
        g0.k("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues0 = new ContentValues(1);
        contentValues0.put("last_enqueue_time", System.currentTimeMillis());
        g0.B("WorkSpec", 3, contentValues0, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}

