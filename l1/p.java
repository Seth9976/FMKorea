package l1;

import android.util.SparseArray;

public enum p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private final int f;
    private static final SparseArray m;

    static {
        SparseArray sparseArray0 = new SparseArray();
        p.m = sparseArray0;
        sparseArray0.put(0, p.g);
        sparseArray0.put(1, p.h);
        sparseArray0.put(2, p.i);
        sparseArray0.put(3, p.j);
        sparseArray0.put(4, p.k);
        sparseArray0.put(-1, p.l);
    }

    private p(int v1) {
        this.f = v1;
    }
}

