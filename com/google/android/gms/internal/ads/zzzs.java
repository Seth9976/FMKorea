package com.google.android.gms.internal.ads;

public final class zzzs implements Runnable {
    public final zzzv zza;
    public final zzam zzb;
    public final zzie zzc;

    public zzzs(zzzv zzzv0, zzam zzam0, zzie zzie0) {
        this.zza = zzzv0;
        this.zzb = zzam0;
        this.zzc = zzie0;
    }

    @Override
    public final void run() {
        this.zza.zzl(this.zzb, this.zzc);
    }
}

