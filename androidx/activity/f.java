package androidx.activity;

import android.os.Bundle;
import androidx.savedstate.a.c;

public final class f implements c {
    public final ComponentActivity a;

    public f(ComponentActivity componentActivity0) {
        this.a = componentActivity0;
    }

    @Override  // androidx.savedstate.a$c
    public final Bundle a() {
        return this.a.F0();
    }
}

