package androidx.privacysandbox.ads.adservices.topics;

import a0.b;
import android.content.Context;
import z3.g;
import z3.k;

public abstract class f {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final f a(Context context0) {
            k.e(context0, "context");
            b b0 = b.a;
            if(b0.a() >= 5) {
                return new n(context0);
            }
            return b0.a() == 4 ? new i(context0) : null;
        }
    }

    public static final a a;

    static {
        f.a = new a(null);
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.topics.b arg1, p3.f arg2);
}

