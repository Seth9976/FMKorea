package androidx.work;

import android.content.Context;
import android.net.Network;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class j {
    public static abstract class a {
        public static final class androidx.work.j.a.a extends a {
            private final d a;

            public androidx.work.j.a.a() {
                this(d.c);
            }

            public androidx.work.j.a.a(d d0) {
                this.a = d0;
            }

            public d e() {
                return this.a;
            }

            @Override
            public boolean equals(Object object0) {
                if(this == object0) {
                    return true;
                }
                if(object0 != null) {
                    Class class0 = object0.getClass();
                    return androidx.work.j.a.a.class == class0 ? this.a.equals(((androidx.work.j.a.a)object0).a) : false;
                }
                return false;
            }

            // 去混淆评级： 低(30)
            @Override
            public int hashCode() {
                return this.a.hashCode() - 0x4878A22C;
            }

            @Override
            public String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }
        }

        public static final class b extends a {
            @Override
            public boolean equals(Object object0) {
                if(this == object0) {
                    return true;
                }
                if(object0 != null) {
                    Class class0 = object0.getClass();
                    return b.class == class0;
                }
                return false;
            }

            // 去混淆评级： 低(30)
            @Override
            public int hashCode() {
                return 0x5EB97AD;
            }

            @Override
            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {
            private final d a;

            public c() {
                this(d.c);
            }

            public c(d d0) {
                this.a = d0;
            }

            public d e() {
                return this.a;
            }

            @Override
            public boolean equals(Object object0) {
                if(this == object0) {
                    return true;
                }
                if(object0 != null) {
                    Class class0 = object0.getClass();
                    return c.class == class0 ? this.a.equals(((c)object0).a) : false;
                }
                return false;
            }

            // 去混淆评级： 低(30)
            @Override
            public int hashCode() {
                return this.a.hashCode() - 0x4878A1EE;
            }

            @Override
            public String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }
        }

        public static a a() {
            return new androidx.work.j.a.a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(d d0) {
            return new c(d0);
        }
    }

    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public j(Context context0, WorkerParameters workerParameters0) {
        if(context0 == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if(workerParameters0 == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context0;
        this.mWorkerParams = workerParameters0;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public Z1.d getForegroundInfoAsync() {
        Z1.d d0 = androidx.work.impl.utils.futures.c.s();
        ((androidx.work.impl.utils.futures.c)d0).p(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return d0;
    }

    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    public final d getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    public final Set getTags() {
        return this.mWorkerParams.h();
    }

    public z0.c getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    public final List getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    public final List getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    public w getWorkerFactory() {
        return this.mWorkerParams.l();
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final Z1.d setForegroundAsync(f f0) {
        return this.mWorkerParams.b().a(this.getApplicationContext(), this.getId(), f0);
    }

    public Z1.d setProgressAsync(d d0) {
        return this.mWorkerParams.f().a(this.getApplicationContext(), this.getId(), d0);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract Z1.d startWork();

    public final void stop() {
        this.mStopped = true;
        this.onStopped();
    }
}

