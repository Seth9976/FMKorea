package m1;

import k1.d;
import k1.f;
import q1.a;

public abstract class l {
    public static void a(f f0, d d0) {
        if(f0 instanceof s) {
            p p0 = ((s)f0).d().f(d0);
            u.c().e().u(p0, 1);
            return;
        }
        a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", f0);
    }
}

