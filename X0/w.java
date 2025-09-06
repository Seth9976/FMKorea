package x0;

import android.database.Cursor;
import androidx.work.o;
import androidx.work.t;
import g0.A;
import g0.h;
import g0.i;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k0.k;

public final class w implements v {
    private final u a;
    private final i b;
    private final h c;
    private final A d;
    private final A e;
    private final A f;
    private final A g;
    private final A h;
    private final A i;
    private final A j;
    private final A k;
    private final A l;
    private final A m;
    private final A n;

    public w(u u0) {
        class a extends A {
            final w d;

            a(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        }


        class b extends A {
            final w d;

            b(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        }


        class c extends A {
            final w d;

            c(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        }


        class d extends A {
            final w d;

            d(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            }
        }


        class e extends i {
            final w d;

            e(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override  // g0.i
            public void i(k k0, Object object0) {
                this.k(k0, ((x0.u)object0));
            }

            public void k(k k0, x0.u u0) {
                String s = u0.a;
                if(s == null) {
                    k0.P(1);
                }
                else {
                    k0.l(1, s);
                }
                k0.x(2, ((long)B.j(u0.b)));
                String s1 = u0.c;
                if(s1 == null) {
                    k0.P(3);
                }
                else {
                    k0.l(3, s1);
                }
                String s2 = u0.d;
                if(s2 == null) {
                    k0.P(4);
                }
                else {
                    k0.l(4, s2);
                }
                byte[] arr_b = androidx.work.d.n(u0.e);
                if(arr_b == null) {
                    k0.P(5);
                }
                else {
                    k0.D(5, arr_b);
                }
                byte[] arr_b1 = androidx.work.d.n(u0.f);
                if(arr_b1 == null) {
                    k0.P(6);
                }
                else {
                    k0.D(6, arr_b1);
                }
                k0.x(7, u0.g);
                k0.x(8, u0.h);
                k0.x(9, u0.i);
                k0.x(10, ((long)u0.k));
                k0.x(11, ((long)B.a(u0.l)));
                k0.x(12, u0.m);
                k0.x(13, u0.n);
                k0.x(14, u0.o);
                k0.x(15, u0.p);
                k0.x(16, ((long)u0.q));
                k0.x(17, ((long)B.h(u0.r)));
                k0.x(18, ((long)u0.g()));
                k0.x(19, ((long)u0.f()));
                androidx.work.c c0 = u0.j;
                if(c0 != null) {
                    k0.x(20, ((long)B.g(c0.d())));
                    k0.x(21, ((long)c0.g()));
                    k0.x(22, ((long)c0.h()));
                    k0.x(23, ((long)c0.f()));
                    k0.x(24, ((long)c0.i()));
                    k0.x(25, c0.b());
                    k0.x(26, c0.a());
                    byte[] arr_b2 = B.i(c0.c());
                    if(arr_b2 == null) {
                        k0.P(27);
                        return;
                    }
                    k0.D(27, arr_b2);
                    return;
                }
                k0.P(20);
                k0.P(21);
                k0.P(22);
                k0.P(23);
                k0.P(24);
                k0.P(25);
                k0.P(26);
                k0.P(27);
            }
        }


        class f extends h {
            final w d;

            f(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }
        }


        class g extends A {
            final w d;

            g(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "DELETE FROM workspec WHERE id=?";
            }
        }


        class x0.w.h extends A {
            final w d;

            x0.w.h(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "UPDATE workspec SET state=? WHERE id=?";
            }
        }


        class x0.w.i extends A {
            final w d;

            x0.w.i(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            }
        }


        class j extends A {
            final w d;

            j(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        }


        class x0.w.k extends A {
            final w d;

            x0.w.k(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            }
        }


        class l extends A {
            final w d;

            l(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        }


        class m extends A {
            final w d;

            m(u u0) {
                super(u0);
            }

            @Override  // g0.A
            public String e() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        }

        this.a = u0;
        this.b = new e(this, u0);
        this.c = new f(this, u0);
        this.d = new g(this, u0);
        this.e = new x0.w.h(this, u0);
        this.f = new x0.w.i(this, u0);
        this.g = new j(this, u0);
        this.h = new x0.w.k(this, u0);
        this.i = new l(this, u0);
        this.j = new m(this, u0);
        this.k = new a(this, u0);
        this.l = new b(this, u0);
        this.m = new c(this, u0);
        this.n = new d(this, u0);
    }

    @Override  // x0.v
    public void a(String s) {
        this.a.d();
        k k0 = this.d.b();
        if(s == null) {
            k0.P(1);
        }
        else {
            k0.l(1, s);
        }
        this.a.e();
        try {
            k0.m();
            this.a.A();
        }
        finally {
            this.a.i();
            this.d.h(k0);
        }
    }

    @Override  // x0.v
    public void b(String s) {
        this.a.d();
        k k0 = this.f.b();
        if(s == null) {
            k0.P(1);
        }
        else {
            k0.l(1, s);
        }
        this.a.e();
        try {
            k0.m();
            this.a.A();
        }
        finally {
            this.a.i();
            this.f.h(k0);
        }
    }

    @Override  // x0.v
    public int c(String s, long v) {
        this.a.d();
        k k0 = this.k.b();
        k0.x(1, v);
        if(s == null) {
            k0.P(2);
        }
        else {
            k0.l(2, s);
        }
        this.a.e();
        try {
            int v2 = k0.m();
            this.a.A();
            return v2;
        }
        finally {
            this.a.i();
            this.k.h(k0);
        }
    }

    @Override  // x0.v
    public List d(String s) {
        x x0 = x.f("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if(s == null) {
            x0.P(1);
        }
        else {
            x0.l(1, s);
        }
        this.a.d();
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                list0.add(new x0.u.b((cursor0.isNull(0) ? null : cursor0.getString(0)), B.f(cursor0.getInt(1))));
            }
            return list0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.v
    public List e(long v) {
        x x0 = x.f("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        x0.x(1, v);
        this.a.d();
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            int v2 = i0.a.e(cursor0, "id");
            int v3 = i0.a.e(cursor0, "state");
            int v4 = i0.a.e(cursor0, "worker_class_name");
            int v5 = i0.a.e(cursor0, "input_merger_class_name");
            int v6 = i0.a.e(cursor0, "input");
            int v7 = i0.a.e(cursor0, "output");
            int v8 = i0.a.e(cursor0, "initial_delay");
            int v9 = i0.a.e(cursor0, "interval_duration");
            int v10 = i0.a.e(cursor0, "flex_duration");
            int v11 = i0.a.e(cursor0, "run_attempt_count");
            int v12 = i0.a.e(cursor0, "backoff_policy");
            int v13 = i0.a.e(cursor0, "backoff_delay_duration");
            int v14 = i0.a.e(cursor0, "last_enqueue_time");
            int v15 = i0.a.e(cursor0, "minimum_retention_duration");
            int v16 = i0.a.e(cursor0, "schedule_requested_at");
            int v17 = i0.a.e(cursor0, "run_in_foreground");
            int v18 = i0.a.e(cursor0, "out_of_quota_policy");
            int v19 = i0.a.e(cursor0, "period_count");
            int v20 = i0.a.e(cursor0, "generation");
            int v21 = i0.a.e(cursor0, "required_network_type");
            int v22 = i0.a.e(cursor0, "requires_charging");
            int v23 = i0.a.e(cursor0, "requires_device_idle");
            int v24 = i0.a.e(cursor0, "requires_battery_not_low");
            int v25 = i0.a.e(cursor0, "requires_storage_not_low");
            int v26 = i0.a.e(cursor0, "trigger_content_update_delay");
            int v27 = i0.a.e(cursor0, "trigger_max_content_delay");
            int v28 = i0.a.e(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.isNull(v2) ? null : cursor0.getString(v2);
                t t0 = B.f(cursor0.getInt(v3));
                String s1 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                String s2 = cursor0.isNull(v5) ? null : cursor0.getString(v5);
                androidx.work.d d0 = androidx.work.d.g((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                androidx.work.d d1 = androidx.work.d.g((cursor0.isNull(v7) ? null : cursor0.getBlob(v7)));
                long v29 = cursor0.getLong(v8);
                long v30 = cursor0.getLong(v9);
                long v31 = cursor0.getLong(v10);
                int v32 = cursor0.getInt(v11);
                androidx.work.a a0 = B.c(cursor0.getInt(v12));
                long v33 = cursor0.getLong(v13);
                long v34 = cursor0.getLong(v14);
                long v35 = cursor0.getLong(v15);
                long v36 = cursor0.getLong(v16);
                boolean z = cursor0.getInt(v17) != 0;
                o o0 = B.e(cursor0.getInt(v18));
                int v37 = cursor0.getInt(v19);
                int v38 = cursor0.getInt(v20);
                list0.add(new x0.u(s, t0, s1, s2, d0, d1, v29, v30, v31, new androidx.work.c(B.d(cursor0.getInt(v21)), cursor0.getInt(v22) != 0, cursor0.getInt(v23) != 0, cursor0.getInt(v24) != 0, cursor0.getInt(v25) != 0, cursor0.getLong(v26), cursor0.getLong(v27), B.b((cursor0.isNull(v28) ? null : cursor0.getBlob(v28)))), v32, a0, v33, v34, v35, v36, z, o0, v37, v38));
            }
            return list0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.v
    public void f(x0.u u0) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(u0);
            this.a.A();
        }
        finally {
            this.a.i();
        }
    }

    @Override  // x0.v
    public List g(int v) {
        x x0 = x.f("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        x0.x(1, ((long)v));
        this.a.d();
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            int v2 = i0.a.e(cursor0, "id");
            int v3 = i0.a.e(cursor0, "state");
            int v4 = i0.a.e(cursor0, "worker_class_name");
            int v5 = i0.a.e(cursor0, "input_merger_class_name");
            int v6 = i0.a.e(cursor0, "input");
            int v7 = i0.a.e(cursor0, "output");
            int v8 = i0.a.e(cursor0, "initial_delay");
            int v9 = i0.a.e(cursor0, "interval_duration");
            int v10 = i0.a.e(cursor0, "flex_duration");
            int v11 = i0.a.e(cursor0, "run_attempt_count");
            int v12 = i0.a.e(cursor0, "backoff_policy");
            int v13 = i0.a.e(cursor0, "backoff_delay_duration");
            int v14 = i0.a.e(cursor0, "last_enqueue_time");
            int v15 = i0.a.e(cursor0, "minimum_retention_duration");
            int v16 = i0.a.e(cursor0, "schedule_requested_at");
            int v17 = i0.a.e(cursor0, "run_in_foreground");
            int v18 = i0.a.e(cursor0, "out_of_quota_policy");
            int v19 = i0.a.e(cursor0, "period_count");
            int v20 = i0.a.e(cursor0, "generation");
            int v21 = i0.a.e(cursor0, "required_network_type");
            int v22 = i0.a.e(cursor0, "requires_charging");
            int v23 = i0.a.e(cursor0, "requires_device_idle");
            int v24 = i0.a.e(cursor0, "requires_battery_not_low");
            int v25 = i0.a.e(cursor0, "requires_storage_not_low");
            int v26 = i0.a.e(cursor0, "trigger_content_update_delay");
            int v27 = i0.a.e(cursor0, "trigger_max_content_delay");
            int v28 = i0.a.e(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.isNull(v2) ? null : cursor0.getString(v2);
                t t0 = B.f(cursor0.getInt(v3));
                String s1 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                String s2 = cursor0.isNull(v5) ? null : cursor0.getString(v5);
                androidx.work.d d0 = androidx.work.d.g((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                androidx.work.d d1 = androidx.work.d.g((cursor0.isNull(v7) ? null : cursor0.getBlob(v7)));
                long v29 = cursor0.getLong(v8);
                long v30 = cursor0.getLong(v9);
                long v31 = cursor0.getLong(v10);
                int v32 = cursor0.getInt(v11);
                androidx.work.a a0 = B.c(cursor0.getInt(v12));
                long v33 = cursor0.getLong(v13);
                long v34 = cursor0.getLong(v14);
                long v35 = cursor0.getLong(v15);
                long v36 = cursor0.getLong(v16);
                boolean z = cursor0.getInt(v17) != 0;
                o o0 = B.e(cursor0.getInt(v18));
                int v37 = cursor0.getInt(v19);
                int v38 = cursor0.getInt(v20);
                list0.add(new x0.u(s, t0, s1, s2, d0, d1, v29, v30, v31, new androidx.work.c(B.d(cursor0.getInt(v21)), cursor0.getInt(v22) != 0, cursor0.getInt(v23) != 0, cursor0.getInt(v24) != 0, cursor0.getInt(v25) != 0, cursor0.getLong(v26), cursor0.getLong(v27), B.b((cursor0.isNull(v28) ? null : cursor0.getBlob(v28)))), v32, a0, v33, v34, v35, v36, z, o0, v37, v38));
            }
            return list0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.v
    public int h(t t0, String s) {
        this.a.d();
        k k0 = this.e.b();
        k0.x(1, ((long)B.j(t0)));
        if(s == null) {
            k0.P(2);
        }
        else {
            k0.l(2, s);
        }
        this.a.e();
        try {
            int v1 = k0.m();
            this.a.A();
            return v1;
        }
        finally {
            this.a.i();
            this.e.h(k0);
        }
    }

    @Override  // x0.v
    public List i() {
        x x0 = x.f("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.d();
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            int v1 = i0.a.e(cursor0, "id");
            int v2 = i0.a.e(cursor0, "state");
            int v3 = i0.a.e(cursor0, "worker_class_name");
            int v4 = i0.a.e(cursor0, "input_merger_class_name");
            int v5 = i0.a.e(cursor0, "input");
            int v6 = i0.a.e(cursor0, "output");
            int v7 = i0.a.e(cursor0, "initial_delay");
            int v8 = i0.a.e(cursor0, "interval_duration");
            int v9 = i0.a.e(cursor0, "flex_duration");
            int v10 = i0.a.e(cursor0, "run_attempt_count");
            int v11 = i0.a.e(cursor0, "backoff_policy");
            int v12 = i0.a.e(cursor0, "backoff_delay_duration");
            int v13 = i0.a.e(cursor0, "last_enqueue_time");
            int v14 = i0.a.e(cursor0, "minimum_retention_duration");
            int v15 = i0.a.e(cursor0, "schedule_requested_at");
            int v16 = i0.a.e(cursor0, "run_in_foreground");
            int v17 = i0.a.e(cursor0, "out_of_quota_policy");
            int v18 = i0.a.e(cursor0, "period_count");
            int v19 = i0.a.e(cursor0, "generation");
            int v20 = i0.a.e(cursor0, "required_network_type");
            int v21 = i0.a.e(cursor0, "requires_charging");
            int v22 = i0.a.e(cursor0, "requires_device_idle");
            int v23 = i0.a.e(cursor0, "requires_battery_not_low");
            int v24 = i0.a.e(cursor0, "requires_storage_not_low");
            int v25 = i0.a.e(cursor0, "trigger_content_update_delay");
            int v26 = i0.a.e(cursor0, "trigger_max_content_delay");
            int v27 = i0.a.e(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.isNull(v1) ? null : cursor0.getString(v1);
                t t0 = B.f(cursor0.getInt(v2));
                String s1 = cursor0.isNull(v3) ? null : cursor0.getString(v3);
                String s2 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                androidx.work.d d0 = androidx.work.d.g((cursor0.isNull(v5) ? null : cursor0.getBlob(v5)));
                androidx.work.d d1 = androidx.work.d.g((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                long v28 = cursor0.getLong(v7);
                long v29 = cursor0.getLong(v8);
                long v30 = cursor0.getLong(v9);
                int v31 = cursor0.getInt(v10);
                androidx.work.a a0 = B.c(cursor0.getInt(v11));
                long v32 = cursor0.getLong(v12);
                long v33 = cursor0.getLong(v13);
                long v34 = cursor0.getLong(v14);
                long v35 = cursor0.getLong(v15);
                boolean z = cursor0.getInt(v16) != 0;
                o o0 = B.e(cursor0.getInt(v17));
                int v36 = cursor0.getInt(v18);
                int v37 = cursor0.getInt(v19);
                list0.add(new x0.u(s, t0, s1, s2, d0, d1, v28, v29, v30, new androidx.work.c(B.d(cursor0.getInt(v20)), cursor0.getInt(v21) != 0, cursor0.getInt(v22) != 0, cursor0.getInt(v23) != 0, cursor0.getInt(v24) != 0, cursor0.getLong(v25), cursor0.getLong(v26), B.b((cursor0.isNull(v27) ? null : cursor0.getBlob(v27)))), v31, a0, v32, v33, v34, v35, z, o0, v36, v37));
            }
            return list0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.v
    public void j(String s, androidx.work.d d0) {
        this.a.d();
        k k0 = this.g.b();
        byte[] arr_b = androidx.work.d.n(d0);
        if(arr_b == null) {
            k0.P(1);
        }
        else {
            k0.D(1, arr_b);
        }
        if(s == null) {
            k0.P(2);
        }
        else {
            k0.l(2, s);
        }
        this.a.e();
        try {
            k0.m();
            this.a.A();
        }
        finally {
            this.a.i();
            this.g.h(k0);
        }
    }

    @Override  // x0.v
    public List k() {
        x x0 = x.f("SELECT * FROM workspec WHERE state=1", 0);
        this.a.d();
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            int v1 = i0.a.e(cursor0, "id");
            int v2 = i0.a.e(cursor0, "state");
            int v3 = i0.a.e(cursor0, "worker_class_name");
            int v4 = i0.a.e(cursor0, "input_merger_class_name");
            int v5 = i0.a.e(cursor0, "input");
            int v6 = i0.a.e(cursor0, "output");
            int v7 = i0.a.e(cursor0, "initial_delay");
            int v8 = i0.a.e(cursor0, "interval_duration");
            int v9 = i0.a.e(cursor0, "flex_duration");
            int v10 = i0.a.e(cursor0, "run_attempt_count");
            int v11 = i0.a.e(cursor0, "backoff_policy");
            int v12 = i0.a.e(cursor0, "backoff_delay_duration");
            int v13 = i0.a.e(cursor0, "last_enqueue_time");
            int v14 = i0.a.e(cursor0, "minimum_retention_duration");
            int v15 = i0.a.e(cursor0, "schedule_requested_at");
            int v16 = i0.a.e(cursor0, "run_in_foreground");
            int v17 = i0.a.e(cursor0, "out_of_quota_policy");
            int v18 = i0.a.e(cursor0, "period_count");
            int v19 = i0.a.e(cursor0, "generation");
            int v20 = i0.a.e(cursor0, "required_network_type");
            int v21 = i0.a.e(cursor0, "requires_charging");
            int v22 = i0.a.e(cursor0, "requires_device_idle");
            int v23 = i0.a.e(cursor0, "requires_battery_not_low");
            int v24 = i0.a.e(cursor0, "requires_storage_not_low");
            int v25 = i0.a.e(cursor0, "trigger_content_update_delay");
            int v26 = i0.a.e(cursor0, "trigger_max_content_delay");
            int v27 = i0.a.e(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.isNull(v1) ? null : cursor0.getString(v1);
                t t0 = B.f(cursor0.getInt(v2));
                String s1 = cursor0.isNull(v3) ? null : cursor0.getString(v3);
                String s2 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                androidx.work.d d0 = androidx.work.d.g((cursor0.isNull(v5) ? null : cursor0.getBlob(v5)));
                androidx.work.d d1 = androidx.work.d.g((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                long v28 = cursor0.getLong(v7);
                long v29 = cursor0.getLong(v8);
                long v30 = cursor0.getLong(v9);
                int v31 = cursor0.getInt(v10);
                androidx.work.a a0 = B.c(cursor0.getInt(v11));
                long v32 = cursor0.getLong(v12);
                long v33 = cursor0.getLong(v13);
                long v34 = cursor0.getLong(v14);
                long v35 = cursor0.getLong(v15);
                boolean z = cursor0.getInt(v16) != 0;
                o o0 = B.e(cursor0.getInt(v17));
                int v36 = cursor0.getInt(v18);
                int v37 = cursor0.getInt(v19);
                list0.add(new x0.u(s, t0, s1, s2, d0, d1, v28, v29, v30, new androidx.work.c(B.d(cursor0.getInt(v20)), cursor0.getInt(v21) != 0, cursor0.getInt(v22) != 0, cursor0.getInt(v23) != 0, cursor0.getInt(v24) != 0, cursor0.getLong(v25), cursor0.getLong(v26), B.b((cursor0.isNull(v27) ? null : cursor0.getBlob(v27)))), v31, a0, v32, v33, v34, v35, z, o0, v36, v37));
            }
            return list0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.v
    public boolean l() {
        boolean z = false;
        x x0 = x.f("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.a.d();
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            if(cursor0.moveToFirst() && cursor0.getInt(0) != 0) {
                z = true;
            }
            return z;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.v
    public List m(String s) {
        x x0 = x.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if(s == null) {
            x0.P(1);
        }
        else {
            x0.l(1, s);
        }
        this.a.d();
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                list0.add((cursor0.isNull(0) ? null : cursor0.getString(0)));
            }
            return list0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.v
    public t n(String s) {
        x x0 = x.f("SELECT state FROM workspec WHERE id=?", 1);
        if(s == null) {
            x0.P(1);
        }
        else {
            x0.l(1, s);
        }
        this.a.d();
        t t0 = null;
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            if(cursor0.moveToFirst()) {
                Integer integer0 = cursor0.isNull(0) ? null : cursor0.getInt(0);
                if(integer0 != null) {
                    t0 = B.f(((int)integer0));
                }
            }
            return t0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.v
    public x0.u o(String s) {
        x0.u u0;
        boolean z4;
        int v42;
        boolean z3;
        int v41;
        boolean z2;
        int v40;
        boolean z1;
        int v39;
        boolean z;
        int v36;
        x x0 = x.f("SELECT * FROM workspec WHERE id=?", 1);
        if(s == null) {
            x0.P(1);
        }
        else {
            x0.l(1, s);
        }
        this.a.d();
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            int v1 = i0.a.e(cursor0, "id");
            int v2 = i0.a.e(cursor0, "state");
            int v3 = i0.a.e(cursor0, "worker_class_name");
            int v4 = i0.a.e(cursor0, "input_merger_class_name");
            int v5 = i0.a.e(cursor0, "input");
            int v6 = i0.a.e(cursor0, "output");
            int v7 = i0.a.e(cursor0, "initial_delay");
            int v8 = i0.a.e(cursor0, "interval_duration");
            int v9 = i0.a.e(cursor0, "flex_duration");
            int v10 = i0.a.e(cursor0, "run_attempt_count");
            int v11 = i0.a.e(cursor0, "backoff_policy");
            int v12 = i0.a.e(cursor0, "backoff_delay_duration");
            int v13 = i0.a.e(cursor0, "last_enqueue_time");
            int v14 = i0.a.e(cursor0, "minimum_retention_duration");
            int v15 = i0.a.e(cursor0, "schedule_requested_at");
            int v16 = i0.a.e(cursor0, "run_in_foreground");
            int v17 = i0.a.e(cursor0, "out_of_quota_policy");
            int v18 = i0.a.e(cursor0, "period_count");
            int v19 = i0.a.e(cursor0, "generation");
            int v20 = i0.a.e(cursor0, "required_network_type");
            int v21 = i0.a.e(cursor0, "requires_charging");
            int v22 = i0.a.e(cursor0, "requires_device_idle");
            int v23 = i0.a.e(cursor0, "requires_battery_not_low");
            int v24 = i0.a.e(cursor0, "requires_storage_not_low");
            int v25 = i0.a.e(cursor0, "trigger_content_update_delay");
            int v26 = i0.a.e(cursor0, "trigger_max_content_delay");
            int v27 = i0.a.e(cursor0, "content_uri_triggers");
            if(cursor0.moveToFirst()) {
                String s1 = cursor0.isNull(v1) ? null : cursor0.getString(v1);
                t t0 = B.f(cursor0.getInt(v2));
                String s2 = cursor0.isNull(v3) ? null : cursor0.getString(v3);
                String s3 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                androidx.work.d d0 = androidx.work.d.g((cursor0.isNull(v5) ? null : cursor0.getBlob(v5)));
                androidx.work.d d1 = androidx.work.d.g((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                long v28 = cursor0.getLong(v7);
                long v29 = cursor0.getLong(v8);
                long v30 = cursor0.getLong(v9);
                int v31 = cursor0.getInt(v10);
                androidx.work.a a0 = B.c(cursor0.getInt(v11));
                long v32 = cursor0.getLong(v12);
                long v33 = cursor0.getLong(v13);
                long v34 = cursor0.getLong(v14);
                long v35 = cursor0.getLong(v15);
                if(cursor0.getInt(v16) == 0) {
                    v36 = v17;
                    z = false;
                }
                else {
                    v36 = v17;
                    z = true;
                }
                o o0 = B.e(cursor0.getInt(v36));
                int v37 = cursor0.getInt(v18);
                int v38 = cursor0.getInt(v19);
                androidx.work.l l0 = B.d(cursor0.getInt(v20));
                if(cursor0.getInt(v21) == 0) {
                    v39 = v22;
                    z1 = false;
                }
                else {
                    v39 = v22;
                    z1 = true;
                }
                if(cursor0.getInt(v39) == 0) {
                    v40 = v23;
                    z2 = false;
                }
                else {
                    v40 = v23;
                    z2 = true;
                }
                if(cursor0.getInt(v40) == 0) {
                    v41 = v24;
                    z3 = false;
                }
                else {
                    v41 = v24;
                    z3 = true;
                }
                if(cursor0.getInt(v41) == 0) {
                    v42 = v25;
                    z4 = false;
                }
                else {
                    v42 = v25;
                    z4 = true;
                }
                u0 = new x0.u(s1, t0, s2, s3, d0, d1, v28, v29, v30, new androidx.work.c(l0, z1, z2, z3, z4, cursor0.getLong(v42), cursor0.getLong(v26), B.b((cursor0.isNull(v27) ? null : cursor0.getBlob(v27)))), v31, a0, v32, v33, v34, v35, z, o0, v37, v38);
            }
            else {
                u0 = null;
            }
            return u0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.v
    public int p(String s) {
        this.a.d();
        k k0 = this.j.b();
        if(s == null) {
            k0.P(1);
        }
        else {
            k0.l(1, s);
        }
        this.a.e();
        try {
            int v1 = k0.m();
            this.a.A();
            return v1;
        }
        finally {
            this.a.i();
            this.j.h(k0);
        }
    }

    @Override  // x0.v
    public void q(String s, long v) {
        this.a.d();
        k k0 = this.h.b();
        k0.x(1, v);
        if(s == null) {
            k0.P(2);
        }
        else {
            k0.l(2, s);
        }
        this.a.e();
        try {
            k0.m();
            this.a.A();
        }
        finally {
            this.a.i();
            this.h.h(k0);
        }
    }

    @Override  // x0.v
    public List r(String s) {
        x x0 = x.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if(s == null) {
            x0.P(1);
        }
        else {
            x0.l(1, s);
        }
        this.a.d();
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                list0.add((cursor0.isNull(0) ? null : cursor0.getString(0)));
            }
            return list0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.v
    public List s(String s) {
        x x0 = x.f("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if(s == null) {
            x0.P(1);
        }
        else {
            x0.l(1, s);
        }
        this.a.d();
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                list0.add(androidx.work.d.g((cursor0.isNull(0) ? null : cursor0.getBlob(0))));
            }
            return list0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.v
    public int t(String s) {
        this.a.d();
        k k0 = this.i.b();
        if(s == null) {
            k0.P(1);
        }
        else {
            k0.l(1, s);
        }
        this.a.e();
        try {
            int v1 = k0.m();
            this.a.A();
            return v1;
        }
        finally {
            this.a.i();
            this.i.h(k0);
        }
    }

    @Override  // x0.v
    public List u(int v) {
        x x0 = x.f("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        x0.x(1, ((long)v));
        this.a.d();
        Cursor cursor0 = i0.b.b(this.a, x0, false, null);
        try {
            int v2 = i0.a.e(cursor0, "id");
            int v3 = i0.a.e(cursor0, "state");
            int v4 = i0.a.e(cursor0, "worker_class_name");
            int v5 = i0.a.e(cursor0, "input_merger_class_name");
            int v6 = i0.a.e(cursor0, "input");
            int v7 = i0.a.e(cursor0, "output");
            int v8 = i0.a.e(cursor0, "initial_delay");
            int v9 = i0.a.e(cursor0, "interval_duration");
            int v10 = i0.a.e(cursor0, "flex_duration");
            int v11 = i0.a.e(cursor0, "run_attempt_count");
            int v12 = i0.a.e(cursor0, "backoff_policy");
            int v13 = i0.a.e(cursor0, "backoff_delay_duration");
            int v14 = i0.a.e(cursor0, "last_enqueue_time");
            int v15 = i0.a.e(cursor0, "minimum_retention_duration");
            int v16 = i0.a.e(cursor0, "schedule_requested_at");
            int v17 = i0.a.e(cursor0, "run_in_foreground");
            int v18 = i0.a.e(cursor0, "out_of_quota_policy");
            int v19 = i0.a.e(cursor0, "period_count");
            int v20 = i0.a.e(cursor0, "generation");
            int v21 = i0.a.e(cursor0, "required_network_type");
            int v22 = i0.a.e(cursor0, "requires_charging");
            int v23 = i0.a.e(cursor0, "requires_device_idle");
            int v24 = i0.a.e(cursor0, "requires_battery_not_low");
            int v25 = i0.a.e(cursor0, "requires_storage_not_low");
            int v26 = i0.a.e(cursor0, "trigger_content_update_delay");
            int v27 = i0.a.e(cursor0, "trigger_max_content_delay");
            int v28 = i0.a.e(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.isNull(v2) ? null : cursor0.getString(v2);
                t t0 = B.f(cursor0.getInt(v3));
                String s1 = cursor0.isNull(v4) ? null : cursor0.getString(v4);
                String s2 = cursor0.isNull(v5) ? null : cursor0.getString(v5);
                androidx.work.d d0 = androidx.work.d.g((cursor0.isNull(v6) ? null : cursor0.getBlob(v6)));
                androidx.work.d d1 = androidx.work.d.g((cursor0.isNull(v7) ? null : cursor0.getBlob(v7)));
                long v29 = cursor0.getLong(v8);
                long v30 = cursor0.getLong(v9);
                long v31 = cursor0.getLong(v10);
                int v32 = cursor0.getInt(v11);
                androidx.work.a a0 = B.c(cursor0.getInt(v12));
                long v33 = cursor0.getLong(v13);
                long v34 = cursor0.getLong(v14);
                long v35 = cursor0.getLong(v15);
                long v36 = cursor0.getLong(v16);
                boolean z = cursor0.getInt(v17) != 0;
                o o0 = B.e(cursor0.getInt(v18));
                int v37 = cursor0.getInt(v19);
                int v38 = cursor0.getInt(v20);
                list0.add(new x0.u(s, t0, s1, s2, d0, d1, v29, v30, v31, new androidx.work.c(B.d(cursor0.getInt(v21)), cursor0.getInt(v22) != 0, cursor0.getInt(v23) != 0, cursor0.getInt(v24) != 0, cursor0.getInt(v25) != 0, cursor0.getLong(v26), cursor0.getLong(v27), B.b((cursor0.isNull(v28) ? null : cursor0.getBlob(v28)))), v32, a0, v33, v34, v35, v36, z, o0, v37, v38));
            }
            return list0;
        }
        finally {
            cursor0.close();
            x0.release();
        }
    }

    @Override  // x0.v
    public int v() {
        this.a.d();
        k k0 = this.l.b();
        this.a.e();
        try {
            int v1 = k0.m();
            this.a.A();
            return v1;
        }
        finally {
            this.a.i();
            this.l.h(k0);
        }
    }

    public static List w() {
        return Collections.emptyList();
    }
}

