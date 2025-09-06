package e2;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jeb.synthetic.FIN;

final class k implements Executor {
    final class b implements Runnable {
        Runnable f;
        final k g;

        private b() {
        }

        b(a k$a0) {
        }

        private void a() {
            int v;
            boolean z = false;
            boolean z1 = false;
            while(true) {
                try {
                label_2:
                    Deque deque0 = k.this.g;
                    __monitor_enter(deque0);
                    v = FIN.finallyOpen$NT();
                    if(!z) {
                        c k$c0 = c.i;
                        if(k.this.h != k$c0) {
                            k.e(k.this);
                            k.this.h = k$c0;
                            z = true;
                            goto label_18;
                        }
                        FIN.finallyCodeBegin$NT(v);
                        __monitor_exit(deque0);
                        FIN.finallyCodeEnd$NT(v);
                        if(z1) {
                            goto label_16;
                        }
                        return;
                    }
                    goto label_18;
                }
                catch(Throwable throwable0) {
                    break;
                }
            label_16:
                Thread.currentThread().interrupt();
                return;
                try {
                label_18:
                    Runnable runnable0 = (Runnable)k.this.g.poll();
                    this.f = runnable0;
                    if(runnable0 == null) {
                        k.this.h = c.f;
                        FIN.finallyExec$NT(v);
                        if(z1) {
                            goto label_24;
                        }
                        return;
                    }
                    goto label_26;
                }
                catch(Throwable throwable0) {
                    break;
                }
            label_24:
                Thread.currentThread().interrupt();
                return;
                try {
                label_26:
                    FIN.finallyExec$NT(v);
                    z1 |= Thread.interrupted();
                    try {
                        this.f.run();
                    }
                    catch(RuntimeException runtimeException0) {
                        k.k.log(Level.SEVERE, "Exception while executing runnable " + this.f, runtimeException0);
                    }
                    finally {
                        this.f = null;
                    }
                    goto label_2;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            if(z1) {
                Thread.currentThread().interrupt();
            }
            throw throwable0;
        }

        @Override
        public void run() {
            try {
                this.a();
            }
            catch(Error error0) {
                Deque deque0 = k.this.g;
                synchronized(deque0) {
                    k.this.h = c.f;
                }
                throw error0;
            }
        }

        @Override
        public String toString() {
            return this.f == null ? "SequentialExecutorWorker{state=" + k.this.h + "}" : "SequentialExecutorWorker{running=" + this.f + "}";
        }
    }

    static enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING;

    }

    private final Executor f;
    private final Deque g;
    private c h;
    private long i;
    private final b j;
    private static final Logger k;

    static {
        k.k = Logger.getLogger("e2.k");
    }

    k(Executor executor0) {
        this.g = new ArrayDeque();
        this.h = c.f;
        this.i = 0L;
        this.j = new b(this, null);
        this.f = (Executor)Preconditions.checkNotNull(executor0);
    }

    static long e(k k0) {
        long v = k0.i;
        k0.i = v + 1L;
        return v;
    }

    @Override
    public void execute(Runnable runnable0) {
        class a implements Runnable {
            final Runnable f;
            final k g;

            a(Runnable runnable0) {
                this.f = runnable0;
                super();
            }

            @Override
            public void run() {
                this.f.run();
            }

            @Override
            public String toString() {
                return this.f.toString();
            }
        }

        Preconditions.checkNotNull(runnable0);
        synchronized(this.g) {
            c k$c0 = this.h;
            if(k$c0 != c.i) {
                c k$c1 = c.h;
                if(k$c0 != k$c1) {
                    long v1 = this.i;
                    a k$a0 = new a(this, runnable0);
                    this.g.add(k$a0);
                    c k$c2 = c.g;
                    this.h = k$c2;
                    try {
                        this.f.execute(this.j);
                    }
                    catch(RuntimeException | Error runtimeException0) {
                        synchronized(this.g) {
                            if(runtimeException0 instanceof RejectedExecutionException && (this.h != c.f && this.h != c.g || !this.g.removeLastOccurrence(k$a0))) {
                                return;
                            }
                        }
                        throw runtimeException0;
                    }
                    if(this.h != k$c2) {
                        return;
                    }
                    synchronized(this.g) {
                        if(this.i == v1 && this.h == k$c2) {
                            this.h = k$c1;
                        }
                    }
                    return;
                }
            }
            this.g.add(runnable0);
        }
    }

    @Override
    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f + "}";
    }
}

