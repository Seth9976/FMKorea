package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;

final class zzbpa implements MediationAdLoadCallback {
    final zzbol zza;
    final zzbpf zzb;

    zzbpa(zzbpf zzbpf0, zzbol zzbol0) {
        this.zzb = zzbpf0;
        this.zza = zzbol0;
        super();
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError0) {
        try {
            zzcaa.zze((zzbpf.zzb(this.zzb).getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + adError0.getCode() + ". ErrorMessage = " + adError0.getMessage() + ". ErrorDomain = " + adError0.getDomain()));
            zze zze0 = adError0.zza();
            this.zza.zzh(zze0);
            int v = adError0.getCode();
            this.zza.zzi(v, adError0.getMessage());
            int v1 = adError0.getCode();
            this.zza.zzg(v1);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String s) {
        this.onFailure(new AdError(0, s, "undefined"));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object object0) {
        MediationBannerAd mediationBannerAd0 = (MediationBannerAd)object0;
        try {
            View view0 = mediationBannerAd0.getView();
            zzbpf.zzT(this.zzb, view0);
            this.zza.zzo();
            return new zzbow(this.zza);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return new zzbow(this.zza);
        }
    }
}

