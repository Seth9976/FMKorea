package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.FullScreenContentCallback;

public final class zzbb extends zzch {
    private final FullScreenContentCallback zza;

    public zzbb(FullScreenContentCallback fullScreenContentCallback0) {
        this.zza = fullScreenContentCallback0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zzb() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdDismissedFullScreenContent();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zzd(zze zze0) {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdFailedToShowFullScreenContent(zze0.zza());
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zze() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdShowedFullScreenContent();
        }
    }
}

