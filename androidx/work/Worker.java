package androidx.work;

import Z1.d;
import android.content.Context;
import androidx.work.impl.utils.futures.c;

public abstract class Worker extends j {
    c mFuture;

    public Worker(Context context0, WorkerParameters workerParameters0) {
        super(context0, workerParameters0);
    }

    public abstract a doWork();

    public f getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override  // androidx.work.j
    public d getForegroundInfoAsync() {
        class b implements Runnable {
            final c f;
            final Worker g;

            b(c c0) {
                this.f = c0;
                super();
            }

            @Override
            public void run() {
                try {
                    f f0 = Worker.this.getForegroundInfo();
                    this.f.o(f0);
                }
                catch(Throwable throwable0) {
                    this.f.p(throwable0);
                }
            }
        }

        d d0 = c.s();
        this.getBackgroundExecutor().execute(new b(this, ((c)d0)));
        return d0;
    }

    @Override  // androidx.work.j
    public final d startWork() {
        class androidx.work.Worker.a implements Runnable {
            final Worker f;

            @Override
            public void run() {
                try {
                    a j$a0 = Worker.this.doWork();
                    Worker.this.mFuture.o(j$a0);
                }
                catch(Throwable throwable0) {
                    Worker.this.mFuture.p(throwable0);
                }
            }
        }

        this.mFuture = c.s();
        this.getBackgroundExecutor().execute(new androidx.work.Worker.a(this));
        return this.mFuture;
    }
}

