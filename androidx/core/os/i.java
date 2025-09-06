package androidx.core.os;

import android.os.Build.VERSION;
import android.os.LocaleList;
import androidx.core.text.b;
import java.util.Locale;

public final class i {
    static abstract class a {
        private static final Locale[] a;

        static {
            a.a = new Locale[]{new Locale("en", "XA"), new Locale("ar", "XB")};
        }

        static Locale a(String s) {
            return Locale.forLanguageTag(s);
        }

        private static boolean b(Locale locale0) {
            Locale[] arr_locale = a.a;
            for(int v = 0; v < arr_locale.length; ++v) {
                if(arr_locale[v].equals(locale0)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale0, Locale locale1) {
            if(locale0.equals(locale1)) {
                return true;
            }
            if(!locale0.getLanguage().equals(locale1.getLanguage())) {
                return false;
            }
            if(!a.b(locale0) && !a.b(locale1)) {
                String s = b.a(locale0);
                if(s.isEmpty()) {
                    String s1 = locale0.getCountry();
                    return s1.isEmpty() || s1.equals(locale1.getCountry());
                }
                return s.equals(b.a(locale1));
            }
            return false;
        }
    }

    static abstract class androidx.core.os.i.b {
        static LocaleList a(Locale[] arr_locale) {
            return new LocaleList(arr_locale);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private final k a;
    private static final i b;

    static {
        i.b = i.a(new Locale[0]);
    }

    private i(k k0) {
        this.a = k0;
    }

    public static i a(Locale[] arr_locale) {
        return Build.VERSION.SDK_INT < 24 ? new i(new j(arr_locale)) : i.j(androidx.core.os.i.b.a(arr_locale));
    }

    static Locale b(String s) {
        if(s.contains("-")) {
            String[] arr_s = s.split("-", -1);
            if(arr_s.length > 2) {
                return new Locale(arr_s[0], arr_s[1], arr_s[2]);
            }
            if(arr_s.length > 1) {
                return new Locale(arr_s[0], arr_s[1]);
            }
            if(arr_s.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [" + s + "]");
            }
            return new Locale(arr_s[0]);
        }
        if(s.contains("_")) {
            String[] arr_s1 = s.split("_", -1);
            if(arr_s1.length > 2) {
                return new Locale(arr_s1[0], arr_s1[1], arr_s1[2]);
            }
            if(arr_s1.length > 1) {
                return new Locale(arr_s1[0], arr_s1[1]);
            }
            if(arr_s1.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [" + s + "]");
            }
            return new Locale(arr_s1[0]);
        }
        return new Locale(s);
    }

    public static i c(String s) {
        if(s != null && !s.isEmpty()) {
            String[] arr_s = s.split(",", -1);
            Locale[] arr_locale = new Locale[arr_s.length];
            for(int v = 0; v < arr_s.length; ++v) {
                arr_locale[v] = a.a(arr_s[v]);
            }
            return i.a(arr_locale);
        }
        return i.e();
    }

    public Locale d(int v) {
        return this.a.get(v);
    }

    public static i e() {
        return i.b;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof i && this.a.equals(((i)object0).a);
    }

    public boolean f() {
        return this.a.isEmpty();
    }

    public int g() {
        return this.a.size();
    }

    public String h() {
        return this.a.a();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i() {
        return this.a.b();
    }

    public static i j(LocaleList localeList0) {
        return new i(new r(localeList0));
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

