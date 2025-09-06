package com.google.android.material.textfield;

import android.widget.AutoCompleteTextView.OnDismissListener;

public final class l implements AutoCompleteTextView.OnDismissListener {
    public final q a;

    public l(q q0) {
        this.a = q0;
    }

    @Override  // android.widget.AutoCompleteTextView$OnDismissListener
    public final void onDismiss() {
        q.A(this.a);
    }
}

