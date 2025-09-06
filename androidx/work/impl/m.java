package androidx.work.impl;

import h0.b;
import k0.g;
import z3.k;

public final class m extends b {
    public static final m c;

    static {
        m.c = new m();
    }

    private m() {
        super(7, 8);
    }

    @Override  // h0.b
    public void a(g g0) {
        k.e(g0, "db");
        g0.k("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}

