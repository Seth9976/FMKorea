package androidx.datastore.preferences.protobuf;

abstract class d {
    private static final Class a;
    private static final boolean b;

    static {
        d.a = d.a("libcore.io.Memory");
        d.b = d.a("org.robolectric.Robolectric") != null;
    }

    private static Class a(String s) {
        try {
            return Class.forName(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static Class b() {
        return d.a;
    }

    static boolean c() [...] // 潜在的解密器
}

