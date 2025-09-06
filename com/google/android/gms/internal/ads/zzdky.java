package com.google.android.gms.internal.ads;

import Z1.d;

public final class zzdky implements zzfxl {
    public final d zza;

    public zzdky(d d0) {
        this.zza = d0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        d d0 = this.zza;
        if(((zzcfi)object0) == null) {
            throw new zzehf(1, "Retrieve Web View from image ad response failed.");
        }
        return d0;
    }
}

