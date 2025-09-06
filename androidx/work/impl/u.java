package androidx.work.impl;

import android.content.Context;
import androidx.work.b;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.background.systemjob.l;
import androidx.work.k;
import java.util.List;
import x0.v;
import y0.q;

public abstract class u {
    private static final String a;

    static {
        u.a = "WM-Schedulers";
    }

    static t a(Context context0, F f0) {
        t t0 = new l(context0, f0);
        q.a(context0, SystemJobService.class, true);
        k.e().a("WM-Schedulers", "Created SystemJobScheduler and enabled SystemJobService");
        return t0;
    }

    public static void b(b b0, WorkDatabase workDatabase0, List list0) {
        List list2;
        List list1;
        if(list0 != null && list0.size() != 0) {
            v v0 = workDatabase0.I();
            workDatabase0.e();
            try {
                list1 = v0.g(b0.h());
                list2 = v0.u(200);
                if(list1 != null && list1.size() > 0) {
                    long v2 = System.currentTimeMillis();
                    for(Object object0: list1) {
                        v0.c(((x0.u)object0).a, v2);
                    }
                }
                workDatabase0.A();
            }
            finally {
                workDatabase0.i();
            }
            if(list1 != null && list1.size() > 0) {
                x0.u[] arr_u = (x0.u[])list1.toArray(new x0.u[list1.size()]);
                for(Object object1: list0) {
                    t t0 = (t)object1;
                    if(t0.b()) {
                        t0.d(arr_u);
                    }
                }
            }
            if(list2 != null && list2.size() > 0) {
                x0.u[] arr_u1 = (x0.u[])list2.toArray(new x0.u[list2.size()]);
                for(Object object2: list0) {
                    t t1 = (t)object2;
                    if(!t1.b()) {
                        t1.d(arr_u1);
                    }
                }
            }
        }
    }
}

