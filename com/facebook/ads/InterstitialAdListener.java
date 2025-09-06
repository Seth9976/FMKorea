package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
public interface InterstitialAdListener extends AdListener {
    void onInterstitialDismissed(Ad arg1);

    void onInterstitialDisplayed(Ad arg1);
}

