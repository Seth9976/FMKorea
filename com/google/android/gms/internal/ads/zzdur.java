package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

final class zzdur extends AdListener {
    final String zza;
    final AdView zzb;
    final String zzc;
    final zzduy zzd;

    zzdur(zzduy zzduy0, String s, AdView adView0, String s1) {
        this.zzd = zzduy0;
        this.zza = s;
        this.zzb = adView0;
        this.zzc = s1;
        super();
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        String s = zzduy.zzc(loadAdError0);
        zzduy.zzd(this.zzd, s, this.zzc);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}

