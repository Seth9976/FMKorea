package g0;

import G3.h;
import android.content.Context;
import z3.k;

public final class t {
    public static final t a;

    static {
        t.a = new t();
    }

    public static final a a(Context context0, Class class0, String s) {
        k.e(context0, "context");
        k.e(class0, "klass");
        if(s == null || h.H(s)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new a(context0, class0, s);
    }

    public static final Object b(Class class0, String s) {
        k.e(class0, "klass");
        k.e(s, "suffix");
        Package package0 = class0.getPackage();
        k.b(package0);
        String s1 = package0.getName();
        String s2 = class0.getCanonicalName();
        k.b(s2);
        k.d(s1, "fullPackage");
        if(s1.length() != 0) {
            s2 = s2.substring(s1.length() + 1);
            k.d(s2, "this as java.lang.String).substring(startIndex)");
        }
        String s3 = h.r(s2, '.', '_', false, 4, null) + s;
        try {
            Class class1 = Class.forName((s1.length() == 0 ? s3 : s1 + '.' + s3), true, class0.getClassLoader());
            k.c(class1, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return class1.newInstance();
        }
        catch(ClassNotFoundException unused_ex) {
            throw new RuntimeException("Cannot find implementation for " + class0.getCanonicalName() + ". " + s3 + " does not exist");
        }
        catch(IllegalAccessException unused_ex) {
            throw new RuntimeException("Cannot access the constructor " + class0 + ".canonicalName");
        }
        catch(InstantiationException unused_ex) {
            throw new RuntimeException("Failed to create an instance of " + class0 + ".canonicalName");
        }
    }

    public static final a c(Context context0, Class class0) {
        k.e(context0, "context");
        k.e(class0, "klass");
        return new a(context0, class0, null);
    }
}

