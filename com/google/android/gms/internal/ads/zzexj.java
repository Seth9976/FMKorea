package com.google.android.gms.internal.ads;

final class zzexj implements zzelm {
    final zzexk zza;

    zzexj(zzexk zzexk0) {
        this.zza = zzexk0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized(this.zza) {
            this.zza.zza = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzelm
    public final void zzb(Object object0) {
        synchronized(this.zza) {
            zzcpw zzcpw0 = this.zza.zza;
            if(zzcpw0 != null) {
                zzcpw0.zzb();
            }
            this.zza.zza = (zzcpw)object0;
            ((zzcpw)object0).zzc(this.zza);
            this.zza.zzg.zzk(new zzcpx(((zzcpw)object0), this.zza, this.zza.zzg, this.zza.zzi));
            ((zzcpw)object0).zzj();
        }
    }
}

