package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import z1.k;

public abstract class e extends LinearLayoutCompat {
    private Drawable u;
    private final Rect v;
    private final Rect w;
    private int x;
    protected boolean y;
    boolean z;

    public e(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.v = new Rect();
        this.w = new Rect();
        this.x = 0x77;
        this.y = true;
        this.z = false;
        TypedArray typedArray0 = q.i(context0, attributeSet0, k.y2, v, 0, new int[0]);
        this.x = typedArray0.getInt(k.A2, this.x);
        Drawable drawable0 = typedArray0.getDrawable(k.z2);
        if(drawable0 != null) {
            this.setForeground(drawable0);
        }
        this.y = typedArray0.getBoolean(k.B2, true);
        typedArray0.recycle();
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        super.draw(canvas0);
        Drawable drawable0 = this.u;
        if(drawable0 != null) {
            if(this.z) {
                this.z = false;
                Rect rect0 = this.v;
                Rect rect1 = this.w;
                int v = this.getRight() - this.getLeft();
                int v1 = this.getBottom() - this.getTop();
                if(this.y) {
                    rect0.set(0, 0, v, v1);
                }
                else {
                    rect0.set(this.getPaddingLeft(), this.getPaddingTop(), v - this.getPaddingRight(), v1 - this.getPaddingBottom());
                }
                Gravity.apply(this.x, drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), rect0, rect1);
                drawable0.setBounds(rect1);
            }
            drawable0.draw(canvas0);
        }
    }

    @Override  // android.view.View
    public void drawableHotspotChanged(float f, float f1) {
        super.drawableHotspotChanged(f, f1);
        Drawable drawable0 = this.u;
        if(drawable0 != null) {
            drawable0.setHotspot(f, f1);
        }
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if(this.u != null && this.u.isStateful()) {
            this.u.setState(this.getDrawableState());
        }
    }

    @Override  // android.view.View
    public Drawable getForeground() {
        return this.u;
    }

    @Override  // android.view.View
    public int getForegroundGravity() {
        return this.x;
    }

    @Override  // android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable0 = this.u;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.z |= z;
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.z = true;
    }

    @Override  // android.view.View
    public void setForeground(Drawable drawable0) {
        Drawable drawable1 = this.u;
        if(drawable1 != drawable0) {
            if(drawable1 != null) {
                drawable1.setCallback(null);
                this.unscheduleDrawable(this.u);
            }
            this.u = drawable0;
            this.z = true;
            if(drawable0 == null) {
                this.setWillNotDraw(true);
            }
            else {
                this.setWillNotDraw(false);
                drawable0.setCallback(this);
                if(drawable0.isStateful()) {
                    drawable0.setState(this.getDrawableState());
                }
                if(this.x == 0x77) {
                    drawable0.getPadding(new Rect());
                }
            }
            this.requestLayout();
            this.invalidate();
        }
    }

    @Override  // android.view.View
    public void setForegroundGravity(int v) {
        if(this.x != v) {
            if((0x800007 & v) == 0) {
                v |= 0x800003;
            }
            if((v & 0x70) == 0) {
                v |= 0x30;
            }
            this.x = v;
            if(v == 0x77 && this.u != null) {
                Rect rect0 = new Rect();
                this.u.getPadding(rect0);
            }
            this.requestLayout();
        }
    }

    @Override  // android.view.View
    protected boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.u;
    }
}

