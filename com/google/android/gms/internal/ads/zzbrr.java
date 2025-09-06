package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;

public final class zzbrr extends zzbgj {
    private final OnNativeAdLoadedListener zza;

    public zzbrr(OnNativeAdLoadedListener nativeAd$OnNativeAdLoadedListener0) {
        this.zza = nativeAd$OnNativeAdLoadedListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgk
    public final void zze(zzbgt zzbgt0) {
        zzbrk zzbrk0 = new zzbrk(zzbgt0);
        this.zza.onNativeAdLoaded(zzbrk0);
    }
}

