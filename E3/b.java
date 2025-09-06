package e3;

import z3.g;
import z3.k;

public enum b {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final b a(String s) {
            if(s != null) {
                b[] arr_b = b.values();
                int v = arr_b.length;
                while(true) {
                    --v;
                    if(v < 0) {
                        break;
                    }
                    b b0 = arr_b[v];
                    if(b0.f(s)) {
                        return b0 == null ? b.i : b0;
                    }
                }
            }
            return b.i;
        }
    }

    IAM("iam"),
    NOTIFICATION("notification");

    private final String f;
    public static final a g;

    static {
        b.g = new a(null);
    }

    private b(String s1) {
        this.f = s1;
    }

    private static final b[] b() [...] // Inlined contents

    public final boolean f(String s) {
        k.e(s, "otherName");
        return k.a(this.f, s);
    }

    @Override
    public String toString() {
        return this.f;
    }
}

