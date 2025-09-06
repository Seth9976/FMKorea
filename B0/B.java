package b0;

import I3.P;
import Z1.d;
import androidx.concurrent.futures.c;
import java.util.concurrent.CancellationException;
import l3.u;
import z3.k;
import z3.l;

public abstract class b {
    public static final d b(P p0, Object object0) {
        static final class a extends l implements y3.l {
            final androidx.concurrent.futures.c.a g;
            final P h;

            a(androidx.concurrent.futures.c.a c$a0, P p0) {
                this.g = c$a0;
                this.h = p0;
                super(1);
            }

            public final void b(Throwable throwable0) {
                if(throwable0 != null) {
                    if(throwable0 instanceof CancellationException) {
                        this.g.c();
                        return;
                    }
                    this.g.e(throwable0);
                    return;
                }
                Object object0 = this.h.g();
                this.g.b(object0);
            }

            @Override  // y3.l
            public Object h(Object object0) {
                this.b(((Throwable)object0));
                return u.a;
            }
        }

        k.e(p0, "<this>");
        d d0 = c.a((androidx.concurrent.futures.c.a c$a0) -> {
            k.e(p0, "$this_asListenableFuture");
            k.e(c$a0, "completer");
            p0.f(new a(c$a0, p0));
            return object0;
        });
        k.d(d0, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return d0;
    }

    public static d c(P p0, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = "Deferred.asListenableFuture";
        }
        return b.b(p0, object0);
    }

    // 检测为 Lambda 实现
    private static final Object d(P p0, Object object0, androidx.concurrent.futures.c.a c$a0) [...]
}

