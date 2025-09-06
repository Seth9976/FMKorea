package com.google.android.gms.internal.ads;

final class zzfho implements zzfya {
    final zzfhr zza;
    final zzfhg zzb;
    final boolean zzc;

    zzfho(zzfhr zzfhr0, zzfhg zzfhg0, boolean z) {
        this.zza = zzfhr0;
        this.zzb = zzfhg0;
        this.zzc = z;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzfhg zzfhg0 = this.zzb;
        if(zzfhg0.zzj()) {
            zzfhg0.zzg(throwable0);
            zzfhg0.zzf(false);
            this.zza.zza(zzfhg0);
            if(this.zzc) {
                this.zza.zzg();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        this.zzb.zzf(true);
        this.zza.zza(this.zzb);
        if(this.zzc) {
            this.zza.zzg();
        }
    }
}

