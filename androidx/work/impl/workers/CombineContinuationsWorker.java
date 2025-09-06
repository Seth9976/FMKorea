package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.j.a;
import z3.k;

public final class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context0, WorkerParameters workerParameters0) {
        k.e(context0, "context");
        k.e(workerParameters0, "workerParams");
        super(context0, workerParameters0);
    }

    @Override  // androidx.work.Worker
    public a doWork() {
        a j$a0 = a.d(this.getInputData());
        k.d(j$a0, "success(inputData)");
        return j$a0;
    }
}

