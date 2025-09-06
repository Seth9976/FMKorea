package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

final class zzduv extends AdListener {
    final String zza;
    final zzduy zzb;

    zzduv(zzduy zzduy0, String s) {
        this.zzb = zzduy0;
        this.zza = s;
        super();
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        String s = zzduy.zzc(loadAdError0);
        zzduy.zzd(this.zzb, s, this.zza);
    }
}

