package com.google.common.collect;

import X1.h;
import java.io.Serializable;
import java.util.Comparator;

final class j extends F implements Serializable {
    final Comparator f;
    private static final long serialVersionUID;

    j(Comparator comparator0) {
        this.f = (Comparator)h.i(comparator0);
    }

    @Override  // com.google.common.collect.F
    public int compare(Object object0, Object object1) {
        return this.f.compare(object0, object1);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof j ? this.f.equals(((j)object0).f) : false;
    }

    @Override
    public int hashCode() {
        return this.f.hashCode();
    }

    @Override
    public String toString() {
        return this.f.toString();
    }
}

