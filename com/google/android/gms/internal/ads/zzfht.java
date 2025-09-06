package com.google.android.gms.internal.ads;

public final class zzfht implements Runnable {
    public final zzfhu zza;
    public final zzfhk zzb;

    public zzfht(zzfhu zzfhu0, zzfhk zzfhk0) {
        this.zza = zzfhu0;
        this.zzb = zzfhk0;
    }

    @Override
    public final void run() {
        this.zza.zzc(this.zzb);
    }
}

