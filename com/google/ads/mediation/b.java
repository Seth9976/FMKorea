package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

final class b extends AdListener implements AppEventListener, zza {
    final AbstractAdViewAdapter f;
    final MediationBannerListener g;

    public b(AbstractAdViewAdapter abstractAdViewAdapter0, MediationBannerListener mediationBannerListener0) {
        this.f = abstractAdViewAdapter0;
        this.g = mediationBannerListener0;
    }

    @Override  // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.g.onAdClicked(this.f);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.g.onAdClosed(this.f);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        this.g.onAdFailedToLoad(this.f, loadAdError0);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.g.onAdLoaded(this.f);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.g.onAdOpened(this.f);
    }

    @Override  // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String s, String s1) {
        this.g.zzd(this.f, s, s1);
    }
}

