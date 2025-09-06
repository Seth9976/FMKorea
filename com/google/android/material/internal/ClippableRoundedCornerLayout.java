package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ClippableRoundedCornerLayout extends FrameLayout {
    private Path f;
    private float g;

    public ClippableRoundedCornerLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        if(this.f == null) {
            super.dispatchDraw(canvas0);
            return;
        }
        int v = canvas0.save();
        canvas0.clipPath(this.f);
        super.dispatchDraw(canvas0);
        canvas0.restoreToCount(v);
    }

    public float getCornerRadius() {
        return this.g;
    }
}

