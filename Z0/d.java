package z0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import y0.t;

public class d implements c {
    class a implements Executor {
        final d f;

        @Override
        public void execute(Runnable runnable0) {
            d.this.b.post(runnable0);
        }
    }

    private final t a;
    final Handler b;
    private final Executor c;

    public d(Executor executor0) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new a(this);
        this.a = new t(executor0);
    }

    @Override  // z0.c
    public Executor a() {
        return this.c;
    }

    @Override  // z0.c
    public z0.a b() {
        return this.d();
    }

    @Override  // z0.c
    public void c(Runnable runnable0) {
        b.a(this, runnable0);
    }

    public t d() {
        return this.a;
    }
}

