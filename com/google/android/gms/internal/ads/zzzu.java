package com.google.android.gms.internal.ads;

public final class zzzu implements Runnable {
    public final zzzv zza;
    public final String zzb;

    public zzzu(zzzv zzzv0, String s) {
        this.zza = zzzv0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzh(this.zzb);
    }
}

