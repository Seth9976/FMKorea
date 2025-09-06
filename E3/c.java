package e3;

import G3.h;
import z3.g;

public enum c {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final c a(String s) {
            if(s != null) {
                c[] arr_c = c.values();
                int v = arr_c.length;
                while(true) {
                    --v;
                    if(v < 0) {
                        break;
                    }
                    c c0 = arr_c[v];
                    if(h.n(c0.name(), s, true)) {
                        return c0 == null ? c.i : c0;
                    }
                }
            }
            return c.i;
        }
    }

    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;

    public static final a f;

    static {
        c.f = new a(null);
    }

    private static final c[] b() [...] // Inlined contents

    // 去混淆评级： 中等(60)
    public final boolean f() {
        return false;
    }

    public final boolean g() [...] // 潜在的解密器

    public final boolean h() [...] // 潜在的解密器

    public final boolean i() [...] // 潜在的解密器

    public final boolean j() [...] // 潜在的解密器
}

