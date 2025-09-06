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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbwf extends RewardedAd {
    private final String zza;
    private final zzbvw zzb;
    private final Context zzc;
    private final zzbwo zzd;
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;

    public zzbwf(Context context0, String s) {
        this.zzc = context0.getApplicationContext();
        this.zza = s;
        this.zzb = zzay.zza().zzq(context0, s, new zzboc());
        this.zzd = new zzbwo();
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            zzbvt zzbvt0 = this.zzb == null ? null : this.zzb.zzd();
            return zzbvt0 == null ? RewardItem.DEFAULT_REWARD : new zzbwg(zzbvt0);
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        return RewardItem.DEFAULT_REWARD;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback0) {
        this.zzg = fullScreenContentCallback0;
        this.zzd.zzb(fullScreenContentCallback0);
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener0) {
        try {
            this.zze = onAdMetadataChangedListener0;
            zzbvw zzbvw0 = this.zzb;
            if(zzbvw0 != null) {
                zzbvw0.zzi(new zzfd(onAdMetadataChangedListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener0) {
        try {
            this.zzf = onPaidEventListener0;
            zzbvw zzbvw0 = this.zzb;
            if(zzbvw0 != null) {
                zzbvw0.zzj(new zzfe(onPaidEventListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions0) {
        if(serverSideVerificationOptions0 != null) {
            zzbvw zzbvw0 = this.zzb;
            if(zzbvw0 != null) {
                try {
                    zzbvw0.zzl(new zzbwk(serverSideVerificationOptions0));
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity0, OnUserEarnedRewardListener onUserEarnedRewardListener0) {
        this.zzd.zzc(onUserEarnedRewardListener0);
        if(activity0 == null) {
            zzcaa.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
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

    public final void zza(zzdx zzdx0, RewardedAdLoadCallback rewardedAdLoadCallback0) {
        try {
            zzbvw zzbvw0 = this.zzb;
            if(zzbvw0 != null) {
                zzbvw0.zzf(zzp.zza.zza(this.zzc, zzdx0), new zzbwj(rewardedAdLoadCallback0, this));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

