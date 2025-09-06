package com.google.android.gms.internal.ads;

final class zzcbk implements Runnable {
    final zzcbn zza;

    zzcbk(zzcbn zzcbn0) {
        this.zza = zzcbn0;
        super();
    }

    @Override
    public final void run() {
        zzcbn zzcbn0 = this.zza;
        if(zzcbn.zzi(zzcbn0) != null) {
            zzcbn.zzi(zzcbn0).zzd();
            zzcbn.zzi(this.zza).zzi();
        }
    }
}

