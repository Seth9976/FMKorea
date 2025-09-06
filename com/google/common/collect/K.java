package com.google.common.collect;

class k extends r {
    static final k i;
    private static final long serialVersionUID;

    static {
        k.i = new k();
    }

    private k() {
        super(o.h(), 0, null);
    }

    private Object readResolve() {
        return k.i;
    }
}

