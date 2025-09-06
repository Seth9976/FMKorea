package com.google.android.gms.internal.ads;

public final class zztv implements Runnable {
    public final zzub zza;
    public final zzuc zzb;
    public final zzto zzc;

    public zztv(zzub zzub0, zzuc zzuc0, zzto zzto0) {
        this.zza = zzub0;
        this.zzb = zzuc0;
        this.zzc = zzto0;
    }

    @Override
    public final void run() {
        this.zzb.zzac(0, this.zza.zzb, this.zzc);
    }
}

