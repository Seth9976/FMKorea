package com.google.android.gms.internal.ads;

import Z1.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdi;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import jeb.synthetic.FIN;

public final class zzduy extends zzdi {
    final Map zza;
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdum zzd;
    private final zzfyo zze;
    private final zzduz zzf;
    private zzdue zzg;

    zzduy(Context context0, WeakReference weakReference0, zzdum zzdum0, zzduz zzduz0, zzfyo zzfyo0) {
        this.zza = new HashMap();
        this.zzb = context0;
        this.zzc = weakReference0;
        this.zzd = zzdum0;
        this.zze = zzfyo0;
        this.zzf = zzduz0;
    }

    static zzdum zzb(zzduy zzduy0) {
        return zzduy0.zzd;
    }

    static String zzc(Object object0) {
        return zzduy.zzl(object0);
    }

    static void zzd(zzduy zzduy0, String s, String s1) {
        zzduy0.zzm(s, s1);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String s, IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        ViewGroup viewGroup0 = (ViewGroup)ObjectWrapper.unwrap(iObjectWrapper1);
        if(context0 != null && viewGroup0 != null) {
            Object object0 = this.zza.get(s);
            if(object0 != null) {
                this.zza.remove(s);
            }
            if(object0 instanceof AdView) {
                zzduz.zza(context0, viewGroup0, ((AdView)object0));
                return;
            }
            if(object0 instanceof NativeAd) {
                zzduz.zzb(context0, viewGroup0, ((NativeAd)object0));
            }
        }
    }

    public final void zzf(zzdue zzdue0) {
        this.zzg = zzdue0;
    }

    // 检测为 Lambda 实现
    protected final void zzg(String s, Object object0, String s1) [...]

    public final void zzh(String s, String s1, String s2) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(s1) {
            case "APP_OPEN_AD": {
                AppOpenAd.load(this.zzj(), s, zzduy.zzk(), 1, new zzduq(this, s, s2));
                FIN.finallyExec$NT(v);
                return;
            }
            case "BANNER": {
                AdView adView0 = new AdView(this.zzj());
                adView0.setAdSize(AdSize.BANNER);
                adView0.setAdUnitId(s);
                adView0.setAdListener(new zzdur(this, s, adView0, s2));
                adView0.loadAd(zzduy.zzk());
                FIN.finallyExec$NT(v);
                return;
            }
            case "INTERSTITIAL": {
                InterstitialAd.load(this.zzj(), s, zzduy.zzk(), new zzdus(this, s, s2));
                FIN.finallyExec$NT(v);
                return;
            }
            case "NATIVE": {
                Builder adLoader$Builder0 = new Builder(this.zzj(), s);
                adLoader$Builder0.forNativeAd((Object object0) -> synchronized(this) {
                    this.zza.put(s, object0);
                    this.zzm(zzduy.zzl(object0), s2);
                });
                adLoader$Builder0.withAdListener(new zzduv(this, s2));
                adLoader$Builder0.build().loadAd(zzduy.zzk());
                FIN.finallyExec$NT(v);
                return;
            }
            case "REWARDED": {
                RewardedAd.load(this.zzj(), s, zzduy.zzk(), new zzdut(this, s, s2));
                FIN.finallyExec$NT(v);
                return;
            }
            case "REWARDED_INTERSTITIAL": {
                RewardedInterstitialAd.load(this.zzj(), s, zzduy.zzk(), new zzduu(this, s, s2));
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
            }
        }
    }

    public final void zzi(String s, String s1) {
        synchronized(this) {
            Activity activity0 = this.zzd.zzg();
            if(activity0 == null) {
                return;
            }
            Object object0 = this.zza.get(s);
            if(object0 == null) {
                return;
            }
            zzbbj zzbbj0 = zzbbr.zziY;
            if(!((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue() || object0 instanceof AppOpenAd || object0 instanceof InterstitialAd || object0 instanceof RewardedAd || object0 instanceof RewardedInterstitialAd) {
                this.zza.remove(s);
            }
            this.zzn(zzduy.zzl(object0), s1);
            if(object0 instanceof AppOpenAd) {
                ((AppOpenAd)object0).show(activity0);
                return;
            }
            if(object0 instanceof InterstitialAd) {
                ((InterstitialAd)object0).show(activity0);
                return;
            }
            if(object0 instanceof RewardedAd) {
                ((RewardedAd)object0).show(activity0, zzdun.zza);
                return;
            }
            if(object0 instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd)object0).show(activity0, zzduo.zza);
                return;
            }
            if(((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue() && (object0 instanceof AdView || object0 instanceof NativeAd)) {
                Intent intent0 = new Intent();
                Context context0 = this.zzj();
                intent0.setClassName(context0, "com.google.android.gms.ads.OutOfContextTestingActivity");
                intent0.putExtra("adUnit", s);
                zzs.zzQ(context0, intent0);
            }
        }
    }

    private final Context zzj() {
        Context context0 = (Context)this.zzc.get();
        return context0 == null ? this.zzb : context0;
    }

    private static AdRequest zzk() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("request_origin", "inspector_ooct");
        com.google.android.gms.ads.AdRequest.Builder adRequest$Builder0 = new com.google.android.gms.ads.AdRequest.Builder();
        adRequest$Builder0.addNetworkExtrasBundle(AdMobAdapter.class, bundle0);
        return adRequest$Builder0.build();
    }

    private static String zzl(Object object0) {
        ResponseInfo responseInfo0;
        if(object0 instanceof LoadAdError) {
            responseInfo0 = ((LoadAdError)object0).getResponseInfo();
        }
        else {
            if(object0 instanceof AppOpenAd) {
                responseInfo0 = ((AppOpenAd)object0).getResponseInfo();
                goto label_20;
            }
            if(object0 instanceof InterstitialAd) {
                responseInfo0 = ((InterstitialAd)object0).getResponseInfo();
                goto label_20;
            }
            if(object0 instanceof RewardedAd) {
                responseInfo0 = ((RewardedAd)object0).getResponseInfo();
                goto label_20;
            }
            if(object0 instanceof RewardedInterstitialAd) {
                responseInfo0 = ((RewardedInterstitialAd)object0).getResponseInfo();
                goto label_20;
            }
            if(object0 instanceof AdView) {
                responseInfo0 = ((AdView)object0).getResponseInfo();
            }
            else if(object0 instanceof NativeAd) {
                responseInfo0 = ((NativeAd)object0).getResponseInfo();
            }
            else {
                return "";
            }
        }
    label_20:
        if(responseInfo0 == null) {
            return "";
        }
        zzdn zzdn0 = responseInfo0.zzc();
        if(zzdn0 == null) {
            return "";
        }
        try {
            return zzdn0.zzh();
        }
        catch(RemoteException unused_ex) {
        }
    }

    private final void zzm(String s, String s1) {
        d d0;
        synchronized(this) {
            try {
                d0 = this.zzg.zzb(s);
            }
            catch(NullPointerException nullPointerException0) {
                zzt.zzo().zzu(nullPointerException0, "OutOfContextTester.setAdAsOutOfContext");
                this.zzd.zzk(s1);
                return;
            }
        }
        zzfye.zzr(d0, new zzduw(this, s1), this.zze);
    }

    private final void zzn(String s, String s1) {
        d d0;
        synchronized(this) {
            try {
                d0 = this.zzg.zzb(s);
            }
            catch(NullPointerException nullPointerException0) {
                zzt.zzo().zzu(nullPointerException0, "OutOfContextTester.setAdAsShown");
                this.zzd.zzk(s1);
                return;
            }
        }
        zzfye.zzr(d0, new zzdux(this, s1), this.zze);
    }
}

