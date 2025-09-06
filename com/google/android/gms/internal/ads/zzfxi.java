package com.google.android.gms.internal.ads;

import java.util.Set;

final class zzfxi extends zzfxf {
    private zzfxi() {
        super(null);
    }

    zzfxi(zzfxh zzfxh0) {
        super(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxf
    final int zza(zzfxj zzfxj0) {
        synchronized(zzfxj0) {
            int v1 = zzfxj0.remaining;
            zzfxj0.remaining = v1 - 1;
            return v1 - 1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfxf
    final void zzb(zzfxj zzfxj0, Set set0, Set set1) {
        synchronized(zzfxj0) {
            if(zzfxj0.seenExceptions == null) {
                zzfxj0.seenExceptions = set1;
            }
        }
    }
}

