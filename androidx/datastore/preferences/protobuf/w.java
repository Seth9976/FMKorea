package androidx.datastore.preferences.protobuf;

abstract class W {
    private static final U a;
    private static final U b;

    static {
        W.a = W.c();
        W.b = new V();
    }

    static U a() {
        return W.a;
    }

    static U b() {
        return W.b;
    }

    private static U c() {
        try {
            return (U)Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

