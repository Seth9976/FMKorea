package androidx.work;

public interface n {
    static abstract class a {
    }

    public static abstract class b {
        public static final class androidx.work.n.b.a extends b {
            private final Throwable a;

            public androidx.work.n.b.a(Throwable throwable0) {
                this.a = throwable0;
            }

            public Throwable a() {
                return this.a;
            }

            @Override
            public String toString() {
                return "FAILURE (" + this.a.getMessage() + ")";
            }
        }

        public static final class androidx.work.n.b.b extends b {
            private androidx.work.n.b.b() {
            }

            androidx.work.n.b.b(a n$a0) {
            }

            @Override
            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends b {
            private c() {
            }

            c(a n$a0) {
            }

            @Override
            public String toString() {
                return "SUCCESS";
            }
        }

    }

    public static final c a;
    public static final androidx.work.n.b.b b;

    static {
        n.a = new c(null);
        n.b = new androidx.work.n.b.b(null);
    }
}

