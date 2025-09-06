package com.onesignal;

public class b1 {
    private final T0 a;
    private final x1 b;
    private final Runnable c;
    private final R0 d;
    private boolean e;

    b1(T0 t00, R0 r00) {
        class a implements Runnable {
            final b1 f;

            @Override
            public void run() {
                I1.a(C.k, "Running complete from OSNotificationReceivedEvent timeout runnable!");
                b1.this.b(b1.this.c());
            }
        }

        this.e = false;
        this.d = r00;
        this.a = t00;
        x1 x10 = x1.b();
        this.b = x10;
        a b1$a0 = new a(this);
        this.c = b1$a0;
        x10.c(25000L, b1$a0);
    }

    public void b(R0 r00) {
        class b implements Runnable {
            final R0 f;
            final b1 g;

            b(R0 r00) {
                this.f = r00;
                super();
            }

            @Override
            public void run() {
                b1.this.e(this.f);
            }
        }

        synchronized(this) {
            this.b.a(this.c);
            if(this.e) {
                I1.p1(C.k, "OSNotificationReceivedEvent already completed");
                return;
            }
            this.e = true;
            if(b1.d()) {
                new Thread(new b(this, r00), "OS_COMPLETE_NOTIFICATION").start();
                return;
            }
            this.e(r00);
        }
    }

    public R0 c() {
        return this.d;
    }

    static boolean d() {
        return OSUtils.H();
    }

    private void e(R0 r00) {
        R0 r01 = this.d.c();
        R0 r02 = r00 == null ? null : r00.c();
        this.a.f(r01, r02);
    }

    @Override
    public String toString() {
        return "OSNotificationReceivedEvent{isComplete=" + this.e + ", notification=" + this.d + '}';
    }
}

