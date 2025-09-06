package I3;

import java.io.Closeable;
import p3.b;
import z3.g;
import z3.l;

public abstract class g0 extends F implements Closeable {
    public static final class a extends b {
        private a() {
            static final class I3.g0.a.a extends l implements y3.l {
                public static final I3.g0.a.a g;

                static {
                    I3.g0.a.a.g = new I3.g0.a.a();
                }

                I3.g0.a.a() {
                    super(1);
                }

                // 去混淆评级： 低(20)
                public final g0 b(p3.j.b j$b0) {
                    return j$b0 instanceof g0 ? ((g0)j$b0) : null;
                }

                @Override  // y3.l
                public Object h(Object object0) {
                    return this.b(((p3.j.b)object0));
                }
            }

            super(F.g, I3.g0.a.a.g);
        }

        public a(g g0) {
        }
    }

    public static final a h;

    static {
        g0.h = new a(null);
    }
}

