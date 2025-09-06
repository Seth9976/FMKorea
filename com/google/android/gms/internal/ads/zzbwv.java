package com.google.android.gms.internal.ads;

import Z1.d;

final class zzbwv implements zzfya {
    final d zza;

    zzbwv(zzbww zzbww0, d d0) {
        this.zza = d0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzbww.zzc().remove(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        Void void0 = (Void)object0;
        zzbww.zzc().remove(this.zza);
    }
}

