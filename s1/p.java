package S1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class p extends o {
    private boolean f;
    private float g;

    p(View view0) {
        this.f = false;
        this.g = 0.0f;
        this.m(view0);
    }

    @Override  // S1.o
    void b(View view0) {
        this.g = this.l();
        this.f = this.n() || this.o();
        view0.setClipToOutline(!this.i());
        if(this.i()) {
            view0.invalidate();
            return;
        }
        view0.invalidateOutline();
    }

    // 去混淆评级： 低(20)
    @Override  // S1.o
    boolean i() {
        return !this.f || this.a;
    }

    private float l() {
        k k0 = this.c;
        if(k0 != null) {
            return this.d == null ? 0.0f : k0.f.a(this.d);
        }
        return 0.0f;
    }

    private void m(View view0) {
        class a extends ViewOutlineProvider {
            final p a;

            @Override  // android.view.ViewOutlineProvider
            public void getOutline(View view0, Outline outline0) {
                if(p.this.c != null && !p.this.d.isEmpty()) {
                    outline0.setRoundRect(((int)p.this.d.left), ((int)p.this.d.top), ((int)p.this.d.right), ((int)p.this.d.bottom), p.this.g);
                }
            }
        }

        view0.setOutlineProvider(new a(this));
    }

    private boolean n() {
        if(!this.d.isEmpty()) {
            return this.c == null ? false : this.c.u(this.d);
        }
        return false;
    }

    private boolean o() {
        if(!this.d.isEmpty() && (this.c != null && this.b && !this.c.u(this.d) && p.p(this.c))) {
            float f = this.c.r().a(this.d);
            float f1 = this.c.t().a(this.d);
            float f2 = this.c.j().a(this.d);
            float f3 = this.c.l().a(this.d);
            int v = Float.compare(f, 0.0f);
            if(v == 0 && f2 == 0.0f && f1 == f3) {
                this.d.set(this.d.left - f1, this.d.top, this.d.right, this.d.bottom);
                this.g = f1;
                return true;
            }
            if(v == 0 && f1 == 0.0f && f2 == f3) {
                this.d.set(this.d.left, this.d.top - f2, this.d.right, this.d.bottom);
                this.g = f2;
                return true;
            }
            if(f1 == 0.0f && f3 == 0.0f && f == f2) {
                this.d.set(this.d.left, this.d.top, this.d.right + f, this.d.bottom);
                this.g = f;
                return true;
            }
            if(f2 == 0.0f && f3 == 0.0f && f == f1) {
                this.d.set(this.d.left, this.d.top, this.d.right, this.d.bottom + f);
                this.g = f;
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(40)
    private static boolean p(k k0) {
        return k0.q() instanceof j && k0.s() instanceof j && k0.i() instanceof j && k0.k() instanceof j;
    }
}

