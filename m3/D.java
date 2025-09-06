package m3;

import java.util.AbstractCollection;
import java.util.Collection;

public abstract class d extends AbstractCollection implements Collection {
    public abstract int a();

    @Override
    public final int size() {
        return this.a();
    }
}

