package com.google.android.gms.internal.ads;

public final class zzjh implements Runnable {
    public final zzkb zza;
    public final zzkj zzb;

    public zzjh(zzkb zzkb0, zzkj zzkj0) {
        this.zza = zzkb0;
        this.zzb = zzkj0;
    }

    @Override
    public final void run() {
        this.zza.zzT(this.zzb);
    }
}

