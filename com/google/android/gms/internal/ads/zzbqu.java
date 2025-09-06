package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

public final class zzbqu implements MediationInterstitialAdapter {
    private Activity zza;
    private MediationInterstitialListener zzb;
    private Uri zzc;

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzcaa.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzcaa.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzcaa.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context0, MediationInterstitialListener mediationInterstitialListener0, Bundle bundle0, MediationAdRequest mediationAdRequest0, Bundle bundle1) {
        this.zzb = mediationInterstitialListener0;
        if(mediationInterstitialListener0 == null) {
            zzcaa.zzj("Listener not set for mediation. Returning.");
            return;
        }
        if(context0 instanceof Activity) {
            if(!zzbcs.zzg(context0)) {
                zzcaa.zzj("Default browser does not support custom tabs. Bailing out.");
                this.zzb.onAdFailedToLoad(this, 0);
                return;
            }
            String s = bundle0.getString("tab_url");
            if(TextUtils.isEmpty(s)) {
                zzcaa.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzb.onAdFailedToLoad(this, 0);
                return;
            }
            this.zza = (Activity)context0;
            this.zzc = Uri.parse(s);
            this.zzb.onAdLoaded(this);
            return;
        }
        zzcaa.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
        this.zzb.onAdFailedToLoad(this, 0);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        d d0 = new androidx.browser.customtabs.d.d().a();
        d0.a.setData(this.zzc);
        zzbqt zzbqt0 = new zzbqt(this, new AdOverlayInfoParcel(new zzc(d0.a, null), null, new zzbqs(this), null, new zzcag(0, 0, false, false, false), null, null));
        zzs.zza.post(zzbqt0);
        zzt.zzo().zzp();
    }

    static Activity zza(zzbqu zzbqu0) {
        return zzbqu0.zza;
    }

    static MediationInterstitialListener zzb(zzbqu zzbqu0) {
        return zzbqu0.zzb;
    }
}

