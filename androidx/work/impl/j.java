package androidx.work.impl;

import h0.b;
import k0.g;
import z3.k;

public final class j extends b {
    public static final j c;

    static {
        j.c = new j();
    }

    private j() {
        super(3, 4);
    }

    @Override  // h0.b
    public void a(g g0) {
        k.e(g0, "db");
        g0.k("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}

