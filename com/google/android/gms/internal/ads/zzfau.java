package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

final class zzfau implements zzelm {
    final zzfav zza;

    zzfau(zzfav zzfav0) {
        this.zza = zzfav0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized(this.zza) {
            zzfav.zzt(this.zza, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzelm
    public final void zzb(Object object0) {
        synchronized(this.zza) {
            zzfav.zzt(this.zza, ((zzdnq)object0));
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzdm)).booleanValue()) {
                zzfbt zzfbt0 = ((zzdnq)object0).zzd();
                zzfbt0.zza = zzfav.zzs(this.zza);
            }
            zzfav.zzr(this.zza).zzj();
        }
    }
}

