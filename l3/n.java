package l3;

import java.io.Serializable;
import z3.g;
import z3.k;

public abstract class n implements Serializable {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    public static final class b implements Serializable {
        public final Throwable f;

        public b(Throwable throwable0) {
            k.e(throwable0, "exception");
            super();
            this.f = throwable0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof b && k.a(this.f, ((b)object0).f);
        }

        @Override
        public int hashCode() {
            return this.f.hashCode();
        }

        @Override
        public String toString() {
            return "Failure(" + this.f + ')';
        }
    }

    public static final a f;

    static {
        n.f = new a(null);
    }

    public static Object a(Object object0) [...] // Inlined contents

    // 去混淆评级： 低(20)
    public static final Throwable b(Object object0) {
        return object0 instanceof b ? ((b)object0).f : null;
    }

    public static final boolean c(Object object0) {
        return object0 instanceof b;
    }
}

