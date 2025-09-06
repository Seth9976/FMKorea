package C0;

import G3.h;
import z3.g;
import z3.k;

public abstract class b {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final C0.a a(String s) {
            k.e(s, "iconName");
            if(h.u(s, "custom", false, 2, null)) {
                return C0.a.d.a();
            }
            if(h.u(s, "fas", false, 2, null)) {
                return C0.a.d.e();
            }
            if(h.u(s, "fab", false, 2, null)) {
                return C0.a.d.b();
            }
            if(h.u(s, "far", false, 2, null)) {
                return C0.a.d.d();
            }
            if(h.u(s, "fal", false, 2, null)) {
                return C0.a.d.c();
            }
            if(h.u(s, "fat", false, 2, null)) {
                return C0.a.d.f();
            }
            return h.u(s, "md", false, 2, null) ? C0.a.d.g() : C0.a.d.e();
        }
    }

    public static final a a;

    static {
        b.a = new a(null);
    }
}

