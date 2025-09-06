package androidx.lifecycle;

import I3.v0;
import p3.j;
import z3.k;

public final class LifecycleCoroutineScopeImpl extends i implements l {
    private final h f;
    private final j g;

    @Override  // androidx.lifecycle.l
    public void c(n n0, a h$a0) {
        k.e(n0, "source");
        k.e(h$a0, "event");
        if(this.i().b().compareTo(b.f) <= 0) {
            this.i().c(this);
            v0.d(this.h(), null, 1, null);
        }
    }

    @Override  // I3.I
    public j h() {
        return this.g;
    }

    public h i() {
        return this.f;
    }
}

