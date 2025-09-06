package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzfuk extends zzfse {
    final Iterator zza;
    final zzfrj zzb;

    zzfuk(Iterator iterator0, zzfrj zzfrj0) {
        this.zza = iterator0;
        this.zzb = zzfrj0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfse
    protected final Object zza() {
        while(this.zza.hasNext()) {
            Object object0 = this.zza.next();
            if(this.zzb.zza(object0)) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        this.zzb();
        return null;
    }
}

