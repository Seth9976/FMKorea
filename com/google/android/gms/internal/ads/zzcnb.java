package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;

final class zzcnb implements zzcms {
    private final zzedl zza;

    zzcnb(zzedl zzedl0) {
        this.zza = zzedl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzjw)).booleanValue()) {
            return;
        }
        zzfye.zzf(zzfxv.zzu(this.zza.zza(true)), Throwable.class, zzcna.zza, zzcan.zza);
    }
}

