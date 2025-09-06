package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzfcv {
    public static void zza(Context context0, boolean z) {
        if(z) {
            zzcaa.zzi("This request is sent from a test device.");
            return;
        }
        zzcaa.zzi(("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzbzt.zzy(context0) + "\")) to get test ads on this device."));
    }

    public static void zzb(int v, Throwable throwable0, String s) {
        zzcaa.zzi(("Ad failed to load : " + v));
        zze.zzb(s, throwable0);
        if(v == 3) {
            return;
        }
        zzt.zzo().zzt(throwable0, s);
    }
}

