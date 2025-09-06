package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.Y;
import androidx.core.widget.e;
import f.a;

public class p {
    private final ImageView a;
    private a0 b;
    private a0 c;
    private a0 d;
    private int e;

    public p(ImageView imageView0) {
        this.e = 0;
        this.a = imageView0;
    }

    private boolean a(Drawable drawable0) {
        if(this.d == null) {
            this.d = new a0();
        }
        a0 a00 = this.d;
        a00.a();
        ColorStateList colorStateList0 = e.a(this.a);
        if(colorStateList0 != null) {
            a00.d = true;
            a00.a = colorStateList0;
        }
        PorterDuff.Mode porterDuff$Mode0 = e.b(this.a);
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
        if(this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.e);
        }
    }

    void c() {
        Drawable drawable0 = this.a.getDrawable();
        if(drawable0 != null) {
            L.b(drawable0);
        }
        if(drawable0 == null || this.l() && this.a(drawable0)) {
            return;
        }
        a0 a00 = this.c;
        if(a00 != null) {
            j.i(drawable0, a00, this.a.getDrawableState());
            return;
        }
        a0 a01 = this.b;
        if(a01 != null) {
            j.i(drawable0, a01, this.a.getDrawableState());
        }
    }

    ColorStateList d() {
        return this.c == null ? null : this.c.a;
    }

    PorterDuff.Mode e() {
        return this.c == null ? null : this.c.b;
    }

    boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet0, int v) {
        c0 c00 = c0.v(this.a.getContext(), attributeSet0, e.j.P, v, 0);
        Context context0 = this.a.getContext();
        Y.m0(this.a, context0, e.j.P, attributeSet0, c00.r(), v, 0);
        try {
            Drawable drawable0 = this.a.getDrawable();
            if(drawable0 == null) {
                int v2 = c00.n(e.j.Q, -1);
                if(v2 != -1) {
                    drawable0 = a.b(this.a.getContext(), v2);
                    if(drawable0 != null) {
                        this.a.setImageDrawable(drawable0);
                    }
                }
            }
            if(drawable0 != null) {
                L.b(drawable0);
            }
            if(c00.s(e.j.R)) {
                ColorStateList colorStateList0 = c00.c(2);
                e.c(this.a, colorStateList0);
            }
            if(c00.s(e.j.S)) {
                PorterDuff.Mode porterDuff$Mode0 = L.e(c00.k(3, -1), null);
                e.d(this.a, porterDuff$Mode0);
            }
        }
        finally {
            c00.x();
        }
    }

    void h(Drawable drawable0) {
        this.e = drawable0.getLevel();
    }

    public void i(int v) {
        if(v == 0) {
            this.a.setImageDrawable(null);
        }
        else {
            Drawable drawable0 = a.b(this.a.getContext(), v);
            if(drawable0 != null) {
                L.b(drawable0);
            }
            this.a.setImageDrawable(drawable0);
        }
        this.c();
    }

    void j(ColorStateList colorStateList0) {
        if(this.c == null) {
            this.c = new a0();
        }
        this.c.a = colorStateList0;
        this.c.d = true;
        this.c();
    }

    void k(PorterDuff.Mode porterDuff$Mode0) {
        if(this.c == null) {
            this.c = new a0();
        }
        this.c.b = porterDuff$Mode0;
        this.c.c = true;
        this.c();
    }

    private boolean l() {
        return this.b != null;
    }
}

