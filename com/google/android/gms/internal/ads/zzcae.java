package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzcae {
    public static Context zza(Context context0) {
        return zzcae.zzc(context0).getModuleContext();
    }

    public static Object zzb(Context context0, String s, zzcac zzcac0) {
        try {
            return zzcac0.zza(zzcae.zzc(context0).instantiate(s));
        }
        catch(Exception exception0) {
            throw new zzcad(exception0);
        }
    }

    private static DynamiteModule zzc(Context context0) {
        try {
            return DynamiteModule.load(context0, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite");
        }
        catch(Exception exception0) {
            throw new zzcad(exception0);
        }
    }
}

