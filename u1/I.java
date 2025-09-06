package u1;

import o1.b;

public final class i implements b {
    static abstract class a {
        private static final i a;

        static {
            a.a = new i();
        }

        static i a() {
            return a.a;
        }
    }

    public static i a() {
        return a.a();
    }

    // 去混淆评级： 低(20)
    public Integer b() {
        return 5;
    }

    // 去混淆评级： 低(20)
    public static int c() [...] // 潜在的解密器

    @Override  // k3.a
    public Object get() {
        return this.b();
    }
}

