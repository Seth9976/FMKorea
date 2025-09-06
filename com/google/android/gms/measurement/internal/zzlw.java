package com.google.android.gms.measurement.internal;

import android.content.Intent;

public final class zzlw implements Runnable {
    private zzlu zza;
    private int zzb;
    private zzfr zzc;
    private Intent zzd;

    public zzlw(zzlu zzlu0, int v, zzfr zzfr0, Intent intent0) {
        this.zza = zzlu0;
        this.zzb = v;
        this.zzc = zzfr0;
        this.zzd = intent0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb, this.zzc, this.zzd);
    }
}

