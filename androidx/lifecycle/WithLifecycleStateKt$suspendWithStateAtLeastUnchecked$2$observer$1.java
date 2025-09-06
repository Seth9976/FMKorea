package androidx.lifecycle;

import l3.o;
import y3.a;
import z3.k;

public final class WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.observer.1 implements l {
    final b f;
    final h g;
    final I3.l h;
    final a i;

    @Override  // androidx.lifecycle.l
    public void c(n n0, androidx.lifecycle.h.a h$a0) {
        Object object0;
        k.e(n0, "source");
        k.e(h$a0, "event");
        if(h$a0 == androidx.lifecycle.h.a.Companion.c(this.f)) {
            this.g.c(this);
            I3.l l0 = this.h;
            try {
                object0 = l3.n.a(this.i.a());
            }
            catch(Throwable throwable0) {
                object0 = l3.n.a(o.a(throwable0));
            }
            l0.e(object0);
            return;
        }
        if(h$a0 == androidx.lifecycle.h.a.ON_DESTROY) {
            this.g.c(this);
            Object object1 = l3.n.a(o.a(new j()));
            this.h.e(object1);
        }
    }
}

