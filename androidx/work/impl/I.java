package androidx.work.impl;

import h0.b;
import k0.g;
import z3.k;

public final class i extends b {
    public static final i c;

    static {
        i.c = new i();
    }

    private i() {
        super(1, 2);
    }

    @Override  // h0.b
    public void a(g g0) {
        k.e(g0, "db");
        g0.k("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        g0.k("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        g0.k("DROP TABLE IF EXISTS alarmInfo");
        g0.k("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}

