package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

final class j implements k {
    private final Locale[] a;
    private final String b;
    private static final Locale[] c;
    private static final Locale d;
    private static final Locale e;
    private static final Locale f;

    static {
        j.c = new Locale[0];
        j.d = new Locale("en", "XA");
        j.e = new Locale("ar", "XB");
        j.f = i.b("en-Latn");
    }

    j(Locale[] arr_locale) {
        if(arr_locale.length == 0) {
            this.a = j.c;
            this.b = "";
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_locale.length; ++v) {
            Locale locale0 = arr_locale[v];
            if(locale0 == null) {
                throw new NullPointerException("list[" + v + "] is null");
            }
            if(!hashSet0.contains(locale0)) {
                Locale locale1 = (Locale)locale0.clone();
                arrayList0.add(locale1);
                j.c(stringBuilder0, locale1);
                if(v < arr_locale.length - 1) {
                    stringBuilder0.append(',');
                }
                hashSet0.add(locale1);
            }
        }
        this.a = (Locale[])arrayList0.toArray(new Locale[0]);
        this.b = stringBuilder0.toString();
    }

    @Override  // androidx.core.os.k
    public String a() {
        return this.b;
    }

    @Override  // androidx.core.os.k
    public Object b() {
        return null;
    }

    static void c(StringBuilder stringBuilder0, Locale locale0) {
        stringBuilder0.append(locale0.getLanguage());
        String s = locale0.getCountry();
        if(s != null && !s.isEmpty()) {
            stringBuilder0.append('-');
            stringBuilder0.append(locale0.getCountry());
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        Locale[] arr_locale = ((j)object0).a;
        if(this.a.length != arr_locale.length) {
            return false;
        }
        for(int v = 0; true; ++v) {
            Locale[] arr_locale1 = this.a;
            if(v >= arr_locale1.length) {
                break;
            }
            if(!arr_locale1[v].equals(arr_locale[v])) {
                return false;
            }
        }
        return true;
    }

    @Override  // androidx.core.os.k
    public Locale get(int v) {
        if(v >= 0) {
            return v >= this.a.length ? null : this.a[v];
        }
        return null;
    }

    @Override
    public int hashCode() {
        Locale[] arr_locale = this.a;
        int v = 1;
        for(int v1 = 0; v1 < arr_locale.length; ++v1) {
            v = v * 0x1F + arr_locale[v1].hashCode();
        }
        return v;
    }

    @Override  // androidx.core.os.k
    public boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override  // androidx.core.os.k
    public int size() {
        return this.a.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[");
        for(int v = 0; true; ++v) {
            Locale[] arr_locale = this.a;
            if(v >= arr_locale.length) {
                break;
            }
            stringBuilder0.append(arr_locale[v]);
            if(v < this.a.length - 1) {
                stringBuilder0.append(',');
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

