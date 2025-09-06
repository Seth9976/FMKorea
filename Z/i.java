package z;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

abstract class i {
    static class a implements ThreadFactory {
        static class z.i.a.a extends Thread {
            private final int f;

            z.i.a.a(Runnable runnable0, String s, int v) {
                super(runnable0, s);
                this.f = v;
            }

            @Override
            public void run() {
                Process.setThreadPriority(this.f);
                super.run();
            }
        }

        private String a;
        private int b;

        a(String s, int v) {
            this.a = s;
            this.b = v;
        }

        @Override
        public Thread newThread(Runnable runnable0) {
            return new z.i.a.a(runnable0, this.a, this.b);
        }
    }

    static class b implements Runnable {
        private Callable f;
        private B.a g;
        private Handler h;

        b(Handler handler0, Callable callable0, B.a a0) {
            this.f = callable0;
            this.g = a0;
            this.h = handler0;
        }

        @Override
        public void run() {
            class z.i.b.a implements Runnable {
                final B.a f;
                final Object g;
                final b h;

                z.i.b.a(B.a a0, Object object0) {
                    this.f = a0;
                    this.g = object0;
                    super();
                }

                @Override
                public void run() {
                    this.f.a(this.g);
                }
            }

            Object object0 = null;
            try {
                object0 = this.f.call();
            }
            catch(Exception unused_ex) {
            }
            this.h.post(new z.i.b.a(this, this.g, object0));
        }
    }

    static ThreadPoolExecutor a(String s, int v, int v1) {
        a i$a0 = new a(s, v);
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, ((long)v1), TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), i$a0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        return threadPoolExecutor0;
    }

    static void b(Executor executor0, Callable callable0, B.a a0) {
        executor0.execute(new b(z.b.a(), callable0, a0));
    }

    static Object c(ExecutorService executorService0, Callable callable0, int v) {
        Future future0 = executorService0.submit(callable0);
        try {
            return future0.get(((long)v), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException executionException0) {
            throw new RuntimeException(executionException0);
        }
        catch(InterruptedException interruptedException0) {
            throw interruptedException0;
        }
        catch(TimeoutException unused_ex) {
            throw new InterruptedException("timeout");
        }
    }
}

