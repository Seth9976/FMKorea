package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import androidx.core.view.Y;
import e.j;

class x extends s {
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;

    x(SeekBar seekBar0) {
        super(seekBar0);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar0;
    }

    @Override  // androidx.appcompat.widget.s
    void c(AttributeSet attributeSet0, int v) {
        super.c(attributeSet0, v);
        c0 c00 = c0.v(this.d.getContext(), attributeSet0, j.T, v, 0);
        Context context0 = this.d.getContext();
        Y.m0(this.d, context0, j.T, attributeSet0, c00.r(), v, 0);
        Drawable drawable0 = c00.h(j.U);
        if(drawable0 != null) {
            this.d.setThumb(drawable0);
        }
        this.j(c00.g(j.V));
        if(c00.s(j.X)) {
            this.g = L.e(c00.k(3, -1), this.g);
            this.i = true;
        }
        if(c00.s(j.W)) {
            this.f = c00.c(2);
            this.h = true;
        }
        c00.x();
        this.f();
    }

    private void f() {
        Drawable drawable0 = this.e;
        if(drawable0 != null && (this.h || this.i)) {
            Drawable drawable1 = a.r(drawable0.mutate());
            this.e = drawable1;
            if(this.h) {
                a.o(drawable1, this.f);
            }
            if(this.i) {
                a.p(this.e, this.g);
            }
            if(this.e.isStateful()) {
                this.e.setState(this.d.getDrawableState());
            }
        }
    }

    void g(Canvas canvas0) {
        if(this.e != null) {
            int v = this.d.getMax();
            int v1 = 1;
            if(v > 1) {
                int v2 = this.e.getIntrinsicWidth();
                int v3 = this.e.getIntrinsicHeight();
                int v4 = v2 < 0 ? 1 : v2 / 2;
                if(v3 >= 0) {
                    v1 = v3 / 2;
                }
                this.e.setBounds(-v4, -v1, v4, v1);
                int v5 = this.d.getWidth();
                int v6 = this.d.getPaddingLeft();
                int v7 = this.d.getPaddingRight();
                int v8 = canvas0.save();
                canvas0.translate(((float)this.d.getPaddingLeft()), ((float)(this.d.getHeight() / 2)));
                for(int v9 = 0; v9 <= v; ++v9) {
                    this.e.draw(canvas0);
                    canvas0.translate(((float)(v5 - v6 - v7)) / ((float)v), 0.0f);
                }
                canvas0.restoreToCount(v8);
            }
        }
    }

    void h() {
        Drawable drawable0 = this.e;
        if(drawable0 != null && drawable0.isStateful() && drawable0.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable0);
        }
    }

    void i() {
        Drawable drawable0 = this.e;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
    }

    void j(Drawable drawable0) {
        Drawable drawable1 = this.e;
        if(drawable1 != null) {
            drawable1.setCallback(null);
        }
        this.e = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this.d);
            a.m(drawable0, this.d.getLayoutDirection());
            if(drawable0.isStateful()) {
                drawable0.setState(this.d.getDrawableState());
            }
            this.f();
        }
        this.d.invalidate();
    }
}

