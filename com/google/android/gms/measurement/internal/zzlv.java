package com.google.android.gms.measurement.internal;

final class zzlv implements Runnable {
    private final zzmp zza;
    private final Runnable zzb;

    zzlv(zzlu zzlu0, zzmp zzmp0, Runnable runnable0) {
        this.zza = zzmp0;
        this.zzb = runnable0;
        super();
    }

    @Override
    public final void run() {
        this.zza.zzr();
        this.zza.zza(this.zzb);
        this.zza.zzw();
    }
}

