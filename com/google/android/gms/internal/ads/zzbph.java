package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbph implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    private final zzbol zza;
    private UnifiedNativeAdMapper zzb;
    private NativeCustomTemplateAd zzc;

    public zzbph(zzbol zzbol0) {
        this.zza = zzbol0;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper0 = this.zzb;
        if(this.zzc == null) {
            if(unifiedNativeAdMapper0 == null) {
                zzcaa.zzl("#007 Could not call remote method.", null);
                return;
            }
            if(!unifiedNativeAdMapper0.getOverrideClickHandling()) {
                zzcaa.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzcaa.zze("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter0, int v) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze(("Adapter called onAdFailedToLoad with error. " + v));
        try {
            this.zza.zzg(v);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter0, AdError adError0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze(("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError0.getCode() + ". ErrorMessage: " + adError0.getMessage() + ". ErrorDomain: " + adError0.getDomain()));
        try {
            zze zze0 = adError0.zza();
            this.zza.zzh(zze0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter0, int v) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze(("Adapter called onAdFailedToLoad with error " + v + "."));
        try {
            this.zza.zzg(v);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter0, AdError adError0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze(("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError0.getCode() + ". ErrorMessage: " + adError0.getMessage() + ". ErrorDomain: " + adError0.getDomain()));
        try {
            zze zze0 = adError0.zza();
            this.zza.zzh(zze0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter0, int v) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze(("Adapter called onAdFailedToLoad with error " + v + "."));
        try {
            this.zza.zzg(v);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter0, AdError adError0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze(("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError0.getCode() + ". ErrorMessage: " + adError0.getMessage() + ". ErrorDomain: " + adError0.getDomain()));
        try {
            zze zze0 = adError0.zza();
            this.zza.zzh(zze0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper0 = this.zzb;
        if(this.zzc == null) {
            if(unifiedNativeAdMapper0 == null) {
                zzcaa.zzl("#007 Could not call remote method.", null);
                return;
            }
            if(!unifiedNativeAdMapper0.getOverrideImpressionRecording()) {
                zzcaa.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzcaa.zze("Adapter called onAdImpression.");
        try {
            this.zza.zzm();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter0, UnifiedNativeAdMapper unifiedNativeAdMapper0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdLoaded.");
        this.zzb = unifiedNativeAdMapper0;
        if(!(mediationNativeAdapter0 instanceof AdMobAdapter)) {
            VideoController videoController0 = new VideoController();
            videoController0.zzb(new zzbov());
            if(unifiedNativeAdMapper0 != null && unifiedNativeAdMapper0.hasVideoContent()) {
                unifiedNativeAdMapper0.zze(videoController0);
            }
        }
        try {
            this.zza.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onVideoEnd.");
        try {
            this.zza.zzv();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final NativeCustomTemplateAd zza() {
        return this.zzc;
    }

    public final UnifiedNativeAdMapper zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zzc(MediationNativeAdapter mediationNativeAdapter0, NativeCustomTemplateAd nativeCustomTemplateAd0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze(("Adapter called onAdLoaded with template id " + nativeCustomTemplateAd0.getCustomTemplateId()));
        this.zzc = nativeCustomTemplateAd0;
        try {
            this.zza.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zzd(MediationBannerAdapter mediationBannerAdapter0, String s, String s1) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcaa.zze("Adapter called onAppEvent.");
        try {
            this.zza.zzq(s, s1);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zze(MediationNativeAdapter mediationNativeAdapter0, NativeCustomTemplateAd nativeCustomTemplateAd0, String s) {
        if(nativeCustomTemplateAd0 instanceof zzbfr) {
            try {
                zzbfq zzbfq0 = ((zzbfr)nativeCustomTemplateAd0).zza();
                this.zza.zzr(zzbfq0, s);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
            return;
        }
        zzcaa.zzj("Unexpected native custom template ad type.");
    }
}

