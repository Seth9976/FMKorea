package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;

@Deprecated
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    @Deprecated
    void onAdFailedToLoad(int arg1);

    void onAdFailedToLoad(AdError arg1);

    void onAdLeftApplication();

    void onAdOpened();
}

