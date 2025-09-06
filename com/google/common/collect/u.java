package com.google.common.collect;

import java.util.Collection;

public abstract class u {
    private static Collection a(Iterable iterable0) {
        return iterable0 instanceof Collection ? ((Collection)iterable0) : w.g(iterable0.iterator());
    }

    static Object[] b(Iterable iterable0) {
        return u.a(iterable0).toArray();
    }
}

