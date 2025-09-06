package u1;

import o1.b;
import o1.d;

public final class j implements b {
    static abstract class a {
        private static final j a;

        static {
            a.a = new j();
        }

        static j a() {
            return a.a;
        }
    }

    public static j a() {
        return a.a();
    }

    public e b() {
        return j.c();
    }

    public static e c() {
        return (e)d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override  // k3.a
    public Object get() {
        return this.b();
    }
}

