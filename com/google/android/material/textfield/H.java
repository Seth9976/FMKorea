package com.google.android.material.textfield;

import S1.g.c;
import S1.g;
import S1.k;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

abstract class h extends g {
    static abstract class a {
    }

    static final class b extends c {
        private final RectF w;

        private b(k k0, RectF rectF0) {
            super(k0, null);
            this.w = rectF0;
        }

        b(k k0, RectF rectF0, a h$a0) {
            this(k0, rectF0);
        }

        private b(b h$b0) {
            super(h$b0);
            this.w = h$b0.w;
        }

        b(b h$b0, a h$a0) {
            this(h$b0);
        }

        @Override  // S1.g$c
        public Drawable newDrawable() {
            Drawable drawable0 = h.i0(this);
            ((g)drawable0).invalidateSelf();
            return drawable0;
        }
    }

    static class com.google.android.material.textfield.h.c extends h {
        com.google.android.material.textfield.h.c(b h$b0) {
            super(h$b0, null);
        }

        @Override  // S1.g
        protected void r(Canvas canvas0) {
            if(this.E.w.isEmpty()) {
                super.r(canvas0);
                return;
            }
            canvas0.save();
            if(Build.VERSION.SDK_INT >= 26) {
                canvas0.clipOutRect(this.E.w);
            }
            else {
                canvas0.clipRect(this.E.w, Region.Op.DIFFERENCE);
            }
            super.r(canvas0);
            canvas0.restore();
        }
    }

    b E;

    private h(b h$b0) {
        super(h$b0);
        this.E = h$b0;
    }

    h(b h$b0, a h$a0) {
        this(h$b0);
    }

    static h h0(k k0) {
        if(k0 == null) {
            k0 = new k();
        }
        return h.i0(new b(k0, new RectF(), null));
    }

    private static h i0(b h$b0) {
        return new com.google.android.material.textfield.h.c(h$b0);
    }

    boolean j0() {
        return !b.a(this.E).isEmpty();
    }

    void k0() {
        this.l0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void l0(float f, float f1, float f2, float f3) {
        if(f != b.a(this.E).left || f1 != b.a(this.E).top || f2 != b.a(this.E).right || f3 != b.a(this.E).bottom) {
            b.a(this.E).set(f, f1, f2, f3);
            this.invalidateSelf();
        }
    }

    void m0(RectF rectF0) {
        this.l0(rectF0.left, rectF0.top, rectF0.right, rectF0.bottom);
    }

    @Override  // S1.g
    public Drawable mutate() {
        this.E = new b(this.E, null);
        return this;
    }
}

