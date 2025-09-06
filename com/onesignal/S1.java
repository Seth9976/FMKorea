package com.onesignal;

import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

class s1 {
    static class b implements Runnable {
        private s1 f;
        private Runnable g;
        private long h;

        b(s1 s10, Runnable runnable0) {
            this.f = s10;
            this.g = runnable0;
        }

        static long a(b s1$b0) {
            return s1$b0.h;
        }

        static long b(b s1$b0, long v) {
            s1$b0.h = v;
            return v;
        }

        @Override
        public void run() {
            this.g.run();
            this.f.d(this.h);
        }

        @Override
        public String toString() {
            return "PendingTaskRunnable{innerTask=" + this.g + ", taskId=" + this.h + '}';
        }
    }

    private final Queue a;
    private final AtomicLong b;
    private ExecutorService c;
    protected final Q0 d;

    s1(Q0 q00) {
        this.a = new LinkedBlockingQueue();
        this.b = new AtomicLong();
        this.d = q00;
    }

    private void b(b s1$b0) {
        synchronized(this.a) {
            b.b(s1$b0, this.b.incrementAndGet());
            ExecutorService executorService0 = this.c;
            if(executorService0 == null) {
                this.d.d("Adding a task to the pending queue with ID: " + b.a(s1$b0));
                this.a.add(s1$b0);
            }
            else if(!executorService0.isShutdown()) {
                this.d.d("Executor is still running, add to the executor with ID: " + b.a(s1$b0));
                try {
                    this.c.submit(s1$b0);
                }
                catch(RejectedExecutionException rejectedExecutionException0) {
                    this.d.f("Executor is shutdown, running task manually with ID: " + b.a(s1$b0));
                    s1$b0.run();
                    rejectedExecutionException0.printStackTrace();
                }
            }
        }
    }

    void c(Runnable runnable0) {
        this.b(new b(this, runnable0));
    }

    private void d(long v) {
        if(this.b.get() == v) {
            I1.a(C.j, "Last Pending Task has ran, shutting down");
            this.c.shutdown();
        }
    }

    // 去混淆评级： 低(20)
    boolean e() {
        if(I1.b1() && this.c == null) {
            return false;
        }
        return I1.b1() || this.c != null ? !this.c.isShutdown() : true;
    }

    void f() {
        class a implements ThreadFactory {
            final s1 a;

            @Override
            public Thread newThread(Runnable runnable0) {
                Thread thread0 = new Thread(runnable0);
                thread0.setName("OS_PENDING_EXECUTOR_" + thread0.getId());
                return thread0;
            }
        }

        synchronized(this.a) {
            I1.a(C.k, "startPendingTasks with task queue quantity: " + this.a.size());
            if(!this.a.isEmpty()) {
                this.c = Executors.newSingleThreadExecutor(new a(this));
                while(!this.a.isEmpty()) {
                    this.c.submit(((Runnable)this.a.poll()));
                }
            }
        }
    }
}

