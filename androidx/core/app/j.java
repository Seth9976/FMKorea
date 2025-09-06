package androidx.core.app;

import android.content.res.Configuration;
import z3.k;

public final class j {
    private final boolean a;
    private Configuration b;

    public j(boolean z) {
        this.a = z;
    }

    public j(boolean z, Configuration configuration0) {
        k.e(configuration0, "newConfig");
        this(z);
        this.b = configuration0;
    }

    public final boolean a() {
        return this.a;
    }
}

