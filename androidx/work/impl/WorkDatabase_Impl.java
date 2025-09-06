package androidx.work.impl;

import i0.d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k0.g;
import k0.h;
import x0.A;
import x0.b;
import x0.c;
import x0.e;
import x0.f;
import x0.j;
import x0.k;
import x0.o;
import x0.p;
import x0.r;
import x0.s;
import x0.v;
import x0.w;
import x0.z;

public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile v q;
    private volatile b r;
    private volatile z s;
    private volatile j t;
    private volatile o u;
    private volatile r v;
    private volatile e w;

    @Override  // androidx.work.impl.WorkDatabase
    public b D() {
        if(this.r != null) {
            return this.r;
        }
        synchronized(this) {
            if(this.r == null) {
                this.r = new c(this);
            }
            return this.r;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public e E() {
        if(this.w != null) {
            return this.w;
        }
        synchronized(this) {
            if(this.w == null) {
                this.w = new f(this);
            }
            return this.w;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public j F() {
        if(this.t != null) {
            return this.t;
        }
        synchronized(this) {
            if(this.t == null) {
                this.t = new k(this);
            }
            return this.t;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public o G() {
        if(this.u != null) {
            return this.u;
        }
        synchronized(this) {
            if(this.u == null) {
                this.u = new p(this);
            }
            return this.u;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public r H() {
        if(this.v != null) {
            return this.v;
        }
        synchronized(this) {
            if(this.v == null) {
                this.v = new s(this);
            }
            return this.v;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public v I() {
        if(this.q != null) {
            return this.q;
        }
        synchronized(this) {
            if(this.q == null) {
                this.q = new w(this);
            }
            return this.q;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public z J() {
        if(this.s != null) {
            return this.s;
        }
        synchronized(this) {
            if(this.s == null) {
                this.s = new A(this);
            }
            return this.s;
        }
    }

    @Override  // g0.u
    protected g0.o g() {
        return new g0.o(this, new HashMap(0), new HashMap(0), new String[]{"Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference"});
    }

    @Override  // g0.u
    protected h h(g0.f f0) {
        class a extends g0.w.b {
            final WorkDatabase_Impl b;

            a(int v) {
                super(v);
            }

            @Override  // g0.w$b
            public void a(g g0) {
                g0.k("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                g0.k("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                g0.k("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                g0.k("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                g0.k("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                g0.k("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                g0.k("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                g0.k("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                g0.k("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                g0.k("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                g0.k("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                g0.k("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                g0.k("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                g0.k("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                g0.k("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'5181942b9ebc31ce68dacb56c16fd79f\')");
            }

            @Override  // g0.w$b
            public void b(g g0) {
                g0.k("DROP TABLE IF EXISTS `Dependency`");
                g0.k("DROP TABLE IF EXISTS `WorkSpec`");
                g0.k("DROP TABLE IF EXISTS `WorkTag`");
                g0.k("DROP TABLE IF EXISTS `SystemIdInfo`");
                g0.k("DROP TABLE IF EXISTS `WorkName`");
                g0.k("DROP TABLE IF EXISTS `WorkProgress`");
                g0.k("DROP TABLE IF EXISTS `Preference`");
                if(WorkDatabase_Impl.this.h != null) {
                    int v = WorkDatabase_Impl.this.h.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        ((g0.u.b)WorkDatabase_Impl.this.h.get(v1)).b(g0);
                    }
                }
            }

            @Override  // g0.w$b
            public void c(g g0) {
                if(WorkDatabase_Impl.this.h != null) {
                    int v = WorkDatabase_Impl.this.h.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        ((g0.u.b)WorkDatabase_Impl.this.h.get(v1)).a(g0);
                    }
                }
            }

            @Override  // g0.w$b
            public void d(g g0) {
                WorkDatabase_Impl.this.a = g0;
                g0.k("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.u(g0);
                if(WorkDatabase_Impl.this.h != null) {
                    int v = WorkDatabase_Impl.this.h.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        ((g0.u.b)WorkDatabase_Impl.this.h.get(v1)).c(g0);
                    }
                }
            }

            @Override  // g0.w$b
            public void e(g g0) {
            }

            @Override  // g0.w$b
            public void f(g g0) {
                i0.b.a(g0);
            }

            @Override  // g0.w$b
            public g0.w.c g(g g0) {
                HashMap hashMap0 = new HashMap(2);
                hashMap0.put("work_spec_id", new i0.d.a("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap0.put("prerequisite_id", new i0.d.a("prerequisite_id", "TEXT", true, 2, null, 1));
                HashSet hashSet0 = new HashSet(2);
                hashSet0.add(new i0.d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                hashSet0.add(new i0.d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet1 = new HashSet(2);
                hashSet1.add(new i0.d.e("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                hashSet1.add(new i0.d.e("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
                d d0 = new d("Dependency", hashMap0, hashSet0, hashSet1);
                d d1 = d.a(g0, "Dependency");
                if(!d0.equals(d1)) {
                    return new g0.w.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + d0 + "\n Found:\n" + d1);
                }
                HashMap hashMap1 = new HashMap(27);
                hashMap1.put("id", new i0.d.a("id", "TEXT", true, 1, null, 1));
                hashMap1.put("state", new i0.d.a("state", "INTEGER", true, 0, null, 1));
                hashMap1.put("worker_class_name", new i0.d.a("worker_class_name", "TEXT", true, 0, null, 1));
                hashMap1.put("input_merger_class_name", new i0.d.a("input_merger_class_name", "TEXT", false, 0, null, 1));
                hashMap1.put("input", new i0.d.a("input", "BLOB", true, 0, null, 1));
                hashMap1.put("output", new i0.d.a("output", "BLOB", true, 0, null, 1));
                hashMap1.put("initial_delay", new i0.d.a("initial_delay", "INTEGER", true, 0, null, 1));
                hashMap1.put("interval_duration", new i0.d.a("interval_duration", "INTEGER", true, 0, null, 1));
                hashMap1.put("flex_duration", new i0.d.a("flex_duration", "INTEGER", true, 0, null, 1));
                hashMap1.put("run_attempt_count", new i0.d.a("run_attempt_count", "INTEGER", true, 0, null, 1));
                hashMap1.put("backoff_policy", new i0.d.a("backoff_policy", "INTEGER", true, 0, null, 1));
                hashMap1.put("backoff_delay_duration", new i0.d.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                hashMap1.put("last_enqueue_time", new i0.d.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
                hashMap1.put("minimum_retention_duration", new i0.d.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                hashMap1.put("schedule_requested_at", new i0.d.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
                hashMap1.put("run_in_foreground", new i0.d.a("run_in_foreground", "INTEGER", true, 0, null, 1));
                hashMap1.put("out_of_quota_policy", new i0.d.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                hashMap1.put("period_count", new i0.d.a("period_count", "INTEGER", true, 0, "0", 1));
                hashMap1.put("generation", new i0.d.a("generation", "INTEGER", true, 0, "0", 1));
                hashMap1.put("required_network_type", new i0.d.a("required_network_type", "INTEGER", true, 0, null, 1));
                hashMap1.put("requires_charging", new i0.d.a("requires_charging", "INTEGER", true, 0, null, 1));
                hashMap1.put("requires_device_idle", new i0.d.a("requires_device_idle", "INTEGER", true, 0, null, 1));
                hashMap1.put("requires_battery_not_low", new i0.d.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                hashMap1.put("requires_storage_not_low", new i0.d.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                hashMap1.put("trigger_content_update_delay", new i0.d.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                hashMap1.put("trigger_max_content_delay", new i0.d.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                hashMap1.put("content_uri_triggers", new i0.d.a("content_uri_triggers", "BLOB", true, 0, null, 1));
                HashSet hashSet2 = new HashSet(0);
                HashSet hashSet3 = new HashSet(2);
                hashSet3.add(new i0.d.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
                hashSet3.add(new i0.d.e("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
                d d2 = new d("WorkSpec", hashMap1, hashSet2, hashSet3);
                d d3 = d.a(g0, "WorkSpec");
                if(!d2.equals(d3)) {
                    return new g0.w.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + d2 + "\n Found:\n" + d3);
                }
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("tag", new i0.d.a("tag", "TEXT", true, 1, null, 1));
                hashMap2.put("work_spec_id", new i0.d.a("work_spec_id", "TEXT", true, 2, null, 1));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new i0.d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new i0.d.e("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                d d4 = new d("WorkTag", hashMap2, hashSet4, hashSet5);
                d d5 = d.a(g0, "WorkTag");
                if(!d4.equals(d5)) {
                    return new g0.w.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + d4 + "\n Found:\n" + d5);
                }
                HashMap hashMap3 = new HashMap(3);
                hashMap3.put("work_spec_id", new i0.d.a("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap3.put("generation", new i0.d.a("generation", "INTEGER", true, 2, "0", 1));
                hashMap3.put("system_id", new i0.d.a("system_id", "INTEGER", true, 0, null, 1));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new i0.d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                d d6 = new d("SystemIdInfo", hashMap3, hashSet6, new HashSet(0));
                d d7 = d.a(g0, "SystemIdInfo");
                if(!d6.equals(d7)) {
                    return new g0.w.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + d6 + "\n Found:\n" + d7);
                }
                HashMap hashMap4 = new HashMap(2);
                hashMap4.put("name", new i0.d.a("name", "TEXT", true, 1, null, 1));
                hashMap4.put("work_spec_id", new i0.d.a("work_spec_id", "TEXT", true, 2, null, 1));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new i0.d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new i0.d.e("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                d d8 = new d("WorkName", hashMap4, hashSet7, hashSet8);
                d d9 = d.a(g0, "WorkName");
                if(!d8.equals(d9)) {
                    return new g0.w.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + d8 + "\n Found:\n" + d9);
                }
                HashMap hashMap5 = new HashMap(2);
                hashMap5.put("work_spec_id", new i0.d.a("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap5.put("progress", new i0.d.a("progress", "BLOB", true, 0, null, 1));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new i0.d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                d d10 = new d("WorkProgress", hashMap5, hashSet9, new HashSet(0));
                d d11 = d.a(g0, "WorkProgress");
                if(!d10.equals(d11)) {
                    return new g0.w.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + d10 + "\n Found:\n" + d11);
                }
                HashMap hashMap6 = new HashMap(2);
                hashMap6.put("key", new i0.d.a("key", "TEXT", true, 1, null, 1));
                hashMap6.put("long_value", new i0.d.a("long_value", "INTEGER", false, 0, null, 1));
                d d12 = new d("Preference", hashMap6, new HashSet(0), new HashSet(0));
                d d13 = d.a(g0, "Preference");
                return d12.equals(d13) ? new g0.w.c(true, null) : new g0.w.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + d12 + "\n Found:\n" + d13);
            }
        }

        g0.w w0 = new g0.w(f0, new a(this, 16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e");
        k0.h.b h$b0 = k0.h.b.a(f0.a).d(f0.b).c(w0).b();
        return f0.c.a(h$b0);
    }

    @Override  // g0.u
    public List j(Map map0) {
        return Arrays.asList(new h0.b[]{new C(), new D()});
    }

    @Override  // g0.u
    public Set o() {
        return new HashSet();
    }

    @Override  // g0.u
    protected Map p() {
        Map map0 = new HashMap();
        List list0 = w.w();
        ((HashMap)map0).put(v.class, list0);
        List list1 = c.e();
        ((HashMap)map0).put(b.class, list1);
        List list2 = A.d();
        ((HashMap)map0).put(z.class, list2);
        List list3 = k.h();
        ((HashMap)map0).put(j.class, list3);
        List list4 = p.c();
        ((HashMap)map0).put(o.class, list4);
        List list5 = s.d();
        ((HashMap)map0).put(r.class, list5);
        List list6 = f.c();
        ((HashMap)map0).put(e.class, list6);
        List list7 = x0.h.a();
        ((HashMap)map0).put(x0.g.class, list7);
        return map0;
    }
}

