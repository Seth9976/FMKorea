package com.google.android.gms.internal.ads;

import Z1.d;

final class zzfzb extends zzfyn {
    final zzfzd zza;
    private final zzfxk zzb;

    zzfzb(zzfzd zzfzd0, zzfxk zzfxk0) {
        this.zza = zzfzd0;
        super();
        this.zzb = zzfxk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfyn
    final Object zza() {
        d d0 = this.zzb.zza();
        zzfri.zzd(d0, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return d0;
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
        this.zza.zzs(((d)object0));
    }

    @Override  // com.google.android.gms.internal.ads.zzfyn
    final boolean zzg() {
        return this.zza.isDone();
    }
}

