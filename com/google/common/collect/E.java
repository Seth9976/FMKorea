package com.google.common.collect;

import X1.c;
import X1.f;
import X1.h;
import java.io.Serializable;

final class e extends F implements Serializable {
    final c f;
    final F g;
    private static final long serialVersionUID;

    e(c c0, F f0) {
        this.f = (c)h.i(c0);
        this.g = (F)h.i(f0);
    }

    @Override  // com.google.common.collect.F
    public int compare(Object object0, Object object1) {
        Object object2 = this.f.apply(object0);
        Object object3 = this.f.apply(object1);
        return this.g.compare(object2, object3);
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof e && (this.f.equals(((e)object0).f) && this.g.equals(((e)object0).g));
    }

    @Override
    public int hashCode() {
        return f.b(new Object[]{this.f, this.g});
    }

    @Override
    public String toString() {
        return this.g + ".onResultOf(" + this.f + ")";
    }
}

