package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.a;
import androidx.core.view.Y;
import androidx.core.widget.b;
import e.j;

class h {
    private final CheckedTextView a;
    private ColorStateList b;
    private PorterDuff.Mode c;
    private boolean d;
    private boolean e;
    private boolean f;

    h(CheckedTextView checkedTextView0) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.a = checkedTextView0;
    }

    void a() {
        Drawable drawable0 = b.a(this.a);
        if(drawable0 != null && (this.d || this.e)) {
            Drawable drawable1 = drawable0.mutate();
            if(this.d) {
                a.o(drawable1, this.b);
            }
            if(this.e) {
                a.p(drawable1, this.c);
            }
            if(drawable1.isStateful()) {
                drawable1.setState(this.a.getDrawableState());
            }
            this.a.setCheckMarkDrawable(drawable1);
        }
    }

    ColorStateList b() {
        return this.b;
    }

    PorterDuff.Mode c() {
        return this.c;
    }

    void d(AttributeSet attributeSet0, int v) {
        c0 c00 = c0.v(this.a.getContext(), attributeSet0, j.P0, v, 0);
        Context context0 = this.a.getContext();
        Y.m0(this.a, context0, j.P0, attributeSet0, c00.r(), v, 0);
        try {
            if(c00.s(j.R0)) {
                int v2 = c00.n(1, 0);
                if(v2 != 0) {
                    try {
                        Drawable drawable0 = f.a.b(this.a.getContext(), v2);
                        this.a.setCheckMarkDrawable(drawable0);
                        goto label_15;
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                }
                goto label_10;
            }
            else {
            label_10:
                if(c00.s(j.Q0)) {
                    int v3 = c00.n(0, 0);
                    if(v3 != 0) {
                        Drawable drawable1 = f.a.b(this.a.getContext(), v3);
                        this.a.setCheckMarkDrawable(drawable1);
                    }
                }
            }
        label_15:
            if(c00.s(j.S0)) {
                ColorStateList colorStateList0 = c00.c(2);
                b.b(this.a, colorStateList0);
            }
            if(c00.s(j.T0)) {
                PorterDuff.Mode porterDuff$Mode0 = L.e(c00.k(3, -1), null);
                b.c(this.a, porterDuff$Mode0);
            }
        }
        finally {
            c00.x();
        }
    }

    void e() {
        if(this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        this.a();
    }

    void f(ColorStateList colorStateList0) {
        this.b = colorStateList0;
        this.d = true;
        this.a();
    }

    void g(PorterDuff.Mode porterDuff$Mode0) {
        this.c = porterDuff$Mode0;
        this.e = true;
        this.a();
    }
}

