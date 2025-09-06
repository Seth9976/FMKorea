package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbpf extends zzboh {
    private final Object zza;
    private zzbph zzb;
    private zzbvo zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private MediationRewardedAd zzh;
    private MediationInterscrollerAd zzi;
    private MediationAppOpenAd zzj;
    private final String zzk;

    public zzbpf(Adapter adapter0) {
        this.zzk = "";
        this.zza = adapter0;
    }

    public zzbpf(MediationAdapter mediationAdapter0) {
        this.zzk = "";
        this.zza = mediationAdapter0;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzA(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbol zzbol0) {
        if(this.zza instanceof Adapter) {
            zzcaa.zze("Requesting rewarded ad from adapter.");
            try {
                zzbpd zzbpd0 = new zzbpd(this, zzbol0);
                Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle0 = this.zzV(s, zzl0, null);
                Bundle bundle1 = this.zzU(zzl0);
                boolean z = zzbpf.zzW(zzl0);
                String s1 = zzbpf.zzX(s, zzl0);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration0 = new MediationRewardedAdConfiguration(((Context)object0), "", bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s1, "");
                ((Adapter)this.zza).loadRewardedAd(mediationRewardedAdConfiguration0, zzbpd0);
                return;
            }
            catch(Exception exception0) {
                zzcaa.zzh("", exception0);
                throw new RemoteException();
            }
        }
        String s2 = this.zza.getClass().getCanonicalName();
        zzcaa.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzB(zzl zzl0, String s, String s1) {
        Object object0 = this.zza;
        if(object0 instanceof Adapter) {
            this.zzA(this.zzd, zzl0, s, new zzbpi(((Adapter)object0), this.zzc));
            return;
        }
        String s2 = this.zza.getClass().getCanonicalName();
        zzcaa.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzC(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbol zzbol0) {
        if(this.zza instanceof Adapter) {
            zzcaa.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                zzbpd zzbpd0 = new zzbpd(this, zzbol0);
                Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle0 = this.zzV(s, zzl0, null);
                Bundle bundle1 = this.zzU(zzl0);
                boolean z = zzbpf.zzW(zzl0);
                String s1 = zzbpf.zzX(s, zzl0);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration0 = new MediationRewardedAdConfiguration(((Context)object0), "", bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s1, "");
                ((Adapter)this.zza).loadRewardedInterstitialAd(mediationRewardedAdConfiguration0, zzbpd0);
                return;
            }
            catch(Exception exception0) {
                zzcaa.zzh("", exception0);
                throw new RemoteException();
            }
        }
        String s2 = this.zza.getClass().getCanonicalName();
        zzcaa.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzD(IObjectWrapper iObjectWrapper0) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        Object object0 = this.zza;
        if(object0 instanceof OnContextChangedListener) {
            ((OnContextChangedListener)object0).onContextChanged(context0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzE() {
        Object object0 = this.zza;
        if(!(object0 instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter)object0).onPause();
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzF() {
        Object object0 = this.zza;
        if(!(object0 instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter)object0).onResume();
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzG(boolean z) {
        Object object0 = this.zza;
        if(object0 instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener)object0).onImmersiveModeUpdated(z);
            }
            catch(Throwable throwable0) {
                zzcaa.zzh("", throwable0);
            }
            return;
        }
        String s = this.zza.getClass().getCanonicalName();
        zzcaa.zze((OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + s));
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzH(IObjectWrapper iObjectWrapper0) {
        if(this.zza instanceof Adapter) {
            zzcaa.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd0 = this.zzj;
            if(mediationAppOpenAd0 != null) {
                mediationAppOpenAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
                return;
            }
            zzcaa.zzg("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String s = this.zza.getClass().getCanonicalName();
        zzcaa.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzI() {
        if(this.zza instanceof MediationInterstitialAdapter) {
            zzcaa.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter)this.zza).showInterstitial();
                return;
            }
            catch(Throwable throwable0) {
                zzcaa.zzh("", throwable0);
                throw new RemoteException();
            }
        }
        String s = this.zza.getClass().getCanonicalName();
        zzcaa.zzj((MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzJ(IObjectWrapper iObjectWrapper0) {
        Object object0 = this.zza;
        if(!(object0 instanceof Adapter) && !(object0 instanceof MediationInterstitialAdapter)) {
            String s = this.zza.getClass().getCanonicalName();
            zzcaa.zzj((MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
            throw new RemoteException();
        }
        if(object0 instanceof MediationInterstitialAdapter) {
            this.zzI();
            return;
        }
        zzcaa.zze("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd0 = this.zzf;
        if(mediationInterstitialAd0 != null) {
            mediationInterstitialAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            return;
        }
        zzcaa.zzg("Can not show null mediation interstitial ad.");
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzK(IObjectWrapper iObjectWrapper0) {
        if(this.zza instanceof Adapter) {
            zzcaa.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd0 = this.zzh;
            if(mediationRewardedAd0 != null) {
                mediationRewardedAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
                return;
            }
            zzcaa.zzg("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String s = this.zza.getClass().getCanonicalName();
        zzcaa.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzL() {
        if(this.zza instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd0 = this.zzh;
            if(mediationRewardedAd0 != null) {
                mediationRewardedAd0.showAd(((Context)ObjectWrapper.unwrap(this.zzd)));
                return;
            }
            zzcaa.zzg("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String s = this.zza.getClass().getCanonicalName();
        zzcaa.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final boolean zzM() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final boolean zzN() {
        if(this.zza instanceof Adapter) {
            return this.zzc != null;
        }
        String s = this.zza.getClass().getCanonicalName();
        zzcaa.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzboq zzO() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzbor zzP() {
        return null;
    }

    static void zzQ(zzbpf zzbpf0, MediationInterstitialAd mediationInterstitialAd0) {
        zzbpf0.zzf = mediationInterstitialAd0;
    }

    static void zzR(zzbpf zzbpf0, MediationRewardedAd mediationRewardedAd0) {
        zzbpf0.zzh = mediationRewardedAd0;
    }

    static void zzS(zzbpf zzbpf0, UnifiedNativeAdMapper unifiedNativeAdMapper0) {
        zzbpf0.zzg = unifiedNativeAdMapper0;
    }

    static void zzT(zzbpf zzbpf0, View view0) {
        zzbpf0.zze = view0;
    }

    private final Bundle zzU(zzl zzl0) {
        Bundle bundle0 = zzl0.zzm;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle(this.zza.getClass().getName());
            return bundle1 == null ? new Bundle() : bundle1;
        }
        return new Bundle();
    }

    private final Bundle zzV(String s, zzl zzl0, String s1) {
        zzcaa.zze(("Server parameters: " + s));
        try {
            Bundle bundle0 = new Bundle();
            if(s != null) {
                JSONObject jSONObject0 = new JSONObject(s);
                Bundle bundle1 = new Bundle();
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    bundle1.putString(((String)object0), jSONObject0.getString(((String)object0)));
                }
                bundle0 = bundle1;
            }
            if(this.zza instanceof AdMobAdapter) {
                bundle0.putString("adJson", s1);
                if(zzl0 != null) {
                    bundle0.putInt("tagForChildDirectedTreatment", zzl0.zzg);
                }
            }
            bundle0.remove("max_ad_content_rating");
            return bundle0;
        }
        catch(Throwable throwable0) {
        }
        zzcaa.zzh("", throwable0);
        throw new RemoteException();
    }

    // 去混淆评级： 低(40)
    private static final boolean zzW(zzl zzl0) {
        return zzl0.zzf;
    }

    private static final String zzX(String s, zzl zzl0) {
        String s1;
        try {
            s1 = zzl0.zzu;
            return new JSONObject(s).getString("max_ad_content_rating");
        }
        catch(JSONException unused_ex) {
            return s1;
        }
    }

    static void zzc(zzbpf zzbpf0, MediationAppOpenAd mediationAppOpenAd0) {
        zzbpf0.zzj = mediationAppOpenAd0;
    }

    static void zzd(zzbpf zzbpf0, MediationInterscrollerAd mediationInterscrollerAd0) {
        zzbpf0.zzi = mediationInterscrollerAd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final Bundle zze() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzdq zzh() {
        Object object0 = this.zza;
        if(object0 instanceof zza) {
            try {
                return ((zza)object0).getVideoController();
            }
            catch(Throwable throwable0) {
                zzcaa.zzh("", throwable0);
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzbfq zzi() {
        zzbph zzbph0 = this.zzb;
        if(zzbph0 != null) {
            NativeCustomTemplateAd nativeCustomTemplateAd0 = zzbph0.zza();
            return nativeCustomTemplateAd0 instanceof zzbfr ? ((zzbfr)nativeCustomTemplateAd0).zza() : null;
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzboo zzj() {
        MediationInterscrollerAd mediationInterscrollerAd0 = this.zzi;
        return mediationInterscrollerAd0 != null ? new zzbpg(mediationInterscrollerAd0) : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzbou zzk() {
        Object object0 = this.zza;
        if(object0 instanceof MediationNativeAdapter) {
            zzbph zzbph0 = this.zzb;
            if(zzbph0 != null) {
                UnifiedNativeAdMapper unifiedNativeAdMapper0 = zzbph0.zzb();
                if(unifiedNativeAdMapper0 != null) {
                    return new zzbpk(unifiedNativeAdMapper0);
                }
            }
        }
        else if(object0 instanceof Adapter) {
            UnifiedNativeAdMapper unifiedNativeAdMapper1 = this.zzg;
            if(unifiedNativeAdMapper1 != null) {
                return new zzbpk(unifiedNativeAdMapper1);
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzbqq zzl() {
        return this.zza instanceof Adapter ? zzbqq.zza(((Adapter)this.zza).getVersionInfo()) : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzbqq zzm() {
        return this.zza instanceof Adapter ? zzbqq.zza(((Adapter)this.zza).getSDKVersionInfo()) : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final IObjectWrapper zzn() {
        Object object0 = this.zza;
        if(object0 instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter)object0).getBannerView());
            }
            catch(Throwable throwable0) {
                zzcaa.zzh("", throwable0);
                throw new RemoteException();
            }
        }
        if(object0 instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        }
        String s = this.zza.getClass().getCanonicalName();
        zzcaa.zzj((MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzo() {
        Object object0 = this.zza;
        if(!(object0 instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter)object0).onDestroy();
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzp(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbvo zzbvo0, String s1) {
        Object object0 = this.zza;
        if(object0 instanceof Adapter) {
            this.zzd = iObjectWrapper0;
            this.zzc = zzbvo0;
            zzbvo0.zzl(ObjectWrapper.wrap(object0));
            return;
        }
        String s2 = this.zza.getClass().getCanonicalName();
        zzcaa.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzq(IObjectWrapper iObjectWrapper0, zzbks zzbks0, List list0) {
        AdFormat adFormat0;
        if(!(this.zza instanceof Adapter)) {
            throw new RemoteException();
        }
        zzboz zzboz0 = new zzboz(this, zzbks0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            zzbky zzbky0 = (zzbky)object0;
            switch(zzbky0.zza) {
                case "app_open": {
                    adFormat0 = AdFormat.APP_OPEN_AD;
                    break;
                }
                case "app_open_ad": {
                    if(((Boolean)zzba.zzc().zzb(zzbbr.zzkA)).booleanValue()) {
                        adFormat0 = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    else {
                        adFormat0 = null;
                        continue;
                    }
                    adFormat0 = AdFormat.REWARDED_INTERSTITIAL;
                    break;
                }
                case "banner": {
                    break;
                }
                case "interstitial": {
                    adFormat0 = AdFormat.INTERSTITIAL;
                    break;
                }
                case "native": {
                    adFormat0 = AdFormat.NATIVE;
                    break;
                }
                case "rewarded": {
                    adFormat0 = AdFormat.REWARDED;
                    break;
                }
                case "rewarded_interstitial": {
                    adFormat0 = AdFormat.REWARDED_INTERSTITIAL;
                    break;
                }
                default: {
                    adFormat0 = null;
                    continue;
                }
            }
            arrayList0.add(new MediationConfiguration(adFormat0, zzbky0.zzb));
        }
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        ((Adapter)this.zza).initialize(context0, zzboz0, arrayList0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzr(IObjectWrapper iObjectWrapper0, zzbvo zzbvo0, List list0) {
        zzcaa.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzs(zzl zzl0, String s) {
        this.zzB(zzl0, s, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzt(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbol zzbol0) {
        if(this.zza instanceof Adapter) {
            zzcaa.zze("Requesting app open ad from adapter.");
            try {
                zzbpe zzbpe0 = new zzbpe(this, zzbol0);
                Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle0 = this.zzV(s, zzl0, null);
                Bundle bundle1 = this.zzU(zzl0);
                boolean z = zzbpf.zzW(zzl0);
                String s1 = zzbpf.zzX(s, zzl0);
                MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration0 = new MediationAppOpenAdConfiguration(((Context)object0), "", bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s1, "");
                ((Adapter)this.zza).loadAppOpenAd(mediationAppOpenAdConfiguration0, zzbpe0);
                return;
            }
            catch(Exception exception0) {
                zzcaa.zzh("", exception0);
                throw new RemoteException();
            }
        }
        String s2 = this.zza.getClass().getCanonicalName();
        zzcaa.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzu(IObjectWrapper iObjectWrapper0, zzq zzq0, zzl zzl0, String s, zzbol zzbol0) {
        this.zzv(iObjectWrapper0, zzq0, zzl0, s, null, zzbol0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzv(IObjectWrapper iObjectWrapper0, zzq zzq0, zzl zzl0, String s, String s1, zzbol zzbol0) {
        if(!(this.zza instanceof MediationBannerAdapter) && !(this.zza instanceof Adapter)) {
            String s2 = this.zza.getClass().getCanonicalName();
            zzcaa.zzj((MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
            throw new RemoteException();
        }
        zzcaa.zze("Requesting banner ad from adapter.");
        AdSize adSize0 = zzq0.zzn ? zzb.zzd(zzq0.zze, zzq0.zzb) : zzb.zzc(zzq0.zze, zzq0.zzb, zzq0.zza);
        Object object0 = this.zza;
        if(object0 instanceof MediationBannerAdapter) {
            try {
                HashSet hashSet0 = zzl0.zze == null ? null : new HashSet(zzl0.zze);
                Date date0 = zzl0.zzb == -1L ? null : new Date(zzl0.zzb);
                boolean z = zzbpf.zzW(zzl0);
                String s3 = zzbpf.zzX(s, zzl0);
                zzbox zzbox0 = new zzbox(date0, zzl0.zzd, hashSet0, zzl0.zzk, z, zzl0.zzg, zzl0.zzr, zzl0.zzt, s3);
                Bundle bundle0 = zzl0.zzm == null ? null : zzl0.zzm.getBundle(((MediationBannerAdapter)object0).getClass().getName());
                ((MediationBannerAdapter)object0).requestBannerAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), new zzbph(zzbol0), this.zzV(s, zzl0, s1), adSize0, zzbox0, bundle0);
                return;
            }
            catch(Throwable throwable0) {
            }
            zzcaa.zzh("", throwable0);
            throw new RemoteException();
        }
        if(object0 instanceof Adapter) {
            try {
                zzbpa zzbpa0 = new zzbpa(this, zzbol0);
                Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle1 = this.zzV(s, zzl0, s1);
                Bundle bundle2 = this.zzU(zzl0);
                boolean z1 = zzbpf.zzW(zzl0);
                String s4 = zzbpf.zzX(s, zzl0);
                ((Adapter)object0).loadBannerAd(new MediationBannerAdConfiguration(context0, "", bundle1, bundle2, z1, zzl0.zzk, zzl0.zzg, zzl0.zzt, s4, adSize0, this.zzk), zzbpa0);
            }
            catch(Throwable throwable1) {
                zzcaa.zzh("", throwable1);
                throw new RemoteException();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzw(IObjectWrapper iObjectWrapper0, zzq zzq0, zzl zzl0, String s, String s1, zzbol zzbol0) {
        if(this.zza instanceof Adapter) {
            zzcaa.zze("Requesting interscroller ad from adapter.");
            try {
                zzboy zzboy0 = new zzboy(this, zzbol0, ((Adapter)this.zza));
                Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle0 = this.zzV(s, zzl0, s1);
                Bundle bundle1 = this.zzU(zzl0);
                boolean z = zzbpf.zzW(zzl0);
                String s2 = zzbpf.zzX(s, zzl0);
                AdSize adSize0 = zzb.zze(zzq0.zze, zzq0.zzb);
                MediationBannerAdConfiguration mediationBannerAdConfiguration0 = new MediationBannerAdConfiguration(((Context)object0), "", bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, adSize0, "");
                ((Adapter)this.zza).loadInterscrollerAd(mediationBannerAdConfiguration0, zzboy0);
                return;
            }
            catch(Exception exception0) {
                zzcaa.zzh("", exception0);
                throw new RemoteException();
            }
        }
        String s3 = this.zza.getClass().getCanonicalName();
        zzcaa.zzj((Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s3));
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzx(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbol zzbol0) {
        this.zzy(iObjectWrapper0, zzl0, s, null, zzbol0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzy(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, String s1, zzbol zzbol0) {
        if(!(this.zza instanceof MediationInterstitialAdapter) && !(this.zza instanceof Adapter)) {
            String s2 = this.zza.getClass().getCanonicalName();
            zzcaa.zzj((MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
            throw new RemoteException();
        }
        zzcaa.zze("Requesting interstitial ad from adapter.");
        Object object0 = this.zza;
        if(object0 instanceof MediationInterstitialAdapter) {
            try {
                HashSet hashSet0 = zzl0.zze == null ? null : new HashSet(zzl0.zze);
                Date date0 = zzl0.zzb == -1L ? null : new Date(zzl0.zzb);
                boolean z = zzbpf.zzW(zzl0);
                String s3 = zzbpf.zzX(s, zzl0);
                zzbox zzbox0 = new zzbox(date0, zzl0.zzd, hashSet0, zzl0.zzk, z, zzl0.zzg, zzl0.zzr, zzl0.zzt, s3);
                Bundle bundle0 = zzl0.zzm == null ? null : zzl0.zzm.getBundle(((MediationInterstitialAdapter)object0).getClass().getName());
                ((MediationInterstitialAdapter)object0).requestInterstitialAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), new zzbph(zzbol0), this.zzV(s, zzl0, s1), zzbox0, bundle0);
                return;
            }
            catch(Throwable throwable0) {
            }
            zzcaa.zzh("", throwable0);
            throw new RemoteException();
        }
        if(object0 instanceof Adapter) {
            try {
                zzbpb zzbpb0 = new zzbpb(this, zzbol0);
                Object object1 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle1 = this.zzV(s, zzl0, s1);
                Bundle bundle2 = this.zzU(zzl0);
                boolean z1 = zzbpf.zzW(zzl0);
                String s4 = zzbpf.zzX(s, zzl0);
                ((Adapter)object0).loadInterstitialAd(new MediationInterstitialAdConfiguration(((Context)object1), "", bundle1, bundle2, z1, zzl0.zzk, zzl0.zzg, zzl0.zzt, s4, this.zzk), zzbpb0);
            }
            catch(Throwable throwable1) {
                zzcaa.zzh("", throwable1);
                throw new RemoteException();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzz(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, String s1, zzbol zzbol0, zzbek zzbek0, List list0) {
        if(!(this.zza instanceof MediationNativeAdapter) && !(this.zza instanceof Adapter)) {
            String s2 = this.zza.getClass().getCanonicalName();
            zzcaa.zzj((MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + s2));
            throw new RemoteException();
        }
        zzcaa.zze("Requesting native ad from adapter.");
        Object object0 = this.zza;
        if(object0 instanceof MediationNativeAdapter) {
            try {
                HashSet hashSet0 = zzl0.zze == null ? null : new HashSet(zzl0.zze);
                Date date0 = zzl0.zzb == -1L ? null : new Date(zzl0.zzb);
                boolean z = zzbpf.zzW(zzl0);
                String s3 = zzbpf.zzX(s, zzl0);
                zzbpj zzbpj0 = new zzbpj(date0, zzl0.zzd, hashSet0, zzl0.zzk, z, zzl0.zzg, zzbek0, list0, zzl0.zzr, zzl0.zzt, s3);
                Bundle bundle0 = zzl0.zzm == null ? null : zzl0.zzm.getBundle(((MediationNativeAdapter)object0).getClass().getName());
                this.zzb = new zzbph(zzbol0);
                ((MediationNativeAdapter)object0).requestNativeAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), this.zzb, this.zzV(s, zzl0, s1), zzbpj0, bundle0);
                return;
            }
            catch(Throwable throwable0) {
            }
            zzcaa.zzh("", throwable0);
            throw new RemoteException();
        }
        if(object0 instanceof Adapter) {
            try {
                zzbpc zzbpc0 = new zzbpc(this, zzbol0);
                Object object1 = ObjectWrapper.unwrap(iObjectWrapper0);
                Bundle bundle1 = this.zzV(s, zzl0, s1);
                Bundle bundle2 = this.zzU(zzl0);
                boolean z1 = zzbpf.zzW(zzl0);
                String s4 = zzbpf.zzX(s, zzl0);
                ((Adapter)object0).loadNativeAd(new MediationNativeAdConfiguration(((Context)object1), "", bundle1, bundle2, z1, zzl0.zzk, zzl0.zzg, zzl0.zzt, s4, this.zzk, zzbek0), zzbpc0);
            }
            catch(Throwable throwable1) {
                zzcaa.zzh("", throwable1);
                throw new RemoteException();
            }
        }
    }
}

