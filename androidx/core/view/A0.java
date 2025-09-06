package androidx.core.view;

import B.i;
import android.view.ViewConfiguration;

public final class a0 implements i {
    public final ViewConfiguration a;

    public a0(ViewConfiguration viewConfiguration0) {
        this.a = viewConfiguration0;
    }

    @Override  // B.i
    public final Object get() {
        return this.a.getScaledMaximumFlingVelocity();
    }
}

