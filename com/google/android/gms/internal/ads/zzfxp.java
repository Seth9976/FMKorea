package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class zzfxp extends zzfxq {
    final zzfxr zza;
    private final Callable zzc;

    zzfxp(zzfxr zzfxr0, Callable callable0, Executor executor0) {
        this.zza = zzfxr0;
        super(zzfxr0, executor0);
        this.zzc = callable0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfyn
    final Object zza() {
        return this.zzc.call();
    }

    @Override  // com.google.android.gms.internal.ads.zzfyn
    final String zzb() {
        return this.zzc.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxq
    final void zzc(Object object0) {
        this.zza.zzc(object0);
    }
}

