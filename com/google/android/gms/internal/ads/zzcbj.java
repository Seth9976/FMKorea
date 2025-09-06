package com.google.android.gms.internal.ads;

final class zzcbj implements Runnable {
    final int zza;
    final int zzb;
    final zzcbn zzc;

    zzcbj(zzcbn zzcbn0, int v, int v1) {
        this.zzc = zzcbn0;
        this.zza = v;
        this.zzb = v1;
        super();
    }

    @Override
    public final void run() {
        zzcbn zzcbn0 = this.zzc;
        if(zzcbn.zzi(zzcbn0) != null) {
            zzcbn.zzi(zzcbn0).zzj(this.zza, this.zzb);
        }
    }
}

