package com.google.android.material.textfield;

import android.view.View.OnFocusChangeListener;
import android.view.View;

public final class n implements View.OnFocusChangeListener {
    public final q a;

    public n(q q0) {
        this.a = q0;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        q.y(this.a, view0, z);
    }
}

