package y0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import z0.a;

public class t implements a {
    static class y0.t.a implements Runnable {
        final t f;
        final Runnable g;

        y0.t.a(t t0, Runnable runnable0) {
            this.f = t0;
            this.g = runnable0;
        }

        @Override
        public void run() {
            try {
                this.g.run();
            }
            finally {
                synchronized(this.f.i) {
                    this.f.a();
                }
            }
        }
    }

    private final ArrayDeque f;
    private final Executor g;
    private Runnable h;
    final Object i;

    public t(Executor executor0) {
        this.g = executor0;
        this.f = new ArrayDeque();
        this.i = new Object();
    }

    @Override  // z0.a
    public boolean F() {
        synchronized(this.i) {
        }
        return !this.f.isEmpty();
    }

    void a() {
        Runnable runnable0 = (Runnable)this.f.poll();
        this.h = runnable0;
        if(runnable0 != null) {
            this.g.execute(runnable0);
        }
    }

    @Override
    public void execute(Runnable runnable0) {
        synchronized(this.i) {
            y0.t.a t$a0 = new y0.t.a(this, runnable0);
            this.f.add(t$a0);
            if(this.h == null) {
                this.a();
            }
        }
    }
}

