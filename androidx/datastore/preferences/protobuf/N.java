package androidx.datastore.preferences.protobuf;

abstract class n {
    static final Class a;

    static {
        n.a = n.c();
    }

    public static o a() {
        if(n.a != null) {
            try {
                return n.b("getEmptyRegistry");
            }
            catch(Exception unused_ex) {
            }
        }
        return o.e;
    }

    private static final o b(String s) {
        return (o)n.a.getDeclaredMethod(s, null).invoke(null, null);
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
    }
}

