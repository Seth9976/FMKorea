package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.G;
import androidx.core.view.Y;
import androidx.core.view.y0;
import z1.j;

public abstract class k extends FrameLayout {
    Drawable f;
    Rect g;
    private Rect h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;

    public k(Context context0, AttributeSet attributeSet0, int v) {
        class a implements G {
            final k a;

            @Override  // androidx.core.view.G
            public y0 a(View view0, y0 y00) {
                k k0 = k.this;
                if(k0.g == null) {
                    k0.g = new Rect();
                }
                k.this.g.set(y00.j(), y00.l(), y00.k(), y00.i());
                k.this.e(y00);
                boolean z = !y00.n() || k.this.f == null;
                k.this.setWillNotDraw(z);
                Y.f0(k.this);
                return y00.c();
            }
        }

        super(context0, attributeSet0, v);
        this.h = new Rect();
        this.i = true;
        this.j = true;
        this.k = true;
        this.l = true;
        TypedArray typedArray0 = q.i(context0, attributeSet0, z1.k.m6, v, j.j, new int[0]);
        this.f = typedArray0.getDrawable(z1.k.n6);
        typedArray0.recycle();
        this.setWillNotDraw(true);
        Y.B0(this, new a(this));
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        super.draw(canvas0);
        int v = this.getWidth();
        int v1 = this.getHeight();
        if(this.g != null && this.f != null) {
            int v2 = canvas0.save();
            canvas0.translate(((float)this.getScrollX()), ((float)this.getScrollY()));
            if(this.i) {
                this.h.set(0, 0, v, this.g.top);
                this.f.setBounds(this.h);
                this.f.draw(canvas0);
            }
            if(this.j) {
                this.h.set(0, v1 - this.g.bottom, v, v1);
                this.f.setBounds(this.h);
                this.f.draw(canvas0);
            }
            if(this.k) {
                this.h.set(0, this.g.top, this.g.left, v1 - this.g.bottom);
                this.f.setBounds(this.h);
                this.f.draw(canvas0);
            }
            if(this.l) {
                this.h.set(v - this.g.right, this.g.top, v, v1 - this.g.bottom);
                this.f.setBounds(this.h);
                this.f.draw(canvas0);
            }
            canvas0.restoreToCount(v2);
        }
    }

    protected abstract void e(y0 arg1);

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.setCallback(this);
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.j = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.k = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.l = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.i = z;
    }

    public void setScrimInsetForeground(Drawable drawable0) {
        this.f = drawable0;
    }
}

