package com.google.android.gms.internal.ads;

public final class zzks implements Runnable {
    public final zzkt zza;
    public final zzfua zzb;
    public final zzts zzc;

    public zzks(zzkt zzkt0, zzfua zzfua0, zzts zzts0) {
        this.zza = zzkt0;
        this.zzb = zzfua0;
        this.zzc = zzts0;
    }

    @Override
    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}

