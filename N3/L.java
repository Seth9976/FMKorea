package N3;

import java.util.ArrayList;
import z3.g;
import z3.k;

public abstract class l {
    public static Object a(Object object0) [...] // Inlined contents

    public static Object b(Object object0, int v, g g0) {
        return (v & 1) == 0 ? object0 : null;
    }

    public static final Object c(Object object0, Object object1) {
        if(object0 == null) {
            return object1;
        }
        if(object0 instanceof ArrayList) {
            k.c(object0, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList)object0).add(object1);
            return object0;
        }
        ArrayList arrayList0 = new ArrayList(4);
        arrayList0.add(object0);
        arrayList0.add(object1);
        return arrayList0;
    }
}

