package androidx.lifecycle;

import z3.k;

public final class CompositeGeneratedAdaptersObserver implements l {
    private final f[] f;

    public CompositeGeneratedAdaptersObserver(f[] arr_f) {
        k.e(arr_f, "generatedAdapters");
        super();
        this.f = arr_f;
    }

    @Override  // androidx.lifecycle.l
    public void c(n n0, a h$a0) {
        k.e(n0, "source");
        k.e(h$a0, "event");
        new r();
        f[] arr_f = this.f;
        if(arr_f.length <= 0) {
            return;
        }
        f f0 = arr_f[0];
        throw null;
    }
}

