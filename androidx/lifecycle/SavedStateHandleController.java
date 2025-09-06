package androidx.lifecycle;

import z3.k;

public final class SavedStateHandleController implements l {
    private final String f;
    private final A g;
    private boolean h;

    public SavedStateHandleController(String s, A a0) {
        k.e(s, "key");
        k.e(a0, "handle");
        super();
        this.f = s;
        this.g = a0;
    }

    @Override  // androidx.lifecycle.l
    public void c(n n0, a h$a0) {
        k.e(n0, "source");
        k.e(h$a0, "event");
        if(h$a0 == a.ON_DESTROY) {
            this.h = false;
            n0.getLifecycle().c(this);
        }
    }

    public final void h(androidx.savedstate.a a0, h h0) {
        k.e(a0, "registry");
        k.e(h0, "lifecycle");
        if(this.h) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.h = true;
        h0.a(this);
        a0.h(this.f, this.g.c());
    }

    public final A i() {
        return this.g;
    }

    public final boolean j() {
        return this.h;
    }
}

