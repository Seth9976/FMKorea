package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

final class zzyx {
    private static Constructor zza;
    private static Method zzb;
    private static Method zzc;

    public static zzae zza(float f) {
        if(zzyx.zza == null || zzyx.zzb == null || zzyx.zzc == null) {
            Class class0 = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            zzyx.zza = class0.getConstructor(null);
            zzyx.zzb = class0.getMethod("setRotationDegrees", Float.TYPE);
            zzyx.zzc = class0.getMethod("build", null);
        }
        Object object0 = zzyx.zza.newInstance(null);
        zzyx.zzb.invoke(object0, f);
        Object object1 = zzyx.zzc.invoke(object0, null);
        object1.getClass();
        return (zzae)object1;
    }
}

