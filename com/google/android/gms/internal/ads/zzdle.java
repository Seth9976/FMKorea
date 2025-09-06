package com.google.android.gms.internal.ads;

import Z1.d;

public final class zzdle implements zzfxl {
    public final d zza;

    public zzdle(d d0) {
        this.zza = d0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        d d0 = this.zza;
        if(((zzcfi)object0) == null || ((zzcfi)object0).zzq() == null) {
            throw new zzehf(1, "Retrieve video view in html5 ad response failed.");
        }
        return d0;
    }
}

