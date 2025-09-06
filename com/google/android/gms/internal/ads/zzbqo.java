package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbqo extends zzbqb {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private MediationAppOpenAd zzd;
    private String zze;

    public zzbqo(RtbAdapter rtbAdapter0) {
        this.zze = "";
        this.zza = rtbAdapter0;
    }

    static void zzc(zzbqo zzbqo0, MediationAppOpenAd mediationAppOpenAd0) {
        zzbqo0.zzd = mediationAppOpenAd0;
    }

    static void zzd(zzbqo zzbqo0, MediationInterstitialAd mediationInterstitialAd0) {
        zzbqo0.zzb = mediationInterstitialAd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final zzdq zze() {
        RtbAdapter rtbAdapter0 = this.zza;
        if(rtbAdapter0 instanceof zza) {
            try {
                return ((zza)rtbAdapter0).getVideoController();
            }
            catch(Throwable throwable0) {
                zzcaa.zzh("", throwable0);
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final zzbqq zzf() {
        return zzbqq.zza(this.zza.getVersionInfo());
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final zzbqq zzg() {
        return zzbqq.zza(this.zza.getSDKVersionInfo());
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzh(IObjectWrapper iObjectWrapper0, String s, Bundle bundle0, Bundle bundle1, zzq zzq0, zzbqf zzbqf0) {
        AdFormat adFormat0;
        try {
            zzbqm zzbqm0 = new zzbqm(this, zzbqf0);
            RtbAdapter rtbAdapter0 = this.zza;
            switch(s) {
                case "app_open": {
                    adFormat0 = AdFormat.APP_OPEN_AD;
                    break;
                }
                case "app_open_ad": {
                    if(!((Boolean)zzba.zzc().zzb(zzbbr.zzkA)).booleanValue()) {
                        throw new IllegalArgumentException("Internal Error");
                    }
                    adFormat0 = AdFormat.APP_OPEN_AD;
                    break;
                }
                case "banner": {
                    adFormat0 = AdFormat.BANNER;
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
                    throw new IllegalArgumentException("Internal Error");
                }
            }
            MediationConfiguration mediationConfiguration0 = new MediationConfiguration(adFormat0, bundle1);
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(mediationConfiguration0);
            rtbAdapter0.collectSignals(new RtbSignalData(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), arrayList0, bundle0, zzb.zzc(zzq0.zze, zzq0.zzb, zzq0.zza)), zzbqm0);
            return;
        }
        catch(Throwable throwable0) {
        }
        zzcaa.zzh("Error generating signals for RTB", throwable0);
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzi(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpn zzbpn0, zzbol zzbol0) {
        try {
            zzbql zzbql0 = new zzbql(this, zzbpn0, zzbol0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbqo.zzw(s1);
            Bundle bundle1 = this.zzv(zzl0);
            boolean z = zzbqo.zzx(zzl0);
            String s2 = zzbqo.zzy(s1, zzl0);
            MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration0 = new MediationAppOpenAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, this.zze);
            this.zza.loadRtbAppOpenAd(mediationAppOpenAdConfiguration0, zzbql0);
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("Adapter failed to render app open ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzj(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpq zzbpq0, zzbol zzbol0, zzq zzq0) {
        try {
            zzbqh zzbqh0 = new zzbqh(this, zzbpq0, zzbol0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbqo.zzw(s1);
            Bundle bundle1 = this.zzv(zzl0);
            boolean z = zzbqo.zzx(zzl0);
            String s2 = zzbqo.zzy(s1, zzl0);
            AdSize adSize0 = zzb.zzc(zzq0.zze, zzq0.zzb, zzq0.zza);
            MediationBannerAdConfiguration mediationBannerAdConfiguration0 = new MediationBannerAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, adSize0, this.zze);
            this.zza.loadRtbBannerAd(mediationBannerAdConfiguration0, zzbqh0);
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("Adapter failed to render banner ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzk(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpq zzbpq0, zzbol zzbol0, zzq zzq0) {
        try {
            zzbqi zzbqi0 = new zzbqi(this, zzbpq0, zzbol0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbqo.zzw(s1);
            Bundle bundle1 = this.zzv(zzl0);
            boolean z = zzbqo.zzx(zzl0);
            String s2 = zzbqo.zzy(s1, zzl0);
            AdSize adSize0 = zzb.zzc(zzq0.zze, zzq0.zzb, zzq0.zza);
            MediationBannerAdConfiguration mediationBannerAdConfiguration0 = new MediationBannerAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, adSize0, this.zze);
            this.zza.loadRtbInterscrollerAd(mediationBannerAdConfiguration0, zzbqi0);
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("Adapter failed to render interscroller ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzl(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpt zzbpt0, zzbol zzbol0) {
        try {
            zzbqj zzbqj0 = new zzbqj(this, zzbpt0, zzbol0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbqo.zzw(s1);
            Bundle bundle1 = this.zzv(zzl0);
            boolean z = zzbqo.zzx(zzl0);
            String s2 = zzbqo.zzy(s1, zzl0);
            MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration0 = new MediationInterstitialAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, this.zze);
            this.zza.loadRtbInterstitialAd(mediationInterstitialAdConfiguration0, zzbqj0);
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("Adapter failed to render interstitial ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzm(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpw zzbpw0, zzbol zzbol0) {
        this.zzn(s, s1, zzl0, iObjectWrapper0, zzbpw0, zzbol0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzn(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpw zzbpw0, zzbol zzbol0, zzbek zzbek0) {
        try {
            zzbqk zzbqk0 = new zzbqk(this, zzbpw0, zzbol0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbqo.zzw(s1);
            Bundle bundle1 = this.zzv(zzl0);
            boolean z = zzbqo.zzx(zzl0);
            String s2 = zzbqo.zzy(s1, zzl0);
            MediationNativeAdConfiguration mediationNativeAdConfiguration0 = new MediationNativeAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, this.zze, zzbek0);
            this.zza.loadRtbNativeAd(mediationNativeAdConfiguration0, zzbqk0);
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("Adapter failed to render native ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzo(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpz zzbpz0, zzbol zzbol0) {
        try {
            zzbqn zzbqn0 = new zzbqn(this, zzbpz0, zzbol0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbqo.zzw(s1);
            Bundle bundle1 = this.zzv(zzl0);
            boolean z = zzbqo.zzx(zzl0);
            String s2 = zzbqo.zzy(s1, zzl0);
            MediationRewardedAdConfiguration mediationRewardedAdConfiguration0 = new MediationRewardedAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, this.zze);
            this.zza.loadRtbRewardedInterstitialAd(mediationRewardedAdConfiguration0, zzbqn0);
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("Adapter failed to render rewarded interstitial ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzp(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpz zzbpz0, zzbol zzbol0) {
        try {
            zzbqn zzbqn0 = new zzbqn(this, zzbpz0, zzbol0);
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            Bundle bundle0 = zzbqo.zzw(s1);
            Bundle bundle1 = this.zzv(zzl0);
            boolean z = zzbqo.zzx(zzl0);
            String s2 = zzbqo.zzy(s1, zzl0);
            MediationRewardedAdConfiguration mediationRewardedAdConfiguration0 = new MediationRewardedAdConfiguration(((Context)object0), s, bundle0, bundle1, z, zzl0.zzk, zzl0.zzg, zzl0.zzt, s2, this.zze);
            this.zza.loadRtbRewardedAd(mediationRewardedAdConfiguration0, zzbqn0);
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("Adapter failed to render rewarded ad.", throwable0);
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzq(String s) {
        this.zze = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzr(IObjectWrapper iObjectWrapper0) {
        MediationAppOpenAd mediationAppOpenAd0 = this.zzd;
        if(mediationAppOpenAd0 != null) {
            try {
                mediationAppOpenAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            }
            catch(Throwable throwable0) {
                zzcaa.zzh("", throwable0);
            }
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzs(IObjectWrapper iObjectWrapper0) {
        MediationInterstitialAd mediationInterstitialAd0 = this.zzb;
        if(mediationInterstitialAd0 != null) {
            try {
                mediationInterstitialAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            }
            catch(Throwable throwable0) {
                zzcaa.zzh("", throwable0);
            }
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzt(IObjectWrapper iObjectWrapper0) {
        MediationRewardedAd mediationRewardedAd0 = this.zzc;
        if(mediationRewardedAd0 != null) {
            try {
                mediationRewardedAd0.showAd(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            }
            catch(Throwable throwable0) {
                zzcaa.zzh("", throwable0);
            }
            return true;
        }
        return false;
    }

    static void zzu(zzbqo zzbqo0, MediationRewardedAd mediationRewardedAd0) {
        zzbqo0.zzc = mediationRewardedAd0;
    }

    private final Bundle zzv(zzl zzl0) {
        Bundle bundle0 = zzl0.zzm;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle(this.zza.getClass().getName());
            return bundle1 == null ? new Bundle() : bundle1;
        }
        return new Bundle();
    }

    private static final Bundle zzw(String s) {
        zzcaa.zzj(("Server parameters: " + s));
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
                return bundle1;
            }
            return bundle0;
        }
        catch(JSONException jSONException0) {
            zzcaa.zzh("", jSONException0);
            throw new RemoteException();
        }
    }

    // 去混淆评级： 低(40)
    private static final boolean zzx(zzl zzl0) {
        return zzl0.zzf;
    }

    private static final String zzy(String s, zzl zzl0) {
        String s1;
        try {
            s1 = zzl0.zzu;
            return new JSONObject(s).getString("max_ad_content_rating");
        }
        catch(JSONException unused_ex) {
            return s1;
        }
    }
}

