package com.onesignal;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class q1 extends r0 {
    static class a extends c {
        private WeakReference f;

        a(Service service0) {
            this.f = new WeakReference(service0);
        }

        @Override  // com.onesignal.q1$c
        protected void a() {
            I1.a(C.k, "LegacySyncRunnable:Stopped");
            if(this.f.get() != null) {
                ((Service)this.f.get()).stopSelf();
            }
        }
    }

    static class b extends c {
        private WeakReference f;
        private JobParameters g;

        b(JobService jobService0, JobParameters jobParameters0) {
            this.f = new WeakReference(jobService0);
            this.g = jobParameters0;
        }

        @Override  // com.onesignal.q1$c
        protected void a() {
            I1.a(C.k, "LollipopSyncRunnable:JobFinished needsJobReschedule: " + q1.q().a);
            boolean z = q1.q().a;
            q1.q().a = false;
            if(this.f.get() != null) {
                ((JobService)this.f.get()).jobFinished(this.g, z);
            }
        }
    }

    static abstract class c implements Runnable {
        protected abstract void a();

        @Override
        public final void run() {
            class com.onesignal.q1.c.a implements com.onesignal.N.b {
                final BlockingQueue a;
                final c b;

                com.onesignal.q1.c.a(BlockingQueue blockingQueue0) {
                    this.a = blockingQueue0;
                    super();
                }

                @Override  // com.onesignal.N$b
                public void a(d n$d0) {
                    if(n$d0 == null) {
                        n$d0 = new Object();
                    }
                    this.a.offer(n$d0);
                }

                @Override  // com.onesignal.N$b
                public f getType() {
                    return f.h;
                }
            }

            synchronized(r0.c) {
                q1.q().d = 0L;
            }
            if(I1.L0() == null) {
                this.a();
                return;
            }
            I1.d = I1.z0();
            X1.l();
            try {
                ArrayBlockingQueue arrayBlockingQueue0 = new ArrayBlockingQueue(1);
                com.onesignal.q1.c.a q1$c$a0 = new com.onesignal.q1.c.a(this, arrayBlockingQueue0);
                N.g(I1.b, false, false, q1$c$a0);
                Object object0 = arrayBlockingQueue0.take();
                if(object0 instanceof d) {
                    X1.y(((d)object0));
                }
            }
            catch(InterruptedException interruptedException0) {
                interruptedException0.printStackTrace();
            }
            X1.w(true);
            I1.l0().d();
            this.a();
        }
    }

    private Long d;
    private static final Object e;
    private static q1 f;

    static {
        q1.e = new Object();
    }

    q1() {
        this.d = 0L;
    }

    @Override  // com.onesignal.r0
    protected Class c() {
        return SyncJobService.class;
    }

    @Override  // com.onesignal.r0
    protected Class d() {
        return SyncService.class;
    }

    @Override  // com.onesignal.r0
    protected int e() {
        return 2071862118;
    }

    @Override  // com.onesignal.r0
    protected String f() {
        return "OS_SYNCSRV_BG_SYNC";
    }

    void p(Context context0) {
        synchronized(r0.c) {
            this.d = 0L;
            if(N.m(context0)) {
                return;
            }
            this.a(context0);
        }
    }

    static q1 q() {
        if(q1.f == null) {
            Object object0 = q1.e;
            synchronized(object0) {
                if(q1.f == null) {
                    q1.f = new q1();
                }
            }
        }
        return q1.f;
    }

    void r(Context context0, long v) {
        I1.a(C.l, "OSSyncService scheduleLocationUpdateTask:delayMs: " + v);
        this.t(context0, v);
    }

    protected void s(Context context0) {
        I1.a(C.l, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000");
        this.t(context0, 30000L);
    }

    protected void t(Context context0, long v) {
        synchronized(r0.c) {
            if(((long)this.d) != 0L && I1.H0().a() + v > ((long)this.d)) {
                I1.a(C.l, "OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.d);
                return;
            }
            if(v < 5000L) {
                v = 5000L;
            }
            this.i(context0, v);
            this.d = (long)(I1.H0().a() + v);
        }
    }
}

