package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;

final class zzdz extends zzaz {
    final zzea zza;

    zzdz(zzea zzea0) {
        this.zza = zzea0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzaz
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        zzea.zze(this.zza).zzb(this.zza.zzi());
        super.onAdFailedToLoad(loadAdError0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzaz
    public final void onAdLoaded() {
        zzea.zze(this.zza).zzb(this.zza.zzi());
        super.onAdLoaded();
    }
}

