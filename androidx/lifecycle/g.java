package androidx.lifecycle;

import android.os.Handler;
import z3.k;

public class G {
    public static final class a implements Runnable {
        private final o f;
        private final androidx.lifecycle.h.a g;
        private boolean h;

        public a(o o0, androidx.lifecycle.h.a h$a0) {
            k.e(o0, "registry");
            k.e(h$a0, "event");
            super();
            this.f = o0;
            this.g = h$a0;
        }

        @Override
        public void run() {
            if(!this.h) {
                this.f.h(this.g);
                this.h = true;
            }
        }
    }

    private final o a;
    private final Handler b;
    private a c;

    public G(n n0) {
        k.e(n0, "provider");
        super();
        this.a = new o(n0);
        this.b = new Handler();
    }

    public h a() {
        return this.a;
    }

    public void b() {
        this.f(androidx.lifecycle.h.a.ON_START);
    }

    public void c() {
        this.f(androidx.lifecycle.h.a.ON_CREATE);
    }

    public void d() {
        this.f(androidx.lifecycle.h.a.ON_STOP);
        this.f(androidx.lifecycle.h.a.ON_DESTROY);
    }

    public void e() {
        this.f(androidx.lifecycle.h.a.ON_START);
    }

    private final void f(androidx.lifecycle.h.a h$a0) {
        a g$a0 = this.c;
        if(g$a0 != null) {
            g$a0.run();
        }
        a g$a1 = new a(this.a, h$a0);
        this.c = g$a1;
        k.b(g$a1);
        this.b.postAtFrontOfQueue(g$a1);
    }
}

