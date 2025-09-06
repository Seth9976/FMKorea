package androidx.work;

import B.a;
import android.os.Build.VERSION;
import androidx.work.impl.d;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b {
    public static final class androidx.work.b.b {
        Executor a;
        w b;
        i c;
        Executor d;
        r e;
        a f;
        a g;
        String h;
        int i;
        int j;
        int k;
        int l;

        public androidx.work.b.b() {
            this.i = 4;
            this.j = 0;
            this.k = 0x7FFFFFFF;
            this.l = 20;
        }

        public b a() {
            return new b(this);
        }
    }

    final Executor a;
    final Executor b;
    final w c;
    final i d;
    final r e;
    final a f;
    final a g;
    final String h;
    final int i;
    final int j;
    final int k;
    final int l;
    private final boolean m;

    b(androidx.work.b.b b$b0) {
        Executor executor0 = b$b0.a;
        this.a = executor0 == null ? this.a(false) : executor0;
        Executor executor1 = b$b0.d;
        if(executor1 == null) {
            this.m = true;
            this.b = this.a(true);
        }
        else {
            this.m = false;
            this.b = executor1;
        }
        w w0 = b$b0.b;
        this.c = w0 == null ? w.c() : w0;
        i i0 = b$b0.c;
        this.d = i0 == null ? i.c() : i0;
        r r0 = b$b0.e;
        this.e = r0 == null ? new d() : r0;
        this.i = b$b0.i;
        this.j = b$b0.j;
        this.k = b$b0.k;
        this.l = b$b0.l;
        this.f = b$b0.f;
        this.g = b$b0.g;
        this.h = b$b0.h;
    }

    private Executor a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), this.b(z));
    }

    private ThreadFactory b(boolean z) {
        class androidx.work.b.a implements ThreadFactory {
            private final AtomicInteger a;
            final boolean b;
            final b c;

            androidx.work.b.a(boolean z) {
                this.b = z;
                super();
                this.a = new AtomicInteger(0);
            }

            // 去混淆评级： 低(20)
            @Override
            public Thread newThread(Runnable runnable0) {
                return this.b ? new Thread(runnable0, "WM.task-" + this.a.incrementAndGet()) : new Thread(runnable0, "androidx.work-" + this.a.incrementAndGet());
            }
        }

        return new androidx.work.b.a(this, z);
    }

    public String c() {
        return this.h;
    }

    public Executor d() {
        return this.a;
    }

    public a e() {
        return this.f;
    }

    public i f() {
        return this.d;
    }

    public int g() {
        return this.k;
    }

    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.l / 2 : this.l;
    }

    public int i() {
        return this.j;
    }

    public int j() {
        return this.i;
    }

    public r k() {
        return this.e;
    }

    public a l() {
        return this.g;
    }

    public Executor m() {
        return this.b;
    }

    public w n() {
        return this.c;
    }
}

