package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

final class zzboy implements MediationAdLoadCallback {
    final zzbol zza;
    final Adapter zzb;
    final zzbpf zzc;

    zzboy(zzbpf zzbpf0, zzbol zzbol0, Adapter adapter0) {
        this.zzc = zzbpf0;
        this.zza = zzbol0;
        this.zzb = adapter0;
        super();
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError0) {
        try {
            zzcaa.zze((this.zzb.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError0.getCode() + ". ErrorMessage = " + adError0.getMessage() + ". ErrorDomain = " + adError0.getDomain()));
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
        MediationInterscrollerAd mediationInterscrollerAd0 = (MediationInterscrollerAd)object0;
        try {
            zzbpf.zzd(this.zzc, mediationInterscrollerAd0);
            this.zza.zzo();
            return new zzbow(this.zza);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            return new zzbow(this.zza);
        }
    }
}

