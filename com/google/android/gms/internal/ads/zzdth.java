package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

final class zzdth implements zzfya {
    final zzdtj zza;

    zzdth(zzdtj zzdtj0) {
        this.zza = zzdtj0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        synchronized(this) {
            zzdtj.zzi(this.zza, true);
            long v1 = zzt.zzB().elapsedRealtime();
            zzdtj.zzk(this.zza, "com.google.android.gms.ads.MobileAds", false, "Internal Error.", ((int)(v1 - zzdtj.zza(this.zza))));
            zzdtj.zzb(this.zza).zzd(new Exception());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        synchronized(this) {
            zzdtj.zzi(this.zza, true);
            long v1 = zzt.zzB().elapsedRealtime();
            zzdtj.zzk(this.zza, "com.google.android.gms.ads.MobileAds", true, "", ((int)(v1 - zzdtj.zza(this.zza))));
            zzdtj.zzh(this.zza).execute(new zzdtg(this, ((String)object0)));
        }
    }
}

