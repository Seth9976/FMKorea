package m3;

import java.util.AbstractSet;
import java.util.Set;

public abstract class f extends AbstractSet implements Set {
    public abstract int a();

    @Override
    public final int size() {
        return this.a();
    }
}

