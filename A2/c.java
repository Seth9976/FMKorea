package a2;

import B2.b;
import android.content.Context;

public final class c implements b {
    public final e a;
    public final Context b;

    public c(e e0, Context context0) {
        this.a = e0;
        this.b = context0;
    }

    @Override  // B2.b
    public final Object get() {
        return e.b(this.a, this.b);
    }
}

