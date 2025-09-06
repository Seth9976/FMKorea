package M;

import java.util.Map;
import m3.F;
import z3.k;

public abstract class d {
    public static final class a {
        private final String a;

        public a(String s) {
            k.e(s, "name");
            super();
            this.a = s;
        }

        public final String a() {
            return this.a;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof a ? k.a(this.a, ((a)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    public static abstract class b {
    }

    public abstract Map a();

    public abstract Object b(a arg1);

    public final M.a c() {
        return new M.a(F.t(this.a()), false);
    }

    public final d d() {
        return new M.a(F.t(this.a()), true);
    }
}

