package androidx.fragment.app;

import android.os.Bundle;
import androidx.savedstate.a.c;

public final class t implements c {
    public final FragmentManager a;

    public t(FragmentManager fragmentManager0) {
        this.a = fragmentManager0;
    }

    @Override  // androidx.savedstate.a$c
    public final Bundle a() {
        return this.a.P0();
    }
}

