package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

final class zzdus extends InterstitialAdLoadCallback {
    final String zza;
    final String zzb;
    final zzduy zzc;

    zzdus(zzduy zzduy0, String s, String s1) {
        this.zzc = zzduy0;
        this.zza = s;
        this.zzb = s1;
        super();
    }

    @Override  // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        String s = zzduy.zzc(loadAdError0);
        zzduy.zzd(this.zzc, s, this.zzb);
    }

    @Override  // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(Object object0) {
        this.zzc.zzg(this.zza, ((InterstitialAd)object0), this.zzb);
    }
}

