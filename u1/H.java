package u1;

import android.content.Context;
import k3.a;
import o1.b;
import o1.d;

public final class h implements b {
    private final a a;

    public h(a a0) {
        this.a = a0;
    }

    public static h a(a a0) {
        return new h(a0);
    }

    public String b() {
        return h.c(((Context)this.a.get()));
    }

    public static String c(Context context0) {
        return (String)d.c(f.b(context0), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override  // k3.a
    public Object get() {
        return this.b();
    }
}

