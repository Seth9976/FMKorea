package g0;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import z3.k;

public final class m {
    private final u a;
    private final Set b;

    public m(u u0) {
        k.e(u0, "database");
        super();
        this.a = u0;
        Set set0 = Collections.newSetFromMap(new IdentityHashMap());
        k.d(set0, "newSetFromMap(IdentityHashMap())");
        this.b = set0;
    }
}

