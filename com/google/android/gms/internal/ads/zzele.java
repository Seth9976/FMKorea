package com.google.android.gms.internal.ads;

final class zzele implements zzelm {
    final zzelf zza;

    zzele(zzelf zzelf0) {
        this.zza = zzelf0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized(this.zza) {
            zzelf.zzc(this.zza, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzelm
    public final void zzb(Object object0) {
        synchronized(this.zza) {
            zzelf.zzc(this.zza, ((zzdep)object0));
            zzelf.zzb(this.zza).zzj();
        }
    }
}

