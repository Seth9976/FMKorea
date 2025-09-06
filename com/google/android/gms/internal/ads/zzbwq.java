package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbwq extends RewardedInterstitialAd {
    private final String zza;
    private final zzbvw zzb;
    private final Context zzc;
    private final zzbwo zzd;
    private FullScreenContentCallback zze;
    private OnAdMetadataChangedListener zzf;
    private OnPaidEventListener zzg;

    public zzbwq(Context context0, String s) {
        this.zza = s;
        this.zzc = context0.getApplicationContext();
        this.zzb = zzay.zza().zzq(context0, s, new zzboc());
        this.zzd = new zzbwo();
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        zzbvw zzbvw0 = this.zzb;
        if(zzbvw0 != null) {
            try {
                return zzbvw0.zzb();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzbvw zzbvw0 = this.zzb;
        if(zzbvw0 != null) {
            try {
                return ResponseInfo.zzb(zzbvw0.zzc());
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                return ResponseInfo.zzb(null);
            }
        }
        return ResponseInfo.zzb(null);
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            zzbvt zzbvt0 = this.zzb == null ? null : this.zzb.zzd();
            if(zzbvt0 != null) {
                return new zzbwg(zzbvt0);
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback0) {
        this.zze = fullScreenContentCallback0;
        this.zzd.zzb(fullScreenContentCallback0);
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzbvw zzbvw0 = this.zzb;
            if(zzbvw0 != null) {
                zzbvw0.zzh(z);
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener0) {
        try {
            this.zzf = onAdMetadataChangedListener0;
            zzbvw zzbvw0 = this.zzb;
            if(zzbvw0 != null) {
                zzbvw0.zzi(new zzfd(onAdMetadataChangedListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener0) {
        try {
            this.zzg = onPaidEventListener0;
            zzbvw zzbvw0 = this.zzb;
            if(zzbvw0 != null) {
                zzbvw0.zzj(new zzfe(onPaidEventListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions0) {
        try {
            zzbvw zzbvw0 = this.zzb;
            if(zzbvw0 != null) {
                zzbvw0.zzl(new zzbwk(serverSideVerificationOptions0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity0, OnUserEarnedRewardListener onUserEarnedRewardListener0) {
        this.zzd.zzc(onUserEarnedRewardListener0);
        try {
            zzbvw zzbvw0 = this.zzb;
            if(zzbvw0 != null) {
                zzbvw0.zzk(this.zzd);
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(activity0);
                this.zzb.zzm(iObjectWrapper0);
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zza(zzdx zzdx0, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0) {
        try {
            zzbvw zzbvw0 = this.zzb;
            if(zzbvw0 != null) {
                zzbvw0.zzg(zzp.zza.zza(this.zzc, zzdx0), new zzbwp(rewardedInterstitialAdLoadCallback0, this));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

