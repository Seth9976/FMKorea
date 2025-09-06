package r3;

import p3.f;
import p3.k;

public abstract class j extends a {
    public j(f f0) {
        super(f0);
        if(f0 != null && f0.getContext() != k.f) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override  // p3.f
    public p3.j getContext() {
        return k.f;
    }
}

