package androidx.work.impl;

import g0.u.b;
import k0.g;
import z3.k;

public final class c extends b {
    public static final c a;

    static {
        c.a = new c();
    }

    @Override  // g0.u$b
    public void c(g g0) {
        k.e(g0, "db");
        super.c(g0);
        g0.c();
        try {
            g0.k("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < 1757021923904 AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            g0.y();
        }
        finally {
            g0.I();
        }
    }

    // 去混淆评级： 低(20)
    public final long d() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    private final String e() [...] // 潜在的解密器
}

