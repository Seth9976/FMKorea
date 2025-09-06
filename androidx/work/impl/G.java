package androidx.work.impl;

import h0.b;
import z3.k;

public final class g extends b {
    public static final g c;

    static {
        g.c = new g();
    }

    private g() {
        super(12, 13);
    }

    @Override  // h0.b
    public void a(k0.g g0) {
        k.e(g0, "db");
        g0.k("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        g0.k("UPDATE workspec SET content_uri_triggers = x\'\' WHERE content_uri_triggers is NULL");
    }
}

