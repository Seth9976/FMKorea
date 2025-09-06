package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzblk extends AdManagerInterstitialAd {
    private final Context zza;
    private final zzp zzb;
    private final zzbu zzc;
    private final String zzd;
    private final zzboc zze;
    private AppEventListener zzf;
    private FullScreenContentCallback zzg;
    private OnPaidEventListener zzh;

    public zzblk(Context context0, String s) {
        zzboc zzboc0 = new zzboc();
        this.zze = zzboc0;
        this.zza = context0;
        this.zzd = s;
        this.zzb = zzp.zza;
        this.zzc = zzay.zza().zze(context0, new zzq(), s, zzboc0);
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzbu zzbu0 = this.zzc;
        if(zzbu0 != null) {
            try {
                return ResponseInfo.zzb(zzbu0.zzk());
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                return ResponseInfo.zzb(null);
            }
        }
        return ResponseInfo.zzb(null);
    }

    @Override  // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener0) {
        try {
            this.zzf = appEventListener0;
            zzbu zzbu0 = this.zzc;
            if(zzbu0 != null) {
                zzbu0.zzG((appEventListener0 == null ? null : new zzaut(appEventListener0)));
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzl("#007 Could not call remote method.", remoteException0);
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback0) {
        try {
            this.zzg = fullScreenContentCallback0;
            zzbu zzbu0 = this.zzc;
            if(zzbu0 != null) {
                zzbu0.zzJ(new zzbb(fullScreenContentCallback0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzbu zzbu0 = this.zzc;
            if(zzbu0 != null) {
                zzbu0.zzL(z);
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener0) {
        try {
            this.zzh = onPaidEventListener0;
            zzbu zzbu0 = this.zzc;
            if(zzbu0 != null) {
                zzbu0.zzP(new zzfe(onPaidEventListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity0) {
        if(activity0 == null) {
            zzcaa.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbu zzbu0 = this.zzc;
            if(zzbu0 != null) {
                zzbu0.zzW(ObjectWrapper.wrap(activity0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zza(zzdx zzdx0, AdLoadCallback adLoadCallback0) {
        try {
            zzbu zzbu0 = this.zzc;
            if(zzbu0 != null) {
                zzbu0.zzy(this.zzb.zza(this.zza, zzdx0), new zzh(adLoadCallback0, this));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            adLoadCallback0.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}

