package com.onesignal;

public class a1 implements y {
    private final x1 a;
    private final Runnable b;
    private R0 c;
    private S0 d;
    private boolean e;

    public a1(R0 r00, S0 s00) {
        class a implements Runnable {
            final a1 f;

            @Override
            public void run() {
                I1.a(C.k, "Running complete from OSNotificationOpenedResult timeout runnable!");
                a1.b(a1.this, false);
            }
        }

        this.e = false;
        this.c = r00;
        this.d = s00;
        x1 x10 = x1.b();
        this.a = x10;
        a a1$a0 = new a(this);
        this.b = a1$a0;
        x10.c(5000L, a1$a0);
    }

    @Override  // com.onesignal.I1$y
    public void a(w i1$w0) {
        I1.p1(C.k, "OSNotificationOpenedResult onEntryStateChange called with appEntryState: " + i1$w0);
        this.c(w.h.equals(i1$w0));
    }

    static void b(a1 a10, boolean z) {
        a10.c(z);
    }

    private void c(boolean z) {
        C i1$C0 = C.k;
        I1.p1(i1$C0, "OSNotificationOpenedResult complete called with opened: " + z);
        this.a.a(this.b);
        if(this.e) {
            I1.p1(i1$C0, "OSNotificationOpenedResult already completed");
            return;
        }
        this.e = true;
        if(z) {
            I1.C(this.c.i());
        }
        I1.E1(this);
    }

    public R0 d() {
        return this.c;
    }

    @Override
    public String toString() {
        return "OSNotificationOpenedResult{notification=" + this.c + ", action=" + this.d + ", isComplete=" + this.e + '}';
    }
}

