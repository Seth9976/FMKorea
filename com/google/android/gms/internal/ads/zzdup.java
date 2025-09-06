package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeAd;

public final class zzdup implements OnNativeAdLoadedListener {
    public final zzduy zza;
    public final String zzb;
    public final String zzc;

    public zzdup(zzduy zzduy0, String s, String s1) {
        this.zza = zzduy0;
        this.zzb = s;
        this.zzc = s1;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd0) {
        this.zza.zzg(this.zzb, nativeAd0, this.zzc);
    }
}

