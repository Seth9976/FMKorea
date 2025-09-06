package androidx.lifecycle;

import z3.k;

public final class SavedStateHandleAttacher implements l {
    private final C f;

    public SavedStateHandleAttacher(C c0) {
        k.e(c0, "provider");
        super();
        this.f = c0;
    }

    @Override  // androidx.lifecycle.l
    public void c(n n0, a h$a0) {
        k.e(n0, "source");
        k.e(h$a0, "event");
        if(h$a0 != a.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + h$a0).toString());
        }
        n0.getLifecycle().c(this);
        this.f.d();
    }
}

