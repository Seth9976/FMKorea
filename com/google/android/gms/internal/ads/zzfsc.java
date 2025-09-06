package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzfsc {
    private static final Object zza;
    private static final Method zzb;
    private static final Method zzc;

    static {
        Object object0 = zzfsc.zza();
        zzfsc.zza = object0;
        Method method0 = null;
        zzfsc.zzb = object0 == null ? null : zzfsc.zzb("getStackTraceElement", new Class[]{Throwable.class, Integer.TYPE});
        if(object0 != null) {
            method0 = zzfsc.zzc(object0);
        }
        zzfsc.zzc = method0;
    }

    private static Object zza() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        }
        catch(ThreadDeath threadDeath0) {
            throw threadDeath0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static Method zzb(String s, Class[] arr_class) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(s, arr_class);
        }
        catch(ThreadDeath threadDeath0) {
            throw threadDeath0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static Method zzc(Object object0) {
        try {
            Method method0 = zzfsc.zzb("getStackTraceDepth", new Class[]{Throwable.class});
            if(method0 == null) {
                return null;
            }
            method0.invoke(object0, new Throwable());
            return method0;
        }
        catch(UnsupportedOperationException | IllegalAccessException | InvocationTargetException unused_ex) {
            return null;
        }
    }
}

