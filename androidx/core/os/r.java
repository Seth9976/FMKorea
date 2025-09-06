package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

final class r implements k {
    private final LocaleList a;

    r(Object object0) {
        this.a = (LocaleList)object0;
    }

    @Override  // androidx.core.os.k
    public String a() {
        return this.a.toLanguageTags();
    }

    @Override  // androidx.core.os.k
    public Object b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        Object object1 = ((k)object0).b();
        return this.a.equals(object1);
    }

    @Override  // androidx.core.os.k
    public Locale get(int v) {
        return this.a.get(v);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // androidx.core.os.k
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override  // androidx.core.os.k
    public int size() {
        return this.a.size();
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

