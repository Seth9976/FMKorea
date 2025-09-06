package androidx.work.impl;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class p implements Callable {
    public final r a;
    public final ArrayList b;
    public final String c;

    public p(r r0, ArrayList arrayList0, String s) {
        this.a = r0;
        this.b = arrayList0;
        this.c = s;
    }

    @Override
    public final Object call() {
        return this.a.m(this.b, this.c);
    }
}

