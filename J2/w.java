package j2;

import g2.f;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public abstract class w {
    private static void a(String s, ExecutorService executorService0) {
        w.b(s, executorService0, 2L, TimeUnit.SECONDS);
    }

    private static void b(String s, ExecutorService executorService0, long v, TimeUnit timeUnit0) {
        class b extends d {
            final String f;
            final ExecutorService g;
            final long h;
            final TimeUnit i;

            b(String s, ExecutorService executorService0, long v, TimeUnit timeUnit0) {
                this.g = executorService0;
                this.h = v;
                this.i = timeUnit0;
                super();
            }

            @Override  // j2.d
            public void a() {
                try {
                    f.f().b("Executing shutdown hook for " + this.f);
                    this.g.shutdown();
                    if(!this.g.awaitTermination(this.h, this.i)) {
                        f.f().b(this.f + " did not shut down in the allocated time. Requesting immediate shutdown.");
                        this.g.shutdownNow();
                    }
                }
                catch(InterruptedException unused_ex) {
                    f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f));
                    this.g.shutdownNow();
                }
            }
        }

        Runtime.getRuntime().addShutdownHook(new Thread(new b(s, executorService0, v, timeUnit0), "Crashlytics Shutdown Hook for " + s));
    }

    public static ExecutorService c(String s) {
        ExecutorService executorService0 = w.e(w.d(s), new ThreadPoolExecutor.DiscardPolicy());
        w.a(s, executorService0);
        return executorService0;
    }

    public static ThreadFactory d(String s) {
        class a implements ThreadFactory {
            final String a;
            final AtomicLong b;

            a(String s, AtomicLong atomicLong0) {
                this.b = atomicLong0;
                super();
            }

            @Override
            public Thread newThread(Runnable runnable0) {
                class j2.w.a.a extends d {
                    final Runnable f;
                    final a g;

                    j2.w.a.a(Runnable runnable0) {
                        this.f = runnable0;
                        super();
                    }

                    @Override  // j2.d
                    public void a() {
                        this.f.run();
                    }
                }

                Thread thread0 = Executors.defaultThreadFactory().newThread(new j2.w.a.a(this, runnable0));
                thread0.setName(this.a + this.b.getAndIncrement());
                return thread0;
            }
        }

        return new a(s, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory0, RejectedExecutionHandler rejectedExecutionHandler0) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory0, rejectedExecutionHandler0));
    }
}

