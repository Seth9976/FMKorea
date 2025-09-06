package androidx.core.view;

import B.i;
import android.view.ViewConfiguration;

public final class b0 implements i {
    public final ViewConfiguration a;

    public b0(ViewConfiguration viewConfiguration0) {
        this.a = viewConfiguration0;
    }

    @Override  // B.i
    public final Object get() {
        return this.a.getScaledMinimumFlingVelocity();
    }
}

