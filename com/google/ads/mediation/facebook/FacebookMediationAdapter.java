package com.google.ads.mediation.facebook;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdSettings;
import com.facebook.ads.BidderTokenProvider;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import i1.d;
import j1.a;
import j1.b;
import j1.c;
import java.util.ArrayList;
import java.util.List;

public class FacebookMediationAdapter extends RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 0x6F;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final String PLACEMENT_PARAMETER = "pubid";
    public static final String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final String TAG = "FacebookMediationAdapter";
    private a a;
    private b b;
    private c c;
    private i1.b d;
    private i1.c e;
    private final d f;

    static {
    }

    public FacebookMediationAdapter() {
        this.f = new d();
    }

    @Override  // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData0, SignalCallbacks signalCallbacks0) {
        signalCallbacks0.onSuccess(BidderTokenProvider.getBidderToken(rtbSignalData0.getContext()));
    }

    public static AdError getAdError(com.facebook.ads.AdError adError0) {
        return new AdError(adError0.getErrorCode(), adError0.getErrorMessage(), "com.facebook.ads");
    }

    public static String getPlacementID(Bundle bundle0) {
        String s = bundle0.getString("placement_id");
        return s == null ? bundle0.getString("pubid") : s;
    }

    // 去混淆评级： 中等(50)
    @Override  // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        return new VersionInfo(6, 16, 0);
    }

    // 去混淆评级： 中等(60)
    @Override  // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        return new VersionInfo(6, 16, 0);
    }

    @Override  // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context0, InitializationCompleteCallback initializationCompleteCallback0, List list0) {
        class com.google.ads.mediation.facebook.FacebookMediationAdapter.a implements com.google.ads.mediation.facebook.a.a {
            final InitializationCompleteCallback a;
            final FacebookMediationAdapter b;

            com.google.ads.mediation.facebook.FacebookMediationAdapter.a(InitializationCompleteCallback initializationCompleteCallback0) {
                this.a = initializationCompleteCallback0;
                super();
            }

            @Override  // com.google.ads.mediation.facebook.a$a
            public void a(AdError adError0) {
                this.a.onInitializationFailed(adError0.getMessage());
            }

            @Override  // com.google.ads.mediation.facebook.a$a
            public void b() {
                this.a.onInitializationSucceeded();
            }
        }

        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            String s = FacebookMediationAdapter.getPlacementID(((MediationConfiguration)object0).getServerParameters());
            if(!TextUtils.isEmpty(s)) {
                arrayList0.add(s);
            }
        }
        if(arrayList0.isEmpty()) {
            initializationCompleteCallback0.onInitializationFailed("Initialization failed. No placement IDs found.");
            return;
        }
        com.google.ads.mediation.facebook.a.a().b(context0, arrayList0, new com.google.ads.mediation.facebook.FacebookMediationAdapter.a(this, initializationCompleteCallback0));
    }

    @Override  // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        a a0 = new a(mediationBannerAdConfiguration0, mediationAdLoadCallback0);
        this.a = a0;
        a0.a();
    }

    @Override  // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        b b0 = new b(mediationInterstitialAdConfiguration0, mediationAdLoadCallback0, this.f);
        this.b = b0;
        b0.a();
    }

    @Override  // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        c c0 = new c(mediationNativeAdConfiguration0, mediationAdLoadCallback0);
        this.c = c0;
        c0.f();
    }

    @Override  // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        i1.b b0 = new i1.b(mediationRewardedAdConfiguration0, mediationAdLoadCallback0);
        this.d = b0;
        b0.b();
    }

    @Override  // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        i1.c c0 = new i1.c(mediationRewardedAdConfiguration0, mediationAdLoadCallback0);
        this.e = c0;
        c0.b();
    }

    public static void setMixedAudience(MediationAdConfiguration mediationAdConfiguration0) {
        switch(mediationAdConfiguration0.taggedForChildDirectedTreatment()) {
            case 0: {
                AdSettings.setMixedAudience(false);
                return;
            }
            case 1: {
                AdSettings.setMixedAudience(true);
            }
        }
    }
}

