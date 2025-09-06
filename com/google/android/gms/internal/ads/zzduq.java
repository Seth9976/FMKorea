package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;
import com.google.android.gms.ads.appopen.AppOpenAd;

final class zzduq extends AppOpenAdLoadCallback {
    final String zza;
    final String zzb;
    final zzduy zzc;

    zzduq(zzduy zzduy0, String s, String s1) {
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
        this.zzc.zzg(this.zza, ((AppOpenAd)object0), this.zzb);
    }
}

