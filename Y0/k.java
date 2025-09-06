package y0;

import androidx.work.impl.WorkDatabase;

public final class k {
    private final WorkDatabase a;

    public k(WorkDatabase workDatabase0) {
        z3.k.e(workDatabase0, "workDatabase");
        super();
        this.a = workDatabase0;
    }

    // 检测为 Lambda 实现
    public static Integer a(k k0, int v, int v1) [...]

    // 检测为 Lambda 实现
    public static Integer b(k k0) [...]

    public final int c() {
        i i0 = () -> k.d(this);
        Object object0 = this.a.z(i0);
        z3.k.d(object0, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number)object0).intValue();
    }

    private static final Integer d(k k0) {
        z3.k.e(k0, "this$0");
        return l.a(k0.a, "next_alarm_manager_id");
    }

    public final int e(int v, int v1) {
        j j0 = () -> k.f(this, v, v1);
        Object object0 = this.a.z(j0);
        z3.k.d(object0, "workDatabase.runInTransa…            id\n        })");
        return ((Number)object0).intValue();
    }

    private static final Integer f(k k0, int v, int v1) {
        z3.k.e(k0, "this$0");
        int v2 = l.a(k0.a, "next_job_scheduler_id");
        if(v <= v2 && v2 <= v1) {
            return v2;
        }
        l.b(k0.a, "next_job_scheduler_id", v + 1);
        return v;
    }
}

