package com.google.android.gms.internal.ads;

final class zzekc implements zzelm {
    final zzekd zza;

    zzekc(zzekd zzekd0) {
        this.zza = zzekd0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized(this.zza) {
            zzekd.zzc(this.zza, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzelm
    public final void zzb(Object object0) {
        synchronized(this.zza) {
            zzekd zzekd1 = this.zza;
            if(zzekd.zzb(zzekd1) != null) {
                zzekd.zzb(zzekd1).zzb();
            }
            zzekd.zzc(this.zza, ((zzcqc)object0));
            zzekd.zzb(this.zza).zzj();
        }
    }
}

