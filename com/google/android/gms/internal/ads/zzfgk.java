package com.google.android.gms.internal.ads;

public final class zzfgk implements Runnable {
    public final zzfgl zza;
    public final String zzb;

    public zzfgk(zzfgl zzfgl0, String s) {
        this.zza = zzfgl0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

