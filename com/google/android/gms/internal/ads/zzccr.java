package com.google.android.gms.internal.ads;

public final class zzccr implements Runnable {
    public final zzcdb zza;
    public final String zzb;

    public zzccr(zzcdb zzcdb0, String s) {
        this.zza = zzcdb0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzK(this.zzb);
    }
}

