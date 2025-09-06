package com.google.android.gms.internal.ads;

public final class zzou implements Runnable {
    public final zzox zza;
    public final String zzb;

    public zzou(zzox zzox0, String s) {
        this.zza = zzox0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzk(this.zzb);
    }
}

