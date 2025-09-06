package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public abstract class b {
    static abstract class a {
        static String a(Locale locale0) {
            return locale0.getScript();
        }
    }

    static abstract class androidx.core.text.b.b {
        static ULocale a(Object object0) {
            return ULocale.addLikelySubtags(((ULocale)object0));
        }

        static ULocale b(Locale locale0) {
            return ULocale.forLocale(locale0);
        }

        static String c(Object object0) {
            return ((ULocale)object0).getScript();
        }
    }

    private static Method a;

    static {
        if(Build.VERSION.SDK_INT < 24) {
            try {
                b.a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            }
            catch(Exception exception0) {
                throw new IllegalStateException(exception0);
            }
        }
    }

    public static String a(Locale locale0) {
        if(Build.VERSION.SDK_INT >= 24) {
            return androidx.core.text.b.b.c(androidx.core.text.b.b.a(androidx.core.text.b.b.b(locale0)));
        }
        try {
            return a.a(((Locale)b.a.invoke(null, locale0)));
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.w("ICUCompat", invocationTargetException0);
            return a.a(locale0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.w("ICUCompat", illegalAccessException0);
            return a.a(locale0);
        }
    }
}

