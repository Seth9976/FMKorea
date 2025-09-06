package z2;

import B2.b;
import android.content.Context;

public final class c implements b {
    public final Context a;
    public final String b;

    public c(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override  // B2.b
    public final Object get() {
        return f.d(this.a, this.b);
    }
}

