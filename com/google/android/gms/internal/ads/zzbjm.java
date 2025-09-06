package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

public final class zzbjm extends zzbjo {
    private final OnH5AdsEventListener zza;

    public zzbjm(OnH5AdsEventListener onH5AdsEventListener0) {
        this.zza = onH5AdsEventListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zzb(String s) {
        this.zza.onH5AdsEvent(s);
    }
}

