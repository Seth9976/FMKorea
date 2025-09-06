package com.google.android.gms.internal.ads;

final class zzcbl implements Runnable {
    final zzcbn zza;

    zzcbl(zzcbn zzcbn0) {
        this.zza = zzcbn0;
        super();
    }

    @Override
    public final void run() {
        zzcbn zzcbn0 = this.zza;
        if(zzcbn.zzi(zzcbn0) != null) {
            if(!zzcbn.zzv(zzcbn0)) {
                zzcbn.zzi(zzcbn0).zzg();
                zzcbn.zzk(this.zza, true);
            }
            zzcbn.zzi(this.zza).zze();
        }
    }
}

