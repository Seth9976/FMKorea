package com.google.android.gms.internal.ads;

final class zzfef implements zzfya {
    final zzfei zza;
    final zzfej zzb;

    zzfef(zzfej zzfej0, zzfei zzfei0) {
        this.zzb = zzfej0;
        this.zza = zzfei0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        synchronized(this.zzb) {
            zzfej.zzc(this.zzb, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        Void void0 = (Void)object0;
        synchronized(this.zzb) {
            zzfej.zzc(this.zzb, null);
            zzfej.zzb(this.zzb).addFirst(this.zza);
            zzfej zzfej1 = this.zzb;
            if(zzfej.zzg(zzfej1) == 1) {
                zzfej.zzd(zzfej1);
            }
        }
    }
}

