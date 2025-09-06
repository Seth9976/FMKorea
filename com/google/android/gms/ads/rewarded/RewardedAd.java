package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbwf;
import com.google.android.gms.internal.ads.zzbzp;
import com.google.android.gms.internal.ads.zzcaa;

public abstract class RewardedAd {
    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public static void load(Context context0, String s, AdRequest adRequest0, RewardedAdLoadCallback rewardedAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest0, "AdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedAdLoadCallback0, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbbr.zza(context0);
        if(((Boolean)zzbdi.zzl.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue()) {
            zzc zzc0 = new zzc(context0, s, adRequest0, rewardedAdLoadCallback0);
            zzbzp.zzb.execute(zzc0);
            return;
        }
        zzcaa.zze("Loading on UI thread");
        new zzbwf(context0, s).zza(adRequest0.zza(), rewardedAdLoadCallback0);
    }

    public static void load(Context context0, String s, AdManagerAdRequest adManagerAdRequest0, RewardedAdLoadCallback rewardedAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest0, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedAdLoadCallback0, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbbr.zza(context0);
        if(((Boolean)zzbdi.zzl.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue()) {
            zzcaa.zze("Loading on background thread");
            zzb zzb0 = new zzb(context0, s, adManagerAdRequest0, rewardedAdLoadCallback0);
            zzbzp.zzb.execute(zzb0);
            return;
        }
        zzcaa.zze("Loading on UI thread");
        new zzbwf(context0, s).zza(adManagerAdRequest0.zza(), rewardedAdLoadCallback0);
    }

    public abstract void setFullScreenContentCallback(FullScreenContentCallback arg1);

    public abstract void setImmersiveMode(boolean arg1);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener arg1);

    public abstract void setOnPaidEventListener(OnPaidEventListener arg1);

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions arg1);

    public abstract void show(Activity arg1, OnUserEarnedRewardListener arg2);
}

