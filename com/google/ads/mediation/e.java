package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.mediation.MediationNativeListener;

final class e extends AdListener implements OnCustomClickListener, OnCustomTemplateAdLoadedListener, OnUnifiedNativeAdLoadedListener {
    final AbstractAdViewAdapter f;
    final MediationNativeListener g;

    public e(AbstractAdViewAdapter abstractAdViewAdapter0, MediationNativeListener mediationNativeListener0) {
        this.f = abstractAdViewAdapter0;
        this.g = mediationNativeListener0;
    }

    @Override  // com.google.android.gms.ads.AdListener
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
    public final void onAdImpression() {
        this.g.onAdImpression(this.f);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.g.onAdOpened(this.f);
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd$OnCustomClickListener
    public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd0, String s) {
        this.g.zze(this.f, nativeCustomTemplateAd0, s);
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd$OnCustomTemplateAdLoadedListener
    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd0) {
        this.g.zzc(this.f, nativeCustomTemplateAd0);
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd$OnUnifiedNativeAdLoadedListener
    public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd0) {
        a a0 = new a(unifiedNativeAd0);
        this.g.onAdLoaded(this.f, a0);
    }
}

