package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.LocaleList;

public abstract class i {
    static abstract class a {
        static LocaleList a(Object object0) {
            return ((LocaleManager)object0).getApplicationLocales();
        }

        static LocaleList b(Object object0) {
            return ((LocaleManager)object0).getSystemLocales();
        }
    }

    public static androidx.core.os.i a(Context context0) {
        if(Build.VERSION.SDK_INT >= 33) {
            Object object0 = i.b(context0);
            return object0 == null ? androidx.core.os.i.e() : androidx.core.os.i.j(a.a(object0));
        }
        return androidx.core.os.i.c(e.b(context0));
    }

    private static Object b(Context context0) {
        return context0.getSystemService("locale");
    }
}

