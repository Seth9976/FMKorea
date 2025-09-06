package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

class a implements c {
    @Override  // androidx.cardview.widget.c
    public void a(b b0, Context context0, ColorStateList colorStateList0, float f, float f1, float f2) {
        b0.a(new d(colorStateList0, f));
        View view0 = b0.e();
        view0.setClipToOutline(true);
        view0.setElevation(f1);
        this.n(b0, f2);
    }

    @Override  // androidx.cardview.widget.c
    public void b(b b0, float f) {
        this.o(b0).h(f);
    }

    @Override  // androidx.cardview.widget.c
    public float c(b b0) {
        return b0.e().getElevation();
    }

    @Override  // androidx.cardview.widget.c
    public float d(b b0) {
        return this.o(b0).d();
    }

    @Override  // androidx.cardview.widget.c
    public void e(b b0) {
        this.n(b0, this.g(b0));
    }

    @Override  // androidx.cardview.widget.c
    public void f(b b0, float f) {
        b0.e().setElevation(f);
    }

    @Override  // androidx.cardview.widget.c
    public float g(b b0) {
        return this.o(b0).c();
    }

    @Override  // androidx.cardview.widget.c
    public ColorStateList h(b b0) {
        return this.o(b0).b();
    }

    @Override  // androidx.cardview.widget.c
    public void i() {
    }

    @Override  // androidx.cardview.widget.c
    public float j(b b0) {
        return this.d(b0) * 2.0f;
    }

    @Override  // androidx.cardview.widget.c
    public float k(b b0) {
        return this.d(b0) * 2.0f;
    }

    @Override  // androidx.cardview.widget.c
    public void l(b b0) {
        this.n(b0, this.g(b0));
    }

    @Override  // androidx.cardview.widget.c
    public void m(b b0, ColorStateList colorStateList0) {
        this.o(b0).f(colorStateList0);
    }

    @Override  // androidx.cardview.widget.c
    public void n(b b0, float f) {
        this.o(b0).g(f, b0.c(), b0.b());
        this.p(b0);
    }

    private d o(b b0) {
        return (d)b0.d();
    }

    public void p(b b0) {
        if(!b0.c()) {
            b0.f(0, 0, 0, 0);
            return;
        }
        float f = this.g(b0);
        float f1 = this.d(b0);
        int v = (int)Math.ceil(e.a(f, f1, b0.b()));
        int v1 = (int)Math.ceil(e.b(f, f1, b0.b()));
        b0.f(v, v1, v, v1);
    }
}

