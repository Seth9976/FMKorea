package com.google.android.gms.internal.ads;

public final class zzty implements Runnable {
    public final zzub zza;
    public final zzuc zzb;
    public final zztj zzc;
    public final zzto zzd;

    public zzty(zzub zzub0, zzuc zzuc0, zztj zztj0, zzto zzto0) {
        this.zza = zzub0;
        this.zzb = zzuc0;
        this.zzc = zztj0;
        this.zzd = zzto0;
    }

    @Override
    public final void run() {
        this.zzb.zzag(0, this.zza.zzb, this.zzc, this.zzd);
    }
}

