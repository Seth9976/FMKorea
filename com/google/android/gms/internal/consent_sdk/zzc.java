package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;

public abstract class zzc {
    private static zzc zza;

    public static zzc zza(Context context0) {
        synchronized(zzc.class) {
            if(zzc.zza == null) {
                zzal zzal0 = new zzal(null);
                zzal0.zzb(((Application)context0.getApplicationContext()));
                zzc.zza = zzal0.zza();
            }
            return zzc.zza;
        }
    }

    public abstract zzl zzb();

    public abstract zzbq zzc();
}

