package com.google.android.gms.internal.ads;

import Z1.d;

final class zzfwy extends zzfxa {
    zzfwy(d d0, zzfxl zzfxl0) {
        super(d0, zzfxl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxa
    final Object zze(Object object0, Object object1) {
        d d0 = ((zzfxl)object0).zza(object1);
        zzfri.zzd(d0, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ((zzfxl)object0));
        return d0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxa
    final void zzf(Object object0) {
        this.zzs(((d)object0));
    }
}

