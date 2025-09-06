package K3;

import z3.g;
import z3.k;

public abstract class f {
    public static final class a extends c {
        public final Throwable a;

        public a(Throwable throwable0) {
            this.a = throwable0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof a && k.a(this.a, ((a)object0).a);
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override  // K3.f$c
        public String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public b(g g0) {
        }

        public final Object a(Throwable throwable0) {
            return f.b(new a(throwable0));
        }

        public final Object b() {
            return f.b;
        }

        public final Object c(Object object0) {
            return object0;
        }
    }

    public static class c {
        @Override
        public String toString() {
            return "Failed";
        }
    }

    public static final b a;
    private static final c b;

    static {
        f.a = new b(null);
        f.b = new c();
    }

    public static Object b(Object object0) [...] // Inlined contents

    public static final Throwable c(Object object0) {
        a f$a0 = object0 instanceof a ? ((a)object0) : null;
        return f$a0 == null ? null : f$a0.a;
    }

    // 去混淆评级： 低(20)
    public static final Object d(Object object0) {
        return object0 instanceof c ? null : object0;
    }

    public static final boolean e(Object object0) {
        return object0 instanceof a;
    }

    public static final boolean f(Object object0) {
        return !(object0 instanceof c);
    }
}

