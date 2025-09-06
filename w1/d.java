package W1;

public class d {
    public static final class a {
        private boolean a;
        private String b;
        private W1.a c;

        public d a() {
            return new d(this, null);
        }

        public a b(boolean z) {
            this.a = z;
            return this;
        }

        static W1.a c(a d$a0) {
            return d$a0.c;
        }

        static String d(a d$a0) {
            return d$a0.b;
        }

        static boolean e(a d$a0) {
            return d$a0.a;
        }
    }

    private final boolean a;
    private final String b;
    private final W1.a c;

    d(a d$a0, h h0) {
        this.a = a.e(d$a0);
        this.b = a.d(d$a0);
        this.c = a.c(d$a0);
    }

    public W1.a a() {
        return this.c;
    }

    public boolean b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }
}

