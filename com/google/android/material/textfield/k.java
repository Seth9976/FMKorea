package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class k implements View.OnTouchListener {
    public final q f;

    public k(q q0) {
        this.f = q0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return q.z(this.f, view0, motionEvent0);
    }
}

