package z;

import android.graphics.Typeface;
import android.os.Handler;

class a {
    private final c a;
    private final Handler b;

    a(c h$c0, Handler handler0) {
        this.a = h$c0;
        this.b = handler0;
    }

    private void a(int v) {
        class b implements Runnable {
            final c f;
            final int g;
            final a h;

            b(c h$c0, int v) {
                this.f = h$c0;
                this.g = v;
                super();
            }

            @Override
            public void run() {
                this.f.a(this.g);
            }
        }

        b a$b0 = new b(this, this.a, v);
        this.b.post(a$b0);
    }

    void b(e g$e0) {
        if(g$e0.a()) {
            this.c(g$e0.a);
            return;
        }
        this.a(g$e0.b);
    }

    private void c(Typeface typeface0) {
        class z.a.a implements Runnable {
            final c f;
            final Typeface g;
            final a h;

            z.a.a(c h$c0, Typeface typeface0) {
                this.f = h$c0;
                this.g = typeface0;
                super();
            }

            @Override
            public void run() {
                this.f.b(this.g);
            }
        }

        z.a.a a$a0 = new z.a.a(this, this.a, typeface0);
        this.b.post(a$a0);
    }
}

