package com.google.android.gms.internal.ads;

final class zzcsq implements zzfya {
    final zzfya zza;
    final zzcss zzb;

    zzcsq(zzcss zzcss0, zzfya zzfya0) {
        this.zzb = zzcss0;
        this.zza = zzfya0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        this.zza.zza(throwable0);
        zzcss.zzc(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        zzcss.zzb(this.zzb, ((zzcsl)object0).zza, this.zza);
    }
}

