package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbzp;

public abstract class InterstitialAd {
    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public static void load(Context context0, String s, AdRequest adRequest0, InterstitialAdLoadCallback interstitialAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest0, "AdRequest cannot be null.");
        Preconditions.checkNotNull(interstitialAdLoadCallback0, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbbr.zza(context0);
        if(((Boolean)zzbdi.zzi.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue()) {
            zza zza0 = new zza(context0, s, adRequest0, interstitialAdLoadCallback0);
            zzbzp.zzb.execute(zza0);
            return;
        }
        new zzblk(context0, s).zza(adRequest0.zza(), interstitialAdLoadCallback0);
    }

    public abstract void setFullScreenContentCallback(FullScreenContentCallback arg1);

    public abstract void setImmersiveMode(boolean arg1);

    public abstract void setOnPaidEventListener(OnPaidEventListener arg1);

    public abstract void show(Activity arg1);
}

