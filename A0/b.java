package a0;

import android.os.Build.VERSION;
import android.os.ext.SdkExtensions;

public final class b {
    static final class a {
        public static final a a;

        static {
            a.a = new a();
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public static final b a;

    static {
        b.a = new b();
    }

    public final int a() {
        return Build.VERSION.SDK_INT < 30 ? 0 : a.a.a();
    }
}

