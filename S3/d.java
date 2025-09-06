package s3;

import java.io.Serializable;
import z3.g;
import z3.k;

public final class d implements Serializable {
    static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    private final Class f;
    private static final a g;
    private static final long serialVersionUID;

    static {
        d.g = new a(null);
    }

    public d(Enum[] arr_enum) {
        k.e(arr_enum, "entries");
        super();
        Class class0 = arr_enum.getClass().getComponentType();
        k.b(class0);
        this.f = class0;
    }

    private final Object readResolve() {
        Object[] arr_object = this.f.getEnumConstants();
        k.d(arr_object, "getEnumConstants(...)");
        return b.a(((Enum[])arr_object));
    }
}

