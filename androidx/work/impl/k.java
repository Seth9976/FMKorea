package androidx.work.impl;

import h0.b;
import k0.g;

public final class k extends b {
    public static final k c;

    static {
        k.c = new k();
    }

    private k() {
        super(4, 5);
    }

    @Override  // h0.b
    public void a(g g0) {
        z3.k.e(g0, "db");
        g0.k("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        g0.k("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}

