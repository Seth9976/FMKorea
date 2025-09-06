package B3;

import java.util.Random;
import z3.k;

public final class b extends a {
    private final B3.b.a h;

    public b() {
        public static final class B3.b.a extends ThreadLocal {
            protected Random a() {
                return new Random();
            }

            @Override
            public Object initialValue() {
                return this.a();
            }
        }

        this.h = new B3.b.a();
    }

    @Override  // B3.a
    public Random d() {
        Object object0 = this.h.get();
        k.d(object0, "get(...)");
        return (Random)object0;
    }
}

