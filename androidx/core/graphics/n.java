package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.e.c;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

abstract class n {
    interface b {
        int a(Object arg1);

        boolean b(Object arg1);
    }

    private ConcurrentHashMap a;

    n() {
        this.a = new ConcurrentHashMap();
    }

    public abstract Typeface a(Context arg1, c arg2, Resources arg3, int arg4);

    public abstract Typeface b(Context arg1, CancellationSignal arg2, z.h.b[] arg3, int arg4);

    protected Typeface c(Context context0, InputStream inputStream0) {
        File file0 = o.e(context0);
        if(file0 == null) {
            return null;
        }
        try {
            return o.d(file0, inputStream0) ? Typeface.createFromFile(file0.getPath()) : null;
        }
        catch(RuntimeException unused_ex) {
            return null;
        }
        finally {
            file0.delete();
        }
    }

    public Typeface d(Context context0, Resources resources0, int v, String s, int v1) {
        File file0 = o.e(context0);
        if(file0 == null) {
            return null;
        }
        try {
            return o.c(file0, resources0, v) ? Typeface.createFromFile(file0.getPath()) : null;
        }
        catch(RuntimeException unused_ex) {
            return null;
        }
        finally {
            file0.delete();
        }
    }

    private static Object e(Object[] arr_object, int v, b n$b0) {
        int v1 = (v & 1) == 0 ? 400 : 700;
        return (v & 2) == 0 ? n.f(arr_object, v1, false, n$b0) : n.f(arr_object, v1, true, n$b0);
    }

    private static Object f(Object[] arr_object, int v, boolean z, b n$b0) {
        Object object0 = null;
        int v1 = 0x7FFFFFFF;
        for(int v2 = 0; v2 < arr_object.length; ++v2) {
            Object object1 = arr_object[v2];
            int v3 = Math.abs(n$b0.a(object1) - v) * 2 + (n$b0.b(object1) == z ? 0 : 1);
            if(object0 == null || v1 > v3) {
                object0 = object1;
                v1 = v3;
            }
        }
        return object0;
    }

    protected z.h.b g(z.h.b[] arr_h$b, int v) {
        class a implements b {
            final n a;

            @Override  // androidx.core.graphics.n$b
            public int a(Object object0) {
                return this.c(((z.h.b)object0));
            }

            @Override  // androidx.core.graphics.n$b
            public boolean b(Object object0) {
                return this.d(((z.h.b)object0));
            }

            public int c(z.h.b h$b0) {
                return h$b0.e();
            }

            public boolean d(z.h.b h$b0) {
                return h$b0.f();
            }
        }

        return (z.h.b)n.e(arr_h$b, v, new a(this));
    }
}

