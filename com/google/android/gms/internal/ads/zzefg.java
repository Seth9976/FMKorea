package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

final class zzefg implements zzfya {
    final zzefh zza;

    zzefg(zzefh zzefh0) {
        this.zza = zzefh0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zze zze0 = zzefh.zzd(this.zza).zzd().zza(throwable0);
        zzefh.zze(this.zza).zzbF(zze0);
        zzfcv.zzb(zze0.zza, throwable0, "DelayedBannerAd.onFailure");
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        ((zzcqc)object0).zzj();
    }
}

