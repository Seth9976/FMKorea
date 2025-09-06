package androidx.appcompat.app;

import android.view.KeyEvent;
import androidx.core.view.t.a;

public final class x implements a {
    public final y f;

    public x(y y0) {
        this.f = y0;
    }

    @Override  // androidx.core.view.t$a
    public final boolean W(KeyEvent keyEvent0) {
        return this.f.i(keyEvent0);
    }
}

