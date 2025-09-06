package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.g;
import androidx.core.content.res.e.c;
import androidx.core.content.res.e.d;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import z.h.b;

class j extends n {
    private static final Class b;
    private static final Constructor c;
    private static final Method d;
    private static final Method e;

    static {
        Method method1;
        Method method0;
        Class class0;
        Constructor constructor0 = null;
        try {
            class0 = Class.forName("android.graphics.FontFamily");
            Constructor constructor1 = class0.getConstructor(null);
            method0 = class0.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            Class[] arr_class = {Array.newInstance(class0, 1).getClass()};
            method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", arr_class);
            constructor0 = constructor1;
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi24Impl", classNotFoundException0.getClass().getName(), classNotFoundException0);
            method1 = null;
            class0 = null;
            method0 = null;
        }
        j.c = constructor0;
        j.b = class0;
        j.d = method0;
        j.e = method1;
    }

    @Override  // androidx.core.graphics.n
    public Typeface a(Context context0, c e$c0, Resources resources0, int v) {
        Object object0 = j.k();
        if(object0 == null) {
            return null;
        }
        d[] arr_e$d = e$c0.a();
        for(int v1 = 0; v1 < arr_e$d.length; ++v1) {
            d e$d0 = arr_e$d[v1];
            ByteBuffer byteBuffer0 = o.b(context0, resources0, e$d0.b());
            if(byteBuffer0 == null) {
                return null;
            }
            if(!j.h(object0, byteBuffer0, e$d0.c(), e$d0.e(), e$d0.f())) {
                return null;
            }
        }
        return j.i(object0);
    }

    @Override  // androidx.core.graphics.n
    public Typeface b(Context context0, CancellationSignal cancellationSignal0, b[] arr_h$b, int v) {
        Object object0 = j.k();
        if(object0 == null) {
            return null;
        }
        g g0 = new g();
        for(int v1 = 0; v1 < arr_h$b.length; ++v1) {
            b h$b0 = arr_h$b[v1];
            Uri uri0 = h$b0.d();
            ByteBuffer byteBuffer0 = (ByteBuffer)g0.get(uri0);
            if(byteBuffer0 == null) {
                byteBuffer0 = o.f(context0, cancellationSignal0, uri0);
                g0.put(uri0, byteBuffer0);
            }
            if(byteBuffer0 == null) {
                return null;
            }
            if(!j.h(object0, byteBuffer0, h$b0.c(), h$b0.e(), h$b0.f())) {
                return null;
            }
        }
        Typeface typeface0 = j.i(object0);
        return typeface0 == null ? null : Typeface.create(typeface0, v);
    }

    private static boolean h(Object object0, ByteBuffer byteBuffer0, int v, int v1, boolean z) {
        try {
            return ((Boolean)j.d.invoke(object0, byteBuffer0, v, null, v1, Boolean.valueOf(z))).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    private static Typeface i(Object object0) {
        try {
            Object object1 = Array.newInstance(j.b, 1);
            Array.set(object1, 0, object0);
            return (Typeface)j.e.invoke(null, object1);
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    public static boolean j() {
        Method method0 = j.d;
        if(method0 == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method0 != null;
    }

    private static Object k() {
        try {
            return j.c.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            return null;
        }
    }
}

