package N3;

import z3.k;

public abstract class p {
    private static final Object a;

    static {
        p.a = new F("CONDITION_FALSE");
    }

    public static final Object a() {
        return p.a;
    }

    public static final q b(Object object0) {
        z z0 = object0 instanceof z ? ((z)object0) : null;
        if(z0 != null) {
            q q0 = z0.a;
            if(q0 != null) {
                return q0;
            }
        }
        k.c(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (q)object0;
    }
}

