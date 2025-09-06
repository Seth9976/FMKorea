package m3;

import java.util.AbstractList;
import java.util.List;

public abstract class e extends AbstractList implements List {
    public abstract int a();

    public abstract Object c(int arg1);

    @Override
    public final Object remove(int v) {
        return this.c(v);
    }

    @Override
    public final int size() {
        return this.a();
    }
}

