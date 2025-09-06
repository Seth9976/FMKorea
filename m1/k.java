package m1;

import java.util.concurrent.Executor;
import o1.b;
import o1.d;

public final class k implements b {
    static abstract class a {
        private static final k a;

        static {
            a.a = new k();
        }

        static k a() {
            return a.a;
        }
    }

    public static k a() {
        return a.a();
    }

    public static Executor b() {
        return (Executor)d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public Executor c() {
        return k.b();
    }

    @Override  // k3.a
    public Object get() {
        return this.c();
    }
}

