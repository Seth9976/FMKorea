package androidx.datastore.preferences.protobuf;

abstract class r {
    private static final p a;
    private static final p b;

    static {
        r.a = new q();
        r.b = r.c();
    }

    static p a() {
        p p0 = r.b;
        if(p0 == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        return p0;
    }

    static p b() {
        return r.a;
    }

    private static p c() {
        try {
            return (p)Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

