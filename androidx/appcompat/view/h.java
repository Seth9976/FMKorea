package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import java.util.ArrayList;

public class h {
    class a extends i0 {
        private boolean a;
        private int b;
        final h c;

        a() {
            this.a = false;
            this.b = 0;
        }

        @Override  // androidx.core.view.h0
        public void b(View view0) {
            int v = this.b + 1;
            this.b = v;
            if(v == h.this.a.size()) {
                h0 h00 = h.this.d;
                if(h00 != null) {
                    h00.b(null);
                }
                this.d();
            }
        }

        @Override  // androidx.core.view.i0
        public void c(View view0) {
            if(this.a) {
                return;
            }
            this.a = true;
            h0 h00 = h.this.d;
            if(h00 != null) {
                h00.c(null);
            }
        }

        void d() {
            this.b = 0;
            this.a = false;
            h.this.b();
        }
    }

    final ArrayList a;
    private long b;
    private Interpolator c;
    h0 d;
    private boolean e;
    private final i0 f;

    public h() {
        this.b = -1L;
        this.f = new a(this);
        this.a = new ArrayList();
    }

    public void a() {
        if(!this.e) {
            return;
        }
        for(Object object0: this.a) {
            ((g0)object0).c();
        }
        this.e = false;
    }

    void b() {
        this.e = false;
    }

    public h c(g0 g00) {
        if(!this.e) {
            this.a.add(g00);
        }
        return this;
    }

    public h d(g0 g00, g0 g01) {
        this.a.add(g00);
        g01.j(g00.d());
        this.a.add(g01);
        return this;
    }

    public h e(long v) {
        if(!this.e) {
            this.b = v;
        }
        return this;
    }

    public h f(Interpolator interpolator0) {
        if(!this.e) {
            this.c = interpolator0;
        }
        return this;
    }

    public h g(h0 h00) {
        if(!this.e) {
            this.d = h00;
        }
        return this;
    }

    public void h() {
        if(this.e) {
            return;
        }
        for(Object object0: this.a) {
            g0 g00 = (g0)object0;
            long v = this.b;
            if(v >= 0L) {
                g00.f(v);
            }
            Interpolator interpolator0 = this.c;
            if(interpolator0 != null) {
                g00.g(interpolator0);
            }
            if(this.d != null) {
                g00.h(this.f);
            }
            g00.l();
        }
        this.e = true;
    }
}

