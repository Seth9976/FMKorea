package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final class zzfzc extends zzfyn {
    final zzfzd zza;
    private final Callable zzb;

    zzfzc(zzfzd zzfzd0, Callable callable0) {
        this.zza = zzfzd0;
        super();
        callable0.getClass();
        this.zzb = callable0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfyn
    final Object zza() {
        return this.zzb.call();
    }

    @Override  // com.google.android.gms.internal.ads.zzfyn
    final String zzb() {
        return this.zzb.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzfyn
    final void zzd(Throwable throwable0) {
        this.zza.zzd(throwable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfyn
    final void zze(Object object0) {
        this.zza.zzc(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfyn
    final boolean zzg() {
        return this.zza.isDone();
    }
}

