package r0;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import s0.c;
import s0.l;
import s0.m;
import s0.n;

public abstract class b {
    private static final Uri a;
    private static final Uri b;

    static {
        b.a = Uri.parse("*");
        b.b = Uri.parse("");
    }

    public static PackageInfo a() {
        if(Build.VERSION.SDK_INT >= 26) {
            return c.a();
        }
        try {
            return b.c();
        }
        catch(ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException unused_ex) {
            return null;
        }
    }

    private static n b() {
        return m.d();
    }

    private static PackageInfo c() {
        return (PackageInfo)Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static boolean d() {
        if(!l.R.d()) {
            throw l.a();
        }
        return b.b().getStatics().isMultiProcessEnabled();
    }
}

