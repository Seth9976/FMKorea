package com.google.android.gms.internal.ads;

final class zzfhp implements zzfya {
    final zzfhr zza;
    final zzfhg zzb;

    zzfhp(zzfhr zzfhr0, zzfhg zzfhg0) {
        this.zza = zzfhr0;
        this.zzb = zzfhg0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        this.zzb.zzg(throwable0);
        this.zzb.zzf(false);
        this.zza.zza(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
    }
}

