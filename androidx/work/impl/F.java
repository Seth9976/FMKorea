package androidx.work.impl;

import h0.b;
import k0.g;
import z3.k;

public final class f extends b {
    public static final f c;

    static {
        f.c = new f();
    }

    private f() {
        super(11, 12);
    }

    @Override  // h0.b
    public void a(g g0) {
        k.e(g0, "db");
        g0.k("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}

