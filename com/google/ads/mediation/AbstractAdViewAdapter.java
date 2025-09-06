package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.Date;
import java.util.Set;

public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zza {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdLoader adLoader;
    protected AdView mAdView;
    protected InterstitialAd mInterstitialAd;

    AdRequest buildAdRequest(Context context0, MediationAdRequest mediationAdRequest0, Bundle bundle0, Bundle bundle1) {
        Builder adRequest$Builder0 = new Builder();
        Date date0 = mediationAdRequest0.getBirthday();
        if(date0 != null) {
            adRequest$Builder0.zzb(date0);
        }
        int v = mediationAdRequest0.getGender();
        if(v != 0) {
            adRequest$Builder0.zzc(v);
        }
        Set set0 = mediationAdRequest0.getKeywords();
        if(set0 != null) {
            for(Object object0: set0) {
                adRequest$Builder0.addKeyword(((String)object0));
            }
        }
        if(mediationAdRequest0.isTesting()) {
            adRequest$Builder0.zza(zzbzt.zzy(context0));
        }
        boolean z = true;
        if(mediationAdRequest0.taggedForChildDirectedTreatment() != -1) {
            if(mediationAdRequest0.taggedForChildDirectedTreatment() != 1) {
                z = false;
            }
            adRequest$Builder0.zze(z);
        }
        adRequest$Builder0.zzd(mediationAdRequest0.isDesignedForFamilies());
        Bundle bundle2 = this.buildExtrasBundle(bundle0, bundle1);
        adRequest$Builder0.addNetworkExtrasBundle(AdMobAdapter.class, bundle2);
        return adRequest$Builder0.build();
    }

    protected abstract Bundle buildExtrasBundle(Bundle arg1, Bundle arg2);

    public String getAdUnitId(Bundle bundle0) {
        return bundle0.getString("pubid");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    InterstitialAd getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override  // com.google.android.gms.ads.mediation.zza
    public zzdq getVideoController() {
        return this.mAdView == null ? null : this.mAdView.zza().zza();
    }

    com.google.android.gms.ads.AdLoader.Builder newAdLoader(Context context0, String s) {
        return new com.google.android.gms.ads.AdLoader.Builder(context0, s);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView0 = this.mAdView;
        if(adView0 != null) {
            adView0.destroy();
            this.mAdView = null;
        }
        if(this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if(this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override  // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd0 = this.mInterstitialAd;
        if(interstitialAd0 != null) {
            interstitialAd0.setImmersiveMode(z);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        AdView adView0 = this.mAdView;
        if(adView0 != null) {
            adView0.pause();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        AdView adView0 = this.mAdView;
        if(adView0 != null) {
            adView0.resume();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context0, MediationBannerListener mediationBannerListener0, Bundle bundle0, AdSize adSize0, MediationAdRequest mediationAdRequest0, Bundle bundle1) {
        AdView adView0 = new AdView(context0);
        this.mAdView = adView0;
        adView0.setAdSize(new AdSize(adSize0.getWidth(), adSize0.getHeight()));
        this.mAdView.setAdUnitId(this.getAdUnitId(bundle0));
        this.mAdView.setAdListener(new b(this, mediationBannerListener0));
        this.mAdView.loadAd(this.buildAdRequest(context0, mediationAdRequest0, bundle1, bundle0));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context0, MediationInterstitialListener mediationInterstitialListener0, Bundle bundle0, MediationAdRequest mediationAdRequest0, Bundle bundle1) {
        InterstitialAd.load(context0, this.getAdUnitId(bundle0), this.buildAdRequest(context0, mediationAdRequest0, bundle1, bundle0), new c(this, mediationInterstitialListener0));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context0, MediationNativeListener mediationNativeListener0, Bundle bundle0, NativeMediationAdRequest nativeMediationAdRequest0, Bundle bundle1) {
        e e0 = new e(this, mediationNativeListener0);
        com.google.android.gms.ads.AdLoader.Builder adLoader$Builder0 = this.newAdLoader(context0, bundle0.getString("pubid")).withAdListener(e0);
        adLoader$Builder0.withNativeAdOptions(nativeMediationAdRequest0.getNativeAdOptions());
        adLoader$Builder0.withNativeAdOptions(nativeMediationAdRequest0.getNativeAdRequestOptions());
        if(nativeMediationAdRequest0.isUnifiedNativeAdRequested()) {
            adLoader$Builder0.forUnifiedNativeAd(e0);
        }
        if(nativeMediationAdRequest0.zzb()) {
            for(Object object0: nativeMediationAdRequest0.zza().keySet()) {
                adLoader$Builder0.forCustomTemplateAd(((String)object0), e0, (((Boolean)nativeMediationAdRequest0.zza().get(((String)object0))).booleanValue() ? e0 : null));
            }
        }
        AdLoader adLoader0 = adLoader$Builder0.build();
        this.adLoader = adLoader0;
        adLoader0.loadAd(this.buildAdRequest(context0, nativeMediationAdRequest0, bundle1, bundle0));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        InterstitialAd interstitialAd0 = this.mInterstitialAd;
        if(interstitialAd0 != null) {
            interstitialAd0.show(null);
        }
    }
}

