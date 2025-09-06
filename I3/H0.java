package I3;

import N3.c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import p3.j;

public final class h0 extends g0 implements S {
    private final Executor i;

    public h0(Executor executor0) {
        this.i = executor0;
        c.a(this.i0());
    }

    @Override
    public void close() {
        Executor executor0 = this.i0();
        ExecutorService executorService0 = executor0 instanceof ExecutorService ? ((ExecutorService)executor0) : null;
        if(executorService0 != null) {
            executorService0.shutdown();
        }
    }

    @Override  // I3.F
    public void e0(j j0, Runnable runnable0) {
        try {
            this.i0().execute(runnable0);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            this.h0(j0, rejectedExecutionException0);
            W.b().e0(j0, runnable0);
        }
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof h0 && ((h0)object0).i0() == this.i0();
    }

    private final void h0(j j0, RejectedExecutionException rejectedExecutionException0) {
        u0.c(j0, f0.a("The task was rejected", rejectedExecutionException0));
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this.i0());
    }

    public Executor i0() {
        return this.i;
    }

    @Override  // I3.F
    public String toString() {
        return this.i0().toString();
    }
}

