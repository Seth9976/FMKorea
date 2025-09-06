package t0;

import androidx.work.k;
import androidx.work.r;
import java.util.HashMap;
import java.util.Map;
import x0.u;

public class a {
    final b a;
    private final r b;
    private final Map c;
    static final String d;

    static {
        a.d = "WM-DelayedWorkTracker";
    }

    public a(b b0, r r0) {
        this.a = b0;
        this.b = r0;
        this.c = new HashMap();
    }

    public void a(u u0) {
        class t0.a.a implements Runnable {
            final u f;
            final a g;

            t0.a.a(u u0) {
                this.f = u0;
                super();
            }

            @Override
            public void run() {
                k.e().a("WM-DelayedWorkTracker", "Scheduling work " + this.f.a);
                a.this.a.d(new u[]{this.f});
            }
        }

        Runnable runnable0 = (Runnable)this.c.remove(u0.a);
        if(runnable0 != null) {
            this.b.b(runnable0);
        }
        t0.a.a a$a0 = new t0.a.a(this, u0);
        this.c.put(u0.a, a$a0);
        long v = u0.c();
        this.b.a(v - System.currentTimeMillis(), a$a0);
    }

    public void b(String s) {
        Runnable runnable0 = (Runnable)this.c.remove(s);
        if(runnable0 != null) {
            this.b.b(runnable0);
        }
    }
}

