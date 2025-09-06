package com.google.android.gms.internal.ads;

final class zzfws.zzc {
    static final zzfws.zzc zza;
    final Throwable zzb;

    static {
        zzfws.zzc.zza = new zzfws.zzc(new Throwable("Failure occurred while trying to finish a future.") {
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override
            public final Throwable fillInStackTrace() {
                synchronized(this) {
                }
                return this;
            }
        });
    }

    zzfws.zzc(Throwable throwable0) {
        throwable0.getClass();
        this.zzb = throwable0;
    }
}

