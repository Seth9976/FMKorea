package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class zzfws.zzd {
    zzfws.zzd next;
    static final zzfws.zzd zza;
    final Runnable zzb;
    final Executor zzc;

    static {
        zzfws.zzd.zza = new zzfws.zzd();
    }

    zzfws.zzd() {
        this.zzb = null;
        this.zzc = null;
    }

    zzfws.zzd(Runnable runnable0, Executor executor0) {
        this.zzb = runnable0;
        this.zzc = executor0;
    }
}

