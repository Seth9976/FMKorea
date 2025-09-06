package androidx.work.impl;

import h0.b;
import k0.g;
import z3.k;

public final class n extends b {
    public static final n c;

    static {
        n.c = new n();
    }

    private n() {
        super(8, 9);
    }

    @Override  // h0.b
    public void a(g g0) {
        k.e(g0, "db");
        g0.k("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}

