package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

final class zziz implements Executor {
    private final zziq zza;

    zziz(zziq zziq0) {
        this.zza = zziq0;
        super();
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.zza.zzl().zzb(runnable0);
    }
}

