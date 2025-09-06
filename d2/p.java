package d2;

import B2.b;
import com.google.firebase.components.ComponentRegistrar;

public final class p implements b {
    public final ComponentRegistrar a;

    public p(ComponentRegistrar componentRegistrar0) {
        this.a = componentRegistrar0;
    }

    @Override  // B2.b
    public final Object get() {
        return d2.o.b.a(this.a);
    }
}

