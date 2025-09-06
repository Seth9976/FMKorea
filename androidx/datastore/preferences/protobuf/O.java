package androidx.datastore.preferences.protobuf;

import androidx.appcompat.app.E;
import java.util.Collections;
import java.util.Map;

public class o {
    static final class a {
        private final Object a;
        private final int b;

        a(Object object0, int v) {
            this.a = object0;
            this.b = v;
        }

        @Override
        public boolean equals(Object object0) {
            return object0 instanceof a ? this.a == ((a)object0).a && this.b == ((a)object0).b : false;
        }

        @Override
        public int hashCode() {
            return System.identityHashCode(this.a) * 0xFFFF + this.b;
        }
    }

    private final Map a;
    private static boolean b = true;
    private static final Class c;
    private static volatile o d;
    static final o e;

    static {
        o.c = o.c();
        o.e = new o(true);
    }

    o(boolean z) {
        this.a = Collections.emptyMap();
    }

    public c a(O o0, int v) {
        a o$a0 = new a(o0, v);
        E.a(this.a.get(o$a0));
        return null;
    }

    public static o b() {
        o o0 = o.d;
        if(o0 == null) {
            synchronized(o.class) {
                o0 = o.d;
                if(o0 == null) {
                    o0 = o.b ? n.a() : o.e;
                    o.d = o0;
                }
            }
        }
        return o0;
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
    }
}

