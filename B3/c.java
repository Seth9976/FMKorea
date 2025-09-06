package B3;

import java.io.Serializable;
import t3.b;
import z3.g;

public abstract class c {
    public static final class a extends c implements Serializable {
        static final class B3.c.a.a implements Serializable {
            public static final B3.c.a.a f;
            private static final long serialVersionUID;

            static {
                B3.c.a.a.f = new B3.c.a.a();
            }

            private final Object readResolve() {
                return c.f;
            }
        }

        private a() {
        }

        public a(g g0) {
        }

        @Override  // B3.c
        public int b() {
            return c.g.b();
        }

        @Override  // B3.c
        public int c(int v) {
            return c.g.c(v);
        }

        private final Object writeReplace() {
            return B3.c.a.a.f;
        }
    }

    public static final a f;
    private static final c g;

    static {
        c.f = new a(null);
        c.g = b.a.b();
    }

    public abstract int b();

    public abstract int c(int arg1);
}

