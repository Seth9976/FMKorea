package com.google.android.gms.internal.ads;

import Z1.d;

final class zzfwo extends zzfwq {
    zzfwo(d d0, Class class0, zzfxl zzfxl0) {
        super(d0, class0, zzfxl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwq
    final Object zze(Object object0, Throwable throwable0) {
        d d0 = ((zzfxl)object0).zza(throwable0);
        zzfri.zzd(d0, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ((zzfxl)object0));
        return d0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwq
    final void zzf(Object object0) {
        this.zzs(((d)object0));
    }
}

