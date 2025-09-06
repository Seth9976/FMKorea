package androidx.core.os;

import android.os.Build.VERSION;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import z3.k;

public final class a {
    static final class androidx.core.os.a.a {
        public static final androidx.core.os.a.a a;

        static {
            androidx.core.os.a.a.a = new androidx.core.os.a.a();
        }

        public final int a(int v) {
            return SdkExtensions.getExtensionVersion(v);
        }
    }

    public static final a a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    static {
        a.a = new a();
        int v = Build.VERSION.SDK_INT;
        int v1 = 0;
        a.b = v < 30 ? 0 : androidx.core.os.a.a.a.a(30);
        a.c = v < 30 ? 0 : androidx.core.os.a.a.a.a(0x1F);
        a.d = v < 30 ? 0 : androidx.core.os.a.a.a.a(33);
        if(v >= 30) {
            v1 = androidx.core.os.a.a.a.a(1000000);
        }
        a.e = v1;
    }

    public static final boolean a(String s, String s1) {
        k.e(s, "codename");
        k.e(s1, "buildCodename");
        if(k.a("REL", s1)) {
            return false;
        }
        Locale locale0 = Locale.ROOT;
        String s2 = s1.toUpperCase(locale0);
        k.d(s2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String s3 = s.toUpperCase(locale0);
        k.d(s3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return s2.compareTo(s3) >= 0;
    }

    public static final boolean b() {
        int v = Build.VERSION.SDK_INT;
        if(v < 34) {
            if(v >= 33) {
                String s = Build.VERSION.CODENAME;
                k.d(s, "CODENAME");
                return a.a("UpsideDownCake", s);
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        if(Build.VERSION.SDK_INT >= 34) {
            String s = Build.VERSION.CODENAME;
            k.d(s, "CODENAME");
            return a.a("VanillaIceCream", s);
        }
        return false;
    }
}

