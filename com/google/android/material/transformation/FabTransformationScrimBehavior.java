package com.google.android.material.transformation;

import A1.e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    private final e g;
    private final e h;

    public FabTransformationScrimBehavior() {
        this.g = new e(75L, 150L);
        this.h = new e(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.g = new e(75L, 150L);
        this.h = new e(0L, 150L);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean H(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        return super.H(coordinatorLayout0, view0, motionEvent0);
    }

    @Override  // com.google.android.material.transformation.ExpandableBehavior
    public boolean i(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
        return false;
    }
}

