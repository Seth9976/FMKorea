package androidx.work.impl.workers;

import Z1.d;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.F;
import androidx.work.j;
import java.util.List;
import u0.c;
import u0.e;
import w0.o;
import x0.u;
import x0.v;
import z3.k;

public final class ConstraintTrackingWorker extends j implements c {
    private final WorkerParameters f;
    private final Object g;
    private volatile boolean h;
    private final androidx.work.impl.utils.futures.c i;
    private j j;

    public ConstraintTrackingWorker(Context context0, WorkerParameters workerParameters0) {
        k.e(context0, "appContext");
        k.e(workerParameters0, "workerParameters");
        super(context0, workerParameters0);
        this.f = workerParameters0;
        this.g = new Object();
        this.i = androidx.work.impl.utils.futures.c.s();
    }

    @Override  // u0.c
    public void a(List list0) {
        k.e(list0, "workSpecs");
        androidx.work.k.e().a("WM-ConstraintTrkngWrkr", "Constraints changed for " + list0);
        synchronized(this.g) {
            this.h = true;
        }
    }

    private final void d() {
        if(this.i.isCancelled()) {
            return;
        }
        String s = this.getInputData().l("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        androidx.work.k k0 = androidx.work.k.e();
        k.d(k0, "get()");
        if(s != null && s.length() != 0) {
            j j0 = this.getWorkerFactory().b(this.getApplicationContext(), s, this.f);
            this.j = j0;
            if(j0 == null) {
                k0.a("WM-ConstraintTrkngWrkr", "No worker to delegate to.");
                k.d(this.i, "future");
                A0.c.d(this.i);
                return;
            }
            F f0 = F.m(this.getApplicationContext());
            k.d(f0, "getInstance(applicationContext)");
            v v0 = f0.r().I();
            String s1 = this.getId().toString();
            k.d(s1, "id.toString()");
            u u0 = v0.o(s1);
            if(u0 == null) {
                k.d(this.i, "future");
                A0.c.d(this.i);
                return;
            }
            o o0 = f0.q();
            k.d(o0, "workManagerImpl.trackers");
            e e0 = new e(o0, this);
            e0.a(m3.o.e(u0));
            String s2 = this.getId().toString();
            k.d(s2, "id.toString()");
            if(e0.e(s2)) {
                k0.a("WM-ConstraintTrkngWrkr", "Constraints met for delegate " + s);
                try {
                    j j1 = this.j;
                    k.b(j1);
                    d d0 = j1.startWork();
                    k.d(d0, "delegate!!.startWork()");
                    d0.addListener(() -> {
                        k.e(this, "this$0");
                        k.e(d0, "$innerFuture");
                        synchronized(this.g) {
                            if(this.h) {
                                k.d(this.i, "future");
                                A0.c.e(this.i);
                            }
                            else {
                                this.i.q(d0);
                            }
                        }
                    }, this.getBackgroundExecutor());
                }
                catch(Throwable throwable0) {
                    k0.b("WM-ConstraintTrkngWrkr", "Delegated worker " + s + " threw exception in startWork.", throwable0);
                    synchronized(this.g) {
                        if(this.h) {
                            k0.a("WM-ConstraintTrkngWrkr", "Constraints were unmet, Retrying.");
                            k.d(this.i, "future");
                            A0.c.e(this.i);
                        }
                        else {
                            k.d(this.i, "future");
                            A0.c.d(this.i);
                        }
                    }
                }
                return;
            }
            k0.a("WM-ConstraintTrkngWrkr", "Constraints not met for delegate " + s + ". Requesting retry.");
            k.d(this.i, "future");
            A0.c.e(this.i);
            return;
        }
        k0.c("WM-ConstraintTrkngWrkr", "No worker to delegate to.");
        k.d(this.i, "future");
        A0.c.d(this.i);
    }

    @Override  // u0.c
    public void e(List list0) {
        k.e(list0, "workSpecs");
    }

    // 检测为 Lambda 实现
    private static final void f(ConstraintTrackingWorker constraintTrackingWorker0, d d0) [...]

    // 检测为 Lambda 实现
    private static final void g(ConstraintTrackingWorker constraintTrackingWorker0) [...]

    @Override  // androidx.work.j
    public void onStopped() {
        super.onStopped();
        j j0 = this.j;
        if(j0 != null && !j0.isStopped()) {
            j0.stop();
        }
    }

    @Override  // androidx.work.j
    public d startWork() {
        this.getBackgroundExecutor().execute(() -> {
            k.e(this, "this$0");
            this.d();
        });
        k.d(this.i, "future");
        return this.i;
    }
}

