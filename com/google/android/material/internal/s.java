package com.google.android.material.internal;

import android.view.View;

public final class s implements Runnable {
    public final View f;
    public final boolean g;

    public s(View view0, boolean z) {
        this.f = view0;
        this.g = z;
    }

    @Override
    public final void run() {
        t.a(this.f, this.g);
    }
}

