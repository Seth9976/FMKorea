package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

final class zzccl implements Runnable {
    private final zzcbx zza;
    private boolean zzb;

    zzccl(zzcbx zzcbx0) {
        this.zzb = false;
        this.zza = zzcbx0;
    }

    @Override
    public final void run() {
        if(!this.zzb) {
            this.zza.zzt();
            this.zzc();
        }
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc();
    }

    private final void zzc() {
        zzs.zza.removeCallbacks(this);
        zzs.zza.postDelayed(this, 0xFAL);
    }
}

