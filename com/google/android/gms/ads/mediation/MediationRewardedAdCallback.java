package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.rewarded.RewardItem;

public interface MediationRewardedAdCallback extends MediationAdCallback {
    void onAdFailedToShow(AdError arg1);

    @Deprecated
    void onAdFailedToShow(String arg1);

    void onUserEarnedReward(RewardItem arg1);

    void onVideoComplete();

    void onVideoStart();
}

