package com.google.android.gms.internal.ads;

public final class zzesk implements Runnable {
    public final zzesm zza;
    public final long zzb;
    public final zzesj zzc;

    public zzesk(zzesm zzesm0, long v, zzesj zzesj0) {
        this.zza = zzesm0;
        this.zzb = v;
        this.zzc = zzesj0;
    }

    @Override
    public final void run() {
        this.zza.zzb(this.zzb, this.zzc);
    }
}

