package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.LocaleList;
import java.util.Locale;

public abstract class e {
    static abstract class a {
        static LocaleList a(Configuration configuration0) {
            return configuration0.getLocales();
        }

        static void b(Configuration configuration0, i i0) {
            configuration0.setLocales(((LocaleList)i0.i()));
        }
    }

    public static i a(Configuration configuration0) {
        return Build.VERSION.SDK_INT < 24 ? i.a(new Locale[]{configuration0.locale}) : i.j(a.a(configuration0));
    }

    public static void b(Configuration configuration0, i i0) {
        if(Build.VERSION.SDK_INT >= 24) {
            a.b(configuration0, i0);
            return;
        }
        if(!i0.f()) {
            configuration0.setLocale(i0.d(0));
        }
    }
}

