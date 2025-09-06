package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.Y;

class d {
    private final View a;
    private final j b;
    private int c;
    private a0 d;
    private a0 e;
    private a0 f;

    d(View view0) {
        this.c = -1;
        this.a = view0;
        this.b = j.b();
    }

    private boolean a(Drawable drawable0) {
        if(this.f == null) {
            this.f = new a0();
        }
        a0 a00 = this.f;
        a00.a();
        ColorStateList colorStateList0 = Y.r(this.a);
        if(colorStateList0 != null) {
            a00.d = true;
            a00.a = colorStateList0;
        }
        PorterDuff.Mode porterDuff$Mode0 = Y.s(this.a);
        if(porterDuff$Mode0 != null) {
            a00.c = true;
            a00.b = porterDuff$Mode0;
        }
        if(!a00.d && !a00.c) {
            return false;
        }
        j.i(drawable0, a00, this.a.getDrawableState());
        return true;
    }

    void b() {
        Drawable drawable0 = this.a.getBackground();
        if(drawable0 == null || this.k() && this.a(drawable0)) {
            return;
        }
        a0 a00 = this.e;
        if(a00 != null) {
            j.i(drawable0, a00, this.a.getDrawableState());
            return;
        }
        a0 a01 = this.d;
        if(a01 != null) {
            j.i(drawable0, a01, this.a.getDrawableState());
        }
    }

    ColorStateList c() {
        return this.e == null ? null : this.e.a;
    }

    PorterDuff.Mode d() {
        return this.e == null ? null : this.e.b;
    }

    void e(AttributeSet attributeSet0, int v) {
        c0 c00 = c0.v(this.a.getContext(), attributeSet0, e.j.S3, v, 0);
        Context context0 = this.a.getContext();
        Y.m0(this.a, context0, e.j.S3, attributeSet0, c00.r(), v, 0);
        try {
            if(c00.s(e.j.T3)) {
                this.c = c00.n(0, -1);
                Context context1 = this.a.getContext();
                ColorStateList colorStateList0 = this.b.f(context1, this.c);
                if(colorStateList0 != null) {
                    this.h(colorStateList0);
                }
            }
            if(c00.s(e.j.U3)) {
                ColorStateList colorStateList1 = c00.c(1);
                Y.t0(this.a, colorStateList1);
            }
            if(c00.s(e.j.V3)) {
                PorterDuff.Mode porterDuff$Mode0 = L.e(c00.k(2, -1), null);
                Y.u0(this.a, porterDuff$Mode0);
            }
        }
        finally {
            c00.x();
        }
    }

    void f(Drawable drawable0) {
        this.c = -1;
        this.h(null);
        this.b();
    }

    void g(int v) {
        this.c = v;
        this.h((this.b == null ? null : this.b.f(this.a.getContext(), v)));
        this.b();
    }

    void h(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            this.d = null;
        }
        else {
            if(this.d == null) {
                this.d = new a0();
            }
            this.d.a = colorStateList0;
            this.d.d = true;
        }
        this.b();
    }

    void i(ColorStateList colorStateList0) {
        if(this.e == null) {
            this.e = new a0();
        }
        this.e.a = colorStateList0;
        this.e.d = true;
        this.b();
    }

    void j(PorterDuff.Mode porterDuff$Mode0) {
        if(this.e == null) {
            this.e = new a0();
        }
        this.e.b = porterDuff$Mode0;
        this.e.c = true;
        this.b();
    }

    private boolean k() {
        return this.d != null;
    }
}

