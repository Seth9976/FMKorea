package androidx.work.impl.workers;

import A0.d;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.F;
import androidx.work.impl.WorkDatabase;
import androidx.work.j.a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import x0.j;
import x0.o;
import x0.v;
import x0.z;
import z3.k;

public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context0, WorkerParameters workerParameters0) {
        k.e(context0, "context");
        k.e(workerParameters0, "parameters");
        super(context0, workerParameters0);
    }

    @Override  // androidx.work.Worker
    public a doWork() {
        F f0 = F.m(this.getApplicationContext());
        k.d(f0, "getInstance(applicationContext)");
        WorkDatabase workDatabase0 = f0.r();
        k.d(workDatabase0, "workManager.workDatabase");
        v v0 = workDatabase0.I();
        o o0 = workDatabase0.G();
        z z0 = workDatabase0.J();
        j j0 = workDatabase0.F();
        List list0 = v0.e(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List list1 = v0.k();
        List list2 = v0.u(200);
        if(!list0.isEmpty()) {
            androidx.work.k.e().f("WM-DiagnosticsWrkr", "Recently completed work:\n\n");
            androidx.work.k.e().f("WM-DiagnosticsWrkr", d.d(o0, z0, j0, list0));
        }
        if(!list1.isEmpty()) {
            androidx.work.k.e().f("WM-DiagnosticsWrkr", "Running work:\n\n");
            androidx.work.k.e().f("WM-DiagnosticsWrkr", d.d(o0, z0, j0, list1));
        }
        if(!list2.isEmpty()) {
            androidx.work.k.e().f("WM-DiagnosticsWrkr", "Enqueued work:\n\n");
            androidx.work.k.e().f("WM-DiagnosticsWrkr", d.d(o0, z0, j0, list2));
        }
        a j$a0 = a.c();
        k.d(j$a0, "success()");
        return j$a0;
    }
}

