package j2;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class k {
    private final Executor a;
    private Task b;
    private final Object c;
    private final ThreadLocal d;

    public k(Executor executor0) {
        class a implements Runnable {
            final k f;

            @Override
            public void run() {
                k.a(k.this).set(Boolean.TRUE);
            }
        }

        this.b = Tasks.forResult(null);
        this.c = new Object();
        this.d = new ThreadLocal();
        this.a = executor0;
        executor0.execute(new a(this));
    }

    static ThreadLocal a(k k0) {
        return k0.d;
    }

    public void b() {
        if(!this.e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.a;
    }

    private Task d(Task task0) {
        class d implements Continuation {
            final k a;

            public Void a(Task task0) [...] // Inlined contents

            @Override  // com.google.android.gms.tasks.Continuation
            public Object then(Task task0) {
                return null;
            }
        }

        d k$d0 = new d(this);
        return task0.continueWith(this.a, k$d0);
    }

    private boolean e() {
        Object object0 = this.d.get();
        return Boolean.TRUE.equals(object0);
    }

    private Continuation f(Callable callable0) {
        class c implements Continuation {
            final Callable a;
            final k b;

            c(Callable callable0) {
                this.a = callable0;
                super();
            }

            @Override  // com.google.android.gms.tasks.Continuation
            public Object then(Task task0) {
                return this.a.call();
            }
        }

        return new c(this, callable0);
    }

    Task g(Runnable runnable0) {
        class b implements Callable {
            final Runnable a;
            final k b;

            b(Runnable runnable0) {
                this.a = runnable0;
                super();
            }

            public Void a() {
                this.a.run();
                return null;
            }

            @Override
            public Object call() {
                return this.a();
            }
        }

        return this.h(new b(this, runnable0));
    }

    public Task h(Callable callable0) {
        synchronized(this.c) {
            Task task0 = this.b;
            Continuation continuation0 = this.f(callable0);
            Task task1 = task0.continueWith(this.a, continuation0);
            this.b = this.d(task1);
            return task1;
        }
    }

    public Task i(Callable callable0) {
        synchronized(this.c) {
            Task task0 = this.b;
            Continuation continuation0 = this.f(callable0);
            Task task1 = task0.continueWithTask(this.a, continuation0);
            this.b = this.d(task1);
            return task1;
        }
    }
}

