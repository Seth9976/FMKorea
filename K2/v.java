package K2;

import H3.c;
import H3.d;
import android.os.SystemClock;
import z3.g;

public final class v implements w {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    public static final a a;

    static {
        v.a = new a(null);
    }

    @Override  // K2.w
    public long a() {
        return c.p(SystemClock.elapsedRealtime(), d.i);
    }

    @Override  // K2.w
    public long b() {
        return System.currentTimeMillis() * 1000L;
    }
}

