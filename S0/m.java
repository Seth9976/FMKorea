package s0;

import android.os.Build.VERSION;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

public abstract class m {
    static abstract class a {
        static final p a;

        static {
            a.a = new p(m.d().getWebkitToCompatConverter());
        }
    }

    static abstract class b {
        static final n a;

        static {
            b.a = m.a();
        }
    }

    static n a() {
        try {
            InvocationHandler invocationHandler0 = m.b();
            return new o(((WebViewProviderFactoryBoundaryInterface)T3.a.a(WebViewProviderFactoryBoundaryInterface.class, invocationHandler0)));
        }
        catch(IllegalAccessException | InvocationTargetException | NoSuchMethodException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(ClassNotFoundException unused_ex) {
            return new i();
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler)Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m.e()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static p c() {
        return a.a;
    }

    public static n d() {
        return b.a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT < 28 ? m.f().getClass().getClassLoader() : e.a();
    }

    private static Object f() {
        try {
            Method method0 = WebView.class.getDeclaredMethod("getFactory", null);
            method0.setAccessible(true);
            return method0.invoke(null, null);
        }
        catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException noSuchMethodException0) {
            throw new RuntimeException(noSuchMethodException0);
        }
    }
}

