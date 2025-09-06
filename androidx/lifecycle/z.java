package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a.c;

public final class z implements c {
    public final A a;

    public z(A a0) {
        this.a = a0;
    }

    @Override  // androidx.savedstate.a$c
    public final Bundle a() {
        return A.d(this.a);
    }
}

