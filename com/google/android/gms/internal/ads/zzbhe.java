package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;

public final class zzbhe extends zzbgj {
    private final OnUnifiedNativeAdLoadedListener zza;

    public zzbhe(OnUnifiedNativeAdLoadedListener unifiedNativeAd$OnUnifiedNativeAdLoadedListener0) {
        this.zza = unifiedNativeAd$OnUnifiedNativeAdLoadedListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgk
    public final void zze(zzbgt zzbgt0) {
        zzbgu zzbgu0 = new zzbgu(zzbgt0);
        this.zza.onUnifiedNativeAdLoaded(zzbgu0);
    }
}

