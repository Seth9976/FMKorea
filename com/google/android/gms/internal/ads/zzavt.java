package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;
import com.google.android.gms.ads.internal.client.zze;

public final class zzavt extends zzawa {
    private final AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzavt(AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0, String s) {
        this.zza = appOpenAd$AppOpenAdLoadCallback0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzawb
    public final void zzb(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzawb
    public final void zzc(zze zze0) {
        if(this.zza != null) {
            LoadAdError loadAdError0 = zze0.zzb();
            this.zza.onAdFailedToLoad(loadAdError0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzawb
    public final void zzd(zzavy zzavy0) {
        if(this.zza != null) {
            zzavu zzavu0 = new zzavu(zzavy0, this.zzb);
            this.zza.onAdLoaded(zzavu0);
        }
    }
}

