package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout.f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect g;
    private final RectF h;
    private final RectF i;
    private final int[] j;

    public FabTransformationBehavior() {
        this.g = new Rect();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new int[2];
    }

    public FabTransformationBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.g = new Rect();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new int[2];
    }

    @Override  // com.google.android.material.transformation.ExpandableBehavior
    public boolean i(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
        if(view0.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public void k(f coordinatorLayout$f0) {
        if(coordinatorLayout$f0.h == 0) {
            coordinatorLayout$f0.h = 80;
        }
    }
}

