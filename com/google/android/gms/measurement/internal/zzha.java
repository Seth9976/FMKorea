package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzha implements Thread.UncaughtExceptionHandler {
    private final String zza;
    private final zzgy zzb;

    public zzha(zzgy zzgy0, String s) {
        this.zzb = zzgy0;
        super();
        Preconditions.checkNotNull(s);
        this.zza = s;
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        synchronized(this) {
            this.zzb.zzj().zzg().zza(this.zza, throwable0);
        }
    }
}

