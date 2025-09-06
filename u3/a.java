package u3;

import android.os.Build.VERSION;
import z3.k;

public abstract class a extends t3.a {
    static final class u3.a.a {
        public static final u3.a.a a;
        public static final Integer b;

        static {
            u3.a.a.a = new u3.a.a();
            Integer integer0 = null;
            Integer integer1 = Build.VERSION.SDK_INT;
            Integer integer2 = integer1 instanceof Integer ? integer1 : null;
            if(integer2 != null && integer2.intValue() > 0) {
                integer0 = integer2;
            }
            u3.a.a.b = integer0;
        }
    }

    @Override  // t3.a
    public void a(Throwable throwable0, Throwable throwable1) {
        k.e(throwable0, "cause");
        k.e(throwable1, "exception");
        throwable0.addSuppressed(throwable1);
    }

    private final boolean c(int v) [...] // 潜在的解密器
}

