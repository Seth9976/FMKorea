package e2;

import com.google.firebase.concurrent.ExecutorsRegistrar;

public final class b implements B2.b {
    @Override  // B2.b
    public final Object get() {
        return ExecutorsRegistrar.p();
    }
}

