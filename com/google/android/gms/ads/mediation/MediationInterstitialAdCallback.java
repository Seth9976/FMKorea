package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

public interface MediationInterstitialAdCallback extends MediationAdCallback {
    void onAdFailedToShow(AdError arg1);

    @Deprecated
    void onAdFailedToShow(String arg1);

    void onAdLeftApplication();
}

