package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

public final class zzlt implements Runnable {
    private zzlu zza;
    private zzfr zzb;
    private JobParameters zzc;

    public zzlt(zzlu zzlu0, zzfr zzfr0, JobParameters jobParameters0) {
        this.zza = zzlu0;
        this.zzb = zzfr0;
        this.zzc = jobParameters0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb, this.zzc);
    }
}

