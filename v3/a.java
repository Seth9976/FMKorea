package v3;

import B3.c;
import android.os.Build.VERSION;

public class a extends u3.a {
    static final class v3.a.a {
        public static final v3.a.a a;
        public static final Integer b;

        static {
            v3.a.a.a = new v3.a.a();
            Integer integer0 = null;
            Integer integer1 = Build.VERSION.SDK_INT;
            Integer integer2 = integer1 instanceof Integer ? integer1 : null;
            if(integer2 != null && integer2.intValue() > 0) {
                integer0 = integer2;
            }
            v3.a.a.b = integer0;
        }
    }

    // 去混淆评级： 低(30)
    @Override  // t3.a
    public c b() {
        return super.b();
    }

    private final boolean c(int v) [...] // 潜在的解密器
}

