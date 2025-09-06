package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.e.c;
import androidx.core.content.res.e.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import jeb.synthetic.TWR;
import z.h.b;

class i extends n {
    private static Class b = null;
    private static Constructor c = null;
    private static Method d = null;
    private static Method e = null;
    private static boolean f = false;

    static {
    }

    @Override  // androidx.core.graphics.n
    public Typeface a(Context context0, c e$c0, Resources resources0, int v) {
        Object object0 = i.l();
        d[] arr_e$d = e$c0.a();
        for(int v1 = 0; v1 < arr_e$d.length; ++v1) {
            d e$d0 = arr_e$d[v1];
            File file0 = o.e(context0);
            if(file0 == null) {
                return null;
            }
            try {
                if(!o.c(file0, resources0, e$d0.b())) {
                    return null;
                }
                if(!i.h(object0, file0.getPath(), e$d0.e(), e$d0.f())) {
                    return null;
                }
            }
            catch(RuntimeException unused_ex) {
                return null;
            }
            finally {
                file0.delete();
            }
        }
        return i.i(object0);
    }

    @Override  // androidx.core.graphics.n
    public Typeface b(Context context0, CancellationSignal cancellationSignal0, b[] arr_h$b, int v) {
        if(arr_h$b.length < 1) {
            return null;
        }
        b h$b0 = this.g(arr_h$b, v);
        ContentResolver contentResolver0 = context0.getContentResolver();
        try(ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(h$b0.d(), "r", cancellationSignal0)) {
            if(parcelFileDescriptor0 != null) {
                File file0 = this.j(parcelFileDescriptor0);
                if(file0 != null && file0.canRead()) {
                    return Typeface.createFromFile(file0);
                }
                FileInputStream fileInputStream0 = new FileInputStream(parcelFileDescriptor0.getFileDescriptor());
                TWR.declareResource(fileInputStream0);
                TWR.useResource$NT(fileInputStream0);
                return super.c(context0, fileInputStream0);
            }
        }
        catch(IOException unused_ex) {
        }
        return null;
    }

    private static boolean h(Object object0, String s, int v, boolean z) {
        i.k();
        try {
            return ((Boolean)i.d.invoke(object0, s, v, Boolean.valueOf(z))).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }

    private static Typeface i(Object object0) {
        i.k();
        try {
            Object object1 = Array.newInstance(i.b, 1);
            Array.set(object1, 0, object0);
            return (Typeface)i.e.invoke(null, object1);
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor0) {
        try {
            String s = Os.readlink(("/proc/self/fd/" + parcelFileDescriptor0.getFd()));
            return OsConstants.S_ISREG(Os.stat(s).st_mode) ? new File(s) : null;
        }
        catch(ErrnoException unused_ex) {
        }
        return null;
    }

    private static void k() {
        Method method1;
        Method method0;
        Class class0;
        Constructor constructor0;
        if(i.f) {
            return;
        }
        try {
            i.f = true;
            constructor0 = null;
            class0 = Class.forName("android.graphics.FontFamily");
            Constructor constructor1 = class0.getConstructor(null);
            method0 = class0.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            Class[] arr_class = {Array.newInstance(class0, 1).getClass()};
            method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", arr_class);
            constructor0 = constructor1;
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi21Impl", classNotFoundException0.getClass().getName(), classNotFoundException0);
            method1 = null;
            class0 = null;
            method0 = null;
        }
        i.c = constructor0;
        i.b = class0;
        i.d = method0;
        i.e = method1;
    }

    private static Object l() {
        i.k();
        try {
            return i.c.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }
}

