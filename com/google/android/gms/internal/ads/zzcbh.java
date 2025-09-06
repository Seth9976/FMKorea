package com.google.android.gms.internal.ads;

final class zzcbh implements Runnable {
    final String zza;
    final String zzb;
    final zzcbn zzc;

    zzcbh(zzcbn zzcbn0, String s, String s1) {
        this.zzc = zzcbn0;
        this.zza = s;
        this.zzb = s1;
        super();
    }

    @Override
    public final void run() {
        zzcbn zzcbn0 = this.zzc;
        if(zzcbn.zzi(zzcbn0) != null) {
            zzcbn.zzi(zzcbn0).zzb(this.zza, this.zzb);
        }
    }
}

