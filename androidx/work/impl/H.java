package androidx.work.impl;

import h0.b;
import k0.g;
import z3.k;

public final class h extends b {
    public static final h c;

    static {
        h.c = new h();
    }

    private h() {
        super(15, 16);
    }

    @Override  // h0.b
    public void a(g g0) {
        k.e(g0, "db");
        g0.k("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        g0.k("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        g0.k("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        g0.k("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        g0.k("DROP TABLE `SystemIdInfo`");
        g0.k("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}

