package com.google.android.gms.internal.ads;

final class zzcbg implements Runnable {
    final zzcbn zza;

    zzcbg(zzcbn zzcbn0) {
        this.zza = zzcbn0;
        super();
    }

    @Override
    public final void run() {
        zzcbn zzcbn0 = this.zza;
        if(zzcbn.zzi(zzcbn0) != null) {
            zzcbn.zzi(zzcbn0).zza();
        }
    }
}

