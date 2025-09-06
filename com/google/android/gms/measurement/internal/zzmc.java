package com.google.android.gms.measurement.internal;

final class zzmc {
    final zzlx zza;
    private zzmb zzb;

    zzmc(zzlx zzlx0) {
        this.zza = zzlx0;
        super();
    }

    final void zza() {
        this.zza.zzt();
        if(this.zzb != null) {
            this.zza.zzc.removeCallbacks(this.zzb);
        }
        this.zza.zzk().zzn.zza(false);
        this.zza.zza(false);
    }

    final void zza(long v) {
        this.zzb = new zzmb(this, this.zza.zzb().currentTimeMillis(), v);
        this.zza.zzc.postDelayed(this.zzb, 2000L);
    }
}

