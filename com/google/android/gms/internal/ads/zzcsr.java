package com.google.android.gms.internal.ads;

final class zzcsr implements zzfya {
    final zzfya zza;
    final zzcss zzb;

    zzcsr(zzcss zzcss0, zzfya zzfya0) {
        this.zzb = zzcss0;
        this.zza = zzfya0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzcss.zzc(this.zzb);
        this.zza.zza(throwable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        zzcss.zzc(this.zzb);
        this.zza.zzb(((zzcse)object0));
    }
}

