package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

final class d extends FullScreenContentCallback {
    final AbstractAdViewAdapter a;
    final MediationInterstitialListener b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter0, MediationInterstitialListener mediationInterstitialListener0) {
        this.a = abstractAdViewAdapter0;
        this.b = mediationInterstitialListener0;
    }

    @Override  // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.b.onAdClosed(this.a);
    }

    @Override  // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.b.onAdOpened(this.a);
    }
}

