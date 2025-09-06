package p2;

import android.database.SQLException;
import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import g2.f;
import j2.D;
import j2.V;
import j2.r;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k1.c;
import m1.l;
import q2.d;

final class e {
    static abstract class a {
    }

    final class b implements Runnable {
        private final r f;
        private final TaskCompletionSource g;
        final e h;

        private b(r r0, TaskCompletionSource taskCompletionSource0) {
            this.f = r0;
            this.g = taskCompletionSource0;
        }

        b(r r0, TaskCompletionSource taskCompletionSource0, a e$a0) {
            this(r0, taskCompletionSource0);
        }

        @Override
        public void run() {
            e.this.p(this.f, this.g);
            e.this.i.c();
            double f = e.this.g();
            f.f().b("Delay for: " + String.format(Locale.US, "%.2f", ((double)(f / 1000.0))) + " s for report: " + this.f.d());
            e.q(f);
        }
    }

    private final double a;
    private final double b;
    private final long c;
    private final long d;
    private final int e;
    private final BlockingQueue f;
    private final ThreadPoolExecutor g;
    private final k1.f h;
    private final D i;
    private int j;
    private long k;

    e(double f, double f1, long v, k1.f f2, D d0) {
        this.a = f;
        this.b = f1;
        this.c = v;
        this.h = f2;
        this.i = d0;
        this.d = SystemClock.elapsedRealtime();
        this.e = (int)f;
        ArrayBlockingQueue arrayBlockingQueue0 = new ArrayBlockingQueue(((int)f));
        this.f = arrayBlockingQueue0;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue0);
        this.j = 0;
        this.k = 0L;
    }

    e(k1.f f0, d d0, D d1) {
        this(d0.f, d0.g, ((long)d0.h) * 1000L, f0, d1);
    }

    // 检测为 Lambda 实现
    public static void a(e e0, TaskCompletionSource taskCompletionSource0, boolean z, r r0, Exception exception0) [...]

    // 检测为 Lambda 实现
    public static void b(e e0, CountDownLatch countDownLatch0) [...]

    private double g() {
        double f = (double)this.h();
        return Math.min(3600000.0, 60000.0 / this.a * Math.pow(this.b, f));
    }

    private int h() {
        if(this.k == 0L) {
            this.k = 1757113101593L;
        }
        int v = (int)((1757113110887L - this.k) / this.c);
        int v1 = this.l() ? Math.min(100, this.j + v) : Math.max(0, this.j - v);
        if(this.j != v1) {
            this.j = v1;
            this.k = 1757113120329L;
        }
        return v1;
    }

    TaskCompletionSource i(r r0, boolean z) {
        synchronized(this.f) {
            TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
            if(z) {
                this.i.b();
                if(this.k()) {
                    f.f().b("Enqueueing report: " + r0.d());
                    f.f().b("Queue size: " + this.f.size());
                    b e$b0 = new b(this, r0, taskCompletionSource0, null);
                    this.g.execute(e$b0);
                    f.f().b("Closing task for report: " + r0.d());
                    taskCompletionSource0.trySetResult(r0);
                    return taskCompletionSource0;
                }
                this.h();
                f.f().b("Dropping report due to queue being full: " + r0.d());
                this.i.a();
                taskCompletionSource0.trySetResult(r0);
                return taskCompletionSource0;
            }
            this.p(r0, taskCompletionSource0);
            return taskCompletionSource0;
        }
    }

    public void j() {
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        new Thread(() -> this.m(countDownLatch0)).start();
        V.g(countDownLatch0, 2L, TimeUnit.SECONDS);
    }

    private boolean k() {
        return this.f.size() < this.e;
    }

    private boolean l() {
        return this.f.size() == this.e;
    }

    private void m(CountDownLatch countDownLatch0) {
        try {
            l.a(this.h, k1.d.h);
        }
        catch(SQLException unused_ex) {
        }
        countDownLatch0.countDown();
    }

    private void n(TaskCompletionSource taskCompletionSource0, boolean z, r r0, Exception exception0) {
        if(exception0 != null) {
            taskCompletionSource0.trySetException(exception0);
            return;
        }
        if(z) {
            this.j();
        }
        taskCompletionSource0.trySetResult(r0);
    }

    private long o() [...] // 潜在的解密器

    private void p(r r0, TaskCompletionSource taskCompletionSource0) {
        f.f().b("Sending report through Google DataTransport: " + r0.d());
        boolean z = SystemClock.elapsedRealtime() - this.d < 2000L;
        c c0 = c.e(r0.b());
        p2.c c1 = (Exception exception0) -> this.n(taskCompletionSource0, z, r0, exception0);
        this.h.b(c0, c1);
    }

    private static void q(double f) {
        try {
            Thread.sleep(((long)f));
        }
        catch(InterruptedException unused_ex) {
        }
    }
}

