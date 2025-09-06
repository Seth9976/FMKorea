package e2;

import B2.b;
import com.google.firebase.concurrent.ExecutorsRegistrar;

public final class d implements b {
    @Override  // B2.b
    public final Object get() {
        return ExecutorsRegistrar.r();
    }
}

