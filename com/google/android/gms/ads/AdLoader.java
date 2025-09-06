package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbzp;
import com.google.android.gms.internal.ads.zzcaa;

public class AdLoader {
    public static class Builder {
        private final Context zza;
        private final zzbq zzb;

        public Builder(Context context0, String s) {
            Context context1 = (Context)Preconditions.checkNotNull(context0, "context cannot be null");
            zzbq zzbq0 = zzay.zza().zzc(context0, s, new zzboc());
            super();
            this.zza = context1;
            this.zzb = zzbq0;
        }

        public AdLoader build() {
            try {
                zzbn zzbn0 = this.zzb.zze();
                return new AdLoader(this.zza, zzbn0, zzp.zza);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Failed to build AdLoader.", remoteException0);
                zzbn zzbn1 = new zzeu().zzc();
                return new AdLoader(this.zza, zzbn1, zzp.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener0, AdSize[] arr_adSize) {
            if(arr_adSize == null || arr_adSize.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                zzq zzq0 = new zzq(this.zza, arr_adSize);
                zzbhd zzbhd0 = new zzbhd(onAdManagerAdViewLoadedListener0);
                this.zzb.zzj(zzbhd0, zzq0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Failed to add Google Ad Manager banner ad listener", remoteException0);
            }
            return this;
        }

        public Builder forCustomFormatAd(String s, OnCustomFormatAdLoadedListener nativeCustomFormatAd$OnCustomFormatAdLoadedListener0, OnCustomClickListener nativeCustomFormatAd$OnCustomClickListener0) {
            zzbrp zzbrp0 = new zzbrp(nativeCustomFormatAd$OnCustomFormatAdLoadedListener0, nativeCustomFormatAd$OnCustomClickListener0);
            try {
                zzbgd zzbgd0 = zzbrp0.zzb();
                zzbga zzbga0 = zzbrp0.zza();
                this.zzb.zzh(s, zzbgd0, zzbga0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Failed to add custom format ad listener", remoteException0);
            }
            return this;
        }

        @Deprecated
        public Builder forCustomTemplateAd(String s, OnCustomTemplateAdLoadedListener nativeCustomTemplateAd$OnCustomTemplateAdLoadedListener0, com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener nativeCustomTemplateAd$OnCustomClickListener0) {
            zzbhb zzbhb0 = new zzbhb(nativeCustomTemplateAd$OnCustomTemplateAdLoadedListener0, nativeCustomTemplateAd$OnCustomClickListener0);
            try {
                zzbgd zzbgd0 = zzbhb0.zze();
                zzbga zzbga0 = zzbhb0.zzd();
                this.zzb.zzh(s, zzbgd0, zzbga0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Failed to add custom template ad listener", remoteException0);
            }
            return this;
        }

        public Builder forNativeAd(OnNativeAdLoadedListener nativeAd$OnNativeAdLoadedListener0) {
            try {
                zzbrr zzbrr0 = new zzbrr(nativeAd$OnNativeAdLoadedListener0);
                this.zzb.zzk(zzbrr0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Failed to add google native ad listener", remoteException0);
            }
            return this;
        }

        @Deprecated
        public Builder forUnifiedNativeAd(OnUnifiedNativeAdLoadedListener unifiedNativeAd$OnUnifiedNativeAdLoadedListener0) {
            try {
                zzbhe zzbhe0 = new zzbhe(unifiedNativeAd$OnUnifiedNativeAdLoadedListener0);
                this.zzb.zzk(zzbhe0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Failed to add google native ad listener", remoteException0);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener0) {
            try {
                zzg zzg0 = new zzg(adListener0);
                this.zzb.zzl(zzg0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Failed to set AdListener.", remoteException0);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions0) {
            try {
                this.zzb.zzm(adManagerAdViewOptions0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Failed to specify Ad Manager banner ad options", remoteException0);
            }
            return this;
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions0) {
            try {
                zzbek zzbek0 = new zzbek(nativeAdOptions0);
                this.zzb.zzo(zzbek0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Failed to specify native ad options", remoteException0);
            }
            return this;
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions0) {
            try {
                zzfl zzfl0 = nativeAdOptions0.getVideoOptions() == null ? null : new zzfl(nativeAdOptions0.getVideoOptions());
                this.zzb.zzo(new zzbek(4, nativeAdOptions0.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions0.shouldRequestMultipleImages(), nativeAdOptions0.getAdChoicesPlacement(), zzfl0, nativeAdOptions0.zzc(), nativeAdOptions0.getMediaAspectRatio(), nativeAdOptions0.zza(), nativeAdOptions0.zzb()));
                return this;
            }
            catch(RemoteException remoteException0) {
            }
            zzcaa.zzk("Failed to specify native ad options", remoteException0);
            return this;
        }
    }

    private final zzp zza;
    private final Context zzb;
    private final zzbn zzc;

    AdLoader(Context context0, zzbn zzbn0, zzp zzp0) {
        this.zzb = context0;
        this.zzc = zzbn0;
        this.zza = zzp0;
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk("Failed to check if ad is loading.", remoteException0);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest0) {
        this.zzb(adRequest0.zza);
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest0) {
        this.zzb(adManagerAdRequest0.zza);
    }

    public void loadAds(AdRequest adRequest0, int v) {
        try {
            zzl zzl0 = this.zza.zza(this.zzb, adRequest0.zza);
            this.zzc.zzh(zzl0, v);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Failed to load ads.", remoteException0);
        }
    }

    final void zza(zzdx zzdx0) {
        try {
            zzl zzl0 = this.zza.zza(this.zzb, zzdx0);
            this.zzc.zzg(zzl0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Failed to load ad.", remoteException0);
        }
    }

    private final void zzb(zzdx zzdx0) {
        zzbbr.zza(this.zzb);
        if(((Boolean)zzbdi.zzc.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue()) {
            zza zza0 = new zza(this, zzdx0);
            zzbzp.zzb.execute(zza0);
            return;
        }
        try {
            zzl zzl0 = this.zza.zza(this.zzb, zzdx0);
            this.zzc.zzg(zzl0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Failed to load ad.", remoteException0);
        }
    }
}

