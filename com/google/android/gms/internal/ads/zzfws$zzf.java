package com.google.android.gms.internal.ads;

import Z1.d;

final class zzfws.zzf implements Runnable {
    final zzfws zza;
    final d zzb;

    zzfws.zzf(zzfws zzfws0, d d0) {
        this.zza = zzfws0;
        this.zzb = d0;
    }

    @Override
    public final void run() {
        if(this.zza.value != this) {
            return;
        }
        Object object0 = zzfws.zze(this.zzb);
        if(zzfws.zzba.zzf(this.zza, this, object0)) {
            zzfws.zzp(this.zza, false);
        }
    }
}

